import React, {Component} from 'react';
import {properties} from "./properties";
import ClayForm, {ClayInput, ClaySelect} from '@clayui/form';
import ClayButton from '@clayui/button';

const attributeTypesEndpoint = properties.attributeTypesEndpoint;


class App extends Component {
    constructor(props) {
        super(props);
        this.state = {
            items: [],
            isLoaded: false
        }
    }

    componentDidMount() {
        fetch(attributeTypesEndpoint)
            .then(result => result.json())
            .then(data =>
                // console.log(data));
            {
                this.setState({
                    isLoaded: true,
                    items: Array.from(data)
                })
            });
    }

    render() {
        const {isLoaded, items} = this.state;
        console.log("this is" + this.state.items)
        if (!isLoaded) {
            return <div>Loading...</div>
        } else {
            return (
                <div>
                    <div>
                        <ClaySelect aria-label="Select Label" id="mySelectId">
                            {items.map((item) => (
                                <ClaySelect.Option
                                    key={item.id}
                                    label={item.name}
                                    value={item.name}
                                />
                            ))}
                        </ClaySelect>
                    </div>
                    <div>
                        <ClayForm>
                            <ClayForm.Group className="form-group-sm">
                                <ClayInput placeholder="Name" type="text"/>
                            </ClayForm.Group>
                            <ClayForm.Group className="form-group-sm">
                                <textarea className="form-control" placeholder="Description"/>
                            </ClayForm.Group>
                        </ClayForm>
                    </div>
                    <div>
                        <ClayButton.Group spaced>
                            <ClayButton displayType="secondary">Cancel</ClayButton>
                            <ClayButton displayType="primary">Save</ClayButton>
                        </ClayButton.Group>
                    </div>
                </div>
            );
        }
    }
}

export default App;

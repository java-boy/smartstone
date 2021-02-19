import React, {Component} from 'react';
import ClayButton from '@clayui/button';
import ClayForm, {ClayInput, ClaySelect} from '@clayui/form';

class Attribute extends Component {
    constructor(props) {
        super(props);
        this.state = {
            item:"",
            isLoaded: false
        }
    }

    componentDidMount() {
        fetch('http://jsonplaceholder.typicode.com/users')
            .then(result => result.json())
            .then(json => {
                this.setState({
                    isLoaded: true,
                    item: json
                })
            });
    }

    render()
    {
        const {isLoaded, item} = this.state;
        if (!isLoaded) {
            return <div>Loading...</div>
        } else {
            return (
                <div>
                    <div>
                        <ClayInput placeholder={item.name}  value={item.name} type="text"/>



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

export default Attribute;

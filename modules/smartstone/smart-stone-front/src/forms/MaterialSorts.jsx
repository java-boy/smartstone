import React, {Component} from 'react'
import ClayButton from '@clayui/button';
import ClayForm, {ClayInput, ClaySelectWithOption} from '@clayui/form';

class MaterialSorts extends Component {
    render() {
        const materialSorts = [
            {
                label: "option1",
                value: "1"
            },
            {
                label: "option2",
                value: "2"
            }
        ];
        const colors = [
            {
                label: "option1",
                value: "1"
            },
            {
                label: "option2",
                value: "2"
            }
        ];

        return (
            <div>
                <div>
                    <ClaySelectWithOption
                        aria-label="Select Label"
                        id="mySelectId"
                        options={materialSorts}
                    />
                </div>
                <div>
                    <ClaySelectWithOption
                        aria-label="Select Label"
                        id="mySelectId"
                        options={colors}
                    />
                </div>

                <div>
                    <ClayForm>
                        <ClayForm.Group className="form-group-sm">
                            <ClayInput placeholder="Material Name" type="text"/>
                        </ClayForm.Group>
                        <ClayForm.Group className="form-group-sm">
                            <textarea className="form-control" placeholder="Material Description"/>
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

export default MaterialSorts;
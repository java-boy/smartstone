import React, {Component} from 'react';
import ClayButton from '@clayui/button';
import ClayForm, {ClayInput, ClaySelectWithOption} from '@clayui/form';

class AttributeTypes extends Component {
    render() {
        const options = [
            {
                label: "Material Type",
                value: "1"
            },
            {
                label: "Stone Type",
                value: "2"
            },
            {
                label: "Finishing Type",
                value: "3"
            },
            {
                label: "Tiling Type",
                value: "4"
            },
            {
                label: "Color",
                value: "5"
            },
            {
                label: "Grade",
                value: "6"
            },
            {
                label: "Application",
                value: "7"
            },
            {
                label: "Available Size",
                value: "8"
            },
            {
                label: "Cutting Type",
                value: "9"
            }
        ];

        return (
            <div>
                <div>
                    <ClaySelectWithOption
                        aria-label="Select Label"
                        id="mySelectId"
                        options={options}
                    />
                </div>
                <div>
                    <ClayForm>
                        <ClayForm.Group className="form-group-sm">
                            <ClayInput placeholder="Attribute Name" type="text"/>
                        </ClayForm.Group>
                        <ClayForm.Group className="form-group-sm">
                            <textarea className="form-control" placeholder="Attribute Description"/>
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

export default AttributeTypes;

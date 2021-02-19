import React, {Component} from 'react';
import ClayButton from '@clayui/button';
import ClayForm, {ClayInput} from '@clayui/form';
import {ClayDropDownWithItems} from '@clayui/drop-down';

class Finishing extends Component {
    render() {
        const items = [
            {
                items: [
                    {
                        checked: true,
                        label: "option1",
                        onChange: () => alert("checkbox changed"),
                        type: "checkbox"
                    },
                    {
                        checked: true,
                        label: "option2",
                        onChange: () => alert("checkbox changed"),
                        type: "checkbox"
                    }
                ],
                label: "options",
                type: "group"
            }
        ];


        return (
            <div>
                <div>
                    <ClayForm>
                        <ClayForm.Group className="form-group-sm">
                            <ClayInput className="form-control" placeholder="Finishing Name"/>
                        </ClayForm.Group>

                        <ClayForm.Group className="form-group-sm">
                            <ClayInput.Group>
                                <ClayInput.GroupItem prepend>
                                    <ClayInput placeholder="Finishing List" type="text"/>
                                </ClayInput.GroupItem>

                                <ClayInput.GroupItem append shrink>
                                    <ClayDropDownWithItems
                                        footerContent={
                                            <div>
                                                <ClayButton displayType="secondary">{"Cancel"}</ClayButton>
                                                <ClayButton>{"Done"}</ClayButton>
                                            </div>
                                        }
                                        items={items}
                                        trigger={<ClayButton displayType="secondary">{"Select"}</ClayButton>}
                                    />
                                </ClayInput.GroupItem>
                            </ClayInput.Group>
                        </ClayForm.Group>
                        <ClayForm.Group className="form-group-sm">
                            <textarea className="form-control" placeholder="Finishing Description"/>
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

export default Finishing;
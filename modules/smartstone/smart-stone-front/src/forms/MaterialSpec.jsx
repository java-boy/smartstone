import React, {Component} from 'react'
import ClayButton from '@clayui/button';
import {ClaySelectWithOption} from '@clayui/form';

class MaterialSpec extends Component {
    render() {
        const material = [
            {
                label: "option1",
                value: "1"
            },
            {
                label: "option2",
                value: "2"
            }
        ];
        const sort = [
            {
                label: "option1",
                value: "1"
            },
            {
                label: "option2",
                value: "2"
            }
        ];
        const finishingType = [
            {
                label: "option1",
                value: "1"
            },
            {
                label: "option2",
                value: "2"
            }
        ];
        const cuttingType = [
            {
                label: "option1",
                value: "1"
            },
            {
                label: "option2",
                value: "2"
            }
        ];
        const grade = [
            {
                label: "option1",
                value: "1"
            },
            {
                label: "option2",
                value: "2"
            }
        ];
        const tilling = [
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
                        options={material}
                    />
                </div>
                <div>
                    <ClaySelectWithOption
                        aria-label="Select Label"
                        id="mySelectId"
                        options={sort}
                    />
                </div>
                <div>
                    <ClaySelectWithOption
                        aria-label="Select Label"
                        id="mySelectId"
                        options={finishingType}
                    />
                </div>
                <div>
                    <ClaySelectWithOption
                        aria-label="Select Label"
                        id="mySelectId"
                        options={cuttingType}
                    />
                </div>
                <div>
                    <ClaySelectWithOption
                        aria-label="Select Label"
                        id="mySelectId"
                        options={grade}
                    />
                </div>
                <div>
                    <ClaySelectWithOption
                        aria-label="Select Label"
                        id="mySelectId"
                        options={tilling}
                    />
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

export default MaterialSpec;
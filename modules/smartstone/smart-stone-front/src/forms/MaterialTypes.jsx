import React, {Component} from 'react';
import ClayButton from '@clayui/button';
import ClayForm, {ClayInput, ClaySelectWithOption} from '@clayui/form';

class MaterialTypes extends Component {
    render() {
        const materialTypes = [
            {
                label: "Stone",
                value: "1"
            },

            {
                label: "Steel",
                value: "2"
            },

            {
                label: "Wood",
                value: "3"
            }
        ];

        const stoneTypes = [
            {
                label: "Marble",
                value: "1"
            },

            {
                label: "Graniet",
                value: "2"
            },

            {
                label: "Onyx",
                value: "3"
            },

            {
                label: "Travertine",
                value: "4"
            },

            {
                label: "Sandstone",
                value: "5"
            },

            {
                label: "Quartzite",
                value: "6"
            },

            {
                label: "Slate",
                value: "7"
            },

            {
                label: "Bazalt",
                value: "8"
            },

            {
                label: "Porphyry",
                value: "9"
            },

            {
                label: "Tuff",
                value: "10"
            },

            {
                label: "Cantera",
                value: "11"
            },

            {
                label: "Schist",
                value: "12"
            },

            {
                label: "Alabaster",
                value: "13"
            },

            {
                label: "Andesite",
                value: "14"
            },

            {
                label: "Coralstone",
                value: "15"
            },

            {
                label: "Bluestone",
                value: "16"
            },

            {
                label: "Conglomerate",
                value: "17"
            },

            {
                label: "Trachyte",
                value: "18"
            },

            {
                label: "Phyllite",
                value: "19"
            },

            {
                label: "Calcarenite",
                value: "20"
            },

            {
                label: "Rhyolite",
                value: "21"
            },

            {
                label: "Felsite",
                value: "22"
            },

            {
                label: "Jade",
                value: "23"
            },

            {
                label: "Pumice",
                value: "24"
            }

        ];


        return (
            <div>
                <div>
                    <ClaySelectWithOption
                        aria-label="Select Label"
                        id="mySelectId"
                        options={materialTypes}
                    />
                </div>
                <div>
                    <ClaySelectWithOption
                        aria-label="Select Label"
                        id="mySelectId"
                        options={stoneTypes}
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

export default MaterialTypes;
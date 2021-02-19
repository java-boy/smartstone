import React, {Component, useState} from 'react';
import ClayButton from '@clayui/button';
import ClayModal, {useModal} from '@clayui/modal';

class ProductModel extends Component {
    render() {
        const [visible, setVisible] = useState(false);
        const {observer, onClose} = useModal({
            onClose: () => setVisible(false)
        });

        return (
            <div>
                {visible && (
                    <ClayModal
                        observer={observer}
                        size="lg"
                        status="info"
                    >
                        <ClayModal.Header>{"Title"}</ClayModal.Header>
                        <ClayModal.Body>
                            <h1>{"Hello world!"}</h1>
                        </ClayModal.Body>
                        <ClayModal.Footer
                            first={
                                <ClayButton.Group spaced>
                                    <ClayButton displayType="secondary">{"Secondary"}</ClayButton>
                                    <ClayButton displayType="secondary">{"Secondary"}</ClayButton>
                                </ClayButton.Group>
                            }
                            last={<ClayButton onClick={onClose}>{"Primary"}</ClayButton>}
                        />
                    </ClayModal>
                )}
                <ClayButton displayType="primary" onClick={() => setVisible(true)}>
                    {"Open modal"}
                </ClayButton>
            </div>

        );
    }
}

export default ProductModel;
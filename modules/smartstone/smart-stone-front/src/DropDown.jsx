// import React, {Component} from "react";
// import {ClaySelect} from "@clayui/form";
// import ClayButton from "@clayui/button";
//
// class DropDown extends Component {
//     handleSubmit = (event) => {
//         const someElement = document.getElementById("mySelectId").value;
//         this.props.history.push(`/${someElement}`);
//         console.log(someElement);
//         event.preventDefault();
//     };
//
//     render() {
//         const options = [
//             {
//                 label: "attribute-types",
//                 value: "attribute-types"
//             },
//             {
//                 label: "material-types",
//                 value: "material-types"
//             }
//         ];
//
//         return (
//             <div>
//                 <ClaySelect aria-label="Select Label" id="mySelectId">
//                     {options.map((option) => (
//                         <ClaySelect.Option
//                             key={option.value}
//                             label={option.label}
//                             value={option.value}
//                         />
//                     ))}
//                 </ClaySelect>
//
//                 <ClayButton displayType="primary" onClick={this.handleSubmit}>
//                     Add
//                 </ClayButton>
//             </div>
//         );
//     }
// }
//
// export default DropDown;

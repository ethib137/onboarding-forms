import React from 'react';
import ReactDOM from 'react-dom';

import MultiSelect from './MultiSelect';

function render(Component, elementId, props) {
	ReactDOM.render(<Component {...props} />, document.getElementById(elementId));
}

export const multiSelect = (elementId, props) => render(MultiSelect, elementId, props);
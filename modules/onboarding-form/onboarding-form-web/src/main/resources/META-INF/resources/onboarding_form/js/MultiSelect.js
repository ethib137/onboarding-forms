import React, {useCallback, useMemo, useState} from 'react';
import ClayMultiSelect from '@clayui/multi-select';
import ClayForm from '@clayui/form';

const spritemap = themeDisplay.getPathThemeImages() + '/lexicon/icons.svg';

const MultiSelect = props => {
	const {
		label,
		initialItems = [],
		name,
		sourceItems = []
	} = props;

	const memoizedInitialItems = useMemo(() => {
		const newInitialItems = [];

		initialItems.forEach(value => {
			const item = sourceItems.find(item => parseInt(value) === parseInt(item.value));

			if (item) {
				newInitialItems.push(item);
			}
		})

		return newInitialItems;
	}, [initialItems, sourceItems]);

	const [value, setValue] = useState("");
	const [items, setItems] = useState(memoizedInitialItems);

	const handleItemsChange = useCallback((itemsChanged) => {
		console.log('handleItemsChange', itemsChanged);
		const filteredItems = itemsChanged.filter(item => sourceItems.includes(item));

		setItems(filteredItems);
	});

	return (
		<ClayForm.Group>
			<label htmlFor={name}>{label}</label>

			<ClayMultiSelect
				inputName={name}
				inputValue={value}
				items={items}
				onChange={setValue}
				onItemsChange={handleItemsChange}
				spritemap={spritemap}
				sourceItems={sourceItems}
			/>
		</ClayForm.Group>
	);
}

export default MultiSelect;
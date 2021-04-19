create table OBForm_OBFormEntry (
	uuid_ VARCHAR(75) null,
	obFormEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	formId LONG,
	roleIds VARCHAR(75) null,
	siteIds VARCHAR(75) null,
	active_ BOOLEAN
);

create table OBForm_OBFormFieldMapping (
	obFormFieldId LONG not null primary key,
	userPropertyName VARCHAR(75) null,
	formFieldId LONG,
	obFormEntryId LONG
);
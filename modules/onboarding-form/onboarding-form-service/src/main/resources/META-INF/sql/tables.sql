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
	organizationIds VARCHAR(75) null,
	roleIds VARCHAR(75) null,
	siteIds VARCHAR(75) null,
	userGroupIds VARCHAR(75) null,
	sendEmail BOOLEAN,
	active_ BOOLEAN
);

create table OBForm_OBFormFieldMapping (
	obFormFieldMappingId LONG not null primary key,
	userPropertyName VARCHAR(75) null,
	formFieldReference VARCHAR(75) null,
	obFormEntryId LONG
);
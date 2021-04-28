create index IX_A4D4852C on OBForm_OBFormEntry (formId);
create index IX_ABDB2250 on OBForm_OBFormEntry (groupId, name[$COLUMN_LENGTH:75$]);
create index IX_A09E7132 on OBForm_OBFormEntry (name[$COLUMN_LENGTH:75$], groupId);
create index IX_EDD02F2D on OBForm_OBFormEntry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_96049CEF on OBForm_OBFormEntry (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_FC505084 on OBForm_OBFormFieldMapping (formFieldReference[$COLUMN_LENGTH:75$], obFormEntryId);
create index IX_DAFF5B6 on OBForm_OBFormFieldMapping (obFormEntryId, formFieldReference[$COLUMN_LENGTH:75$]);
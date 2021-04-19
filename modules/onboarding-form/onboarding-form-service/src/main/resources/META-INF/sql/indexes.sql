create index IX_32B25351 on OBForm_OBFormEntry (groupId);
create index IX_A09E7132 on OBForm_OBFormEntry (name[$COLUMN_LENGTH:75$], groupId);
create index IX_EDD02F2D on OBForm_OBFormEntry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_96049CEF on OBForm_OBFormEntry (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BBF9D5AD on OBForm_OBFormFieldMapping (obFormEntryId);
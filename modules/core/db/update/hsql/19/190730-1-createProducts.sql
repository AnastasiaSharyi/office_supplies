create table UNTITLED9_PRODUCTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CATEGORY_OF_PRODUCTS_ID varchar(36),
    NAME_OF_PRODUCTS varchar(255) not null,
    AMOUNT decimal(19, 2),
    --
    primary key (ID)
);
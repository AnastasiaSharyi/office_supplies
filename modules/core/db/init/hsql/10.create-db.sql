-- begin UNTITLED9_CATEGORY_OF_PRODUCTS
create table UNTITLED9_CATEGORY_OF_PRODUCTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME_OF_PRODUCTS varchar(255),
    --
    primary key (ID)
)^
-- end UNTITLED9_CATEGORY_OF_PRODUCTS
-- begin UNTITLED9_EMPLOYEE
create table UNTITLED9_EMPLOYEE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    EMAIL varchar(255) not null,
    DATE_ date not null,
    CATEGORY_OF_PRODUCTS_ID varchar(36),
    PRODUCTS_ID varchar(36),
    AMOUNT decimal(19, 2),
    --
    primary key (ID)
)^
-- end UNTITLED9_EMPLOYEE
-- begin UNTITLED9_PRODUCTS
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
)^
-- end UNTITLED9_PRODUCTS

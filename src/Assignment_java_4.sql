create database java4;
use java4;

create table Categories( -- thể loại --
CategoryId int primary key not null,
Name nvarchar(50) not null
);


create table  CartDetails( -- gio hang chi tiết sản phẩm --
CartDetailId int primary key not null,
cartId int not null,
ProductId int not null, -- mã sản phẩm --
Quantity int , -- định lượng , sl --
Price float not null , -- giá -- 
Note nvarchar(200),
);
 
create table Products(               -- săn phẩm --
ProductId int primary key not null,
Name nvarchar(100) not null,
image nvarchar(250),
Quantity int ,                      -- định lượng , sl --
Price float not null ,              -- giá -- 
manufacturedDate date not null,     -- ngày sản xuất--
Status nvarchar(50),                -- trạng thái --
CategoryId int not null,
Description text,                   -- miêu tả --
)
insert into  Products (ProductId,Name,image,Quantity,Price,manufacturedDate,Status,CategoryId,Description) values
('1', N' Trà Gừng ' ,' ','20' ,'500' ,'12/02/2019',' ',' 1',' '),
('2', N' Gạo Dẻo '  ,' ','10' ,'200' ,'18/02/2019',' ',' 6',' '),
('3', N' Bia Hơi '  ,' ','80' ,'500' ,'10/08/2019',' ',' 5',' '),
('4', N' Trà Thái ' ,' ','20' ,'300' ,'02/05/2019',' ',' 1',' '),
('7', N' Kẹo Dẻo '  ,' ','70' ,'500' ,'03/02/2018',' ',' 7',' '),
('1', N' Trà Bí '   ,' ','20' ,'500' ,'02/07/2019',' ',' 1',' '),
('6', N' Gạo lứt '  ,' ','20' ,'100' ,'12/06/2019',' ',' 6',' '),
('5', N' Bia HN '   ,' ','60' ,'500' ,'11/02/2019',' ',' 5',' '),
('4', N' Xoài '     ,' ','20' ,'500' ,'22/02/2019',' ',' 4',' '),
('4', N' Đào '      ,' ','40' ,'300' ,'01/02/2019',' ',' 4',' '),
('3', N' Vai bông ' ,' ','20' ,'250' ,'12/12/2019',' ',' 3',' '),
('3', N' Vai lua  ' ,' ','90' ,'400' ,'02/04/2019',' ',' 3',' '),
('1', N' Trà lá '   ,' ','40' ,'500' ,'21/02/2019',' ',' 1',' '),
('2', N' Hoa đào '  ,' ','120','800' ,'12/01/2019',' ',' 2',' '),
('2', N' Hoa mai '  ,' ','70' ,'500' ,'03/02/2019',' ',' 2',' ');


create table Carts( -- giỏ hàng --
CartId int primary key not null,
CustomerId int not null,
CreatedDate date, -- ngày tạo --
Status nvarchar(30), -- trang thái --
)

create table Customers( -- khách hàng --
CustomerId int primary key not null,
Name nvarchar(50) not null,
Gender bit  not  null,
DOB date,
Email nvarchar(50) not null,
Phone nvarchar(30) not null,
Satatus nvarchar(30),
Password varchar(50) not null,
RegisteredDate date, -- ngày đăng kí --
)

alter table CartDetails add foreign key (CartId) references Carts(CartId);
alter table CartDetails add foreign key (ProductId) references Products(ProductId);

alter table Products add foreign key (CategoryId) references Categories(CategoryId);

alter table Carts add foreign key (CustomerId) references Customers(CustomerId);

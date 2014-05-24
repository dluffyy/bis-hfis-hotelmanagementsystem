USE master
IF(exists (SELECT * FROM sys.databases WHERE name ='HotelManagementSystem'))
DROP database HotelManagementSystem
GO
CREATE Database HotelManagementSystem
GO
USE HotelManagementSystem
GO


create table Discount
(
	DiscountID int primary key,
	DiscountName varchar(50),
	DiscountPercent int,
	DiscountAmount int
)
go
create table Customer
(
	CustomerID int primary key,
	FirstName varchar(30),
	MiddleName varchar(30),
	LastName varchar(30),
	AddStreet varchar(50),
	AddCity varchar(50),
	AddState varchar(50),
	AddZip int,
	AddCountry varchar(50),
	HomePhone varchar(15),
	WorkPhone varchar(15),
	Email varchar(225),
	LastVisited varchar(50),
	CCNumber int,
	CCExpiry datetime
)
go
insert into Customer values
(1, 'Anh', 'Tuan', 'Nguyen', 'Lo Duc', 'Hanoi', 'Hanoi', 30000, 'Vietnam', 043000066, 043888999, 'anhnt@gmail.com', 'Non-avaiable', 1234567890, '12/31/2014')
go
select * from Customer
go
create table Report
(
	ReportID int primary key,
	ReportType varchar(50),
	ReportName varchar(50),
	ReportDesc varchar(50)
)
go
create table RoomType
(
	RoomTypeID int primary key,
	RoomType varchar(50),
	RoomDesc varchar(500),
	RoomRate varchar(50),
	NumBeds int
)
go
insert into RoomType values
(1, 'Single', 'A room assigned to one person. May have one or more beds.', '$99', 1),
(2, 'Double', 'A room assigned to two people. May have one or more beds.', '$199', 2),
(3, 'Triple', 'A room assigned to three people. May have two or more beds.', '$299', 3),
(4, 'Quad', 'A room assigned to four people. May have two or more beds.', '$399', 2),
(5, 'Queen', 'A room with a queen sized bed. May be occupied by one or more people.', '$499', 1),
(6, 'King', 'A room with a king sized bed. May be occupied by one or more people.', '$599', 1),
(7, 'Twin', 'A room with two twin beds. May be occupied by one or more people.', '$299', 2)
go
select * from RoomType
go
create table RoomStatus
(
	RoomStatusID int primary key,
	RoomStatusName varchar(50),
	RoomStatusDesc varchar(500)
)
go
insert into RoomStatus values
(1, 'Occupied', 'A guest is currently occupied in the room.'),
(2, 'Stayover', 'The guest is not expected to check out today and will remain at least one more night.'),
(3, 'On-Change', 'The guest has departed, but the room has not yet been cleaned and ready for sale.'),
(4, 'Do Not Disturb', 'The guest has requested not to be disturbed.'),
(5, 'Cleaning in progress', 'Room attendant is currently cleaning this room.'),
(6, 'Sleep-out', 'A guest is registerd to the room, but the bed has not been used.'),
(7, 'Skipper', 'The guest has left the hotel without making arrangements to tsettle his or her account.'),
(8, 'Vacant and ready', 'The room has been cleaned and inspected and is ready for an arriving guest.'),
(9, 'Out of Order', 'Rooms kept under out of order are not sellable and these rooms are deducted from the hotels inventory.A room may be out-of-order for a variety of reasons, including the need of maintenance, refurbishing and extensive cleaning etc.'),
(10, 'Out of Service', 'Rooms kept under out of service are not deducted from the hotel inventory. This is a temporary blocking and reasons may be bulb fuse, T V remote not working, Kettle not working etc. These rooms are not assigned to the guest once these small maintenance issues are fixed.'),
(11, 'Lock out', 'The room has been locked so that the guest cannot re-enter until he or she is cleared by a hotel official.'),
(12, 'Did not check out', 'The guest made arrangements to settle his or her bills (and thus not a skipper), but has left without informing the front desk.'),
(13, 'Due Out', 'The room is expected to become vacant after the following guest checks out.'),
(14, 'Check-Out', 'The guest has settled his or her account, returned the room keys, and left the hotel.'),
(15, 'Late Check out', 'The guest has requested and is being allowed to check out later than the normal / standard departure time of the hotel.')
go
select * from RoomStatus
go
create table Room
(
	RoomID int primary key,
	RoomNumber int,
	RoomTypeID int foreign key references RoomType(RoomTypeID) on delete cascade,
	RoomStatusID int foreign key references RoomStatus(RoomStatusID) on delete cascade,
	Description varchar(50)
)
go
insert into Room values
(1, 1, 1, 8, ''),
(2, 2, 2, 8, ''),
(3, 3, 3, 8, ''),
(4, 4, 4, 8, ''),
(5, 5, 5, 8, ''),
(6, 6, 6, 8, ''),
(7, 7, 7, 8, ''),
(8, 8, 1, 8, ''),
(9, 9, 2, 8, ''),
(10, 10, 3, 8, ''),
(11, 11, 4, 8, ''),
(12, 12, 5, 8, ''),
(13, 13, 6, 8, ''),
(14, 14, 7, 8, ''),
(15, 15, 1, 8, ''),
(16, 16, 2, 8, ''),
(17, 17, 3, 8, ''),
(18, 18, 4, 8, ''),
(19, 19, 5, 8, ''),
(20, 20, 6, 8, ''),
(21, 21, 7, 8, ''),
(22, 22, 1, 8, ''),
(23, 23, 2, 8, ''),
(24, 24, 3, 8, ''),
(25, 25, 4, 8, ''),
(26, 26, 5, 8, ''),
(27, 27, 6, 8, ''),
(28, 28, 7, 8, ''),
(29, 29, 1, 8, ''),
(30, 30, 2, 8, ''),
(31, 31, 3, 8, ''),
(32, 32, 4, 8, ''),
(33, 33, 5, 8, ''),
(34, 34, 6, 8, ''),
(35, 35, 7, 8, ''),
(36, 36, 1, 8, ''),
(37, 37, 2, 8, ''),
(38, 38, 3, 8, ''),
(39, 39, 4, 8, ''),
(40, 40, 5, 8, ''),
(41, 41, 6, 8, ''),
(42, 42, 7, 8, ''),
(43, 43, 1, 8, ''),
(44, 44, 2, 8, ''),
(45, 45, 3, 8, ''),
(46, 46, 4, 8, ''),
(47, 47, 5, 8, ''),
(48, 48, 6, 8, ''),
(49, 49, 7, 8, ''),
(50, 50, 1, 8, ''),
(51, 51, 2, 8, ''),
(52, 52, 3, 8, ''),
(53, 53, 4, 8, ''),
(54, 54, 5, 8, ''),
(55, 55, 6, 8, ''),
(56, 56, 7, 8, ''),
(57, 57, 1, 8, ''),
(58, 58, 2, 8, ''),
(59, 59, 3, 8, ''),
(60, 60, 4, 8, ''),
(61, 61, 5, 8, ''),
(62, 62, 6, 8, ''),
(63, 63, 7, 8, ''),
(64, 64, 1, 8, ''),
(65, 65, 2, 8, ''),
(66, 66, 3, 8, ''),
(67, 67, 4, 8, ''),
(68, 68, 5, 8, ''),
(69, 69, 6, 8, ''),
(70, 70, 7, 8, '')
go
create proc update_Room
(
	@roomNumber int,
	@roomStatusID int
)
as
	update Room set RoomStatusID = @roomStatusID where RoomNumber = @roomNumber
go
create view v_Room
as
	select r.RoomID, r.RoomNumber, rt.RoomType, rs.RoomStatusName, r.Description
	from Room as r inner join RoomType as rt
	on r.RoomTypeID = rt.RoomTypeID
	inner join RoomStatus as rs
	on r.RoomStatusID = rs.RoomStatusID
go
select * from v_Room
go
create table Reservation
(
	ReservationID int primary key,
	CustomerID int foreign key references Customer(CustomerID) on delete cascade,
	ExpectedCheckinDate date,
	ExpectedCheckoutDate date,
	ArrivalTime varchar(10),
	NumberGuests int,
	RoomTypeID int foreign key references RoomType(RoomTypeID) on delete cascade,
	Comments varchar(225)
)
go
insert into Reservation values
(1, 1, '05/21/2014', '05/28/2014', '8h30 AM', 2, 1, 'No comment')
go
create proc new_reservation
(
	@reservationID int,
	@customerID int,
	@checkinDate date,
	@checkoutDate date,
	@arrivalTime varchar(10),
	@numberGuests int,
	@roomTypeID int,
	@comments varchar(225)
)
as
	insert into Reservation values
	(@reservationID, @customerID, @checkinDate, @checkoutDate, @arrivalTime, @numberGuests, @roomTypeID, @comments)
go
exec new_reservation 2, 1, '05/21/2014', '05/28/2014', '8h30 AM', 2, 1, 'No comment'
go
create proc update_reservation
(
	@reservationID int,
	@customerID int,
	@checkinDate date,
	@checkoutDate date,
	@arrivalTime varchar(10),
	@numberGuests int,
	@roomTypeID int,
	@comments varchar(225)
)
as
	update Reservation
	set CustomerID = @customerID, ExpectedCheckinDate = @checkinDate,
		ExpectedCheckoutDate = @checkoutDate, ArrivalTime = @arrivalTime, NumberGuests = @numberGuests,
		RoomTypeID = @roomTypeID, Comments = @comments
	where ReservationID = @reservationID
go
exec update_reservation 2, 1, '05/22/2014', '05/29/2014', '8h30 AM', 4, 2, 'Not comment'
go
create proc remove_reservation
(
	@reservationID int
)
as
	delete from Reservation where ReservationID = @reservationID
go
-- exec remove_reservation 2
go
select * from Reservation
go
create table PaymentType
(
	PaymentTypeID int primary key,
	PaymentType varchar(50),
	PaymentTypeDesc bit
)
go
create table Payment
(
	PaymentID int primary key,
	PaymentTypeID int foreign key references PaymentType(PaymentTypeID) on delete cascade,
	CCNumber int,
	CCExpirationMonth int,
	CCExpirationYear int,
	CCOwner varchar(50),
	PaymentAmount int,
	PaymentDate datetime,
	ReservationID int foreign key references Reservation(ReservationID) on delete cascade
)
go
create table Bill
(
	BillID int primary key,
	ReservationID int foreign key references Reservation(ReservationID) on delete cascade,
	Comments varchar(125)
)
go
create table BillItemType
(
	BillItemTypeID int primary key,
	BillItemType varchar(50),
	Description varchar(50)
)
go
create table BillItem
(
	BillItemID int identity(1,1) primary key,
	RoomID int foreign key references Room(RoomID),
	BillItemTypeID int foreign key references BillItemType(BillItemTypeID),
	BillItemDescription varchar(50),
	BillItemAmount int,
	BillChargeDate datetime,
	DiscountID int foreign key references Discount(DiscountID),
	BillID int foreign key references Bill(BillID) on delete cascade
)
go
create table CheckOut
(
	CheckoutId int primary key,
	ReservationID int foreign key references Reservation(ReservationID) on delete cascade,
	CheckoutDate date
)
go
create table CheckIn
(
	CheckinID int primary key identity,
	ReservationID int foreign key references Reservation(ReservationID) on delete cascade,
	RoomID int foreign key references Room(RoomID),
	CheckinDate date
)
go
create proc new_Checkin
(
	@reservationID int,
	@roomID int,
	@checkInDate date
)
as
	insert into CheckIn values (@reservationID, @roomID, @checkInDate)
go
create table Role
(
	RoleID int primary key,
	RoleName varchar(50),
	RoleDescription varchar(50)
)
go
create table Login
(
	UserID int identity(1,1) primary key,
	UserName varchar(50),
	Password varchar(50),
	RoleID int foreign key references Role(RoleID) on delete cascade,
	FirstName varchar(50),
	MiddleName varchar(50),
	LastName varchar(50),
	ContactInfo varchar(50)
)
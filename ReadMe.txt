ParkingLot App
******************************************************************

Instructions
******************************************************************
This is a maven project.
Import the project in eclipse and Run the project with configuration : clean compile install package.
ParkingLot-1.0.0.jar will be created in target folder.
Copy the jar to the Folder from where u want to execute the jar.
Open command prompt, to execute the jar from it.
To execute write java -jar ParkingLot-1.0.0.jar <<fileNameWithPath>>(Optional) in command prompt.
App can take input from file or from command line.
To give input from File write following command in terminal : java -jar ParkingLot-1.0.0.jar <<fileNameWithPath>>
To give input in interative command line, write following command in terminal : java -jar ParkingLot-1.0.0.jar, enter the custom commands.


Custom Commands Accepted By ParkingLot App when executed the jar
******************************************************************
create_parking_lot
park
leave
status
registration_numbers_for_cars_with_colour
slot_numbers_for_cars_with_colour
slot_number_for_registration_number
destroy_parking_lot
exit_app

create_parking_lot
------------------
To create a parking lot.
Input   : parkingLotSize
command : create_parking_lot parkingLotSize
Note    : if parkingLot already created than it won't create the next parkingLot.
          parkingLotSize must be postive no, of Max size 2147483647.

park
------------------
To park a car to nearest available parking slot use this command.
Input   : RegistrationNo 
		  CarColor
command : park RegistrationNo Color
Note    : if parking lot not created it won't park the car.
		  Registration No. must be of format XX-00-XX-000 or XX-00-X-0000 or XX-00-X-000.
          Color must Contain only Alapbhets.
          if car with give Registration no is already parked it won't park the entertain the request.

leave
------------------		 
To vacant the give parking slot use this command.
Input   : ParkingSlotNo
command : leave ParkingSlotNo
Note    :  parkingLot needs to be created first to execute this command.
           ParkingSlotNo must be postive no of Max size 2147483647 and less than parkingLotSize.

status
------------------
To get the status of all the cars currently parked in the ParkingLot use this command.
command : status
Note    : parkingLot needs to be created first to execute this command.

registration_numbers_for_cars_with_colour
------------------
To get registarion no of all the cars parked in the parkingLot with given colour.
input   : Colour
command : registration_numbers_for_cars_with_colour Colour
Note    : parkingLot needs to be created first to execute this command.
          colour must be a valid String containg only alphbates.
		  
slot_numbers_for_cars_with_colour
------------------
To get parking slot no of all the cars parked in the parkingLot with given colour.
input   : Colour
command : slot_numbers_for_cars_with_colour Colour
Note    : parkingLot needs to be created first to execute this command.
          colour must be a valid String containg only alphbates.

slot_number_for_registration_number
------------------
To get parking slot no for given registarion no of the car parked in the parkingLot.
input   : RegistrationNo
command : slot_number_for_registration_number RegistrationNo
Note    : parkingLot needs to be created first to execute this command.
		  Registration No. must be of format XX-00-XX-000 or XX-00-X-0000 or XX-00-X-000.

destroy_parking_lot
------------------
To destroy the already existing parking Lot.
command  : destroy_parking_lot
Note     : parkingLot needs to be created first to execute this command.


exit_app
------------------
to exit the parking_lot app use this command.
command : exit_app

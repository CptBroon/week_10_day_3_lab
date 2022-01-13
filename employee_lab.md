[comment]: <> (# Inheritance Lab.)

[comment]: <> (Your task is to model and create a system to store information for employees of a large development company.)

[comment]: <> (You should use TDD, inheritance, packages and abstract classes for this.)

[comment]: <> (#### Create an abstract `Employee` parent class in a package called staff.)

[comment]: <> (- `Employee` will have a name, NI number and salary.)

[comment]: <> (- Create Getters for all properties.)

[comment]: <> (- Add a method named `raiseSalary` with takes in a parameter of type double to increment the salary.)

[comment]: <> (- Add a method called `payBonus` which returns 1% of the employees salary.)

[comment]: <> (- Don't worry about testing just now until you create the subclasses.)

[comment]: <> (#### Create a subclass of `Employee` called `Manager` in a package called management.)

[comment]: <> (- Create a class for Manager.)

[comment]: <> (- Add a property to store the department name in a property called `deptName`.)

[comment]: <> (- Create a constructor that includes all the parameters needed for `Employee` and `deptName`.)

[comment]: <> (- Add a getter method for `deptName`.)

[comment]: <> (- Test all methods including `raiseSalary` and `payBonus`)

[comment]: <> (#### Create subclasses of `Employee`: `Developer` and `DatabaseAdmin` in a package called techStaff.)

[comment]: <> (Create 2 new classes for `Developer` and `DatabaseAdmin`.)

[comment]: <> (- These should take in the same parameters as `Employee` and pass them to `Employee` constructor.)

[comment]: <> (- Again test all methods for both classes.)

[comment]: <> (#### Create a subclass of `Manager` called `Director` in the management package.)

[comment]: <> (- Add a private property to store a double value `budget`.)

[comment]: <> (- Create a constructor for `Director` that includes the parameters needed for `Manager` and the `budget` parameter.)

[comment]: <> (- Create a getter method for this property.)

[comment]: <> (- Test all methods.)


## Extensions

### Prevent unwanted values

[comment]: <> (- Prevent a negative value for the `raiseSalary` method.)

[comment]: <> (- Allow the user to change the Employees name and prevent a null value from being entered.)

- Override the `payBonus` in director to return 2% of their salary.

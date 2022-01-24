# TMPS - Laboratory work 1, 2, 3




<!-- LAB 1 -->
#Lab Nr1
## Topic: Electric Cars Manufacturer
Author: FAF-191, Gavirlita Ion

### Theory
The cars manufacturer have 3 different systems:
- to generate car designs;
- to generate the desigh of a specific car type;
- to make a shopping list;
  The car desgn represents its specifications: maximum speed, mileage, mass, automation level, price.

## Implementation

### Prototype Design Pattern
Here is an abstract class _Car_ which can clone itself:<br/>
<image src="/examples/Proto_clone.png"><br/>
Implementation different types of cars:<br/>
<image src="/examples/Proto_car_types.png"><br/>
Designer class which can build and store the instances and return their clones:<br/>
<image src="/examples/Proto_designer.png"><br/>
The usage:<br/>
<image src="/examples/Proto_usage.png"><br/>
Output:<br/>
<image src="/examples/Proto_run.png"><br/>
<br/>
### Factory Method Design Pattern
Abstract class _Car_<br/>
<image src="/examples/Factory_car.png"><br/>
Implementation different types of cars. Then here is car creator which returns a Car instance of specific type.<br/>
<image src="/examples/Factory_creator.png"><br/>
The usage:<br/>
<image src="/examples/Factory_usage.png"><br/>
Output:<br/>
<image src="/examples/Factory_run.png"><br/>
<br/>
### Builder Method Design Pattern
Interface _Pilot_:<br/>
<image src="/examples/Builder_pilot.png"><br/>
And two types of autopilots with different levels of automation, which implemet the _Pilot_ interface: LevelTwo, LevelThree.<br/>
Here is a _Car_ interface:<br/>
<image src="/examples/Builder_car.png"><br/>
And also two abstract classes which implemet the _Car_ interface, and represent cars with different types of automation: PartialAutomation, ConditionalAutomation.<br/>
These classes for car types, have methods which return different automation level instances.<br/>
<image src="/examples/Builder_po.png"><br/>
<image src="/examples/Builder_co.png"><br/>
 Also here are created  the concrete car types, with specific names and prices, taht extend an automation car type, as PowerfulCar for example:<br/>
<image src="/examples/Builder_powerful.png"><br/>
The class PackBuilder:<br/>
<image src="/examples/Builder_pack.png"><br/>
The usage:<br/>
<image src="/examples/Builder_usage.png"><br/>
The ouput:<br/>
<image src="/examples/Builder_run.png"><br/>





# <a name="lab-2"></a>  Lab Nr 2

## Structural Design Patterns

----

## #Objectives:

* Get familiar with the Structural DPs;
* Choose a specific domain;
* Implement at least 3 SDPs for the specific domain;


## #Used Design Patterns:

* Adapter
* Decorator
* Facade


## #Implementation

* About 2-3 sentences to explain the implementation.

For the adapter pattern, we have 2 different types of batteries. The 2019 type battery contains info about its capacity directly in Wh, but the 2020 model' capacity should be computed. For that we overridden the getWh() method.
<image src="/examples/Adapter.png"><br/>

we used the decorator pattern to add new properties to a class and overridden the function that shows the class properties.
```
@Override
    public void optionsList()
    {
        this.component.optionsList();
        System.out.println(luxuryOptions);
    }
```
<image src="/examples/Decorator.png"><br/>

For the facade pattern, we implemented different methods to get some specific items, in this case 3 methods, for listing civil, industrial and all car models. And the facade class has members which contain the data separately.
<image src="/examples/Facade.png"><br/>


# Lab Nr 3

## Behavioral Design Patterns


----

### Objectives:

1. Study and understand the Behavioral Design Patterns.

2. As a continuation of the previous laboratory work, think about what communication between software entities might be involed in your system.

3. Implement some additional functionalities using behavioral design patterns.


### Used Design and Creational Patterns:

* Facade
* Chain of responsability


### Implementation

Alonside the Facade pattern for displaying the catalog with car configurations, I added the assembly line simulation for car manufacturing with choosing of a specific configuration. The Chain of Responsability was used and implemented the following way.

<image src="/examples/Diagram.png"><br/>

The chain is called by the base handler, and passing the object to work on (car), the type of configuration, and the type of work.

<image src="/examples/call.png"><br/>


The handler for a specific configuration (paint) looks like this:
```
public Car work(Car car, String type, WorkType workType) {
    if (workType == WorkType.PAINT) {
        System.out.println(String.format("Painting with '%s'", type));
        car.setColor(type);
    } else {
        car = super.work(car, type, workType);
    }
    return car;
}
```
So, if it is not supposed to change the object, it passes the object to the next handler.

### Test
<image src="/examples/Output.png"><br/>
  
  Thank you a lot for helping in this TMPS course Caragiu Victor && Evstafief Nikolae





Topic: Pokemon trading card factory

Introduction/Theory:
In this lab we are going to create a Pokemon trading card factory were we can build unique objects aka. Pokemons using Python.
The end goal is to be able to instantiate Pokemons with different traits such as rarity and also being able to clone in certain cases.

Implementation/Eplanation:
1) Singleton - used for creating a single "Pokemon" with "Legendary" rarity (since there can only be one legendary pokemon at a time!). Using the builder again will result in replacing the old instance variables with the new ones. The object always has the same place in the memory after instantiation, only the instance variables get replaced if the constructor is used again.
Since this particular singleton implementation uses a inner private class to control the creation wrapped under the outer class its downside is that there is the additional need to wire its behavior to each both classes.

2) Oject Pooling - used when creating an instance is costly, thus, "Epic" was implemented to use the resources from resource class and return them when needed.

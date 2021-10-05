from abc import ABC, abstractmethod


class Pokemon(ABC):
    @abstractmethod
    def catchphrase(self):
        pass

# This is a singleton
class Legendary(Pokemon):
    class __Legendary(Pokemon):
        def __init__(self, name, power):
            self.name = name
            self.power = power
            self.rarity = "Legendary"

        def catchphrase(self):
            return self.name + " go catch 'em all!"

    instance = None

    def __init__(self, name, power):
        if not Legendary.instance:
            Legendary.instance = Legendary.__Legendary(name, power)
        else:
            Legendary.instance.name = name
            Legendary.instance.power = power

    def catchphrase(self):
        return Legendary.instance.name + " go catch 'em all!"


class Resource:
    # Some resource, that clients need to use.

    __name = ''

    def reset(self):
        """ Put resource back into default setting. """
        self.__name = ''

    def setName(self, name):
        self.__name = name

    def getName(self):
        return self.__name


class Epic:
    """ Resource manager.
    Handles checking out and returning resources from clients.
    It is  a singleton
    """

    __instance = None
    __resources = list()

    def __init__(self):
        if Epic.__instance is not None:
            raise NotImplemented("This is a singleton class.")

    @staticmethod
    def getInstance():
        if Epic.__instance is None:
            Epic.__instance = Epic()

        return Epic.__instance

    def getResource(self):
        if len(self.__resources) > 0:
            print("Using existing slots.")
            return self.__resources.pop(0)
        else:
            print("Creating new resource.")
            return Resource()

    def returnResource(self, resource):
        resource.reset()
        self.__resources.append(resource)


pool = Epic.getInstance()

one = pool.getResource()
two = pool.getResource()
one.setName("Onix")
two.setName("Charmander")

print(pool.returnResource(one))
print(pool.returnResource(two))

three = Legendary('Pichachu', 9000)
print(three.catchphrase())

four = Legendary('Krabby', 9001)
print(four.catchphrase())

print(three.catchphrase())

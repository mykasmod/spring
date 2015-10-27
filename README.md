# Spring 101
# by topic

# 1 Understanding Dependency Injection
	 # See screenshot on application directory with filename UnderstandingDI.jpg
# 2 Setting Up 
	 # I use Maven instead of manually downloading Spring libraries. 
	 # Actual steps done:
		 # 1. Right click project > Configure > Convert to Maven Project 
		 # 2. Right click project > Spring Tools > Add Spring Project Nature
		 # 3. Right click project > Properties > Project Facets > Java 1.7 & Runtimes tab > jdk1.7.X_XX
		 # 4. Right click project > Properties > Java Compiler > Compiler compliance level 1.7
		 # 5. Right click project > Build Path > Configure Build Path > Libraries > jdk1.7.X_XX
# 3 Understanding Spring Bean Factory
	 # Spring Bean Factory is an implementation of Factory pattern
	 # Bean Factory creates a bean (Spring Bean) from Spring XML(spring.xml) blueprint.
	 # The calling object(main method) ask for Spring Bean from Bean Factory, Bean Factory reads the Spring XML

# 4 Writing Code Using the Bean Factory
	 # Good to know:
	 	-ApplicationContext is a subclass of BeanFactory interface. BeanFactory shouldn't be used directly.
	 	-Moving from DTD to XML Schema-based configuration for spring(application-context).xml. As the objects defined in a Spring XML configuration file are not all generic, vanilla beans. Usually, each bean requires some degree of specific configuration.
	 	
# 5 Application Context and Property Initialization
	# Needed to move spring.xml under "src" folder for ClassPathXmlApplicationContext to work
	# Created new member variable "type" in Triangle
	# Assigned a value of member variable through bean property
	
# 6 Using Constructor injection
	# Created Triangle constructor with String "type" parameter
		- assign member variable with the value of parameter	 
	# Changed bean property to constructor-arg
	# Using constructor-arg value
	# Using constructor-arg with index, depending in order of parameter

# 7 Injecting Objects
	# Use Spring dependency injection to prepopulate the member variables of Triangle
	# The getBean of first level Spring bean will automatically inject the dependent spring bean
	
# 8 Inner Beans Aliases and idref
	# Moving the bean definition of dependent bean inside the property of Triangle object
	# No point in having an id for inner bean, not referenced by other bean
	# There's no performance benefits of moving the definition inside the bean property. Moved to the bean where it's needed.

# 9 Initializing Collections
	# Changed member variable to a list of Point objects
	# Replaced the property with the new member variable "points"
	# Initialize the member variable by specifying the list of points inside the property of bean definition
	# There is automatic type conversion happening when the ref elements value of property are different from the Generics type of member variable. In this example a Point type. 
	# Can use Set and Map as well instead of List
	
# 10 Bean Autowiring
	# Auto wiring is provided by Spring framework
		- So far we know that every bean has to be configured
	# Without autowiring we have to manually add the three member variables of the class to the property tag in spring bean configuration.
	# Autowire byName is to have the same name as member variable of the class.
	# With autowire there's no need to add the properties and reference under the bean tag
			
		
	 
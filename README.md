# Dummy-Core-Bank-System-with-Integrator-Service
Back-end developer task (dummy core banking system and rest integrator service), as a SOAP web services and Integrator service as a REST Api.

## Development Methodology

### Core Bank Dummy

SOAP Web Service created with Spring Boot Starter Web Services. when creating the SOAP services use the contract first approach and define the XSD for the request and response.</BR>
/src/main/resources/core-bank-details.xsd
#### Sample get account balance request and response.  
![](testResults/xsd.PNG)

To do the mapping from XML to Java and Java to XML, JAXB (Java API for XML binding) used and to generate the the Java objects based on the XSD Maven JAXB Plugin defined in the pom.xml




## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```
Give examples
```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system



## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **YourWork** - *Initial work* - [YourWork](https://github.com/yourrepo)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

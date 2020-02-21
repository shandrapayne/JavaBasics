.PHONY: all AddMeTogether CalculateTip CompoundInterest ComputeTaxes GreatestCommonDivisor GuessingGame ISBNChecksum MinMax TheAdditionGame UpperLimit Quiz build

# Must run "make build" first, then any make command should work. example: "make ComputeTaxes".

build:
	docker build -t javabasics .

AddMeTogether:
	docker run -it -e SCRIPT='AddMeTogether' javabasics

CalculateTip:
	docker run -it -e SCRIPT='CalculateTip' javabasics 

CompoundInterest:
	docker run -it -e SCRIPT='CompoundInterest' javabasics

ComputeTaxes:
	docker run -it -e SCRIPT='ComputeTaxes' javabasics

GreatestCommonDivisor:
	docker run -it -e SCRIPT='GreatestCommonDivisor' javabasics

GuessingGame:
	docker run -it -e SCRIPT='GuessingGame' javabasics

ISBNChecksum:
	docker run -it -e SCRIPT='ISBNChecksum' javabasics 

MinMax:
	docker run -it -e SCRIPT='MinMax' javabasics 

TheAdditionGame:
	docker run -it -e SCRIPT='TheAdditionGame' javabasics

UpperLimit:
	docker run -it -e SCRIPT='UpperLimit' javabasics

Quiz:
	docker run -it -e SCRIPT='Quiz' javabasics
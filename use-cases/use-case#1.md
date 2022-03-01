# USE CASE: 4 Generate Country Report

## CHARACTERISTIC INFORMATION

### Goal in Context

Generate a report with the following information:

* Code
* Name
*  Continent
* Region
* Population
* Capital

### Scope

Company

### Level

Primary task.

### Preconditions

we know the country, database has information on the code, continent, region, population and capital

### Success End Condition

Successful country report is produced 

### Failed End Condition

No report is produced

### Primary Actor

User

### Trigger

A request on information about a country is produced

## MAIN SUCCESS SCENARIO

1. User requests information about a country
2. Relevent information about the country is retrieved from the database
3. Report is produced

## EXTENSIONS

2. The data doesn't exist in database
| i. User inputs correct location, database manager is informed.

## SUB-VARIATIONS

none

## SCHEDULE

**DUE DATE**: Release 1.0

# USE CASE: 4 Generate Population Reports

## CHARACTERISTIC INFORMATION

### Goal in Context

A report on the population of any:
* Continent
* Country
* District
* Region
* City including captials
* The world.

### Scope

Company.

### Level

Primary task.

### Preconditions

Database contains population data on all of the following:
* Continents
* Countries
* Districts
* Regions
* Cities including capitals
* The world

### Success End Condition

Population report is produced.

### Failed End Condition

No population report is produced.

### Primary Actor

User.

### Trigger

A request for a population report from the user.

## MAIN SUCCESS SCENARIO

1. Request for population report.
2. Relevant data is retrieved from the database.
3. Produce report.

## EXTENSIONS

2. Data doesn't exist.
  1. Enter correct location or inform database manager.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0

# USE CASE: 5 Generate Language Reports

## CHARACTERISTIC INFORMATION

### Goal in Context

A report on the population of people who speak the following languages:
* Chinese
* English
* Hindi
* Spanish
* Arabic

These should be displayed from largest to smallest including a percentage of the world population.

### Scope

Company.

### Level

Primary task.

### Preconditions

Database must contain all of the correct data in the country and countrylanguage table.

### Success End Condition

Language report is produced.

### Failed End Condition

No language report is produced.

### Primary Actor

User.

### Trigger

A request for a language report from the user.

## MAIN SUCCESS SCENARIO

1. Request for language report.
2. Relevant data is retrieved from the database.
3. Produce report.

## EXTENSIONS

2. **Data doesn't exist**:
    1. Inform the database manager.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0

----- 1 List each country name where the population is larger than that of 'Russia'.
SELECT name FROM world 
WHERE population > (SELECT population FROM world WHERE name='Russia')

----- 2 Show the countries in Europe with a per capita GDP greater than 'United Kingdom'.
SELECT name FROM world 
WHERE gdp/population > ( SELECT gdp/population  FROM world WHERE name = 'United Kingdom') 
and continent  = 'Europe'

----- 3 List the name and continent of countries in the continents containing either Argentina or Australia. Order by name of the country.
SELECT name, continent FROM world
WHERE continent  IN (  SELECT continent FROM world WHERE name in ('Argentina','Australia'))
ORDER BY name

----- 4 Which country has a population that is more than United Kingdom but less than Germany? Show the name and the population.
SELECT name, population FROM world 
WHERE population > (SELECT population FROM world WHERE name = 'United Kingdom') 
  and population < (SELECT population FROM world WHERE name = 'Germany')

----- 5 Show the name and the population of each country in Europe. Show the population as a percentage of the population of Germany.
SELECT name , CONCAT(ROUND( population*100/ (SELECT population FROM world WHERE name= 'Germany' )) , '%')
FROM world
WHERE continent= 'Europe'

---- 6 Which countries have a GDP greater than every country in Europe? [Give the name only.] (Some countries may have NULL gdp values)
SELECT name FROM world  WHERE gdp >= ALL (
  SELECT gdp FROM world WHERE continent = 'Europe' and gdp >0
) and continent != 'Europe'

---- 7 Find the largest country (by area) in each continent, show the continent, the name and the area:
SELECT continent, name, area
FROM (
  SELECT continent, name, area,
    ROW_NUMBER() OVER (PARTITION BY continent ORDER BY area DESC) as rank
  FROM world
  WHERE population > 0
) ranked_world
WHERE rank = 1
ORDER BY name

---- 8 List each continent and the name of the country that comes first alphabetically.
SELECT continent, name
FROM (
  SELECT continent, name,
    ROW_NUMBER() OVER (PARTITION BY continent ORDER BY name) as alphabetically
  FROM world) alphabetically_world
WHERE alphabetically = 1

---- 9 Some countries have populations more than three times that of all of their neighbours (in the same continent). Give the countries and continents.
SELECT name, continent
FROM world x
WHERE population > ALL (
  SELECT 3 * population 
  FROM world y 
  WHERE x.continent = y.continent 
    AND x.name <> y.name
)
### URL shortener project

## Create a barebones java web application
  * Use webapp maven archetype
  * Download tomcat and try to make it run by copying the warfile into the deployment directory

## Create a simple servlet
  * Servlet should accept long url as a query parameter
  * Servlet should shorten the url and return it (use the static global context temporarily to 'remember' the shortened urls)
  * Create another servlet that redirects back to the 'long-url' 

## Database connection
  * Make servlets use database to save and use saved shortened urls (you can use any database you like)

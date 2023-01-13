# Getting Started

### Environment Variable

In this project, I'll show you how to use the system variable or environment variables.
this is usefull when you want to add properties that are depend on the
environment variables. In case you have some different user/password, or 
a 3rd party token which you don't know about the production values, you can
use this trick to add a environment property and ask the devOps guys to
fullfill this during the application deployments.

This is pretty simple, all you need to do is use '${ENVIRONMENT_VARIABLE}'
in front of your property.




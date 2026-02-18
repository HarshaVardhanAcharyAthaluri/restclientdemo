# restclientdemo

- RestClient we can create in two ways.
    - RestClient.create() // default 
    - RestClient.Builder // need HttpClient Dependency

- RestClient.create() gives a fully built client with default config. We have limitation. for example we need an interceptor then this approach don't support because interceptor are added during building phase.So for customisations we should go for RestClient.Builder.build.
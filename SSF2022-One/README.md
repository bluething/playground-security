When we add Spring Security as a dependency, we will have a security context automatically.  
Spring security give us default password (for development only)
```text
2022-11-14 14:16:23.575  INFO 38000 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 466 ms
2022-11-14 14:16:23.727  WARN 38000 --- [           main] .s.s.UserDetailsServiceAutoConfiguration : 

Using generated security password: 19d07f30-4d9e-4ad1-8cff-1ad7087b1c7d

This generated password is for development use only. Your security configuration must be updated before running your application in production.

2022-11-14 14:16:23.799  INFO 38000 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will secure any request with [org.springframework.security.web.session.DisableEncodeUrlFilter@5731d3a, org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@6a0f2853, org.springframework.security.web.context.SecurityContextPersistenceFilter@341b13a8, org.springframework.security.web.header.HeaderWriterFilter@5f96f6a2, org.springframework.security.web.csrf.CsrfFilter@4a901445, org.springframework.security.web.authentication.logout.LogoutFilter@656f62dc, org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter@717d7587, org.springframework.security.web.authentication.ui.DefaultLoginPageGeneratingFilter@724b939e, org.springframework.security.web.authentication.ui.DefaultLogoutPageGeneratingFilter@1eff3cfb, org.springframework.security.web.authentication.www.BasicAuthenticationFilter@4e642ee1, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@71f1cc02, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@5f14761c, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@70c69586, org.springframework.security.web.session.SessionManagementFilter@290e8cab, org.springframework.security.web.access.ExceptionTranslationFilter@f1dd5b4, org.springframework.security.web.access.intercept.FilterSecurityInterceptor@316acbb5]
2022-11-14 14:16:23.823  INFO 38000 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
```


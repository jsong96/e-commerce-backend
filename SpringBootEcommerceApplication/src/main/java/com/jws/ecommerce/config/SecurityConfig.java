package com.jws.ecommerce.config;

import com.okta.spring.boot.oauth.Okta;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // protect endpoint /api/orders
        http.authorizeRequests()
                .antMatchers("/api/orders/**") // protect endpoint
                .authenticated() // only accessible to authenticated users
                .and()
                .oauth2ResourceServer() // configure OAuth2 Resource Server support
                .jwt(); // enables JWT-encoded bearer token support

        // add CORS filters
        http.cors();

        // force a non-empty response body for 401
        Okta.configureResourceServer401ResponseBody(http);


        // disable CSRF
        http.csrf().disable();
    }
}

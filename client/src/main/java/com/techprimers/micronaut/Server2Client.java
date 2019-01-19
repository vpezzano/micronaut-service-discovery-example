package com.techprimers.micronaut;

import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

/*
 * Using Eureka, we can refer to the server id, rather than to the hard-coded url.
 * Now Micronaut will use Eureka to figure out what the url is.
 */
// @Client("http://localhost:8083")
@Client(id = "server2")
public interface Server2Client {

    @Get("/hello")
    public String helloFromServer();
}
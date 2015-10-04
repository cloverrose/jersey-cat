package com.example;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Test Application subclass for servlet3-webapp example.
 *
 * @author Adam Lindenthal (adam.lindenthal at oracle.com)
 */
public class App extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        HashSet<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(DogResource.class);
        classes.add(CatResource.class);

        return classes;
    }
}

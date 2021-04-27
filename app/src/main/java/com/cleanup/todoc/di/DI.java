package com.cleanup.todoc.di;

import com.cleanup.todoc.service.ApiService;
import com.cleanup.todoc.service.Repository;

/**
 * Dependency injector to get instance of services
 */
public class DI {

    private static ApiService service = new Repository();

    /**
     * Get an instance on @{@link ApiService}
     *
     * @return
     */
    public static ApiService getApiService() {
        return service;
    }

    /**
     * Get always a new instance on @{@link ApiService}. Useful for tests, so we ensure the context is clean.
     *
     * @return
     */
    public static ApiService getNewInstanceApiService() {
        return new Repository();
    }
}
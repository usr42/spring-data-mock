package com.mmnaseri.utils.spring.data.proxy;

/**
 * @author Milad Naseri (milad.naseri@cdk.com)
 * @since 1.0 (4/12/16, 1:34 PM)
 */
public interface RepositoryFactoryAware {

    void setRepositoryFactory(RepositoryFactory factory);

}
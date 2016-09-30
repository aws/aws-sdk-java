/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.auth;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <p>
 * {@link AWSCredentialsProvider} that loads credentials from Amazon EC2 Container Service
 * if "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI" environment variable is set and
 * security manager has permission to access the variable,
 * otherwise loads credentials from Amazon EC2 Instance Metadata Service.
 * </p>
 */
public class EC2ContainerCredentialsProviderWrapper implements AWSCredentialsProvider {

    private static final Log LOG = LogFactory.getLog(EC2ContainerCredentialsProviderWrapper.class);

    private final AWSCredentialsProvider provider;

    public EC2ContainerCredentialsProviderWrapper() {
        provider = initializeProvider();
    }

    private AWSCredentialsProvider initializeProvider() {
        try {
            return System.getenv(ContainerCredentialsProvider.ECS_CONTAINER_CREDENTIALS_PATH) != null
                    ? new ContainerCredentialsProvider() : InstanceProfileCredentialsProvider.getInstance();
        } catch (SecurityException securityException) {
            LOG.debug("Security manager did not allow access to the ECS credentials environment variable " + ContainerCredentialsProvider.ECS_CONTAINER_CREDENTIALS_PATH
                        + ". Please provide access to this environment variable if you want to load credentials from ECS Container.");
            return InstanceProfileCredentialsProvider.getInstance();
        }
    }

    @Override
    public AWSCredentials getCredentials() {
        return provider.getCredentials();
    }

    @Override
    public void refresh() {
       provider.refresh();
    }
}

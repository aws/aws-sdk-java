/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simpleemail.model;

/**
 * <p>
 * Indicates that the configuration set could not be created because of a naming conflict.
 * </p>
 */
public class ConfigurationSetAlreadyExistsException extends com.amazonaws.services.simpleemail.model.AmazonSimpleEmailServiceException {
    private static final long serialVersionUID = 1L;

    private String configurationSetName;

    /**
     * Constructs a new ConfigurationSetAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConfigurationSetAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * @param configurationSetName
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * @return
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * @param configurationSetName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationSetAlreadyExistsException withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

}

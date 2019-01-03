/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

/**
 * <p>
 * Indicates that the configuration set you specified already contains a TrackingOptions object.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrackingOptionsAlreadyExistsException extends com.amazonaws.services.simpleemail.model.AmazonSimpleEmailServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Indicates that a TrackingOptions object already exists in the specified configuration set.
     * </p>
     */
    private String configurationSetName;

    /**
     * Constructs a new TrackingOptionsAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TrackingOptionsAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * <p>
     * Indicates that a TrackingOptions object already exists in the specified configuration set.
     * </p>
     * 
     * @param configurationSetName
     *        Indicates that a TrackingOptions object already exists in the specified configuration set.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * Indicates that a TrackingOptions object already exists in the specified configuration set.
     * </p>
     * 
     * @return Indicates that a TrackingOptions object already exists in the specified configuration set.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * Indicates that a TrackingOptions object already exists in the specified configuration set.
     * </p>
     * 
     * @param configurationSetName
     *        Indicates that a TrackingOptions object already exists in the specified configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrackingOptionsAlreadyExistsException withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

}

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
 * Indicates that the Amazon CloudWatch destination is invalid. See the error message for details.
 * </p>
 */
public class InvalidCloudWatchDestinationException extends com.amazonaws.services.simpleemail.model.AmazonSimpleEmailServiceException {
    private static final long serialVersionUID = 1L;

    private String configurationSetName;

    private String eventDestinationName;

    /**
     * Constructs a new InvalidCloudWatchDestinationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidCloudWatchDestinationException(String message) {
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

    public InvalidCloudWatchDestinationException withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * @param eventDestinationName
     */

    public void setEventDestinationName(String eventDestinationName) {
        this.eventDestinationName = eventDestinationName;
    }

    /**
     * @return
     */

    public String getEventDestinationName() {
        return this.eventDestinationName;
    }

    /**
     * @param eventDestinationName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidCloudWatchDestinationException withEventDestinationName(String eventDestinationName) {
        setEventDestinationName(eventDestinationName);
        return this;
    }

}

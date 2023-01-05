/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import javax.annotation.Generated;

/**
 * <p>
 * This exception is thrown when Organizations is not configured to support all features. All features must be enabled
 * in Organizations to support creating an organization trail or event data store.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationNotInAllFeaturesModeException extends com.amazonaws.services.cloudtrail.model.AWSCloudTrailException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new OrganizationNotInAllFeaturesModeException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public OrganizationNotInAllFeaturesModeException(String message) {
        super(message);
    }

}

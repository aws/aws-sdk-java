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
package com.amazonaws.services.servicequotas.model;

import javax.annotation.Generated;

/**
 * <p>
 * The organization that your account belongs to, is not in All Features mode. To enable all features mode, see <a
 * href="https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnableAllFeatures.html"
 * >EnableAllFeatures</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationNotInAllFeaturesModeException extends com.amazonaws.services.servicequotas.model.AWSServiceQuotasException {
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

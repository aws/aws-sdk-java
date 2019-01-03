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
package com.amazonaws.services.route53.model;

import javax.annotation.Generated;

/**
 * <p>
 * You tried to update a traffic policy instance by using a traffic policy version that has a different DNS type than
 * the current type for the instance. You specified the type in the JSON document in the
 * <code>CreateTrafficPolicy</code> or <code>CreateTrafficPolicyVersion</code>request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictingTypesException extends com.amazonaws.services.route53.model.AmazonRoute53Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ConflictingTypesException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictingTypesException(String message) {
        super(message);
    }

}

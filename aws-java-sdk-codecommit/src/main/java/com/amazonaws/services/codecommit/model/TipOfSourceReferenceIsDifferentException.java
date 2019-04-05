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
package com.amazonaws.services.codecommit.model;

import javax.annotation.Generated;

/**
 * <p>
 * The tip of the source branch in the destination repository does not match the tip of the source branch specified in
 * your request. The pull request might have been updated. Make sure that you have the latest changes.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TipOfSourceReferenceIsDifferentException extends com.amazonaws.services.codecommit.model.AWSCodeCommitException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TipOfSourceReferenceIsDifferentException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TipOfSourceReferenceIsDifferentException(String message) {
        super(message);
    }

}

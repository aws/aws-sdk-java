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
 * Indicates that the delete operation could not be completed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CannotDeleteException extends com.amazonaws.services.simpleemail.model.AmazonSimpleEmailServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Indicates that a resource could not be deleted because no resource with the specified name exists.
     * </p>
     */
    private String name;

    /**
     * Constructs a new CannotDeleteException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public CannotDeleteException(String message) {
        super(message);
    }

    /**
     * <p>
     * Indicates that a resource could not be deleted because no resource with the specified name exists.
     * </p>
     * 
     * @param name
     *        Indicates that a resource could not be deleted because no resource with the specified name exists.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Indicates that a resource could not be deleted because no resource with the specified name exists.
     * </p>
     * 
     * @return Indicates that a resource could not be deleted because no resource with the specified name exists.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Indicates that a resource could not be deleted because no resource with the specified name exists.
     * </p>
     * 
     * @param name
     *        Indicates that a resource could not be deleted because no resource with the specified name exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CannotDeleteException withName(String name) {
        setName(name);
        return this;
    }

}

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
 * Indicates that a resource could not be created because of a naming conflict.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlreadyExistsException extends com.amazonaws.services.simpleemail.model.AmazonSimpleEmailServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Indicates that a resource could not be created because the resource name already exists.
     * </p>
     */
    private String name;

    /**
     * Constructs a new AlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AlreadyExistsException(String message) {
        super(message);
    }

    /**
     * <p>
     * Indicates that a resource could not be created because the resource name already exists.
     * </p>
     * 
     * @param name
     *        Indicates that a resource could not be created because the resource name already exists.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Indicates that a resource could not be created because the resource name already exists.
     * </p>
     * 
     * @return Indicates that a resource could not be created because the resource name already exists.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Indicates that a resource could not be created because the resource name already exists.
     * </p>
     * 
     * @param name
     *        Indicates that a resource could not be created because the resource name already exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlreadyExistsException withName(String name) {
        setName(name);
        return this;
    }

}

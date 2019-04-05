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
package com.amazonaws.services.clouddirectory.model;

import javax.annotation.Generated;

/**
 * <p>
 * A <code>BatchWrite</code> exception has occurred.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchWriteException extends com.amazonaws.services.clouddirectory.model.AmazonCloudDirectoryException {
    private static final long serialVersionUID = 1L;

    private Integer index;

    private String type;

    /**
     * Constructs a new BatchWriteException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public BatchWriteException(String message) {
        super(message);
    }

    /**
     * @param index
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Index")
    public Integer getIndex() {
        return this.index;
    }

    /**
     * @param index
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteException withIndex(Integer index) {
        setIndex(index);
        return this;
    }

    /**
     * @param type
     * @see BatchWriteExceptionType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     * @see BatchWriteExceptionType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchWriteExceptionType
     */

    public BatchWriteException withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @param type
     * @see BatchWriteExceptionType
     */

    public void setType(BatchWriteExceptionType type) {
        withType(type);
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchWriteExceptionType
     */

    public BatchWriteException withType(BatchWriteExceptionType type) {
        this.type = type.toString();
        return this;
    }

}

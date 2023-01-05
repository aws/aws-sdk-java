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
package com.amazonaws.services.translate.model;

import javax.annotation.Generated;

/**
 * <p>
 * You have added too many tags to this resource. The maximum is 50 tags.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TooManyTagsException extends com.amazonaws.services.translate.model.AmazonTranslateException {
    private static final long serialVersionUID = 1L;

    private String resourceArn;

    /**
     * Constructs a new TooManyTagsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TooManyTagsException(String message) {
        super(message);
    }

    /**
     * @param resourceArn
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceArn")
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceArn")
    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * @param resourceArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TooManyTagsException withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

}

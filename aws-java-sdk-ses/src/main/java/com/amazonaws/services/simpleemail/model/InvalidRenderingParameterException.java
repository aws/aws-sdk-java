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
 * Indicates that one or more of the replacement values you provided is invalid. This error may occur when the
 * TemplateData object contains invalid JSON.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidRenderingParameterException extends com.amazonaws.services.simpleemail.model.AmazonSimpleEmailServiceException {
    private static final long serialVersionUID = 1L;

    private String templateName;

    /**
     * Constructs a new InvalidRenderingParameterException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidRenderingParameterException(String message) {
        super(message);
    }

    /**
     * @param templateName
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * @return
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @param templateName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRenderingParameterException withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

}

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
 * Indicates that a custom verification email template with the name you specified already exists.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomVerificationEmailTemplateAlreadyExistsException extends com.amazonaws.services.simpleemail.model.AmazonSimpleEmailServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Indicates that the provided custom verification email template with the specified template name already exists.
     * </p>
     */
    private String customVerificationEmailTemplateName;

    /**
     * Constructs a new CustomVerificationEmailTemplateAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public CustomVerificationEmailTemplateAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * <p>
     * Indicates that the provided custom verification email template with the specified template name already exists.
     * </p>
     * 
     * @param customVerificationEmailTemplateName
     *        Indicates that the provided custom verification email template with the specified template name already
     *        exists.
     */

    public void setCustomVerificationEmailTemplateName(String customVerificationEmailTemplateName) {
        this.customVerificationEmailTemplateName = customVerificationEmailTemplateName;
    }

    /**
     * <p>
     * Indicates that the provided custom verification email template with the specified template name already exists.
     * </p>
     * 
     * @return Indicates that the provided custom verification email template with the specified template name already
     *         exists.
     */

    public String getCustomVerificationEmailTemplateName() {
        return this.customVerificationEmailTemplateName;
    }

    /**
     * <p>
     * Indicates that the provided custom verification email template with the specified template name already exists.
     * </p>
     * 
     * @param customVerificationEmailTemplateName
     *        Indicates that the provided custom verification email template with the specified template name already
     *        exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomVerificationEmailTemplateAlreadyExistsException withCustomVerificationEmailTemplateName(String customVerificationEmailTemplateName) {
        setCustomVerificationEmailTemplateName(customVerificationEmailTemplateName);
        return this;
    }

}

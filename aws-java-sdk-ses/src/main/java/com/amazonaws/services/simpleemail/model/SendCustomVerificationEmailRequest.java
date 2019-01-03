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

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to send a custom verification email to a specified recipient.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendCustomVerificationEmail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendCustomVerificationEmailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The email address to verify.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The name of the custom verification email template to use when sending the verification email.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * Name of a configuration set to use when sending the verification email.
     * </p>
     */
    private String configurationSetName;

    /**
     * <p>
     * The email address to verify.
     * </p>
     * 
     * @param emailAddress
     *        The email address to verify.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address to verify.
     * </p>
     * 
     * @return The email address to verify.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address to verify.
     * </p>
     * 
     * @param emailAddress
     *        The email address to verify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCustomVerificationEmailRequest withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The name of the custom verification email template to use when sending the verification email.
     * </p>
     * 
     * @param templateName
     *        The name of the custom verification email template to use when sending the verification email.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the custom verification email template to use when sending the verification email.
     * </p>
     * 
     * @return The name of the custom verification email template to use when sending the verification email.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the custom verification email template to use when sending the verification email.
     * </p>
     * 
     * @param templateName
     *        The name of the custom verification email template to use when sending the verification email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCustomVerificationEmailRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * Name of a configuration set to use when sending the verification email.
     * </p>
     * 
     * @param configurationSetName
     *        Name of a configuration set to use when sending the verification email.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * Name of a configuration set to use when sending the verification email.
     * </p>
     * 
     * @return Name of a configuration set to use when sending the verification email.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * Name of a configuration set to use when sending the verification email.
     * </p>
     * 
     * @param configurationSetName
     *        Name of a configuration set to use when sending the verification email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCustomVerificationEmailRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendCustomVerificationEmailRequest == false)
            return false;
        SendCustomVerificationEmailRequest other = (SendCustomVerificationEmailRequest) obj;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        return hashCode;
    }

    @Override
    public SendCustomVerificationEmailRequest clone() {
        return (SendCustomVerificationEmailRequest) super.clone();
    }

}

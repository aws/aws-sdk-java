/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the status and settings of the email channel for an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EmailChannelRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailChannelRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration set that you want to apply to email that you send through the channel by using the <a
     * href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     * </p>
     */
    private String configurationSet;
    /**
     * <p>
     * Specifies whether to enable the email channel for the application.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The verified email address that you want to send email from when you send email through the channel.
     * </p>
     */
    private String fromAddress;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES), that you
     * want to use when you send email through the channel.
     * </p>
     */
    private String identity;
    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to use when it submits
     * email-related event data for the channel.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The configuration set that you want to apply to email that you send through the channel by using the <a
     * href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     * </p>
     * 
     * @param configurationSet
     *        The configuration set that you want to apply to email that you send through the channel by using the <a
     *        href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     */

    public void setConfigurationSet(String configurationSet) {
        this.configurationSet = configurationSet;
    }

    /**
     * <p>
     * The configuration set that you want to apply to email that you send through the channel by using the <a
     * href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     * </p>
     * 
     * @return The configuration set that you want to apply to email that you send through the channel by using the <a
     *         href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     */

    public String getConfigurationSet() {
        return this.configurationSet;
    }

    /**
     * <p>
     * The configuration set that you want to apply to email that you send through the channel by using the <a
     * href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     * </p>
     * 
     * @param configurationSet
     *        The configuration set that you want to apply to email that you send through the channel by using the <a
     *        href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelRequest withConfigurationSet(String configurationSet) {
        setConfigurationSet(configurationSet);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable the email channel for the application.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to enable the email channel for the application.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the email channel for the application.
     * </p>
     * 
     * @return Specifies whether to enable the email channel for the application.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the email channel for the application.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to enable the email channel for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable the email channel for the application.
     * </p>
     * 
     * @return Specifies whether to enable the email channel for the application.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The verified email address that you want to send email from when you send email through the channel.
     * </p>
     * 
     * @param fromAddress
     *        <p>
     *        The verified email address that you want to send email from when you send email through the channel.
     *        </p>
     */

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * <p>
     * The verified email address that you want to send email from when you send email through the channel.
     * </p>
     * 
     * @return <p>
     *         The verified email address that you want to send email from when you send email through the channel.
     *         </p>
     */

    public String getFromAddress() {
        return this.fromAddress;
    }

    /**
     * <p>
     * The verified email address that you want to send email from when you send email through the channel.
     * </p>
     * 
     * @param fromAddress
     *        <p>
     *        The verified email address that you want to send email from when you send email through the channel.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelRequest withFromAddress(String fromAddress) {
        setFromAddress(fromAddress);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES), that you
     * want to use when you send email through the channel.
     * </p>
     * 
     * @param identity
     *        <p>
     *        The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES),
     *        that you want to use when you send email through the channel.
     *        </p>
     */

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES), that you
     * want to use when you send email through the channel.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES),
     *         that you want to use when you send email through the channel.
     *         </p>
     */

    public String getIdentity() {
        return this.identity;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES), that you
     * want to use when you send email through the channel.
     * </p>
     * 
     * @param identity
     *        <p>
     *        The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES),
     *        that you want to use when you send email through the channel.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelRequest withIdentity(String identity) {
        setIdentity(identity);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to use when it submits
     * email-related event data for the channel.
     * </p>
     * 
     * @param roleArn
     *        <p>
     *        The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to use when it
     *        submits email-related event data for the channel.
     *        </p>
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to use when it submits
     * email-related event data for the channel.
     * </p>
     * 
     * @return <p>
     *         The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to use when it
     *         submits email-related event data for the channel.
     *         </p>
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to use when it submits
     * email-related event data for the channel.
     * </p>
     * 
     * @param roleArn
     *        <p>
     *        The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to use when it
     *        submits email-related event data for the channel.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getConfigurationSet() != null)
            sb.append("ConfigurationSet: ").append(getConfigurationSet()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getFromAddress() != null)
            sb.append("FromAddress: ").append(getFromAddress()).append(",");
        if (getIdentity() != null)
            sb.append("Identity: ").append(getIdentity()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailChannelRequest == false)
            return false;
        EmailChannelRequest other = (EmailChannelRequest) obj;
        if (other.getConfigurationSet() == null ^ this.getConfigurationSet() == null)
            return false;
        if (other.getConfigurationSet() != null && other.getConfigurationSet().equals(this.getConfigurationSet()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getFromAddress() == null ^ this.getFromAddress() == null)
            return false;
        if (other.getFromAddress() != null && other.getFromAddress().equals(this.getFromAddress()) == false)
            return false;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSet() == null) ? 0 : getConfigurationSet().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getFromAddress() == null) ? 0 : getFromAddress().hashCode());
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public EmailChannelRequest clone() {
        try {
            return (EmailChannelRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EmailChannelRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The SMS configuration type that includes the settings the Cognito User Pool needs to call for the Amazon SNS service
 * to send an SMS message from your AWS account. The Cognito User Pool makes the request to the Amazon SNS Service by
 * using an AWS IAM role that you provide for your AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SmsConfigurationType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SmsConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller. This is the ARN of the IAM
     * role in your AWS account which Cognito will use to send SMS messages.
     * </p>
     */
    private String snsCallerArn;
    /**
     * <p>
     * The external ID is a value that we recommend you use to add security to your IAM role which is used to call
     * Amazon SNS to send SMS messages for your user pool. If you provide an <code>ExternalId</code>, the Cognito User
     * Pool will include it when attempting to assume your IAM role, so that you can set your roles trust policy to
     * require the <code>ExternalID</code>. If you use the Cognito Management Console to create a role for SMS MFA,
     * Cognito will create a role with the required permissions and a trust policy that demonstrates use of the
     * <code>ExternalId</code>.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller. This is the ARN of the IAM
     * role in your AWS account which Cognito will use to send SMS messages.
     * </p>
     * 
     * @param snsCallerArn
     *        The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller. This is the ARN of
     *        the IAM role in your AWS account which Cognito will use to send SMS messages.
     */

    public void setSnsCallerArn(String snsCallerArn) {
        this.snsCallerArn = snsCallerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller. This is the ARN of the IAM
     * role in your AWS account which Cognito will use to send SMS messages.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller. This is the ARN of
     *         the IAM role in your AWS account which Cognito will use to send SMS messages.
     */

    public String getSnsCallerArn() {
        return this.snsCallerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller. This is the ARN of the IAM
     * role in your AWS account which Cognito will use to send SMS messages.
     * </p>
     * 
     * @param snsCallerArn
     *        The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller. This is the ARN of
     *        the IAM role in your AWS account which Cognito will use to send SMS messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SmsConfigurationType withSnsCallerArn(String snsCallerArn) {
        setSnsCallerArn(snsCallerArn);
        return this;
    }

    /**
     * <p>
     * The external ID is a value that we recommend you use to add security to your IAM role which is used to call
     * Amazon SNS to send SMS messages for your user pool. If you provide an <code>ExternalId</code>, the Cognito User
     * Pool will include it when attempting to assume your IAM role, so that you can set your roles trust policy to
     * require the <code>ExternalID</code>. If you use the Cognito Management Console to create a role for SMS MFA,
     * Cognito will create a role with the required permissions and a trust policy that demonstrates use of the
     * <code>ExternalId</code>.
     * </p>
     * 
     * @param externalId
     *        The external ID is a value that we recommend you use to add security to your IAM role which is used to
     *        call Amazon SNS to send SMS messages for your user pool. If you provide an <code>ExternalId</code>, the
     *        Cognito User Pool will include it when attempting to assume your IAM role, so that you can set your roles
     *        trust policy to require the <code>ExternalID</code>. If you use the Cognito Management Console to create a
     *        role for SMS MFA, Cognito will create a role with the required permissions and a trust policy that
     *        demonstrates use of the <code>ExternalId</code>.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID is a value that we recommend you use to add security to your IAM role which is used to call
     * Amazon SNS to send SMS messages for your user pool. If you provide an <code>ExternalId</code>, the Cognito User
     * Pool will include it when attempting to assume your IAM role, so that you can set your roles trust policy to
     * require the <code>ExternalID</code>. If you use the Cognito Management Console to create a role for SMS MFA,
     * Cognito will create a role with the required permissions and a trust policy that demonstrates use of the
     * <code>ExternalId</code>.
     * </p>
     * 
     * @return The external ID is a value that we recommend you use to add security to your IAM role which is used to
     *         call Amazon SNS to send SMS messages for your user pool. If you provide an <code>ExternalId</code>, the
     *         Cognito User Pool will include it when attempting to assume your IAM role, so that you can set your roles
     *         trust policy to require the <code>ExternalID</code>. If you use the Cognito Management Console to create
     *         a role for SMS MFA, Cognito will create a role with the required permissions and a trust policy that
     *         demonstrates use of the <code>ExternalId</code>.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external ID is a value that we recommend you use to add security to your IAM role which is used to call
     * Amazon SNS to send SMS messages for your user pool. If you provide an <code>ExternalId</code>, the Cognito User
     * Pool will include it when attempting to assume your IAM role, so that you can set your roles trust policy to
     * require the <code>ExternalID</code>. If you use the Cognito Management Console to create a role for SMS MFA,
     * Cognito will create a role with the required permissions and a trust policy that demonstrates use of the
     * <code>ExternalId</code>.
     * </p>
     * 
     * @param externalId
     *        The external ID is a value that we recommend you use to add security to your IAM role which is used to
     *        call Amazon SNS to send SMS messages for your user pool. If you provide an <code>ExternalId</code>, the
     *        Cognito User Pool will include it when attempting to assume your IAM role, so that you can set your roles
     *        trust policy to require the <code>ExternalID</code>. If you use the Cognito Management Console to create a
     *        role for SMS MFA, Cognito will create a role with the required permissions and a trust policy that
     *        demonstrates use of the <code>ExternalId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SmsConfigurationType withExternalId(String externalId) {
        setExternalId(externalId);
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
        if (getSnsCallerArn() != null)
            sb.append("SnsCallerArn: ").append(getSnsCallerArn()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SmsConfigurationType == false)
            return false;
        SmsConfigurationType other = (SmsConfigurationType) obj;
        if (other.getSnsCallerArn() == null ^ this.getSnsCallerArn() == null)
            return false;
        if (other.getSnsCallerArn() != null && other.getSnsCallerArn().equals(this.getSnsCallerArn()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnsCallerArn() == null) ? 0 : getSnsCallerArn().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public SmsConfigurationType clone() {
        try {
            return (SmsConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.SmsConfigurationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

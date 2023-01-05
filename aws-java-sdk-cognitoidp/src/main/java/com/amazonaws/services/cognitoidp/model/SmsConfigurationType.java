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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The SMS configuration type is the settings that your Amazon Cognito user pool must use to send an SMS message from
 * your Amazon Web Services account through Amazon Simple Notification Service. To send SMS messages with Amazon SNS in
 * the Amazon Web Services Region that you want, the Amazon Cognito user pool uses an Identity and Access Management
 * (IAM) role in your Amazon Web Services account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SmsConfigurationType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SmsConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS caller. This is the ARN of the IAM role in your Amazon Web
     * Services account that Amazon Cognito will use to send SMS messages. SMS messages are subject to a <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html"
     * >spending limit</a>.
     * </p>
     */
    private String snsCallerArn;
    /**
     * <p>
     * The external ID provides additional security for your IAM role. You can use an <code>ExternalId</code> with the
     * IAM role that you use with Amazon SNS to send SMS messages for your user pool. If you provide an
     * <code>ExternalId</code>, your Amazon Cognito user pool includes it in the request to assume your IAM role. You
     * can configure the role trust policy to require that Amazon Cognito, and any principal, provide the
     * <code>ExternalID</code>. If you use the Amazon Cognito Management Console to create a role for SMS multi-factor
     * authentication (MFA), Amazon Cognito creates a role with the required permissions and a trust policy that
     * demonstrates use of the <code>ExternalId</code>.
     * </p>
     * <p>
     * For more information about the <code>ExternalId</code> of a role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to use an
     * external ID when granting access to your Amazon Web Services resources to a third party</a>
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The Amazon Web Services Region to use with Amazon SNS integration. You can choose the same Region as your user
     * pool, or a supported <b>Legacy Amazon SNS alternate Region</b>.
     * </p>
     * <p>
     * Amazon Cognito resources in the Asia Pacific (Seoul) Amazon Web Services Region must use your Amazon SNS
     * configuration in the Asia Pacific (Tokyo) Region. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html">SMS message settings
     * for Amazon Cognito user pools</a>.
     * </p>
     */
    private String snsRegion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS caller. This is the ARN of the IAM role in your Amazon Web
     * Services account that Amazon Cognito will use to send SMS messages. SMS messages are subject to a <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html"
     * >spending limit</a>.
     * </p>
     * 
     * @param snsCallerArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS caller. This is the ARN of the IAM role in your Amazon
     *        Web Services account that Amazon Cognito will use to send SMS messages. SMS messages are subject to a <a
     *        href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html"
     *        >spending limit</a>.
     */

    public void setSnsCallerArn(String snsCallerArn) {
        this.snsCallerArn = snsCallerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS caller. This is the ARN of the IAM role in your Amazon Web
     * Services account that Amazon Cognito will use to send SMS messages. SMS messages are subject to a <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html"
     * >spending limit</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon SNS caller. This is the ARN of the IAM role in your Amazon
     *         Web Services account that Amazon Cognito will use to send SMS messages. SMS messages are subject to a <a
     *         href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html"
     *         >spending limit</a>.
     */

    public String getSnsCallerArn() {
        return this.snsCallerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS caller. This is the ARN of the IAM role in your Amazon Web
     * Services account that Amazon Cognito will use to send SMS messages. SMS messages are subject to a <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html"
     * >spending limit</a>.
     * </p>
     * 
     * @param snsCallerArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS caller. This is the ARN of the IAM role in your Amazon
     *        Web Services account that Amazon Cognito will use to send SMS messages. SMS messages are subject to a <a
     *        href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html"
     *        >spending limit</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SmsConfigurationType withSnsCallerArn(String snsCallerArn) {
        setSnsCallerArn(snsCallerArn);
        return this;
    }

    /**
     * <p>
     * The external ID provides additional security for your IAM role. You can use an <code>ExternalId</code> with the
     * IAM role that you use with Amazon SNS to send SMS messages for your user pool. If you provide an
     * <code>ExternalId</code>, your Amazon Cognito user pool includes it in the request to assume your IAM role. You
     * can configure the role trust policy to require that Amazon Cognito, and any principal, provide the
     * <code>ExternalID</code>. If you use the Amazon Cognito Management Console to create a role for SMS multi-factor
     * authentication (MFA), Amazon Cognito creates a role with the required permissions and a trust policy that
     * demonstrates use of the <code>ExternalId</code>.
     * </p>
     * <p>
     * For more information about the <code>ExternalId</code> of a role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to use an
     * external ID when granting access to your Amazon Web Services resources to a third party</a>
     * </p>
     * 
     * @param externalId
     *        The external ID provides additional security for your IAM role. You can use an <code>ExternalId</code>
     *        with the IAM role that you use with Amazon SNS to send SMS messages for your user pool. If you provide an
     *        <code>ExternalId</code>, your Amazon Cognito user pool includes it in the request to assume your IAM role.
     *        You can configure the role trust policy to require that Amazon Cognito, and any principal, provide the
     *        <code>ExternalID</code>. If you use the Amazon Cognito Management Console to create a role for SMS
     *        multi-factor authentication (MFA), Amazon Cognito creates a role with the required permissions and a trust
     *        policy that demonstrates use of the <code>ExternalId</code>.</p>
     *        <p>
     *        For more information about the <code>ExternalId</code> of a role, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to
     *        use an external ID when granting access to your Amazon Web Services resources to a third party</a>
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID provides additional security for your IAM role. You can use an <code>ExternalId</code> with the
     * IAM role that you use with Amazon SNS to send SMS messages for your user pool. If you provide an
     * <code>ExternalId</code>, your Amazon Cognito user pool includes it in the request to assume your IAM role. You
     * can configure the role trust policy to require that Amazon Cognito, and any principal, provide the
     * <code>ExternalID</code>. If you use the Amazon Cognito Management Console to create a role for SMS multi-factor
     * authentication (MFA), Amazon Cognito creates a role with the required permissions and a trust policy that
     * demonstrates use of the <code>ExternalId</code>.
     * </p>
     * <p>
     * For more information about the <code>ExternalId</code> of a role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to use an
     * external ID when granting access to your Amazon Web Services resources to a third party</a>
     * </p>
     * 
     * @return The external ID provides additional security for your IAM role. You can use an <code>ExternalId</code>
     *         with the IAM role that you use with Amazon SNS to send SMS messages for your user pool. If you provide an
     *         <code>ExternalId</code>, your Amazon Cognito user pool includes it in the request to assume your IAM
     *         role. You can configure the role trust policy to require that Amazon Cognito, and any principal, provide
     *         the <code>ExternalID</code>. If you use the Amazon Cognito Management Console to create a role for SMS
     *         multi-factor authentication (MFA), Amazon Cognito creates a role with the required permissions and a
     *         trust policy that demonstrates use of the <code>ExternalId</code>.</p>
     *         <p>
     *         For more information about the <code>ExternalId</code> of a role, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to
     *         use an external ID when granting access to your Amazon Web Services resources to a third party</a>
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external ID provides additional security for your IAM role. You can use an <code>ExternalId</code> with the
     * IAM role that you use with Amazon SNS to send SMS messages for your user pool. If you provide an
     * <code>ExternalId</code>, your Amazon Cognito user pool includes it in the request to assume your IAM role. You
     * can configure the role trust policy to require that Amazon Cognito, and any principal, provide the
     * <code>ExternalID</code>. If you use the Amazon Cognito Management Console to create a role for SMS multi-factor
     * authentication (MFA), Amazon Cognito creates a role with the required permissions and a trust policy that
     * demonstrates use of the <code>ExternalId</code>.
     * </p>
     * <p>
     * For more information about the <code>ExternalId</code> of a role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to use an
     * external ID when granting access to your Amazon Web Services resources to a third party</a>
     * </p>
     * 
     * @param externalId
     *        The external ID provides additional security for your IAM role. You can use an <code>ExternalId</code>
     *        with the IAM role that you use with Amazon SNS to send SMS messages for your user pool. If you provide an
     *        <code>ExternalId</code>, your Amazon Cognito user pool includes it in the request to assume your IAM role.
     *        You can configure the role trust policy to require that Amazon Cognito, and any principal, provide the
     *        <code>ExternalID</code>. If you use the Amazon Cognito Management Console to create a role for SMS
     *        multi-factor authentication (MFA), Amazon Cognito creates a role with the required permissions and a trust
     *        policy that demonstrates use of the <code>ExternalId</code>.</p>
     *        <p>
     *        For more information about the <code>ExternalId</code> of a role, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to
     *        use an external ID when granting access to your Amazon Web Services resources to a third party</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SmsConfigurationType withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region to use with Amazon SNS integration. You can choose the same Region as your user
     * pool, or a supported <b>Legacy Amazon SNS alternate Region</b>.
     * </p>
     * <p>
     * Amazon Cognito resources in the Asia Pacific (Seoul) Amazon Web Services Region must use your Amazon SNS
     * configuration in the Asia Pacific (Tokyo) Region. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html">SMS message settings
     * for Amazon Cognito user pools</a>.
     * </p>
     * 
     * @param snsRegion
     *        The Amazon Web Services Region to use with Amazon SNS integration. You can choose the same Region as your
     *        user pool, or a supported <b>Legacy Amazon SNS alternate Region</b>. </p>
     *        <p>
     *        Amazon Cognito resources in the Asia Pacific (Seoul) Amazon Web Services Region must use your Amazon SNS
     *        configuration in the Asia Pacific (Tokyo) Region. For more information, see <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html">SMS message
     *        settings for Amazon Cognito user pools</a>.
     */

    public void setSnsRegion(String snsRegion) {
        this.snsRegion = snsRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region to use with Amazon SNS integration. You can choose the same Region as your user
     * pool, or a supported <b>Legacy Amazon SNS alternate Region</b>.
     * </p>
     * <p>
     * Amazon Cognito resources in the Asia Pacific (Seoul) Amazon Web Services Region must use your Amazon SNS
     * configuration in the Asia Pacific (Tokyo) Region. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html">SMS message settings
     * for Amazon Cognito user pools</a>.
     * </p>
     * 
     * @return The Amazon Web Services Region to use with Amazon SNS integration. You can choose the same Region as your
     *         user pool, or a supported <b>Legacy Amazon SNS alternate Region</b>. </p>
     *         <p>
     *         Amazon Cognito resources in the Asia Pacific (Seoul) Amazon Web Services Region must use your Amazon SNS
     *         configuration in the Asia Pacific (Tokyo) Region. For more information, see <a
     *         href="https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html">SMS message
     *         settings for Amazon Cognito user pools</a>.
     */

    public String getSnsRegion() {
        return this.snsRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region to use with Amazon SNS integration. You can choose the same Region as your user
     * pool, or a supported <b>Legacy Amazon SNS alternate Region</b>.
     * </p>
     * <p>
     * Amazon Cognito resources in the Asia Pacific (Seoul) Amazon Web Services Region must use your Amazon SNS
     * configuration in the Asia Pacific (Tokyo) Region. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html">SMS message settings
     * for Amazon Cognito user pools</a>.
     * </p>
     * 
     * @param snsRegion
     *        The Amazon Web Services Region to use with Amazon SNS integration. You can choose the same Region as your
     *        user pool, or a supported <b>Legacy Amazon SNS alternate Region</b>. </p>
     *        <p>
     *        Amazon Cognito resources in the Asia Pacific (Seoul) Amazon Web Services Region must use your Amazon SNS
     *        configuration in the Asia Pacific (Tokyo) Region. For more information, see <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html">SMS message
     *        settings for Amazon Cognito user pools</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SmsConfigurationType withSnsRegion(String snsRegion) {
        setSnsRegion(snsRegion);
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
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getSnsRegion() != null)
            sb.append("SnsRegion: ").append(getSnsRegion());
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
        if (other.getSnsRegion() == null ^ this.getSnsRegion() == null)
            return false;
        if (other.getSnsRegion() != null && other.getSnsRegion().equals(this.getSnsRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnsCallerArn() == null) ? 0 : getSnsCallerArn().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getSnsRegion() == null) ? 0 : getSnsRegion().hashCode());
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

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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to update the user pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserPool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserPoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool you want to update.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * A container with the policies you want to update in a user pool.
     * </p>
     */
    private UserPoolPolicyType policies;
    /**
     * <p>
     * When active, <code>DeletionProtection</code> prevents accidental deletion of your user pool. Before you can
     * delete a user pool that you have protected against deletion, you must deactivate this feature.
     * </p>
     * <p>
     * When you try to delete a protected user pool in a <code>DeleteUserPool</code> API request, Amazon Cognito returns
     * an <code>InvalidParameterException</code> error. To delete a protected user pool, send a new
     * <code>DeleteUserPool</code> request after you deactivate deletion protection in an <code>UpdateUserPool</code>
     * API request.
     * </p>
     */
    private String deletionProtection;
    /**
     * <p>
     * The Lambda configuration information from the request to update the user pool.
     * </p>
     */
    private LambdaConfigType lambdaConfig;
    /**
     * <p>
     * The attributes that are automatically verified when Amazon Cognito requests to update user pools.
     * </p>
     */
    private java.util.List<String> autoVerifiedAttributes;
    /**
     * <p>
     * This parameter is no longer used. See <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     * >VerificationMessageTemplateType</a>.
     * </p>
     */
    private String smsVerificationMessage;
    /**
     * <p>
     * This parameter is no longer used. See <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     * >VerificationMessageTemplateType</a>.
     * </p>
     */
    private String emailVerificationMessage;
    /**
     * <p>
     * This parameter is no longer used. See <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     * >VerificationMessageTemplateType</a>.
     * </p>
     */
    private String emailVerificationSubject;
    /**
     * <p>
     * The template for verification messages.
     * </p>
     */
    private VerificationMessageTemplateType verificationMessageTemplate;
    /**
     * <p>
     * The contents of the SMS authentication message.
     * </p>
     */
    private String smsAuthenticationMessage;
    /**
     * <p>
     * The settings for updates to user attributes. These settings include the property
     * <code>AttributesRequireVerificationBeforeUpdate</code>, a user-pool setting that tells Amazon Cognito how to
     * handle changes to the value of your users' email address and phone number attributes. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates"
     * > Verifying updates to email addresses and phone numbers</a>.
     * </p>
     */
    private UserAttributeUpdateSettingsType userAttributeUpdateSettings;
    /**
     * <p>
     * Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens aren't required and can't be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify ON when you're
     * initially creating a user pool. You can use the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     * >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing user pools.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     * </p>
     * </li>
     * </ul>
     */
    private String mfaConfiguration;
    /**
     * <p>
     * The device-remembering configuration for a user pool. A null value indicates that you have deactivated device
     * remembering in your user pool.
     * </p>
     * <note>
     * <p>
     * When you provide a value for any <code>DeviceConfiguration</code> field, you activate the Amazon Cognito
     * device-remembering feature.
     * </p>
     * </note>
     */
    private DeviceConfigurationType deviceConfiguration;
    /**
     * <p>
     * The email configuration of your user pool. The email configuration type sets your preferred sending method,
     * Amazon Web Services Region, and sender for email invitation and verification messages from your user pool.
     * </p>
     */
    private EmailConfigurationType emailConfiguration;
    /**
     * <p>
     * The SMS configuration with the settings that your Amazon Cognito user pool must use to send an SMS message from
     * your Amazon Web Services account through Amazon Simple Notification Service. To send SMS messages with Amazon SNS
     * in the Amazon Web Services Region that you want, the Amazon Cognito user pool uses an Identity and Access
     * Management (IAM) role in your Amazon Web Services account.
     * </p>
     */
    private SmsConfigurationType smsConfiguration;
    /**
     * <p>
     * The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and manage
     * user pools in different ways, such as by purpose, owner, environment, or other criteria.
     * </p>
     */
    private java.util.Map<String, String> userPoolTags;
    /**
     * <p>
     * The configuration for <code>AdminCreateUser</code> requests.
     * </p>
     */
    private AdminCreateUserConfigType adminCreateUserConfig;
    /**
     * <p>
     * Enables advanced security risk detection. Set the key <code>AdvancedSecurityMode</code> to the value "AUDIT".
     * </p>
     */
    private UserPoolAddOnsType userPoolAddOns;
    /**
     * <p>
     * The available verified method a user can use to recover their password when they call <code>ForgotPassword</code>
     * . You can use this setting to define a preferred method when a user has more than one method available. With this
     * setting, SMS doesn't qualify for a valid password recovery mechanism if the user also has SMS multi-factor
     * authentication (MFA) activated. In the absence of this setting, Amazon Cognito uses the legacy behavior to
     * determine the recovery method where SMS is preferred through email.
     * </p>
     */
    private AccountRecoverySettingType accountRecoverySetting;

    /**
     * <p>
     * The user pool ID for the user pool you want to update.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool you want to update.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool you want to update.
     * </p>
     * 
     * @return The user pool ID for the user pool you want to update.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool you want to update.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * A container with the policies you want to update in a user pool.
     * </p>
     * 
     * @param policies
     *        A container with the policies you want to update in a user pool.
     */

    public void setPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
    }

    /**
     * <p>
     * A container with the policies you want to update in a user pool.
     * </p>
     * 
     * @return A container with the policies you want to update in a user pool.
     */

    public UserPoolPolicyType getPolicies() {
        return this.policies;
    }

    /**
     * <p>
     * A container with the policies you want to update in a user pool.
     * </p>
     * 
     * @param policies
     *        A container with the policies you want to update in a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withPolicies(UserPoolPolicyType policies) {
        setPolicies(policies);
        return this;
    }

    /**
     * <p>
     * When active, <code>DeletionProtection</code> prevents accidental deletion of your user pool. Before you can
     * delete a user pool that you have protected against deletion, you must deactivate this feature.
     * </p>
     * <p>
     * When you try to delete a protected user pool in a <code>DeleteUserPool</code> API request, Amazon Cognito returns
     * an <code>InvalidParameterException</code> error. To delete a protected user pool, send a new
     * <code>DeleteUserPool</code> request after you deactivate deletion protection in an <code>UpdateUserPool</code>
     * API request.
     * </p>
     * 
     * @param deletionProtection
     *        When active, <code>DeletionProtection</code> prevents accidental deletion of your user pool. Before you
     *        can delete a user pool that you have protected against deletion, you must deactivate this feature.</p>
     *        <p>
     *        When you try to delete a protected user pool in a <code>DeleteUserPool</code> API request, Amazon Cognito
     *        returns an <code>InvalidParameterException</code> error. To delete a protected user pool, send a new
     *        <code>DeleteUserPool</code> request after you deactivate deletion protection in an
     *        <code>UpdateUserPool</code> API request.
     * @see DeletionProtectionType
     */

    public void setDeletionProtection(String deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * When active, <code>DeletionProtection</code> prevents accidental deletion of your user pool. Before you can
     * delete a user pool that you have protected against deletion, you must deactivate this feature.
     * </p>
     * <p>
     * When you try to delete a protected user pool in a <code>DeleteUserPool</code> API request, Amazon Cognito returns
     * an <code>InvalidParameterException</code> error. To delete a protected user pool, send a new
     * <code>DeleteUserPool</code> request after you deactivate deletion protection in an <code>UpdateUserPool</code>
     * API request.
     * </p>
     * 
     * @return When active, <code>DeletionProtection</code> prevents accidental deletion of your user pool. Before you
     *         can delete a user pool that you have protected against deletion, you must deactivate this feature.</p>
     *         <p>
     *         When you try to delete a protected user pool in a <code>DeleteUserPool</code> API request, Amazon Cognito
     *         returns an <code>InvalidParameterException</code> error. To delete a protected user pool, send a new
     *         <code>DeleteUserPool</code> request after you deactivate deletion protection in an
     *         <code>UpdateUserPool</code> API request.
     * @see DeletionProtectionType
     */

    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * When active, <code>DeletionProtection</code> prevents accidental deletion of your user pool. Before you can
     * delete a user pool that you have protected against deletion, you must deactivate this feature.
     * </p>
     * <p>
     * When you try to delete a protected user pool in a <code>DeleteUserPool</code> API request, Amazon Cognito returns
     * an <code>InvalidParameterException</code> error. To delete a protected user pool, send a new
     * <code>DeleteUserPool</code> request after you deactivate deletion protection in an <code>UpdateUserPool</code>
     * API request.
     * </p>
     * 
     * @param deletionProtection
     *        When active, <code>DeletionProtection</code> prevents accidental deletion of your user pool. Before you
     *        can delete a user pool that you have protected against deletion, you must deactivate this feature.</p>
     *        <p>
     *        When you try to delete a protected user pool in a <code>DeleteUserPool</code> API request, Amazon Cognito
     *        returns an <code>InvalidParameterException</code> error. To delete a protected user pool, send a new
     *        <code>DeleteUserPool</code> request after you deactivate deletion protection in an
     *        <code>UpdateUserPool</code> API request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeletionProtectionType
     */

    public UpdateUserPoolRequest withDeletionProtection(String deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * When active, <code>DeletionProtection</code> prevents accidental deletion of your user pool. Before you can
     * delete a user pool that you have protected against deletion, you must deactivate this feature.
     * </p>
     * <p>
     * When you try to delete a protected user pool in a <code>DeleteUserPool</code> API request, Amazon Cognito returns
     * an <code>InvalidParameterException</code> error. To delete a protected user pool, send a new
     * <code>DeleteUserPool</code> request after you deactivate deletion protection in an <code>UpdateUserPool</code>
     * API request.
     * </p>
     * 
     * @param deletionProtection
     *        When active, <code>DeletionProtection</code> prevents accidental deletion of your user pool. Before you
     *        can delete a user pool that you have protected against deletion, you must deactivate this feature.</p>
     *        <p>
     *        When you try to delete a protected user pool in a <code>DeleteUserPool</code> API request, Amazon Cognito
     *        returns an <code>InvalidParameterException</code> error. To delete a protected user pool, send a new
     *        <code>DeleteUserPool</code> request after you deactivate deletion protection in an
     *        <code>UpdateUserPool</code> API request.
     * @see DeletionProtectionType
     */

    public void setDeletionProtection(DeletionProtectionType deletionProtection) {
        withDeletionProtection(deletionProtection);
    }

    /**
     * <p>
     * When active, <code>DeletionProtection</code> prevents accidental deletion of your user pool. Before you can
     * delete a user pool that you have protected against deletion, you must deactivate this feature.
     * </p>
     * <p>
     * When you try to delete a protected user pool in a <code>DeleteUserPool</code> API request, Amazon Cognito returns
     * an <code>InvalidParameterException</code> error. To delete a protected user pool, send a new
     * <code>DeleteUserPool</code> request after you deactivate deletion protection in an <code>UpdateUserPool</code>
     * API request.
     * </p>
     * 
     * @param deletionProtection
     *        When active, <code>DeletionProtection</code> prevents accidental deletion of your user pool. Before you
     *        can delete a user pool that you have protected against deletion, you must deactivate this feature.</p>
     *        <p>
     *        When you try to delete a protected user pool in a <code>DeleteUserPool</code> API request, Amazon Cognito
     *        returns an <code>InvalidParameterException</code> error. To delete a protected user pool, send a new
     *        <code>DeleteUserPool</code> request after you deactivate deletion protection in an
     *        <code>UpdateUserPool</code> API request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeletionProtectionType
     */

    public UpdateUserPoolRequest withDeletionProtection(DeletionProtectionType deletionProtection) {
        this.deletionProtection = deletionProtection.toString();
        return this;
    }

    /**
     * <p>
     * The Lambda configuration information from the request to update the user pool.
     * </p>
     * 
     * @param lambdaConfig
     *        The Lambda configuration information from the request to update the user pool.
     */

    public void setLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    /**
     * <p>
     * The Lambda configuration information from the request to update the user pool.
     * </p>
     * 
     * @return The Lambda configuration information from the request to update the user pool.
     */

    public LambdaConfigType getLambdaConfig() {
        return this.lambdaConfig;
    }

    /**
     * <p>
     * The Lambda configuration information from the request to update the user pool.
     * </p>
     * 
     * @param lambdaConfig
     *        The Lambda configuration information from the request to update the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withLambdaConfig(LambdaConfigType lambdaConfig) {
        setLambdaConfig(lambdaConfig);
        return this;
    }

    /**
     * <p>
     * The attributes that are automatically verified when Amazon Cognito requests to update user pools.
     * </p>
     * 
     * @return The attributes that are automatically verified when Amazon Cognito requests to update user pools.
     * @see VerifiedAttributeType
     */

    public java.util.List<String> getAutoVerifiedAttributes() {
        return autoVerifiedAttributes;
    }

    /**
     * <p>
     * The attributes that are automatically verified when Amazon Cognito requests to update user pools.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        The attributes that are automatically verified when Amazon Cognito requests to update user pools.
     * @see VerifiedAttributeType
     */

    public void setAutoVerifiedAttributes(java.util.Collection<String> autoVerifiedAttributes) {
        if (autoVerifiedAttributes == null) {
            this.autoVerifiedAttributes = null;
            return;
        }

        this.autoVerifiedAttributes = new java.util.ArrayList<String>(autoVerifiedAttributes);
    }

    /**
     * <p>
     * The attributes that are automatically verified when Amazon Cognito requests to update user pools.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoVerifiedAttributes(java.util.Collection)} or
     * {@link #withAutoVerifiedAttributes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        The attributes that are automatically verified when Amazon Cognito requests to update user pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAttributeType
     */

    public UpdateUserPoolRequest withAutoVerifiedAttributes(String... autoVerifiedAttributes) {
        if (this.autoVerifiedAttributes == null) {
            setAutoVerifiedAttributes(new java.util.ArrayList<String>(autoVerifiedAttributes.length));
        }
        for (String ele : autoVerifiedAttributes) {
            this.autoVerifiedAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes that are automatically verified when Amazon Cognito requests to update user pools.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        The attributes that are automatically verified when Amazon Cognito requests to update user pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAttributeType
     */

    public UpdateUserPoolRequest withAutoVerifiedAttributes(java.util.Collection<String> autoVerifiedAttributes) {
        setAutoVerifiedAttributes(autoVerifiedAttributes);
        return this;
    }

    /**
     * <p>
     * The attributes that are automatically verified when Amazon Cognito requests to update user pools.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        The attributes that are automatically verified when Amazon Cognito requests to update user pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAttributeType
     */

    public UpdateUserPoolRequest withAutoVerifiedAttributes(VerifiedAttributeType... autoVerifiedAttributes) {
        java.util.ArrayList<String> autoVerifiedAttributesCopy = new java.util.ArrayList<String>(autoVerifiedAttributes.length);
        for (VerifiedAttributeType value : autoVerifiedAttributes) {
            autoVerifiedAttributesCopy.add(value.toString());
        }
        if (getAutoVerifiedAttributes() == null) {
            setAutoVerifiedAttributes(autoVerifiedAttributesCopy);
        } else {
            getAutoVerifiedAttributes().addAll(autoVerifiedAttributesCopy);
        }
        return this;
    }

    /**
     * <p>
     * This parameter is no longer used. See <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     * >VerificationMessageTemplateType</a>.
     * </p>
     * 
     * @param smsVerificationMessage
     *        This parameter is no longer used. See <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     *        >VerificationMessageTemplateType</a>.
     */

    public void setSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
    }

    /**
     * <p>
     * This parameter is no longer used. See <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     * >VerificationMessageTemplateType</a>.
     * </p>
     * 
     * @return This parameter is no longer used. See <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     *         >VerificationMessageTemplateType</a>.
     */

    public String getSmsVerificationMessage() {
        return this.smsVerificationMessage;
    }

    /**
     * <p>
     * This parameter is no longer used. See <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     * >VerificationMessageTemplateType</a>.
     * </p>
     * 
     * @param smsVerificationMessage
     *        This parameter is no longer used. See <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     *        >VerificationMessageTemplateType</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withSmsVerificationMessage(String smsVerificationMessage) {
        setSmsVerificationMessage(smsVerificationMessage);
        return this;
    }

    /**
     * <p>
     * This parameter is no longer used. See <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     * >VerificationMessageTemplateType</a>.
     * </p>
     * 
     * @param emailVerificationMessage
     *        This parameter is no longer used. See <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     *        >VerificationMessageTemplateType</a>.
     */

    public void setEmailVerificationMessage(String emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
    }

    /**
     * <p>
     * This parameter is no longer used. See <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     * >VerificationMessageTemplateType</a>.
     * </p>
     * 
     * @return This parameter is no longer used. See <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     *         >VerificationMessageTemplateType</a>.
     */

    public String getEmailVerificationMessage() {
        return this.emailVerificationMessage;
    }

    /**
     * <p>
     * This parameter is no longer used. See <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     * >VerificationMessageTemplateType</a>.
     * </p>
     * 
     * @param emailVerificationMessage
     *        This parameter is no longer used. See <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     *        >VerificationMessageTemplateType</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withEmailVerificationMessage(String emailVerificationMessage) {
        setEmailVerificationMessage(emailVerificationMessage);
        return this;
    }

    /**
     * <p>
     * This parameter is no longer used. See <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     * >VerificationMessageTemplateType</a>.
     * </p>
     * 
     * @param emailVerificationSubject
     *        This parameter is no longer used. See <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     *        >VerificationMessageTemplateType</a>.
     */

    public void setEmailVerificationSubject(String emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
    }

    /**
     * <p>
     * This parameter is no longer used. See <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     * >VerificationMessageTemplateType</a>.
     * </p>
     * 
     * @return This parameter is no longer used. See <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     *         >VerificationMessageTemplateType</a>.
     */

    public String getEmailVerificationSubject() {
        return this.emailVerificationSubject;
    }

    /**
     * <p>
     * This parameter is no longer used. See <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     * >VerificationMessageTemplateType</a>.
     * </p>
     * 
     * @param emailVerificationSubject
     *        This parameter is no longer used. See <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerificationMessageTemplateType.html"
     *        >VerificationMessageTemplateType</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withEmailVerificationSubject(String emailVerificationSubject) {
        setEmailVerificationSubject(emailVerificationSubject);
        return this;
    }

    /**
     * <p>
     * The template for verification messages.
     * </p>
     * 
     * @param verificationMessageTemplate
     *        The template for verification messages.
     */

    public void setVerificationMessageTemplate(VerificationMessageTemplateType verificationMessageTemplate) {
        this.verificationMessageTemplate = verificationMessageTemplate;
    }

    /**
     * <p>
     * The template for verification messages.
     * </p>
     * 
     * @return The template for verification messages.
     */

    public VerificationMessageTemplateType getVerificationMessageTemplate() {
        return this.verificationMessageTemplate;
    }

    /**
     * <p>
     * The template for verification messages.
     * </p>
     * 
     * @param verificationMessageTemplate
     *        The template for verification messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withVerificationMessageTemplate(VerificationMessageTemplateType verificationMessageTemplate) {
        setVerificationMessageTemplate(verificationMessageTemplate);
        return this;
    }

    /**
     * <p>
     * The contents of the SMS authentication message.
     * </p>
     * 
     * @param smsAuthenticationMessage
     *        The contents of the SMS authentication message.
     */

    public void setSmsAuthenticationMessage(String smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
    }

    /**
     * <p>
     * The contents of the SMS authentication message.
     * </p>
     * 
     * @return The contents of the SMS authentication message.
     */

    public String getSmsAuthenticationMessage() {
        return this.smsAuthenticationMessage;
    }

    /**
     * <p>
     * The contents of the SMS authentication message.
     * </p>
     * 
     * @param smsAuthenticationMessage
     *        The contents of the SMS authentication message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withSmsAuthenticationMessage(String smsAuthenticationMessage) {
        setSmsAuthenticationMessage(smsAuthenticationMessage);
        return this;
    }

    /**
     * <p>
     * The settings for updates to user attributes. These settings include the property
     * <code>AttributesRequireVerificationBeforeUpdate</code>, a user-pool setting that tells Amazon Cognito how to
     * handle changes to the value of your users' email address and phone number attributes. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates"
     * > Verifying updates to email addresses and phone numbers</a>.
     * </p>
     * 
     * @param userAttributeUpdateSettings
     *        The settings for updates to user attributes. These settings include the property
     *        <code>AttributesRequireVerificationBeforeUpdate</code>, a user-pool setting that tells Amazon Cognito how
     *        to handle changes to the value of your users' email address and phone number attributes. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates"
     *        > Verifying updates to email addresses and phone numbers</a>.
     */

    public void setUserAttributeUpdateSettings(UserAttributeUpdateSettingsType userAttributeUpdateSettings) {
        this.userAttributeUpdateSettings = userAttributeUpdateSettings;
    }

    /**
     * <p>
     * The settings for updates to user attributes. These settings include the property
     * <code>AttributesRequireVerificationBeforeUpdate</code>, a user-pool setting that tells Amazon Cognito how to
     * handle changes to the value of your users' email address and phone number attributes. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates"
     * > Verifying updates to email addresses and phone numbers</a>.
     * </p>
     * 
     * @return The settings for updates to user attributes. These settings include the property
     *         <code>AttributesRequireVerificationBeforeUpdate</code>, a user-pool setting that tells Amazon Cognito how
     *         to handle changes to the value of your users' email address and phone number attributes. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates"
     *         > Verifying updates to email addresses and phone numbers</a>.
     */

    public UserAttributeUpdateSettingsType getUserAttributeUpdateSettings() {
        return this.userAttributeUpdateSettings;
    }

    /**
     * <p>
     * The settings for updates to user attributes. These settings include the property
     * <code>AttributesRequireVerificationBeforeUpdate</code>, a user-pool setting that tells Amazon Cognito how to
     * handle changes to the value of your users' email address and phone number attributes. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates"
     * > Verifying updates to email addresses and phone numbers</a>.
     * </p>
     * 
     * @param userAttributeUpdateSettings
     *        The settings for updates to user attributes. These settings include the property
     *        <code>AttributesRequireVerificationBeforeUpdate</code>, a user-pool setting that tells Amazon Cognito how
     *        to handle changes to the value of your users' email address and phone number attributes. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates"
     *        > Verifying updates to email addresses and phone numbers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withUserAttributeUpdateSettings(UserAttributeUpdateSettingsType userAttributeUpdateSettings) {
        setUserAttributeUpdateSettings(userAttributeUpdateSettings);
        return this;
    }

    /**
     * <p>
     * Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens aren't required and can't be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify ON when you're
     * initially creating a user pool. You can use the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     * >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing user pools.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mfaConfiguration
     *        Possible values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OFF</code> - MFA tokens aren't required and can't be specified during user registration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON</code> - MFA tokens are required for all user registrations. You can only specify ON when you're
     *        initially creating a user pool. You can use the <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     *        >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing user pools.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     *        </p>
     *        </li>
     * @see UserPoolMfaType
     */

    public void setMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
    }

    /**
     * <p>
     * Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens aren't required and can't be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify ON when you're
     * initially creating a user pool. You can use the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     * >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing user pools.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Possible values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>OFF</code> - MFA tokens aren't required and can't be specified during user registration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ON</code> - MFA tokens are required for all user registrations. You can only specify ON when you're
     *         initially creating a user pool. You can use the <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     *         >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing user pools.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     *         </p>
     *         </li>
     * @see UserPoolMfaType
     */

    public String getMfaConfiguration() {
        return this.mfaConfiguration;
    }

    /**
     * <p>
     * Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens aren't required and can't be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify ON when you're
     * initially creating a user pool. You can use the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     * >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing user pools.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mfaConfiguration
     *        Possible values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OFF</code> - MFA tokens aren't required and can't be specified during user registration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON</code> - MFA tokens are required for all user registrations. You can only specify ON when you're
     *        initially creating a user pool. You can use the <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     *        >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing user pools.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserPoolMfaType
     */

    public UpdateUserPoolRequest withMfaConfiguration(String mfaConfiguration) {
        setMfaConfiguration(mfaConfiguration);
        return this;
    }

    /**
     * <p>
     * Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens aren't required and can't be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify ON when you're
     * initially creating a user pool. You can use the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     * >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing user pools.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mfaConfiguration
     *        Possible values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OFF</code> - MFA tokens aren't required and can't be specified during user registration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON</code> - MFA tokens are required for all user registrations. You can only specify ON when you're
     *        initially creating a user pool. You can use the <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     *        >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing user pools.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     *        </p>
     *        </li>
     * @see UserPoolMfaType
     */

    public void setMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        withMfaConfiguration(mfaConfiguration);
    }

    /**
     * <p>
     * Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens aren't required and can't be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify ON when you're
     * initially creating a user pool. You can use the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     * >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing user pools.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mfaConfiguration
     *        Possible values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OFF</code> - MFA tokens aren't required and can't be specified during user registration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON</code> - MFA tokens are required for all user registrations. You can only specify ON when you're
     *        initially creating a user pool. You can use the <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     *        >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing user pools.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserPoolMfaType
     */

    public UpdateUserPoolRequest withMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
        return this;
    }

    /**
     * <p>
     * The device-remembering configuration for a user pool. A null value indicates that you have deactivated device
     * remembering in your user pool.
     * </p>
     * <note>
     * <p>
     * When you provide a value for any <code>DeviceConfiguration</code> field, you activate the Amazon Cognito
     * device-remembering feature.
     * </p>
     * </note>
     * 
     * @param deviceConfiguration
     *        The device-remembering configuration for a user pool. A null value indicates that you have deactivated
     *        device remembering in your user pool.</p> <note>
     *        <p>
     *        When you provide a value for any <code>DeviceConfiguration</code> field, you activate the Amazon Cognito
     *        device-remembering feature.
     *        </p>
     */

    public void setDeviceConfiguration(DeviceConfigurationType deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
    }

    /**
     * <p>
     * The device-remembering configuration for a user pool. A null value indicates that you have deactivated device
     * remembering in your user pool.
     * </p>
     * <note>
     * <p>
     * When you provide a value for any <code>DeviceConfiguration</code> field, you activate the Amazon Cognito
     * device-remembering feature.
     * </p>
     * </note>
     * 
     * @return The device-remembering configuration for a user pool. A null value indicates that you have deactivated
     *         device remembering in your user pool.</p> <note>
     *         <p>
     *         When you provide a value for any <code>DeviceConfiguration</code> field, you activate the Amazon Cognito
     *         device-remembering feature.
     *         </p>
     */

    public DeviceConfigurationType getDeviceConfiguration() {
        return this.deviceConfiguration;
    }

    /**
     * <p>
     * The device-remembering configuration for a user pool. A null value indicates that you have deactivated device
     * remembering in your user pool.
     * </p>
     * <note>
     * <p>
     * When you provide a value for any <code>DeviceConfiguration</code> field, you activate the Amazon Cognito
     * device-remembering feature.
     * </p>
     * </note>
     * 
     * @param deviceConfiguration
     *        The device-remembering configuration for a user pool. A null value indicates that you have deactivated
     *        device remembering in your user pool.</p> <note>
     *        <p>
     *        When you provide a value for any <code>DeviceConfiguration</code> field, you activate the Amazon Cognito
     *        device-remembering feature.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withDeviceConfiguration(DeviceConfigurationType deviceConfiguration) {
        setDeviceConfiguration(deviceConfiguration);
        return this;
    }

    /**
     * <p>
     * The email configuration of your user pool. The email configuration type sets your preferred sending method,
     * Amazon Web Services Region, and sender for email invitation and verification messages from your user pool.
     * </p>
     * 
     * @param emailConfiguration
     *        The email configuration of your user pool. The email configuration type sets your preferred sending
     *        method, Amazon Web Services Region, and sender for email invitation and verification messages from your
     *        user pool.
     */

    public void setEmailConfiguration(EmailConfigurationType emailConfiguration) {
        this.emailConfiguration = emailConfiguration;
    }

    /**
     * <p>
     * The email configuration of your user pool. The email configuration type sets your preferred sending method,
     * Amazon Web Services Region, and sender for email invitation and verification messages from your user pool.
     * </p>
     * 
     * @return The email configuration of your user pool. The email configuration type sets your preferred sending
     *         method, Amazon Web Services Region, and sender for email invitation and verification messages from your
     *         user pool.
     */

    public EmailConfigurationType getEmailConfiguration() {
        return this.emailConfiguration;
    }

    /**
     * <p>
     * The email configuration of your user pool. The email configuration type sets your preferred sending method,
     * Amazon Web Services Region, and sender for email invitation and verification messages from your user pool.
     * </p>
     * 
     * @param emailConfiguration
     *        The email configuration of your user pool. The email configuration type sets your preferred sending
     *        method, Amazon Web Services Region, and sender for email invitation and verification messages from your
     *        user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withEmailConfiguration(EmailConfigurationType emailConfiguration) {
        setEmailConfiguration(emailConfiguration);
        return this;
    }

    /**
     * <p>
     * The SMS configuration with the settings that your Amazon Cognito user pool must use to send an SMS message from
     * your Amazon Web Services account through Amazon Simple Notification Service. To send SMS messages with Amazon SNS
     * in the Amazon Web Services Region that you want, the Amazon Cognito user pool uses an Identity and Access
     * Management (IAM) role in your Amazon Web Services account.
     * </p>
     * 
     * @param smsConfiguration
     *        The SMS configuration with the settings that your Amazon Cognito user pool must use to send an SMS message
     *        from your Amazon Web Services account through Amazon Simple Notification Service. To send SMS messages
     *        with Amazon SNS in the Amazon Web Services Region that you want, the Amazon Cognito user pool uses an
     *        Identity and Access Management (IAM) role in your Amazon Web Services account.
     */

    public void setSmsConfiguration(SmsConfigurationType smsConfiguration) {
        this.smsConfiguration = smsConfiguration;
    }

    /**
     * <p>
     * The SMS configuration with the settings that your Amazon Cognito user pool must use to send an SMS message from
     * your Amazon Web Services account through Amazon Simple Notification Service. To send SMS messages with Amazon SNS
     * in the Amazon Web Services Region that you want, the Amazon Cognito user pool uses an Identity and Access
     * Management (IAM) role in your Amazon Web Services account.
     * </p>
     * 
     * @return The SMS configuration with the settings that your Amazon Cognito user pool must use to send an SMS
     *         message from your Amazon Web Services account through Amazon Simple Notification Service. To send SMS
     *         messages with Amazon SNS in the Amazon Web Services Region that you want, the Amazon Cognito user pool
     *         uses an Identity and Access Management (IAM) role in your Amazon Web Services account.
     */

    public SmsConfigurationType getSmsConfiguration() {
        return this.smsConfiguration;
    }

    /**
     * <p>
     * The SMS configuration with the settings that your Amazon Cognito user pool must use to send an SMS message from
     * your Amazon Web Services account through Amazon Simple Notification Service. To send SMS messages with Amazon SNS
     * in the Amazon Web Services Region that you want, the Amazon Cognito user pool uses an Identity and Access
     * Management (IAM) role in your Amazon Web Services account.
     * </p>
     * 
     * @param smsConfiguration
     *        The SMS configuration with the settings that your Amazon Cognito user pool must use to send an SMS message
     *        from your Amazon Web Services account through Amazon Simple Notification Service. To send SMS messages
     *        with Amazon SNS in the Amazon Web Services Region that you want, the Amazon Cognito user pool uses an
     *        Identity and Access Management (IAM) role in your Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withSmsConfiguration(SmsConfigurationType smsConfiguration) {
        setSmsConfiguration(smsConfiguration);
        return this;
    }

    /**
     * <p>
     * The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and manage
     * user pools in different ways, such as by purpose, owner, environment, or other criteria.
     * </p>
     * 
     * @return The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and
     *         manage user pools in different ways, such as by purpose, owner, environment, or other criteria.
     */

    public java.util.Map<String, String> getUserPoolTags() {
        return userPoolTags;
    }

    /**
     * <p>
     * The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and manage
     * user pools in different ways, such as by purpose, owner, environment, or other criteria.
     * </p>
     * 
     * @param userPoolTags
     *        The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and
     *        manage user pools in different ways, such as by purpose, owner, environment, or other criteria.
     */

    public void setUserPoolTags(java.util.Map<String, String> userPoolTags) {
        this.userPoolTags = userPoolTags;
    }

    /**
     * <p>
     * The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and manage
     * user pools in different ways, such as by purpose, owner, environment, or other criteria.
     * </p>
     * 
     * @param userPoolTags
     *        The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and
     *        manage user pools in different ways, such as by purpose, owner, environment, or other criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withUserPoolTags(java.util.Map<String, String> userPoolTags) {
        setUserPoolTags(userPoolTags);
        return this;
    }

    /**
     * Add a single UserPoolTags entry
     *
     * @see UpdateUserPoolRequest#withUserPoolTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest addUserPoolTagsEntry(String key, String value) {
        if (null == this.userPoolTags) {
            this.userPoolTags = new java.util.HashMap<String, String>();
        }
        if (this.userPoolTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.userPoolTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserPoolTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest clearUserPoolTagsEntries() {
        this.userPoolTags = null;
        return this;
    }

    /**
     * <p>
     * The configuration for <code>AdminCreateUser</code> requests.
     * </p>
     * 
     * @param adminCreateUserConfig
     *        The configuration for <code>AdminCreateUser</code> requests.
     */

    public void setAdminCreateUserConfig(AdminCreateUserConfigType adminCreateUserConfig) {
        this.adminCreateUserConfig = adminCreateUserConfig;
    }

    /**
     * <p>
     * The configuration for <code>AdminCreateUser</code> requests.
     * </p>
     * 
     * @return The configuration for <code>AdminCreateUser</code> requests.
     */

    public AdminCreateUserConfigType getAdminCreateUserConfig() {
        return this.adminCreateUserConfig;
    }

    /**
     * <p>
     * The configuration for <code>AdminCreateUser</code> requests.
     * </p>
     * 
     * @param adminCreateUserConfig
     *        The configuration for <code>AdminCreateUser</code> requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withAdminCreateUserConfig(AdminCreateUserConfigType adminCreateUserConfig) {
        setAdminCreateUserConfig(adminCreateUserConfig);
        return this;
    }

    /**
     * <p>
     * Enables advanced security risk detection. Set the key <code>AdvancedSecurityMode</code> to the value "AUDIT".
     * </p>
     * 
     * @param userPoolAddOns
     *        Enables advanced security risk detection. Set the key <code>AdvancedSecurityMode</code> to the value
     *        "AUDIT".
     */

    public void setUserPoolAddOns(UserPoolAddOnsType userPoolAddOns) {
        this.userPoolAddOns = userPoolAddOns;
    }

    /**
     * <p>
     * Enables advanced security risk detection. Set the key <code>AdvancedSecurityMode</code> to the value "AUDIT".
     * </p>
     * 
     * @return Enables advanced security risk detection. Set the key <code>AdvancedSecurityMode</code> to the value
     *         "AUDIT".
     */

    public UserPoolAddOnsType getUserPoolAddOns() {
        return this.userPoolAddOns;
    }

    /**
     * <p>
     * Enables advanced security risk detection. Set the key <code>AdvancedSecurityMode</code> to the value "AUDIT".
     * </p>
     * 
     * @param userPoolAddOns
     *        Enables advanced security risk detection. Set the key <code>AdvancedSecurityMode</code> to the value
     *        "AUDIT".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withUserPoolAddOns(UserPoolAddOnsType userPoolAddOns) {
        setUserPoolAddOns(userPoolAddOns);
        return this;
    }

    /**
     * <p>
     * The available verified method a user can use to recover their password when they call <code>ForgotPassword</code>
     * . You can use this setting to define a preferred method when a user has more than one method available. With this
     * setting, SMS doesn't qualify for a valid password recovery mechanism if the user also has SMS multi-factor
     * authentication (MFA) activated. In the absence of this setting, Amazon Cognito uses the legacy behavior to
     * determine the recovery method where SMS is preferred through email.
     * </p>
     * 
     * @param accountRecoverySetting
     *        The available verified method a user can use to recover their password when they call
     *        <code>ForgotPassword</code>. You can use this setting to define a preferred method when a user has more
     *        than one method available. With this setting, SMS doesn't qualify for a valid password recovery mechanism
     *        if the user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
     *        Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred through
     *        email.
     */

    public void setAccountRecoverySetting(AccountRecoverySettingType accountRecoverySetting) {
        this.accountRecoverySetting = accountRecoverySetting;
    }

    /**
     * <p>
     * The available verified method a user can use to recover their password when they call <code>ForgotPassword</code>
     * . You can use this setting to define a preferred method when a user has more than one method available. With this
     * setting, SMS doesn't qualify for a valid password recovery mechanism if the user also has SMS multi-factor
     * authentication (MFA) activated. In the absence of this setting, Amazon Cognito uses the legacy behavior to
     * determine the recovery method where SMS is preferred through email.
     * </p>
     * 
     * @return The available verified method a user can use to recover their password when they call
     *         <code>ForgotPassword</code>. You can use this setting to define a preferred method when a user has more
     *         than one method available. With this setting, SMS doesn't qualify for a valid password recovery mechanism
     *         if the user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
     *         Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred through
     *         email.
     */

    public AccountRecoverySettingType getAccountRecoverySetting() {
        return this.accountRecoverySetting;
    }

    /**
     * <p>
     * The available verified method a user can use to recover their password when they call <code>ForgotPassword</code>
     * . You can use this setting to define a preferred method when a user has more than one method available. With this
     * setting, SMS doesn't qualify for a valid password recovery mechanism if the user also has SMS multi-factor
     * authentication (MFA) activated. In the absence of this setting, Amazon Cognito uses the legacy behavior to
     * determine the recovery method where SMS is preferred through email.
     * </p>
     * 
     * @param accountRecoverySetting
     *        The available verified method a user can use to recover their password when they call
     *        <code>ForgotPassword</code>. You can use this setting to define a preferred method when a user has more
     *        than one method available. With this setting, SMS doesn't qualify for a valid password recovery mechanism
     *        if the user also has SMS multi-factor authentication (MFA) activated. In the absence of this setting,
     *        Amazon Cognito uses the legacy behavior to determine the recovery method where SMS is preferred through
     *        email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withAccountRecoverySetting(AccountRecoverySettingType accountRecoverySetting) {
        setAccountRecoverySetting(accountRecoverySetting);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getPolicies() != null)
            sb.append("Policies: ").append(getPolicies()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getLambdaConfig() != null)
            sb.append("LambdaConfig: ").append(getLambdaConfig()).append(",");
        if (getAutoVerifiedAttributes() != null)
            sb.append("AutoVerifiedAttributes: ").append(getAutoVerifiedAttributes()).append(",");
        if (getSmsVerificationMessage() != null)
            sb.append("SmsVerificationMessage: ").append(getSmsVerificationMessage()).append(",");
        if (getEmailVerificationMessage() != null)
            sb.append("EmailVerificationMessage: ").append(getEmailVerificationMessage()).append(",");
        if (getEmailVerificationSubject() != null)
            sb.append("EmailVerificationSubject: ").append(getEmailVerificationSubject()).append(",");
        if (getVerificationMessageTemplate() != null)
            sb.append("VerificationMessageTemplate: ").append(getVerificationMessageTemplate()).append(",");
        if (getSmsAuthenticationMessage() != null)
            sb.append("SmsAuthenticationMessage: ").append(getSmsAuthenticationMessage()).append(",");
        if (getUserAttributeUpdateSettings() != null)
            sb.append("UserAttributeUpdateSettings: ").append(getUserAttributeUpdateSettings()).append(",");
        if (getMfaConfiguration() != null)
            sb.append("MfaConfiguration: ").append(getMfaConfiguration()).append(",");
        if (getDeviceConfiguration() != null)
            sb.append("DeviceConfiguration: ").append(getDeviceConfiguration()).append(",");
        if (getEmailConfiguration() != null)
            sb.append("EmailConfiguration: ").append(getEmailConfiguration()).append(",");
        if (getSmsConfiguration() != null)
            sb.append("SmsConfiguration: ").append(getSmsConfiguration()).append(",");
        if (getUserPoolTags() != null)
            sb.append("UserPoolTags: ").append(getUserPoolTags()).append(",");
        if (getAdminCreateUserConfig() != null)
            sb.append("AdminCreateUserConfig: ").append(getAdminCreateUserConfig()).append(",");
        if (getUserPoolAddOns() != null)
            sb.append("UserPoolAddOns: ").append(getUserPoolAddOns()).append(",");
        if (getAccountRecoverySetting() != null)
            sb.append("AccountRecoverySetting: ").append(getAccountRecoverySetting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserPoolRequest == false)
            return false;
        UpdateUserPoolRequest other = (UpdateUserPoolRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getLambdaConfig() == null ^ this.getLambdaConfig() == null)
            return false;
        if (other.getLambdaConfig() != null && other.getLambdaConfig().equals(this.getLambdaConfig()) == false)
            return false;
        if (other.getAutoVerifiedAttributes() == null ^ this.getAutoVerifiedAttributes() == null)
            return false;
        if (other.getAutoVerifiedAttributes() != null && other.getAutoVerifiedAttributes().equals(this.getAutoVerifiedAttributes()) == false)
            return false;
        if (other.getSmsVerificationMessage() == null ^ this.getSmsVerificationMessage() == null)
            return false;
        if (other.getSmsVerificationMessage() != null && other.getSmsVerificationMessage().equals(this.getSmsVerificationMessage()) == false)
            return false;
        if (other.getEmailVerificationMessage() == null ^ this.getEmailVerificationMessage() == null)
            return false;
        if (other.getEmailVerificationMessage() != null && other.getEmailVerificationMessage().equals(this.getEmailVerificationMessage()) == false)
            return false;
        if (other.getEmailVerificationSubject() == null ^ this.getEmailVerificationSubject() == null)
            return false;
        if (other.getEmailVerificationSubject() != null && other.getEmailVerificationSubject().equals(this.getEmailVerificationSubject()) == false)
            return false;
        if (other.getVerificationMessageTemplate() == null ^ this.getVerificationMessageTemplate() == null)
            return false;
        if (other.getVerificationMessageTemplate() != null && other.getVerificationMessageTemplate().equals(this.getVerificationMessageTemplate()) == false)
            return false;
        if (other.getSmsAuthenticationMessage() == null ^ this.getSmsAuthenticationMessage() == null)
            return false;
        if (other.getSmsAuthenticationMessage() != null && other.getSmsAuthenticationMessage().equals(this.getSmsAuthenticationMessage()) == false)
            return false;
        if (other.getUserAttributeUpdateSettings() == null ^ this.getUserAttributeUpdateSettings() == null)
            return false;
        if (other.getUserAttributeUpdateSettings() != null && other.getUserAttributeUpdateSettings().equals(this.getUserAttributeUpdateSettings()) == false)
            return false;
        if (other.getMfaConfiguration() == null ^ this.getMfaConfiguration() == null)
            return false;
        if (other.getMfaConfiguration() != null && other.getMfaConfiguration().equals(this.getMfaConfiguration()) == false)
            return false;
        if (other.getDeviceConfiguration() == null ^ this.getDeviceConfiguration() == null)
            return false;
        if (other.getDeviceConfiguration() != null && other.getDeviceConfiguration().equals(this.getDeviceConfiguration()) == false)
            return false;
        if (other.getEmailConfiguration() == null ^ this.getEmailConfiguration() == null)
            return false;
        if (other.getEmailConfiguration() != null && other.getEmailConfiguration().equals(this.getEmailConfiguration()) == false)
            return false;
        if (other.getSmsConfiguration() == null ^ this.getSmsConfiguration() == null)
            return false;
        if (other.getSmsConfiguration() != null && other.getSmsConfiguration().equals(this.getSmsConfiguration()) == false)
            return false;
        if (other.getUserPoolTags() == null ^ this.getUserPoolTags() == null)
            return false;
        if (other.getUserPoolTags() != null && other.getUserPoolTags().equals(this.getUserPoolTags()) == false)
            return false;
        if (other.getAdminCreateUserConfig() == null ^ this.getAdminCreateUserConfig() == null)
            return false;
        if (other.getAdminCreateUserConfig() != null && other.getAdminCreateUserConfig().equals(this.getAdminCreateUserConfig()) == false)
            return false;
        if (other.getUserPoolAddOns() == null ^ this.getUserPoolAddOns() == null)
            return false;
        if (other.getUserPoolAddOns() != null && other.getUserPoolAddOns().equals(this.getUserPoolAddOns()) == false)
            return false;
        if (other.getAccountRecoverySetting() == null ^ this.getAccountRecoverySetting() == null)
            return false;
        if (other.getAccountRecoverySetting() != null && other.getAccountRecoverySetting().equals(this.getAccountRecoverySetting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getLambdaConfig() == null) ? 0 : getLambdaConfig().hashCode());
        hashCode = prime * hashCode + ((getAutoVerifiedAttributes() == null) ? 0 : getAutoVerifiedAttributes().hashCode());
        hashCode = prime * hashCode + ((getSmsVerificationMessage() == null) ? 0 : getSmsVerificationMessage().hashCode());
        hashCode = prime * hashCode + ((getEmailVerificationMessage() == null) ? 0 : getEmailVerificationMessage().hashCode());
        hashCode = prime * hashCode + ((getEmailVerificationSubject() == null) ? 0 : getEmailVerificationSubject().hashCode());
        hashCode = prime * hashCode + ((getVerificationMessageTemplate() == null) ? 0 : getVerificationMessageTemplate().hashCode());
        hashCode = prime * hashCode + ((getSmsAuthenticationMessage() == null) ? 0 : getSmsAuthenticationMessage().hashCode());
        hashCode = prime * hashCode + ((getUserAttributeUpdateSettings() == null) ? 0 : getUserAttributeUpdateSettings().hashCode());
        hashCode = prime * hashCode + ((getMfaConfiguration() == null) ? 0 : getMfaConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeviceConfiguration() == null) ? 0 : getDeviceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEmailConfiguration() == null) ? 0 : getEmailConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSmsConfiguration() == null) ? 0 : getSmsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUserPoolTags() == null) ? 0 : getUserPoolTags().hashCode());
        hashCode = prime * hashCode + ((getAdminCreateUserConfig() == null) ? 0 : getAdminCreateUserConfig().hashCode());
        hashCode = prime * hashCode + ((getUserPoolAddOns() == null) ? 0 : getUserPoolAddOns().hashCode());
        hashCode = prime * hashCode + ((getAccountRecoverySetting() == null) ? 0 : getAccountRecoverySetting().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserPoolRequest clone() {
        return (UpdateUserPoolRequest) super.clone();
    }

}

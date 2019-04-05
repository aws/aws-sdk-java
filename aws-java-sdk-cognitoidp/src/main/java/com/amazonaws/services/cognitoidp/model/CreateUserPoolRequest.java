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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to create a user pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserPoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string used to name the user pool.
     * </p>
     */
    private String poolName;
    /**
     * <p>
     * The policies associated with the new user pool.
     * </p>
     */
    private UserPoolPolicyType policies;
    /**
     * <p>
     * The Lambda trigger configuration information for the new user pool.
     * </p>
     * <note>
     * <p>
     * In a push model, event sources (such as Amazon S3 and custom applications) need permission to invoke a function.
     * So you will need to make an extra call to add permission for these event sources to invoke your Lambda function.
     * </p>
     * <p/>
     * <p>
     * For more information on using the Lambda API to add permission, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html"> AddPermission </a>.
     * </p>
     * <p>
     * For adding permission using the AWS CLI, see <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html"> add-permission </a>.
     * </p>
     * </note>
     */
    private LambdaConfigType lambdaConfig;
    /**
     * <p>
     * The attributes to be auto-verified. Possible values: <b>email</b>, <b>phone_number</b>.
     * </p>
     */
    private java.util.List<String> autoVerifiedAttributes;
    /**
     * <p>
     * Attributes supported as an alias for this user pool. Possible values: <b>phone_number</b>, <b>email</b>, or
     * <b>preferred_username</b>.
     * </p>
     */
    private java.util.List<String> aliasAttributes;
    /**
     * <p>
     * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
     * </p>
     */
    private java.util.List<String> usernameAttributes;
    /**
     * <p>
     * A string representing the SMS verification message.
     * </p>
     */
    private String smsVerificationMessage;
    /**
     * <p>
     * A string representing the email verification message.
     * </p>
     */
    private String emailVerificationMessage;
    /**
     * <p>
     * A string representing the email verification subject.
     * </p>
     */
    private String emailVerificationSubject;
    /**
     * <p>
     * The template for the verification message that the user sees when the app requests permission to access the
     * user's information.
     * </p>
     */
    private VerificationMessageTemplateType verificationMessageTemplate;
    /**
     * <p>
     * A string representing the SMS authentication message.
     * </p>
     */
    private String smsAuthenticationMessage;
    /**
     * <p>
     * Specifies MFA configuration details.
     * </p>
     */
    private String mfaConfiguration;
    /**
     * <p>
     * The device configuration.
     * </p>
     */
    private DeviceConfigurationType deviceConfiguration;
    /**
     * <p>
     * The email configuration.
     * </p>
     */
    private EmailConfigurationType emailConfiguration;
    /**
     * <p>
     * The SMS configuration.
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
     * An array of schema attributes for the new user pool. These attributes can be standard or custom attributes.
     * </p>
     */
    private java.util.List<SchemaAttributeType> schema;
    /**
     * <p>
     * Used to enable advanced security risk detection. Set the key <code>AdvancedSecurityMode</code> to the value
     * "AUDIT".
     * </p>
     */
    private UserPoolAddOnsType userPoolAddOns;

    /**
     * <p>
     * A string used to name the user pool.
     * </p>
     * 
     * @param poolName
     *        A string used to name the user pool.
     */

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    /**
     * <p>
     * A string used to name the user pool.
     * </p>
     * 
     * @return A string used to name the user pool.
     */

    public String getPoolName() {
        return this.poolName;
    }

    /**
     * <p>
     * A string used to name the user pool.
     * </p>
     * 
     * @param poolName
     *        A string used to name the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolRequest withPoolName(String poolName) {
        setPoolName(poolName);
        return this;
    }

    /**
     * <p>
     * The policies associated with the new user pool.
     * </p>
     * 
     * @param policies
     *        The policies associated with the new user pool.
     */

    public void setPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
    }

    /**
     * <p>
     * The policies associated with the new user pool.
     * </p>
     * 
     * @return The policies associated with the new user pool.
     */

    public UserPoolPolicyType getPolicies() {
        return this.policies;
    }

    /**
     * <p>
     * The policies associated with the new user pool.
     * </p>
     * 
     * @param policies
     *        The policies associated with the new user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolRequest withPolicies(UserPoolPolicyType policies) {
        setPolicies(policies);
        return this;
    }

    /**
     * <p>
     * The Lambda trigger configuration information for the new user pool.
     * </p>
     * <note>
     * <p>
     * In a push model, event sources (such as Amazon S3 and custom applications) need permission to invoke a function.
     * So you will need to make an extra call to add permission for these event sources to invoke your Lambda function.
     * </p>
     * <p/>
     * <p>
     * For more information on using the Lambda API to add permission, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html"> AddPermission </a>.
     * </p>
     * <p>
     * For adding permission using the AWS CLI, see <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html"> add-permission </a>.
     * </p>
     * </note>
     * 
     * @param lambdaConfig
     *        The Lambda trigger configuration information for the new user pool.</p> <note>
     *        <p>
     *        In a push model, event sources (such as Amazon S3 and custom applications) need permission to invoke a
     *        function. So you will need to make an extra call to add permission for these event sources to invoke your
     *        Lambda function.
     *        </p>
     *        <p/>
     *        <p>
     *        For more information on using the Lambda API to add permission, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html"> AddPermission </a>.
     *        </p>
     *        <p>
     *        For adding permission using the AWS CLI, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html"> add-permission </a>.
     *        </p>
     */

    public void setLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    /**
     * <p>
     * The Lambda trigger configuration information for the new user pool.
     * </p>
     * <note>
     * <p>
     * In a push model, event sources (such as Amazon S3 and custom applications) need permission to invoke a function.
     * So you will need to make an extra call to add permission for these event sources to invoke your Lambda function.
     * </p>
     * <p/>
     * <p>
     * For more information on using the Lambda API to add permission, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html"> AddPermission </a>.
     * </p>
     * <p>
     * For adding permission using the AWS CLI, see <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html"> add-permission </a>.
     * </p>
     * </note>
     * 
     * @return The Lambda trigger configuration information for the new user pool.</p> <note>
     *         <p>
     *         In a push model, event sources (such as Amazon S3 and custom applications) need permission to invoke a
     *         function. So you will need to make an extra call to add permission for these event sources to invoke your
     *         Lambda function.
     *         </p>
     *         <p/>
     *         <p>
     *         For more information on using the Lambda API to add permission, see <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html"> AddPermission </a>.
     *         </p>
     *         <p>
     *         For adding permission using the AWS CLI, see <a
     *         href="https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html"> add-permission </a>.
     *         </p>
     */

    public LambdaConfigType getLambdaConfig() {
        return this.lambdaConfig;
    }

    /**
     * <p>
     * The Lambda trigger configuration information for the new user pool.
     * </p>
     * <note>
     * <p>
     * In a push model, event sources (such as Amazon S3 and custom applications) need permission to invoke a function.
     * So you will need to make an extra call to add permission for these event sources to invoke your Lambda function.
     * </p>
     * <p/>
     * <p>
     * For more information on using the Lambda API to add permission, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html"> AddPermission </a>.
     * </p>
     * <p>
     * For adding permission using the AWS CLI, see <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html"> add-permission </a>.
     * </p>
     * </note>
     * 
     * @param lambdaConfig
     *        The Lambda trigger configuration information for the new user pool.</p> <note>
     *        <p>
     *        In a push model, event sources (such as Amazon S3 and custom applications) need permission to invoke a
     *        function. So you will need to make an extra call to add permission for these event sources to invoke your
     *        Lambda function.
     *        </p>
     *        <p/>
     *        <p>
     *        For more information on using the Lambda API to add permission, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html"> AddPermission </a>.
     *        </p>
     *        <p>
     *        For adding permission using the AWS CLI, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html"> add-permission </a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolRequest withLambdaConfig(LambdaConfigType lambdaConfig) {
        setLambdaConfig(lambdaConfig);
        return this;
    }

    /**
     * <p>
     * The attributes to be auto-verified. Possible values: <b>email</b>, <b>phone_number</b>.
     * </p>
     * 
     * @return The attributes to be auto-verified. Possible values: <b>email</b>, <b>phone_number</b>.
     * @see VerifiedAttributeType
     */

    public java.util.List<String> getAutoVerifiedAttributes() {
        return autoVerifiedAttributes;
    }

    /**
     * <p>
     * The attributes to be auto-verified. Possible values: <b>email</b>, <b>phone_number</b>.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        The attributes to be auto-verified. Possible values: <b>email</b>, <b>phone_number</b>.
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
     * The attributes to be auto-verified. Possible values: <b>email</b>, <b>phone_number</b>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoVerifiedAttributes(java.util.Collection)} or
     * {@link #withAutoVerifiedAttributes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        The attributes to be auto-verified. Possible values: <b>email</b>, <b>phone_number</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAttributeType
     */

    public CreateUserPoolRequest withAutoVerifiedAttributes(String... autoVerifiedAttributes) {
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
     * The attributes to be auto-verified. Possible values: <b>email</b>, <b>phone_number</b>.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        The attributes to be auto-verified. Possible values: <b>email</b>, <b>phone_number</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAttributeType
     */

    public CreateUserPoolRequest withAutoVerifiedAttributes(java.util.Collection<String> autoVerifiedAttributes) {
        setAutoVerifiedAttributes(autoVerifiedAttributes);
        return this;
    }

    /**
     * <p>
     * The attributes to be auto-verified. Possible values: <b>email</b>, <b>phone_number</b>.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        The attributes to be auto-verified. Possible values: <b>email</b>, <b>phone_number</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAttributeType
     */

    public CreateUserPoolRequest withAutoVerifiedAttributes(VerifiedAttributeType... autoVerifiedAttributes) {
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
     * Attributes supported as an alias for this user pool. Possible values: <b>phone_number</b>, <b>email</b>, or
     * <b>preferred_username</b>.
     * </p>
     * 
     * @return Attributes supported as an alias for this user pool. Possible values: <b>phone_number</b>, <b>email</b>,
     *         or <b>preferred_username</b>.
     * @see AliasAttributeType
     */

    public java.util.List<String> getAliasAttributes() {
        return aliasAttributes;
    }

    /**
     * <p>
     * Attributes supported as an alias for this user pool. Possible values: <b>phone_number</b>, <b>email</b>, or
     * <b>preferred_username</b>.
     * </p>
     * 
     * @param aliasAttributes
     *        Attributes supported as an alias for this user pool. Possible values: <b>phone_number</b>, <b>email</b>,
     *        or <b>preferred_username</b>.
     * @see AliasAttributeType
     */

    public void setAliasAttributes(java.util.Collection<String> aliasAttributes) {
        if (aliasAttributes == null) {
            this.aliasAttributes = null;
            return;
        }

        this.aliasAttributes = new java.util.ArrayList<String>(aliasAttributes);
    }

    /**
     * <p>
     * Attributes supported as an alias for this user pool. Possible values: <b>phone_number</b>, <b>email</b>, or
     * <b>preferred_username</b>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliasAttributes(java.util.Collection)} or {@link #withAliasAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param aliasAttributes
     *        Attributes supported as an alias for this user pool. Possible values: <b>phone_number</b>, <b>email</b>,
     *        or <b>preferred_username</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AliasAttributeType
     */

    public CreateUserPoolRequest withAliasAttributes(String... aliasAttributes) {
        if (this.aliasAttributes == null) {
            setAliasAttributes(new java.util.ArrayList<String>(aliasAttributes.length));
        }
        for (String ele : aliasAttributes) {
            this.aliasAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Attributes supported as an alias for this user pool. Possible values: <b>phone_number</b>, <b>email</b>, or
     * <b>preferred_username</b>.
     * </p>
     * 
     * @param aliasAttributes
     *        Attributes supported as an alias for this user pool. Possible values: <b>phone_number</b>, <b>email</b>,
     *        or <b>preferred_username</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AliasAttributeType
     */

    public CreateUserPoolRequest withAliasAttributes(java.util.Collection<String> aliasAttributes) {
        setAliasAttributes(aliasAttributes);
        return this;
    }

    /**
     * <p>
     * Attributes supported as an alias for this user pool. Possible values: <b>phone_number</b>, <b>email</b>, or
     * <b>preferred_username</b>.
     * </p>
     * 
     * @param aliasAttributes
     *        Attributes supported as an alias for this user pool. Possible values: <b>phone_number</b>, <b>email</b>,
     *        or <b>preferred_username</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AliasAttributeType
     */

    public CreateUserPoolRequest withAliasAttributes(AliasAttributeType... aliasAttributes) {
        java.util.ArrayList<String> aliasAttributesCopy = new java.util.ArrayList<String>(aliasAttributes.length);
        for (AliasAttributeType value : aliasAttributes) {
            aliasAttributesCopy.add(value.toString());
        }
        if (getAliasAttributes() == null) {
            setAliasAttributes(aliasAttributesCopy);
        } else {
            getAliasAttributes().addAll(aliasAttributesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
     * </p>
     * 
     * @return Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
     * @see UsernameAttributeType
     */

    public java.util.List<String> getUsernameAttributes() {
        return usernameAttributes;
    }

    /**
     * <p>
     * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
     * </p>
     * 
     * @param usernameAttributes
     *        Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
     * @see UsernameAttributeType
     */

    public void setUsernameAttributes(java.util.Collection<String> usernameAttributes) {
        if (usernameAttributes == null) {
            this.usernameAttributes = null;
            return;
        }

        this.usernameAttributes = new java.util.ArrayList<String>(usernameAttributes);
    }

    /**
     * <p>
     * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsernameAttributes(java.util.Collection)} or {@link #withUsernameAttributes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param usernameAttributes
     *        Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsernameAttributeType
     */

    public CreateUserPoolRequest withUsernameAttributes(String... usernameAttributes) {
        if (this.usernameAttributes == null) {
            setUsernameAttributes(new java.util.ArrayList<String>(usernameAttributes.length));
        }
        for (String ele : usernameAttributes) {
            this.usernameAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
     * </p>
     * 
     * @param usernameAttributes
     *        Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsernameAttributeType
     */

    public CreateUserPoolRequest withUsernameAttributes(java.util.Collection<String> usernameAttributes) {
        setUsernameAttributes(usernameAttributes);
        return this;
    }

    /**
     * <p>
     * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
     * </p>
     * 
     * @param usernameAttributes
     *        Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsernameAttributeType
     */

    public CreateUserPoolRequest withUsernameAttributes(UsernameAttributeType... usernameAttributes) {
        java.util.ArrayList<String> usernameAttributesCopy = new java.util.ArrayList<String>(usernameAttributes.length);
        for (UsernameAttributeType value : usernameAttributes) {
            usernameAttributesCopy.add(value.toString());
        }
        if (getUsernameAttributes() == null) {
            setUsernameAttributes(usernameAttributesCopy);
        } else {
            getUsernameAttributes().addAll(usernameAttributesCopy);
        }
        return this;
    }

    /**
     * <p>
     * A string representing the SMS verification message.
     * </p>
     * 
     * @param smsVerificationMessage
     *        A string representing the SMS verification message.
     */

    public void setSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
    }

    /**
     * <p>
     * A string representing the SMS verification message.
     * </p>
     * 
     * @return A string representing the SMS verification message.
     */

    public String getSmsVerificationMessage() {
        return this.smsVerificationMessage;
    }

    /**
     * <p>
     * A string representing the SMS verification message.
     * </p>
     * 
     * @param smsVerificationMessage
     *        A string representing the SMS verification message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolRequest withSmsVerificationMessage(String smsVerificationMessage) {
        setSmsVerificationMessage(smsVerificationMessage);
        return this;
    }

    /**
     * <p>
     * A string representing the email verification message.
     * </p>
     * 
     * @param emailVerificationMessage
     *        A string representing the email verification message.
     */

    public void setEmailVerificationMessage(String emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
    }

    /**
     * <p>
     * A string representing the email verification message.
     * </p>
     * 
     * @return A string representing the email verification message.
     */

    public String getEmailVerificationMessage() {
        return this.emailVerificationMessage;
    }

    /**
     * <p>
     * A string representing the email verification message.
     * </p>
     * 
     * @param emailVerificationMessage
     *        A string representing the email verification message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolRequest withEmailVerificationMessage(String emailVerificationMessage) {
        setEmailVerificationMessage(emailVerificationMessage);
        return this;
    }

    /**
     * <p>
     * A string representing the email verification subject.
     * </p>
     * 
     * @param emailVerificationSubject
     *        A string representing the email verification subject.
     */

    public void setEmailVerificationSubject(String emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
    }

    /**
     * <p>
     * A string representing the email verification subject.
     * </p>
     * 
     * @return A string representing the email verification subject.
     */

    public String getEmailVerificationSubject() {
        return this.emailVerificationSubject;
    }

    /**
     * <p>
     * A string representing the email verification subject.
     * </p>
     * 
     * @param emailVerificationSubject
     *        A string representing the email verification subject.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolRequest withEmailVerificationSubject(String emailVerificationSubject) {
        setEmailVerificationSubject(emailVerificationSubject);
        return this;
    }

    /**
     * <p>
     * The template for the verification message that the user sees when the app requests permission to access the
     * user's information.
     * </p>
     * 
     * @param verificationMessageTemplate
     *        The template for the verification message that the user sees when the app requests permission to access
     *        the user's information.
     */

    public void setVerificationMessageTemplate(VerificationMessageTemplateType verificationMessageTemplate) {
        this.verificationMessageTemplate = verificationMessageTemplate;
    }

    /**
     * <p>
     * The template for the verification message that the user sees when the app requests permission to access the
     * user's information.
     * </p>
     * 
     * @return The template for the verification message that the user sees when the app requests permission to access
     *         the user's information.
     */

    public VerificationMessageTemplateType getVerificationMessageTemplate() {
        return this.verificationMessageTemplate;
    }

    /**
     * <p>
     * The template for the verification message that the user sees when the app requests permission to access the
     * user's information.
     * </p>
     * 
     * @param verificationMessageTemplate
     *        The template for the verification message that the user sees when the app requests permission to access
     *        the user's information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolRequest withVerificationMessageTemplate(VerificationMessageTemplateType verificationMessageTemplate) {
        setVerificationMessageTemplate(verificationMessageTemplate);
        return this;
    }

    /**
     * <p>
     * A string representing the SMS authentication message.
     * </p>
     * 
     * @param smsAuthenticationMessage
     *        A string representing the SMS authentication message.
     */

    public void setSmsAuthenticationMessage(String smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
    }

    /**
     * <p>
     * A string representing the SMS authentication message.
     * </p>
     * 
     * @return A string representing the SMS authentication message.
     */

    public String getSmsAuthenticationMessage() {
        return this.smsAuthenticationMessage;
    }

    /**
     * <p>
     * A string representing the SMS authentication message.
     * </p>
     * 
     * @param smsAuthenticationMessage
     *        A string representing the SMS authentication message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolRequest withSmsAuthenticationMessage(String smsAuthenticationMessage) {
        setSmsAuthenticationMessage(smsAuthenticationMessage);
        return this;
    }

    /**
     * <p>
     * Specifies MFA configuration details.
     * </p>
     * 
     * @param mfaConfiguration
     *        Specifies MFA configuration details.
     * @see UserPoolMfaType
     */

    public void setMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
    }

    /**
     * <p>
     * Specifies MFA configuration details.
     * </p>
     * 
     * @return Specifies MFA configuration details.
     * @see UserPoolMfaType
     */

    public String getMfaConfiguration() {
        return this.mfaConfiguration;
    }

    /**
     * <p>
     * Specifies MFA configuration details.
     * </p>
     * 
     * @param mfaConfiguration
     *        Specifies MFA configuration details.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserPoolMfaType
     */

    public CreateUserPoolRequest withMfaConfiguration(String mfaConfiguration) {
        setMfaConfiguration(mfaConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies MFA configuration details.
     * </p>
     * 
     * @param mfaConfiguration
     *        Specifies MFA configuration details.
     * @see UserPoolMfaType
     */

    public void setMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        withMfaConfiguration(mfaConfiguration);
    }

    /**
     * <p>
     * Specifies MFA configuration details.
     * </p>
     * 
     * @param mfaConfiguration
     *        Specifies MFA configuration details.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserPoolMfaType
     */

    public CreateUserPoolRequest withMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
        return this;
    }

    /**
     * <p>
     * The device configuration.
     * </p>
     * 
     * @param deviceConfiguration
     *        The device configuration.
     */

    public void setDeviceConfiguration(DeviceConfigurationType deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
    }

    /**
     * <p>
     * The device configuration.
     * </p>
     * 
     * @return The device configuration.
     */

    public DeviceConfigurationType getDeviceConfiguration() {
        return this.deviceConfiguration;
    }

    /**
     * <p>
     * The device configuration.
     * </p>
     * 
     * @param deviceConfiguration
     *        The device configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolRequest withDeviceConfiguration(DeviceConfigurationType deviceConfiguration) {
        setDeviceConfiguration(deviceConfiguration);
        return this;
    }

    /**
     * <p>
     * The email configuration.
     * </p>
     * 
     * @param emailConfiguration
     *        The email configuration.
     */

    public void setEmailConfiguration(EmailConfigurationType emailConfiguration) {
        this.emailConfiguration = emailConfiguration;
    }

    /**
     * <p>
     * The email configuration.
     * </p>
     * 
     * @return The email configuration.
     */

    public EmailConfigurationType getEmailConfiguration() {
        return this.emailConfiguration;
    }

    /**
     * <p>
     * The email configuration.
     * </p>
     * 
     * @param emailConfiguration
     *        The email configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolRequest withEmailConfiguration(EmailConfigurationType emailConfiguration) {
        setEmailConfiguration(emailConfiguration);
        return this;
    }

    /**
     * <p>
     * The SMS configuration.
     * </p>
     * 
     * @param smsConfiguration
     *        The SMS configuration.
     */

    public void setSmsConfiguration(SmsConfigurationType smsConfiguration) {
        this.smsConfiguration = smsConfiguration;
    }

    /**
     * <p>
     * The SMS configuration.
     * </p>
     * 
     * @return The SMS configuration.
     */

    public SmsConfigurationType getSmsConfiguration() {
        return this.smsConfiguration;
    }

    /**
     * <p>
     * The SMS configuration.
     * </p>
     * 
     * @param smsConfiguration
     *        The SMS configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolRequest withSmsConfiguration(SmsConfigurationType smsConfiguration) {
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

    public CreateUserPoolRequest withUserPoolTags(java.util.Map<String, String> userPoolTags) {
        setUserPoolTags(userPoolTags);
        return this;
    }

    public CreateUserPoolRequest addUserPoolTagsEntry(String key, String value) {
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

    public CreateUserPoolRequest clearUserPoolTagsEntries() {
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

    public CreateUserPoolRequest withAdminCreateUserConfig(AdminCreateUserConfigType adminCreateUserConfig) {
        setAdminCreateUserConfig(adminCreateUserConfig);
        return this;
    }

    /**
     * <p>
     * An array of schema attributes for the new user pool. These attributes can be standard or custom attributes.
     * </p>
     * 
     * @return An array of schema attributes for the new user pool. These attributes can be standard or custom
     *         attributes.
     */

    public java.util.List<SchemaAttributeType> getSchema() {
        return schema;
    }

    /**
     * <p>
     * An array of schema attributes for the new user pool. These attributes can be standard or custom attributes.
     * </p>
     * 
     * @param schema
     *        An array of schema attributes for the new user pool. These attributes can be standard or custom
     *        attributes.
     */

    public void setSchema(java.util.Collection<SchemaAttributeType> schema) {
        if (schema == null) {
            this.schema = null;
            return;
        }

        this.schema = new java.util.ArrayList<SchemaAttributeType>(schema);
    }

    /**
     * <p>
     * An array of schema attributes for the new user pool. These attributes can be standard or custom attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchema(java.util.Collection)} or {@link #withSchema(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param schema
     *        An array of schema attributes for the new user pool. These attributes can be standard or custom
     *        attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolRequest withSchema(SchemaAttributeType... schema) {
        if (this.schema == null) {
            setSchema(new java.util.ArrayList<SchemaAttributeType>(schema.length));
        }
        for (SchemaAttributeType ele : schema) {
            this.schema.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of schema attributes for the new user pool. These attributes can be standard or custom attributes.
     * </p>
     * 
     * @param schema
     *        An array of schema attributes for the new user pool. These attributes can be standard or custom
     *        attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolRequest withSchema(java.util.Collection<SchemaAttributeType> schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * Used to enable advanced security risk detection. Set the key <code>AdvancedSecurityMode</code> to the value
     * "AUDIT".
     * </p>
     * 
     * @param userPoolAddOns
     *        Used to enable advanced security risk detection. Set the key <code>AdvancedSecurityMode</code> to the
     *        value "AUDIT".
     */

    public void setUserPoolAddOns(UserPoolAddOnsType userPoolAddOns) {
        this.userPoolAddOns = userPoolAddOns;
    }

    /**
     * <p>
     * Used to enable advanced security risk detection. Set the key <code>AdvancedSecurityMode</code> to the value
     * "AUDIT".
     * </p>
     * 
     * @return Used to enable advanced security risk detection. Set the key <code>AdvancedSecurityMode</code> to the
     *         value "AUDIT".
     */

    public UserPoolAddOnsType getUserPoolAddOns() {
        return this.userPoolAddOns;
    }

    /**
     * <p>
     * Used to enable advanced security risk detection. Set the key <code>AdvancedSecurityMode</code> to the value
     * "AUDIT".
     * </p>
     * 
     * @param userPoolAddOns
     *        Used to enable advanced security risk detection. Set the key <code>AdvancedSecurityMode</code> to the
     *        value "AUDIT".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolRequest withUserPoolAddOns(UserPoolAddOnsType userPoolAddOns) {
        setUserPoolAddOns(userPoolAddOns);
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
        if (getPoolName() != null)
            sb.append("PoolName: ").append(getPoolName()).append(",");
        if (getPolicies() != null)
            sb.append("Policies: ").append(getPolicies()).append(",");
        if (getLambdaConfig() != null)
            sb.append("LambdaConfig: ").append(getLambdaConfig()).append(",");
        if (getAutoVerifiedAttributes() != null)
            sb.append("AutoVerifiedAttributes: ").append(getAutoVerifiedAttributes()).append(",");
        if (getAliasAttributes() != null)
            sb.append("AliasAttributes: ").append(getAliasAttributes()).append(",");
        if (getUsernameAttributes() != null)
            sb.append("UsernameAttributes: ").append(getUsernameAttributes()).append(",");
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
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getUserPoolAddOns() != null)
            sb.append("UserPoolAddOns: ").append(getUserPoolAddOns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserPoolRequest == false)
            return false;
        CreateUserPoolRequest other = (CreateUserPoolRequest) obj;
        if (other.getPoolName() == null ^ this.getPoolName() == null)
            return false;
        if (other.getPoolName() != null && other.getPoolName().equals(this.getPoolName()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        if (other.getLambdaConfig() == null ^ this.getLambdaConfig() == null)
            return false;
        if (other.getLambdaConfig() != null && other.getLambdaConfig().equals(this.getLambdaConfig()) == false)
            return false;
        if (other.getAutoVerifiedAttributes() == null ^ this.getAutoVerifiedAttributes() == null)
            return false;
        if (other.getAutoVerifiedAttributes() != null && other.getAutoVerifiedAttributes().equals(this.getAutoVerifiedAttributes()) == false)
            return false;
        if (other.getAliasAttributes() == null ^ this.getAliasAttributes() == null)
            return false;
        if (other.getAliasAttributes() != null && other.getAliasAttributes().equals(this.getAliasAttributes()) == false)
            return false;
        if (other.getUsernameAttributes() == null ^ this.getUsernameAttributes() == null)
            return false;
        if (other.getUsernameAttributes() != null && other.getUsernameAttributes().equals(this.getUsernameAttributes()) == false)
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
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getUserPoolAddOns() == null ^ this.getUserPoolAddOns() == null)
            return false;
        if (other.getUserPoolAddOns() != null && other.getUserPoolAddOns().equals(this.getUserPoolAddOns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolName() == null) ? 0 : getPoolName().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        hashCode = prime * hashCode + ((getLambdaConfig() == null) ? 0 : getLambdaConfig().hashCode());
        hashCode = prime * hashCode + ((getAutoVerifiedAttributes() == null) ? 0 : getAutoVerifiedAttributes().hashCode());
        hashCode = prime * hashCode + ((getAliasAttributes() == null) ? 0 : getAliasAttributes().hashCode());
        hashCode = prime * hashCode + ((getUsernameAttributes() == null) ? 0 : getUsernameAttributes().hashCode());
        hashCode = prime * hashCode + ((getSmsVerificationMessage() == null) ? 0 : getSmsVerificationMessage().hashCode());
        hashCode = prime * hashCode + ((getEmailVerificationMessage() == null) ? 0 : getEmailVerificationMessage().hashCode());
        hashCode = prime * hashCode + ((getEmailVerificationSubject() == null) ? 0 : getEmailVerificationSubject().hashCode());
        hashCode = prime * hashCode + ((getVerificationMessageTemplate() == null) ? 0 : getVerificationMessageTemplate().hashCode());
        hashCode = prime * hashCode + ((getSmsAuthenticationMessage() == null) ? 0 : getSmsAuthenticationMessage().hashCode());
        hashCode = prime * hashCode + ((getMfaConfiguration() == null) ? 0 : getMfaConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeviceConfiguration() == null) ? 0 : getDeviceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEmailConfiguration() == null) ? 0 : getEmailConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSmsConfiguration() == null) ? 0 : getSmsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUserPoolTags() == null) ? 0 : getUserPoolTags().hashCode());
        hashCode = prime * hashCode + ((getAdminCreateUserConfig() == null) ? 0 : getAdminCreateUserConfig().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getUserPoolAddOns() == null) ? 0 : getUserPoolAddOns().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserPoolRequest clone() {
        return (CreateUserPoolRequest) super.clone();
    }

}

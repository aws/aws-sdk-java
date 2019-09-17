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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A container for information about the user pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UserPoolType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserPoolType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the user pool.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the user pool.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The policies associated with the user pool.
     * </p>
     */
    private UserPoolPolicyType policies;
    /**
     * <p>
     * The AWS Lambda triggers associated with the user pool.
     * </p>
     */
    private LambdaConfigType lambdaConfig;
    /**
     * <p>
     * The status of a user pool.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date the user pool was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The date the user pool was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * A container with the schema attributes of a user pool.
     * </p>
     */
    private java.util.List<SchemaAttributeType> schemaAttributes;
    /**
     * <p>
     * Specifies the attributes that are auto-verified in a user pool.
     * </p>
     */
    private java.util.List<String> autoVerifiedAttributes;
    /**
     * <p>
     * Specifies the attributes that are aliased in a user pool.
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
     * The contents of the SMS verification message.
     * </p>
     */
    private String smsVerificationMessage;
    /**
     * <p>
     * The contents of the email verification message.
     * </p>
     */
    private String emailVerificationMessage;
    /**
     * <p>
     * The subject of the email verification message.
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
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when you are
     * initially creating a user pool.
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
     * The device configuration.
     * </p>
     */
    private DeviceConfigurationType deviceConfiguration;
    /**
     * <p>
     * A number estimating the size of the user pool.
     * </p>
     */
    private Integer estimatedNumberOfUsers;
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
     * The tags that are assigned to the user pool. A tag is a label that you can apply to user pools to categorize and
     * manage them in different ways, such as by purpose, owner, environment, or other criteria.
     * </p>
     */
    private java.util.Map<String, String> userPoolTags;
    /**
     * <p>
     * The reason why the SMS configuration cannot send the messages to your users.
     * </p>
     */
    private String smsConfigurationFailure;
    /**
     * <p>
     * The reason why the email configuration cannot send the messages to your users.
     * </p>
     */
    private String emailConfigurationFailure;
    /**
     * <p>
     * Holds the domain prefix if the user pool has a domain associated with it.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom domain
     * to host the sign-up and sign-in pages for your application. For example: <code>auth.example.com</code>.
     * </p>
     * <p>
     * For more information about adding a custom domain to your user pool, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html">Using
     * Your Own Domain for the Hosted UI</a>.
     * </p>
     */
    private String customDomain;
    /**
     * <p>
     * The configuration for <code>AdminCreateUser</code> requests.
     * </p>
     */
    private AdminCreateUserConfigType adminCreateUserConfig;
    /**
     * <p>
     * The user pool add-ons.
     * </p>
     */
    private UserPoolAddOnsType userPoolAddOns;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the user pool.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The ID of the user pool.
     * </p>
     * 
     * @param id
     *        The ID of the user pool.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the user pool.
     * </p>
     * 
     * @return The ID of the user pool.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the user pool.
     * </p>
     * 
     * @param id
     *        The ID of the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the user pool.
     * </p>
     * 
     * @param name
     *        The name of the user pool.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the user pool.
     * </p>
     * 
     * @return The name of the user pool.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the user pool.
     * </p>
     * 
     * @param name
     *        The name of the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The policies associated with the user pool.
     * </p>
     * 
     * @param policies
     *        The policies associated with the user pool.
     */

    public void setPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
    }

    /**
     * <p>
     * The policies associated with the user pool.
     * </p>
     * 
     * @return The policies associated with the user pool.
     */

    public UserPoolPolicyType getPolicies() {
        return this.policies;
    }

    /**
     * <p>
     * The policies associated with the user pool.
     * </p>
     * 
     * @param policies
     *        The policies associated with the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withPolicies(UserPoolPolicyType policies) {
        setPolicies(policies);
        return this;
    }

    /**
     * <p>
     * The AWS Lambda triggers associated with the user pool.
     * </p>
     * 
     * @param lambdaConfig
     *        The AWS Lambda triggers associated with the user pool.
     */

    public void setLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    /**
     * <p>
     * The AWS Lambda triggers associated with the user pool.
     * </p>
     * 
     * @return The AWS Lambda triggers associated with the user pool.
     */

    public LambdaConfigType getLambdaConfig() {
        return this.lambdaConfig;
    }

    /**
     * <p>
     * The AWS Lambda triggers associated with the user pool.
     * </p>
     * 
     * @param lambdaConfig
     *        The AWS Lambda triggers associated with the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withLambdaConfig(LambdaConfigType lambdaConfig) {
        setLambdaConfig(lambdaConfig);
        return this;
    }

    /**
     * <p>
     * The status of a user pool.
     * </p>
     * 
     * @param status
     *        The status of a user pool.
     * @see StatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a user pool.
     * </p>
     * 
     * @return The status of a user pool.
     * @see StatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a user pool.
     * </p>
     * 
     * @param status
     *        The status of a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public UserPoolType withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a user pool.
     * </p>
     * 
     * @param status
     *        The status of a user pool.
     * @see StatusType
     */

    public void setStatus(StatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of a user pool.
     * </p>
     * 
     * @param status
     *        The status of a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public UserPoolType withStatus(StatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date the user pool was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the user pool was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the user pool was last modified.
     * </p>
     * 
     * @return The date the user pool was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date the user pool was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the user pool was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The date the user pool was created.
     * </p>
     * 
     * @param creationDate
     *        The date the user pool was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the user pool was created.
     * </p>
     * 
     * @return The date the user pool was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the user pool was created.
     * </p>
     * 
     * @param creationDate
     *        The date the user pool was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * A container with the schema attributes of a user pool.
     * </p>
     * 
     * @return A container with the schema attributes of a user pool.
     */

    public java.util.List<SchemaAttributeType> getSchemaAttributes() {
        return schemaAttributes;
    }

    /**
     * <p>
     * A container with the schema attributes of a user pool.
     * </p>
     * 
     * @param schemaAttributes
     *        A container with the schema attributes of a user pool.
     */

    public void setSchemaAttributes(java.util.Collection<SchemaAttributeType> schemaAttributes) {
        if (schemaAttributes == null) {
            this.schemaAttributes = null;
            return;
        }

        this.schemaAttributes = new java.util.ArrayList<SchemaAttributeType>(schemaAttributes);
    }

    /**
     * <p>
     * A container with the schema attributes of a user pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemaAttributes(java.util.Collection)} or {@link #withSchemaAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param schemaAttributes
     *        A container with the schema attributes of a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withSchemaAttributes(SchemaAttributeType... schemaAttributes) {
        if (this.schemaAttributes == null) {
            setSchemaAttributes(new java.util.ArrayList<SchemaAttributeType>(schemaAttributes.length));
        }
        for (SchemaAttributeType ele : schemaAttributes) {
            this.schemaAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A container with the schema attributes of a user pool.
     * </p>
     * 
     * @param schemaAttributes
     *        A container with the schema attributes of a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withSchemaAttributes(java.util.Collection<SchemaAttributeType> schemaAttributes) {
        setSchemaAttributes(schemaAttributes);
        return this;
    }

    /**
     * <p>
     * Specifies the attributes that are auto-verified in a user pool.
     * </p>
     * 
     * @return Specifies the attributes that are auto-verified in a user pool.
     * @see VerifiedAttributeType
     */

    public java.util.List<String> getAutoVerifiedAttributes() {
        return autoVerifiedAttributes;
    }

    /**
     * <p>
     * Specifies the attributes that are auto-verified in a user pool.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        Specifies the attributes that are auto-verified in a user pool.
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
     * Specifies the attributes that are auto-verified in a user pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoVerifiedAttributes(java.util.Collection)} or
     * {@link #withAutoVerifiedAttributes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        Specifies the attributes that are auto-verified in a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAttributeType
     */

    public UserPoolType withAutoVerifiedAttributes(String... autoVerifiedAttributes) {
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
     * Specifies the attributes that are auto-verified in a user pool.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        Specifies the attributes that are auto-verified in a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAttributeType
     */

    public UserPoolType withAutoVerifiedAttributes(java.util.Collection<String> autoVerifiedAttributes) {
        setAutoVerifiedAttributes(autoVerifiedAttributes);
        return this;
    }

    /**
     * <p>
     * Specifies the attributes that are auto-verified in a user pool.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        Specifies the attributes that are auto-verified in a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAttributeType
     */

    public UserPoolType withAutoVerifiedAttributes(VerifiedAttributeType... autoVerifiedAttributes) {
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
     * Specifies the attributes that are aliased in a user pool.
     * </p>
     * 
     * @return Specifies the attributes that are aliased in a user pool.
     * @see AliasAttributeType
     */

    public java.util.List<String> getAliasAttributes() {
        return aliasAttributes;
    }

    /**
     * <p>
     * Specifies the attributes that are aliased in a user pool.
     * </p>
     * 
     * @param aliasAttributes
     *        Specifies the attributes that are aliased in a user pool.
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
     * Specifies the attributes that are aliased in a user pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliasAttributes(java.util.Collection)} or {@link #withAliasAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param aliasAttributes
     *        Specifies the attributes that are aliased in a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AliasAttributeType
     */

    public UserPoolType withAliasAttributes(String... aliasAttributes) {
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
     * Specifies the attributes that are aliased in a user pool.
     * </p>
     * 
     * @param aliasAttributes
     *        Specifies the attributes that are aliased in a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AliasAttributeType
     */

    public UserPoolType withAliasAttributes(java.util.Collection<String> aliasAttributes) {
        setAliasAttributes(aliasAttributes);
        return this;
    }

    /**
     * <p>
     * Specifies the attributes that are aliased in a user pool.
     * </p>
     * 
     * @param aliasAttributes
     *        Specifies the attributes that are aliased in a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AliasAttributeType
     */

    public UserPoolType withAliasAttributes(AliasAttributeType... aliasAttributes) {
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

    public UserPoolType withUsernameAttributes(String... usernameAttributes) {
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

    public UserPoolType withUsernameAttributes(java.util.Collection<String> usernameAttributes) {
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

    public UserPoolType withUsernameAttributes(UsernameAttributeType... usernameAttributes) {
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
     * The contents of the SMS verification message.
     * </p>
     * 
     * @param smsVerificationMessage
     *        The contents of the SMS verification message.
     */

    public void setSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
    }

    /**
     * <p>
     * The contents of the SMS verification message.
     * </p>
     * 
     * @return The contents of the SMS verification message.
     */

    public String getSmsVerificationMessage() {
        return this.smsVerificationMessage;
    }

    /**
     * <p>
     * The contents of the SMS verification message.
     * </p>
     * 
     * @param smsVerificationMessage
     *        The contents of the SMS verification message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withSmsVerificationMessage(String smsVerificationMessage) {
        setSmsVerificationMessage(smsVerificationMessage);
        return this;
    }

    /**
     * <p>
     * The contents of the email verification message.
     * </p>
     * 
     * @param emailVerificationMessage
     *        The contents of the email verification message.
     */

    public void setEmailVerificationMessage(String emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
    }

    /**
     * <p>
     * The contents of the email verification message.
     * </p>
     * 
     * @return The contents of the email verification message.
     */

    public String getEmailVerificationMessage() {
        return this.emailVerificationMessage;
    }

    /**
     * <p>
     * The contents of the email verification message.
     * </p>
     * 
     * @param emailVerificationMessage
     *        The contents of the email verification message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withEmailVerificationMessage(String emailVerificationMessage) {
        setEmailVerificationMessage(emailVerificationMessage);
        return this;
    }

    /**
     * <p>
     * The subject of the email verification message.
     * </p>
     * 
     * @param emailVerificationSubject
     *        The subject of the email verification message.
     */

    public void setEmailVerificationSubject(String emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
    }

    /**
     * <p>
     * The subject of the email verification message.
     * </p>
     * 
     * @return The subject of the email verification message.
     */

    public String getEmailVerificationSubject() {
        return this.emailVerificationSubject;
    }

    /**
     * <p>
     * The subject of the email verification message.
     * </p>
     * 
     * @param emailVerificationSubject
     *        The subject of the email verification message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withEmailVerificationSubject(String emailVerificationSubject) {
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

    public UserPoolType withVerificationMessageTemplate(VerificationMessageTemplateType verificationMessageTemplate) {
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

    public UserPoolType withSmsAuthenticationMessage(String smsAuthenticationMessage) {
        setSmsAuthenticationMessage(smsAuthenticationMessage);
        return this;
    }

    /**
     * <p>
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when you are
     * initially creating a user pool.
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
     *        Can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when
     *        you are initially creating a user pool.
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
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when you are
     * initially creating a user pool.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when
     *         you are initially creating a user pool.
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
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when you are
     * initially creating a user pool.
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
     *        Can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when
     *        you are initially creating a user pool.
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

    public UserPoolType withMfaConfiguration(String mfaConfiguration) {
        setMfaConfiguration(mfaConfiguration);
        return this;
    }

    /**
     * <p>
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when you are
     * initially creating a user pool.
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
     *        Can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when
     *        you are initially creating a user pool.
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
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when you are
     * initially creating a user pool.
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
     *        Can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when
     *        you are initially creating a user pool.
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

    public UserPoolType withMfaConfiguration(UserPoolMfaType mfaConfiguration) {
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

    public UserPoolType withDeviceConfiguration(DeviceConfigurationType deviceConfiguration) {
        setDeviceConfiguration(deviceConfiguration);
        return this;
    }

    /**
     * <p>
     * A number estimating the size of the user pool.
     * </p>
     * 
     * @param estimatedNumberOfUsers
     *        A number estimating the size of the user pool.
     */

    public void setEstimatedNumberOfUsers(Integer estimatedNumberOfUsers) {
        this.estimatedNumberOfUsers = estimatedNumberOfUsers;
    }

    /**
     * <p>
     * A number estimating the size of the user pool.
     * </p>
     * 
     * @return A number estimating the size of the user pool.
     */

    public Integer getEstimatedNumberOfUsers() {
        return this.estimatedNumberOfUsers;
    }

    /**
     * <p>
     * A number estimating the size of the user pool.
     * </p>
     * 
     * @param estimatedNumberOfUsers
     *        A number estimating the size of the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withEstimatedNumberOfUsers(Integer estimatedNumberOfUsers) {
        setEstimatedNumberOfUsers(estimatedNumberOfUsers);
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

    public UserPoolType withEmailConfiguration(EmailConfigurationType emailConfiguration) {
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

    public UserPoolType withSmsConfiguration(SmsConfigurationType smsConfiguration) {
        setSmsConfiguration(smsConfiguration);
        return this;
    }

    /**
     * <p>
     * The tags that are assigned to the user pool. A tag is a label that you can apply to user pools to categorize and
     * manage them in different ways, such as by purpose, owner, environment, or other criteria.
     * </p>
     * 
     * @return The tags that are assigned to the user pool. A tag is a label that you can apply to user pools to
     *         categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
     */

    public java.util.Map<String, String> getUserPoolTags() {
        return userPoolTags;
    }

    /**
     * <p>
     * The tags that are assigned to the user pool. A tag is a label that you can apply to user pools to categorize and
     * manage them in different ways, such as by purpose, owner, environment, or other criteria.
     * </p>
     * 
     * @param userPoolTags
     *        The tags that are assigned to the user pool. A tag is a label that you can apply to user pools to
     *        categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
     */

    public void setUserPoolTags(java.util.Map<String, String> userPoolTags) {
        this.userPoolTags = userPoolTags;
    }

    /**
     * <p>
     * The tags that are assigned to the user pool. A tag is a label that you can apply to user pools to categorize and
     * manage them in different ways, such as by purpose, owner, environment, or other criteria.
     * </p>
     * 
     * @param userPoolTags
     *        The tags that are assigned to the user pool. A tag is a label that you can apply to user pools to
     *        categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withUserPoolTags(java.util.Map<String, String> userPoolTags) {
        setUserPoolTags(userPoolTags);
        return this;
    }

    public UserPoolType addUserPoolTagsEntry(String key, String value) {
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

    public UserPoolType clearUserPoolTagsEntries() {
        this.userPoolTags = null;
        return this;
    }

    /**
     * <p>
     * The reason why the SMS configuration cannot send the messages to your users.
     * </p>
     * 
     * @param smsConfigurationFailure
     *        The reason why the SMS configuration cannot send the messages to your users.
     */

    public void setSmsConfigurationFailure(String smsConfigurationFailure) {
        this.smsConfigurationFailure = smsConfigurationFailure;
    }

    /**
     * <p>
     * The reason why the SMS configuration cannot send the messages to your users.
     * </p>
     * 
     * @return The reason why the SMS configuration cannot send the messages to your users.
     */

    public String getSmsConfigurationFailure() {
        return this.smsConfigurationFailure;
    }

    /**
     * <p>
     * The reason why the SMS configuration cannot send the messages to your users.
     * </p>
     * 
     * @param smsConfigurationFailure
     *        The reason why the SMS configuration cannot send the messages to your users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withSmsConfigurationFailure(String smsConfigurationFailure) {
        setSmsConfigurationFailure(smsConfigurationFailure);
        return this;
    }

    /**
     * <p>
     * The reason why the email configuration cannot send the messages to your users.
     * </p>
     * 
     * @param emailConfigurationFailure
     *        The reason why the email configuration cannot send the messages to your users.
     */

    public void setEmailConfigurationFailure(String emailConfigurationFailure) {
        this.emailConfigurationFailure = emailConfigurationFailure;
    }

    /**
     * <p>
     * The reason why the email configuration cannot send the messages to your users.
     * </p>
     * 
     * @return The reason why the email configuration cannot send the messages to your users.
     */

    public String getEmailConfigurationFailure() {
        return this.emailConfigurationFailure;
    }

    /**
     * <p>
     * The reason why the email configuration cannot send the messages to your users.
     * </p>
     * 
     * @param emailConfigurationFailure
     *        The reason why the email configuration cannot send the messages to your users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withEmailConfigurationFailure(String emailConfigurationFailure) {
        setEmailConfigurationFailure(emailConfigurationFailure);
        return this;
    }

    /**
     * <p>
     * Holds the domain prefix if the user pool has a domain associated with it.
     * </p>
     * 
     * @param domain
     *        Holds the domain prefix if the user pool has a domain associated with it.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Holds the domain prefix if the user pool has a domain associated with it.
     * </p>
     * 
     * @return Holds the domain prefix if the user pool has a domain associated with it.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Holds the domain prefix if the user pool has a domain associated with it.
     * </p>
     * 
     * @param domain
     *        Holds the domain prefix if the user pool has a domain associated with it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom domain
     * to host the sign-up and sign-in pages for your application. For example: <code>auth.example.com</code>.
     * </p>
     * <p>
     * For more information about adding a custom domain to your user pool, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html">Using
     * Your Own Domain for the Hosted UI</a>.
     * </p>
     * 
     * @param customDomain
     *        A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom
     *        domain to host the sign-up and sign-in pages for your application. For example:
     *        <code>auth.example.com</code>.</p>
     *        <p>
     *        For more information about adding a custom domain to your user pool, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html"
     *        >Using Your Own Domain for the Hosted UI</a>.
     */

    public void setCustomDomain(String customDomain) {
        this.customDomain = customDomain;
    }

    /**
     * <p>
     * A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom domain
     * to host the sign-up and sign-in pages for your application. For example: <code>auth.example.com</code>.
     * </p>
     * <p>
     * For more information about adding a custom domain to your user pool, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html">Using
     * Your Own Domain for the Hosted UI</a>.
     * </p>
     * 
     * @return A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom
     *         domain to host the sign-up and sign-in pages for your application. For example:
     *         <code>auth.example.com</code>.</p>
     *         <p>
     *         For more information about adding a custom domain to your user pool, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html"
     *         >Using Your Own Domain for the Hosted UI</a>.
     */

    public String getCustomDomain() {
        return this.customDomain;
    }

    /**
     * <p>
     * A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom domain
     * to host the sign-up and sign-in pages for your application. For example: <code>auth.example.com</code>.
     * </p>
     * <p>
     * For more information about adding a custom domain to your user pool, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html">Using
     * Your Own Domain for the Hosted UI</a>.
     * </p>
     * 
     * @param customDomain
     *        A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom
     *        domain to host the sign-up and sign-in pages for your application. For example:
     *        <code>auth.example.com</code>.</p>
     *        <p>
     *        For more information about adding a custom domain to your user pool, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html"
     *        >Using Your Own Domain for the Hosted UI</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withCustomDomain(String customDomain) {
        setCustomDomain(customDomain);
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

    public UserPoolType withAdminCreateUserConfig(AdminCreateUserConfigType adminCreateUserConfig) {
        setAdminCreateUserConfig(adminCreateUserConfig);
        return this;
    }

    /**
     * <p>
     * The user pool add-ons.
     * </p>
     * 
     * @param userPoolAddOns
     *        The user pool add-ons.
     */

    public void setUserPoolAddOns(UserPoolAddOnsType userPoolAddOns) {
        this.userPoolAddOns = userPoolAddOns;
    }

    /**
     * <p>
     * The user pool add-ons.
     * </p>
     * 
     * @return The user pool add-ons.
     */

    public UserPoolAddOnsType getUserPoolAddOns() {
        return this.userPoolAddOns;
    }

    /**
     * <p>
     * The user pool add-ons.
     * </p>
     * 
     * @param userPoolAddOns
     *        The user pool add-ons.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withUserPoolAddOns(UserPoolAddOnsType userPoolAddOns) {
        setUserPoolAddOns(userPoolAddOns);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the user pool.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the user pool.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the user pool.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the user pool.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the user pool.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withArn(String arn) {
        setArn(arn);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPolicies() != null)
            sb.append("Policies: ").append(getPolicies()).append(",");
        if (getLambdaConfig() != null)
            sb.append("LambdaConfig: ").append(getLambdaConfig()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getSchemaAttributes() != null)
            sb.append("SchemaAttributes: ").append(getSchemaAttributes()).append(",");
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
        if (getEstimatedNumberOfUsers() != null)
            sb.append("EstimatedNumberOfUsers: ").append(getEstimatedNumberOfUsers()).append(",");
        if (getEmailConfiguration() != null)
            sb.append("EmailConfiguration: ").append(getEmailConfiguration()).append(",");
        if (getSmsConfiguration() != null)
            sb.append("SmsConfiguration: ").append(getSmsConfiguration()).append(",");
        if (getUserPoolTags() != null)
            sb.append("UserPoolTags: ").append(getUserPoolTags()).append(",");
        if (getSmsConfigurationFailure() != null)
            sb.append("SmsConfigurationFailure: ").append(getSmsConfigurationFailure()).append(",");
        if (getEmailConfigurationFailure() != null)
            sb.append("EmailConfigurationFailure: ").append(getEmailConfigurationFailure()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getCustomDomain() != null)
            sb.append("CustomDomain: ").append(getCustomDomain()).append(",");
        if (getAdminCreateUserConfig() != null)
            sb.append("AdminCreateUserConfig: ").append(getAdminCreateUserConfig()).append(",");
        if (getUserPoolAddOns() != null)
            sb.append("UserPoolAddOns: ").append(getUserPoolAddOns()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserPoolType == false)
            return false;
        UserPoolType other = (UserPoolType) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        if (other.getLambdaConfig() == null ^ this.getLambdaConfig() == null)
            return false;
        if (other.getLambdaConfig() != null && other.getLambdaConfig().equals(this.getLambdaConfig()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getSchemaAttributes() == null ^ this.getSchemaAttributes() == null)
            return false;
        if (other.getSchemaAttributes() != null && other.getSchemaAttributes().equals(this.getSchemaAttributes()) == false)
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
        if (other.getEstimatedNumberOfUsers() == null ^ this.getEstimatedNumberOfUsers() == null)
            return false;
        if (other.getEstimatedNumberOfUsers() != null && other.getEstimatedNumberOfUsers().equals(this.getEstimatedNumberOfUsers()) == false)
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
        if (other.getSmsConfigurationFailure() == null ^ this.getSmsConfigurationFailure() == null)
            return false;
        if (other.getSmsConfigurationFailure() != null && other.getSmsConfigurationFailure().equals(this.getSmsConfigurationFailure()) == false)
            return false;
        if (other.getEmailConfigurationFailure() == null ^ this.getEmailConfigurationFailure() == null)
            return false;
        if (other.getEmailConfigurationFailure() != null && other.getEmailConfigurationFailure().equals(this.getEmailConfigurationFailure()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getCustomDomain() == null ^ this.getCustomDomain() == null)
            return false;
        if (other.getCustomDomain() != null && other.getCustomDomain().equals(this.getCustomDomain()) == false)
            return false;
        if (other.getAdminCreateUserConfig() == null ^ this.getAdminCreateUserConfig() == null)
            return false;
        if (other.getAdminCreateUserConfig() != null && other.getAdminCreateUserConfig().equals(this.getAdminCreateUserConfig()) == false)
            return false;
        if (other.getUserPoolAddOns() == null ^ this.getUserPoolAddOns() == null)
            return false;
        if (other.getUserPoolAddOns() != null && other.getUserPoolAddOns().equals(this.getUserPoolAddOns()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        hashCode = prime * hashCode + ((getLambdaConfig() == null) ? 0 : getLambdaConfig().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getSchemaAttributes() == null) ? 0 : getSchemaAttributes().hashCode());
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
        hashCode = prime * hashCode + ((getEstimatedNumberOfUsers() == null) ? 0 : getEstimatedNumberOfUsers().hashCode());
        hashCode = prime * hashCode + ((getEmailConfiguration() == null) ? 0 : getEmailConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSmsConfiguration() == null) ? 0 : getSmsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUserPoolTags() == null) ? 0 : getUserPoolTags().hashCode());
        hashCode = prime * hashCode + ((getSmsConfigurationFailure() == null) ? 0 : getSmsConfigurationFailure().hashCode());
        hashCode = prime * hashCode + ((getEmailConfigurationFailure() == null) ? 0 : getEmailConfigurationFailure().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getCustomDomain() == null) ? 0 : getCustomDomain().hashCode());
        hashCode = prime * hashCode + ((getAdminCreateUserConfig() == null) ? 0 : getAdminCreateUserConfig().hashCode());
        hashCode = prime * hashCode + ((getUserPoolAddOns() == null) ? 0 : getUserPoolAddOns().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public UserPoolType clone() {
        try {
            return (UserPoolType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.UserPoolTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

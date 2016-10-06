/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A container with information about the user pool type.
 * </p>
 */
public class UserPoolType implements Serializable, Cloneable {

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
     * A container describing the policies associated with a user pool.
     * </p>
     */
    private UserPoolPolicyType policies;
    /**
     * <p>
     * A container describing the AWS Lambda triggers associated with a user pool.
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
     * The last modified date of a user pool.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The creation date of a user pool.
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
     * The reason why the SMS configuration cannot send the message(s) to your users.
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
     * The configuration for AdminCreateUser requests.
     * </p>
     */
    private AdminCreateUserConfigType adminCreateUserConfig;

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
     * A container describing the policies associated with a user pool.
     * </p>
     * 
     * @param policies
     *        A container describing the policies associated with a user pool.
     */

    public void setPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
    }

    /**
     * <p>
     * A container describing the policies associated with a user pool.
     * </p>
     * 
     * @return A container describing the policies associated with a user pool.
     */

    public UserPoolPolicyType getPolicies() {
        return this.policies;
    }

    /**
     * <p>
     * A container describing the policies associated with a user pool.
     * </p>
     * 
     * @param policies
     *        A container describing the policies associated with a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withPolicies(UserPoolPolicyType policies) {
        setPolicies(policies);
        return this;
    }

    /**
     * <p>
     * A container describing the AWS Lambda triggers associated with a user pool.
     * </p>
     * 
     * @param lambdaConfig
     *        A container describing the AWS Lambda triggers associated with a user pool.
     */

    public void setLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    /**
     * <p>
     * A container describing the AWS Lambda triggers associated with a user pool.
     * </p>
     * 
     * @return A container describing the AWS Lambda triggers associated with a user pool.
     */

    public LambdaConfigType getLambdaConfig() {
        return this.lambdaConfig;
    }

    /**
     * <p>
     * A container describing the AWS Lambda triggers associated with a user pool.
     * </p>
     * 
     * @param lambdaConfig
     *        A container describing the AWS Lambda triggers associated with a user pool.
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
        this.status = status.toString();
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
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The last modified date of a user pool.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last modified date of a user pool.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last modified date of a user pool.
     * </p>
     * 
     * @return The last modified date of a user pool.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The last modified date of a user pool.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last modified date of a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The creation date of a user pool.
     * </p>
     * 
     * @param creationDate
     *        The creation date of a user pool.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date of a user pool.
     * </p>
     * 
     * @return The creation date of a user pool.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date of a user pool.
     * </p>
     * 
     * @param creationDate
     *        The creation date of a user pool.
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
        this.mfaConfiguration = mfaConfiguration.toString();
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
        setMfaConfiguration(mfaConfiguration);
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
     * The reason why the SMS configuration cannot send the message(s) to your users.
     * </p>
     * 
     * @param smsConfigurationFailure
     *        The reason why the SMS configuration cannot send the message(s) to your users.
     */

    public void setSmsConfigurationFailure(String smsConfigurationFailure) {
        this.smsConfigurationFailure = smsConfigurationFailure;
    }

    /**
     * <p>
     * The reason why the SMS configuration cannot send the message(s) to your users.
     * </p>
     * 
     * @return The reason why the SMS configuration cannot send the message(s) to your users.
     */

    public String getSmsConfigurationFailure() {
        return this.smsConfigurationFailure;
    }

    /**
     * <p>
     * The reason why the SMS configuration cannot send the message(s) to your users.
     * </p>
     * 
     * @param smsConfigurationFailure
     *        The reason why the SMS configuration cannot send the message(s) to your users.
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
     * The configuration for AdminCreateUser requests.
     * </p>
     * 
     * @param adminCreateUserConfig
     *        The configuration for AdminCreateUser requests.
     */

    public void setAdminCreateUserConfig(AdminCreateUserConfigType adminCreateUserConfig) {
        this.adminCreateUserConfig = adminCreateUserConfig;
    }

    /**
     * <p>
     * The configuration for AdminCreateUser requests.
     * </p>
     * 
     * @return The configuration for AdminCreateUser requests.
     */

    public AdminCreateUserConfigType getAdminCreateUserConfig() {
        return this.adminCreateUserConfig;
    }

    /**
     * <p>
     * The configuration for AdminCreateUser requests.
     * </p>
     * 
     * @param adminCreateUserConfig
     *        The configuration for AdminCreateUser requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolType withAdminCreateUserConfig(AdminCreateUserConfigType adminCreateUserConfig) {
        setAdminCreateUserConfig(adminCreateUserConfig);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getPolicies() != null)
            sb.append("Policies: " + getPolicies() + ",");
        if (getLambdaConfig() != null)
            sb.append("LambdaConfig: " + getLambdaConfig() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getSchemaAttributes() != null)
            sb.append("SchemaAttributes: " + getSchemaAttributes() + ",");
        if (getAutoVerifiedAttributes() != null)
            sb.append("AutoVerifiedAttributes: " + getAutoVerifiedAttributes() + ",");
        if (getAliasAttributes() != null)
            sb.append("AliasAttributes: " + getAliasAttributes() + ",");
        if (getSmsVerificationMessage() != null)
            sb.append("SmsVerificationMessage: " + getSmsVerificationMessage() + ",");
        if (getEmailVerificationMessage() != null)
            sb.append("EmailVerificationMessage: " + getEmailVerificationMessage() + ",");
        if (getEmailVerificationSubject() != null)
            sb.append("EmailVerificationSubject: " + getEmailVerificationSubject() + ",");
        if (getSmsAuthenticationMessage() != null)
            sb.append("SmsAuthenticationMessage: " + getSmsAuthenticationMessage() + ",");
        if (getMfaConfiguration() != null)
            sb.append("MfaConfiguration: " + getMfaConfiguration() + ",");
        if (getDeviceConfiguration() != null)
            sb.append("DeviceConfiguration: " + getDeviceConfiguration() + ",");
        if (getEstimatedNumberOfUsers() != null)
            sb.append("EstimatedNumberOfUsers: " + getEstimatedNumberOfUsers() + ",");
        if (getEmailConfiguration() != null)
            sb.append("EmailConfiguration: " + getEmailConfiguration() + ",");
        if (getSmsConfiguration() != null)
            sb.append("SmsConfiguration: " + getSmsConfiguration() + ",");
        if (getSmsConfigurationFailure() != null)
            sb.append("SmsConfigurationFailure: " + getSmsConfigurationFailure() + ",");
        if (getEmailConfigurationFailure() != null)
            sb.append("EmailConfigurationFailure: " + getEmailConfigurationFailure() + ",");
        if (getAdminCreateUserConfig() != null)
            sb.append("AdminCreateUserConfig: " + getAdminCreateUserConfig());
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
        if (other.getSmsConfigurationFailure() == null ^ this.getSmsConfigurationFailure() == null)
            return false;
        if (other.getSmsConfigurationFailure() != null && other.getSmsConfigurationFailure().equals(this.getSmsConfigurationFailure()) == false)
            return false;
        if (other.getEmailConfigurationFailure() == null ^ this.getEmailConfigurationFailure() == null)
            return false;
        if (other.getEmailConfigurationFailure() != null && other.getEmailConfigurationFailure().equals(this.getEmailConfigurationFailure()) == false)
            return false;
        if (other.getAdminCreateUserConfig() == null ^ this.getAdminCreateUserConfig() == null)
            return false;
        if (other.getAdminCreateUserConfig() != null && other.getAdminCreateUserConfig().equals(this.getAdminCreateUserConfig()) == false)
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
        hashCode = prime * hashCode + ((getSmsVerificationMessage() == null) ? 0 : getSmsVerificationMessage().hashCode());
        hashCode = prime * hashCode + ((getEmailVerificationMessage() == null) ? 0 : getEmailVerificationMessage().hashCode());
        hashCode = prime * hashCode + ((getEmailVerificationSubject() == null) ? 0 : getEmailVerificationSubject().hashCode());
        hashCode = prime * hashCode + ((getSmsAuthenticationMessage() == null) ? 0 : getSmsAuthenticationMessage().hashCode());
        hashCode = prime * hashCode + ((getMfaConfiguration() == null) ? 0 : getMfaConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeviceConfiguration() == null) ? 0 : getDeviceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEstimatedNumberOfUsers() == null) ? 0 : getEstimatedNumberOfUsers().hashCode());
        hashCode = prime * hashCode + ((getEmailConfiguration() == null) ? 0 : getEmailConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSmsConfiguration() == null) ? 0 : getSmsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSmsConfigurationFailure() == null) ? 0 : getSmsConfigurationFailure().hashCode());
        hashCode = prime * hashCode + ((getEmailConfigurationFailure() == null) ? 0 : getEmailConfigurationFailure().hashCode());
        hashCode = prime * hashCode + ((getAdminCreateUserConfig() == null) ? 0 : getAdminCreateUserConfig().hashCode());
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
}

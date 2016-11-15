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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to create a user pool.
 * </p>
 */
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
     * The configuration for AdminCreateUser requests.
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
     * 
     * @param lambdaConfig
     *        The Lambda trigger configuration information for the new user pool.
     */

    public void setLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    /**
     * <p>
     * The Lambda trigger configuration information for the new user pool.
     * </p>
     * 
     * @return The Lambda trigger configuration information for the new user pool.
     */

    public LambdaConfigType getLambdaConfig() {
        return this.lambdaConfig;
    }

    /**
     * <p>
     * The Lambda trigger configuration information for the new user pool.
     * </p>
     * 
     * @param lambdaConfig
     *        The Lambda trigger configuration information for the new user pool.
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
        this.mfaConfiguration = mfaConfiguration.toString();
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
        if (getPoolName() != null)
            sb.append("PoolName: " + getPoolName() + ",");
        if (getPolicies() != null)
            sb.append("Policies: " + getPolicies() + ",");
        if (getLambdaConfig() != null)
            sb.append("LambdaConfig: " + getLambdaConfig() + ",");
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
        if (getEmailConfiguration() != null)
            sb.append("EmailConfiguration: " + getEmailConfiguration() + ",");
        if (getSmsConfiguration() != null)
            sb.append("SmsConfiguration: " + getSmsConfiguration() + ",");
        if (getAdminCreateUserConfig() != null)
            sb.append("AdminCreateUserConfig: " + getAdminCreateUserConfig() + ",");
        if (getSchema() != null)
            sb.append("Schema: " + getSchema());
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
        if (other.getEmailConfiguration() == null ^ this.getEmailConfiguration() == null)
            return false;
        if (other.getEmailConfiguration() != null && other.getEmailConfiguration().equals(this.getEmailConfiguration()) == false)
            return false;
        if (other.getSmsConfiguration() == null ^ this.getSmsConfiguration() == null)
            return false;
        if (other.getSmsConfiguration() != null && other.getSmsConfiguration().equals(this.getSmsConfiguration()) == false)
            return false;
        if (other.getAdminCreateUserConfig() == null ^ this.getAdminCreateUserConfig() == null)
            return false;
        if (other.getAdminCreateUserConfig() != null && other.getAdminCreateUserConfig().equals(this.getAdminCreateUserConfig()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
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
        hashCode = prime * hashCode + ((getSmsVerificationMessage() == null) ? 0 : getSmsVerificationMessage().hashCode());
        hashCode = prime * hashCode + ((getEmailVerificationMessage() == null) ? 0 : getEmailVerificationMessage().hashCode());
        hashCode = prime * hashCode + ((getEmailVerificationSubject() == null) ? 0 : getEmailVerificationSubject().hashCode());
        hashCode = prime * hashCode + ((getSmsAuthenticationMessage() == null) ? 0 : getSmsAuthenticationMessage().hashCode());
        hashCode = prime * hashCode + ((getMfaConfiguration() == null) ? 0 : getMfaConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeviceConfiguration() == null) ? 0 : getDeviceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEmailConfiguration() == null) ? 0 : getEmailConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSmsConfiguration() == null) ? 0 : getSmsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAdminCreateUserConfig() == null) ? 0 : getAdminCreateUserConfig().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserPoolRequest clone() {
        return (CreateUserPoolRequest) super.clone();
    }
}

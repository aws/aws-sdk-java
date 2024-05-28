/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A list of the user attributes and their properties in your user pool. The attribute schema contains standard
 * attributes, custom attributes with a <code>custom:</code> prefix, and developer attributes with a <code>dev:</code>
 * prefix. For more information, see <a
 * href="https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html">User pool
 * attributes</a>.
 * </p>
 * <p>
 * Developer-only attributes are a legacy feature of user pools, are read-only to all app clients. You can create and
 * update developer-only attributes only with IAM-authenticated API operations. Use app client read/write permissions
 * instead.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SchemaAttributeType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaAttributeType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of your user pool attribute. When you create or update a user pool, adding a schema attribute creates a
     * custom or developer-only attribute. When you add an attribute with a <code>Name</code> value of
     * <code>MyAttribute</code>, Amazon Cognito creates the custom attribute <code>custom:MyAttribute</code>. When
     * <code>DeveloperOnlyAttribute</code> is <code>true</code>, Amazon Cognito creates your attribute as
     * <code>dev:MyAttribute</code>. In an operation that describes a user pool, Amazon Cognito returns this value as
     * <code>value</code> for standard attributes, <code>custom:value</code> for custom attributes, and
     * <code>dev:value</code> for developer-only attributes..
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data format of the values for your attribute. When you choose an <code>AttributeDataType</code>, Amazon
     * Cognito validates the input against the data type. A custom attribute value in your user's ID token is always a
     * string, for example <code>"custom:isMember" : "true"</code> or <code>"custom:YearsAsMember" : "12"</code>.
     * </p>
     */
    private String attributeDataType;
    /**
     * <note>
     * <p>
     * You should use <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes"
     * >WriteAttributes</a> in the user pool client to control how attributes can be mutated for new use cases instead
     * of using <code>DeveloperOnlyAttribute</code>.
     * </p>
     * </note>
     * <p>
     * Specifies whether the attribute type is developer only. This attribute can only be modified by an administrator.
     * Users won't be able to modify this attribute using their access token. For example,
     * <code>DeveloperOnlyAttribute</code> can be modified using AdminUpdateUserAttributes but can't be updated using
     * UpdateUserAttributes.
     * </p>
     */
    private Boolean developerOnlyAttribute;
    /**
     * <p>
     * Specifies whether the value of the attribute can be changed.
     * </p>
     * <p>
     * Any user pool attribute whose value you map from an IdP attribute must be mutable, with a parameter value of
     * <code>true</code>. Amazon Cognito updates mapped attributes when users sign in to your application through an
     * IdP. If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the attribute. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     * >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * </p>
     */
    private Boolean mutable;
    /**
     * <p>
     * Specifies whether a user pool attribute is required. If the attribute is required and the user doesn't provide a
     * value, registration or sign-in will fail.
     * </p>
     */
    private Boolean required;
    /**
     * <p>
     * Specifies the constraints for an attribute of the number type.
     * </p>
     */
    private NumberAttributeConstraintsType numberAttributeConstraints;
    /**
     * <p>
     * Specifies the constraints for an attribute of the string type.
     * </p>
     */
    private StringAttributeConstraintsType stringAttributeConstraints;

    /**
     * <p>
     * The name of your user pool attribute. When you create or update a user pool, adding a schema attribute creates a
     * custom or developer-only attribute. When you add an attribute with a <code>Name</code> value of
     * <code>MyAttribute</code>, Amazon Cognito creates the custom attribute <code>custom:MyAttribute</code>. When
     * <code>DeveloperOnlyAttribute</code> is <code>true</code>, Amazon Cognito creates your attribute as
     * <code>dev:MyAttribute</code>. In an operation that describes a user pool, Amazon Cognito returns this value as
     * <code>value</code> for standard attributes, <code>custom:value</code> for custom attributes, and
     * <code>dev:value</code> for developer-only attributes..
     * </p>
     * 
     * @param name
     *        The name of your user pool attribute. When you create or update a user pool, adding a schema attribute
     *        creates a custom or developer-only attribute. When you add an attribute with a <code>Name</code> value of
     *        <code>MyAttribute</code>, Amazon Cognito creates the custom attribute <code>custom:MyAttribute</code>.
     *        When <code>DeveloperOnlyAttribute</code> is <code>true</code>, Amazon Cognito creates your attribute as
     *        <code>dev:MyAttribute</code>. In an operation that describes a user pool, Amazon Cognito returns this
     *        value as <code>value</code> for standard attributes, <code>custom:value</code> for custom attributes, and
     *        <code>dev:value</code> for developer-only attributes..
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of your user pool attribute. When you create or update a user pool, adding a schema attribute creates a
     * custom or developer-only attribute. When you add an attribute with a <code>Name</code> value of
     * <code>MyAttribute</code>, Amazon Cognito creates the custom attribute <code>custom:MyAttribute</code>. When
     * <code>DeveloperOnlyAttribute</code> is <code>true</code>, Amazon Cognito creates your attribute as
     * <code>dev:MyAttribute</code>. In an operation that describes a user pool, Amazon Cognito returns this value as
     * <code>value</code> for standard attributes, <code>custom:value</code> for custom attributes, and
     * <code>dev:value</code> for developer-only attributes..
     * </p>
     * 
     * @return The name of your user pool attribute. When you create or update a user pool, adding a schema attribute
     *         creates a custom or developer-only attribute. When you add an attribute with a <code>Name</code> value of
     *         <code>MyAttribute</code>, Amazon Cognito creates the custom attribute <code>custom:MyAttribute</code>.
     *         When <code>DeveloperOnlyAttribute</code> is <code>true</code>, Amazon Cognito creates your attribute as
     *         <code>dev:MyAttribute</code>. In an operation that describes a user pool, Amazon Cognito returns this
     *         value as <code>value</code> for standard attributes, <code>custom:value</code> for custom attributes, and
     *         <code>dev:value</code> for developer-only attributes..
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of your user pool attribute. When you create or update a user pool, adding a schema attribute creates a
     * custom or developer-only attribute. When you add an attribute with a <code>Name</code> value of
     * <code>MyAttribute</code>, Amazon Cognito creates the custom attribute <code>custom:MyAttribute</code>. When
     * <code>DeveloperOnlyAttribute</code> is <code>true</code>, Amazon Cognito creates your attribute as
     * <code>dev:MyAttribute</code>. In an operation that describes a user pool, Amazon Cognito returns this value as
     * <code>value</code> for standard attributes, <code>custom:value</code> for custom attributes, and
     * <code>dev:value</code> for developer-only attributes..
     * </p>
     * 
     * @param name
     *        The name of your user pool attribute. When you create or update a user pool, adding a schema attribute
     *        creates a custom or developer-only attribute. When you add an attribute with a <code>Name</code> value of
     *        <code>MyAttribute</code>, Amazon Cognito creates the custom attribute <code>custom:MyAttribute</code>.
     *        When <code>DeveloperOnlyAttribute</code> is <code>true</code>, Amazon Cognito creates your attribute as
     *        <code>dev:MyAttribute</code>. In an operation that describes a user pool, Amazon Cognito returns this
     *        value as <code>value</code> for standard attributes, <code>custom:value</code> for custom attributes, and
     *        <code>dev:value</code> for developer-only attributes..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaAttributeType withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data format of the values for your attribute. When you choose an <code>AttributeDataType</code>, Amazon
     * Cognito validates the input against the data type. A custom attribute value in your user's ID token is always a
     * string, for example <code>"custom:isMember" : "true"</code> or <code>"custom:YearsAsMember" : "12"</code>.
     * </p>
     * 
     * @param attributeDataType
     *        The data format of the values for your attribute. When you choose an <code>AttributeDataType</code>,
     *        Amazon Cognito validates the input against the data type. A custom attribute value in your user's ID token
     *        is always a string, for example <code>"custom:isMember" : "true"</code> or
     *        <code>"custom:YearsAsMember" : "12"</code>.
     * @see AttributeDataType
     */

    public void setAttributeDataType(String attributeDataType) {
        this.attributeDataType = attributeDataType;
    }

    /**
     * <p>
     * The data format of the values for your attribute. When you choose an <code>AttributeDataType</code>, Amazon
     * Cognito validates the input against the data type. A custom attribute value in your user's ID token is always a
     * string, for example <code>"custom:isMember" : "true"</code> or <code>"custom:YearsAsMember" : "12"</code>.
     * </p>
     * 
     * @return The data format of the values for your attribute. When you choose an <code>AttributeDataType</code>,
     *         Amazon Cognito validates the input against the data type. A custom attribute value in your user's ID
     *         token is always a string, for example <code>"custom:isMember" : "true"</code> or
     *         <code>"custom:YearsAsMember" : "12"</code>.
     * @see AttributeDataType
     */

    public String getAttributeDataType() {
        return this.attributeDataType;
    }

    /**
     * <p>
     * The data format of the values for your attribute. When you choose an <code>AttributeDataType</code>, Amazon
     * Cognito validates the input against the data type. A custom attribute value in your user's ID token is always a
     * string, for example <code>"custom:isMember" : "true"</code> or <code>"custom:YearsAsMember" : "12"</code>.
     * </p>
     * 
     * @param attributeDataType
     *        The data format of the values for your attribute. When you choose an <code>AttributeDataType</code>,
     *        Amazon Cognito validates the input against the data type. A custom attribute value in your user's ID token
     *        is always a string, for example <code>"custom:isMember" : "true"</code> or
     *        <code>"custom:YearsAsMember" : "12"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeDataType
     */

    public SchemaAttributeType withAttributeDataType(String attributeDataType) {
        setAttributeDataType(attributeDataType);
        return this;
    }

    /**
     * <p>
     * The data format of the values for your attribute. When you choose an <code>AttributeDataType</code>, Amazon
     * Cognito validates the input against the data type. A custom attribute value in your user's ID token is always a
     * string, for example <code>"custom:isMember" : "true"</code> or <code>"custom:YearsAsMember" : "12"</code>.
     * </p>
     * 
     * @param attributeDataType
     *        The data format of the values for your attribute. When you choose an <code>AttributeDataType</code>,
     *        Amazon Cognito validates the input against the data type. A custom attribute value in your user's ID token
     *        is always a string, for example <code>"custom:isMember" : "true"</code> or
     *        <code>"custom:YearsAsMember" : "12"</code>.
     * @see AttributeDataType
     */

    public void setAttributeDataType(AttributeDataType attributeDataType) {
        withAttributeDataType(attributeDataType);
    }

    /**
     * <p>
     * The data format of the values for your attribute. When you choose an <code>AttributeDataType</code>, Amazon
     * Cognito validates the input against the data type. A custom attribute value in your user's ID token is always a
     * string, for example <code>"custom:isMember" : "true"</code> or <code>"custom:YearsAsMember" : "12"</code>.
     * </p>
     * 
     * @param attributeDataType
     *        The data format of the values for your attribute. When you choose an <code>AttributeDataType</code>,
     *        Amazon Cognito validates the input against the data type. A custom attribute value in your user's ID token
     *        is always a string, for example <code>"custom:isMember" : "true"</code> or
     *        <code>"custom:YearsAsMember" : "12"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeDataType
     */

    public SchemaAttributeType withAttributeDataType(AttributeDataType attributeDataType) {
        this.attributeDataType = attributeDataType.toString();
        return this;
    }

    /**
     * <note>
     * <p>
     * You should use <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes"
     * >WriteAttributes</a> in the user pool client to control how attributes can be mutated for new use cases instead
     * of using <code>DeveloperOnlyAttribute</code>.
     * </p>
     * </note>
     * <p>
     * Specifies whether the attribute type is developer only. This attribute can only be modified by an administrator.
     * Users won't be able to modify this attribute using their access token. For example,
     * <code>DeveloperOnlyAttribute</code> can be modified using AdminUpdateUserAttributes but can't be updated using
     * UpdateUserAttributes.
     * </p>
     * 
     * @param developerOnlyAttribute
     *        <p>
     *        You should use <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes"
     *        >WriteAttributes</a> in the user pool client to control how attributes can be mutated for new use cases
     *        instead of using <code>DeveloperOnlyAttribute</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Specifies whether the attribute type is developer only. This attribute can only be modified by an
     *        administrator. Users won't be able to modify this attribute using their access token. For example,
     *        <code>DeveloperOnlyAttribute</code> can be modified using AdminUpdateUserAttributes but can't be updated
     *        using UpdateUserAttributes.
     */

    public void setDeveloperOnlyAttribute(Boolean developerOnlyAttribute) {
        this.developerOnlyAttribute = developerOnlyAttribute;
    }

    /**
     * <note>
     * <p>
     * You should use <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes"
     * >WriteAttributes</a> in the user pool client to control how attributes can be mutated for new use cases instead
     * of using <code>DeveloperOnlyAttribute</code>.
     * </p>
     * </note>
     * <p>
     * Specifies whether the attribute type is developer only. This attribute can only be modified by an administrator.
     * Users won't be able to modify this attribute using their access token. For example,
     * <code>DeveloperOnlyAttribute</code> can be modified using AdminUpdateUserAttributes but can't be updated using
     * UpdateUserAttributes.
     * </p>
     * 
     * @return <p>
     *         You should use <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes"
     *         >WriteAttributes</a> in the user pool client to control how attributes can be mutated for new use cases
     *         instead of using <code>DeveloperOnlyAttribute</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Specifies whether the attribute type is developer only. This attribute can only be modified by an
     *         administrator. Users won't be able to modify this attribute using their access token. For example,
     *         <code>DeveloperOnlyAttribute</code> can be modified using AdminUpdateUserAttributes but can't be updated
     *         using UpdateUserAttributes.
     */

    public Boolean getDeveloperOnlyAttribute() {
        return this.developerOnlyAttribute;
    }

    /**
     * <note>
     * <p>
     * You should use <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes"
     * >WriteAttributes</a> in the user pool client to control how attributes can be mutated for new use cases instead
     * of using <code>DeveloperOnlyAttribute</code>.
     * </p>
     * </note>
     * <p>
     * Specifies whether the attribute type is developer only. This attribute can only be modified by an administrator.
     * Users won't be able to modify this attribute using their access token. For example,
     * <code>DeveloperOnlyAttribute</code> can be modified using AdminUpdateUserAttributes but can't be updated using
     * UpdateUserAttributes.
     * </p>
     * 
     * @param developerOnlyAttribute
     *        <p>
     *        You should use <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes"
     *        >WriteAttributes</a> in the user pool client to control how attributes can be mutated for new use cases
     *        instead of using <code>DeveloperOnlyAttribute</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Specifies whether the attribute type is developer only. This attribute can only be modified by an
     *        administrator. Users won't be able to modify this attribute using their access token. For example,
     *        <code>DeveloperOnlyAttribute</code> can be modified using AdminUpdateUserAttributes but can't be updated
     *        using UpdateUserAttributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaAttributeType withDeveloperOnlyAttribute(Boolean developerOnlyAttribute) {
        setDeveloperOnlyAttribute(developerOnlyAttribute);
        return this;
    }

    /**
     * <note>
     * <p>
     * You should use <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes"
     * >WriteAttributes</a> in the user pool client to control how attributes can be mutated for new use cases instead
     * of using <code>DeveloperOnlyAttribute</code>.
     * </p>
     * </note>
     * <p>
     * Specifies whether the attribute type is developer only. This attribute can only be modified by an administrator.
     * Users won't be able to modify this attribute using their access token. For example,
     * <code>DeveloperOnlyAttribute</code> can be modified using AdminUpdateUserAttributes but can't be updated using
     * UpdateUserAttributes.
     * </p>
     * 
     * @return <p>
     *         You should use <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UserPoolClientType.html#CognitoUserPools-Type-UserPoolClientType-WriteAttributes"
     *         >WriteAttributes</a> in the user pool client to control how attributes can be mutated for new use cases
     *         instead of using <code>DeveloperOnlyAttribute</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Specifies whether the attribute type is developer only. This attribute can only be modified by an
     *         administrator. Users won't be able to modify this attribute using their access token. For example,
     *         <code>DeveloperOnlyAttribute</code> can be modified using AdminUpdateUserAttributes but can't be updated
     *         using UpdateUserAttributes.
     */

    public Boolean isDeveloperOnlyAttribute() {
        return this.developerOnlyAttribute;
    }

    /**
     * <p>
     * Specifies whether the value of the attribute can be changed.
     * </p>
     * <p>
     * Any user pool attribute whose value you map from an IdP attribute must be mutable, with a parameter value of
     * <code>true</code>. Amazon Cognito updates mapped attributes when users sign in to your application through an
     * IdP. If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the attribute. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     * >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * </p>
     * 
     * @param mutable
     *        Specifies whether the value of the attribute can be changed.</p>
     *        <p>
     *        Any user pool attribute whose value you map from an IdP attribute must be mutable, with a parameter value
     *        of <code>true</code>. Amazon Cognito updates mapped attributes when users sign in to your application
     *        through an IdP. If an attribute is immutable, Amazon Cognito throws an error when it attempts to update
     *        the attribute. For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     *        >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     */

    public void setMutable(Boolean mutable) {
        this.mutable = mutable;
    }

    /**
     * <p>
     * Specifies whether the value of the attribute can be changed.
     * </p>
     * <p>
     * Any user pool attribute whose value you map from an IdP attribute must be mutable, with a parameter value of
     * <code>true</code>. Amazon Cognito updates mapped attributes when users sign in to your application through an
     * IdP. If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the attribute. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     * >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * </p>
     * 
     * @return Specifies whether the value of the attribute can be changed.</p>
     *         <p>
     *         Any user pool attribute whose value you map from an IdP attribute must be mutable, with a parameter value
     *         of <code>true</code>. Amazon Cognito updates mapped attributes when users sign in to your application
     *         through an IdP. If an attribute is immutable, Amazon Cognito throws an error when it attempts to update
     *         the attribute. For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     *         >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     */

    public Boolean getMutable() {
        return this.mutable;
    }

    /**
     * <p>
     * Specifies whether the value of the attribute can be changed.
     * </p>
     * <p>
     * Any user pool attribute whose value you map from an IdP attribute must be mutable, with a parameter value of
     * <code>true</code>. Amazon Cognito updates mapped attributes when users sign in to your application through an
     * IdP. If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the attribute. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     * >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * </p>
     * 
     * @param mutable
     *        Specifies whether the value of the attribute can be changed.</p>
     *        <p>
     *        Any user pool attribute whose value you map from an IdP attribute must be mutable, with a parameter value
     *        of <code>true</code>. Amazon Cognito updates mapped attributes when users sign in to your application
     *        through an IdP. If an attribute is immutable, Amazon Cognito throws an error when it attempts to update
     *        the attribute. For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     *        >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaAttributeType withMutable(Boolean mutable) {
        setMutable(mutable);
        return this;
    }

    /**
     * <p>
     * Specifies whether the value of the attribute can be changed.
     * </p>
     * <p>
     * Any user pool attribute whose value you map from an IdP attribute must be mutable, with a parameter value of
     * <code>true</code>. Amazon Cognito updates mapped attributes when users sign in to your application through an
     * IdP. If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the attribute. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     * >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * </p>
     * 
     * @return Specifies whether the value of the attribute can be changed.</p>
     *         <p>
     *         Any user pool attribute whose value you map from an IdP attribute must be mutable, with a parameter value
     *         of <code>true</code>. Amazon Cognito updates mapped attributes when users sign in to your application
     *         through an IdP. If an attribute is immutable, Amazon Cognito throws an error when it attempts to update
     *         the attribute. For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     *         >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     */

    public Boolean isMutable() {
        return this.mutable;
    }

    /**
     * <p>
     * Specifies whether a user pool attribute is required. If the attribute is required and the user doesn't provide a
     * value, registration or sign-in will fail.
     * </p>
     * 
     * @param required
     *        Specifies whether a user pool attribute is required. If the attribute is required and the user doesn't
     *        provide a value, registration or sign-in will fail.
     */

    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * Specifies whether a user pool attribute is required. If the attribute is required and the user doesn't provide a
     * value, registration or sign-in will fail.
     * </p>
     * 
     * @return Specifies whether a user pool attribute is required. If the attribute is required and the user doesn't
     *         provide a value, registration or sign-in will fail.
     */

    public Boolean getRequired() {
        return this.required;
    }

    /**
     * <p>
     * Specifies whether a user pool attribute is required. If the attribute is required and the user doesn't provide a
     * value, registration or sign-in will fail.
     * </p>
     * 
     * @param required
     *        Specifies whether a user pool attribute is required. If the attribute is required and the user doesn't
     *        provide a value, registration or sign-in will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaAttributeType withRequired(Boolean required) {
        setRequired(required);
        return this;
    }

    /**
     * <p>
     * Specifies whether a user pool attribute is required. If the attribute is required and the user doesn't provide a
     * value, registration or sign-in will fail.
     * </p>
     * 
     * @return Specifies whether a user pool attribute is required. If the attribute is required and the user doesn't
     *         provide a value, registration or sign-in will fail.
     */

    public Boolean isRequired() {
        return this.required;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the number type.
     * </p>
     * 
     * @param numberAttributeConstraints
     *        Specifies the constraints for an attribute of the number type.
     */

    public void setNumberAttributeConstraints(NumberAttributeConstraintsType numberAttributeConstraints) {
        this.numberAttributeConstraints = numberAttributeConstraints;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the number type.
     * </p>
     * 
     * @return Specifies the constraints for an attribute of the number type.
     */

    public NumberAttributeConstraintsType getNumberAttributeConstraints() {
        return this.numberAttributeConstraints;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the number type.
     * </p>
     * 
     * @param numberAttributeConstraints
     *        Specifies the constraints for an attribute of the number type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaAttributeType withNumberAttributeConstraints(NumberAttributeConstraintsType numberAttributeConstraints) {
        setNumberAttributeConstraints(numberAttributeConstraints);
        return this;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the string type.
     * </p>
     * 
     * @param stringAttributeConstraints
     *        Specifies the constraints for an attribute of the string type.
     */

    public void setStringAttributeConstraints(StringAttributeConstraintsType stringAttributeConstraints) {
        this.stringAttributeConstraints = stringAttributeConstraints;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the string type.
     * </p>
     * 
     * @return Specifies the constraints for an attribute of the string type.
     */

    public StringAttributeConstraintsType getStringAttributeConstraints() {
        return this.stringAttributeConstraints;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the string type.
     * </p>
     * 
     * @param stringAttributeConstraints
     *        Specifies the constraints for an attribute of the string type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaAttributeType withStringAttributeConstraints(StringAttributeConstraintsType stringAttributeConstraints) {
        setStringAttributeConstraints(stringAttributeConstraints);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAttributeDataType() != null)
            sb.append("AttributeDataType: ").append(getAttributeDataType()).append(",");
        if (getDeveloperOnlyAttribute() != null)
            sb.append("DeveloperOnlyAttribute: ").append(getDeveloperOnlyAttribute()).append(",");
        if (getMutable() != null)
            sb.append("Mutable: ").append(getMutable()).append(",");
        if (getRequired() != null)
            sb.append("Required: ").append(getRequired()).append(",");
        if (getNumberAttributeConstraints() != null)
            sb.append("NumberAttributeConstraints: ").append(getNumberAttributeConstraints()).append(",");
        if (getStringAttributeConstraints() != null)
            sb.append("StringAttributeConstraints: ").append(getStringAttributeConstraints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaAttributeType == false)
            return false;
        SchemaAttributeType other = (SchemaAttributeType) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAttributeDataType() == null ^ this.getAttributeDataType() == null)
            return false;
        if (other.getAttributeDataType() != null && other.getAttributeDataType().equals(this.getAttributeDataType()) == false)
            return false;
        if (other.getDeveloperOnlyAttribute() == null ^ this.getDeveloperOnlyAttribute() == null)
            return false;
        if (other.getDeveloperOnlyAttribute() != null && other.getDeveloperOnlyAttribute().equals(this.getDeveloperOnlyAttribute()) == false)
            return false;
        if (other.getMutable() == null ^ this.getMutable() == null)
            return false;
        if (other.getMutable() != null && other.getMutable().equals(this.getMutable()) == false)
            return false;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        if (other.getNumberAttributeConstraints() == null ^ this.getNumberAttributeConstraints() == null)
            return false;
        if (other.getNumberAttributeConstraints() != null && other.getNumberAttributeConstraints().equals(this.getNumberAttributeConstraints()) == false)
            return false;
        if (other.getStringAttributeConstraints() == null ^ this.getStringAttributeConstraints() == null)
            return false;
        if (other.getStringAttributeConstraints() != null && other.getStringAttributeConstraints().equals(this.getStringAttributeConstraints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAttributeDataType() == null) ? 0 : getAttributeDataType().hashCode());
        hashCode = prime * hashCode + ((getDeveloperOnlyAttribute() == null) ? 0 : getDeveloperOnlyAttribute().hashCode());
        hashCode = prime * hashCode + ((getMutable() == null) ? 0 : getMutable().hashCode());
        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        hashCode = prime * hashCode + ((getNumberAttributeConstraints() == null) ? 0 : getNumberAttributeConstraints().hashCode());
        hashCode = prime * hashCode + ((getStringAttributeConstraints() == null) ? 0 : getStringAttributeConstraints().hashCode());
        return hashCode;
    }

    @Override
    public SchemaAttributeType clone() {
        try {
            return (SchemaAttributeType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.SchemaAttributeTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

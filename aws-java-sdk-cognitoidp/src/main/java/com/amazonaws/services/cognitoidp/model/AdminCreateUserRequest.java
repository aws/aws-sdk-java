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
 * Represents the request to create a user in the specified user pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminCreateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminCreateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool where the user will be created.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The username for the user. Must be unique within the user pool. Must be a UTF-8 string between 1 and 128
     * characters. After the user is created, the username cannot be changed.
     * </p>
     */
    private String username;
    /**
     * <p>
     * An array of name-value pairs that contain user attributes and attribute values to be set for the user to be
     * created. You can create a user without specifying any attributes other than <code>Username</code>. However, any
     * attributes that you specify as required (in or in the <b>Attributes</b> tab of the console) must be supplied
     * either by you (in your call to <code>AdminCreateUser</code>) or by the user (when he or she signs up in response
     * to your welcome message).
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * To send a message inviting the user to sign up, you must specify the user's email address or phone number. This
     * can be done in your call to AdminCreateUser or in the <b>Users</b> tab of the Amazon Cognito console for managing
     * your user pools.
     * </p>
     * <p>
     * In your call to <code>AdminCreateUser</code>, you can set the <code>email_verified</code> attribute to
     * <code>True</code>, and you can set the <code>phone_number_verified</code> attribute to <code>True</code>. (You
     * can also do this by calling .)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>email</b>: The email address of the user to whom the message that contains the code and username will be sent.
     * Required if the <code>email_verified</code> attribute is set to <code>True</code>, or if <code>"EMAIL"</code> is
     * specified in the <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>phone_number</b>: The phone number of the user to whom the message that contains the code and username will be
     * sent. Required if the <code>phone_number_verified</code> attribute is set to <code>True</code>, or if
     * <code>"SMS"</code> is specified in the <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<AttributeType> userAttributes;
    /**
     * <p>
     * The user's validation data. This is an array of name-value pairs that contain user attributes and attribute
     * values that you can use for custom validation, such as restricting the types of user accounts that can be
     * registered. For example, you might choose to allow or disallow user sign-up based on the user's domain.
     * </p>
     * <p>
     * To configure custom validation, you must create a Pre Sign-up Lambda trigger for the user pool as described in
     * the Amazon Cognito Developer Guide. The Lambda trigger receives the validation data and uses it in the validation
     * process.
     * </p>
     * <p>
     * The user's validation data is not persisted.
     * </p>
     */
    private java.util.List<AttributeType> validationData;
    /**
     * <p>
     * The user's temporary password. This password must conform to the password policy that you specified when you
     * created the user pool.
     * </p>
     * <p>
     * The temporary password is valid only once. To complete the Admin Create User flow, the user must enter the
     * temporary password in the sign-in page along with a new password to be used in all future sign-ins.
     * </p>
     * <p>
     * This parameter is not required. If you do not specify a value, Amazon Cognito generates one for you.
     * </p>
     * <p>
     * The temporary password can only be used until the user account expiration limit that you specified when you
     * created the user pool. To reset the account after that time limit, you must call <code>AdminCreateUser</code>
     * again, specifying <code>"RESEND"</code> for the <code>MessageAction</code> parameter.
     * </p>
     */
    private String temporaryPassword;
    /**
     * <p>
     * This parameter is only used if the <code>phone_number_verified</code> or <code>email_verified</code> attribute is
     * set to <code>True</code>. Otherwise, it is ignored.
     * </p>
     * <p>
     * If this parameter is set to <code>True</code> and the phone number or email address specified in the
     * UserAttributes parameter already exists as an alias with a different user, the API call will migrate the alias
     * from the previous user to the newly created user. The previous user will no longer be able to log in using that
     * alias.
     * </p>
     * <p>
     * If this parameter is set to <code>False</code>, the API throws an <code>AliasExistsException</code> error if the
     * alias already exists. The default value is <code>False</code>.
     * </p>
     */
    private Boolean forceAliasCreation;
    /**
     * <p>
     * Set to <code>"RESEND"</code> to resend the invitation message to a user that already exists and reset the
     * expiration limit on the user's account. Set to <code>"SUPPRESS"</code> to suppress sending the message. Only one
     * value can be specified.
     * </p>
     */
    private String messageAction;
    /**
     * <p>
     * Specify <code>"EMAIL"</code> if email will be used to send the welcome message. Specify <code>"SMS"</code> if the
     * phone number will be used. The default value is <code>"SMS"</code>. More than one value can be specified.
     * </p>
     */
    private java.util.List<String> desiredDeliveryMediums;

    /**
     * <p>
     * The user pool ID for the user pool where the user will be created.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where the user will be created.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where the user will be created.
     * </p>
     * 
     * @return The user pool ID for the user pool where the user will be created.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where the user will be created.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where the user will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminCreateUserRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The username for the user. Must be unique within the user pool. Must be a UTF-8 string between 1 and 128
     * characters. After the user is created, the username cannot be changed.
     * </p>
     * 
     * @param username
     *        The username for the user. Must be unique within the user pool. Must be a UTF-8 string between 1 and 128
     *        characters. After the user is created, the username cannot be changed.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username for the user. Must be unique within the user pool. Must be a UTF-8 string between 1 and 128
     * characters. After the user is created, the username cannot be changed.
     * </p>
     * 
     * @return The username for the user. Must be unique within the user pool. Must be a UTF-8 string between 1 and 128
     *         characters. After the user is created, the username cannot be changed.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The username for the user. Must be unique within the user pool. Must be a UTF-8 string between 1 and 128
     * characters. After the user is created, the username cannot be changed.
     * </p>
     * 
     * @param username
     *        The username for the user. Must be unique within the user pool. Must be a UTF-8 string between 1 and 128
     *        characters. After the user is created, the username cannot be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminCreateUserRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs that contain user attributes and attribute values to be set for the user to be
     * created. You can create a user without specifying any attributes other than <code>Username</code>. However, any
     * attributes that you specify as required (in or in the <b>Attributes</b> tab of the console) must be supplied
     * either by you (in your call to <code>AdminCreateUser</code>) or by the user (when he or she signs up in response
     * to your welcome message).
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * To send a message inviting the user to sign up, you must specify the user's email address or phone number. This
     * can be done in your call to AdminCreateUser or in the <b>Users</b> tab of the Amazon Cognito console for managing
     * your user pools.
     * </p>
     * <p>
     * In your call to <code>AdminCreateUser</code>, you can set the <code>email_verified</code> attribute to
     * <code>True</code>, and you can set the <code>phone_number_verified</code> attribute to <code>True</code>. (You
     * can also do this by calling .)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>email</b>: The email address of the user to whom the message that contains the code and username will be sent.
     * Required if the <code>email_verified</code> attribute is set to <code>True</code>, or if <code>"EMAIL"</code> is
     * specified in the <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>phone_number</b>: The phone number of the user to whom the message that contains the code and username will be
     * sent. Required if the <code>phone_number_verified</code> attribute is set to <code>True</code>, or if
     * <code>"SMS"</code> is specified in the <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of name-value pairs that contain user attributes and attribute values to be set for the user to
     *         be created. You can create a user without specifying any attributes other than <code>Username</code>.
     *         However, any attributes that you specify as required (in or in the <b>Attributes</b> tab of the console)
     *         must be supplied either by you (in your call to <code>AdminCreateUser</code>) or by the user (when he or
     *         she signs up in response to your welcome message).</p>
     *         <p>
     *         For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     *         </p>
     *         <p>
     *         To send a message inviting the user to sign up, you must specify the user's email address or phone
     *         number. This can be done in your call to AdminCreateUser or in the <b>Users</b> tab of the Amazon Cognito
     *         console for managing your user pools.
     *         </p>
     *         <p>
     *         In your call to <code>AdminCreateUser</code>, you can set the <code>email_verified</code> attribute to
     *         <code>True</code>, and you can set the <code>phone_number_verified</code> attribute to <code>True</code>.
     *         (You can also do this by calling .)
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>email</b>: The email address of the user to whom the message that contains the code and username will
     *         be sent. Required if the <code>email_verified</code> attribute is set to <code>True</code>, or if
     *         <code>"EMAIL"</code> is specified in the <code>DesiredDeliveryMediums</code> parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>phone_number</b>: The phone number of the user to whom the message that contains the code and username
     *         will be sent. Required if the <code>phone_number_verified</code> attribute is set to <code>True</code>,
     *         or if <code>"SMS"</code> is specified in the <code>DesiredDeliveryMediums</code> parameter.
     *         </p>
     *         </li>
     */

    public java.util.List<AttributeType> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * An array of name-value pairs that contain user attributes and attribute values to be set for the user to be
     * created. You can create a user without specifying any attributes other than <code>Username</code>. However, any
     * attributes that you specify as required (in or in the <b>Attributes</b> tab of the console) must be supplied
     * either by you (in your call to <code>AdminCreateUser</code>) or by the user (when he or she signs up in response
     * to your welcome message).
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * To send a message inviting the user to sign up, you must specify the user's email address or phone number. This
     * can be done in your call to AdminCreateUser or in the <b>Users</b> tab of the Amazon Cognito console for managing
     * your user pools.
     * </p>
     * <p>
     * In your call to <code>AdminCreateUser</code>, you can set the <code>email_verified</code> attribute to
     * <code>True</code>, and you can set the <code>phone_number_verified</code> attribute to <code>True</code>. (You
     * can also do this by calling .)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>email</b>: The email address of the user to whom the message that contains the code and username will be sent.
     * Required if the <code>email_verified</code> attribute is set to <code>True</code>, or if <code>"EMAIL"</code> is
     * specified in the <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>phone_number</b>: The phone number of the user to whom the message that contains the code and username will be
     * sent. Required if the <code>phone_number_verified</code> attribute is set to <code>True</code>, or if
     * <code>"SMS"</code> is specified in the <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userAttributes
     *        An array of name-value pairs that contain user attributes and attribute values to be set for the user to
     *        be created. You can create a user without specifying any attributes other than <code>Username</code>.
     *        However, any attributes that you specify as required (in or in the <b>Attributes</b> tab of the console)
     *        must be supplied either by you (in your call to <code>AdminCreateUser</code>) or by the user (when he or
     *        she signs up in response to your welcome message).</p>
     *        <p>
     *        For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     *        </p>
     *        <p>
     *        To send a message inviting the user to sign up, you must specify the user's email address or phone number.
     *        This can be done in your call to AdminCreateUser or in the <b>Users</b> tab of the Amazon Cognito console
     *        for managing your user pools.
     *        </p>
     *        <p>
     *        In your call to <code>AdminCreateUser</code>, you can set the <code>email_verified</code> attribute to
     *        <code>True</code>, and you can set the <code>phone_number_verified</code> attribute to <code>True</code>.
     *        (You can also do this by calling .)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>email</b>: The email address of the user to whom the message that contains the code and username will
     *        be sent. Required if the <code>email_verified</code> attribute is set to <code>True</code>, or if
     *        <code>"EMAIL"</code> is specified in the <code>DesiredDeliveryMediums</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>phone_number</b>: The phone number of the user to whom the message that contains the code and username
     *        will be sent. Required if the <code>phone_number_verified</code> attribute is set to <code>True</code>, or
     *        if <code>"SMS"</code> is specified in the <code>DesiredDeliveryMediums</code> parameter.
     *        </p>
     *        </li>
     */

    public void setUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }

        this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes);
    }

    /**
     * <p>
     * An array of name-value pairs that contain user attributes and attribute values to be set for the user to be
     * created. You can create a user without specifying any attributes other than <code>Username</code>. However, any
     * attributes that you specify as required (in or in the <b>Attributes</b> tab of the console) must be supplied
     * either by you (in your call to <code>AdminCreateUser</code>) or by the user (when he or she signs up in response
     * to your welcome message).
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * To send a message inviting the user to sign up, you must specify the user's email address or phone number. This
     * can be done in your call to AdminCreateUser or in the <b>Users</b> tab of the Amazon Cognito console for managing
     * your user pools.
     * </p>
     * <p>
     * In your call to <code>AdminCreateUser</code>, you can set the <code>email_verified</code> attribute to
     * <code>True</code>, and you can set the <code>phone_number_verified</code> attribute to <code>True</code>. (You
     * can also do this by calling .)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>email</b>: The email address of the user to whom the message that contains the code and username will be sent.
     * Required if the <code>email_verified</code> attribute is set to <code>True</code>, or if <code>"EMAIL"</code> is
     * specified in the <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>phone_number</b>: The phone number of the user to whom the message that contains the code and username will be
     * sent. Required if the <code>phone_number_verified</code> attribute is set to <code>True</code>, or if
     * <code>"SMS"</code> is specified in the <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAttributes(java.util.Collection)} or {@link #withUserAttributes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userAttributes
     *        An array of name-value pairs that contain user attributes and attribute values to be set for the user to
     *        be created. You can create a user without specifying any attributes other than <code>Username</code>.
     *        However, any attributes that you specify as required (in or in the <b>Attributes</b> tab of the console)
     *        must be supplied either by you (in your call to <code>AdminCreateUser</code>) or by the user (when he or
     *        she signs up in response to your welcome message).</p>
     *        <p>
     *        For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     *        </p>
     *        <p>
     *        To send a message inviting the user to sign up, you must specify the user's email address or phone number.
     *        This can be done in your call to AdminCreateUser or in the <b>Users</b> tab of the Amazon Cognito console
     *        for managing your user pools.
     *        </p>
     *        <p>
     *        In your call to <code>AdminCreateUser</code>, you can set the <code>email_verified</code> attribute to
     *        <code>True</code>, and you can set the <code>phone_number_verified</code> attribute to <code>True</code>.
     *        (You can also do this by calling .)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>email</b>: The email address of the user to whom the message that contains the code and username will
     *        be sent. Required if the <code>email_verified</code> attribute is set to <code>True</code>, or if
     *        <code>"EMAIL"</code> is specified in the <code>DesiredDeliveryMediums</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>phone_number</b>: The phone number of the user to whom the message that contains the code and username
     *        will be sent. Required if the <code>phone_number_verified</code> attribute is set to <code>True</code>, or
     *        if <code>"SMS"</code> is specified in the <code>DesiredDeliveryMediums</code> parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminCreateUserRequest withUserAttributes(AttributeType... userAttributes) {
        if (this.userAttributes == null) {
            setUserAttributes(new java.util.ArrayList<AttributeType>(userAttributes.length));
        }
        for (AttributeType ele : userAttributes) {
            this.userAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs that contain user attributes and attribute values to be set for the user to be
     * created. You can create a user without specifying any attributes other than <code>Username</code>. However, any
     * attributes that you specify as required (in or in the <b>Attributes</b> tab of the console) must be supplied
     * either by you (in your call to <code>AdminCreateUser</code>) or by the user (when he or she signs up in response
     * to your welcome message).
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * To send a message inviting the user to sign up, you must specify the user's email address or phone number. This
     * can be done in your call to AdminCreateUser or in the <b>Users</b> tab of the Amazon Cognito console for managing
     * your user pools.
     * </p>
     * <p>
     * In your call to <code>AdminCreateUser</code>, you can set the <code>email_verified</code> attribute to
     * <code>True</code>, and you can set the <code>phone_number_verified</code> attribute to <code>True</code>. (You
     * can also do this by calling .)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>email</b>: The email address of the user to whom the message that contains the code and username will be sent.
     * Required if the <code>email_verified</code> attribute is set to <code>True</code>, or if <code>"EMAIL"</code> is
     * specified in the <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>phone_number</b>: The phone number of the user to whom the message that contains the code and username will be
     * sent. Required if the <code>phone_number_verified</code> attribute is set to <code>True</code>, or if
     * <code>"SMS"</code> is specified in the <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userAttributes
     *        An array of name-value pairs that contain user attributes and attribute values to be set for the user to
     *        be created. You can create a user without specifying any attributes other than <code>Username</code>.
     *        However, any attributes that you specify as required (in or in the <b>Attributes</b> tab of the console)
     *        must be supplied either by you (in your call to <code>AdminCreateUser</code>) or by the user (when he or
     *        she signs up in response to your welcome message).</p>
     *        <p>
     *        For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     *        </p>
     *        <p>
     *        To send a message inviting the user to sign up, you must specify the user's email address or phone number.
     *        This can be done in your call to AdminCreateUser or in the <b>Users</b> tab of the Amazon Cognito console
     *        for managing your user pools.
     *        </p>
     *        <p>
     *        In your call to <code>AdminCreateUser</code>, you can set the <code>email_verified</code> attribute to
     *        <code>True</code>, and you can set the <code>phone_number_verified</code> attribute to <code>True</code>.
     *        (You can also do this by calling .)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>email</b>: The email address of the user to whom the message that contains the code and username will
     *        be sent. Required if the <code>email_verified</code> attribute is set to <code>True</code>, or if
     *        <code>"EMAIL"</code> is specified in the <code>DesiredDeliveryMediums</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>phone_number</b>: The phone number of the user to whom the message that contains the code and username
     *        will be sent. Required if the <code>phone_number_verified</code> attribute is set to <code>True</code>, or
     *        if <code>"SMS"</code> is specified in the <code>DesiredDeliveryMediums</code> parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminCreateUserRequest withUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        setUserAttributes(userAttributes);
        return this;
    }

    /**
     * <p>
     * The user's validation data. This is an array of name-value pairs that contain user attributes and attribute
     * values that you can use for custom validation, such as restricting the types of user accounts that can be
     * registered. For example, you might choose to allow or disallow user sign-up based on the user's domain.
     * </p>
     * <p>
     * To configure custom validation, you must create a Pre Sign-up Lambda trigger for the user pool as described in
     * the Amazon Cognito Developer Guide. The Lambda trigger receives the validation data and uses it in the validation
     * process.
     * </p>
     * <p>
     * The user's validation data is not persisted.
     * </p>
     * 
     * @return The user's validation data. This is an array of name-value pairs that contain user attributes and
     *         attribute values that you can use for custom validation, such as restricting the types of user accounts
     *         that can be registered. For example, you might choose to allow or disallow user sign-up based on the
     *         user's domain.</p>
     *         <p>
     *         To configure custom validation, you must create a Pre Sign-up Lambda trigger for the user pool as
     *         described in the Amazon Cognito Developer Guide. The Lambda trigger receives the validation data and uses
     *         it in the validation process.
     *         </p>
     *         <p>
     *         The user's validation data is not persisted.
     */

    public java.util.List<AttributeType> getValidationData() {
        return validationData;
    }

    /**
     * <p>
     * The user's validation data. This is an array of name-value pairs that contain user attributes and attribute
     * values that you can use for custom validation, such as restricting the types of user accounts that can be
     * registered. For example, you might choose to allow or disallow user sign-up based on the user's domain.
     * </p>
     * <p>
     * To configure custom validation, you must create a Pre Sign-up Lambda trigger for the user pool as described in
     * the Amazon Cognito Developer Guide. The Lambda trigger receives the validation data and uses it in the validation
     * process.
     * </p>
     * <p>
     * The user's validation data is not persisted.
     * </p>
     * 
     * @param validationData
     *        The user's validation data. This is an array of name-value pairs that contain user attributes and
     *        attribute values that you can use for custom validation, such as restricting the types of user accounts
     *        that can be registered. For example, you might choose to allow or disallow user sign-up based on the
     *        user's domain.</p>
     *        <p>
     *        To configure custom validation, you must create a Pre Sign-up Lambda trigger for the user pool as
     *        described in the Amazon Cognito Developer Guide. The Lambda trigger receives the validation data and uses
     *        it in the validation process.
     *        </p>
     *        <p>
     *        The user's validation data is not persisted.
     */

    public void setValidationData(java.util.Collection<AttributeType> validationData) {
        if (validationData == null) {
            this.validationData = null;
            return;
        }

        this.validationData = new java.util.ArrayList<AttributeType>(validationData);
    }

    /**
     * <p>
     * The user's validation data. This is an array of name-value pairs that contain user attributes and attribute
     * values that you can use for custom validation, such as restricting the types of user accounts that can be
     * registered. For example, you might choose to allow or disallow user sign-up based on the user's domain.
     * </p>
     * <p>
     * To configure custom validation, you must create a Pre Sign-up Lambda trigger for the user pool as described in
     * the Amazon Cognito Developer Guide. The Lambda trigger receives the validation data and uses it in the validation
     * process.
     * </p>
     * <p>
     * The user's validation data is not persisted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationData(java.util.Collection)} or {@link #withValidationData(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param validationData
     *        The user's validation data. This is an array of name-value pairs that contain user attributes and
     *        attribute values that you can use for custom validation, such as restricting the types of user accounts
     *        that can be registered. For example, you might choose to allow or disallow user sign-up based on the
     *        user's domain.</p>
     *        <p>
     *        To configure custom validation, you must create a Pre Sign-up Lambda trigger for the user pool as
     *        described in the Amazon Cognito Developer Guide. The Lambda trigger receives the validation data and uses
     *        it in the validation process.
     *        </p>
     *        <p>
     *        The user's validation data is not persisted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminCreateUserRequest withValidationData(AttributeType... validationData) {
        if (this.validationData == null) {
            setValidationData(new java.util.ArrayList<AttributeType>(validationData.length));
        }
        for (AttributeType ele : validationData) {
            this.validationData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user's validation data. This is an array of name-value pairs that contain user attributes and attribute
     * values that you can use for custom validation, such as restricting the types of user accounts that can be
     * registered. For example, you might choose to allow or disallow user sign-up based on the user's domain.
     * </p>
     * <p>
     * To configure custom validation, you must create a Pre Sign-up Lambda trigger for the user pool as described in
     * the Amazon Cognito Developer Guide. The Lambda trigger receives the validation data and uses it in the validation
     * process.
     * </p>
     * <p>
     * The user's validation data is not persisted.
     * </p>
     * 
     * @param validationData
     *        The user's validation data. This is an array of name-value pairs that contain user attributes and
     *        attribute values that you can use for custom validation, such as restricting the types of user accounts
     *        that can be registered. For example, you might choose to allow or disallow user sign-up based on the
     *        user's domain.</p>
     *        <p>
     *        To configure custom validation, you must create a Pre Sign-up Lambda trigger for the user pool as
     *        described in the Amazon Cognito Developer Guide. The Lambda trigger receives the validation data and uses
     *        it in the validation process.
     *        </p>
     *        <p>
     *        The user's validation data is not persisted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminCreateUserRequest withValidationData(java.util.Collection<AttributeType> validationData) {
        setValidationData(validationData);
        return this;
    }

    /**
     * <p>
     * The user's temporary password. This password must conform to the password policy that you specified when you
     * created the user pool.
     * </p>
     * <p>
     * The temporary password is valid only once. To complete the Admin Create User flow, the user must enter the
     * temporary password in the sign-in page along with a new password to be used in all future sign-ins.
     * </p>
     * <p>
     * This parameter is not required. If you do not specify a value, Amazon Cognito generates one for you.
     * </p>
     * <p>
     * The temporary password can only be used until the user account expiration limit that you specified when you
     * created the user pool. To reset the account after that time limit, you must call <code>AdminCreateUser</code>
     * again, specifying <code>"RESEND"</code> for the <code>MessageAction</code> parameter.
     * </p>
     * 
     * @param temporaryPassword
     *        The user's temporary password. This password must conform to the password policy that you specified when
     *        you created the user pool.</p>
     *        <p>
     *        The temporary password is valid only once. To complete the Admin Create User flow, the user must enter the
     *        temporary password in the sign-in page along with a new password to be used in all future sign-ins.
     *        </p>
     *        <p>
     *        This parameter is not required. If you do not specify a value, Amazon Cognito generates one for you.
     *        </p>
     *        <p>
     *        The temporary password can only be used until the user account expiration limit that you specified when
     *        you created the user pool. To reset the account after that time limit, you must call
     *        <code>AdminCreateUser</code> again, specifying <code>"RESEND"</code> for the <code>MessageAction</code>
     *        parameter.
     */

    public void setTemporaryPassword(String temporaryPassword) {
        this.temporaryPassword = temporaryPassword;
    }

    /**
     * <p>
     * The user's temporary password. This password must conform to the password policy that you specified when you
     * created the user pool.
     * </p>
     * <p>
     * The temporary password is valid only once. To complete the Admin Create User flow, the user must enter the
     * temporary password in the sign-in page along with a new password to be used in all future sign-ins.
     * </p>
     * <p>
     * This parameter is not required. If you do not specify a value, Amazon Cognito generates one for you.
     * </p>
     * <p>
     * The temporary password can only be used until the user account expiration limit that you specified when you
     * created the user pool. To reset the account after that time limit, you must call <code>AdminCreateUser</code>
     * again, specifying <code>"RESEND"</code> for the <code>MessageAction</code> parameter.
     * </p>
     * 
     * @return The user's temporary password. This password must conform to the password policy that you specified when
     *         you created the user pool.</p>
     *         <p>
     *         The temporary password is valid only once. To complete the Admin Create User flow, the user must enter
     *         the temporary password in the sign-in page along with a new password to be used in all future sign-ins.
     *         </p>
     *         <p>
     *         This parameter is not required. If you do not specify a value, Amazon Cognito generates one for you.
     *         </p>
     *         <p>
     *         The temporary password can only be used until the user account expiration limit that you specified when
     *         you created the user pool. To reset the account after that time limit, you must call
     *         <code>AdminCreateUser</code> again, specifying <code>"RESEND"</code> for the <code>MessageAction</code>
     *         parameter.
     */

    public String getTemporaryPassword() {
        return this.temporaryPassword;
    }

    /**
     * <p>
     * The user's temporary password. This password must conform to the password policy that you specified when you
     * created the user pool.
     * </p>
     * <p>
     * The temporary password is valid only once. To complete the Admin Create User flow, the user must enter the
     * temporary password in the sign-in page along with a new password to be used in all future sign-ins.
     * </p>
     * <p>
     * This parameter is not required. If you do not specify a value, Amazon Cognito generates one for you.
     * </p>
     * <p>
     * The temporary password can only be used until the user account expiration limit that you specified when you
     * created the user pool. To reset the account after that time limit, you must call <code>AdminCreateUser</code>
     * again, specifying <code>"RESEND"</code> for the <code>MessageAction</code> parameter.
     * </p>
     * 
     * @param temporaryPassword
     *        The user's temporary password. This password must conform to the password policy that you specified when
     *        you created the user pool.</p>
     *        <p>
     *        The temporary password is valid only once. To complete the Admin Create User flow, the user must enter the
     *        temporary password in the sign-in page along with a new password to be used in all future sign-ins.
     *        </p>
     *        <p>
     *        This parameter is not required. If you do not specify a value, Amazon Cognito generates one for you.
     *        </p>
     *        <p>
     *        The temporary password can only be used until the user account expiration limit that you specified when
     *        you created the user pool. To reset the account after that time limit, you must call
     *        <code>AdminCreateUser</code> again, specifying <code>"RESEND"</code> for the <code>MessageAction</code>
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminCreateUserRequest withTemporaryPassword(String temporaryPassword) {
        setTemporaryPassword(temporaryPassword);
        return this;
    }

    /**
     * <p>
     * This parameter is only used if the <code>phone_number_verified</code> or <code>email_verified</code> attribute is
     * set to <code>True</code>. Otherwise, it is ignored.
     * </p>
     * <p>
     * If this parameter is set to <code>True</code> and the phone number or email address specified in the
     * UserAttributes parameter already exists as an alias with a different user, the API call will migrate the alias
     * from the previous user to the newly created user. The previous user will no longer be able to log in using that
     * alias.
     * </p>
     * <p>
     * If this parameter is set to <code>False</code>, the API throws an <code>AliasExistsException</code> error if the
     * alias already exists. The default value is <code>False</code>.
     * </p>
     * 
     * @param forceAliasCreation
     *        This parameter is only used if the <code>phone_number_verified</code> or <code>email_verified</code>
     *        attribute is set to <code>True</code>. Otherwise, it is ignored.</p>
     *        <p>
     *        If this parameter is set to <code>True</code> and the phone number or email address specified in the
     *        UserAttributes parameter already exists as an alias with a different user, the API call will migrate the
     *        alias from the previous user to the newly created user. The previous user will no longer be able to log in
     *        using that alias.
     *        </p>
     *        <p>
     *        If this parameter is set to <code>False</code>, the API throws an <code>AliasExistsException</code> error
     *        if the alias already exists. The default value is <code>False</code>.
     */

    public void setForceAliasCreation(Boolean forceAliasCreation) {
        this.forceAliasCreation = forceAliasCreation;
    }

    /**
     * <p>
     * This parameter is only used if the <code>phone_number_verified</code> or <code>email_verified</code> attribute is
     * set to <code>True</code>. Otherwise, it is ignored.
     * </p>
     * <p>
     * If this parameter is set to <code>True</code> and the phone number or email address specified in the
     * UserAttributes parameter already exists as an alias with a different user, the API call will migrate the alias
     * from the previous user to the newly created user. The previous user will no longer be able to log in using that
     * alias.
     * </p>
     * <p>
     * If this parameter is set to <code>False</code>, the API throws an <code>AliasExistsException</code> error if the
     * alias already exists. The default value is <code>False</code>.
     * </p>
     * 
     * @return This parameter is only used if the <code>phone_number_verified</code> or <code>email_verified</code>
     *         attribute is set to <code>True</code>. Otherwise, it is ignored.</p>
     *         <p>
     *         If this parameter is set to <code>True</code> and the phone number or email address specified in the
     *         UserAttributes parameter already exists as an alias with a different user, the API call will migrate the
     *         alias from the previous user to the newly created user. The previous user will no longer be able to log
     *         in using that alias.
     *         </p>
     *         <p>
     *         If this parameter is set to <code>False</code>, the API throws an <code>AliasExistsException</code> error
     *         if the alias already exists. The default value is <code>False</code>.
     */

    public Boolean getForceAliasCreation() {
        return this.forceAliasCreation;
    }

    /**
     * <p>
     * This parameter is only used if the <code>phone_number_verified</code> or <code>email_verified</code> attribute is
     * set to <code>True</code>. Otherwise, it is ignored.
     * </p>
     * <p>
     * If this parameter is set to <code>True</code> and the phone number or email address specified in the
     * UserAttributes parameter already exists as an alias with a different user, the API call will migrate the alias
     * from the previous user to the newly created user. The previous user will no longer be able to log in using that
     * alias.
     * </p>
     * <p>
     * If this parameter is set to <code>False</code>, the API throws an <code>AliasExistsException</code> error if the
     * alias already exists. The default value is <code>False</code>.
     * </p>
     * 
     * @param forceAliasCreation
     *        This parameter is only used if the <code>phone_number_verified</code> or <code>email_verified</code>
     *        attribute is set to <code>True</code>. Otherwise, it is ignored.</p>
     *        <p>
     *        If this parameter is set to <code>True</code> and the phone number or email address specified in the
     *        UserAttributes parameter already exists as an alias with a different user, the API call will migrate the
     *        alias from the previous user to the newly created user. The previous user will no longer be able to log in
     *        using that alias.
     *        </p>
     *        <p>
     *        If this parameter is set to <code>False</code>, the API throws an <code>AliasExistsException</code> error
     *        if the alias already exists. The default value is <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminCreateUserRequest withForceAliasCreation(Boolean forceAliasCreation) {
        setForceAliasCreation(forceAliasCreation);
        return this;
    }

    /**
     * <p>
     * This parameter is only used if the <code>phone_number_verified</code> or <code>email_verified</code> attribute is
     * set to <code>True</code>. Otherwise, it is ignored.
     * </p>
     * <p>
     * If this parameter is set to <code>True</code> and the phone number or email address specified in the
     * UserAttributes parameter already exists as an alias with a different user, the API call will migrate the alias
     * from the previous user to the newly created user. The previous user will no longer be able to log in using that
     * alias.
     * </p>
     * <p>
     * If this parameter is set to <code>False</code>, the API throws an <code>AliasExistsException</code> error if the
     * alias already exists. The default value is <code>False</code>.
     * </p>
     * 
     * @return This parameter is only used if the <code>phone_number_verified</code> or <code>email_verified</code>
     *         attribute is set to <code>True</code>. Otherwise, it is ignored.</p>
     *         <p>
     *         If this parameter is set to <code>True</code> and the phone number or email address specified in the
     *         UserAttributes parameter already exists as an alias with a different user, the API call will migrate the
     *         alias from the previous user to the newly created user. The previous user will no longer be able to log
     *         in using that alias.
     *         </p>
     *         <p>
     *         If this parameter is set to <code>False</code>, the API throws an <code>AliasExistsException</code> error
     *         if the alias already exists. The default value is <code>False</code>.
     */

    public Boolean isForceAliasCreation() {
        return this.forceAliasCreation;
    }

    /**
     * <p>
     * Set to <code>"RESEND"</code> to resend the invitation message to a user that already exists and reset the
     * expiration limit on the user's account. Set to <code>"SUPPRESS"</code> to suppress sending the message. Only one
     * value can be specified.
     * </p>
     * 
     * @param messageAction
     *        Set to <code>"RESEND"</code> to resend the invitation message to a user that already exists and reset the
     *        expiration limit on the user's account. Set to <code>"SUPPRESS"</code> to suppress sending the message.
     *        Only one value can be specified.
     * @see MessageActionType
     */

    public void setMessageAction(String messageAction) {
        this.messageAction = messageAction;
    }

    /**
     * <p>
     * Set to <code>"RESEND"</code> to resend the invitation message to a user that already exists and reset the
     * expiration limit on the user's account. Set to <code>"SUPPRESS"</code> to suppress sending the message. Only one
     * value can be specified.
     * </p>
     * 
     * @return Set to <code>"RESEND"</code> to resend the invitation message to a user that already exists and reset the
     *         expiration limit on the user's account. Set to <code>"SUPPRESS"</code> to suppress sending the message.
     *         Only one value can be specified.
     * @see MessageActionType
     */

    public String getMessageAction() {
        return this.messageAction;
    }

    /**
     * <p>
     * Set to <code>"RESEND"</code> to resend the invitation message to a user that already exists and reset the
     * expiration limit on the user's account. Set to <code>"SUPPRESS"</code> to suppress sending the message. Only one
     * value can be specified.
     * </p>
     * 
     * @param messageAction
     *        Set to <code>"RESEND"</code> to resend the invitation message to a user that already exists and reset the
     *        expiration limit on the user's account. Set to <code>"SUPPRESS"</code> to suppress sending the message.
     *        Only one value can be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageActionType
     */

    public AdminCreateUserRequest withMessageAction(String messageAction) {
        setMessageAction(messageAction);
        return this;
    }

    /**
     * <p>
     * Set to <code>"RESEND"</code> to resend the invitation message to a user that already exists and reset the
     * expiration limit on the user's account. Set to <code>"SUPPRESS"</code> to suppress sending the message. Only one
     * value can be specified.
     * </p>
     * 
     * @param messageAction
     *        Set to <code>"RESEND"</code> to resend the invitation message to a user that already exists and reset the
     *        expiration limit on the user's account. Set to <code>"SUPPRESS"</code> to suppress sending the message.
     *        Only one value can be specified.
     * @see MessageActionType
     */

    public void setMessageAction(MessageActionType messageAction) {
        withMessageAction(messageAction);
    }

    /**
     * <p>
     * Set to <code>"RESEND"</code> to resend the invitation message to a user that already exists and reset the
     * expiration limit on the user's account. Set to <code>"SUPPRESS"</code> to suppress sending the message. Only one
     * value can be specified.
     * </p>
     * 
     * @param messageAction
     *        Set to <code>"RESEND"</code> to resend the invitation message to a user that already exists and reset the
     *        expiration limit on the user's account. Set to <code>"SUPPRESS"</code> to suppress sending the message.
     *        Only one value can be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageActionType
     */

    public AdminCreateUserRequest withMessageAction(MessageActionType messageAction) {
        this.messageAction = messageAction.toString();
        return this;
    }

    /**
     * <p>
     * Specify <code>"EMAIL"</code> if email will be used to send the welcome message. Specify <code>"SMS"</code> if the
     * phone number will be used. The default value is <code>"SMS"</code>. More than one value can be specified.
     * </p>
     * 
     * @return Specify <code>"EMAIL"</code> if email will be used to send the welcome message. Specify
     *         <code>"SMS"</code> if the phone number will be used. The default value is <code>"SMS"</code>. More than
     *         one value can be specified.
     * @see DeliveryMediumType
     */

    public java.util.List<String> getDesiredDeliveryMediums() {
        return desiredDeliveryMediums;
    }

    /**
     * <p>
     * Specify <code>"EMAIL"</code> if email will be used to send the welcome message. Specify <code>"SMS"</code> if the
     * phone number will be used. The default value is <code>"SMS"</code>. More than one value can be specified.
     * </p>
     * 
     * @param desiredDeliveryMediums
     *        Specify <code>"EMAIL"</code> if email will be used to send the welcome message. Specify <code>"SMS"</code>
     *        if the phone number will be used. The default value is <code>"SMS"</code>. More than one value can be
     *        specified.
     * @see DeliveryMediumType
     */

    public void setDesiredDeliveryMediums(java.util.Collection<String> desiredDeliveryMediums) {
        if (desiredDeliveryMediums == null) {
            this.desiredDeliveryMediums = null;
            return;
        }

        this.desiredDeliveryMediums = new java.util.ArrayList<String>(desiredDeliveryMediums);
    }

    /**
     * <p>
     * Specify <code>"EMAIL"</code> if email will be used to send the welcome message. Specify <code>"SMS"</code> if the
     * phone number will be used. The default value is <code>"SMS"</code>. More than one value can be specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDesiredDeliveryMediums(java.util.Collection)} or
     * {@link #withDesiredDeliveryMediums(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param desiredDeliveryMediums
     *        Specify <code>"EMAIL"</code> if email will be used to send the welcome message. Specify <code>"SMS"</code>
     *        if the phone number will be used. The default value is <code>"SMS"</code>. More than one value can be
     *        specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryMediumType
     */

    public AdminCreateUserRequest withDesiredDeliveryMediums(String... desiredDeliveryMediums) {
        if (this.desiredDeliveryMediums == null) {
            setDesiredDeliveryMediums(new java.util.ArrayList<String>(desiredDeliveryMediums.length));
        }
        for (String ele : desiredDeliveryMediums) {
            this.desiredDeliveryMediums.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify <code>"EMAIL"</code> if email will be used to send the welcome message. Specify <code>"SMS"</code> if the
     * phone number will be used. The default value is <code>"SMS"</code>. More than one value can be specified.
     * </p>
     * 
     * @param desiredDeliveryMediums
     *        Specify <code>"EMAIL"</code> if email will be used to send the welcome message. Specify <code>"SMS"</code>
     *        if the phone number will be used. The default value is <code>"SMS"</code>. More than one value can be
     *        specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryMediumType
     */

    public AdminCreateUserRequest withDesiredDeliveryMediums(java.util.Collection<String> desiredDeliveryMediums) {
        setDesiredDeliveryMediums(desiredDeliveryMediums);
        return this;
    }

    /**
     * <p>
     * Specify <code>"EMAIL"</code> if email will be used to send the welcome message. Specify <code>"SMS"</code> if the
     * phone number will be used. The default value is <code>"SMS"</code>. More than one value can be specified.
     * </p>
     * 
     * @param desiredDeliveryMediums
     *        Specify <code>"EMAIL"</code> if email will be used to send the welcome message. Specify <code>"SMS"</code>
     *        if the phone number will be used. The default value is <code>"SMS"</code>. More than one value can be
     *        specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryMediumType
     */

    public AdminCreateUserRequest withDesiredDeliveryMediums(DeliveryMediumType... desiredDeliveryMediums) {
        java.util.ArrayList<String> desiredDeliveryMediumsCopy = new java.util.ArrayList<String>(desiredDeliveryMediums.length);
        for (DeliveryMediumType value : desiredDeliveryMediums) {
            desiredDeliveryMediumsCopy.add(value.toString());
        }
        if (getDesiredDeliveryMediums() == null) {
            setDesiredDeliveryMediums(desiredDeliveryMediumsCopy);
        } else {
            getDesiredDeliveryMediums().addAll(desiredDeliveryMediumsCopy);
        }
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
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserAttributes() != null)
            sb.append("UserAttributes: ").append(getUserAttributes()).append(",");
        if (getValidationData() != null)
            sb.append("ValidationData: ").append(getValidationData()).append(",");
        if (getTemporaryPassword() != null)
            sb.append("TemporaryPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getForceAliasCreation() != null)
            sb.append("ForceAliasCreation: ").append(getForceAliasCreation()).append(",");
        if (getMessageAction() != null)
            sb.append("MessageAction: ").append(getMessageAction()).append(",");
        if (getDesiredDeliveryMediums() != null)
            sb.append("DesiredDeliveryMediums: ").append(getDesiredDeliveryMediums());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminCreateUserRequest == false)
            return false;
        AdminCreateUserRequest other = (AdminCreateUserRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        if (other.getValidationData() == null ^ this.getValidationData() == null)
            return false;
        if (other.getValidationData() != null && other.getValidationData().equals(this.getValidationData()) == false)
            return false;
        if (other.getTemporaryPassword() == null ^ this.getTemporaryPassword() == null)
            return false;
        if (other.getTemporaryPassword() != null && other.getTemporaryPassword().equals(this.getTemporaryPassword()) == false)
            return false;
        if (other.getForceAliasCreation() == null ^ this.getForceAliasCreation() == null)
            return false;
        if (other.getForceAliasCreation() != null && other.getForceAliasCreation().equals(this.getForceAliasCreation()) == false)
            return false;
        if (other.getMessageAction() == null ^ this.getMessageAction() == null)
            return false;
        if (other.getMessageAction() != null && other.getMessageAction().equals(this.getMessageAction()) == false)
            return false;
        if (other.getDesiredDeliveryMediums() == null ^ this.getDesiredDeliveryMediums() == null)
            return false;
        if (other.getDesiredDeliveryMediums() != null && other.getDesiredDeliveryMediums().equals(this.getDesiredDeliveryMediums()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode());
        hashCode = prime * hashCode + ((getValidationData() == null) ? 0 : getValidationData().hashCode());
        hashCode = prime * hashCode + ((getTemporaryPassword() == null) ? 0 : getTemporaryPassword().hashCode());
        hashCode = prime * hashCode + ((getForceAliasCreation() == null) ? 0 : getForceAliasCreation().hashCode());
        hashCode = prime * hashCode + ((getMessageAction() == null) ? 0 : getMessageAction().hashCode());
        hashCode = prime * hashCode + ((getDesiredDeliveryMediums() == null) ? 0 : getDesiredDeliveryMediums().hashCode());
        return hashCode;
    }

    @Override
    public AdminCreateUserRequest clone() {
        return (AdminCreateUserRequest) super.clone();
    }

}

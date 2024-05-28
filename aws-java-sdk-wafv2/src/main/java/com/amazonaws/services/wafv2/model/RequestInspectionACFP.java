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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The criteria for inspecting account creation requests, used by the ACFP rule group to validate and track account
 * creation attempts.
 * </p>
 * <p>
 * This is part of the <code>AWSManagedRulesACFPRuleSet</code> configuration in <code>ManagedRuleGroupConfig</code>.
 * </p>
 * <p>
 * In these settings, you specify how your application accepts account creation attempts by providing the request
 * payload type and the names of the fields within the request body where the username, password, email, and primary
 * address and phone number fields are provided.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RequestInspectionACFP" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestInspectionACFP implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The payload type for your account creation endpoint, either JSON or form encoded.
     * </p>
     */
    private String payloadType;
    /**
     * <p>
     * The name of the field in the request payload that contains your customer's username.
     * </p>
     * <p>
     * How you specify this depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer syntax,
     * see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload <code>{ "form": { "username": "THE_USERNAME" } }</code>, the username field
     * specification is <code>/form/username</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with the input element named <code>username1</code>, the username field
     * specification is <code>username1</code>
     * </p>
     * </li>
     * </ul>
     */
    private UsernameField usernameField;
    /**
     * <p>
     * The name of the field in the request payload that contains your customer's password.
     * </p>
     * <p>
     * How you specify this depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer syntax,
     * see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload <code>{ "form": { "password": "THE_PASSWORD" } }</code>, the password field
     * specification is <code>/form/password</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with the input element named <code>password1</code>, the password field
     * specification is <code>password1</code>.
     * </p>
     * </li>
     * </ul>
     */
    private PasswordField passwordField;
    /**
     * <p>
     * The name of the field in the request payload that contains your customer's email.
     * </p>
     * <p>
     * How you specify this depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer syntax,
     * see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload <code>{ "form": { "email": "THE_EMAIL" } }</code>, the email field
     * specification is <code>/form/email</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with the input element named <code>email1</code>, the email field specification is
     * <code>email1</code>.
     * </p>
     * </li>
     * </ul>
     */
    private EmailField emailField;
    /**
     * <p>
     * The names of the fields in the request payload that contain your customer's primary phone number.
     * </p>
     * <p>
     * Order the phone number fields in the array exactly as they are ordered in the request payload.
     * </p>
     * <p>
     * How you specify the phone number fields depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON Pointer
     * syntax, see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload
     * <code>{ "form": { "primaryphoneline1": "THE_PHONE1", "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }</code>
     * , the phone number field identifiers are <code>/form/primaryphoneline1</code>,
     * <code>/form/primaryphoneline2</code>, and <code>/form/primaryphoneline3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with input elements named <code>primaryphoneline1</code>,
     * <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>, the phone number field identifiers are
     * <code>primaryphoneline1</code>, <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<PhoneNumberField> phoneNumberFields;
    /**
     * <p>
     * The names of the fields in the request payload that contain your customer's primary physical address.
     * </p>
     * <p>
     * Order the address fields in the array exactly as they are ordered in the request payload.
     * </p>
     * <p>
     * How you specify the address fields depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON Pointer
     * syntax, see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload
     * <code>{ "form": { "primaryaddressline1": "THE_ADDRESS1", "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }</code>
     * , the address field idenfiers are <code>/form/primaryaddressline1</code>, <code>/form/primaryaddressline2</code>,
     * and <code>/form/primaryaddressline3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with input elements named <code>primaryaddressline1</code>,
     * <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>, the address fields identifiers are
     * <code>primaryaddressline1</code>, <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<AddressField> addressFields;

    /**
     * <p>
     * The payload type for your account creation endpoint, either JSON or form encoded.
     * </p>
     * 
     * @param payloadType
     *        The payload type for your account creation endpoint, either JSON or form encoded.
     * @see PayloadType
     */

    public void setPayloadType(String payloadType) {
        this.payloadType = payloadType;
    }

    /**
     * <p>
     * The payload type for your account creation endpoint, either JSON or form encoded.
     * </p>
     * 
     * @return The payload type for your account creation endpoint, either JSON or form encoded.
     * @see PayloadType
     */

    public String getPayloadType() {
        return this.payloadType;
    }

    /**
     * <p>
     * The payload type for your account creation endpoint, either JSON or form encoded.
     * </p>
     * 
     * @param payloadType
     *        The payload type for your account creation endpoint, either JSON or form encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PayloadType
     */

    public RequestInspectionACFP withPayloadType(String payloadType) {
        setPayloadType(payloadType);
        return this;
    }

    /**
     * <p>
     * The payload type for your account creation endpoint, either JSON or form encoded.
     * </p>
     * 
     * @param payloadType
     *        The payload type for your account creation endpoint, either JSON or form encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PayloadType
     */

    public RequestInspectionACFP withPayloadType(PayloadType payloadType) {
        this.payloadType = payloadType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the field in the request payload that contains your customer's username.
     * </p>
     * <p>
     * How you specify this depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer syntax,
     * see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload <code>{ "form": { "username": "THE_USERNAME" } }</code>, the username field
     * specification is <code>/form/username</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with the input element named <code>username1</code>, the username field
     * specification is <code>username1</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param usernameField
     *        The name of the field in the request payload that contains your customer's username. </p>
     *        <p>
     *        How you specify this depends on the request inspection payload type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer
     *        syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *        href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *        </p>
     *        <p>
     *        For example, for the JSON payload <code>{ "form": { "username": "THE_USERNAME" } }</code>, the username
     *        field specification is <code>/form/username</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For form encoded payload types, use the HTML form names.
     *        </p>
     *        <p>
     *        For example, for an HTML form with the input element named <code>username1</code>, the username field
     *        specification is <code>username1</code>
     *        </p>
     *        </li>
     */

    public void setUsernameField(UsernameField usernameField) {
        this.usernameField = usernameField;
    }

    /**
     * <p>
     * The name of the field in the request payload that contains your customer's username.
     * </p>
     * <p>
     * How you specify this depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer syntax,
     * see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload <code>{ "form": { "username": "THE_USERNAME" } }</code>, the username field
     * specification is <code>/form/username</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with the input element named <code>username1</code>, the username field
     * specification is <code>username1</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the field in the request payload that contains your customer's username. </p>
     *         <p>
     *         How you specify this depends on the request inspection payload type.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer
     *         syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *         href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *         </p>
     *         <p>
     *         For example, for the JSON payload <code>{ "form": { "username": "THE_USERNAME" } }</code>, the username
     *         field specification is <code>/form/username</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For form encoded payload types, use the HTML form names.
     *         </p>
     *         <p>
     *         For example, for an HTML form with the input element named <code>username1</code>, the username field
     *         specification is <code>username1</code>
     *         </p>
     *         </li>
     */

    public UsernameField getUsernameField() {
        return this.usernameField;
    }

    /**
     * <p>
     * The name of the field in the request payload that contains your customer's username.
     * </p>
     * <p>
     * How you specify this depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer syntax,
     * see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload <code>{ "form": { "username": "THE_USERNAME" } }</code>, the username field
     * specification is <code>/form/username</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with the input element named <code>username1</code>, the username field
     * specification is <code>username1</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param usernameField
     *        The name of the field in the request payload that contains your customer's username. </p>
     *        <p>
     *        How you specify this depends on the request inspection payload type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer
     *        syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *        href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *        </p>
     *        <p>
     *        For example, for the JSON payload <code>{ "form": { "username": "THE_USERNAME" } }</code>, the username
     *        field specification is <code>/form/username</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For form encoded payload types, use the HTML form names.
     *        </p>
     *        <p>
     *        For example, for an HTML form with the input element named <code>username1</code>, the username field
     *        specification is <code>username1</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestInspectionACFP withUsernameField(UsernameField usernameField) {
        setUsernameField(usernameField);
        return this;
    }

    /**
     * <p>
     * The name of the field in the request payload that contains your customer's password.
     * </p>
     * <p>
     * How you specify this depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer syntax,
     * see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload <code>{ "form": { "password": "THE_PASSWORD" } }</code>, the password field
     * specification is <code>/form/password</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with the input element named <code>password1</code>, the password field
     * specification is <code>password1</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param passwordField
     *        The name of the field in the request payload that contains your customer's password. </p>
     *        <p>
     *        How you specify this depends on the request inspection payload type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer
     *        syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *        href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *        </p>
     *        <p>
     *        For example, for the JSON payload <code>{ "form": { "password": "THE_PASSWORD" } }</code>, the password
     *        field specification is <code>/form/password</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For form encoded payload types, use the HTML form names.
     *        </p>
     *        <p>
     *        For example, for an HTML form with the input element named <code>password1</code>, the password field
     *        specification is <code>password1</code>.
     *        </p>
     *        </li>
     */

    public void setPasswordField(PasswordField passwordField) {
        this.passwordField = passwordField;
    }

    /**
     * <p>
     * The name of the field in the request payload that contains your customer's password.
     * </p>
     * <p>
     * How you specify this depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer syntax,
     * see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload <code>{ "form": { "password": "THE_PASSWORD" } }</code>, the password field
     * specification is <code>/form/password</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with the input element named <code>password1</code>, the password field
     * specification is <code>password1</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the field in the request payload that contains your customer's password. </p>
     *         <p>
     *         How you specify this depends on the request inspection payload type.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer
     *         syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *         href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *         </p>
     *         <p>
     *         For example, for the JSON payload <code>{ "form": { "password": "THE_PASSWORD" } }</code>, the password
     *         field specification is <code>/form/password</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For form encoded payload types, use the HTML form names.
     *         </p>
     *         <p>
     *         For example, for an HTML form with the input element named <code>password1</code>, the password field
     *         specification is <code>password1</code>.
     *         </p>
     *         </li>
     */

    public PasswordField getPasswordField() {
        return this.passwordField;
    }

    /**
     * <p>
     * The name of the field in the request payload that contains your customer's password.
     * </p>
     * <p>
     * How you specify this depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer syntax,
     * see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload <code>{ "form": { "password": "THE_PASSWORD" } }</code>, the password field
     * specification is <code>/form/password</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with the input element named <code>password1</code>, the password field
     * specification is <code>password1</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param passwordField
     *        The name of the field in the request payload that contains your customer's password. </p>
     *        <p>
     *        How you specify this depends on the request inspection payload type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer
     *        syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *        href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *        </p>
     *        <p>
     *        For example, for the JSON payload <code>{ "form": { "password": "THE_PASSWORD" } }</code>, the password
     *        field specification is <code>/form/password</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For form encoded payload types, use the HTML form names.
     *        </p>
     *        <p>
     *        For example, for an HTML form with the input element named <code>password1</code>, the password field
     *        specification is <code>password1</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestInspectionACFP withPasswordField(PasswordField passwordField) {
        setPasswordField(passwordField);
        return this;
    }

    /**
     * <p>
     * The name of the field in the request payload that contains your customer's email.
     * </p>
     * <p>
     * How you specify this depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer syntax,
     * see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload <code>{ "form": { "email": "THE_EMAIL" } }</code>, the email field
     * specification is <code>/form/email</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with the input element named <code>email1</code>, the email field specification is
     * <code>email1</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param emailField
     *        The name of the field in the request payload that contains your customer's email. </p>
     *        <p>
     *        How you specify this depends on the request inspection payload type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer
     *        syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *        href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *        </p>
     *        <p>
     *        For example, for the JSON payload <code>{ "form": { "email": "THE_EMAIL" } }</code>, the email field
     *        specification is <code>/form/email</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For form encoded payload types, use the HTML form names.
     *        </p>
     *        <p>
     *        For example, for an HTML form with the input element named <code>email1</code>, the email field
     *        specification is <code>email1</code>.
     *        </p>
     *        </li>
     */

    public void setEmailField(EmailField emailField) {
        this.emailField = emailField;
    }

    /**
     * <p>
     * The name of the field in the request payload that contains your customer's email.
     * </p>
     * <p>
     * How you specify this depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer syntax,
     * see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload <code>{ "form": { "email": "THE_EMAIL" } }</code>, the email field
     * specification is <code>/form/email</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with the input element named <code>email1</code>, the email field specification is
     * <code>email1</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the field in the request payload that contains your customer's email. </p>
     *         <p>
     *         How you specify this depends on the request inspection payload type.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer
     *         syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *         href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *         </p>
     *         <p>
     *         For example, for the JSON payload <code>{ "form": { "email": "THE_EMAIL" } }</code>, the email field
     *         specification is <code>/form/email</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For form encoded payload types, use the HTML form names.
     *         </p>
     *         <p>
     *         For example, for an HTML form with the input element named <code>email1</code>, the email field
     *         specification is <code>email1</code>.
     *         </p>
     *         </li>
     */

    public EmailField getEmailField() {
        return this.emailField;
    }

    /**
     * <p>
     * The name of the field in the request payload that contains your customer's email.
     * </p>
     * <p>
     * How you specify this depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer syntax,
     * see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload <code>{ "form": { "email": "THE_EMAIL" } }</code>, the email field
     * specification is <code>/form/email</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with the input element named <code>email1</code>, the email field specification is
     * <code>email1</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param emailField
     *        The name of the field in the request payload that contains your customer's email. </p>
     *        <p>
     *        How you specify this depends on the request inspection payload type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer
     *        syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *        href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *        </p>
     *        <p>
     *        For example, for the JSON payload <code>{ "form": { "email": "THE_EMAIL" } }</code>, the email field
     *        specification is <code>/form/email</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For form encoded payload types, use the HTML form names.
     *        </p>
     *        <p>
     *        For example, for an HTML form with the input element named <code>email1</code>, the email field
     *        specification is <code>email1</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestInspectionACFP withEmailField(EmailField emailField) {
        setEmailField(emailField);
        return this;
    }

    /**
     * <p>
     * The names of the fields in the request payload that contain your customer's primary phone number.
     * </p>
     * <p>
     * Order the phone number fields in the array exactly as they are ordered in the request payload.
     * </p>
     * <p>
     * How you specify the phone number fields depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON Pointer
     * syntax, see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload
     * <code>{ "form": { "primaryphoneline1": "THE_PHONE1", "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }</code>
     * , the phone number field identifiers are <code>/form/primaryphoneline1</code>,
     * <code>/form/primaryphoneline2</code>, and <code>/form/primaryphoneline3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with input elements named <code>primaryphoneline1</code>,
     * <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>, the phone number field identifiers are
     * <code>primaryphoneline1</code>, <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The names of the fields in the request payload that contain your customer's primary phone number. </p>
     *         <p>
     *         Order the phone number fields in the array exactly as they are ordered in the request payload.
     *         </p>
     *         <p>
     *         How you specify the phone number fields depends on the request inspection payload type.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON
     *         Pointer syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *         href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *         </p>
     *         <p>
     *         For example, for the JSON payload
     *         <code>{ "form": { "primaryphoneline1": "THE_PHONE1", "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }</code>
     *         , the phone number field identifiers are <code>/form/primaryphoneline1</code>,
     *         <code>/form/primaryphoneline2</code>, and <code>/form/primaryphoneline3</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For form encoded payload types, use the HTML form names.
     *         </p>
     *         <p>
     *         For example, for an HTML form with input elements named <code>primaryphoneline1</code>,
     *         <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>, the phone number field identifiers
     *         are <code>primaryphoneline1</code>, <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<PhoneNumberField> getPhoneNumberFields() {
        return phoneNumberFields;
    }

    /**
     * <p>
     * The names of the fields in the request payload that contain your customer's primary phone number.
     * </p>
     * <p>
     * Order the phone number fields in the array exactly as they are ordered in the request payload.
     * </p>
     * <p>
     * How you specify the phone number fields depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON Pointer
     * syntax, see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload
     * <code>{ "form": { "primaryphoneline1": "THE_PHONE1", "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }</code>
     * , the phone number field identifiers are <code>/form/primaryphoneline1</code>,
     * <code>/form/primaryphoneline2</code>, and <code>/form/primaryphoneline3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with input elements named <code>primaryphoneline1</code>,
     * <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>, the phone number field identifiers are
     * <code>primaryphoneline1</code>, <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param phoneNumberFields
     *        The names of the fields in the request payload that contain your customer's primary phone number. </p>
     *        <p>
     *        Order the phone number fields in the array exactly as they are ordered in the request payload.
     *        </p>
     *        <p>
     *        How you specify the phone number fields depends on the request inspection payload type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON
     *        Pointer syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *        href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *        </p>
     *        <p>
     *        For example, for the JSON payload
     *        <code>{ "form": { "primaryphoneline1": "THE_PHONE1", "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }</code>
     *        , the phone number field identifiers are <code>/form/primaryphoneline1</code>,
     *        <code>/form/primaryphoneline2</code>, and <code>/form/primaryphoneline3</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For form encoded payload types, use the HTML form names.
     *        </p>
     *        <p>
     *        For example, for an HTML form with input elements named <code>primaryphoneline1</code>,
     *        <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>, the phone number field identifiers are
     *        <code>primaryphoneline1</code>, <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>.
     *        </p>
     *        </li>
     */

    public void setPhoneNumberFields(java.util.Collection<PhoneNumberField> phoneNumberFields) {
        if (phoneNumberFields == null) {
            this.phoneNumberFields = null;
            return;
        }

        this.phoneNumberFields = new java.util.ArrayList<PhoneNumberField>(phoneNumberFields);
    }

    /**
     * <p>
     * The names of the fields in the request payload that contain your customer's primary phone number.
     * </p>
     * <p>
     * Order the phone number fields in the array exactly as they are ordered in the request payload.
     * </p>
     * <p>
     * How you specify the phone number fields depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON Pointer
     * syntax, see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload
     * <code>{ "form": { "primaryphoneline1": "THE_PHONE1", "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }</code>
     * , the phone number field identifiers are <code>/form/primaryphoneline1</code>,
     * <code>/form/primaryphoneline2</code>, and <code>/form/primaryphoneline3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with input elements named <code>primaryphoneline1</code>,
     * <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>, the phone number field identifiers are
     * <code>primaryphoneline1</code>, <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumberFields(java.util.Collection)} or {@link #withPhoneNumberFields(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param phoneNumberFields
     *        The names of the fields in the request payload that contain your customer's primary phone number. </p>
     *        <p>
     *        Order the phone number fields in the array exactly as they are ordered in the request payload.
     *        </p>
     *        <p>
     *        How you specify the phone number fields depends on the request inspection payload type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON
     *        Pointer syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *        href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *        </p>
     *        <p>
     *        For example, for the JSON payload
     *        <code>{ "form": { "primaryphoneline1": "THE_PHONE1", "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }</code>
     *        , the phone number field identifiers are <code>/form/primaryphoneline1</code>,
     *        <code>/form/primaryphoneline2</code>, and <code>/form/primaryphoneline3</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For form encoded payload types, use the HTML form names.
     *        </p>
     *        <p>
     *        For example, for an HTML form with input elements named <code>primaryphoneline1</code>,
     *        <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>, the phone number field identifiers are
     *        <code>primaryphoneline1</code>, <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestInspectionACFP withPhoneNumberFields(PhoneNumberField... phoneNumberFields) {
        if (this.phoneNumberFields == null) {
            setPhoneNumberFields(new java.util.ArrayList<PhoneNumberField>(phoneNumberFields.length));
        }
        for (PhoneNumberField ele : phoneNumberFields) {
            this.phoneNumberFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the fields in the request payload that contain your customer's primary phone number.
     * </p>
     * <p>
     * Order the phone number fields in the array exactly as they are ordered in the request payload.
     * </p>
     * <p>
     * How you specify the phone number fields depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON Pointer
     * syntax, see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload
     * <code>{ "form": { "primaryphoneline1": "THE_PHONE1", "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }</code>
     * , the phone number field identifiers are <code>/form/primaryphoneline1</code>,
     * <code>/form/primaryphoneline2</code>, and <code>/form/primaryphoneline3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with input elements named <code>primaryphoneline1</code>,
     * <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>, the phone number field identifiers are
     * <code>primaryphoneline1</code>, <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param phoneNumberFields
     *        The names of the fields in the request payload that contain your customer's primary phone number. </p>
     *        <p>
     *        Order the phone number fields in the array exactly as they are ordered in the request payload.
     *        </p>
     *        <p>
     *        How you specify the phone number fields depends on the request inspection payload type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON
     *        Pointer syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *        href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *        </p>
     *        <p>
     *        For example, for the JSON payload
     *        <code>{ "form": { "primaryphoneline1": "THE_PHONE1", "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }</code>
     *        , the phone number field identifiers are <code>/form/primaryphoneline1</code>,
     *        <code>/form/primaryphoneline2</code>, and <code>/form/primaryphoneline3</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For form encoded payload types, use the HTML form names.
     *        </p>
     *        <p>
     *        For example, for an HTML form with input elements named <code>primaryphoneline1</code>,
     *        <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>, the phone number field identifiers are
     *        <code>primaryphoneline1</code>, <code>primaryphoneline2</code>, and <code>primaryphoneline3</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestInspectionACFP withPhoneNumberFields(java.util.Collection<PhoneNumberField> phoneNumberFields) {
        setPhoneNumberFields(phoneNumberFields);
        return this;
    }

    /**
     * <p>
     * The names of the fields in the request payload that contain your customer's primary physical address.
     * </p>
     * <p>
     * Order the address fields in the array exactly as they are ordered in the request payload.
     * </p>
     * <p>
     * How you specify the address fields depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON Pointer
     * syntax, see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload
     * <code>{ "form": { "primaryaddressline1": "THE_ADDRESS1", "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }</code>
     * , the address field idenfiers are <code>/form/primaryaddressline1</code>, <code>/form/primaryaddressline2</code>,
     * and <code>/form/primaryaddressline3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with input elements named <code>primaryaddressline1</code>,
     * <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>, the address fields identifiers are
     * <code>primaryaddressline1</code>, <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The names of the fields in the request payload that contain your customer's primary physical address.
     *         </p>
     *         <p>
     *         Order the address fields in the array exactly as they are ordered in the request payload.
     *         </p>
     *         <p>
     *         How you specify the address fields depends on the request inspection payload type.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON
     *         Pointer syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *         href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *         </p>
     *         <p>
     *         For example, for the JSON payload
     *         <code>{ "form": { "primaryaddressline1": "THE_ADDRESS1", "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }</code>
     *         , the address field idenfiers are <code>/form/primaryaddressline1</code>,
     *         <code>/form/primaryaddressline2</code>, and <code>/form/primaryaddressline3</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For form encoded payload types, use the HTML form names.
     *         </p>
     *         <p>
     *         For example, for an HTML form with input elements named <code>primaryaddressline1</code>,
     *         <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>, the address fields identifiers
     *         are <code>primaryaddressline1</code>, <code>primaryaddressline2</code>, and
     *         <code>primaryaddressline3</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<AddressField> getAddressFields() {
        return addressFields;
    }

    /**
     * <p>
     * The names of the fields in the request payload that contain your customer's primary physical address.
     * </p>
     * <p>
     * Order the address fields in the array exactly as they are ordered in the request payload.
     * </p>
     * <p>
     * How you specify the address fields depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON Pointer
     * syntax, see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload
     * <code>{ "form": { "primaryaddressline1": "THE_ADDRESS1", "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }</code>
     * , the address field idenfiers are <code>/form/primaryaddressline1</code>, <code>/form/primaryaddressline2</code>,
     * and <code>/form/primaryaddressline3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with input elements named <code>primaryaddressline1</code>,
     * <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>, the address fields identifiers are
     * <code>primaryaddressline1</code>, <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param addressFields
     *        The names of the fields in the request payload that contain your customer's primary physical address. </p>
     *        <p>
     *        Order the address fields in the array exactly as they are ordered in the request payload.
     *        </p>
     *        <p>
     *        How you specify the address fields depends on the request inspection payload type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON
     *        Pointer syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *        href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *        </p>
     *        <p>
     *        For example, for the JSON payload
     *        <code>{ "form": { "primaryaddressline1": "THE_ADDRESS1", "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }</code>
     *        , the address field idenfiers are <code>/form/primaryaddressline1</code>,
     *        <code>/form/primaryaddressline2</code>, and <code>/form/primaryaddressline3</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For form encoded payload types, use the HTML form names.
     *        </p>
     *        <p>
     *        For example, for an HTML form with input elements named <code>primaryaddressline1</code>,
     *        <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>, the address fields identifiers are
     *        <code>primaryaddressline1</code>, <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>.
     *        </p>
     *        </li>
     */

    public void setAddressFields(java.util.Collection<AddressField> addressFields) {
        if (addressFields == null) {
            this.addressFields = null;
            return;
        }

        this.addressFields = new java.util.ArrayList<AddressField>(addressFields);
    }

    /**
     * <p>
     * The names of the fields in the request payload that contain your customer's primary physical address.
     * </p>
     * <p>
     * Order the address fields in the array exactly as they are ordered in the request payload.
     * </p>
     * <p>
     * How you specify the address fields depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON Pointer
     * syntax, see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload
     * <code>{ "form": { "primaryaddressline1": "THE_ADDRESS1", "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }</code>
     * , the address field idenfiers are <code>/form/primaryaddressline1</code>, <code>/form/primaryaddressline2</code>,
     * and <code>/form/primaryaddressline3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with input elements named <code>primaryaddressline1</code>,
     * <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>, the address fields identifiers are
     * <code>primaryaddressline1</code>, <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddressFields(java.util.Collection)} or {@link #withAddressFields(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param addressFields
     *        The names of the fields in the request payload that contain your customer's primary physical address. </p>
     *        <p>
     *        Order the address fields in the array exactly as they are ordered in the request payload.
     *        </p>
     *        <p>
     *        How you specify the address fields depends on the request inspection payload type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON
     *        Pointer syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *        href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *        </p>
     *        <p>
     *        For example, for the JSON payload
     *        <code>{ "form": { "primaryaddressline1": "THE_ADDRESS1", "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }</code>
     *        , the address field idenfiers are <code>/form/primaryaddressline1</code>,
     *        <code>/form/primaryaddressline2</code>, and <code>/form/primaryaddressline3</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For form encoded payload types, use the HTML form names.
     *        </p>
     *        <p>
     *        For example, for an HTML form with input elements named <code>primaryaddressline1</code>,
     *        <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>, the address fields identifiers are
     *        <code>primaryaddressline1</code>, <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestInspectionACFP withAddressFields(AddressField... addressFields) {
        if (this.addressFields == null) {
            setAddressFields(new java.util.ArrayList<AddressField>(addressFields.length));
        }
        for (AddressField ele : addressFields) {
            this.addressFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the fields in the request payload that contain your customer's primary physical address.
     * </p>
     * <p>
     * Order the address fields in the array exactly as they are ordered in the request payload.
     * </p>
     * <p>
     * How you specify the address fields depends on the request inspection payload type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON Pointer
     * syntax, see the Internet Engineering Task Force (IETF) documentation <a
     * href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * For example, for the JSON payload
     * <code>{ "form": { "primaryaddressline1": "THE_ADDRESS1", "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }</code>
     * , the address field idenfiers are <code>/form/primaryaddressline1</code>, <code>/form/primaryaddressline2</code>,
     * and <code>/form/primaryaddressline3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For form encoded payload types, use the HTML form names.
     * </p>
     * <p>
     * For example, for an HTML form with input elements named <code>primaryaddressline1</code>,
     * <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>, the address fields identifiers are
     * <code>primaryaddressline1</code>, <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param addressFields
     *        The names of the fields in the request payload that contain your customer's primary physical address. </p>
     *        <p>
     *        Order the address fields in the array exactly as they are ordered in the request payload.
     *        </p>
     *        <p>
     *        How you specify the address fields depends on the request inspection payload type.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For JSON payloads, specify the field identifiers in JSON pointer syntax. For information about the JSON
     *        Pointer syntax, see the Internet Engineering Task Force (IETF) documentation <a
     *        href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *        </p>
     *        <p>
     *        For example, for the JSON payload
     *        <code>{ "form": { "primaryaddressline1": "THE_ADDRESS1", "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }</code>
     *        , the address field idenfiers are <code>/form/primaryaddressline1</code>,
     *        <code>/form/primaryaddressline2</code>, and <code>/form/primaryaddressline3</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For form encoded payload types, use the HTML form names.
     *        </p>
     *        <p>
     *        For example, for an HTML form with input elements named <code>primaryaddressline1</code>,
     *        <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>, the address fields identifiers are
     *        <code>primaryaddressline1</code>, <code>primaryaddressline2</code>, and <code>primaryaddressline3</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestInspectionACFP withAddressFields(java.util.Collection<AddressField> addressFields) {
        setAddressFields(addressFields);
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
        if (getPayloadType() != null)
            sb.append("PayloadType: ").append(getPayloadType()).append(",");
        if (getUsernameField() != null)
            sb.append("UsernameField: ").append(getUsernameField()).append(",");
        if (getPasswordField() != null)
            sb.append("PasswordField: ").append(getPasswordField()).append(",");
        if (getEmailField() != null)
            sb.append("EmailField: ").append(getEmailField()).append(",");
        if (getPhoneNumberFields() != null)
            sb.append("PhoneNumberFields: ").append(getPhoneNumberFields()).append(",");
        if (getAddressFields() != null)
            sb.append("AddressFields: ").append(getAddressFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestInspectionACFP == false)
            return false;
        RequestInspectionACFP other = (RequestInspectionACFP) obj;
        if (other.getPayloadType() == null ^ this.getPayloadType() == null)
            return false;
        if (other.getPayloadType() != null && other.getPayloadType().equals(this.getPayloadType()) == false)
            return false;
        if (other.getUsernameField() == null ^ this.getUsernameField() == null)
            return false;
        if (other.getUsernameField() != null && other.getUsernameField().equals(this.getUsernameField()) == false)
            return false;
        if (other.getPasswordField() == null ^ this.getPasswordField() == null)
            return false;
        if (other.getPasswordField() != null && other.getPasswordField().equals(this.getPasswordField()) == false)
            return false;
        if (other.getEmailField() == null ^ this.getEmailField() == null)
            return false;
        if (other.getEmailField() != null && other.getEmailField().equals(this.getEmailField()) == false)
            return false;
        if (other.getPhoneNumberFields() == null ^ this.getPhoneNumberFields() == null)
            return false;
        if (other.getPhoneNumberFields() != null && other.getPhoneNumberFields().equals(this.getPhoneNumberFields()) == false)
            return false;
        if (other.getAddressFields() == null ^ this.getAddressFields() == null)
            return false;
        if (other.getAddressFields() != null && other.getAddressFields().equals(this.getAddressFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPayloadType() == null) ? 0 : getPayloadType().hashCode());
        hashCode = prime * hashCode + ((getUsernameField() == null) ? 0 : getUsernameField().hashCode());
        hashCode = prime * hashCode + ((getPasswordField() == null) ? 0 : getPasswordField().hashCode());
        hashCode = prime * hashCode + ((getEmailField() == null) ? 0 : getEmailField().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberFields() == null) ? 0 : getPhoneNumberFields().hashCode());
        hashCode = prime * hashCode + ((getAddressFields() == null) ? 0 : getAddressFields().hashCode());
        return hashCode;
    }

    @Override
    public RequestInspectionACFP clone() {
        try {
            return (RequestInspectionACFP) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.RequestInspectionACFPMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

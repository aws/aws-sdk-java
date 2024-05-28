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
 * The criteria for inspecting login requests, used by the ATP rule group to validate credentials usage.
 * </p>
 * <p>
 * This is part of the <code>AWSManagedRulesATPRuleSet</code> configuration in <code>ManagedRuleGroupConfig</code>.
 * </p>
 * <p>
 * In these settings, you specify how your application accepts login attempts by providing the request payload type and
 * the names of the fields within the request body where the username and password are provided.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RequestInspection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestInspection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The payload type for your login endpoint, either JSON or form encoded.
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
     * The payload type for your login endpoint, either JSON or form encoded.
     * </p>
     * 
     * @param payloadType
     *        The payload type for your login endpoint, either JSON or form encoded.
     * @see PayloadType
     */

    public void setPayloadType(String payloadType) {
        this.payloadType = payloadType;
    }

    /**
     * <p>
     * The payload type for your login endpoint, either JSON or form encoded.
     * </p>
     * 
     * @return The payload type for your login endpoint, either JSON or form encoded.
     * @see PayloadType
     */

    public String getPayloadType() {
        return this.payloadType;
    }

    /**
     * <p>
     * The payload type for your login endpoint, either JSON or form encoded.
     * </p>
     * 
     * @param payloadType
     *        The payload type for your login endpoint, either JSON or form encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PayloadType
     */

    public RequestInspection withPayloadType(String payloadType) {
        setPayloadType(payloadType);
        return this;
    }

    /**
     * <p>
     * The payload type for your login endpoint, either JSON or form encoded.
     * </p>
     * 
     * @param payloadType
     *        The payload type for your login endpoint, either JSON or form encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PayloadType
     */

    public RequestInspection withPayloadType(PayloadType payloadType) {
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

    public RequestInspection withUsernameField(UsernameField usernameField) {
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

    public RequestInspection withPasswordField(PasswordField passwordField) {
        setPasswordField(passwordField);
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
            sb.append("PasswordField: ").append(getPasswordField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestInspection == false)
            return false;
        RequestInspection other = (RequestInspection) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPayloadType() == null) ? 0 : getPayloadType().hashCode());
        hashCode = prime * hashCode + ((getUsernameField() == null) ? 0 : getUsernameField().hashCode());
        hashCode = prime * hashCode + ((getPasswordField() == null) ? 0 : getPasswordField().hashCode());
        return hashCode;
    }

    @Override
    public RequestInspection clone() {
        try {
            return (RequestInspection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.RequestInspectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

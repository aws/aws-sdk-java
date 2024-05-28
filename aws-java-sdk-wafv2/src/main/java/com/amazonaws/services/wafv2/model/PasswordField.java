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
 * The name of the field in the request payload that contains your customer's password.
 * </p>
 * <p>
 * This data type is used in the <code>RequestInspection</code> and <code>RequestInspectionACFP</code> data types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/PasswordField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PasswordField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the password field.
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
    private String identifier;

    /**
     * <p>
     * The name of the password field.
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
     * @param identifier
     *        The name of the password field. </p>
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

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The name of the password field.
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
     * @return The name of the password field. </p>
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

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The name of the password field.
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
     * @param identifier
     *        The name of the password field. </p>
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

    public PasswordField withIdentifier(String identifier) {
        setIdentifier(identifier);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PasswordField == false)
            return false;
        PasswordField other = (PasswordField) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public PasswordField clone() {
        try {
            return (PasswordField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.PasswordFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

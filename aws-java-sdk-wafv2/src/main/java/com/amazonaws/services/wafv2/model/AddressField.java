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
 * The name of a field in the request payload that contains part or all of your customer's primary physical address.
 * </p>
 * <p>
 * This data type is used in the <code>RequestInspectionACFP</code> data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/AddressField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddressField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a single primary address field.
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
    private String identifier;

    /**
     * <p>
     * The name of a single primary address field.
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
     * @param identifier
     *        The name of a single primary address field. </p>
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

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The name of a single primary address field.
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
     * @return The name of a single primary address field. </p>
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

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The name of a single primary address field.
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
     * @param identifier
     *        The name of a single primary address field. </p>
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

    public AddressField withIdentifier(String identifier) {
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

        if (obj instanceof AddressField == false)
            return false;
        AddressField other = (AddressField) obj;
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
    public AddressField clone() {
        try {
            return (AddressField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.AddressFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

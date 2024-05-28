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
package com.amazonaws.services.personalizeevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents action metadata added to an Action dataset using the <code>PutActions</code> API. For more information see
 * <a href="https://docs.aws.amazon.com/personalize/latest/dg/importing-actions.html">Importing actions
 * individually</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/Action" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID associated with the action.
     * </p>
     */
    private String actionId;
    /**
     * <p>
     * A string map of action-specific metadata. Each element in the map consists of a key-value pair. For example,
     * <code>{"value": "100"}</code>.
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the schema for the Actions dataset. In the previous
     * example, the <code>value</code> matches the 'VALUE' field defined in the Actions schema. For categorical string
     * data, to include multiple categories for a single action, separate each category with a pipe separator (
     * <code>|</code>). For example, <code>\"Deluxe|Premium\"</code>.
     * </p>
     */
    private String properties;

    /**
     * <p>
     * The ID associated with the action.
     * </p>
     * 
     * @param actionId
     *        The ID associated with the action.
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * The ID associated with the action.
     * </p>
     * 
     * @return The ID associated with the action.
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * <p>
     * The ID associated with the action.
     * </p>
     * 
     * @param actionId
     *        The ID associated with the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withActionId(String actionId) {
        setActionId(actionId);
        return this;
    }

    /**
     * <p>
     * A string map of action-specific metadata. Each element in the map consists of a key-value pair. For example,
     * <code>{"value": "100"}</code>.
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the schema for the Actions dataset. In the previous
     * example, the <code>value</code> matches the 'VALUE' field defined in the Actions schema. For categorical string
     * data, to include multiple categories for a single action, separate each category with a pipe separator (
     * <code>|</code>). For example, <code>\"Deluxe|Premium\"</code>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param properties
     *        A string map of action-specific metadata. Each element in the map consists of a key-value pair. For
     *        example, <code>{"value": "100"}</code>.</p>
     *        <p>
     *        The keys use camel case names that match the fields in the schema for the Actions dataset. In the previous
     *        example, the <code>value</code> matches the 'VALUE' field defined in the Actions schema. For categorical
     *        string data, to include multiple categories for a single action, separate each category with a pipe
     *        separator (<code>|</code>). For example, <code>\"Deluxe|Premium\"</code>.
     */

    public void setProperties(String properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * A string map of action-specific metadata. Each element in the map consists of a key-value pair. For example,
     * <code>{"value": "100"}</code>.
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the schema for the Actions dataset. In the previous
     * example, the <code>value</code> matches the 'VALUE' field defined in the Actions schema. For categorical string
     * data, to include multiple categories for a single action, separate each category with a pipe separator (
     * <code>|</code>). For example, <code>\"Deluxe|Premium\"</code>.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return A string map of action-specific metadata. Each element in the map consists of a key-value pair. For
     *         example, <code>{"value": "100"}</code>.</p>
     *         <p>
     *         The keys use camel case names that match the fields in the schema for the Actions dataset. In the
     *         previous example, the <code>value</code> matches the 'VALUE' field defined in the Actions schema. For
     *         categorical string data, to include multiple categories for a single action, separate each category with
     *         a pipe separator (<code>|</code>). For example, <code>\"Deluxe|Premium\"</code>.
     */

    public String getProperties() {
        return this.properties;
    }

    /**
     * <p>
     * A string map of action-specific metadata. Each element in the map consists of a key-value pair. For example,
     * <code>{"value": "100"}</code>.
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the schema for the Actions dataset. In the previous
     * example, the <code>value</code> matches the 'VALUE' field defined in the Actions schema. For categorical string
     * data, to include multiple categories for a single action, separate each category with a pipe separator (
     * <code>|</code>). For example, <code>\"Deluxe|Premium\"</code>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param properties
     *        A string map of action-specific metadata. Each element in the map consists of a key-value pair. For
     *        example, <code>{"value": "100"}</code>.</p>
     *        <p>
     *        The keys use camel case names that match the fields in the schema for the Actions dataset. In the previous
     *        example, the <code>value</code> matches the 'VALUE' field defined in the Actions schema. For categorical
     *        string data, to include multiple categories for a single action, separate each category with a pipe
     *        separator (<code>|</code>). For example, <code>\"Deluxe|Premium\"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withProperties(String properties) {
        setProperties(properties);
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
        if (getActionId() != null)
            sb.append("ActionId: ").append(getActionId()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public Action clone() {
        try {
            return (Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalizeevents.model.transform.ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

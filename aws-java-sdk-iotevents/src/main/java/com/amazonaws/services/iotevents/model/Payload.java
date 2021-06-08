/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information needed to configure the payload.
 * </p>
 * <p>
 * By default, AWS IoT Events generates a standard payload in JSON for any action. This action payload contains all
 * attribute-value pairs that have the information about the detector model instance and the event triggered the action.
 * To configure the action payload, you can use <code>contentExpression</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/Payload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Payload implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The content of the payload. You can use a string expression that includes quoted strings (
     * <code>'&lt;string&gt;'</code>), variables (<code>$variable.&lt;variable-name&gt;</code>), input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>), string concatenations, and quoted strings that
     * contain <code>${}</code> as the content. The recommended maximum size of a content expression is 1 KB.
     * </p>
     */
    private String contentExpression;
    /**
     * <p>
     * The value of the payload type can be either <code>STRING</code> or <code>JSON</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The content of the payload. You can use a string expression that includes quoted strings (
     * <code>'&lt;string&gt;'</code>), variables (<code>$variable.&lt;variable-name&gt;</code>), input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>), string concatenations, and quoted strings that
     * contain <code>${}</code> as the content. The recommended maximum size of a content expression is 1 KB.
     * </p>
     * 
     * @param contentExpression
     *        The content of the payload. You can use a string expression that includes quoted strings (
     *        <code>'&lt;string&gt;'</code>), variables (<code>$variable.&lt;variable-name&gt;</code>), input values (
     *        <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>), string concatenations, and quoted strings
     *        that contain <code>${}</code> as the content. The recommended maximum size of a content expression is 1
     *        KB.
     */

    public void setContentExpression(String contentExpression) {
        this.contentExpression = contentExpression;
    }

    /**
     * <p>
     * The content of the payload. You can use a string expression that includes quoted strings (
     * <code>'&lt;string&gt;'</code>), variables (<code>$variable.&lt;variable-name&gt;</code>), input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>), string concatenations, and quoted strings that
     * contain <code>${}</code> as the content. The recommended maximum size of a content expression is 1 KB.
     * </p>
     * 
     * @return The content of the payload. You can use a string expression that includes quoted strings (
     *         <code>'&lt;string&gt;'</code>), variables (<code>$variable.&lt;variable-name&gt;</code>), input values (
     *         <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>), string concatenations, and quoted strings
     *         that contain <code>${}</code> as the content. The recommended maximum size of a content expression is 1
     *         KB.
     */

    public String getContentExpression() {
        return this.contentExpression;
    }

    /**
     * <p>
     * The content of the payload. You can use a string expression that includes quoted strings (
     * <code>'&lt;string&gt;'</code>), variables (<code>$variable.&lt;variable-name&gt;</code>), input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>), string concatenations, and quoted strings that
     * contain <code>${}</code> as the content. The recommended maximum size of a content expression is 1 KB.
     * </p>
     * 
     * @param contentExpression
     *        The content of the payload. You can use a string expression that includes quoted strings (
     *        <code>'&lt;string&gt;'</code>), variables (<code>$variable.&lt;variable-name&gt;</code>), input values (
     *        <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>), string concatenations, and quoted strings
     *        that contain <code>${}</code> as the content. The recommended maximum size of a content expression is 1
     *        KB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Payload withContentExpression(String contentExpression) {
        setContentExpression(contentExpression);
        return this;
    }

    /**
     * <p>
     * The value of the payload type can be either <code>STRING</code> or <code>JSON</code>.
     * </p>
     * 
     * @param type
     *        The value of the payload type can be either <code>STRING</code> or <code>JSON</code>.
     * @see PayloadType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The value of the payload type can be either <code>STRING</code> or <code>JSON</code>.
     * </p>
     * 
     * @return The value of the payload type can be either <code>STRING</code> or <code>JSON</code>.
     * @see PayloadType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The value of the payload type can be either <code>STRING</code> or <code>JSON</code>.
     * </p>
     * 
     * @param type
     *        The value of the payload type can be either <code>STRING</code> or <code>JSON</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PayloadType
     */

    public Payload withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The value of the payload type can be either <code>STRING</code> or <code>JSON</code>.
     * </p>
     * 
     * @param type
     *        The value of the payload type can be either <code>STRING</code> or <code>JSON</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PayloadType
     */

    public Payload withType(PayloadType type) {
        this.type = type.toString();
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
        if (getContentExpression() != null)
            sb.append("ContentExpression: ").append(getContentExpression()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Payload == false)
            return false;
        Payload other = (Payload) obj;
        if (other.getContentExpression() == null ^ this.getContentExpression() == null)
            return false;
        if (other.getContentExpression() != null && other.getContentExpression().equals(this.getContentExpression()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentExpression() == null) ? 0 : getContentExpression().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Payload clone() {
        try {
            return (Payload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.PayloadMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

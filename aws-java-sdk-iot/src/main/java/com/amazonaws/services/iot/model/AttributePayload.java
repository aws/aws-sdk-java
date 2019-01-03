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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The attribute payload.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributePayload implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A JSON string containing up to three key-value pair in JSON format. For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"string1\":\"string2\"}}</code>
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * Specifies whether the list of attributes provided in the <code>AttributePayload</code> is merged with the
     * attributes stored in the registry, instead of overwriting them.
     * </p>
     * <p>
     * To remove an attribute, call <code>UpdateThing</code> with an empty attribute value.
     * </p>
     * <note>
     * <p>
     * The <code>merge</code> attribute is only valid when calling <code>UpdateThing</code>.
     * </p>
     * </note>
     */
    private Boolean merge;

    /**
     * <p>
     * A JSON string containing up to three key-value pair in JSON format. For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"string1\":\"string2\"}}</code>
     * </p>
     * 
     * @return A JSON string containing up to three key-value pair in JSON format. For example:</p>
     *         <p>
     *         <code>{\"attributes\":{\"string1\":\"string2\"}}</code>
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A JSON string containing up to three key-value pair in JSON format. For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"string1\":\"string2\"}}</code>
     * </p>
     * 
     * @param attributes
     *        A JSON string containing up to three key-value pair in JSON format. For example:</p>
     *        <p>
     *        <code>{\"attributes\":{\"string1\":\"string2\"}}</code>
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A JSON string containing up to three key-value pair in JSON format. For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"string1\":\"string2\"}}</code>
     * </p>
     * 
     * @param attributes
     *        A JSON string containing up to three key-value pair in JSON format. For example:</p>
     *        <p>
     *        <code>{\"attributes\":{\"string1\":\"string2\"}}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributePayload withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public AttributePayload addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributePayload clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Specifies whether the list of attributes provided in the <code>AttributePayload</code> is merged with the
     * attributes stored in the registry, instead of overwriting them.
     * </p>
     * <p>
     * To remove an attribute, call <code>UpdateThing</code> with an empty attribute value.
     * </p>
     * <note>
     * <p>
     * The <code>merge</code> attribute is only valid when calling <code>UpdateThing</code>.
     * </p>
     * </note>
     * 
     * @param merge
     *        Specifies whether the list of attributes provided in the <code>AttributePayload</code> is merged with the
     *        attributes stored in the registry, instead of overwriting them.</p>
     *        <p>
     *        To remove an attribute, call <code>UpdateThing</code> with an empty attribute value.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>merge</code> attribute is only valid when calling <code>UpdateThing</code>.
     *        </p>
     */

    public void setMerge(Boolean merge) {
        this.merge = merge;
    }

    /**
     * <p>
     * Specifies whether the list of attributes provided in the <code>AttributePayload</code> is merged with the
     * attributes stored in the registry, instead of overwriting them.
     * </p>
     * <p>
     * To remove an attribute, call <code>UpdateThing</code> with an empty attribute value.
     * </p>
     * <note>
     * <p>
     * The <code>merge</code> attribute is only valid when calling <code>UpdateThing</code>.
     * </p>
     * </note>
     * 
     * @return Specifies whether the list of attributes provided in the <code>AttributePayload</code> is merged with the
     *         attributes stored in the registry, instead of overwriting them.</p>
     *         <p>
     *         To remove an attribute, call <code>UpdateThing</code> with an empty attribute value.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>merge</code> attribute is only valid when calling <code>UpdateThing</code>.
     *         </p>
     */

    public Boolean getMerge() {
        return this.merge;
    }

    /**
     * <p>
     * Specifies whether the list of attributes provided in the <code>AttributePayload</code> is merged with the
     * attributes stored in the registry, instead of overwriting them.
     * </p>
     * <p>
     * To remove an attribute, call <code>UpdateThing</code> with an empty attribute value.
     * </p>
     * <note>
     * <p>
     * The <code>merge</code> attribute is only valid when calling <code>UpdateThing</code>.
     * </p>
     * </note>
     * 
     * @param merge
     *        Specifies whether the list of attributes provided in the <code>AttributePayload</code> is merged with the
     *        attributes stored in the registry, instead of overwriting them.</p>
     *        <p>
     *        To remove an attribute, call <code>UpdateThing</code> with an empty attribute value.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>merge</code> attribute is only valid when calling <code>UpdateThing</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributePayload withMerge(Boolean merge) {
        setMerge(merge);
        return this;
    }

    /**
     * <p>
     * Specifies whether the list of attributes provided in the <code>AttributePayload</code> is merged with the
     * attributes stored in the registry, instead of overwriting them.
     * </p>
     * <p>
     * To remove an attribute, call <code>UpdateThing</code> with an empty attribute value.
     * </p>
     * <note>
     * <p>
     * The <code>merge</code> attribute is only valid when calling <code>UpdateThing</code>.
     * </p>
     * </note>
     * 
     * @return Specifies whether the list of attributes provided in the <code>AttributePayload</code> is merged with the
     *         attributes stored in the registry, instead of overwriting them.</p>
     *         <p>
     *         To remove an attribute, call <code>UpdateThing</code> with an empty attribute value.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>merge</code> attribute is only valid when calling <code>UpdateThing</code>.
     *         </p>
     */

    public Boolean isMerge() {
        return this.merge;
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getMerge() != null)
            sb.append("Merge: ").append(getMerge());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributePayload == false)
            return false;
        AttributePayload other = (AttributePayload) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getMerge() == null ^ this.getMerge() == null)
            return false;
        if (other.getMerge() != null && other.getMerge().equals(this.getMerge()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getMerge() == null) ? 0 : getMerge().hashCode());
        return hashCode;
    }

    @Override
    public AttributePayload clone() {
        try {
            return (AttributePayload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AttributePayloadMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

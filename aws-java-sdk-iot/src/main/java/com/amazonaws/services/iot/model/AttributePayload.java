/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The attribute payload, a JSON string containing up to three key-value pairs.
 * </p>
 * <p>
 * For example: {\"attributes\":{\"string1\":\"string2\"}}
 * </p>
 */
public class AttributePayload implements Serializable, Cloneable {

    /**
     * <p>
     * A JSON string containing up to three key-value pair in JSON format.
     * </p>
     * <p>
     * For example: {\"attributes\":{\"string1\":\"string2\"}}
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * A JSON string containing up to three key-value pair in JSON format.
     * </p>
     * <p>
     * For example: {\"attributes\":{\"string1\":\"string2\"}}
     * </p>
     * 
     * @return A JSON string containing up to three key-value pair in JSON
     *         format.</p>
     *         <p>
     *         For example: {\"attributes\":{\"string1\":\"string2\"}}
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A JSON string containing up to three key-value pair in JSON format.
     * </p>
     * <p>
     * For example: {\"attributes\":{\"string1\":\"string2\"}}
     * </p>
     * 
     * @param attributes
     *        A JSON string containing up to three key-value pair in JSON
     *        format.</p>
     *        <p>
     *        For example: {\"attributes\":{\"string1\":\"string2\"}}
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A JSON string containing up to three key-value pair in JSON format.
     * </p>
     * <p>
     * For example: {\"attributes\":{\"string1\":\"string2\"}}
     * </p>
     * 
     * @param attributes
     *        A JSON string containing up to three key-value pair in JSON
     *        format.</p>
     *        <p>
     *        For example: {\"attributes\":{\"string1\":\"string2\"}}
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AttributePayload withAttributes(
            java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public AttributePayload addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes. &lt;p> Returns a reference
     * to this object so that method calls can be chained together.
     */
    public AttributePayload clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("Attributes: " + getAttributes());
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
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public AttributePayload clone() {
        try {
            return (AttributePayload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
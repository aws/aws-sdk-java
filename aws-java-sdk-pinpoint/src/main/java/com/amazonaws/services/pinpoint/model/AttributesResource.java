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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Attributes.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/AttributesResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributesResource implements Serializable, Cloneable, StructuredPojo {

    /** The unique ID for the application. */
    private String applicationId;
    /** The attribute type for the application. */
    private String attributeType;
    /** The attributes for the application. */
    private java.util.List<String> attributes;

    /**
     * The unique ID for the application.
     * 
     * @param applicationId
     *        The unique ID for the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The unique ID for the application.
     * 
     * @return The unique ID for the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The unique ID for the application.
     * 
     * @param applicationId
     *        The unique ID for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributesResource withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * The attribute type for the application.
     * 
     * @param attributeType
     *        The attribute type for the application.
     */

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * The attribute type for the application.
     * 
     * @return The attribute type for the application.
     */

    public String getAttributeType() {
        return this.attributeType;
    }

    /**
     * The attribute type for the application.
     * 
     * @param attributeType
     *        The attribute type for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributesResource withAttributeType(String attributeType) {
        setAttributeType(attributeType);
        return this;
    }

    /**
     * The attributes for the application.
     * 
     * @return The attributes for the application.
     */

    public java.util.List<String> getAttributes() {
        return attributes;
    }

    /**
     * The attributes for the application.
     * 
     * @param attributes
     *        The attributes for the application.
     */

    public void setAttributes(java.util.Collection<String> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<String>(attributes);
    }

    /**
     * The attributes for the application.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The attributes for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributesResource withAttributes(String... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<String>(attributes.length));
        }
        for (String ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * The attributes for the application.
     * 
     * @param attributes
     *        The attributes for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributesResource withAttributes(java.util.Collection<String> attributes) {
        setAttributes(attributes);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getAttributeType() != null)
            sb.append("AttributeType: ").append(getAttributeType()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributesResource == false)
            return false;
        AttributesResource other = (AttributesResource) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getAttributeType() == null ^ this.getAttributeType() == null)
            return false;
        if (other.getAttributeType() != null && other.getAttributeType().equals(this.getAttributeType()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getAttributeType() == null) ? 0 : getAttributeType().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public AttributesResource clone() {
        try {
            return (AttributesResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.AttributesResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

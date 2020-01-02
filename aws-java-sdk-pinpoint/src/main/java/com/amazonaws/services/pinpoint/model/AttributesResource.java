/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Provides information about the type and the names of attributes that were removed from all the endpoints that are
 * associated with an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/AttributesResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributesResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The type of attribute or attributes that were removed from the endpoints. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * endpoint-custom-attributes - Custom attributes that describe endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-metric-attributes - Custom metrics that your app reports to Amazon Pinpoint for endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-user-attributes - Custom attributes that describe users.
     * </p>
     * </li>
     * </ul>
     */
    private String attributeType;
    /**
     * <p>
     * An array that specifies the names of the attributes that were removed from the endpoints.
     * </p>
     */
    private java.util.List<String> attributes;

    /**
     * <p>
     * The unique identifier for the application.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application.
     * </p>
     * 
     * @return The unique identifier for the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributesResource withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The type of attribute or attributes that were removed from the endpoints. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * endpoint-custom-attributes - Custom attributes that describe endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-metric-attributes - Custom metrics that your app reports to Amazon Pinpoint for endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-user-attributes - Custom attributes that describe users.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributeType
     *        The type of attribute or attributes that were removed from the endpoints. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        endpoint-custom-attributes - Custom attributes that describe endpoints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        endpoint-metric-attributes - Custom metrics that your app reports to Amazon Pinpoint for endpoints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        endpoint-user-attributes - Custom attributes that describe users.
     *        </p>
     *        </li>
     */

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * <p>
     * The type of attribute or attributes that were removed from the endpoints. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * endpoint-custom-attributes - Custom attributes that describe endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-metric-attributes - Custom metrics that your app reports to Amazon Pinpoint for endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-user-attributes - Custom attributes that describe users.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of attribute or attributes that were removed from the endpoints. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         endpoint-custom-attributes - Custom attributes that describe endpoints.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         endpoint-metric-attributes - Custom metrics that your app reports to Amazon Pinpoint for endpoints.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         endpoint-user-attributes - Custom attributes that describe users.
     *         </p>
     *         </li>
     */

    public String getAttributeType() {
        return this.attributeType;
    }

    /**
     * <p>
     * The type of attribute or attributes that were removed from the endpoints. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * endpoint-custom-attributes - Custom attributes that describe endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-metric-attributes - Custom metrics that your app reports to Amazon Pinpoint for endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-user-attributes - Custom attributes that describe users.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributeType
     *        The type of attribute or attributes that were removed from the endpoints. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        endpoint-custom-attributes - Custom attributes that describe endpoints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        endpoint-metric-attributes - Custom metrics that your app reports to Amazon Pinpoint for endpoints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        endpoint-user-attributes - Custom attributes that describe users.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributesResource withAttributeType(String attributeType) {
        setAttributeType(attributeType);
        return this;
    }

    /**
     * <p>
     * An array that specifies the names of the attributes that were removed from the endpoints.
     * </p>
     * 
     * @return An array that specifies the names of the attributes that were removed from the endpoints.
     */

    public java.util.List<String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * An array that specifies the names of the attributes that were removed from the endpoints.
     * </p>
     * 
     * @param attributes
     *        An array that specifies the names of the attributes that were removed from the endpoints.
     */

    public void setAttributes(java.util.Collection<String> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<String>(attributes);
    }

    /**
     * <p>
     * An array that specifies the names of the attributes that were removed from the endpoints.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        An array that specifies the names of the attributes that were removed from the endpoints.
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
     * <p>
     * An array that specifies the names of the attributes that were removed from the endpoints.
     * </p>
     * 
     * @param attributes
     *        An array that specifies the names of the attributes that were removed from the endpoints.
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

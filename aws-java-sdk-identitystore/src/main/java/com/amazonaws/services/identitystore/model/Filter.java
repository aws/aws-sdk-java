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
package com.amazonaws.services.identitystore.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A query filter used by <code>ListUsers</code> and <code>ListGroup</code>. This filter object provides the attribute
 * name and attribute value to search users or groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attribute path used to specify which attribute name to search. Length limit is 255 characters. For example,
     * <code>UserName</code> is a valid attribute path for the <code>ListUsers</code> API, and <code>DisplayName</code>
     * is a valid attribute path for the <code>ListGroups</code> API.
     * </p>
     */
    private String attributePath;
    /**
     * <p>
     * Represents the data for an attribute. Each attribute value is described as a name-value pair.
     * </p>
     */
    private String attributeValue;

    /**
     * <p>
     * The attribute path used to specify which attribute name to search. Length limit is 255 characters. For example,
     * <code>UserName</code> is a valid attribute path for the <code>ListUsers</code> API, and <code>DisplayName</code>
     * is a valid attribute path for the <code>ListGroups</code> API.
     * </p>
     * 
     * @param attributePath
     *        The attribute path used to specify which attribute name to search. Length limit is 255 characters. For
     *        example, <code>UserName</code> is a valid attribute path for the <code>ListUsers</code> API, and
     *        <code>DisplayName</code> is a valid attribute path for the <code>ListGroups</code> API.
     */

    public void setAttributePath(String attributePath) {
        this.attributePath = attributePath;
    }

    /**
     * <p>
     * The attribute path used to specify which attribute name to search. Length limit is 255 characters. For example,
     * <code>UserName</code> is a valid attribute path for the <code>ListUsers</code> API, and <code>DisplayName</code>
     * is a valid attribute path for the <code>ListGroups</code> API.
     * </p>
     * 
     * @return The attribute path used to specify which attribute name to search. Length limit is 255 characters. For
     *         example, <code>UserName</code> is a valid attribute path for the <code>ListUsers</code> API, and
     *         <code>DisplayName</code> is a valid attribute path for the <code>ListGroups</code> API.
     */

    public String getAttributePath() {
        return this.attributePath;
    }

    /**
     * <p>
     * The attribute path used to specify which attribute name to search. Length limit is 255 characters. For example,
     * <code>UserName</code> is a valid attribute path for the <code>ListUsers</code> API, and <code>DisplayName</code>
     * is a valid attribute path for the <code>ListGroups</code> API.
     * </p>
     * 
     * @param attributePath
     *        The attribute path used to specify which attribute name to search. Length limit is 255 characters. For
     *        example, <code>UserName</code> is a valid attribute path for the <code>ListUsers</code> API, and
     *        <code>DisplayName</code> is a valid attribute path for the <code>ListGroups</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withAttributePath(String attributePath) {
        setAttributePath(attributePath);
        return this;
    }

    /**
     * <p>
     * Represents the data for an attribute. Each attribute value is described as a name-value pair.
     * </p>
     * 
     * @param attributeValue
     *        Represents the data for an attribute. Each attribute value is described as a name-value pair.
     */

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * Represents the data for an attribute. Each attribute value is described as a name-value pair.
     * </p>
     * 
     * @return Represents the data for an attribute. Each attribute value is described as a name-value pair.
     */

    public String getAttributeValue() {
        return this.attributeValue;
    }

    /**
     * <p>
     * Represents the data for an attribute. Each attribute value is described as a name-value pair.
     * </p>
     * 
     * @param attributeValue
     *        Represents the data for an attribute. Each attribute value is described as a name-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withAttributeValue(String attributeValue) {
        setAttributeValue(attributeValue);
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
        if (getAttributePath() != null)
            sb.append("AttributePath: ").append(getAttributePath()).append(",");
        if (getAttributeValue() != null)
            sb.append("AttributeValue: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getAttributePath() == null ^ this.getAttributePath() == null)
            return false;
        if (other.getAttributePath() != null && other.getAttributePath().equals(this.getAttributePath()) == false)
            return false;
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributePath() == null) ? 0 : getAttributePath().hashCode());
        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.identitystore.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

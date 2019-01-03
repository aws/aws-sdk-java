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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an attribute and value that filter the events returned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/LookupAttribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LookupAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies an attribute on which to filter the events returned.
     * </p>
     */
    private String attributeKey;
    /**
     * <p>
     * Specifies a value for the specified AttributeKey.
     * </p>
     */
    private String attributeValue;

    /**
     * <p>
     * Specifies an attribute on which to filter the events returned.
     * </p>
     * 
     * @param attributeKey
     *        Specifies an attribute on which to filter the events returned.
     * @see LookupAttributeKey
     */

    public void setAttributeKey(String attributeKey) {
        this.attributeKey = attributeKey;
    }

    /**
     * <p>
     * Specifies an attribute on which to filter the events returned.
     * </p>
     * 
     * @return Specifies an attribute on which to filter the events returned.
     * @see LookupAttributeKey
     */

    public String getAttributeKey() {
        return this.attributeKey;
    }

    /**
     * <p>
     * Specifies an attribute on which to filter the events returned.
     * </p>
     * 
     * @param attributeKey
     *        Specifies an attribute on which to filter the events returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookupAttributeKey
     */

    public LookupAttribute withAttributeKey(String attributeKey) {
        setAttributeKey(attributeKey);
        return this;
    }

    /**
     * <p>
     * Specifies an attribute on which to filter the events returned.
     * </p>
     * 
     * @param attributeKey
     *        Specifies an attribute on which to filter the events returned.
     * @see LookupAttributeKey
     */

    public void setAttributeKey(LookupAttributeKey attributeKey) {
        withAttributeKey(attributeKey);
    }

    /**
     * <p>
     * Specifies an attribute on which to filter the events returned.
     * </p>
     * 
     * @param attributeKey
     *        Specifies an attribute on which to filter the events returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookupAttributeKey
     */

    public LookupAttribute withAttributeKey(LookupAttributeKey attributeKey) {
        this.attributeKey = attributeKey.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a value for the specified AttributeKey.
     * </p>
     * 
     * @param attributeValue
     *        Specifies a value for the specified AttributeKey.
     */

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * Specifies a value for the specified AttributeKey.
     * </p>
     * 
     * @return Specifies a value for the specified AttributeKey.
     */

    public String getAttributeValue() {
        return this.attributeValue;
    }

    /**
     * <p>
     * Specifies a value for the specified AttributeKey.
     * </p>
     * 
     * @param attributeValue
     *        Specifies a value for the specified AttributeKey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupAttribute withAttributeValue(String attributeValue) {
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
        if (getAttributeKey() != null)
            sb.append("AttributeKey: ").append(getAttributeKey()).append(",");
        if (getAttributeValue() != null)
            sb.append("AttributeValue: ").append(getAttributeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LookupAttribute == false)
            return false;
        LookupAttribute other = (LookupAttribute) obj;
        if (other.getAttributeKey() == null ^ this.getAttributeKey() == null)
            return false;
        if (other.getAttributeKey() != null && other.getAttributeKey().equals(this.getAttributeKey()) == false)
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

        hashCode = prime * hashCode + ((getAttributeKey() == null) ? 0 : getAttributeKey().hashCode());
        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        return hashCode;
    }

    @Override
    public LookupAttribute clone() {
        try {
            return (LookupAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.LookupAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

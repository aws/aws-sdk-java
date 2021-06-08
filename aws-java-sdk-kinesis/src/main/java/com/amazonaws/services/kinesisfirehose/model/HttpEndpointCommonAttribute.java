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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the metadata that's delivered to the specified HTTP endpoint destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/HttpEndpointCommonAttribute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpEndpointCommonAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the HTTP endpoint common attribute.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The value of the HTTP endpoint common attribute.
     * </p>
     */
    private String attributeValue;

    /**
     * <p>
     * The name of the HTTP endpoint common attribute.
     * </p>
     * 
     * @param attributeName
     *        The name of the HTTP endpoint common attribute.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the HTTP endpoint common attribute.
     * </p>
     * 
     * @return The name of the HTTP endpoint common attribute.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the HTTP endpoint common attribute.
     * </p>
     * 
     * @param attributeName
     *        The name of the HTTP endpoint common attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpEndpointCommonAttribute withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The value of the HTTP endpoint common attribute.
     * </p>
     * 
     * @param attributeValue
     *        The value of the HTTP endpoint common attribute.
     */

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The value of the HTTP endpoint common attribute.
     * </p>
     * 
     * @return The value of the HTTP endpoint common attribute.
     */

    public String getAttributeValue() {
        return this.attributeValue;
    }

    /**
     * <p>
     * The value of the HTTP endpoint common attribute.
     * </p>
     * 
     * @param attributeValue
     *        The value of the HTTP endpoint common attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpEndpointCommonAttribute withAttributeValue(String attributeValue) {
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof HttpEndpointCommonAttribute == false)
            return false;
        HttpEndpointCommonAttribute other = (HttpEndpointCommonAttribute) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
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

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        return hashCode;
    }

    @Override
    public HttpEndpointCommonAttribute clone() {
        try {
            return (HttpEndpointCommonAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.HttpEndpointCommonAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

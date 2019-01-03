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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a segment annotation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/ValueWithServiceIds" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValueWithServiceIds implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Values of the annotation.
     * </p>
     */
    private AnnotationValue annotationValue;
    /**
     * <p>
     * Services to which the annotation applies.
     * </p>
     */
    private java.util.List<ServiceId> serviceIds;

    /**
     * <p>
     * Values of the annotation.
     * </p>
     * 
     * @param annotationValue
     *        Values of the annotation.
     */

    public void setAnnotationValue(AnnotationValue annotationValue) {
        this.annotationValue = annotationValue;
    }

    /**
     * <p>
     * Values of the annotation.
     * </p>
     * 
     * @return Values of the annotation.
     */

    public AnnotationValue getAnnotationValue() {
        return this.annotationValue;
    }

    /**
     * <p>
     * Values of the annotation.
     * </p>
     * 
     * @param annotationValue
     *        Values of the annotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValueWithServiceIds withAnnotationValue(AnnotationValue annotationValue) {
        setAnnotationValue(annotationValue);
        return this;
    }

    /**
     * <p>
     * Services to which the annotation applies.
     * </p>
     * 
     * @return Services to which the annotation applies.
     */

    public java.util.List<ServiceId> getServiceIds() {
        return serviceIds;
    }

    /**
     * <p>
     * Services to which the annotation applies.
     * </p>
     * 
     * @param serviceIds
     *        Services to which the annotation applies.
     */

    public void setServiceIds(java.util.Collection<ServiceId> serviceIds) {
        if (serviceIds == null) {
            this.serviceIds = null;
            return;
        }

        this.serviceIds = new java.util.ArrayList<ServiceId>(serviceIds);
    }

    /**
     * <p>
     * Services to which the annotation applies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceIds(java.util.Collection)} or {@link #withServiceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serviceIds
     *        Services to which the annotation applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValueWithServiceIds withServiceIds(ServiceId... serviceIds) {
        if (this.serviceIds == null) {
            setServiceIds(new java.util.ArrayList<ServiceId>(serviceIds.length));
        }
        for (ServiceId ele : serviceIds) {
            this.serviceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Services to which the annotation applies.
     * </p>
     * 
     * @param serviceIds
     *        Services to which the annotation applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValueWithServiceIds withServiceIds(java.util.Collection<ServiceId> serviceIds) {
        setServiceIds(serviceIds);
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
        if (getAnnotationValue() != null)
            sb.append("AnnotationValue: ").append(getAnnotationValue()).append(",");
        if (getServiceIds() != null)
            sb.append("ServiceIds: ").append(getServiceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValueWithServiceIds == false)
            return false;
        ValueWithServiceIds other = (ValueWithServiceIds) obj;
        if (other.getAnnotationValue() == null ^ this.getAnnotationValue() == null)
            return false;
        if (other.getAnnotationValue() != null && other.getAnnotationValue().equals(this.getAnnotationValue()) == false)
            return false;
        if (other.getServiceIds() == null ^ this.getServiceIds() == null)
            return false;
        if (other.getServiceIds() != null && other.getServiceIds().equals(this.getServiceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnnotationValue() == null) ? 0 : getAnnotationValue().hashCode());
        hashCode = prime * hashCode + ((getServiceIds() == null) ? 0 : getServiceIds().hashCode());
        return hashCode;
    }

    @Override
    public ValueWithServiceIds clone() {
        try {
            return (ValueWithServiceIds) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.ValueWithServiceIdsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

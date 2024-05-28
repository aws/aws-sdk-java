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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A geolocation target that you select to index. Each geolocation target contains a <code>name</code> and
 * <code>order</code> key-value pair that specifies the geolocation target fields.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeoLocationTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>name</code> of the geolocation target field. If the target field is part of a named shadow, you must
     * select the named shadow using the <code>namedShadow</code> filter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The <code>order</code> of the geolocation target field. This field is optional. The default value is
     * <code>LatLon</code>.
     * </p>
     */
    private String order;

    /**
     * <p>
     * The <code>name</code> of the geolocation target field. If the target field is part of a named shadow, you must
     * select the named shadow using the <code>namedShadow</code> filter.
     * </p>
     * 
     * @param name
     *        The <code>name</code> of the geolocation target field. If the target field is part of a named shadow, you
     *        must select the named shadow using the <code>namedShadow</code> filter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The <code>name</code> of the geolocation target field. If the target field is part of a named shadow, you must
     * select the named shadow using the <code>namedShadow</code> filter.
     * </p>
     * 
     * @return The <code>name</code> of the geolocation target field. If the target field is part of a named shadow, you
     *         must select the named shadow using the <code>namedShadow</code> filter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The <code>name</code> of the geolocation target field. If the target field is part of a named shadow, you must
     * select the named shadow using the <code>namedShadow</code> filter.
     * </p>
     * 
     * @param name
     *        The <code>name</code> of the geolocation target field. If the target field is part of a named shadow, you
     *        must select the named shadow using the <code>namedShadow</code> filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoLocationTarget withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The <code>order</code> of the geolocation target field. This field is optional. The default value is
     * <code>LatLon</code>.
     * </p>
     * 
     * @param order
     *        The <code>order</code> of the geolocation target field. This field is optional. The default value is
     *        <code>LatLon</code>.
     * @see TargetFieldOrder
     */

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * <p>
     * The <code>order</code> of the geolocation target field. This field is optional. The default value is
     * <code>LatLon</code>.
     * </p>
     * 
     * @return The <code>order</code> of the geolocation target field. This field is optional. The default value is
     *         <code>LatLon</code>.
     * @see TargetFieldOrder
     */

    public String getOrder() {
        return this.order;
    }

    /**
     * <p>
     * The <code>order</code> of the geolocation target field. This field is optional. The default value is
     * <code>LatLon</code>.
     * </p>
     * 
     * @param order
     *        The <code>order</code> of the geolocation target field. This field is optional. The default value is
     *        <code>LatLon</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetFieldOrder
     */

    public GeoLocationTarget withOrder(String order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * The <code>order</code> of the geolocation target field. This field is optional. The default value is
     * <code>LatLon</code>.
     * </p>
     * 
     * @param order
     *        The <code>order</code> of the geolocation target field. This field is optional. The default value is
     *        <code>LatLon</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetFieldOrder
     */

    public GeoLocationTarget withOrder(TargetFieldOrder order) {
        this.order = order.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoLocationTarget == false)
            return false;
        GeoLocationTarget other = (GeoLocationTarget) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        return hashCode;
    }

    @Override
    public GeoLocationTarget clone() {
        try {
            return (GeoLocationTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.GeoLocationTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

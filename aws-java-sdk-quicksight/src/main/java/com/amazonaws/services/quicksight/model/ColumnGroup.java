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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Groupings of columns that work together in certain Amazon QuickSight features. This is a variant type structure. For
 * this structure to be valid, only one of the attributes can be non-null.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ColumnGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Geospatial column group that denotes a hierarchy.
     * </p>
     */
    private GeoSpatialColumnGroup geoSpatialColumnGroup;

    /**
     * <p>
     * Geospatial column group that denotes a hierarchy.
     * </p>
     * 
     * @param geoSpatialColumnGroup
     *        Geospatial column group that denotes a hierarchy.
     */

    public void setGeoSpatialColumnGroup(GeoSpatialColumnGroup geoSpatialColumnGroup) {
        this.geoSpatialColumnGroup = geoSpatialColumnGroup;
    }

    /**
     * <p>
     * Geospatial column group that denotes a hierarchy.
     * </p>
     * 
     * @return Geospatial column group that denotes a hierarchy.
     */

    public GeoSpatialColumnGroup getGeoSpatialColumnGroup() {
        return this.geoSpatialColumnGroup;
    }

    /**
     * <p>
     * Geospatial column group that denotes a hierarchy.
     * </p>
     * 
     * @param geoSpatialColumnGroup
     *        Geospatial column group that denotes a hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnGroup withGeoSpatialColumnGroup(GeoSpatialColumnGroup geoSpatialColumnGroup) {
        setGeoSpatialColumnGroup(geoSpatialColumnGroup);
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
        if (getGeoSpatialColumnGroup() != null)
            sb.append("GeoSpatialColumnGroup: ").append(getGeoSpatialColumnGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnGroup == false)
            return false;
        ColumnGroup other = (ColumnGroup) obj;
        if (other.getGeoSpatialColumnGroup() == null ^ this.getGeoSpatialColumnGroup() == null)
            return false;
        if (other.getGeoSpatialColumnGroup() != null && other.getGeoSpatialColumnGroup().equals(this.getGeoSpatialColumnGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeoSpatialColumnGroup() == null) ? 0 : getGeoSpatialColumnGroup().hashCode());
        return hashCode;
    }

    @Override
    public ColumnGroup clone() {
        try {
            return (ColumnGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ColumnGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

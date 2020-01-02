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
 * Geospatial column group that denotes a hierarchy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GeoSpatialColumnGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeoSpatialColumnGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A display name for the hierarchy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Country code.
     * </p>
     */
    private String countryCode;
    /**
     * <p>
     * Columns in this hierarchy.
     * </p>
     */
    private java.util.List<String> columns;

    /**
     * <p>
     * A display name for the hierarchy.
     * </p>
     * 
     * @param name
     *        A display name for the hierarchy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the hierarchy.
     * </p>
     * 
     * @return A display name for the hierarchy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A display name for the hierarchy.
     * </p>
     * 
     * @param name
     *        A display name for the hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoSpatialColumnGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Country code.
     * </p>
     * 
     * @param countryCode
     *        Country code.
     * @see GeoSpatialCountryCode
     */

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * Country code.
     * </p>
     * 
     * @return Country code.
     * @see GeoSpatialCountryCode
     */

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * <p>
     * Country code.
     * </p>
     * 
     * @param countryCode
     *        Country code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeoSpatialCountryCode
     */

    public GeoSpatialColumnGroup withCountryCode(String countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * <p>
     * Country code.
     * </p>
     * 
     * @param countryCode
     *        Country code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeoSpatialCountryCode
     */

    public GeoSpatialColumnGroup withCountryCode(GeoSpatialCountryCode countryCode) {
        this.countryCode = countryCode.toString();
        return this;
    }

    /**
     * <p>
     * Columns in this hierarchy.
     * </p>
     * 
     * @return Columns in this hierarchy.
     */

    public java.util.List<String> getColumns() {
        return columns;
    }

    /**
     * <p>
     * Columns in this hierarchy.
     * </p>
     * 
     * @param columns
     *        Columns in this hierarchy.
     */

    public void setColumns(java.util.Collection<String> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<String>(columns);
    }

    /**
     * <p>
     * Columns in this hierarchy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumns(java.util.Collection)} or {@link #withColumns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param columns
     *        Columns in this hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoSpatialColumnGroup withColumns(String... columns) {
        if (this.columns == null) {
            setColumns(new java.util.ArrayList<String>(columns.length));
        }
        for (String ele : columns) {
            this.columns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Columns in this hierarchy.
     * </p>
     * 
     * @param columns
     *        Columns in this hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoSpatialColumnGroup withColumns(java.util.Collection<String> columns) {
        setColumns(columns);
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
        if (getCountryCode() != null)
            sb.append("CountryCode: ").append(getCountryCode()).append(",");
        if (getColumns() != null)
            sb.append("Columns: ").append(getColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoSpatialColumnGroup == false)
            return false;
        GeoSpatialColumnGroup other = (GeoSpatialColumnGroup) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        return hashCode;
    }

    @Override
    public GeoSpatialColumnGroup clone() {
        try {
            return (GeoSpatialColumnGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GeoSpatialColumnGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the source table.
     * </p>
     */
    private CatalogEntry source;
    /**
     * <p>
     * A list of target tables.
     * </p>
     */
    private java.util.List<CatalogEntry> sinks;
    /**
     * <p>
     * Parameters for the mapping.
     * </p>
     */
    private Location location;

    /**
     * <p>
     * Specifies the source table.
     * </p>
     * 
     * @param source
     *        Specifies the source table.
     */

    public void setSource(CatalogEntry source) {
        this.source = source;
    }

    /**
     * <p>
     * Specifies the source table.
     * </p>
     * 
     * @return Specifies the source table.
     */

    public CatalogEntry getSource() {
        return this.source;
    }

    /**
     * <p>
     * Specifies the source table.
     * </p>
     * 
     * @param source
     *        Specifies the source table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMappingRequest withSource(CatalogEntry source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * A list of target tables.
     * </p>
     * 
     * @return A list of target tables.
     */

    public java.util.List<CatalogEntry> getSinks() {
        return sinks;
    }

    /**
     * <p>
     * A list of target tables.
     * </p>
     * 
     * @param sinks
     *        A list of target tables.
     */

    public void setSinks(java.util.Collection<CatalogEntry> sinks) {
        if (sinks == null) {
            this.sinks = null;
            return;
        }

        this.sinks = new java.util.ArrayList<CatalogEntry>(sinks);
    }

    /**
     * <p>
     * A list of target tables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSinks(java.util.Collection)} or {@link #withSinks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sinks
     *        A list of target tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMappingRequest withSinks(CatalogEntry... sinks) {
        if (this.sinks == null) {
            setSinks(new java.util.ArrayList<CatalogEntry>(sinks.length));
        }
        for (CatalogEntry ele : sinks) {
            this.sinks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of target tables.
     * </p>
     * 
     * @param sinks
     *        A list of target tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMappingRequest withSinks(java.util.Collection<CatalogEntry> sinks) {
        setSinks(sinks);
        return this;
    }

    /**
     * <p>
     * Parameters for the mapping.
     * </p>
     * 
     * @param location
     *        Parameters for the mapping.
     */

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * Parameters for the mapping.
     * </p>
     * 
     * @return Parameters for the mapping.
     */

    public Location getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Parameters for the mapping.
     * </p>
     * 
     * @param location
     *        Parameters for the mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMappingRequest withLocation(Location location) {
        setLocation(location);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSinks() != null)
            sb.append("Sinks: ").append(getSinks()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMappingRequest == false)
            return false;
        GetMappingRequest other = (GetMappingRequest) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSinks() == null ^ this.getSinks() == null)
            return false;
        if (other.getSinks() != null && other.getSinks().equals(this.getSinks()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSinks() == null) ? 0 : getSinks().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public GetMappingRequest clone() {
        return (GetMappingRequest) super.clone();
    }

}

/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/PropertyFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyFilters implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String logicalOperator;
    /** <p/> */
    private java.util.List<PropertyFilter> properties;

    /**
     * <p/>
     * 
     * @param logicalOperator
     * @see LogicalOperator
     */

    public void setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    /**
     * <p/>
     * 
     * @return
     * @see LogicalOperator
     */

    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    /**
     * <p/>
     * 
     * @param logicalOperator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogicalOperator
     */

    public PropertyFilters withLogicalOperator(String logicalOperator) {
        setLogicalOperator(logicalOperator);
        return this;
    }

    /**
     * <p/>
     * 
     * @param logicalOperator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogicalOperator
     */

    public PropertyFilters withLogicalOperator(LogicalOperator logicalOperator) {
        this.logicalOperator = logicalOperator.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<PropertyFilter> getProperties() {
        return properties;
    }

    /**
     * <p/>
     * 
     * @param properties
     */

    public void setProperties(java.util.Collection<PropertyFilter> properties) {
        if (properties == null) {
            this.properties = null;
            return;
        }

        this.properties = new java.util.ArrayList<PropertyFilter>(properties);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProperties(java.util.Collection)} or {@link #withProperties(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param properties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyFilters withProperties(PropertyFilter... properties) {
        if (this.properties == null) {
            setProperties(new java.util.ArrayList<PropertyFilter>(properties.length));
        }
        for (PropertyFilter ele : properties) {
            this.properties.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param properties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyFilters withProperties(java.util.Collection<PropertyFilter> properties) {
        setProperties(properties);
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
        if (getLogicalOperator() != null)
            sb.append("LogicalOperator: ").append(getLogicalOperator()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyFilters == false)
            return false;
        PropertyFilters other = (PropertyFilters) obj;
        if (other.getLogicalOperator() == null ^ this.getLogicalOperator() == null)
            return false;
        if (other.getLogicalOperator() != null && other.getLogicalOperator().equals(this.getLogicalOperator()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogicalOperator() == null) ? 0 : getLogicalOperator().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public PropertyFilters clone() {
        try {
            return (PropertyFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.PropertyFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

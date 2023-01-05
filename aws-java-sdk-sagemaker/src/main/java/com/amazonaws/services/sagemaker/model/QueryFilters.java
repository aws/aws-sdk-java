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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of filters to narrow the set of lineage entities connected to the <code>StartArn</code>(s) returned by the
 * <code>QueryLineage</code> API action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/QueryFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code> by type. For example: <code>DataSet</code>,
     * <code>Model</code>, <code>Endpoint</code>, or <code>ModelDeployment</code>.
     * </p>
     */
    private java.util.List<String> types;
    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) by the type of the lineage entity.
     * </p>
     */
    private java.util.List<String> lineageTypes;
    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) by created date.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) after the create date.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) before the last modified date.
     * </p>
     */
    private java.util.Date modifiedBefore;
    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) after the last modified date.
     * </p>
     */
    private java.util.Date modifiedAfter;
    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) by a set if property key value pairs. If
     * multiple pairs are provided, an entity is included in the results if it matches any of the provided pairs.
     * </p>
     */
    private java.util.Map<String, String> properties;

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code> by type. For example: <code>DataSet</code>,
     * <code>Model</code>, <code>Endpoint</code>, or <code>ModelDeployment</code>.
     * </p>
     * 
     * @return Filter the lineage entities connected to the <code>StartArn</code> by type. For example:
     *         <code>DataSet</code>, <code>Model</code>, <code>Endpoint</code>, or <code>ModelDeployment</code>.
     */

    public java.util.List<String> getTypes() {
        return types;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code> by type. For example: <code>DataSet</code>,
     * <code>Model</code>, <code>Endpoint</code>, or <code>ModelDeployment</code>.
     * </p>
     * 
     * @param types
     *        Filter the lineage entities connected to the <code>StartArn</code> by type. For example:
     *        <code>DataSet</code>, <code>Model</code>, <code>Endpoint</code>, or <code>ModelDeployment</code>.
     */

    public void setTypes(java.util.Collection<String> types) {
        if (types == null) {
            this.types = null;
            return;
        }

        this.types = new java.util.ArrayList<String>(types);
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code> by type. For example: <code>DataSet</code>,
     * <code>Model</code>, <code>Endpoint</code>, or <code>ModelDeployment</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypes(java.util.Collection)} or {@link #withTypes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param types
     *        Filter the lineage entities connected to the <code>StartArn</code> by type. For example:
     *        <code>DataSet</code>, <code>Model</code>, <code>Endpoint</code>, or <code>ModelDeployment</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryFilters withTypes(String... types) {
        if (this.types == null) {
            setTypes(new java.util.ArrayList<String>(types.length));
        }
        for (String ele : types) {
            this.types.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code> by type. For example: <code>DataSet</code>,
     * <code>Model</code>, <code>Endpoint</code>, or <code>ModelDeployment</code>.
     * </p>
     * 
     * @param types
     *        Filter the lineage entities connected to the <code>StartArn</code> by type. For example:
     *        <code>DataSet</code>, <code>Model</code>, <code>Endpoint</code>, or <code>ModelDeployment</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryFilters withTypes(java.util.Collection<String> types) {
        setTypes(types);
        return this;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) by the type of the lineage entity.
     * </p>
     * 
     * @return Filter the lineage entities connected to the <code>StartArn</code>(s) by the type of the lineage entity.
     * @see LineageType
     */

    public java.util.List<String> getLineageTypes() {
        return lineageTypes;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) by the type of the lineage entity.
     * </p>
     * 
     * @param lineageTypes
     *        Filter the lineage entities connected to the <code>StartArn</code>(s) by the type of the lineage entity.
     * @see LineageType
     */

    public void setLineageTypes(java.util.Collection<String> lineageTypes) {
        if (lineageTypes == null) {
            this.lineageTypes = null;
            return;
        }

        this.lineageTypes = new java.util.ArrayList<String>(lineageTypes);
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) by the type of the lineage entity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLineageTypes(java.util.Collection)} or {@link #withLineageTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param lineageTypes
     *        Filter the lineage entities connected to the <code>StartArn</code>(s) by the type of the lineage entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineageType
     */

    public QueryFilters withLineageTypes(String... lineageTypes) {
        if (this.lineageTypes == null) {
            setLineageTypes(new java.util.ArrayList<String>(lineageTypes.length));
        }
        for (String ele : lineageTypes) {
            this.lineageTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) by the type of the lineage entity.
     * </p>
     * 
     * @param lineageTypes
     *        Filter the lineage entities connected to the <code>StartArn</code>(s) by the type of the lineage entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineageType
     */

    public QueryFilters withLineageTypes(java.util.Collection<String> lineageTypes) {
        setLineageTypes(lineageTypes);
        return this;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) by the type of the lineage entity.
     * </p>
     * 
     * @param lineageTypes
     *        Filter the lineage entities connected to the <code>StartArn</code>(s) by the type of the lineage entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineageType
     */

    public QueryFilters withLineageTypes(LineageType... lineageTypes) {
        java.util.ArrayList<String> lineageTypesCopy = new java.util.ArrayList<String>(lineageTypes.length);
        for (LineageType value : lineageTypes) {
            lineageTypesCopy.add(value.toString());
        }
        if (getLineageTypes() == null) {
            setLineageTypes(lineageTypesCopy);
        } else {
            getLineageTypes().addAll(lineageTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) by created date.
     * </p>
     * 
     * @param createdBefore
     *        Filter the lineage entities connected to the <code>StartArn</code>(s) by created date.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) by created date.
     * </p>
     * 
     * @return Filter the lineage entities connected to the <code>StartArn</code>(s) by created date.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) by created date.
     * </p>
     * 
     * @param createdBefore
     *        Filter the lineage entities connected to the <code>StartArn</code>(s) by created date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryFilters withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) after the create date.
     * </p>
     * 
     * @param createdAfter
     *        Filter the lineage entities connected to the <code>StartArn</code>(s) after the create date.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) after the create date.
     * </p>
     * 
     * @return Filter the lineage entities connected to the <code>StartArn</code>(s) after the create date.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) after the create date.
     * </p>
     * 
     * @param createdAfter
     *        Filter the lineage entities connected to the <code>StartArn</code>(s) after the create date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryFilters withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) before the last modified date.
     * </p>
     * 
     * @param modifiedBefore
     *        Filter the lineage entities connected to the <code>StartArn</code>(s) before the last modified date.
     */

    public void setModifiedBefore(java.util.Date modifiedBefore) {
        this.modifiedBefore = modifiedBefore;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) before the last modified date.
     * </p>
     * 
     * @return Filter the lineage entities connected to the <code>StartArn</code>(s) before the last modified date.
     */

    public java.util.Date getModifiedBefore() {
        return this.modifiedBefore;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) before the last modified date.
     * </p>
     * 
     * @param modifiedBefore
     *        Filter the lineage entities connected to the <code>StartArn</code>(s) before the last modified date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryFilters withModifiedBefore(java.util.Date modifiedBefore) {
        setModifiedBefore(modifiedBefore);
        return this;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) after the last modified date.
     * </p>
     * 
     * @param modifiedAfter
     *        Filter the lineage entities connected to the <code>StartArn</code>(s) after the last modified date.
     */

    public void setModifiedAfter(java.util.Date modifiedAfter) {
        this.modifiedAfter = modifiedAfter;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) after the last modified date.
     * </p>
     * 
     * @return Filter the lineage entities connected to the <code>StartArn</code>(s) after the last modified date.
     */

    public java.util.Date getModifiedAfter() {
        return this.modifiedAfter;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) after the last modified date.
     * </p>
     * 
     * @param modifiedAfter
     *        Filter the lineage entities connected to the <code>StartArn</code>(s) after the last modified date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryFilters withModifiedAfter(java.util.Date modifiedAfter) {
        setModifiedAfter(modifiedAfter);
        return this;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) by a set if property key value pairs. If
     * multiple pairs are provided, an entity is included in the results if it matches any of the provided pairs.
     * </p>
     * 
     * @return Filter the lineage entities connected to the <code>StartArn</code>(s) by a set if property key value
     *         pairs. If multiple pairs are provided, an entity is included in the results if it matches any of the
     *         provided pairs.
     */

    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) by a set if property key value pairs. If
     * multiple pairs are provided, an entity is included in the results if it matches any of the provided pairs.
     * </p>
     * 
     * @param properties
     *        Filter the lineage entities connected to the <code>StartArn</code>(s) by a set if property key value
     *        pairs. If multiple pairs are provided, an entity is included in the results if it matches any of the
     *        provided pairs.
     */

    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * Filter the lineage entities connected to the <code>StartArn</code>(s) by a set if property key value pairs. If
     * multiple pairs are provided, an entity is included in the results if it matches any of the provided pairs.
     * </p>
     * 
     * @param properties
     *        Filter the lineage entities connected to the <code>StartArn</code>(s) by a set if property key value
     *        pairs. If multiple pairs are provided, an entity is included in the results if it matches any of the
     *        provided pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryFilters withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see QueryFilters#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public QueryFilters addPropertiesEntry(String key, String value) {
        if (null == this.properties) {
            this.properties = new java.util.HashMap<String, String>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryFilters clearPropertiesEntries() {
        this.properties = null;
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
        if (getTypes() != null)
            sb.append("Types: ").append(getTypes()).append(",");
        if (getLineageTypes() != null)
            sb.append("LineageTypes: ").append(getLineageTypes()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter()).append(",");
        if (getModifiedBefore() != null)
            sb.append("ModifiedBefore: ").append(getModifiedBefore()).append(",");
        if (getModifiedAfter() != null)
            sb.append("ModifiedAfter: ").append(getModifiedAfter()).append(",");
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

        if (obj instanceof QueryFilters == false)
            return false;
        QueryFilters other = (QueryFilters) obj;
        if (other.getTypes() == null ^ this.getTypes() == null)
            return false;
        if (other.getTypes() != null && other.getTypes().equals(this.getTypes()) == false)
            return false;
        if (other.getLineageTypes() == null ^ this.getLineageTypes() == null)
            return false;
        if (other.getLineageTypes() != null && other.getLineageTypes().equals(this.getLineageTypes()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getModifiedBefore() == null ^ this.getModifiedBefore() == null)
            return false;
        if (other.getModifiedBefore() != null && other.getModifiedBefore().equals(this.getModifiedBefore()) == false)
            return false;
        if (other.getModifiedAfter() == null ^ this.getModifiedAfter() == null)
            return false;
        if (other.getModifiedAfter() != null && other.getModifiedAfter().equals(this.getModifiedAfter()) == false)
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

        hashCode = prime * hashCode + ((getTypes() == null) ? 0 : getTypes().hashCode());
        hashCode = prime * hashCode + ((getLineageTypes() == null) ? 0 : getLineageTypes().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getModifiedBefore() == null) ? 0 : getModifiedBefore().hashCode());
        hashCode = prime * hashCode + ((getModifiedAfter() == null) ? 0 : getModifiedAfter().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public QueryFilters clone() {
        try {
            return (QueryFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.QueryFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

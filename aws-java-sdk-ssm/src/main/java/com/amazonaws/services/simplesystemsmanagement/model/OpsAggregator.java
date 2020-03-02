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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * One or more aggregators for viewing counts of OpsItems using different dimensions such as <code>Source</code>,
 * <code>CreatedTime</code>, or <code>Source and CreatedTime</code>, to name a few.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/OpsAggregator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsAggregator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Either a Range or Count aggregator for limiting an OpsItem summary.
     * </p>
     */
    private String aggregatorType;
    /**
     * <p>
     * The data type name to use for viewing counts of OpsItems.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The name of an OpsItem attribute on which to limit the count of OpsItems.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The aggregator value.
     * </p>
     */
    private java.util.Map<String, String> values;
    /**
     * <p>
     * The aggregator filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OpsFilter> filters;
    /**
     * <p>
     * A nested aggregator for viewing counts of OpsItems.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OpsAggregator> aggregators;

    /**
     * <p>
     * Either a Range or Count aggregator for limiting an OpsItem summary.
     * </p>
     * 
     * @param aggregatorType
     *        Either a Range or Count aggregator for limiting an OpsItem summary.
     */

    public void setAggregatorType(String aggregatorType) {
        this.aggregatorType = aggregatorType;
    }

    /**
     * <p>
     * Either a Range or Count aggregator for limiting an OpsItem summary.
     * </p>
     * 
     * @return Either a Range or Count aggregator for limiting an OpsItem summary.
     */

    public String getAggregatorType() {
        return this.aggregatorType;
    }

    /**
     * <p>
     * Either a Range or Count aggregator for limiting an OpsItem summary.
     * </p>
     * 
     * @param aggregatorType
     *        Either a Range or Count aggregator for limiting an OpsItem summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsAggregator withAggregatorType(String aggregatorType) {
        setAggregatorType(aggregatorType);
        return this;
    }

    /**
     * <p>
     * The data type name to use for viewing counts of OpsItems.
     * </p>
     * 
     * @param typeName
     *        The data type name to use for viewing counts of OpsItems.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The data type name to use for viewing counts of OpsItems.
     * </p>
     * 
     * @return The data type name to use for viewing counts of OpsItems.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The data type name to use for viewing counts of OpsItems.
     * </p>
     * 
     * @param typeName
     *        The data type name to use for viewing counts of OpsItems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsAggregator withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The name of an OpsItem attribute on which to limit the count of OpsItems.
     * </p>
     * 
     * @param attributeName
     *        The name of an OpsItem attribute on which to limit the count of OpsItems.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of an OpsItem attribute on which to limit the count of OpsItems.
     * </p>
     * 
     * @return The name of an OpsItem attribute on which to limit the count of OpsItems.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of an OpsItem attribute on which to limit the count of OpsItems.
     * </p>
     * 
     * @param attributeName
     *        The name of an OpsItem attribute on which to limit the count of OpsItems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsAggregator withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The aggregator value.
     * </p>
     * 
     * @return The aggregator value.
     */

    public java.util.Map<String, String> getValues() {
        return values;
    }

    /**
     * <p>
     * The aggregator value.
     * </p>
     * 
     * @param values
     *        The aggregator value.
     */

    public void setValues(java.util.Map<String, String> values) {
        this.values = values;
    }

    /**
     * <p>
     * The aggregator value.
     * </p>
     * 
     * @param values
     *        The aggregator value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsAggregator withValues(java.util.Map<String, String> values) {
        setValues(values);
        return this;
    }

    /**
     * Add a single Values entry
     *
     * @see OpsAggregator#withValues
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OpsAggregator addValuesEntry(String key, String value) {
        if (null == this.values) {
            this.values = new java.util.HashMap<String, String>();
        }
        if (this.values.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.values.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Values.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsAggregator clearValuesEntries() {
        this.values = null;
        return this;
    }

    /**
     * <p>
     * The aggregator filters.
     * </p>
     * 
     * @return The aggregator filters.
     */

    public java.util.List<OpsFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<OpsFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * The aggregator filters.
     * </p>
     * 
     * @param filters
     *        The aggregator filters.
     */

    public void setFilters(java.util.Collection<OpsFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<OpsFilter>(filters);
    }

    /**
     * <p>
     * The aggregator filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The aggregator filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsAggregator withFilters(OpsFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<OpsFilter>(filters.length));
        }
        for (OpsFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The aggregator filters.
     * </p>
     * 
     * @param filters
     *        The aggregator filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsAggregator withFilters(java.util.Collection<OpsFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * A nested aggregator for viewing counts of OpsItems.
     * </p>
     * 
     * @return A nested aggregator for viewing counts of OpsItems.
     */

    public java.util.List<OpsAggregator> getAggregators() {
        if (aggregators == null) {
            aggregators = new com.amazonaws.internal.SdkInternalList<OpsAggregator>();
        }
        return aggregators;
    }

    /**
     * <p>
     * A nested aggregator for viewing counts of OpsItems.
     * </p>
     * 
     * @param aggregators
     *        A nested aggregator for viewing counts of OpsItems.
     */

    public void setAggregators(java.util.Collection<OpsAggregator> aggregators) {
        if (aggregators == null) {
            this.aggregators = null;
            return;
        }

        this.aggregators = new com.amazonaws.internal.SdkInternalList<OpsAggregator>(aggregators);
    }

    /**
     * <p>
     * A nested aggregator for viewing counts of OpsItems.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregators(java.util.Collection)} or {@link #withAggregators(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param aggregators
     *        A nested aggregator for viewing counts of OpsItems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsAggregator withAggregators(OpsAggregator... aggregators) {
        if (this.aggregators == null) {
            setAggregators(new com.amazonaws.internal.SdkInternalList<OpsAggregator>(aggregators.length));
        }
        for (OpsAggregator ele : aggregators) {
            this.aggregators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A nested aggregator for viewing counts of OpsItems.
     * </p>
     * 
     * @param aggregators
     *        A nested aggregator for viewing counts of OpsItems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsAggregator withAggregators(java.util.Collection<OpsAggregator> aggregators) {
        setAggregators(aggregators);
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
        if (getAggregatorType() != null)
            sb.append("AggregatorType: ").append(getAggregatorType()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getAggregators() != null)
            sb.append("Aggregators: ").append(getAggregators());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpsAggregator == false)
            return false;
        OpsAggregator other = (OpsAggregator) obj;
        if (other.getAggregatorType() == null ^ this.getAggregatorType() == null)
            return false;
        if (other.getAggregatorType() != null && other.getAggregatorType().equals(this.getAggregatorType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getAggregators() == null ^ this.getAggregators() == null)
            return false;
        if (other.getAggregators() != null && other.getAggregators().equals(this.getAggregators()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregatorType() == null) ? 0 : getAggregatorType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getAggregators() == null) ? 0 : getAggregators().hashCode());
        return hashCode;
    }

    @Override
    public OpsAggregator clone() {
        try {
            return (OpsAggregator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.OpsAggregatorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

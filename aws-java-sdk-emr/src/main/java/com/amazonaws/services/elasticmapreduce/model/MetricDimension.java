/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * A CloudWatch dimension, which is specified using a <code>Key</code> (known as a <code>Name</code> in CloudWatch),
 * Value pair. By default, Amazon EMR uses one dimension whose <code>Key</code> is <code>JobFlowID</code> and
 * <code>Value</code> is a variable representing the cluster ID, which is <code>${emr:cluster_id}</code>. This enables
 * the rule to bootstrap when the cluster ID becomes available, and also enables a single automatic scaling policy to be
 * reused for multiple clusters and instance groups.
 * </p>
 */
public class MetricDimension implements Serializable, Cloneable {

    /**
     * <p>
     * The dimension name.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The dimension value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The dimension name.
     * </p>
     * 
     * @param key
     *        The dimension name.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The dimension name.
     * </p>
     * 
     * @return The dimension name.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The dimension name.
     * </p>
     * 
     * @param key
     *        The dimension name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDimension withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The dimension value.
     * </p>
     * 
     * @param value
     *        The dimension value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The dimension value.
     * </p>
     * 
     * @return The dimension value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The dimension value.
     * </p>
     * 
     * @param value
     *        The dimension value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDimension withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDimension == false)
            return false;
        MetricDimension other = (MetricDimension) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public MetricDimension clone() {
        try {
            return (MetricDimension) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

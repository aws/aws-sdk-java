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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A CloudWatch dimension, which is specified using a <code>Key</code> (known as a <code>Name</code> in CloudWatch),
 * <code>Value</code> pair. By default, Amazon EMR uses one dimension whose <code>Key</code> is <code>JobFlowID</code>
 * and <code>Value</code> is a variable representing the cluster ID, which is <code>${emr.clusterId}</code>. This
 * enables the rule to bootstrap when the cluster ID becomes available.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/MetricDimension" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDimension implements Serializable, Cloneable, StructuredPojo {

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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.MetricDimensionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

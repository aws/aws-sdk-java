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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result of a single metric data query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/MetricDataResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDataResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The query identifier.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A list of timestamps for the metric data results.
     * </p>
     */
    private java.util.List<java.util.Date> timestamps;
    /**
     * <p>
     * A list of values (cumulative / sum) for the metric data results.
     * </p>
     */
    private java.util.List<Long> values;

    /**
     * <p>
     * The query identifier.
     * </p>
     * 
     * @param id
     *        The query identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The query identifier.
     * </p>
     * 
     * @return The query identifier.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The query identifier.
     * </p>
     * 
     * @param id
     *        The query identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A list of timestamps for the metric data results.
     * </p>
     * 
     * @return A list of timestamps for the metric data results.
     */

    public java.util.List<java.util.Date> getTimestamps() {
        return timestamps;
    }

    /**
     * <p>
     * A list of timestamps for the metric data results.
     * </p>
     * 
     * @param timestamps
     *        A list of timestamps for the metric data results.
     */

    public void setTimestamps(java.util.Collection<java.util.Date> timestamps) {
        if (timestamps == null) {
            this.timestamps = null;
            return;
        }

        this.timestamps = new java.util.ArrayList<java.util.Date>(timestamps);
    }

    /**
     * <p>
     * A list of timestamps for the metric data results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimestamps(java.util.Collection)} or {@link #withTimestamps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param timestamps
     *        A list of timestamps for the metric data results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataResult withTimestamps(java.util.Date... timestamps) {
        if (this.timestamps == null) {
            setTimestamps(new java.util.ArrayList<java.util.Date>(timestamps.length));
        }
        for (java.util.Date ele : timestamps) {
            this.timestamps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of timestamps for the metric data results.
     * </p>
     * 
     * @param timestamps
     *        A list of timestamps for the metric data results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataResult withTimestamps(java.util.Collection<java.util.Date> timestamps) {
        setTimestamps(timestamps);
        return this;
    }

    /**
     * <p>
     * A list of values (cumulative / sum) for the metric data results.
     * </p>
     * 
     * @return A list of values (cumulative / sum) for the metric data results.
     */

    public java.util.List<Long> getValues() {
        return values;
    }

    /**
     * <p>
     * A list of values (cumulative / sum) for the metric data results.
     * </p>
     * 
     * @param values
     *        A list of values (cumulative / sum) for the metric data results.
     */

    public void setValues(java.util.Collection<Long> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<Long>(values);
    }

    /**
     * <p>
     * A list of values (cumulative / sum) for the metric data results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        A list of values (cumulative / sum) for the metric data results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataResult withValues(Long... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<Long>(values.length));
        }
        for (Long ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of values (cumulative / sum) for the metric data results.
     * </p>
     * 
     * @param values
     *        A list of values (cumulative / sum) for the metric data results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataResult withValues(java.util.Collection<Long> values) {
        setValues(values);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getTimestamps() != null)
            sb.append("Timestamps: ").append(getTimestamps()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDataResult == false)
            return false;
        MetricDataResult other = (MetricDataResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTimestamps() == null ^ this.getTimestamps() == null)
            return false;
        if (other.getTimestamps() != null && other.getTimestamps().equals(this.getTimestamps()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTimestamps() == null) ? 0 : getTimestamps().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public MetricDataResult clone() {
        try {
            return (MetricDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.MetricDataResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

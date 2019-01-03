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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The value to be compared with the <code>metric</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a numeric value, use this to specify that numeric value to be
     * compared with the <code>metric</code>.
     * </p>
     */
    private Long count;
    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of CIDRs, use this to specify that set to be compared with
     * the <code>metric</code>.
     * </p>
     */
    private java.util.List<String> cidrs;
    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of ports, use this to specify that set to be compared with
     * the <code>metric</code>.
     * </p>
     */
    private java.util.List<Integer> ports;

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a numeric value, use this to specify that numeric value to be
     * compared with the <code>metric</code>.
     * </p>
     * 
     * @param count
     *        If the <code>comparisonOperator</code> calls for a numeric value, use this to specify that numeric value
     *        to be compared with the <code>metric</code>.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a numeric value, use this to specify that numeric value to be
     * compared with the <code>metric</code>.
     * </p>
     * 
     * @return If the <code>comparisonOperator</code> calls for a numeric value, use this to specify that numeric value
     *         to be compared with the <code>metric</code>.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a numeric value, use this to specify that numeric value to be
     * compared with the <code>metric</code>.
     * </p>
     * 
     * @param count
     *        If the <code>comparisonOperator</code> calls for a numeric value, use this to specify that numeric value
     *        to be compared with the <code>metric</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricValue withCount(Long count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of CIDRs, use this to specify that set to be compared with
     * the <code>metric</code>.
     * </p>
     * 
     * @return If the <code>comparisonOperator</code> calls for a set of CIDRs, use this to specify that set to be
     *         compared with the <code>metric</code>.
     */

    public java.util.List<String> getCidrs() {
        return cidrs;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of CIDRs, use this to specify that set to be compared with
     * the <code>metric</code>.
     * </p>
     * 
     * @param cidrs
     *        If the <code>comparisonOperator</code> calls for a set of CIDRs, use this to specify that set to be
     *        compared with the <code>metric</code>.
     */

    public void setCidrs(java.util.Collection<String> cidrs) {
        if (cidrs == null) {
            this.cidrs = null;
            return;
        }

        this.cidrs = new java.util.ArrayList<String>(cidrs);
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of CIDRs, use this to specify that set to be compared with
     * the <code>metric</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrs(java.util.Collection)} or {@link #withCidrs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cidrs
     *        If the <code>comparisonOperator</code> calls for a set of CIDRs, use this to specify that set to be
     *        compared with the <code>metric</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricValue withCidrs(String... cidrs) {
        if (this.cidrs == null) {
            setCidrs(new java.util.ArrayList<String>(cidrs.length));
        }
        for (String ele : cidrs) {
            this.cidrs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of CIDRs, use this to specify that set to be compared with
     * the <code>metric</code>.
     * </p>
     * 
     * @param cidrs
     *        If the <code>comparisonOperator</code> calls for a set of CIDRs, use this to specify that set to be
     *        compared with the <code>metric</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricValue withCidrs(java.util.Collection<String> cidrs) {
        setCidrs(cidrs);
        return this;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of ports, use this to specify that set to be compared with
     * the <code>metric</code>.
     * </p>
     * 
     * @return If the <code>comparisonOperator</code> calls for a set of ports, use this to specify that set to be
     *         compared with the <code>metric</code>.
     */

    public java.util.List<Integer> getPorts() {
        return ports;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of ports, use this to specify that set to be compared with
     * the <code>metric</code>.
     * </p>
     * 
     * @param ports
     *        If the <code>comparisonOperator</code> calls for a set of ports, use this to specify that set to be
     *        compared with the <code>metric</code>.
     */

    public void setPorts(java.util.Collection<Integer> ports) {
        if (ports == null) {
            this.ports = null;
            return;
        }

        this.ports = new java.util.ArrayList<Integer>(ports);
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of ports, use this to specify that set to be compared with
     * the <code>metric</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPorts(java.util.Collection)} or {@link #withPorts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ports
     *        If the <code>comparisonOperator</code> calls for a set of ports, use this to specify that set to be
     *        compared with the <code>metric</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricValue withPorts(Integer... ports) {
        if (this.ports == null) {
            setPorts(new java.util.ArrayList<Integer>(ports.length));
        }
        for (Integer ele : ports) {
            this.ports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the <code>comparisonOperator</code> calls for a set of ports, use this to specify that set to be compared with
     * the <code>metric</code>.
     * </p>
     * 
     * @param ports
     *        If the <code>comparisonOperator</code> calls for a set of ports, use this to specify that set to be
     *        compared with the <code>metric</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricValue withPorts(java.util.Collection<Integer> ports) {
        setPorts(ports);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getCidrs() != null)
            sb.append("Cidrs: ").append(getCidrs()).append(",");
        if (getPorts() != null)
            sb.append("Ports: ").append(getPorts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricValue == false)
            return false;
        MetricValue other = (MetricValue) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getCidrs() == null ^ this.getCidrs() == null)
            return false;
        if (other.getCidrs() != null && other.getCidrs().equals(this.getCidrs()) == false)
            return false;
        if (other.getPorts() == null ^ this.getPorts() == null)
            return false;
        if (other.getPorts() != null && other.getPorts().equals(this.getPorts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getCidrs() == null) ? 0 : getCidrs().hashCode());
        hashCode = prime * hashCode + ((getPorts() == null) ? 0 : getPorts().hashCode());
        return hashCode;
    }

    @Override
    public MetricValue clone() {
        try {
            return (MetricValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.MetricValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

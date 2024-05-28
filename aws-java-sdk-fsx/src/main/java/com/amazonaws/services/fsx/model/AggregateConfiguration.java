/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to specify configuration options for a volume’s storage aggregate or aggregates.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/AggregateConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of aggregates that this volume resides on. Aggregates are storage pools which make up your primary
     * storage tier. Each high-availability (HA) pair has one aggregate. The names of the aggregates map to the names of
     * the aggregates in the ONTAP CLI and REST API. For FlexVols, there will always be a single entry.
     * </p>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The strings in the value of <code>Aggregates</code> are not are not formatted as <code>aggrX</code>, where X is a
     * number between 1 and 6.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>Aggregates</code> contains aggregates that are not present.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more of the aggregates supplied are too close to the volume limit to support adding more volumes.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> aggregates;
    /**
     * <p>
     * The total number of constituents this FlexGroup volume has. Not applicable for FlexVols.
     * </p>
     */
    private Integer totalConstituents;

    /**
     * <p>
     * The list of aggregates that this volume resides on. Aggregates are storage pools which make up your primary
     * storage tier. Each high-availability (HA) pair has one aggregate. The names of the aggregates map to the names of
     * the aggregates in the ONTAP CLI and REST API. For FlexVols, there will always be a single entry.
     * </p>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The strings in the value of <code>Aggregates</code> are not are not formatted as <code>aggrX</code>, where X is a
     * number between 1 and 6.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>Aggregates</code> contains aggregates that are not present.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more of the aggregates supplied are too close to the volume limit to support adding more volumes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The list of aggregates that this volume resides on. Aggregates are storage pools which make up your
     *         primary storage tier. Each high-availability (HA) pair has one aggregate. The names of the aggregates map
     *         to the names of the aggregates in the ONTAP CLI and REST API. For FlexVols, there will always be a single
     *         entry.</p>
     *         <p>
     *         Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The strings in the value of <code>Aggregates</code> are not are not formatted as <code>aggrX</code>,
     *         where X is a number between 1 and 6.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The value of <code>Aggregates</code> contains aggregates that are not present.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         One or more of the aggregates supplied are too close to the volume limit to support adding more volumes.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getAggregates() {
        return aggregates;
    }

    /**
     * <p>
     * The list of aggregates that this volume resides on. Aggregates are storage pools which make up your primary
     * storage tier. Each high-availability (HA) pair has one aggregate. The names of the aggregates map to the names of
     * the aggregates in the ONTAP CLI and REST API. For FlexVols, there will always be a single entry.
     * </p>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The strings in the value of <code>Aggregates</code> are not are not formatted as <code>aggrX</code>, where X is a
     * number between 1 and 6.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>Aggregates</code> contains aggregates that are not present.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more of the aggregates supplied are too close to the volume limit to support adding more volumes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aggregates
     *        The list of aggregates that this volume resides on. Aggregates are storage pools which make up your
     *        primary storage tier. Each high-availability (HA) pair has one aggregate. The names of the aggregates map
     *        to the names of the aggregates in the ONTAP CLI and REST API. For FlexVols, there will always be a single
     *        entry.</p>
     *        <p>
     *        Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The strings in the value of <code>Aggregates</code> are not are not formatted as <code>aggrX</code>, where
     *        X is a number between 1 and 6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>Aggregates</code> contains aggregates that are not present.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        One or more of the aggregates supplied are too close to the volume limit to support adding more volumes.
     *        </p>
     *        </li>
     */

    public void setAggregates(java.util.Collection<String> aggregates) {
        if (aggregates == null) {
            this.aggregates = null;
            return;
        }

        this.aggregates = new java.util.ArrayList<String>(aggregates);
    }

    /**
     * <p>
     * The list of aggregates that this volume resides on. Aggregates are storage pools which make up your primary
     * storage tier. Each high-availability (HA) pair has one aggregate. The names of the aggregates map to the names of
     * the aggregates in the ONTAP CLI and REST API. For FlexVols, there will always be a single entry.
     * </p>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The strings in the value of <code>Aggregates</code> are not are not formatted as <code>aggrX</code>, where X is a
     * number between 1 and 6.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>Aggregates</code> contains aggregates that are not present.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more of the aggregates supplied are too close to the volume limit to support adding more volumes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregates(java.util.Collection)} or {@link #withAggregates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param aggregates
     *        The list of aggregates that this volume resides on. Aggregates are storage pools which make up your
     *        primary storage tier. Each high-availability (HA) pair has one aggregate. The names of the aggregates map
     *        to the names of the aggregates in the ONTAP CLI and REST API. For FlexVols, there will always be a single
     *        entry.</p>
     *        <p>
     *        Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The strings in the value of <code>Aggregates</code> are not are not formatted as <code>aggrX</code>, where
     *        X is a number between 1 and 6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>Aggregates</code> contains aggregates that are not present.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        One or more of the aggregates supplied are too close to the volume limit to support adding more volumes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateConfiguration withAggregates(String... aggregates) {
        if (this.aggregates == null) {
            setAggregates(new java.util.ArrayList<String>(aggregates.length));
        }
        for (String ele : aggregates) {
            this.aggregates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of aggregates that this volume resides on. Aggregates are storage pools which make up your primary
     * storage tier. Each high-availability (HA) pair has one aggregate. The names of the aggregates map to the names of
     * the aggregates in the ONTAP CLI and REST API. For FlexVols, there will always be a single entry.
     * </p>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The strings in the value of <code>Aggregates</code> are not are not formatted as <code>aggrX</code>, where X is a
     * number between 1 and 6.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>Aggregates</code> contains aggregates that are not present.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more of the aggregates supplied are too close to the volume limit to support adding more volumes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aggregates
     *        The list of aggregates that this volume resides on. Aggregates are storage pools which make up your
     *        primary storage tier. Each high-availability (HA) pair has one aggregate. The names of the aggregates map
     *        to the names of the aggregates in the ONTAP CLI and REST API. For FlexVols, there will always be a single
     *        entry.</p>
     *        <p>
     *        Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The strings in the value of <code>Aggregates</code> are not are not formatted as <code>aggrX</code>, where
     *        X is a number between 1 and 6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>Aggregates</code> contains aggregates that are not present.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        One or more of the aggregates supplied are too close to the volume limit to support adding more volumes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateConfiguration withAggregates(java.util.Collection<String> aggregates) {
        setAggregates(aggregates);
        return this;
    }

    /**
     * <p>
     * The total number of constituents this FlexGroup volume has. Not applicable for FlexVols.
     * </p>
     * 
     * @param totalConstituents
     *        The total number of constituents this FlexGroup volume has. Not applicable for FlexVols.
     */

    public void setTotalConstituents(Integer totalConstituents) {
        this.totalConstituents = totalConstituents;
    }

    /**
     * <p>
     * The total number of constituents this FlexGroup volume has. Not applicable for FlexVols.
     * </p>
     * 
     * @return The total number of constituents this FlexGroup volume has. Not applicable for FlexVols.
     */

    public Integer getTotalConstituents() {
        return this.totalConstituents;
    }

    /**
     * <p>
     * The total number of constituents this FlexGroup volume has. Not applicable for FlexVols.
     * </p>
     * 
     * @param totalConstituents
     *        The total number of constituents this FlexGroup volume has. Not applicable for FlexVols.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateConfiguration withTotalConstituents(Integer totalConstituents) {
        setTotalConstituents(totalConstituents);
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
        if (getAggregates() != null)
            sb.append("Aggregates: ").append(getAggregates()).append(",");
        if (getTotalConstituents() != null)
            sb.append("TotalConstituents: ").append(getTotalConstituents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregateConfiguration == false)
            return false;
        AggregateConfiguration other = (AggregateConfiguration) obj;
        if (other.getAggregates() == null ^ this.getAggregates() == null)
            return false;
        if (other.getAggregates() != null && other.getAggregates().equals(this.getAggregates()) == false)
            return false;
        if (other.getTotalConstituents() == null ^ this.getTotalConstituents() == null)
            return false;
        if (other.getTotalConstituents() != null && other.getTotalConstituents().equals(this.getTotalConstituents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregates() == null) ? 0 : getAggregates().hashCode());
        hashCode = prime * hashCode + ((getTotalConstituents() == null) ? 0 : getTotalConstituents().hashCode());
        return hashCode;
    }

    @Override
    public AggregateConfiguration clone() {
        try {
            return (AggregateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.AggregateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

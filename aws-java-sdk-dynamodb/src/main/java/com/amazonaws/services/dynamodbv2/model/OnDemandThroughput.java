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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sets the maximum number of read and write units for the specified on-demand table. If you use this parameter, you
 * must specify <code>MaxReadRequestUnits</code>, <code>MaxWriteRequestUnits</code>, or both.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/OnDemandThroughput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OnDemandThroughput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Maximum number of read request units for the specified table.
     * </p>
     * <p>
     * To specify a maximum <code>OnDemandThroughput</code> on your table, set the value of
     * <code>MaxReadRequestUnits</code> as greater than or equal to 1. To remove the maximum
     * <code>OnDemandThroughput</code> that is currently set on your table, set the value of
     * <code>MaxReadRequestUnits</code> to -1.
     * </p>
     */
    private Long maxReadRequestUnits;
    /**
     * <p>
     * Maximum number of write request units for the specified table.
     * </p>
     * <p>
     * To specify a maximum <code>OnDemandThroughput</code> on your table, set the value of
     * <code>MaxWriteRequestUnits</code> as greater than or equal to 1. To remove the maximum
     * <code>OnDemandThroughput</code> that is currently set on your table, set the value of
     * <code>MaxWriteRequestUnits</code> to -1.
     * </p>
     */
    private Long maxWriteRequestUnits;

    /**
     * <p>
     * Maximum number of read request units for the specified table.
     * </p>
     * <p>
     * To specify a maximum <code>OnDemandThroughput</code> on your table, set the value of
     * <code>MaxReadRequestUnits</code> as greater than or equal to 1. To remove the maximum
     * <code>OnDemandThroughput</code> that is currently set on your table, set the value of
     * <code>MaxReadRequestUnits</code> to -1.
     * </p>
     * 
     * @param maxReadRequestUnits
     *        Maximum number of read request units for the specified table.</p>
     *        <p>
     *        To specify a maximum <code>OnDemandThroughput</code> on your table, set the value of
     *        <code>MaxReadRequestUnits</code> as greater than or equal to 1. To remove the maximum
     *        <code>OnDemandThroughput</code> that is currently set on your table, set the value of
     *        <code>MaxReadRequestUnits</code> to -1.
     */

    public void setMaxReadRequestUnits(Long maxReadRequestUnits) {
        this.maxReadRequestUnits = maxReadRequestUnits;
    }

    /**
     * <p>
     * Maximum number of read request units for the specified table.
     * </p>
     * <p>
     * To specify a maximum <code>OnDemandThroughput</code> on your table, set the value of
     * <code>MaxReadRequestUnits</code> as greater than or equal to 1. To remove the maximum
     * <code>OnDemandThroughput</code> that is currently set on your table, set the value of
     * <code>MaxReadRequestUnits</code> to -1.
     * </p>
     * 
     * @return Maximum number of read request units for the specified table.</p>
     *         <p>
     *         To specify a maximum <code>OnDemandThroughput</code> on your table, set the value of
     *         <code>MaxReadRequestUnits</code> as greater than or equal to 1. To remove the maximum
     *         <code>OnDemandThroughput</code> that is currently set on your table, set the value of
     *         <code>MaxReadRequestUnits</code> to -1.
     */

    public Long getMaxReadRequestUnits() {
        return this.maxReadRequestUnits;
    }

    /**
     * <p>
     * Maximum number of read request units for the specified table.
     * </p>
     * <p>
     * To specify a maximum <code>OnDemandThroughput</code> on your table, set the value of
     * <code>MaxReadRequestUnits</code> as greater than or equal to 1. To remove the maximum
     * <code>OnDemandThroughput</code> that is currently set on your table, set the value of
     * <code>MaxReadRequestUnits</code> to -1.
     * </p>
     * 
     * @param maxReadRequestUnits
     *        Maximum number of read request units for the specified table.</p>
     *        <p>
     *        To specify a maximum <code>OnDemandThroughput</code> on your table, set the value of
     *        <code>MaxReadRequestUnits</code> as greater than or equal to 1. To remove the maximum
     *        <code>OnDemandThroughput</code> that is currently set on your table, set the value of
     *        <code>MaxReadRequestUnits</code> to -1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnDemandThroughput withMaxReadRequestUnits(Long maxReadRequestUnits) {
        setMaxReadRequestUnits(maxReadRequestUnits);
        return this;
    }

    /**
     * <p>
     * Maximum number of write request units for the specified table.
     * </p>
     * <p>
     * To specify a maximum <code>OnDemandThroughput</code> on your table, set the value of
     * <code>MaxWriteRequestUnits</code> as greater than or equal to 1. To remove the maximum
     * <code>OnDemandThroughput</code> that is currently set on your table, set the value of
     * <code>MaxWriteRequestUnits</code> to -1.
     * </p>
     * 
     * @param maxWriteRequestUnits
     *        Maximum number of write request units for the specified table.</p>
     *        <p>
     *        To specify a maximum <code>OnDemandThroughput</code> on your table, set the value of
     *        <code>MaxWriteRequestUnits</code> as greater than or equal to 1. To remove the maximum
     *        <code>OnDemandThroughput</code> that is currently set on your table, set the value of
     *        <code>MaxWriteRequestUnits</code> to -1.
     */

    public void setMaxWriteRequestUnits(Long maxWriteRequestUnits) {
        this.maxWriteRequestUnits = maxWriteRequestUnits;
    }

    /**
     * <p>
     * Maximum number of write request units for the specified table.
     * </p>
     * <p>
     * To specify a maximum <code>OnDemandThroughput</code> on your table, set the value of
     * <code>MaxWriteRequestUnits</code> as greater than or equal to 1. To remove the maximum
     * <code>OnDemandThroughput</code> that is currently set on your table, set the value of
     * <code>MaxWriteRequestUnits</code> to -1.
     * </p>
     * 
     * @return Maximum number of write request units for the specified table.</p>
     *         <p>
     *         To specify a maximum <code>OnDemandThroughput</code> on your table, set the value of
     *         <code>MaxWriteRequestUnits</code> as greater than or equal to 1. To remove the maximum
     *         <code>OnDemandThroughput</code> that is currently set on your table, set the value of
     *         <code>MaxWriteRequestUnits</code> to -1.
     */

    public Long getMaxWriteRequestUnits() {
        return this.maxWriteRequestUnits;
    }

    /**
     * <p>
     * Maximum number of write request units for the specified table.
     * </p>
     * <p>
     * To specify a maximum <code>OnDemandThroughput</code> on your table, set the value of
     * <code>MaxWriteRequestUnits</code> as greater than or equal to 1. To remove the maximum
     * <code>OnDemandThroughput</code> that is currently set on your table, set the value of
     * <code>MaxWriteRequestUnits</code> to -1.
     * </p>
     * 
     * @param maxWriteRequestUnits
     *        Maximum number of write request units for the specified table.</p>
     *        <p>
     *        To specify a maximum <code>OnDemandThroughput</code> on your table, set the value of
     *        <code>MaxWriteRequestUnits</code> as greater than or equal to 1. To remove the maximum
     *        <code>OnDemandThroughput</code> that is currently set on your table, set the value of
     *        <code>MaxWriteRequestUnits</code> to -1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnDemandThroughput withMaxWriteRequestUnits(Long maxWriteRequestUnits) {
        setMaxWriteRequestUnits(maxWriteRequestUnits);
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
        if (getMaxReadRequestUnits() != null)
            sb.append("MaxReadRequestUnits: ").append(getMaxReadRequestUnits()).append(",");
        if (getMaxWriteRequestUnits() != null)
            sb.append("MaxWriteRequestUnits: ").append(getMaxWriteRequestUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnDemandThroughput == false)
            return false;
        OnDemandThroughput other = (OnDemandThroughput) obj;
        if (other.getMaxReadRequestUnits() == null ^ this.getMaxReadRequestUnits() == null)
            return false;
        if (other.getMaxReadRequestUnits() != null && other.getMaxReadRequestUnits().equals(this.getMaxReadRequestUnits()) == false)
            return false;
        if (other.getMaxWriteRequestUnits() == null ^ this.getMaxWriteRequestUnits() == null)
            return false;
        if (other.getMaxWriteRequestUnits() != null && other.getMaxWriteRequestUnits().equals(this.getMaxWriteRequestUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxReadRequestUnits() == null) ? 0 : getMaxReadRequestUnits().hashCode());
        hashCode = prime * hashCode + ((getMaxWriteRequestUnits() == null) ? 0 : getMaxWriteRequestUnits().hashCode());
        return hashCode;
    }

    @Override
    public OnDemandThroughput clone() {
        try {
            return (OnDemandThroughput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.OnDemandThroughputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

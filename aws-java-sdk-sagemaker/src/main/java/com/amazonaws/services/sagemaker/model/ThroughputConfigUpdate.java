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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The new throughput configuration for the feature group. You can switch between on-demand and provisioned modes or
 * update the read / write capacity of provisioned feature groups. You can switch a feature group to on-demand only once
 * in a 24 hour period.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ThroughputConfigUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThroughputConfigUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Target throughput mode of the feature group. Throughput update is an asynchronous operation, and the outcome
     * should be monitored by polling <code>LastUpdateStatus</code> field in <code>DescribeFeatureGroup</code> response.
     * You cannot update a feature group's throughput while another update is in progress.
     * </p>
     */
    private String throughputMode;
    /**
     * <p>
     * For provisioned feature groups with online store enabled, this indicates the read throughput you are billed for
     * and can consume without throttling.
     * </p>
     */
    private Integer provisionedReadCapacityUnits;
    /**
     * <p>
     * For provisioned feature groups, this indicates the write throughput you are billed for and can consume without
     * throttling.
     * </p>
     */
    private Integer provisionedWriteCapacityUnits;

    /**
     * <p>
     * Target throughput mode of the feature group. Throughput update is an asynchronous operation, and the outcome
     * should be monitored by polling <code>LastUpdateStatus</code> field in <code>DescribeFeatureGroup</code> response.
     * You cannot update a feature group's throughput while another update is in progress.
     * </p>
     * 
     * @param throughputMode
     *        Target throughput mode of the feature group. Throughput update is an asynchronous operation, and the
     *        outcome should be monitored by polling <code>LastUpdateStatus</code> field in
     *        <code>DescribeFeatureGroup</code> response. You cannot update a feature group's throughput while another
     *        update is in progress.
     * @see ThroughputMode
     */

    public void setThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
    }

    /**
     * <p>
     * Target throughput mode of the feature group. Throughput update is an asynchronous operation, and the outcome
     * should be monitored by polling <code>LastUpdateStatus</code> field in <code>DescribeFeatureGroup</code> response.
     * You cannot update a feature group's throughput while another update is in progress.
     * </p>
     * 
     * @return Target throughput mode of the feature group. Throughput update is an asynchronous operation, and the
     *         outcome should be monitored by polling <code>LastUpdateStatus</code> field in
     *         <code>DescribeFeatureGroup</code> response. You cannot update a feature group's throughput while another
     *         update is in progress.
     * @see ThroughputMode
     */

    public String getThroughputMode() {
        return this.throughputMode;
    }

    /**
     * <p>
     * Target throughput mode of the feature group. Throughput update is an asynchronous operation, and the outcome
     * should be monitored by polling <code>LastUpdateStatus</code> field in <code>DescribeFeatureGroup</code> response.
     * You cannot update a feature group's throughput while another update is in progress.
     * </p>
     * 
     * @param throughputMode
     *        Target throughput mode of the feature group. Throughput update is an asynchronous operation, and the
     *        outcome should be monitored by polling <code>LastUpdateStatus</code> field in
     *        <code>DescribeFeatureGroup</code> response. You cannot update a feature group's throughput while another
     *        update is in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThroughputMode
     */

    public ThroughputConfigUpdate withThroughputMode(String throughputMode) {
        setThroughputMode(throughputMode);
        return this;
    }

    /**
     * <p>
     * Target throughput mode of the feature group. Throughput update is an asynchronous operation, and the outcome
     * should be monitored by polling <code>LastUpdateStatus</code> field in <code>DescribeFeatureGroup</code> response.
     * You cannot update a feature group's throughput while another update is in progress.
     * </p>
     * 
     * @param throughputMode
     *        Target throughput mode of the feature group. Throughput update is an asynchronous operation, and the
     *        outcome should be monitored by polling <code>LastUpdateStatus</code> field in
     *        <code>DescribeFeatureGroup</code> response. You cannot update a feature group's throughput while another
     *        update is in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThroughputMode
     */

    public ThroughputConfigUpdate withThroughputMode(ThroughputMode throughputMode) {
        this.throughputMode = throughputMode.toString();
        return this;
    }

    /**
     * <p>
     * For provisioned feature groups with online store enabled, this indicates the read throughput you are billed for
     * and can consume without throttling.
     * </p>
     * 
     * @param provisionedReadCapacityUnits
     *        For provisioned feature groups with online store enabled, this indicates the read throughput you are
     *        billed for and can consume without throttling.
     */

    public void setProvisionedReadCapacityUnits(Integer provisionedReadCapacityUnits) {
        this.provisionedReadCapacityUnits = provisionedReadCapacityUnits;
    }

    /**
     * <p>
     * For provisioned feature groups with online store enabled, this indicates the read throughput you are billed for
     * and can consume without throttling.
     * </p>
     * 
     * @return For provisioned feature groups with online store enabled, this indicates the read throughput you are
     *         billed for and can consume without throttling.
     */

    public Integer getProvisionedReadCapacityUnits() {
        return this.provisionedReadCapacityUnits;
    }

    /**
     * <p>
     * For provisioned feature groups with online store enabled, this indicates the read throughput you are billed for
     * and can consume without throttling.
     * </p>
     * 
     * @param provisionedReadCapacityUnits
     *        For provisioned feature groups with online store enabled, this indicates the read throughput you are
     *        billed for and can consume without throttling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThroughputConfigUpdate withProvisionedReadCapacityUnits(Integer provisionedReadCapacityUnits) {
        setProvisionedReadCapacityUnits(provisionedReadCapacityUnits);
        return this;
    }

    /**
     * <p>
     * For provisioned feature groups, this indicates the write throughput you are billed for and can consume without
     * throttling.
     * </p>
     * 
     * @param provisionedWriteCapacityUnits
     *        For provisioned feature groups, this indicates the write throughput you are billed for and can consume
     *        without throttling.
     */

    public void setProvisionedWriteCapacityUnits(Integer provisionedWriteCapacityUnits) {
        this.provisionedWriteCapacityUnits = provisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * For provisioned feature groups, this indicates the write throughput you are billed for and can consume without
     * throttling.
     * </p>
     * 
     * @return For provisioned feature groups, this indicates the write throughput you are billed for and can consume
     *         without throttling.
     */

    public Integer getProvisionedWriteCapacityUnits() {
        return this.provisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * For provisioned feature groups, this indicates the write throughput you are billed for and can consume without
     * throttling.
     * </p>
     * 
     * @param provisionedWriteCapacityUnits
     *        For provisioned feature groups, this indicates the write throughput you are billed for and can consume
     *        without throttling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThroughputConfigUpdate withProvisionedWriteCapacityUnits(Integer provisionedWriteCapacityUnits) {
        setProvisionedWriteCapacityUnits(provisionedWriteCapacityUnits);
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
        if (getThroughputMode() != null)
            sb.append("ThroughputMode: ").append(getThroughputMode()).append(",");
        if (getProvisionedReadCapacityUnits() != null)
            sb.append("ProvisionedReadCapacityUnits: ").append(getProvisionedReadCapacityUnits()).append(",");
        if (getProvisionedWriteCapacityUnits() != null)
            sb.append("ProvisionedWriteCapacityUnits: ").append(getProvisionedWriteCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThroughputConfigUpdate == false)
            return false;
        ThroughputConfigUpdate other = (ThroughputConfigUpdate) obj;
        if (other.getThroughputMode() == null ^ this.getThroughputMode() == null)
            return false;
        if (other.getThroughputMode() != null && other.getThroughputMode().equals(this.getThroughputMode()) == false)
            return false;
        if (other.getProvisionedReadCapacityUnits() == null ^ this.getProvisionedReadCapacityUnits() == null)
            return false;
        if (other.getProvisionedReadCapacityUnits() != null && other.getProvisionedReadCapacityUnits().equals(this.getProvisionedReadCapacityUnits()) == false)
            return false;
        if (other.getProvisionedWriteCapacityUnits() == null ^ this.getProvisionedWriteCapacityUnits() == null)
            return false;
        if (other.getProvisionedWriteCapacityUnits() != null
                && other.getProvisionedWriteCapacityUnits().equals(this.getProvisionedWriteCapacityUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThroughputMode() == null) ? 0 : getThroughputMode().hashCode());
        hashCode = prime * hashCode + ((getProvisionedReadCapacityUnits() == null) ? 0 : getProvisionedReadCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getProvisionedWriteCapacityUnits() == null) ? 0 : getProvisionedWriteCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public ThroughputConfigUpdate clone() {
        try {
            return (ThroughputConfigUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ThroughputConfigUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

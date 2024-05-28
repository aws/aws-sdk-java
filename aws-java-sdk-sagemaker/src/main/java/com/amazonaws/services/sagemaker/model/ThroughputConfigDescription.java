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
 * Active throughput configuration of the feature group. There are two modes: <code>ON_DEMAND</code> and
 * <code>PROVISIONED</code>. With on-demand mode, you are charged for data reads and writes that your application
 * performs on your feature group. You do not need to specify read and write throughput because Feature Store
 * accommodates your workloads as they ramp up and down. You can switch a feature group to on-demand only once in a 24
 * hour period. With provisioned throughput mode, you specify the read and write capacity per second that you expect
 * your application to require, and you are billed based on those limits. Exceeding provisioned throughput will result
 * in your requests being throttled.
 * </p>
 * <p>
 * Note: <code>PROVISIONED</code> throughput mode is supported only for feature groups that are offline-only, or use the
 * <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OnlineStoreConfig.html#sagemaker-Type-OnlineStoreConfig-StorageType"
 * > <code>Standard</code> </a> tier online store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ThroughputConfigDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThroughputConfigDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The mode used for your feature group throughput: <code>ON_DEMAND</code> or <code>PROVISIONED</code>.
     * </p>
     */
    private String throughputMode;
    /**
     * <p>
     * For provisioned feature groups with online store enabled, this indicates the read throughput you are billed for
     * and can consume without throttling.
     * </p>
     * <p>
     * This field is not applicable for on-demand feature groups.
     * </p>
     */
    private Integer provisionedReadCapacityUnits;
    /**
     * <p>
     * For provisioned feature groups, this indicates the write throughput you are billed for and can consume without
     * throttling.
     * </p>
     * <p>
     * This field is not applicable for on-demand feature groups.
     * </p>
     */
    private Integer provisionedWriteCapacityUnits;

    /**
     * <p>
     * The mode used for your feature group throughput: <code>ON_DEMAND</code> or <code>PROVISIONED</code>.
     * </p>
     * 
     * @param throughputMode
     *        The mode used for your feature group throughput: <code>ON_DEMAND</code> or <code>PROVISIONED</code>.
     * @see ThroughputMode
     */

    public void setThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
    }

    /**
     * <p>
     * The mode used for your feature group throughput: <code>ON_DEMAND</code> or <code>PROVISIONED</code>.
     * </p>
     * 
     * @return The mode used for your feature group throughput: <code>ON_DEMAND</code> or <code>PROVISIONED</code>.
     * @see ThroughputMode
     */

    public String getThroughputMode() {
        return this.throughputMode;
    }

    /**
     * <p>
     * The mode used for your feature group throughput: <code>ON_DEMAND</code> or <code>PROVISIONED</code>.
     * </p>
     * 
     * @param throughputMode
     *        The mode used for your feature group throughput: <code>ON_DEMAND</code> or <code>PROVISIONED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThroughputMode
     */

    public ThroughputConfigDescription withThroughputMode(String throughputMode) {
        setThroughputMode(throughputMode);
        return this;
    }

    /**
     * <p>
     * The mode used for your feature group throughput: <code>ON_DEMAND</code> or <code>PROVISIONED</code>.
     * </p>
     * 
     * @param throughputMode
     *        The mode used for your feature group throughput: <code>ON_DEMAND</code> or <code>PROVISIONED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThroughputMode
     */

    public ThroughputConfigDescription withThroughputMode(ThroughputMode throughputMode) {
        this.throughputMode = throughputMode.toString();
        return this;
    }

    /**
     * <p>
     * For provisioned feature groups with online store enabled, this indicates the read throughput you are billed for
     * and can consume without throttling.
     * </p>
     * <p>
     * This field is not applicable for on-demand feature groups.
     * </p>
     * 
     * @param provisionedReadCapacityUnits
     *        For provisioned feature groups with online store enabled, this indicates the read throughput you are
     *        billed for and can consume without throttling. </p>
     *        <p>
     *        This field is not applicable for on-demand feature groups.
     */

    public void setProvisionedReadCapacityUnits(Integer provisionedReadCapacityUnits) {
        this.provisionedReadCapacityUnits = provisionedReadCapacityUnits;
    }

    /**
     * <p>
     * For provisioned feature groups with online store enabled, this indicates the read throughput you are billed for
     * and can consume without throttling.
     * </p>
     * <p>
     * This field is not applicable for on-demand feature groups.
     * </p>
     * 
     * @return For provisioned feature groups with online store enabled, this indicates the read throughput you are
     *         billed for and can consume without throttling. </p>
     *         <p>
     *         This field is not applicable for on-demand feature groups.
     */

    public Integer getProvisionedReadCapacityUnits() {
        return this.provisionedReadCapacityUnits;
    }

    /**
     * <p>
     * For provisioned feature groups with online store enabled, this indicates the read throughput you are billed for
     * and can consume without throttling.
     * </p>
     * <p>
     * This field is not applicable for on-demand feature groups.
     * </p>
     * 
     * @param provisionedReadCapacityUnits
     *        For provisioned feature groups with online store enabled, this indicates the read throughput you are
     *        billed for and can consume without throttling. </p>
     *        <p>
     *        This field is not applicable for on-demand feature groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThroughputConfigDescription withProvisionedReadCapacityUnits(Integer provisionedReadCapacityUnits) {
        setProvisionedReadCapacityUnits(provisionedReadCapacityUnits);
        return this;
    }

    /**
     * <p>
     * For provisioned feature groups, this indicates the write throughput you are billed for and can consume without
     * throttling.
     * </p>
     * <p>
     * This field is not applicable for on-demand feature groups.
     * </p>
     * 
     * @param provisionedWriteCapacityUnits
     *        For provisioned feature groups, this indicates the write throughput you are billed for and can consume
     *        without throttling. </p>
     *        <p>
     *        This field is not applicable for on-demand feature groups.
     */

    public void setProvisionedWriteCapacityUnits(Integer provisionedWriteCapacityUnits) {
        this.provisionedWriteCapacityUnits = provisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * For provisioned feature groups, this indicates the write throughput you are billed for and can consume without
     * throttling.
     * </p>
     * <p>
     * This field is not applicable for on-demand feature groups.
     * </p>
     * 
     * @return For provisioned feature groups, this indicates the write throughput you are billed for and can consume
     *         without throttling. </p>
     *         <p>
     *         This field is not applicable for on-demand feature groups.
     */

    public Integer getProvisionedWriteCapacityUnits() {
        return this.provisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * For provisioned feature groups, this indicates the write throughput you are billed for and can consume without
     * throttling.
     * </p>
     * <p>
     * This field is not applicable for on-demand feature groups.
     * </p>
     * 
     * @param provisionedWriteCapacityUnits
     *        For provisioned feature groups, this indicates the write throughput you are billed for and can consume
     *        without throttling. </p>
     *        <p>
     *        This field is not applicable for on-demand feature groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThroughputConfigDescription withProvisionedWriteCapacityUnits(Integer provisionedWriteCapacityUnits) {
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

        if (obj instanceof ThroughputConfigDescription == false)
            return false;
        ThroughputConfigDescription other = (ThroughputConfigDescription) obj;
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
    public ThroughputConfigDescription clone() {
        try {
            return (ThroughputConfigDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ThroughputConfigDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticinference.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an Elastic Inference Accelerator type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/AcceleratorType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceleratorType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     */
    private String acceleratorTypeName;
    /**
     * <p>
     * The memory information of the Elastic Inference Accelerator type.
     * </p>
     */
    private MemoryInfo memoryInfo;
    /**
     * <p>
     * The throughput information of the Elastic Inference Accelerator type.
     * </p>
     */
    private java.util.List<KeyValuePair> throughputInfo;

    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     * 
     * @param acceleratorTypeName
     *        The name of the Elastic Inference Accelerator type.
     */

    public void setAcceleratorTypeName(String acceleratorTypeName) {
        this.acceleratorTypeName = acceleratorTypeName;
    }

    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     * 
     * @return The name of the Elastic Inference Accelerator type.
     */

    public String getAcceleratorTypeName() {
        return this.acceleratorTypeName;
    }

    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     * 
     * @param acceleratorTypeName
     *        The name of the Elastic Inference Accelerator type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceleratorType withAcceleratorTypeName(String acceleratorTypeName) {
        setAcceleratorTypeName(acceleratorTypeName);
        return this;
    }

    /**
     * <p>
     * The memory information of the Elastic Inference Accelerator type.
     * </p>
     * 
     * @param memoryInfo
     *        The memory information of the Elastic Inference Accelerator type.
     */

    public void setMemoryInfo(MemoryInfo memoryInfo) {
        this.memoryInfo = memoryInfo;
    }

    /**
     * <p>
     * The memory information of the Elastic Inference Accelerator type.
     * </p>
     * 
     * @return The memory information of the Elastic Inference Accelerator type.
     */

    public MemoryInfo getMemoryInfo() {
        return this.memoryInfo;
    }

    /**
     * <p>
     * The memory information of the Elastic Inference Accelerator type.
     * </p>
     * 
     * @param memoryInfo
     *        The memory information of the Elastic Inference Accelerator type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceleratorType withMemoryInfo(MemoryInfo memoryInfo) {
        setMemoryInfo(memoryInfo);
        return this;
    }

    /**
     * <p>
     * The throughput information of the Elastic Inference Accelerator type.
     * </p>
     * 
     * @return The throughput information of the Elastic Inference Accelerator type.
     */

    public java.util.List<KeyValuePair> getThroughputInfo() {
        return throughputInfo;
    }

    /**
     * <p>
     * The throughput information of the Elastic Inference Accelerator type.
     * </p>
     * 
     * @param throughputInfo
     *        The throughput information of the Elastic Inference Accelerator type.
     */

    public void setThroughputInfo(java.util.Collection<KeyValuePair> throughputInfo) {
        if (throughputInfo == null) {
            this.throughputInfo = null;
            return;
        }

        this.throughputInfo = new java.util.ArrayList<KeyValuePair>(throughputInfo);
    }

    /**
     * <p>
     * The throughput information of the Elastic Inference Accelerator type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThroughputInfo(java.util.Collection)} or {@link #withThroughputInfo(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param throughputInfo
     *        The throughput information of the Elastic Inference Accelerator type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceleratorType withThroughputInfo(KeyValuePair... throughputInfo) {
        if (this.throughputInfo == null) {
            setThroughputInfo(new java.util.ArrayList<KeyValuePair>(throughputInfo.length));
        }
        for (KeyValuePair ele : throughputInfo) {
            this.throughputInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The throughput information of the Elastic Inference Accelerator type.
     * </p>
     * 
     * @param throughputInfo
     *        The throughput information of the Elastic Inference Accelerator type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceleratorType withThroughputInfo(java.util.Collection<KeyValuePair> throughputInfo) {
        setThroughputInfo(throughputInfo);
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
        if (getAcceleratorTypeName() != null)
            sb.append("AcceleratorTypeName: ").append(getAcceleratorTypeName()).append(",");
        if (getMemoryInfo() != null)
            sb.append("MemoryInfo: ").append(getMemoryInfo()).append(",");
        if (getThroughputInfo() != null)
            sb.append("ThroughputInfo: ").append(getThroughputInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceleratorType == false)
            return false;
        AcceleratorType other = (AcceleratorType) obj;
        if (other.getAcceleratorTypeName() == null ^ this.getAcceleratorTypeName() == null)
            return false;
        if (other.getAcceleratorTypeName() != null && other.getAcceleratorTypeName().equals(this.getAcceleratorTypeName()) == false)
            return false;
        if (other.getMemoryInfo() == null ^ this.getMemoryInfo() == null)
            return false;
        if (other.getMemoryInfo() != null && other.getMemoryInfo().equals(this.getMemoryInfo()) == false)
            return false;
        if (other.getThroughputInfo() == null ^ this.getThroughputInfo() == null)
            return false;
        if (other.getThroughputInfo() != null && other.getThroughputInfo().equals(this.getThroughputInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceleratorTypeName() == null) ? 0 : getAcceleratorTypeName().hashCode());
        hashCode = prime * hashCode + ((getMemoryInfo() == null) ? 0 : getMemoryInfo().hashCode());
        hashCode = prime * hashCode + ((getThroughputInfo() == null) ? 0 : getThroughputInfo().hashCode());
        return hashCode;
    }

    @Override
    public AcceleratorType clone() {
        try {
            return (AcceleratorType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticinference.model.transform.AcceleratorTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

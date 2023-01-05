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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the serverless configuration for an endpoint variant.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProductionVariantServerlessConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductionVariantServerlessConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The memory size of your serverless endpoint. Valid values are in 1 GB increments: 1024 MB, 2048 MB, 3072 MB, 4096
     * MB, 5120 MB, or 6144 MB.
     * </p>
     */
    private Integer memorySizeInMB;
    /**
     * <p>
     * The maximum number of concurrent invocations your serverless endpoint can process.
     * </p>
     */
    private Integer maxConcurrency;

    /**
     * <p>
     * The memory size of your serverless endpoint. Valid values are in 1 GB increments: 1024 MB, 2048 MB, 3072 MB, 4096
     * MB, 5120 MB, or 6144 MB.
     * </p>
     * 
     * @param memorySizeInMB
     *        The memory size of your serverless endpoint. Valid values are in 1 GB increments: 1024 MB, 2048 MB, 3072
     *        MB, 4096 MB, 5120 MB, or 6144 MB.
     */

    public void setMemorySizeInMB(Integer memorySizeInMB) {
        this.memorySizeInMB = memorySizeInMB;
    }

    /**
     * <p>
     * The memory size of your serverless endpoint. Valid values are in 1 GB increments: 1024 MB, 2048 MB, 3072 MB, 4096
     * MB, 5120 MB, or 6144 MB.
     * </p>
     * 
     * @return The memory size of your serverless endpoint. Valid values are in 1 GB increments: 1024 MB, 2048 MB, 3072
     *         MB, 4096 MB, 5120 MB, or 6144 MB.
     */

    public Integer getMemorySizeInMB() {
        return this.memorySizeInMB;
    }

    /**
     * <p>
     * The memory size of your serverless endpoint. Valid values are in 1 GB increments: 1024 MB, 2048 MB, 3072 MB, 4096
     * MB, 5120 MB, or 6144 MB.
     * </p>
     * 
     * @param memorySizeInMB
     *        The memory size of your serverless endpoint. Valid values are in 1 GB increments: 1024 MB, 2048 MB, 3072
     *        MB, 4096 MB, 5120 MB, or 6144 MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantServerlessConfig withMemorySizeInMB(Integer memorySizeInMB) {
        setMemorySizeInMB(memorySizeInMB);
        return this;
    }

    /**
     * <p>
     * The maximum number of concurrent invocations your serverless endpoint can process.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of concurrent invocations your serverless endpoint can process.
     */

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of concurrent invocations your serverless endpoint can process.
     * </p>
     * 
     * @return The maximum number of concurrent invocations your serverless endpoint can process.
     */

    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of concurrent invocations your serverless endpoint can process.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of concurrent invocations your serverless endpoint can process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantServerlessConfig withMaxConcurrency(Integer maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
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
        if (getMemorySizeInMB() != null)
            sb.append("MemorySizeInMB: ").append(getMemorySizeInMB()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductionVariantServerlessConfig == false)
            return false;
        ProductionVariantServerlessConfig other = (ProductionVariantServerlessConfig) obj;
        if (other.getMemorySizeInMB() == null ^ this.getMemorySizeInMB() == null)
            return false;
        if (other.getMemorySizeInMB() != null && other.getMemorySizeInMB().equals(this.getMemorySizeInMB()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemorySizeInMB() == null) ? 0 : getMemorySizeInMB().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        return hashCode;
    }

    @Override
    public ProductionVariantServerlessConfig clone() {
        try {
            return (ProductionVariantServerlessConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProductionVariantServerlessConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * Specifies the serverless update concurrency configuration for an endpoint variant.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProductionVariantServerlessUpdateConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductionVariantServerlessUpdateConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The updated maximum number of concurrent invocations your serverless endpoint can process.
     * </p>
     */
    private Integer maxConcurrency;
    /**
     * <p>
     * The updated amount of provisioned concurrency to allocate for the serverless endpoint. Should be less than or
     * equal to <code>MaxConcurrency</code>.
     * </p>
     */
    private Integer provisionedConcurrency;

    /**
     * <p>
     * The updated maximum number of concurrent invocations your serverless endpoint can process.
     * </p>
     * 
     * @param maxConcurrency
     *        The updated maximum number of concurrent invocations your serverless endpoint can process.
     */

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The updated maximum number of concurrent invocations your serverless endpoint can process.
     * </p>
     * 
     * @return The updated maximum number of concurrent invocations your serverless endpoint can process.
     */

    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The updated maximum number of concurrent invocations your serverless endpoint can process.
     * </p>
     * 
     * @param maxConcurrency
     *        The updated maximum number of concurrent invocations your serverless endpoint can process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantServerlessUpdateConfig withMaxConcurrency(Integer maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The updated amount of provisioned concurrency to allocate for the serverless endpoint. Should be less than or
     * equal to <code>MaxConcurrency</code>.
     * </p>
     * 
     * @param provisionedConcurrency
     *        The updated amount of provisioned concurrency to allocate for the serverless endpoint. Should be less than
     *        or equal to <code>MaxConcurrency</code>.
     */

    public void setProvisionedConcurrency(Integer provisionedConcurrency) {
        this.provisionedConcurrency = provisionedConcurrency;
    }

    /**
     * <p>
     * The updated amount of provisioned concurrency to allocate for the serverless endpoint. Should be less than or
     * equal to <code>MaxConcurrency</code>.
     * </p>
     * 
     * @return The updated amount of provisioned concurrency to allocate for the serverless endpoint. Should be less
     *         than or equal to <code>MaxConcurrency</code>.
     */

    public Integer getProvisionedConcurrency() {
        return this.provisionedConcurrency;
    }

    /**
     * <p>
     * The updated amount of provisioned concurrency to allocate for the serverless endpoint. Should be less than or
     * equal to <code>MaxConcurrency</code>.
     * </p>
     * 
     * @param provisionedConcurrency
     *        The updated amount of provisioned concurrency to allocate for the serverless endpoint. Should be less than
     *        or equal to <code>MaxConcurrency</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantServerlessUpdateConfig withProvisionedConcurrency(Integer provisionedConcurrency) {
        setProvisionedConcurrency(provisionedConcurrency);
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
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getProvisionedConcurrency() != null)
            sb.append("ProvisionedConcurrency: ").append(getProvisionedConcurrency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductionVariantServerlessUpdateConfig == false)
            return false;
        ProductionVariantServerlessUpdateConfig other = (ProductionVariantServerlessUpdateConfig) obj;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getProvisionedConcurrency() == null ^ this.getProvisionedConcurrency() == null)
            return false;
        if (other.getProvisionedConcurrency() != null && other.getProvisionedConcurrency().equals(this.getProvisionedConcurrency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getProvisionedConcurrency() == null) ? 0 : getProvisionedConcurrency().hashCode());
        return hashCode;
    }

    @Override
    public ProductionVariantServerlessUpdateConfig clone() {
        try {
            return (ProductionVariantServerlessUpdateConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProductionVariantServerlessUpdateConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

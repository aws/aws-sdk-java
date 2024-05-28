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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The list of metric sources required to generate recommendations for commercial software licenses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/MetricSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the metric source provider.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The ARN of the metric source provider.
     * </p>
     */
    private String providerArn;

    /**
     * <p>
     * The name of the metric source provider.
     * </p>
     * 
     * @param provider
     *        The name of the metric source provider.
     * @see MetricSourceProvider
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The name of the metric source provider.
     * </p>
     * 
     * @return The name of the metric source provider.
     * @see MetricSourceProvider
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The name of the metric source provider.
     * </p>
     * 
     * @param provider
     *        The name of the metric source provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricSourceProvider
     */

    public MetricSource withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The name of the metric source provider.
     * </p>
     * 
     * @param provider
     *        The name of the metric source provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricSourceProvider
     */

    public MetricSource withProvider(MetricSourceProvider provider) {
        this.provider = provider.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the metric source provider.
     * </p>
     * 
     * @param providerArn
     *        The ARN of the metric source provider.
     */

    public void setProviderArn(String providerArn) {
        this.providerArn = providerArn;
    }

    /**
     * <p>
     * The ARN of the metric source provider.
     * </p>
     * 
     * @return The ARN of the metric source provider.
     */

    public String getProviderArn() {
        return this.providerArn;
    }

    /**
     * <p>
     * The ARN of the metric source provider.
     * </p>
     * 
     * @param providerArn
     *        The ARN of the metric source provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSource withProviderArn(String providerArn) {
        setProviderArn(providerArn);
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
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getProviderArn() != null)
            sb.append("ProviderArn: ").append(getProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricSource == false)
            return false;
        MetricSource other = (MetricSource) obj;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getProviderArn() == null ^ this.getProviderArn() == null)
            return false;
        if (other.getProviderArn() != null && other.getProviderArn().equals(this.getProviderArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getProviderArn() == null) ? 0 : getProviderArn().hashCode());
        return hashCode;
    }

    @Override
    public MetricSource clone() {
        try {
            return (MetricSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.MetricSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

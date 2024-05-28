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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * (Amazon SQS only) The scaling configuration for the event source. To remove the configuration, pass an empty value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ScalingConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Limits the number of concurrent instances that the Amazon SQS event source can invoke.
     * </p>
     */
    private Integer maximumConcurrency;

    /**
     * <p>
     * Limits the number of concurrent instances that the Amazon SQS event source can invoke.
     * </p>
     * 
     * @param maximumConcurrency
     *        Limits the number of concurrent instances that the Amazon SQS event source can invoke.
     */

    public void setMaximumConcurrency(Integer maximumConcurrency) {
        this.maximumConcurrency = maximumConcurrency;
    }

    /**
     * <p>
     * Limits the number of concurrent instances that the Amazon SQS event source can invoke.
     * </p>
     * 
     * @return Limits the number of concurrent instances that the Amazon SQS event source can invoke.
     */

    public Integer getMaximumConcurrency() {
        return this.maximumConcurrency;
    }

    /**
     * <p>
     * Limits the number of concurrent instances that the Amazon SQS event source can invoke.
     * </p>
     * 
     * @param maximumConcurrency
     *        Limits the number of concurrent instances that the Amazon SQS event source can invoke.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfig withMaximumConcurrency(Integer maximumConcurrency) {
        setMaximumConcurrency(maximumConcurrency);
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
        if (getMaximumConcurrency() != null)
            sb.append("MaximumConcurrency: ").append(getMaximumConcurrency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingConfig == false)
            return false;
        ScalingConfig other = (ScalingConfig) obj;
        if (other.getMaximumConcurrency() == null ^ this.getMaximumConcurrency() == null)
            return false;
        if (other.getMaximumConcurrency() != null && other.getMaximumConcurrency().equals(this.getMaximumConcurrency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumConcurrency() == null) ? 0 : getMaximumConcurrency().hashCode());
        return hashCode;
    }

    @Override
    public ScalingConfig clone() {
        try {
            return (ScalingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.ScalingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

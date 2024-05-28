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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of the dynamic partitioning mechanism that creates smaller data sets from the streaming data by
 * partitioning it based on partition keys. Currently, dynamic partitioning is only supported for Amazon S3
 * destinations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/DynamicPartitioningConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DynamicPartitioningConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The retry behavior in case Firehose is unable to deliver data to an Amazon S3 prefix.
     * </p>
     */
    private RetryOptions retryOptions;
    /**
     * <p>
     * Specifies that the dynamic partitioning is enabled for this Firehose delivery stream.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The retry behavior in case Firehose is unable to deliver data to an Amazon S3 prefix.
     * </p>
     * 
     * @param retryOptions
     *        The retry behavior in case Firehose is unable to deliver data to an Amazon S3 prefix.
     */

    public void setRetryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * <p>
     * The retry behavior in case Firehose is unable to deliver data to an Amazon S3 prefix.
     * </p>
     * 
     * @return The retry behavior in case Firehose is unable to deliver data to an Amazon S3 prefix.
     */

    public RetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * <p>
     * The retry behavior in case Firehose is unable to deliver data to an Amazon S3 prefix.
     * </p>
     * 
     * @param retryOptions
     *        The retry behavior in case Firehose is unable to deliver data to an Amazon S3 prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicPartitioningConfiguration withRetryOptions(RetryOptions retryOptions) {
        setRetryOptions(retryOptions);
        return this;
    }

    /**
     * <p>
     * Specifies that the dynamic partitioning is enabled for this Firehose delivery stream.
     * </p>
     * 
     * @param enabled
     *        Specifies that the dynamic partitioning is enabled for this Firehose delivery stream.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies that the dynamic partitioning is enabled for this Firehose delivery stream.
     * </p>
     * 
     * @return Specifies that the dynamic partitioning is enabled for this Firehose delivery stream.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies that the dynamic partitioning is enabled for this Firehose delivery stream.
     * </p>
     * 
     * @param enabled
     *        Specifies that the dynamic partitioning is enabled for this Firehose delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicPartitioningConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies that the dynamic partitioning is enabled for this Firehose delivery stream.
     * </p>
     * 
     * @return Specifies that the dynamic partitioning is enabled for this Firehose delivery stream.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getRetryOptions() != null)
            sb.append("RetryOptions: ").append(getRetryOptions()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DynamicPartitioningConfiguration == false)
            return false;
        DynamicPartitioningConfiguration other = (DynamicPartitioningConfiguration) obj;
        if (other.getRetryOptions() == null ^ this.getRetryOptions() == null)
            return false;
        if (other.getRetryOptions() != null && other.getRetryOptions().equals(this.getRetryOptions()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetryOptions() == null) ? 0 : getRetryOptions().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public DynamicPartitioningConfiguration clone() {
        try {
            return (DynamicPartitioningConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.DynamicPartitioningConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

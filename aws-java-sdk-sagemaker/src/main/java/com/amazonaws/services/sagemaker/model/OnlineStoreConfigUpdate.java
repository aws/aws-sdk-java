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
 * Updates the feature group online store configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/OnlineStoreConfigUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OnlineStoreConfigUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Time to live duration, where the record is hard deleted after the expiration time is reached;
     * <code>ExpiresAt</code> = <code>EventTime</code> + <code>TtlDuration</code>. For information on HardDelete, see
     * the <a href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html">
     * DeleteRecord</a> API in the Amazon SageMaker API Reference guide.
     * </p>
     */
    private TtlDuration ttlDuration;

    /**
     * <p>
     * Time to live duration, where the record is hard deleted after the expiration time is reached;
     * <code>ExpiresAt</code> = <code>EventTime</code> + <code>TtlDuration</code>. For information on HardDelete, see
     * the <a href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html">
     * DeleteRecord</a> API in the Amazon SageMaker API Reference guide.
     * </p>
     * 
     * @param ttlDuration
     *        Time to live duration, where the record is hard deleted after the expiration time is reached;
     *        <code>ExpiresAt</code> = <code>EventTime</code> + <code>TtlDuration</code>. For information on HardDelete,
     *        see the <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html"
     *        >DeleteRecord</a> API in the Amazon SageMaker API Reference guide.
     */

    public void setTtlDuration(TtlDuration ttlDuration) {
        this.ttlDuration = ttlDuration;
    }

    /**
     * <p>
     * Time to live duration, where the record is hard deleted after the expiration time is reached;
     * <code>ExpiresAt</code> = <code>EventTime</code> + <code>TtlDuration</code>. For information on HardDelete, see
     * the <a href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html">
     * DeleteRecord</a> API in the Amazon SageMaker API Reference guide.
     * </p>
     * 
     * @return Time to live duration, where the record is hard deleted after the expiration time is reached;
     *         <code>ExpiresAt</code> = <code>EventTime</code> + <code>TtlDuration</code>. For information on
     *         HardDelete, see the <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html"
     *         >DeleteRecord</a> API in the Amazon SageMaker API Reference guide.
     */

    public TtlDuration getTtlDuration() {
        return this.ttlDuration;
    }

    /**
     * <p>
     * Time to live duration, where the record is hard deleted after the expiration time is reached;
     * <code>ExpiresAt</code> = <code>EventTime</code> + <code>TtlDuration</code>. For information on HardDelete, see
     * the <a href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html">
     * DeleteRecord</a> API in the Amazon SageMaker API Reference guide.
     * </p>
     * 
     * @param ttlDuration
     *        Time to live duration, where the record is hard deleted after the expiration time is reached;
     *        <code>ExpiresAt</code> = <code>EventTime</code> + <code>TtlDuration</code>. For information on HardDelete,
     *        see the <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html"
     *        >DeleteRecord</a> API in the Amazon SageMaker API Reference guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnlineStoreConfigUpdate withTtlDuration(TtlDuration ttlDuration) {
        setTtlDuration(ttlDuration);
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
        if (getTtlDuration() != null)
            sb.append("TtlDuration: ").append(getTtlDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnlineStoreConfigUpdate == false)
            return false;
        OnlineStoreConfigUpdate other = (OnlineStoreConfigUpdate) obj;
        if (other.getTtlDuration() == null ^ this.getTtlDuration() == null)
            return false;
        if (other.getTtlDuration() != null && other.getTtlDuration().equals(this.getTtlDuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTtlDuration() == null) ? 0 : getTtlDuration().hashCode());
        return hashCode;
    }

    @Override
    public OnlineStoreConfigUpdate clone() {
        try {
            return (OnlineStoreConfigUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.OnlineStoreConfigUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

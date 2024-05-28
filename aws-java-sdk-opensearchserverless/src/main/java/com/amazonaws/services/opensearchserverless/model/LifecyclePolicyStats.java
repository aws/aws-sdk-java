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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Statistics for an OpenSearch Serverless lifecycle policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/LifecyclePolicyStats"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicyStats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of retention lifecycle policies in the current account.
     * </p>
     */
    private Long retentionPolicyCount;

    /**
     * <p>
     * The number of retention lifecycle policies in the current account.
     * </p>
     * 
     * @param retentionPolicyCount
     *        The number of retention lifecycle policies in the current account.
     */

    public void setRetentionPolicyCount(Long retentionPolicyCount) {
        this.retentionPolicyCount = retentionPolicyCount;
    }

    /**
     * <p>
     * The number of retention lifecycle policies in the current account.
     * </p>
     * 
     * @return The number of retention lifecycle policies in the current account.
     */

    public Long getRetentionPolicyCount() {
        return this.retentionPolicyCount;
    }

    /**
     * <p>
     * The number of retention lifecycle policies in the current account.
     * </p>
     * 
     * @param retentionPolicyCount
     *        The number of retention lifecycle policies in the current account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyStats withRetentionPolicyCount(Long retentionPolicyCount) {
        setRetentionPolicyCount(retentionPolicyCount);
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
        if (getRetentionPolicyCount() != null)
            sb.append("RetentionPolicyCount: ").append(getRetentionPolicyCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicyStats == false)
            return false;
        LifecyclePolicyStats other = (LifecyclePolicyStats) obj;
        if (other.getRetentionPolicyCount() == null ^ this.getRetentionPolicyCount() == null)
            return false;
        if (other.getRetentionPolicyCount() != null && other.getRetentionPolicyCount().equals(this.getRetentionPolicyCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetentionPolicyCount() == null) ? 0 : getRetentionPolicyCount().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicyStats clone() {
        try {
            return (LifecyclePolicyStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.LifecyclePolicyStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

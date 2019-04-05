/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the lifecycle policy preview request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/LifecyclePolicyPreviewSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicyPreviewSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of expiring images.
     * </p>
     */
    private Integer expiringImageTotalCount;

    /**
     * <p>
     * The number of expiring images.
     * </p>
     * 
     * @param expiringImageTotalCount
     *        The number of expiring images.
     */

    public void setExpiringImageTotalCount(Integer expiringImageTotalCount) {
        this.expiringImageTotalCount = expiringImageTotalCount;
    }

    /**
     * <p>
     * The number of expiring images.
     * </p>
     * 
     * @return The number of expiring images.
     */

    public Integer getExpiringImageTotalCount() {
        return this.expiringImageTotalCount;
    }

    /**
     * <p>
     * The number of expiring images.
     * </p>
     * 
     * @param expiringImageTotalCount
     *        The number of expiring images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyPreviewSummary withExpiringImageTotalCount(Integer expiringImageTotalCount) {
        setExpiringImageTotalCount(expiringImageTotalCount);
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
        if (getExpiringImageTotalCount() != null)
            sb.append("ExpiringImageTotalCount: ").append(getExpiringImageTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicyPreviewSummary == false)
            return false;
        LifecyclePolicyPreviewSummary other = (LifecyclePolicyPreviewSummary) obj;
        if (other.getExpiringImageTotalCount() == null ^ this.getExpiringImageTotalCount() == null)
            return false;
        if (other.getExpiringImageTotalCount() != null && other.getExpiringImageTotalCount().equals(this.getExpiringImageTotalCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpiringImageTotalCount() == null) ? 0 : getExpiringImageTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicyPreviewSummary clone() {
        try {
            return (LifecyclePolicyPreviewSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.LifecyclePolicyPreviewSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

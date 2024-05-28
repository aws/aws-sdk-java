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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata transfer job's progress.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/MetadataTransferJobProgress"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetadataTransferJobProgress implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total count. [of what]
     * </p>
     */
    private Integer totalCount;
    /**
     * <p>
     * The succeeded count.
     * </p>
     */
    private Integer succeededCount;
    /**
     * <p>
     * The skipped count.
     * </p>
     */
    private Integer skippedCount;
    /**
     * <p>
     * The failed count.
     * </p>
     */
    private Integer failedCount;

    /**
     * <p>
     * The total count. [of what]
     * </p>
     * 
     * @param totalCount
     *        The total count. [of what]
     */

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total count. [of what]
     * </p>
     * 
     * @return The total count. [of what]
     */

    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total count. [of what]
     * </p>
     * 
     * @param totalCount
     *        The total count. [of what]
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataTransferJobProgress withTotalCount(Integer totalCount) {
        setTotalCount(totalCount);
        return this;
    }

    /**
     * <p>
     * The succeeded count.
     * </p>
     * 
     * @param succeededCount
     *        The succeeded count.
     */

    public void setSucceededCount(Integer succeededCount) {
        this.succeededCount = succeededCount;
    }

    /**
     * <p>
     * The succeeded count.
     * </p>
     * 
     * @return The succeeded count.
     */

    public Integer getSucceededCount() {
        return this.succeededCount;
    }

    /**
     * <p>
     * The succeeded count.
     * </p>
     * 
     * @param succeededCount
     *        The succeeded count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataTransferJobProgress withSucceededCount(Integer succeededCount) {
        setSucceededCount(succeededCount);
        return this;
    }

    /**
     * <p>
     * The skipped count.
     * </p>
     * 
     * @param skippedCount
     *        The skipped count.
     */

    public void setSkippedCount(Integer skippedCount) {
        this.skippedCount = skippedCount;
    }

    /**
     * <p>
     * The skipped count.
     * </p>
     * 
     * @return The skipped count.
     */

    public Integer getSkippedCount() {
        return this.skippedCount;
    }

    /**
     * <p>
     * The skipped count.
     * </p>
     * 
     * @param skippedCount
     *        The skipped count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataTransferJobProgress withSkippedCount(Integer skippedCount) {
        setSkippedCount(skippedCount);
        return this;
    }

    /**
     * <p>
     * The failed count.
     * </p>
     * 
     * @param failedCount
     *        The failed count.
     */

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    /**
     * <p>
     * The failed count.
     * </p>
     * 
     * @return The failed count.
     */

    public Integer getFailedCount() {
        return this.failedCount;
    }

    /**
     * <p>
     * The failed count.
     * </p>
     * 
     * @param failedCount
     *        The failed count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataTransferJobProgress withFailedCount(Integer failedCount) {
        setFailedCount(failedCount);
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
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount()).append(",");
        if (getSucceededCount() != null)
            sb.append("SucceededCount: ").append(getSucceededCount()).append(",");
        if (getSkippedCount() != null)
            sb.append("SkippedCount: ").append(getSkippedCount()).append(",");
        if (getFailedCount() != null)
            sb.append("FailedCount: ").append(getFailedCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetadataTransferJobProgress == false)
            return false;
        MetadataTransferJobProgress other = (MetadataTransferJobProgress) obj;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        if (other.getSucceededCount() == null ^ this.getSucceededCount() == null)
            return false;
        if (other.getSucceededCount() != null && other.getSucceededCount().equals(this.getSucceededCount()) == false)
            return false;
        if (other.getSkippedCount() == null ^ this.getSkippedCount() == null)
            return false;
        if (other.getSkippedCount() != null && other.getSkippedCount().equals(this.getSkippedCount()) == false)
            return false;
        if (other.getFailedCount() == null ^ this.getFailedCount() == null)
            return false;
        if (other.getFailedCount() != null && other.getFailedCount().equals(this.getFailedCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        hashCode = prime * hashCode + ((getSucceededCount() == null) ? 0 : getSucceededCount().hashCode());
        hashCode = prime * hashCode + ((getSkippedCount() == null) ? 0 : getSkippedCount().hashCode());
        hashCode = prime * hashCode + ((getFailedCount() == null) ? 0 : getFailedCount().hashCode());
        return hashCode;
    }

    @Override
    public MetadataTransferJobProgress clone() {
        try {
            return (MetadataTransferJobProgress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.MetadataTransferJobProgressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

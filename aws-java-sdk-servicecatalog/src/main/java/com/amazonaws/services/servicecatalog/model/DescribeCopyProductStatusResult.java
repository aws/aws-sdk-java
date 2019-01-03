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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeCopyProductStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCopyProductStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the copy product operation.
     * </p>
     */
    private String copyProductStatus;
    /**
     * <p>
     * The identifier of the copied product.
     * </p>
     */
    private String targetProductId;
    /**
     * <p>
     * The status message.
     * </p>
     */
    private String statusDetail;

    /**
     * <p>
     * The status of the copy product operation.
     * </p>
     * 
     * @param copyProductStatus
     *        The status of the copy product operation.
     * @see CopyProductStatus
     */

    public void setCopyProductStatus(String copyProductStatus) {
        this.copyProductStatus = copyProductStatus;
    }

    /**
     * <p>
     * The status of the copy product operation.
     * </p>
     * 
     * @return The status of the copy product operation.
     * @see CopyProductStatus
     */

    public String getCopyProductStatus() {
        return this.copyProductStatus;
    }

    /**
     * <p>
     * The status of the copy product operation.
     * </p>
     * 
     * @param copyProductStatus
     *        The status of the copy product operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CopyProductStatus
     */

    public DescribeCopyProductStatusResult withCopyProductStatus(String copyProductStatus) {
        setCopyProductStatus(copyProductStatus);
        return this;
    }

    /**
     * <p>
     * The status of the copy product operation.
     * </p>
     * 
     * @param copyProductStatus
     *        The status of the copy product operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CopyProductStatus
     */

    public DescribeCopyProductStatusResult withCopyProductStatus(CopyProductStatus copyProductStatus) {
        this.copyProductStatus = copyProductStatus.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the copied product.
     * </p>
     * 
     * @param targetProductId
     *        The identifier of the copied product.
     */

    public void setTargetProductId(String targetProductId) {
        this.targetProductId = targetProductId;
    }

    /**
     * <p>
     * The identifier of the copied product.
     * </p>
     * 
     * @return The identifier of the copied product.
     */

    public String getTargetProductId() {
        return this.targetProductId;
    }

    /**
     * <p>
     * The identifier of the copied product.
     * </p>
     * 
     * @param targetProductId
     *        The identifier of the copied product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCopyProductStatusResult withTargetProductId(String targetProductId) {
        setTargetProductId(targetProductId);
        return this;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusDetail
     *        The status message.
     */

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @return The status message.
     */

    public String getStatusDetail() {
        return this.statusDetail;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusDetail
     *        The status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCopyProductStatusResult withStatusDetail(String statusDetail) {
        setStatusDetail(statusDetail);
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
        if (getCopyProductStatus() != null)
            sb.append("CopyProductStatus: ").append(getCopyProductStatus()).append(",");
        if (getTargetProductId() != null)
            sb.append("TargetProductId: ").append(getTargetProductId()).append(",");
        if (getStatusDetail() != null)
            sb.append("StatusDetail: ").append(getStatusDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCopyProductStatusResult == false)
            return false;
        DescribeCopyProductStatusResult other = (DescribeCopyProductStatusResult) obj;
        if (other.getCopyProductStatus() == null ^ this.getCopyProductStatus() == null)
            return false;
        if (other.getCopyProductStatus() != null && other.getCopyProductStatus().equals(this.getCopyProductStatus()) == false)
            return false;
        if (other.getTargetProductId() == null ^ this.getTargetProductId() == null)
            return false;
        if (other.getTargetProductId() != null && other.getTargetProductId().equals(this.getTargetProductId()) == false)
            return false;
        if (other.getStatusDetail() == null ^ this.getStatusDetail() == null)
            return false;
        if (other.getStatusDetail() != null && other.getStatusDetail().equals(this.getStatusDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCopyProductStatus() == null) ? 0 : getCopyProductStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetProductId() == null) ? 0 : getTargetProductId().hashCode());
        hashCode = prime * hashCode + ((getStatusDetail() == null) ? 0 : getStatusDetail().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCopyProductStatusResult clone() {
        try {
            return (DescribeCopyProductStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

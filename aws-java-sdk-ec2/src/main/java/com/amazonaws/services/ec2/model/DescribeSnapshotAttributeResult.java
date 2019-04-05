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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of DescribeSnapshotAttribute.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotAttributeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The users and groups that have the permissions for creating volumes from the snapshot.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CreateVolumePermission> createVolumePermissions;
    /**
     * <p>
     * The product codes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProductCode> productCodes;
    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * The users and groups that have the permissions for creating volumes from the snapshot.
     * </p>
     * 
     * @return The users and groups that have the permissions for creating volumes from the snapshot.
     */

    public java.util.List<CreateVolumePermission> getCreateVolumePermissions() {
        if (createVolumePermissions == null) {
            createVolumePermissions = new com.amazonaws.internal.SdkInternalList<CreateVolumePermission>();
        }
        return createVolumePermissions;
    }

    /**
     * <p>
     * The users and groups that have the permissions for creating volumes from the snapshot.
     * </p>
     * 
     * @param createVolumePermissions
     *        The users and groups that have the permissions for creating volumes from the snapshot.
     */

    public void setCreateVolumePermissions(java.util.Collection<CreateVolumePermission> createVolumePermissions) {
        if (createVolumePermissions == null) {
            this.createVolumePermissions = null;
            return;
        }

        this.createVolumePermissions = new com.amazonaws.internal.SdkInternalList<CreateVolumePermission>(createVolumePermissions);
    }

    /**
     * <p>
     * The users and groups that have the permissions for creating volumes from the snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreateVolumePermissions(java.util.Collection)} or
     * {@link #withCreateVolumePermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param createVolumePermissions
     *        The users and groups that have the permissions for creating volumes from the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotAttributeResult withCreateVolumePermissions(CreateVolumePermission... createVolumePermissions) {
        if (this.createVolumePermissions == null) {
            setCreateVolumePermissions(new com.amazonaws.internal.SdkInternalList<CreateVolumePermission>(createVolumePermissions.length));
        }
        for (CreateVolumePermission ele : createVolumePermissions) {
            this.createVolumePermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The users and groups that have the permissions for creating volumes from the snapshot.
     * </p>
     * 
     * @param createVolumePermissions
     *        The users and groups that have the permissions for creating volumes from the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotAttributeResult withCreateVolumePermissions(java.util.Collection<CreateVolumePermission> createVolumePermissions) {
        setCreateVolumePermissions(createVolumePermissions);
        return this;
    }

    /**
     * <p>
     * The product codes.
     * </p>
     * 
     * @return The product codes.
     */

    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
            productCodes = new com.amazonaws.internal.SdkInternalList<ProductCode>();
        }
        return productCodes;
    }

    /**
     * <p>
     * The product codes.
     * </p>
     * 
     * @param productCodes
     *        The product codes.
     */

    public void setProductCodes(java.util.Collection<ProductCode> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }

        this.productCodes = new com.amazonaws.internal.SdkInternalList<ProductCode>(productCodes);
    }

    /**
     * <p>
     * The product codes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductCodes(java.util.Collection)} or {@link #withProductCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param productCodes
     *        The product codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotAttributeResult withProductCodes(ProductCode... productCodes) {
        if (this.productCodes == null) {
            setProductCodes(new com.amazonaws.internal.SdkInternalList<ProductCode>(productCodes.length));
        }
        for (ProductCode ele : productCodes) {
            this.productCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The product codes.
     * </p>
     * 
     * @param productCodes
     *        The product codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotAttributeResult withProductCodes(java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the EBS snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     * 
     * @return The ID of the EBS snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the EBS snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotAttributeResult withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
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
        if (getCreateVolumePermissions() != null)
            sb.append("CreateVolumePermissions: ").append(getCreateVolumePermissions()).append(",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: ").append(getProductCodes()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotAttributeResult == false)
            return false;
        DescribeSnapshotAttributeResult other = (DescribeSnapshotAttributeResult) obj;
        if (other.getCreateVolumePermissions() == null ^ this.getCreateVolumePermissions() == null)
            return false;
        if (other.getCreateVolumePermissions() != null && other.getCreateVolumePermissions().equals(this.getCreateVolumePermissions()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateVolumePermissions() == null) ? 0 : getCreateVolumePermissions().hashCode());
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotAttributeResult clone() {
        try {
            return (DescribeSnapshotAttributeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

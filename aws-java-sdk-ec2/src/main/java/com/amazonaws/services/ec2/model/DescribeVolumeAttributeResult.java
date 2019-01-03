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
 * Contains the output of DescribeVolumeAttribute.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVolumeAttributeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The state of <code>autoEnableIO</code> attribute.
     * </p>
     */
    private Boolean autoEnableIO;
    /**
     * <p>
     * A list of product codes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProductCode> productCodes;
    /**
     * <p>
     * The ID of the volume.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * The state of <code>autoEnableIO</code> attribute.
     * </p>
     * 
     * @param autoEnableIO
     *        The state of <code>autoEnableIO</code> attribute.
     */

    public void setAutoEnableIO(Boolean autoEnableIO) {
        this.autoEnableIO = autoEnableIO;
    }

    /**
     * <p>
     * The state of <code>autoEnableIO</code> attribute.
     * </p>
     * 
     * @return The state of <code>autoEnableIO</code> attribute.
     */

    public Boolean getAutoEnableIO() {
        return this.autoEnableIO;
    }

    /**
     * <p>
     * The state of <code>autoEnableIO</code> attribute.
     * </p>
     * 
     * @param autoEnableIO
     *        The state of <code>autoEnableIO</code> attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumeAttributeResult withAutoEnableIO(Boolean autoEnableIO) {
        setAutoEnableIO(autoEnableIO);
        return this;
    }

    /**
     * <p>
     * The state of <code>autoEnableIO</code> attribute.
     * </p>
     * 
     * @return The state of <code>autoEnableIO</code> attribute.
     */

    public Boolean isAutoEnableIO() {
        return this.autoEnableIO;
    }

    /**
     * <p>
     * A list of product codes.
     * </p>
     * 
     * @return A list of product codes.
     */

    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
            productCodes = new com.amazonaws.internal.SdkInternalList<ProductCode>();
        }
        return productCodes;
    }

    /**
     * <p>
     * A list of product codes.
     * </p>
     * 
     * @param productCodes
     *        A list of product codes.
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
     * A list of product codes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductCodes(java.util.Collection)} or {@link #withProductCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param productCodes
     *        A list of product codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumeAttributeResult withProductCodes(ProductCode... productCodes) {
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
     * A list of product codes.
     * </p>
     * 
     * @param productCodes
     *        A list of product codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumeAttributeResult withProductCodes(java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @return The ID of the volume.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumeAttributeResult withVolumeId(String volumeId) {
        setVolumeId(volumeId);
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
        if (getAutoEnableIO() != null)
            sb.append("AutoEnableIO: ").append(getAutoEnableIO()).append(",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: ").append(getProductCodes()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVolumeAttributeResult == false)
            return false;
        DescribeVolumeAttributeResult other = (DescribeVolumeAttributeResult) obj;
        if (other.getAutoEnableIO() == null ^ this.getAutoEnableIO() == null)
            return false;
        if (other.getAutoEnableIO() != null && other.getAutoEnableIO().equals(this.getAutoEnableIO()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoEnableIO() == null) ? 0 : getAutoEnableIO().hashCode());
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVolumeAttributeResult clone() {
        try {
            return (DescribeVolumeAttributeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

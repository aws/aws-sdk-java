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

/**
 * <p>
 * Describes an Amazon FPGA image (AFI) attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FpgaImageAttribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FpgaImageAttribute implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     */
    private String fpgaImageId;
    /**
     * <p>
     * The name of the AFI.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the AFI.
     * </p>
     */
    private String description;
    /**
     * <p>
     * One or more load permissions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LoadPermission> loadPermissions;
    /**
     * <p>
     * One or more product codes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProductCode> productCodes;

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     * 
     * @param fpgaImageId
     *        The ID of the AFI.
     */

    public void setFpgaImageId(String fpgaImageId) {
        this.fpgaImageId = fpgaImageId;
    }

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     * 
     * @return The ID of the AFI.
     */

    public String getFpgaImageId() {
        return this.fpgaImageId;
    }

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     * 
     * @param fpgaImageId
     *        The ID of the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImageAttribute withFpgaImageId(String fpgaImageId) {
        setFpgaImageId(fpgaImageId);
        return this;
    }

    /**
     * <p>
     * The name of the AFI.
     * </p>
     * 
     * @param name
     *        The name of the AFI.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the AFI.
     * </p>
     * 
     * @return The name of the AFI.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the AFI.
     * </p>
     * 
     * @param name
     *        The name of the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImageAttribute withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the AFI.
     * </p>
     * 
     * @param description
     *        The description of the AFI.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the AFI.
     * </p>
     * 
     * @return The description of the AFI.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the AFI.
     * </p>
     * 
     * @param description
     *        The description of the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImageAttribute withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * One or more load permissions.
     * </p>
     * 
     * @return One or more load permissions.
     */

    public java.util.List<LoadPermission> getLoadPermissions() {
        if (loadPermissions == null) {
            loadPermissions = new com.amazonaws.internal.SdkInternalList<LoadPermission>();
        }
        return loadPermissions;
    }

    /**
     * <p>
     * One or more load permissions.
     * </p>
     * 
     * @param loadPermissions
     *        One or more load permissions.
     */

    public void setLoadPermissions(java.util.Collection<LoadPermission> loadPermissions) {
        if (loadPermissions == null) {
            this.loadPermissions = null;
            return;
        }

        this.loadPermissions = new com.amazonaws.internal.SdkInternalList<LoadPermission>(loadPermissions);
    }

    /**
     * <p>
     * One or more load permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadPermissions(java.util.Collection)} or {@link #withLoadPermissions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param loadPermissions
     *        One or more load permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImageAttribute withLoadPermissions(LoadPermission... loadPermissions) {
        if (this.loadPermissions == null) {
            setLoadPermissions(new com.amazonaws.internal.SdkInternalList<LoadPermission>(loadPermissions.length));
        }
        for (LoadPermission ele : loadPermissions) {
            this.loadPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more load permissions.
     * </p>
     * 
     * @param loadPermissions
     *        One or more load permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImageAttribute withLoadPermissions(java.util.Collection<LoadPermission> loadPermissions) {
        setLoadPermissions(loadPermissions);
        return this;
    }

    /**
     * <p>
     * One or more product codes.
     * </p>
     * 
     * @return One or more product codes.
     */

    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
            productCodes = new com.amazonaws.internal.SdkInternalList<ProductCode>();
        }
        return productCodes;
    }

    /**
     * <p>
     * One or more product codes.
     * </p>
     * 
     * @param productCodes
     *        One or more product codes.
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
     * One or more product codes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductCodes(java.util.Collection)} or {@link #withProductCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param productCodes
     *        One or more product codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImageAttribute withProductCodes(ProductCode... productCodes) {
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
     * One or more product codes.
     * </p>
     * 
     * @param productCodes
     *        One or more product codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImageAttribute withProductCodes(java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
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
        if (getFpgaImageId() != null)
            sb.append("FpgaImageId: ").append(getFpgaImageId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLoadPermissions() != null)
            sb.append("LoadPermissions: ").append(getLoadPermissions()).append(",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: ").append(getProductCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FpgaImageAttribute == false)
            return false;
        FpgaImageAttribute other = (FpgaImageAttribute) obj;
        if (other.getFpgaImageId() == null ^ this.getFpgaImageId() == null)
            return false;
        if (other.getFpgaImageId() != null && other.getFpgaImageId().equals(this.getFpgaImageId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLoadPermissions() == null ^ this.getLoadPermissions() == null)
            return false;
        if (other.getLoadPermissions() != null && other.getLoadPermissions().equals(this.getLoadPermissions()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFpgaImageId() == null) ? 0 : getFpgaImageId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLoadPermissions() == null) ? 0 : getLoadPermissions().hashCode());
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        return hashCode;
    }

    @Override
    public FpgaImageAttribute clone() {
        try {
            return (FpgaImageAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

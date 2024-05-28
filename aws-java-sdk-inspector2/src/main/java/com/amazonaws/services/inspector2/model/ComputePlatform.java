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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A compute platform.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ComputePlatform" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputePlatform implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The compute platform product.
     * </p>
     */
    private String product;
    /**
     * <p>
     * The compute platform vendor.
     * </p>
     */
    private String vendor;
    /**
     * <p>
     * The compute platform version.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The compute platform product.
     * </p>
     * 
     * @param product
     *        The compute platform product.
     */

    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * <p>
     * The compute platform product.
     * </p>
     * 
     * @return The compute platform product.
     */

    public String getProduct() {
        return this.product;
    }

    /**
     * <p>
     * The compute platform product.
     * </p>
     * 
     * @param product
     *        The compute platform product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputePlatform withProduct(String product) {
        setProduct(product);
        return this;
    }

    /**
     * <p>
     * The compute platform vendor.
     * </p>
     * 
     * @param vendor
     *        The compute platform vendor.
     */

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * <p>
     * The compute platform vendor.
     * </p>
     * 
     * @return The compute platform vendor.
     */

    public String getVendor() {
        return this.vendor;
    }

    /**
     * <p>
     * The compute platform vendor.
     * </p>
     * 
     * @param vendor
     *        The compute platform vendor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputePlatform withVendor(String vendor) {
        setVendor(vendor);
        return this;
    }

    /**
     * <p>
     * The compute platform version.
     * </p>
     * 
     * @param version
     *        The compute platform version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The compute platform version.
     * </p>
     * 
     * @return The compute platform version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The compute platform version.
     * </p>
     * 
     * @param version
     *        The compute platform version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputePlatform withVersion(String version) {
        setVersion(version);
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
        if (getProduct() != null)
            sb.append("Product: ").append(getProduct()).append(",");
        if (getVendor() != null)
            sb.append("Vendor: ").append(getVendor()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputePlatform == false)
            return false;
        ComputePlatform other = (ComputePlatform) obj;
        if (other.getProduct() == null ^ this.getProduct() == null)
            return false;
        if (other.getProduct() != null && other.getProduct().equals(this.getProduct()) == false)
            return false;
        if (other.getVendor() == null ^ this.getVendor() == null)
            return false;
        if (other.getVendor() != null && other.getVendor().equals(this.getVendor()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProduct() == null) ? 0 : getProduct().hashCode());
        hashCode = prime * hashCode + ((getVendor() == null) ? 0 : getVendor().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public ComputePlatform clone() {
        try {
            return (ComputePlatform) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.ComputePlatformMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a metered product.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/MeteredProductSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeteredProductSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The family to which the metered product belongs.
     * </p>
     */
    private String family;
    /**
     * <p>
     * The port on which the metered product should run.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The product ID.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The vendor.
     * </p>
     */
    private String vendor;

    /**
     * <p>
     * The family to which the metered product belongs.
     * </p>
     * 
     * @param family
     *        The family to which the metered product belongs.
     */

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * The family to which the metered product belongs.
     * </p>
     * 
     * @return The family to which the metered product belongs.
     */

    public String getFamily() {
        return this.family;
    }

    /**
     * <p>
     * The family to which the metered product belongs.
     * </p>
     * 
     * @param family
     *        The family to which the metered product belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeteredProductSummary withFamily(String family) {
        setFamily(family);
        return this;
    }

    /**
     * <p>
     * The port on which the metered product should run.
     * </p>
     * 
     * @param port
     *        The port on which the metered product should run.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on which the metered product should run.
     * </p>
     * 
     * @return The port on which the metered product should run.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on which the metered product should run.
     * </p>
     * 
     * @param port
     *        The port on which the metered product should run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeteredProductSummary withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The product ID.
     * </p>
     * 
     * @param productId
     *        The product ID.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product ID.
     * </p>
     * 
     * @return The product ID.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product ID.
     * </p>
     * 
     * @param productId
     *        The product ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeteredProductSummary withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The vendor.
     * </p>
     * 
     * @param vendor
     *        The vendor.
     */

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * <p>
     * The vendor.
     * </p>
     * 
     * @return The vendor.
     */

    public String getVendor() {
        return this.vendor;
    }

    /**
     * <p>
     * The vendor.
     * </p>
     * 
     * @param vendor
     *        The vendor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeteredProductSummary withVendor(String vendor) {
        setVendor(vendor);
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
        if (getFamily() != null)
            sb.append("Family: ").append(getFamily()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getVendor() != null)
            sb.append("Vendor: ").append(getVendor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeteredProductSummary == false)
            return false;
        MeteredProductSummary other = (MeteredProductSummary) obj;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getVendor() == null ^ this.getVendor() == null)
            return false;
        if (other.getVendor() != null && other.getVendor().equals(this.getVendor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getVendor() == null) ? 0 : getVendor().hashCode());
        return hashCode;
    }

    @Override
    public MeteredProductSummary clone() {
        try {
            return (MeteredProductSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.MeteredProductSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

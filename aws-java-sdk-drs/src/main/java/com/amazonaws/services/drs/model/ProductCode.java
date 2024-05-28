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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties of a product code associated with a volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ProductCode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductCode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Id of a product code associated with a volume.
     * </p>
     */
    private String productCodeId;
    /**
     * <p>
     * Mode of a product code associated with a volume.
     * </p>
     */
    private String productCodeMode;

    /**
     * <p>
     * Id of a product code associated with a volume.
     * </p>
     * 
     * @param productCodeId
     *        Id of a product code associated with a volume.
     */

    public void setProductCodeId(String productCodeId) {
        this.productCodeId = productCodeId;
    }

    /**
     * <p>
     * Id of a product code associated with a volume.
     * </p>
     * 
     * @return Id of a product code associated with a volume.
     */

    public String getProductCodeId() {
        return this.productCodeId;
    }

    /**
     * <p>
     * Id of a product code associated with a volume.
     * </p>
     * 
     * @param productCodeId
     *        Id of a product code associated with a volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductCode withProductCodeId(String productCodeId) {
        setProductCodeId(productCodeId);
        return this;
    }

    /**
     * <p>
     * Mode of a product code associated with a volume.
     * </p>
     * 
     * @param productCodeMode
     *        Mode of a product code associated with a volume.
     * @see ProductCodeMode
     */

    public void setProductCodeMode(String productCodeMode) {
        this.productCodeMode = productCodeMode;
    }

    /**
     * <p>
     * Mode of a product code associated with a volume.
     * </p>
     * 
     * @return Mode of a product code associated with a volume.
     * @see ProductCodeMode
     */

    public String getProductCodeMode() {
        return this.productCodeMode;
    }

    /**
     * <p>
     * Mode of a product code associated with a volume.
     * </p>
     * 
     * @param productCodeMode
     *        Mode of a product code associated with a volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductCodeMode
     */

    public ProductCode withProductCodeMode(String productCodeMode) {
        setProductCodeMode(productCodeMode);
        return this;
    }

    /**
     * <p>
     * Mode of a product code associated with a volume.
     * </p>
     * 
     * @param productCodeMode
     *        Mode of a product code associated with a volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductCodeMode
     */

    public ProductCode withProductCodeMode(ProductCodeMode productCodeMode) {
        this.productCodeMode = productCodeMode.toString();
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
        if (getProductCodeId() != null)
            sb.append("ProductCodeId: ").append(getProductCodeId()).append(",");
        if (getProductCodeMode() != null)
            sb.append("ProductCodeMode: ").append(getProductCodeMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductCode == false)
            return false;
        ProductCode other = (ProductCode) obj;
        if (other.getProductCodeId() == null ^ this.getProductCodeId() == null)
            return false;
        if (other.getProductCodeId() != null && other.getProductCodeId().equals(this.getProductCodeId()) == false)
            return false;
        if (other.getProductCodeMode() == null ^ this.getProductCodeMode() == null)
            return false;
        if (other.getProductCodeMode() != null && other.getProductCodeMode().equals(this.getProductCodeMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductCodeId() == null) ? 0 : getProductCodeId().hashCode());
        hashCode = prime * hashCode + ((getProductCodeMode() == null) ? 0 : getProductCodeMode().hashCode());
        return hashCode;
    }

    @Override
    public ProductCode clone() {
        try {
            return (ProductCode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.ProductCodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

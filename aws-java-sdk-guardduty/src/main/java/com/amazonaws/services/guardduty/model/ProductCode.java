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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The product code of the EC2 instance.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ProductCode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductCode implements Serializable, Cloneable, StructuredPojo {

    /** Product code information. */
    private String code;
    /** Product code type. */
    private String productType;

    /**
     * Product code information.
     * 
     * @param code
     *        Product code information.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Product code information.
     * 
     * @return Product code information.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * Product code information.
     * 
     * @param code
     *        Product code information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductCode withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * Product code type.
     * 
     * @param productType
     *        Product code type.
     */

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * Product code type.
     * 
     * @return Product code type.
     */

    public String getProductType() {
        return this.productType;
    }

    /**
     * Product code type.
     * 
     * @param productType
     *        Product code type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductCode withProductType(String productType) {
        setProductType(productType);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getProductType() != null)
            sb.append("ProductType: ").append(getProductType());
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
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null && other.getProductType().equals(this.getProductType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getProductType() == null) ? 0 : getProductType().hashCode());
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
        com.amazonaws.services.guardduty.model.transform.ProductCodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

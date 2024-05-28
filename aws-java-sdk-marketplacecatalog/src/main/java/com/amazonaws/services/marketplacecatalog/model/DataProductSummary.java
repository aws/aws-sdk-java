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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object that contains summarized information about a data product.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DataProductSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataProductSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The title of the data product.
     * </p>
     */
    private String productTitle;
    /**
     * <p>
     * The lifecycle of the data product.
     * </p>
     */
    private String visibility;

    /**
     * <p>
     * The title of the data product.
     * </p>
     * 
     * @param productTitle
     *        The title of the data product.
     */

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    /**
     * <p>
     * The title of the data product.
     * </p>
     * 
     * @return The title of the data product.
     */

    public String getProductTitle() {
        return this.productTitle;
    }

    /**
     * <p>
     * The title of the data product.
     * </p>
     * 
     * @param productTitle
     *        The title of the data product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductSummary withProductTitle(String productTitle) {
        setProductTitle(productTitle);
        return this;
    }

    /**
     * <p>
     * The lifecycle of the data product.
     * </p>
     * 
     * @param visibility
     *        The lifecycle of the data product.
     * @see DataProductVisibilityString
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The lifecycle of the data product.
     * </p>
     * 
     * @return The lifecycle of the data product.
     * @see DataProductVisibilityString
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The lifecycle of the data product.
     * </p>
     * 
     * @param visibility
     *        The lifecycle of the data product.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataProductVisibilityString
     */

    public DataProductSummary withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The lifecycle of the data product.
     * </p>
     * 
     * @param visibility
     *        The lifecycle of the data product.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataProductVisibilityString
     */

    public DataProductSummary withVisibility(DataProductVisibilityString visibility) {
        this.visibility = visibility.toString();
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
        if (getProductTitle() != null)
            sb.append("ProductTitle: ").append(getProductTitle()).append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataProductSummary == false)
            return false;
        DataProductSummary other = (DataProductSummary) obj;
        if (other.getProductTitle() == null ^ this.getProductTitle() == null)
            return false;
        if (other.getProductTitle() != null && other.getProductTitle().equals(this.getProductTitle()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductTitle() == null) ? 0 : getProductTitle().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        return hashCode;
    }

    @Override
    public DataProductSummary clone() {
        try {
            return (DataProductSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.DataProductSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

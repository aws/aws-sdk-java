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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/PutMeteredProduct" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMeteredProductRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The license endpoint ID to add to the metered product.
     * </p>
     */
    private String licenseEndpointId;
    /**
     * <p>
     * The product ID to add to the metered product.
     * </p>
     */
    private String productId;

    /**
     * <p>
     * The license endpoint ID to add to the metered product.
     * </p>
     * 
     * @param licenseEndpointId
     *        The license endpoint ID to add to the metered product.
     */

    public void setLicenseEndpointId(String licenseEndpointId) {
        this.licenseEndpointId = licenseEndpointId;
    }

    /**
     * <p>
     * The license endpoint ID to add to the metered product.
     * </p>
     * 
     * @return The license endpoint ID to add to the metered product.
     */

    public String getLicenseEndpointId() {
        return this.licenseEndpointId;
    }

    /**
     * <p>
     * The license endpoint ID to add to the metered product.
     * </p>
     * 
     * @param licenseEndpointId
     *        The license endpoint ID to add to the metered product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMeteredProductRequest withLicenseEndpointId(String licenseEndpointId) {
        setLicenseEndpointId(licenseEndpointId);
        return this;
    }

    /**
     * <p>
     * The product ID to add to the metered product.
     * </p>
     * 
     * @param productId
     *        The product ID to add to the metered product.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product ID to add to the metered product.
     * </p>
     * 
     * @return The product ID to add to the metered product.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product ID to add to the metered product.
     * </p>
     * 
     * @param productId
     *        The product ID to add to the metered product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMeteredProductRequest withProductId(String productId) {
        setProductId(productId);
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
        if (getLicenseEndpointId() != null)
            sb.append("LicenseEndpointId: ").append(getLicenseEndpointId()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMeteredProductRequest == false)
            return false;
        PutMeteredProductRequest other = (PutMeteredProductRequest) obj;
        if (other.getLicenseEndpointId() == null ^ this.getLicenseEndpointId() == null)
            return false;
        if (other.getLicenseEndpointId() != null && other.getLicenseEndpointId().equals(this.getLicenseEndpointId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseEndpointId() == null) ? 0 : getLicenseEndpointId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        return hashCode;
    }

    @Override
    public PutMeteredProductRequest clone() {
        return (PutMeteredProductRequest) super.clone();
    }

}

/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisioningArtifact"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProvisioningArtifactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * The product identifier.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The provisioning artifact name.
     * </p>
     */
    private String provisioningArtifactName;
    /**
     * <p>
     * The product name.
     * </p>
     */
    private String productName;
    /**
     * <p>
     * Indicates whether a verbose level of detail is enabled.
     * </p>
     */
    private Boolean verbose;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningArtifactRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact.
     */

    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @return The identifier of the provisioning artifact.
     */

    public String getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningArtifactRequest withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @return The product identifier.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningArtifactRequest withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The provisioning artifact name.
     * </p>
     * 
     * @param provisioningArtifactName
     *        The provisioning artifact name.
     */

    public void setProvisioningArtifactName(String provisioningArtifactName) {
        this.provisioningArtifactName = provisioningArtifactName;
    }

    /**
     * <p>
     * The provisioning artifact name.
     * </p>
     * 
     * @return The provisioning artifact name.
     */

    public String getProvisioningArtifactName() {
        return this.provisioningArtifactName;
    }

    /**
     * <p>
     * The provisioning artifact name.
     * </p>
     * 
     * @param provisioningArtifactName
     *        The provisioning artifact name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningArtifactRequest withProvisioningArtifactName(String provisioningArtifactName) {
        setProvisioningArtifactName(provisioningArtifactName);
        return this;
    }

    /**
     * <p>
     * The product name.
     * </p>
     * 
     * @param productName
     *        The product name.
     */

    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * <p>
     * The product name.
     * </p>
     * 
     * @return The product name.
     */

    public String getProductName() {
        return this.productName;
    }

    /**
     * <p>
     * The product name.
     * </p>
     * 
     * @param productName
     *        The product name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningArtifactRequest withProductName(String productName) {
        setProductName(productName);
        return this;
    }

    /**
     * <p>
     * Indicates whether a verbose level of detail is enabled.
     * </p>
     * 
     * @param verbose
     *        Indicates whether a verbose level of detail is enabled.
     */

    public void setVerbose(Boolean verbose) {
        this.verbose = verbose;
    }

    /**
     * <p>
     * Indicates whether a verbose level of detail is enabled.
     * </p>
     * 
     * @return Indicates whether a verbose level of detail is enabled.
     */

    public Boolean getVerbose() {
        return this.verbose;
    }

    /**
     * <p>
     * Indicates whether a verbose level of detail is enabled.
     * </p>
     * 
     * @param verbose
     *        Indicates whether a verbose level of detail is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningArtifactRequest withVerbose(Boolean verbose) {
        setVerbose(verbose);
        return this;
    }

    /**
     * <p>
     * Indicates whether a verbose level of detail is enabled.
     * </p>
     * 
     * @return Indicates whether a verbose level of detail is enabled.
     */

    public Boolean isVerbose() {
        return this.verbose;
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: ").append(getProvisioningArtifactId()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getProvisioningArtifactName() != null)
            sb.append("ProvisioningArtifactName: ").append(getProvisioningArtifactName()).append(",");
        if (getProductName() != null)
            sb.append("ProductName: ").append(getProductName()).append(",");
        if (getVerbose() != null)
            sb.append("Verbose: ").append(getVerbose());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProvisioningArtifactRequest == false)
            return false;
        DescribeProvisioningArtifactRequest other = (DescribeProvisioningArtifactRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisioningArtifactName() == null ^ this.getProvisioningArtifactName() == null)
            return false;
        if (other.getProvisioningArtifactName() != null && other.getProvisioningArtifactName().equals(this.getProvisioningArtifactName()) == false)
            return false;
        if (other.getProductName() == null ^ this.getProductName() == null)
            return false;
        if (other.getProductName() != null && other.getProductName().equals(this.getProductName()) == false)
            return false;
        if (other.getVerbose() == null ^ this.getVerbose() == null)
            return false;
        if (other.getVerbose() != null && other.getVerbose().equals(this.getVerbose()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactName() == null) ? 0 : getProvisioningArtifactName().hashCode());
        hashCode = prime * hashCode + ((getProductName() == null) ? 0 : getProductName().hashCode());
        hashCode = prime * hashCode + ((getVerbose() == null) ? 0 : getVerbose().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProvisioningArtifactRequest clone() {
        return (DescribeProvisioningArtifactRequest) super.clone();
    }

}

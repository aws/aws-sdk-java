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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisioningParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProvisioningParametersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The product identifier. You must provide the product name or ID, but not both.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The name of the product. You must provide the name or ID, but not both.
     * </p>
     */
    private String productName;
    /**
     * <p>
     * The identifier of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * The name of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     */
    private String provisioningArtifactName;
    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>. You must provide the
     * name or ID, but not both.
     * </p>
     */
    private String pathId;
    /**
     * <p>
     * The name of the path. You must provide the name or ID, but not both.
     * </p>
     */
    private String pathName;

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

    public DescribeProvisioningParametersRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The product identifier. You must provide the product name or ID, but not both.
     * </p>
     * 
     * @param productId
     *        The product identifier. You must provide the product name or ID, but not both.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier. You must provide the product name or ID, but not both.
     * </p>
     * 
     * @return The product identifier. You must provide the product name or ID, but not both.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product identifier. You must provide the product name or ID, but not both.
     * </p>
     * 
     * @param productId
     *        The product identifier. You must provide the product name or ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersRequest withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The name of the product. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param productName
     *        The name of the product. You must provide the name or ID, but not both.
     */

    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * <p>
     * The name of the product. You must provide the name or ID, but not both.
     * </p>
     * 
     * @return The name of the product. You must provide the name or ID, but not both.
     */

    public String getProductName() {
        return this.productName;
    }

    /**
     * <p>
     * The name of the product. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param productName
     *        The name of the product. You must provide the name or ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersRequest withProductName(String productName) {
        setProductName(productName);
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact. You must provide the name or ID, but not both.
     */

    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     * 
     * @return The identifier of the provisioning artifact. You must provide the name or ID, but not both.
     */

    public String getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact. You must provide the name or ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersRequest withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
        return this;
    }

    /**
     * <p>
     * The name of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param provisioningArtifactName
     *        The name of the provisioning artifact. You must provide the name or ID, but not both.
     */

    public void setProvisioningArtifactName(String provisioningArtifactName) {
        this.provisioningArtifactName = provisioningArtifactName;
    }

    /**
     * <p>
     * The name of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     * 
     * @return The name of the provisioning artifact. You must provide the name or ID, but not both.
     */

    public String getProvisioningArtifactName() {
        return this.provisioningArtifactName;
    }

    /**
     * <p>
     * The name of the provisioning artifact. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param provisioningArtifactName
     *        The name of the provisioning artifact. You must provide the name or ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersRequest withProvisioningArtifactName(String provisioningArtifactName) {
        setProvisioningArtifactName(provisioningArtifactName);
        return this;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>. You must provide the
     * name or ID, but not both.
     * </p>
     * 
     * @param pathId
     *        The path identifier of the product. This value is optional if the product has a default path, and required
     *        if the product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>. You
     *        must provide the name or ID, but not both.
     */

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>. You must provide the
     * name or ID, but not both.
     * </p>
     * 
     * @return The path identifier of the product. This value is optional if the product has a default path, and
     *         required if the product has more than one path. To list the paths for a product, use
     *         <a>ListLaunchPaths</a>. You must provide the name or ID, but not both.
     */

    public String getPathId() {
        return this.pathId;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>. You must provide the
     * name or ID, but not both.
     * </p>
     * 
     * @param pathId
     *        The path identifier of the product. This value is optional if the product has a default path, and required
     *        if the product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>. You
     *        must provide the name or ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersRequest withPathId(String pathId) {
        setPathId(pathId);
        return this;
    }

    /**
     * <p>
     * The name of the path. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param pathName
     *        The name of the path. You must provide the name or ID, but not both.
     */

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    /**
     * <p>
     * The name of the path. You must provide the name or ID, but not both.
     * </p>
     * 
     * @return The name of the path. You must provide the name or ID, but not both.
     */

    public String getPathName() {
        return this.pathName;
    }

    /**
     * <p>
     * The name of the path. You must provide the name or ID, but not both.
     * </p>
     * 
     * @param pathName
     *        The name of the path. You must provide the name or ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersRequest withPathName(String pathName) {
        setPathName(pathName);
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getProductName() != null)
            sb.append("ProductName: ").append(getProductName()).append(",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: ").append(getProvisioningArtifactId()).append(",");
        if (getProvisioningArtifactName() != null)
            sb.append("ProvisioningArtifactName: ").append(getProvisioningArtifactName()).append(",");
        if (getPathId() != null)
            sb.append("PathId: ").append(getPathId()).append(",");
        if (getPathName() != null)
            sb.append("PathName: ").append(getPathName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProvisioningParametersRequest == false)
            return false;
        DescribeProvisioningParametersRequest other = (DescribeProvisioningParametersRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProductName() == null ^ this.getProductName() == null)
            return false;
        if (other.getProductName() != null && other.getProductName().equals(this.getProductName()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getProvisioningArtifactName() == null ^ this.getProvisioningArtifactName() == null)
            return false;
        if (other.getProvisioningArtifactName() != null && other.getProvisioningArtifactName().equals(this.getProvisioningArtifactName()) == false)
            return false;
        if (other.getPathId() == null ^ this.getPathId() == null)
            return false;
        if (other.getPathId() != null && other.getPathId().equals(this.getPathId()) == false)
            return false;
        if (other.getPathName() == null ^ this.getPathName() == null)
            return false;
        if (other.getPathName() != null && other.getPathName().equals(this.getPathName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProductName() == null) ? 0 : getProductName().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactName() == null) ? 0 : getProvisioningArtifactName().hashCode());
        hashCode = prime * hashCode + ((getPathId() == null) ? 0 : getPathId().hashCode());
        hashCode = prime * hashCode + ((getPathName() == null) ? 0 : getPathName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProvisioningParametersRequest clone() {
        return (DescribeProvisioningParametersRequest) super.clone();
    }

}

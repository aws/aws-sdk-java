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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProductAsAdmin"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProductAsAdminRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The product identifier.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The product name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier of the shared portfolio that the specified product is associated with.
     * </p>
     * <p>
     * You can provide this parameter to retrieve the shared TagOptions associated with the product. If this parameter
     * is provided and if TagOptions sharing is enabled in the portfolio share, the API returns both local and shared
     * TagOptions associated with the product. Otherwise only local TagOptions will be returned.
     * </p>
     */
    private String sourcePortfolioId;

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

    public DescribeProductAsAdminRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param id
     *        The product identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @return The product identifier.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param id
     *        The product identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductAsAdminRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The product name.
     * </p>
     * 
     * @param name
     *        The product name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The product name.
     * </p>
     * 
     * @return The product name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The product name.
     * </p>
     * 
     * @param name
     *        The product name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductAsAdminRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the shared portfolio that the specified product is associated with.
     * </p>
     * <p>
     * You can provide this parameter to retrieve the shared TagOptions associated with the product. If this parameter
     * is provided and if TagOptions sharing is enabled in the portfolio share, the API returns both local and shared
     * TagOptions associated with the product. Otherwise only local TagOptions will be returned.
     * </p>
     * 
     * @param sourcePortfolioId
     *        The unique identifier of the shared portfolio that the specified product is associated with.</p>
     *        <p>
     *        You can provide this parameter to retrieve the shared TagOptions associated with the product. If this
     *        parameter is provided and if TagOptions sharing is enabled in the portfolio share, the API returns both
     *        local and shared TagOptions associated with the product. Otherwise only local TagOptions will be returned.
     */

    public void setSourcePortfolioId(String sourcePortfolioId) {
        this.sourcePortfolioId = sourcePortfolioId;
    }

    /**
     * <p>
     * The unique identifier of the shared portfolio that the specified product is associated with.
     * </p>
     * <p>
     * You can provide this parameter to retrieve the shared TagOptions associated with the product. If this parameter
     * is provided and if TagOptions sharing is enabled in the portfolio share, the API returns both local and shared
     * TagOptions associated with the product. Otherwise only local TagOptions will be returned.
     * </p>
     * 
     * @return The unique identifier of the shared portfolio that the specified product is associated with.</p>
     *         <p>
     *         You can provide this parameter to retrieve the shared TagOptions associated with the product. If this
     *         parameter is provided and if TagOptions sharing is enabled in the portfolio share, the API returns both
     *         local and shared TagOptions associated with the product. Otherwise only local TagOptions will be
     *         returned.
     */

    public String getSourcePortfolioId() {
        return this.sourcePortfolioId;
    }

    /**
     * <p>
     * The unique identifier of the shared portfolio that the specified product is associated with.
     * </p>
     * <p>
     * You can provide this parameter to retrieve the shared TagOptions associated with the product. If this parameter
     * is provided and if TagOptions sharing is enabled in the portfolio share, the API returns both local and shared
     * TagOptions associated with the product. Otherwise only local TagOptions will be returned.
     * </p>
     * 
     * @param sourcePortfolioId
     *        The unique identifier of the shared portfolio that the specified product is associated with.</p>
     *        <p>
     *        You can provide this parameter to retrieve the shared TagOptions associated with the product. If this
     *        parameter is provided and if TagOptions sharing is enabled in the portfolio share, the API returns both
     *        local and shared TagOptions associated with the product. Otherwise only local TagOptions will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductAsAdminRequest withSourcePortfolioId(String sourcePortfolioId) {
        setSourcePortfolioId(sourcePortfolioId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSourcePortfolioId() != null)
            sb.append("SourcePortfolioId: ").append(getSourcePortfolioId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProductAsAdminRequest == false)
            return false;
        DescribeProductAsAdminRequest other = (DescribeProductAsAdminRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSourcePortfolioId() == null ^ this.getSourcePortfolioId() == null)
            return false;
        if (other.getSourcePortfolioId() != null && other.getSourcePortfolioId().equals(this.getSourcePortfolioId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSourcePortfolioId() == null) ? 0 : getSourcePortfolioId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProductAsAdminRequest clone() {
        return (DescribeProductAsAdminRequest) super.clone();
    }

}

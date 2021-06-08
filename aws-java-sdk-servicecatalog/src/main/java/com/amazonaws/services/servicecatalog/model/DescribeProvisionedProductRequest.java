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
 * DescribeProvisionedProductAPI input structure. AcceptLanguage - [Optional] The language code for localization. Id -
 * [Optional] The provisioned product identifier. Name - [Optional] Another provisioned product identifier. Customers
 * must provide either Id or Name.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisionedProduct"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProvisionedProductRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The provisioned product identifier. You must provide the name or ID, but not both.
     * </p>
     * <p>
     * If you do not provide a name or ID, or you provide both name and ID, an <code>InvalidParametersException</code>
     * will occur.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the provisioned product. You must provide the name or ID, but not both.
     * </p>
     * <p>
     * If you do not provide a name or ID, or you provide both name and ID, an <code>InvalidParametersException</code>
     * will occur.
     * </p>
     */
    private String name;

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

    public DescribeProvisionedProductRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The provisioned product identifier. You must provide the name or ID, but not both.
     * </p>
     * <p>
     * If you do not provide a name or ID, or you provide both name and ID, an <code>InvalidParametersException</code>
     * will occur.
     * </p>
     * 
     * @param id
     *        The provisioned product identifier. You must provide the name or ID, but not both.</p>
     *        <p>
     *        If you do not provide a name or ID, or you provide both name and ID, an
     *        <code>InvalidParametersException</code> will occur.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The provisioned product identifier. You must provide the name or ID, but not both.
     * </p>
     * <p>
     * If you do not provide a name or ID, or you provide both name and ID, an <code>InvalidParametersException</code>
     * will occur.
     * </p>
     * 
     * @return The provisioned product identifier. You must provide the name or ID, but not both.</p>
     *         <p>
     *         If you do not provide a name or ID, or you provide both name and ID, an
     *         <code>InvalidParametersException</code> will occur.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The provisioned product identifier. You must provide the name or ID, but not both.
     * </p>
     * <p>
     * If you do not provide a name or ID, or you provide both name and ID, an <code>InvalidParametersException</code>
     * will occur.
     * </p>
     * 
     * @param id
     *        The provisioned product identifier. You must provide the name or ID, but not both.</p>
     *        <p>
     *        If you do not provide a name or ID, or you provide both name and ID, an
     *        <code>InvalidParametersException</code> will occur.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisionedProductRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the provisioned product. You must provide the name or ID, but not both.
     * </p>
     * <p>
     * If you do not provide a name or ID, or you provide both name and ID, an <code>InvalidParametersException</code>
     * will occur.
     * </p>
     * 
     * @param name
     *        The name of the provisioned product. You must provide the name or ID, but not both.</p>
     *        <p>
     *        If you do not provide a name or ID, or you provide both name and ID, an
     *        <code>InvalidParametersException</code> will occur.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the provisioned product. You must provide the name or ID, but not both.
     * </p>
     * <p>
     * If you do not provide a name or ID, or you provide both name and ID, an <code>InvalidParametersException</code>
     * will occur.
     * </p>
     * 
     * @return The name of the provisioned product. You must provide the name or ID, but not both.</p>
     *         <p>
     *         If you do not provide a name or ID, or you provide both name and ID, an
     *         <code>InvalidParametersException</code> will occur.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the provisioned product. You must provide the name or ID, but not both.
     * </p>
     * <p>
     * If you do not provide a name or ID, or you provide both name and ID, an <code>InvalidParametersException</code>
     * will occur.
     * </p>
     * 
     * @param name
     *        The name of the provisioned product. You must provide the name or ID, but not both.</p>
     *        <p>
     *        If you do not provide a name or ID, or you provide both name and ID, an
     *        <code>InvalidParametersException</code> will occur.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisionedProductRequest withName(String name) {
        setName(name);
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
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProvisionedProductRequest == false)
            return false;
        DescribeProvisionedProductRequest other = (DescribeProvisionedProductRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProvisionedProductRequest clone() {
        return (DescribeProvisionedProductRequest) super.clone();
    }

}

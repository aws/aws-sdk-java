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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdatePortfolio" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePortfolioRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The portfolio identifier.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name to use for display purposes.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The updated description of the portfolio.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The updated name of the portfolio provider.
     * </p>
     */
    private String providerName;
    /**
     * <p>
     * The tags to add.
     * </p>
     */
    private java.util.List<Tag> addTags;
    /**
     * <p>
     * The tags to remove.
     * </p>
     */
    private java.util.List<String> removeTags;

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

    public UpdatePortfolioRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @param id
     *        The portfolio identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @return The portfolio identifier.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @param id
     *        The portfolio identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortfolioRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name to use for display purposes.
     * </p>
     * 
     * @param displayName
     *        The name to use for display purposes.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name to use for display purposes.
     * </p>
     * 
     * @return The name to use for display purposes.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name to use for display purposes.
     * </p>
     * 
     * @param displayName
     *        The name to use for display purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortfolioRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The updated description of the portfolio.
     * </p>
     * 
     * @param description
     *        The updated description of the portfolio.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of the portfolio.
     * </p>
     * 
     * @return The updated description of the portfolio.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated description of the portfolio.
     * </p>
     * 
     * @param description
     *        The updated description of the portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortfolioRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The updated name of the portfolio provider.
     * </p>
     * 
     * @param providerName
     *        The updated name of the portfolio provider.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The updated name of the portfolio provider.
     * </p>
     * 
     * @return The updated name of the portfolio provider.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The updated name of the portfolio provider.
     * </p>
     * 
     * @param providerName
     *        The updated name of the portfolio provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortfolioRequest withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * <p>
     * The tags to add.
     * </p>
     * 
     * @return The tags to add.
     */

    public java.util.List<Tag> getAddTags() {
        return addTags;
    }

    /**
     * <p>
     * The tags to add.
     * </p>
     * 
     * @param addTags
     *        The tags to add.
     */

    public void setAddTags(java.util.Collection<Tag> addTags) {
        if (addTags == null) {
            this.addTags = null;
            return;
        }

        this.addTags = new java.util.ArrayList<Tag>(addTags);
    }

    /**
     * <p>
     * The tags to add.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddTags(java.util.Collection)} or {@link #withAddTags(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param addTags
     *        The tags to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortfolioRequest withAddTags(Tag... addTags) {
        if (this.addTags == null) {
            setAddTags(new java.util.ArrayList<Tag>(addTags.length));
        }
        for (Tag ele : addTags) {
            this.addTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to add.
     * </p>
     * 
     * @param addTags
     *        The tags to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortfolioRequest withAddTags(java.util.Collection<Tag> addTags) {
        setAddTags(addTags);
        return this;
    }

    /**
     * <p>
     * The tags to remove.
     * </p>
     * 
     * @return The tags to remove.
     */

    public java.util.List<String> getRemoveTags() {
        return removeTags;
    }

    /**
     * <p>
     * The tags to remove.
     * </p>
     * 
     * @param removeTags
     *        The tags to remove.
     */

    public void setRemoveTags(java.util.Collection<String> removeTags) {
        if (removeTags == null) {
            this.removeTags = null;
            return;
        }

        this.removeTags = new java.util.ArrayList<String>(removeTags);
    }

    /**
     * <p>
     * The tags to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveTags(java.util.Collection)} or {@link #withRemoveTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param removeTags
     *        The tags to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortfolioRequest withRemoveTags(String... removeTags) {
        if (this.removeTags == null) {
            setRemoveTags(new java.util.ArrayList<String>(removeTags.length));
        }
        for (String ele : removeTags) {
            this.removeTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to remove.
     * </p>
     * 
     * @param removeTags
     *        The tags to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortfolioRequest withRemoveTags(java.util.Collection<String> removeTags) {
        setRemoveTags(removeTags);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName()).append(",");
        if (getAddTags() != null)
            sb.append("AddTags: ").append(getAddTags()).append(",");
        if (getRemoveTags() != null)
            sb.append("RemoveTags: ").append(getRemoveTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePortfolioRequest == false)
            return false;
        UpdatePortfolioRequest other = (UpdatePortfolioRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getAddTags() == null ^ this.getAddTags() == null)
            return false;
        if (other.getAddTags() != null && other.getAddTags().equals(this.getAddTags()) == false)
            return false;
        if (other.getRemoveTags() == null ^ this.getRemoveTags() == null)
            return false;
        if (other.getRemoveTags() != null && other.getRemoveTags().equals(this.getRemoveTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getAddTags() == null) ? 0 : getAddTags().hashCode());
        hashCode = prime * hashCode + ((getRemoveTags() == null) ? 0 : getRemoveTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePortfolioRequest clone() {
        return (UpdatePortfolioRequest) super.clone();
    }

}

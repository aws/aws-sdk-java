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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkillsStoreCategories"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSkillsStoreCategoriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of categories.
     * </p>
     */
    private java.util.List<Category> categoryList;
    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of categories.
     * </p>
     * 
     * @return The list of categories.
     */

    public java.util.List<Category> getCategoryList() {
        return categoryList;
    }

    /**
     * <p>
     * The list of categories.
     * </p>
     * 
     * @param categoryList
     *        The list of categories.
     */

    public void setCategoryList(java.util.Collection<Category> categoryList) {
        if (categoryList == null) {
            this.categoryList = null;
            return;
        }

        this.categoryList = new java.util.ArrayList<Category>(categoryList);
    }

    /**
     * <p>
     * The list of categories.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategoryList(java.util.Collection)} or {@link #withCategoryList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param categoryList
     *        The list of categories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSkillsStoreCategoriesResult withCategoryList(Category... categoryList) {
        if (this.categoryList == null) {
            setCategoryList(new java.util.ArrayList<Category>(categoryList.length));
        }
        for (Category ele : categoryList) {
            this.categoryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of categories.
     * </p>
     * 
     * @param categoryList
     *        The list of categories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSkillsStoreCategoriesResult withCategoryList(java.util.Collection<Category> categoryList) {
        setCategoryList(categoryList);
        return this;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * 
     * @param nextToken
     *        The tokens used for pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * 
     * @return The tokens used for pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * 
     * @param nextToken
     *        The tokens used for pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSkillsStoreCategoriesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getCategoryList() != null)
            sb.append("CategoryList: ").append(getCategoryList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSkillsStoreCategoriesResult == false)
            return false;
        ListSkillsStoreCategoriesResult other = (ListSkillsStoreCategoriesResult) obj;
        if (other.getCategoryList() == null ^ this.getCategoryList() == null)
            return false;
        if (other.getCategoryList() != null && other.getCategoryList().equals(this.getCategoryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategoryList() == null) ? 0 : getCategoryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSkillsStoreCategoriesResult clone() {
        try {
            return (ListSkillsStoreCategoriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

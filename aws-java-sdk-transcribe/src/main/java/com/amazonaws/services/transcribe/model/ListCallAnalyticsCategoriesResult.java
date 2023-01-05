/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListCallAnalyticsCategories"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCallAnalyticsCategoriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Provides detailed information about your Call Analytics categories, including all the rules associated with each
     * category.
     * </p>
     */
    private java.util.List<CategoryProperties> categories;

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To
     *        view the next set of results, copy the string associated with the <code>NextToken</code> parameter in your
     *        results output, then run your request again including <code>NextToken</code> with the value of the copied
     *        string. Repeat as needed to view all your results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     * 
     * @return If <code>NextToken</code> is present in your response, it indicates that not all results are displayed.
     *         To view the next set of results, copy the string associated with the <code>NextToken</code> parameter in
     *         your results output, then run your request again including <code>NextToken</code> with the value of the
     *         copied string. Repeat as needed to view all your results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To
     *        view the next set of results, copy the string associated with the <code>NextToken</code> parameter in your
     *        results output, then run your request again including <code>NextToken</code> with the value of the copied
     *        string. Repeat as needed to view all your results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCallAnalyticsCategoriesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Provides detailed information about your Call Analytics categories, including all the rules associated with each
     * category.
     * </p>
     * 
     * @return Provides detailed information about your Call Analytics categories, including all the rules associated
     *         with each category.
     */

    public java.util.List<CategoryProperties> getCategories() {
        return categories;
    }

    /**
     * <p>
     * Provides detailed information about your Call Analytics categories, including all the rules associated with each
     * category.
     * </p>
     * 
     * @param categories
     *        Provides detailed information about your Call Analytics categories, including all the rules associated
     *        with each category.
     */

    public void setCategories(java.util.Collection<CategoryProperties> categories) {
        if (categories == null) {
            this.categories = null;
            return;
        }

        this.categories = new java.util.ArrayList<CategoryProperties>(categories);
    }

    /**
     * <p>
     * Provides detailed information about your Call Analytics categories, including all the rules associated with each
     * category.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategories(java.util.Collection)} or {@link #withCategories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param categories
     *        Provides detailed information about your Call Analytics categories, including all the rules associated
     *        with each category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCallAnalyticsCategoriesResult withCategories(CategoryProperties... categories) {
        if (this.categories == null) {
            setCategories(new java.util.ArrayList<CategoryProperties>(categories.length));
        }
        for (CategoryProperties ele : categories) {
            this.categories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides detailed information about your Call Analytics categories, including all the rules associated with each
     * category.
     * </p>
     * 
     * @param categories
     *        Provides detailed information about your Call Analytics categories, including all the rules associated
     *        with each category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCallAnalyticsCategoriesResult withCategories(java.util.Collection<CategoryProperties> categories) {
        setCategories(categories);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getCategories() != null)
            sb.append("Categories: ").append(getCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCallAnalyticsCategoriesResult == false)
            return false;
        ListCallAnalyticsCategoriesResult other = (ListCallAnalyticsCategoriesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCategories() == null ^ this.getCategories() == null)
            return false;
        if (other.getCategories() != null && other.getCategories().equals(this.getCategories()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode());
        return hashCode;
    }

    @Override
    public ListCallAnalyticsCategoriesResult clone() {
        try {
            return (ListCallAnalyticsCategoriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

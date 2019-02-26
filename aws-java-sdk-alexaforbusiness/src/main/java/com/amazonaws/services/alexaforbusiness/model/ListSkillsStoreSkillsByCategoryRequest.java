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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkillsStoreSkillsByCategory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSkillsStoreSkillsByCategoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The category ID for which the skills are being retrieved from the skill store.
     * </p>
     */
    private Long categoryId;
    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of skills returned per paginated calls.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The category ID for which the skills are being retrieved from the skill store.
     * </p>
     * 
     * @param categoryId
     *        The category ID for which the skills are being retrieved from the skill store.
     */

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * <p>
     * The category ID for which the skills are being retrieved from the skill store.
     * </p>
     * 
     * @return The category ID for which the skills are being retrieved from the skill store.
     */

    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * <p>
     * The category ID for which the skills are being retrieved from the skill store.
     * </p>
     * 
     * @param categoryId
     *        The category ID for which the skills are being retrieved from the skill store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSkillsStoreSkillsByCategoryRequest withCategoryId(Long categoryId) {
        setCategoryId(categoryId);
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

    public ListSkillsStoreSkillsByCategoryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of skills returned per paginated calls.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of skills returned per paginated calls.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of skills returned per paginated calls.
     * </p>
     * 
     * @return The maximum number of skills returned per paginated calls.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of skills returned per paginated calls.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of skills returned per paginated calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSkillsStoreSkillsByCategoryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getCategoryId() != null)
            sb.append("CategoryId: ").append(getCategoryId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSkillsStoreSkillsByCategoryRequest == false)
            return false;
        ListSkillsStoreSkillsByCategoryRequest other = (ListSkillsStoreSkillsByCategoryRequest) obj;
        if (other.getCategoryId() == null ^ this.getCategoryId() == null)
            return false;
        if (other.getCategoryId() != null && other.getCategoryId().equals(this.getCategoryId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListSkillsStoreSkillsByCategoryRequest clone() {
        return (ListSkillsStoreSkillsByCategoryRequest) super.clone();
    }

}

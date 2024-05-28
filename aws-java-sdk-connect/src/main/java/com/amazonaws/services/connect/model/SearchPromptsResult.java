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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchPrompts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchPromptsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the prompts.
     * </p>
     */
    private java.util.List<Prompt> prompts;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of quick connects which matched your search query.
     * </p>
     */
    private Long approximateTotalCount;

    /**
     * <p>
     * Information about the prompts.
     * </p>
     * 
     * @return Information about the prompts.
     */

    public java.util.List<Prompt> getPrompts() {
        return prompts;
    }

    /**
     * <p>
     * Information about the prompts.
     * </p>
     * 
     * @param prompts
     *        Information about the prompts.
     */

    public void setPrompts(java.util.Collection<Prompt> prompts) {
        if (prompts == null) {
            this.prompts = null;
            return;
        }

        this.prompts = new java.util.ArrayList<Prompt>(prompts);
    }

    /**
     * <p>
     * Information about the prompts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrompts(java.util.Collection)} or {@link #withPrompts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param prompts
     *        Information about the prompts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPromptsResult withPrompts(Prompt... prompts) {
        if (this.prompts == null) {
            setPrompts(new java.util.ArrayList<Prompt>(prompts.length));
        }
        for (Prompt ele : prompts) {
            this.prompts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the prompts.
     * </p>
     * 
     * @param prompts
     *        Information about the prompts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPromptsResult withPrompts(java.util.Collection<Prompt> prompts) {
        setPrompts(prompts);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPromptsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of quick connects which matched your search query.
     * </p>
     * 
     * @param approximateTotalCount
     *        The total number of quick connects which matched your search query.
     */

    public void setApproximateTotalCount(Long approximateTotalCount) {
        this.approximateTotalCount = approximateTotalCount;
    }

    /**
     * <p>
     * The total number of quick connects which matched your search query.
     * </p>
     * 
     * @return The total number of quick connects which matched your search query.
     */

    public Long getApproximateTotalCount() {
        return this.approximateTotalCount;
    }

    /**
     * <p>
     * The total number of quick connects which matched your search query.
     * </p>
     * 
     * @param approximateTotalCount
     *        The total number of quick connects which matched your search query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPromptsResult withApproximateTotalCount(Long approximateTotalCount) {
        setApproximateTotalCount(approximateTotalCount);
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
        if (getPrompts() != null)
            sb.append("Prompts: ").append(getPrompts()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getApproximateTotalCount() != null)
            sb.append("ApproximateTotalCount: ").append(getApproximateTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchPromptsResult == false)
            return false;
        SearchPromptsResult other = (SearchPromptsResult) obj;
        if (other.getPrompts() == null ^ this.getPrompts() == null)
            return false;
        if (other.getPrompts() != null && other.getPrompts().equals(this.getPrompts()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getApproximateTotalCount() == null ^ this.getApproximateTotalCount() == null)
            return false;
        if (other.getApproximateTotalCount() != null && other.getApproximateTotalCount().equals(this.getApproximateTotalCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrompts() == null) ? 0 : getPrompts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getApproximateTotalCount() == null) ? 0 : getApproximateTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public SearchPromptsResult clone() {
        try {
            return (SearchPromptsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

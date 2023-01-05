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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/SearchContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchContentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about the content.
     * </p>
     */
    private java.util.List<ContentSummary> contentSummaries;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about the content.
     * </p>
     * 
     * @return Summary information about the content.
     */

    public java.util.List<ContentSummary> getContentSummaries() {
        return contentSummaries;
    }

    /**
     * <p>
     * Summary information about the content.
     * </p>
     * 
     * @param contentSummaries
     *        Summary information about the content.
     */

    public void setContentSummaries(java.util.Collection<ContentSummary> contentSummaries) {
        if (contentSummaries == null) {
            this.contentSummaries = null;
            return;
        }

        this.contentSummaries = new java.util.ArrayList<ContentSummary>(contentSummaries);
    }

    /**
     * <p>
     * Summary information about the content.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContentSummaries(java.util.Collection)} or {@link #withContentSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param contentSummaries
     *        Summary information about the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContentResult withContentSummaries(ContentSummary... contentSummaries) {
        if (this.contentSummaries == null) {
            setContentSummaries(new java.util.ArrayList<ContentSummary>(contentSummaries.length));
        }
        for (ContentSummary ele : contentSummaries) {
            this.contentSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the content.
     * </p>
     * 
     * @param contentSummaries
     *        Summary information about the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContentResult withContentSummaries(java.util.Collection<ContentSummary> contentSummaries) {
        setContentSummaries(contentSummaries);
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

    public SearchContentResult withNextToken(String nextToken) {
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
        if (getContentSummaries() != null)
            sb.append("ContentSummaries: ").append(getContentSummaries()).append(",");
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

        if (obj instanceof SearchContentResult == false)
            return false;
        SearchContentResult other = (SearchContentResult) obj;
        if (other.getContentSummaries() == null ^ this.getContentSummaries() == null)
            return false;
        if (other.getContentSummaries() != null && other.getContentSummaries().equals(this.getContentSummaries()) == false)
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

        hashCode = prime * hashCode + ((getContentSummaries() == null) ? 0 : getContentSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchContentResult clone() {
        try {
            return (SearchContentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

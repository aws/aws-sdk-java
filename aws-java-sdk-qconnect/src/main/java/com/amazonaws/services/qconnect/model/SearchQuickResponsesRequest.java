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
package com.amazonaws.services.qconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/SearchQuickResponses" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchQuickResponsesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/connect-attrib-list.html#user-defined-attributes"
     * >user-defined Amazon Connect contact attributes</a> to be resolved when search results are returned.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * The identifier of the knowledge base. This should be a QUICK_RESPONSES type knowledge base. Can be either the ID
     * or the ARN. URLs cannot contain the ARN.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The search expression for querying the quick response.
     * </p>
     */
    private QuickResponseSearchExpression searchExpression;

    /**
     * <p>
     * The <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/connect-attrib-list.html#user-defined-attributes"
     * >user-defined Amazon Connect contact attributes</a> to be resolved when search results are returned.
     * </p>
     * 
     * @return The <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/connect-attrib-list.html#user-defined-attributes"
     *         >user-defined Amazon Connect contact attributes</a> to be resolved when search results are returned.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/connect-attrib-list.html#user-defined-attributes"
     * >user-defined Amazon Connect contact attributes</a> to be resolved when search results are returned.
     * </p>
     * 
     * @param attributes
     *        The <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/connect-attrib-list.html#user-defined-attributes"
     *        >user-defined Amazon Connect contact attributes</a> to be resolved when search results are returned.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/connect-attrib-list.html#user-defined-attributes"
     * >user-defined Amazon Connect contact attributes</a> to be resolved when search results are returned.
     * </p>
     * 
     * @param attributes
     *        The <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/connect-attrib-list.html#user-defined-attributes"
     *        >user-defined Amazon Connect contact attributes</a> to be resolved when search results are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuickResponsesRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see SearchQuickResponsesRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuickResponsesRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuickResponsesRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The identifier of the knowledge base. This should be a QUICK_RESPONSES type knowledge base. Can be either the ID
     * or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. This should be a QUICK_RESPONSES type knowledge base. Can be either
     *        the ID or the ARN. URLs cannot contain the ARN.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. This should be a QUICK_RESPONSES type knowledge base. Can be either the ID
     * or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @return The identifier of the knowledge base. This should be a QUICK_RESPONSES type knowledge base. Can be either
     *         the ID or the ARN. URLs cannot contain the ARN.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. This should be a QUICK_RESPONSES type knowledge base. Can be either the ID
     * or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. This should be a QUICK_RESPONSES type knowledge base. Can be either
     *        the ID or the ARN. URLs cannot contain the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuickResponsesRequest withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @return The maximum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuickResponsesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuickResponsesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The search expression for querying the quick response.
     * </p>
     * 
     * @param searchExpression
     *        The search expression for querying the quick response.
     */

    public void setSearchExpression(QuickResponseSearchExpression searchExpression) {
        this.searchExpression = searchExpression;
    }

    /**
     * <p>
     * The search expression for querying the quick response.
     * </p>
     * 
     * @return The search expression for querying the quick response.
     */

    public QuickResponseSearchExpression getSearchExpression() {
        return this.searchExpression;
    }

    /**
     * <p>
     * The search expression for querying the quick response.
     * </p>
     * 
     * @param searchExpression
     *        The search expression for querying the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuickResponsesRequest withSearchExpression(QuickResponseSearchExpression searchExpression) {
        setSearchExpression(searchExpression);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append("***Sensitive Data Redacted***").append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSearchExpression() != null)
            sb.append("SearchExpression: ").append(getSearchExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchQuickResponsesRequest == false)
            return false;
        SearchQuickResponsesRequest other = (SearchQuickResponsesRequest) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSearchExpression() == null ^ this.getSearchExpression() == null)
            return false;
        if (other.getSearchExpression() != null && other.getSearchExpression().equals(this.getSearchExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSearchExpression() == null) ? 0 : getSearchExpression().hashCode());
        return hashCode;
    }

    @Override
    public SearchQuickResponsesRequest clone() {
        return (SearchQuickResponsesRequest) super.clone();
    }

}

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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/Retrieve" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrieveResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more results than can fit in the response, the response returns a <code>nextToken</code>. Use this
     * token in the <code>nextToken</code> field of another request to retrieve the next batch of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of results from querying the knowledge base.
     * </p>
     */
    private java.util.List<KnowledgeBaseRetrievalResult> retrievalResults;

    /**
     * <p>
     * If there are more results than can fit in the response, the response returns a <code>nextToken</code>. Use this
     * token in the <code>nextToken</code> field of another request to retrieve the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If there are more results than can fit in the response, the response returns a <code>nextToken</code>. Use
     *        this token in the <code>nextToken</code> field of another request to retrieve the next batch of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more results than can fit in the response, the response returns a <code>nextToken</code>. Use this
     * token in the <code>nextToken</code> field of another request to retrieve the next batch of results.
     * </p>
     * 
     * @return If there are more results than can fit in the response, the response returns a <code>nextToken</code>.
     *         Use this token in the <code>nextToken</code> field of another request to retrieve the next batch of
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more results than can fit in the response, the response returns a <code>nextToken</code>. Use this
     * token in the <code>nextToken</code> field of another request to retrieve the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If there are more results than can fit in the response, the response returns a <code>nextToken</code>. Use
     *        this token in the <code>nextToken</code> field of another request to retrieve the next batch of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of results from querying the knowledge base.
     * </p>
     * 
     * @return A list of results from querying the knowledge base.
     */

    public java.util.List<KnowledgeBaseRetrievalResult> getRetrievalResults() {
        return retrievalResults;
    }

    /**
     * <p>
     * A list of results from querying the knowledge base.
     * </p>
     * 
     * @param retrievalResults
     *        A list of results from querying the knowledge base.
     */

    public void setRetrievalResults(java.util.Collection<KnowledgeBaseRetrievalResult> retrievalResults) {
        if (retrievalResults == null) {
            this.retrievalResults = null;
            return;
        }

        this.retrievalResults = new java.util.ArrayList<KnowledgeBaseRetrievalResult>(retrievalResults);
    }

    /**
     * <p>
     * A list of results from querying the knowledge base.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRetrievalResults(java.util.Collection)} or {@link #withRetrievalResults(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param retrievalResults
     *        A list of results from querying the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveResult withRetrievalResults(KnowledgeBaseRetrievalResult... retrievalResults) {
        if (this.retrievalResults == null) {
            setRetrievalResults(new java.util.ArrayList<KnowledgeBaseRetrievalResult>(retrievalResults.length));
        }
        for (KnowledgeBaseRetrievalResult ele : retrievalResults) {
            this.retrievalResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of results from querying the knowledge base.
     * </p>
     * 
     * @param retrievalResults
     *        A list of results from querying the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveResult withRetrievalResults(java.util.Collection<KnowledgeBaseRetrievalResult> retrievalResults) {
        setRetrievalResults(retrievalResults);
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
        if (getRetrievalResults() != null)
            sb.append("RetrievalResults: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrieveResult == false)
            return false;
        RetrieveResult other = (RetrieveResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRetrievalResults() == null ^ this.getRetrievalResults() == null)
            return false;
        if (other.getRetrievalResults() != null && other.getRetrievalResults().equals(this.getRetrievalResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRetrievalResults() == null) ? 0 : getRetrievalResults().hashCode());
        return hashCode;
    }

    @Override
    public RetrieveResult clone() {
        try {
            return (RetrieveResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

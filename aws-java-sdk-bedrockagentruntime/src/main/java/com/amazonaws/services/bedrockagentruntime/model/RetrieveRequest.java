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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/Retrieve" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrieveRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the knowledge base to query.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * If there are more results than can fit in the response, the response returns a <code>nextToken</code>. Use this
     * token in the <code>nextToken</code> field of another request to retrieve the next batch of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Contains configurations for the knowledge base query and retrieval process. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     * </p>
     */
    private KnowledgeBaseRetrievalConfiguration retrievalConfiguration;
    /**
     * <p>
     * Contains the query to send the knowledge base.
     * </p>
     */
    private KnowledgeBaseQuery retrievalQuery;

    /**
     * <p>
     * The unique identifier of the knowledge base to query.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to query.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to query.
     * </p>
     * 
     * @return The unique identifier of the knowledge base to query.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to query.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveRequest withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
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

    public RetrieveRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Contains configurations for the knowledge base query and retrieval process. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     * </p>
     * 
     * @param retrievalConfiguration
     *        Contains configurations for the knowledge base query and retrieval process. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     */

    public void setRetrievalConfiguration(KnowledgeBaseRetrievalConfiguration retrievalConfiguration) {
        this.retrievalConfiguration = retrievalConfiguration;
    }

    /**
     * <p>
     * Contains configurations for the knowledge base query and retrieval process. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     * </p>
     * 
     * @return Contains configurations for the knowledge base query and retrieval process. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     */

    public KnowledgeBaseRetrievalConfiguration getRetrievalConfiguration() {
        return this.retrievalConfiguration;
    }

    /**
     * <p>
     * Contains configurations for the knowledge base query and retrieval process. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     * </p>
     * 
     * @param retrievalConfiguration
     *        Contains configurations for the knowledge base query and retrieval process. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html">Query configurations</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveRequest withRetrievalConfiguration(KnowledgeBaseRetrievalConfiguration retrievalConfiguration) {
        setRetrievalConfiguration(retrievalConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains the query to send the knowledge base.
     * </p>
     * 
     * @param retrievalQuery
     *        Contains the query to send the knowledge base.
     */

    public void setRetrievalQuery(KnowledgeBaseQuery retrievalQuery) {
        this.retrievalQuery = retrievalQuery;
    }

    /**
     * <p>
     * Contains the query to send the knowledge base.
     * </p>
     * 
     * @return Contains the query to send the knowledge base.
     */

    public KnowledgeBaseQuery getRetrievalQuery() {
        return this.retrievalQuery;
    }

    /**
     * <p>
     * Contains the query to send the knowledge base.
     * </p>
     * 
     * @param retrievalQuery
     *        Contains the query to send the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveRequest withRetrievalQuery(KnowledgeBaseQuery retrievalQuery) {
        setRetrievalQuery(retrievalQuery);
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
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRetrievalConfiguration() != null)
            sb.append("RetrievalConfiguration: ").append(getRetrievalConfiguration()).append(",");
        if (getRetrievalQuery() != null)
            sb.append("RetrievalQuery: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrieveRequest == false)
            return false;
        RetrieveRequest other = (RetrieveRequest) obj;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRetrievalConfiguration() == null ^ this.getRetrievalConfiguration() == null)
            return false;
        if (other.getRetrievalConfiguration() != null && other.getRetrievalConfiguration().equals(this.getRetrievalConfiguration()) == false)
            return false;
        if (other.getRetrievalQuery() == null ^ this.getRetrievalQuery() == null)
            return false;
        if (other.getRetrievalQuery() != null && other.getRetrievalQuery().equals(this.getRetrievalQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRetrievalConfiguration() == null) ? 0 : getRetrievalConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRetrievalQuery() == null) ? 0 : getRetrievalQuery().hashCode());
        return hashCode;
    }

    @Override
    public RetrieveRequest clone() {
        return (RetrieveRequest) super.clone();
    }

}

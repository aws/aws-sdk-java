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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a result from querying the knowledge base.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Retrieve.html#API_agent-runtime_Retrieve_ResponseSyntax"
 * >Retrieve response</a> – in the <code>retrievalResults</code> field
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/KnowledgeBaseRetrievalResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KnowledgeBaseRetrievalResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains a chunk of text from a data source in the knowledge base.
     * </p>
     */
    private RetrievalResultContent content;
    /**
     * <p>
     * Contains information about the location of the data source.
     * </p>
     */
    private RetrievalResultLocation location;
    /**
     * <p>
     * The level of relevance of the result to the query.
     * </p>
     */
    private Double score;

    /**
     * <p>
     * Contains a chunk of text from a data source in the knowledge base.
     * </p>
     * 
     * @param content
     *        Contains a chunk of text from a data source in the knowledge base.
     */

    public void setContent(RetrievalResultContent content) {
        this.content = content;
    }

    /**
     * <p>
     * Contains a chunk of text from a data source in the knowledge base.
     * </p>
     * 
     * @return Contains a chunk of text from a data source in the knowledge base.
     */

    public RetrievalResultContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * Contains a chunk of text from a data source in the knowledge base.
     * </p>
     * 
     * @param content
     *        Contains a chunk of text from a data source in the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseRetrievalResult withContent(RetrievalResultContent content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * Contains information about the location of the data source.
     * </p>
     * 
     * @param location
     *        Contains information about the location of the data source.
     */

    public void setLocation(RetrievalResultLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * Contains information about the location of the data source.
     * </p>
     * 
     * @return Contains information about the location of the data source.
     */

    public RetrievalResultLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Contains information about the location of the data source.
     * </p>
     * 
     * @param location
     *        Contains information about the location of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseRetrievalResult withLocation(RetrievalResultLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The level of relevance of the result to the query.
     * </p>
     * 
     * @param score
     *        The level of relevance of the result to the query.
     */

    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of relevance of the result to the query.
     * </p>
     * 
     * @return The level of relevance of the result to the query.
     */

    public Double getScore() {
        return this.score;
    }

    /**
     * <p>
     * The level of relevance of the result to the query.
     * </p>
     * 
     * @param score
     *        The level of relevance of the result to the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseRetrievalResult withScore(Double score) {
        setScore(score);
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
        if (getContent() != null)
            sb.append("Content: ").append("***Sensitive Data Redacted***").append(",");
        if (getLocation() != null)
            sb.append("Location: ").append("***Sensitive Data Redacted***").append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KnowledgeBaseRetrievalResult == false)
            return false;
        KnowledgeBaseRetrievalResult other = (KnowledgeBaseRetrievalResult) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public KnowledgeBaseRetrievalResult clone() {
        try {
            return (KnowledgeBaseRetrievalResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.KnowledgeBaseRetrievalResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

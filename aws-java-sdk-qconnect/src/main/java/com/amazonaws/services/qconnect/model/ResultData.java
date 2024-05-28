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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ResultData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Summary of the recommended content.
     * </p>
     */
    private DataSummary data;
    /**
     * <p>
     * The document.
     * </p>
     */
    private Document document;
    /**
     * <p>
     * The relevance score of the results.
     * </p>
     */
    private Double relevanceScore;
    /**
     * <p>
     * The identifier of the result data.
     * </p>
     */
    private String resultId;
    /**
     * <p>
     * The type of the query result.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Summary of the recommended content.
     * </p>
     * 
     * @param data
     *        Summary of the recommended content.
     */

    public void setData(DataSummary data) {
        this.data = data;
    }

    /**
     * <p>
     * Summary of the recommended content.
     * </p>
     * 
     * @return Summary of the recommended content.
     */

    public DataSummary getData() {
        return this.data;
    }

    /**
     * <p>
     * Summary of the recommended content.
     * </p>
     * 
     * @param data
     *        Summary of the recommended content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultData withData(DataSummary data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * The document.
     * </p>
     * 
     * @param document
     *        The document.
     */

    public void setDocument(Document document) {
        this.document = document;
    }

    /**
     * <p>
     * The document.
     * </p>
     * 
     * @return The document.
     */

    public Document getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The document.
     * </p>
     * 
     * @param document
     *        The document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultData withDocument(Document document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * The relevance score of the results.
     * </p>
     * 
     * @param relevanceScore
     *        The relevance score of the results.
     */

    public void setRelevanceScore(Double relevanceScore) {
        this.relevanceScore = relevanceScore;
    }

    /**
     * <p>
     * The relevance score of the results.
     * </p>
     * 
     * @return The relevance score of the results.
     */

    public Double getRelevanceScore() {
        return this.relevanceScore;
    }

    /**
     * <p>
     * The relevance score of the results.
     * </p>
     * 
     * @param relevanceScore
     *        The relevance score of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultData withRelevanceScore(Double relevanceScore) {
        setRelevanceScore(relevanceScore);
        return this;
    }

    /**
     * <p>
     * The identifier of the result data.
     * </p>
     * 
     * @param resultId
     *        The identifier of the result data.
     */

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    /**
     * <p>
     * The identifier of the result data.
     * </p>
     * 
     * @return The identifier of the result data.
     */

    public String getResultId() {
        return this.resultId;
    }

    /**
     * <p>
     * The identifier of the result data.
     * </p>
     * 
     * @param resultId
     *        The identifier of the result data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultData withResultId(String resultId) {
        setResultId(resultId);
        return this;
    }

    /**
     * <p>
     * The type of the query result.
     * </p>
     * 
     * @param type
     *        The type of the query result.
     * @see QueryResultType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the query result.
     * </p>
     * 
     * @return The type of the query result.
     * @see QueryResultType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the query result.
     * </p>
     * 
     * @param type
     *        The type of the query result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryResultType
     */

    public ResultData withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the query result.
     * </p>
     * 
     * @param type
     *        The type of the query result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryResultType
     */

    public ResultData withType(QueryResultType type) {
        this.type = type.toString();
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
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument()).append(",");
        if (getRelevanceScore() != null)
            sb.append("RelevanceScore: ").append(getRelevanceScore()).append(",");
        if (getResultId() != null)
            sb.append("ResultId: ").append(getResultId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultData == false)
            return false;
        ResultData other = (ResultData) obj;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getRelevanceScore() == null ^ this.getRelevanceScore() == null)
            return false;
        if (other.getRelevanceScore() != null && other.getRelevanceScore().equals(this.getRelevanceScore()) == false)
            return false;
        if (other.getResultId() == null ^ this.getResultId() == null)
            return false;
        if (other.getResultId() != null && other.getResultId().equals(this.getResultId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getRelevanceScore() == null) ? 0 : getRelevanceScore().hashCode());
        hashCode = prime * hashCode + ((getResultId() == null) ? 0 : getResultId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ResultData clone() {
        try {
            return (ResultData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.ResultDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

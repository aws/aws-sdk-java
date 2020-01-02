/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides feedback on how relevant a document is to a search. Your application uses the <a>SubmitFeedback</a>
 * operation to provide relevance information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/RelevanceFeedback" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelevanceFeedback implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the search result that the user provided relevance feedback for.
     * </p>
     */
    private String resultId;
    /**
     * <p>
     * Whether to document was relevant or not relevant to the search.
     * </p>
     */
    private String relevanceValue;

    /**
     * <p>
     * The unique identifier of the search result that the user provided relevance feedback for.
     * </p>
     * 
     * @param resultId
     *        The unique identifier of the search result that the user provided relevance feedback for.
     */

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    /**
     * <p>
     * The unique identifier of the search result that the user provided relevance feedback for.
     * </p>
     * 
     * @return The unique identifier of the search result that the user provided relevance feedback for.
     */

    public String getResultId() {
        return this.resultId;
    }

    /**
     * <p>
     * The unique identifier of the search result that the user provided relevance feedback for.
     * </p>
     * 
     * @param resultId
     *        The unique identifier of the search result that the user provided relevance feedback for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelevanceFeedback withResultId(String resultId) {
        setResultId(resultId);
        return this;
    }

    /**
     * <p>
     * Whether to document was relevant or not relevant to the search.
     * </p>
     * 
     * @param relevanceValue
     *        Whether to document was relevant or not relevant to the search.
     * @see RelevanceType
     */

    public void setRelevanceValue(String relevanceValue) {
        this.relevanceValue = relevanceValue;
    }

    /**
     * <p>
     * Whether to document was relevant or not relevant to the search.
     * </p>
     * 
     * @return Whether to document was relevant or not relevant to the search.
     * @see RelevanceType
     */

    public String getRelevanceValue() {
        return this.relevanceValue;
    }

    /**
     * <p>
     * Whether to document was relevant or not relevant to the search.
     * </p>
     * 
     * @param relevanceValue
     *        Whether to document was relevant or not relevant to the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelevanceType
     */

    public RelevanceFeedback withRelevanceValue(String relevanceValue) {
        setRelevanceValue(relevanceValue);
        return this;
    }

    /**
     * <p>
     * Whether to document was relevant or not relevant to the search.
     * </p>
     * 
     * @param relevanceValue
     *        Whether to document was relevant or not relevant to the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelevanceType
     */

    public RelevanceFeedback withRelevanceValue(RelevanceType relevanceValue) {
        this.relevanceValue = relevanceValue.toString();
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
        if (getResultId() != null)
            sb.append("ResultId: ").append(getResultId()).append(",");
        if (getRelevanceValue() != null)
            sb.append("RelevanceValue: ").append(getRelevanceValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelevanceFeedback == false)
            return false;
        RelevanceFeedback other = (RelevanceFeedback) obj;
        if (other.getResultId() == null ^ this.getResultId() == null)
            return false;
        if (other.getResultId() != null && other.getResultId().equals(this.getResultId()) == false)
            return false;
        if (other.getRelevanceValue() == null ^ this.getRelevanceValue() == null)
            return false;
        if (other.getRelevanceValue() != null && other.getRelevanceValue().equals(this.getRelevanceValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultId() == null) ? 0 : getResultId().hashCode());
        hashCode = prime * hashCode + ((getRelevanceValue() == null) ? 0 : getRelevanceValue().hashCode());
        return hashCode;
    }

    @Override
    public RelevanceFeedback clone() {
        try {
            return (RelevanceFeedback) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.RelevanceFeedbackMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * Details about generative data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GenerativeDataDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerativeDataDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The LLM response.
     * </p>
     */
    private String completion;
    /**
     * <p>
     * Details about the generative content ranking data.
     * </p>
     */
    private RankingData rankingData;
    /**
     * <p>
     * The references used to generative the LLM response.
     * </p>
     */
    private java.util.List<DataSummary> references;

    /**
     * <p>
     * The LLM response.
     * </p>
     * 
     * @param completion
     *        The LLM response.
     */

    public void setCompletion(String completion) {
        this.completion = completion;
    }

    /**
     * <p>
     * The LLM response.
     * </p>
     * 
     * @return The LLM response.
     */

    public String getCompletion() {
        return this.completion;
    }

    /**
     * <p>
     * The LLM response.
     * </p>
     * 
     * @param completion
     *        The LLM response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerativeDataDetails withCompletion(String completion) {
        setCompletion(completion);
        return this;
    }

    /**
     * <p>
     * Details about the generative content ranking data.
     * </p>
     * 
     * @param rankingData
     *        Details about the generative content ranking data.
     */

    public void setRankingData(RankingData rankingData) {
        this.rankingData = rankingData;
    }

    /**
     * <p>
     * Details about the generative content ranking data.
     * </p>
     * 
     * @return Details about the generative content ranking data.
     */

    public RankingData getRankingData() {
        return this.rankingData;
    }

    /**
     * <p>
     * Details about the generative content ranking data.
     * </p>
     * 
     * @param rankingData
     *        Details about the generative content ranking data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerativeDataDetails withRankingData(RankingData rankingData) {
        setRankingData(rankingData);
        return this;
    }

    /**
     * <p>
     * The references used to generative the LLM response.
     * </p>
     * 
     * @return The references used to generative the LLM response.
     */

    public java.util.List<DataSummary> getReferences() {
        return references;
    }

    /**
     * <p>
     * The references used to generative the LLM response.
     * </p>
     * 
     * @param references
     *        The references used to generative the LLM response.
     */

    public void setReferences(java.util.Collection<DataSummary> references) {
        if (references == null) {
            this.references = null;
            return;
        }

        this.references = new java.util.ArrayList<DataSummary>(references);
    }

    /**
     * <p>
     * The references used to generative the LLM response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferences(java.util.Collection)} or {@link #withReferences(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param references
     *        The references used to generative the LLM response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerativeDataDetails withReferences(DataSummary... references) {
        if (this.references == null) {
            setReferences(new java.util.ArrayList<DataSummary>(references.length));
        }
        for (DataSummary ele : references) {
            this.references.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The references used to generative the LLM response.
     * </p>
     * 
     * @param references
     *        The references used to generative the LLM response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerativeDataDetails withReferences(java.util.Collection<DataSummary> references) {
        setReferences(references);
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
        if (getCompletion() != null)
            sb.append("Completion: ").append("***Sensitive Data Redacted***").append(",");
        if (getRankingData() != null)
            sb.append("RankingData: ").append(getRankingData()).append(",");
        if (getReferences() != null)
            sb.append("References: ").append(getReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerativeDataDetails == false)
            return false;
        GenerativeDataDetails other = (GenerativeDataDetails) obj;
        if (other.getCompletion() == null ^ this.getCompletion() == null)
            return false;
        if (other.getCompletion() != null && other.getCompletion().equals(this.getCompletion()) == false)
            return false;
        if (other.getRankingData() == null ^ this.getRankingData() == null)
            return false;
        if (other.getRankingData() != null && other.getRankingData().equals(this.getRankingData()) == false)
            return false;
        if (other.getReferences() == null ^ this.getReferences() == null)
            return false;
        if (other.getReferences() != null && other.getReferences().equals(this.getReferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletion() == null) ? 0 : getCompletion().hashCode());
        hashCode = prime * hashCode + ((getRankingData() == null) ? 0 : getRankingData().hashCode());
        hashCode = prime * hashCode + ((getReferences() == null) ? 0 : getReferences().hashCode());
        return hashCode;
    }

    @Override
    public GenerativeDataDetails clone() {
        try {
            return (GenerativeDataDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.GenerativeDataDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

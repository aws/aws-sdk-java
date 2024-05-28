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
package com.amazonaws.services.kendraranking.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/Rescore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RescoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier associated with the scores that Amazon Kendra Intelligent Ranking gives to the results. Amazon
     * Kendra Intelligent Ranking rescores or re-ranks the results for the search service.
     * </p>
     */
    private String rescoreId;
    /**
     * <p>
     * A list of result items for documents with new relevancy scores. The results are in descending order.
     * </p>
     */
    private java.util.List<RescoreResultItem> resultItems;

    /**
     * <p>
     * The identifier associated with the scores that Amazon Kendra Intelligent Ranking gives to the results. Amazon
     * Kendra Intelligent Ranking rescores or re-ranks the results for the search service.
     * </p>
     * 
     * @param rescoreId
     *        The identifier associated with the scores that Amazon Kendra Intelligent Ranking gives to the results.
     *        Amazon Kendra Intelligent Ranking rescores or re-ranks the results for the search service.
     */

    public void setRescoreId(String rescoreId) {
        this.rescoreId = rescoreId;
    }

    /**
     * <p>
     * The identifier associated with the scores that Amazon Kendra Intelligent Ranking gives to the results. Amazon
     * Kendra Intelligent Ranking rescores or re-ranks the results for the search service.
     * </p>
     * 
     * @return The identifier associated with the scores that Amazon Kendra Intelligent Ranking gives to the results.
     *         Amazon Kendra Intelligent Ranking rescores or re-ranks the results for the search service.
     */

    public String getRescoreId() {
        return this.rescoreId;
    }

    /**
     * <p>
     * The identifier associated with the scores that Amazon Kendra Intelligent Ranking gives to the results. Amazon
     * Kendra Intelligent Ranking rescores or re-ranks the results for the search service.
     * </p>
     * 
     * @param rescoreId
     *        The identifier associated with the scores that Amazon Kendra Intelligent Ranking gives to the results.
     *        Amazon Kendra Intelligent Ranking rescores or re-ranks the results for the search service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RescoreResult withRescoreId(String rescoreId) {
        setRescoreId(rescoreId);
        return this;
    }

    /**
     * <p>
     * A list of result items for documents with new relevancy scores. The results are in descending order.
     * </p>
     * 
     * @return A list of result items for documents with new relevancy scores. The results are in descending order.
     */

    public java.util.List<RescoreResultItem> getResultItems() {
        return resultItems;
    }

    /**
     * <p>
     * A list of result items for documents with new relevancy scores. The results are in descending order.
     * </p>
     * 
     * @param resultItems
     *        A list of result items for documents with new relevancy scores. The results are in descending order.
     */

    public void setResultItems(java.util.Collection<RescoreResultItem> resultItems) {
        if (resultItems == null) {
            this.resultItems = null;
            return;
        }

        this.resultItems = new java.util.ArrayList<RescoreResultItem>(resultItems);
    }

    /**
     * <p>
     * A list of result items for documents with new relevancy scores. The results are in descending order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultItems(java.util.Collection)} or {@link #withResultItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resultItems
     *        A list of result items for documents with new relevancy scores. The results are in descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RescoreResult withResultItems(RescoreResultItem... resultItems) {
        if (this.resultItems == null) {
            setResultItems(new java.util.ArrayList<RescoreResultItem>(resultItems.length));
        }
        for (RescoreResultItem ele : resultItems) {
            this.resultItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of result items for documents with new relevancy scores. The results are in descending order.
     * </p>
     * 
     * @param resultItems
     *        A list of result items for documents with new relevancy scores. The results are in descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RescoreResult withResultItems(java.util.Collection<RescoreResultItem> resultItems) {
        setResultItems(resultItems);
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
        if (getRescoreId() != null)
            sb.append("RescoreId: ").append(getRescoreId()).append(",");
        if (getResultItems() != null)
            sb.append("ResultItems: ").append(getResultItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RescoreResult == false)
            return false;
        RescoreResult other = (RescoreResult) obj;
        if (other.getRescoreId() == null ^ this.getRescoreId() == null)
            return false;
        if (other.getRescoreId() != null && other.getRescoreId().equals(this.getRescoreId()) == false)
            return false;
        if (other.getResultItems() == null ^ this.getResultItems() == null)
            return false;
        if (other.getResultItems() != null && other.getResultItems().equals(this.getResultItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRescoreId() == null) ? 0 : getRescoreId().hashCode());
        hashCode = prime * hashCode + ((getResultItems() == null) ? 0 : getResultItems().hashCode());
        return hashCode;
    }

    @Override
    public RescoreResult clone() {
        try {
            return (RescoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

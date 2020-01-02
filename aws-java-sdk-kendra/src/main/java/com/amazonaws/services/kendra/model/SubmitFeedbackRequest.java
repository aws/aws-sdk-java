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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SubmitFeedback" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubmitFeedbackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index that was queried.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The identifier of the specific query for which you are submitting feedback. The query ID is returned in the
     * response to the operation.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * Tells Amazon Kendra that a particular search result link was chosen by the user.
     * </p>
     */
    private java.util.List<ClickFeedback> clickFeedbackItems;
    /**
     * <p>
     * Provides Amazon Kendra with relevant or not relevant feedback for whether a particular item was relevant to the
     * search.
     * </p>
     */
    private java.util.List<RelevanceFeedback> relevanceFeedbackItems;

    /**
     * <p>
     * The identifier of the index that was queried.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that was queried.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that was queried.
     * </p>
     * 
     * @return The identifier of the index that was queried.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index that was queried.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that was queried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitFeedbackRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The identifier of the specific query for which you are submitting feedback. The query ID is returned in the
     * response to the operation.
     * </p>
     * 
     * @param queryId
     *        The identifier of the specific query for which you are submitting feedback. The query ID is returned in
     *        the response to the operation.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The identifier of the specific query for which you are submitting feedback. The query ID is returned in the
     * response to the operation.
     * </p>
     * 
     * @return The identifier of the specific query for which you are submitting feedback. The query ID is returned in
     *         the response to the operation.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The identifier of the specific query for which you are submitting feedback. The query ID is returned in the
     * response to the operation.
     * </p>
     * 
     * @param queryId
     *        The identifier of the specific query for which you are submitting feedback. The query ID is returned in
     *        the response to the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitFeedbackRequest withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * Tells Amazon Kendra that a particular search result link was chosen by the user.
     * </p>
     * 
     * @return Tells Amazon Kendra that a particular search result link was chosen by the user.
     */

    public java.util.List<ClickFeedback> getClickFeedbackItems() {
        return clickFeedbackItems;
    }

    /**
     * <p>
     * Tells Amazon Kendra that a particular search result link was chosen by the user.
     * </p>
     * 
     * @param clickFeedbackItems
     *        Tells Amazon Kendra that a particular search result link was chosen by the user.
     */

    public void setClickFeedbackItems(java.util.Collection<ClickFeedback> clickFeedbackItems) {
        if (clickFeedbackItems == null) {
            this.clickFeedbackItems = null;
            return;
        }

        this.clickFeedbackItems = new java.util.ArrayList<ClickFeedback>(clickFeedbackItems);
    }

    /**
     * <p>
     * Tells Amazon Kendra that a particular search result link was chosen by the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClickFeedbackItems(java.util.Collection)} or {@link #withClickFeedbackItems(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param clickFeedbackItems
     *        Tells Amazon Kendra that a particular search result link was chosen by the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitFeedbackRequest withClickFeedbackItems(ClickFeedback... clickFeedbackItems) {
        if (this.clickFeedbackItems == null) {
            setClickFeedbackItems(new java.util.ArrayList<ClickFeedback>(clickFeedbackItems.length));
        }
        for (ClickFeedback ele : clickFeedbackItems) {
            this.clickFeedbackItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tells Amazon Kendra that a particular search result link was chosen by the user.
     * </p>
     * 
     * @param clickFeedbackItems
     *        Tells Amazon Kendra that a particular search result link was chosen by the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitFeedbackRequest withClickFeedbackItems(java.util.Collection<ClickFeedback> clickFeedbackItems) {
        setClickFeedbackItems(clickFeedbackItems);
        return this;
    }

    /**
     * <p>
     * Provides Amazon Kendra with relevant or not relevant feedback for whether a particular item was relevant to the
     * search.
     * </p>
     * 
     * @return Provides Amazon Kendra with relevant or not relevant feedback for whether a particular item was relevant
     *         to the search.
     */

    public java.util.List<RelevanceFeedback> getRelevanceFeedbackItems() {
        return relevanceFeedbackItems;
    }

    /**
     * <p>
     * Provides Amazon Kendra with relevant or not relevant feedback for whether a particular item was relevant to the
     * search.
     * </p>
     * 
     * @param relevanceFeedbackItems
     *        Provides Amazon Kendra with relevant or not relevant feedback for whether a particular item was relevant
     *        to the search.
     */

    public void setRelevanceFeedbackItems(java.util.Collection<RelevanceFeedback> relevanceFeedbackItems) {
        if (relevanceFeedbackItems == null) {
            this.relevanceFeedbackItems = null;
            return;
        }

        this.relevanceFeedbackItems = new java.util.ArrayList<RelevanceFeedback>(relevanceFeedbackItems);
    }

    /**
     * <p>
     * Provides Amazon Kendra with relevant or not relevant feedback for whether a particular item was relevant to the
     * search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelevanceFeedbackItems(java.util.Collection)} or
     * {@link #withRelevanceFeedbackItems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param relevanceFeedbackItems
     *        Provides Amazon Kendra with relevant or not relevant feedback for whether a particular item was relevant
     *        to the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitFeedbackRequest withRelevanceFeedbackItems(RelevanceFeedback... relevanceFeedbackItems) {
        if (this.relevanceFeedbackItems == null) {
            setRelevanceFeedbackItems(new java.util.ArrayList<RelevanceFeedback>(relevanceFeedbackItems.length));
        }
        for (RelevanceFeedback ele : relevanceFeedbackItems) {
            this.relevanceFeedbackItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides Amazon Kendra with relevant or not relevant feedback for whether a particular item was relevant to the
     * search.
     * </p>
     * 
     * @param relevanceFeedbackItems
     *        Provides Amazon Kendra with relevant or not relevant feedback for whether a particular item was relevant
     *        to the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitFeedbackRequest withRelevanceFeedbackItems(java.util.Collection<RelevanceFeedback> relevanceFeedbackItems) {
        setRelevanceFeedbackItems(relevanceFeedbackItems);
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getQueryId() != null)
            sb.append("QueryId: ").append(getQueryId()).append(",");
        if (getClickFeedbackItems() != null)
            sb.append("ClickFeedbackItems: ").append(getClickFeedbackItems()).append(",");
        if (getRelevanceFeedbackItems() != null)
            sb.append("RelevanceFeedbackItems: ").append(getRelevanceFeedbackItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubmitFeedbackRequest == false)
            return false;
        SubmitFeedbackRequest other = (SubmitFeedbackRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getClickFeedbackItems() == null ^ this.getClickFeedbackItems() == null)
            return false;
        if (other.getClickFeedbackItems() != null && other.getClickFeedbackItems().equals(this.getClickFeedbackItems()) == false)
            return false;
        if (other.getRelevanceFeedbackItems() == null ^ this.getRelevanceFeedbackItems() == null)
            return false;
        if (other.getRelevanceFeedbackItems() != null && other.getRelevanceFeedbackItems().equals(this.getRelevanceFeedbackItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getClickFeedbackItems() == null) ? 0 : getClickFeedbackItems().hashCode());
        hashCode = prime * hashCode + ((getRelevanceFeedbackItems() == null) ? 0 : getRelevanceFeedbackItems().hashCode());
        return hashCode;
    }

    @Override
    public SubmitFeedbackRequest clone() {
        return (SubmitFeedbackRequest) super.clone();
    }

}

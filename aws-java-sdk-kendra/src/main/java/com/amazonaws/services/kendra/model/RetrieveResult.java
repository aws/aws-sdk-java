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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Retrieve" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrieveResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of query used for the search. You also use <code>QueryId</code> to identify the search when using
     * the <a href="https://docs.aws.amazon.com/kendra/latest/APIReference/API_SubmitFeedback.html">Submitfeedback</a>
     * API.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * The results of the retrieved relevant passages for the search.
     * </p>
     */
    private java.util.List<RetrieveResultItem> resultItems;

    /**
     * <p>
     * The identifier of query used for the search. You also use <code>QueryId</code> to identify the search when using
     * the <a href="https://docs.aws.amazon.com/kendra/latest/APIReference/API_SubmitFeedback.html">Submitfeedback</a>
     * API.
     * </p>
     * 
     * @param queryId
     *        The identifier of query used for the search. You also use <code>QueryId</code> to identify the search when
     *        using the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/APIReference/API_SubmitFeedback.html">Submitfeedback</a>
     *        API.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The identifier of query used for the search. You also use <code>QueryId</code> to identify the search when using
     * the <a href="https://docs.aws.amazon.com/kendra/latest/APIReference/API_SubmitFeedback.html">Submitfeedback</a>
     * API.
     * </p>
     * 
     * @return The identifier of query used for the search. You also use <code>QueryId</code> to identify the search
     *         when using the <a
     *         href="https://docs.aws.amazon.com/kendra/latest/APIReference/API_SubmitFeedback.html">Submitfeedback</a>
     *         API.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The identifier of query used for the search. You also use <code>QueryId</code> to identify the search when using
     * the <a href="https://docs.aws.amazon.com/kendra/latest/APIReference/API_SubmitFeedback.html">Submitfeedback</a>
     * API.
     * </p>
     * 
     * @param queryId
     *        The identifier of query used for the search. You also use <code>QueryId</code> to identify the search when
     *        using the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/APIReference/API_SubmitFeedback.html">Submitfeedback</a>
     *        API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveResult withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * The results of the retrieved relevant passages for the search.
     * </p>
     * 
     * @return The results of the retrieved relevant passages for the search.
     */

    public java.util.List<RetrieveResultItem> getResultItems() {
        return resultItems;
    }

    /**
     * <p>
     * The results of the retrieved relevant passages for the search.
     * </p>
     * 
     * @param resultItems
     *        The results of the retrieved relevant passages for the search.
     */

    public void setResultItems(java.util.Collection<RetrieveResultItem> resultItems) {
        if (resultItems == null) {
            this.resultItems = null;
            return;
        }

        this.resultItems = new java.util.ArrayList<RetrieveResultItem>(resultItems);
    }

    /**
     * <p>
     * The results of the retrieved relevant passages for the search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultItems(java.util.Collection)} or {@link #withResultItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resultItems
     *        The results of the retrieved relevant passages for the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveResult withResultItems(RetrieveResultItem... resultItems) {
        if (this.resultItems == null) {
            setResultItems(new java.util.ArrayList<RetrieveResultItem>(resultItems.length));
        }
        for (RetrieveResultItem ele : resultItems) {
            this.resultItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The results of the retrieved relevant passages for the search.
     * </p>
     * 
     * @param resultItems
     *        The results of the retrieved relevant passages for the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveResult withResultItems(java.util.Collection<RetrieveResultItem> resultItems) {
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
        if (getQueryId() != null)
            sb.append("QueryId: ").append(getQueryId()).append(",");
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

        if (obj instanceof RetrieveResult == false)
            return false;
        RetrieveResult other = (RetrieveResult) obj;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
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

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getResultItems() == null) ? 0 : getResultItems().hashCode());
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

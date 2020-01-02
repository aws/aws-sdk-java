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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Query" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the search. You use <code>QueryId</code> to identify the search when using the feedback
     * API.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * The results of the search.
     * </p>
     */
    private java.util.List<QueryResultItem> resultItems;
    /**
     * <p>
     * Contains the facet results. A <code>FacetResult</code> contains the counts for each attribute key that was
     * specified in the <code>Facets</code> input parameter.
     * </p>
     */
    private java.util.List<FacetResult> facetResults;
    /**
     * <p>
     * The number of items returned by the search. Use this to determine when you have requested the last set of
     * results.
     * </p>
     */
    private Integer totalNumberOfResults;

    /**
     * <p>
     * The unique identifier for the search. You use <code>QueryId</code> to identify the search when using the feedback
     * API.
     * </p>
     * 
     * @param queryId
     *        The unique identifier for the search. You use <code>QueryId</code> to identify the search when using the
     *        feedback API.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The unique identifier for the search. You use <code>QueryId</code> to identify the search when using the feedback
     * API.
     * </p>
     * 
     * @return The unique identifier for the search. You use <code>QueryId</code> to identify the search when using the
     *         feedback API.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The unique identifier for the search. You use <code>QueryId</code> to identify the search when using the feedback
     * API.
     * </p>
     * 
     * @param queryId
     *        The unique identifier for the search. You use <code>QueryId</code> to identify the search when using the
     *        feedback API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * The results of the search.
     * </p>
     * 
     * @return The results of the search.
     */

    public java.util.List<QueryResultItem> getResultItems() {
        return resultItems;
    }

    /**
     * <p>
     * The results of the search.
     * </p>
     * 
     * @param resultItems
     *        The results of the search.
     */

    public void setResultItems(java.util.Collection<QueryResultItem> resultItems) {
        if (resultItems == null) {
            this.resultItems = null;
            return;
        }

        this.resultItems = new java.util.ArrayList<QueryResultItem>(resultItems);
    }

    /**
     * <p>
     * The results of the search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultItems(java.util.Collection)} or {@link #withResultItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resultItems
     *        The results of the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withResultItems(QueryResultItem... resultItems) {
        if (this.resultItems == null) {
            setResultItems(new java.util.ArrayList<QueryResultItem>(resultItems.length));
        }
        for (QueryResultItem ele : resultItems) {
            this.resultItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The results of the search.
     * </p>
     * 
     * @param resultItems
     *        The results of the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withResultItems(java.util.Collection<QueryResultItem> resultItems) {
        setResultItems(resultItems);
        return this;
    }

    /**
     * <p>
     * Contains the facet results. A <code>FacetResult</code> contains the counts for each attribute key that was
     * specified in the <code>Facets</code> input parameter.
     * </p>
     * 
     * @return Contains the facet results. A <code>FacetResult</code> contains the counts for each attribute key that
     *         was specified in the <code>Facets</code> input parameter.
     */

    public java.util.List<FacetResult> getFacetResults() {
        return facetResults;
    }

    /**
     * <p>
     * Contains the facet results. A <code>FacetResult</code> contains the counts for each attribute key that was
     * specified in the <code>Facets</code> input parameter.
     * </p>
     * 
     * @param facetResults
     *        Contains the facet results. A <code>FacetResult</code> contains the counts for each attribute key that was
     *        specified in the <code>Facets</code> input parameter.
     */

    public void setFacetResults(java.util.Collection<FacetResult> facetResults) {
        if (facetResults == null) {
            this.facetResults = null;
            return;
        }

        this.facetResults = new java.util.ArrayList<FacetResult>(facetResults);
    }

    /**
     * <p>
     * Contains the facet results. A <code>FacetResult</code> contains the counts for each attribute key that was
     * specified in the <code>Facets</code> input parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFacetResults(java.util.Collection)} or {@link #withFacetResults(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param facetResults
     *        Contains the facet results. A <code>FacetResult</code> contains the counts for each attribute key that was
     *        specified in the <code>Facets</code> input parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withFacetResults(FacetResult... facetResults) {
        if (this.facetResults == null) {
            setFacetResults(new java.util.ArrayList<FacetResult>(facetResults.length));
        }
        for (FacetResult ele : facetResults) {
            this.facetResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the facet results. A <code>FacetResult</code> contains the counts for each attribute key that was
     * specified in the <code>Facets</code> input parameter.
     * </p>
     * 
     * @param facetResults
     *        Contains the facet results. A <code>FacetResult</code> contains the counts for each attribute key that was
     *        specified in the <code>Facets</code> input parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withFacetResults(java.util.Collection<FacetResult> facetResults) {
        setFacetResults(facetResults);
        return this;
    }

    /**
     * <p>
     * The number of items returned by the search. Use this to determine when you have requested the last set of
     * results.
     * </p>
     * 
     * @param totalNumberOfResults
     *        The number of items returned by the search. Use this to determine when you have requested the last set of
     *        results.
     */

    public void setTotalNumberOfResults(Integer totalNumberOfResults) {
        this.totalNumberOfResults = totalNumberOfResults;
    }

    /**
     * <p>
     * The number of items returned by the search. Use this to determine when you have requested the last set of
     * results.
     * </p>
     * 
     * @return The number of items returned by the search. Use this to determine when you have requested the last set of
     *         results.
     */

    public Integer getTotalNumberOfResults() {
        return this.totalNumberOfResults;
    }

    /**
     * <p>
     * The number of items returned by the search. Use this to determine when you have requested the last set of
     * results.
     * </p>
     * 
     * @param totalNumberOfResults
     *        The number of items returned by the search. Use this to determine when you have requested the last set of
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withTotalNumberOfResults(Integer totalNumberOfResults) {
        setTotalNumberOfResults(totalNumberOfResults);
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
            sb.append("ResultItems: ").append(getResultItems()).append(",");
        if (getFacetResults() != null)
            sb.append("FacetResults: ").append(getFacetResults()).append(",");
        if (getTotalNumberOfResults() != null)
            sb.append("TotalNumberOfResults: ").append(getTotalNumberOfResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryResult == false)
            return false;
        QueryResult other = (QueryResult) obj;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getResultItems() == null ^ this.getResultItems() == null)
            return false;
        if (other.getResultItems() != null && other.getResultItems().equals(this.getResultItems()) == false)
            return false;
        if (other.getFacetResults() == null ^ this.getFacetResults() == null)
            return false;
        if (other.getFacetResults() != null && other.getFacetResults().equals(this.getFacetResults()) == false)
            return false;
        if (other.getTotalNumberOfResults() == null ^ this.getTotalNumberOfResults() == null)
            return false;
        if (other.getTotalNumberOfResults() != null && other.getTotalNumberOfResults().equals(this.getTotalNumberOfResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getResultItems() == null) ? 0 : getResultItems().hashCode());
        hashCode = prime * hashCode + ((getFacetResults() == null) ? 0 : getFacetResults().hashCode());
        hashCode = prime * hashCode + ((getTotalNumberOfResults() == null) ? 0 : getTotalNumberOfResults().hashCode());
        return hashCode;
    }

    @Override
    public QueryResult clone() {
        try {
            return (QueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

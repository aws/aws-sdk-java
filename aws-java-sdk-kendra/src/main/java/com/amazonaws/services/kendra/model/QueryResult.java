/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The identifier for the search. You use <code>QueryId</code> to identify the search when using the feedback API.
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
     * The total number of items found by the search; however, you can only retrieve up to 100 items. For example, if
     * the search found 192 items, you can only retrieve the first 100 of the items.
     * </p>
     */
    private Integer totalNumberOfResults;
    /**
     * <p>
     * A list of warning codes and their messages on problems with your query.
     * </p>
     * <p>
     * Amazon Kendra currently only supports one type of warning, which is a warning on invalid syntax used in the
     * query. For examples of invalid query syntax, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax">Searching
     * with advanced query syntax</a>.
     * </p>
     */
    private java.util.List<Warning> warnings;
    /**
     * <p>
     * A list of information related to suggested spell corrections for a query.
     * </p>
     */
    private java.util.List<SpellCorrectedQuery> spellCorrectedQueries;

    /**
     * <p>
     * The identifier for the search. You use <code>QueryId</code> to identify the search when using the feedback API.
     * </p>
     * 
     * @param queryId
     *        The identifier for the search. You use <code>QueryId</code> to identify the search when using the feedback
     *        API.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The identifier for the search. You use <code>QueryId</code> to identify the search when using the feedback API.
     * </p>
     * 
     * @return The identifier for the search. You use <code>QueryId</code> to identify the search when using the
     *         feedback API.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The identifier for the search. You use <code>QueryId</code> to identify the search when using the feedback API.
     * </p>
     * 
     * @param queryId
     *        The identifier for the search. You use <code>QueryId</code> to identify the search when using the feedback
     *        API.
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
     * The total number of items found by the search; however, you can only retrieve up to 100 items. For example, if
     * the search found 192 items, you can only retrieve the first 100 of the items.
     * </p>
     * 
     * @param totalNumberOfResults
     *        The total number of items found by the search; however, you can only retrieve up to 100 items. For
     *        example, if the search found 192 items, you can only retrieve the first 100 of the items.
     */

    public void setTotalNumberOfResults(Integer totalNumberOfResults) {
        this.totalNumberOfResults = totalNumberOfResults;
    }

    /**
     * <p>
     * The total number of items found by the search; however, you can only retrieve up to 100 items. For example, if
     * the search found 192 items, you can only retrieve the first 100 of the items.
     * </p>
     * 
     * @return The total number of items found by the search; however, you can only retrieve up to 100 items. For
     *         example, if the search found 192 items, you can only retrieve the first 100 of the items.
     */

    public Integer getTotalNumberOfResults() {
        return this.totalNumberOfResults;
    }

    /**
     * <p>
     * The total number of items found by the search; however, you can only retrieve up to 100 items. For example, if
     * the search found 192 items, you can only retrieve the first 100 of the items.
     * </p>
     * 
     * @param totalNumberOfResults
     *        The total number of items found by the search; however, you can only retrieve up to 100 items. For
     *        example, if the search found 192 items, you can only retrieve the first 100 of the items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withTotalNumberOfResults(Integer totalNumberOfResults) {
        setTotalNumberOfResults(totalNumberOfResults);
        return this;
    }

    /**
     * <p>
     * A list of warning codes and their messages on problems with your query.
     * </p>
     * <p>
     * Amazon Kendra currently only supports one type of warning, which is a warning on invalid syntax used in the
     * query. For examples of invalid query syntax, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax">Searching
     * with advanced query syntax</a>.
     * </p>
     * 
     * @return A list of warning codes and their messages on problems with your query.</p>
     *         <p>
     *         Amazon Kendra currently only supports one type of warning, which is a warning on invalid syntax used in
     *         the query. For examples of invalid query syntax, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax"
     *         >Searching with advanced query syntax</a>.
     */

    public java.util.List<Warning> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * A list of warning codes and their messages on problems with your query.
     * </p>
     * <p>
     * Amazon Kendra currently only supports one type of warning, which is a warning on invalid syntax used in the
     * query. For examples of invalid query syntax, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax">Searching
     * with advanced query syntax</a>.
     * </p>
     * 
     * @param warnings
     *        A list of warning codes and their messages on problems with your query.</p>
     *        <p>
     *        Amazon Kendra currently only supports one type of warning, which is a warning on invalid syntax used in
     *        the query. For examples of invalid query syntax, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax"
     *        >Searching with advanced query syntax</a>.
     */

    public void setWarnings(java.util.Collection<Warning> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new java.util.ArrayList<Warning>(warnings);
    }

    /**
     * <p>
     * A list of warning codes and their messages on problems with your query.
     * </p>
     * <p>
     * Amazon Kendra currently only supports one type of warning, which is a warning on invalid syntax used in the
     * query. For examples of invalid query syntax, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax">Searching
     * with advanced query syntax</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     *        A list of warning codes and their messages on problems with your query.</p>
     *        <p>
     *        Amazon Kendra currently only supports one type of warning, which is a warning on invalid syntax used in
     *        the query. For examples of invalid query syntax, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax"
     *        >Searching with advanced query syntax</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withWarnings(Warning... warnings) {
        if (this.warnings == null) {
            setWarnings(new java.util.ArrayList<Warning>(warnings.length));
        }
        for (Warning ele : warnings) {
            this.warnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of warning codes and their messages on problems with your query.
     * </p>
     * <p>
     * Amazon Kendra currently only supports one type of warning, which is a warning on invalid syntax used in the
     * query. For examples of invalid query syntax, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax">Searching
     * with advanced query syntax</a>.
     * </p>
     * 
     * @param warnings
     *        A list of warning codes and their messages on problems with your query.</p>
     *        <p>
     *        Amazon Kendra currently only supports one type of warning, which is a warning on invalid syntax used in
     *        the query. For examples of invalid query syntax, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax"
     *        >Searching with advanced query syntax</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withWarnings(java.util.Collection<Warning> warnings) {
        setWarnings(warnings);
        return this;
    }

    /**
     * <p>
     * A list of information related to suggested spell corrections for a query.
     * </p>
     * 
     * @return A list of information related to suggested spell corrections for a query.
     */

    public java.util.List<SpellCorrectedQuery> getSpellCorrectedQueries() {
        return spellCorrectedQueries;
    }

    /**
     * <p>
     * A list of information related to suggested spell corrections for a query.
     * </p>
     * 
     * @param spellCorrectedQueries
     *        A list of information related to suggested spell corrections for a query.
     */

    public void setSpellCorrectedQueries(java.util.Collection<SpellCorrectedQuery> spellCorrectedQueries) {
        if (spellCorrectedQueries == null) {
            this.spellCorrectedQueries = null;
            return;
        }

        this.spellCorrectedQueries = new java.util.ArrayList<SpellCorrectedQuery>(spellCorrectedQueries);
    }

    /**
     * <p>
     * A list of information related to suggested spell corrections for a query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpellCorrectedQueries(java.util.Collection)} or
     * {@link #withSpellCorrectedQueries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param spellCorrectedQueries
     *        A list of information related to suggested spell corrections for a query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withSpellCorrectedQueries(SpellCorrectedQuery... spellCorrectedQueries) {
        if (this.spellCorrectedQueries == null) {
            setSpellCorrectedQueries(new java.util.ArrayList<SpellCorrectedQuery>(spellCorrectedQueries.length));
        }
        for (SpellCorrectedQuery ele : spellCorrectedQueries) {
            this.spellCorrectedQueries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of information related to suggested spell corrections for a query.
     * </p>
     * 
     * @param spellCorrectedQueries
     *        A list of information related to suggested spell corrections for a query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withSpellCorrectedQueries(java.util.Collection<SpellCorrectedQuery> spellCorrectedQueries) {
        setSpellCorrectedQueries(spellCorrectedQueries);
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
            sb.append("TotalNumberOfResults: ").append(getTotalNumberOfResults()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings()).append(",");
        if (getSpellCorrectedQueries() != null)
            sb.append("SpellCorrectedQueries: ").append(getSpellCorrectedQueries());
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
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        if (other.getSpellCorrectedQueries() == null ^ this.getSpellCorrectedQueries() == null)
            return false;
        if (other.getSpellCorrectedQueries() != null && other.getSpellCorrectedQueries().equals(this.getSpellCorrectedQueries()) == false)
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
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        hashCode = prime * hashCode + ((getSpellCorrectedQueries() == null) ? 0 : getSpellCorrectedQueries().hashCode());
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

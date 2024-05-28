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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListInvestigations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInvestigationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     */
    private String graphArn;
    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return a Validation
     * Exception error.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Lists the maximum number of investigations in a page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Filters the investigation results based on a criteria.
     * </p>
     */
    private FilterCriteria filterCriteria;
    /**
     * <p>
     * Sorts the investigation results based on a criteria.
     * </p>
     */
    private SortCriteria sortCriteria;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The Amazon Resource Name (ARN) of the behavior graph.
     */

    public void setGraphArn(String graphArn) {
        this.graphArn = graphArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the behavior graph.
     */

    public String getGraphArn() {
        return this.graphArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The Amazon Resource Name (ARN) of the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvestigationsRequest withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return a Validation
     * Exception error.
     * </p>
     * 
     * @param nextToken
     *        Lists if there are more results available. The value of nextToken is a unique pagination token for each
     *        page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *        unchanged.</p>
     *        <p>
     *        Each pagination token expires after 24 hours. Using an expired pagination token will return a Validation
     *        Exception error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return a Validation
     * Exception error.
     * </p>
     * 
     * @return Lists if there are more results available. The value of nextToken is a unique pagination token for each
     *         page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *         unchanged.</p>
     *         <p>
     *         Each pagination token expires after 24 hours. Using an expired pagination token will return a Validation
     *         Exception error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return a Validation
     * Exception error.
     * </p>
     * 
     * @param nextToken
     *        Lists if there are more results available. The value of nextToken is a unique pagination token for each
     *        page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *        unchanged.</p>
     *        <p>
     *        Each pagination token expires after 24 hours. Using an expired pagination token will return a Validation
     *        Exception error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvestigationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Lists the maximum number of investigations in a page.
     * </p>
     * 
     * @param maxResults
     *        Lists the maximum number of investigations in a page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Lists the maximum number of investigations in a page.
     * </p>
     * 
     * @return Lists the maximum number of investigations in a page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Lists the maximum number of investigations in a page.
     * </p>
     * 
     * @param maxResults
     *        Lists the maximum number of investigations in a page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvestigationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filters the investigation results based on a criteria.
     * </p>
     * 
     * @param filterCriteria
     *        Filters the investigation results based on a criteria.
     */

    public void setFilterCriteria(FilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    /**
     * <p>
     * Filters the investigation results based on a criteria.
     * </p>
     * 
     * @return Filters the investigation results based on a criteria.
     */

    public FilterCriteria getFilterCriteria() {
        return this.filterCriteria;
    }

    /**
     * <p>
     * Filters the investigation results based on a criteria.
     * </p>
     * 
     * @param filterCriteria
     *        Filters the investigation results based on a criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvestigationsRequest withFilterCriteria(FilterCriteria filterCriteria) {
        setFilterCriteria(filterCriteria);
        return this;
    }

    /**
     * <p>
     * Sorts the investigation results based on a criteria.
     * </p>
     * 
     * @param sortCriteria
     *        Sorts the investigation results based on a criteria.
     */

    public void setSortCriteria(SortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

    /**
     * <p>
     * Sorts the investigation results based on a criteria.
     * </p>
     * 
     * @return Sorts the investigation results based on a criteria.
     */

    public SortCriteria getSortCriteria() {
        return this.sortCriteria;
    }

    /**
     * <p>
     * Sorts the investigation results based on a criteria.
     * </p>
     * 
     * @param sortCriteria
     *        Sorts the investigation results based on a criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvestigationsRequest withSortCriteria(SortCriteria sortCriteria) {
        setSortCriteria(sortCriteria);
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
        if (getGraphArn() != null)
            sb.append("GraphArn: ").append(getGraphArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilterCriteria() != null)
            sb.append("FilterCriteria: ").append(getFilterCriteria()).append(",");
        if (getSortCriteria() != null)
            sb.append("SortCriteria: ").append(getSortCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInvestigationsRequest == false)
            return false;
        ListInvestigationsRequest other = (ListInvestigationsRequest) obj;
        if (other.getGraphArn() == null ^ this.getGraphArn() == null)
            return false;
        if (other.getGraphArn() != null && other.getGraphArn().equals(this.getGraphArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilterCriteria() == null ^ this.getFilterCriteria() == null)
            return false;
        if (other.getFilterCriteria() != null && other.getFilterCriteria().equals(this.getFilterCriteria()) == false)
            return false;
        if (other.getSortCriteria() == null ^ this.getSortCriteria() == null)
            return false;
        if (other.getSortCriteria() != null && other.getSortCriteria().equals(this.getSortCriteria()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGraphArn() == null) ? 0 : getGraphArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilterCriteria() == null) ? 0 : getFilterCriteria().hashCode());
        hashCode = prime * hashCode + ((getSortCriteria() == null) ? 0 : getSortCriteria().hashCode());
        return hashCode;
    }

    @Override
    public ListInvestigationsRequest clone() {
        return (ListInvestigationsRequest) super.clone();
    }

}

/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForPosition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchPlaceIndexForPositionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of Places closest to the specified position. Each result contains additional information about the
     * Places returned.
     * </p>
     */
    private java.util.List<SearchForPositionResult> results;
    /**
     * <p>
     * Contains a summary of the request.
     * </p>
     */
    private SearchPlaceIndexForPositionSummary summary;

    /**
     * <p>
     * Returns a list of Places closest to the specified position. Each result contains additional information about the
     * Places returned.
     * </p>
     * 
     * @return Returns a list of Places closest to the specified position. Each result contains additional information
     *         about the Places returned.
     */

    public java.util.List<SearchForPositionResult> getResults() {
        return results;
    }

    /**
     * <p>
     * Returns a list of Places closest to the specified position. Each result contains additional information about the
     * Places returned.
     * </p>
     * 
     * @param results
     *        Returns a list of Places closest to the specified position. Each result contains additional information
     *        about the Places returned.
     */

    public void setResults(java.util.Collection<SearchForPositionResult> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<SearchForPositionResult>(results);
    }

    /**
     * <p>
     * Returns a list of Places closest to the specified position. Each result contains additional information about the
     * Places returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        Returns a list of Places closest to the specified position. Each result contains additional information
     *        about the Places returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForPositionResult withResults(SearchForPositionResult... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<SearchForPositionResult>(results.length));
        }
        for (SearchForPositionResult ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of Places closest to the specified position. Each result contains additional information about the
     * Places returned.
     * </p>
     * 
     * @param results
     *        Returns a list of Places closest to the specified position. Each result contains additional information
     *        about the Places returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForPositionResult withResults(java.util.Collection<SearchForPositionResult> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * Contains a summary of the request.
     * </p>
     * 
     * @param summary
     *        Contains a summary of the request.
     */

    public void setSummary(SearchPlaceIndexForPositionSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * Contains a summary of the request.
     * </p>
     * 
     * @return Contains a summary of the request.
     */

    public SearchPlaceIndexForPositionSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * Contains a summary of the request.
     * </p>
     * 
     * @param summary
     *        Contains a summary of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForPositionResult withSummary(SearchPlaceIndexForPositionSummary summary) {
        setSummary(summary);
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
        if (getResults() != null)
            sb.append("Results: ").append(getResults()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchPlaceIndexForPositionResult == false)
            return false;
        SearchPlaceIndexForPositionResult other = (SearchPlaceIndexForPositionResult) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        return hashCode;
    }

    @Override
    public SearchPlaceIndexForPositionResult clone() {
        try {
            return (SearchPlaceIndexForPositionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

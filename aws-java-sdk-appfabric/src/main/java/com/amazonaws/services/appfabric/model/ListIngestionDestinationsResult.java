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
package com.amazonaws.services.appfabric.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListIngestionDestinations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIngestionDestinationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains a list of ingestion destination summaries.
     * </p>
     */
    private java.util.List<IngestionDestinationSummary> ingestionDestinations;
    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken error</i>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains a list of ingestion destination summaries.
     * </p>
     * 
     * @return Contains a list of ingestion destination summaries.
     */

    public java.util.List<IngestionDestinationSummary> getIngestionDestinations() {
        return ingestionDestinations;
    }

    /**
     * <p>
     * Contains a list of ingestion destination summaries.
     * </p>
     * 
     * @param ingestionDestinations
     *        Contains a list of ingestion destination summaries.
     */

    public void setIngestionDestinations(java.util.Collection<IngestionDestinationSummary> ingestionDestinations) {
        if (ingestionDestinations == null) {
            this.ingestionDestinations = null;
            return;
        }

        this.ingestionDestinations = new java.util.ArrayList<IngestionDestinationSummary>(ingestionDestinations);
    }

    /**
     * <p>
     * Contains a list of ingestion destination summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIngestionDestinations(java.util.Collection)} or
     * {@link #withIngestionDestinations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param ingestionDestinations
     *        Contains a list of ingestion destination summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIngestionDestinationsResult withIngestionDestinations(IngestionDestinationSummary... ingestionDestinations) {
        if (this.ingestionDestinations == null) {
            setIngestionDestinations(new java.util.ArrayList<IngestionDestinationSummary>(ingestionDestinations.length));
        }
        for (IngestionDestinationSummary ele : ingestionDestinations) {
            this.ingestionDestinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of ingestion destination summaries.
     * </p>
     * 
     * @param ingestionDestinations
     *        Contains a list of ingestion destination summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIngestionDestinationsResult withIngestionDestinations(java.util.Collection<IngestionDestinationSummary> ingestionDestinations) {
        setIngestionDestinations(ingestionDestinations);
        return this;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken error</i>.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours. Using an expired pagination token will return an <i>HTTP 400 InvalidToken error</i>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken error</i>.
     * </p>
     * 
     * @return If <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *         24 hours. Using an expired pagination token will return an <i>HTTP 400 InvalidToken error</i>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken error</i>.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours. Using an expired pagination token will return an <i>HTTP 400 InvalidToken error</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIngestionDestinationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getIngestionDestinations() != null)
            sb.append("IngestionDestinations: ").append(getIngestionDestinations()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIngestionDestinationsResult == false)
            return false;
        ListIngestionDestinationsResult other = (ListIngestionDestinationsResult) obj;
        if (other.getIngestionDestinations() == null ^ this.getIngestionDestinations() == null)
            return false;
        if (other.getIngestionDestinations() != null && other.getIngestionDestinations().equals(this.getIngestionDestinations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIngestionDestinations() == null) ? 0 : getIngestionDestinations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIngestionDestinationsResult clone() {
        try {
            return (ListIngestionDestinationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

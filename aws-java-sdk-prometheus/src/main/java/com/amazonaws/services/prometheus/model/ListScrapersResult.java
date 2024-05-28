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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>ListScrapers</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListScrapers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListScrapersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token indicating that there are more results to retrieve. You can use this token as part of your next
     * <code>ListScrapers</code> operation to retrieve those results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of <code>ScraperSummary</code> structures giving information about scrapers in the account that match the
     * filters provided.
     * </p>
     */
    private java.util.List<ScraperSummary> scrapers;

    /**
     * <p>
     * A token indicating that there are more results to retrieve. You can use this token as part of your next
     * <code>ListScrapers</code> operation to retrieve those results.
     * </p>
     * 
     * @param nextToken
     *        A token indicating that there are more results to retrieve. You can use this token as part of your next
     *        <code>ListScrapers</code> operation to retrieve those results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token indicating that there are more results to retrieve. You can use this token as part of your next
     * <code>ListScrapers</code> operation to retrieve those results.
     * </p>
     * 
     * @return A token indicating that there are more results to retrieve. You can use this token as part of your next
     *         <code>ListScrapers</code> operation to retrieve those results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token indicating that there are more results to retrieve. You can use this token as part of your next
     * <code>ListScrapers</code> operation to retrieve those results.
     * </p>
     * 
     * @param nextToken
     *        A token indicating that there are more results to retrieve. You can use this token as part of your next
     *        <code>ListScrapers</code> operation to retrieve those results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScrapersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of <code>ScraperSummary</code> structures giving information about scrapers in the account that match the
     * filters provided.
     * </p>
     * 
     * @return A list of <code>ScraperSummary</code> structures giving information about scrapers in the account that
     *         match the filters provided.
     */

    public java.util.List<ScraperSummary> getScrapers() {
        return scrapers;
    }

    /**
     * <p>
     * A list of <code>ScraperSummary</code> structures giving information about scrapers in the account that match the
     * filters provided.
     * </p>
     * 
     * @param scrapers
     *        A list of <code>ScraperSummary</code> structures giving information about scrapers in the account that
     *        match the filters provided.
     */

    public void setScrapers(java.util.Collection<ScraperSummary> scrapers) {
        if (scrapers == null) {
            this.scrapers = null;
            return;
        }

        this.scrapers = new java.util.ArrayList<ScraperSummary>(scrapers);
    }

    /**
     * <p>
     * A list of <code>ScraperSummary</code> structures giving information about scrapers in the account that match the
     * filters provided.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScrapers(java.util.Collection)} or {@link #withScrapers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param scrapers
     *        A list of <code>ScraperSummary</code> structures giving information about scrapers in the account that
     *        match the filters provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScrapersResult withScrapers(ScraperSummary... scrapers) {
        if (this.scrapers == null) {
            setScrapers(new java.util.ArrayList<ScraperSummary>(scrapers.length));
        }
        for (ScraperSummary ele : scrapers) {
            this.scrapers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ScraperSummary</code> structures giving information about scrapers in the account that match the
     * filters provided.
     * </p>
     * 
     * @param scrapers
     *        A list of <code>ScraperSummary</code> structures giving information about scrapers in the account that
     *        match the filters provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScrapersResult withScrapers(java.util.Collection<ScraperSummary> scrapers) {
        setScrapers(scrapers);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getScrapers() != null)
            sb.append("Scrapers: ").append(getScrapers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListScrapersResult == false)
            return false;
        ListScrapersResult other = (ListScrapersResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getScrapers() == null ^ this.getScrapers() == null)
            return false;
        if (other.getScrapers() != null && other.getScrapers().equals(this.getScrapers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getScrapers() == null) ? 0 : getScrapers().hashCode());
        return hashCode;
    }

    @Override
    public ListScrapersResult clone() {
        try {
            return (ListScrapersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

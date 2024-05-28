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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents output for ListAnalyzableServers operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListAnalyzableServers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnalyzableServersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of analyzable servers with summary information about each server.
     * </p>
     */
    private java.util.List<AnalyzableServerSummary> analyzableServers;
    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of analyzable servers with summary information about each server.
     * </p>
     * 
     * @return The list of analyzable servers with summary information about each server.
     */

    public java.util.List<AnalyzableServerSummary> getAnalyzableServers() {
        return analyzableServers;
    }

    /**
     * <p>
     * The list of analyzable servers with summary information about each server.
     * </p>
     * 
     * @param analyzableServers
     *        The list of analyzable servers with summary information about each server.
     */

    public void setAnalyzableServers(java.util.Collection<AnalyzableServerSummary> analyzableServers) {
        if (analyzableServers == null) {
            this.analyzableServers = null;
            return;
        }

        this.analyzableServers = new java.util.ArrayList<AnalyzableServerSummary>(analyzableServers);
    }

    /**
     * <p>
     * The list of analyzable servers with summary information about each server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalyzableServers(java.util.Collection)} or {@link #withAnalyzableServers(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param analyzableServers
     *        The list of analyzable servers with summary information about each server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnalyzableServersResult withAnalyzableServers(AnalyzableServerSummary... analyzableServers) {
        if (this.analyzableServers == null) {
            setAnalyzableServers(new java.util.ArrayList<AnalyzableServerSummary>(analyzableServers.length));
        }
        for (AnalyzableServerSummary ele : analyzableServers) {
            this.analyzableServers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of analyzable servers with summary information about each server.
     * </p>
     * 
     * @param analyzableServers
     *        The list of analyzable servers with summary information about each server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnalyzableServersResult withAnalyzableServers(java.util.Collection<AnalyzableServerSummary> analyzableServers) {
        setAnalyzableServers(analyzableServers);
        return this;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token you use to retrieve the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token you use to retrieve the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token you use to retrieve the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnalyzableServersResult withNextToken(String nextToken) {
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
        if (getAnalyzableServers() != null)
            sb.append("AnalyzableServers: ").append(getAnalyzableServers()).append(",");
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

        if (obj instanceof ListAnalyzableServersResult == false)
            return false;
        ListAnalyzableServersResult other = (ListAnalyzableServersResult) obj;
        if (other.getAnalyzableServers() == null ^ this.getAnalyzableServers() == null)
            return false;
        if (other.getAnalyzableServers() != null && other.getAnalyzableServers().equals(this.getAnalyzableServers()) == false)
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

        hashCode = prime * hashCode + ((getAnalyzableServers() == null) ? 0 : getAnalyzableServers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAnalyzableServersResult clone() {
        try {
            return (ListAnalyzableServersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

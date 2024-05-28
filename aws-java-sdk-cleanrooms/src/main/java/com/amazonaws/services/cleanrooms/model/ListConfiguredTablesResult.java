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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListConfiguredTables" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfiguredTablesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The configured tables listed by the request.
     * </p>
     */
    private java.util.List<ConfiguredTableSummary> configuredTableSummaries;
    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The configured tables listed by the request.
     * </p>
     * 
     * @return The configured tables listed by the request.
     */

    public java.util.List<ConfiguredTableSummary> getConfiguredTableSummaries() {
        return configuredTableSummaries;
    }

    /**
     * <p>
     * The configured tables listed by the request.
     * </p>
     * 
     * @param configuredTableSummaries
     *        The configured tables listed by the request.
     */

    public void setConfiguredTableSummaries(java.util.Collection<ConfiguredTableSummary> configuredTableSummaries) {
        if (configuredTableSummaries == null) {
            this.configuredTableSummaries = null;
            return;
        }

        this.configuredTableSummaries = new java.util.ArrayList<ConfiguredTableSummary>(configuredTableSummaries);
    }

    /**
     * <p>
     * The configured tables listed by the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfiguredTableSummaries(java.util.Collection)} or
     * {@link #withConfiguredTableSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configuredTableSummaries
     *        The configured tables listed by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfiguredTablesResult withConfiguredTableSummaries(ConfiguredTableSummary... configuredTableSummaries) {
        if (this.configuredTableSummaries == null) {
            setConfiguredTableSummaries(new java.util.ArrayList<ConfiguredTableSummary>(configuredTableSummaries.length));
        }
        for (ConfiguredTableSummary ele : configuredTableSummaries) {
            this.configuredTableSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configured tables listed by the request.
     * </p>
     * 
     * @param configuredTableSummaries
     *        The configured tables listed by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfiguredTablesResult withConfiguredTableSummaries(java.util.Collection<ConfiguredTableSummary> configuredTableSummaries) {
        setConfiguredTableSummaries(configuredTableSummaries);
        return this;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @return The token value retrieved from a previous call to access the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfiguredTablesResult withNextToken(String nextToken) {
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
        if (getConfiguredTableSummaries() != null)
            sb.append("ConfiguredTableSummaries: ").append(getConfiguredTableSummaries()).append(",");
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

        if (obj instanceof ListConfiguredTablesResult == false)
            return false;
        ListConfiguredTablesResult other = (ListConfiguredTablesResult) obj;
        if (other.getConfiguredTableSummaries() == null ^ this.getConfiguredTableSummaries() == null)
            return false;
        if (other.getConfiguredTableSummaries() != null && other.getConfiguredTableSummaries().equals(this.getConfiguredTableSummaries()) == false)
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

        hashCode = prime * hashCode + ((getConfiguredTableSummaries() == null) ? 0 : getConfiguredTableSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListConfiguredTablesResult clone() {
        try {
            return (ListConfiguredTablesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

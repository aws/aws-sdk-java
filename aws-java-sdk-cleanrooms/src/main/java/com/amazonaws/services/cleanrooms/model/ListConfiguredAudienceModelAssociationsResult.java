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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListConfiguredAudienceModelAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfiguredAudienceModelAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Summaries of the configured audience model associations that you requested.
     * </p>
     */
    private java.util.List<ConfiguredAudienceModelAssociationSummary> configuredAudienceModelAssociationSummaries;
    /**
     * <p>
     * The token value provided to access the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summaries of the configured audience model associations that you requested.
     * </p>
     * 
     * @return Summaries of the configured audience model associations that you requested.
     */

    public java.util.List<ConfiguredAudienceModelAssociationSummary> getConfiguredAudienceModelAssociationSummaries() {
        return configuredAudienceModelAssociationSummaries;
    }

    /**
     * <p>
     * Summaries of the configured audience model associations that you requested.
     * </p>
     * 
     * @param configuredAudienceModelAssociationSummaries
     *        Summaries of the configured audience model associations that you requested.
     */

    public void setConfiguredAudienceModelAssociationSummaries(
            java.util.Collection<ConfiguredAudienceModelAssociationSummary> configuredAudienceModelAssociationSummaries) {
        if (configuredAudienceModelAssociationSummaries == null) {
            this.configuredAudienceModelAssociationSummaries = null;
            return;
        }

        this.configuredAudienceModelAssociationSummaries = new java.util.ArrayList<ConfiguredAudienceModelAssociationSummary>(
                configuredAudienceModelAssociationSummaries);
    }

    /**
     * <p>
     * Summaries of the configured audience model associations that you requested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfiguredAudienceModelAssociationSummaries(java.util.Collection)} or
     * {@link #withConfiguredAudienceModelAssociationSummaries(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param configuredAudienceModelAssociationSummaries
     *        Summaries of the configured audience model associations that you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfiguredAudienceModelAssociationsResult withConfiguredAudienceModelAssociationSummaries(
            ConfiguredAudienceModelAssociationSummary... configuredAudienceModelAssociationSummaries) {
        if (this.configuredAudienceModelAssociationSummaries == null) {
            setConfiguredAudienceModelAssociationSummaries(new java.util.ArrayList<ConfiguredAudienceModelAssociationSummary>(
                    configuredAudienceModelAssociationSummaries.length));
        }
        for (ConfiguredAudienceModelAssociationSummary ele : configuredAudienceModelAssociationSummaries) {
            this.configuredAudienceModelAssociationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summaries of the configured audience model associations that you requested.
     * </p>
     * 
     * @param configuredAudienceModelAssociationSummaries
     *        Summaries of the configured audience model associations that you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfiguredAudienceModelAssociationsResult withConfiguredAudienceModelAssociationSummaries(
            java.util.Collection<ConfiguredAudienceModelAssociationSummary> configuredAudienceModelAssociationSummaries) {
        setConfiguredAudienceModelAssociationSummaries(configuredAudienceModelAssociationSummaries);
        return this;
    }

    /**
     * <p>
     * The token value provided to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value provided to access the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value provided to access the next page of results.
     * </p>
     * 
     * @return The token value provided to access the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token value provided to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value provided to access the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfiguredAudienceModelAssociationsResult withNextToken(String nextToken) {
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
        if (getConfiguredAudienceModelAssociationSummaries() != null)
            sb.append("ConfiguredAudienceModelAssociationSummaries: ").append(getConfiguredAudienceModelAssociationSummaries()).append(",");
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

        if (obj instanceof ListConfiguredAudienceModelAssociationsResult == false)
            return false;
        ListConfiguredAudienceModelAssociationsResult other = (ListConfiguredAudienceModelAssociationsResult) obj;
        if (other.getConfiguredAudienceModelAssociationSummaries() == null ^ this.getConfiguredAudienceModelAssociationSummaries() == null)
            return false;
        if (other.getConfiguredAudienceModelAssociationSummaries() != null
                && other.getConfiguredAudienceModelAssociationSummaries().equals(this.getConfiguredAudienceModelAssociationSummaries()) == false)
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

        hashCode = prime * hashCode
                + ((getConfiguredAudienceModelAssociationSummaries() == null) ? 0 : getConfiguredAudienceModelAssociationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListConfiguredAudienceModelAssociationsResult clone() {
        try {
            return (ListConfiguredAudienceModelAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListConfigurationPolicyAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfigurationPolicyAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An object that contains the details of each configuration policy association that’s returned in a
     * <code>ListConfigurationPolicyAssociations</code> request.
     * </p>
     */
    private java.util.List<ConfigurationPolicyAssociationSummary> configurationPolicyAssociationSummaries;
    /**
     * <p>
     * The <code>NextToken</code> value to include in the next <code>ListConfigurationPolicyAssociations</code> request.
     * When the results of a <code>ListConfigurationPolicyAssociations</code> request exceed <code>MaxResults</code>,
     * this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     * more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An object that contains the details of each configuration policy association that’s returned in a
     * <code>ListConfigurationPolicyAssociations</code> request.
     * </p>
     * 
     * @return An object that contains the details of each configuration policy association that’s returned in a
     *         <code>ListConfigurationPolicyAssociations</code> request.
     */

    public java.util.List<ConfigurationPolicyAssociationSummary> getConfigurationPolicyAssociationSummaries() {
        return configurationPolicyAssociationSummaries;
    }

    /**
     * <p>
     * An object that contains the details of each configuration policy association that’s returned in a
     * <code>ListConfigurationPolicyAssociations</code> request.
     * </p>
     * 
     * @param configurationPolicyAssociationSummaries
     *        An object that contains the details of each configuration policy association that’s returned in a
     *        <code>ListConfigurationPolicyAssociations</code> request.
     */

    public void setConfigurationPolicyAssociationSummaries(java.util.Collection<ConfigurationPolicyAssociationSummary> configurationPolicyAssociationSummaries) {
        if (configurationPolicyAssociationSummaries == null) {
            this.configurationPolicyAssociationSummaries = null;
            return;
        }

        this.configurationPolicyAssociationSummaries = new java.util.ArrayList<ConfigurationPolicyAssociationSummary>(configurationPolicyAssociationSummaries);
    }

    /**
     * <p>
     * An object that contains the details of each configuration policy association that’s returned in a
     * <code>ListConfigurationPolicyAssociations</code> request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationPolicyAssociationSummaries(java.util.Collection)} or
     * {@link #withConfigurationPolicyAssociationSummaries(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param configurationPolicyAssociationSummaries
     *        An object that contains the details of each configuration policy association that’s returned in a
     *        <code>ListConfigurationPolicyAssociations</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationPolicyAssociationsResult withConfigurationPolicyAssociationSummaries(
            ConfigurationPolicyAssociationSummary... configurationPolicyAssociationSummaries) {
        if (this.configurationPolicyAssociationSummaries == null) {
            setConfigurationPolicyAssociationSummaries(new java.util.ArrayList<ConfigurationPolicyAssociationSummary>(
                    configurationPolicyAssociationSummaries.length));
        }
        for (ConfigurationPolicyAssociationSummary ele : configurationPolicyAssociationSummaries) {
            this.configurationPolicyAssociationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that contains the details of each configuration policy association that’s returned in a
     * <code>ListConfigurationPolicyAssociations</code> request.
     * </p>
     * 
     * @param configurationPolicyAssociationSummaries
     *        An object that contains the details of each configuration policy association that’s returned in a
     *        <code>ListConfigurationPolicyAssociations</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationPolicyAssociationsResult withConfigurationPolicyAssociationSummaries(
            java.util.Collection<ConfigurationPolicyAssociationSummary> configurationPolicyAssociationSummaries) {
        setConfigurationPolicyAssociationSummaries(configurationPolicyAssociationSummaries);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in the next <code>ListConfigurationPolicyAssociations</code> request.
     * When the results of a <code>ListConfigurationPolicyAssociations</code> request exceed <code>MaxResults</code>,
     * this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     * more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value to include in the next <code>ListConfigurationPolicyAssociations</code>
     *        request. When the results of a <code>ListConfigurationPolicyAssociations</code> request exceed
     *        <code>MaxResults</code>, this value can be used to retrieve the next page of results. This value is
     *        <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in the next <code>ListConfigurationPolicyAssociations</code> request.
     * When the results of a <code>ListConfigurationPolicyAssociations</code> request exceed <code>MaxResults</code>,
     * this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     * more results to return.
     * </p>
     * 
     * @return The <code>NextToken</code> value to include in the next <code>ListConfigurationPolicyAssociations</code>
     *         request. When the results of a <code>ListConfigurationPolicyAssociations</code> request exceed
     *         <code>MaxResults</code>, this value can be used to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in the next <code>ListConfigurationPolicyAssociations</code> request.
     * When the results of a <code>ListConfigurationPolicyAssociations</code> request exceed <code>MaxResults</code>,
     * this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     * more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value to include in the next <code>ListConfigurationPolicyAssociations</code>
     *        request. When the results of a <code>ListConfigurationPolicyAssociations</code> request exceed
     *        <code>MaxResults</code>, this value can be used to retrieve the next page of results. This value is
     *        <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationPolicyAssociationsResult withNextToken(String nextToken) {
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
        if (getConfigurationPolicyAssociationSummaries() != null)
            sb.append("ConfigurationPolicyAssociationSummaries: ").append(getConfigurationPolicyAssociationSummaries()).append(",");
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

        if (obj instanceof ListConfigurationPolicyAssociationsResult == false)
            return false;
        ListConfigurationPolicyAssociationsResult other = (ListConfigurationPolicyAssociationsResult) obj;
        if (other.getConfigurationPolicyAssociationSummaries() == null ^ this.getConfigurationPolicyAssociationSummaries() == null)
            return false;
        if (other.getConfigurationPolicyAssociationSummaries() != null
                && other.getConfigurationPolicyAssociationSummaries().equals(this.getConfigurationPolicyAssociationSummaries()) == false)
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

        hashCode = prime * hashCode + ((getConfigurationPolicyAssociationSummaries() == null) ? 0 : getConfigurationPolicyAssociationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListConfigurationPolicyAssociationsResult clone() {
        try {
            return (ListConfigurationPolicyAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

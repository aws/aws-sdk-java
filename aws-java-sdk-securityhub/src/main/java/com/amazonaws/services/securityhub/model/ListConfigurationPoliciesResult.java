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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListConfigurationPolicies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfigurationPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides metadata for each of your configuration policies.
     * </p>
     */
    private java.util.List<ConfigurationPolicySummary> configurationPolicySummaries;
    /**
     * <p>
     * The <code>NextToken</code> value to include in the next <code>ListConfigurationPolicies</code> request. When the
     * results of a <code>ListConfigurationPolicies</code> request exceed <code>MaxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Provides metadata for each of your configuration policies.
     * </p>
     * 
     * @return Provides metadata for each of your configuration policies.
     */

    public java.util.List<ConfigurationPolicySummary> getConfigurationPolicySummaries() {
        return configurationPolicySummaries;
    }

    /**
     * <p>
     * Provides metadata for each of your configuration policies.
     * </p>
     * 
     * @param configurationPolicySummaries
     *        Provides metadata for each of your configuration policies.
     */

    public void setConfigurationPolicySummaries(java.util.Collection<ConfigurationPolicySummary> configurationPolicySummaries) {
        if (configurationPolicySummaries == null) {
            this.configurationPolicySummaries = null;
            return;
        }

        this.configurationPolicySummaries = new java.util.ArrayList<ConfigurationPolicySummary>(configurationPolicySummaries);
    }

    /**
     * <p>
     * Provides metadata for each of your configuration policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationPolicySummaries(java.util.Collection)} or
     * {@link #withConfigurationPolicySummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configurationPolicySummaries
     *        Provides metadata for each of your configuration policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationPoliciesResult withConfigurationPolicySummaries(ConfigurationPolicySummary... configurationPolicySummaries) {
        if (this.configurationPolicySummaries == null) {
            setConfigurationPolicySummaries(new java.util.ArrayList<ConfigurationPolicySummary>(configurationPolicySummaries.length));
        }
        for (ConfigurationPolicySummary ele : configurationPolicySummaries) {
            this.configurationPolicySummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides metadata for each of your configuration policies.
     * </p>
     * 
     * @param configurationPolicySummaries
     *        Provides metadata for each of your configuration policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationPoliciesResult withConfigurationPolicySummaries(java.util.Collection<ConfigurationPolicySummary> configurationPolicySummaries) {
        setConfigurationPolicySummaries(configurationPolicySummaries);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in the next <code>ListConfigurationPolicies</code> request. When the
     * results of a <code>ListConfigurationPolicies</code> request exceed <code>MaxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value to include in the next <code>ListConfigurationPolicies</code> request.
     *        When the results of a <code>ListConfigurationPolicies</code> request exceed <code>MaxResults</code>, this
     *        value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in the next <code>ListConfigurationPolicies</code> request. When the
     * results of a <code>ListConfigurationPolicies</code> request exceed <code>MaxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @return The <code>NextToken</code> value to include in the next <code>ListConfigurationPolicies</code> request.
     *         When the results of a <code>ListConfigurationPolicies</code> request exceed <code>MaxResults</code>, this
     *         value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in the next <code>ListConfigurationPolicies</code> request. When the
     * results of a <code>ListConfigurationPolicies</code> request exceed <code>MaxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value to include in the next <code>ListConfigurationPolicies</code> request.
     *        When the results of a <code>ListConfigurationPolicies</code> request exceed <code>MaxResults</code>, this
     *        value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationPoliciesResult withNextToken(String nextToken) {
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
        if (getConfigurationPolicySummaries() != null)
            sb.append("ConfigurationPolicySummaries: ").append(getConfigurationPolicySummaries()).append(",");
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

        if (obj instanceof ListConfigurationPoliciesResult == false)
            return false;
        ListConfigurationPoliciesResult other = (ListConfigurationPoliciesResult) obj;
        if (other.getConfigurationPolicySummaries() == null ^ this.getConfigurationPolicySummaries() == null)
            return false;
        if (other.getConfigurationPolicySummaries() != null && other.getConfigurationPolicySummaries().equals(this.getConfigurationPolicySummaries()) == false)
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

        hashCode = prime * hashCode + ((getConfigurationPolicySummaries() == null) ? 0 : getConfigurationPolicySummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListConfigurationPoliciesResult clone() {
        try {
            return (ListConfigurationPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

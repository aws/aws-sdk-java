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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListExperimentTargetAccountConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExperimentTargetAccountConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The target account configurations.
     * </p>
     */
    private java.util.List<ExperimentTargetAccountConfigurationSummary> targetAccountConfigurations;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The target account configurations.
     * </p>
     * 
     * @return The target account configurations.
     */

    public java.util.List<ExperimentTargetAccountConfigurationSummary> getTargetAccountConfigurations() {
        return targetAccountConfigurations;
    }

    /**
     * <p>
     * The target account configurations.
     * </p>
     * 
     * @param targetAccountConfigurations
     *        The target account configurations.
     */

    public void setTargetAccountConfigurations(java.util.Collection<ExperimentTargetAccountConfigurationSummary> targetAccountConfigurations) {
        if (targetAccountConfigurations == null) {
            this.targetAccountConfigurations = null;
            return;
        }

        this.targetAccountConfigurations = new java.util.ArrayList<ExperimentTargetAccountConfigurationSummary>(targetAccountConfigurations);
    }

    /**
     * <p>
     * The target account configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetAccountConfigurations(java.util.Collection)} or
     * {@link #withTargetAccountConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetAccountConfigurations
     *        The target account configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperimentTargetAccountConfigurationsResult withTargetAccountConfigurations(
            ExperimentTargetAccountConfigurationSummary... targetAccountConfigurations) {
        if (this.targetAccountConfigurations == null) {
            setTargetAccountConfigurations(new java.util.ArrayList<ExperimentTargetAccountConfigurationSummary>(targetAccountConfigurations.length));
        }
        for (ExperimentTargetAccountConfigurationSummary ele : targetAccountConfigurations) {
            this.targetAccountConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The target account configurations.
     * </p>
     * 
     * @param targetAccountConfigurations
     *        The target account configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperimentTargetAccountConfigurationsResult withTargetAccountConfigurations(
            java.util.Collection<ExperimentTargetAccountConfigurationSummary> targetAccountConfigurations) {
        setTargetAccountConfigurations(targetAccountConfigurations);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is null when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperimentTargetAccountConfigurationsResult withNextToken(String nextToken) {
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
        if (getTargetAccountConfigurations() != null)
            sb.append("TargetAccountConfigurations: ").append(getTargetAccountConfigurations()).append(",");
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

        if (obj instanceof ListExperimentTargetAccountConfigurationsResult == false)
            return false;
        ListExperimentTargetAccountConfigurationsResult other = (ListExperimentTargetAccountConfigurationsResult) obj;
        if (other.getTargetAccountConfigurations() == null ^ this.getTargetAccountConfigurations() == null)
            return false;
        if (other.getTargetAccountConfigurations() != null && other.getTargetAccountConfigurations().equals(this.getTargetAccountConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getTargetAccountConfigurations() == null) ? 0 : getTargetAccountConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExperimentTargetAccountConfigurationsResult clone() {
        try {
            return (ListExperimentTargetAccountConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

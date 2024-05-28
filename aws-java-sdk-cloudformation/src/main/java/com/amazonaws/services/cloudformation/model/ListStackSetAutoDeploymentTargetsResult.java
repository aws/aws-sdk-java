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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackSetAutoDeploymentTargets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStackSetAutoDeploymentTargetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array of summaries of the deployment targets for the stack set.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StackSetAutoDeploymentTargetSummary> summaries;
    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStackSetAutoDeploymentTargets.html"
     * >ListStackSetAutoDeploymentTargets</a> again and use that value for the <code>NextToken</code> parameter. If the
     * request returns all results, <code>NextToken</code> is set to an empty string.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of summaries of the deployment targets for the stack set.
     * </p>
     * 
     * @return An array of summaries of the deployment targets for the stack set.
     */

    public java.util.List<StackSetAutoDeploymentTargetSummary> getSummaries() {
        if (summaries == null) {
            summaries = new com.amazonaws.internal.SdkInternalList<StackSetAutoDeploymentTargetSummary>();
        }
        return summaries;
    }

    /**
     * <p>
     * An array of summaries of the deployment targets for the stack set.
     * </p>
     * 
     * @param summaries
     *        An array of summaries of the deployment targets for the stack set.
     */

    public void setSummaries(java.util.Collection<StackSetAutoDeploymentTargetSummary> summaries) {
        if (summaries == null) {
            this.summaries = null;
            return;
        }

        this.summaries = new com.amazonaws.internal.SdkInternalList<StackSetAutoDeploymentTargetSummary>(summaries);
    }

    /**
     * <p>
     * An array of summaries of the deployment targets for the stack set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaries(java.util.Collection)} or {@link #withSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param summaries
     *        An array of summaries of the deployment targets for the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackSetAutoDeploymentTargetsResult withSummaries(StackSetAutoDeploymentTargetSummary... summaries) {
        if (this.summaries == null) {
            setSummaries(new com.amazonaws.internal.SdkInternalList<StackSetAutoDeploymentTargetSummary>(summaries.length));
        }
        for (StackSetAutoDeploymentTargetSummary ele : summaries) {
            this.summaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of summaries of the deployment targets for the stack set.
     * </p>
     * 
     * @param summaries
     *        An array of summaries of the deployment targets for the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackSetAutoDeploymentTargetsResult withSummaries(java.util.Collection<StackSetAutoDeploymentTargetSummary> summaries) {
        setSummaries(summaries);
        return this;
    }

    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStackSetAutoDeploymentTargets.html"
     * >ListStackSetAutoDeploymentTargets</a> again and use that value for the <code>NextToken</code> parameter. If the
     * request returns all results, <code>NextToken</code> is set to an empty string.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStackSetAutoDeploymentTargets.html"
     *        >ListStackSetAutoDeploymentTargets</a> again and use that value for the <code>NextToken</code> parameter.
     *        If the request returns all results, <code>NextToken</code> is set to an empty string.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStackSetAutoDeploymentTargets.html"
     * >ListStackSetAutoDeploymentTargets</a> again and use that value for the <code>NextToken</code> parameter. If the
     * request returns all results, <code>NextToken</code> is set to an empty string.
     * </p>
     * 
     * @return If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To
     *         retrieve the next set of results, call <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStackSetAutoDeploymentTargets.html"
     *         >ListStackSetAutoDeploymentTargets</a> again and use that value for the <code>NextToken</code> parameter.
     *         If the request returns all results, <code>NextToken</code> is set to an empty string.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStackSetAutoDeploymentTargets.html"
     * >ListStackSetAutoDeploymentTargets</a> again and use that value for the <code>NextToken</code> parameter. If the
     * request returns all results, <code>NextToken</code> is set to an empty string.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStackSetAutoDeploymentTargets.html"
     *        >ListStackSetAutoDeploymentTargets</a> again and use that value for the <code>NextToken</code> parameter.
     *        If the request returns all results, <code>NextToken</code> is set to an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackSetAutoDeploymentTargetsResult withNextToken(String nextToken) {
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
        if (getSummaries() != null)
            sb.append("Summaries: ").append(getSummaries()).append(",");
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

        if (obj instanceof ListStackSetAutoDeploymentTargetsResult == false)
            return false;
        ListStackSetAutoDeploymentTargetsResult other = (ListStackSetAutoDeploymentTargetsResult) obj;
        if (other.getSummaries() == null ^ this.getSummaries() == null)
            return false;
        if (other.getSummaries() != null && other.getSummaries().equals(this.getSummaries()) == false)
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

        hashCode = prime * hashCode + ((getSummaries() == null) ? 0 : getSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStackSetAutoDeploymentTargetsResult clone() {
        try {
            return (ListStackSetAutoDeploymentTargetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

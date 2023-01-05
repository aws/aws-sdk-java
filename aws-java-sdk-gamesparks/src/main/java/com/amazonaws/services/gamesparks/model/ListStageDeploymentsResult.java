/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListStageDeployments" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStageDeploymentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use this value when making the next call to this operation to continue where the last one finished.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of stage deployment summaries. You can use the deployment IDs in the <code>UpdateStageDeployment</code>
     * and <code>GetStageDeployment</code> actions.
     * </p>
     */
    private java.util.List<StageDeploymentSummary> stageDeployments;

    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use this value when making the next call to this operation to continue where the last one finished.
     * </p>
     * 
     * @param nextToken
     *        The token that indicates the start of the next sequential page of results.</p>
     *        <p>
     *        Use this value when making the next call to this operation to continue where the last one finished.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use this value when making the next call to this operation to continue where the last one finished.
     * </p>
     * 
     * @return The token that indicates the start of the next sequential page of results.</p>
     *         <p>
     *         Use this value when making the next call to this operation to continue where the last one finished.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use this value when making the next call to this operation to continue where the last one finished.
     * </p>
     * 
     * @param nextToken
     *        The token that indicates the start of the next sequential page of results.</p>
     *        <p>
     *        Use this value when making the next call to this operation to continue where the last one finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStageDeploymentsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of stage deployment summaries. You can use the deployment IDs in the <code>UpdateStageDeployment</code>
     * and <code>GetStageDeployment</code> actions.
     * </p>
     * 
     * @return A list of stage deployment summaries. You can use the deployment IDs in the
     *         <code>UpdateStageDeployment</code> and <code>GetStageDeployment</code> actions.
     */

    public java.util.List<StageDeploymentSummary> getStageDeployments() {
        return stageDeployments;
    }

    /**
     * <p>
     * A list of stage deployment summaries. You can use the deployment IDs in the <code>UpdateStageDeployment</code>
     * and <code>GetStageDeployment</code> actions.
     * </p>
     * 
     * @param stageDeployments
     *        A list of stage deployment summaries. You can use the deployment IDs in the
     *        <code>UpdateStageDeployment</code> and <code>GetStageDeployment</code> actions.
     */

    public void setStageDeployments(java.util.Collection<StageDeploymentSummary> stageDeployments) {
        if (stageDeployments == null) {
            this.stageDeployments = null;
            return;
        }

        this.stageDeployments = new java.util.ArrayList<StageDeploymentSummary>(stageDeployments);
    }

    /**
     * <p>
     * A list of stage deployment summaries. You can use the deployment IDs in the <code>UpdateStageDeployment</code>
     * and <code>GetStageDeployment</code> actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStageDeployments(java.util.Collection)} or {@link #withStageDeployments(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param stageDeployments
     *        A list of stage deployment summaries. You can use the deployment IDs in the
     *        <code>UpdateStageDeployment</code> and <code>GetStageDeployment</code> actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStageDeploymentsResult withStageDeployments(StageDeploymentSummary... stageDeployments) {
        if (this.stageDeployments == null) {
            setStageDeployments(new java.util.ArrayList<StageDeploymentSummary>(stageDeployments.length));
        }
        for (StageDeploymentSummary ele : stageDeployments) {
            this.stageDeployments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of stage deployment summaries. You can use the deployment IDs in the <code>UpdateStageDeployment</code>
     * and <code>GetStageDeployment</code> actions.
     * </p>
     * 
     * @param stageDeployments
     *        A list of stage deployment summaries. You can use the deployment IDs in the
     *        <code>UpdateStageDeployment</code> and <code>GetStageDeployment</code> actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStageDeploymentsResult withStageDeployments(java.util.Collection<StageDeploymentSummary> stageDeployments) {
        setStageDeployments(stageDeployments);
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
        if (getStageDeployments() != null)
            sb.append("StageDeployments: ").append(getStageDeployments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStageDeploymentsResult == false)
            return false;
        ListStageDeploymentsResult other = (ListStageDeploymentsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStageDeployments() == null ^ this.getStageDeployments() == null)
            return false;
        if (other.getStageDeployments() != null && other.getStageDeployments().equals(this.getStageDeployments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStageDeployments() == null) ? 0 : getStageDeployments().hashCode());
        return hashCode;
    }

    @Override
    public ListStageDeploymentsResult clone() {
        try {
            return (ListStageDeploymentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

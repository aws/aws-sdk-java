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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEdgeDeploymentPlans" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEdgeDeploymentPlansResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of summaries of edge deployment plans.
     * </p>
     */
    private java.util.List<EdgeDeploymentPlanSummary> edgeDeploymentPlanSummaries;
    /**
     * <p>
     * The token to use when calling the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of summaries of edge deployment plans.
     * </p>
     * 
     * @return List of summaries of edge deployment plans.
     */

    public java.util.List<EdgeDeploymentPlanSummary> getEdgeDeploymentPlanSummaries() {
        return edgeDeploymentPlanSummaries;
    }

    /**
     * <p>
     * List of summaries of edge deployment plans.
     * </p>
     * 
     * @param edgeDeploymentPlanSummaries
     *        List of summaries of edge deployment plans.
     */

    public void setEdgeDeploymentPlanSummaries(java.util.Collection<EdgeDeploymentPlanSummary> edgeDeploymentPlanSummaries) {
        if (edgeDeploymentPlanSummaries == null) {
            this.edgeDeploymentPlanSummaries = null;
            return;
        }

        this.edgeDeploymentPlanSummaries = new java.util.ArrayList<EdgeDeploymentPlanSummary>(edgeDeploymentPlanSummaries);
    }

    /**
     * <p>
     * List of summaries of edge deployment plans.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEdgeDeploymentPlanSummaries(java.util.Collection)} or
     * {@link #withEdgeDeploymentPlanSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param edgeDeploymentPlanSummaries
     *        List of summaries of edge deployment plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeDeploymentPlansResult withEdgeDeploymentPlanSummaries(EdgeDeploymentPlanSummary... edgeDeploymentPlanSummaries) {
        if (this.edgeDeploymentPlanSummaries == null) {
            setEdgeDeploymentPlanSummaries(new java.util.ArrayList<EdgeDeploymentPlanSummary>(edgeDeploymentPlanSummaries.length));
        }
        for (EdgeDeploymentPlanSummary ele : edgeDeploymentPlanSummaries) {
            this.edgeDeploymentPlanSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of summaries of edge deployment plans.
     * </p>
     * 
     * @param edgeDeploymentPlanSummaries
     *        List of summaries of edge deployment plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeDeploymentPlansResult withEdgeDeploymentPlanSummaries(java.util.Collection<EdgeDeploymentPlanSummary> edgeDeploymentPlanSummaries) {
        setEdgeDeploymentPlanSummaries(edgeDeploymentPlanSummaries);
        return this;
    }

    /**
     * <p>
     * The token to use when calling the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use when calling the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when calling the next page of results.
     * </p>
     * 
     * @return The token to use when calling the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when calling the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use when calling the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeDeploymentPlansResult withNextToken(String nextToken) {
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
        if (getEdgeDeploymentPlanSummaries() != null)
            sb.append("EdgeDeploymentPlanSummaries: ").append(getEdgeDeploymentPlanSummaries()).append(",");
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

        if (obj instanceof ListEdgeDeploymentPlansResult == false)
            return false;
        ListEdgeDeploymentPlansResult other = (ListEdgeDeploymentPlansResult) obj;
        if (other.getEdgeDeploymentPlanSummaries() == null ^ this.getEdgeDeploymentPlanSummaries() == null)
            return false;
        if (other.getEdgeDeploymentPlanSummaries() != null && other.getEdgeDeploymentPlanSummaries().equals(this.getEdgeDeploymentPlanSummaries()) == false)
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

        hashCode = prime * hashCode + ((getEdgeDeploymentPlanSummaries() == null) ? 0 : getEdgeDeploymentPlanSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEdgeDeploymentPlansResult clone() {
        try {
            return (ListEdgeDeploymentPlansResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

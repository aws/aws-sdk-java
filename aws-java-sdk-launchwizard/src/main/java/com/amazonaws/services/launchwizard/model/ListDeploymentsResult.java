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
package com.amazonaws.services.launchwizard.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListDeployments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeploymentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the deployments.
     * </p>
     */
    private java.util.List<DeploymentDataSummary> deployments;
    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the deployments.
     * </p>
     * 
     * @return Lists the deployments.
     */

    public java.util.List<DeploymentDataSummary> getDeployments() {
        return deployments;
    }

    /**
     * <p>
     * Lists the deployments.
     * </p>
     * 
     * @param deployments
     *        Lists the deployments.
     */

    public void setDeployments(java.util.Collection<DeploymentDataSummary> deployments) {
        if (deployments == null) {
            this.deployments = null;
            return;
        }

        this.deployments = new java.util.ArrayList<DeploymentDataSummary>(deployments);
    }

    /**
     * <p>
     * Lists the deployments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeployments(java.util.Collection)} or {@link #withDeployments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deployments
     *        Lists the deployments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsResult withDeployments(DeploymentDataSummary... deployments) {
        if (this.deployments == null) {
            setDeployments(new java.util.ArrayList<DeploymentDataSummary>(deployments.length));
        }
        for (DeploymentDataSummary ele : deployments) {
            this.deployments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the deployments.
     * </p>
     * 
     * @param deployments
     *        Lists the deployments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsResult withDeployments(java.util.Collection<DeploymentDataSummary> deployments) {
        setDeployments(deployments);
        return this;
    }

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        The token to include in another request to get the next page of items. This value is <code>null</code>
     *        when there are no more items to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     * 
     * @return The token to include in another request to get the next page of items. This value is <code>null</code>
     *         when there are no more items to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        The token to include in another request to get the next page of items. This value is <code>null</code>
     *        when there are no more items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsResult withNextToken(String nextToken) {
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
        if (getDeployments() != null)
            sb.append("Deployments: ").append(getDeployments()).append(",");
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

        if (obj instanceof ListDeploymentsResult == false)
            return false;
        ListDeploymentsResult other = (ListDeploymentsResult) obj;
        if (other.getDeployments() == null ^ this.getDeployments() == null)
            return false;
        if (other.getDeployments() != null && other.getDeployments().equals(this.getDeployments()) == false)
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

        hashCode = prime * hashCode + ((getDeployments() == null) ? 0 : getDeployments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDeploymentsResult clone() {
        try {
            return (ListDeploymentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

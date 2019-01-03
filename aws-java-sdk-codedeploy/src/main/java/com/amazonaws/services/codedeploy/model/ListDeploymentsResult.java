/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a ListDeployments operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeployments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeploymentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of deployment IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> deployments;
    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * deployments call to return the next set of deployments in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of deployment IDs.
     * </p>
     * 
     * @return A list of deployment IDs.
     */

    public java.util.List<String> getDeployments() {
        if (deployments == null) {
            deployments = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return deployments;
    }

    /**
     * <p>
     * A list of deployment IDs.
     * </p>
     * 
     * @param deployments
     *        A list of deployment IDs.
     */

    public void setDeployments(java.util.Collection<String> deployments) {
        if (deployments == null) {
            this.deployments = null;
            return;
        }

        this.deployments = new com.amazonaws.internal.SdkInternalList<String>(deployments);
    }

    /**
     * <p>
     * A list of deployment IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeployments(java.util.Collection)} or {@link #withDeployments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deployments
     *        A list of deployment IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsResult withDeployments(String... deployments) {
        if (this.deployments == null) {
            setDeployments(new com.amazonaws.internal.SdkInternalList<String>(deployments.length));
        }
        for (String ele : deployments) {
            this.deployments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of deployment IDs.
     * </p>
     * 
     * @param deployments
     *        A list of deployment IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsResult withDeployments(java.util.Collection<String> deployments) {
        setDeployments(deployments);
        return this;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * deployments call to return the next set of deployments in the list.
     * </p>
     * 
     * @param nextToken
     *        If a large amount of information is returned, an identifier is also returned. It can be used in a
     *        subsequent list deployments call to return the next set of deployments in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * deployments call to return the next set of deployments in the list.
     * </p>
     * 
     * @return If a large amount of information is returned, an identifier is also returned. It can be used in a
     *         subsequent list deployments call to return the next set of deployments in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * deployments call to return the next set of deployments in the list.
     * </p>
     * 
     * @param nextToken
     *        If a large amount of information is returned, an identifier is also returned. It can be used in a
     *        subsequent list deployments call to return the next set of deployments in the list.
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

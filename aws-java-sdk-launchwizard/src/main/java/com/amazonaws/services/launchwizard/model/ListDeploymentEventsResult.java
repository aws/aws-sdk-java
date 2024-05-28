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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListDeploymentEvents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeploymentEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the deployment events.
     * </p>
     */
    private java.util.List<DeploymentEventDataSummary> deploymentEvents;
    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the deployment events.
     * </p>
     * 
     * @return Lists the deployment events.
     */

    public java.util.List<DeploymentEventDataSummary> getDeploymentEvents() {
        return deploymentEvents;
    }

    /**
     * <p>
     * Lists the deployment events.
     * </p>
     * 
     * @param deploymentEvents
     *        Lists the deployment events.
     */

    public void setDeploymentEvents(java.util.Collection<DeploymentEventDataSummary> deploymentEvents) {
        if (deploymentEvents == null) {
            this.deploymentEvents = null;
            return;
        }

        this.deploymentEvents = new java.util.ArrayList<DeploymentEventDataSummary>(deploymentEvents);
    }

    /**
     * <p>
     * Lists the deployment events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentEvents(java.util.Collection)} or {@link #withDeploymentEvents(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deploymentEvents
     *        Lists the deployment events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentEventsResult withDeploymentEvents(DeploymentEventDataSummary... deploymentEvents) {
        if (this.deploymentEvents == null) {
            setDeploymentEvents(new java.util.ArrayList<DeploymentEventDataSummary>(deploymentEvents.length));
        }
        for (DeploymentEventDataSummary ele : deploymentEvents) {
            this.deploymentEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the deployment events.
     * </p>
     * 
     * @param deploymentEvents
     *        Lists the deployment events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentEventsResult withDeploymentEvents(java.util.Collection<DeploymentEventDataSummary> deploymentEvents) {
        setDeploymentEvents(deploymentEvents);
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

    public ListDeploymentEventsResult withNextToken(String nextToken) {
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
        if (getDeploymentEvents() != null)
            sb.append("DeploymentEvents: ").append(getDeploymentEvents()).append(",");
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

        if (obj instanceof ListDeploymentEventsResult == false)
            return false;
        ListDeploymentEventsResult other = (ListDeploymentEventsResult) obj;
        if (other.getDeploymentEvents() == null ^ this.getDeploymentEvents() == null)
            return false;
        if (other.getDeploymentEvents() != null && other.getDeploymentEvents().equals(this.getDeploymentEvents()) == false)
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

        hashCode = prime * hashCode + ((getDeploymentEvents() == null) ? 0 : getDeploymentEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDeploymentEventsResult clone() {
        try {
            return (ListDeploymentEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

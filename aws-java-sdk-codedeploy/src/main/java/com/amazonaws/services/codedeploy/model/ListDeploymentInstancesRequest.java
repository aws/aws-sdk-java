/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a list deployment instances operation.
 * </p>
 */
public class ListDeploymentInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * An identifier returned from the previous list deployment instances call. It can be used to return the next set of
     * deployment instances in the list.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A subset of instances to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: Include those instance with pending deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: Include those instance where deployments are still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: Include those instances with successful deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: Include those instance with failed deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: Include those instance with skipped deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: Include those instance with deployments in an unknown state.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceStatusFilter;

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @return The unique ID of a deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentInstancesRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * An identifier returned from the previous list deployment instances call. It can be used to return the next set of
     * deployment instances in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier returned from the previous list deployment instances call. It can be used to return the next
     *        set of deployment instances in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous list deployment instances call. It can be used to return the next set of
     * deployment instances in the list.
     * </p>
     * 
     * @return An identifier returned from the previous list deployment instances call. It can be used to return the
     *         next set of deployment instances in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous list deployment instances call. It can be used to return the next set of
     * deployment instances in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier returned from the previous list deployment instances call. It can be used to return the next
     *        set of deployment instances in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentInstancesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A subset of instances to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: Include those instance with pending deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: Include those instance where deployments are still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: Include those instances with successful deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: Include those instance with failed deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: Include those instance with skipped deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: Include those instance with deployments in an unknown state.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A subset of instances to list by status:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Pending: Include those instance with pending deployments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         InProgress: Include those instance where deployments are still in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Succeeded: Include those instances with successful deployments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed: Include those instance with failed deployments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Skipped: Include those instance with skipped deployments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Unknown: Include those instance with deployments in an unknown state.
     *         </p>
     *         </li>
     * @see InstanceStatus
     */

    public java.util.List<String> getInstanceStatusFilter() {
        if (instanceStatusFilter == null) {
            instanceStatusFilter = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceStatusFilter;
    }

    /**
     * <p>
     * A subset of instances to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: Include those instance with pending deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: Include those instance where deployments are still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: Include those instances with successful deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: Include those instance with failed deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: Include those instance with skipped deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: Include those instance with deployments in an unknown state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceStatusFilter
     *        A subset of instances to list by status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: Include those instance with pending deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InProgress: Include those instance where deployments are still in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: Include those instances with successful deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: Include those instance with failed deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Skipped: Include those instance with skipped deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unknown: Include those instance with deployments in an unknown state.
     *        </p>
     *        </li>
     * @see InstanceStatus
     */

    public void setInstanceStatusFilter(java.util.Collection<String> instanceStatusFilter) {
        if (instanceStatusFilter == null) {
            this.instanceStatusFilter = null;
            return;
        }

        this.instanceStatusFilter = new com.amazonaws.internal.SdkInternalList<String>(instanceStatusFilter);
    }

    /**
     * <p>
     * A subset of instances to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: Include those instance with pending deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: Include those instance where deployments are still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: Include those instances with successful deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: Include those instance with failed deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: Include those instance with skipped deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: Include those instance with deployments in an unknown state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceStatusFilter(java.util.Collection)} or {@link #withInstanceStatusFilter(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param instanceStatusFilter
     *        A subset of instances to list by status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: Include those instance with pending deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InProgress: Include those instance where deployments are still in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: Include those instances with successful deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: Include those instance with failed deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Skipped: Include those instance with skipped deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unknown: Include those instance with deployments in an unknown state.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStatus
     */

    public ListDeploymentInstancesRequest withInstanceStatusFilter(String... instanceStatusFilter) {
        if (this.instanceStatusFilter == null) {
            setInstanceStatusFilter(new com.amazonaws.internal.SdkInternalList<String>(instanceStatusFilter.length));
        }
        for (String ele : instanceStatusFilter) {
            this.instanceStatusFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A subset of instances to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: Include those instance with pending deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: Include those instance where deployments are still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: Include those instances with successful deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: Include those instance with failed deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: Include those instance with skipped deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: Include those instance with deployments in an unknown state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceStatusFilter
     *        A subset of instances to list by status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: Include those instance with pending deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InProgress: Include those instance where deployments are still in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: Include those instances with successful deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: Include those instance with failed deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Skipped: Include those instance with skipped deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unknown: Include those instance with deployments in an unknown state.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStatus
     */

    public ListDeploymentInstancesRequest withInstanceStatusFilter(java.util.Collection<String> instanceStatusFilter) {
        setInstanceStatusFilter(instanceStatusFilter);
        return this;
    }

    /**
     * <p>
     * A subset of instances to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: Include those instance with pending deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: Include those instance where deployments are still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: Include those instances with successful deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: Include those instance with failed deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: Include those instance with skipped deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: Include those instance with deployments in an unknown state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceStatusFilter
     *        A subset of instances to list by status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: Include those instance with pending deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        InProgress: Include those instance where deployments are still in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: Include those instances with successful deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: Include those instance with failed deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Skipped: Include those instance with skipped deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unknown: Include those instance with deployments in an unknown state.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStatus
     */

    public ListDeploymentInstancesRequest withInstanceStatusFilter(InstanceStatus... instanceStatusFilter) {
        com.amazonaws.internal.SdkInternalList<String> instanceStatusFilterCopy = new com.amazonaws.internal.SdkInternalList<String>(
                instanceStatusFilter.length);
        for (InstanceStatus value : instanceStatusFilter) {
            instanceStatusFilterCopy.add(value.toString());
        }
        if (getInstanceStatusFilter() == null) {
            setInstanceStatusFilter(instanceStatusFilterCopy);
        } else {
            getInstanceStatusFilter().addAll(instanceStatusFilterCopy);
        }
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: " + getDeploymentId() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getInstanceStatusFilter() != null)
            sb.append("InstanceStatusFilter: " + getInstanceStatusFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeploymentInstancesRequest == false)
            return false;
        ListDeploymentInstancesRequest other = (ListDeploymentInstancesRequest) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getInstanceStatusFilter() == null ^ this.getInstanceStatusFilter() == null)
            return false;
        if (other.getInstanceStatusFilter() != null && other.getInstanceStatusFilter().equals(this.getInstanceStatusFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceStatusFilter() == null) ? 0 : getInstanceStatusFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListDeploymentInstancesRequest clone() {
        return (ListDeploymentInstancesRequest) super.clone();
    }
}

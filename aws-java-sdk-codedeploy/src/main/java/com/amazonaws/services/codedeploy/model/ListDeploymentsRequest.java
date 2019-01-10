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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a ListDeployments operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeployments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeploymentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The name of a deployment group for the specified application.
     * </p>
     */
    private String deploymentGroupName;
    /**
     * <p>
     * A subset of deployments to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Created: Include created deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Queued: Include queued deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: Include in-progress deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: Include successful deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: Include failed deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopped: Include stopped deployments in the resulting list.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> includeOnlyStatuses;
    /**
     * <p>
     * A time range (start and end) for returning a subset of the list of deployments.
     * </p>
     */
    private TimeRange createTimeRange;
    /**
     * <p>
     * An identifier returned from the previous list deployments call. It can be used to return the next set of
     * deployments in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     * </p>
     * 
     * @return The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The name of a deployment group for the specified application.
     * </p>
     * 
     * @param deploymentGroupName
     *        The name of a deployment group for the specified application.
     */

    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }

    /**
     * <p>
     * The name of a deployment group for the specified application.
     * </p>
     * 
     * @return The name of a deployment group for the specified application.
     */

    public String getDeploymentGroupName() {
        return this.deploymentGroupName;
    }

    /**
     * <p>
     * The name of a deployment group for the specified application.
     * </p>
     * 
     * @param deploymentGroupName
     *        The name of a deployment group for the specified application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsRequest withDeploymentGroupName(String deploymentGroupName) {
        setDeploymentGroupName(deploymentGroupName);
        return this;
    }

    /**
     * <p>
     * A subset of deployments to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Created: Include created deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Queued: Include queued deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: Include in-progress deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: Include successful deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: Include failed deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopped: Include stopped deployments in the resulting list.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A subset of deployments to list by status:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Created: Include created deployments in the resulting list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Queued: Include queued deployments in the resulting list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In Progress: Include in-progress deployments in the resulting list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Succeeded: Include successful deployments in the resulting list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed: Include failed deployments in the resulting list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Stopped: Include stopped deployments in the resulting list.
     *         </p>
     *         </li>
     * @see DeploymentStatus
     */

    public java.util.List<String> getIncludeOnlyStatuses() {
        if (includeOnlyStatuses == null) {
            includeOnlyStatuses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return includeOnlyStatuses;
    }

    /**
     * <p>
     * A subset of deployments to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Created: Include created deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Queued: Include queued deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: Include in-progress deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: Include successful deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: Include failed deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopped: Include stopped deployments in the resulting list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param includeOnlyStatuses
     *        A subset of deployments to list by status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Created: Include created deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Queued: Include queued deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In Progress: Include in-progress deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: Include successful deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: Include failed deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Stopped: Include stopped deployments in the resulting list.
     *        </p>
     *        </li>
     * @see DeploymentStatus
     */

    public void setIncludeOnlyStatuses(java.util.Collection<String> includeOnlyStatuses) {
        if (includeOnlyStatuses == null) {
            this.includeOnlyStatuses = null;
            return;
        }

        this.includeOnlyStatuses = new com.amazonaws.internal.SdkInternalList<String>(includeOnlyStatuses);
    }

    /**
     * <p>
     * A subset of deployments to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Created: Include created deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Queued: Include queued deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: Include in-progress deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: Include successful deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: Include failed deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopped: Include stopped deployments in the resulting list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludeOnlyStatuses(java.util.Collection)} or {@link #withIncludeOnlyStatuses(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param includeOnlyStatuses
     *        A subset of deployments to list by status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Created: Include created deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Queued: Include queued deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In Progress: Include in-progress deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: Include successful deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: Include failed deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Stopped: Include stopped deployments in the resulting list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public ListDeploymentsRequest withIncludeOnlyStatuses(String... includeOnlyStatuses) {
        if (this.includeOnlyStatuses == null) {
            setIncludeOnlyStatuses(new com.amazonaws.internal.SdkInternalList<String>(includeOnlyStatuses.length));
        }
        for (String ele : includeOnlyStatuses) {
            this.includeOnlyStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A subset of deployments to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Created: Include created deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Queued: Include queued deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: Include in-progress deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: Include successful deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: Include failed deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopped: Include stopped deployments in the resulting list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param includeOnlyStatuses
     *        A subset of deployments to list by status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Created: Include created deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Queued: Include queued deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In Progress: Include in-progress deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: Include successful deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: Include failed deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Stopped: Include stopped deployments in the resulting list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public ListDeploymentsRequest withIncludeOnlyStatuses(java.util.Collection<String> includeOnlyStatuses) {
        setIncludeOnlyStatuses(includeOnlyStatuses);
        return this;
    }

    /**
     * <p>
     * A subset of deployments to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Created: Include created deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Queued: Include queued deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: Include in-progress deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: Include successful deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: Include failed deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stopped: Include stopped deployments in the resulting list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param includeOnlyStatuses
     *        A subset of deployments to list by status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Created: Include created deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Queued: Include queued deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In Progress: Include in-progress deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: Include successful deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: Include failed deployments in the resulting list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Stopped: Include stopped deployments in the resulting list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public ListDeploymentsRequest withIncludeOnlyStatuses(DeploymentStatus... includeOnlyStatuses) {
        com.amazonaws.internal.SdkInternalList<String> includeOnlyStatusesCopy = new com.amazonaws.internal.SdkInternalList<String>(includeOnlyStatuses.length);
        for (DeploymentStatus value : includeOnlyStatuses) {
            includeOnlyStatusesCopy.add(value.toString());
        }
        if (getIncludeOnlyStatuses() == null) {
            setIncludeOnlyStatuses(includeOnlyStatusesCopy);
        } else {
            getIncludeOnlyStatuses().addAll(includeOnlyStatusesCopy);
        }
        return this;
    }

    /**
     * <p>
     * A time range (start and end) for returning a subset of the list of deployments.
     * </p>
     * 
     * @param createTimeRange
     *        A time range (start and end) for returning a subset of the list of deployments.
     */

    public void setCreateTimeRange(TimeRange createTimeRange) {
        this.createTimeRange = createTimeRange;
    }

    /**
     * <p>
     * A time range (start and end) for returning a subset of the list of deployments.
     * </p>
     * 
     * @return A time range (start and end) for returning a subset of the list of deployments.
     */

    public TimeRange getCreateTimeRange() {
        return this.createTimeRange;
    }

    /**
     * <p>
     * A time range (start and end) for returning a subset of the list of deployments.
     * </p>
     * 
     * @param createTimeRange
     *        A time range (start and end) for returning a subset of the list of deployments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsRequest withCreateTimeRange(TimeRange createTimeRange) {
        setCreateTimeRange(createTimeRange);
        return this;
    }

    /**
     * <p>
     * An identifier returned from the previous list deployments call. It can be used to return the next set of
     * deployments in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier returned from the previous list deployments call. It can be used to return the next set of
     *        deployments in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous list deployments call. It can be used to return the next set of
     * deployments in the list.
     * </p>
     * 
     * @return An identifier returned from the previous list deployments call. It can be used to return the next set of
     *         deployments in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous list deployments call. It can be used to return the next set of
     * deployments in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier returned from the previous list deployments call. It can be used to return the next set of
     *        deployments in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsRequest withNextToken(String nextToken) {
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getDeploymentGroupName() != null)
            sb.append("DeploymentGroupName: ").append(getDeploymentGroupName()).append(",");
        if (getIncludeOnlyStatuses() != null)
            sb.append("IncludeOnlyStatuses: ").append(getIncludeOnlyStatuses()).append(",");
        if (getCreateTimeRange() != null)
            sb.append("CreateTimeRange: ").append(getCreateTimeRange()).append(",");
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

        if (obj instanceof ListDeploymentsRequest == false)
            return false;
        ListDeploymentsRequest other = (ListDeploymentsRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDeploymentGroupName() == null ^ this.getDeploymentGroupName() == null)
            return false;
        if (other.getDeploymentGroupName() != null && other.getDeploymentGroupName().equals(this.getDeploymentGroupName()) == false)
            return false;
        if (other.getIncludeOnlyStatuses() == null ^ this.getIncludeOnlyStatuses() == null)
            return false;
        if (other.getIncludeOnlyStatuses() != null && other.getIncludeOnlyStatuses().equals(this.getIncludeOnlyStatuses()) == false)
            return false;
        if (other.getCreateTimeRange() == null ^ this.getCreateTimeRange() == null)
            return false;
        if (other.getCreateTimeRange() != null && other.getCreateTimeRange().equals(this.getCreateTimeRange()) == false)
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

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentGroupName() == null) ? 0 : getDeploymentGroupName().hashCode());
        hashCode = prime * hashCode + ((getIncludeOnlyStatuses() == null) ? 0 : getIncludeOnlyStatuses().hashCode());
        hashCode = prime * hashCode + ((getCreateTimeRange() == null) ? 0 : getCreateTimeRange().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDeploymentsRequest clone() {
        return (ListDeploymentsRequest) super.clone();
    }

}

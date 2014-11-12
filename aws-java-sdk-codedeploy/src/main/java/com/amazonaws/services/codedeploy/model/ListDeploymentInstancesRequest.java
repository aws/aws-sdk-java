/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#listDeploymentInstances(ListDeploymentInstancesRequest) ListDeploymentInstances operation}.
 * <p>
 * Lists the Amazon EC2 instances for a deployment within the AWS user
 * account.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#listDeploymentInstances(ListDeploymentInstancesRequest)
 */
public class ListDeploymentInstancesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The unique ID of a deployment.
     */
    private String deploymentId;

    /**
     * An identifier that was returned from the previous list deployment
     * instances call, which can be used to return the next set of deployment
     * instances in the list.
     */
    private String nextToken;

    /**
     * A subset of instances to list, by status: <ul> <li>Pending: Include in
     * the resulting list those instances with pending deployments.</li>
     * <li>InProgress: Include in the resulting list those instances with
     * in-progress deployments.</li> <li>Succeeded: Include in the resulting
     * list those instances with succeeded deployments.</li> <li>Failed:
     * Include in the resulting list those instances with failed
     * deployments.</li> <li>Skipped: Include in the resulting list those
     * instances with skipped deployments.</li> <li>Unknown: Include in the
     * resulting list those instances with deployments in an unknown
     * state.</li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceStatusFilter;

    /**
     * The unique ID of a deployment.
     *
     * @return The unique ID of a deployment.
     */
    public String getDeploymentId() {
        return deploymentId;
    }
    
    /**
     * The unique ID of a deployment.
     *
     * @param deploymentId The unique ID of a deployment.
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }
    
    /**
     * The unique ID of a deployment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentId The unique ID of a deployment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentInstancesRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * An identifier that was returned from the previous list deployment
     * instances call, which can be used to return the next set of deployment
     * instances in the list.
     *
     * @return An identifier that was returned from the previous list deployment
     *         instances call, which can be used to return the next set of deployment
     *         instances in the list.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * An identifier that was returned from the previous list deployment
     * instances call, which can be used to return the next set of deployment
     * instances in the list.
     *
     * @param nextToken An identifier that was returned from the previous list deployment
     *         instances call, which can be used to return the next set of deployment
     *         instances in the list.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * An identifier that was returned from the previous list deployment
     * instances call, which can be used to return the next set of deployment
     * instances in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken An identifier that was returned from the previous list deployment
     *         instances call, which can be used to return the next set of deployment
     *         instances in the list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentInstancesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * A subset of instances to list, by status: <ul> <li>Pending: Include in
     * the resulting list those instances with pending deployments.</li>
     * <li>InProgress: Include in the resulting list those instances with
     * in-progress deployments.</li> <li>Succeeded: Include in the resulting
     * list those instances with succeeded deployments.</li> <li>Failed:
     * Include in the resulting list those instances with failed
     * deployments.</li> <li>Skipped: Include in the resulting list those
     * instances with skipped deployments.</li> <li>Unknown: Include in the
     * resulting list those instances with deployments in an unknown
     * state.</li> </ul>
     *
     * @return A subset of instances to list, by status: <ul> <li>Pending: Include in
     *         the resulting list those instances with pending deployments.</li>
     *         <li>InProgress: Include in the resulting list those instances with
     *         in-progress deployments.</li> <li>Succeeded: Include in the resulting
     *         list those instances with succeeded deployments.</li> <li>Failed:
     *         Include in the resulting list those instances with failed
     *         deployments.</li> <li>Skipped: Include in the resulting list those
     *         instances with skipped deployments.</li> <li>Unknown: Include in the
     *         resulting list those instances with deployments in an unknown
     *         state.</li> </ul>
     */
    public java.util.List<String> getInstanceStatusFilter() {
        if (instanceStatusFilter == null) {
              instanceStatusFilter = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceStatusFilter.setAutoConstruct(true);
        }
        return instanceStatusFilter;
    }
    
    /**
     * A subset of instances to list, by status: <ul> <li>Pending: Include in
     * the resulting list those instances with pending deployments.</li>
     * <li>InProgress: Include in the resulting list those instances with
     * in-progress deployments.</li> <li>Succeeded: Include in the resulting
     * list those instances with succeeded deployments.</li> <li>Failed:
     * Include in the resulting list those instances with failed
     * deployments.</li> <li>Skipped: Include in the resulting list those
     * instances with skipped deployments.</li> <li>Unknown: Include in the
     * resulting list those instances with deployments in an unknown
     * state.</li> </ul>
     *
     * @param instanceStatusFilter A subset of instances to list, by status: <ul> <li>Pending: Include in
     *         the resulting list those instances with pending deployments.</li>
     *         <li>InProgress: Include in the resulting list those instances with
     *         in-progress deployments.</li> <li>Succeeded: Include in the resulting
     *         list those instances with succeeded deployments.</li> <li>Failed:
     *         Include in the resulting list those instances with failed
     *         deployments.</li> <li>Skipped: Include in the resulting list those
     *         instances with skipped deployments.</li> <li>Unknown: Include in the
     *         resulting list those instances with deployments in an unknown
     *         state.</li> </ul>
     */
    public void setInstanceStatusFilter(java.util.Collection<String> instanceStatusFilter) {
        if (instanceStatusFilter == null) {
            this.instanceStatusFilter = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceStatusFilterCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceStatusFilter.size());
        instanceStatusFilterCopy.addAll(instanceStatusFilter);
        this.instanceStatusFilter = instanceStatusFilterCopy;
    }
    
    /**
     * A subset of instances to list, by status: <ul> <li>Pending: Include in
     * the resulting list those instances with pending deployments.</li>
     * <li>InProgress: Include in the resulting list those instances with
     * in-progress deployments.</li> <li>Succeeded: Include in the resulting
     * list those instances with succeeded deployments.</li> <li>Failed:
     * Include in the resulting list those instances with failed
     * deployments.</li> <li>Skipped: Include in the resulting list those
     * instances with skipped deployments.</li> <li>Unknown: Include in the
     * resulting list those instances with deployments in an unknown
     * state.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceStatusFilter A subset of instances to list, by status: <ul> <li>Pending: Include in
     *         the resulting list those instances with pending deployments.</li>
     *         <li>InProgress: Include in the resulting list those instances with
     *         in-progress deployments.</li> <li>Succeeded: Include in the resulting
     *         list those instances with succeeded deployments.</li> <li>Failed:
     *         Include in the resulting list those instances with failed
     *         deployments.</li> <li>Skipped: Include in the resulting list those
     *         instances with skipped deployments.</li> <li>Unknown: Include in the
     *         resulting list those instances with deployments in an unknown
     *         state.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentInstancesRequest withInstanceStatusFilter(String... instanceStatusFilter) {
        if (getInstanceStatusFilter() == null) setInstanceStatusFilter(new java.util.ArrayList<String>(instanceStatusFilter.length));
        for (String value : instanceStatusFilter) {
            getInstanceStatusFilter().add(value);
        }
        return this;
    }
    
    /**
     * A subset of instances to list, by status: <ul> <li>Pending: Include in
     * the resulting list those instances with pending deployments.</li>
     * <li>InProgress: Include in the resulting list those instances with
     * in-progress deployments.</li> <li>Succeeded: Include in the resulting
     * list those instances with succeeded deployments.</li> <li>Failed:
     * Include in the resulting list those instances with failed
     * deployments.</li> <li>Skipped: Include in the resulting list those
     * instances with skipped deployments.</li> <li>Unknown: Include in the
     * resulting list those instances with deployments in an unknown
     * state.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceStatusFilter A subset of instances to list, by status: <ul> <li>Pending: Include in
     *         the resulting list those instances with pending deployments.</li>
     *         <li>InProgress: Include in the resulting list those instances with
     *         in-progress deployments.</li> <li>Succeeded: Include in the resulting
     *         list those instances with succeeded deployments.</li> <li>Failed:
     *         Include in the resulting list those instances with failed
     *         deployments.</li> <li>Skipped: Include in the resulting list those
     *         instances with skipped deployments.</li> <li>Unknown: Include in the
     *         resulting list those instances with deployments in an unknown
     *         state.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentInstancesRequest withInstanceStatusFilter(java.util.Collection<String> instanceStatusFilter) {
        if (instanceStatusFilter == null) {
            this.instanceStatusFilter = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceStatusFilterCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceStatusFilter.size());
            instanceStatusFilterCopy.addAll(instanceStatusFilter);
            this.instanceStatusFilter = instanceStatusFilterCopy;
        }

        return this;
    }

    /**
     * A subset of instances to list, by status: <ul> <li>Pending: Include in
     * the resulting list those instances with pending deployments.</li>
     * <li>InProgress: Include in the resulting list those instances with
     * in-progress deployments.</li> <li>Succeeded: Include in the resulting
     * list those instances with succeeded deployments.</li> <li>Failed:
     * Include in the resulting list those instances with failed
     * deployments.</li> <li>Skipped: Include in the resulting list those
     * instances with skipped deployments.</li> <li>Unknown: Include in the
     * resulting list those instances with deployments in an unknown
     * state.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceStatusFilter A subset of instances to list, by status: <ul> <li>Pending: Include in
     *         the resulting list those instances with pending deployments.</li>
     *         <li>InProgress: Include in the resulting list those instances with
     *         in-progress deployments.</li> <li>Succeeded: Include in the resulting
     *         list those instances with succeeded deployments.</li> <li>Failed:
     *         Include in the resulting list those instances with failed
     *         deployments.</li> <li>Skipped: Include in the resulting list those
     *         instances with skipped deployments.</li> <li>Unknown: Include in the
     *         resulting list those instances with deployments in an unknown
     *         state.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentInstancesRequest withInstanceStatusFilter(InstanceStatus... instanceStatusFilter) {
        java.util.ArrayList<String> instanceStatusFilterCopy = new java.util.ArrayList<String>(instanceStatusFilter.length);
        for (InstanceStatus member : instanceStatusFilter) {
            instanceStatusFilterCopy.add(member.toString());
        }
        if (getInstanceStatusFilter() == null) {
            setInstanceStatusFilter(instanceStatusFilterCopy);
        } else {
            getInstanceStatusFilter().addAll(instanceStatusFilterCopy);
        }
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeploymentId() != null) sb.append("DeploymentId: " + getDeploymentId() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getInstanceStatusFilter() != null) sb.append("InstanceStatusFilter: " + getInstanceStatusFilter() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDeploymentInstancesRequest == false) return false;
        ListDeploymentInstancesRequest other = (ListDeploymentInstancesRequest)obj;
        
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null) return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getInstanceStatusFilter() == null ^ this.getInstanceStatusFilter() == null) return false;
        if (other.getInstanceStatusFilter() != null && other.getInstanceStatusFilter().equals(this.getInstanceStatusFilter()) == false) return false; 
        return true;
    }
    
}
    
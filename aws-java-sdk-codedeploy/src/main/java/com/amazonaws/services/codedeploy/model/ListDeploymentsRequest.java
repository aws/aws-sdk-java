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
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#listDeployments(ListDeploymentsRequest) ListDeployments operation}.
 * <p>
 * Lists the deployments under a deployment group for an application
 * registered within the AWS user account.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#listDeployments(ListDeploymentsRequest)
 */
public class ListDeploymentsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The name of an existing deployment group for the specified
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentGroupName;

    /**
     * <para>A subset of deployments to list, by status:</para> <ul>
     * <li>Created: Include in the resulting list created deployments.</li>
     * <li>Queued: Include in the resulting list queued deployments.</li>
     * <li>In Progress: Include in the resulting list in-progress
     * deployments.</li> <li>Succeeded: Include in the resulting list
     * succeeded deployments.</li> <li>Failed: Include in the resulting list
     * failed deployments.</li> <li>Aborted: Include in the resulting list
     * aborted deployments.</li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> includeOnlyStatuses;

    /**
     * A deployment creation start- and end-time range for returning a subset
     * of the list of deployments.
     */
    private TimeRange createTimeRange;

    /**
     * An identifier that was returned from the previous list deployments
     * call, which can be used to return the next set of deployments in the
     * list.
     */
    private String nextToken;

    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of an existing AWS CodeDeploy application within the AWS user
     *         account.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of an existing AWS CodeDeploy application within the AWS user
     *         account.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of an existing AWS CodeDeploy application within the AWS user
     *         account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The name of an existing deployment group for the specified
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of an existing deployment group for the specified
     *         application.
     */
    public String getDeploymentGroupName() {
        return deploymentGroupName;
    }
    
    /**
     * The name of an existing deployment group for the specified
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName The name of an existing deployment group for the specified
     *         application.
     */
    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }
    
    /**
     * The name of an existing deployment group for the specified
     * application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName The name of an existing deployment group for the specified
     *         application.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentsRequest withDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
        return this;
    }

    /**
     * <para>A subset of deployments to list, by status:</para> <ul>
     * <li>Created: Include in the resulting list created deployments.</li>
     * <li>Queued: Include in the resulting list queued deployments.</li>
     * <li>In Progress: Include in the resulting list in-progress
     * deployments.</li> <li>Succeeded: Include in the resulting list
     * succeeded deployments.</li> <li>Failed: Include in the resulting list
     * failed deployments.</li> <li>Aborted: Include in the resulting list
     * aborted deployments.</li> </ul>
     *
     * @return <para>A subset of deployments to list, by status:</para> <ul>
     *         <li>Created: Include in the resulting list created deployments.</li>
     *         <li>Queued: Include in the resulting list queued deployments.</li>
     *         <li>In Progress: Include in the resulting list in-progress
     *         deployments.</li> <li>Succeeded: Include in the resulting list
     *         succeeded deployments.</li> <li>Failed: Include in the resulting list
     *         failed deployments.</li> <li>Aborted: Include in the resulting list
     *         aborted deployments.</li> </ul>
     */
    public java.util.List<String> getIncludeOnlyStatuses() {
        if (includeOnlyStatuses == null) {
              includeOnlyStatuses = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              includeOnlyStatuses.setAutoConstruct(true);
        }
        return includeOnlyStatuses;
    }
    
    /**
     * <para>A subset of deployments to list, by status:</para> <ul>
     * <li>Created: Include in the resulting list created deployments.</li>
     * <li>Queued: Include in the resulting list queued deployments.</li>
     * <li>In Progress: Include in the resulting list in-progress
     * deployments.</li> <li>Succeeded: Include in the resulting list
     * succeeded deployments.</li> <li>Failed: Include in the resulting list
     * failed deployments.</li> <li>Aborted: Include in the resulting list
     * aborted deployments.</li> </ul>
     *
     * @param includeOnlyStatuses <para>A subset of deployments to list, by status:</para> <ul>
     *         <li>Created: Include in the resulting list created deployments.</li>
     *         <li>Queued: Include in the resulting list queued deployments.</li>
     *         <li>In Progress: Include in the resulting list in-progress
     *         deployments.</li> <li>Succeeded: Include in the resulting list
     *         succeeded deployments.</li> <li>Failed: Include in the resulting list
     *         failed deployments.</li> <li>Aborted: Include in the resulting list
     *         aborted deployments.</li> </ul>
     */
    public void setIncludeOnlyStatuses(java.util.Collection<String> includeOnlyStatuses) {
        if (includeOnlyStatuses == null) {
            this.includeOnlyStatuses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> includeOnlyStatusesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(includeOnlyStatuses.size());
        includeOnlyStatusesCopy.addAll(includeOnlyStatuses);
        this.includeOnlyStatuses = includeOnlyStatusesCopy;
    }
    
    /**
     * <para>A subset of deployments to list, by status:</para> <ul>
     * <li>Created: Include in the resulting list created deployments.</li>
     * <li>Queued: Include in the resulting list queued deployments.</li>
     * <li>In Progress: Include in the resulting list in-progress
     * deployments.</li> <li>Succeeded: Include in the resulting list
     * succeeded deployments.</li> <li>Failed: Include in the resulting list
     * failed deployments.</li> <li>Aborted: Include in the resulting list
     * aborted deployments.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeOnlyStatuses <para>A subset of deployments to list, by status:</para> <ul>
     *         <li>Created: Include in the resulting list created deployments.</li>
     *         <li>Queued: Include in the resulting list queued deployments.</li>
     *         <li>In Progress: Include in the resulting list in-progress
     *         deployments.</li> <li>Succeeded: Include in the resulting list
     *         succeeded deployments.</li> <li>Failed: Include in the resulting list
     *         failed deployments.</li> <li>Aborted: Include in the resulting list
     *         aborted deployments.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentsRequest withIncludeOnlyStatuses(String... includeOnlyStatuses) {
        if (getIncludeOnlyStatuses() == null) setIncludeOnlyStatuses(new java.util.ArrayList<String>(includeOnlyStatuses.length));
        for (String value : includeOnlyStatuses) {
            getIncludeOnlyStatuses().add(value);
        }
        return this;
    }
    
    /**
     * <para>A subset of deployments to list, by status:</para> <ul>
     * <li>Created: Include in the resulting list created deployments.</li>
     * <li>Queued: Include in the resulting list queued deployments.</li>
     * <li>In Progress: Include in the resulting list in-progress
     * deployments.</li> <li>Succeeded: Include in the resulting list
     * succeeded deployments.</li> <li>Failed: Include in the resulting list
     * failed deployments.</li> <li>Aborted: Include in the resulting list
     * aborted deployments.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeOnlyStatuses <para>A subset of deployments to list, by status:</para> <ul>
     *         <li>Created: Include in the resulting list created deployments.</li>
     *         <li>Queued: Include in the resulting list queued deployments.</li>
     *         <li>In Progress: Include in the resulting list in-progress
     *         deployments.</li> <li>Succeeded: Include in the resulting list
     *         succeeded deployments.</li> <li>Failed: Include in the resulting list
     *         failed deployments.</li> <li>Aborted: Include in the resulting list
     *         aborted deployments.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentsRequest withIncludeOnlyStatuses(java.util.Collection<String> includeOnlyStatuses) {
        if (includeOnlyStatuses == null) {
            this.includeOnlyStatuses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> includeOnlyStatusesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(includeOnlyStatuses.size());
            includeOnlyStatusesCopy.addAll(includeOnlyStatuses);
            this.includeOnlyStatuses = includeOnlyStatusesCopy;
        }

        return this;
    }

    /**
     * <para>A subset of deployments to list, by status:</para> <ul>
     * <li>Created: Include in the resulting list created deployments.</li>
     * <li>Queued: Include in the resulting list queued deployments.</li>
     * <li>In Progress: Include in the resulting list in-progress
     * deployments.</li> <li>Succeeded: Include in the resulting list
     * succeeded deployments.</li> <li>Failed: Include in the resulting list
     * failed deployments.</li> <li>Aborted: Include in the resulting list
     * aborted deployments.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeOnlyStatuses <para>A subset of deployments to list, by status:</para> <ul>
     *         <li>Created: Include in the resulting list created deployments.</li>
     *         <li>Queued: Include in the resulting list queued deployments.</li>
     *         <li>In Progress: Include in the resulting list in-progress
     *         deployments.</li> <li>Succeeded: Include in the resulting list
     *         succeeded deployments.</li> <li>Failed: Include in the resulting list
     *         failed deployments.</li> <li>Aborted: Include in the resulting list
     *         aborted deployments.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentsRequest withIncludeOnlyStatuses(DeploymentStatus... includeOnlyStatuses) {
        java.util.ArrayList<String> includeOnlyStatusesCopy = new java.util.ArrayList<String>(includeOnlyStatuses.length);
        for (DeploymentStatus member : includeOnlyStatuses) {
            includeOnlyStatusesCopy.add(member.toString());
        }
        if (getIncludeOnlyStatuses() == null) {
            setIncludeOnlyStatuses(includeOnlyStatusesCopy);
        } else {
            getIncludeOnlyStatuses().addAll(includeOnlyStatusesCopy);
        }
        return this;
    }

    /**
     * A deployment creation start- and end-time range for returning a subset
     * of the list of deployments.
     *
     * @return A deployment creation start- and end-time range for returning a subset
     *         of the list of deployments.
     */
    public TimeRange getCreateTimeRange() {
        return createTimeRange;
    }
    
    /**
     * A deployment creation start- and end-time range for returning a subset
     * of the list of deployments.
     *
     * @param createTimeRange A deployment creation start- and end-time range for returning a subset
     *         of the list of deployments.
     */
    public void setCreateTimeRange(TimeRange createTimeRange) {
        this.createTimeRange = createTimeRange;
    }
    
    /**
     * A deployment creation start- and end-time range for returning a subset
     * of the list of deployments.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createTimeRange A deployment creation start- and end-time range for returning a subset
     *         of the list of deployments.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentsRequest withCreateTimeRange(TimeRange createTimeRange) {
        this.createTimeRange = createTimeRange;
        return this;
    }

    /**
     * An identifier that was returned from the previous list deployments
     * call, which can be used to return the next set of deployments in the
     * list.
     *
     * @return An identifier that was returned from the previous list deployments
     *         call, which can be used to return the next set of deployments in the
     *         list.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * An identifier that was returned from the previous list deployments
     * call, which can be used to return the next set of deployments in the
     * list.
     *
     * @param nextToken An identifier that was returned from the previous list deployments
     *         call, which can be used to return the next set of deployments in the
     *         list.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * An identifier that was returned from the previous list deployments
     * call, which can be used to return the next set of deployments in the
     * list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken An identifier that was returned from the previous list deployments
     *         call, which can be used to return the next set of deployments in the
     *         list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getDeploymentGroupName() != null) sb.append("DeploymentGroupName: " + getDeploymentGroupName() + ",");
        if (getIncludeOnlyStatuses() != null) sb.append("IncludeOnlyStatuses: " + getIncludeOnlyStatuses() + ",");
        if (getCreateTimeRange() != null) sb.append("CreateTimeRange: " + getCreateTimeRange() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDeploymentsRequest == false) return false;
        ListDeploymentsRequest other = (ListDeploymentsRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getDeploymentGroupName() == null ^ this.getDeploymentGroupName() == null) return false;
        if (other.getDeploymentGroupName() != null && other.getDeploymentGroupName().equals(this.getDeploymentGroupName()) == false) return false; 
        if (other.getIncludeOnlyStatuses() == null ^ this.getIncludeOnlyStatuses() == null) return false;
        if (other.getIncludeOnlyStatuses() != null && other.getIncludeOnlyStatuses().equals(this.getIncludeOnlyStatuses()) == false) return false; 
        if (other.getCreateTimeRange() == null ^ this.getCreateTimeRange() == null) return false;
        if (other.getCreateTimeRange() != null && other.getCreateTimeRange().equals(this.getCreateTimeRange()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    
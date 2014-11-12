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
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#listDeploymentGroups(ListDeploymentGroupsRequest) ListDeploymentGroups operation}.
 * <p>
 * Lists the deployment groups for an application registered within the
 * AWS user account.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#listDeploymentGroups(ListDeploymentGroupsRequest)
 */
public class ListDeploymentGroupsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of an existing AWS CodeDeploy application within the AWS user
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * An identifier that was returned from the previous list deployment
     * groups call, which can be used to return the next set of deployment
     * groups in the list.
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
    public ListDeploymentGroupsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * An identifier that was returned from the previous list deployment
     * groups call, which can be used to return the next set of deployment
     * groups in the list.
     *
     * @return An identifier that was returned from the previous list deployment
     *         groups call, which can be used to return the next set of deployment
     *         groups in the list.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * An identifier that was returned from the previous list deployment
     * groups call, which can be used to return the next set of deployment
     * groups in the list.
     *
     * @param nextToken An identifier that was returned from the previous list deployment
     *         groups call, which can be used to return the next set of deployment
     *         groups in the list.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * An identifier that was returned from the previous list deployment
     * groups call, which can be used to return the next set of deployment
     * groups in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken An identifier that was returned from the previous list deployment
     *         groups call, which can be used to return the next set of deployment
     *         groups in the list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDeploymentGroupsRequest withNextToken(String nextToken) {
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
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDeploymentGroupsRequest == false) return false;
        ListDeploymentGroupsRequest other = (ListDeploymentGroupsRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    
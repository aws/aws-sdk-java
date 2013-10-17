/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#createClusterSecurityGroup(CreateClusterSecurityGroupRequest) CreateClusterSecurityGroup operation}.
 * <p>
 * Creates a new Amazon Redshift security group. You use security groups to control access to non-VPC clusters.
 * </p>
 * <p>
 * For information about managing security groups, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">
 * Amazon Redshift Cluster Security Groups </a> in the <i>Amazon Redshift Management Guide</i> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#createClusterSecurityGroup(CreateClusterSecurityGroupRequest)
 */
public class CreateClusterSecurityGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name for the security group. Amazon Redshift stores the value as a
     * lowercase string. <p>Constraints: <ul> <li>Must contain no more than
     * 255 alphanumeric characters or hyphens.</li> <li>Must not be
     * "Default".</li> <li>Must be unique for all security groups that are
     * created by your AWS account.</li> </ul> <p>Example:
     * <code>examplesecuritygroup</code>
     */
    private String clusterSecurityGroupName;

    /**
     * A description for the security group.
     */
    private String description;

    /**
     * The name for the security group. Amazon Redshift stores the value as a
     * lowercase string. <p>Constraints: <ul> <li>Must contain no more than
     * 255 alphanumeric characters or hyphens.</li> <li>Must not be
     * "Default".</li> <li>Must be unique for all security groups that are
     * created by your AWS account.</li> </ul> <p>Example:
     * <code>examplesecuritygroup</code>
     *
     * @return The name for the security group. Amazon Redshift stores the value as a
     *         lowercase string. <p>Constraints: <ul> <li>Must contain no more than
     *         255 alphanumeric characters or hyphens.</li> <li>Must not be
     *         "Default".</li> <li>Must be unique for all security groups that are
     *         created by your AWS account.</li> </ul> <p>Example:
     *         <code>examplesecuritygroup</code>
     */
    public String getClusterSecurityGroupName() {
        return clusterSecurityGroupName;
    }
    
    /**
     * The name for the security group. Amazon Redshift stores the value as a
     * lowercase string. <p>Constraints: <ul> <li>Must contain no more than
     * 255 alphanumeric characters or hyphens.</li> <li>Must not be
     * "Default".</li> <li>Must be unique for all security groups that are
     * created by your AWS account.</li> </ul> <p>Example:
     * <code>examplesecuritygroup</code>
     *
     * @param clusterSecurityGroupName The name for the security group. Amazon Redshift stores the value as a
     *         lowercase string. <p>Constraints: <ul> <li>Must contain no more than
     *         255 alphanumeric characters or hyphens.</li> <li>Must not be
     *         "Default".</li> <li>Must be unique for all security groups that are
     *         created by your AWS account.</li> </ul> <p>Example:
     *         <code>examplesecuritygroup</code>
     */
    public void setClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
    }
    
    /**
     * The name for the security group. Amazon Redshift stores the value as a
     * lowercase string. <p>Constraints: <ul> <li>Must contain no more than
     * 255 alphanumeric characters or hyphens.</li> <li>Must not be
     * "Default".</li> <li>Must be unique for all security groups that are
     * created by your AWS account.</li> </ul> <p>Example:
     * <code>examplesecuritygroup</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroupName The name for the security group. Amazon Redshift stores the value as a
     *         lowercase string. <p>Constraints: <ul> <li>Must contain no more than
     *         255 alphanumeric characters or hyphens.</li> <li>Must not be
     *         "Default".</li> <li>Must be unique for all security groups that are
     *         created by your AWS account.</li> </ul> <p>Example:
     *         <code>examplesecuritygroup</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterSecurityGroupRequest withClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
        return this;
    }

    /**
     * A description for the security group.
     *
     * @return A description for the security group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description for the security group.
     *
     * @param description A description for the security group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description for the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description for the security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterSecurityGroupRequest withDescription(String description) {
        this.description = description;
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
        if (getClusterSecurityGroupName() != null) sb.append("ClusterSecurityGroupName: " + getClusterSecurityGroupName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterSecurityGroupName() == null) ? 0 : getClusterSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateClusterSecurityGroupRequest == false) return false;
        CreateClusterSecurityGroupRequest other = (CreateClusterSecurityGroupRequest)obj;
        
        if (other.getClusterSecurityGroupName() == null ^ this.getClusterSecurityGroupName() == null) return false;
        if (other.getClusterSecurityGroupName() != null && other.getClusterSecurityGroupName().equals(this.getClusterSecurityGroupName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    
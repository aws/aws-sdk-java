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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#createClusterSubnetGroup(CreateClusterSubnetGroupRequest) CreateClusterSubnetGroup operation}.
 * <p>
 * Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing Amazon Virtual Private Cloud (Amazon VPC)
 * when creating Amazon Redshift subnet group.
 * </p>
 * <p>
 * For information about subnet groups, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-cluster-subnet-groups.html"> Amazon
 * Redshift Cluster Subnet Groups </a> in the <i>Amazon Redshift Management Guide</i> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#createClusterSubnetGroup(CreateClusterSubnetGroupRequest)
 */
public class CreateClusterSubnetGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name for the subnet group. Amazon Redshift stores the value as a
     * lowercase string. <p>Constraints: <ul> <li>Must contain no more than
     * 255 alphanumeric characters or hyphens.</li> <li>Must not be
     * "Default".</li> <li>Must be unique for all subnet groups that are
     * created by your AWS account.</li> </ul> <p>Example:
     * <code>examplesubnetgroup</code>
     */
    private String clusterSubnetGroupName;

    /**
     * A description for the subnet group.
     */
    private String description;

    /**
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     * a single request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIds;

    /**
     * The name for the subnet group. Amazon Redshift stores the value as a
     * lowercase string. <p>Constraints: <ul> <li>Must contain no more than
     * 255 alphanumeric characters or hyphens.</li> <li>Must not be
     * "Default".</li> <li>Must be unique for all subnet groups that are
     * created by your AWS account.</li> </ul> <p>Example:
     * <code>examplesubnetgroup</code>
     *
     * @return The name for the subnet group. Amazon Redshift stores the value as a
     *         lowercase string. <p>Constraints: <ul> <li>Must contain no more than
     *         255 alphanumeric characters or hyphens.</li> <li>Must not be
     *         "Default".</li> <li>Must be unique for all subnet groups that are
     *         created by your AWS account.</li> </ul> <p>Example:
     *         <code>examplesubnetgroup</code>
     */
    public String getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }
    
    /**
     * The name for the subnet group. Amazon Redshift stores the value as a
     * lowercase string. <p>Constraints: <ul> <li>Must contain no more than
     * 255 alphanumeric characters or hyphens.</li> <li>Must not be
     * "Default".</li> <li>Must be unique for all subnet groups that are
     * created by your AWS account.</li> </ul> <p>Example:
     * <code>examplesubnetgroup</code>
     *
     * @param clusterSubnetGroupName The name for the subnet group. Amazon Redshift stores the value as a
     *         lowercase string. <p>Constraints: <ul> <li>Must contain no more than
     *         255 alphanumeric characters or hyphens.</li> <li>Must not be
     *         "Default".</li> <li>Must be unique for all subnet groups that are
     *         created by your AWS account.</li> </ul> <p>Example:
     *         <code>examplesubnetgroup</code>
     */
    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }
    
    /**
     * The name for the subnet group. Amazon Redshift stores the value as a
     * lowercase string. <p>Constraints: <ul> <li>Must contain no more than
     * 255 alphanumeric characters or hyphens.</li> <li>Must not be
     * "Default".</li> <li>Must be unique for all subnet groups that are
     * created by your AWS account.</li> </ul> <p>Example:
     * <code>examplesubnetgroup</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSubnetGroupName The name for the subnet group. Amazon Redshift stores the value as a
     *         lowercase string. <p>Constraints: <ul> <li>Must contain no more than
     *         255 alphanumeric characters or hyphens.</li> <li>Must not be
     *         "Default".</li> <li>Must be unique for all subnet groups that are
     *         created by your AWS account.</li> </ul> <p>Example:
     *         <code>examplesubnetgroup</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterSubnetGroupRequest withClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        return this;
    }

    /**
     * A description for the subnet group.
     *
     * @return A description for the subnet group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description for the subnet group.
     *
     * @param description A description for the subnet group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description for the subnet group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description for the subnet group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterSubnetGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     * a single request.
     *
     * @return An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     *         a single request.
     */
    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
              subnetIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              subnetIds.setAutoConstruct(true);
        }
        return subnetIds;
    }
    
    /**
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     * a single request.
     *
     * @param subnetIds An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     *         a single request.
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnetIds.size());
        subnetIdsCopy.addAll(subnetIds);
        this.subnetIds = subnetIdsCopy;
    }
    
    /**
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     * a single request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     *         a single request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterSubnetGroupRequest withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        for (String value : subnetIds) {
            getSubnetIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     * a single request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     *         a single request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterSubnetGroupRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnetIds.size());
            subnetIdsCopy.addAll(subnetIds);
            this.subnetIds = subnetIdsCopy;
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
        if (getClusterSubnetGroupName() != null) sb.append("ClusterSubnetGroupName: " + getClusterSubnetGroupName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getSubnetIds() != null) sb.append("SubnetIds: " + getSubnetIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateClusterSubnetGroupRequest == false) return false;
        CreateClusterSubnetGroupRequest other = (CreateClusterSubnetGroupRequest)obj;
        
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null) return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null) return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false) return false; 
        return true;
    }
    
}
    
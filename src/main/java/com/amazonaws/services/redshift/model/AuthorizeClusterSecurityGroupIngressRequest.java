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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#authorizeClusterSecurityGroupIngress(AuthorizeClusterSecurityGroupIngressRequest) AuthorizeClusterSecurityGroupIngress operation}.
 * <p>
 * Adds an inbound (ingress) rule to an Amazon Redshift security group. Depending on whether the application accessing your cluster is running on the
 * Internet or an EC2 instance, you can authorize inbound access to either a Classless Interdomain Routing (CIDR) IP address range or an EC2 security
 * group. You can add as many as 20 ingress rules to an Amazon Redshift security group.
 * </p>
 * <p>
 * <b>NOTE:</b> The EC2 security group must be defined in the AWS region where the cluster resides.
 * </p>
 * <p>
 * For an overview of CIDR blocks, see the Wikipedia article on <a href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"> Classless
 * Inter-Domain Routing </a> .
 * </p>
 * <p>
 * You must also associate the security group with a cluster so that clients running on these IP addresses or the EC2 instance are authorized to connect
 * to the cluster. For information about managing security groups, go to <a
 * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"> Working with Security Groups </a> in the <i>Amazon Redshift
 * Management Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#authorizeClusterSecurityGroupIngress(AuthorizeClusterSecurityGroupIngressRequest)
 */
public class AuthorizeClusterSecurityGroupIngressRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the security group to which the ingress rule is added.
     */
    private String clusterSecurityGroupName;

    /**
     * The IP range to be added the Amazon Redshift security group.
     */
    private String cIDRIP;

    /**
     * The EC2 security group to be added the Amazon Redshift security group.
     */
    private String eC2SecurityGroupName;

    /**
     * The AWS account number of the owner of the security group specified by
     * the <i>EC2SecurityGroupName</i> parameter. The AWS Access Key ID is
     * not an acceptable value. <p> Example: <code>111122223333</code>
     */
    private String eC2SecurityGroupOwnerId;

    /**
     * The name of the security group to which the ingress rule is added.
     *
     * @return The name of the security group to which the ingress rule is added.
     */
    public String getClusterSecurityGroupName() {
        return clusterSecurityGroupName;
    }
    
    /**
     * The name of the security group to which the ingress rule is added.
     *
     * @param clusterSecurityGroupName The name of the security group to which the ingress rule is added.
     */
    public void setClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
    }
    
    /**
     * The name of the security group to which the ingress rule is added.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroupName The name of the security group to which the ingress rule is added.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AuthorizeClusterSecurityGroupIngressRequest withClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
        return this;
    }

    /**
     * The IP range to be added the Amazon Redshift security group.
     *
     * @return The IP range to be added the Amazon Redshift security group.
     */
    public String getCIDRIP() {
        return cIDRIP;
    }
    
    /**
     * The IP range to be added the Amazon Redshift security group.
     *
     * @param cIDRIP The IP range to be added the Amazon Redshift security group.
     */
    public void setCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
    }
    
    /**
     * The IP range to be added the Amazon Redshift security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cIDRIP The IP range to be added the Amazon Redshift security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AuthorizeClusterSecurityGroupIngressRequest withCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
        return this;
    }

    /**
     * The EC2 security group to be added the Amazon Redshift security group.
     *
     * @return The EC2 security group to be added the Amazon Redshift security group.
     */
    public String getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }
    
    /**
     * The EC2 security group to be added the Amazon Redshift security group.
     *
     * @param eC2SecurityGroupName The EC2 security group to be added the Amazon Redshift security group.
     */
    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }
    
    /**
     * The EC2 security group to be added the Amazon Redshift security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupName The EC2 security group to be added the Amazon Redshift security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AuthorizeClusterSecurityGroupIngressRequest withEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }

    /**
     * The AWS account number of the owner of the security group specified by
     * the <i>EC2SecurityGroupName</i> parameter. The AWS Access Key ID is
     * not an acceptable value. <p> Example: <code>111122223333</code>
     *
     * @return The AWS account number of the owner of the security group specified by
     *         the <i>EC2SecurityGroupName</i> parameter. The AWS Access Key ID is
     *         not an acceptable value. <p> Example: <code>111122223333</code>
     */
    public String getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }
    
    /**
     * The AWS account number of the owner of the security group specified by
     * the <i>EC2SecurityGroupName</i> parameter. The AWS Access Key ID is
     * not an acceptable value. <p> Example: <code>111122223333</code>
     *
     * @param eC2SecurityGroupOwnerId The AWS account number of the owner of the security group specified by
     *         the <i>EC2SecurityGroupName</i> parameter. The AWS Access Key ID is
     *         not an acceptable value. <p> Example: <code>111122223333</code>
     */
    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }
    
    /**
     * The AWS account number of the owner of the security group specified by
     * the <i>EC2SecurityGroupName</i> parameter. The AWS Access Key ID is
     * not an acceptable value. <p> Example: <code>111122223333</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupOwnerId The AWS account number of the owner of the security group specified by
     *         the <i>EC2SecurityGroupName</i> parameter. The AWS Access Key ID is
     *         not an acceptable value. <p> Example: <code>111122223333</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AuthorizeClusterSecurityGroupIngressRequest withEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
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
        if (getCIDRIP() != null) sb.append("CIDRIP: " + getCIDRIP() + ",");
        if (getEC2SecurityGroupName() != null) sb.append("EC2SecurityGroupName: " + getEC2SecurityGroupName() + ",");
        if (getEC2SecurityGroupOwnerId() != null) sb.append("EC2SecurityGroupOwnerId: " + getEC2SecurityGroupOwnerId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterSecurityGroupName() == null) ? 0 : getClusterSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getCIDRIP() == null) ? 0 : getCIDRIP().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupName() == null) ? 0 : getEC2SecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupOwnerId() == null) ? 0 : getEC2SecurityGroupOwnerId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AuthorizeClusterSecurityGroupIngressRequest == false) return false;
        AuthorizeClusterSecurityGroupIngressRequest other = (AuthorizeClusterSecurityGroupIngressRequest)obj;
        
        if (other.getClusterSecurityGroupName() == null ^ this.getClusterSecurityGroupName() == null) return false;
        if (other.getClusterSecurityGroupName() != null && other.getClusterSecurityGroupName().equals(this.getClusterSecurityGroupName()) == false) return false; 
        if (other.getCIDRIP() == null ^ this.getCIDRIP() == null) return false;
        if (other.getCIDRIP() != null && other.getCIDRIP().equals(this.getCIDRIP()) == false) return false; 
        if (other.getEC2SecurityGroupName() == null ^ this.getEC2SecurityGroupName() == null) return false;
        if (other.getEC2SecurityGroupName() != null && other.getEC2SecurityGroupName().equals(this.getEC2SecurityGroupName()) == false) return false; 
        if (other.getEC2SecurityGroupOwnerId() == null ^ this.getEC2SecurityGroupOwnerId() == null) return false;
        if (other.getEC2SecurityGroupOwnerId() != null && other.getEC2SecurityGroupOwnerId().equals(this.getEC2SecurityGroupOwnerId()) == false) return false; 
        return true;
    }
    
}
    
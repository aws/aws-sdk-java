/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.AttachClassicLinkVpcRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#attachClassicLinkVpc(AttachClassicLinkVpcRequest) AttachClassicLinkVpc operation}.
 * <p>
 * Links an EC2-Classic instance to a ClassicLink-enabled VPC through one
 * or more of the VPC's security groups. You cannot link an EC2-Classic
 * instance to more than one VPC at a time. You can only link an instance
 * that's in the <code>running</code> state. An instance is automatically
 * unlinked from a VPC when it's stopped - you can link it to the VPC
 * again when you restart it.
 * </p>
 * <p>
 * After you've linked an instance, you cannot change the VPC security
 * groups that are associated with it. To change the security groups, you
 * must first unlink the instance, and then link it again.
 * </p>
 * <p>
 * Linking your instance to a VPC is sometimes referred to as
 * <i>attaching</i> your instance.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#attachClassicLinkVpc(AttachClassicLinkVpcRequest)
 */
public class AttachClassicLinkVpcRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<AttachClassicLinkVpcRequest> {

    /**
     * The ID of an EC2-Classic instance to link to the ClassicLink-enabled
     * VPC.
     */
    private String instanceId;

    /**
     * The ID of a ClassicLink-enabled VPC.
     */
    private String vpcId;

    /**
     * The ID of one or more of the VPC's security groups. You cannot specify
     * security groups from a different VPC.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groups;

    /**
     * The ID of an EC2-Classic instance to link to the ClassicLink-enabled
     * VPC.
     *
     * @return The ID of an EC2-Classic instance to link to the ClassicLink-enabled
     *         VPC.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of an EC2-Classic instance to link to the ClassicLink-enabled
     * VPC.
     *
     * @param instanceId The ID of an EC2-Classic instance to link to the ClassicLink-enabled
     *         VPC.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of an EC2-Classic instance to link to the ClassicLink-enabled
     * VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of an EC2-Classic instance to link to the ClassicLink-enabled
     *         VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttachClassicLinkVpcRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The ID of a ClassicLink-enabled VPC.
     *
     * @return The ID of a ClassicLink-enabled VPC.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of a ClassicLink-enabled VPC.
     *
     * @param vpcId The ID of a ClassicLink-enabled VPC.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of a ClassicLink-enabled VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of a ClassicLink-enabled VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttachClassicLinkVpcRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The ID of one or more of the VPC's security groups. You cannot specify
     * security groups from a different VPC.
     *
     * @return The ID of one or more of the VPC's security groups. You cannot specify
     *         security groups from a different VPC.
     */
    public java.util.List<String> getGroups() {
        if (groups == null) {
              groups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groups.setAutoConstruct(true);
        }
        return groups;
    }
    
    /**
     * The ID of one or more of the VPC's security groups. You cannot specify
     * security groups from a different VPC.
     *
     * @param groups The ID of one or more of the VPC's security groups. You cannot specify
     *         security groups from a different VPC.
     */
    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groups.size());
        groupsCopy.addAll(groups);
        this.groups = groupsCopy;
    }
    
    /**
     * The ID of one or more of the VPC's security groups. You cannot specify
     * security groups from a different VPC.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setGroups(java.util.Collection)} or {@link
     * #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The ID of one or more of the VPC's security groups. You cannot specify
     *         security groups from a different VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttachClassicLinkVpcRequest withGroups(String... groups) {
        if (getGroups() == null) setGroups(new java.util.ArrayList<String>(groups.length));
        for (String value : groups) {
            getGroups().add(value);
        }
        return this;
    }
    
    /**
     * The ID of one or more of the VPC's security groups. You cannot specify
     * security groups from a different VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The ID of one or more of the VPC's security groups. You cannot specify
     *         security groups from a different VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttachClassicLinkVpcRequest withGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groups.size());
            groupsCopy.addAll(groups);
            this.groups = groupsCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<AttachClassicLinkVpcRequest> getDryRunRequest() {
        Request<AttachClassicLinkVpcRequest> request = new AttachClassicLinkVpcRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getGroups() != null) sb.append("Groups: " + getGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AttachClassicLinkVpcRequest == false) return false;
        AttachClassicLinkVpcRequest other = (AttachClassicLinkVpcRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getGroups() == null ^ this.getGroups() == null) return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false) return false; 
        return true;
    }
    
    @Override
    public AttachClassicLinkVpcRequest clone() {
        
            return (AttachClassicLinkVpcRequest) super.clone();
    }

}
    
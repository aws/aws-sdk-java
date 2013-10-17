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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateSecurityGroupRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createSecurityGroup(CreateSecurityGroupRequest) CreateSecurityGroup operation}.
 * <p>
 * The CreateSecurityGroup operation creates a new security group.
 * </p>
 * <p>
 * Every instance is launched in a security group. If no security group is specified during launch, the instances are launched in the default security
 * group. Instances within the same security group have unrestricted network access to each other. Instances will reject network access attempts from
 * other instances in a different security group. As the owner of instances you can grant or revoke specific permissions using the
 * AuthorizeSecurityGroupIngress and RevokeSecurityGroupIngress operations.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createSecurityGroup(CreateSecurityGroupRequest)
 */
public class CreateSecurityGroupRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateSecurityGroupRequest> {

    /**
     * Name of the security group.
     */
    private String groupName;

    /**
     * Description of the group. This is informational only.
     */
    private String description;

    /**
     * ID of the VPC.
     */
    private String vpcId;

    /**
     * Default constructor for a new CreateSecurityGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateSecurityGroupRequest() {}
    
    /**
     * Constructs a new CreateSecurityGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param groupName Name of the security group.
     * @param description Description of the group. This is informational
     * only.
     */
    public CreateSecurityGroupRequest(String groupName, String description) {
        setGroupName(groupName);
        setDescription(description);
    }

    /**
     * Name of the security group.
     *
     * @return Name of the security group.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * Name of the security group.
     *
     * @param groupName Name of the security group.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * Name of the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName Name of the security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateSecurityGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Description of the group. This is informational only.
     *
     * @return Description of the group. This is informational only.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Description of the group. This is informational only.
     *
     * @param description Description of the group. This is informational only.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Description of the group. This is informational only.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description Description of the group. This is informational only.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateSecurityGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * ID of the VPC.
     *
     * @return ID of the VPC.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * ID of the VPC.
     *
     * @param vpcId ID of the VPC.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * ID of the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId ID of the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateSecurityGroupRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateSecurityGroupRequest> getDryRunRequest() {
        Request<CreateSecurityGroupRequest> request = new CreateSecurityGroupRequestMarshaller().marshall(this);
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
        if (getGroupName() != null) sb.append("GroupName: " + getGroupName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateSecurityGroupRequest == false) return false;
        CreateSecurityGroupRequest other = (CreateSecurityGroupRequest)obj;
        
        if (other.getGroupName() == null ^ this.getGroupName() == null) return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        return true;
    }
    
}
    
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateSecurityGroupRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createSecurityGroup(CreateSecurityGroupRequest) CreateSecurityGroup operation}.
 * <p>
 * Creates a security group.
 * </p>
 * <p>
 * A security group is for use with instances either in the EC2-Classic
 * platform or in a specific VPC. For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"> Amazon EC2 Security Groups </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> and <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"> Security Groups for Your VPC </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 * <p>
 * <b>IMPORTANT:</b> EC2-Classic: You can have up to 500 security groups.
 * EC2-VPC: You can create up to 100 security groups per VPC.
 * </p>
 * <p>
 * When you create a security group, you specify a friendly name of your
 * choice. You can have a security group for use in EC2-Classic with the
 * same name as a security group for use in a VPC. However, you can't
 * have two security groups for use in EC2-Classic with the same name or
 * two security groups for use in a VPC with the same name.
 * </p>
 * <p>
 * You have a default security group for use in EC2-Classic and a default
 * security group for use in your VPC. If you don't specify a security
 * group when you launch an instance, the instance is launched into the
 * appropriate default security group. A default security group includes
 * a default rule that grants instances unrestricted network access to
 * each other.
 * </p>
 * <p>
 * You can add or remove rules from your security groups using
 * AuthorizeSecurityGroupIngress, AuthorizeSecurityGroupEgress,
 * RevokeSecurityGroupIngress, and RevokeSecurityGroupEgress.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createSecurityGroup(CreateSecurityGroupRequest)
 */
public class CreateSecurityGroupRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateSecurityGroupRequest> {

    /**
     * The name of the security group. <p>Constraints: Up to 255 characters
     * in length <p>Constraints for EC2-Classic: ASCII characters
     * <p>Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=&;{}!$*
     */
    private String groupName;

    /**
     * A description for the security group. This is informational only.
     */
    private String description;

    /**
     * [EC2-VPC] The ID of the VPC.
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
     * @param groupName The name of the security group. <p>Constraints: Up to
     * 255 characters in length <p>Constraints for EC2-Classic: ASCII
     * characters <p>Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=&;{}!$*
     * @param description A description for the security group. This is
     * informational only.
     */
    public CreateSecurityGroupRequest(String groupName, String description) {
        setGroupName(groupName);
        setDescription(description);
    }

    /**
     * The name of the security group. <p>Constraints: Up to 255 characters
     * in length <p>Constraints for EC2-Classic: ASCII characters
     * <p>Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=&;{}!$*
     *
     * @return The name of the security group. <p>Constraints: Up to 255 characters
     *         in length <p>Constraints for EC2-Classic: ASCII characters
     *         <p>Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     *         ._-:/()#,@[]+=&;{}!$*
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * The name of the security group. <p>Constraints: Up to 255 characters
     * in length <p>Constraints for EC2-Classic: ASCII characters
     * <p>Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=&;{}!$*
     *
     * @param groupName The name of the security group. <p>Constraints: Up to 255 characters
     *         in length <p>Constraints for EC2-Classic: ASCII characters
     *         <p>Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     *         ._-:/()#,@[]+=&;{}!$*
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * The name of the security group. <p>Constraints: Up to 255 characters
     * in length <p>Constraints for EC2-Classic: ASCII characters
     * <p>Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=&;{}!$*
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName The name of the security group. <p>Constraints: Up to 255 characters
     *         in length <p>Constraints for EC2-Classic: ASCII characters
     *         <p>Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     *         ._-:/()#,@[]+=&;{}!$*
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateSecurityGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * A description for the security group. This is informational only.
     *
     * @return A description for the security group. This is informational only.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description for the security group. This is informational only.
     *
     * @param description A description for the security group. This is informational only.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description for the security group. This is informational only.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description for the security group. This is informational only.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateSecurityGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * [EC2-VPC] The ID of the VPC.
     *
     * @return [EC2-VPC] The ID of the VPC.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * [EC2-VPC] The ID of the VPC.
     *
     * @param vpcId [EC2-VPC] The ID of the VPC.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * [EC2-VPC] The ID of the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId [EC2-VPC] The ID of the VPC.
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
    
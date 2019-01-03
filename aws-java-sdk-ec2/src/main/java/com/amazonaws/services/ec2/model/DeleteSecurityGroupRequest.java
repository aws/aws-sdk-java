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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteSecurityGroupRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSecurityGroupRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteSecurityGroupRequest> {

    /**
     * <p>
     * The ID of the security group. Required for a nondefault VPC.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You can specify either the security group name or the
     * security group ID.
     * </p>
     */
    private String groupName;

    /**
     * Default constructor for DeleteSecurityGroupRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DeleteSecurityGroupRequest() {
    }

    /**
     * Constructs a new DeleteSecurityGroupRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param groupName
     *        [EC2-Classic, default VPC] The name of the security group. You can specify either the security group name
     *        or the security group ID.
     */
    public DeleteSecurityGroupRequest(String groupName) {
        setGroupName(groupName);
    }

    /**
     * <p>
     * The ID of the security group. Required for a nondefault VPC.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group. Required for a nondefault VPC.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The ID of the security group. Required for a nondefault VPC.
     * </p>
     * 
     * @return The ID of the security group. Required for a nondefault VPC.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The ID of the security group. Required for a nondefault VPC.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group. Required for a nondefault VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSecurityGroupRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You can specify either the security group name or the
     * security group ID.
     * </p>
     * 
     * @param groupName
     *        [EC2-Classic, default VPC] The name of the security group. You can specify either the security group name
     *        or the security group ID.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You can specify either the security group name or the
     * security group ID.
     * </p>
     * 
     * @return [EC2-Classic, default VPC] The name of the security group. You can specify either the security group name
     *         or the security group ID.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You can specify either the security group name or the
     * security group ID.
     * </p>
     * 
     * @param groupName
     *        [EC2-Classic, default VPC] The name of the security group. You can specify either the security group name
     *        or the security group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSecurityGroupRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteSecurityGroupRequest> getDryRunRequest() {
        Request<DeleteSecurityGroupRequest> request = new DeleteSecurityGroupRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSecurityGroupRequest == false)
            return false;
        DeleteSecurityGroupRequest other = (DeleteSecurityGroupRequest) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSecurityGroupRequest clone() {
        return (DeleteSecurityGroupRequest) super.clone();
    }
}

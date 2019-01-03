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
import com.amazonaws.services.ec2.model.transform.AttachClassicLinkVpcRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachClassicLinkVpcRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<AttachClassicLinkVpcRequest> {

    /**
     * <p>
     * The ID of one or more of the VPC's security groups. You cannot specify security groups from a different VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groups;
    /**
     * <p>
     * The ID of an EC2-Classic instance to link to the ClassicLink-enabled VPC.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ID of one or more of the VPC's security groups. You cannot specify security groups from a different VPC.
     * </p>
     * 
     * @return The ID of one or more of the VPC's security groups. You cannot specify security groups from a different
     *         VPC.
     */

    public java.util.List<String> getGroups() {
        if (groups == null) {
            groups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groups;
    }

    /**
     * <p>
     * The ID of one or more of the VPC's security groups. You cannot specify security groups from a different VPC.
     * </p>
     * 
     * @param groups
     *        The ID of one or more of the VPC's security groups. You cannot specify security groups from a different
     *        VPC.
     */

    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new com.amazonaws.internal.SdkInternalList<String>(groups);
    }

    /**
     * <p>
     * The ID of one or more of the VPC's security groups. You cannot specify security groups from a different VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The ID of one or more of the VPC's security groups. You cannot specify security groups from a different
     *        VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachClassicLinkVpcRequest withGroups(String... groups) {
        if (this.groups == null) {
            setGroups(new com.amazonaws.internal.SdkInternalList<String>(groups.length));
        }
        for (String ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of one or more of the VPC's security groups. You cannot specify security groups from a different VPC.
     * </p>
     * 
     * @param groups
     *        The ID of one or more of the VPC's security groups. You cannot specify security groups from a different
     *        VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachClassicLinkVpcRequest withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The ID of an EC2-Classic instance to link to the ClassicLink-enabled VPC.
     * </p>
     * 
     * @param instanceId
     *        The ID of an EC2-Classic instance to link to the ClassicLink-enabled VPC.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of an EC2-Classic instance to link to the ClassicLink-enabled VPC.
     * </p>
     * 
     * @return The ID of an EC2-Classic instance to link to the ClassicLink-enabled VPC.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of an EC2-Classic instance to link to the ClassicLink-enabled VPC.
     * </p>
     * 
     * @param instanceId
     *        The ID of an EC2-Classic instance to link to the ClassicLink-enabled VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachClassicLinkVpcRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of a ClassicLink-enabled VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC.
     * </p>
     * 
     * @return The ID of a ClassicLink-enabled VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of a ClassicLink-enabled VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachClassicLinkVpcRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AttachClassicLinkVpcRequest> getDryRunRequest() {
        Request<AttachClassicLinkVpcRequest> request = new AttachClassicLinkVpcRequestMarshaller().marshall(this);
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
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachClassicLinkVpcRequest == false)
            return false;
        AttachClassicLinkVpcRequest other = (AttachClassicLinkVpcRequest) obj;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public AttachClassicLinkVpcRequest clone() {
        return (AttachClassicLinkVpcRequest) super.clone();
    }
}

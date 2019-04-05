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
import com.amazonaws.services.ec2.model.transform.ModifyNetworkInterfaceAttributeRequestMarshaller;

/**
 * <p>
 * Contains the parameters for ModifyNetworkInterfaceAttribute.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyNetworkInterfaceAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyNetworkInterfaceAttributeRequest> {

    /**
     * <p>
     * Information about the interface attachment. If modifying the 'delete on termination' attribute, you must specify
     * the ID of the interface attachment.
     * </p>
     */
    private NetworkInterfaceAttachmentChanges attachment;
    /**
     * <p>
     * A description for the network interface.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Changes the security groups for the network interface. The new set of groups you specify replaces the current
     * set. You must specify at least one group, even if it's just the default security group in the VPC. You must
     * specify the ID of the security group, not the name.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groups;
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of <code>true</code> means checking is enabled,
     * and <code>false</code> means checking is disabled. This value must be <code>false</code> for a NAT instance to
     * perform NAT. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT Instances</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     */
    private Boolean sourceDestCheck;

    /**
     * <p>
     * Information about the interface attachment. If modifying the 'delete on termination' attribute, you must specify
     * the ID of the interface attachment.
     * </p>
     * 
     * @param attachment
     *        Information about the interface attachment. If modifying the 'delete on termination' attribute, you must
     *        specify the ID of the interface attachment.
     */

    public void setAttachment(NetworkInterfaceAttachmentChanges attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * Information about the interface attachment. If modifying the 'delete on termination' attribute, you must specify
     * the ID of the interface attachment.
     * </p>
     * 
     * @return Information about the interface attachment. If modifying the 'delete on termination' attribute, you must
     *         specify the ID of the interface attachment.
     */

    public NetworkInterfaceAttachmentChanges getAttachment() {
        return this.attachment;
    }

    /**
     * <p>
     * Information about the interface attachment. If modifying the 'delete on termination' attribute, you must specify
     * the ID of the interface attachment.
     * </p>
     * 
     * @param attachment
     *        Information about the interface attachment. If modifying the 'delete on termination' attribute, you must
     *        specify the ID of the interface attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withAttachment(NetworkInterfaceAttachmentChanges attachment) {
        setAttachment(attachment);
        return this;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     * 
     * @param description
     *        A description for the network interface.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     * 
     * @return A description for the network interface.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     * 
     * @param description
     *        A description for the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Changes the security groups for the network interface. The new set of groups you specify replaces the current
     * set. You must specify at least one group, even if it's just the default security group in the VPC. You must
     * specify the ID of the security group, not the name.
     * </p>
     * 
     * @return Changes the security groups for the network interface. The new set of groups you specify replaces the
     *         current set. You must specify at least one group, even if it's just the default security group in the
     *         VPC. You must specify the ID of the security group, not the name.
     */

    public java.util.List<String> getGroups() {
        if (groups == null) {
            groups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groups;
    }

    /**
     * <p>
     * Changes the security groups for the network interface. The new set of groups you specify replaces the current
     * set. You must specify at least one group, even if it's just the default security group in the VPC. You must
     * specify the ID of the security group, not the name.
     * </p>
     * 
     * @param groups
     *        Changes the security groups for the network interface. The new set of groups you specify replaces the
     *        current set. You must specify at least one group, even if it's just the default security group in the VPC.
     *        You must specify the ID of the security group, not the name.
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
     * Changes the security groups for the network interface. The new set of groups you specify replaces the current
     * set. You must specify at least one group, even if it's just the default security group in the VPC. You must
     * specify the ID of the security group, not the name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        Changes the security groups for the network interface. The new set of groups you specify replaces the
     *        current set. You must specify at least one group, even if it's just the default security group in the VPC.
     *        You must specify the ID of the security group, not the name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withGroups(String... groups) {
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
     * Changes the security groups for the network interface. The new set of groups you specify replaces the current
     * set. You must specify at least one group, even if it's just the default security group in the VPC. You must
     * specify the ID of the security group, not the name.
     * </p>
     * 
     * @param groups
     *        Changes the security groups for the network interface. The new set of groups you specify replaces the
     *        current set. You must specify at least one group, even if it's just the default security group in the VPC.
     *        You must specify the ID of the security group, not the name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @return The ID of the network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of <code>true</code> means checking is enabled,
     * and <code>false</code> means checking is disabled. This value must be <code>false</code> for a NAT instance to
     * perform NAT. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT Instances</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param sourceDestCheck
     *        Indicates whether source/destination checking is enabled. A value of <code>true</code> means checking is
     *        enabled, and <code>false</code> means checking is disabled. This value must be <code>false</code> for a
     *        NAT instance to perform NAT. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT Instances</a> in
     *        the <i>Amazon Virtual Private Cloud User Guide</i>.
     */

    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of <code>true</code> means checking is enabled,
     * and <code>false</code> means checking is disabled. This value must be <code>false</code> for a NAT instance to
     * perform NAT. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT Instances</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @return Indicates whether source/destination checking is enabled. A value of <code>true</code> means checking is
     *         enabled, and <code>false</code> means checking is disabled. This value must be <code>false</code> for a
     *         NAT instance to perform NAT. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT Instances</a> in
     *         the <i>Amazon Virtual Private Cloud User Guide</i>.
     */

    public Boolean getSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of <code>true</code> means checking is enabled,
     * and <code>false</code> means checking is disabled. This value must be <code>false</code> for a NAT instance to
     * perform NAT. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT Instances</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param sourceDestCheck
     *        Indicates whether source/destination checking is enabled. A value of <code>true</code> means checking is
     *        enabled, and <code>false</code> means checking is disabled. This value must be <code>false</code> for a
     *        NAT instance to perform NAT. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT Instances</a> in
     *        the <i>Amazon Virtual Private Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withSourceDestCheck(Boolean sourceDestCheck) {
        setSourceDestCheck(sourceDestCheck);
        return this;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of <code>true</code> means checking is enabled,
     * and <code>false</code> means checking is disabled. This value must be <code>false</code> for a NAT instance to
     * perform NAT. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT Instances</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @return Indicates whether source/destination checking is enabled. A value of <code>true</code> means checking is
     *         enabled, and <code>false</code> means checking is disabled. This value must be <code>false</code> for a
     *         NAT instance to perform NAT. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT Instances</a> in
     *         the <i>Amazon Virtual Private Cloud User Guide</i>.
     */

    public Boolean isSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyNetworkInterfaceAttributeRequest> getDryRunRequest() {
        Request<ModifyNetworkInterfaceAttributeRequest> request = new ModifyNetworkInterfaceAttributeRequestMarshaller().marshall(this);
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
        if (getAttachment() != null)
            sb.append("Attachment: ").append(getAttachment()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getSourceDestCheck() != null)
            sb.append("SourceDestCheck: ").append(getSourceDestCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyNetworkInterfaceAttributeRequest == false)
            return false;
        ModifyNetworkInterfaceAttributeRequest other = (ModifyNetworkInterfaceAttributeRequest) obj;
        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getSourceDestCheck() == null ^ this.getSourceDestCheck() == null)
            return false;
        if (other.getSourceDestCheck() != null && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck().hashCode());
        return hashCode;
    }

    @Override
    public ModifyNetworkInterfaceAttributeRequest clone() {
        return (ModifyNetworkInterfaceAttributeRequest) super.clone();
    }
}

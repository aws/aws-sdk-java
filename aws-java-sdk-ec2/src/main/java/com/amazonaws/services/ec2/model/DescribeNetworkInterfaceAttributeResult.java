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

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of DescribeNetworkInterfaceAttribute.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInterfaceAttributeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The attachment (if any) of the network interface.
     * </p>
     */
    private NetworkInterfaceAttachment attachment;
    /**
     * <p>
     * The description of the network interface.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The security groups associated with the network interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GroupIdentifier> groups;
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * Indicates whether source/destination checking is enabled.
     * </p>
     */
    private Boolean sourceDestCheck;

    /**
     * <p>
     * The attachment (if any) of the network interface.
     * </p>
     * 
     * @param attachment
     *        The attachment (if any) of the network interface.
     */

    public void setAttachment(NetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * The attachment (if any) of the network interface.
     * </p>
     * 
     * @return The attachment (if any) of the network interface.
     */

    public NetworkInterfaceAttachment getAttachment() {
        return this.attachment;
    }

    /**
     * <p>
     * The attachment (if any) of the network interface.
     * </p>
     * 
     * @param attachment
     *        The attachment (if any) of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfaceAttributeResult withAttachment(NetworkInterfaceAttachment attachment) {
        setAttachment(attachment);
        return this;
    }

    /**
     * <p>
     * The description of the network interface.
     * </p>
     * 
     * @param description
     *        The description of the network interface.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the network interface.
     * </p>
     * 
     * @return The description of the network interface.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the network interface.
     * </p>
     * 
     * @param description
     *        The description of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfaceAttributeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The security groups associated with the network interface.
     * </p>
     * 
     * @return The security groups associated with the network interface.
     */

    public java.util.List<GroupIdentifier> getGroups() {
        if (groups == null) {
            groups = new com.amazonaws.internal.SdkInternalList<GroupIdentifier>();
        }
        return groups;
    }

    /**
     * <p>
     * The security groups associated with the network interface.
     * </p>
     * 
     * @param groups
     *        The security groups associated with the network interface.
     */

    public void setGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new com.amazonaws.internal.SdkInternalList<GroupIdentifier>(groups);
    }

    /**
     * <p>
     * The security groups associated with the network interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The security groups associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfaceAttributeResult withGroups(GroupIdentifier... groups) {
        if (this.groups == null) {
            setGroups(new com.amazonaws.internal.SdkInternalList<GroupIdentifier>(groups.length));
        }
        for (GroupIdentifier ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups associated with the network interface.
     * </p>
     * 
     * @param groups
     *        The security groups associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfaceAttributeResult withGroups(java.util.Collection<GroupIdentifier> groups) {
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

    public DescribeNetworkInterfaceAttributeResult withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled.
     * </p>
     * 
     * @param sourceDestCheck
     *        Indicates whether source/destination checking is enabled.
     */

    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled.
     * </p>
     * 
     * @return Indicates whether source/destination checking is enabled.
     */

    public Boolean getSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled.
     * </p>
     * 
     * @param sourceDestCheck
     *        Indicates whether source/destination checking is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfaceAttributeResult withSourceDestCheck(Boolean sourceDestCheck) {
        setSourceDestCheck(sourceDestCheck);
        return this;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled.
     * </p>
     * 
     * @return Indicates whether source/destination checking is enabled.
     */

    public Boolean isSourceDestCheck() {
        return this.sourceDestCheck;
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

        if (obj instanceof DescribeNetworkInterfaceAttributeResult == false)
            return false;
        DescribeNetworkInterfaceAttributeResult other = (DescribeNetworkInterfaceAttributeResult) obj;
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
    public DescribeNetworkInterfaceAttributeResult clone() {
        try {
            return (DescribeNetworkInterfaceAttributeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

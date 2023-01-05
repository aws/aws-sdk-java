/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateVpcAttachment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcAttachmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of a core network for the VPC attachment.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * The ARN of the VPC.
     * </p>
     */
    private String vpcArn;
    /**
     * <p>
     * The subnet ARN of the VPC attachment.
     * </p>
     */
    private java.util.List<String> subnetArns;
    /**
     * <p>
     * Options for the VPC attachment.
     * </p>
     */
    private VpcOptions options;
    /**
     * <p>
     * The key-value tags associated with the request.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The client token associated with the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of a core network for the VPC attachment.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network for the VPC attachment.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network for the VPC attachment.
     * </p>
     * 
     * @return The ID of a core network for the VPC attachment.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network for the VPC attachment.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network for the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcAttachmentRequest withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * The ARN of the VPC.
     * </p>
     * 
     * @param vpcArn
     *        The ARN of the VPC.
     */

    public void setVpcArn(String vpcArn) {
        this.vpcArn = vpcArn;
    }

    /**
     * <p>
     * The ARN of the VPC.
     * </p>
     * 
     * @return The ARN of the VPC.
     */

    public String getVpcArn() {
        return this.vpcArn;
    }

    /**
     * <p>
     * The ARN of the VPC.
     * </p>
     * 
     * @param vpcArn
     *        The ARN of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcAttachmentRequest withVpcArn(String vpcArn) {
        setVpcArn(vpcArn);
        return this;
    }

    /**
     * <p>
     * The subnet ARN of the VPC attachment.
     * </p>
     * 
     * @return The subnet ARN of the VPC attachment.
     */

    public java.util.List<String> getSubnetArns() {
        return subnetArns;
    }

    /**
     * <p>
     * The subnet ARN of the VPC attachment.
     * </p>
     * 
     * @param subnetArns
     *        The subnet ARN of the VPC attachment.
     */

    public void setSubnetArns(java.util.Collection<String> subnetArns) {
        if (subnetArns == null) {
            this.subnetArns = null;
            return;
        }

        this.subnetArns = new java.util.ArrayList<String>(subnetArns);
    }

    /**
     * <p>
     * The subnet ARN of the VPC attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetArns(java.util.Collection)} or {@link #withSubnetArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetArns
     *        The subnet ARN of the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcAttachmentRequest withSubnetArns(String... subnetArns) {
        if (this.subnetArns == null) {
            setSubnetArns(new java.util.ArrayList<String>(subnetArns.length));
        }
        for (String ele : subnetArns) {
            this.subnetArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subnet ARN of the VPC attachment.
     * </p>
     * 
     * @param subnetArns
     *        The subnet ARN of the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcAttachmentRequest withSubnetArns(java.util.Collection<String> subnetArns) {
        setSubnetArns(subnetArns);
        return this;
    }

    /**
     * <p>
     * Options for the VPC attachment.
     * </p>
     * 
     * @param options
     *        Options for the VPC attachment.
     */

    public void setOptions(VpcOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * Options for the VPC attachment.
     * </p>
     * 
     * @return Options for the VPC attachment.
     */

    public VpcOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * Options for the VPC attachment.
     * </p>
     * 
     * @param options
     *        Options for the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcAttachmentRequest withOptions(VpcOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The key-value tags associated with the request.
     * </p>
     * 
     * @return The key-value tags associated with the request.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value tags associated with the request.
     * </p>
     * 
     * @param tags
     *        The key-value tags associated with the request.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The key-value tags associated with the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key-value tags associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcAttachmentRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key-value tags associated with the request.
     * </p>
     * 
     * @param tags
     *        The key-value tags associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcAttachmentRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The client token associated with the request.
     * </p>
     * 
     * @param clientToken
     *        The client token associated with the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token associated with the request.
     * </p>
     * 
     * @return The client token associated with the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token associated with the request.
     * </p>
     * 
     * @param clientToken
     *        The client token associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcAttachmentRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
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
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getVpcArn() != null)
            sb.append("VpcArn: ").append(getVpcArn()).append(",");
        if (getSubnetArns() != null)
            sb.append("SubnetArns: ").append(getSubnetArns()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcAttachmentRequest == false)
            return false;
        CreateVpcAttachmentRequest other = (CreateVpcAttachmentRequest) obj;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getVpcArn() == null ^ this.getVpcArn() == null)
            return false;
        if (other.getVpcArn() != null && other.getVpcArn().equals(this.getVpcArn()) == false)
            return false;
        if (other.getSubnetArns() == null ^ this.getSubnetArns() == null)
            return false;
        if (other.getSubnetArns() != null && other.getSubnetArns().equals(this.getSubnetArns()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getVpcArn() == null) ? 0 : getVpcArn().hashCode());
        hashCode = prime * hashCode + ((getSubnetArns() == null) ? 0 : getSubnetArns().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcAttachmentRequest clone() {
        return (CreateVpcAttachmentRequest) super.clone();
    }

}

/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * CreateAgentRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateAgent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAgentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies your DataSync agent's activation key. If you don't have an activation key, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/activate-agent.html">Activate your agent</a>.
     * </p>
     */
    private String activationKey;
    /**
     * <p>
     * Specifies a name for your agent. You can see this name in the DataSync console.
     * </p>
     */
    private String agentName;
    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least one tag for your agent.
     * </p>
     */
    private java.util.List<TagListEntry> tags;
    /**
     * <p>
     * Specifies the ID of the VPC endpoint that you want your agent to connect to. For example, a VPC endpoint ID looks
     * like <code>vpce-01234d5aff67890e1</code>.
     * </p>
     * <important>
     * <p>
     * The VPC endpoint you use must include the DataSync service name (for example,
     * <code>com.amazonaws.us-east-2.datasync</code>).
     * </p>
     * </important>
     */
    private String vpcEndpointId;
    /**
     * <p>
     * Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC endpoint. This is the
     * subnet where DataSync creates and manages the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> for your transfer. You can only specify one ARN.
     * </p>
     */
    private java.util.List<String> subnetArns;
    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the security group that protects your task's <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> when <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/choose-service-endpoint.html#choose-service-endpoint-vpc"
     * >using a virtual private cloud (VPC) endpoint</a>. You can only specify one ARN.
     * </p>
     */
    private java.util.List<String> securityGroupArns;

    /**
     * <p>
     * Specifies your DataSync agent's activation key. If you don't have an activation key, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/activate-agent.html">Activate your agent</a>.
     * </p>
     * 
     * @param activationKey
     *        Specifies your DataSync agent's activation key. If you don't have an activation key, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/activate-agent.html">Activate your agent</a>.
     */

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    /**
     * <p>
     * Specifies your DataSync agent's activation key. If you don't have an activation key, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/activate-agent.html">Activate your agent</a>.
     * </p>
     * 
     * @return Specifies your DataSync agent's activation key. If you don't have an activation key, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/activate-agent.html">Activate your agent</a>.
     */

    public String getActivationKey() {
        return this.activationKey;
    }

    /**
     * <p>
     * Specifies your DataSync agent's activation key. If you don't have an activation key, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/activate-agent.html">Activate your agent</a>.
     * </p>
     * 
     * @param activationKey
     *        Specifies your DataSync agent's activation key. If you don't have an activation key, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/activate-agent.html">Activate your agent</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withActivationKey(String activationKey) {
        setActivationKey(activationKey);
        return this;
    }

    /**
     * <p>
     * Specifies a name for your agent. You can see this name in the DataSync console.
     * </p>
     * 
     * @param agentName
     *        Specifies a name for your agent. You can see this name in the DataSync console.
     */

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     * <p>
     * Specifies a name for your agent. You can see this name in the DataSync console.
     * </p>
     * 
     * @return Specifies a name for your agent. You can see this name in the DataSync console.
     */

    public String getAgentName() {
        return this.agentName;
    }

    /**
     * <p>
     * Specifies a name for your agent. You can see this name in the DataSync console.
     * </p>
     * 
     * @param agentName
     *        Specifies a name for your agent. You can see this name in the DataSync console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withAgentName(String agentName) {
        setAgentName(agentName);
        return this;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least one tag for your agent.
     * </p>
     * 
     * @return Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *         recommend creating at least one tag for your agent.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least one tag for your agent.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least one tag for your agent.
     */

    public void setTags(java.util.Collection<TagListEntry> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagListEntry>(tags);
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least one tag for your agent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least one tag for your agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withTags(TagListEntry... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagListEntry>(tags.length));
        }
        for (TagListEntry ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least one tag for your agent.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least one tag for your agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withTags(java.util.Collection<TagListEntry> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies the ID of the VPC endpoint that you want your agent to connect to. For example, a VPC endpoint ID looks
     * like <code>vpce-01234d5aff67890e1</code>.
     * </p>
     * <important>
     * <p>
     * The VPC endpoint you use must include the DataSync service name (for example,
     * <code>com.amazonaws.us-east-2.datasync</code>).
     * </p>
     * </important>
     * 
     * @param vpcEndpointId
     *        Specifies the ID of the VPC endpoint that you want your agent to connect to. For example, a VPC endpoint
     *        ID looks like <code>vpce-01234d5aff67890e1</code>.</p> <important>
     *        <p>
     *        The VPC endpoint you use must include the DataSync service name (for example,
     *        <code>com.amazonaws.us-east-2.datasync</code>).
     *        </p>
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * Specifies the ID of the VPC endpoint that you want your agent to connect to. For example, a VPC endpoint ID looks
     * like <code>vpce-01234d5aff67890e1</code>.
     * </p>
     * <important>
     * <p>
     * The VPC endpoint you use must include the DataSync service name (for example,
     * <code>com.amazonaws.us-east-2.datasync</code>).
     * </p>
     * </important>
     * 
     * @return Specifies the ID of the VPC endpoint that you want your agent to connect to. For example, a VPC endpoint
     *         ID looks like <code>vpce-01234d5aff67890e1</code>.</p> <important>
     *         <p>
     *         The VPC endpoint you use must include the DataSync service name (for example,
     *         <code>com.amazonaws.us-east-2.datasync</code>).
     *         </p>
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * Specifies the ID of the VPC endpoint that you want your agent to connect to. For example, a VPC endpoint ID looks
     * like <code>vpce-01234d5aff67890e1</code>.
     * </p>
     * <important>
     * <p>
     * The VPC endpoint you use must include the DataSync service name (for example,
     * <code>com.amazonaws.us-east-2.datasync</code>).
     * </p>
     * </important>
     * 
     * @param vpcEndpointId
     *        Specifies the ID of the VPC endpoint that you want your agent to connect to. For example, a VPC endpoint
     *        ID looks like <code>vpce-01234d5aff67890e1</code>.</p> <important>
     *        <p>
     *        The VPC endpoint you use must include the DataSync service name (for example,
     *        <code>com.amazonaws.us-east-2.datasync</code>).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC endpoint. This is the
     * subnet where DataSync creates and manages the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> for your transfer. You can only specify one ARN.
     * </p>
     * 
     * @return Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC endpoint. This
     *         is the subnet where DataSync creates and manages the <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *         >network interfaces</a> for your transfer. You can only specify one ARN.
     */

    public java.util.List<String> getSubnetArns() {
        return subnetArns;
    }

    /**
     * <p>
     * Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC endpoint. This is the
     * subnet where DataSync creates and manages the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> for your transfer. You can only specify one ARN.
     * </p>
     * 
     * @param subnetArns
     *        Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC endpoint. This
     *        is the subnet where DataSync creates and manages the <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >network interfaces</a> for your transfer. You can only specify one ARN.
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
     * Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC endpoint. This is the
     * subnet where DataSync creates and manages the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> for your transfer. You can only specify one ARN.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetArns(java.util.Collection)} or {@link #withSubnetArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetArns
     *        Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC endpoint. This
     *        is the subnet where DataSync creates and manages the <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >network interfaces</a> for your transfer. You can only specify one ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withSubnetArns(String... subnetArns) {
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
     * Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC endpoint. This is the
     * subnet where DataSync creates and manages the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> for your transfer. You can only specify one ARN.
     * </p>
     * 
     * @param subnetArns
     *        Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC endpoint. This
     *        is the subnet where DataSync creates and manages the <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >network interfaces</a> for your transfer. You can only specify one ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withSubnetArns(java.util.Collection<String> subnetArns) {
        setSubnetArns(subnetArns);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the security group that protects your task's <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> when <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/choose-service-endpoint.html#choose-service-endpoint-vpc"
     * >using a virtual private cloud (VPC) endpoint</a>. You can only specify one ARN.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the security group that protects your task's <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *         >network interfaces</a> when <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/choose-service-endpoint.html#choose-service-endpoint-vpc"
     *         >using a virtual private cloud (VPC) endpoint</a>. You can only specify one ARN.
     */

    public java.util.List<String> getSecurityGroupArns() {
        return securityGroupArns;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the security group that protects your task's <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> when <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/choose-service-endpoint.html#choose-service-endpoint-vpc"
     * >using a virtual private cloud (VPC) endpoint</a>. You can only specify one ARN.
     * </p>
     * 
     * @param securityGroupArns
     *        Specifies the Amazon Resource Name (ARN) of the security group that protects your task's <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >network interfaces</a> when <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/choose-service-endpoint.html#choose-service-endpoint-vpc"
     *        >using a virtual private cloud (VPC) endpoint</a>. You can only specify one ARN.
     */

    public void setSecurityGroupArns(java.util.Collection<String> securityGroupArns) {
        if (securityGroupArns == null) {
            this.securityGroupArns = null;
            return;
        }

        this.securityGroupArns = new java.util.ArrayList<String>(securityGroupArns);
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the security group that protects your task's <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> when <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/choose-service-endpoint.html#choose-service-endpoint-vpc"
     * >using a virtual private cloud (VPC) endpoint</a>. You can only specify one ARN.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupArns(java.util.Collection)} or {@link #withSecurityGroupArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityGroupArns
     *        Specifies the Amazon Resource Name (ARN) of the security group that protects your task's <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >network interfaces</a> when <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/choose-service-endpoint.html#choose-service-endpoint-vpc"
     *        >using a virtual private cloud (VPC) endpoint</a>. You can only specify one ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withSecurityGroupArns(String... securityGroupArns) {
        if (this.securityGroupArns == null) {
            setSecurityGroupArns(new java.util.ArrayList<String>(securityGroupArns.length));
        }
        for (String ele : securityGroupArns) {
            this.securityGroupArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the security group that protects your task's <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> when <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/choose-service-endpoint.html#choose-service-endpoint-vpc"
     * >using a virtual private cloud (VPC) endpoint</a>. You can only specify one ARN.
     * </p>
     * 
     * @param securityGroupArns
     *        Specifies the Amazon Resource Name (ARN) of the security group that protects your task's <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >network interfaces</a> when <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/choose-service-endpoint.html#choose-service-endpoint-vpc"
     *        >using a virtual private cloud (VPC) endpoint</a>. You can only specify one ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withSecurityGroupArns(java.util.Collection<String> securityGroupArns) {
        setSecurityGroupArns(securityGroupArns);
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
        if (getActivationKey() != null)
            sb.append("ActivationKey: ").append(getActivationKey()).append(",");
        if (getAgentName() != null)
            sb.append("AgentName: ").append(getAgentName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId()).append(",");
        if (getSubnetArns() != null)
            sb.append("SubnetArns: ").append(getSubnetArns()).append(",");
        if (getSecurityGroupArns() != null)
            sb.append("SecurityGroupArns: ").append(getSecurityGroupArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAgentRequest == false)
            return false;
        CreateAgentRequest other = (CreateAgentRequest) obj;
        if (other.getActivationKey() == null ^ this.getActivationKey() == null)
            return false;
        if (other.getActivationKey() != null && other.getActivationKey().equals(this.getActivationKey()) == false)
            return false;
        if (other.getAgentName() == null ^ this.getAgentName() == null)
            return false;
        if (other.getAgentName() != null && other.getAgentName().equals(this.getAgentName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getSubnetArns() == null ^ this.getSubnetArns() == null)
            return false;
        if (other.getSubnetArns() != null && other.getSubnetArns().equals(this.getSubnetArns()) == false)
            return false;
        if (other.getSecurityGroupArns() == null ^ this.getSecurityGroupArns() == null)
            return false;
        if (other.getSecurityGroupArns() != null && other.getSecurityGroupArns().equals(this.getSecurityGroupArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivationKey() == null) ? 0 : getActivationKey().hashCode());
        hashCode = prime * hashCode + ((getAgentName() == null) ? 0 : getAgentName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getSubnetArns() == null) ? 0 : getSubnetArns().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupArns() == null) ? 0 : getSecurityGroupArns().hashCode());
        return hashCode;
    }

    @Override
    public CreateAgentRequest clone() {
        return (CreateAgentRequest) super.clone();
    }

}

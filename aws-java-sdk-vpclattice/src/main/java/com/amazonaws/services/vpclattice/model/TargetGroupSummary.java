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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about a target group.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/target-groups.html">Target
 * groups</a> in the <i>Amazon VPC Lattice User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/TargetGroupSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetGroupSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the target group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the target group was created, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The ID of the target group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of IP address used for the target group. The possible values are <code>IPV4</code> and <code>IPV6</code>
     * . This is an optional parameter. If not specified, the default is <code>IPV4</code>.
     * </p>
     */
    private String ipAddressType;
    /**
     * <p>
     * The version of the event structure that your Lambda function receives. Supported only if the target group type is
     * <code>LAMBDA</code>.
     * </p>
     */
    private String lambdaEventStructureVersion;
    /**
     * <p>
     * The date and time that the target group was last updated, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The name of the target group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The port of the target group.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The protocol of the target group.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the service.
     * </p>
     */
    private java.util.List<String> serviceArns;
    /**
     * <p>
     * The status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The target group type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The ID of the VPC of the target group.
     * </p>
     */
    private String vpcIdentifier;

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the target group.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) of the target group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the target group.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the target group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the target group.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the target group was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the target group was created, specified in ISO-8601 format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the target group was created, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time that the target group was created, specified in ISO-8601 format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the target group was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the target group was created, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The ID of the target group.
     * </p>
     * 
     * @param id
     *        The ID of the target group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the target group.
     * </p>
     * 
     * @return The ID of the target group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the target group.
     * </p>
     * 
     * @param id
     *        The ID of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of IP address used for the target group. The possible values are <code>IPV4</code> and <code>IPV6</code>
     * . This is an optional parameter. If not specified, the default is <code>IPV4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The type of IP address used for the target group. The possible values are <code>IPV4</code> and
     *        <code>IPV6</code>. This is an optional parameter. If not specified, the default is <code>IPV4</code>.
     * @see IpAddressType
     */

    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * The type of IP address used for the target group. The possible values are <code>IPV4</code> and <code>IPV6</code>
     * . This is an optional parameter. If not specified, the default is <code>IPV4</code>.
     * </p>
     * 
     * @return The type of IP address used for the target group. The possible values are <code>IPV4</code> and
     *         <code>IPV6</code>. This is an optional parameter. If not specified, the default is <code>IPV4</code>.
     * @see IpAddressType
     */

    public String getIpAddressType() {
        return this.ipAddressType;
    }

    /**
     * <p>
     * The type of IP address used for the target group. The possible values are <code>IPV4</code> and <code>IPV6</code>
     * . This is an optional parameter. If not specified, the default is <code>IPV4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The type of IP address used for the target group. The possible values are <code>IPV4</code> and
     *        <code>IPV6</code>. This is an optional parameter. If not specified, the default is <code>IPV4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public TargetGroupSummary withIpAddressType(String ipAddressType) {
        setIpAddressType(ipAddressType);
        return this;
    }

    /**
     * <p>
     * The type of IP address used for the target group. The possible values are <code>IPV4</code> and <code>IPV6</code>
     * . This is an optional parameter. If not specified, the default is <code>IPV4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The type of IP address used for the target group. The possible values are <code>IPV4</code> and
     *        <code>IPV6</code>. This is an optional parameter. If not specified, the default is <code>IPV4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public TargetGroupSummary withIpAddressType(IpAddressType ipAddressType) {
        this.ipAddressType = ipAddressType.toString();
        return this;
    }

    /**
     * <p>
     * The version of the event structure that your Lambda function receives. Supported only if the target group type is
     * <code>LAMBDA</code>.
     * </p>
     * 
     * @param lambdaEventStructureVersion
     *        The version of the event structure that your Lambda function receives. Supported only if the target group
     *        type is <code>LAMBDA</code>.
     * @see LambdaEventStructureVersion
     */

    public void setLambdaEventStructureVersion(String lambdaEventStructureVersion) {
        this.lambdaEventStructureVersion = lambdaEventStructureVersion;
    }

    /**
     * <p>
     * The version of the event structure that your Lambda function receives. Supported only if the target group type is
     * <code>LAMBDA</code>.
     * </p>
     * 
     * @return The version of the event structure that your Lambda function receives. Supported only if the target group
     *         type is <code>LAMBDA</code>.
     * @see LambdaEventStructureVersion
     */

    public String getLambdaEventStructureVersion() {
        return this.lambdaEventStructureVersion;
    }

    /**
     * <p>
     * The version of the event structure that your Lambda function receives. Supported only if the target group type is
     * <code>LAMBDA</code>.
     * </p>
     * 
     * @param lambdaEventStructureVersion
     *        The version of the event structure that your Lambda function receives. Supported only if the target group
     *        type is <code>LAMBDA</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaEventStructureVersion
     */

    public TargetGroupSummary withLambdaEventStructureVersion(String lambdaEventStructureVersion) {
        setLambdaEventStructureVersion(lambdaEventStructureVersion);
        return this;
    }

    /**
     * <p>
     * The version of the event structure that your Lambda function receives. Supported only if the target group type is
     * <code>LAMBDA</code>.
     * </p>
     * 
     * @param lambdaEventStructureVersion
     *        The version of the event structure that your Lambda function receives. Supported only if the target group
     *        type is <code>LAMBDA</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaEventStructureVersion
     */

    public TargetGroupSummary withLambdaEventStructureVersion(LambdaEventStructureVersion lambdaEventStructureVersion) {
        this.lambdaEventStructureVersion = lambdaEventStructureVersion.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the target group was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time that the target group was last updated, specified in ISO-8601 format.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the target group was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time that the target group was last updated, specified in ISO-8601 format.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the target group was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time that the target group was last updated, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The name of the target group.
     * </p>
     * 
     * @param name
     *        The name of the target group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the target group.
     * </p>
     * 
     * @return The name of the target group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the target group.
     * </p>
     * 
     * @param name
     *        The name of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The port of the target group.
     * </p>
     * 
     * @param port
     *        The port of the target group.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port of the target group.
     * </p>
     * 
     * @return The port of the target group.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port of the target group.
     * </p>
     * 
     * @param port
     *        The port of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupSummary withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The protocol of the target group.
     * </p>
     * 
     * @param protocol
     *        The protocol of the target group.
     * @see TargetGroupProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol of the target group.
     * </p>
     * 
     * @return The protocol of the target group.
     * @see TargetGroupProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol of the target group.
     * </p>
     * 
     * @param protocol
     *        The protocol of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupProtocol
     */

    public TargetGroupSummary withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol of the target group.
     * </p>
     * 
     * @param protocol
     *        The protocol of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupProtocol
     */

    public TargetGroupSummary withProtocol(TargetGroupProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the service.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the service.
     */

    public java.util.List<String> getServiceArns() {
        return serviceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the service.
     * </p>
     * 
     * @param serviceArns
     *        The Amazon Resource Names (ARNs) of the service.
     */

    public void setServiceArns(java.util.Collection<String> serviceArns) {
        if (serviceArns == null) {
            this.serviceArns = null;
            return;
        }

        this.serviceArns = new java.util.ArrayList<String>(serviceArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceArns(java.util.Collection)} or {@link #withServiceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serviceArns
     *        The Amazon Resource Names (ARNs) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupSummary withServiceArns(String... serviceArns) {
        if (this.serviceArns == null) {
            setServiceArns(new java.util.ArrayList<String>(serviceArns.length));
        }
        for (String ele : serviceArns) {
            this.serviceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the service.
     * </p>
     * 
     * @param serviceArns
     *        The Amazon Resource Names (ARNs) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupSummary withServiceArns(java.util.Collection<String> serviceArns) {
        setServiceArns(serviceArns);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see TargetGroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @return The status.
     * @see TargetGroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupStatus
     */

    public TargetGroupSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupStatus
     */

    public TargetGroupSummary withStatus(TargetGroupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The target group type.
     * </p>
     * 
     * @param type
     *        The target group type.
     * @see TargetGroupType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The target group type.
     * </p>
     * 
     * @return The target group type.
     * @see TargetGroupType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The target group type.
     * </p>
     * 
     * @param type
     *        The target group type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupType
     */

    public TargetGroupSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The target group type.
     * </p>
     * 
     * @param type
     *        The target group type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupType
     */

    public TargetGroupSummary withType(TargetGroupType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VPC of the target group.
     * </p>
     * 
     * @param vpcIdentifier
     *        The ID of the VPC of the target group.
     */

    public void setVpcIdentifier(String vpcIdentifier) {
        this.vpcIdentifier = vpcIdentifier;
    }

    /**
     * <p>
     * The ID of the VPC of the target group.
     * </p>
     * 
     * @return The ID of the VPC of the target group.
     */

    public String getVpcIdentifier() {
        return this.vpcIdentifier;
    }

    /**
     * <p>
     * The ID of the VPC of the target group.
     * </p>
     * 
     * @param vpcIdentifier
     *        The ID of the VPC of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupSummary withVpcIdentifier(String vpcIdentifier) {
        setVpcIdentifier(vpcIdentifier);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIpAddressType() != null)
            sb.append("IpAddressType: ").append(getIpAddressType()).append(",");
        if (getLambdaEventStructureVersion() != null)
            sb.append("LambdaEventStructureVersion: ").append(getLambdaEventStructureVersion()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getServiceArns() != null)
            sb.append("ServiceArns: ").append(getServiceArns()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVpcIdentifier() != null)
            sb.append("VpcIdentifier: ").append(getVpcIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetGroupSummary == false)
            return false;
        TargetGroupSummary other = (TargetGroupSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIpAddressType() == null ^ this.getIpAddressType() == null)
            return false;
        if (other.getIpAddressType() != null && other.getIpAddressType().equals(this.getIpAddressType()) == false)
            return false;
        if (other.getLambdaEventStructureVersion() == null ^ this.getLambdaEventStructureVersion() == null)
            return false;
        if (other.getLambdaEventStructureVersion() != null && other.getLambdaEventStructureVersion().equals(this.getLambdaEventStructureVersion()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getServiceArns() == null ^ this.getServiceArns() == null)
            return false;
        if (other.getServiceArns() != null && other.getServiceArns().equals(this.getServiceArns()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVpcIdentifier() == null ^ this.getVpcIdentifier() == null)
            return false;
        if (other.getVpcIdentifier() != null && other.getVpcIdentifier().equals(this.getVpcIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        hashCode = prime * hashCode + ((getLambdaEventStructureVersion() == null) ? 0 : getLambdaEventStructureVersion().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getServiceArns() == null) ? 0 : getServiceArns().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVpcIdentifier() == null) ? 0 : getVpcIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public TargetGroupSummary clone() {
        try {
            return (TargetGroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.TargetGroupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

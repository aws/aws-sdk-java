/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.CreateSubnetRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubnetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateSubnetRequest> {

    /**
     * <p>
     * The Availability Zone or Local Zone for the subnet.
     * </p>
     * <p>
     * Default: AWS selects one for you. If you create more than one subnet in your VPC, we do not necessarily select a
     * different zone for each subnet.
     * </p>
     * <p>
     * To create a subnet in a Local Zone, set this value to the Local Zone ID, for example
     * <code>us-west-2-lax-1a</code>. For information about the Regions that support Local Zones, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"
     * >Available Regions</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The AZ ID or the Local Zone ID of the subnet.
     * </p>
     */
    private String availabilityZoneId;
    /**
     * <p>
     * The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>.
     * </p>
     */
    private String cidrBlock;
    /**
     * <p>
     * The IPv6 network range for the subnet, in CIDR notation. The subnet size must use a /64 prefix length.
     * </p>
     */
    private String ipv6CidrBlock;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostArn;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * Default constructor for CreateSubnetRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateSubnetRequest() {
    }

    /**
     * Constructs a new CreateSubnetRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @param cidrBlock
     *        The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>.
     */
    public CreateSubnetRequest(String vpcId, String cidrBlock) {
        setVpcId(vpcId);
        setCidrBlock(cidrBlock);
    }

    /**
     * <p>
     * The Availability Zone or Local Zone for the subnet.
     * </p>
     * <p>
     * Default: AWS selects one for you. If you create more than one subnet in your VPC, we do not necessarily select a
     * different zone for each subnet.
     * </p>
     * <p>
     * To create a subnet in a Local Zone, set this value to the Local Zone ID, for example
     * <code>us-west-2-lax-1a</code>. For information about the Regions that support Local Zones, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"
     * >Available Regions</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone or Local Zone for the subnet.</p>
     *        <p>
     *        Default: AWS selects one for you. If you create more than one subnet in your VPC, we do not necessarily
     *        select a different zone for each subnet.
     *        </p>
     *        <p>
     *        To create a subnet in a Local Zone, set this value to the Local Zone ID, for example
     *        <code>us-west-2-lax-1a</code>. For information about the Regions that support Local Zones, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"
     *        >Available Regions</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone or Local Zone for the subnet.
     * </p>
     * <p>
     * Default: AWS selects one for you. If you create more than one subnet in your VPC, we do not necessarily select a
     * different zone for each subnet.
     * </p>
     * <p>
     * To create a subnet in a Local Zone, set this value to the Local Zone ID, for example
     * <code>us-west-2-lax-1a</code>. For information about the Regions that support Local Zones, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"
     * >Available Regions</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The Availability Zone or Local Zone for the subnet.</p>
     *         <p>
     *         Default: AWS selects one for you. If you create more than one subnet in your VPC, we do not necessarily
     *         select a different zone for each subnet.
     *         </p>
     *         <p>
     *         To create a subnet in a Local Zone, set this value to the Local Zone ID, for example
     *         <code>us-west-2-lax-1a</code>. For information about the Regions that support Local Zones, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"
     *         >Available Regions</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone or Local Zone for the subnet.
     * </p>
     * <p>
     * Default: AWS selects one for you. If you create more than one subnet in your VPC, we do not necessarily select a
     * different zone for each subnet.
     * </p>
     * <p>
     * To create a subnet in a Local Zone, set this value to the Local Zone ID, for example
     * <code>us-west-2-lax-1a</code>. For information about the Regions that support Local Zones, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"
     * >Available Regions</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone or Local Zone for the subnet.</p>
     *        <p>
     *        Default: AWS selects one for you. If you create more than one subnet in your VPC, we do not necessarily
     *        select a different zone for each subnet.
     *        </p>
     *        <p>
     *        To create a subnet in a Local Zone, set this value to the Local Zone ID, for example
     *        <code>us-west-2-lax-1a</code>. For information about the Regions that support Local Zones, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"
     *        >Available Regions</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The AZ ID or the Local Zone ID of the subnet.
     * </p>
     * 
     * @param availabilityZoneId
     *        The AZ ID or the Local Zone ID of the subnet.
     */

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The AZ ID or the Local Zone ID of the subnet.
     * </p>
     * 
     * @return The AZ ID or the Local Zone ID of the subnet.
     */

    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * <p>
     * The AZ ID or the Local Zone ID of the subnet.
     * </p>
     * 
     * @param availabilityZoneId
     *        The AZ ID or the Local Zone ID of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetRequest withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * <p>
     * The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>.
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>.
     * </p>
     * 
     * @return The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>.
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetRequest withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * <p>
     * The IPv6 network range for the subnet, in CIDR notation. The subnet size must use a /64 prefix length.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 network range for the subnet, in CIDR notation. The subnet size must use a /64 prefix length.
     */

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 network range for the subnet, in CIDR notation. The subnet size must use a /64 prefix length.
     * </p>
     * 
     * @return The IPv6 network range for the subnet, in CIDR notation. The subnet size must use a /64 prefix length.
     */

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 network range for the subnet, in CIDR notation. The subnet size must use a /64 prefix length.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 network range for the subnet, in CIDR notation. The subnet size must use a /64 prefix length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetRequest withIpv6CidrBlock(String ipv6CidrBlock) {
        setIpv6CidrBlock(ipv6CidrBlock);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost.
     */

    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Outpost.
     */

    public String getOutpostArn() {
        return this.outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetRequest withOutpostArn(String outpostArn) {
        setOutpostArn(outpostArn);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateSubnetRequest> getDryRunRequest() {
        Request<CreateSubnetRequest> request = new CreateSubnetRequestMarshaller().marshall(this);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getCidrBlock() != null)
            sb.append("CidrBlock: ").append(getCidrBlock()).append(",");
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: ").append(getIpv6CidrBlock()).append(",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: ").append(getOutpostArn()).append(",");
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

        if (obj instanceof CreateSubnetRequest == false)
            return false;
        CreateSubnetRequest other = (CreateSubnetRequest) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getIpv6CidrBlock() == null ^ this.getIpv6CidrBlock() == null)
            return false;
        if (other.getIpv6CidrBlock() != null && other.getIpv6CidrBlock().equals(this.getIpv6CidrBlock()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null && other.getOutpostArn().equals(this.getOutpostArn()) == false)
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

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubnetRequest clone() {
        return (CreateSubnetRequest) super.clone();
    }
}

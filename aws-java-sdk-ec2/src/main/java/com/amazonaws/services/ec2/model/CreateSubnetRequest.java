/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The tags to assign to the subnet.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
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
     * <p>
     * To create a subnet in an Outpost, set this value to the Availability Zone for the Outpost and specify the Outpost
     * ARN.
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
     * The IPv6 network range for the subnet, in CIDR notation. The subnet size must use a /64 prefix length.
     * </p>
     */
    private String ipv6CidrBlock;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost. If you specify an Outpost ARN, you must also specify the
     * Availability Zone of the Outpost subnet.
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
     * <p>
     * The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>. We modify the
     * specified CIDR block to its canonical form; for example, if you specify <code>100.68.0.18/18</code>, we modify it
     * to <code>100.68.0.0/18</code>.
     * </p>
     */
    private String cidrBlock;

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
     *        The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>. We modify
     *        the specified CIDR block to its canonical form; for example, if you specify <code>100.68.0.18/18</code>,
     *        we modify it to <code>100.68.0.0/18</code>.
     */
    public CreateSubnetRequest(String vpcId, String cidrBlock) {
        setVpcId(vpcId);
        setCidrBlock(cidrBlock);
    }

    /**
     * <p>
     * The tags to assign to the subnet.
     * </p>
     * 
     * @return The tags to assign to the subnet.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to assign to the subnet.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the subnet.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to assign to the subnet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to assign to the subnet.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
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
     * <p>
     * To create a subnet in an Outpost, set this value to the Availability Zone for the Outpost and specify the Outpost
     * ARN.
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
     *        </p>
     *        <p>
     *        To create a subnet in an Outpost, set this value to the Availability Zone for the Outpost and specify the
     *        Outpost ARN.
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
     * <p>
     * To create a subnet in an Outpost, set this value to the Availability Zone for the Outpost and specify the Outpost
     * ARN.
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
     *         </p>
     *         <p>
     *         To create a subnet in an Outpost, set this value to the Availability Zone for the Outpost and specify the
     *         Outpost ARN.
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
     * <p>
     * To create a subnet in an Outpost, set this value to the Availability Zone for the Outpost and specify the Outpost
     * ARN.
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
     *        </p>
     *        <p>
     *        To create a subnet in an Outpost, set this value to the Availability Zone for the Outpost and specify the
     *        Outpost ARN.
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
     * The Amazon Resource Name (ARN) of the Outpost. If you specify an Outpost ARN, you must also specify the
     * Availability Zone of the Outpost subnet.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost. If you specify an Outpost ARN, you must also specify the
     *        Availability Zone of the Outpost subnet.
     */

    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost. If you specify an Outpost ARN, you must also specify the
     * Availability Zone of the Outpost subnet.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Outpost. If you specify an Outpost ARN, you must also specify the
     *         Availability Zone of the Outpost subnet.
     */

    public String getOutpostArn() {
        return this.outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost. If you specify an Outpost ARN, you must also specify the
     * Availability Zone of the Outpost subnet.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost. If you specify an Outpost ARN, you must also specify the
     *        Availability Zone of the Outpost subnet.
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
     * <p>
     * The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>. We modify the
     * specified CIDR block to its canonical form; for example, if you specify <code>100.68.0.18/18</code>, we modify it
     * to <code>100.68.0.0/18</code>.
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>. We modify
     *        the specified CIDR block to its canonical form; for example, if you specify <code>100.68.0.18/18</code>,
     *        we modify it to <code>100.68.0.0/18</code>.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>. We modify the
     * specified CIDR block to its canonical form; for example, if you specify <code>100.68.0.18/18</code>, we modify it
     * to <code>100.68.0.0/18</code>.
     * </p>
     * 
     * @return The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>. We modify
     *         the specified CIDR block to its canonical form; for example, if you specify <code>100.68.0.18/18</code>,
     *         we modify it to <code>100.68.0.0/18</code>.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>. We modify the
     * specified CIDR block to its canonical form; for example, if you specify <code>100.68.0.18/18</code>, we modify it
     * to <code>100.68.0.0/18</code>.
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 network range for the subnet, in CIDR notation. For example, <code>10.0.0.0/24</code>. We modify
     *        the specified CIDR block to its canonical form; for example, if you specify <code>100.68.0.18/18</code>,
     *        we modify it to <code>100.68.0.0/18</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetRequest withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
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
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: ").append(getIpv6CidrBlock()).append(",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: ").append(getOutpostArn()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getCidrBlock() != null)
            sb.append("CidrBlock: ").append(getCidrBlock());
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
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
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
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubnetRequest clone() {
        return (CreateSubnetRequest) super.clone();
    }
}

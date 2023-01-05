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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateSubnetCidrReservationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubnetCidrReservationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateSubnetCidrReservationRequest> {

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The IPv4 or IPV6 CIDR range to reserve.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The type of reservation.
     * </p>
     * <p>
     * The following are valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>prefix</code>: The Amazon EC2 Prefix Delegation feature assigns the IP addresses to network interfaces that
     * are associated with an instance. For information about Prefix Delegation, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-delegation.html">Prefix Delegation for
     * Amazon EC2 network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>explicit</code>: You manually assign the IP addresses to resources that reside in your subnet.
     * </p>
     * </li>
     * </ul>
     */
    private String reservationType;
    /**
     * <p>
     * The description to assign to the subnet CIDR reservation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The tags to assign to the subnet CIDR reservation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @return The ID of the subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetCidrReservationRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The IPv4 or IPV6 CIDR range to reserve.
     * </p>
     * 
     * @param cidr
     *        The IPv4 or IPV6 CIDR range to reserve.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The IPv4 or IPV6 CIDR range to reserve.
     * </p>
     * 
     * @return The IPv4 or IPV6 CIDR range to reserve.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The IPv4 or IPV6 CIDR range to reserve.
     * </p>
     * 
     * @param cidr
     *        The IPv4 or IPV6 CIDR range to reserve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetCidrReservationRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The type of reservation.
     * </p>
     * <p>
     * The following are valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>prefix</code>: The Amazon EC2 Prefix Delegation feature assigns the IP addresses to network interfaces that
     * are associated with an instance. For information about Prefix Delegation, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-delegation.html">Prefix Delegation for
     * Amazon EC2 network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>explicit</code>: You manually assign the IP addresses to resources that reside in your subnet.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reservationType
     *        The type of reservation.</p>
     *        <p>
     *        The following are valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>prefix</code>: The Amazon EC2 Prefix Delegation feature assigns the IP addresses to network
     *        interfaces that are associated with an instance. For information about Prefix Delegation, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-delegation.html">Prefix Delegation
     *        for Amazon EC2 network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>explicit</code>: You manually assign the IP addresses to resources that reside in your subnet.
     *        </p>
     *        </li>
     * @see SubnetCidrReservationType
     */

    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }

    /**
     * <p>
     * The type of reservation.
     * </p>
     * <p>
     * The following are valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>prefix</code>: The Amazon EC2 Prefix Delegation feature assigns the IP addresses to network interfaces that
     * are associated with an instance. For information about Prefix Delegation, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-delegation.html">Prefix Delegation for
     * Amazon EC2 network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>explicit</code>: You manually assign the IP addresses to resources that reside in your subnet.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of reservation.</p>
     *         <p>
     *         The following are valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>prefix</code>: The Amazon EC2 Prefix Delegation feature assigns the IP addresses to network
     *         interfaces that are associated with an instance. For information about Prefix Delegation, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-delegation.html">Prefix Delegation
     *         for Amazon EC2 network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>explicit</code>: You manually assign the IP addresses to resources that reside in your subnet.
     *         </p>
     *         </li>
     * @see SubnetCidrReservationType
     */

    public String getReservationType() {
        return this.reservationType;
    }

    /**
     * <p>
     * The type of reservation.
     * </p>
     * <p>
     * The following are valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>prefix</code>: The Amazon EC2 Prefix Delegation feature assigns the IP addresses to network interfaces that
     * are associated with an instance. For information about Prefix Delegation, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-delegation.html">Prefix Delegation for
     * Amazon EC2 network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>explicit</code>: You manually assign the IP addresses to resources that reside in your subnet.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reservationType
     *        The type of reservation.</p>
     *        <p>
     *        The following are valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>prefix</code>: The Amazon EC2 Prefix Delegation feature assigns the IP addresses to network
     *        interfaces that are associated with an instance. For information about Prefix Delegation, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-delegation.html">Prefix Delegation
     *        for Amazon EC2 network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>explicit</code>: You manually assign the IP addresses to resources that reside in your subnet.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubnetCidrReservationType
     */

    public CreateSubnetCidrReservationRequest withReservationType(String reservationType) {
        setReservationType(reservationType);
        return this;
    }

    /**
     * <p>
     * The type of reservation.
     * </p>
     * <p>
     * The following are valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>prefix</code>: The Amazon EC2 Prefix Delegation feature assigns the IP addresses to network interfaces that
     * are associated with an instance. For information about Prefix Delegation, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-delegation.html">Prefix Delegation for
     * Amazon EC2 network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>explicit</code>: You manually assign the IP addresses to resources that reside in your subnet.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reservationType
     *        The type of reservation.</p>
     *        <p>
     *        The following are valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>prefix</code>: The Amazon EC2 Prefix Delegation feature assigns the IP addresses to network
     *        interfaces that are associated with an instance. For information about Prefix Delegation, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-delegation.html">Prefix Delegation
     *        for Amazon EC2 network interfaces</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>explicit</code>: You manually assign the IP addresses to resources that reside in your subnet.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubnetCidrReservationType
     */

    public CreateSubnetCidrReservationRequest withReservationType(SubnetCidrReservationType reservationType) {
        this.reservationType = reservationType.toString();
        return this;
    }

    /**
     * <p>
     * The description to assign to the subnet CIDR reservation.
     * </p>
     * 
     * @param description
     *        The description to assign to the subnet CIDR reservation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description to assign to the subnet CIDR reservation.
     * </p>
     * 
     * @return The description to assign to the subnet CIDR reservation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description to assign to the subnet CIDR reservation.
     * </p>
     * 
     * @param description
     *        The description to assign to the subnet CIDR reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetCidrReservationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The tags to assign to the subnet CIDR reservation.
     * </p>
     * 
     * @return The tags to assign to the subnet CIDR reservation.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to assign to the subnet CIDR reservation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the subnet CIDR reservation.
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
     * The tags to assign to the subnet CIDR reservation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the subnet CIDR reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetCidrReservationRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags to assign to the subnet CIDR reservation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the subnet CIDR reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetCidrReservationRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateSubnetCidrReservationRequest> getDryRunRequest() {
        Request<CreateSubnetCidrReservationRequest> request = new CreateSubnetCidrReservationRequestMarshaller().marshall(this);
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
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getReservationType() != null)
            sb.append("ReservationType: ").append(getReservationType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSubnetCidrReservationRequest == false)
            return false;
        CreateSubnetCidrReservationRequest other = (CreateSubnetCidrReservationRequest) obj;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getReservationType() == null ^ this.getReservationType() == null)
            return false;
        if (other.getReservationType() != null && other.getReservationType().equals(this.getReservationType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getReservationType() == null) ? 0 : getReservationType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubnetCidrReservationRequest clone() {
        return (CreateSubnetCidrReservationRequest) super.clone();
    }
}

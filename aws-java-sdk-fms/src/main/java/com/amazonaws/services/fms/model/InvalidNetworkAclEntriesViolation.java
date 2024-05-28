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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Violation detail for the entries in a network ACL resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/InvalidNetworkAclEntriesViolation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidNetworkAclEntriesViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The VPC where the violation was found.
     * </p>
     */
    private String vpc;
    /**
     * <p>
     * The subnet that's associated with the network ACL.
     * </p>
     */
    private String subnet;
    /**
     * <p>
     * The Availability Zone where the network ACL is in use.
     * </p>
     */
    private String subnetAvailabilityZone;
    /**
     * <p>
     * The network ACL containing the entry violations.
     * </p>
     */
    private String currentAssociatedNetworkAcl;
    /**
     * <p>
     * Detailed information about the entry violations in the network ACL.
     * </p>
     */
    private java.util.List<EntryViolation> entryViolations;

    /**
     * <p>
     * The VPC where the violation was found.
     * </p>
     * 
     * @param vpc
     *        The VPC where the violation was found.
     */

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    /**
     * <p>
     * The VPC where the violation was found.
     * </p>
     * 
     * @return The VPC where the violation was found.
     */

    public String getVpc() {
        return this.vpc;
    }

    /**
     * <p>
     * The VPC where the violation was found.
     * </p>
     * 
     * @param vpc
     *        The VPC where the violation was found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidNetworkAclEntriesViolation withVpc(String vpc) {
        setVpc(vpc);
        return this;
    }

    /**
     * <p>
     * The subnet that's associated with the network ACL.
     * </p>
     * 
     * @param subnet
     *        The subnet that's associated with the network ACL.
     */

    public void setSubnet(String subnet) {
        this.subnet = subnet;
    }

    /**
     * <p>
     * The subnet that's associated with the network ACL.
     * </p>
     * 
     * @return The subnet that's associated with the network ACL.
     */

    public String getSubnet() {
        return this.subnet;
    }

    /**
     * <p>
     * The subnet that's associated with the network ACL.
     * </p>
     * 
     * @param subnet
     *        The subnet that's associated with the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidNetworkAclEntriesViolation withSubnet(String subnet) {
        setSubnet(subnet);
        return this;
    }

    /**
     * <p>
     * The Availability Zone where the network ACL is in use.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        The Availability Zone where the network ACL is in use.
     */

    public void setSubnetAvailabilityZone(String subnetAvailabilityZone) {
        this.subnetAvailabilityZone = subnetAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the network ACL is in use.
     * </p>
     * 
     * @return The Availability Zone where the network ACL is in use.
     */

    public String getSubnetAvailabilityZone() {
        return this.subnetAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the network ACL is in use.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        The Availability Zone where the network ACL is in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidNetworkAclEntriesViolation withSubnetAvailabilityZone(String subnetAvailabilityZone) {
        setSubnetAvailabilityZone(subnetAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * The network ACL containing the entry violations.
     * </p>
     * 
     * @param currentAssociatedNetworkAcl
     *        The network ACL containing the entry violations.
     */

    public void setCurrentAssociatedNetworkAcl(String currentAssociatedNetworkAcl) {
        this.currentAssociatedNetworkAcl = currentAssociatedNetworkAcl;
    }

    /**
     * <p>
     * The network ACL containing the entry violations.
     * </p>
     * 
     * @return The network ACL containing the entry violations.
     */

    public String getCurrentAssociatedNetworkAcl() {
        return this.currentAssociatedNetworkAcl;
    }

    /**
     * <p>
     * The network ACL containing the entry violations.
     * </p>
     * 
     * @param currentAssociatedNetworkAcl
     *        The network ACL containing the entry violations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidNetworkAclEntriesViolation withCurrentAssociatedNetworkAcl(String currentAssociatedNetworkAcl) {
        setCurrentAssociatedNetworkAcl(currentAssociatedNetworkAcl);
        return this;
    }

    /**
     * <p>
     * Detailed information about the entry violations in the network ACL.
     * </p>
     * 
     * @return Detailed information about the entry violations in the network ACL.
     */

    public java.util.List<EntryViolation> getEntryViolations() {
        return entryViolations;
    }

    /**
     * <p>
     * Detailed information about the entry violations in the network ACL.
     * </p>
     * 
     * @param entryViolations
     *        Detailed information about the entry violations in the network ACL.
     */

    public void setEntryViolations(java.util.Collection<EntryViolation> entryViolations) {
        if (entryViolations == null) {
            this.entryViolations = null;
            return;
        }

        this.entryViolations = new java.util.ArrayList<EntryViolation>(entryViolations);
    }

    /**
     * <p>
     * Detailed information about the entry violations in the network ACL.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntryViolations(java.util.Collection)} or {@link #withEntryViolations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param entryViolations
     *        Detailed information about the entry violations in the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidNetworkAclEntriesViolation withEntryViolations(EntryViolation... entryViolations) {
        if (this.entryViolations == null) {
            setEntryViolations(new java.util.ArrayList<EntryViolation>(entryViolations.length));
        }
        for (EntryViolation ele : entryViolations) {
            this.entryViolations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Detailed information about the entry violations in the network ACL.
     * </p>
     * 
     * @param entryViolations
     *        Detailed information about the entry violations in the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidNetworkAclEntriesViolation withEntryViolations(java.util.Collection<EntryViolation> entryViolations) {
        setEntryViolations(entryViolations);
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
        if (getVpc() != null)
            sb.append("Vpc: ").append(getVpc()).append(",");
        if (getSubnet() != null)
            sb.append("Subnet: ").append(getSubnet()).append(",");
        if (getSubnetAvailabilityZone() != null)
            sb.append("SubnetAvailabilityZone: ").append(getSubnetAvailabilityZone()).append(",");
        if (getCurrentAssociatedNetworkAcl() != null)
            sb.append("CurrentAssociatedNetworkAcl: ").append(getCurrentAssociatedNetworkAcl()).append(",");
        if (getEntryViolations() != null)
            sb.append("EntryViolations: ").append(getEntryViolations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvalidNetworkAclEntriesViolation == false)
            return false;
        InvalidNetworkAclEntriesViolation other = (InvalidNetworkAclEntriesViolation) obj;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
            return false;
        if (other.getSubnet() == null ^ this.getSubnet() == null)
            return false;
        if (other.getSubnet() != null && other.getSubnet().equals(this.getSubnet()) == false)
            return false;
        if (other.getSubnetAvailabilityZone() == null ^ this.getSubnetAvailabilityZone() == null)
            return false;
        if (other.getSubnetAvailabilityZone() != null && other.getSubnetAvailabilityZone().equals(this.getSubnetAvailabilityZone()) == false)
            return false;
        if (other.getCurrentAssociatedNetworkAcl() == null ^ this.getCurrentAssociatedNetworkAcl() == null)
            return false;
        if (other.getCurrentAssociatedNetworkAcl() != null && other.getCurrentAssociatedNetworkAcl().equals(this.getCurrentAssociatedNetworkAcl()) == false)
            return false;
        if (other.getEntryViolations() == null ^ this.getEntryViolations() == null)
            return false;
        if (other.getEntryViolations() != null && other.getEntryViolations().equals(this.getEntryViolations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        hashCode = prime * hashCode + ((getSubnet() == null) ? 0 : getSubnet().hashCode());
        hashCode = prime * hashCode + ((getSubnetAvailabilityZone() == null) ? 0 : getSubnetAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getCurrentAssociatedNetworkAcl() == null) ? 0 : getCurrentAssociatedNetworkAcl().hashCode());
        hashCode = prime * hashCode + ((getEntryViolations() == null) ? 0 : getEntryViolations().hashCode());
        return hashCode;
    }

    @Override
    public InvalidNetworkAclEntriesViolation clone() {
        try {
            return (InvalidNetworkAclEntriesViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.InvalidNetworkAclEntriesViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

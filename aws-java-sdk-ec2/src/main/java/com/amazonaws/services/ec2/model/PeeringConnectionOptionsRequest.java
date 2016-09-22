/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The VPC peering connection options.
 * </p>
 */
public class PeeringConnectionOptionsRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If true, enables outbound communication from an EC2-Classic instance that's linked to a local VPC via ClassicLink
     * to instances in a peer VPC.
     * </p>
     */
    private Boolean allowEgressFromLocalClassicLinkToRemoteVpc;
    /**
     * <p>
     * If true, enables outbound communication from instances in a local VPC to an EC2-Classic instance that's linked to
     * a peer VPC via ClassicLink.
     * </p>
     */
    private Boolean allowEgressFromLocalVpcToRemoteClassicLink;
    /**
     * <p>
     * If true, enables a local VPC to resolve public DNS hostnames to private IP addresses when queried from instances
     * in the peer VPC.
     * </p>
     */
    private Boolean allowDnsResolutionFromRemoteVpc;

    /**
     * <p>
     * If true, enables outbound communication from an EC2-Classic instance that's linked to a local VPC via ClassicLink
     * to instances in a peer VPC.
     * </p>
     * 
     * @param allowEgressFromLocalClassicLinkToRemoteVpc
     *        If true, enables outbound communication from an EC2-Classic instance that's linked to a local VPC via
     *        ClassicLink to instances in a peer VPC.
     */

    public void setAllowEgressFromLocalClassicLinkToRemoteVpc(Boolean allowEgressFromLocalClassicLinkToRemoteVpc) {
        this.allowEgressFromLocalClassicLinkToRemoteVpc = allowEgressFromLocalClassicLinkToRemoteVpc;
    }

    /**
     * <p>
     * If true, enables outbound communication from an EC2-Classic instance that's linked to a local VPC via ClassicLink
     * to instances in a peer VPC.
     * </p>
     * 
     * @return If true, enables outbound communication from an EC2-Classic instance that's linked to a local VPC via
     *         ClassicLink to instances in a peer VPC.
     */

    public Boolean getAllowEgressFromLocalClassicLinkToRemoteVpc() {
        return this.allowEgressFromLocalClassicLinkToRemoteVpc;
    }

    /**
     * <p>
     * If true, enables outbound communication from an EC2-Classic instance that's linked to a local VPC via ClassicLink
     * to instances in a peer VPC.
     * </p>
     * 
     * @param allowEgressFromLocalClassicLinkToRemoteVpc
     *        If true, enables outbound communication from an EC2-Classic instance that's linked to a local VPC via
     *        ClassicLink to instances in a peer VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PeeringConnectionOptionsRequest withAllowEgressFromLocalClassicLinkToRemoteVpc(Boolean allowEgressFromLocalClassicLinkToRemoteVpc) {
        setAllowEgressFromLocalClassicLinkToRemoteVpc(allowEgressFromLocalClassicLinkToRemoteVpc);
        return this;
    }

    /**
     * <p>
     * If true, enables outbound communication from an EC2-Classic instance that's linked to a local VPC via ClassicLink
     * to instances in a peer VPC.
     * </p>
     * 
     * @return If true, enables outbound communication from an EC2-Classic instance that's linked to a local VPC via
     *         ClassicLink to instances in a peer VPC.
     */

    public Boolean isAllowEgressFromLocalClassicLinkToRemoteVpc() {
        return this.allowEgressFromLocalClassicLinkToRemoteVpc;
    }

    /**
     * <p>
     * If true, enables outbound communication from instances in a local VPC to an EC2-Classic instance that's linked to
     * a peer VPC via ClassicLink.
     * </p>
     * 
     * @param allowEgressFromLocalVpcToRemoteClassicLink
     *        If true, enables outbound communication from instances in a local VPC to an EC2-Classic instance that's
     *        linked to a peer VPC via ClassicLink.
     */

    public void setAllowEgressFromLocalVpcToRemoteClassicLink(Boolean allowEgressFromLocalVpcToRemoteClassicLink) {
        this.allowEgressFromLocalVpcToRemoteClassicLink = allowEgressFromLocalVpcToRemoteClassicLink;
    }

    /**
     * <p>
     * If true, enables outbound communication from instances in a local VPC to an EC2-Classic instance that's linked to
     * a peer VPC via ClassicLink.
     * </p>
     * 
     * @return If true, enables outbound communication from instances in a local VPC to an EC2-Classic instance that's
     *         linked to a peer VPC via ClassicLink.
     */

    public Boolean getAllowEgressFromLocalVpcToRemoteClassicLink() {
        return this.allowEgressFromLocalVpcToRemoteClassicLink;
    }

    /**
     * <p>
     * If true, enables outbound communication from instances in a local VPC to an EC2-Classic instance that's linked to
     * a peer VPC via ClassicLink.
     * </p>
     * 
     * @param allowEgressFromLocalVpcToRemoteClassicLink
     *        If true, enables outbound communication from instances in a local VPC to an EC2-Classic instance that's
     *        linked to a peer VPC via ClassicLink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PeeringConnectionOptionsRequest withAllowEgressFromLocalVpcToRemoteClassicLink(Boolean allowEgressFromLocalVpcToRemoteClassicLink) {
        setAllowEgressFromLocalVpcToRemoteClassicLink(allowEgressFromLocalVpcToRemoteClassicLink);
        return this;
    }

    /**
     * <p>
     * If true, enables outbound communication from instances in a local VPC to an EC2-Classic instance that's linked to
     * a peer VPC via ClassicLink.
     * </p>
     * 
     * @return If true, enables outbound communication from instances in a local VPC to an EC2-Classic instance that's
     *         linked to a peer VPC via ClassicLink.
     */

    public Boolean isAllowEgressFromLocalVpcToRemoteClassicLink() {
        return this.allowEgressFromLocalVpcToRemoteClassicLink;
    }

    /**
     * <p>
     * If true, enables a local VPC to resolve public DNS hostnames to private IP addresses when queried from instances
     * in the peer VPC.
     * </p>
     * 
     * @param allowDnsResolutionFromRemoteVpc
     *        If true, enables a local VPC to resolve public DNS hostnames to private IP addresses when queried from
     *        instances in the peer VPC.
     */

    public void setAllowDnsResolutionFromRemoteVpc(Boolean allowDnsResolutionFromRemoteVpc) {
        this.allowDnsResolutionFromRemoteVpc = allowDnsResolutionFromRemoteVpc;
    }

    /**
     * <p>
     * If true, enables a local VPC to resolve public DNS hostnames to private IP addresses when queried from instances
     * in the peer VPC.
     * </p>
     * 
     * @return If true, enables a local VPC to resolve public DNS hostnames to private IP addresses when queried from
     *         instances in the peer VPC.
     */

    public Boolean getAllowDnsResolutionFromRemoteVpc() {
        return this.allowDnsResolutionFromRemoteVpc;
    }

    /**
     * <p>
     * If true, enables a local VPC to resolve public DNS hostnames to private IP addresses when queried from instances
     * in the peer VPC.
     * </p>
     * 
     * @param allowDnsResolutionFromRemoteVpc
     *        If true, enables a local VPC to resolve public DNS hostnames to private IP addresses when queried from
     *        instances in the peer VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PeeringConnectionOptionsRequest withAllowDnsResolutionFromRemoteVpc(Boolean allowDnsResolutionFromRemoteVpc) {
        setAllowDnsResolutionFromRemoteVpc(allowDnsResolutionFromRemoteVpc);
        return this;
    }

    /**
     * <p>
     * If true, enables a local VPC to resolve public DNS hostnames to private IP addresses when queried from instances
     * in the peer VPC.
     * </p>
     * 
     * @return If true, enables a local VPC to resolve public DNS hostnames to private IP addresses when queried from
     *         instances in the peer VPC.
     */

    public Boolean isAllowDnsResolutionFromRemoteVpc() {
        return this.allowDnsResolutionFromRemoteVpc;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAllowEgressFromLocalClassicLinkToRemoteVpc() != null)
            sb.append("AllowEgressFromLocalClassicLinkToRemoteVpc: " + getAllowEgressFromLocalClassicLinkToRemoteVpc() + ",");
        if (getAllowEgressFromLocalVpcToRemoteClassicLink() != null)
            sb.append("AllowEgressFromLocalVpcToRemoteClassicLink: " + getAllowEgressFromLocalVpcToRemoteClassicLink() + ",");
        if (getAllowDnsResolutionFromRemoteVpc() != null)
            sb.append("AllowDnsResolutionFromRemoteVpc: " + getAllowDnsResolutionFromRemoteVpc());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PeeringConnectionOptionsRequest == false)
            return false;
        PeeringConnectionOptionsRequest other = (PeeringConnectionOptionsRequest) obj;
        if (other.getAllowEgressFromLocalClassicLinkToRemoteVpc() == null ^ this.getAllowEgressFromLocalClassicLinkToRemoteVpc() == null)
            return false;
        if (other.getAllowEgressFromLocalClassicLinkToRemoteVpc() != null
                && other.getAllowEgressFromLocalClassicLinkToRemoteVpc().equals(this.getAllowEgressFromLocalClassicLinkToRemoteVpc()) == false)
            return false;
        if (other.getAllowEgressFromLocalVpcToRemoteClassicLink() == null ^ this.getAllowEgressFromLocalVpcToRemoteClassicLink() == null)
            return false;
        if (other.getAllowEgressFromLocalVpcToRemoteClassicLink() != null
                && other.getAllowEgressFromLocalVpcToRemoteClassicLink().equals(this.getAllowEgressFromLocalVpcToRemoteClassicLink()) == false)
            return false;
        if (other.getAllowDnsResolutionFromRemoteVpc() == null ^ this.getAllowDnsResolutionFromRemoteVpc() == null)
            return false;
        if (other.getAllowDnsResolutionFromRemoteVpc() != null
                && other.getAllowDnsResolutionFromRemoteVpc().equals(this.getAllowDnsResolutionFromRemoteVpc()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllowEgressFromLocalClassicLinkToRemoteVpc() == null) ? 0 : getAllowEgressFromLocalClassicLinkToRemoteVpc().hashCode());
        hashCode = prime * hashCode
                + ((getAllowEgressFromLocalVpcToRemoteClassicLink() == null) ? 0 : getAllowEgressFromLocalVpcToRemoteClassicLink().hashCode());
        hashCode = prime * hashCode + ((getAllowDnsResolutionFromRemoteVpc() == null) ? 0 : getAllowDnsResolutionFromRemoteVpc().hashCode());
        return hashCode;
    }

    @Override
    public PeeringConnectionOptionsRequest clone() {
        try {
            return (PeeringConnectionOptionsRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

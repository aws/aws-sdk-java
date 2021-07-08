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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the expected route in the route table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ExpectedRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExpectedRoute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the IPv4 CIDR block.
     * </p>
     */
    private String ipV4Cidr;
    /**
     * <p>
     * Information about the ID of the prefix list for the route.
     * </p>
     */
    private String prefixListId;
    /**
     * <p>
     * Information about the IPv6 CIDR block.
     * </p>
     */
    private String ipV6Cidr;
    /**
     * <p>
     * Information about the contributing subnets.
     * </p>
     */
    private java.util.List<String> contributingSubnets;
    /**
     * <p>
     * Information about the allowed targets.
     * </p>
     */
    private java.util.List<String> allowedTargets;
    /**
     * <p>
     * Information about the route table ID.
     * </p>
     */
    private String routeTableId;

    /**
     * <p>
     * Information about the IPv4 CIDR block.
     * </p>
     * 
     * @param ipV4Cidr
     *        Information about the IPv4 CIDR block.
     */

    public void setIpV4Cidr(String ipV4Cidr) {
        this.ipV4Cidr = ipV4Cidr;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR block.
     * </p>
     * 
     * @return Information about the IPv4 CIDR block.
     */

    public String getIpV4Cidr() {
        return this.ipV4Cidr;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR block.
     * </p>
     * 
     * @param ipV4Cidr
     *        Information about the IPv4 CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpectedRoute withIpV4Cidr(String ipV4Cidr) {
        setIpV4Cidr(ipV4Cidr);
        return this;
    }

    /**
     * <p>
     * Information about the ID of the prefix list for the route.
     * </p>
     * 
     * @param prefixListId
     *        Information about the ID of the prefix list for the route.
     */

    public void setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
    }

    /**
     * <p>
     * Information about the ID of the prefix list for the route.
     * </p>
     * 
     * @return Information about the ID of the prefix list for the route.
     */

    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * <p>
     * Information about the ID of the prefix list for the route.
     * </p>
     * 
     * @param prefixListId
     *        Information about the ID of the prefix list for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpectedRoute withPrefixListId(String prefixListId) {
        setPrefixListId(prefixListId);
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR block.
     * </p>
     * 
     * @param ipV6Cidr
     *        Information about the IPv6 CIDR block.
     */

    public void setIpV6Cidr(String ipV6Cidr) {
        this.ipV6Cidr = ipV6Cidr;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR block.
     * </p>
     * 
     * @return Information about the IPv6 CIDR block.
     */

    public String getIpV6Cidr() {
        return this.ipV6Cidr;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR block.
     * </p>
     * 
     * @param ipV6Cidr
     *        Information about the IPv6 CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpectedRoute withIpV6Cidr(String ipV6Cidr) {
        setIpV6Cidr(ipV6Cidr);
        return this;
    }

    /**
     * <p>
     * Information about the contributing subnets.
     * </p>
     * 
     * @return Information about the contributing subnets.
     */

    public java.util.List<String> getContributingSubnets() {
        return contributingSubnets;
    }

    /**
     * <p>
     * Information about the contributing subnets.
     * </p>
     * 
     * @param contributingSubnets
     *        Information about the contributing subnets.
     */

    public void setContributingSubnets(java.util.Collection<String> contributingSubnets) {
        if (contributingSubnets == null) {
            this.contributingSubnets = null;
            return;
        }

        this.contributingSubnets = new java.util.ArrayList<String>(contributingSubnets);
    }

    /**
     * <p>
     * Information about the contributing subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContributingSubnets(java.util.Collection)} or {@link #withContributingSubnets(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param contributingSubnets
     *        Information about the contributing subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpectedRoute withContributingSubnets(String... contributingSubnets) {
        if (this.contributingSubnets == null) {
            setContributingSubnets(new java.util.ArrayList<String>(contributingSubnets.length));
        }
        for (String ele : contributingSubnets) {
            this.contributingSubnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the contributing subnets.
     * </p>
     * 
     * @param contributingSubnets
     *        Information about the contributing subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpectedRoute withContributingSubnets(java.util.Collection<String> contributingSubnets) {
        setContributingSubnets(contributingSubnets);
        return this;
    }

    /**
     * <p>
     * Information about the allowed targets.
     * </p>
     * 
     * @return Information about the allowed targets.
     */

    public java.util.List<String> getAllowedTargets() {
        return allowedTargets;
    }

    /**
     * <p>
     * Information about the allowed targets.
     * </p>
     * 
     * @param allowedTargets
     *        Information about the allowed targets.
     */

    public void setAllowedTargets(java.util.Collection<String> allowedTargets) {
        if (allowedTargets == null) {
            this.allowedTargets = null;
            return;
        }

        this.allowedTargets = new java.util.ArrayList<String>(allowedTargets);
    }

    /**
     * <p>
     * Information about the allowed targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedTargets(java.util.Collection)} or {@link #withAllowedTargets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedTargets
     *        Information about the allowed targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpectedRoute withAllowedTargets(String... allowedTargets) {
        if (this.allowedTargets == null) {
            setAllowedTargets(new java.util.ArrayList<String>(allowedTargets.length));
        }
        for (String ele : allowedTargets) {
            this.allowedTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the allowed targets.
     * </p>
     * 
     * @param allowedTargets
     *        Information about the allowed targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpectedRoute withAllowedTargets(java.util.Collection<String> allowedTargets) {
        setAllowedTargets(allowedTargets);
        return this;
    }

    /**
     * <p>
     * Information about the route table ID.
     * </p>
     * 
     * @param routeTableId
     *        Information about the route table ID.
     */

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * Information about the route table ID.
     * </p>
     * 
     * @return Information about the route table ID.
     */

    public String getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * <p>
     * Information about the route table ID.
     * </p>
     * 
     * @param routeTableId
     *        Information about the route table ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpectedRoute withRouteTableId(String routeTableId) {
        setRouteTableId(routeTableId);
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
        if (getIpV4Cidr() != null)
            sb.append("IpV4Cidr: ").append(getIpV4Cidr()).append(",");
        if (getPrefixListId() != null)
            sb.append("PrefixListId: ").append(getPrefixListId()).append(",");
        if (getIpV6Cidr() != null)
            sb.append("IpV6Cidr: ").append(getIpV6Cidr()).append(",");
        if (getContributingSubnets() != null)
            sb.append("ContributingSubnets: ").append(getContributingSubnets()).append(",");
        if (getAllowedTargets() != null)
            sb.append("AllowedTargets: ").append(getAllowedTargets()).append(",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: ").append(getRouteTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpectedRoute == false)
            return false;
        ExpectedRoute other = (ExpectedRoute) obj;
        if (other.getIpV4Cidr() == null ^ this.getIpV4Cidr() == null)
            return false;
        if (other.getIpV4Cidr() != null && other.getIpV4Cidr().equals(this.getIpV4Cidr()) == false)
            return false;
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null)
            return false;
        if (other.getPrefixListId() != null && other.getPrefixListId().equals(this.getPrefixListId()) == false)
            return false;
        if (other.getIpV6Cidr() == null ^ this.getIpV6Cidr() == null)
            return false;
        if (other.getIpV6Cidr() != null && other.getIpV6Cidr().equals(this.getIpV6Cidr()) == false)
            return false;
        if (other.getContributingSubnets() == null ^ this.getContributingSubnets() == null)
            return false;
        if (other.getContributingSubnets() != null && other.getContributingSubnets().equals(this.getContributingSubnets()) == false)
            return false;
        if (other.getAllowedTargets() == null ^ this.getAllowedTargets() == null)
            return false;
        if (other.getAllowedTargets() != null && other.getAllowedTargets().equals(this.getAllowedTargets()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpV4Cidr() == null) ? 0 : getIpV4Cidr().hashCode());
        hashCode = prime * hashCode + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getIpV6Cidr() == null) ? 0 : getIpV6Cidr().hashCode());
        hashCode = prime * hashCode + ((getContributingSubnets() == null) ? 0 : getContributingSubnets().hashCode());
        hashCode = prime * hashCode + ((getAllowedTargets() == null) ? 0 : getAllowedTargets().hashCode());
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        return hashCode;
    }

    @Override
    public ExpectedRoute clone() {
        try {
            return (ExpectedRoute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.ExpectedRouteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

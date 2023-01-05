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

/**
 * <p>
 * Information about a customer-owned IP address range.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CoipCidr" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoipCidr implements Serializable, Cloneable {

    /**
     * <p>
     * An address range in a customer-owned IP address space.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The ID of the address pool.
     * </p>
     */
    private String coipPoolId;
    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     */
    private String localGatewayRouteTableId;

    /**
     * <p>
     * An address range in a customer-owned IP address space.
     * </p>
     * 
     * @param cidr
     *        An address range in a customer-owned IP address space.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * An address range in a customer-owned IP address space.
     * </p>
     * 
     * @return An address range in a customer-owned IP address space.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * An address range in a customer-owned IP address space.
     * </p>
     * 
     * @param cidr
     *        An address range in a customer-owned IP address space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoipCidr withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The ID of the address pool.
     * </p>
     * 
     * @param coipPoolId
     *        The ID of the address pool.
     */

    public void setCoipPoolId(String coipPoolId) {
        this.coipPoolId = coipPoolId;
    }

    /**
     * <p>
     * The ID of the address pool.
     * </p>
     * 
     * @return The ID of the address pool.
     */

    public String getCoipPoolId() {
        return this.coipPoolId;
    }

    /**
     * <p>
     * The ID of the address pool.
     * </p>
     * 
     * @param coipPoolId
     *        The ID of the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoipCidr withCoipPoolId(String coipPoolId) {
        setCoipPoolId(coipPoolId);
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     */

    public void setLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @return The ID of the local gateway route table.
     */

    public String getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoipCidr withLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        setLocalGatewayRouteTableId(localGatewayRouteTableId);
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
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getCoipPoolId() != null)
            sb.append("CoipPoolId: ").append(getCoipPoolId()).append(",");
        if (getLocalGatewayRouteTableId() != null)
            sb.append("LocalGatewayRouteTableId: ").append(getLocalGatewayRouteTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoipCidr == false)
            return false;
        CoipCidr other = (CoipCidr) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getCoipPoolId() == null ^ this.getCoipPoolId() == null)
            return false;
        if (other.getCoipPoolId() != null && other.getCoipPoolId().equals(this.getCoipPoolId()) == false)
            return false;
        if (other.getLocalGatewayRouteTableId() == null ^ this.getLocalGatewayRouteTableId() == null)
            return false;
        if (other.getLocalGatewayRouteTableId() != null && other.getLocalGatewayRouteTableId().equals(this.getLocalGatewayRouteTableId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getCoipPoolId() == null) ? 0 : getCoipPoolId().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayRouteTableId() == null) ? 0 : getLocalGatewayRouteTableId().hashCode());
        return hashCode;
    }

    @Override
    public CoipCidr clone() {
        try {
            return (CoipCidr) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

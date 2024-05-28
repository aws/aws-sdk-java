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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about a route table for the specified VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2RouteTableDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2RouteTableDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The associations between a route table and one or more subnets or a gateway.
     * </p>
     */
    private java.util.List<AssociationSetDetails> associationSet;
    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the route table.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * Describes a virtual private gateway propagating route.
     * </p>
     */
    private java.util.List<PropagatingVgwSetDetails> propagatingVgwSet;
    /**
     * <p>
     * The ID of the route table.
     * </p>
     */
    private String routeTableId;
    /**
     * <p>
     * The routes in the route table.
     * </p>
     */
    private java.util.List<RouteSetDetails> routeSet;
    /**
     * <p>
     * The ID of the virtual private cloud (VPC).
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The associations between a route table and one or more subnets or a gateway.
     * </p>
     * 
     * @return The associations between a route table and one or more subnets or a gateway.
     */

    public java.util.List<AssociationSetDetails> getAssociationSet() {
        return associationSet;
    }

    /**
     * <p>
     * The associations between a route table and one or more subnets or a gateway.
     * </p>
     * 
     * @param associationSet
     *        The associations between a route table and one or more subnets or a gateway.
     */

    public void setAssociationSet(java.util.Collection<AssociationSetDetails> associationSet) {
        if (associationSet == null) {
            this.associationSet = null;
            return;
        }

        this.associationSet = new java.util.ArrayList<AssociationSetDetails>(associationSet);
    }

    /**
     * <p>
     * The associations between a route table and one or more subnets or a gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociationSet(java.util.Collection)} or {@link #withAssociationSet(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param associationSet
     *        The associations between a route table and one or more subnets or a gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2RouteTableDetails withAssociationSet(AssociationSetDetails... associationSet) {
        if (this.associationSet == null) {
            setAssociationSet(new java.util.ArrayList<AssociationSetDetails>(associationSet.length));
        }
        for (AssociationSetDetails ele : associationSet) {
            this.associationSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The associations between a route table and one or more subnets or a gateway.
     * </p>
     * 
     * @param associationSet
     *        The associations between a route table and one or more subnets or a gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2RouteTableDetails withAssociationSet(java.util.Collection<AssociationSetDetails> associationSet) {
        setAssociationSet(associationSet);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the route table.
     * </p>
     * 
     * @param ownerId
     *        The ID of the Amazon Web Services account that owns the route table.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the route table.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that owns the route table.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the route table.
     * </p>
     * 
     * @param ownerId
     *        The ID of the Amazon Web Services account that owns the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2RouteTableDetails withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * Describes a virtual private gateway propagating route.
     * </p>
     * 
     * @return Describes a virtual private gateway propagating route.
     */

    public java.util.List<PropagatingVgwSetDetails> getPropagatingVgwSet() {
        return propagatingVgwSet;
    }

    /**
     * <p>
     * Describes a virtual private gateway propagating route.
     * </p>
     * 
     * @param propagatingVgwSet
     *        Describes a virtual private gateway propagating route.
     */

    public void setPropagatingVgwSet(java.util.Collection<PropagatingVgwSetDetails> propagatingVgwSet) {
        if (propagatingVgwSet == null) {
            this.propagatingVgwSet = null;
            return;
        }

        this.propagatingVgwSet = new java.util.ArrayList<PropagatingVgwSetDetails>(propagatingVgwSet);
    }

    /**
     * <p>
     * Describes a virtual private gateway propagating route.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropagatingVgwSet(java.util.Collection)} or {@link #withPropagatingVgwSet(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param propagatingVgwSet
     *        Describes a virtual private gateway propagating route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2RouteTableDetails withPropagatingVgwSet(PropagatingVgwSetDetails... propagatingVgwSet) {
        if (this.propagatingVgwSet == null) {
            setPropagatingVgwSet(new java.util.ArrayList<PropagatingVgwSetDetails>(propagatingVgwSet.length));
        }
        for (PropagatingVgwSetDetails ele : propagatingVgwSet) {
            this.propagatingVgwSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes a virtual private gateway propagating route.
     * </p>
     * 
     * @param propagatingVgwSet
     *        Describes a virtual private gateway propagating route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2RouteTableDetails withPropagatingVgwSet(java.util.Collection<PropagatingVgwSetDetails> propagatingVgwSet) {
        setPropagatingVgwSet(propagatingVgwSet);
        return this;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the route table.
     */

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @return The ID of the route table.
     */

    public String getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2RouteTableDetails withRouteTableId(String routeTableId) {
        setRouteTableId(routeTableId);
        return this;
    }

    /**
     * <p>
     * The routes in the route table.
     * </p>
     * 
     * @return The routes in the route table.
     */

    public java.util.List<RouteSetDetails> getRouteSet() {
        return routeSet;
    }

    /**
     * <p>
     * The routes in the route table.
     * </p>
     * 
     * @param routeSet
     *        The routes in the route table.
     */

    public void setRouteSet(java.util.Collection<RouteSetDetails> routeSet) {
        if (routeSet == null) {
            this.routeSet = null;
            return;
        }

        this.routeSet = new java.util.ArrayList<RouteSetDetails>(routeSet);
    }

    /**
     * <p>
     * The routes in the route table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteSet(java.util.Collection)} or {@link #withRouteSet(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param routeSet
     *        The routes in the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2RouteTableDetails withRouteSet(RouteSetDetails... routeSet) {
        if (this.routeSet == null) {
            setRouteSet(new java.util.ArrayList<RouteSetDetails>(routeSet.length));
        }
        for (RouteSetDetails ele : routeSet) {
            this.routeSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The routes in the route table.
     * </p>
     * 
     * @param routeSet
     *        The routes in the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2RouteTableDetails withRouteSet(java.util.Collection<RouteSetDetails> routeSet) {
        setRouteSet(routeSet);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC).
     * </p>
     * 
     * @param vpcId
     *        The ID of the virtual private cloud (VPC).
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC).
     * </p>
     * 
     * @return The ID of the virtual private cloud (VPC).
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC).
     * </p>
     * 
     * @param vpcId
     *        The ID of the virtual private cloud (VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2RouteTableDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getAssociationSet() != null)
            sb.append("AssociationSet: ").append(getAssociationSet()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getPropagatingVgwSet() != null)
            sb.append("PropagatingVgwSet: ").append(getPropagatingVgwSet()).append(",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: ").append(getRouteTableId()).append(",");
        if (getRouteSet() != null)
            sb.append("RouteSet: ").append(getRouteSet()).append(",");
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

        if (obj instanceof AwsEc2RouteTableDetails == false)
            return false;
        AwsEc2RouteTableDetails other = (AwsEc2RouteTableDetails) obj;
        if (other.getAssociationSet() == null ^ this.getAssociationSet() == null)
            return false;
        if (other.getAssociationSet() != null && other.getAssociationSet().equals(this.getAssociationSet()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getPropagatingVgwSet() == null ^ this.getPropagatingVgwSet() == null)
            return false;
        if (other.getPropagatingVgwSet() != null && other.getPropagatingVgwSet().equals(this.getPropagatingVgwSet()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getRouteSet() == null ^ this.getRouteSet() == null)
            return false;
        if (other.getRouteSet() != null && other.getRouteSet().equals(this.getRouteSet()) == false)
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

        hashCode = prime * hashCode + ((getAssociationSet() == null) ? 0 : getAssociationSet().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getPropagatingVgwSet() == null) ? 0 : getPropagatingVgwSet().hashCode());
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getRouteSet() == null) ? 0 : getRouteSet().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2RouteTableDetails clone() {
        try {
            return (AwsEc2RouteTableDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2RouteTableDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

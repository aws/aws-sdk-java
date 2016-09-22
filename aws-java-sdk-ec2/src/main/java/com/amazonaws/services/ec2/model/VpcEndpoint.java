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
 * Describes a VPC endpoint.
 * </p>
 */
public class VpcEndpoint implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     */
    private String vpcEndpointId;
    /**
     * <p>
     * The ID of the VPC to which the endpoint is associated.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The name of the AWS service to which the endpoint is associated.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The policy document associated with the endpoint.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * One or more route tables associated with the endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> routeTableIds;
    /**
     * <p>
     * The date and time the VPC endpoint was created.
     * </p>
     */
    private java.util.Date creationTimestamp;

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of the VPC endpoint.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * 
     * @return The ID of the VPC endpoint.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC to which the endpoint is associated.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC to which the endpoint is associated.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC to which the endpoint is associated.
     * </p>
     * 
     * @return The ID of the VPC to which the endpoint is associated.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC to which the endpoint is associated.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC to which the endpoint is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The name of the AWS service to which the endpoint is associated.
     * </p>
     * 
     * @param serviceName
     *        The name of the AWS service to which the endpoint is associated.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the AWS service to which the endpoint is associated.
     * </p>
     * 
     * @return The name of the AWS service to which the endpoint is associated.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the AWS service to which the endpoint is associated.
     * </p>
     * 
     * @param serviceName
     *        The name of the AWS service to which the endpoint is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * 
     * @param state
     *        The state of the VPC endpoint.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * 
     * @return The state of the VPC endpoint.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * 
     * @param state
     *        The state of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public VpcEndpoint withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * 
     * @param state
     *        The state of the VPC endpoint.
     * @see State
     */

    public void setState(State state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * 
     * @param state
     *        The state of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public VpcEndpoint withState(State state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The policy document associated with the endpoint.
     * </p>
     * 
     * @param policyDocument
     *        The policy document associated with the endpoint.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The policy document associated with the endpoint.
     * </p>
     * 
     * @return The policy document associated with the endpoint.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The policy document associated with the endpoint.
     * </p>
     * 
     * @param policyDocument
     *        The policy document associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * One or more route tables associated with the endpoint.
     * </p>
     * 
     * @return One or more route tables associated with the endpoint.
     */

    public java.util.List<String> getRouteTableIds() {
        if (routeTableIds == null) {
            routeTableIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return routeTableIds;
    }

    /**
     * <p>
     * One or more route tables associated with the endpoint.
     * </p>
     * 
     * @param routeTableIds
     *        One or more route tables associated with the endpoint.
     */

    public void setRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
            return;
        }

        this.routeTableIds = new com.amazonaws.internal.SdkInternalList<String>(routeTableIds);
    }

    /**
     * <p>
     * One or more route tables associated with the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteTableIds(java.util.Collection)} or {@link #withRouteTableIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param routeTableIds
     *        One or more route tables associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withRouteTableIds(String... routeTableIds) {
        if (this.routeTableIds == null) {
            setRouteTableIds(new com.amazonaws.internal.SdkInternalList<String>(routeTableIds.length));
        }
        for (String ele : routeTableIds) {
            this.routeTableIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more route tables associated with the endpoint.
     * </p>
     * 
     * @param routeTableIds
     *        One or more route tables associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withRouteTableIds(java.util.Collection<String> routeTableIds) {
        setRouteTableIds(routeTableIds);
        return this;
    }

    /**
     * <p>
     * The date and time the VPC endpoint was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The date and time the VPC endpoint was created.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The date and time the VPC endpoint was created.
     * </p>
     * 
     * @return The date and time the VPC endpoint was created.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The date and time the VPC endpoint was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The date and time the VPC endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
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
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: " + getVpcEndpointId() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getServiceName() != null)
            sb.append("ServiceName: " + getServiceName() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (getRouteTableIds() != null)
            sb.append("RouteTableIds: " + getRouteTableIds() + ",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: " + getCreationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcEndpoint == false)
            return false;
        VpcEndpoint other = (VpcEndpoint) obj;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getRouteTableIds() == null ^ this.getRouteTableIds() == null)
            return false;
        if (other.getRouteTableIds() != null && other.getRouteTableIds().equals(this.getRouteTableIds()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getRouteTableIds() == null) ? 0 : getRouteTableIds().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public VpcEndpoint clone() {
        try {
            return (VpcEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

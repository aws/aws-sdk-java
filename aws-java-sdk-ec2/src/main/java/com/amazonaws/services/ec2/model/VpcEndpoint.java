/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
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
     * The ID of the VPC endpoint.
     */
    private String vpcEndpointId;

    /**
     * The ID of the VPC to which the endpoint is associated.
     */
    private String vpcId;

    /**
     * The name of the AWS service to which the endpoint is associated.
     */
    private String serviceName;

    /**
     * The state of the VPC endpoint.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Available, Deleting, Deleted
     */
    private String state;

    /**
     * The policy document associated with the endpoint.
     */
    private String policyDocument;

    /**
     * One or more route tables associated with the endpoint.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> routeTableIds;

    /**
     * The date and time the VPC endpoint was created.
     */
    private java.util.Date creationTimestamp;

    /**
     * The ID of the VPC endpoint.
     *
     * @return The ID of the VPC endpoint.
     */
    public String getVpcEndpointId() {
        return vpcEndpointId;
    }
    
    /**
     * The ID of the VPC endpoint.
     *
     * @param vpcEndpointId The ID of the VPC endpoint.
     */
    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }
    
    /**
     * The ID of the VPC endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcEndpointId The ID of the VPC endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcEndpoint withVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    /**
     * The ID of the VPC to which the endpoint is associated.
     *
     * @return The ID of the VPC to which the endpoint is associated.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC to which the endpoint is associated.
     *
     * @param vpcId The ID of the VPC to which the endpoint is associated.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC to which the endpoint is associated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC to which the endpoint is associated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcEndpoint withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The name of the AWS service to which the endpoint is associated.
     *
     * @return The name of the AWS service to which the endpoint is associated.
     */
    public String getServiceName() {
        return serviceName;
    }
    
    /**
     * The name of the AWS service to which the endpoint is associated.
     *
     * @param serviceName The name of the AWS service to which the endpoint is associated.
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    
    /**
     * The name of the AWS service to which the endpoint is associated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceName The name of the AWS service to which the endpoint is associated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcEndpoint withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * The state of the VPC endpoint.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Available, Deleting, Deleted
     *
     * @return The state of the VPC endpoint.
     *
     * @see State
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the VPC endpoint.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Available, Deleting, Deleted
     *
     * @param state The state of the VPC endpoint.
     *
     * @see State
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the VPC endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Available, Deleting, Deleted
     *
     * @param state The state of the VPC endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see State
     */
    public VpcEndpoint withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the VPC endpoint.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Available, Deleting, Deleted
     *
     * @param state The state of the VPC endpoint.
     *
     * @see State
     */
    public void setState(State state) {
        this.state = state.toString();
    }
    
    /**
     * The state of the VPC endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Available, Deleting, Deleted
     *
     * @param state The state of the VPC endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see State
     */
    public VpcEndpoint withState(State state) {
        this.state = state.toString();
        return this;
    }

    /**
     * The policy document associated with the endpoint.
     *
     * @return The policy document associated with the endpoint.
     */
    public String getPolicyDocument() {
        return policyDocument;
    }
    
    /**
     * The policy document associated with the endpoint.
     *
     * @param policyDocument The policy document associated with the endpoint.
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }
    
    /**
     * The policy document associated with the endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyDocument The policy document associated with the endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcEndpoint withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * One or more route tables associated with the endpoint.
     *
     * @return One or more route tables associated with the endpoint.
     */
    public java.util.List<String> getRouteTableIds() {
        if (routeTableIds == null) {
              routeTableIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              routeTableIds.setAutoConstruct(true);
        }
        return routeTableIds;
    }
    
    /**
     * One or more route tables associated with the endpoint.
     *
     * @param routeTableIds One or more route tables associated with the endpoint.
     */
    public void setRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> routeTableIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(routeTableIds.size());
        routeTableIdsCopy.addAll(routeTableIds);
        this.routeTableIds = routeTableIdsCopy;
    }
    
    /**
     * One or more route tables associated with the endpoint.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRouteTableIds(java.util.Collection)} or {@link
     * #withRouteTableIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableIds One or more route tables associated with the endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcEndpoint withRouteTableIds(String... routeTableIds) {
        if (getRouteTableIds() == null) setRouteTableIds(new java.util.ArrayList<String>(routeTableIds.length));
        for (String value : routeTableIds) {
            getRouteTableIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more route tables associated with the endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableIds One or more route tables associated with the endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcEndpoint withRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> routeTableIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(routeTableIds.size());
            routeTableIdsCopy.addAll(routeTableIds);
            this.routeTableIds = routeTableIdsCopy;
        }

        return this;
    }

    /**
     * The date and time the VPC endpoint was created.
     *
     * @return The date and time the VPC endpoint was created.
     */
    public java.util.Date getCreationTimestamp() {
        return creationTimestamp;
    }
    
    /**
     * The date and time the VPC endpoint was created.
     *
     * @param creationTimestamp The date and time the VPC endpoint was created.
     */
    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }
    
    /**
     * The date and time the VPC endpoint was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationTimestamp The date and time the VPC endpoint was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcEndpoint withCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVpcEndpointId() != null) sb.append("VpcEndpointId: " + getVpcEndpointId() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getServiceName() != null) sb.append("ServiceName: " + getServiceName() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getPolicyDocument() != null) sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (getRouteTableIds() != null) sb.append("RouteTableIds: " + getRouteTableIds() + ",");
        if (getCreationTimestamp() != null) sb.append("CreationTimestamp: " + getCreationTimestamp() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VpcEndpoint == false) return false;
        VpcEndpoint other = (VpcEndpoint)obj;
        
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null) return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getServiceName() == null ^ this.getServiceName() == null) return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null) return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false) return false; 
        if (other.getRouteTableIds() == null ^ this.getRouteTableIds() == null) return false;
        if (other.getRouteTableIds() != null && other.getRouteTableIds().equals(this.getRouteTableIds()) == false) return false; 
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null) return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false) return false; 
        return true;
    }
    
    @Override
    public VpcEndpoint clone() {
        try {
            return (VpcEndpoint) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    
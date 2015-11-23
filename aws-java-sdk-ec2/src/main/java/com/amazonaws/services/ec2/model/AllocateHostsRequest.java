/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#allocateHosts(AllocateHostsRequest) AllocateHosts operation}.
 * <p>
 * Allocates a Dedicated host to your account. At minimum you need to
 * specify the instance size type, Availability Zone, and quantity of
 * hosts you want to allocate.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#allocateHosts(AllocateHostsRequest)
 */
public class AllocateHostsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * This is enabled by default. This property allows instances to be
     * automatically placed onto available Dedicated hosts, when you are
     * launching instances without specifying a host ID. <p>Default: Enabled
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     */
    private String autoPlacement;

    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     */
    private String clientToken;

    /**
     * Specify the instance type that you want your Dedicated hosts to be
     * configured for. When you specify the instance type, that is the only
     * instance type that you can launch onto that host.
     */
    private String instanceType;

    /**
     * The number of Dedicated hosts you want to allocate to your account
     * with these parameters.
     */
    private Integer quantity;

    /**
     * The Availability Zone for the Dedicated hosts.
     */
    private String availabilityZone;

    /**
     * This is enabled by default. This property allows instances to be
     * automatically placed onto available Dedicated hosts, when you are
     * launching instances without specifying a host ID. <p>Default: Enabled
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @return This is enabled by default. This property allows instances to be
     *         automatically placed onto available Dedicated hosts, when you are
     *         launching instances without specifying a host ID. <p>Default: Enabled
     *
     * @see AutoPlacement
     */
    public String getAutoPlacement() {
        return autoPlacement;
    }
    
    /**
     * This is enabled by default. This property allows instances to be
     * automatically placed onto available Dedicated hosts, when you are
     * launching instances without specifying a host ID. <p>Default: Enabled
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement This is enabled by default. This property allows instances to be
     *         automatically placed onto available Dedicated hosts, when you are
     *         launching instances without specifying a host ID. <p>Default: Enabled
     *
     * @see AutoPlacement
     */
    public void setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
    }
    
    /**
     * This is enabled by default. This property allows instances to be
     * automatically placed onto available Dedicated hosts, when you are
     * launching instances without specifying a host ID. <p>Default: Enabled
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement This is enabled by default. This property allows instances to be
     *         automatically placed onto available Dedicated hosts, when you are
     *         launching instances without specifying a host ID. <p>Default: Enabled
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AutoPlacement
     */
    public AllocateHostsRequest withAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }

    /**
     * This is enabled by default. This property allows instances to be
     * automatically placed onto available Dedicated hosts, when you are
     * launching instances without specifying a host ID. <p>Default: Enabled
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement This is enabled by default. This property allows instances to be
     *         automatically placed onto available Dedicated hosts, when you are
     *         launching instances without specifying a host ID. <p>Default: Enabled
     *
     * @see AutoPlacement
     */
    public void setAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
    }
    
    /**
     * This is enabled by default. This property allows instances to be
     * automatically placed onto available Dedicated hosts, when you are
     * launching instances without specifying a host ID. <p>Default: Enabled
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement This is enabled by default. This property allows instances to be
     *         automatically placed onto available Dedicated hosts, when you are
     *         launching instances without specifying a host ID. <p>Default: Enabled
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AutoPlacement
     */
    public AllocateHostsRequest withAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
        return this;
    }

    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @return Unique, case-sensitive identifier you provide to ensure idempotency of
     *         the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure idempotency of
     *         the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure idempotency of
     *         the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AllocateHostsRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * Specify the instance type that you want your Dedicated hosts to be
     * configured for. When you specify the instance type, that is the only
     * instance type that you can launch onto that host.
     *
     * @return Specify the instance type that you want your Dedicated hosts to be
     *         configured for. When you specify the instance type, that is the only
     *         instance type that you can launch onto that host.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * Specify the instance type that you want your Dedicated hosts to be
     * configured for. When you specify the instance type, that is the only
     * instance type that you can launch onto that host.
     *
     * @param instanceType Specify the instance type that you want your Dedicated hosts to be
     *         configured for. When you specify the instance type, that is the only
     *         instance type that you can launch onto that host.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * Specify the instance type that you want your Dedicated hosts to be
     * configured for. When you specify the instance type, that is the only
     * instance type that you can launch onto that host.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType Specify the instance type that you want your Dedicated hosts to be
     *         configured for. When you specify the instance type, that is the only
     *         instance type that you can launch onto that host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AllocateHostsRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The number of Dedicated hosts you want to allocate to your account
     * with these parameters.
     *
     * @return The number of Dedicated hosts you want to allocate to your account
     *         with these parameters.
     */
    public Integer getQuantity() {
        return quantity;
    }
    
    /**
     * The number of Dedicated hosts you want to allocate to your account
     * with these parameters.
     *
     * @param quantity The number of Dedicated hosts you want to allocate to your account
     *         with these parameters.
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    /**
     * The number of Dedicated hosts you want to allocate to your account
     * with these parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param quantity The number of Dedicated hosts you want to allocate to your account
     *         with these parameters.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AllocateHostsRequest withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * The Availability Zone for the Dedicated hosts.
     *
     * @return The Availability Zone for the Dedicated hosts.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone for the Dedicated hosts.
     *
     * @param availabilityZone The Availability Zone for the Dedicated hosts.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone for the Dedicated hosts.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone for the Dedicated hosts.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AllocateHostsRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
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
        if (getAutoPlacement() != null) sb.append("AutoPlacement: " + getAutoPlacement() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getQuantity() != null) sb.append("Quantity: " + getQuantity() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAutoPlacement() == null) ? 0 : getAutoPlacement().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AllocateHostsRequest == false) return false;
        AllocateHostsRequest other = (AllocateHostsRequest)obj;
        
        if (other.getAutoPlacement() == null ^ this.getAutoPlacement() == null) return false;
        if (other.getAutoPlacement() != null && other.getAutoPlacement().equals(this.getAutoPlacement()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getQuantity() == null ^ this.getQuantity() == null) return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        return true;
    }
    
    @Override
    public AllocateHostsRequest clone() {
        
            return (AllocateHostsRequest) super.clone();
    }

}
    
/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;


/**
 * <p>
 * Represents an EC2 instance provisioned as part of cluster.
 * </p>
 */
public class Instance implements Serializable {

    /**
     * The unique identifier for the instance in Amazon EMR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String id;

    /**
     * The unique identifier of the instance in Amazon EC2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String ec2InstanceId;

    /**
     * The public DNS name of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String publicDnsName;

    /**
     * The public IP address of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String publicIpAddress;

    /**
     * The private DNS name of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String privateDnsName;

    /**
     * The private IP address of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String privateIpAddress;

    /**
     * The current status of the instance.
     */
    private InstanceStatus status;

    /**
     * The unique identifier for the instance in Amazon EMR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The unique identifier for the instance in Amazon EMR.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The unique identifier for the instance in Amazon EMR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param id The unique identifier for the instance in Amazon EMR.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The unique identifier for the instance in Amazon EMR.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param id The unique identifier for the instance in Amazon EMR.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the instance in Amazon EC2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The unique identifier of the instance in Amazon EC2.
     */
    public String getEc2InstanceId() {
        return ec2InstanceId;
    }
    
    /**
     * The unique identifier of the instance in Amazon EC2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param ec2InstanceId The unique identifier of the instance in Amazon EC2.
     */
    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }
    
    /**
     * The unique identifier of the instance in Amazon EC2.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param ec2InstanceId The unique identifier of the instance in Amazon EC2.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
        return this;
    }

    /**
     * The public DNS name of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The public DNS name of the instance.
     */
    public String getPublicDnsName() {
        return publicDnsName;
    }
    
    /**
     * The public DNS name of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param publicDnsName The public DNS name of the instance.
     */
    public void setPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
    }
    
    /**
     * The public DNS name of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param publicDnsName The public DNS name of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
        return this;
    }

    /**
     * The public IP address of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The public IP address of the instance.
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }
    
    /**
     * The public IP address of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param publicIpAddress The public IP address of the instance.
     */
    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }
    
    /**
     * The public IP address of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param publicIpAddress The public IP address of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * The private DNS name of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The private DNS name of the instance.
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }
    
    /**
     * The private DNS name of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param privateDnsName The private DNS name of the instance.
     */
    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }
    
    /**
     * The private DNS name of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param privateDnsName The private DNS name of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
        return this;
    }

    /**
     * The private IP address of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The private IP address of the instance.
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * The private IP address of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param privateIpAddress The private IP address of the instance.
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * The private IP address of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param privateIpAddress The private IP address of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * The current status of the instance.
     *
     * @return The current status of the instance.
     */
    public InstanceStatus getStatus() {
        return status;
    }
    
    /**
     * The current status of the instance.
     *
     * @param status The current status of the instance.
     */
    public void setStatus(InstanceStatus status) {
        this.status = status;
    }
    
    /**
     * The current status of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The current status of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withStatus(InstanceStatus status) {
        this.status = status;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getEc2InstanceId() != null) sb.append("Ec2InstanceId: " + getEc2InstanceId() + ",");
        if (getPublicDnsName() != null) sb.append("PublicDnsName: " + getPublicDnsName() + ",");
        if (getPublicIpAddress() != null) sb.append("PublicIpAddress: " + getPublicIpAddress() + ",");
        if (getPrivateDnsName() != null) sb.append("PrivateDnsName: " + getPrivateDnsName() + ",");
        if (getPrivateIpAddress() != null) sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getPublicDnsName() == null) ? 0 : getPublicDnsName().hashCode()); 
        hashCode = prime * hashCode + ((getPublicIpAddress() == null) ? 0 : getPublicIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Instance == false) return false;
        Instance other = (Instance)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null) return false;
        if (other.getEc2InstanceId() != null && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false) return false; 
        if (other.getPublicDnsName() == null ^ this.getPublicDnsName() == null) return false;
        if (other.getPublicDnsName() != null && other.getPublicDnsName().equals(this.getPublicDnsName()) == false) return false; 
        if (other.getPublicIpAddress() == null ^ this.getPublicIpAddress() == null) return false;
        if (other.getPublicIpAddress() != null && other.getPublicIpAddress().equals(this.getPublicIpAddress()) == false) return false; 
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null) return false;
        if (other.getPrivateDnsName() != null && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false) return false; 
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null) return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    
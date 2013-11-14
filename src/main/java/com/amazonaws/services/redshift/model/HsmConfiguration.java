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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * Returns information about an HSM configuration, which is an object that describes to Amazon Redshift clusters the information they require to connect
 * to an HSM where they can store database encryption keys.
 * </p>
 */
public class HsmConfiguration implements Serializable {

    /**
     * The name of the Amazon Redshift HSM configuration.
     */
    private String hsmConfigurationIdentifier;

    /**
     * A text description of the HSM configuration.
     */
    private String description;

    /**
     * The IP address that the Amazon Redshift cluster must use to access the
     * HSM.
     */
    private String hsmIpAddress;

    /**
     * The name of the partition in the HSM where the Amazon Redshift
     * clusters will store their database encryption keys.
     */
    private String hsmPartitionName;

    /**
     * The name of the Amazon Redshift HSM configuration.
     *
     * @return The name of the Amazon Redshift HSM configuration.
     */
    public String getHsmConfigurationIdentifier() {
        return hsmConfigurationIdentifier;
    }
    
    /**
     * The name of the Amazon Redshift HSM configuration.
     *
     * @param hsmConfigurationIdentifier The name of the Amazon Redshift HSM configuration.
     */
    public void setHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
    }
    
    /**
     * The name of the Amazon Redshift HSM configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmConfigurationIdentifier The name of the Amazon Redshift HSM configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HsmConfiguration withHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
        return this;
    }

    /**
     * A text description of the HSM configuration.
     *
     * @return A text description of the HSM configuration.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A text description of the HSM configuration.
     *
     * @param description A text description of the HSM configuration.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A text description of the HSM configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A text description of the HSM configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HsmConfiguration withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The IP address that the Amazon Redshift cluster must use to access the
     * HSM.
     *
     * @return The IP address that the Amazon Redshift cluster must use to access the
     *         HSM.
     */
    public String getHsmIpAddress() {
        return hsmIpAddress;
    }
    
    /**
     * The IP address that the Amazon Redshift cluster must use to access the
     * HSM.
     *
     * @param hsmIpAddress The IP address that the Amazon Redshift cluster must use to access the
     *         HSM.
     */
    public void setHsmIpAddress(String hsmIpAddress) {
        this.hsmIpAddress = hsmIpAddress;
    }
    
    /**
     * The IP address that the Amazon Redshift cluster must use to access the
     * HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmIpAddress The IP address that the Amazon Redshift cluster must use to access the
     *         HSM.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HsmConfiguration withHsmIpAddress(String hsmIpAddress) {
        this.hsmIpAddress = hsmIpAddress;
        return this;
    }

    /**
     * The name of the partition in the HSM where the Amazon Redshift
     * clusters will store their database encryption keys.
     *
     * @return The name of the partition in the HSM where the Amazon Redshift
     *         clusters will store their database encryption keys.
     */
    public String getHsmPartitionName() {
        return hsmPartitionName;
    }
    
    /**
     * The name of the partition in the HSM where the Amazon Redshift
     * clusters will store their database encryption keys.
     *
     * @param hsmPartitionName The name of the partition in the HSM where the Amazon Redshift
     *         clusters will store their database encryption keys.
     */
    public void setHsmPartitionName(String hsmPartitionName) {
        this.hsmPartitionName = hsmPartitionName;
    }
    
    /**
     * The name of the partition in the HSM where the Amazon Redshift
     * clusters will store their database encryption keys.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmPartitionName The name of the partition in the HSM where the Amazon Redshift
     *         clusters will store their database encryption keys.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HsmConfiguration withHsmPartitionName(String hsmPartitionName) {
        this.hsmPartitionName = hsmPartitionName;
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
        if (getHsmConfigurationIdentifier() != null) sb.append("HsmConfigurationIdentifier: " + getHsmConfigurationIdentifier() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getHsmIpAddress() != null) sb.append("HsmIpAddress: " + getHsmIpAddress() + ",");
        if (getHsmPartitionName() != null) sb.append("HsmPartitionName: " + getHsmPartitionName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHsmConfigurationIdentifier() == null) ? 0 : getHsmConfigurationIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getHsmIpAddress() == null) ? 0 : getHsmIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((getHsmPartitionName() == null) ? 0 : getHsmPartitionName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HsmConfiguration == false) return false;
        HsmConfiguration other = (HsmConfiguration)obj;
        
        if (other.getHsmConfigurationIdentifier() == null ^ this.getHsmConfigurationIdentifier() == null) return false;
        if (other.getHsmConfigurationIdentifier() != null && other.getHsmConfigurationIdentifier().equals(this.getHsmConfigurationIdentifier()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getHsmIpAddress() == null ^ this.getHsmIpAddress() == null) return false;
        if (other.getHsmIpAddress() != null && other.getHsmIpAddress().equals(this.getHsmIpAddress()) == false) return false; 
        if (other.getHsmPartitionName() == null ^ this.getHsmPartitionName() == null) return false;
        if (other.getHsmPartitionName() != null && other.getHsmPartitionName().equals(this.getHsmPartitionName()) == false) return false; 
        return true;
    }
    
}
    
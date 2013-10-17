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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;


/**
 * <p>
 * The information retrieved from the Amazon EC2 instances.
 * </p>
 */
public class EnvironmentInfoDescription implements Serializable {

    /**
     * The type of information retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     */
    private String infoType;

    /**
     * The Amazon EC2 Instance ID for this information.
     */
    private String ec2InstanceId;

    /**
     * The time stamp when this information was retrieved.
     */
    private java.util.Date sampleTimestamp;

    /**
     * The retrieved information.
     */
    private String message;

    /**
     * Default constructor for a new EnvironmentInfoDescription object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public EnvironmentInfoDescription() {}
    
    /**
     * The type of information retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     *
     * @return The type of information retrieved.
     *
     * @see EnvironmentInfoType
     */
    public String getInfoType() {
        return infoType;
    }
    
    /**
     * The type of information retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     *
     * @param infoType The type of information retrieved.
     *
     * @see EnvironmentInfoType
     */
    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }
    
    /**
     * The type of information retrieved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     *
     * @param infoType The type of information retrieved.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see EnvironmentInfoType
     */
    public EnvironmentInfoDescription withInfoType(String infoType) {
        this.infoType = infoType;
        return this;
    }

    /**
     * The type of information retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     *
     * @param infoType The type of information retrieved.
     *
     * @see EnvironmentInfoType
     */
    public void setInfoType(EnvironmentInfoType infoType) {
        this.infoType = infoType.toString();
    }
    
    /**
     * The type of information retrieved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     *
     * @param infoType The type of information retrieved.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see EnvironmentInfoType
     */
    public EnvironmentInfoDescription withInfoType(EnvironmentInfoType infoType) {
        this.infoType = infoType.toString();
        return this;
    }

    /**
     * The Amazon EC2 Instance ID for this information.
     *
     * @return The Amazon EC2 Instance ID for this information.
     */
    public String getEc2InstanceId() {
        return ec2InstanceId;
    }
    
    /**
     * The Amazon EC2 Instance ID for this information.
     *
     * @param ec2InstanceId The Amazon EC2 Instance ID for this information.
     */
    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }
    
    /**
     * The Amazon EC2 Instance ID for this information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2InstanceId The Amazon EC2 Instance ID for this information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnvironmentInfoDescription withEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
        return this;
    }

    /**
     * The time stamp when this information was retrieved.
     *
     * @return The time stamp when this information was retrieved.
     */
    public java.util.Date getSampleTimestamp() {
        return sampleTimestamp;
    }
    
    /**
     * The time stamp when this information was retrieved.
     *
     * @param sampleTimestamp The time stamp when this information was retrieved.
     */
    public void setSampleTimestamp(java.util.Date sampleTimestamp) {
        this.sampleTimestamp = sampleTimestamp;
    }
    
    /**
     * The time stamp when this information was retrieved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sampleTimestamp The time stamp when this information was retrieved.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnvironmentInfoDescription withSampleTimestamp(java.util.Date sampleTimestamp) {
        this.sampleTimestamp = sampleTimestamp;
        return this;
    }

    /**
     * The retrieved information.
     *
     * @return The retrieved information.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The retrieved information.
     *
     * @param message The retrieved information.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The retrieved information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message The retrieved information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnvironmentInfoDescription withMessage(String message) {
        this.message = message;
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
        if (getInfoType() != null) sb.append("InfoType: " + getInfoType() + ",");
        if (getEc2InstanceId() != null) sb.append("Ec2InstanceId: " + getEc2InstanceId() + ",");
        if (getSampleTimestamp() != null) sb.append("SampleTimestamp: " + getSampleTimestamp() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInfoType() == null) ? 0 : getInfoType().hashCode()); 
        hashCode = prime * hashCode + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getSampleTimestamp() == null) ? 0 : getSampleTimestamp().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EnvironmentInfoDescription == false) return false;
        EnvironmentInfoDescription other = (EnvironmentInfoDescription)obj;
        
        if (other.getInfoType() == null ^ this.getInfoType() == null) return false;
        if (other.getInfoType() != null && other.getInfoType().equals(this.getInfoType()) == false) return false; 
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null) return false;
        if (other.getEc2InstanceId() != null && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false) return false; 
        if (other.getSampleTimestamp() == null ^ this.getSampleTimestamp() == null) return false;
        if (other.getSampleTimestamp() != null && other.getSampleTimestamp().equals(this.getSampleTimestamp()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        return true;
    }
    
}
    
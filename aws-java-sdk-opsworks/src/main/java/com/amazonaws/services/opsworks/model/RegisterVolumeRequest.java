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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class RegisterVolumeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon EBS volume ID.
     * </p>
     */
    private String ec2VolumeId;
    /**
     * <p>
     * The stack ID.
     * </p>
     */
    private String stackId;

    /**
     * <p>
     * The Amazon EBS volume ID.
     * </p>
     * 
     * @param ec2VolumeId
     *        The Amazon EBS volume ID.
     */

    public void setEc2VolumeId(String ec2VolumeId) {
        this.ec2VolumeId = ec2VolumeId;
    }

    /**
     * <p>
     * The Amazon EBS volume ID.
     * </p>
     * 
     * @return The Amazon EBS volume ID.
     */

    public String getEc2VolumeId() {
        return this.ec2VolumeId;
    }

    /**
     * <p>
     * The Amazon EBS volume ID.
     * </p>
     * 
     * @param ec2VolumeId
     *        The Amazon EBS volume ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterVolumeRequest withEc2VolumeId(String ec2VolumeId) {
        setEc2VolumeId(ec2VolumeId);
        return this;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @return The stack ID.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterVolumeRequest withStackId(String stackId) {
        setStackId(stackId);
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
        if (getEc2VolumeId() != null)
            sb.append("Ec2VolumeId: " + getEc2VolumeId() + ",");
        if (getStackId() != null)
            sb.append("StackId: " + getStackId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterVolumeRequest == false)
            return false;
        RegisterVolumeRequest other = (RegisterVolumeRequest) obj;
        if (other.getEc2VolumeId() == null ^ this.getEc2VolumeId() == null)
            return false;
        if (other.getEc2VolumeId() != null && other.getEc2VolumeId().equals(this.getEc2VolumeId()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEc2VolumeId() == null) ? 0 : getEc2VolumeId().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        return hashCode;
    }

    @Override
    public RegisterVolumeRequest clone() {
        return (RegisterVolumeRequest) super.clone();
    }
}

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
 * Details about the target configuration.
 * </p>
 */
public class TargetConfigurationRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Convertible Reserved Instance offering ID. If this isn't included in the request, the response lists your
     * current Convertible Reserved Instance/s and their value/s.
     * </p>
     */
    private String offeringId;
    /**
     * <p>
     * The number of instances the Covertible Reserved Instance offering can be applied to. This parameter is reserved
     * and cannot be specified in a request
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * The Convertible Reserved Instance offering ID. If this isn't included in the request, the response lists your
     * current Convertible Reserved Instance/s and their value/s.
     * </p>
     * 
     * @param offeringId
     *        The Convertible Reserved Instance offering ID. If this isn't included in the request, the response lists
     *        your current Convertible Reserved Instance/s and their value/s.
     */

    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The Convertible Reserved Instance offering ID. If this isn't included in the request, the response lists your
     * current Convertible Reserved Instance/s and their value/s.
     * </p>
     * 
     * @return The Convertible Reserved Instance offering ID. If this isn't included in the request, the response lists
     *         your current Convertible Reserved Instance/s and their value/s.
     */

    public String getOfferingId() {
        return this.offeringId;
    }

    /**
     * <p>
     * The Convertible Reserved Instance offering ID. If this isn't included in the request, the response lists your
     * current Convertible Reserved Instance/s and their value/s.
     * </p>
     * 
     * @param offeringId
     *        The Convertible Reserved Instance offering ID. If this isn't included in the request, the response lists
     *        your current Convertible Reserved Instance/s and their value/s.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetConfigurationRequest withOfferingId(String offeringId) {
        setOfferingId(offeringId);
        return this;
    }

    /**
     * <p>
     * The number of instances the Covertible Reserved Instance offering can be applied to. This parameter is reserved
     * and cannot be specified in a request
     * </p>
     * 
     * @param instanceCount
     *        The number of instances the Covertible Reserved Instance offering can be applied to. This parameter is
     *        reserved and cannot be specified in a request
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances the Covertible Reserved Instance offering can be applied to. This parameter is reserved
     * and cannot be specified in a request
     * </p>
     * 
     * @return The number of instances the Covertible Reserved Instance offering can be applied to. This parameter is
     *         reserved and cannot be specified in a request
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of instances the Covertible Reserved Instance offering can be applied to. This parameter is reserved
     * and cannot be specified in a request
     * </p>
     * 
     * @param instanceCount
     *        The number of instances the Covertible Reserved Instance offering can be applied to. This parameter is
     *        reserved and cannot be specified in a request
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetConfigurationRequest withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
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
        if (getOfferingId() != null)
            sb.append("OfferingId: " + getOfferingId() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetConfigurationRequest == false)
            return false;
        TargetConfigurationRequest other = (TargetConfigurationRequest) obj;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        return hashCode;
    }

    @Override
    public TargetConfigurationRequest clone() {
        try {
            return (TargetConfigurationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about the Convertible Reserved Instance offering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TargetConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The number of instances the Convertible Reserved Instance offering can be applied to. This parameter is reserved
     * and cannot be specified in a request
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The ID of the Convertible Reserved Instance offering.
     * </p>
     */
    private String offeringId;

    /**
     * <p>
     * The number of instances the Convertible Reserved Instance offering can be applied to. This parameter is reserved
     * and cannot be specified in a request
     * </p>
     * 
     * @param instanceCount
     *        The number of instances the Convertible Reserved Instance offering can be applied to. This parameter is
     *        reserved and cannot be specified in a request
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances the Convertible Reserved Instance offering can be applied to. This parameter is reserved
     * and cannot be specified in a request
     * </p>
     * 
     * @return The number of instances the Convertible Reserved Instance offering can be applied to. This parameter is
     *         reserved and cannot be specified in a request
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of instances the Convertible Reserved Instance offering can be applied to. This parameter is reserved
     * and cannot be specified in a request
     * </p>
     * 
     * @param instanceCount
     *        The number of instances the Convertible Reserved Instance offering can be applied to. This parameter is
     *        reserved and cannot be specified in a request
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetConfiguration withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The ID of the Convertible Reserved Instance offering.
     * </p>
     * 
     * @param offeringId
     *        The ID of the Convertible Reserved Instance offering.
     */

    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The ID of the Convertible Reserved Instance offering.
     * </p>
     * 
     * @return The ID of the Convertible Reserved Instance offering.
     */

    public String getOfferingId() {
        return this.offeringId;
    }

    /**
     * <p>
     * The ID of the Convertible Reserved Instance offering.
     * </p>
     * 
     * @param offeringId
     *        The ID of the Convertible Reserved Instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetConfiguration withOfferingId(String offeringId) {
        setOfferingId(offeringId);
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
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getOfferingId() != null)
            sb.append("OfferingId: ").append(getOfferingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetConfiguration == false)
            return false;
        TargetConfiguration other = (TargetConfiguration) obj;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        return hashCode;
    }

    @Override
    public TargetConfiguration clone() {
        try {
            return (TargetConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

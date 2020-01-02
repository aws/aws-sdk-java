/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Attribute details on a specific Savings Plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/SavingsPlansDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A collection of AWS resources in a geographic area. Each AWS Region is isolated and independent of the other
     * Regions.
     * </p>
     */
    private String region;
    /**
     * <p>
     * A group of instance types that Savings Plans applies to.
     * </p>
     */
    private String instanceFamily;
    /**
     * <p>
     * The unique ID used to distinguish Savings Plans from one another.
     * </p>
     */
    private String offeringId;

    /**
     * <p>
     * A collection of AWS resources in a geographic area. Each AWS Region is isolated and independent of the other
     * Regions.
     * </p>
     * 
     * @param region
     *        A collection of AWS resources in a geographic area. Each AWS Region is isolated and independent of the
     *        other Regions.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * A collection of AWS resources in a geographic area. Each AWS Region is isolated and independent of the other
     * Regions.
     * </p>
     * 
     * @return A collection of AWS resources in a geographic area. Each AWS Region is isolated and independent of the
     *         other Regions.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * A collection of AWS resources in a geographic area. Each AWS Region is isolated and independent of the other
     * Regions.
     * </p>
     * 
     * @param region
     *        A collection of AWS resources in a geographic area. Each AWS Region is isolated and independent of the
     *        other Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansDetails withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * A group of instance types that Savings Plans applies to.
     * </p>
     * 
     * @param instanceFamily
     *        A group of instance types that Savings Plans applies to.
     */

    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * A group of instance types that Savings Plans applies to.
     * </p>
     * 
     * @return A group of instance types that Savings Plans applies to.
     */

    public String getInstanceFamily() {
        return this.instanceFamily;
    }

    /**
     * <p>
     * A group of instance types that Savings Plans applies to.
     * </p>
     * 
     * @param instanceFamily
     *        A group of instance types that Savings Plans applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansDetails withInstanceFamily(String instanceFamily) {
        setInstanceFamily(instanceFamily);
        return this;
    }

    /**
     * <p>
     * The unique ID used to distinguish Savings Plans from one another.
     * </p>
     * 
     * @param offeringId
     *        The unique ID used to distinguish Savings Plans from one another.
     */

    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The unique ID used to distinguish Savings Plans from one another.
     * </p>
     * 
     * @return The unique ID used to distinguish Savings Plans from one another.
     */

    public String getOfferingId() {
        return this.offeringId;
    }

    /**
     * <p>
     * The unique ID used to distinguish Savings Plans from one another.
     * </p>
     * 
     * @param offeringId
     *        The unique ID used to distinguish Savings Plans from one another.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansDetails withOfferingId(String offeringId) {
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: ").append(getInstanceFamily()).append(",");
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

        if (obj instanceof SavingsPlansDetails == false)
            return false;
        SavingsPlansDetails other = (SavingsPlansDetails) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getInstanceFamily() == null ^ this.getInstanceFamily() == null)
            return false;
        if (other.getInstanceFamily() != null && other.getInstanceFamily().equals(this.getInstanceFamily()) == false)
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

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        return hashCode;
    }

    @Override
    public SavingsPlansDetails clone() {
        try {
            return (SavingsPlansDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.SavingsPlansDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

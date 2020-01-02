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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Ad hoc (one-time) filtering option.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AdHocFilteringOption" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdHocFilteringOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Availability status.
     * </p>
     */
    private String availabilityStatus;

    /**
     * <p>
     * Availability status.
     * </p>
     * 
     * @param availabilityStatus
     *        Availability status.
     * @see DashboardBehavior
     */

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    /**
     * <p>
     * Availability status.
     * </p>
     * 
     * @return Availability status.
     * @see DashboardBehavior
     */

    public String getAvailabilityStatus() {
        return this.availabilityStatus;
    }

    /**
     * <p>
     * Availability status.
     * </p>
     * 
     * @param availabilityStatus
     *        Availability status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashboardBehavior
     */

    public AdHocFilteringOption withAvailabilityStatus(String availabilityStatus) {
        setAvailabilityStatus(availabilityStatus);
        return this;
    }

    /**
     * <p>
     * Availability status.
     * </p>
     * 
     * @param availabilityStatus
     *        Availability status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashboardBehavior
     */

    public AdHocFilteringOption withAvailabilityStatus(DashboardBehavior availabilityStatus) {
        this.availabilityStatus = availabilityStatus.toString();
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
        if (getAvailabilityStatus() != null)
            sb.append("AvailabilityStatus: ").append(getAvailabilityStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdHocFilteringOption == false)
            return false;
        AdHocFilteringOption other = (AdHocFilteringOption) obj;
        if (other.getAvailabilityStatus() == null ^ this.getAvailabilityStatus() == null)
            return false;
        if (other.getAvailabilityStatus() != null && other.getAvailabilityStatus().equals(this.getAvailabilityStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityStatus() == null) ? 0 : getAvailabilityStatus().hashCode());
        return hashCode;
    }

    @Override
    public AdHocFilteringOption clone() {
        try {
            return (AdHocFilteringOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AdHocFilteringOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

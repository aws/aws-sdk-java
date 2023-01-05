/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.arczonalshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/CancelZonalShift" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelZonalShiftRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The internally-generated identifier of a zonal shift.
     * </p>
     */
    private String zonalShiftId;

    /**
     * <p>
     * The internally-generated identifier of a zonal shift.
     * </p>
     * 
     * @param zonalShiftId
     *        The internally-generated identifier of a zonal shift.
     */

    public void setZonalShiftId(String zonalShiftId) {
        this.zonalShiftId = zonalShiftId;
    }

    /**
     * <p>
     * The internally-generated identifier of a zonal shift.
     * </p>
     * 
     * @return The internally-generated identifier of a zonal shift.
     */

    public String getZonalShiftId() {
        return this.zonalShiftId;
    }

    /**
     * <p>
     * The internally-generated identifier of a zonal shift.
     * </p>
     * 
     * @param zonalShiftId
     *        The internally-generated identifier of a zonal shift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelZonalShiftRequest withZonalShiftId(String zonalShiftId) {
        setZonalShiftId(zonalShiftId);
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
        if (getZonalShiftId() != null)
            sb.append("ZonalShiftId: ").append(getZonalShiftId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelZonalShiftRequest == false)
            return false;
        CancelZonalShiftRequest other = (CancelZonalShiftRequest) obj;
        if (other.getZonalShiftId() == null ^ this.getZonalShiftId() == null)
            return false;
        if (other.getZonalShiftId() != null && other.getZonalShiftId().equals(this.getZonalShiftId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getZonalShiftId() == null) ? 0 : getZonalShiftId().hashCode());
        return hashCode;
    }

    @Override
    public CancelZonalShiftRequest clone() {
        return (CancelZonalShiftRequest) super.clone();
    }

}

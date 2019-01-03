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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the run results requested by the device selection configuration as well as how many devices were returned.
 * For an example of the JSON response syntax, see <a>ScheduleRun</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeviceSelectionResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceSelectionResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The filters in a device selection result.
     * </p>
     */
    private java.util.List<DeviceFilter> filters;
    /**
     * <p>
     * The number of devices that matched the device filter selection criteria.
     * </p>
     */
    private Integer matchedDevicesCount;
    /**
     * <p>
     * The maximum number of devices to be selected by a device filter and included in a test run.
     * </p>
     */
    private Integer maxDevices;

    /**
     * <p>
     * The filters in a device selection result.
     * </p>
     * 
     * @return The filters in a device selection result.
     */

    public java.util.List<DeviceFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters in a device selection result.
     * </p>
     * 
     * @param filters
     *        The filters in a device selection result.
     */

    public void setFilters(java.util.Collection<DeviceFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<DeviceFilter>(filters);
    }

    /**
     * <p>
     * The filters in a device selection result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters in a device selection result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSelectionResult withFilters(DeviceFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<DeviceFilter>(filters.length));
        }
        for (DeviceFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters in a device selection result.
     * </p>
     * 
     * @param filters
     *        The filters in a device selection result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSelectionResult withFilters(java.util.Collection<DeviceFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The number of devices that matched the device filter selection criteria.
     * </p>
     * 
     * @param matchedDevicesCount
     *        The number of devices that matched the device filter selection criteria.
     */

    public void setMatchedDevicesCount(Integer matchedDevicesCount) {
        this.matchedDevicesCount = matchedDevicesCount;
    }

    /**
     * <p>
     * The number of devices that matched the device filter selection criteria.
     * </p>
     * 
     * @return The number of devices that matched the device filter selection criteria.
     */

    public Integer getMatchedDevicesCount() {
        return this.matchedDevicesCount;
    }

    /**
     * <p>
     * The number of devices that matched the device filter selection criteria.
     * </p>
     * 
     * @param matchedDevicesCount
     *        The number of devices that matched the device filter selection criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSelectionResult withMatchedDevicesCount(Integer matchedDevicesCount) {
        setMatchedDevicesCount(matchedDevicesCount);
        return this;
    }

    /**
     * <p>
     * The maximum number of devices to be selected by a device filter and included in a test run.
     * </p>
     * 
     * @param maxDevices
     *        The maximum number of devices to be selected by a device filter and included in a test run.
     */

    public void setMaxDevices(Integer maxDevices) {
        this.maxDevices = maxDevices;
    }

    /**
     * <p>
     * The maximum number of devices to be selected by a device filter and included in a test run.
     * </p>
     * 
     * @return The maximum number of devices to be selected by a device filter and included in a test run.
     */

    public Integer getMaxDevices() {
        return this.maxDevices;
    }

    /**
     * <p>
     * The maximum number of devices to be selected by a device filter and included in a test run.
     * </p>
     * 
     * @param maxDevices
     *        The maximum number of devices to be selected by a device filter and included in a test run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSelectionResult withMaxDevices(Integer maxDevices) {
        setMaxDevices(maxDevices);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMatchedDevicesCount() != null)
            sb.append("MatchedDevicesCount: ").append(getMatchedDevicesCount()).append(",");
        if (getMaxDevices() != null)
            sb.append("MaxDevices: ").append(getMaxDevices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceSelectionResult == false)
            return false;
        DeviceSelectionResult other = (DeviceSelectionResult) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMatchedDevicesCount() == null ^ this.getMatchedDevicesCount() == null)
            return false;
        if (other.getMatchedDevicesCount() != null && other.getMatchedDevicesCount().equals(this.getMatchedDevicesCount()) == false)
            return false;
        if (other.getMaxDevices() == null ^ this.getMaxDevices() == null)
            return false;
        if (other.getMaxDevices() != null && other.getMaxDevices().equals(this.getMaxDevices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMatchedDevicesCount() == null) ? 0 : getMatchedDevicesCount().hashCode());
        hashCode = prime * hashCode + ((getMaxDevices() == null) ? 0 : getMaxDevices().hashCode());
        return hashCode;
    }

    @Override
    public DeviceSelectionResult clone() {
        try {
            return (DeviceSelectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.DeviceSelectionResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListDeviceFleets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeviceFleetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary of the device fleet.
     * </p>
     */
    private java.util.List<DeviceFleetSummary> deviceFleetSummaries;
    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary of the device fleet.
     * </p>
     * 
     * @return Summary of the device fleet.
     */

    public java.util.List<DeviceFleetSummary> getDeviceFleetSummaries() {
        return deviceFleetSummaries;
    }

    /**
     * <p>
     * Summary of the device fleet.
     * </p>
     * 
     * @param deviceFleetSummaries
     *        Summary of the device fleet.
     */

    public void setDeviceFleetSummaries(java.util.Collection<DeviceFleetSummary> deviceFleetSummaries) {
        if (deviceFleetSummaries == null) {
            this.deviceFleetSummaries = null;
            return;
        }

        this.deviceFleetSummaries = new java.util.ArrayList<DeviceFleetSummary>(deviceFleetSummaries);
    }

    /**
     * <p>
     * Summary of the device fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceFleetSummaries(java.util.Collection)} or {@link #withDeviceFleetSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param deviceFleetSummaries
     *        Summary of the device fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceFleetsResult withDeviceFleetSummaries(DeviceFleetSummary... deviceFleetSummaries) {
        if (this.deviceFleetSummaries == null) {
            setDeviceFleetSummaries(new java.util.ArrayList<DeviceFleetSummary>(deviceFleetSummaries.length));
        }
        for (DeviceFleetSummary ele : deviceFleetSummaries) {
            this.deviceFleetSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary of the device fleet.
     * </p>
     * 
     * @param deviceFleetSummaries
     *        Summary of the device fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceFleetsResult withDeviceFleetSummaries(java.util.Collection<DeviceFleetSummary> deviceFleetSummaries) {
        setDeviceFleetSummaries(deviceFleetSummaries);
        return this;
    }

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     * 
     * @param nextToken
     *        The response from the last list when returning a list large enough to need tokening.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     * 
     * @return The response from the last list when returning a list large enough to need tokening.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     * 
     * @param nextToken
     *        The response from the last list when returning a list large enough to need tokening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceFleetsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDeviceFleetSummaries() != null)
            sb.append("DeviceFleetSummaries: ").append(getDeviceFleetSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeviceFleetsResult == false)
            return false;
        ListDeviceFleetsResult other = (ListDeviceFleetsResult) obj;
        if (other.getDeviceFleetSummaries() == null ^ this.getDeviceFleetSummaries() == null)
            return false;
        if (other.getDeviceFleetSummaries() != null && other.getDeviceFleetSummaries().equals(this.getDeviceFleetSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceFleetSummaries() == null) ? 0 : getDeviceFleetSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDeviceFleetsResult clone() {
        try {
            return (ListDeviceFleetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

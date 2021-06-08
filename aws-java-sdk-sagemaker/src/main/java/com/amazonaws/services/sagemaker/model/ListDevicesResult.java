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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDevicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary of devices.
     * </p>
     */
    private java.util.List<DeviceSummary> deviceSummaries;
    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary of devices.
     * </p>
     * 
     * @return Summary of devices.
     */

    public java.util.List<DeviceSummary> getDeviceSummaries() {
        return deviceSummaries;
    }

    /**
     * <p>
     * Summary of devices.
     * </p>
     * 
     * @param deviceSummaries
     *        Summary of devices.
     */

    public void setDeviceSummaries(java.util.Collection<DeviceSummary> deviceSummaries) {
        if (deviceSummaries == null) {
            this.deviceSummaries = null;
            return;
        }

        this.deviceSummaries = new java.util.ArrayList<DeviceSummary>(deviceSummaries);
    }

    /**
     * <p>
     * Summary of devices.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceSummaries(java.util.Collection)} or {@link #withDeviceSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deviceSummaries
     *        Summary of devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesResult withDeviceSummaries(DeviceSummary... deviceSummaries) {
        if (this.deviceSummaries == null) {
            setDeviceSummaries(new java.util.ArrayList<DeviceSummary>(deviceSummaries.length));
        }
        for (DeviceSummary ele : deviceSummaries) {
            this.deviceSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary of devices.
     * </p>
     * 
     * @param deviceSummaries
     *        Summary of devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesResult withDeviceSummaries(java.util.Collection<DeviceSummary> deviceSummaries) {
        setDeviceSummaries(deviceSummaries);
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

    public ListDevicesResult withNextToken(String nextToken) {
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
        if (getDeviceSummaries() != null)
            sb.append("DeviceSummaries: ").append(getDeviceSummaries()).append(",");
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

        if (obj instanceof ListDevicesResult == false)
            return false;
        ListDevicesResult other = (ListDevicesResult) obj;
        if (other.getDeviceSummaries() == null ^ this.getDeviceSummaries() == null)
            return false;
        if (other.getDeviceSummaries() != null && other.getDeviceSummaries().equals(this.getDeviceSummaries()) == false)
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

        hashCode = prime * hashCode + ((getDeviceSummaries() == null) ? 0 : getDeviceSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDevicesResult clone() {
        try {
            return (ListDevicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

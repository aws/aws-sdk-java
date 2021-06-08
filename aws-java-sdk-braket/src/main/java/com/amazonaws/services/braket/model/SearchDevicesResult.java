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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchDevicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>DeviceSummary</code> objects for devices that match the specified filter values.
     * </p>
     */
    private java.util.List<DeviceSummary> devices;
    /**
     * <p>
     * A token used for pagination of results, or null if there are no additional results. Use the token value in a
     * subsequent request to continue results where the previous request ended.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>DeviceSummary</code> objects for devices that match the specified filter values.
     * </p>
     * 
     * @return An array of <code>DeviceSummary</code> objects for devices that match the specified filter values.
     */

    public java.util.List<DeviceSummary> getDevices() {
        return devices;
    }

    /**
     * <p>
     * An array of <code>DeviceSummary</code> objects for devices that match the specified filter values.
     * </p>
     * 
     * @param devices
     *        An array of <code>DeviceSummary</code> objects for devices that match the specified filter values.
     */

    public void setDevices(java.util.Collection<DeviceSummary> devices) {
        if (devices == null) {
            this.devices = null;
            return;
        }

        this.devices = new java.util.ArrayList<DeviceSummary>(devices);
    }

    /**
     * <p>
     * An array of <code>DeviceSummary</code> objects for devices that match the specified filter values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevices(java.util.Collection)} or {@link #withDevices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param devices
     *        An array of <code>DeviceSummary</code> objects for devices that match the specified filter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDevicesResult withDevices(DeviceSummary... devices) {
        if (this.devices == null) {
            setDevices(new java.util.ArrayList<DeviceSummary>(devices.length));
        }
        for (DeviceSummary ele : devices) {
            this.devices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>DeviceSummary</code> objects for devices that match the specified filter values.
     * </p>
     * 
     * @param devices
     *        An array of <code>DeviceSummary</code> objects for devices that match the specified filter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDevicesResult withDevices(java.util.Collection<DeviceSummary> devices) {
        setDevices(devices);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results, or null if there are no additional results. Use the token value in a
     * subsequent request to continue results where the previous request ended.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results, or null if there are no additional results. Use the token value in
     *        a subsequent request to continue results where the previous request ended.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results, or null if there are no additional results. Use the token value in a
     * subsequent request to continue results where the previous request ended.
     * </p>
     * 
     * @return A token used for pagination of results, or null if there are no additional results. Use the token value
     *         in a subsequent request to continue results where the previous request ended.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results, or null if there are no additional results. Use the token value in a
     * subsequent request to continue results where the previous request ended.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results, or null if there are no additional results. Use the token value in
     *        a subsequent request to continue results where the previous request ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDevicesResult withNextToken(String nextToken) {
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
        if (getDevices() != null)
            sb.append("Devices: ").append(getDevices()).append(",");
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

        if (obj instanceof SearchDevicesResult == false)
            return false;
        SearchDevicesResult other = (SearchDevicesResult) obj;
        if (other.getDevices() == null ^ this.getDevices() == null)
            return false;
        if (other.getDevices() != null && other.getDevices().equals(this.getDevices()) == false)
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

        hashCode = prime * hashCode + ((getDevices() == null) ? 0 : getDevices().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchDevicesResult clone() {
        try {
            return (SearchDevicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListDeviceInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeviceInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object containing information about your device instances.
     * </p>
     */
    private java.util.List<DeviceInstance> deviceInstances;
    /**
     * <p>
     * An identifier that can be used in the next call to this operation to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An object containing information about your device instances.
     * </p>
     * 
     * @return An object containing information about your device instances.
     */

    public java.util.List<DeviceInstance> getDeviceInstances() {
        return deviceInstances;
    }

    /**
     * <p>
     * An object containing information about your device instances.
     * </p>
     * 
     * @param deviceInstances
     *        An object containing information about your device instances.
     */

    public void setDeviceInstances(java.util.Collection<DeviceInstance> deviceInstances) {
        if (deviceInstances == null) {
            this.deviceInstances = null;
            return;
        }

        this.deviceInstances = new java.util.ArrayList<DeviceInstance>(deviceInstances);
    }

    /**
     * <p>
     * An object containing information about your device instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceInstances(java.util.Collection)} or {@link #withDeviceInstances(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deviceInstances
     *        An object containing information about your device instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceInstancesResult withDeviceInstances(DeviceInstance... deviceInstances) {
        if (this.deviceInstances == null) {
            setDeviceInstances(new java.util.ArrayList<DeviceInstance>(deviceInstances.length));
        }
        for (DeviceInstance ele : deviceInstances) {
            this.deviceInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object containing information about your device instances.
     * </p>
     * 
     * @param deviceInstances
     *        An object containing information about your device instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceInstancesResult withDeviceInstances(java.util.Collection<DeviceInstance> deviceInstances) {
        setDeviceInstances(deviceInstances);
        return this;
    }

    /**
     * <p>
     * An identifier that can be used in the next call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that can be used in the next call to this operation to return the next set of items in the
     *        list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that can be used in the next call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @return An identifier that can be used in the next call to this operation to return the next set of items in the
     *         list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that can be used in the next call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that can be used in the next call to this operation to return the next set of items in the
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceInstancesResult withNextToken(String nextToken) {
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
        if (getDeviceInstances() != null)
            sb.append("DeviceInstances: ").append(getDeviceInstances()).append(",");
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

        if (obj instanceof ListDeviceInstancesResult == false)
            return false;
        ListDeviceInstancesResult other = (ListDeviceInstancesResult) obj;
        if (other.getDeviceInstances() == null ^ this.getDeviceInstances() == null)
            return false;
        if (other.getDeviceInstances() != null && other.getDeviceInstances().equals(this.getDeviceInstances()) == false)
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

        hashCode = prime * hashCode + ((getDeviceInstances() == null) ? 0 : getDeviceInstances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDeviceInstancesResult clone() {
        try {
            return (ListDeviceInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
 * <p>
 * Represents the result of a list device pools request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListDevicePools" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDevicePoolsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the device pools.
     * </p>
     */
    private java.util.List<DevicePool> devicePools;
    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the device pools.
     * </p>
     * 
     * @return Information about the device pools.
     */

    public java.util.List<DevicePool> getDevicePools() {
        return devicePools;
    }

    /**
     * <p>
     * Information about the device pools.
     * </p>
     * 
     * @param devicePools
     *        Information about the device pools.
     */

    public void setDevicePools(java.util.Collection<DevicePool> devicePools) {
        if (devicePools == null) {
            this.devicePools = null;
            return;
        }

        this.devicePools = new java.util.ArrayList<DevicePool>(devicePools);
    }

    /**
     * <p>
     * Information about the device pools.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevicePools(java.util.Collection)} or {@link #withDevicePools(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param devicePools
     *        Information about the device pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicePoolsResult withDevicePools(DevicePool... devicePools) {
        if (this.devicePools == null) {
            setDevicePools(new java.util.ArrayList<DevicePool>(devicePools.length));
        }
        for (DevicePool ele : devicePools) {
            this.devicePools.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the device pools.
     * </p>
     * 
     * @param devicePools
     *        Information about the device pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicePoolsResult withDevicePools(java.util.Collection<DevicePool> devicePools) {
        setDevicePools(devicePools);
        return this;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        If the number of items that are returned is significantly large, this is an identifier that is also
     *        returned, which can be used in a subsequent call to this operation to return the next set of items in the
     *        list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @return If the number of items that are returned is significantly large, this is an identifier that is also
     *         returned, which can be used in a subsequent call to this operation to return the next set of items in the
     *         list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        If the number of items that are returned is significantly large, this is an identifier that is also
     *        returned, which can be used in a subsequent call to this operation to return the next set of items in the
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicePoolsResult withNextToken(String nextToken) {
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
        if (getDevicePools() != null)
            sb.append("DevicePools: ").append(getDevicePools()).append(",");
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

        if (obj instanceof ListDevicePoolsResult == false)
            return false;
        ListDevicePoolsResult other = (ListDevicePoolsResult) obj;
        if (other.getDevicePools() == null ^ this.getDevicePools() == null)
            return false;
        if (other.getDevicePools() != null && other.getDevicePools().equals(this.getDevicePools()) == false)
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

        hashCode = prime * hashCode + ((getDevicePools() == null) ? 0 : getDevicePools().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDevicePoolsResult clone() {
        try {
            return (ListDevicePoolsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

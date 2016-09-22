/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents the result of a create device pool request.
 * </p>
 */
public class CreateDevicePoolResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The newly created device pool.
     * </p>
     */
    private DevicePool devicePool;

    /**
     * <p>
     * The newly created device pool.
     * </p>
     * 
     * @param devicePool
     *        The newly created device pool.
     */

    public void setDevicePool(DevicePool devicePool) {
        this.devicePool = devicePool;
    }

    /**
     * <p>
     * The newly created device pool.
     * </p>
     * 
     * @return The newly created device pool.
     */

    public DevicePool getDevicePool() {
        return this.devicePool;
    }

    /**
     * <p>
     * The newly created device pool.
     * </p>
     * 
     * @param devicePool
     *        The newly created device pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevicePoolResult withDevicePool(DevicePool devicePool) {
        setDevicePool(devicePool);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDevicePool() != null)
            sb.append("DevicePool: " + getDevicePool());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDevicePoolResult == false)
            return false;
        CreateDevicePoolResult other = (CreateDevicePoolResult) obj;
        if (other.getDevicePool() == null ^ this.getDevicePool() == null)
            return false;
        if (other.getDevicePool() != null && other.getDevicePool().equals(this.getDevicePool()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevicePool() == null) ? 0 : getDevicePool().hashCode());
        return hashCode;
    }

    @Override
    public CreateDevicePoolResult clone() {
        try {
            return (CreateDevicePoolResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

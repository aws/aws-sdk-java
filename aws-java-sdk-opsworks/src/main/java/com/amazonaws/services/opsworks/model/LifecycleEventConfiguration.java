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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the lifecycle event configuration
 * </p>
 */
public class LifecycleEventConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>ShutdownEventConfiguration</code> object that specifies the Shutdown event configuration.
     * </p>
     */
    private ShutdownEventConfiguration shutdown;

    /**
     * <p>
     * A <code>ShutdownEventConfiguration</code> object that specifies the Shutdown event configuration.
     * </p>
     * 
     * @param shutdown
     *        A <code>ShutdownEventConfiguration</code> object that specifies the Shutdown event configuration.
     */

    public void setShutdown(ShutdownEventConfiguration shutdown) {
        this.shutdown = shutdown;
    }

    /**
     * <p>
     * A <code>ShutdownEventConfiguration</code> object that specifies the Shutdown event configuration.
     * </p>
     * 
     * @return A <code>ShutdownEventConfiguration</code> object that specifies the Shutdown event configuration.
     */

    public ShutdownEventConfiguration getShutdown() {
        return this.shutdown;
    }

    /**
     * <p>
     * A <code>ShutdownEventConfiguration</code> object that specifies the Shutdown event configuration.
     * </p>
     * 
     * @param shutdown
     *        A <code>ShutdownEventConfiguration</code> object that specifies the Shutdown event configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleEventConfiguration withShutdown(ShutdownEventConfiguration shutdown) {
        setShutdown(shutdown);
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
        if (getShutdown() != null)
            sb.append("Shutdown: " + getShutdown());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecycleEventConfiguration == false)
            return false;
        LifecycleEventConfiguration other = (LifecycleEventConfiguration) obj;
        if (other.getShutdown() == null ^ this.getShutdown() == null)
            return false;
        if (other.getShutdown() != null && other.getShutdown().equals(this.getShutdown()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShutdown() == null) ? 0 : getShutdown().hashCode());
        return hashCode;
    }

    @Override
    public LifecycleEventConfiguration clone() {
        try {
            return (LifecycleEventConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

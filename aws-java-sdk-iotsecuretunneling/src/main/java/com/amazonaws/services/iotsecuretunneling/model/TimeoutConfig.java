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
package com.amazonaws.services.iotsecuretunneling.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Tunnel timeout configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/TimeoutConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeoutConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum amount of time (in minutes) a tunnel can remain open. If not specified, maxLifetimeTimeoutMinutes
     * defaults to 720 minutes. Valid values are from 1 minute to 12 hours (720 minutes)
     * </p>
     */
    private Integer maxLifetimeTimeoutMinutes;

    /**
     * <p>
     * The maximum amount of time (in minutes) a tunnel can remain open. If not specified, maxLifetimeTimeoutMinutes
     * defaults to 720 minutes. Valid values are from 1 minute to 12 hours (720 minutes)
     * </p>
     * 
     * @param maxLifetimeTimeoutMinutes
     *        The maximum amount of time (in minutes) a tunnel can remain open. If not specified,
     *        maxLifetimeTimeoutMinutes defaults to 720 minutes. Valid values are from 1 minute to 12 hours (720
     *        minutes)
     */

    public void setMaxLifetimeTimeoutMinutes(Integer maxLifetimeTimeoutMinutes) {
        this.maxLifetimeTimeoutMinutes = maxLifetimeTimeoutMinutes;
    }

    /**
     * <p>
     * The maximum amount of time (in minutes) a tunnel can remain open. If not specified, maxLifetimeTimeoutMinutes
     * defaults to 720 minutes. Valid values are from 1 minute to 12 hours (720 minutes)
     * </p>
     * 
     * @return The maximum amount of time (in minutes) a tunnel can remain open. If not specified,
     *         maxLifetimeTimeoutMinutes defaults to 720 minutes. Valid values are from 1 minute to 12 hours (720
     *         minutes)
     */

    public Integer getMaxLifetimeTimeoutMinutes() {
        return this.maxLifetimeTimeoutMinutes;
    }

    /**
     * <p>
     * The maximum amount of time (in minutes) a tunnel can remain open. If not specified, maxLifetimeTimeoutMinutes
     * defaults to 720 minutes. Valid values are from 1 minute to 12 hours (720 minutes)
     * </p>
     * 
     * @param maxLifetimeTimeoutMinutes
     *        The maximum amount of time (in minutes) a tunnel can remain open. If not specified,
     *        maxLifetimeTimeoutMinutes defaults to 720 minutes. Valid values are from 1 minute to 12 hours (720
     *        minutes)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeoutConfig withMaxLifetimeTimeoutMinutes(Integer maxLifetimeTimeoutMinutes) {
        setMaxLifetimeTimeoutMinutes(maxLifetimeTimeoutMinutes);
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
        if (getMaxLifetimeTimeoutMinutes() != null)
            sb.append("MaxLifetimeTimeoutMinutes: ").append(getMaxLifetimeTimeoutMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeoutConfig == false)
            return false;
        TimeoutConfig other = (TimeoutConfig) obj;
        if (other.getMaxLifetimeTimeoutMinutes() == null ^ this.getMaxLifetimeTimeoutMinutes() == null)
            return false;
        if (other.getMaxLifetimeTimeoutMinutes() != null && other.getMaxLifetimeTimeoutMinutes().equals(this.getMaxLifetimeTimeoutMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxLifetimeTimeoutMinutes() == null) ? 0 : getMaxLifetimeTimeoutMinutes().hashCode());
        return hashCode;
    }

    @Override
    public TimeoutConfig clone() {
        try {
            return (TimeoutConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsecuretunneling.model.transform.TimeoutConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

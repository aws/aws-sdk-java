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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for an application to automatically stop after a certain amount of time being idle.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/AutoStopConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoStopConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables the application to automatically stop after a certain amount of time being idle. Defaults to true.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The amount of idle time in minutes after which your application will automatically stop. Defaults to 15 minutes.
     * </p>
     */
    private Integer idleTimeoutMinutes;

    /**
     * <p>
     * Enables the application to automatically stop after a certain amount of time being idle. Defaults to true.
     * </p>
     * 
     * @param enabled
     *        Enables the application to automatically stop after a certain amount of time being idle. Defaults to true.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Enables the application to automatically stop after a certain amount of time being idle. Defaults to true.
     * </p>
     * 
     * @return Enables the application to automatically stop after a certain amount of time being idle. Defaults to
     *         true.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Enables the application to automatically stop after a certain amount of time being idle. Defaults to true.
     * </p>
     * 
     * @param enabled
     *        Enables the application to automatically stop after a certain amount of time being idle. Defaults to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoStopConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Enables the application to automatically stop after a certain amount of time being idle. Defaults to true.
     * </p>
     * 
     * @return Enables the application to automatically stop after a certain amount of time being idle. Defaults to
     *         true.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The amount of idle time in minutes after which your application will automatically stop. Defaults to 15 minutes.
     * </p>
     * 
     * @param idleTimeoutMinutes
     *        The amount of idle time in minutes after which your application will automatically stop. Defaults to 15
     *        minutes.
     */

    public void setIdleTimeoutMinutes(Integer idleTimeoutMinutes) {
        this.idleTimeoutMinutes = idleTimeoutMinutes;
    }

    /**
     * <p>
     * The amount of idle time in minutes after which your application will automatically stop. Defaults to 15 minutes.
     * </p>
     * 
     * @return The amount of idle time in minutes after which your application will automatically stop. Defaults to 15
     *         minutes.
     */

    public Integer getIdleTimeoutMinutes() {
        return this.idleTimeoutMinutes;
    }

    /**
     * <p>
     * The amount of idle time in minutes after which your application will automatically stop. Defaults to 15 minutes.
     * </p>
     * 
     * @param idleTimeoutMinutes
     *        The amount of idle time in minutes after which your application will automatically stop. Defaults to 15
     *        minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoStopConfig withIdleTimeoutMinutes(Integer idleTimeoutMinutes) {
        setIdleTimeoutMinutes(idleTimeoutMinutes);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getIdleTimeoutMinutes() != null)
            sb.append("IdleTimeoutMinutes: ").append(getIdleTimeoutMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoStopConfig == false)
            return false;
        AutoStopConfig other = (AutoStopConfig) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getIdleTimeoutMinutes() == null ^ this.getIdleTimeoutMinutes() == null)
            return false;
        if (other.getIdleTimeoutMinutes() != null && other.getIdleTimeoutMinutes().equals(this.getIdleTimeoutMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getIdleTimeoutMinutes() == null) ? 0 : getIdleTimeoutMinutes().hashCode());
        return hashCode;
    }

    @Override
    public AutoStopConfig clone() {
        try {
            return (AutoStopConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.AutoStopConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

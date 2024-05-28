/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the timeout configurations for Service Connect.
 * </p>
 * <note>
 * <p>
 * If <code>idleTimeout</code> is set to a time that is less than <code>perRequestTimeout</code>, the connection will
 * close when the <code>idleTimeout</code> is reached and not the <code>perRequestTimeout</code>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/TimeoutConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeoutConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of time in seconds a connection will stay active while idle. A value of <code>0</code> can be set to
     * disable <code>idleTimeout</code>.
     * </p>
     * <p>
     * The <code>idleTimeout</code> default for <code>HTTP</code>/<code>HTTP2</code>/<code>GRPC</code> is 5 minutes.
     * </p>
     * <p>
     * The <code>idleTimeout</code> default for <code>TCP</code> is 1 hour.
     * </p>
     */
    private Integer idleTimeoutSeconds;
    /**
     * <p>
     * The amount of time waiting for the upstream to respond with a complete response per request. A value of
     * <code>0</code> can be set to disable <code>perRequestTimeout</code>. <code>perRequestTimeout</code> can only be
     * set if Service Connect <code>appProtocol</code> isn't <code>TCP</code>. Only <code>idleTimeout</code> is allowed
     * for <code>TCP</code> <code>appProtocol</code>.
     * </p>
     */
    private Integer perRequestTimeoutSeconds;

    /**
     * <p>
     * The amount of time in seconds a connection will stay active while idle. A value of <code>0</code> can be set to
     * disable <code>idleTimeout</code>.
     * </p>
     * <p>
     * The <code>idleTimeout</code> default for <code>HTTP</code>/<code>HTTP2</code>/<code>GRPC</code> is 5 minutes.
     * </p>
     * <p>
     * The <code>idleTimeout</code> default for <code>TCP</code> is 1 hour.
     * </p>
     * 
     * @param idleTimeoutSeconds
     *        The amount of time in seconds a connection will stay active while idle. A value of <code>0</code> can be
     *        set to disable <code>idleTimeout</code>.</p>
     *        <p>
     *        The <code>idleTimeout</code> default for <code>HTTP</code>/<code>HTTP2</code>/<code>GRPC</code> is 5
     *        minutes.
     *        </p>
     *        <p>
     *        The <code>idleTimeout</code> default for <code>TCP</code> is 1 hour.
     */

    public void setIdleTimeoutSeconds(Integer idleTimeoutSeconds) {
        this.idleTimeoutSeconds = idleTimeoutSeconds;
    }

    /**
     * <p>
     * The amount of time in seconds a connection will stay active while idle. A value of <code>0</code> can be set to
     * disable <code>idleTimeout</code>.
     * </p>
     * <p>
     * The <code>idleTimeout</code> default for <code>HTTP</code>/<code>HTTP2</code>/<code>GRPC</code> is 5 minutes.
     * </p>
     * <p>
     * The <code>idleTimeout</code> default for <code>TCP</code> is 1 hour.
     * </p>
     * 
     * @return The amount of time in seconds a connection will stay active while idle. A value of <code>0</code> can be
     *         set to disable <code>idleTimeout</code>.</p>
     *         <p>
     *         The <code>idleTimeout</code> default for <code>HTTP</code>/<code>HTTP2</code>/<code>GRPC</code> is 5
     *         minutes.
     *         </p>
     *         <p>
     *         The <code>idleTimeout</code> default for <code>TCP</code> is 1 hour.
     */

    public Integer getIdleTimeoutSeconds() {
        return this.idleTimeoutSeconds;
    }

    /**
     * <p>
     * The amount of time in seconds a connection will stay active while idle. A value of <code>0</code> can be set to
     * disable <code>idleTimeout</code>.
     * </p>
     * <p>
     * The <code>idleTimeout</code> default for <code>HTTP</code>/<code>HTTP2</code>/<code>GRPC</code> is 5 minutes.
     * </p>
     * <p>
     * The <code>idleTimeout</code> default for <code>TCP</code> is 1 hour.
     * </p>
     * 
     * @param idleTimeoutSeconds
     *        The amount of time in seconds a connection will stay active while idle. A value of <code>0</code> can be
     *        set to disable <code>idleTimeout</code>.</p>
     *        <p>
     *        The <code>idleTimeout</code> default for <code>HTTP</code>/<code>HTTP2</code>/<code>GRPC</code> is 5
     *        minutes.
     *        </p>
     *        <p>
     *        The <code>idleTimeout</code> default for <code>TCP</code> is 1 hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeoutConfiguration withIdleTimeoutSeconds(Integer idleTimeoutSeconds) {
        setIdleTimeoutSeconds(idleTimeoutSeconds);
        return this;
    }

    /**
     * <p>
     * The amount of time waiting for the upstream to respond with a complete response per request. A value of
     * <code>0</code> can be set to disable <code>perRequestTimeout</code>. <code>perRequestTimeout</code> can only be
     * set if Service Connect <code>appProtocol</code> isn't <code>TCP</code>. Only <code>idleTimeout</code> is allowed
     * for <code>TCP</code> <code>appProtocol</code>.
     * </p>
     * 
     * @param perRequestTimeoutSeconds
     *        The amount of time waiting for the upstream to respond with a complete response per request. A value of
     *        <code>0</code> can be set to disable <code>perRequestTimeout</code>. <code>perRequestTimeout</code> can
     *        only be set if Service Connect <code>appProtocol</code> isn't <code>TCP</code>. Only
     *        <code>idleTimeout</code> is allowed for <code>TCP</code> <code>appProtocol</code>.
     */

    public void setPerRequestTimeoutSeconds(Integer perRequestTimeoutSeconds) {
        this.perRequestTimeoutSeconds = perRequestTimeoutSeconds;
    }

    /**
     * <p>
     * The amount of time waiting for the upstream to respond with a complete response per request. A value of
     * <code>0</code> can be set to disable <code>perRequestTimeout</code>. <code>perRequestTimeout</code> can only be
     * set if Service Connect <code>appProtocol</code> isn't <code>TCP</code>. Only <code>idleTimeout</code> is allowed
     * for <code>TCP</code> <code>appProtocol</code>.
     * </p>
     * 
     * @return The amount of time waiting for the upstream to respond with a complete response per request. A value of
     *         <code>0</code> can be set to disable <code>perRequestTimeout</code>. <code>perRequestTimeout</code> can
     *         only be set if Service Connect <code>appProtocol</code> isn't <code>TCP</code>. Only
     *         <code>idleTimeout</code> is allowed for <code>TCP</code> <code>appProtocol</code>.
     */

    public Integer getPerRequestTimeoutSeconds() {
        return this.perRequestTimeoutSeconds;
    }

    /**
     * <p>
     * The amount of time waiting for the upstream to respond with a complete response per request. A value of
     * <code>0</code> can be set to disable <code>perRequestTimeout</code>. <code>perRequestTimeout</code> can only be
     * set if Service Connect <code>appProtocol</code> isn't <code>TCP</code>. Only <code>idleTimeout</code> is allowed
     * for <code>TCP</code> <code>appProtocol</code>.
     * </p>
     * 
     * @param perRequestTimeoutSeconds
     *        The amount of time waiting for the upstream to respond with a complete response per request. A value of
     *        <code>0</code> can be set to disable <code>perRequestTimeout</code>. <code>perRequestTimeout</code> can
     *        only be set if Service Connect <code>appProtocol</code> isn't <code>TCP</code>. Only
     *        <code>idleTimeout</code> is allowed for <code>TCP</code> <code>appProtocol</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeoutConfiguration withPerRequestTimeoutSeconds(Integer perRequestTimeoutSeconds) {
        setPerRequestTimeoutSeconds(perRequestTimeoutSeconds);
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
        if (getIdleTimeoutSeconds() != null)
            sb.append("IdleTimeoutSeconds: ").append(getIdleTimeoutSeconds()).append(",");
        if (getPerRequestTimeoutSeconds() != null)
            sb.append("PerRequestTimeoutSeconds: ").append(getPerRequestTimeoutSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeoutConfiguration == false)
            return false;
        TimeoutConfiguration other = (TimeoutConfiguration) obj;
        if (other.getIdleTimeoutSeconds() == null ^ this.getIdleTimeoutSeconds() == null)
            return false;
        if (other.getIdleTimeoutSeconds() != null && other.getIdleTimeoutSeconds().equals(this.getIdleTimeoutSeconds()) == false)
            return false;
        if (other.getPerRequestTimeoutSeconds() == null ^ this.getPerRequestTimeoutSeconds() == null)
            return false;
        if (other.getPerRequestTimeoutSeconds() != null && other.getPerRequestTimeoutSeconds().equals(this.getPerRequestTimeoutSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdleTimeoutSeconds() == null) ? 0 : getIdleTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getPerRequestTimeoutSeconds() == null) ? 0 : getPerRequestTimeoutSeconds().hashCode());
        return hashCode;
    }

    @Override
    public TimeoutConfiguration clone() {
        try {
            return (TimeoutConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.TimeoutConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

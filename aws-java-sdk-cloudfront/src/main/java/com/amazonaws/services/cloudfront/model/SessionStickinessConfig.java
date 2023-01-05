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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Session stickiness provides the ability to define multiple requests from a single viewer as a single session. This
 * prevents the potentially inconsistent experience of sending some of a given user's requests to your staging
 * distribution, while others are sent to your primary distribution. Define the session duration using TTL values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/SessionStickinessConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionStickinessConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The amount of time after which you want sessions to cease if no requests are received. Allowed values are
     * 300–3600 seconds (5–60 minutes).
     * </p>
     * <p>
     * The value must be less than or equal to <code>MaximumTTL</code>.
     * </p>
     */
    private Integer idleTTL;
    /**
     * <p>
     * The maximum amount of time to consider requests from the viewer as being part of the same session. Allowed values
     * are 300–3600 seconds (5–60 minutes).
     * </p>
     * <p>
     * The value must be less than or equal to <code>IdleTTL</code>.
     * </p>
     */
    private Integer maximumTTL;

    /**
     * <p>
     * The amount of time after which you want sessions to cease if no requests are received. Allowed values are
     * 300–3600 seconds (5–60 minutes).
     * </p>
     * <p>
     * The value must be less than or equal to <code>MaximumTTL</code>.
     * </p>
     * 
     * @param idleTTL
     *        The amount of time after which you want sessions to cease if no requests are received. Allowed values are
     *        300–3600 seconds (5–60 minutes).</p>
     *        <p>
     *        The value must be less than or equal to <code>MaximumTTL</code>.
     */

    public void setIdleTTL(Integer idleTTL) {
        this.idleTTL = idleTTL;
    }

    /**
     * <p>
     * The amount of time after which you want sessions to cease if no requests are received. Allowed values are
     * 300–3600 seconds (5–60 minutes).
     * </p>
     * <p>
     * The value must be less than or equal to <code>MaximumTTL</code>.
     * </p>
     * 
     * @return The amount of time after which you want sessions to cease if no requests are received. Allowed values are
     *         300–3600 seconds (5–60 minutes).</p>
     *         <p>
     *         The value must be less than or equal to <code>MaximumTTL</code>.
     */

    public Integer getIdleTTL() {
        return this.idleTTL;
    }

    /**
     * <p>
     * The amount of time after which you want sessions to cease if no requests are received. Allowed values are
     * 300–3600 seconds (5–60 minutes).
     * </p>
     * <p>
     * The value must be less than or equal to <code>MaximumTTL</code>.
     * </p>
     * 
     * @param idleTTL
     *        The amount of time after which you want sessions to cease if no requests are received. Allowed values are
     *        300–3600 seconds (5–60 minutes).</p>
     *        <p>
     *        The value must be less than or equal to <code>MaximumTTL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionStickinessConfig withIdleTTL(Integer idleTTL) {
        setIdleTTL(idleTTL);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time to consider requests from the viewer as being part of the same session. Allowed values
     * are 300–3600 seconds (5–60 minutes).
     * </p>
     * <p>
     * The value must be less than or equal to <code>IdleTTL</code>.
     * </p>
     * 
     * @param maximumTTL
     *        The maximum amount of time to consider requests from the viewer as being part of the same session. Allowed
     *        values are 300–3600 seconds (5–60 minutes).</p>
     *        <p>
     *        The value must be less than or equal to <code>IdleTTL</code>.
     */

    public void setMaximumTTL(Integer maximumTTL) {
        this.maximumTTL = maximumTTL;
    }

    /**
     * <p>
     * The maximum amount of time to consider requests from the viewer as being part of the same session. Allowed values
     * are 300–3600 seconds (5–60 minutes).
     * </p>
     * <p>
     * The value must be less than or equal to <code>IdleTTL</code>.
     * </p>
     * 
     * @return The maximum amount of time to consider requests from the viewer as being part of the same session.
     *         Allowed values are 300–3600 seconds (5–60 minutes).</p>
     *         <p>
     *         The value must be less than or equal to <code>IdleTTL</code>.
     */

    public Integer getMaximumTTL() {
        return this.maximumTTL;
    }

    /**
     * <p>
     * The maximum amount of time to consider requests from the viewer as being part of the same session. Allowed values
     * are 300–3600 seconds (5–60 minutes).
     * </p>
     * <p>
     * The value must be less than or equal to <code>IdleTTL</code>.
     * </p>
     * 
     * @param maximumTTL
     *        The maximum amount of time to consider requests from the viewer as being part of the same session. Allowed
     *        values are 300–3600 seconds (5–60 minutes).</p>
     *        <p>
     *        The value must be less than or equal to <code>IdleTTL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionStickinessConfig withMaximumTTL(Integer maximumTTL) {
        setMaximumTTL(maximumTTL);
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
        if (getIdleTTL() != null)
            sb.append("IdleTTL: ").append(getIdleTTL()).append(",");
        if (getMaximumTTL() != null)
            sb.append("MaximumTTL: ").append(getMaximumTTL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionStickinessConfig == false)
            return false;
        SessionStickinessConfig other = (SessionStickinessConfig) obj;
        if (other.getIdleTTL() == null ^ this.getIdleTTL() == null)
            return false;
        if (other.getIdleTTL() != null && other.getIdleTTL().equals(this.getIdleTTL()) == false)
            return false;
        if (other.getMaximumTTL() == null ^ this.getMaximumTTL() == null)
            return false;
        if (other.getMaximumTTL() != null && other.getMaximumTTL().equals(this.getMaximumTTL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdleTTL() == null) ? 0 : getIdleTTL().hashCode());
        hashCode = prime * hashCode + ((getMaximumTTL() == null) ? 0 : getMaximumTTL().hashCode());
        return hashCode;
    }

    @Override
    public SessionStickinessConfig clone() {
        try {
            return (SessionStickinessConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * The refresh status of a Trusted Advisor check.
 * </p>
 */
public class TrustedAdvisorCheckRefreshStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     */
    private String checkId;
    /**
     * <p>
     * The status of the Trusted Advisor check for which a refresh has been requested: "none", "enqueued", "processing",
     * "success", or "abandoned".
     * </p>
     */
    private String status;
    /**
     * <p>
     * The amount of time, in milliseconds, until the Trusted Advisor check is eligible for refresh.
     * </p>
     */
    private Long millisUntilNextRefreshable;

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     * 
     * @param checkId
     *        The unique identifier for the Trusted Advisor check.
     */

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     * 
     * @return The unique identifier for the Trusted Advisor check.
     */

    public String getCheckId() {
        return this.checkId;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     * 
     * @param checkId
     *        The unique identifier for the Trusted Advisor check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckRefreshStatus withCheckId(String checkId) {
        setCheckId(checkId);
        return this;
    }

    /**
     * <p>
     * The status of the Trusted Advisor check for which a refresh has been requested: "none", "enqueued", "processing",
     * "success", or "abandoned".
     * </p>
     * 
     * @param status
     *        The status of the Trusted Advisor check for which a refresh has been requested: "none", "enqueued",
     *        "processing", "success", or "abandoned".
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Trusted Advisor check for which a refresh has been requested: "none", "enqueued", "processing",
     * "success", or "abandoned".
     * </p>
     * 
     * @return The status of the Trusted Advisor check for which a refresh has been requested: "none", "enqueued",
     *         "processing", "success", or "abandoned".
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Trusted Advisor check for which a refresh has been requested: "none", "enqueued", "processing",
     * "success", or "abandoned".
     * </p>
     * 
     * @param status
     *        The status of the Trusted Advisor check for which a refresh has been requested: "none", "enqueued",
     *        "processing", "success", or "abandoned".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckRefreshStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The amount of time, in milliseconds, until the Trusted Advisor check is eligible for refresh.
     * </p>
     * 
     * @param millisUntilNextRefreshable
     *        The amount of time, in milliseconds, until the Trusted Advisor check is eligible for refresh.
     */

    public void setMillisUntilNextRefreshable(Long millisUntilNextRefreshable) {
        this.millisUntilNextRefreshable = millisUntilNextRefreshable;
    }

    /**
     * <p>
     * The amount of time, in milliseconds, until the Trusted Advisor check is eligible for refresh.
     * </p>
     * 
     * @return The amount of time, in milliseconds, until the Trusted Advisor check is eligible for refresh.
     */

    public Long getMillisUntilNextRefreshable() {
        return this.millisUntilNextRefreshable;
    }

    /**
     * <p>
     * The amount of time, in milliseconds, until the Trusted Advisor check is eligible for refresh.
     * </p>
     * 
     * @param millisUntilNextRefreshable
     *        The amount of time, in milliseconds, until the Trusted Advisor check is eligible for refresh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckRefreshStatus withMillisUntilNextRefreshable(Long millisUntilNextRefreshable) {
        setMillisUntilNextRefreshable(millisUntilNextRefreshable);
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
        if (getCheckId() != null)
            sb.append("CheckId: " + getCheckId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getMillisUntilNextRefreshable() != null)
            sb.append("MillisUntilNextRefreshable: " + getMillisUntilNextRefreshable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustedAdvisorCheckRefreshStatus == false)
            return false;
        TrustedAdvisorCheckRefreshStatus other = (TrustedAdvisorCheckRefreshStatus) obj;
        if (other.getCheckId() == null ^ this.getCheckId() == null)
            return false;
        if (other.getCheckId() != null && other.getCheckId().equals(this.getCheckId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMillisUntilNextRefreshable() == null ^ this.getMillisUntilNextRefreshable() == null)
            return false;
        if (other.getMillisUntilNextRefreshable() != null && other.getMillisUntilNextRefreshable().equals(this.getMillisUntilNextRefreshable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckId() == null) ? 0 : getCheckId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMillisUntilNextRefreshable() == null) ? 0 : getMillisUntilNextRefreshable().hashCode());
        return hashCode;
    }

    @Override
    public TrustedAdvisorCheckRefreshStatus clone() {
        try {
            return (TrustedAdvisorCheckRefreshStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyCurrentDBClusterCapacity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCurrentDBClusterCapacityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * A value that specifies the capacity that the DB cluster scales to next.
     * </p>
     */
    private Integer pendingCapacity;
    /**
     * <p>
     * The current capacity of the DB cluster.
     * </p>
     */
    private Integer currentCapacity;
    /**
     * <p>
     * The number of seconds before a call to <code>ModifyCurrentDBClusterCapacity</code> times out.
     * </p>
     */
    private Integer secondsBeforeTimeout;
    /**
     * <p>
     * The timeout action of a call to <code>ModifyCurrentDBClusterCapacity</code>, either
     * <code>ForceApplyCapacityChange</code> or <code>RollbackCapacityChange</code>.
     * </p>
     */
    private String timeoutAction;

    /**
     * <p>
     * A user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        A user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * A user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
     * </p>
     * 
     * @return A user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * A user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        A user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCurrentDBClusterCapacityResult withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A value that specifies the capacity that the DB cluster scales to next.
     * </p>
     * 
     * @param pendingCapacity
     *        A value that specifies the capacity that the DB cluster scales to next.
     */

    public void setPendingCapacity(Integer pendingCapacity) {
        this.pendingCapacity = pendingCapacity;
    }

    /**
     * <p>
     * A value that specifies the capacity that the DB cluster scales to next.
     * </p>
     * 
     * @return A value that specifies the capacity that the DB cluster scales to next.
     */

    public Integer getPendingCapacity() {
        return this.pendingCapacity;
    }

    /**
     * <p>
     * A value that specifies the capacity that the DB cluster scales to next.
     * </p>
     * 
     * @param pendingCapacity
     *        A value that specifies the capacity that the DB cluster scales to next.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCurrentDBClusterCapacityResult withPendingCapacity(Integer pendingCapacity) {
        setPendingCapacity(pendingCapacity);
        return this;
    }

    /**
     * <p>
     * The current capacity of the DB cluster.
     * </p>
     * 
     * @param currentCapacity
     *        The current capacity of the DB cluster.
     */

    public void setCurrentCapacity(Integer currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    /**
     * <p>
     * The current capacity of the DB cluster.
     * </p>
     * 
     * @return The current capacity of the DB cluster.
     */

    public Integer getCurrentCapacity() {
        return this.currentCapacity;
    }

    /**
     * <p>
     * The current capacity of the DB cluster.
     * </p>
     * 
     * @param currentCapacity
     *        The current capacity of the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCurrentDBClusterCapacityResult withCurrentCapacity(Integer currentCapacity) {
        setCurrentCapacity(currentCapacity);
        return this;
    }

    /**
     * <p>
     * The number of seconds before a call to <code>ModifyCurrentDBClusterCapacity</code> times out.
     * </p>
     * 
     * @param secondsBeforeTimeout
     *        The number of seconds before a call to <code>ModifyCurrentDBClusterCapacity</code> times out.
     */

    public void setSecondsBeforeTimeout(Integer secondsBeforeTimeout) {
        this.secondsBeforeTimeout = secondsBeforeTimeout;
    }

    /**
     * <p>
     * The number of seconds before a call to <code>ModifyCurrentDBClusterCapacity</code> times out.
     * </p>
     * 
     * @return The number of seconds before a call to <code>ModifyCurrentDBClusterCapacity</code> times out.
     */

    public Integer getSecondsBeforeTimeout() {
        return this.secondsBeforeTimeout;
    }

    /**
     * <p>
     * The number of seconds before a call to <code>ModifyCurrentDBClusterCapacity</code> times out.
     * </p>
     * 
     * @param secondsBeforeTimeout
     *        The number of seconds before a call to <code>ModifyCurrentDBClusterCapacity</code> times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCurrentDBClusterCapacityResult withSecondsBeforeTimeout(Integer secondsBeforeTimeout) {
        setSecondsBeforeTimeout(secondsBeforeTimeout);
        return this;
    }

    /**
     * <p>
     * The timeout action of a call to <code>ModifyCurrentDBClusterCapacity</code>, either
     * <code>ForceApplyCapacityChange</code> or <code>RollbackCapacityChange</code>.
     * </p>
     * 
     * @param timeoutAction
     *        The timeout action of a call to <code>ModifyCurrentDBClusterCapacity</code>, either
     *        <code>ForceApplyCapacityChange</code> or <code>RollbackCapacityChange</code>.
     */

    public void setTimeoutAction(String timeoutAction) {
        this.timeoutAction = timeoutAction;
    }

    /**
     * <p>
     * The timeout action of a call to <code>ModifyCurrentDBClusterCapacity</code>, either
     * <code>ForceApplyCapacityChange</code> or <code>RollbackCapacityChange</code>.
     * </p>
     * 
     * @return The timeout action of a call to <code>ModifyCurrentDBClusterCapacity</code>, either
     *         <code>ForceApplyCapacityChange</code> or <code>RollbackCapacityChange</code>.
     */

    public String getTimeoutAction() {
        return this.timeoutAction;
    }

    /**
     * <p>
     * The timeout action of a call to <code>ModifyCurrentDBClusterCapacity</code>, either
     * <code>ForceApplyCapacityChange</code> or <code>RollbackCapacityChange</code>.
     * </p>
     * 
     * @param timeoutAction
     *        The timeout action of a call to <code>ModifyCurrentDBClusterCapacity</code>, either
     *        <code>ForceApplyCapacityChange</code> or <code>RollbackCapacityChange</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCurrentDBClusterCapacityResult withTimeoutAction(String timeoutAction) {
        setTimeoutAction(timeoutAction);
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getPendingCapacity() != null)
            sb.append("PendingCapacity: ").append(getPendingCapacity()).append(",");
        if (getCurrentCapacity() != null)
            sb.append("CurrentCapacity: ").append(getCurrentCapacity()).append(",");
        if (getSecondsBeforeTimeout() != null)
            sb.append("SecondsBeforeTimeout: ").append(getSecondsBeforeTimeout()).append(",");
        if (getTimeoutAction() != null)
            sb.append("TimeoutAction: ").append(getTimeoutAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyCurrentDBClusterCapacityResult == false)
            return false;
        ModifyCurrentDBClusterCapacityResult other = (ModifyCurrentDBClusterCapacityResult) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getPendingCapacity() == null ^ this.getPendingCapacity() == null)
            return false;
        if (other.getPendingCapacity() != null && other.getPendingCapacity().equals(this.getPendingCapacity()) == false)
            return false;
        if (other.getCurrentCapacity() == null ^ this.getCurrentCapacity() == null)
            return false;
        if (other.getCurrentCapacity() != null && other.getCurrentCapacity().equals(this.getCurrentCapacity()) == false)
            return false;
        if (other.getSecondsBeforeTimeout() == null ^ this.getSecondsBeforeTimeout() == null)
            return false;
        if (other.getSecondsBeforeTimeout() != null && other.getSecondsBeforeTimeout().equals(this.getSecondsBeforeTimeout()) == false)
            return false;
        if (other.getTimeoutAction() == null ^ this.getTimeoutAction() == null)
            return false;
        if (other.getTimeoutAction() != null && other.getTimeoutAction().equals(this.getTimeoutAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPendingCapacity() == null) ? 0 : getPendingCapacity().hashCode());
        hashCode = prime * hashCode + ((getCurrentCapacity() == null) ? 0 : getCurrentCapacity().hashCode());
        hashCode = prime * hashCode + ((getSecondsBeforeTimeout() == null) ? 0 : getSecondsBeforeTimeout().hashCode());
        hashCode = prime * hashCode + ((getTimeoutAction() == null) ? 0 : getTimeoutAction().hashCode());
        return hashCode;
    }

    @Override
    public ModifyCurrentDBClusterCapacityResult clone() {
        try {
            return (ModifyCurrentDBClusterCapacityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes whether StackSets performs non-conflicting operations concurrently and queues conflicting operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ManagedExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedExecution implements Serializable, Cloneable {

    /**
     * <p>
     * When <code>true</code>, StackSets performs non-conflicting operations concurrently and queues conflicting
     * operations. After conflicting operations finish, StackSets starts queued operations in request order.
     * </p>
     * <note>
     * <p>
     * If there are already running or queued operations, StackSets queues all incoming operations even if they are
     * non-conflicting.
     * </p>
     * <p>
     * You can't modify your stack set's execution configuration while there are running or queued operations for that
     * stack set.
     * </p>
     * </note>
     * <p>
     * When <code>false</code> (default), StackSets performs one operation at a time in request order.
     * </p>
     */
    private Boolean active;

    /**
     * <p>
     * When <code>true</code>, StackSets performs non-conflicting operations concurrently and queues conflicting
     * operations. After conflicting operations finish, StackSets starts queued operations in request order.
     * </p>
     * <note>
     * <p>
     * If there are already running or queued operations, StackSets queues all incoming operations even if they are
     * non-conflicting.
     * </p>
     * <p>
     * You can't modify your stack set's execution configuration while there are running or queued operations for that
     * stack set.
     * </p>
     * </note>
     * <p>
     * When <code>false</code> (default), StackSets performs one operation at a time in request order.
     * </p>
     * 
     * @param active
     *        When <code>true</code>, StackSets performs non-conflicting operations concurrently and queues conflicting
     *        operations. After conflicting operations finish, StackSets starts queued operations in request order.</p>
     *        <note>
     *        <p>
     *        If there are already running or queued operations, StackSets queues all incoming operations even if they
     *        are non-conflicting.
     *        </p>
     *        <p>
     *        You can't modify your stack set's execution configuration while there are running or queued operations for
     *        that stack set.
     *        </p>
     *        </note>
     *        <p>
     *        When <code>false</code> (default), StackSets performs one operation at a time in request order.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * When <code>true</code>, StackSets performs non-conflicting operations concurrently and queues conflicting
     * operations. After conflicting operations finish, StackSets starts queued operations in request order.
     * </p>
     * <note>
     * <p>
     * If there are already running or queued operations, StackSets queues all incoming operations even if they are
     * non-conflicting.
     * </p>
     * <p>
     * You can't modify your stack set's execution configuration while there are running or queued operations for that
     * stack set.
     * </p>
     * </note>
     * <p>
     * When <code>false</code> (default), StackSets performs one operation at a time in request order.
     * </p>
     * 
     * @return When <code>true</code>, StackSets performs non-conflicting operations concurrently and queues conflicting
     *         operations. After conflicting operations finish, StackSets starts queued operations in request order.</p>
     *         <note>
     *         <p>
     *         If there are already running or queued operations, StackSets queues all incoming operations even if they
     *         are non-conflicting.
     *         </p>
     *         <p>
     *         You can't modify your stack set's execution configuration while there are running or queued operations
     *         for that stack set.
     *         </p>
     *         </note>
     *         <p>
     *         When <code>false</code> (default), StackSets performs one operation at a time in request order.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * When <code>true</code>, StackSets performs non-conflicting operations concurrently and queues conflicting
     * operations. After conflicting operations finish, StackSets starts queued operations in request order.
     * </p>
     * <note>
     * <p>
     * If there are already running or queued operations, StackSets queues all incoming operations even if they are
     * non-conflicting.
     * </p>
     * <p>
     * You can't modify your stack set's execution configuration while there are running or queued operations for that
     * stack set.
     * </p>
     * </note>
     * <p>
     * When <code>false</code> (default), StackSets performs one operation at a time in request order.
     * </p>
     * 
     * @param active
     *        When <code>true</code>, StackSets performs non-conflicting operations concurrently and queues conflicting
     *        operations. After conflicting operations finish, StackSets starts queued operations in request order.</p>
     *        <note>
     *        <p>
     *        If there are already running or queued operations, StackSets queues all incoming operations even if they
     *        are non-conflicting.
     *        </p>
     *        <p>
     *        You can't modify your stack set's execution configuration while there are running or queued operations for
     *        that stack set.
     *        </p>
     *        </note>
     *        <p>
     *        When <code>false</code> (default), StackSets performs one operation at a time in request order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedExecution withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, StackSets performs non-conflicting operations concurrently and queues conflicting
     * operations. After conflicting operations finish, StackSets starts queued operations in request order.
     * </p>
     * <note>
     * <p>
     * If there are already running or queued operations, StackSets queues all incoming operations even if they are
     * non-conflicting.
     * </p>
     * <p>
     * You can't modify your stack set's execution configuration while there are running or queued operations for that
     * stack set.
     * </p>
     * </note>
     * <p>
     * When <code>false</code> (default), StackSets performs one operation at a time in request order.
     * </p>
     * 
     * @return When <code>true</code>, StackSets performs non-conflicting operations concurrently and queues conflicting
     *         operations. After conflicting operations finish, StackSets starts queued operations in request order.</p>
     *         <note>
     *         <p>
     *         If there are already running or queued operations, StackSets queues all incoming operations even if they
     *         are non-conflicting.
     *         </p>
     *         <p>
     *         You can't modify your stack set's execution configuration while there are running or queued operations
     *         for that stack set.
     *         </p>
     *         </note>
     *         <p>
     *         When <code>false</code> (default), StackSets performs one operation at a time in request order.
     */

    public Boolean isActive() {
        return this.active;
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
        if (getActive() != null)
            sb.append("Active: ").append(getActive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedExecution == false)
            return false;
        ManagedExecution other = (ManagedExecution) obj;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        return hashCode;
    }

    @Override
    public ManagedExecution clone() {
        try {
            return (ManagedExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

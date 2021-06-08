/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The detailed status of the stack instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackInstanceComprehensiveStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackInstanceComprehensiveStatus implements Serializable, Cloneable {

    /**
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region has been cancelled. This is either
     * because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation
     * has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region failed. If the stack set operation fails
     * in enough accounts within a Region, the failure tolerance for the stack set operation as a whole might be
     * exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     * unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You might
     * need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     * <code>true</code>, to delete the stack instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and Region has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region completed successfully.
     * </p>
     * </li>
     * </ul>
     */
    private String detailedStatus;

    /**
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region has been cancelled. This is either
     * because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation
     * has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region failed. If the stack set operation fails
     * in enough accounts within a Region, the failure tolerance for the stack set operation as a whole might be
     * exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     * unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You might
     * need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     * <code>true</code>, to delete the stack instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and Region has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param detailedStatus
     *        <li>
     *        <p>
     *        <code>CANCELLED</code>: The operation in the specified account and Region has been cancelled. This is
     *        either because a user has stopped the stack set operation, or because the failure tolerance of the stack
     *        set operation has been exceeded.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>FAILED</code>: The operation in the specified account and Region failed. If the stack set operation
     *        fails in enough accounts within a Region, the failure tolerance for the stack set operation as a whole
     *        might be exceeded.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     *        unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You
     *        might need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     *        <code>true</code>, to delete the stack instance, and then delete the stack manually.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>PENDING</code>: The operation in the specified account and Region has yet to start.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>RUNNING</code>: The operation in the specified account and Region is currently in progress.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The operation in the specified account and Region completed successfully.
     *        </p>
     *        </li>
     * @see StackInstanceDetailedStatus
     */

    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region has been cancelled. This is either
     * because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation
     * has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region failed. If the stack set operation fails
     * in enough accounts within a Region, the failure tolerance for the stack set operation as a whole might be
     * exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     * unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You might
     * need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     * <code>true</code>, to delete the stack instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and Region has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <li>
     *         <p>
     *         <code>CANCELLED</code>: The operation in the specified account and Region has been cancelled. This is
     *         either because a user has stopped the stack set operation, or because the failure tolerance of the stack
     *         set operation has been exceeded.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>FAILED</code>: The operation in the specified account and Region failed. If the stack set operation
     *         fails in enough accounts within a Region, the failure tolerance for the stack set operation as a whole
     *         might be exceeded.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in
     *         an unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations.
     *         You might need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code>
     *         set to <code>true</code>, to delete the stack instance, and then delete the stack manually.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>PENDING</code>: The operation in the specified account and Region has yet to start.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>RUNNING</code>: The operation in the specified account and Region is currently in progress.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>SUCCEEDED</code>: The operation in the specified account and Region completed successfully.
     *         </p>
     *         </li>
     * @see StackInstanceDetailedStatus
     */

    public String getDetailedStatus() {
        return this.detailedStatus;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region has been cancelled. This is either
     * because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation
     * has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region failed. If the stack set operation fails
     * in enough accounts within a Region, the failure tolerance for the stack set operation as a whole might be
     * exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     * unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You might
     * need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     * <code>true</code>, to delete the stack instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and Region has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param detailedStatus
     *        <li>
     *        <p>
     *        <code>CANCELLED</code>: The operation in the specified account and Region has been cancelled. This is
     *        either because a user has stopped the stack set operation, or because the failure tolerance of the stack
     *        set operation has been exceeded.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>FAILED</code>: The operation in the specified account and Region failed. If the stack set operation
     *        fails in enough accounts within a Region, the failure tolerance for the stack set operation as a whole
     *        might be exceeded.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     *        unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You
     *        might need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     *        <code>true</code>, to delete the stack instance, and then delete the stack manually.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>PENDING</code>: The operation in the specified account and Region has yet to start.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>RUNNING</code>: The operation in the specified account and Region is currently in progress.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The operation in the specified account and Region completed successfully.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackInstanceDetailedStatus
     */

    public StackInstanceComprehensiveStatus withDetailedStatus(String detailedStatus) {
        setDetailedStatus(detailedStatus);
        return this;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region has been cancelled. This is either
     * because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation
     * has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region failed. If the stack set operation fails
     * in enough accounts within a Region, the failure tolerance for the stack set operation as a whole might be
     * exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     * unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You might
     * need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     * <code>true</code>, to delete the stack instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and Region has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param detailedStatus
     *        <li>
     *        <p>
     *        <code>CANCELLED</code>: The operation in the specified account and Region has been cancelled. This is
     *        either because a user has stopped the stack set operation, or because the failure tolerance of the stack
     *        set operation has been exceeded.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>FAILED</code>: The operation in the specified account and Region failed. If the stack set operation
     *        fails in enough accounts within a Region, the failure tolerance for the stack set operation as a whole
     *        might be exceeded.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     *        unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You
     *        might need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     *        <code>true</code>, to delete the stack instance, and then delete the stack manually.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>PENDING</code>: The operation in the specified account and Region has yet to start.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>RUNNING</code>: The operation in the specified account and Region is currently in progress.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The operation in the specified account and Region completed successfully.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackInstanceDetailedStatus
     */

    public StackInstanceComprehensiveStatus withDetailedStatus(StackInstanceDetailedStatus detailedStatus) {
        this.detailedStatus = detailedStatus.toString();
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
        if (getDetailedStatus() != null)
            sb.append("DetailedStatus: ").append(getDetailedStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackInstanceComprehensiveStatus == false)
            return false;
        StackInstanceComprehensiveStatus other = (StackInstanceComprehensiveStatus) obj;
        if (other.getDetailedStatus() == null ^ this.getDetailedStatus() == null)
            return false;
        if (other.getDetailedStatus() != null && other.getDetailedStatus().equals(this.getDetailedStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetailedStatus() == null) ? 0 : getDetailedStatus().hashCode());
        return hashCode;
    }

    @Override
    public StackInstanceComprehensiveStatus clone() {
        try {
            return (StackInstanceComprehensiveStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

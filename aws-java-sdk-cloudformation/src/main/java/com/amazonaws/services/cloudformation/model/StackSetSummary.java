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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The structures that contain summary information about the specified stack set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackSetSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackSetSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stack set.
     * </p>
     */
    private String stackSetName;
    /**
     * <p>
     * The ID of the stack set.
     * </p>
     */
    private String stackSetId;
    /**
     * <p>
     * A description of the stack set that you specify when the stack set is created or updated.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the stack set.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the stack set.
     * </p>
     * 
     * @param stackSetName
     *        The name of the stack set.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name of the stack set.
     * </p>
     * 
     * @return The name of the stack set.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name of the stack set.
     * </p>
     * 
     * @param stackSetName
     *        The name of the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetSummary withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     * 
     * @param stackSetId
     *        The ID of the stack set.
     */

    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     * 
     * @return The ID of the stack set.
     */

    public String getStackSetId() {
        return this.stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     * 
     * @param stackSetId
     *        The ID of the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetSummary withStackSetId(String stackSetId) {
        setStackSetId(stackSetId);
        return this;
    }

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is created or updated.
     * </p>
     * 
     * @param description
     *        A description of the stack set that you specify when the stack set is created or updated.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is created or updated.
     * </p>
     * 
     * @return A description of the stack set that you specify when the stack set is created or updated.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is created or updated.
     * </p>
     * 
     * @param description
     *        A description of the stack set that you specify when the stack set is created or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * 
     * @param status
     *        The status of the stack set.
     * @see StackSetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * 
     * @return The status of the stack set.
     * @see StackSetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * 
     * @param status
     *        The status of the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetStatus
     */

    public StackSetSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * 
     * @param status
     *        The status of the stack set.
     * @see StackSetStatus
     */

    public void setStatus(StackSetStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * 
     * @param status
     *        The status of the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetStatus
     */

    public StackSetSummary withStatus(StackSetStatus status) {
        this.status = status.toString();
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
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName()).append(",");
        if (getStackSetId() != null)
            sb.append("StackSetId: ").append(getStackSetId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSetSummary == false)
            return false;
        StackSetSummary other = (StackSetSummary) obj;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getStackSetId() == null ^ this.getStackSetId() == null)
            return false;
        if (other.getStackSetId() != null && other.getStackSetId().equals(this.getStackSetId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getStackSetId() == null) ? 0 : getStackSetId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public StackSetSummary clone() {
        try {
            return (StackSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

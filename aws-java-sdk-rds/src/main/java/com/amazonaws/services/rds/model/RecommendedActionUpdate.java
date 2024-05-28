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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The recommended status to update for the specified recommendation action ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RecommendedActionUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendedActionUpdate implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier of the updated recommendation action.
     * </p>
     */
    private String actionId;
    /**
     * <p>
     * The status of the updated recommendation action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applied</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scheduled</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * A unique identifier of the updated recommendation action.
     * </p>
     * 
     * @param actionId
     *        A unique identifier of the updated recommendation action.
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * A unique identifier of the updated recommendation action.
     * </p>
     * 
     * @return A unique identifier of the updated recommendation action.
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * <p>
     * A unique identifier of the updated recommendation action.
     * </p>
     * 
     * @param actionId
     *        A unique identifier of the updated recommendation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedActionUpdate withActionId(String actionId) {
        setActionId(actionId);
        return this;
    }

    /**
     * <p>
     * The status of the updated recommendation action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applied</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scheduled</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the updated recommendation action.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>applied</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>scheduled</code>
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the updated recommendation action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applied</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scheduled</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the updated recommendation action.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>applied</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>scheduled</code>
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the updated recommendation action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applied</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scheduled</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the updated recommendation action.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>applied</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>scheduled</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedActionUpdate withStatus(String status) {
        setStatus(status);
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
        if (getActionId() != null)
            sb.append("ActionId: ").append(getActionId()).append(",");
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

        if (obj instanceof RecommendedActionUpdate == false)
            return false;
        RecommendedActionUpdate other = (RecommendedActionUpdate) obj;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
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

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public RecommendedActionUpdate clone() {
        try {
            return (RecommendedActionUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

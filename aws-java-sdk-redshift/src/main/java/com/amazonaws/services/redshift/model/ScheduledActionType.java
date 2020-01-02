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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The action type that specifies an Amazon Redshift API operation that is supported by the Amazon Redshift scheduler.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ScheduledActionType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledActionType implements Serializable, Cloneable {

    /**
     * <p>
     * An action that runs a <code>ResizeCluster</code> API operation.
     * </p>
     */
    private ResizeClusterMessage resizeCluster;

    /**
     * <p>
     * An action that runs a <code>ResizeCluster</code> API operation.
     * </p>
     * 
     * @param resizeCluster
     *        An action that runs a <code>ResizeCluster</code> API operation.
     */

    public void setResizeCluster(ResizeClusterMessage resizeCluster) {
        this.resizeCluster = resizeCluster;
    }

    /**
     * <p>
     * An action that runs a <code>ResizeCluster</code> API operation.
     * </p>
     * 
     * @return An action that runs a <code>ResizeCluster</code> API operation.
     */

    public ResizeClusterMessage getResizeCluster() {
        return this.resizeCluster;
    }

    /**
     * <p>
     * An action that runs a <code>ResizeCluster</code> API operation.
     * </p>
     * 
     * @param resizeCluster
     *        An action that runs a <code>ResizeCluster</code> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionType withResizeCluster(ResizeClusterMessage resizeCluster) {
        setResizeCluster(resizeCluster);
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
        if (getResizeCluster() != null)
            sb.append("ResizeCluster: ").append(getResizeCluster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledActionType == false)
            return false;
        ScheduledActionType other = (ScheduledActionType) obj;
        if (other.getResizeCluster() == null ^ this.getResizeCluster() == null)
            return false;
        if (other.getResizeCluster() != null && other.getResizeCluster().equals(this.getResizeCluster()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResizeCluster() == null) ? 0 : getResizeCluster().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledActionType clone() {
        try {
            return (ScheduledActionType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

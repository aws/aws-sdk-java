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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result message containing a list of managed actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironmentManagedActions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentManagedActionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of upcoming and in-progress managed actions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ManagedAction> managedActions;

    /**
     * <p>
     * A list of upcoming and in-progress managed actions.
     * </p>
     * 
     * @return A list of upcoming and in-progress managed actions.
     */

    public java.util.List<ManagedAction> getManagedActions() {
        if (managedActions == null) {
            managedActions = new com.amazonaws.internal.SdkInternalList<ManagedAction>();
        }
        return managedActions;
    }

    /**
     * <p>
     * A list of upcoming and in-progress managed actions.
     * </p>
     * 
     * @param managedActions
     *        A list of upcoming and in-progress managed actions.
     */

    public void setManagedActions(java.util.Collection<ManagedAction> managedActions) {
        if (managedActions == null) {
            this.managedActions = null;
            return;
        }

        this.managedActions = new com.amazonaws.internal.SdkInternalList<ManagedAction>(managedActions);
    }

    /**
     * <p>
     * A list of upcoming and in-progress managed actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedActions(java.util.Collection)} or {@link #withManagedActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param managedActions
     *        A list of upcoming and in-progress managed actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentManagedActionsResult withManagedActions(ManagedAction... managedActions) {
        if (this.managedActions == null) {
            setManagedActions(new com.amazonaws.internal.SdkInternalList<ManagedAction>(managedActions.length));
        }
        for (ManagedAction ele : managedActions) {
            this.managedActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of upcoming and in-progress managed actions.
     * </p>
     * 
     * @param managedActions
     *        A list of upcoming and in-progress managed actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentManagedActionsResult withManagedActions(java.util.Collection<ManagedAction> managedActions) {
        setManagedActions(managedActions);
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
        if (getManagedActions() != null)
            sb.append("ManagedActions: ").append(getManagedActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEnvironmentManagedActionsResult == false)
            return false;
        DescribeEnvironmentManagedActionsResult other = (DescribeEnvironmentManagedActionsResult) obj;
        if (other.getManagedActions() == null ^ this.getManagedActions() == null)
            return false;
        if (other.getManagedActions() != null && other.getManagedActions().equals(this.getManagedActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManagedActions() == null) ? 0 : getManagedActions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEnvironmentManagedActionsResult clone() {
        try {
            return (DescribeEnvironmentManagedActionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

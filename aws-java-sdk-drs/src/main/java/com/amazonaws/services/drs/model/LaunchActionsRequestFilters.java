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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Resource launch actions filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/LaunchActionsRequestFilters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchActionsRequestFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Launch actions Ids.
     * </p>
     */
    private java.util.List<String> actionIds;

    /**
     * <p>
     * Launch actions Ids.
     * </p>
     * 
     * @return Launch actions Ids.
     */

    public java.util.List<String> getActionIds() {
        return actionIds;
    }

    /**
     * <p>
     * Launch actions Ids.
     * </p>
     * 
     * @param actionIds
     *        Launch actions Ids.
     */

    public void setActionIds(java.util.Collection<String> actionIds) {
        if (actionIds == null) {
            this.actionIds = null;
            return;
        }

        this.actionIds = new java.util.ArrayList<String>(actionIds);
    }

    /**
     * <p>
     * Launch actions Ids.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionIds(java.util.Collection)} or {@link #withActionIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param actionIds
     *        Launch actions Ids.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchActionsRequestFilters withActionIds(String... actionIds) {
        if (this.actionIds == null) {
            setActionIds(new java.util.ArrayList<String>(actionIds.length));
        }
        for (String ele : actionIds) {
            this.actionIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Launch actions Ids.
     * </p>
     * 
     * @param actionIds
     *        Launch actions Ids.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchActionsRequestFilters withActionIds(java.util.Collection<String> actionIds) {
        setActionIds(actionIds);
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
        if (getActionIds() != null)
            sb.append("ActionIds: ").append(getActionIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchActionsRequestFilters == false)
            return false;
        LaunchActionsRequestFilters other = (LaunchActionsRequestFilters) obj;
        if (other.getActionIds() == null ^ this.getActionIds() == null)
            return false;
        if (other.getActionIds() != null && other.getActionIds().equals(this.getActionIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionIds() == null) ? 0 : getActionIds().hashCode());
        return hashCode;
    }

    @Override
    public LaunchActionsRequestFilters clone() {
        try {
            return (LaunchActionsRequestFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.LaunchActionsRequestFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

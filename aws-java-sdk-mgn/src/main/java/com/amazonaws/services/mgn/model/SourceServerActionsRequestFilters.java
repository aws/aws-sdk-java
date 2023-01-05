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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Source server post migration custom action filters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/SourceServerActionsRequestFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceServerActionsRequestFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Action IDs to filter source server post migration custom actions by.
     * </p>
     */
    private java.util.List<String> actionIDs;

    /**
     * <p>
     * Action IDs to filter source server post migration custom actions by.
     * </p>
     * 
     * @return Action IDs to filter source server post migration custom actions by.
     */

    public java.util.List<String> getActionIDs() {
        return actionIDs;
    }

    /**
     * <p>
     * Action IDs to filter source server post migration custom actions by.
     * </p>
     * 
     * @param actionIDs
     *        Action IDs to filter source server post migration custom actions by.
     */

    public void setActionIDs(java.util.Collection<String> actionIDs) {
        if (actionIDs == null) {
            this.actionIDs = null;
            return;
        }

        this.actionIDs = new java.util.ArrayList<String>(actionIDs);
    }

    /**
     * <p>
     * Action IDs to filter source server post migration custom actions by.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionIDs(java.util.Collection)} or {@link #withActionIDs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param actionIDs
     *        Action IDs to filter source server post migration custom actions by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServerActionsRequestFilters withActionIDs(String... actionIDs) {
        if (this.actionIDs == null) {
            setActionIDs(new java.util.ArrayList<String>(actionIDs.length));
        }
        for (String ele : actionIDs) {
            this.actionIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Action IDs to filter source server post migration custom actions by.
     * </p>
     * 
     * @param actionIDs
     *        Action IDs to filter source server post migration custom actions by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServerActionsRequestFilters withActionIDs(java.util.Collection<String> actionIDs) {
        setActionIDs(actionIDs);
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
        if (getActionIDs() != null)
            sb.append("ActionIDs: ").append(getActionIDs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceServerActionsRequestFilters == false)
            return false;
        SourceServerActionsRequestFilters other = (SourceServerActionsRequestFilters) obj;
        if (other.getActionIDs() == null ^ this.getActionIDs() == null)
            return false;
        if (other.getActionIDs() != null && other.getActionIDs().equals(this.getActionIDs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionIDs() == null) ? 0 : getActionIDs().hashCode());
        return hashCode;
    }

    @Override
    public SourceServerActionsRequestFilters clone() {
        try {
            return (SourceServerActionsRequestFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.SourceServerActionsRequestFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

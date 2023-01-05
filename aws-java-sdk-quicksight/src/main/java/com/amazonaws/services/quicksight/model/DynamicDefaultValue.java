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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines different defaults to the users or groups based on mapping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DynamicDefaultValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DynamicDefaultValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The column that contains the username.
     * </p>
     */
    private ColumnIdentifier userNameColumn;
    /**
     * <p>
     * The column that contains the group name.
     * </p>
     */
    private ColumnIdentifier groupNameColumn;
    /**
     * <p>
     * The column that contains the default value of each user or group.
     * </p>
     */
    private ColumnIdentifier defaultValueColumn;

    /**
     * <p>
     * The column that contains the username.
     * </p>
     * 
     * @param userNameColumn
     *        The column that contains the username.
     */

    public void setUserNameColumn(ColumnIdentifier userNameColumn) {
        this.userNameColumn = userNameColumn;
    }

    /**
     * <p>
     * The column that contains the username.
     * </p>
     * 
     * @return The column that contains the username.
     */

    public ColumnIdentifier getUserNameColumn() {
        return this.userNameColumn;
    }

    /**
     * <p>
     * The column that contains the username.
     * </p>
     * 
     * @param userNameColumn
     *        The column that contains the username.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicDefaultValue withUserNameColumn(ColumnIdentifier userNameColumn) {
        setUserNameColumn(userNameColumn);
        return this;
    }

    /**
     * <p>
     * The column that contains the group name.
     * </p>
     * 
     * @param groupNameColumn
     *        The column that contains the group name.
     */

    public void setGroupNameColumn(ColumnIdentifier groupNameColumn) {
        this.groupNameColumn = groupNameColumn;
    }

    /**
     * <p>
     * The column that contains the group name.
     * </p>
     * 
     * @return The column that contains the group name.
     */

    public ColumnIdentifier getGroupNameColumn() {
        return this.groupNameColumn;
    }

    /**
     * <p>
     * The column that contains the group name.
     * </p>
     * 
     * @param groupNameColumn
     *        The column that contains the group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicDefaultValue withGroupNameColumn(ColumnIdentifier groupNameColumn) {
        setGroupNameColumn(groupNameColumn);
        return this;
    }

    /**
     * <p>
     * The column that contains the default value of each user or group.
     * </p>
     * 
     * @param defaultValueColumn
     *        The column that contains the default value of each user or group.
     */

    public void setDefaultValueColumn(ColumnIdentifier defaultValueColumn) {
        this.defaultValueColumn = defaultValueColumn;
    }

    /**
     * <p>
     * The column that contains the default value of each user or group.
     * </p>
     * 
     * @return The column that contains the default value of each user or group.
     */

    public ColumnIdentifier getDefaultValueColumn() {
        return this.defaultValueColumn;
    }

    /**
     * <p>
     * The column that contains the default value of each user or group.
     * </p>
     * 
     * @param defaultValueColumn
     *        The column that contains the default value of each user or group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicDefaultValue withDefaultValueColumn(ColumnIdentifier defaultValueColumn) {
        setDefaultValueColumn(defaultValueColumn);
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
        if (getUserNameColumn() != null)
            sb.append("UserNameColumn: ").append(getUserNameColumn()).append(",");
        if (getGroupNameColumn() != null)
            sb.append("GroupNameColumn: ").append(getGroupNameColumn()).append(",");
        if (getDefaultValueColumn() != null)
            sb.append("DefaultValueColumn: ").append(getDefaultValueColumn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DynamicDefaultValue == false)
            return false;
        DynamicDefaultValue other = (DynamicDefaultValue) obj;
        if (other.getUserNameColumn() == null ^ this.getUserNameColumn() == null)
            return false;
        if (other.getUserNameColumn() != null && other.getUserNameColumn().equals(this.getUserNameColumn()) == false)
            return false;
        if (other.getGroupNameColumn() == null ^ this.getGroupNameColumn() == null)
            return false;
        if (other.getGroupNameColumn() != null && other.getGroupNameColumn().equals(this.getGroupNameColumn()) == false)
            return false;
        if (other.getDefaultValueColumn() == null ^ this.getDefaultValueColumn() == null)
            return false;
        if (other.getDefaultValueColumn() != null && other.getDefaultValueColumn().equals(this.getDefaultValueColumn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserNameColumn() == null) ? 0 : getUserNameColumn().hashCode());
        hashCode = prime * hashCode + ((getGroupNameColumn() == null) ? 0 : getGroupNameColumn().hashCode());
        hashCode = prime * hashCode + ((getDefaultValueColumn() == null) ? 0 : getDefaultValueColumn().hashCode());
        return hashCode;
    }

    @Override
    public DynamicDefaultValue clone() {
        try {
            return (DynamicDefaultValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DynamicDefaultValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

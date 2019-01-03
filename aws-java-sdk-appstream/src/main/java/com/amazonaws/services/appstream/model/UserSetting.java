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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an action and whether the action is enabled or disabled for users during their streaming sessions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UserSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action that is enabled or disabled.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Indicates whether the action is enabled or disabled.
     * </p>
     */
    private String permission;

    /**
     * <p>
     * The action that is enabled or disabled.
     * </p>
     * 
     * @param action
     *        The action that is enabled or disabled.
     * @see Action
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that is enabled or disabled.
     * </p>
     * 
     * @return The action that is enabled or disabled.
     * @see Action
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action that is enabled or disabled.
     * </p>
     * 
     * @param action
     *        The action that is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Action
     */

    public UserSetting withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action that is enabled or disabled.
     * </p>
     * 
     * @param action
     *        The action that is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Action
     */

    public UserSetting withAction(Action action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the action is enabled or disabled.
     * </p>
     * 
     * @param permission
     *        Indicates whether the action is enabled or disabled.
     * @see Permission
     */

    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p>
     * Indicates whether the action is enabled or disabled.
     * </p>
     * 
     * @return Indicates whether the action is enabled or disabled.
     * @see Permission
     */

    public String getPermission() {
        return this.permission;
    }

    /**
     * <p>
     * Indicates whether the action is enabled or disabled.
     * </p>
     * 
     * @param permission
     *        Indicates whether the action is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public UserSetting withPermission(String permission) {
        setPermission(permission);
        return this;
    }

    /**
     * <p>
     * Indicates whether the action is enabled or disabled.
     * </p>
     * 
     * @param permission
     *        Indicates whether the action is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public UserSetting withPermission(Permission permission) {
        this.permission = permission.toString();
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getPermission() != null)
            sb.append("Permission: ").append(getPermission());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserSetting == false)
            return false;
        UserSetting other = (UserSetting) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null && other.getPermission().equals(this.getPermission()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        return hashCode;
    }

    @Override
    public UserSetting clone() {
        try {
            return (UserSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.UserSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The representation of an Amazon WorkMail group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/Group" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Group implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The email of the group.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The state of the group, which can be ENABLED, DISABLED, or DELETED.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The date indicating when the group was enabled for Amazon WorkMail use.
     * </p>
     */
    private java.util.Date enabledDate;
    /**
     * <p>
     * The date indicating when the group was disabled from Amazon WorkMail use.
     * </p>
     */
    private java.util.Date disabledDate;

    /**
     * <p>
     * The identifier of the group.
     * </p>
     * 
     * @param id
     *        The identifier of the group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the group.
     * </p>
     * 
     * @return The identifier of the group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the group.
     * </p>
     * 
     * @param id
     *        The identifier of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The email of the group.
     * </p>
     * 
     * @param email
     *        The email of the group.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email of the group.
     * </p>
     * 
     * @return The email of the group.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email of the group.
     * </p>
     * 
     * @param email
     *        The email of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param name
     *        The name of the group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param name
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The state of the group, which can be ENABLED, DISABLED, or DELETED.
     * </p>
     * 
     * @param state
     *        The state of the group, which can be ENABLED, DISABLED, or DELETED.
     * @see EntityState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the group, which can be ENABLED, DISABLED, or DELETED.
     * </p>
     * 
     * @return The state of the group, which can be ENABLED, DISABLED, or DELETED.
     * @see EntityState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the group, which can be ENABLED, DISABLED, or DELETED.
     * </p>
     * 
     * @param state
     *        The state of the group, which can be ENABLED, DISABLED, or DELETED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityState
     */

    public Group withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the group, which can be ENABLED, DISABLED, or DELETED.
     * </p>
     * 
     * @param state
     *        The state of the group, which can be ENABLED, DISABLED, or DELETED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityState
     */

    public Group withState(EntityState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date indicating when the group was enabled for Amazon WorkMail use.
     * </p>
     * 
     * @param enabledDate
     *        The date indicating when the group was enabled for Amazon WorkMail use.
     */

    public void setEnabledDate(java.util.Date enabledDate) {
        this.enabledDate = enabledDate;
    }

    /**
     * <p>
     * The date indicating when the group was enabled for Amazon WorkMail use.
     * </p>
     * 
     * @return The date indicating when the group was enabled for Amazon WorkMail use.
     */

    public java.util.Date getEnabledDate() {
        return this.enabledDate;
    }

    /**
     * <p>
     * The date indicating when the group was enabled for Amazon WorkMail use.
     * </p>
     * 
     * @param enabledDate
     *        The date indicating when the group was enabled for Amazon WorkMail use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withEnabledDate(java.util.Date enabledDate) {
        setEnabledDate(enabledDate);
        return this;
    }

    /**
     * <p>
     * The date indicating when the group was disabled from Amazon WorkMail use.
     * </p>
     * 
     * @param disabledDate
     *        The date indicating when the group was disabled from Amazon WorkMail use.
     */

    public void setDisabledDate(java.util.Date disabledDate) {
        this.disabledDate = disabledDate;
    }

    /**
     * <p>
     * The date indicating when the group was disabled from Amazon WorkMail use.
     * </p>
     * 
     * @return The date indicating when the group was disabled from Amazon WorkMail use.
     */

    public java.util.Date getDisabledDate() {
        return this.disabledDate;
    }

    /**
     * <p>
     * The date indicating when the group was disabled from Amazon WorkMail use.
     * </p>
     * 
     * @param disabledDate
     *        The date indicating when the group was disabled from Amazon WorkMail use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withDisabledDate(java.util.Date disabledDate) {
        setDisabledDate(disabledDate);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getEnabledDate() != null)
            sb.append("EnabledDate: ").append(getEnabledDate()).append(",");
        if (getDisabledDate() != null)
            sb.append("DisabledDate: ").append(getDisabledDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Group == false)
            return false;
        Group other = (Group) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getEnabledDate() == null ^ this.getEnabledDate() == null)
            return false;
        if (other.getEnabledDate() != null && other.getEnabledDate().equals(this.getEnabledDate()) == false)
            return false;
        if (other.getDisabledDate() == null ^ this.getDisabledDate() == null)
            return false;
        if (other.getDisabledDate() != null && other.getDisabledDate().equals(this.getDisabledDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getEnabledDate() == null) ? 0 : getEnabledDate().hashCode());
        hashCode = prime * hashCode + ((getDisabledDate() == null) ? 0 : getDisabledDate().hashCode());
        return hashCode;
    }

    @Override
    public Group clone() {
        try {
            return (Group) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.GroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

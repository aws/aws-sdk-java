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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filtering options for <i>ListUsers</i> operation. This is only used as input to Operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListUsersFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsersFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filters only users with the provided username prefix.
     * </p>
     */
    private String usernamePrefix;
    /**
     * <p>
     * Filters only users with the provided display name prefix.
     * </p>
     */
    private String displayNamePrefix;
    /**
     * <p>
     * Filters only users with the provided email prefix.
     * </p>
     */
    private String primaryEmailPrefix;
    /**
     * <p>
     * Filters only users with the provided state.
     * </p>
     */
    private String state;

    /**
     * <p>
     * Filters only users with the provided username prefix.
     * </p>
     * 
     * @param usernamePrefix
     *        Filters only users with the provided username prefix.
     */

    public void setUsernamePrefix(String usernamePrefix) {
        this.usernamePrefix = usernamePrefix;
    }

    /**
     * <p>
     * Filters only users with the provided username prefix.
     * </p>
     * 
     * @return Filters only users with the provided username prefix.
     */

    public String getUsernamePrefix() {
        return this.usernamePrefix;
    }

    /**
     * <p>
     * Filters only users with the provided username prefix.
     * </p>
     * 
     * @param usernamePrefix
     *        Filters only users with the provided username prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersFilters withUsernamePrefix(String usernamePrefix) {
        setUsernamePrefix(usernamePrefix);
        return this;
    }

    /**
     * <p>
     * Filters only users with the provided display name prefix.
     * </p>
     * 
     * @param displayNamePrefix
     *        Filters only users with the provided display name prefix.
     */

    public void setDisplayNamePrefix(String displayNamePrefix) {
        this.displayNamePrefix = displayNamePrefix;
    }

    /**
     * <p>
     * Filters only users with the provided display name prefix.
     * </p>
     * 
     * @return Filters only users with the provided display name prefix.
     */

    public String getDisplayNamePrefix() {
        return this.displayNamePrefix;
    }

    /**
     * <p>
     * Filters only users with the provided display name prefix.
     * </p>
     * 
     * @param displayNamePrefix
     *        Filters only users with the provided display name prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersFilters withDisplayNamePrefix(String displayNamePrefix) {
        setDisplayNamePrefix(displayNamePrefix);
        return this;
    }

    /**
     * <p>
     * Filters only users with the provided email prefix.
     * </p>
     * 
     * @param primaryEmailPrefix
     *        Filters only users with the provided email prefix.
     */

    public void setPrimaryEmailPrefix(String primaryEmailPrefix) {
        this.primaryEmailPrefix = primaryEmailPrefix;
    }

    /**
     * <p>
     * Filters only users with the provided email prefix.
     * </p>
     * 
     * @return Filters only users with the provided email prefix.
     */

    public String getPrimaryEmailPrefix() {
        return this.primaryEmailPrefix;
    }

    /**
     * <p>
     * Filters only users with the provided email prefix.
     * </p>
     * 
     * @param primaryEmailPrefix
     *        Filters only users with the provided email prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersFilters withPrimaryEmailPrefix(String primaryEmailPrefix) {
        setPrimaryEmailPrefix(primaryEmailPrefix);
        return this;
    }

    /**
     * <p>
     * Filters only users with the provided state.
     * </p>
     * 
     * @param state
     *        Filters only users with the provided state.
     * @see EntityState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Filters only users with the provided state.
     * </p>
     * 
     * @return Filters only users with the provided state.
     * @see EntityState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Filters only users with the provided state.
     * </p>
     * 
     * @param state
     *        Filters only users with the provided state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityState
     */

    public ListUsersFilters withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Filters only users with the provided state.
     * </p>
     * 
     * @param state
     *        Filters only users with the provided state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityState
     */

    public ListUsersFilters withState(EntityState state) {
        this.state = state.toString();
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
        if (getUsernamePrefix() != null)
            sb.append("UsernamePrefix: ").append(getUsernamePrefix()).append(",");
        if (getDisplayNamePrefix() != null)
            sb.append("DisplayNamePrefix: ").append("***Sensitive Data Redacted***").append(",");
        if (getPrimaryEmailPrefix() != null)
            sb.append("PrimaryEmailPrefix: ").append(getPrimaryEmailPrefix()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUsersFilters == false)
            return false;
        ListUsersFilters other = (ListUsersFilters) obj;
        if (other.getUsernamePrefix() == null ^ this.getUsernamePrefix() == null)
            return false;
        if (other.getUsernamePrefix() != null && other.getUsernamePrefix().equals(this.getUsernamePrefix()) == false)
            return false;
        if (other.getDisplayNamePrefix() == null ^ this.getDisplayNamePrefix() == null)
            return false;
        if (other.getDisplayNamePrefix() != null && other.getDisplayNamePrefix().equals(this.getDisplayNamePrefix()) == false)
            return false;
        if (other.getPrimaryEmailPrefix() == null ^ this.getPrimaryEmailPrefix() == null)
            return false;
        if (other.getPrimaryEmailPrefix() != null && other.getPrimaryEmailPrefix().equals(this.getPrimaryEmailPrefix()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsernamePrefix() == null) ? 0 : getUsernamePrefix().hashCode());
        hashCode = prime * hashCode + ((getDisplayNamePrefix() == null) ? 0 : getDisplayNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getPrimaryEmailPrefix() == null) ? 0 : getPrimaryEmailPrefix().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public ListUsersFilters clone() {
        try {
            return (ListUsersFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.ListUsersFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

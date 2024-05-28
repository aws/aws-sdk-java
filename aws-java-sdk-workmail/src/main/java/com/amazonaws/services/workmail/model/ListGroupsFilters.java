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
 * Filtering options for <i>ListGroups</i> operation. This is only used as input to Operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListGroupsFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupsFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filters only groups with the provided name prefix.
     * </p>
     */
    private String namePrefix;
    /**
     * <p>
     * Filters only groups with the provided primary email prefix.
     * </p>
     */
    private String primaryEmailPrefix;
    /**
     * <p>
     * Filters only groups with the provided state.
     * </p>
     */
    private String state;

    /**
     * <p>
     * Filters only groups with the provided name prefix.
     * </p>
     * 
     * @param namePrefix
     *        Filters only groups with the provided name prefix.
     */

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    /**
     * <p>
     * Filters only groups with the provided name prefix.
     * </p>
     * 
     * @return Filters only groups with the provided name prefix.
     */

    public String getNamePrefix() {
        return this.namePrefix;
    }

    /**
     * <p>
     * Filters only groups with the provided name prefix.
     * </p>
     * 
     * @param namePrefix
     *        Filters only groups with the provided name prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsFilters withNamePrefix(String namePrefix) {
        setNamePrefix(namePrefix);
        return this;
    }

    /**
     * <p>
     * Filters only groups with the provided primary email prefix.
     * </p>
     * 
     * @param primaryEmailPrefix
     *        Filters only groups with the provided primary email prefix.
     */

    public void setPrimaryEmailPrefix(String primaryEmailPrefix) {
        this.primaryEmailPrefix = primaryEmailPrefix;
    }

    /**
     * <p>
     * Filters only groups with the provided primary email prefix.
     * </p>
     * 
     * @return Filters only groups with the provided primary email prefix.
     */

    public String getPrimaryEmailPrefix() {
        return this.primaryEmailPrefix;
    }

    /**
     * <p>
     * Filters only groups with the provided primary email prefix.
     * </p>
     * 
     * @param primaryEmailPrefix
     *        Filters only groups with the provided primary email prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsFilters withPrimaryEmailPrefix(String primaryEmailPrefix) {
        setPrimaryEmailPrefix(primaryEmailPrefix);
        return this;
    }

    /**
     * <p>
     * Filters only groups with the provided state.
     * </p>
     * 
     * @param state
     *        Filters only groups with the provided state.
     * @see EntityState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Filters only groups with the provided state.
     * </p>
     * 
     * @return Filters only groups with the provided state.
     * @see EntityState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Filters only groups with the provided state.
     * </p>
     * 
     * @param state
     *        Filters only groups with the provided state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityState
     */

    public ListGroupsFilters withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Filters only groups with the provided state.
     * </p>
     * 
     * @param state
     *        Filters only groups with the provided state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityState
     */

    public ListGroupsFilters withState(EntityState state) {
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
        if (getNamePrefix() != null)
            sb.append("NamePrefix: ").append(getNamePrefix()).append(",");
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

        if (obj instanceof ListGroupsFilters == false)
            return false;
        ListGroupsFilters other = (ListGroupsFilters) obj;
        if (other.getNamePrefix() == null ^ this.getNamePrefix() == null)
            return false;
        if (other.getNamePrefix() != null && other.getNamePrefix().equals(this.getNamePrefix()) == false)
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

        hashCode = prime * hashCode + ((getNamePrefix() == null) ? 0 : getNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getPrimaryEmailPrefix() == null) ? 0 : getPrimaryEmailPrefix().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupsFilters clone() {
        try {
            return (ListGroupsFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.ListGroupsFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

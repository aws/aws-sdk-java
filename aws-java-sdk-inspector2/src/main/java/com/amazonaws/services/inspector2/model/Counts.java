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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * a structure that contains information on the count of resources within a group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Counts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Counts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of resources.
     * </p>
     */
    private Long count;
    /**
     * <p>
     * The key associated with this group
     * </p>
     */
    private String groupKey;

    /**
     * <p>
     * The number of resources.
     * </p>
     * 
     * @param count
     *        The number of resources.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of resources.
     * </p>
     * 
     * @return The number of resources.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of resources.
     * </p>
     * 
     * @param count
     *        The number of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Counts withCount(Long count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The key associated with this group
     * </p>
     * 
     * @param groupKey
     *        The key associated with this group
     * @see GroupKey
     */

    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

    /**
     * <p>
     * The key associated with this group
     * </p>
     * 
     * @return The key associated with this group
     * @see GroupKey
     */

    public String getGroupKey() {
        return this.groupKey;
    }

    /**
     * <p>
     * The key associated with this group
     * </p>
     * 
     * @param groupKey
     *        The key associated with this group
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupKey
     */

    public Counts withGroupKey(String groupKey) {
        setGroupKey(groupKey);
        return this;
    }

    /**
     * <p>
     * The key associated with this group
     * </p>
     * 
     * @param groupKey
     *        The key associated with this group
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupKey
     */

    public Counts withGroupKey(GroupKey groupKey) {
        this.groupKey = groupKey.toString();
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getGroupKey() != null)
            sb.append("GroupKey: ").append(getGroupKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Counts == false)
            return false;
        Counts other = (Counts) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getGroupKey() == null ^ this.getGroupKey() == null)
            return false;
        if (other.getGroupKey() != null && other.getGroupKey().equals(this.getGroupKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getGroupKey() == null) ? 0 : getGroupKey().hashCode());
        return hashCode;
    }

    @Override
    public Counts clone() {
        try {
            return (Counts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CountsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

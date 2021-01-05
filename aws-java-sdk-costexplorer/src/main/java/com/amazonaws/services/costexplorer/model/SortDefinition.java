/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of how to sort the data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/SortDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SortDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key by which to sort the data.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The order in which to sort the data.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The key by which to sort the data.
     * </p>
     * 
     * @param key
     *        The key by which to sort the data.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key by which to sort the data.
     * </p>
     * 
     * @return The key by which to sort the data.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key by which to sort the data.
     * </p>
     * 
     * @param key
     *        The key by which to sort the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SortDefinition withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The order in which to sort the data.
     * </p>
     * 
     * @param sortOrder
     *        The order in which to sort the data.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order in which to sort the data.
     * </p>
     * 
     * @return The order in which to sort the data.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order in which to sort the data.
     * </p>
     * 
     * @param sortOrder
     *        The order in which to sort the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SortDefinition withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order in which to sort the data.
     * </p>
     * 
     * @param sortOrder
     *        The order in which to sort the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SortDefinition withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SortDefinition == false)
            return false;
        SortDefinition other = (SortDefinition) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public SortDefinition clone() {
        try {
            return (SortDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.SortDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

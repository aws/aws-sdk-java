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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter for reference stores.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ReferenceStoreFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceStoreFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The filter's start date.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * The filter's end date.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * The name to filter on.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The filter's start date.
     * </p>
     * 
     * @param createdAfter
     *        The filter's start date.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * The filter's start date.
     * </p>
     * 
     * @return The filter's start date.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * The filter's start date.
     * </p>
     * 
     * @param createdAfter
     *        The filter's start date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceStoreFilter withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * The filter's end date.
     * </p>
     * 
     * @param createdBefore
     *        The filter's end date.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * The filter's end date.
     * </p>
     * 
     * @return The filter's end date.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * The filter's end date.
     * </p>
     * 
     * @param createdBefore
     *        The filter's end date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceStoreFilter withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * The name to filter on.
     * </p>
     * 
     * @param name
     *        The name to filter on.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name to filter on.
     * </p>
     * 
     * @return The name to filter on.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name to filter on.
     * </p>
     * 
     * @param name
     *        The name to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceStoreFilter withName(String name) {
        setName(name);
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
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceStoreFilter == false)
            return false;
        ReferenceStoreFilter other = (ReferenceStoreFilter) obj;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceStoreFilter clone() {
        try {
            return (ReferenceStoreFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.ReferenceStoreFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

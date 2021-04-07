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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Request to filter Source Servers list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeSourceServersRequestFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSourceServersRequestFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Request to filter Source Servers list by archived.
     * </p>
     */
    private Boolean isArchived;
    /**
     * <p>
     * Request to filter Source Servers list by Source Server ID.
     * </p>
     */
    private java.util.List<String> sourceServerIDs;

    /**
     * <p>
     * Request to filter Source Servers list by archived.
     * </p>
     * 
     * @param isArchived
     *        Request to filter Source Servers list by archived.
     */

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * <p>
     * Request to filter Source Servers list by archived.
     * </p>
     * 
     * @return Request to filter Source Servers list by archived.
     */

    public Boolean getIsArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * Request to filter Source Servers list by archived.
     * </p>
     * 
     * @param isArchived
     *        Request to filter Source Servers list by archived.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceServersRequestFilters withIsArchived(Boolean isArchived) {
        setIsArchived(isArchived);
        return this;
    }

    /**
     * <p>
     * Request to filter Source Servers list by archived.
     * </p>
     * 
     * @return Request to filter Source Servers list by archived.
     */

    public Boolean isArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * Request to filter Source Servers list by Source Server ID.
     * </p>
     * 
     * @return Request to filter Source Servers list by Source Server ID.
     */

    public java.util.List<String> getSourceServerIDs() {
        return sourceServerIDs;
    }

    /**
     * <p>
     * Request to filter Source Servers list by Source Server ID.
     * </p>
     * 
     * @param sourceServerIDs
     *        Request to filter Source Servers list by Source Server ID.
     */

    public void setSourceServerIDs(java.util.Collection<String> sourceServerIDs) {
        if (sourceServerIDs == null) {
            this.sourceServerIDs = null;
            return;
        }

        this.sourceServerIDs = new java.util.ArrayList<String>(sourceServerIDs);
    }

    /**
     * <p>
     * Request to filter Source Servers list by Source Server ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceServerIDs(java.util.Collection)} or {@link #withSourceServerIDs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sourceServerIDs
     *        Request to filter Source Servers list by Source Server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceServersRequestFilters withSourceServerIDs(String... sourceServerIDs) {
        if (this.sourceServerIDs == null) {
            setSourceServerIDs(new java.util.ArrayList<String>(sourceServerIDs.length));
        }
        for (String ele : sourceServerIDs) {
            this.sourceServerIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Request to filter Source Servers list by Source Server ID.
     * </p>
     * 
     * @param sourceServerIDs
     *        Request to filter Source Servers list by Source Server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceServersRequestFilters withSourceServerIDs(java.util.Collection<String> sourceServerIDs) {
        setSourceServerIDs(sourceServerIDs);
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
        if (getIsArchived() != null)
            sb.append("IsArchived: ").append(getIsArchived()).append(",");
        if (getSourceServerIDs() != null)
            sb.append("SourceServerIDs: ").append(getSourceServerIDs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSourceServersRequestFilters == false)
            return false;
        DescribeSourceServersRequestFilters other = (DescribeSourceServersRequestFilters) obj;
        if (other.getIsArchived() == null ^ this.getIsArchived() == null)
            return false;
        if (other.getIsArchived() != null && other.getIsArchived().equals(this.getIsArchived()) == false)
            return false;
        if (other.getSourceServerIDs() == null ^ this.getSourceServerIDs() == null)
            return false;
        if (other.getSourceServerIDs() != null && other.getSourceServerIDs().equals(this.getSourceServerIDs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsArchived() == null) ? 0 : getIsArchived().hashCode());
        hashCode = prime * hashCode + ((getSourceServerIDs() == null) ? 0 : getSourceServerIDs().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSourceServersRequestFilters clone() {
        try {
            return (DescribeSourceServersRequestFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.DescribeSourceServersRequestFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

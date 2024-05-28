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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List exports request filters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListExportsRequestFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExportsRequestFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List exports request filters export ids.
     * </p>
     */
    private java.util.List<String> exportIDs;

    /**
     * <p>
     * List exports request filters export ids.
     * </p>
     * 
     * @return List exports request filters export ids.
     */

    public java.util.List<String> getExportIDs() {
        return exportIDs;
    }

    /**
     * <p>
     * List exports request filters export ids.
     * </p>
     * 
     * @param exportIDs
     *        List exports request filters export ids.
     */

    public void setExportIDs(java.util.Collection<String> exportIDs) {
        if (exportIDs == null) {
            this.exportIDs = null;
            return;
        }

        this.exportIDs = new java.util.ArrayList<String>(exportIDs);
    }

    /**
     * <p>
     * List exports request filters export ids.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportIDs(java.util.Collection)} or {@link #withExportIDs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exportIDs
     *        List exports request filters export ids.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsRequestFilters withExportIDs(String... exportIDs) {
        if (this.exportIDs == null) {
            setExportIDs(new java.util.ArrayList<String>(exportIDs.length));
        }
        for (String ele : exportIDs) {
            this.exportIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List exports request filters export ids.
     * </p>
     * 
     * @param exportIDs
     *        List exports request filters export ids.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsRequestFilters withExportIDs(java.util.Collection<String> exportIDs) {
        setExportIDs(exportIDs);
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
        if (getExportIDs() != null)
            sb.append("ExportIDs: ").append(getExportIDs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListExportsRequestFilters == false)
            return false;
        ListExportsRequestFilters other = (ListExportsRequestFilters) obj;
        if (other.getExportIDs() == null ^ this.getExportIDs() == null)
            return false;
        if (other.getExportIDs() != null && other.getExportIDs().equals(this.getExportIDs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportIDs() == null) ? 0 : getExportIDs().hashCode());
        return hashCode;
    }

    @Override
    public ListExportsRequestFilters clone() {
        try {
            return (ListExportsRequestFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ListExportsRequestFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

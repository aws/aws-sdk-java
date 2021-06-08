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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains the options relating to the destination of the import request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/DestinationOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A map of the column id to the import properties for each column.
     * </p>
     */
    private java.util.Map<String, SourceDataColumnProperties> columnMap;

    /**
     * <p>
     * A map of the column id to the import properties for each column.
     * </p>
     * 
     * @return A map of the column id to the import properties for each column.
     */

    public java.util.Map<String, SourceDataColumnProperties> getColumnMap() {
        return columnMap;
    }

    /**
     * <p>
     * A map of the column id to the import properties for each column.
     * </p>
     * 
     * @param columnMap
     *        A map of the column id to the import properties for each column.
     */

    public void setColumnMap(java.util.Map<String, SourceDataColumnProperties> columnMap) {
        this.columnMap = columnMap;
    }

    /**
     * <p>
     * A map of the column id to the import properties for each column.
     * </p>
     * 
     * @param columnMap
     *        A map of the column id to the import properties for each column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationOptions withColumnMap(java.util.Map<String, SourceDataColumnProperties> columnMap) {
        setColumnMap(columnMap);
        return this;
    }

    /**
     * Add a single ColumnMap entry
     *
     * @see DestinationOptions#withColumnMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DestinationOptions addColumnMapEntry(String key, SourceDataColumnProperties value) {
        if (null == this.columnMap) {
            this.columnMap = new java.util.HashMap<String, SourceDataColumnProperties>();
        }
        if (this.columnMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.columnMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ColumnMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationOptions clearColumnMapEntries() {
        this.columnMap = null;
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
        if (getColumnMap() != null)
            sb.append("ColumnMap: ").append(getColumnMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationOptions == false)
            return false;
        DestinationOptions other = (DestinationOptions) obj;
        if (other.getColumnMap() == null ^ this.getColumnMap() == null)
            return false;
        if (other.getColumnMap() != null && other.getColumnMap().equals(this.getColumnMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnMap() == null) ? 0 : getColumnMap().hashCode());
        return hashCode;
    }

    @Override
    public DestinationOptions clone() {
        try {
            return (DestinationOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.DestinationOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

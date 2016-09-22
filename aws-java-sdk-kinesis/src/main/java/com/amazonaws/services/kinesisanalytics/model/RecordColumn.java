/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the mapping of each data element in the streaming source to the corresponding column in the in-application
 * stream.
 * </p>
 * <p>
 * Also used to describe the format of the reference data source.
 * </p>
 */
public class RecordColumn implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the column created in the in-application input stream or reference table.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Reference to the data element in the streaming input of the reference data source.
     * </p>
     */
    private String mapping;
    /**
     * <p>
     * Type of column created in the in-application input stream or reference table.
     * </p>
     */
    private String sqlType;

    /**
     * <p>
     * Name of the column created in the in-application input stream or reference table.
     * </p>
     * 
     * @param name
     *        Name of the column created in the in-application input stream or reference table.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the column created in the in-application input stream or reference table.
     * </p>
     * 
     * @return Name of the column created in the in-application input stream or reference table.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the column created in the in-application input stream or reference table.
     * </p>
     * 
     * @param name
     *        Name of the column created in the in-application input stream or reference table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordColumn withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Reference to the data element in the streaming input of the reference data source.
     * </p>
     * 
     * @param mapping
     *        Reference to the data element in the streaming input of the reference data source.
     */

    public void setMapping(String mapping) {
        this.mapping = mapping;
    }

    /**
     * <p>
     * Reference to the data element in the streaming input of the reference data source.
     * </p>
     * 
     * @return Reference to the data element in the streaming input of the reference data source.
     */

    public String getMapping() {
        return this.mapping;
    }

    /**
     * <p>
     * Reference to the data element in the streaming input of the reference data source.
     * </p>
     * 
     * @param mapping
     *        Reference to the data element in the streaming input of the reference data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordColumn withMapping(String mapping) {
        setMapping(mapping);
        return this;
    }

    /**
     * <p>
     * Type of column created in the in-application input stream or reference table.
     * </p>
     * 
     * @param sqlType
     *        Type of column created in the in-application input stream or reference table.
     */

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    /**
     * <p>
     * Type of column created in the in-application input stream or reference table.
     * </p>
     * 
     * @return Type of column created in the in-application input stream or reference table.
     */

    public String getSqlType() {
        return this.sqlType;
    }

    /**
     * <p>
     * Type of column created in the in-application input stream or reference table.
     * </p>
     * 
     * @param sqlType
     *        Type of column created in the in-application input stream or reference table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordColumn withSqlType(String sqlType) {
        setSqlType(sqlType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMapping() != null)
            sb.append("Mapping: " + getMapping() + ",");
        if (getSqlType() != null)
            sb.append("SqlType: " + getSqlType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordColumn == false)
            return false;
        RecordColumn other = (RecordColumn) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMapping() == null ^ this.getMapping() == null)
            return false;
        if (other.getMapping() != null && other.getMapping().equals(this.getMapping()) == false)
            return false;
        if (other.getSqlType() == null ^ this.getSqlType() == null)
            return false;
        if (other.getSqlType() != null && other.getSqlType().equals(this.getSqlType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMapping() == null) ? 0 : getMapping().hashCode());
        hashCode = prime * hashCode + ((getSqlType() == null) ? 0 : getSqlType().hashCode());
        return hashCode;
    }

    @Override
    public RecordColumn clone() {
        try {
            return (RecordColumn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

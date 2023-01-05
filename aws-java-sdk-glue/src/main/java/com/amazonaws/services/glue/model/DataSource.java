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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A data source (an Glue table) for which you want data quality results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Glue table.
     * </p>
     */
    private GlueTable glueTable;

    /**
     * <p>
     * An Glue table.
     * </p>
     * 
     * @param glueTable
     *        An Glue table.
     */

    public void setGlueTable(GlueTable glueTable) {
        this.glueTable = glueTable;
    }

    /**
     * <p>
     * An Glue table.
     * </p>
     * 
     * @return An Glue table.
     */

    public GlueTable getGlueTable() {
        return this.glueTable;
    }

    /**
     * <p>
     * An Glue table.
     * </p>
     * 
     * @param glueTable
     *        An Glue table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withGlueTable(GlueTable glueTable) {
        setGlueTable(glueTable);
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
        if (getGlueTable() != null)
            sb.append("GlueTable: ").append(getGlueTable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSource == false)
            return false;
        DataSource other = (DataSource) obj;
        if (other.getGlueTable() == null ^ this.getGlueTable() == null)
            return false;
        if (other.getGlueTable() != null && other.getGlueTable().equals(this.getGlueTable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlueTable() == null) ? 0 : getGlueTable().hashCode());
        return hashCode;
    }

    @Override
    public DataSource clone() {
        try {
            return (DataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

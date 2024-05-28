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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines information about the Glue data source that contains the training data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A GlueDataSource object that defines the catalog ID, database name, and table name for the training data.
     * </p>
     */
    private GlueDataSource glueDataSource;

    /**
     * <p>
     * A GlueDataSource object that defines the catalog ID, database name, and table name for the training data.
     * </p>
     * 
     * @param glueDataSource
     *        A GlueDataSource object that defines the catalog ID, database name, and table name for the training data.
     */

    public void setGlueDataSource(GlueDataSource glueDataSource) {
        this.glueDataSource = glueDataSource;
    }

    /**
     * <p>
     * A GlueDataSource object that defines the catalog ID, database name, and table name for the training data.
     * </p>
     * 
     * @return A GlueDataSource object that defines the catalog ID, database name, and table name for the training data.
     */

    public GlueDataSource getGlueDataSource() {
        return this.glueDataSource;
    }

    /**
     * <p>
     * A GlueDataSource object that defines the catalog ID, database name, and table name for the training data.
     * </p>
     * 
     * @param glueDataSource
     *        A GlueDataSource object that defines the catalog ID, database name, and table name for the training data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withGlueDataSource(GlueDataSource glueDataSource) {
        setGlueDataSource(glueDataSource);
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
        if (getGlueDataSource() != null)
            sb.append("GlueDataSource: ").append(getGlueDataSource());
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
        if (other.getGlueDataSource() == null ^ this.getGlueDataSource() == null)
            return false;
        if (other.getGlueDataSource() != null && other.getGlueDataSource().equals(this.getGlueDataSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlueDataSource() == null) ? 0 : getGlueDataSource().hashCode());
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
        com.amazonaws.services.cleanroomsml.model.transform.DataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

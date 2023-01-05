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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the import file that contains the time series for which you want to create forecasts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/TimeSeriesIdentifiers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSeriesIdentifiers implements Serializable, Cloneable, StructuredPojo {

    private DataSource dataSource;

    private Schema schema;
    /**
     * <p>
     * The format of the data, either CSV or PARQUET.
     * </p>
     */
    private String format;

    /**
     * @param dataSource
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * @return
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * @param dataSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesIdentifiers withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * @param schema
     */

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    /**
     * @return
     */

    public Schema getSchema() {
        return this.schema;
    }

    /**
     * @param schema
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesIdentifiers withSchema(Schema schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The format of the data, either CSV or PARQUET.
     * </p>
     * 
     * @param format
     *        The format of the data, either CSV or PARQUET.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the data, either CSV or PARQUET.
     * </p>
     * 
     * @return The format of the data, either CSV or PARQUET.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the data, either CSV or PARQUET.
     * </p>
     * 
     * @param format
     *        The format of the data, either CSV or PARQUET.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesIdentifiers withFormat(String format) {
        setFormat(format);
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeSeriesIdentifiers == false)
            return false;
        TimeSeriesIdentifiers other = (TimeSeriesIdentifiers) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public TimeSeriesIdentifiers clone() {
        try {
            return (TimeSeriesIdentifiers) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.TimeSeriesIdentifiersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

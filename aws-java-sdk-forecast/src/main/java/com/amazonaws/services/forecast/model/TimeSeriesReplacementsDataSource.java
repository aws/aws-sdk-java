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
 * A replacement dataset is a modified version of the baseline related time series that contains only the values that
 * you want to include in a what-if forecast. The replacement dataset must contain the forecast dimensions and item
 * identifiers in the baseline related time series as well as at least 1 changed time series. This dataset is merged
 * with the baseline related time series to create a transformed dataset that is used for the what-if forecast.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/TimeSeriesReplacementsDataSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSeriesReplacementsDataSource implements Serializable, Cloneable, StructuredPojo {

    private S3Config s3Config;

    private Schema schema;
    /**
     * <p>
     * The format of the replacement data, CSV or PARQUET.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The timestamp format of the replacement data.
     * </p>
     */
    private String timestampFormat;

    /**
     * @param s3Config
     */

    public void setS3Config(S3Config s3Config) {
        this.s3Config = s3Config;
    }

    /**
     * @return
     */

    public S3Config getS3Config() {
        return this.s3Config;
    }

    /**
     * @param s3Config
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesReplacementsDataSource withS3Config(S3Config s3Config) {
        setS3Config(s3Config);
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

    public TimeSeriesReplacementsDataSource withSchema(Schema schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The format of the replacement data, CSV or PARQUET.
     * </p>
     * 
     * @param format
     *        The format of the replacement data, CSV or PARQUET.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the replacement data, CSV or PARQUET.
     * </p>
     * 
     * @return The format of the replacement data, CSV or PARQUET.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the replacement data, CSV or PARQUET.
     * </p>
     * 
     * @param format
     *        The format of the replacement data, CSV or PARQUET.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesReplacementsDataSource withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The timestamp format of the replacement data.
     * </p>
     * 
     * @param timestampFormat
     *        The timestamp format of the replacement data.
     */

    public void setTimestampFormat(String timestampFormat) {
        this.timestampFormat = timestampFormat;
    }

    /**
     * <p>
     * The timestamp format of the replacement data.
     * </p>
     * 
     * @return The timestamp format of the replacement data.
     */

    public String getTimestampFormat() {
        return this.timestampFormat;
    }

    /**
     * <p>
     * The timestamp format of the replacement data.
     * </p>
     * 
     * @param timestampFormat
     *        The timestamp format of the replacement data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesReplacementsDataSource withTimestampFormat(String timestampFormat) {
        setTimestampFormat(timestampFormat);
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
        if (getS3Config() != null)
            sb.append("S3Config: ").append(getS3Config()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getTimestampFormat() != null)
            sb.append("TimestampFormat: ").append(getTimestampFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeSeriesReplacementsDataSource == false)
            return false;
        TimeSeriesReplacementsDataSource other = (TimeSeriesReplacementsDataSource) obj;
        if (other.getS3Config() == null ^ this.getS3Config() == null)
            return false;
        if (other.getS3Config() != null && other.getS3Config().equals(this.getS3Config()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getTimestampFormat() == null ^ this.getTimestampFormat() == null)
            return false;
        if (other.getTimestampFormat() != null && other.getTimestampFormat().equals(this.getTimestampFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Config() == null) ? 0 : getS3Config().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getTimestampFormat() == null) ? 0 : getTimestampFormat().hashCode());
        return hashCode;
    }

    @Override
    public TimeSeriesReplacementsDataSource clone() {
        try {
            return (TimeSeriesReplacementsDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.TimeSeriesReplacementsDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

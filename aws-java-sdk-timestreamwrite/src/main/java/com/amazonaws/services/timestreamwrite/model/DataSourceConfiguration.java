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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines configuration details about the data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DataSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration of an S3 location for a file which contains data to load.
     * </p>
     */
    private DataSourceS3Configuration dataSourceS3Configuration;

    private CsvConfiguration csvConfiguration;
    /**
     * <p>
     * This is currently CSV.
     * </p>
     */
    private String dataFormat;

    /**
     * <p>
     * Configuration of an S3 location for a file which contains data to load.
     * </p>
     * 
     * @param dataSourceS3Configuration
     *        Configuration of an S3 location for a file which contains data to load.
     */

    public void setDataSourceS3Configuration(DataSourceS3Configuration dataSourceS3Configuration) {
        this.dataSourceS3Configuration = dataSourceS3Configuration;
    }

    /**
     * <p>
     * Configuration of an S3 location for a file which contains data to load.
     * </p>
     * 
     * @return Configuration of an S3 location for a file which contains data to load.
     */

    public DataSourceS3Configuration getDataSourceS3Configuration() {
        return this.dataSourceS3Configuration;
    }

    /**
     * <p>
     * Configuration of an S3 location for a file which contains data to load.
     * </p>
     * 
     * @param dataSourceS3Configuration
     *        Configuration of an S3 location for a file which contains data to load.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withDataSourceS3Configuration(DataSourceS3Configuration dataSourceS3Configuration) {
        setDataSourceS3Configuration(dataSourceS3Configuration);
        return this;
    }

    /**
     * @param csvConfiguration
     */

    public void setCsvConfiguration(CsvConfiguration csvConfiguration) {
        this.csvConfiguration = csvConfiguration;
    }

    /**
     * @return
     */

    public CsvConfiguration getCsvConfiguration() {
        return this.csvConfiguration;
    }

    /**
     * @param csvConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withCsvConfiguration(CsvConfiguration csvConfiguration) {
        setCsvConfiguration(csvConfiguration);
        return this;
    }

    /**
     * <p>
     * This is currently CSV.
     * </p>
     * 
     * @param dataFormat
     *        This is currently CSV.
     * @see BatchLoadDataFormat
     */

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * This is currently CSV.
     * </p>
     * 
     * @return This is currently CSV.
     * @see BatchLoadDataFormat
     */

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * <p>
     * This is currently CSV.
     * </p>
     * 
     * @param dataFormat
     *        This is currently CSV.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchLoadDataFormat
     */

    public DataSourceConfiguration withDataFormat(String dataFormat) {
        setDataFormat(dataFormat);
        return this;
    }

    /**
     * <p>
     * This is currently CSV.
     * </p>
     * 
     * @param dataFormat
     *        This is currently CSV.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchLoadDataFormat
     */

    public DataSourceConfiguration withDataFormat(BatchLoadDataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
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
        if (getDataSourceS3Configuration() != null)
            sb.append("DataSourceS3Configuration: ").append(getDataSourceS3Configuration()).append(",");
        if (getCsvConfiguration() != null)
            sb.append("CsvConfiguration: ").append(getCsvConfiguration()).append(",");
        if (getDataFormat() != null)
            sb.append("DataFormat: ").append(getDataFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceConfiguration == false)
            return false;
        DataSourceConfiguration other = (DataSourceConfiguration) obj;
        if (other.getDataSourceS3Configuration() == null ^ this.getDataSourceS3Configuration() == null)
            return false;
        if (other.getDataSourceS3Configuration() != null && other.getDataSourceS3Configuration().equals(this.getDataSourceS3Configuration()) == false)
            return false;
        if (other.getCsvConfiguration() == null ^ this.getCsvConfiguration() == null)
            return false;
        if (other.getCsvConfiguration() != null && other.getCsvConfiguration().equals(this.getCsvConfiguration()) == false)
            return false;
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceS3Configuration() == null) ? 0 : getDataSourceS3Configuration().hashCode());
        hashCode = prime * hashCode + ((getCsvConfiguration() == null) ? 0 : getCsvConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceConfiguration clone() {
        try {
            return (DataSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.DataSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

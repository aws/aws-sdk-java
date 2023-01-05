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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the dataset format used when running a monitoring job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringDatasetFormat" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringDatasetFormat implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CSV dataset used in the monitoring job.
     * </p>
     */
    private MonitoringCsvDatasetFormat csv;
    /**
     * <p>
     * The JSON dataset used in the monitoring job
     * </p>
     */
    private MonitoringJsonDatasetFormat json;
    /**
     * <p>
     * The Parquet dataset used in the monitoring job
     * </p>
     */
    private MonitoringParquetDatasetFormat parquet;

    /**
     * <p>
     * The CSV dataset used in the monitoring job.
     * </p>
     * 
     * @param csv
     *        The CSV dataset used in the monitoring job.
     */

    public void setCsv(MonitoringCsvDatasetFormat csv) {
        this.csv = csv;
    }

    /**
     * <p>
     * The CSV dataset used in the monitoring job.
     * </p>
     * 
     * @return The CSV dataset used in the monitoring job.
     */

    public MonitoringCsvDatasetFormat getCsv() {
        return this.csv;
    }

    /**
     * <p>
     * The CSV dataset used in the monitoring job.
     * </p>
     * 
     * @param csv
     *        The CSV dataset used in the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringDatasetFormat withCsv(MonitoringCsvDatasetFormat csv) {
        setCsv(csv);
        return this;
    }

    /**
     * <p>
     * The JSON dataset used in the monitoring job
     * </p>
     * 
     * @param json
     *        The JSON dataset used in the monitoring job
     */

    public void setJson(MonitoringJsonDatasetFormat json) {
        this.json = json;
    }

    /**
     * <p>
     * The JSON dataset used in the monitoring job
     * </p>
     * 
     * @return The JSON dataset used in the monitoring job
     */

    public MonitoringJsonDatasetFormat getJson() {
        return this.json;
    }

    /**
     * <p>
     * The JSON dataset used in the monitoring job
     * </p>
     * 
     * @param json
     *        The JSON dataset used in the monitoring job
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringDatasetFormat withJson(MonitoringJsonDatasetFormat json) {
        setJson(json);
        return this;
    }

    /**
     * <p>
     * The Parquet dataset used in the monitoring job
     * </p>
     * 
     * @param parquet
     *        The Parquet dataset used in the monitoring job
     */

    public void setParquet(MonitoringParquetDatasetFormat parquet) {
        this.parquet = parquet;
    }

    /**
     * <p>
     * The Parquet dataset used in the monitoring job
     * </p>
     * 
     * @return The Parquet dataset used in the monitoring job
     */

    public MonitoringParquetDatasetFormat getParquet() {
        return this.parquet;
    }

    /**
     * <p>
     * The Parquet dataset used in the monitoring job
     * </p>
     * 
     * @param parquet
     *        The Parquet dataset used in the monitoring job
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringDatasetFormat withParquet(MonitoringParquetDatasetFormat parquet) {
        setParquet(parquet);
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
        if (getCsv() != null)
            sb.append("Csv: ").append(getCsv()).append(",");
        if (getJson() != null)
            sb.append("Json: ").append(getJson()).append(",");
        if (getParquet() != null)
            sb.append("Parquet: ").append(getParquet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringDatasetFormat == false)
            return false;
        MonitoringDatasetFormat other = (MonitoringDatasetFormat) obj;
        if (other.getCsv() == null ^ this.getCsv() == null)
            return false;
        if (other.getCsv() != null && other.getCsv().equals(this.getCsv()) == false)
            return false;
        if (other.getJson() == null ^ this.getJson() == null)
            return false;
        if (other.getJson() != null && other.getJson().equals(this.getJson()) == false)
            return false;
        if (other.getParquet() == null ^ this.getParquet() == null)
            return false;
        if (other.getParquet() != null && other.getParquet().equals(this.getParquet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCsv() == null) ? 0 : getCsv().hashCode());
        hashCode = prime * hashCode + ((getJson() == null) ? 0 : getJson().hashCode());
        hashCode = prime * hashCode + ((getParquet() == null) ? 0 : getParquet().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringDatasetFormat clone() {
        try {
            return (MonitoringDatasetFormat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringDatasetFormatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

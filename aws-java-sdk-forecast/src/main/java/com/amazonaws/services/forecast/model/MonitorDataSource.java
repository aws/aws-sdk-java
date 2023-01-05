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
 * The source of the data the monitor used during the evaluation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/MonitorDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitorDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset import job used to import the data that initiated the monitor
     * evaluation.
     * </p>
     */
    private String datasetImportJobArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast the monitor used during the evaluation.
     * </p>
     */
    private String forecastArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor resource you are monitoring.
     * </p>
     */
    private String predictorArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset import job used to import the data that initiated the monitor
     * evaluation.
     * </p>
     * 
     * @param datasetImportJobArn
     *        The Amazon Resource Name (ARN) of the dataset import job used to import the data that initiated the
     *        monitor evaluation.
     */

    public void setDatasetImportJobArn(String datasetImportJobArn) {
        this.datasetImportJobArn = datasetImportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset import job used to import the data that initiated the monitor
     * evaluation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset import job used to import the data that initiated the
     *         monitor evaluation.
     */

    public String getDatasetImportJobArn() {
        return this.datasetImportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset import job used to import the data that initiated the monitor
     * evaluation.
     * </p>
     * 
     * @param datasetImportJobArn
     *        The Amazon Resource Name (ARN) of the dataset import job used to import the data that initiated the
     *        monitor evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorDataSource withDatasetImportJobArn(String datasetImportJobArn) {
        setDatasetImportJobArn(datasetImportJobArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast the monitor used during the evaluation.
     * </p>
     * 
     * @param forecastArn
     *        The Amazon Resource Name (ARN) of the forecast the monitor used during the evaluation.
     */

    public void setForecastArn(String forecastArn) {
        this.forecastArn = forecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast the monitor used during the evaluation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the forecast the monitor used during the evaluation.
     */

    public String getForecastArn() {
        return this.forecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast the monitor used during the evaluation.
     * </p>
     * 
     * @param forecastArn
     *        The Amazon Resource Name (ARN) of the forecast the monitor used during the evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorDataSource withForecastArn(String forecastArn) {
        setForecastArn(forecastArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor resource you are monitoring.
     * </p>
     * 
     * @param predictorArn
     *        The Amazon Resource Name (ARN) of the predictor resource you are monitoring.
     */

    public void setPredictorArn(String predictorArn) {
        this.predictorArn = predictorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor resource you are monitoring.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the predictor resource you are monitoring.
     */

    public String getPredictorArn() {
        return this.predictorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor resource you are monitoring.
     * </p>
     * 
     * @param predictorArn
     *        The Amazon Resource Name (ARN) of the predictor resource you are monitoring.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorDataSource withPredictorArn(String predictorArn) {
        setPredictorArn(predictorArn);
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
        if (getDatasetImportJobArn() != null)
            sb.append("DatasetImportJobArn: ").append(getDatasetImportJobArn()).append(",");
        if (getForecastArn() != null)
            sb.append("ForecastArn: ").append(getForecastArn()).append(",");
        if (getPredictorArn() != null)
            sb.append("PredictorArn: ").append(getPredictorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitorDataSource == false)
            return false;
        MonitorDataSource other = (MonitorDataSource) obj;
        if (other.getDatasetImportJobArn() == null ^ this.getDatasetImportJobArn() == null)
            return false;
        if (other.getDatasetImportJobArn() != null && other.getDatasetImportJobArn().equals(this.getDatasetImportJobArn()) == false)
            return false;
        if (other.getForecastArn() == null ^ this.getForecastArn() == null)
            return false;
        if (other.getForecastArn() != null && other.getForecastArn().equals(this.getForecastArn()) == false)
            return false;
        if (other.getPredictorArn() == null ^ this.getPredictorArn() == null)
            return false;
        if (other.getPredictorArn() != null && other.getPredictorArn().equals(this.getPredictorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetImportJobArn() == null) ? 0 : getDatasetImportJobArn().hashCode());
        hashCode = prime * hashCode + ((getForecastArn() == null) ? 0 : getForecastArn().hashCode());
        hashCode = prime * hashCode + ((getPredictorArn() == null) ? 0 : getPredictorArn().hashCode());
        return hashCode;
    }

    @Override
    public MonitorDataSource clone() {
        try {
            return (MonitorDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.MonitorDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

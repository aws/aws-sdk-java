/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateForecastExportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateForecastExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the forecast export job.
     * </p>
     */
    private String forecastExportJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast that you want to export.
     * </p>
     */
    private String forecastArn;
    /**
     * <p>
     * The path to the Amazon S3 bucket where you want to save the forecast and an AWS Identity and Access Management
     * (IAM) role that Amazon Forecast can assume to access the bucket.
     * </p>
     */
    private DataDestination destination;

    /**
     * <p>
     * The name for the forecast export job.
     * </p>
     * 
     * @param forecastExportJobName
     *        The name for the forecast export job.
     */

    public void setForecastExportJobName(String forecastExportJobName) {
        this.forecastExportJobName = forecastExportJobName;
    }

    /**
     * <p>
     * The name for the forecast export job.
     * </p>
     * 
     * @return The name for the forecast export job.
     */

    public String getForecastExportJobName() {
        return this.forecastExportJobName;
    }

    /**
     * <p>
     * The name for the forecast export job.
     * </p>
     * 
     * @param forecastExportJobName
     *        The name for the forecast export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateForecastExportJobRequest withForecastExportJobName(String forecastExportJobName) {
        setForecastExportJobName(forecastExportJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast that you want to export.
     * </p>
     * 
     * @param forecastArn
     *        The Amazon Resource Name (ARN) of the forecast that you want to export.
     */

    public void setForecastArn(String forecastArn) {
        this.forecastArn = forecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast that you want to export.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the forecast that you want to export.
     */

    public String getForecastArn() {
        return this.forecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast that you want to export.
     * </p>
     * 
     * @param forecastArn
     *        The Amazon Resource Name (ARN) of the forecast that you want to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateForecastExportJobRequest withForecastArn(String forecastArn) {
        setForecastArn(forecastArn);
        return this;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where you want to save the forecast and an AWS Identity and Access Management
     * (IAM) role that Amazon Forecast can assume to access the bucket.
     * </p>
     * 
     * @param destination
     *        The path to the Amazon S3 bucket where you want to save the forecast and an AWS Identity and Access
     *        Management (IAM) role that Amazon Forecast can assume to access the bucket.
     */

    public void setDestination(DataDestination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where you want to save the forecast and an AWS Identity and Access Management
     * (IAM) role that Amazon Forecast can assume to access the bucket.
     * </p>
     * 
     * @return The path to the Amazon S3 bucket where you want to save the forecast and an AWS Identity and Access
     *         Management (IAM) role that Amazon Forecast can assume to access the bucket.
     */

    public DataDestination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where you want to save the forecast and an AWS Identity and Access Management
     * (IAM) role that Amazon Forecast can assume to access the bucket.
     * </p>
     * 
     * @param destination
     *        The path to the Amazon S3 bucket where you want to save the forecast and an AWS Identity and Access
     *        Management (IAM) role that Amazon Forecast can assume to access the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateForecastExportJobRequest withDestination(DataDestination destination) {
        setDestination(destination);
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
        if (getForecastExportJobName() != null)
            sb.append("ForecastExportJobName: ").append(getForecastExportJobName()).append(",");
        if (getForecastArn() != null)
            sb.append("ForecastArn: ").append(getForecastArn()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateForecastExportJobRequest == false)
            return false;
        CreateForecastExportJobRequest other = (CreateForecastExportJobRequest) obj;
        if (other.getForecastExportJobName() == null ^ this.getForecastExportJobName() == null)
            return false;
        if (other.getForecastExportJobName() != null && other.getForecastExportJobName().equals(this.getForecastExportJobName()) == false)
            return false;
        if (other.getForecastArn() == null ^ this.getForecastArn() == null)
            return false;
        if (other.getForecastArn() != null && other.getForecastArn().equals(this.getForecastArn()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForecastExportJobName() == null) ? 0 : getForecastExportJobName().hashCode());
        hashCode = prime * hashCode + ((getForecastArn() == null) ? 0 : getForecastArn().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public CreateForecastExportJobRequest clone() {
        return (CreateForecastExportJobRequest) super.clone();
    }

}

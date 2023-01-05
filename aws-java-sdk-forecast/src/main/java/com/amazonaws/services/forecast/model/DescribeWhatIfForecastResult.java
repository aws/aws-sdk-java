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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeWhatIfForecast" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWhatIfForecastResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the what-if forecast.
     * </p>
     */
    private String whatIfForecastName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if forecast.
     * </p>
     */
    private String whatIfForecastArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis that contains this forecast.
     * </p>
     */
    private String whatIfAnalysisArn;
    /**
     * <p>
     * The approximate time remaining to complete the what-if forecast, in minutes.
     * </p>
     */
    private Long estimatedTimeRemainingInMinutes;
    /**
     * <p>
     * The status of the what-if forecast. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code>, <code>CREATE_STOPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the what-if forecast must be <code>ACTIVE</code> before you can access the forecast.
     * </p>
     * </note>
     */
    private String status;
    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * When the what-if forecast was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time the resource was modified. The timestamp depends on the status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPED</code> - When the job stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date lastModificationTime;
    /**
     * <p>
     * An array of <code>Action</code> and <code>TimeSeriesConditions</code> elements that describe what transformations
     * were applied to which time series.
     * </p>
     */
    private java.util.List<TimeSeriesTransformation> timeSeriesTransformations;
    /**
     * <p>
     * An array of <code>S3Config</code>, <code>Schema</code>, and <code>Format</code> elements that describe the
     * replacement time series.
     * </p>
     */
    private TimeSeriesReplacementsDataSource timeSeriesReplacementsDataSource;
    /**
     * <p>
     * The quantiles at which probabilistic forecasts are generated. You can specify up to 5 quantiles per what-if
     * forecast in the <a>CreateWhatIfForecast</a> operation. If you didn't specify quantiles, the default values are
     * <code>["0.1", "0.5", "0.9"]</code>.
     * </p>
     */
    private java.util.List<String> forecastTypes;

    /**
     * <p>
     * The name of the what-if forecast.
     * </p>
     * 
     * @param whatIfForecastName
     *        The name of the what-if forecast.
     */

    public void setWhatIfForecastName(String whatIfForecastName) {
        this.whatIfForecastName = whatIfForecastName;
    }

    /**
     * <p>
     * The name of the what-if forecast.
     * </p>
     * 
     * @return The name of the what-if forecast.
     */

    public String getWhatIfForecastName() {
        return this.whatIfForecastName;
    }

    /**
     * <p>
     * The name of the what-if forecast.
     * </p>
     * 
     * @param whatIfForecastName
     *        The name of the what-if forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWhatIfForecastResult withWhatIfForecastName(String whatIfForecastName) {
        setWhatIfForecastName(whatIfForecastName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if forecast.
     * </p>
     * 
     * @param whatIfForecastArn
     *        The Amazon Resource Name (ARN) of the what-if forecast.
     */

    public void setWhatIfForecastArn(String whatIfForecastArn) {
        this.whatIfForecastArn = whatIfForecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if forecast.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the what-if forecast.
     */

    public String getWhatIfForecastArn() {
        return this.whatIfForecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if forecast.
     * </p>
     * 
     * @param whatIfForecastArn
     *        The Amazon Resource Name (ARN) of the what-if forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWhatIfForecastResult withWhatIfForecastArn(String whatIfForecastArn) {
        setWhatIfForecastArn(whatIfForecastArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis that contains this forecast.
     * </p>
     * 
     * @param whatIfAnalysisArn
     *        The Amazon Resource Name (ARN) of the what-if analysis that contains this forecast.
     */

    public void setWhatIfAnalysisArn(String whatIfAnalysisArn) {
        this.whatIfAnalysisArn = whatIfAnalysisArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis that contains this forecast.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the what-if analysis that contains this forecast.
     */

    public String getWhatIfAnalysisArn() {
        return this.whatIfAnalysisArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis that contains this forecast.
     * </p>
     * 
     * @param whatIfAnalysisArn
     *        The Amazon Resource Name (ARN) of the what-if analysis that contains this forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWhatIfForecastResult withWhatIfAnalysisArn(String whatIfAnalysisArn) {
        setWhatIfAnalysisArn(whatIfAnalysisArn);
        return this;
    }

    /**
     * <p>
     * The approximate time remaining to complete the what-if forecast, in minutes.
     * </p>
     * 
     * @param estimatedTimeRemainingInMinutes
     *        The approximate time remaining to complete the what-if forecast, in minutes.
     */

    public void setEstimatedTimeRemainingInMinutes(Long estimatedTimeRemainingInMinutes) {
        this.estimatedTimeRemainingInMinutes = estimatedTimeRemainingInMinutes;
    }

    /**
     * <p>
     * The approximate time remaining to complete the what-if forecast, in minutes.
     * </p>
     * 
     * @return The approximate time remaining to complete the what-if forecast, in minutes.
     */

    public Long getEstimatedTimeRemainingInMinutes() {
        return this.estimatedTimeRemainingInMinutes;
    }

    /**
     * <p>
     * The approximate time remaining to complete the what-if forecast, in minutes.
     * </p>
     * 
     * @param estimatedTimeRemainingInMinutes
     *        The approximate time remaining to complete the what-if forecast, in minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWhatIfForecastResult withEstimatedTimeRemainingInMinutes(Long estimatedTimeRemainingInMinutes) {
        setEstimatedTimeRemainingInMinutes(estimatedTimeRemainingInMinutes);
        return this;
    }

    /**
     * <p>
     * The status of the what-if forecast. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code>, <code>CREATE_STOPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the what-if forecast must be <code>ACTIVE</code> before you can access the forecast.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the what-if forecast. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_STOPPING</code>, <code>CREATE_STOPPED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>Status</code> of the what-if forecast must be <code>ACTIVE</code> before you can access the
     *        forecast.
     *        </p>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the what-if forecast. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code>, <code>CREATE_STOPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the what-if forecast must be <code>ACTIVE</code> before you can access the forecast.
     * </p>
     * </note>
     * 
     * @return The status of the what-if forecast. States include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_STOPPING</code>, <code>CREATE_STOPPED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The <code>Status</code> of the what-if forecast must be <code>ACTIVE</code> before you can access the
     *         forecast.
     *         </p>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the what-if forecast. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code>, <code>CREATE_STOPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the what-if forecast must be <code>ACTIVE</code> before you can access the forecast.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the what-if forecast. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_STOPPING</code>, <code>CREATE_STOPPED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>Status</code> of the what-if forecast must be <code>ACTIVE</code> before you can access the
     *        forecast.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWhatIfForecastResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     * 
     * @param message
     *        If an error occurred, an informational message about the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     * 
     * @return If an error occurred, an informational message about the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     * 
     * @param message
     *        If an error occurred, an informational message about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWhatIfForecastResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * When the what-if forecast was created.
     * </p>
     * 
     * @param creationTime
     *        When the what-if forecast was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the what-if forecast was created.
     * </p>
     * 
     * @return When the what-if forecast was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the what-if forecast was created.
     * </p>
     * 
     * @param creationTime
     *        When the what-if forecast was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWhatIfForecastResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the resource was modified. The timestamp depends on the status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPED</code> - When the job stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastModificationTime
     *        The last time the resource was modified. The timestamp depends on the status of the job:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_STOPPING</code> - The current timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_STOPPED</code> - When the job stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     *        </p>
     *        </li>
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The last time the resource was modified. The timestamp depends on the status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPED</code> - When the job stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The last time the resource was modified. The timestamp depends on the status of the job:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_STOPPING</code> - The current timestamp.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_STOPPED</code> - When the job stopped.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     *         </p>
     *         </li>
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The last time the resource was modified. The timestamp depends on the status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPING</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_STOPPED</code> - When the job stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastModificationTime
     *        The last time the resource was modified. The timestamp depends on the status of the job:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_STOPPING</code> - The current timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_STOPPED</code> - When the job stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWhatIfForecastResult withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
        return this;
    }

    /**
     * <p>
     * An array of <code>Action</code> and <code>TimeSeriesConditions</code> elements that describe what transformations
     * were applied to which time series.
     * </p>
     * 
     * @return An array of <code>Action</code> and <code>TimeSeriesConditions</code> elements that describe what
     *         transformations were applied to which time series.
     */

    public java.util.List<TimeSeriesTransformation> getTimeSeriesTransformations() {
        return timeSeriesTransformations;
    }

    /**
     * <p>
     * An array of <code>Action</code> and <code>TimeSeriesConditions</code> elements that describe what transformations
     * were applied to which time series.
     * </p>
     * 
     * @param timeSeriesTransformations
     *        An array of <code>Action</code> and <code>TimeSeriesConditions</code> elements that describe what
     *        transformations were applied to which time series.
     */

    public void setTimeSeriesTransformations(java.util.Collection<TimeSeriesTransformation> timeSeriesTransformations) {
        if (timeSeriesTransformations == null) {
            this.timeSeriesTransformations = null;
            return;
        }

        this.timeSeriesTransformations = new java.util.ArrayList<TimeSeriesTransformation>(timeSeriesTransformations);
    }

    /**
     * <p>
     * An array of <code>Action</code> and <code>TimeSeriesConditions</code> elements that describe what transformations
     * were applied to which time series.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimeSeriesTransformations(java.util.Collection)} or
     * {@link #withTimeSeriesTransformations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param timeSeriesTransformations
     *        An array of <code>Action</code> and <code>TimeSeriesConditions</code> elements that describe what
     *        transformations were applied to which time series.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWhatIfForecastResult withTimeSeriesTransformations(TimeSeriesTransformation... timeSeriesTransformations) {
        if (this.timeSeriesTransformations == null) {
            setTimeSeriesTransformations(new java.util.ArrayList<TimeSeriesTransformation>(timeSeriesTransformations.length));
        }
        for (TimeSeriesTransformation ele : timeSeriesTransformations) {
            this.timeSeriesTransformations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Action</code> and <code>TimeSeriesConditions</code> elements that describe what transformations
     * were applied to which time series.
     * </p>
     * 
     * @param timeSeriesTransformations
     *        An array of <code>Action</code> and <code>TimeSeriesConditions</code> elements that describe what
     *        transformations were applied to which time series.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWhatIfForecastResult withTimeSeriesTransformations(java.util.Collection<TimeSeriesTransformation> timeSeriesTransformations) {
        setTimeSeriesTransformations(timeSeriesTransformations);
        return this;
    }

    /**
     * <p>
     * An array of <code>S3Config</code>, <code>Schema</code>, and <code>Format</code> elements that describe the
     * replacement time series.
     * </p>
     * 
     * @param timeSeriesReplacementsDataSource
     *        An array of <code>S3Config</code>, <code>Schema</code>, and <code>Format</code> elements that describe the
     *        replacement time series.
     */

    public void setTimeSeriesReplacementsDataSource(TimeSeriesReplacementsDataSource timeSeriesReplacementsDataSource) {
        this.timeSeriesReplacementsDataSource = timeSeriesReplacementsDataSource;
    }

    /**
     * <p>
     * An array of <code>S3Config</code>, <code>Schema</code>, and <code>Format</code> elements that describe the
     * replacement time series.
     * </p>
     * 
     * @return An array of <code>S3Config</code>, <code>Schema</code>, and <code>Format</code> elements that describe
     *         the replacement time series.
     */

    public TimeSeriesReplacementsDataSource getTimeSeriesReplacementsDataSource() {
        return this.timeSeriesReplacementsDataSource;
    }

    /**
     * <p>
     * An array of <code>S3Config</code>, <code>Schema</code>, and <code>Format</code> elements that describe the
     * replacement time series.
     * </p>
     * 
     * @param timeSeriesReplacementsDataSource
     *        An array of <code>S3Config</code>, <code>Schema</code>, and <code>Format</code> elements that describe the
     *        replacement time series.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWhatIfForecastResult withTimeSeriesReplacementsDataSource(TimeSeriesReplacementsDataSource timeSeriesReplacementsDataSource) {
        setTimeSeriesReplacementsDataSource(timeSeriesReplacementsDataSource);
        return this;
    }

    /**
     * <p>
     * The quantiles at which probabilistic forecasts are generated. You can specify up to 5 quantiles per what-if
     * forecast in the <a>CreateWhatIfForecast</a> operation. If you didn't specify quantiles, the default values are
     * <code>["0.1", "0.5", "0.9"]</code>.
     * </p>
     * 
     * @return The quantiles at which probabilistic forecasts are generated. You can specify up to 5 quantiles per
     *         what-if forecast in the <a>CreateWhatIfForecast</a> operation. If you didn't specify quantiles, the
     *         default values are <code>["0.1", "0.5", "0.9"]</code>.
     */

    public java.util.List<String> getForecastTypes() {
        return forecastTypes;
    }

    /**
     * <p>
     * The quantiles at which probabilistic forecasts are generated. You can specify up to 5 quantiles per what-if
     * forecast in the <a>CreateWhatIfForecast</a> operation. If you didn't specify quantiles, the default values are
     * <code>["0.1", "0.5", "0.9"]</code>.
     * </p>
     * 
     * @param forecastTypes
     *        The quantiles at which probabilistic forecasts are generated. You can specify up to 5 quantiles per
     *        what-if forecast in the <a>CreateWhatIfForecast</a> operation. If you didn't specify quantiles, the
     *        default values are <code>["0.1", "0.5", "0.9"]</code>.
     */

    public void setForecastTypes(java.util.Collection<String> forecastTypes) {
        if (forecastTypes == null) {
            this.forecastTypes = null;
            return;
        }

        this.forecastTypes = new java.util.ArrayList<String>(forecastTypes);
    }

    /**
     * <p>
     * The quantiles at which probabilistic forecasts are generated. You can specify up to 5 quantiles per what-if
     * forecast in the <a>CreateWhatIfForecast</a> operation. If you didn't specify quantiles, the default values are
     * <code>["0.1", "0.5", "0.9"]</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForecastTypes(java.util.Collection)} or {@link #withForecastTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param forecastTypes
     *        The quantiles at which probabilistic forecasts are generated. You can specify up to 5 quantiles per
     *        what-if forecast in the <a>CreateWhatIfForecast</a> operation. If you didn't specify quantiles, the
     *        default values are <code>["0.1", "0.5", "0.9"]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWhatIfForecastResult withForecastTypes(String... forecastTypes) {
        if (this.forecastTypes == null) {
            setForecastTypes(new java.util.ArrayList<String>(forecastTypes.length));
        }
        for (String ele : forecastTypes) {
            this.forecastTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The quantiles at which probabilistic forecasts are generated. You can specify up to 5 quantiles per what-if
     * forecast in the <a>CreateWhatIfForecast</a> operation. If you didn't specify quantiles, the default values are
     * <code>["0.1", "0.5", "0.9"]</code>.
     * </p>
     * 
     * @param forecastTypes
     *        The quantiles at which probabilistic forecasts are generated. You can specify up to 5 quantiles per
     *        what-if forecast in the <a>CreateWhatIfForecast</a> operation. If you didn't specify quantiles, the
     *        default values are <code>["0.1", "0.5", "0.9"]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWhatIfForecastResult withForecastTypes(java.util.Collection<String> forecastTypes) {
        setForecastTypes(forecastTypes);
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
        if (getWhatIfForecastName() != null)
            sb.append("WhatIfForecastName: ").append(getWhatIfForecastName()).append(",");
        if (getWhatIfForecastArn() != null)
            sb.append("WhatIfForecastArn: ").append(getWhatIfForecastArn()).append(",");
        if (getWhatIfAnalysisArn() != null)
            sb.append("WhatIfAnalysisArn: ").append(getWhatIfAnalysisArn()).append(",");
        if (getEstimatedTimeRemainingInMinutes() != null)
            sb.append("EstimatedTimeRemainingInMinutes: ").append(getEstimatedTimeRemainingInMinutes()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime()).append(",");
        if (getTimeSeriesTransformations() != null)
            sb.append("TimeSeriesTransformations: ").append(getTimeSeriesTransformations()).append(",");
        if (getTimeSeriesReplacementsDataSource() != null)
            sb.append("TimeSeriesReplacementsDataSource: ").append(getTimeSeriesReplacementsDataSource()).append(",");
        if (getForecastTypes() != null)
            sb.append("ForecastTypes: ").append(getForecastTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWhatIfForecastResult == false)
            return false;
        DescribeWhatIfForecastResult other = (DescribeWhatIfForecastResult) obj;
        if (other.getWhatIfForecastName() == null ^ this.getWhatIfForecastName() == null)
            return false;
        if (other.getWhatIfForecastName() != null && other.getWhatIfForecastName().equals(this.getWhatIfForecastName()) == false)
            return false;
        if (other.getWhatIfForecastArn() == null ^ this.getWhatIfForecastArn() == null)
            return false;
        if (other.getWhatIfForecastArn() != null && other.getWhatIfForecastArn().equals(this.getWhatIfForecastArn()) == false)
            return false;
        if (other.getWhatIfAnalysisArn() == null ^ this.getWhatIfAnalysisArn() == null)
            return false;
        if (other.getWhatIfAnalysisArn() != null && other.getWhatIfAnalysisArn().equals(this.getWhatIfAnalysisArn()) == false)
            return false;
        if (other.getEstimatedTimeRemainingInMinutes() == null ^ this.getEstimatedTimeRemainingInMinutes() == null)
            return false;
        if (other.getEstimatedTimeRemainingInMinutes() != null
                && other.getEstimatedTimeRemainingInMinutes().equals(this.getEstimatedTimeRemainingInMinutes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        if (other.getTimeSeriesTransformations() == null ^ this.getTimeSeriesTransformations() == null)
            return false;
        if (other.getTimeSeriesTransformations() != null && other.getTimeSeriesTransformations().equals(this.getTimeSeriesTransformations()) == false)
            return false;
        if (other.getTimeSeriesReplacementsDataSource() == null ^ this.getTimeSeriesReplacementsDataSource() == null)
            return false;
        if (other.getTimeSeriesReplacementsDataSource() != null
                && other.getTimeSeriesReplacementsDataSource().equals(this.getTimeSeriesReplacementsDataSource()) == false)
            return false;
        if (other.getForecastTypes() == null ^ this.getForecastTypes() == null)
            return false;
        if (other.getForecastTypes() != null && other.getForecastTypes().equals(this.getForecastTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWhatIfForecastName() == null) ? 0 : getWhatIfForecastName().hashCode());
        hashCode = prime * hashCode + ((getWhatIfForecastArn() == null) ? 0 : getWhatIfForecastArn().hashCode());
        hashCode = prime * hashCode + ((getWhatIfAnalysisArn() == null) ? 0 : getWhatIfAnalysisArn().hashCode());
        hashCode = prime * hashCode + ((getEstimatedTimeRemainingInMinutes() == null) ? 0 : getEstimatedTimeRemainingInMinutes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        hashCode = prime * hashCode + ((getTimeSeriesTransformations() == null) ? 0 : getTimeSeriesTransformations().hashCode());
        hashCode = prime * hashCode + ((getTimeSeriesReplacementsDataSource() == null) ? 0 : getTimeSeriesReplacementsDataSource().hashCode());
        hashCode = prime * hashCode + ((getForecastTypes() == null) ? 0 : getForecastTypes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWhatIfForecastResult clone() {
        try {
            return (DescribeWhatIfForecastResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

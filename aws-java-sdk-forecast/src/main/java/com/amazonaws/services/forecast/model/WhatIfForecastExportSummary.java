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
 * Provides a summary of the what-if forecast export properties used in the <a>ListWhatIfForecastExports</a> operation.
 * To get the complete set of properties, call the <a>DescribeWhatIfForecastExport</a> operation, and provide the
 * <code>WhatIfForecastExportArn</code> that is listed in the summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/WhatIfForecastExportSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WhatIfForecastExportSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if forecast export.
     * </p>
     */
    private String whatIfForecastExportArn;
    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) that define the what-if forecasts included in the export.
     * </p>
     */
    private java.util.List<String> whatIfForecastArns;
    /**
     * <p>
     * The what-if forecast export name.
     * </p>
     */
    private String whatIfForecastExportName;
    /**
     * <p>
     * The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
     * </p>
     */
    private DataDestination destination;
    /**
     * <p>
     * The status of the what-if forecast export. States include:
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
     * The <code>Status</code> of the what-if analysis must be <code>ACTIVE</code> before you can access the analysis.
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
     * When the what-if forecast export was created.
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
     * The Amazon Resource Name (ARN) of the what-if forecast export.
     * </p>
     * 
     * @param whatIfForecastExportArn
     *        The Amazon Resource Name (ARN) of the what-if forecast export.
     */

    public void setWhatIfForecastExportArn(String whatIfForecastExportArn) {
        this.whatIfForecastExportArn = whatIfForecastExportArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if forecast export.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the what-if forecast export.
     */

    public String getWhatIfForecastExportArn() {
        return this.whatIfForecastExportArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if forecast export.
     * </p>
     * 
     * @param whatIfForecastExportArn
     *        The Amazon Resource Name (ARN) of the what-if forecast export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WhatIfForecastExportSummary withWhatIfForecastExportArn(String whatIfForecastExportArn) {
        setWhatIfForecastExportArn(whatIfForecastExportArn);
        return this;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) that define the what-if forecasts included in the export.
     * </p>
     * 
     * @return An array of Amazon Resource Names (ARNs) that define the what-if forecasts included in the export.
     */

    public java.util.List<String> getWhatIfForecastArns() {
        return whatIfForecastArns;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) that define the what-if forecasts included in the export.
     * </p>
     * 
     * @param whatIfForecastArns
     *        An array of Amazon Resource Names (ARNs) that define the what-if forecasts included in the export.
     */

    public void setWhatIfForecastArns(java.util.Collection<String> whatIfForecastArns) {
        if (whatIfForecastArns == null) {
            this.whatIfForecastArns = null;
            return;
        }

        this.whatIfForecastArns = new java.util.ArrayList<String>(whatIfForecastArns);
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) that define the what-if forecasts included in the export.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWhatIfForecastArns(java.util.Collection)} or {@link #withWhatIfForecastArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param whatIfForecastArns
     *        An array of Amazon Resource Names (ARNs) that define the what-if forecasts included in the export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WhatIfForecastExportSummary withWhatIfForecastArns(String... whatIfForecastArns) {
        if (this.whatIfForecastArns == null) {
            setWhatIfForecastArns(new java.util.ArrayList<String>(whatIfForecastArns.length));
        }
        for (String ele : whatIfForecastArns) {
            this.whatIfForecastArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) that define the what-if forecasts included in the export.
     * </p>
     * 
     * @param whatIfForecastArns
     *        An array of Amazon Resource Names (ARNs) that define the what-if forecasts included in the export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WhatIfForecastExportSummary withWhatIfForecastArns(java.util.Collection<String> whatIfForecastArns) {
        setWhatIfForecastArns(whatIfForecastArns);
        return this;
    }

    /**
     * <p>
     * The what-if forecast export name.
     * </p>
     * 
     * @param whatIfForecastExportName
     *        The what-if forecast export name.
     */

    public void setWhatIfForecastExportName(String whatIfForecastExportName) {
        this.whatIfForecastExportName = whatIfForecastExportName;
    }

    /**
     * <p>
     * The what-if forecast export name.
     * </p>
     * 
     * @return The what-if forecast export name.
     */

    public String getWhatIfForecastExportName() {
        return this.whatIfForecastExportName;
    }

    /**
     * <p>
     * The what-if forecast export name.
     * </p>
     * 
     * @param whatIfForecastExportName
     *        The what-if forecast export name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WhatIfForecastExportSummary withWhatIfForecastExportName(String whatIfForecastExportName) {
        setWhatIfForecastExportName(whatIfForecastExportName);
        return this;
    }

    /**
     * <p>
     * The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
     * </p>
     * 
     * @param destination
     *        The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
     */

    public void setDestination(DataDestination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
     * </p>
     * 
     * @return The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
     */

    public DataDestination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
     * </p>
     * 
     * @param destination
     *        The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WhatIfForecastExportSummary withDestination(DataDestination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The status of the what-if forecast export. States include:
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
     * The <code>Status</code> of the what-if analysis must be <code>ACTIVE</code> before you can access the analysis.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the what-if forecast export. States include:</p>
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
     *        The <code>Status</code> of the what-if analysis must be <code>ACTIVE</code> before you can access the
     *        analysis.
     *        </p>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the what-if forecast export. States include:
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
     * The <code>Status</code> of the what-if analysis must be <code>ACTIVE</code> before you can access the analysis.
     * </p>
     * </note>
     * 
     * @return The status of the what-if forecast export. States include:</p>
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
     *         The <code>Status</code> of the what-if analysis must be <code>ACTIVE</code> before you can access the
     *         analysis.
     *         </p>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the what-if forecast export. States include:
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
     * The <code>Status</code> of the what-if analysis must be <code>ACTIVE</code> before you can access the analysis.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the what-if forecast export. States include:</p>
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
     *        The <code>Status</code> of the what-if analysis must be <code>ACTIVE</code> before you can access the
     *        analysis.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WhatIfForecastExportSummary withStatus(String status) {
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

    public WhatIfForecastExportSummary withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * When the what-if forecast export was created.
     * </p>
     * 
     * @param creationTime
     *        When the what-if forecast export was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the what-if forecast export was created.
     * </p>
     * 
     * @return When the what-if forecast export was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the what-if forecast export was created.
     * </p>
     * 
     * @param creationTime
     *        When the what-if forecast export was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WhatIfForecastExportSummary withCreationTime(java.util.Date creationTime) {
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

    public WhatIfForecastExportSummary withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
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
        if (getWhatIfForecastExportArn() != null)
            sb.append("WhatIfForecastExportArn: ").append(getWhatIfForecastExportArn()).append(",");
        if (getWhatIfForecastArns() != null)
            sb.append("WhatIfForecastArns: ").append(getWhatIfForecastArns()).append(",");
        if (getWhatIfForecastExportName() != null)
            sb.append("WhatIfForecastExportName: ").append(getWhatIfForecastExportName()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WhatIfForecastExportSummary == false)
            return false;
        WhatIfForecastExportSummary other = (WhatIfForecastExportSummary) obj;
        if (other.getWhatIfForecastExportArn() == null ^ this.getWhatIfForecastExportArn() == null)
            return false;
        if (other.getWhatIfForecastExportArn() != null && other.getWhatIfForecastExportArn().equals(this.getWhatIfForecastExportArn()) == false)
            return false;
        if (other.getWhatIfForecastArns() == null ^ this.getWhatIfForecastArns() == null)
            return false;
        if (other.getWhatIfForecastArns() != null && other.getWhatIfForecastArns().equals(this.getWhatIfForecastArns()) == false)
            return false;
        if (other.getWhatIfForecastExportName() == null ^ this.getWhatIfForecastExportName() == null)
            return false;
        if (other.getWhatIfForecastExportName() != null && other.getWhatIfForecastExportName().equals(this.getWhatIfForecastExportName()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWhatIfForecastExportArn() == null) ? 0 : getWhatIfForecastExportArn().hashCode());
        hashCode = prime * hashCode + ((getWhatIfForecastArns() == null) ? 0 : getWhatIfForecastArns().hashCode());
        hashCode = prime * hashCode + ((getWhatIfForecastExportName() == null) ? 0 : getWhatIfForecastExportName().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public WhatIfForecastExportSummary clone() {
        try {
            return (WhatIfForecastExportSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.WhatIfForecastExportSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

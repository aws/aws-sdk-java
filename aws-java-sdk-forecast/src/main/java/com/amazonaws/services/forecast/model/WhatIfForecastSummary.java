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
 * Provides a summary of the what-if forecast properties used in the <a>ListWhatIfForecasts</a> operation. To get the
 * complete set of properties, call the <a>DescribeWhatIfForecast</a> operation, and provide the
 * <code>WhatIfForecastArn</code> that is listed in the summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/WhatIfForecastSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WhatIfForecastSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if forecast.
     * </p>
     */
    private String whatIfForecastArn;
    /**
     * <p>
     * The name of the what-if forecast.
     * </p>
     */
    private String whatIfForecastName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis that contains this what-if forecast.
     * </p>
     */
    private String whatIfAnalysisArn;
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

    public WhatIfForecastSummary withWhatIfForecastArn(String whatIfForecastArn) {
        setWhatIfForecastArn(whatIfForecastArn);
        return this;
    }

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

    public WhatIfForecastSummary withWhatIfForecastName(String whatIfForecastName) {
        setWhatIfForecastName(whatIfForecastName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis that contains this what-if forecast.
     * </p>
     * 
     * @param whatIfAnalysisArn
     *        The Amazon Resource Name (ARN) of the what-if analysis that contains this what-if forecast.
     */

    public void setWhatIfAnalysisArn(String whatIfAnalysisArn) {
        this.whatIfAnalysisArn = whatIfAnalysisArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis that contains this what-if forecast.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the what-if analysis that contains this what-if forecast.
     */

    public String getWhatIfAnalysisArn() {
        return this.whatIfAnalysisArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis that contains this what-if forecast.
     * </p>
     * 
     * @param whatIfAnalysisArn
     *        The Amazon Resource Name (ARN) of the what-if analysis that contains this what-if forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WhatIfForecastSummary withWhatIfAnalysisArn(String whatIfAnalysisArn) {
        setWhatIfAnalysisArn(whatIfAnalysisArn);
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
     * The <code>Status</code> of the what-if analysis must be <code>ACTIVE</code> before you can access the analysis.
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
     *        The <code>Status</code> of the what-if analysis must be <code>ACTIVE</code> before you can access the
     *        analysis.
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
     * The <code>Status</code> of the what-if analysis must be <code>ACTIVE</code> before you can access the analysis.
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
     *         The <code>Status</code> of the what-if analysis must be <code>ACTIVE</code> before you can access the
     *         analysis.
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
     * The <code>Status</code> of the what-if analysis must be <code>ACTIVE</code> before you can access the analysis.
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
     *        The <code>Status</code> of the what-if analysis must be <code>ACTIVE</code> before you can access the
     *        analysis.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WhatIfForecastSummary withStatus(String status) {
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

    public WhatIfForecastSummary withMessage(String message) {
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

    public WhatIfForecastSummary withCreationTime(java.util.Date creationTime) {
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

    public WhatIfForecastSummary withLastModificationTime(java.util.Date lastModificationTime) {
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
        if (getWhatIfForecastArn() != null)
            sb.append("WhatIfForecastArn: ").append(getWhatIfForecastArn()).append(",");
        if (getWhatIfForecastName() != null)
            sb.append("WhatIfForecastName: ").append(getWhatIfForecastName()).append(",");
        if (getWhatIfAnalysisArn() != null)
            sb.append("WhatIfAnalysisArn: ").append(getWhatIfAnalysisArn()).append(",");
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

        if (obj instanceof WhatIfForecastSummary == false)
            return false;
        WhatIfForecastSummary other = (WhatIfForecastSummary) obj;
        if (other.getWhatIfForecastArn() == null ^ this.getWhatIfForecastArn() == null)
            return false;
        if (other.getWhatIfForecastArn() != null && other.getWhatIfForecastArn().equals(this.getWhatIfForecastArn()) == false)
            return false;
        if (other.getWhatIfForecastName() == null ^ this.getWhatIfForecastName() == null)
            return false;
        if (other.getWhatIfForecastName() != null && other.getWhatIfForecastName().equals(this.getWhatIfForecastName()) == false)
            return false;
        if (other.getWhatIfAnalysisArn() == null ^ this.getWhatIfAnalysisArn() == null)
            return false;
        if (other.getWhatIfAnalysisArn() != null && other.getWhatIfAnalysisArn().equals(this.getWhatIfAnalysisArn()) == false)
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

        hashCode = prime * hashCode + ((getWhatIfForecastArn() == null) ? 0 : getWhatIfForecastArn().hashCode());
        hashCode = prime * hashCode + ((getWhatIfForecastName() == null) ? 0 : getWhatIfForecastName().hashCode());
        hashCode = prime * hashCode + ((getWhatIfAnalysisArn() == null) ? 0 : getWhatIfAnalysisArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public WhatIfForecastSummary clone() {
        try {
            return (WhatIfForecastSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.WhatIfForecastSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

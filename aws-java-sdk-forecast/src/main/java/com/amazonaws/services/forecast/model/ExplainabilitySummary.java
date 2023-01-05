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
 * Provides a summary of the Explainability properties used in the <a>ListExplainabilities</a> operation. To get a
 * complete set of properties, call the <a>DescribeExplainability</a> operation, and provide the listed
 * <code>ExplainabilityArn</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ExplainabilitySummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExplainabilitySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Explainability.
     * </p>
     */
    private String explainabilityArn;
    /**
     * <p>
     * The name of the Explainability.
     * </p>
     */
    private String explainabilityName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The configuration settings that define the granularity of time series and time points for the Explainability.
     * </p>
     */
    private ExplainabilityConfig explainabilityConfig;
    /**
     * <p>
     * The status of the Explainability. States include:
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
     */
    private String status;
    /**
     * <p>
     * Information about any errors that may have occurred during the Explainability creation process.
     * </p>
     */
    private String message;
    /**
     * <p>
     * When the Explainability was created.
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
     * The Amazon Resource Name (ARN) of the Explainability.
     * </p>
     * 
     * @param explainabilityArn
     *        The Amazon Resource Name (ARN) of the Explainability.
     */

    public void setExplainabilityArn(String explainabilityArn) {
        this.explainabilityArn = explainabilityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Explainability.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Explainability.
     */

    public String getExplainabilityArn() {
        return this.explainabilityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Explainability.
     * </p>
     * 
     * @param explainabilityArn
     *        The Amazon Resource Name (ARN) of the Explainability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExplainabilitySummary withExplainabilityArn(String explainabilityArn) {
        setExplainabilityArn(explainabilityArn);
        return this;
    }

    /**
     * <p>
     * The name of the Explainability.
     * </p>
     * 
     * @param explainabilityName
     *        The name of the Explainability.
     */

    public void setExplainabilityName(String explainabilityName) {
        this.explainabilityName = explainabilityName;
    }

    /**
     * <p>
     * The name of the Explainability.
     * </p>
     * 
     * @return The name of the Explainability.
     */

    public String getExplainabilityName() {
        return this.explainabilityName;
    }

    /**
     * <p>
     * The name of the Explainability.
     * </p>
     * 
     * @param explainabilityName
     *        The name of the Explainability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExplainabilitySummary withExplainabilityName(String explainabilityName) {
        setExplainabilityName(explainabilityName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExplainabilitySummary withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The configuration settings that define the granularity of time series and time points for the Explainability.
     * </p>
     * 
     * @param explainabilityConfig
     *        The configuration settings that define the granularity of time series and time points for the
     *        Explainability.
     */

    public void setExplainabilityConfig(ExplainabilityConfig explainabilityConfig) {
        this.explainabilityConfig = explainabilityConfig;
    }

    /**
     * <p>
     * The configuration settings that define the granularity of time series and time points for the Explainability.
     * </p>
     * 
     * @return The configuration settings that define the granularity of time series and time points for the
     *         Explainability.
     */

    public ExplainabilityConfig getExplainabilityConfig() {
        return this.explainabilityConfig;
    }

    /**
     * <p>
     * The configuration settings that define the granularity of time series and time points for the Explainability.
     * </p>
     * 
     * @param explainabilityConfig
     *        The configuration settings that define the granularity of time series and time points for the
     *        Explainability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExplainabilitySummary withExplainabilityConfig(ExplainabilityConfig explainabilityConfig) {
        setExplainabilityConfig(explainabilityConfig);
        return this;
    }

    /**
     * <p>
     * The status of the Explainability. States include:
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
     * 
     * @param status
     *        The status of the Explainability. States include: </p>
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
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Explainability. States include:
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
     * 
     * @return The status of the Explainability. States include: </p>
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
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Explainability. States include:
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
     * 
     * @param status
     *        The status of the Explainability. States include: </p>
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExplainabilitySummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Information about any errors that may have occurred during the Explainability creation process.
     * </p>
     * 
     * @param message
     *        Information about any errors that may have occurred during the Explainability creation process.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Information about any errors that may have occurred during the Explainability creation process.
     * </p>
     * 
     * @return Information about any errors that may have occurred during the Explainability creation process.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Information about any errors that may have occurred during the Explainability creation process.
     * </p>
     * 
     * @param message
     *        Information about any errors that may have occurred during the Explainability creation process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExplainabilitySummary withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * When the Explainability was created.
     * </p>
     * 
     * @param creationTime
     *        When the Explainability was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the Explainability was created.
     * </p>
     * 
     * @return When the Explainability was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the Explainability was created.
     * </p>
     * 
     * @param creationTime
     *        When the Explainability was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExplainabilitySummary withCreationTime(java.util.Date creationTime) {
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

    public ExplainabilitySummary withLastModificationTime(java.util.Date lastModificationTime) {
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
        if (getExplainabilityArn() != null)
            sb.append("ExplainabilityArn: ").append(getExplainabilityArn()).append(",");
        if (getExplainabilityName() != null)
            sb.append("ExplainabilityName: ").append(getExplainabilityName()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getExplainabilityConfig() != null)
            sb.append("ExplainabilityConfig: ").append(getExplainabilityConfig()).append(",");
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

        if (obj instanceof ExplainabilitySummary == false)
            return false;
        ExplainabilitySummary other = (ExplainabilitySummary) obj;
        if (other.getExplainabilityArn() == null ^ this.getExplainabilityArn() == null)
            return false;
        if (other.getExplainabilityArn() != null && other.getExplainabilityArn().equals(this.getExplainabilityArn()) == false)
            return false;
        if (other.getExplainabilityName() == null ^ this.getExplainabilityName() == null)
            return false;
        if (other.getExplainabilityName() != null && other.getExplainabilityName().equals(this.getExplainabilityName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getExplainabilityConfig() == null ^ this.getExplainabilityConfig() == null)
            return false;
        if (other.getExplainabilityConfig() != null && other.getExplainabilityConfig().equals(this.getExplainabilityConfig()) == false)
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

        hashCode = prime * hashCode + ((getExplainabilityArn() == null) ? 0 : getExplainabilityArn().hashCode());
        hashCode = prime * hashCode + ((getExplainabilityName() == null) ? 0 : getExplainabilityName().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getExplainabilityConfig() == null) ? 0 : getExplainabilityConfig().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public ExplainabilitySummary clone() {
        try {
            return (ExplainabilitySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.ExplainabilitySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeExplainabilityExport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExplainabilityExportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Explainability export.
     * </p>
     */
    private String explainabilityExportArn;
    /**
     * <p>
     * The name of the Explainability export.
     * </p>
     */
    private String explainabilityExportName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Explainability export.
     * </p>
     */
    private String explainabilityArn;

    private DataDestination destination;
    /**
     * <p>
     * Information about any errors that occurred during the export.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The status of the Explainability export. States include:
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
     * When the Explainability export was created.
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
     * The format of the exported data, CSV or PARQUET.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Explainability export.
     * </p>
     * 
     * @param explainabilityExportArn
     *        The Amazon Resource Name (ARN) of the Explainability export.
     */

    public void setExplainabilityExportArn(String explainabilityExportArn) {
        this.explainabilityExportArn = explainabilityExportArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Explainability export.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Explainability export.
     */

    public String getExplainabilityExportArn() {
        return this.explainabilityExportArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Explainability export.
     * </p>
     * 
     * @param explainabilityExportArn
     *        The Amazon Resource Name (ARN) of the Explainability export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExplainabilityExportResult withExplainabilityExportArn(String explainabilityExportArn) {
        setExplainabilityExportArn(explainabilityExportArn);
        return this;
    }

    /**
     * <p>
     * The name of the Explainability export.
     * </p>
     * 
     * @param explainabilityExportName
     *        The name of the Explainability export.
     */

    public void setExplainabilityExportName(String explainabilityExportName) {
        this.explainabilityExportName = explainabilityExportName;
    }

    /**
     * <p>
     * The name of the Explainability export.
     * </p>
     * 
     * @return The name of the Explainability export.
     */

    public String getExplainabilityExportName() {
        return this.explainabilityExportName;
    }

    /**
     * <p>
     * The name of the Explainability export.
     * </p>
     * 
     * @param explainabilityExportName
     *        The name of the Explainability export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExplainabilityExportResult withExplainabilityExportName(String explainabilityExportName) {
        setExplainabilityExportName(explainabilityExportName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Explainability export.
     * </p>
     * 
     * @param explainabilityArn
     *        The Amazon Resource Name (ARN) of the Explainability export.
     */

    public void setExplainabilityArn(String explainabilityArn) {
        this.explainabilityArn = explainabilityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Explainability export.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Explainability export.
     */

    public String getExplainabilityArn() {
        return this.explainabilityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Explainability export.
     * </p>
     * 
     * @param explainabilityArn
     *        The Amazon Resource Name (ARN) of the Explainability export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExplainabilityExportResult withExplainabilityArn(String explainabilityArn) {
        setExplainabilityArn(explainabilityArn);
        return this;
    }

    /**
     * @param destination
     */

    public void setDestination(DataDestination destination) {
        this.destination = destination;
    }

    /**
     * @return
     */

    public DataDestination getDestination() {
        return this.destination;
    }

    /**
     * @param destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExplainabilityExportResult withDestination(DataDestination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * Information about any errors that occurred during the export.
     * </p>
     * 
     * @param message
     *        Information about any errors that occurred during the export.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Information about any errors that occurred during the export.
     * </p>
     * 
     * @return Information about any errors that occurred during the export.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Information about any errors that occurred during the export.
     * </p>
     * 
     * @param message
     *        Information about any errors that occurred during the export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExplainabilityExportResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The status of the Explainability export. States include:
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
     *        The status of the Explainability export. States include: </p>
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
     * The status of the Explainability export. States include:
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
     * @return The status of the Explainability export. States include: </p>
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
     * The status of the Explainability export. States include:
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
     *        The status of the Explainability export. States include: </p>
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

    public DescribeExplainabilityExportResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * When the Explainability export was created.
     * </p>
     * 
     * @param creationTime
     *        When the Explainability export was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the Explainability export was created.
     * </p>
     * 
     * @return When the Explainability export was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the Explainability export was created.
     * </p>
     * 
     * @param creationTime
     *        When the Explainability export was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExplainabilityExportResult withCreationTime(java.util.Date creationTime) {
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

    public DescribeExplainabilityExportResult withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
        return this;
    }

    /**
     * <p>
     * The format of the exported data, CSV or PARQUET.
     * </p>
     * 
     * @param format
     *        The format of the exported data, CSV or PARQUET.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the exported data, CSV or PARQUET.
     * </p>
     * 
     * @return The format of the exported data, CSV or PARQUET.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the exported data, CSV or PARQUET.
     * </p>
     * 
     * @param format
     *        The format of the exported data, CSV or PARQUET.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExplainabilityExportResult withFormat(String format) {
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
        if (getExplainabilityExportArn() != null)
            sb.append("ExplainabilityExportArn: ").append(getExplainabilityExportArn()).append(",");
        if (getExplainabilityExportName() != null)
            sb.append("ExplainabilityExportName: ").append(getExplainabilityExportName()).append(",");
        if (getExplainabilityArn() != null)
            sb.append("ExplainabilityArn: ").append(getExplainabilityArn()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime()).append(",");
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

        if (obj instanceof DescribeExplainabilityExportResult == false)
            return false;
        DescribeExplainabilityExportResult other = (DescribeExplainabilityExportResult) obj;
        if (other.getExplainabilityExportArn() == null ^ this.getExplainabilityExportArn() == null)
            return false;
        if (other.getExplainabilityExportArn() != null && other.getExplainabilityExportArn().equals(this.getExplainabilityExportArn()) == false)
            return false;
        if (other.getExplainabilityExportName() == null ^ this.getExplainabilityExportName() == null)
            return false;
        if (other.getExplainabilityExportName() != null && other.getExplainabilityExportName().equals(this.getExplainabilityExportName()) == false)
            return false;
        if (other.getExplainabilityArn() == null ^ this.getExplainabilityArn() == null)
            return false;
        if (other.getExplainabilityArn() != null && other.getExplainabilityArn().equals(this.getExplainabilityArn()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
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

        hashCode = prime * hashCode + ((getExplainabilityExportArn() == null) ? 0 : getExplainabilityExportArn().hashCode());
        hashCode = prime * hashCode + ((getExplainabilityExportName() == null) ? 0 : getExplainabilityExportName().hashCode());
        hashCode = prime * hashCode + ((getExplainabilityArn() == null) ? 0 : getExplainabilityArn().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExplainabilityExportResult clone() {
        try {
            return (DescribeExplainabilityExportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

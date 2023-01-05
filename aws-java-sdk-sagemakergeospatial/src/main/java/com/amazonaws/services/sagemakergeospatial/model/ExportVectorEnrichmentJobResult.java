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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ExportVectorEnrichmentJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportVectorEnrichmentJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Vector Enrichment job being exported.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role with permission to upload to the location in OutputConfig.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The status of the results the Vector Enrichment job being exported.
     * </p>
     */
    private String exportStatus;
    /**
     * <p>
     * Output location information for exporting Vector Enrichment Job results.
     * </p>
     */
    private ExportVectorEnrichmentJobOutputConfig outputConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Vector Enrichment job being exported.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Vector Enrichment job being exported.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Vector Enrichment job being exported.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Vector Enrichment job being exported.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Vector Enrichment job being exported.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Vector Enrichment job being exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportVectorEnrichmentJobResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @return The creation time.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportVectorEnrichmentJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role with permission to upload to the location in OutputConfig.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role with permission to upload to the location in OutputConfig.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role with permission to upload to the location in OutputConfig.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role with permission to upload to the location in OutputConfig.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role with permission to upload to the location in OutputConfig.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role with permission to upload to the location in OutputConfig.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportVectorEnrichmentJobResult withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The status of the results the Vector Enrichment job being exported.
     * </p>
     * 
     * @param exportStatus
     *        The status of the results the Vector Enrichment job being exported.
     * @see VectorEnrichmentJobExportStatus
     */

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    /**
     * <p>
     * The status of the results the Vector Enrichment job being exported.
     * </p>
     * 
     * @return The status of the results the Vector Enrichment job being exported.
     * @see VectorEnrichmentJobExportStatus
     */

    public String getExportStatus() {
        return this.exportStatus;
    }

    /**
     * <p>
     * The status of the results the Vector Enrichment job being exported.
     * </p>
     * 
     * @param exportStatus
     *        The status of the results the Vector Enrichment job being exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VectorEnrichmentJobExportStatus
     */

    public ExportVectorEnrichmentJobResult withExportStatus(String exportStatus) {
        setExportStatus(exportStatus);
        return this;
    }

    /**
     * <p>
     * The status of the results the Vector Enrichment job being exported.
     * </p>
     * 
     * @param exportStatus
     *        The status of the results the Vector Enrichment job being exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VectorEnrichmentJobExportStatus
     */

    public ExportVectorEnrichmentJobResult withExportStatus(VectorEnrichmentJobExportStatus exportStatus) {
        this.exportStatus = exportStatus.toString();
        return this;
    }

    /**
     * <p>
     * Output location information for exporting Vector Enrichment Job results.
     * </p>
     * 
     * @param outputConfig
     *        Output location information for exporting Vector Enrichment Job results.
     */

    public void setOutputConfig(ExportVectorEnrichmentJobOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Output location information for exporting Vector Enrichment Job results.
     * </p>
     * 
     * @return Output location information for exporting Vector Enrichment Job results.
     */

    public ExportVectorEnrichmentJobOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * Output location information for exporting Vector Enrichment Job results.
     * </p>
     * 
     * @param outputConfig
     *        Output location information for exporting Vector Enrichment Job results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportVectorEnrichmentJobResult withOutputConfig(ExportVectorEnrichmentJobOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getExportStatus() != null)
            sb.append("ExportStatus: ").append(getExportStatus()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportVectorEnrichmentJobResult == false)
            return false;
        ExportVectorEnrichmentJobResult other = (ExportVectorEnrichmentJobResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getExportStatus() == null ^ this.getExportStatus() == null)
            return false;
        if (other.getExportStatus() != null && other.getExportStatus().equals(this.getExportStatus()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExportStatus() == null) ? 0 : getExportStatus().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        return hashCode;
    }

    @Override
    public ExportVectorEnrichmentJobResult clone() {
        try {
            return (ExportVectorEnrichmentJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

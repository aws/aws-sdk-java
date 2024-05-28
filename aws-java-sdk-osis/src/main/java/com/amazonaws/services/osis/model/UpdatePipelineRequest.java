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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/UpdatePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline to update.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     */
    private Integer minUnits;
    /**
     * <p>
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs)
     * </p>
     */
    private Integer maxUnits;
    /**
     * <p>
     * The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or within a
     * .yaml file. If you provide the configuration as a string, each new line must be escaped with <code>\n</code>.
     * </p>
     */
    private String pipelineConfigurationBody;
    /**
     * <p>
     * Key-value pairs to configure log publishing.
     * </p>
     */
    private LogPublishingOptions logPublishingOptions;
    /**
     * <p>
     * Key-value pairs to configure persistent buffering for the pipeline.
     * </p>
     */
    private BufferOptions bufferOptions;
    /**
     * <p>
     * Key-value pairs to configure encryption for data that is written to a persistent buffer.
     * </p>
     */
    private EncryptionAtRestOptions encryptionAtRestOptions;

    /**
     * <p>
     * The name of the pipeline to update.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline to update.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline to update.
     * </p>
     * 
     * @return The name of the pipeline to update.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline to update.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineRequest withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @param minUnits
     *        The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     */

    public void setMinUnits(Integer minUnits) {
        this.minUnits = minUnits;
    }

    /**
     * <p>
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @return The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     */

    public Integer getMinUnits() {
        return this.minUnits;
    }

    /**
     * <p>
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @param minUnits
     *        The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineRequest withMinUnits(Integer minUnits) {
        setMinUnits(minUnits);
        return this;
    }

    /**
     * <p>
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs)
     * </p>
     * 
     * @param maxUnits
     *        The maximum pipeline capacity, in Ingestion Compute Units (ICUs)
     */

    public void setMaxUnits(Integer maxUnits) {
        this.maxUnits = maxUnits;
    }

    /**
     * <p>
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs)
     * </p>
     * 
     * @return The maximum pipeline capacity, in Ingestion Compute Units (ICUs)
     */

    public Integer getMaxUnits() {
        return this.maxUnits;
    }

    /**
     * <p>
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs)
     * </p>
     * 
     * @param maxUnits
     *        The maximum pipeline capacity, in Ingestion Compute Units (ICUs)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineRequest withMaxUnits(Integer maxUnits) {
        setMaxUnits(maxUnits);
        return this;
    }

    /**
     * <p>
     * The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or within a
     * .yaml file. If you provide the configuration as a string, each new line must be escaped with <code>\n</code>.
     * </p>
     * 
     * @param pipelineConfigurationBody
     *        The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or
     *        within a .yaml file. If you provide the configuration as a string, each new line must be escaped with
     *        <code>\n</code>.
     */

    public void setPipelineConfigurationBody(String pipelineConfigurationBody) {
        this.pipelineConfigurationBody = pipelineConfigurationBody;
    }

    /**
     * <p>
     * The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or within a
     * .yaml file. If you provide the configuration as a string, each new line must be escaped with <code>\n</code>.
     * </p>
     * 
     * @return The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or
     *         within a .yaml file. If you provide the configuration as a string, each new line must be escaped with
     *         <code>\n</code>.
     */

    public String getPipelineConfigurationBody() {
        return this.pipelineConfigurationBody;
    }

    /**
     * <p>
     * The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or within a
     * .yaml file. If you provide the configuration as a string, each new line must be escaped with <code>\n</code>.
     * </p>
     * 
     * @param pipelineConfigurationBody
     *        The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or
     *        within a .yaml file. If you provide the configuration as a string, each new line must be escaped with
     *        <code>\n</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineRequest withPipelineConfigurationBody(String pipelineConfigurationBody) {
        setPipelineConfigurationBody(pipelineConfigurationBody);
        return this;
    }

    /**
     * <p>
     * Key-value pairs to configure log publishing.
     * </p>
     * 
     * @param logPublishingOptions
     *        Key-value pairs to configure log publishing.
     */

    public void setLogPublishingOptions(LogPublishingOptions logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
    }

    /**
     * <p>
     * Key-value pairs to configure log publishing.
     * </p>
     * 
     * @return Key-value pairs to configure log publishing.
     */

    public LogPublishingOptions getLogPublishingOptions() {
        return this.logPublishingOptions;
    }

    /**
     * <p>
     * Key-value pairs to configure log publishing.
     * </p>
     * 
     * @param logPublishingOptions
     *        Key-value pairs to configure log publishing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineRequest withLogPublishingOptions(LogPublishingOptions logPublishingOptions) {
        setLogPublishingOptions(logPublishingOptions);
        return this;
    }

    /**
     * <p>
     * Key-value pairs to configure persistent buffering for the pipeline.
     * </p>
     * 
     * @param bufferOptions
     *        Key-value pairs to configure persistent buffering for the pipeline.
     */

    public void setBufferOptions(BufferOptions bufferOptions) {
        this.bufferOptions = bufferOptions;
    }

    /**
     * <p>
     * Key-value pairs to configure persistent buffering for the pipeline.
     * </p>
     * 
     * @return Key-value pairs to configure persistent buffering for the pipeline.
     */

    public BufferOptions getBufferOptions() {
        return this.bufferOptions;
    }

    /**
     * <p>
     * Key-value pairs to configure persistent buffering for the pipeline.
     * </p>
     * 
     * @param bufferOptions
     *        Key-value pairs to configure persistent buffering for the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineRequest withBufferOptions(BufferOptions bufferOptions) {
        setBufferOptions(bufferOptions);
        return this;
    }

    /**
     * <p>
     * Key-value pairs to configure encryption for data that is written to a persistent buffer.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Key-value pairs to configure encryption for data that is written to a persistent buffer.
     */

    public void setEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    /**
     * <p>
     * Key-value pairs to configure encryption for data that is written to a persistent buffer.
     * </p>
     * 
     * @return Key-value pairs to configure encryption for data that is written to a persistent buffer.
     */

    public EncryptionAtRestOptions getEncryptionAtRestOptions() {
        return this.encryptionAtRestOptions;
    }

    /**
     * <p>
     * Key-value pairs to configure encryption for data that is written to a persistent buffer.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Key-value pairs to configure encryption for data that is written to a persistent buffer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineRequest withEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        setEncryptionAtRestOptions(encryptionAtRestOptions);
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getMinUnits() != null)
            sb.append("MinUnits: ").append(getMinUnits()).append(",");
        if (getMaxUnits() != null)
            sb.append("MaxUnits: ").append(getMaxUnits()).append(",");
        if (getPipelineConfigurationBody() != null)
            sb.append("PipelineConfigurationBody: ").append(getPipelineConfigurationBody()).append(",");
        if (getLogPublishingOptions() != null)
            sb.append("LogPublishingOptions: ").append(getLogPublishingOptions()).append(",");
        if (getBufferOptions() != null)
            sb.append("BufferOptions: ").append(getBufferOptions()).append(",");
        if (getEncryptionAtRestOptions() != null)
            sb.append("EncryptionAtRestOptions: ").append(getEncryptionAtRestOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePipelineRequest == false)
            return false;
        UpdatePipelineRequest other = (UpdatePipelineRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getMinUnits() == null ^ this.getMinUnits() == null)
            return false;
        if (other.getMinUnits() != null && other.getMinUnits().equals(this.getMinUnits()) == false)
            return false;
        if (other.getMaxUnits() == null ^ this.getMaxUnits() == null)
            return false;
        if (other.getMaxUnits() != null && other.getMaxUnits().equals(this.getMaxUnits()) == false)
            return false;
        if (other.getPipelineConfigurationBody() == null ^ this.getPipelineConfigurationBody() == null)
            return false;
        if (other.getPipelineConfigurationBody() != null && other.getPipelineConfigurationBody().equals(this.getPipelineConfigurationBody()) == false)
            return false;
        if (other.getLogPublishingOptions() == null ^ this.getLogPublishingOptions() == null)
            return false;
        if (other.getLogPublishingOptions() != null && other.getLogPublishingOptions().equals(this.getLogPublishingOptions()) == false)
            return false;
        if (other.getBufferOptions() == null ^ this.getBufferOptions() == null)
            return false;
        if (other.getBufferOptions() != null && other.getBufferOptions().equals(this.getBufferOptions()) == false)
            return false;
        if (other.getEncryptionAtRestOptions() == null ^ this.getEncryptionAtRestOptions() == null)
            return false;
        if (other.getEncryptionAtRestOptions() != null && other.getEncryptionAtRestOptions().equals(this.getEncryptionAtRestOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getMinUnits() == null) ? 0 : getMinUnits().hashCode());
        hashCode = prime * hashCode + ((getMaxUnits() == null) ? 0 : getMaxUnits().hashCode());
        hashCode = prime * hashCode + ((getPipelineConfigurationBody() == null) ? 0 : getPipelineConfigurationBody().hashCode());
        hashCode = prime * hashCode + ((getLogPublishingOptions() == null) ? 0 : getLogPublishingOptions().hashCode());
        hashCode = prime * hashCode + ((getBufferOptions() == null) ? 0 : getBufferOptions().hashCode());
        hashCode = prime * hashCode + ((getEncryptionAtRestOptions() == null) ? 0 : getEncryptionAtRestOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePipelineRequest clone() {
        return (UpdatePipelineRequest) super.clone();
    }

}

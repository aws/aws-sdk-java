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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/CreatePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the OpenSearch Ingestion pipeline to create. Pipeline names are unique across the pipelines owned by
     * an account within an Amazon Web Services Region.
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
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
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
     * Container for the values required to configure VPC access for the pipeline. If you don't specify these values,
     * OpenSearch Ingestion creates the pipeline with a public endpoint.
     * </p>
     */
    private VpcOptions vpcOptions;
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
     * List of tags to add to the pipeline upon creation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the OpenSearch Ingestion pipeline to create. Pipeline names are unique across the pipelines owned by
     * an account within an Amazon Web Services Region.
     * </p>
     * 
     * @param pipelineName
     *        The name of the OpenSearch Ingestion pipeline to create. Pipeline names are unique across the pipelines
     *        owned by an account within an Amazon Web Services Region.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the OpenSearch Ingestion pipeline to create. Pipeline names are unique across the pipelines owned by
     * an account within an Amazon Web Services Region.
     * </p>
     * 
     * @return The name of the OpenSearch Ingestion pipeline to create. Pipeline names are unique across the pipelines
     *         owned by an account within an Amazon Web Services Region.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the OpenSearch Ingestion pipeline to create. Pipeline names are unique across the pipelines owned by
     * an account within an Amazon Web Services Region.
     * </p>
     * 
     * @param pipelineName
     *        The name of the OpenSearch Ingestion pipeline to create. Pipeline names are unique across the pipelines
     *        owned by an account within an Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withPipelineName(String pipelineName) {
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

    public CreatePipelineRequest withMinUnits(Integer minUnits) {
        setMinUnits(minUnits);
        return this;
    }

    /**
     * <p>
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @param maxUnits
     *        The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     */

    public void setMaxUnits(Integer maxUnits) {
        this.maxUnits = maxUnits;
    }

    /**
     * <p>
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @return The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     */

    public Integer getMaxUnits() {
        return this.maxUnits;
    }

    /**
     * <p>
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @param maxUnits
     *        The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withMaxUnits(Integer maxUnits) {
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

    public CreatePipelineRequest withPipelineConfigurationBody(String pipelineConfigurationBody) {
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

    public CreatePipelineRequest withLogPublishingOptions(LogPublishingOptions logPublishingOptions) {
        setLogPublishingOptions(logPublishingOptions);
        return this;
    }

    /**
     * <p>
     * Container for the values required to configure VPC access for the pipeline. If you don't specify these values,
     * OpenSearch Ingestion creates the pipeline with a public endpoint.
     * </p>
     * 
     * @param vpcOptions
     *        Container for the values required to configure VPC access for the pipeline. If you don't specify these
     *        values, OpenSearch Ingestion creates the pipeline with a public endpoint.
     */

    public void setVpcOptions(VpcOptions vpcOptions) {
        this.vpcOptions = vpcOptions;
    }

    /**
     * <p>
     * Container for the values required to configure VPC access for the pipeline. If you don't specify these values,
     * OpenSearch Ingestion creates the pipeline with a public endpoint.
     * </p>
     * 
     * @return Container for the values required to configure VPC access for the pipeline. If you don't specify these
     *         values, OpenSearch Ingestion creates the pipeline with a public endpoint.
     */

    public VpcOptions getVpcOptions() {
        return this.vpcOptions;
    }

    /**
     * <p>
     * Container for the values required to configure VPC access for the pipeline. If you don't specify these values,
     * OpenSearch Ingestion creates the pipeline with a public endpoint.
     * </p>
     * 
     * @param vpcOptions
     *        Container for the values required to configure VPC access for the pipeline. If you don't specify these
     *        values, OpenSearch Ingestion creates the pipeline with a public endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withVpcOptions(VpcOptions vpcOptions) {
        setVpcOptions(vpcOptions);
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

    public CreatePipelineRequest withBufferOptions(BufferOptions bufferOptions) {
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

    public CreatePipelineRequest withEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        setEncryptionAtRestOptions(encryptionAtRestOptions);
        return this;
    }

    /**
     * <p>
     * List of tags to add to the pipeline upon creation.
     * </p>
     * 
     * @return List of tags to add to the pipeline upon creation.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * List of tags to add to the pipeline upon creation.
     * </p>
     * 
     * @param tags
     *        List of tags to add to the pipeline upon creation.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * List of tags to add to the pipeline upon creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        List of tags to add to the pipeline upon creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of tags to add to the pipeline upon creation.
     * </p>
     * 
     * @param tags
     *        List of tags to add to the pipeline upon creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getVpcOptions() != null)
            sb.append("VpcOptions: ").append(getVpcOptions()).append(",");
        if (getBufferOptions() != null)
            sb.append("BufferOptions: ").append(getBufferOptions()).append(",");
        if (getEncryptionAtRestOptions() != null)
            sb.append("EncryptionAtRestOptions: ").append(getEncryptionAtRestOptions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePipelineRequest == false)
            return false;
        CreatePipelineRequest other = (CreatePipelineRequest) obj;
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
        if (other.getVpcOptions() == null ^ this.getVpcOptions() == null)
            return false;
        if (other.getVpcOptions() != null && other.getVpcOptions().equals(this.getVpcOptions()) == false)
            return false;
        if (other.getBufferOptions() == null ^ this.getBufferOptions() == null)
            return false;
        if (other.getBufferOptions() != null && other.getBufferOptions().equals(this.getBufferOptions()) == false)
            return false;
        if (other.getEncryptionAtRestOptions() == null ^ this.getEncryptionAtRestOptions() == null)
            return false;
        if (other.getEncryptionAtRestOptions() != null && other.getEncryptionAtRestOptions().equals(this.getEncryptionAtRestOptions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getVpcOptions() == null) ? 0 : getVpcOptions().hashCode());
        hashCode = prime * hashCode + ((getBufferOptions() == null) ? 0 : getBufferOptions().hashCode());
        hashCode = prime * hashCode + ((getEncryptionAtRestOptions() == null) ? 0 : getEncryptionAtRestOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePipelineRequest clone() {
        return (CreatePipelineRequest) super.clone();
    }

}

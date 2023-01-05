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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelCardExportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelCardExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the model card to export.
     * </p>
     */
    private String modelCardName;
    /**
     * <p>
     * The version of the model card to export. If a version is not provided, then the latest version of the model card
     * is exported.
     * </p>
     */
    private Integer modelCardVersion;
    /**
     * <p>
     * The name of the model card export job.
     * </p>
     */
    private String modelCardExportJobName;
    /**
     * <p>
     * The model card output configuration that specifies the Amazon S3 path for exporting.
     * </p>
     */
    private ModelCardExportOutputConfig outputConfig;

    /**
     * <p>
     * The name of the model card to export.
     * </p>
     * 
     * @param modelCardName
     *        The name of the model card to export.
     */

    public void setModelCardName(String modelCardName) {
        this.modelCardName = modelCardName;
    }

    /**
     * <p>
     * The name of the model card to export.
     * </p>
     * 
     * @return The name of the model card to export.
     */

    public String getModelCardName() {
        return this.modelCardName;
    }

    /**
     * <p>
     * The name of the model card to export.
     * </p>
     * 
     * @param modelCardName
     *        The name of the model card to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCardExportJobRequest withModelCardName(String modelCardName) {
        setModelCardName(modelCardName);
        return this;
    }

    /**
     * <p>
     * The version of the model card to export. If a version is not provided, then the latest version of the model card
     * is exported.
     * </p>
     * 
     * @param modelCardVersion
     *        The version of the model card to export. If a version is not provided, then the latest version of the
     *        model card is exported.
     */

    public void setModelCardVersion(Integer modelCardVersion) {
        this.modelCardVersion = modelCardVersion;
    }

    /**
     * <p>
     * The version of the model card to export. If a version is not provided, then the latest version of the model card
     * is exported.
     * </p>
     * 
     * @return The version of the model card to export. If a version is not provided, then the latest version of the
     *         model card is exported.
     */

    public Integer getModelCardVersion() {
        return this.modelCardVersion;
    }

    /**
     * <p>
     * The version of the model card to export. If a version is not provided, then the latest version of the model card
     * is exported.
     * </p>
     * 
     * @param modelCardVersion
     *        The version of the model card to export. If a version is not provided, then the latest version of the
     *        model card is exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCardExportJobRequest withModelCardVersion(Integer modelCardVersion) {
        setModelCardVersion(modelCardVersion);
        return this;
    }

    /**
     * <p>
     * The name of the model card export job.
     * </p>
     * 
     * @param modelCardExportJobName
     *        The name of the model card export job.
     */

    public void setModelCardExportJobName(String modelCardExportJobName) {
        this.modelCardExportJobName = modelCardExportJobName;
    }

    /**
     * <p>
     * The name of the model card export job.
     * </p>
     * 
     * @return The name of the model card export job.
     */

    public String getModelCardExportJobName() {
        return this.modelCardExportJobName;
    }

    /**
     * <p>
     * The name of the model card export job.
     * </p>
     * 
     * @param modelCardExportJobName
     *        The name of the model card export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCardExportJobRequest withModelCardExportJobName(String modelCardExportJobName) {
        setModelCardExportJobName(modelCardExportJobName);
        return this;
    }

    /**
     * <p>
     * The model card output configuration that specifies the Amazon S3 path for exporting.
     * </p>
     * 
     * @param outputConfig
     *        The model card output configuration that specifies the Amazon S3 path for exporting.
     */

    public void setOutputConfig(ModelCardExportOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The model card output configuration that specifies the Amazon S3 path for exporting.
     * </p>
     * 
     * @return The model card output configuration that specifies the Amazon S3 path for exporting.
     */

    public ModelCardExportOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The model card output configuration that specifies the Amazon S3 path for exporting.
     * </p>
     * 
     * @param outputConfig
     *        The model card output configuration that specifies the Amazon S3 path for exporting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCardExportJobRequest withOutputConfig(ModelCardExportOutputConfig outputConfig) {
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
        if (getModelCardName() != null)
            sb.append("ModelCardName: ").append(getModelCardName()).append(",");
        if (getModelCardVersion() != null)
            sb.append("ModelCardVersion: ").append(getModelCardVersion()).append(",");
        if (getModelCardExportJobName() != null)
            sb.append("ModelCardExportJobName: ").append(getModelCardExportJobName()).append(",");
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

        if (obj instanceof CreateModelCardExportJobRequest == false)
            return false;
        CreateModelCardExportJobRequest other = (CreateModelCardExportJobRequest) obj;
        if (other.getModelCardName() == null ^ this.getModelCardName() == null)
            return false;
        if (other.getModelCardName() != null && other.getModelCardName().equals(this.getModelCardName()) == false)
            return false;
        if (other.getModelCardVersion() == null ^ this.getModelCardVersion() == null)
            return false;
        if (other.getModelCardVersion() != null && other.getModelCardVersion().equals(this.getModelCardVersion()) == false)
            return false;
        if (other.getModelCardExportJobName() == null ^ this.getModelCardExportJobName() == null)
            return false;
        if (other.getModelCardExportJobName() != null && other.getModelCardExportJobName().equals(this.getModelCardExportJobName()) == false)
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

        hashCode = prime * hashCode + ((getModelCardName() == null) ? 0 : getModelCardName().hashCode());
        hashCode = prime * hashCode + ((getModelCardVersion() == null) ? 0 : getModelCardVersion().hashCode());
        hashCode = prime * hashCode + ((getModelCardExportJobName() == null) ? 0 : getModelCardExportJobName().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelCardExportJobRequest clone() {
        return (CreateModelCardExportJobRequest) super.clone();
    }

}

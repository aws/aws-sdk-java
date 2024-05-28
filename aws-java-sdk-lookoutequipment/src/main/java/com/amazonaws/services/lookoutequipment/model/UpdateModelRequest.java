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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UpdateModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the model to update.
     * </p>
     */
    private String modelName;

    private LabelsInputConfiguration labelsInputConfiguration;
    /**
     * <p>
     * The ARN of the model to update.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon S3 location where you want Amazon Lookout for Equipment to save the pointwise model diagnostics for
     * the model. You must also specify the <code>RoleArn</code> request parameter.
     * </p>
     */
    private ModelDiagnosticsOutputConfiguration modelDiagnosticsOutputConfiguration;

    /**
     * <p>
     * The name of the model to update.
     * </p>
     * 
     * @param modelName
     *        The name of the model to update.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model to update.
     * </p>
     * 
     * @return The name of the model to update.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model to update.
     * </p>
     * 
     * @param modelName
     *        The name of the model to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelRequest withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * @param labelsInputConfiguration
     */

    public void setLabelsInputConfiguration(LabelsInputConfiguration labelsInputConfiguration) {
        this.labelsInputConfiguration = labelsInputConfiguration;
    }

    /**
     * @return
     */

    public LabelsInputConfiguration getLabelsInputConfiguration() {
        return this.labelsInputConfiguration;
    }

    /**
     * @param labelsInputConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelRequest withLabelsInputConfiguration(LabelsInputConfiguration labelsInputConfiguration) {
        setLabelsInputConfiguration(labelsInputConfiguration);
        return this;
    }

    /**
     * <p>
     * The ARN of the model to update.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the model to update.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the model to update.
     * </p>
     * 
     * @return The ARN of the model to update.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the model to update.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the model to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location where you want Amazon Lookout for Equipment to save the pointwise model diagnostics for
     * the model. You must also specify the <code>RoleArn</code> request parameter.
     * </p>
     * 
     * @param modelDiagnosticsOutputConfiguration
     *        The Amazon S3 location where you want Amazon Lookout for Equipment to save the pointwise model diagnostics
     *        for the model. You must also specify the <code>RoleArn</code> request parameter.
     */

    public void setModelDiagnosticsOutputConfiguration(ModelDiagnosticsOutputConfiguration modelDiagnosticsOutputConfiguration) {
        this.modelDiagnosticsOutputConfiguration = modelDiagnosticsOutputConfiguration;
    }

    /**
     * <p>
     * The Amazon S3 location where you want Amazon Lookout for Equipment to save the pointwise model diagnostics for
     * the model. You must also specify the <code>RoleArn</code> request parameter.
     * </p>
     * 
     * @return The Amazon S3 location where you want Amazon Lookout for Equipment to save the pointwise model
     *         diagnostics for the model. You must also specify the <code>RoleArn</code> request parameter.
     */

    public ModelDiagnosticsOutputConfiguration getModelDiagnosticsOutputConfiguration() {
        return this.modelDiagnosticsOutputConfiguration;
    }

    /**
     * <p>
     * The Amazon S3 location where you want Amazon Lookout for Equipment to save the pointwise model diagnostics for
     * the model. You must also specify the <code>RoleArn</code> request parameter.
     * </p>
     * 
     * @param modelDiagnosticsOutputConfiguration
     *        The Amazon S3 location where you want Amazon Lookout for Equipment to save the pointwise model diagnostics
     *        for the model. You must also specify the <code>RoleArn</code> request parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelRequest withModelDiagnosticsOutputConfiguration(ModelDiagnosticsOutputConfiguration modelDiagnosticsOutputConfiguration) {
        setModelDiagnosticsOutputConfiguration(modelDiagnosticsOutputConfiguration);
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getLabelsInputConfiguration() != null)
            sb.append("LabelsInputConfiguration: ").append(getLabelsInputConfiguration()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getModelDiagnosticsOutputConfiguration() != null)
            sb.append("ModelDiagnosticsOutputConfiguration: ").append(getModelDiagnosticsOutputConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateModelRequest == false)
            return false;
        UpdateModelRequest other = (UpdateModelRequest) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getLabelsInputConfiguration() == null ^ this.getLabelsInputConfiguration() == null)
            return false;
        if (other.getLabelsInputConfiguration() != null && other.getLabelsInputConfiguration().equals(this.getLabelsInputConfiguration()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getModelDiagnosticsOutputConfiguration() == null ^ this.getModelDiagnosticsOutputConfiguration() == null)
            return false;
        if (other.getModelDiagnosticsOutputConfiguration() != null
                && other.getModelDiagnosticsOutputConfiguration().equals(this.getModelDiagnosticsOutputConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getLabelsInputConfiguration() == null) ? 0 : getLabelsInputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getModelDiagnosticsOutputConfiguration() == null) ? 0 : getModelDiagnosticsOutputConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateModelRequest clone() {
        return (UpdateModelRequest) super.clone();
    }

}

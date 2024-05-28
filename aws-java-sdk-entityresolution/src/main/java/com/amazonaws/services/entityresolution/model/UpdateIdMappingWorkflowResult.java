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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateIdMappingWorkflow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIdMappingWorkflowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the workflow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An object which defines the <code>idMappingType</code> and the <code>providerProperties</code>.
     * </p>
     */
    private IdMappingTechniques idMappingTechniques;
    /**
     * <p>
     * A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     * <code>SchemaName</code>.
     * </p>
     */
    private java.util.List<IdMappingWorkflowInputSource> inputSourceConfig;
    /**
     * <p>
     * A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code> and
     * <code>KMSArn</code>.
     * </p>
     */
    private java.util.List<IdMappingWorkflowOutputSource> outputSourceConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web Services
     * resources on your behalf.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow role. Entity Resolution assumes this role to access Amazon Web
     * Services resources on your behalf.
     * </p>
     */
    private String workflowArn;
    /**
     * <p>
     * The name of the workflow.
     * </p>
     */
    private String workflowName;

    /**
     * <p>
     * A description of the workflow.
     * </p>
     * 
     * @param description
     *        A description of the workflow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the workflow.
     * </p>
     * 
     * @return A description of the workflow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the workflow.
     * </p>
     * 
     * @param description
     *        A description of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdMappingWorkflowResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An object which defines the <code>idMappingType</code> and the <code>providerProperties</code>.
     * </p>
     * 
     * @param idMappingTechniques
     *        An object which defines the <code>idMappingType</code> and the <code>providerProperties</code>.
     */

    public void setIdMappingTechniques(IdMappingTechniques idMappingTechniques) {
        this.idMappingTechniques = idMappingTechniques;
    }

    /**
     * <p>
     * An object which defines the <code>idMappingType</code> and the <code>providerProperties</code>.
     * </p>
     * 
     * @return An object which defines the <code>idMappingType</code> and the <code>providerProperties</code>.
     */

    public IdMappingTechniques getIdMappingTechniques() {
        return this.idMappingTechniques;
    }

    /**
     * <p>
     * An object which defines the <code>idMappingType</code> and the <code>providerProperties</code>.
     * </p>
     * 
     * @param idMappingTechniques
     *        An object which defines the <code>idMappingType</code> and the <code>providerProperties</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdMappingWorkflowResult withIdMappingTechniques(IdMappingTechniques idMappingTechniques) {
        setIdMappingTechniques(idMappingTechniques);
        return this;
    }

    /**
     * <p>
     * A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     * <code>SchemaName</code>.
     * </p>
     * 
     * @return A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     *         <code>SchemaName</code>.
     */

    public java.util.List<IdMappingWorkflowInputSource> getInputSourceConfig() {
        return inputSourceConfig;
    }

    /**
     * <p>
     * A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     * <code>SchemaName</code>.
     * </p>
     * 
     * @param inputSourceConfig
     *        A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     *        <code>SchemaName</code>.
     */

    public void setInputSourceConfig(java.util.Collection<IdMappingWorkflowInputSource> inputSourceConfig) {
        if (inputSourceConfig == null) {
            this.inputSourceConfig = null;
            return;
        }

        this.inputSourceConfig = new java.util.ArrayList<IdMappingWorkflowInputSource>(inputSourceConfig);
    }

    /**
     * <p>
     * A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     * <code>SchemaName</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputSourceConfig(java.util.Collection)} or {@link #withInputSourceConfig(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inputSourceConfig
     *        A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     *        <code>SchemaName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdMappingWorkflowResult withInputSourceConfig(IdMappingWorkflowInputSource... inputSourceConfig) {
        if (this.inputSourceConfig == null) {
            setInputSourceConfig(new java.util.ArrayList<IdMappingWorkflowInputSource>(inputSourceConfig.length));
        }
        for (IdMappingWorkflowInputSource ele : inputSourceConfig) {
            this.inputSourceConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     * <code>SchemaName</code>.
     * </p>
     * 
     * @param inputSourceConfig
     *        A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     *        <code>SchemaName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdMappingWorkflowResult withInputSourceConfig(java.util.Collection<IdMappingWorkflowInputSource> inputSourceConfig) {
        setInputSourceConfig(inputSourceConfig);
        return this;
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code> and
     * <code>KMSArn</code>.
     * </p>
     * 
     * @return A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code> and
     *         <code>KMSArn</code>.
     */

    public java.util.List<IdMappingWorkflowOutputSource> getOutputSourceConfig() {
        return outputSourceConfig;
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code> and
     * <code>KMSArn</code>.
     * </p>
     * 
     * @param outputSourceConfig
     *        A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code> and
     *        <code>KMSArn</code>.
     */

    public void setOutputSourceConfig(java.util.Collection<IdMappingWorkflowOutputSource> outputSourceConfig) {
        if (outputSourceConfig == null) {
            this.outputSourceConfig = null;
            return;
        }

        this.outputSourceConfig = new java.util.ArrayList<IdMappingWorkflowOutputSource>(outputSourceConfig);
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code> and
     * <code>KMSArn</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputSourceConfig(java.util.Collection)} or {@link #withOutputSourceConfig(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param outputSourceConfig
     *        A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code> and
     *        <code>KMSArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdMappingWorkflowResult withOutputSourceConfig(IdMappingWorkflowOutputSource... outputSourceConfig) {
        if (this.outputSourceConfig == null) {
            setOutputSourceConfig(new java.util.ArrayList<IdMappingWorkflowOutputSource>(outputSourceConfig.length));
        }
        for (IdMappingWorkflowOutputSource ele : outputSourceConfig) {
            this.outputSourceConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code> and
     * <code>KMSArn</code>.
     * </p>
     * 
     * @param outputSourceConfig
     *        A list of <code>OutputSource</code> objects, each of which contains fields <code>OutputS3Path</code> and
     *        <code>KMSArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdMappingWorkflowResult withOutputSourceConfig(java.util.Collection<IdMappingWorkflowOutputSource> outputSourceConfig) {
        setOutputSourceConfig(outputSourceConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web Services
     * resources on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web
     *        Services resources on your behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web Services
     * resources on your behalf.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web
     *         Services resources on your behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web Services
     * resources on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web
     *        Services resources on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdMappingWorkflowResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow role. Entity Resolution assumes this role to access Amazon Web
     * Services resources on your behalf.
     * </p>
     * 
     * @param workflowArn
     *        The Amazon Resource Name (ARN) of the workflow role. Entity Resolution assumes this role to access Amazon
     *        Web Services resources on your behalf.
     */

    public void setWorkflowArn(String workflowArn) {
        this.workflowArn = workflowArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow role. Entity Resolution assumes this role to access Amazon Web
     * Services resources on your behalf.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the workflow role. Entity Resolution assumes this role to access Amazon
     *         Web Services resources on your behalf.
     */

    public String getWorkflowArn() {
        return this.workflowArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow role. Entity Resolution assumes this role to access Amazon Web
     * Services resources on your behalf.
     * </p>
     * 
     * @param workflowArn
     *        The Amazon Resource Name (ARN) of the workflow role. Entity Resolution assumes this role to access Amazon
     *        Web Services resources on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdMappingWorkflowResult withWorkflowArn(String workflowArn) {
        setWorkflowArn(workflowArn);
        return this;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @param workflowName
     *        The name of the workflow.
     */

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @return The name of the workflow.
     */

    public String getWorkflowName() {
        return this.workflowName;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @param workflowName
     *        The name of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdMappingWorkflowResult withWorkflowName(String workflowName) {
        setWorkflowName(workflowName);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIdMappingTechniques() != null)
            sb.append("IdMappingTechniques: ").append(getIdMappingTechniques()).append(",");
        if (getInputSourceConfig() != null)
            sb.append("InputSourceConfig: ").append(getInputSourceConfig()).append(",");
        if (getOutputSourceConfig() != null)
            sb.append("OutputSourceConfig: ").append(getOutputSourceConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getWorkflowArn() != null)
            sb.append("WorkflowArn: ").append(getWorkflowArn()).append(",");
        if (getWorkflowName() != null)
            sb.append("WorkflowName: ").append(getWorkflowName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIdMappingWorkflowResult == false)
            return false;
        UpdateIdMappingWorkflowResult other = (UpdateIdMappingWorkflowResult) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIdMappingTechniques() == null ^ this.getIdMappingTechniques() == null)
            return false;
        if (other.getIdMappingTechniques() != null && other.getIdMappingTechniques().equals(this.getIdMappingTechniques()) == false)
            return false;
        if (other.getInputSourceConfig() == null ^ this.getInputSourceConfig() == null)
            return false;
        if (other.getInputSourceConfig() != null && other.getInputSourceConfig().equals(this.getInputSourceConfig()) == false)
            return false;
        if (other.getOutputSourceConfig() == null ^ this.getOutputSourceConfig() == null)
            return false;
        if (other.getOutputSourceConfig() != null && other.getOutputSourceConfig().equals(this.getOutputSourceConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getWorkflowArn() == null ^ this.getWorkflowArn() == null)
            return false;
        if (other.getWorkflowArn() != null && other.getWorkflowArn().equals(this.getWorkflowArn()) == false)
            return false;
        if (other.getWorkflowName() == null ^ this.getWorkflowName() == null)
            return false;
        if (other.getWorkflowName() != null && other.getWorkflowName().equals(this.getWorkflowName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIdMappingTechniques() == null) ? 0 : getIdMappingTechniques().hashCode());
        hashCode = prime * hashCode + ((getInputSourceConfig() == null) ? 0 : getInputSourceConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputSourceConfig() == null) ? 0 : getOutputSourceConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getWorkflowArn() == null) ? 0 : getWorkflowArn().hashCode());
        hashCode = prime * hashCode + ((getWorkflowName() == null) ? 0 : getWorkflowName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIdMappingWorkflowResult clone() {
        try {
            return (UpdateIdMappingWorkflowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

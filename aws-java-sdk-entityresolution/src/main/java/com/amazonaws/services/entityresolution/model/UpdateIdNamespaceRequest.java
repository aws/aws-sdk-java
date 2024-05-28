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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateIdNamespace" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIdNamespaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the ID namespace.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Determines the properties of <code>IdMappingWorkflow</code> where this <code>IdNamespace</code> can be used as a
     * <code>Source</code> or a <code>Target</code>.
     * </p>
     */
    private java.util.List<IdNamespaceIdMappingWorkflowProperties> idMappingWorkflowProperties;
    /**
     * <p>
     * The name of the ID namespace.
     * </p>
     */
    private String idNamespaceName;
    /**
     * <p>
     * A list of <code>InputSource</code> objects, which have the fields <code>InputSourceARN</code> and
     * <code>SchemaName</code>.
     * </p>
     */
    private java.util.List<IdNamespaceInputSource> inputSourceConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access the resources
     * defined in this <code>IdNamespace</code> on your behalf as part of a workflow run.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The description of the ID namespace.
     * </p>
     * 
     * @param description
     *        The description of the ID namespace.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the ID namespace.
     * </p>
     * 
     * @return The description of the ID namespace.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the ID namespace.
     * </p>
     * 
     * @param description
     *        The description of the ID namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdNamespaceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Determines the properties of <code>IdMappingWorkflow</code> where this <code>IdNamespace</code> can be used as a
     * <code>Source</code> or a <code>Target</code>.
     * </p>
     * 
     * @return Determines the properties of <code>IdMappingWorkflow</code> where this <code>IdNamespace</code> can be
     *         used as a <code>Source</code> or a <code>Target</code>.
     */

    public java.util.List<IdNamespaceIdMappingWorkflowProperties> getIdMappingWorkflowProperties() {
        return idMappingWorkflowProperties;
    }

    /**
     * <p>
     * Determines the properties of <code>IdMappingWorkflow</code> where this <code>IdNamespace</code> can be used as a
     * <code>Source</code> or a <code>Target</code>.
     * </p>
     * 
     * @param idMappingWorkflowProperties
     *        Determines the properties of <code>IdMappingWorkflow</code> where this <code>IdNamespace</code> can be
     *        used as a <code>Source</code> or a <code>Target</code>.
     */

    public void setIdMappingWorkflowProperties(java.util.Collection<IdNamespaceIdMappingWorkflowProperties> idMappingWorkflowProperties) {
        if (idMappingWorkflowProperties == null) {
            this.idMappingWorkflowProperties = null;
            return;
        }

        this.idMappingWorkflowProperties = new java.util.ArrayList<IdNamespaceIdMappingWorkflowProperties>(idMappingWorkflowProperties);
    }

    /**
     * <p>
     * Determines the properties of <code>IdMappingWorkflow</code> where this <code>IdNamespace</code> can be used as a
     * <code>Source</code> or a <code>Target</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdMappingWorkflowProperties(java.util.Collection)} or
     * {@link #withIdMappingWorkflowProperties(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param idMappingWorkflowProperties
     *        Determines the properties of <code>IdMappingWorkflow</code> where this <code>IdNamespace</code> can be
     *        used as a <code>Source</code> or a <code>Target</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdNamespaceRequest withIdMappingWorkflowProperties(IdNamespaceIdMappingWorkflowProperties... idMappingWorkflowProperties) {
        if (this.idMappingWorkflowProperties == null) {
            setIdMappingWorkflowProperties(new java.util.ArrayList<IdNamespaceIdMappingWorkflowProperties>(idMappingWorkflowProperties.length));
        }
        for (IdNamespaceIdMappingWorkflowProperties ele : idMappingWorkflowProperties) {
            this.idMappingWorkflowProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Determines the properties of <code>IdMappingWorkflow</code> where this <code>IdNamespace</code> can be used as a
     * <code>Source</code> or a <code>Target</code>.
     * </p>
     * 
     * @param idMappingWorkflowProperties
     *        Determines the properties of <code>IdMappingWorkflow</code> where this <code>IdNamespace</code> can be
     *        used as a <code>Source</code> or a <code>Target</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdNamespaceRequest withIdMappingWorkflowProperties(java.util.Collection<IdNamespaceIdMappingWorkflowProperties> idMappingWorkflowProperties) {
        setIdMappingWorkflowProperties(idMappingWorkflowProperties);
        return this;
    }

    /**
     * <p>
     * The name of the ID namespace.
     * </p>
     * 
     * @param idNamespaceName
     *        The name of the ID namespace.
     */

    public void setIdNamespaceName(String idNamespaceName) {
        this.idNamespaceName = idNamespaceName;
    }

    /**
     * <p>
     * The name of the ID namespace.
     * </p>
     * 
     * @return The name of the ID namespace.
     */

    public String getIdNamespaceName() {
        return this.idNamespaceName;
    }

    /**
     * <p>
     * The name of the ID namespace.
     * </p>
     * 
     * @param idNamespaceName
     *        The name of the ID namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdNamespaceRequest withIdNamespaceName(String idNamespaceName) {
        setIdNamespaceName(idNamespaceName);
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

    public java.util.List<IdNamespaceInputSource> getInputSourceConfig() {
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

    public void setInputSourceConfig(java.util.Collection<IdNamespaceInputSource> inputSourceConfig) {
        if (inputSourceConfig == null) {
            this.inputSourceConfig = null;
            return;
        }

        this.inputSourceConfig = new java.util.ArrayList<IdNamespaceInputSource>(inputSourceConfig);
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

    public UpdateIdNamespaceRequest withInputSourceConfig(IdNamespaceInputSource... inputSourceConfig) {
        if (this.inputSourceConfig == null) {
            setInputSourceConfig(new java.util.ArrayList<IdNamespaceInputSource>(inputSourceConfig.length));
        }
        for (IdNamespaceInputSource ele : inputSourceConfig) {
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

    public UpdateIdNamespaceRequest withInputSourceConfig(java.util.Collection<IdNamespaceInputSource> inputSourceConfig) {
        setInputSourceConfig(inputSourceConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access the resources
     * defined in this <code>IdNamespace</code> on your behalf as part of a workflow run.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access the
     *        resources defined in this <code>IdNamespace</code> on your behalf as part of a workflow run.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access the resources
     * defined in this <code>IdNamespace</code> on your behalf as part of a workflow run.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access the
     *         resources defined in this <code>IdNamespace</code> on your behalf as part of a workflow run.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access the resources
     * defined in this <code>IdNamespace</code> on your behalf as part of a workflow run.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access the
     *        resources defined in this <code>IdNamespace</code> on your behalf as part of a workflow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdNamespaceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getIdMappingWorkflowProperties() != null)
            sb.append("IdMappingWorkflowProperties: ").append(getIdMappingWorkflowProperties()).append(",");
        if (getIdNamespaceName() != null)
            sb.append("IdNamespaceName: ").append(getIdNamespaceName()).append(",");
        if (getInputSourceConfig() != null)
            sb.append("InputSourceConfig: ").append(getInputSourceConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIdNamespaceRequest == false)
            return false;
        UpdateIdNamespaceRequest other = (UpdateIdNamespaceRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIdMappingWorkflowProperties() == null ^ this.getIdMappingWorkflowProperties() == null)
            return false;
        if (other.getIdMappingWorkflowProperties() != null && other.getIdMappingWorkflowProperties().equals(this.getIdMappingWorkflowProperties()) == false)
            return false;
        if (other.getIdNamespaceName() == null ^ this.getIdNamespaceName() == null)
            return false;
        if (other.getIdNamespaceName() != null && other.getIdNamespaceName().equals(this.getIdNamespaceName()) == false)
            return false;
        if (other.getInputSourceConfig() == null ^ this.getInputSourceConfig() == null)
            return false;
        if (other.getInputSourceConfig() != null && other.getInputSourceConfig().equals(this.getInputSourceConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIdMappingWorkflowProperties() == null) ? 0 : getIdMappingWorkflowProperties().hashCode());
        hashCode = prime * hashCode + ((getIdNamespaceName() == null) ? 0 : getIdNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getInputSourceConfig() == null) ? 0 : getInputSourceConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIdNamespaceRequest clone() {
        return (UpdateIdNamespaceRequest) super.clone();
    }

}

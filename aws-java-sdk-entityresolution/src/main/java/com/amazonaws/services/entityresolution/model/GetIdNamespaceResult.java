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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetIdNamespace" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIdNamespaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of when the ID namespace was created.
     * </p>
     */
    private java.util.Date createdAt;
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
     * The Amazon Resource Name (ARN) of the ID namespace.
     * </p>
     */
    private String idNamespaceArn;
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
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.
     * </p>
     * <p>
     * The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in an ID
     * mapping workflow.
     * </p>
     * <p>
     * The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all <code>sourceIds</code>
     * will resolve to.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The timestamp of when the ID namespace was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The timestamp of when the ID namespace was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the ID namespace was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the ID namespace was created.
     * </p>
     * 
     * @return The timestamp of when the ID namespace was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the ID namespace was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the ID namespace was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdNamespaceResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

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

    public GetIdNamespaceResult withDescription(String description) {
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

    public GetIdNamespaceResult withIdMappingWorkflowProperties(IdNamespaceIdMappingWorkflowProperties... idMappingWorkflowProperties) {
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

    public GetIdNamespaceResult withIdMappingWorkflowProperties(java.util.Collection<IdNamespaceIdMappingWorkflowProperties> idMappingWorkflowProperties) {
        setIdMappingWorkflowProperties(idMappingWorkflowProperties);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ID namespace.
     * </p>
     * 
     * @param idNamespaceArn
     *        The Amazon Resource Name (ARN) of the ID namespace.
     */

    public void setIdNamespaceArn(String idNamespaceArn) {
        this.idNamespaceArn = idNamespaceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ID namespace.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the ID namespace.
     */

    public String getIdNamespaceArn() {
        return this.idNamespaceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ID namespace.
     * </p>
     * 
     * @param idNamespaceArn
     *        The Amazon Resource Name (ARN) of the ID namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdNamespaceResult withIdNamespaceArn(String idNamespaceArn) {
        setIdNamespaceArn(idNamespaceArn);
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

    public GetIdNamespaceResult withIdNamespaceName(String idNamespaceName) {
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

    public GetIdNamespaceResult withInputSourceConfig(IdNamespaceInputSource... inputSourceConfig) {
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

    public GetIdNamespaceResult withInputSourceConfig(java.util.Collection<IdNamespaceInputSource> inputSourceConfig) {
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

    public GetIdNamespaceResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdNamespaceResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetIdNamespaceResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetIdNamespaceResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdNamespaceResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.
     * </p>
     * <p>
     * The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in an ID
     * mapping workflow.
     * </p>
     * <p>
     * The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all <code>sourceIds</code>
     * will resolve to.
     * </p>
     * 
     * @param type
     *        The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.</p>
     *        <p>
     *        The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in
     *        an ID mapping workflow.
     *        </p>
     *        <p>
     *        The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all
     *        <code>sourceIds</code> will resolve to.
     * @see IdNamespaceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.
     * </p>
     * <p>
     * The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in an ID
     * mapping workflow.
     * </p>
     * <p>
     * The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all <code>sourceIds</code>
     * will resolve to.
     * </p>
     * 
     * @return The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.</p>
     *         <p>
     *         The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in
     *         an ID mapping workflow.
     *         </p>
     *         <p>
     *         The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all
     *         <code>sourceIds</code> will resolve to.
     * @see IdNamespaceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.
     * </p>
     * <p>
     * The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in an ID
     * mapping workflow.
     * </p>
     * <p>
     * The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all <code>sourceIds</code>
     * will resolve to.
     * </p>
     * 
     * @param type
     *        The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.</p>
     *        <p>
     *        The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in
     *        an ID mapping workflow.
     *        </p>
     *        <p>
     *        The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all
     *        <code>sourceIds</code> will resolve to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdNamespaceType
     */

    public GetIdNamespaceResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.
     * </p>
     * <p>
     * The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in an ID
     * mapping workflow.
     * </p>
     * <p>
     * The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all <code>sourceIds</code>
     * will resolve to.
     * </p>
     * 
     * @param type
     *        The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.</p>
     *        <p>
     *        The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in
     *        an ID mapping workflow.
     *        </p>
     *        <p>
     *        The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all
     *        <code>sourceIds</code> will resolve to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdNamespaceType
     */

    public GetIdNamespaceResult withType(IdNamespaceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the ID namespace was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the ID namespace was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the ID namespace was last updated.
     * </p>
     * 
     * @return The timestamp of when the ID namespace was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the ID namespace was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the ID namespace was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdNamespaceResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIdMappingWorkflowProperties() != null)
            sb.append("IdMappingWorkflowProperties: ").append(getIdMappingWorkflowProperties()).append(",");
        if (getIdNamespaceArn() != null)
            sb.append("IdNamespaceArn: ").append(getIdNamespaceArn()).append(",");
        if (getIdNamespaceName() != null)
            sb.append("IdNamespaceName: ").append(getIdNamespaceName()).append(",");
        if (getInputSourceConfig() != null)
            sb.append("InputSourceConfig: ").append(getInputSourceConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIdNamespaceResult == false)
            return false;
        GetIdNamespaceResult other = (GetIdNamespaceResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIdMappingWorkflowProperties() == null ^ this.getIdMappingWorkflowProperties() == null)
            return false;
        if (other.getIdMappingWorkflowProperties() != null && other.getIdMappingWorkflowProperties().equals(this.getIdMappingWorkflowProperties()) == false)
            return false;
        if (other.getIdNamespaceArn() == null ^ this.getIdNamespaceArn() == null)
            return false;
        if (other.getIdNamespaceArn() != null && other.getIdNamespaceArn().equals(this.getIdNamespaceArn()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIdMappingWorkflowProperties() == null) ? 0 : getIdMappingWorkflowProperties().hashCode());
        hashCode = prime * hashCode + ((getIdNamespaceArn() == null) ? 0 : getIdNamespaceArn().hashCode());
        hashCode = prime * hashCode + ((getIdNamespaceName() == null) ? 0 : getIdNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getInputSourceConfig() == null) ? 0 : getInputSourceConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetIdNamespaceResult clone() {
        try {
            return (GetIdNamespaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

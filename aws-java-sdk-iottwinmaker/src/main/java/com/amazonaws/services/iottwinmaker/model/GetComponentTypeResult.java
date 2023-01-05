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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetComponentType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComponentTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workspace that contains the component type.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * A Boolean value that specifies whether an entity can have more than one component of this type.
     * </p>
     */
    private Boolean isSingleton;
    /**
     * <p>
     * The ID of the component type.
     * </p>
     */
    private String componentTypeId;
    /**
     * <p>
     * The description of the component type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An object that maps strings to the property definitions in the component type. Each string in the mapping must be
     * unique to this object.
     * </p>
     */
    private java.util.Map<String, PropertyDefinitionResponse> propertyDefinitions;
    /**
     * <p>
     * The name of the parent component type that this component type extends.
     * </p>
     */
    private java.util.List<String> extendsFrom;
    /**
     * <p>
     * An object that maps strings to the functions in the component type. Each string in the mapping must be unique to
     * this object.
     * </p>
     */
    private java.util.Map<String, FunctionResponse> functions;
    /**
     * <p>
     * The date and time when the component type was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time when the component was last updated.
     * </p>
     */
    private java.util.Date updateDateTime;
    /**
     * <p>
     * The ARN of the component type.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A Boolean value that specifies whether the component type is abstract.
     * </p>
     */
    private Boolean isAbstract;
    /**
     * <p>
     * A Boolean value that specifies whether the component type has a schema initializer and that the schema
     * initializer has run.
     * </p>
     */
    private Boolean isSchemaInitialized;
    /**
     * <p>
     * The current status of the component type.
     * </p>
     */
    private Status status;
    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 250.
     * </p>
     */
    private java.util.Map<String, PropertyGroupResponse> propertyGroups;
    /**
     * <p>
     * The syncSource of the sync job, if this entity was created by a sync job.
     * </p>
     */
    private String syncSource;
    /**
     * <p>
     * The component type name.
     * </p>
     */
    private String componentTypeName;

    /**
     * <p>
     * The ID of the workspace that contains the component type.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the component type.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the component type.
     * </p>
     * 
     * @return The ID of the workspace that contains the component type.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the component type.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether an entity can have more than one component of this type.
     * </p>
     * 
     * @param isSingleton
     *        A Boolean value that specifies whether an entity can have more than one component of this type.
     */

    public void setIsSingleton(Boolean isSingleton) {
        this.isSingleton = isSingleton;
    }

    /**
     * <p>
     * A Boolean value that specifies whether an entity can have more than one component of this type.
     * </p>
     * 
     * @return A Boolean value that specifies whether an entity can have more than one component of this type.
     */

    public Boolean getIsSingleton() {
        return this.isSingleton;
    }

    /**
     * <p>
     * A Boolean value that specifies whether an entity can have more than one component of this type.
     * </p>
     * 
     * @param isSingleton
     *        A Boolean value that specifies whether an entity can have more than one component of this type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withIsSingleton(Boolean isSingleton) {
        setIsSingleton(isSingleton);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether an entity can have more than one component of this type.
     * </p>
     * 
     * @return A Boolean value that specifies whether an entity can have more than one component of this type.
     */

    public Boolean isSingleton() {
        return this.isSingleton;
    }

    /**
     * <p>
     * The ID of the component type.
     * </p>
     * 
     * @param componentTypeId
     *        The ID of the component type.
     */

    public void setComponentTypeId(String componentTypeId) {
        this.componentTypeId = componentTypeId;
    }

    /**
     * <p>
     * The ID of the component type.
     * </p>
     * 
     * @return The ID of the component type.
     */

    public String getComponentTypeId() {
        return this.componentTypeId;
    }

    /**
     * <p>
     * The ID of the component type.
     * </p>
     * 
     * @param componentTypeId
     *        The ID of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withComponentTypeId(String componentTypeId) {
        setComponentTypeId(componentTypeId);
        return this;
    }

    /**
     * <p>
     * The description of the component type.
     * </p>
     * 
     * @param description
     *        The description of the component type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the component type.
     * </p>
     * 
     * @return The description of the component type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the component type.
     * </p>
     * 
     * @param description
     *        The description of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An object that maps strings to the property definitions in the component type. Each string in the mapping must be
     * unique to this object.
     * </p>
     * 
     * @return An object that maps strings to the property definitions in the component type. Each string in the mapping
     *         must be unique to this object.
     */

    public java.util.Map<String, PropertyDefinitionResponse> getPropertyDefinitions() {
        return propertyDefinitions;
    }

    /**
     * <p>
     * An object that maps strings to the property definitions in the component type. Each string in the mapping must be
     * unique to this object.
     * </p>
     * 
     * @param propertyDefinitions
     *        An object that maps strings to the property definitions in the component type. Each string in the mapping
     *        must be unique to this object.
     */

    public void setPropertyDefinitions(java.util.Map<String, PropertyDefinitionResponse> propertyDefinitions) {
        this.propertyDefinitions = propertyDefinitions;
    }

    /**
     * <p>
     * An object that maps strings to the property definitions in the component type. Each string in the mapping must be
     * unique to this object.
     * </p>
     * 
     * @param propertyDefinitions
     *        An object that maps strings to the property definitions in the component type. Each string in the mapping
     *        must be unique to this object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withPropertyDefinitions(java.util.Map<String, PropertyDefinitionResponse> propertyDefinitions) {
        setPropertyDefinitions(propertyDefinitions);
        return this;
    }

    /**
     * Add a single PropertyDefinitions entry
     *
     * @see GetComponentTypeResult#withPropertyDefinitions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult addPropertyDefinitionsEntry(String key, PropertyDefinitionResponse value) {
        if (null == this.propertyDefinitions) {
            this.propertyDefinitions = new java.util.HashMap<String, PropertyDefinitionResponse>();
        }
        if (this.propertyDefinitions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.propertyDefinitions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PropertyDefinitions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult clearPropertyDefinitionsEntries() {
        this.propertyDefinitions = null;
        return this;
    }

    /**
     * <p>
     * The name of the parent component type that this component type extends.
     * </p>
     * 
     * @return The name of the parent component type that this component type extends.
     */

    public java.util.List<String> getExtendsFrom() {
        return extendsFrom;
    }

    /**
     * <p>
     * The name of the parent component type that this component type extends.
     * </p>
     * 
     * @param extendsFrom
     *        The name of the parent component type that this component type extends.
     */

    public void setExtendsFrom(java.util.Collection<String> extendsFrom) {
        if (extendsFrom == null) {
            this.extendsFrom = null;
            return;
        }

        this.extendsFrom = new java.util.ArrayList<String>(extendsFrom);
    }

    /**
     * <p>
     * The name of the parent component type that this component type extends.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExtendsFrom(java.util.Collection)} or {@link #withExtendsFrom(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param extendsFrom
     *        The name of the parent component type that this component type extends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withExtendsFrom(String... extendsFrom) {
        if (this.extendsFrom == null) {
            setExtendsFrom(new java.util.ArrayList<String>(extendsFrom.length));
        }
        for (String ele : extendsFrom) {
            this.extendsFrom.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the parent component type that this component type extends.
     * </p>
     * 
     * @param extendsFrom
     *        The name of the parent component type that this component type extends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withExtendsFrom(java.util.Collection<String> extendsFrom) {
        setExtendsFrom(extendsFrom);
        return this;
    }

    /**
     * <p>
     * An object that maps strings to the functions in the component type. Each string in the mapping must be unique to
     * this object.
     * </p>
     * 
     * @return An object that maps strings to the functions in the component type. Each string in the mapping must be
     *         unique to this object.
     */

    public java.util.Map<String, FunctionResponse> getFunctions() {
        return functions;
    }

    /**
     * <p>
     * An object that maps strings to the functions in the component type. Each string in the mapping must be unique to
     * this object.
     * </p>
     * 
     * @param functions
     *        An object that maps strings to the functions in the component type. Each string in the mapping must be
     *        unique to this object.
     */

    public void setFunctions(java.util.Map<String, FunctionResponse> functions) {
        this.functions = functions;
    }

    /**
     * <p>
     * An object that maps strings to the functions in the component type. Each string in the mapping must be unique to
     * this object.
     * </p>
     * 
     * @param functions
     *        An object that maps strings to the functions in the component type. Each string in the mapping must be
     *        unique to this object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withFunctions(java.util.Map<String, FunctionResponse> functions) {
        setFunctions(functions);
        return this;
    }

    /**
     * Add a single Functions entry
     *
     * @see GetComponentTypeResult#withFunctions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult addFunctionsEntry(String key, FunctionResponse value) {
        if (null == this.functions) {
            this.functions = new java.util.HashMap<String, FunctionResponse>();
        }
        if (this.functions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.functions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Functions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult clearFunctionsEntries() {
        this.functions = null;
        return this;
    }

    /**
     * <p>
     * The date and time when the component type was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the component type was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time when the component type was created.
     * </p>
     * 
     * @return The date and time when the component type was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time when the component type was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the component type was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the component was last updated.
     * </p>
     * 
     * @param updateDateTime
     *        The date and time when the component was last updated.
     */

    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The date and time when the component was last updated.
     * </p>
     * 
     * @return The date and time when the component was last updated.
     */

    public java.util.Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <p>
     * The date and time when the component was last updated.
     * </p>
     * 
     * @param updateDateTime
     *        The date and time when the component was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withUpdateDateTime(java.util.Date updateDateTime) {
        setUpdateDateTime(updateDateTime);
        return this;
    }

    /**
     * <p>
     * The ARN of the component type.
     * </p>
     * 
     * @param arn
     *        The ARN of the component type.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the component type.
     * </p>
     * 
     * @return The ARN of the component type.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the component type.
     * </p>
     * 
     * @param arn
     *        The ARN of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the component type is abstract.
     * </p>
     * 
     * @param isAbstract
     *        A Boolean value that specifies whether the component type is abstract.
     */

    public void setIsAbstract(Boolean isAbstract) {
        this.isAbstract = isAbstract;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the component type is abstract.
     * </p>
     * 
     * @return A Boolean value that specifies whether the component type is abstract.
     */

    public Boolean getIsAbstract() {
        return this.isAbstract;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the component type is abstract.
     * </p>
     * 
     * @param isAbstract
     *        A Boolean value that specifies whether the component type is abstract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withIsAbstract(Boolean isAbstract) {
        setIsAbstract(isAbstract);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the component type is abstract.
     * </p>
     * 
     * @return A Boolean value that specifies whether the component type is abstract.
     */

    public Boolean isAbstract() {
        return this.isAbstract;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the component type has a schema initializer and that the schema
     * initializer has run.
     * </p>
     * 
     * @param isSchemaInitialized
     *        A Boolean value that specifies whether the component type has a schema initializer and that the schema
     *        initializer has run.
     */

    public void setIsSchemaInitialized(Boolean isSchemaInitialized) {
        this.isSchemaInitialized = isSchemaInitialized;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the component type has a schema initializer and that the schema
     * initializer has run.
     * </p>
     * 
     * @return A Boolean value that specifies whether the component type has a schema initializer and that the schema
     *         initializer has run.
     */

    public Boolean getIsSchemaInitialized() {
        return this.isSchemaInitialized;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the component type has a schema initializer and that the schema
     * initializer has run.
     * </p>
     * 
     * @param isSchemaInitialized
     *        A Boolean value that specifies whether the component type has a schema initializer and that the schema
     *        initializer has run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withIsSchemaInitialized(Boolean isSchemaInitialized) {
        setIsSchemaInitialized(isSchemaInitialized);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the component type has a schema initializer and that the schema
     * initializer has run.
     * </p>
     * 
     * @return A Boolean value that specifies whether the component type has a schema initializer and that the schema
     *         initializer has run.
     */

    public Boolean isSchemaInitialized() {
        return this.isSchemaInitialized;
    }

    /**
     * <p>
     * The current status of the component type.
     * </p>
     * 
     * @param status
     *        The current status of the component type.
     */

    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the component type.
     * </p>
     * 
     * @return The current status of the component type.
     */

    public Status getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the component type.
     * </p>
     * 
     * @param status
     *        The current status of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withStatus(Status status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 250.
     * </p>
     * 
     * @return The maximum number of results to return at one time. The default is 25.</p>
     *         <p>
     *         Valid Range: Minimum value of 1. Maximum value of 250.
     */

    public java.util.Map<String, PropertyGroupResponse> getPropertyGroups() {
        return propertyGroups;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 250.
     * </p>
     * 
     * @param propertyGroups
     *        The maximum number of results to return at one time. The default is 25.</p>
     *        <p>
     *        Valid Range: Minimum value of 1. Maximum value of 250.
     */

    public void setPropertyGroups(java.util.Map<String, PropertyGroupResponse> propertyGroups) {
        this.propertyGroups = propertyGroups;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 250.
     * </p>
     * 
     * @param propertyGroups
     *        The maximum number of results to return at one time. The default is 25.</p>
     *        <p>
     *        Valid Range: Minimum value of 1. Maximum value of 250.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withPropertyGroups(java.util.Map<String, PropertyGroupResponse> propertyGroups) {
        setPropertyGroups(propertyGroups);
        return this;
    }

    /**
     * Add a single PropertyGroups entry
     *
     * @see GetComponentTypeResult#withPropertyGroups
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult addPropertyGroupsEntry(String key, PropertyGroupResponse value) {
        if (null == this.propertyGroups) {
            this.propertyGroups = new java.util.HashMap<String, PropertyGroupResponse>();
        }
        if (this.propertyGroups.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.propertyGroups.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PropertyGroups.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult clearPropertyGroupsEntries() {
        this.propertyGroups = null;
        return this;
    }

    /**
     * <p>
     * The syncSource of the sync job, if this entity was created by a sync job.
     * </p>
     * 
     * @param syncSource
     *        The syncSource of the sync job, if this entity was created by a sync job.
     */

    public void setSyncSource(String syncSource) {
        this.syncSource = syncSource;
    }

    /**
     * <p>
     * The syncSource of the sync job, if this entity was created by a sync job.
     * </p>
     * 
     * @return The syncSource of the sync job, if this entity was created by a sync job.
     */

    public String getSyncSource() {
        return this.syncSource;
    }

    /**
     * <p>
     * The syncSource of the sync job, if this entity was created by a sync job.
     * </p>
     * 
     * @param syncSource
     *        The syncSource of the sync job, if this entity was created by a sync job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withSyncSource(String syncSource) {
        setSyncSource(syncSource);
        return this;
    }

    /**
     * <p>
     * The component type name.
     * </p>
     * 
     * @param componentTypeName
     *        The component type name.
     */

    public void setComponentTypeName(String componentTypeName) {
        this.componentTypeName = componentTypeName;
    }

    /**
     * <p>
     * The component type name.
     * </p>
     * 
     * @return The component type name.
     */

    public String getComponentTypeName() {
        return this.componentTypeName;
    }

    /**
     * <p>
     * The component type name.
     * </p>
     * 
     * @param componentTypeName
     *        The component type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentTypeResult withComponentTypeName(String componentTypeName) {
        setComponentTypeName(componentTypeName);
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getIsSingleton() != null)
            sb.append("IsSingleton: ").append(getIsSingleton()).append(",");
        if (getComponentTypeId() != null)
            sb.append("ComponentTypeId: ").append(getComponentTypeId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPropertyDefinitions() != null)
            sb.append("PropertyDefinitions: ").append(getPropertyDefinitions()).append(",");
        if (getExtendsFrom() != null)
            sb.append("ExtendsFrom: ").append(getExtendsFrom()).append(",");
        if (getFunctions() != null)
            sb.append("Functions: ").append(getFunctions()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: ").append(getUpdateDateTime()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getIsAbstract() != null)
            sb.append("IsAbstract: ").append(getIsAbstract()).append(",");
        if (getIsSchemaInitialized() != null)
            sb.append("IsSchemaInitialized: ").append(getIsSchemaInitialized()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPropertyGroups() != null)
            sb.append("PropertyGroups: ").append(getPropertyGroups()).append(",");
        if (getSyncSource() != null)
            sb.append("SyncSource: ").append(getSyncSource()).append(",");
        if (getComponentTypeName() != null)
            sb.append("ComponentTypeName: ").append(getComponentTypeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComponentTypeResult == false)
            return false;
        GetComponentTypeResult other = (GetComponentTypeResult) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getIsSingleton() == null ^ this.getIsSingleton() == null)
            return false;
        if (other.getIsSingleton() != null && other.getIsSingleton().equals(this.getIsSingleton()) == false)
            return false;
        if (other.getComponentTypeId() == null ^ this.getComponentTypeId() == null)
            return false;
        if (other.getComponentTypeId() != null && other.getComponentTypeId().equals(this.getComponentTypeId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPropertyDefinitions() == null ^ this.getPropertyDefinitions() == null)
            return false;
        if (other.getPropertyDefinitions() != null && other.getPropertyDefinitions().equals(this.getPropertyDefinitions()) == false)
            return false;
        if (other.getExtendsFrom() == null ^ this.getExtendsFrom() == null)
            return false;
        if (other.getExtendsFrom() != null && other.getExtendsFrom().equals(this.getExtendsFrom()) == false)
            return false;
        if (other.getFunctions() == null ^ this.getFunctions() == null)
            return false;
        if (other.getFunctions() != null && other.getFunctions().equals(this.getFunctions()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getIsAbstract() == null ^ this.getIsAbstract() == null)
            return false;
        if (other.getIsAbstract() != null && other.getIsAbstract().equals(this.getIsAbstract()) == false)
            return false;
        if (other.getIsSchemaInitialized() == null ^ this.getIsSchemaInitialized() == null)
            return false;
        if (other.getIsSchemaInitialized() != null && other.getIsSchemaInitialized().equals(this.getIsSchemaInitialized()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPropertyGroups() == null ^ this.getPropertyGroups() == null)
            return false;
        if (other.getPropertyGroups() != null && other.getPropertyGroups().equals(this.getPropertyGroups()) == false)
            return false;
        if (other.getSyncSource() == null ^ this.getSyncSource() == null)
            return false;
        if (other.getSyncSource() != null && other.getSyncSource().equals(this.getSyncSource()) == false)
            return false;
        if (other.getComponentTypeName() == null ^ this.getComponentTypeName() == null)
            return false;
        if (other.getComponentTypeName() != null && other.getComponentTypeName().equals(this.getComponentTypeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getIsSingleton() == null) ? 0 : getIsSingleton().hashCode());
        hashCode = prime * hashCode + ((getComponentTypeId() == null) ? 0 : getComponentTypeId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPropertyDefinitions() == null) ? 0 : getPropertyDefinitions().hashCode());
        hashCode = prime * hashCode + ((getExtendsFrom() == null) ? 0 : getExtendsFrom().hashCode());
        hashCode = prime * hashCode + ((getFunctions() == null) ? 0 : getFunctions().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getIsAbstract() == null) ? 0 : getIsAbstract().hashCode());
        hashCode = prime * hashCode + ((getIsSchemaInitialized() == null) ? 0 : getIsSchemaInitialized().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPropertyGroups() == null) ? 0 : getPropertyGroups().hashCode());
        hashCode = prime * hashCode + ((getSyncSource() == null) ? 0 : getSyncSource().hashCode());
        hashCode = prime * hashCode + ((getComponentTypeName() == null) ? 0 : getComponentTypeName().hashCode());
        return hashCode;
    }

    @Override
    public GetComponentTypeResult clone() {
        try {
            return (GetComponentTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

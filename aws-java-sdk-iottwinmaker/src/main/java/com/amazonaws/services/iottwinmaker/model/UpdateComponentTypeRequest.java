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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateComponentType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateComponentTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workspace.
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
    private java.util.Map<String, PropertyDefinitionRequest> propertyDefinitions;
    /**
     * <p>
     * Specifies the component type that this component type extends.
     * </p>
     */
    private java.util.List<String> extendsFrom;
    /**
     * <p>
     * An object that maps strings to the functions in the component type. Each string in the mapping must be unique to
     * this object.
     * </p>
     */
    private java.util.Map<String, FunctionRequest> functions;
    /**
     * <p>
     * The property groups
     * </p>
     */
    private java.util.Map<String, PropertyGroupRequest> propertyGroups;
    /**
     * <p>
     * The component type name.
     * </p>
     */
    private String componentTypeName;

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @return The ID of the workspace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentTypeRequest withWorkspaceId(String workspaceId) {
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

    public UpdateComponentTypeRequest withIsSingleton(Boolean isSingleton) {
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

    public UpdateComponentTypeRequest withComponentTypeId(String componentTypeId) {
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

    public UpdateComponentTypeRequest withDescription(String description) {
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

    public java.util.Map<String, PropertyDefinitionRequest> getPropertyDefinitions() {
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

    public void setPropertyDefinitions(java.util.Map<String, PropertyDefinitionRequest> propertyDefinitions) {
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

    public UpdateComponentTypeRequest withPropertyDefinitions(java.util.Map<String, PropertyDefinitionRequest> propertyDefinitions) {
        setPropertyDefinitions(propertyDefinitions);
        return this;
    }

    /**
     * Add a single PropertyDefinitions entry
     *
     * @see UpdateComponentTypeRequest#withPropertyDefinitions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentTypeRequest addPropertyDefinitionsEntry(String key, PropertyDefinitionRequest value) {
        if (null == this.propertyDefinitions) {
            this.propertyDefinitions = new java.util.HashMap<String, PropertyDefinitionRequest>();
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

    public UpdateComponentTypeRequest clearPropertyDefinitionsEntries() {
        this.propertyDefinitions = null;
        return this;
    }

    /**
     * <p>
     * Specifies the component type that this component type extends.
     * </p>
     * 
     * @return Specifies the component type that this component type extends.
     */

    public java.util.List<String> getExtendsFrom() {
        return extendsFrom;
    }

    /**
     * <p>
     * Specifies the component type that this component type extends.
     * </p>
     * 
     * @param extendsFrom
     *        Specifies the component type that this component type extends.
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
     * Specifies the component type that this component type extends.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExtendsFrom(java.util.Collection)} or {@link #withExtendsFrom(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param extendsFrom
     *        Specifies the component type that this component type extends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentTypeRequest withExtendsFrom(String... extendsFrom) {
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
     * Specifies the component type that this component type extends.
     * </p>
     * 
     * @param extendsFrom
     *        Specifies the component type that this component type extends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentTypeRequest withExtendsFrom(java.util.Collection<String> extendsFrom) {
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

    public java.util.Map<String, FunctionRequest> getFunctions() {
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

    public void setFunctions(java.util.Map<String, FunctionRequest> functions) {
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

    public UpdateComponentTypeRequest withFunctions(java.util.Map<String, FunctionRequest> functions) {
        setFunctions(functions);
        return this;
    }

    /**
     * Add a single Functions entry
     *
     * @see UpdateComponentTypeRequest#withFunctions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentTypeRequest addFunctionsEntry(String key, FunctionRequest value) {
        if (null == this.functions) {
            this.functions = new java.util.HashMap<String, FunctionRequest>();
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

    public UpdateComponentTypeRequest clearFunctionsEntries() {
        this.functions = null;
        return this;
    }

    /**
     * <p>
     * The property groups
     * </p>
     * 
     * @return The property groups
     */

    public java.util.Map<String, PropertyGroupRequest> getPropertyGroups() {
        return propertyGroups;
    }

    /**
     * <p>
     * The property groups
     * </p>
     * 
     * @param propertyGroups
     *        The property groups
     */

    public void setPropertyGroups(java.util.Map<String, PropertyGroupRequest> propertyGroups) {
        this.propertyGroups = propertyGroups;
    }

    /**
     * <p>
     * The property groups
     * </p>
     * 
     * @param propertyGroups
     *        The property groups
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentTypeRequest withPropertyGroups(java.util.Map<String, PropertyGroupRequest> propertyGroups) {
        setPropertyGroups(propertyGroups);
        return this;
    }

    /**
     * Add a single PropertyGroups entry
     *
     * @see UpdateComponentTypeRequest#withPropertyGroups
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentTypeRequest addPropertyGroupsEntry(String key, PropertyGroupRequest value) {
        if (null == this.propertyGroups) {
            this.propertyGroups = new java.util.HashMap<String, PropertyGroupRequest>();
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

    public UpdateComponentTypeRequest clearPropertyGroupsEntries() {
        this.propertyGroups = null;
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

    public UpdateComponentTypeRequest withComponentTypeName(String componentTypeName) {
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
        if (getPropertyGroups() != null)
            sb.append("PropertyGroups: ").append(getPropertyGroups()).append(",");
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

        if (obj instanceof UpdateComponentTypeRequest == false)
            return false;
        UpdateComponentTypeRequest other = (UpdateComponentTypeRequest) obj;
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
        if (other.getPropertyGroups() == null ^ this.getPropertyGroups() == null)
            return false;
        if (other.getPropertyGroups() != null && other.getPropertyGroups().equals(this.getPropertyGroups()) == false)
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
        hashCode = prime * hashCode + ((getPropertyGroups() == null) ? 0 : getPropertyGroups().hashCode());
        hashCode = prime * hashCode + ((getComponentTypeName() == null) ? 0 : getComponentTypeName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateComponentTypeRequest clone() {
        return (UpdateComponentTypeRequest) super.clone();
    }

}

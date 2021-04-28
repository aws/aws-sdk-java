/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A network that is used by a studio’s users and workflows, including render farm, Active Directory, licensing, and
 * file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StudioComponent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StudioComponent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The configuration of the studio component, based on component type.
     * </p>
     */
    private StudioComponentConfiguration configuration;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user ID of the user that created the studio component.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * A human-readable description for the studio component resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The EC2 security groups that control access to the studio component.
     * </p>
     */
    private java.util.List<String> ec2SecurityGroupIds;
    /**
     * <p>
     * Initialization scripts for studio components.
     * </p>
     */
    private java.util.List<StudioComponentInitializationScript> initializationScripts;
    /**
     * <p>
     * A friendly name for the studio component resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Parameters for the studio component scripts.
     * </p>
     */
    private java.util.List<ScriptParameterKeyValue> scriptParameters;
    /**
     * <p>
     * The current state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The status code.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * The status message for the studio component.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     */
    private String studioComponentId;
    /**
     * <p>
     * The specific subtype of a studio component.
     * </p>
     */
    private String subtype;
    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The type of the studio component.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @return The ARN of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The configuration of the studio component, based on component type.
     * </p>
     * 
     * @param configuration
     *        The configuration of the studio component, based on component type.
     */

    public void setConfiguration(StudioComponentConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration of the studio component, based on component type.
     * </p>
     * 
     * @return The configuration of the studio component, based on component type.
     */

    public StudioComponentConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration of the studio component, based on component type.
     * </p>
     * 
     * @param configuration
     *        The configuration of the studio component, based on component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withConfiguration(StudioComponentConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that created the studio component.
     * </p>
     * 
     * @param createdBy
     *        The user ID of the user that created the studio component.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user ID of the user that created the studio component.
     * </p>
     * 
     * @return The user ID of the user that created the studio component.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user ID of the user that created the studio component.
     * </p>
     * 
     * @param createdBy
     *        The user ID of the user that created the studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * A human-readable description for the studio component resource.
     * </p>
     * 
     * @param description
     *        A human-readable description for the studio component resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A human-readable description for the studio component resource.
     * </p>
     * 
     * @return A human-readable description for the studio component resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A human-readable description for the studio component resource.
     * </p>
     * 
     * @param description
     *        A human-readable description for the studio component resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The EC2 security groups that control access to the studio component.
     * </p>
     * 
     * @return The EC2 security groups that control access to the studio component.
     */

    public java.util.List<String> getEc2SecurityGroupIds() {
        return ec2SecurityGroupIds;
    }

    /**
     * <p>
     * The EC2 security groups that control access to the studio component.
     * </p>
     * 
     * @param ec2SecurityGroupIds
     *        The EC2 security groups that control access to the studio component.
     */

    public void setEc2SecurityGroupIds(java.util.Collection<String> ec2SecurityGroupIds) {
        if (ec2SecurityGroupIds == null) {
            this.ec2SecurityGroupIds = null;
            return;
        }

        this.ec2SecurityGroupIds = new java.util.ArrayList<String>(ec2SecurityGroupIds);
    }

    /**
     * <p>
     * The EC2 security groups that control access to the studio component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2SecurityGroupIds(java.util.Collection)} or {@link #withEc2SecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param ec2SecurityGroupIds
     *        The EC2 security groups that control access to the studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withEc2SecurityGroupIds(String... ec2SecurityGroupIds) {
        if (this.ec2SecurityGroupIds == null) {
            setEc2SecurityGroupIds(new java.util.ArrayList<String>(ec2SecurityGroupIds.length));
        }
        for (String ele : ec2SecurityGroupIds) {
            this.ec2SecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 security groups that control access to the studio component.
     * </p>
     * 
     * @param ec2SecurityGroupIds
     *        The EC2 security groups that control access to the studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withEc2SecurityGroupIds(java.util.Collection<String> ec2SecurityGroupIds) {
        setEc2SecurityGroupIds(ec2SecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * Initialization scripts for studio components.
     * </p>
     * 
     * @return Initialization scripts for studio components.
     */

    public java.util.List<StudioComponentInitializationScript> getInitializationScripts() {
        return initializationScripts;
    }

    /**
     * <p>
     * Initialization scripts for studio components.
     * </p>
     * 
     * @param initializationScripts
     *        Initialization scripts for studio components.
     */

    public void setInitializationScripts(java.util.Collection<StudioComponentInitializationScript> initializationScripts) {
        if (initializationScripts == null) {
            this.initializationScripts = null;
            return;
        }

        this.initializationScripts = new java.util.ArrayList<StudioComponentInitializationScript>(initializationScripts);
    }

    /**
     * <p>
     * Initialization scripts for studio components.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInitializationScripts(java.util.Collection)} or
     * {@link #withInitializationScripts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param initializationScripts
     *        Initialization scripts for studio components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withInitializationScripts(StudioComponentInitializationScript... initializationScripts) {
        if (this.initializationScripts == null) {
            setInitializationScripts(new java.util.ArrayList<StudioComponentInitializationScript>(initializationScripts.length));
        }
        for (StudioComponentInitializationScript ele : initializationScripts) {
            this.initializationScripts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Initialization scripts for studio components.
     * </p>
     * 
     * @param initializationScripts
     *        Initialization scripts for studio components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withInitializationScripts(java.util.Collection<StudioComponentInitializationScript> initializationScripts) {
        setInitializationScripts(initializationScripts);
        return this;
    }

    /**
     * <p>
     * A friendly name for the studio component resource.
     * </p>
     * 
     * @param name
     *        A friendly name for the studio component resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name for the studio component resource.
     * </p>
     * 
     * @return A friendly name for the studio component resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name for the studio component resource.
     * </p>
     * 
     * @param name
     *        A friendly name for the studio component resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Parameters for the studio component scripts.
     * </p>
     * 
     * @return Parameters for the studio component scripts.
     */

    public java.util.List<ScriptParameterKeyValue> getScriptParameters() {
        return scriptParameters;
    }

    /**
     * <p>
     * Parameters for the studio component scripts.
     * </p>
     * 
     * @param scriptParameters
     *        Parameters for the studio component scripts.
     */

    public void setScriptParameters(java.util.Collection<ScriptParameterKeyValue> scriptParameters) {
        if (scriptParameters == null) {
            this.scriptParameters = null;
            return;
        }

        this.scriptParameters = new java.util.ArrayList<ScriptParameterKeyValue>(scriptParameters);
    }

    /**
     * <p>
     * Parameters for the studio component scripts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScriptParameters(java.util.Collection)} or {@link #withScriptParameters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scriptParameters
     *        Parameters for the studio component scripts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withScriptParameters(ScriptParameterKeyValue... scriptParameters) {
        if (this.scriptParameters == null) {
            setScriptParameters(new java.util.ArrayList<ScriptParameterKeyValue>(scriptParameters.length));
        }
        for (ScriptParameterKeyValue ele : scriptParameters) {
            this.scriptParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Parameters for the studio component scripts.
     * </p>
     * 
     * @param scriptParameters
     *        Parameters for the studio component scripts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withScriptParameters(java.util.Collection<ScriptParameterKeyValue> scriptParameters) {
        setScriptParameters(scriptParameters);
        return this;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @see StudioComponentState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @return The current state.
     * @see StudioComponentState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioComponentState
     */

    public StudioComponent withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioComponentState
     */

    public StudioComponent withState(StudioComponentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param statusCode
     *        The status code.
     * @see StudioComponentStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @return The status code.
     * @see StudioComponentStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param statusCode
     *        The status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioComponentStatusCode
     */

    public StudioComponent withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param statusCode
     *        The status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioComponentStatusCode
     */

    public StudioComponent withStatusCode(StudioComponentStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the studio component.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the studio component.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the studio component.
     * </p>
     * 
     * @return The status message for the studio component.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for the studio component.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     * 
     * @param studioComponentId
     *        The unique identifier for a studio component resource.
     */

    public void setStudioComponentId(String studioComponentId) {
        this.studioComponentId = studioComponentId;
    }

    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     * 
     * @return The unique identifier for a studio component resource.
     */

    public String getStudioComponentId() {
        return this.studioComponentId;
    }

    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     * 
     * @param studioComponentId
     *        The unique identifier for a studio component resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withStudioComponentId(String studioComponentId) {
        setStudioComponentId(studioComponentId);
        return this;
    }

    /**
     * <p>
     * The specific subtype of a studio component.
     * </p>
     * 
     * @param subtype
     *        The specific subtype of a studio component.
     * @see StudioComponentSubtype
     */

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    /**
     * <p>
     * The specific subtype of a studio component.
     * </p>
     * 
     * @return The specific subtype of a studio component.
     * @see StudioComponentSubtype
     */

    public String getSubtype() {
        return this.subtype;
    }

    /**
     * <p>
     * The specific subtype of a studio component.
     * </p>
     * 
     * @param subtype
     *        The specific subtype of a studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioComponentSubtype
     */

    public StudioComponent withSubtype(String subtype) {
        setSubtype(subtype);
        return this;
    }

    /**
     * <p>
     * The specific subtype of a studio component.
     * </p>
     * 
     * @param subtype
     *        The specific subtype of a studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioComponentSubtype
     */

    public StudioComponent withSubtype(StudioComponentSubtype subtype) {
        this.subtype = subtype.toString();
        return this;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @return A collection of labels, in the form of key:value pairs, that apply to this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key:value pairs, that apply to this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key:value pairs, that apply to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StudioComponent#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent addTagsEntry(String key, String value) {
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

    public StudioComponent clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of the studio component.
     * </p>
     * 
     * @param type
     *        The type of the studio component.
     * @see StudioComponentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the studio component.
     * </p>
     * 
     * @return The type of the studio component.
     * @see StudioComponentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the studio component.
     * </p>
     * 
     * @param type
     *        The type of the studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioComponentType
     */

    public StudioComponent withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the studio component.
     * </p>
     * 
     * @param type
     *        The type of the studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioComponentType
     */

    public StudioComponent withType(StudioComponentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix epoch timestamp in seconds for when the resource was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix epoch timestamp in seconds for when the resource was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     * 
     * @param updatedBy
     *        The user ID of the user that most recently updated the resource.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     * 
     * @return The user ID of the user that most recently updated the resource.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     * 
     * @param updatedBy
     *        The user ID of the user that most recently updated the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponent withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEc2SecurityGroupIds() != null)
            sb.append("Ec2SecurityGroupIds: ").append(getEc2SecurityGroupIds()).append(",");
        if (getInitializationScripts() != null)
            sb.append("InitializationScripts: ").append(getInitializationScripts()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getScriptParameters() != null)
            sb.append("ScriptParameters: ").append(getScriptParameters()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStudioComponentId() != null)
            sb.append("StudioComponentId: ").append(getStudioComponentId()).append(",");
        if (getSubtype() != null)
            sb.append("Subtype: ").append(getSubtype()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StudioComponent == false)
            return false;
        StudioComponent other = (StudioComponent) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEc2SecurityGroupIds() == null ^ this.getEc2SecurityGroupIds() == null)
            return false;
        if (other.getEc2SecurityGroupIds() != null && other.getEc2SecurityGroupIds().equals(this.getEc2SecurityGroupIds()) == false)
            return false;
        if (other.getInitializationScripts() == null ^ this.getInitializationScripts() == null)
            return false;
        if (other.getInitializationScripts() != null && other.getInitializationScripts().equals(this.getInitializationScripts()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScriptParameters() == null ^ this.getScriptParameters() == null)
            return false;
        if (other.getScriptParameters() != null && other.getScriptParameters().equals(this.getScriptParameters()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStudioComponentId() == null ^ this.getStudioComponentId() == null)
            return false;
        if (other.getStudioComponentId() != null && other.getStudioComponentId().equals(this.getStudioComponentId()) == false)
            return false;
        if (other.getSubtype() == null ^ this.getSubtype() == null)
            return false;
        if (other.getSubtype() != null && other.getSubtype().equals(this.getSubtype()) == false)
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
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEc2SecurityGroupIds() == null) ? 0 : getEc2SecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getInitializationScripts() == null) ? 0 : getInitializationScripts().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScriptParameters() == null) ? 0 : getScriptParameters().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStudioComponentId() == null) ? 0 : getStudioComponentId().hashCode());
        hashCode = prime * hashCode + ((getSubtype() == null) ? 0 : getSubtype().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public StudioComponent clone() {
        try {
            return (StudioComponent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StudioComponentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

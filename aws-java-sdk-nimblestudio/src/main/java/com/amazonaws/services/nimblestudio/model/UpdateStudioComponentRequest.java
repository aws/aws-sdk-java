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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The studio component ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateStudioComponent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStudioComponentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The configuration of the studio component, based on component type.
     * </p>
     */
    private StudioComponentConfiguration configuration;
    /**
     * <p>
     * The description.
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
     * The name for the studio component.
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
     * The studio component ID.
     * </p>
     */
    private String studioComponentId;
    /**
     * <p>
     * The studio ID.
     * </p>
     */
    private String studioId;
    /**
     * <p>
     * The specific subtype of a studio component.
     * </p>
     */
    private String subtype;
    /**
     * <p>
     * The type of the studio component.
     * </p>
     */
    private String type;

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     * 
     * @param clientToken
     *        To make an idempotent API request using one of these actions, specify a client token in the request. You
     *        should not reuse the same client token for other API requests. If you retry a request that completed
     *        successfully using the same client token and the same parameters, the retry succeeds without performing
     *        any further actions. If you retry a successful request using the same client token, but one or more of the
     *        parameters are different, the retry fails with a ValidationException error.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     * 
     * @return To make an idempotent API request using one of these actions, specify a client token in the request. You
     *         should not reuse the same client token for other API requests. If you retry a request that completed
     *         successfully using the same client token and the same parameters, the retry succeeds without performing
     *         any further actions. If you retry a successful request using the same client token, but one or more of
     *         the parameters are different, the retry fails with a ValidationException error.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     * 
     * @param clientToken
     *        To make an idempotent API request using one of these actions, specify a client token in the request. You
     *        should not reuse the same client token for other API requests. If you retry a request that completed
     *        successfully using the same client token and the same parameters, the retry succeeds without performing
     *        any further actions. If you retry a successful request using the same client token, but one or more of the
     *        parameters are different, the retry fails with a ValidationException error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioComponentRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public UpdateStudioComponentRequest withConfiguration(StudioComponentConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @return The description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioComponentRequest withDescription(String description) {
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

    public UpdateStudioComponentRequest withEc2SecurityGroupIds(String... ec2SecurityGroupIds) {
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

    public UpdateStudioComponentRequest withEc2SecurityGroupIds(java.util.Collection<String> ec2SecurityGroupIds) {
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

    public UpdateStudioComponentRequest withInitializationScripts(StudioComponentInitializationScript... initializationScripts) {
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

    public UpdateStudioComponentRequest withInitializationScripts(java.util.Collection<StudioComponentInitializationScript> initializationScripts) {
        setInitializationScripts(initializationScripts);
        return this;
    }

    /**
     * <p>
     * The name for the studio component.
     * </p>
     * 
     * @param name
     *        The name for the studio component.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the studio component.
     * </p>
     * 
     * @return The name for the studio component.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the studio component.
     * </p>
     * 
     * @param name
     *        The name for the studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioComponentRequest withName(String name) {
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

    public UpdateStudioComponentRequest withScriptParameters(ScriptParameterKeyValue... scriptParameters) {
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

    public UpdateStudioComponentRequest withScriptParameters(java.util.Collection<ScriptParameterKeyValue> scriptParameters) {
        setScriptParameters(scriptParameters);
        return this;
    }

    /**
     * <p>
     * The studio component ID.
     * </p>
     * 
     * @param studioComponentId
     *        The studio component ID.
     */

    public void setStudioComponentId(String studioComponentId) {
        this.studioComponentId = studioComponentId;
    }

    /**
     * <p>
     * The studio component ID.
     * </p>
     * 
     * @return The studio component ID.
     */

    public String getStudioComponentId() {
        return this.studioComponentId;
    }

    /**
     * <p>
     * The studio component ID.
     * </p>
     * 
     * @param studioComponentId
     *        The studio component ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioComponentRequest withStudioComponentId(String studioComponentId) {
        setStudioComponentId(studioComponentId);
        return this;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @return The studio ID.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioComponentRequest withStudioId(String studioId) {
        setStudioId(studioId);
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

    public UpdateStudioComponentRequest withSubtype(String subtype) {
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

    public UpdateStudioComponentRequest withSubtype(StudioComponentSubtype subtype) {
        this.subtype = subtype.toString();
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

    public UpdateStudioComponentRequest withType(String type) {
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

    public UpdateStudioComponentRequest withType(StudioComponentType type) {
        this.type = type.toString();
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
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
        if (getStudioComponentId() != null)
            sb.append("StudioComponentId: ").append(getStudioComponentId()).append(",");
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId()).append(",");
        if (getSubtype() != null)
            sb.append("Subtype: ").append(getSubtype()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStudioComponentRequest == false)
            return false;
        UpdateStudioComponentRequest other = (UpdateStudioComponentRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
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
        if (other.getStudioComponentId() == null ^ this.getStudioComponentId() == null)
            return false;
        if (other.getStudioComponentId() != null && other.getStudioComponentId().equals(this.getStudioComponentId()) == false)
            return false;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        if (other.getSubtype() == null ^ this.getSubtype() == null)
            return false;
        if (other.getSubtype() != null && other.getSubtype().equals(this.getSubtype()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEc2SecurityGroupIds() == null) ? 0 : getEc2SecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getInitializationScripts() == null) ? 0 : getInitializationScripts().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScriptParameters() == null) ? 0 : getScriptParameters().hashCode());
        hashCode = prime * hashCode + ((getStudioComponentId() == null) ? 0 : getStudioComponentId().hashCode());
        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        hashCode = prime * hashCode + ((getSubtype() == null) ? 0 : getSubtype().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStudioComponentRequest clone() {
        return (UpdateStudioComponentRequest) super.clone();
    }

}

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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the code generation job configuration for a React project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ReactStartCodegenJobData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReactStartCodegenJobData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The JavaScript module type.
     * </p>
     */
    private String module;
    /**
     * <p>
     * The ECMAScript specification to use.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The file type to use for a JavaScript project.
     * </p>
     */
    private String script;
    /**
     * <p>
     * Specifies whether the code generation job should render type declaration files.
     * </p>
     */
    private Boolean renderTypeDeclarations;
    /**
     * <p>
     * Specifies whether the code generation job should render inline source maps.
     * </p>
     */
    private Boolean inlineSourceMap;
    /**
     * <p>
     * The API configuration for the code generation job.
     * </p>
     */
    private ApiConfiguration apiConfiguration;
    /**
     * <p>
     * Lists the dependency packages that may be required for the project code to run.
     * </p>
     */
    private java.util.Map<String, String> dependencies;

    /**
     * <p>
     * The JavaScript module type.
     * </p>
     * 
     * @param module
     *        The JavaScript module type.
     * @see JSModule
     */

    public void setModule(String module) {
        this.module = module;
    }

    /**
     * <p>
     * The JavaScript module type.
     * </p>
     * 
     * @return The JavaScript module type.
     * @see JSModule
     */

    public String getModule() {
        return this.module;
    }

    /**
     * <p>
     * The JavaScript module type.
     * </p>
     * 
     * @param module
     *        The JavaScript module type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JSModule
     */

    public ReactStartCodegenJobData withModule(String module) {
        setModule(module);
        return this;
    }

    /**
     * <p>
     * The JavaScript module type.
     * </p>
     * 
     * @param module
     *        The JavaScript module type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JSModule
     */

    public ReactStartCodegenJobData withModule(JSModule module) {
        this.module = module.toString();
        return this;
    }

    /**
     * <p>
     * The ECMAScript specification to use.
     * </p>
     * 
     * @param target
     *        The ECMAScript specification to use.
     * @see JSTarget
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The ECMAScript specification to use.
     * </p>
     * 
     * @return The ECMAScript specification to use.
     * @see JSTarget
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The ECMAScript specification to use.
     * </p>
     * 
     * @param target
     *        The ECMAScript specification to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JSTarget
     */

    public ReactStartCodegenJobData withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The ECMAScript specification to use.
     * </p>
     * 
     * @param target
     *        The ECMAScript specification to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JSTarget
     */

    public ReactStartCodegenJobData withTarget(JSTarget target) {
        this.target = target.toString();
        return this;
    }

    /**
     * <p>
     * The file type to use for a JavaScript project.
     * </p>
     * 
     * @param script
     *        The file type to use for a JavaScript project.
     * @see JSScript
     */

    public void setScript(String script) {
        this.script = script;
    }

    /**
     * <p>
     * The file type to use for a JavaScript project.
     * </p>
     * 
     * @return The file type to use for a JavaScript project.
     * @see JSScript
     */

    public String getScript() {
        return this.script;
    }

    /**
     * <p>
     * The file type to use for a JavaScript project.
     * </p>
     * 
     * @param script
     *        The file type to use for a JavaScript project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JSScript
     */

    public ReactStartCodegenJobData withScript(String script) {
        setScript(script);
        return this;
    }

    /**
     * <p>
     * The file type to use for a JavaScript project.
     * </p>
     * 
     * @param script
     *        The file type to use for a JavaScript project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JSScript
     */

    public ReactStartCodegenJobData withScript(JSScript script) {
        this.script = script.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the code generation job should render type declaration files.
     * </p>
     * 
     * @param renderTypeDeclarations
     *        Specifies whether the code generation job should render type declaration files.
     */

    public void setRenderTypeDeclarations(Boolean renderTypeDeclarations) {
        this.renderTypeDeclarations = renderTypeDeclarations;
    }

    /**
     * <p>
     * Specifies whether the code generation job should render type declaration files.
     * </p>
     * 
     * @return Specifies whether the code generation job should render type declaration files.
     */

    public Boolean getRenderTypeDeclarations() {
        return this.renderTypeDeclarations;
    }

    /**
     * <p>
     * Specifies whether the code generation job should render type declaration files.
     * </p>
     * 
     * @param renderTypeDeclarations
     *        Specifies whether the code generation job should render type declaration files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactStartCodegenJobData withRenderTypeDeclarations(Boolean renderTypeDeclarations) {
        setRenderTypeDeclarations(renderTypeDeclarations);
        return this;
    }

    /**
     * <p>
     * Specifies whether the code generation job should render type declaration files.
     * </p>
     * 
     * @return Specifies whether the code generation job should render type declaration files.
     */

    public Boolean isRenderTypeDeclarations() {
        return this.renderTypeDeclarations;
    }

    /**
     * <p>
     * Specifies whether the code generation job should render inline source maps.
     * </p>
     * 
     * @param inlineSourceMap
     *        Specifies whether the code generation job should render inline source maps.
     */

    public void setInlineSourceMap(Boolean inlineSourceMap) {
        this.inlineSourceMap = inlineSourceMap;
    }

    /**
     * <p>
     * Specifies whether the code generation job should render inline source maps.
     * </p>
     * 
     * @return Specifies whether the code generation job should render inline source maps.
     */

    public Boolean getInlineSourceMap() {
        return this.inlineSourceMap;
    }

    /**
     * <p>
     * Specifies whether the code generation job should render inline source maps.
     * </p>
     * 
     * @param inlineSourceMap
     *        Specifies whether the code generation job should render inline source maps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactStartCodegenJobData withInlineSourceMap(Boolean inlineSourceMap) {
        setInlineSourceMap(inlineSourceMap);
        return this;
    }

    /**
     * <p>
     * Specifies whether the code generation job should render inline source maps.
     * </p>
     * 
     * @return Specifies whether the code generation job should render inline source maps.
     */

    public Boolean isInlineSourceMap() {
        return this.inlineSourceMap;
    }

    /**
     * <p>
     * The API configuration for the code generation job.
     * </p>
     * 
     * @param apiConfiguration
     *        The API configuration for the code generation job.
     */

    public void setApiConfiguration(ApiConfiguration apiConfiguration) {
        this.apiConfiguration = apiConfiguration;
    }

    /**
     * <p>
     * The API configuration for the code generation job.
     * </p>
     * 
     * @return The API configuration for the code generation job.
     */

    public ApiConfiguration getApiConfiguration() {
        return this.apiConfiguration;
    }

    /**
     * <p>
     * The API configuration for the code generation job.
     * </p>
     * 
     * @param apiConfiguration
     *        The API configuration for the code generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactStartCodegenJobData withApiConfiguration(ApiConfiguration apiConfiguration) {
        setApiConfiguration(apiConfiguration);
        return this;
    }

    /**
     * <p>
     * Lists the dependency packages that may be required for the project code to run.
     * </p>
     * 
     * @return Lists the dependency packages that may be required for the project code to run.
     */

    public java.util.Map<String, String> getDependencies() {
        return dependencies;
    }

    /**
     * <p>
     * Lists the dependency packages that may be required for the project code to run.
     * </p>
     * 
     * @param dependencies
     *        Lists the dependency packages that may be required for the project code to run.
     */

    public void setDependencies(java.util.Map<String, String> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * <p>
     * Lists the dependency packages that may be required for the project code to run.
     * </p>
     * 
     * @param dependencies
     *        Lists the dependency packages that may be required for the project code to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactStartCodegenJobData withDependencies(java.util.Map<String, String> dependencies) {
        setDependencies(dependencies);
        return this;
    }

    /**
     * Add a single Dependencies entry
     *
     * @see ReactStartCodegenJobData#withDependencies
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ReactStartCodegenJobData addDependenciesEntry(String key, String value) {
        if (null == this.dependencies) {
            this.dependencies = new java.util.HashMap<String, String>();
        }
        if (this.dependencies.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dependencies.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Dependencies.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactStartCodegenJobData clearDependenciesEntries() {
        this.dependencies = null;
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
        if (getModule() != null)
            sb.append("Module: ").append(getModule()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getScript() != null)
            sb.append("Script: ").append(getScript()).append(",");
        if (getRenderTypeDeclarations() != null)
            sb.append("RenderTypeDeclarations: ").append(getRenderTypeDeclarations()).append(",");
        if (getInlineSourceMap() != null)
            sb.append("InlineSourceMap: ").append(getInlineSourceMap()).append(",");
        if (getApiConfiguration() != null)
            sb.append("ApiConfiguration: ").append(getApiConfiguration()).append(",");
        if (getDependencies() != null)
            sb.append("Dependencies: ").append(getDependencies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReactStartCodegenJobData == false)
            return false;
        ReactStartCodegenJobData other = (ReactStartCodegenJobData) obj;
        if (other.getModule() == null ^ this.getModule() == null)
            return false;
        if (other.getModule() != null && other.getModule().equals(this.getModule()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getScript() == null ^ this.getScript() == null)
            return false;
        if (other.getScript() != null && other.getScript().equals(this.getScript()) == false)
            return false;
        if (other.getRenderTypeDeclarations() == null ^ this.getRenderTypeDeclarations() == null)
            return false;
        if (other.getRenderTypeDeclarations() != null && other.getRenderTypeDeclarations().equals(this.getRenderTypeDeclarations()) == false)
            return false;
        if (other.getInlineSourceMap() == null ^ this.getInlineSourceMap() == null)
            return false;
        if (other.getInlineSourceMap() != null && other.getInlineSourceMap().equals(this.getInlineSourceMap()) == false)
            return false;
        if (other.getApiConfiguration() == null ^ this.getApiConfiguration() == null)
            return false;
        if (other.getApiConfiguration() != null && other.getApiConfiguration().equals(this.getApiConfiguration()) == false)
            return false;
        if (other.getDependencies() == null ^ this.getDependencies() == null)
            return false;
        if (other.getDependencies() != null && other.getDependencies().equals(this.getDependencies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModule() == null) ? 0 : getModule().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getScript() == null) ? 0 : getScript().hashCode());
        hashCode = prime * hashCode + ((getRenderTypeDeclarations() == null) ? 0 : getRenderTypeDeclarations().hashCode());
        hashCode = prime * hashCode + ((getInlineSourceMap() == null) ? 0 : getInlineSourceMap().hashCode());
        hashCode = prime * hashCode + ((getApiConfiguration() == null) ? 0 : getApiConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDependencies() == null) ? 0 : getDependencies().hashCode());
        return hashCode;
    }

    @Override
    public ReactStartCodegenJobData clone() {
        try {
            return (ReactStartCodegenJobData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ReactStartCodegenJobDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

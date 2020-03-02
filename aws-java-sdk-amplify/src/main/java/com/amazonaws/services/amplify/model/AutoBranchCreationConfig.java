/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure with auto branch creation config.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/AutoBranchCreationConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoBranchCreationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Stage for the auto created branch.
     * </p>
     */
    private String stage;
    /**
     * <p>
     * Framework for the auto created branch.
     * </p>
     */
    private String framework;
    /**
     * <p>
     * Enables auto building for the auto created branch.
     * </p>
     */
    private Boolean enableAutoBuild;
    /**
     * <p>
     * Environment Variables for the auto created branch.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;
    /**
     * <p>
     * Basic Authorization credentials for the auto created branch.
     * </p>
     */
    private String basicAuthCredentials;
    /**
     * <p>
     * Enables Basic Auth for the auto created branch.
     * </p>
     */
    private Boolean enableBasicAuth;
    /**
     * <p>
     * BuildSpec for the auto created branch.
     * </p>
     */
    private String buildSpec;
    /**
     * <p>
     * Enables Pull Request Preview for auto created branch.
     * </p>
     */
    private Boolean enablePullRequestPreview;
    /**
     * <p>
     * The Amplify Environment name for the pull request.
     * </p>
     */
    private String pullRequestEnvironmentName;

    /**
     * <p>
     * Stage for the auto created branch.
     * </p>
     * 
     * @param stage
     *        Stage for the auto created branch.
     * @see Stage
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * Stage for the auto created branch.
     * </p>
     * 
     * @return Stage for the auto created branch.
     * @see Stage
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * Stage for the auto created branch.
     * </p>
     * 
     * @param stage
     *        Stage for the auto created branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Stage
     */

    public AutoBranchCreationConfig withStage(String stage) {
        setStage(stage);
        return this;
    }

    /**
     * <p>
     * Stage for the auto created branch.
     * </p>
     * 
     * @param stage
     *        Stage for the auto created branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Stage
     */

    public AutoBranchCreationConfig withStage(Stage stage) {
        this.stage = stage.toString();
        return this;
    }

    /**
     * <p>
     * Framework for the auto created branch.
     * </p>
     * 
     * @param framework
     *        Framework for the auto created branch.
     */

    public void setFramework(String framework) {
        this.framework = framework;
    }

    /**
     * <p>
     * Framework for the auto created branch.
     * </p>
     * 
     * @return Framework for the auto created branch.
     */

    public String getFramework() {
        return this.framework;
    }

    /**
     * <p>
     * Framework for the auto created branch.
     * </p>
     * 
     * @param framework
     *        Framework for the auto created branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoBranchCreationConfig withFramework(String framework) {
        setFramework(framework);
        return this;
    }

    /**
     * <p>
     * Enables auto building for the auto created branch.
     * </p>
     * 
     * @param enableAutoBuild
     *        Enables auto building for the auto created branch.
     */

    public void setEnableAutoBuild(Boolean enableAutoBuild) {
        this.enableAutoBuild = enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto building for the auto created branch.
     * </p>
     * 
     * @return Enables auto building for the auto created branch.
     */

    public Boolean getEnableAutoBuild() {
        return this.enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto building for the auto created branch.
     * </p>
     * 
     * @param enableAutoBuild
     *        Enables auto building for the auto created branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoBranchCreationConfig withEnableAutoBuild(Boolean enableAutoBuild) {
        setEnableAutoBuild(enableAutoBuild);
        return this;
    }

    /**
     * <p>
     * Enables auto building for the auto created branch.
     * </p>
     * 
     * @return Enables auto building for the auto created branch.
     */

    public Boolean isEnableAutoBuild() {
        return this.enableAutoBuild;
    }

    /**
     * <p>
     * Environment Variables for the auto created branch.
     * </p>
     * 
     * @return Environment Variables for the auto created branch.
     */

    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * Environment Variables for the auto created branch.
     * </p>
     * 
     * @param environmentVariables
     *        Environment Variables for the auto created branch.
     */

    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * Environment Variables for the auto created branch.
     * </p>
     * 
     * @param environmentVariables
     *        Environment Variables for the auto created branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoBranchCreationConfig withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * Add a single EnvironmentVariables entry
     *
     * @see AutoBranchCreationConfig#withEnvironmentVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AutoBranchCreationConfig addEnvironmentVariablesEntry(String key, String value) {
        if (null == this.environmentVariables) {
            this.environmentVariables = new java.util.HashMap<String, String>();
        }
        if (this.environmentVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environmentVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EnvironmentVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoBranchCreationConfig clearEnvironmentVariablesEntries() {
        this.environmentVariables = null;
        return this;
    }

    /**
     * <p>
     * Basic Authorization credentials for the auto created branch.
     * </p>
     * 
     * @param basicAuthCredentials
     *        Basic Authorization credentials for the auto created branch.
     */

    public void setBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
    }

    /**
     * <p>
     * Basic Authorization credentials for the auto created branch.
     * </p>
     * 
     * @return Basic Authorization credentials for the auto created branch.
     */

    public String getBasicAuthCredentials() {
        return this.basicAuthCredentials;
    }

    /**
     * <p>
     * Basic Authorization credentials for the auto created branch.
     * </p>
     * 
     * @param basicAuthCredentials
     *        Basic Authorization credentials for the auto created branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoBranchCreationConfig withBasicAuthCredentials(String basicAuthCredentials) {
        setBasicAuthCredentials(basicAuthCredentials);
        return this;
    }

    /**
     * <p>
     * Enables Basic Auth for the auto created branch.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enables Basic Auth for the auto created branch.
     */

    public void setEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
    }

    /**
     * <p>
     * Enables Basic Auth for the auto created branch.
     * </p>
     * 
     * @return Enables Basic Auth for the auto created branch.
     */

    public Boolean getEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * Enables Basic Auth for the auto created branch.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enables Basic Auth for the auto created branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoBranchCreationConfig withEnableBasicAuth(Boolean enableBasicAuth) {
        setEnableBasicAuth(enableBasicAuth);
        return this;
    }

    /**
     * <p>
     * Enables Basic Auth for the auto created branch.
     * </p>
     * 
     * @return Enables Basic Auth for the auto created branch.
     */

    public Boolean isEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * BuildSpec for the auto created branch.
     * </p>
     * 
     * @param buildSpec
     *        BuildSpec for the auto created branch.
     */

    public void setBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
    }

    /**
     * <p>
     * BuildSpec for the auto created branch.
     * </p>
     * 
     * @return BuildSpec for the auto created branch.
     */

    public String getBuildSpec() {
        return this.buildSpec;
    }

    /**
     * <p>
     * BuildSpec for the auto created branch.
     * </p>
     * 
     * @param buildSpec
     *        BuildSpec for the auto created branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoBranchCreationConfig withBuildSpec(String buildSpec) {
        setBuildSpec(buildSpec);
        return this;
    }

    /**
     * <p>
     * Enables Pull Request Preview for auto created branch.
     * </p>
     * 
     * @param enablePullRequestPreview
     *        Enables Pull Request Preview for auto created branch.
     */

    public void setEnablePullRequestPreview(Boolean enablePullRequestPreview) {
        this.enablePullRequestPreview = enablePullRequestPreview;
    }

    /**
     * <p>
     * Enables Pull Request Preview for auto created branch.
     * </p>
     * 
     * @return Enables Pull Request Preview for auto created branch.
     */

    public Boolean getEnablePullRequestPreview() {
        return this.enablePullRequestPreview;
    }

    /**
     * <p>
     * Enables Pull Request Preview for auto created branch.
     * </p>
     * 
     * @param enablePullRequestPreview
     *        Enables Pull Request Preview for auto created branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoBranchCreationConfig withEnablePullRequestPreview(Boolean enablePullRequestPreview) {
        setEnablePullRequestPreview(enablePullRequestPreview);
        return this;
    }

    /**
     * <p>
     * Enables Pull Request Preview for auto created branch.
     * </p>
     * 
     * @return Enables Pull Request Preview for auto created branch.
     */

    public Boolean isEnablePullRequestPreview() {
        return this.enablePullRequestPreview;
    }

    /**
     * <p>
     * The Amplify Environment name for the pull request.
     * </p>
     * 
     * @param pullRequestEnvironmentName
     *        The Amplify Environment name for the pull request.
     */

    public void setPullRequestEnvironmentName(String pullRequestEnvironmentName) {
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
    }

    /**
     * <p>
     * The Amplify Environment name for the pull request.
     * </p>
     * 
     * @return The Amplify Environment name for the pull request.
     */

    public String getPullRequestEnvironmentName() {
        return this.pullRequestEnvironmentName;
    }

    /**
     * <p>
     * The Amplify Environment name for the pull request.
     * </p>
     * 
     * @param pullRequestEnvironmentName
     *        The Amplify Environment name for the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoBranchCreationConfig withPullRequestEnvironmentName(String pullRequestEnvironmentName) {
        setPullRequestEnvironmentName(pullRequestEnvironmentName);
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
        if (getStage() != null)
            sb.append("Stage: ").append(getStage()).append(",");
        if (getFramework() != null)
            sb.append("Framework: ").append(getFramework()).append(",");
        if (getEnableAutoBuild() != null)
            sb.append("EnableAutoBuild: ").append(getEnableAutoBuild()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables()).append(",");
        if (getBasicAuthCredentials() != null)
            sb.append("BasicAuthCredentials: ").append(getBasicAuthCredentials()).append(",");
        if (getEnableBasicAuth() != null)
            sb.append("EnableBasicAuth: ").append(getEnableBasicAuth()).append(",");
        if (getBuildSpec() != null)
            sb.append("BuildSpec: ").append(getBuildSpec()).append(",");
        if (getEnablePullRequestPreview() != null)
            sb.append("EnablePullRequestPreview: ").append(getEnablePullRequestPreview()).append(",");
        if (getPullRequestEnvironmentName() != null)
            sb.append("PullRequestEnvironmentName: ").append(getPullRequestEnvironmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoBranchCreationConfig == false)
            return false;
        AutoBranchCreationConfig other = (AutoBranchCreationConfig) obj;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        if (other.getFramework() == null ^ this.getFramework() == null)
            return false;
        if (other.getFramework() != null && other.getFramework().equals(this.getFramework()) == false)
            return false;
        if (other.getEnableAutoBuild() == null ^ this.getEnableAutoBuild() == null)
            return false;
        if (other.getEnableAutoBuild() != null && other.getEnableAutoBuild().equals(this.getEnableAutoBuild()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        if (other.getBasicAuthCredentials() == null ^ this.getBasicAuthCredentials() == null)
            return false;
        if (other.getBasicAuthCredentials() != null && other.getBasicAuthCredentials().equals(this.getBasicAuthCredentials()) == false)
            return false;
        if (other.getEnableBasicAuth() == null ^ this.getEnableBasicAuth() == null)
            return false;
        if (other.getEnableBasicAuth() != null && other.getEnableBasicAuth().equals(this.getEnableBasicAuth()) == false)
            return false;
        if (other.getBuildSpec() == null ^ this.getBuildSpec() == null)
            return false;
        if (other.getBuildSpec() != null && other.getBuildSpec().equals(this.getBuildSpec()) == false)
            return false;
        if (other.getEnablePullRequestPreview() == null ^ this.getEnablePullRequestPreview() == null)
            return false;
        if (other.getEnablePullRequestPreview() != null && other.getEnablePullRequestPreview().equals(this.getEnablePullRequestPreview()) == false)
            return false;
        if (other.getPullRequestEnvironmentName() == null ^ this.getPullRequestEnvironmentName() == null)
            return false;
        if (other.getPullRequestEnvironmentName() != null && other.getPullRequestEnvironmentName().equals(this.getPullRequestEnvironmentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        hashCode = prime * hashCode + ((getFramework() == null) ? 0 : getFramework().hashCode());
        hashCode = prime * hashCode + ((getEnableAutoBuild() == null) ? 0 : getEnableAutoBuild().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime * hashCode + ((getBasicAuthCredentials() == null) ? 0 : getBasicAuthCredentials().hashCode());
        hashCode = prime * hashCode + ((getEnableBasicAuth() == null) ? 0 : getEnableBasicAuth().hashCode());
        hashCode = prime * hashCode + ((getBuildSpec() == null) ? 0 : getBuildSpec().hashCode());
        hashCode = prime * hashCode + ((getEnablePullRequestPreview() == null) ? 0 : getEnablePullRequestPreview().hashCode());
        hashCode = prime * hashCode + ((getPullRequestEnvironmentName() == null) ? 0 : getPullRequestEnvironmentName().hashCode());
        return hashCode;
    }

    @Override
    public AutoBranchCreationConfig clone() {
        try {
            return (AutoBranchCreationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.AutoBranchCreationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

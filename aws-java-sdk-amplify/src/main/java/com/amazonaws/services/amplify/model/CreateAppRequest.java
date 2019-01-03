/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request structure used to create Apps in Amplify.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateApp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAppRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name for the Amplify App
     * </p>
     */
    private String name;
    /**
     * <p>
     * Description for an Amplify App
     * </p>
     */
    private String description;
    /**
     * <p>
     * Repository for an Amplify App
     * </p>
     */
    private String repository;
    /**
     * <p>
     * Platform / framework for an Amplify App
     * </p>
     */
    private String platform;
    /**
     * <p>
     * AWS IAM service role for an Amplify App
     * </p>
     */
    private String iamServiceRoleArn;
    /**
     * <p>
     * OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy
     * key. OAuth token is not stored.
     * </p>
     */
    private String oauthToken;
    /**
     * <p>
     * Environment variables map for an Amplify App.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;
    /**
     * <p>
     * Enable the auto building of branches for an Amplify App.
     * </p>
     */
    private Boolean enableBranchAutoBuild;
    /**
     * <p>
     * Enable Basic Authorization for an Amplify App, this will apply to all branches part of this App.
     * </p>
     */
    private Boolean enableBasicAuth;
    /**
     * <p>
     * Credentials for Basic Authorization for an Amplify App.
     * </p>
     */
    private String basicAuthCredentials;
    /**
     * <p>
     * Custom rewrite / redirect rules for an Amplify App.
     * </p>
     */
    private java.util.List<CustomRule> customRules;
    /**
     * <p>
     * Tag for an Amplify App
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * BuildSpec for an Amplify App
     * </p>
     */
    private String buildSpec;

    /**
     * <p>
     * Name for the Amplify App
     * </p>
     * 
     * @param name
     *        Name for the Amplify App
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name for the Amplify App
     * </p>
     * 
     * @return Name for the Amplify App
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name for the Amplify App
     * </p>
     * 
     * @param name
     *        Name for the Amplify App
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Description for an Amplify App
     * </p>
     * 
     * @param description
     *        Description for an Amplify App
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description for an Amplify App
     * </p>
     * 
     * @return Description for an Amplify App
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description for an Amplify App
     * </p>
     * 
     * @param description
     *        Description for an Amplify App
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Repository for an Amplify App
     * </p>
     * 
     * @param repository
     *        Repository for an Amplify App
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * Repository for an Amplify App
     * </p>
     * 
     * @return Repository for an Amplify App
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * Repository for an Amplify App
     * </p>
     * 
     * @param repository
     *        Repository for an Amplify App
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * Platform / framework for an Amplify App
     * </p>
     * 
     * @param platform
     *        Platform / framework for an Amplify App
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * Platform / framework for an Amplify App
     * </p>
     * 
     * @return Platform / framework for an Amplify App
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * Platform / framework for an Amplify App
     * </p>
     * 
     * @param platform
     *        Platform / framework for an Amplify App
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public CreateAppRequest withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * Platform / framework for an Amplify App
     * </p>
     * 
     * @param platform
     *        Platform / framework for an Amplify App
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public CreateAppRequest withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * AWS IAM service role for an Amplify App
     * </p>
     * 
     * @param iamServiceRoleArn
     *        AWS IAM service role for an Amplify App
     */

    public void setIamServiceRoleArn(String iamServiceRoleArn) {
        this.iamServiceRoleArn = iamServiceRoleArn;
    }

    /**
     * <p>
     * AWS IAM service role for an Amplify App
     * </p>
     * 
     * @return AWS IAM service role for an Amplify App
     */

    public String getIamServiceRoleArn() {
        return this.iamServiceRoleArn;
    }

    /**
     * <p>
     * AWS IAM service role for an Amplify App
     * </p>
     * 
     * @param iamServiceRoleArn
     *        AWS IAM service role for an Amplify App
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withIamServiceRoleArn(String iamServiceRoleArn) {
        setIamServiceRoleArn(iamServiceRoleArn);
        return this;
    }

    /**
     * <p>
     * OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy
     * key. OAuth token is not stored.
     * </p>
     * 
     * @param oauthToken
     *        OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only
     *        deploy key. OAuth token is not stored.
     */

    public void setOauthToken(String oauthToken) {
        this.oauthToken = oauthToken;
    }

    /**
     * <p>
     * OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy
     * key. OAuth token is not stored.
     * </p>
     * 
     * @return OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only
     *         deploy key. OAuth token is not stored.
     */

    public String getOauthToken() {
        return this.oauthToken;
    }

    /**
     * <p>
     * OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy
     * key. OAuth token is not stored.
     * </p>
     * 
     * @param oauthToken
     *        OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only
     *        deploy key. OAuth token is not stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withOauthToken(String oauthToken) {
        setOauthToken(oauthToken);
        return this;
    }

    /**
     * <p>
     * Environment variables map for an Amplify App.
     * </p>
     * 
     * @return Environment variables map for an Amplify App.
     */

    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * Environment variables map for an Amplify App.
     * </p>
     * 
     * @param environmentVariables
     *        Environment variables map for an Amplify App.
     */

    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * Environment variables map for an Amplify App.
     * </p>
     * 
     * @param environmentVariables
     *        Environment variables map for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    public CreateAppRequest addEnvironmentVariablesEntry(String key, String value) {
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

    public CreateAppRequest clearEnvironmentVariablesEntries() {
        this.environmentVariables = null;
        return this;
    }

    /**
     * <p>
     * Enable the auto building of branches for an Amplify App.
     * </p>
     * 
     * @param enableBranchAutoBuild
     *        Enable the auto building of branches for an Amplify App.
     */

    public void setEnableBranchAutoBuild(Boolean enableBranchAutoBuild) {
        this.enableBranchAutoBuild = enableBranchAutoBuild;
    }

    /**
     * <p>
     * Enable the auto building of branches for an Amplify App.
     * </p>
     * 
     * @return Enable the auto building of branches for an Amplify App.
     */

    public Boolean getEnableBranchAutoBuild() {
        return this.enableBranchAutoBuild;
    }

    /**
     * <p>
     * Enable the auto building of branches for an Amplify App.
     * </p>
     * 
     * @param enableBranchAutoBuild
     *        Enable the auto building of branches for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withEnableBranchAutoBuild(Boolean enableBranchAutoBuild) {
        setEnableBranchAutoBuild(enableBranchAutoBuild);
        return this;
    }

    /**
     * <p>
     * Enable the auto building of branches for an Amplify App.
     * </p>
     * 
     * @return Enable the auto building of branches for an Amplify App.
     */

    public Boolean isEnableBranchAutoBuild() {
        return this.enableBranchAutoBuild;
    }

    /**
     * <p>
     * Enable Basic Authorization for an Amplify App, this will apply to all branches part of this App.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enable Basic Authorization for an Amplify App, this will apply to all branches part of this App.
     */

    public void setEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
    }

    /**
     * <p>
     * Enable Basic Authorization for an Amplify App, this will apply to all branches part of this App.
     * </p>
     * 
     * @return Enable Basic Authorization for an Amplify App, this will apply to all branches part of this App.
     */

    public Boolean getEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * Enable Basic Authorization for an Amplify App, this will apply to all branches part of this App.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enable Basic Authorization for an Amplify App, this will apply to all branches part of this App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withEnableBasicAuth(Boolean enableBasicAuth) {
        setEnableBasicAuth(enableBasicAuth);
        return this;
    }

    /**
     * <p>
     * Enable Basic Authorization for an Amplify App, this will apply to all branches part of this App.
     * </p>
     * 
     * @return Enable Basic Authorization for an Amplify App, this will apply to all branches part of this App.
     */

    public Boolean isEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * Credentials for Basic Authorization for an Amplify App.
     * </p>
     * 
     * @param basicAuthCredentials
     *        Credentials for Basic Authorization for an Amplify App.
     */

    public void setBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
    }

    /**
     * <p>
     * Credentials for Basic Authorization for an Amplify App.
     * </p>
     * 
     * @return Credentials for Basic Authorization for an Amplify App.
     */

    public String getBasicAuthCredentials() {
        return this.basicAuthCredentials;
    }

    /**
     * <p>
     * Credentials for Basic Authorization for an Amplify App.
     * </p>
     * 
     * @param basicAuthCredentials
     *        Credentials for Basic Authorization for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withBasicAuthCredentials(String basicAuthCredentials) {
        setBasicAuthCredentials(basicAuthCredentials);
        return this;
    }

    /**
     * <p>
     * Custom rewrite / redirect rules for an Amplify App.
     * </p>
     * 
     * @return Custom rewrite / redirect rules for an Amplify App.
     */

    public java.util.List<CustomRule> getCustomRules() {
        return customRules;
    }

    /**
     * <p>
     * Custom rewrite / redirect rules for an Amplify App.
     * </p>
     * 
     * @param customRules
     *        Custom rewrite / redirect rules for an Amplify App.
     */

    public void setCustomRules(java.util.Collection<CustomRule> customRules) {
        if (customRules == null) {
            this.customRules = null;
            return;
        }

        this.customRules = new java.util.ArrayList<CustomRule>(customRules);
    }

    /**
     * <p>
     * Custom rewrite / redirect rules for an Amplify App.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomRules(java.util.Collection)} or {@link #withCustomRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param customRules
     *        Custom rewrite / redirect rules for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withCustomRules(CustomRule... customRules) {
        if (this.customRules == null) {
            setCustomRules(new java.util.ArrayList<CustomRule>(customRules.length));
        }
        for (CustomRule ele : customRules) {
            this.customRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Custom rewrite / redirect rules for an Amplify App.
     * </p>
     * 
     * @param customRules
     *        Custom rewrite / redirect rules for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withCustomRules(java.util.Collection<CustomRule> customRules) {
        setCustomRules(customRules);
        return this;
    }

    /**
     * <p>
     * Tag for an Amplify App
     * </p>
     * 
     * @return Tag for an Amplify App
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tag for an Amplify App
     * </p>
     * 
     * @param tags
     *        Tag for an Amplify App
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tag for an Amplify App
     * </p>
     * 
     * @param tags
     *        Tag for an Amplify App
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateAppRequest addTagsEntry(String key, String value) {
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

    public CreateAppRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * BuildSpec for an Amplify App
     * </p>
     * 
     * @param buildSpec
     *        BuildSpec for an Amplify App
     */

    public void setBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
    }

    /**
     * <p>
     * BuildSpec for an Amplify App
     * </p>
     * 
     * @return BuildSpec for an Amplify App
     */

    public String getBuildSpec() {
        return this.buildSpec;
    }

    /**
     * <p>
     * BuildSpec for an Amplify App
     * </p>
     * 
     * @param buildSpec
     *        BuildSpec for an Amplify App
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppRequest withBuildSpec(String buildSpec) {
        setBuildSpec(buildSpec);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getIamServiceRoleArn() != null)
            sb.append("IamServiceRoleArn: ").append(getIamServiceRoleArn()).append(",");
        if (getOauthToken() != null)
            sb.append("OauthToken: ").append(getOauthToken()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables()).append(",");
        if (getEnableBranchAutoBuild() != null)
            sb.append("EnableBranchAutoBuild: ").append(getEnableBranchAutoBuild()).append(",");
        if (getEnableBasicAuth() != null)
            sb.append("EnableBasicAuth: ").append(getEnableBasicAuth()).append(",");
        if (getBasicAuthCredentials() != null)
            sb.append("BasicAuthCredentials: ").append(getBasicAuthCredentials()).append(",");
        if (getCustomRules() != null)
            sb.append("CustomRules: ").append(getCustomRules()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getBuildSpec() != null)
            sb.append("BuildSpec: ").append(getBuildSpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAppRequest == false)
            return false;
        CreateAppRequest other = (CreateAppRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getIamServiceRoleArn() == null ^ this.getIamServiceRoleArn() == null)
            return false;
        if (other.getIamServiceRoleArn() != null && other.getIamServiceRoleArn().equals(this.getIamServiceRoleArn()) == false)
            return false;
        if (other.getOauthToken() == null ^ this.getOauthToken() == null)
            return false;
        if (other.getOauthToken() != null && other.getOauthToken().equals(this.getOauthToken()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        if (other.getEnableBranchAutoBuild() == null ^ this.getEnableBranchAutoBuild() == null)
            return false;
        if (other.getEnableBranchAutoBuild() != null && other.getEnableBranchAutoBuild().equals(this.getEnableBranchAutoBuild()) == false)
            return false;
        if (other.getEnableBasicAuth() == null ^ this.getEnableBasicAuth() == null)
            return false;
        if (other.getEnableBasicAuth() != null && other.getEnableBasicAuth().equals(this.getEnableBasicAuth()) == false)
            return false;
        if (other.getBasicAuthCredentials() == null ^ this.getBasicAuthCredentials() == null)
            return false;
        if (other.getBasicAuthCredentials() != null && other.getBasicAuthCredentials().equals(this.getBasicAuthCredentials()) == false)
            return false;
        if (other.getCustomRules() == null ^ this.getCustomRules() == null)
            return false;
        if (other.getCustomRules() != null && other.getCustomRules().equals(this.getCustomRules()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getBuildSpec() == null ^ this.getBuildSpec() == null)
            return false;
        if (other.getBuildSpec() != null && other.getBuildSpec().equals(this.getBuildSpec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getIamServiceRoleArn() == null) ? 0 : getIamServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getOauthToken() == null) ? 0 : getOauthToken().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime * hashCode + ((getEnableBranchAutoBuild() == null) ? 0 : getEnableBranchAutoBuild().hashCode());
        hashCode = prime * hashCode + ((getEnableBasicAuth() == null) ? 0 : getEnableBasicAuth().hashCode());
        hashCode = prime * hashCode + ((getBasicAuthCredentials() == null) ? 0 : getBasicAuthCredentials().hashCode());
        hashCode = prime * hashCode + ((getCustomRules() == null) ? 0 : getCustomRules().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getBuildSpec() == null) ? 0 : getBuildSpec().hashCode());
        return hashCode;
    }

    @Override
    public CreateAppRequest clone() {
        return (CreateAppRequest) super.clone();
    }

}

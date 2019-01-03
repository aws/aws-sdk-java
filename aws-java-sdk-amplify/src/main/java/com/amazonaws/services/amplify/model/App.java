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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amplify App represents different branches of a repository for building, deploying, and hosting.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/App" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class App implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique Id for the Amplify App.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * ARN for the Amplify App.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * Name for the Amplify App.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Tag for Amplify App.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Description for the Amplify App.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Repository for the Amplify App.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * Platform for the Amplify App.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * Create date / time for the Amplify App.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * Update date / time for the Amplify App.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * IAM service role ARN for the Amplify App.
     * </p>
     */
    private String iamServiceRoleArn;
    /**
     * <p>
     * Environment Variables for the Amplify App.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;
    /**
     * <p>
     * Default domain for the Amplify App.
     * </p>
     */
    private String defaultDomain;
    /**
     * <p>
     * Enables auto-building of branches for the Amplify App.
     * </p>
     */
    private Boolean enableBranchAutoBuild;
    /**
     * <p>
     * Enables Basic Authorization for branches for the Amplify App.
     * </p>
     */
    private Boolean enableBasicAuth;
    /**
     * <p>
     * Basic Authorization credentials for branches for the Amplify App.
     * </p>
     */
    private String basicAuthCredentials;
    /**
     * <p>
     * Custom redirect / rewrite rules for the Amplify App.
     * </p>
     */
    private java.util.List<CustomRule> customRules;
    /**
     * <p>
     * Structure with Production Branch information.
     * </p>
     */
    private ProductionBranch productionBranch;
    /**
     * <p>
     * BuildSpec content for Amplify App.
     * </p>
     */
    private String buildSpec;

    /**
     * <p>
     * Unique Id for the Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for the Amplify App.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * Unique Id for the Amplify App.
     * </p>
     * 
     * @return Unique Id for the Amplify App.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * Unique Id for the Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * ARN for the Amplify App.
     * </p>
     * 
     * @param appArn
     *        ARN for the Amplify App.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * ARN for the Amplify App.
     * </p>
     * 
     * @return ARN for the Amplify App.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * ARN for the Amplify App.
     * </p>
     * 
     * @param appArn
     *        ARN for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * Name for the Amplify App.
     * </p>
     * 
     * @param name
     *        Name for the Amplify App.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name for the Amplify App.
     * </p>
     * 
     * @return Name for the Amplify App.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name for the Amplify App.
     * </p>
     * 
     * @param name
     *        Name for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Tag for Amplify App.
     * </p>
     * 
     * @return Tag for Amplify App.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tag for Amplify App.
     * </p>
     * 
     * @param tags
     *        Tag for Amplify App.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tag for Amplify App.
     * </p>
     * 
     * @param tags
     *        Tag for Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public App addTagsEntry(String key, String value) {
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

    public App clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Description for the Amplify App.
     * </p>
     * 
     * @param description
     *        Description for the Amplify App.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description for the Amplify App.
     * </p>
     * 
     * @return Description for the Amplify App.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description for the Amplify App.
     * </p>
     * 
     * @param description
     *        Description for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Repository for the Amplify App.
     * </p>
     * 
     * @param repository
     *        Repository for the Amplify App.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * Repository for the Amplify App.
     * </p>
     * 
     * @return Repository for the Amplify App.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * Repository for the Amplify App.
     * </p>
     * 
     * @param repository
     *        Repository for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * Platform for the Amplify App.
     * </p>
     * 
     * @param platform
     *        Platform for the Amplify App.
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * Platform for the Amplify App.
     * </p>
     * 
     * @return Platform for the Amplify App.
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * Platform for the Amplify App.
     * </p>
     * 
     * @param platform
     *        Platform for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public App withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * Platform for the Amplify App.
     * </p>
     * 
     * @param platform
     *        Platform for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public App withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * Create date / time for the Amplify App.
     * </p>
     * 
     * @param createTime
     *        Create date / time for the Amplify App.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * Create date / time for the Amplify App.
     * </p>
     * 
     * @return Create date / time for the Amplify App.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * Create date / time for the Amplify App.
     * </p>
     * 
     * @param createTime
     *        Create date / time for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * Update date / time for the Amplify App.
     * </p>
     * 
     * @param updateTime
     *        Update date / time for the Amplify App.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * Update date / time for the Amplify App.
     * </p>
     * 
     * @return Update date / time for the Amplify App.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * Update date / time for the Amplify App.
     * </p>
     * 
     * @param updateTime
     *        Update date / time for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * IAM service role ARN for the Amplify App.
     * </p>
     * 
     * @param iamServiceRoleArn
     *        IAM service role ARN for the Amplify App.
     */

    public void setIamServiceRoleArn(String iamServiceRoleArn) {
        this.iamServiceRoleArn = iamServiceRoleArn;
    }

    /**
     * <p>
     * IAM service role ARN for the Amplify App.
     * </p>
     * 
     * @return IAM service role ARN for the Amplify App.
     */

    public String getIamServiceRoleArn() {
        return this.iamServiceRoleArn;
    }

    /**
     * <p>
     * IAM service role ARN for the Amplify App.
     * </p>
     * 
     * @param iamServiceRoleArn
     *        IAM service role ARN for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withIamServiceRoleArn(String iamServiceRoleArn) {
        setIamServiceRoleArn(iamServiceRoleArn);
        return this;
    }

    /**
     * <p>
     * Environment Variables for the Amplify App.
     * </p>
     * 
     * @return Environment Variables for the Amplify App.
     */

    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * Environment Variables for the Amplify App.
     * </p>
     * 
     * @param environmentVariables
     *        Environment Variables for the Amplify App.
     */

    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * Environment Variables for the Amplify App.
     * </p>
     * 
     * @param environmentVariables
     *        Environment Variables for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    public App addEnvironmentVariablesEntry(String key, String value) {
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

    public App clearEnvironmentVariablesEntries() {
        this.environmentVariables = null;
        return this;
    }

    /**
     * <p>
     * Default domain for the Amplify App.
     * </p>
     * 
     * @param defaultDomain
     *        Default domain for the Amplify App.
     */

    public void setDefaultDomain(String defaultDomain) {
        this.defaultDomain = defaultDomain;
    }

    /**
     * <p>
     * Default domain for the Amplify App.
     * </p>
     * 
     * @return Default domain for the Amplify App.
     */

    public String getDefaultDomain() {
        return this.defaultDomain;
    }

    /**
     * <p>
     * Default domain for the Amplify App.
     * </p>
     * 
     * @param defaultDomain
     *        Default domain for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withDefaultDomain(String defaultDomain) {
        setDefaultDomain(defaultDomain);
        return this;
    }

    /**
     * <p>
     * Enables auto-building of branches for the Amplify App.
     * </p>
     * 
     * @param enableBranchAutoBuild
     *        Enables auto-building of branches for the Amplify App.
     */

    public void setEnableBranchAutoBuild(Boolean enableBranchAutoBuild) {
        this.enableBranchAutoBuild = enableBranchAutoBuild;
    }

    /**
     * <p>
     * Enables auto-building of branches for the Amplify App.
     * </p>
     * 
     * @return Enables auto-building of branches for the Amplify App.
     */

    public Boolean getEnableBranchAutoBuild() {
        return this.enableBranchAutoBuild;
    }

    /**
     * <p>
     * Enables auto-building of branches for the Amplify App.
     * </p>
     * 
     * @param enableBranchAutoBuild
     *        Enables auto-building of branches for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withEnableBranchAutoBuild(Boolean enableBranchAutoBuild) {
        setEnableBranchAutoBuild(enableBranchAutoBuild);
        return this;
    }

    /**
     * <p>
     * Enables auto-building of branches for the Amplify App.
     * </p>
     * 
     * @return Enables auto-building of branches for the Amplify App.
     */

    public Boolean isEnableBranchAutoBuild() {
        return this.enableBranchAutoBuild;
    }

    /**
     * <p>
     * Enables Basic Authorization for branches for the Amplify App.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enables Basic Authorization for branches for the Amplify App.
     */

    public void setEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
    }

    /**
     * <p>
     * Enables Basic Authorization for branches for the Amplify App.
     * </p>
     * 
     * @return Enables Basic Authorization for branches for the Amplify App.
     */

    public Boolean getEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * Enables Basic Authorization for branches for the Amplify App.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enables Basic Authorization for branches for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withEnableBasicAuth(Boolean enableBasicAuth) {
        setEnableBasicAuth(enableBasicAuth);
        return this;
    }

    /**
     * <p>
     * Enables Basic Authorization for branches for the Amplify App.
     * </p>
     * 
     * @return Enables Basic Authorization for branches for the Amplify App.
     */

    public Boolean isEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * Basic Authorization credentials for branches for the Amplify App.
     * </p>
     * 
     * @param basicAuthCredentials
     *        Basic Authorization credentials for branches for the Amplify App.
     */

    public void setBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
    }

    /**
     * <p>
     * Basic Authorization credentials for branches for the Amplify App.
     * </p>
     * 
     * @return Basic Authorization credentials for branches for the Amplify App.
     */

    public String getBasicAuthCredentials() {
        return this.basicAuthCredentials;
    }

    /**
     * <p>
     * Basic Authorization credentials for branches for the Amplify App.
     * </p>
     * 
     * @param basicAuthCredentials
     *        Basic Authorization credentials for branches for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withBasicAuthCredentials(String basicAuthCredentials) {
        setBasicAuthCredentials(basicAuthCredentials);
        return this;
    }

    /**
     * <p>
     * Custom redirect / rewrite rules for the Amplify App.
     * </p>
     * 
     * @return Custom redirect / rewrite rules for the Amplify App.
     */

    public java.util.List<CustomRule> getCustomRules() {
        return customRules;
    }

    /**
     * <p>
     * Custom redirect / rewrite rules for the Amplify App.
     * </p>
     * 
     * @param customRules
     *        Custom redirect / rewrite rules for the Amplify App.
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
     * Custom redirect / rewrite rules for the Amplify App.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomRules(java.util.Collection)} or {@link #withCustomRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param customRules
     *        Custom redirect / rewrite rules for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withCustomRules(CustomRule... customRules) {
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
     * Custom redirect / rewrite rules for the Amplify App.
     * </p>
     * 
     * @param customRules
     *        Custom redirect / rewrite rules for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withCustomRules(java.util.Collection<CustomRule> customRules) {
        setCustomRules(customRules);
        return this;
    }

    /**
     * <p>
     * Structure with Production Branch information.
     * </p>
     * 
     * @param productionBranch
     *        Structure with Production Branch information.
     */

    public void setProductionBranch(ProductionBranch productionBranch) {
        this.productionBranch = productionBranch;
    }

    /**
     * <p>
     * Structure with Production Branch information.
     * </p>
     * 
     * @return Structure with Production Branch information.
     */

    public ProductionBranch getProductionBranch() {
        return this.productionBranch;
    }

    /**
     * <p>
     * Structure with Production Branch information.
     * </p>
     * 
     * @param productionBranch
     *        Structure with Production Branch information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withProductionBranch(ProductionBranch productionBranch) {
        setProductionBranch(productionBranch);
        return this;
    }

    /**
     * <p>
     * BuildSpec content for Amplify App.
     * </p>
     * 
     * @param buildSpec
     *        BuildSpec content for Amplify App.
     */

    public void setBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
    }

    /**
     * <p>
     * BuildSpec content for Amplify App.
     * </p>
     * 
     * @return BuildSpec content for Amplify App.
     */

    public String getBuildSpec() {
        return this.buildSpec;
    }

    /**
     * <p>
     * BuildSpec content for Amplify App.
     * </p>
     * 
     * @param buildSpec
     *        BuildSpec content for Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withBuildSpec(String buildSpec) {
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getIamServiceRoleArn() != null)
            sb.append("IamServiceRoleArn: ").append(getIamServiceRoleArn()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables()).append(",");
        if (getDefaultDomain() != null)
            sb.append("DefaultDomain: ").append(getDefaultDomain()).append(",");
        if (getEnableBranchAutoBuild() != null)
            sb.append("EnableBranchAutoBuild: ").append(getEnableBranchAutoBuild()).append(",");
        if (getEnableBasicAuth() != null)
            sb.append("EnableBasicAuth: ").append(getEnableBasicAuth()).append(",");
        if (getBasicAuthCredentials() != null)
            sb.append("BasicAuthCredentials: ").append(getBasicAuthCredentials()).append(",");
        if (getCustomRules() != null)
            sb.append("CustomRules: ").append(getCustomRules()).append(",");
        if (getProductionBranch() != null)
            sb.append("ProductionBranch: ").append(getProductionBranch()).append(",");
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

        if (obj instanceof App == false)
            return false;
        App other = (App) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getIamServiceRoleArn() == null ^ this.getIamServiceRoleArn() == null)
            return false;
        if (other.getIamServiceRoleArn() != null && other.getIamServiceRoleArn().equals(this.getIamServiceRoleArn()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        if (other.getDefaultDomain() == null ^ this.getDefaultDomain() == null)
            return false;
        if (other.getDefaultDomain() != null && other.getDefaultDomain().equals(this.getDefaultDomain()) == false)
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
        if (other.getProductionBranch() == null ^ this.getProductionBranch() == null)
            return false;
        if (other.getProductionBranch() != null && other.getProductionBranch().equals(this.getProductionBranch()) == false)
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

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getIamServiceRoleArn() == null) ? 0 : getIamServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime * hashCode + ((getDefaultDomain() == null) ? 0 : getDefaultDomain().hashCode());
        hashCode = prime * hashCode + ((getEnableBranchAutoBuild() == null) ? 0 : getEnableBranchAutoBuild().hashCode());
        hashCode = prime * hashCode + ((getEnableBasicAuth() == null) ? 0 : getEnableBasicAuth().hashCode());
        hashCode = prime * hashCode + ((getBasicAuthCredentials() == null) ? 0 : getBasicAuthCredentials().hashCode());
        hashCode = prime * hashCode + ((getCustomRules() == null) ? 0 : getCustomRules().hashCode());
        hashCode = prime * hashCode + ((getProductionBranch() == null) ? 0 : getProductionBranch().hashCode());
        hashCode = prime * hashCode + ((getBuildSpec() == null) ? 0 : getBuildSpec().hashCode());
        return hashCode;
    }

    @Override
    public App clone() {
        try {
            return (App) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.AppMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

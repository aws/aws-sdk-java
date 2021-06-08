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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the different branches of a repository for building, deploying, and hosting an Amplify app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/App" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class App implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the Amplify app.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amplify app.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * The name for the Amplify app.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The tag for the Amplify app.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The description for the Amplify app.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The repository for the Amplify app.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * The platform for the Amplify app.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * Creates a date and time for the Amplify app.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * Updates the date and time for the Amplify app.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * The AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) of the Amplify app.
     * </p>
     */
    private String iamServiceRoleArn;
    /**
     * <p>
     * The environment variables for the Amplify app.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;
    /**
     * <p>
     * The default domain for the Amplify app.
     * </p>
     */
    private String defaultDomain;
    /**
     * <p>
     * Enables the auto-building of branches for the Amplify app.
     * </p>
     */
    private Boolean enableBranchAutoBuild;
    /**
     * <p>
     * Automatically disconnect a branch in the Amplify Console when you delete a branch from your Git repository.
     * </p>
     */
    private Boolean enableBranchAutoDeletion;
    /**
     * <p>
     * Enables basic authorization for the Amplify app's branches.
     * </p>
     */
    private Boolean enableBasicAuth;
    /**
     * <p>
     * The basic authorization credentials for branches for the Amplify app.
     * </p>
     */
    private String basicAuthCredentials;
    /**
     * <p>
     * Describes the custom redirect and rewrite rules for the Amplify app.
     * </p>
     */
    private java.util.List<CustomRule> customRules;
    /**
     * <p>
     * Describes the information about a production branch of the Amplify app.
     * </p>
     */
    private ProductionBranch productionBranch;
    /**
     * <p>
     * Describes the content of the build specification (build spec) for the Amplify app.
     * </p>
     */
    private String buildSpec;
    /**
     * <p>
     * Describes the custom HTTP headers for the Amplify app.
     * </p>
     */
    private String customHeaders;
    /**
     * <p>
     * Enables automated branch creation for the Amplify app.
     * </p>
     */
    private Boolean enableAutoBranchCreation;
    /**
     * <p>
     * Describes the automated branch creation glob patterns for the Amplify app.
     * </p>
     */
    private java.util.List<String> autoBranchCreationPatterns;
    /**
     * <p>
     * Describes the automated branch creation configuration for the Amplify app.
     * </p>
     */
    private AutoBranchCreationConfig autoBranchCreationConfig;

    /**
     * <p>
     * The unique ID of the Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID of the Amplify app.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID of the Amplify app.
     * </p>
     * 
     * @return The unique ID of the Amplify app.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The unique ID of the Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID of the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amplify app.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the Amplify app.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amplify app.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amplify app.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amplify app.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * The name for the Amplify app.
     * </p>
     * 
     * @param name
     *        The name for the Amplify app.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the Amplify app.
     * </p>
     * 
     * @return The name for the Amplify app.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the Amplify app.
     * </p>
     * 
     * @param name
     *        The name for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The tag for the Amplify app.
     * </p>
     * 
     * @return The tag for the Amplify app.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag for the Amplify app.
     * </p>
     * 
     * @param tags
     *        The tag for the Amplify app.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tag for the Amplify app.
     * </p>
     * 
     * @param tags
     *        The tag for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see App#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

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
     * The description for the Amplify app.
     * </p>
     * 
     * @param description
     *        The description for the Amplify app.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the Amplify app.
     * </p>
     * 
     * @return The description for the Amplify app.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the Amplify app.
     * </p>
     * 
     * @param description
     *        The description for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The repository for the Amplify app.
     * </p>
     * 
     * @param repository
     *        The repository for the Amplify app.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The repository for the Amplify app.
     * </p>
     * 
     * @return The repository for the Amplify app.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The repository for the Amplify app.
     * </p>
     * 
     * @param repository
     *        The repository for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * The platform for the Amplify app.
     * </p>
     * 
     * @param platform
     *        The platform for the Amplify app.
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform for the Amplify app.
     * </p>
     * 
     * @return The platform for the Amplify app.
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform for the Amplify app.
     * </p>
     * 
     * @param platform
     *        The platform for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public App withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform for the Amplify app.
     * </p>
     * 
     * @param platform
     *        The platform for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public App withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * Creates a date and time for the Amplify app.
     * </p>
     * 
     * @param createTime
     *        Creates a date and time for the Amplify app.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * Creates a date and time for the Amplify app.
     * </p>
     * 
     * @return Creates a date and time for the Amplify app.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * Creates a date and time for the Amplify app.
     * </p>
     * 
     * @param createTime
     *        Creates a date and time for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * Updates the date and time for the Amplify app.
     * </p>
     * 
     * @param updateTime
     *        Updates the date and time for the Amplify app.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * Updates the date and time for the Amplify app.
     * </p>
     * 
     * @return Updates the date and time for the Amplify app.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * Updates the date and time for the Amplify app.
     * </p>
     * 
     * @param updateTime
     *        Updates the date and time for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) of the Amplify app.
     * </p>
     * 
     * @param iamServiceRoleArn
     *        The AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) of the
     *        Amplify app.
     */

    public void setIamServiceRoleArn(String iamServiceRoleArn) {
        this.iamServiceRoleArn = iamServiceRoleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) of the Amplify app.
     * </p>
     * 
     * @return The AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) of the
     *         Amplify app.
     */

    public String getIamServiceRoleArn() {
        return this.iamServiceRoleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) of the Amplify app.
     * </p>
     * 
     * @param iamServiceRoleArn
     *        The AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) of the
     *        Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withIamServiceRoleArn(String iamServiceRoleArn) {
        setIamServiceRoleArn(iamServiceRoleArn);
        return this;
    }

    /**
     * <p>
     * The environment variables for the Amplify app.
     * </p>
     * 
     * @return The environment variables for the Amplify app.
     */

    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * The environment variables for the Amplify app.
     * </p>
     * 
     * @param environmentVariables
     *        The environment variables for the Amplify app.
     */

    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * The environment variables for the Amplify app.
     * </p>
     * 
     * @param environmentVariables
     *        The environment variables for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * Add a single EnvironmentVariables entry
     *
     * @see App#withEnvironmentVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

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
     * The default domain for the Amplify app.
     * </p>
     * 
     * @param defaultDomain
     *        The default domain for the Amplify app.
     */

    public void setDefaultDomain(String defaultDomain) {
        this.defaultDomain = defaultDomain;
    }

    /**
     * <p>
     * The default domain for the Amplify app.
     * </p>
     * 
     * @return The default domain for the Amplify app.
     */

    public String getDefaultDomain() {
        return this.defaultDomain;
    }

    /**
     * <p>
     * The default domain for the Amplify app.
     * </p>
     * 
     * @param defaultDomain
     *        The default domain for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withDefaultDomain(String defaultDomain) {
        setDefaultDomain(defaultDomain);
        return this;
    }

    /**
     * <p>
     * Enables the auto-building of branches for the Amplify app.
     * </p>
     * 
     * @param enableBranchAutoBuild
     *        Enables the auto-building of branches for the Amplify app.
     */

    public void setEnableBranchAutoBuild(Boolean enableBranchAutoBuild) {
        this.enableBranchAutoBuild = enableBranchAutoBuild;
    }

    /**
     * <p>
     * Enables the auto-building of branches for the Amplify app.
     * </p>
     * 
     * @return Enables the auto-building of branches for the Amplify app.
     */

    public Boolean getEnableBranchAutoBuild() {
        return this.enableBranchAutoBuild;
    }

    /**
     * <p>
     * Enables the auto-building of branches for the Amplify app.
     * </p>
     * 
     * @param enableBranchAutoBuild
     *        Enables the auto-building of branches for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withEnableBranchAutoBuild(Boolean enableBranchAutoBuild) {
        setEnableBranchAutoBuild(enableBranchAutoBuild);
        return this;
    }

    /**
     * <p>
     * Enables the auto-building of branches for the Amplify app.
     * </p>
     * 
     * @return Enables the auto-building of branches for the Amplify app.
     */

    public Boolean isEnableBranchAutoBuild() {
        return this.enableBranchAutoBuild;
    }

    /**
     * <p>
     * Automatically disconnect a branch in the Amplify Console when you delete a branch from your Git repository.
     * </p>
     * 
     * @param enableBranchAutoDeletion
     *        Automatically disconnect a branch in the Amplify Console when you delete a branch from your Git
     *        repository.
     */

    public void setEnableBranchAutoDeletion(Boolean enableBranchAutoDeletion) {
        this.enableBranchAutoDeletion = enableBranchAutoDeletion;
    }

    /**
     * <p>
     * Automatically disconnect a branch in the Amplify Console when you delete a branch from your Git repository.
     * </p>
     * 
     * @return Automatically disconnect a branch in the Amplify Console when you delete a branch from your Git
     *         repository.
     */

    public Boolean getEnableBranchAutoDeletion() {
        return this.enableBranchAutoDeletion;
    }

    /**
     * <p>
     * Automatically disconnect a branch in the Amplify Console when you delete a branch from your Git repository.
     * </p>
     * 
     * @param enableBranchAutoDeletion
     *        Automatically disconnect a branch in the Amplify Console when you delete a branch from your Git
     *        repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withEnableBranchAutoDeletion(Boolean enableBranchAutoDeletion) {
        setEnableBranchAutoDeletion(enableBranchAutoDeletion);
        return this;
    }

    /**
     * <p>
     * Automatically disconnect a branch in the Amplify Console when you delete a branch from your Git repository.
     * </p>
     * 
     * @return Automatically disconnect a branch in the Amplify Console when you delete a branch from your Git
     *         repository.
     */

    public Boolean isEnableBranchAutoDeletion() {
        return this.enableBranchAutoDeletion;
    }

    /**
     * <p>
     * Enables basic authorization for the Amplify app's branches.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enables basic authorization for the Amplify app's branches.
     */

    public void setEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for the Amplify app's branches.
     * </p>
     * 
     * @return Enables basic authorization for the Amplify app's branches.
     */

    public Boolean getEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for the Amplify app's branches.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enables basic authorization for the Amplify app's branches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withEnableBasicAuth(Boolean enableBasicAuth) {
        setEnableBasicAuth(enableBasicAuth);
        return this;
    }

    /**
     * <p>
     * Enables basic authorization for the Amplify app's branches.
     * </p>
     * 
     * @return Enables basic authorization for the Amplify app's branches.
     */

    public Boolean isEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * The basic authorization credentials for branches for the Amplify app.
     * </p>
     * 
     * @param basicAuthCredentials
     *        The basic authorization credentials for branches for the Amplify app.
     */

    public void setBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
    }

    /**
     * <p>
     * The basic authorization credentials for branches for the Amplify app.
     * </p>
     * 
     * @return The basic authorization credentials for branches for the Amplify app.
     */

    public String getBasicAuthCredentials() {
        return this.basicAuthCredentials;
    }

    /**
     * <p>
     * The basic authorization credentials for branches for the Amplify app.
     * </p>
     * 
     * @param basicAuthCredentials
     *        The basic authorization credentials for branches for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withBasicAuthCredentials(String basicAuthCredentials) {
        setBasicAuthCredentials(basicAuthCredentials);
        return this;
    }

    /**
     * <p>
     * Describes the custom redirect and rewrite rules for the Amplify app.
     * </p>
     * 
     * @return Describes the custom redirect and rewrite rules for the Amplify app.
     */

    public java.util.List<CustomRule> getCustomRules() {
        return customRules;
    }

    /**
     * <p>
     * Describes the custom redirect and rewrite rules for the Amplify app.
     * </p>
     * 
     * @param customRules
     *        Describes the custom redirect and rewrite rules for the Amplify app.
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
     * Describes the custom redirect and rewrite rules for the Amplify app.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomRules(java.util.Collection)} or {@link #withCustomRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param customRules
     *        Describes the custom redirect and rewrite rules for the Amplify app.
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
     * Describes the custom redirect and rewrite rules for the Amplify app.
     * </p>
     * 
     * @param customRules
     *        Describes the custom redirect and rewrite rules for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withCustomRules(java.util.Collection<CustomRule> customRules) {
        setCustomRules(customRules);
        return this;
    }

    /**
     * <p>
     * Describes the information about a production branch of the Amplify app.
     * </p>
     * 
     * @param productionBranch
     *        Describes the information about a production branch of the Amplify app.
     */

    public void setProductionBranch(ProductionBranch productionBranch) {
        this.productionBranch = productionBranch;
    }

    /**
     * <p>
     * Describes the information about a production branch of the Amplify app.
     * </p>
     * 
     * @return Describes the information about a production branch of the Amplify app.
     */

    public ProductionBranch getProductionBranch() {
        return this.productionBranch;
    }

    /**
     * <p>
     * Describes the information about a production branch of the Amplify app.
     * </p>
     * 
     * @param productionBranch
     *        Describes the information about a production branch of the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withProductionBranch(ProductionBranch productionBranch) {
        setProductionBranch(productionBranch);
        return this;
    }

    /**
     * <p>
     * Describes the content of the build specification (build spec) for the Amplify app.
     * </p>
     * 
     * @param buildSpec
     *        Describes the content of the build specification (build spec) for the Amplify app.
     */

    public void setBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
    }

    /**
     * <p>
     * Describes the content of the build specification (build spec) for the Amplify app.
     * </p>
     * 
     * @return Describes the content of the build specification (build spec) for the Amplify app.
     */

    public String getBuildSpec() {
        return this.buildSpec;
    }

    /**
     * <p>
     * Describes the content of the build specification (build spec) for the Amplify app.
     * </p>
     * 
     * @param buildSpec
     *        Describes the content of the build specification (build spec) for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withBuildSpec(String buildSpec) {
        setBuildSpec(buildSpec);
        return this;
    }

    /**
     * <p>
     * Describes the custom HTTP headers for the Amplify app.
     * </p>
     * 
     * @param customHeaders
     *        Describes the custom HTTP headers for the Amplify app.
     */

    public void setCustomHeaders(String customHeaders) {
        this.customHeaders = customHeaders;
    }

    /**
     * <p>
     * Describes the custom HTTP headers for the Amplify app.
     * </p>
     * 
     * @return Describes the custom HTTP headers for the Amplify app.
     */

    public String getCustomHeaders() {
        return this.customHeaders;
    }

    /**
     * <p>
     * Describes the custom HTTP headers for the Amplify app.
     * </p>
     * 
     * @param customHeaders
     *        Describes the custom HTTP headers for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withCustomHeaders(String customHeaders) {
        setCustomHeaders(customHeaders);
        return this;
    }

    /**
     * <p>
     * Enables automated branch creation for the Amplify app.
     * </p>
     * 
     * @param enableAutoBranchCreation
     *        Enables automated branch creation for the Amplify app.
     */

    public void setEnableAutoBranchCreation(Boolean enableAutoBranchCreation) {
        this.enableAutoBranchCreation = enableAutoBranchCreation;
    }

    /**
     * <p>
     * Enables automated branch creation for the Amplify app.
     * </p>
     * 
     * @return Enables automated branch creation for the Amplify app.
     */

    public Boolean getEnableAutoBranchCreation() {
        return this.enableAutoBranchCreation;
    }

    /**
     * <p>
     * Enables automated branch creation for the Amplify app.
     * </p>
     * 
     * @param enableAutoBranchCreation
     *        Enables automated branch creation for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withEnableAutoBranchCreation(Boolean enableAutoBranchCreation) {
        setEnableAutoBranchCreation(enableAutoBranchCreation);
        return this;
    }

    /**
     * <p>
     * Enables automated branch creation for the Amplify app.
     * </p>
     * 
     * @return Enables automated branch creation for the Amplify app.
     */

    public Boolean isEnableAutoBranchCreation() {
        return this.enableAutoBranchCreation;
    }

    /**
     * <p>
     * Describes the automated branch creation glob patterns for the Amplify app.
     * </p>
     * 
     * @return Describes the automated branch creation glob patterns for the Amplify app.
     */

    public java.util.List<String> getAutoBranchCreationPatterns() {
        return autoBranchCreationPatterns;
    }

    /**
     * <p>
     * Describes the automated branch creation glob patterns for the Amplify app.
     * </p>
     * 
     * @param autoBranchCreationPatterns
     *        Describes the automated branch creation glob patterns for the Amplify app.
     */

    public void setAutoBranchCreationPatterns(java.util.Collection<String> autoBranchCreationPatterns) {
        if (autoBranchCreationPatterns == null) {
            this.autoBranchCreationPatterns = null;
            return;
        }

        this.autoBranchCreationPatterns = new java.util.ArrayList<String>(autoBranchCreationPatterns);
    }

    /**
     * <p>
     * Describes the automated branch creation glob patterns for the Amplify app.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoBranchCreationPatterns(java.util.Collection)} or
     * {@link #withAutoBranchCreationPatterns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param autoBranchCreationPatterns
     *        Describes the automated branch creation glob patterns for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withAutoBranchCreationPatterns(String... autoBranchCreationPatterns) {
        if (this.autoBranchCreationPatterns == null) {
            setAutoBranchCreationPatterns(new java.util.ArrayList<String>(autoBranchCreationPatterns.length));
        }
        for (String ele : autoBranchCreationPatterns) {
            this.autoBranchCreationPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the automated branch creation glob patterns for the Amplify app.
     * </p>
     * 
     * @param autoBranchCreationPatterns
     *        Describes the automated branch creation glob patterns for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withAutoBranchCreationPatterns(java.util.Collection<String> autoBranchCreationPatterns) {
        setAutoBranchCreationPatterns(autoBranchCreationPatterns);
        return this;
    }

    /**
     * <p>
     * Describes the automated branch creation configuration for the Amplify app.
     * </p>
     * 
     * @param autoBranchCreationConfig
     *        Describes the automated branch creation configuration for the Amplify app.
     */

    public void setAutoBranchCreationConfig(AutoBranchCreationConfig autoBranchCreationConfig) {
        this.autoBranchCreationConfig = autoBranchCreationConfig;
    }

    /**
     * <p>
     * Describes the automated branch creation configuration for the Amplify app.
     * </p>
     * 
     * @return Describes the automated branch creation configuration for the Amplify app.
     */

    public AutoBranchCreationConfig getAutoBranchCreationConfig() {
        return this.autoBranchCreationConfig;
    }

    /**
     * <p>
     * Describes the automated branch creation configuration for the Amplify app.
     * </p>
     * 
     * @param autoBranchCreationConfig
     *        Describes the automated branch creation configuration for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withAutoBranchCreationConfig(AutoBranchCreationConfig autoBranchCreationConfig) {
        setAutoBranchCreationConfig(autoBranchCreationConfig);
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
        if (getEnableBranchAutoDeletion() != null)
            sb.append("EnableBranchAutoDeletion: ").append(getEnableBranchAutoDeletion()).append(",");
        if (getEnableBasicAuth() != null)
            sb.append("EnableBasicAuth: ").append(getEnableBasicAuth()).append(",");
        if (getBasicAuthCredentials() != null)
            sb.append("BasicAuthCredentials: ").append("***Sensitive Data Redacted***").append(",");
        if (getCustomRules() != null)
            sb.append("CustomRules: ").append(getCustomRules()).append(",");
        if (getProductionBranch() != null)
            sb.append("ProductionBranch: ").append(getProductionBranch()).append(",");
        if (getBuildSpec() != null)
            sb.append("BuildSpec: ").append(getBuildSpec()).append(",");
        if (getCustomHeaders() != null)
            sb.append("CustomHeaders: ").append(getCustomHeaders()).append(",");
        if (getEnableAutoBranchCreation() != null)
            sb.append("EnableAutoBranchCreation: ").append(getEnableAutoBranchCreation()).append(",");
        if (getAutoBranchCreationPatterns() != null)
            sb.append("AutoBranchCreationPatterns: ").append(getAutoBranchCreationPatterns()).append(",");
        if (getAutoBranchCreationConfig() != null)
            sb.append("AutoBranchCreationConfig: ").append(getAutoBranchCreationConfig());
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
        if (other.getEnableBranchAutoDeletion() == null ^ this.getEnableBranchAutoDeletion() == null)
            return false;
        if (other.getEnableBranchAutoDeletion() != null && other.getEnableBranchAutoDeletion().equals(this.getEnableBranchAutoDeletion()) == false)
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
        if (other.getCustomHeaders() == null ^ this.getCustomHeaders() == null)
            return false;
        if (other.getCustomHeaders() != null && other.getCustomHeaders().equals(this.getCustomHeaders()) == false)
            return false;
        if (other.getEnableAutoBranchCreation() == null ^ this.getEnableAutoBranchCreation() == null)
            return false;
        if (other.getEnableAutoBranchCreation() != null && other.getEnableAutoBranchCreation().equals(this.getEnableAutoBranchCreation()) == false)
            return false;
        if (other.getAutoBranchCreationPatterns() == null ^ this.getAutoBranchCreationPatterns() == null)
            return false;
        if (other.getAutoBranchCreationPatterns() != null && other.getAutoBranchCreationPatterns().equals(this.getAutoBranchCreationPatterns()) == false)
            return false;
        if (other.getAutoBranchCreationConfig() == null ^ this.getAutoBranchCreationConfig() == null)
            return false;
        if (other.getAutoBranchCreationConfig() != null && other.getAutoBranchCreationConfig().equals(this.getAutoBranchCreationConfig()) == false)
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
        hashCode = prime * hashCode + ((getEnableBranchAutoDeletion() == null) ? 0 : getEnableBranchAutoDeletion().hashCode());
        hashCode = prime * hashCode + ((getEnableBasicAuth() == null) ? 0 : getEnableBasicAuth().hashCode());
        hashCode = prime * hashCode + ((getBasicAuthCredentials() == null) ? 0 : getBasicAuthCredentials().hashCode());
        hashCode = prime * hashCode + ((getCustomRules() == null) ? 0 : getCustomRules().hashCode());
        hashCode = prime * hashCode + ((getProductionBranch() == null) ? 0 : getProductionBranch().hashCode());
        hashCode = prime * hashCode + ((getBuildSpec() == null) ? 0 : getBuildSpec().hashCode());
        hashCode = prime * hashCode + ((getCustomHeaders() == null) ? 0 : getCustomHeaders().hashCode());
        hashCode = prime * hashCode + ((getEnableAutoBranchCreation() == null) ? 0 : getEnableAutoBranchCreation().hashCode());
        hashCode = prime * hashCode + ((getAutoBranchCreationPatterns() == null) ? 0 : getAutoBranchCreationPatterns().hashCode());
        hashCode = prime * hashCode + ((getAutoBranchCreationConfig() == null) ? 0 : getAutoBranchCreationConfig().hashCode());
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

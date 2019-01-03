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
 * Branch for an Amplify App, which maps to a 3rd party repository branch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/Branch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Branch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN for a branch, part of an Amplify App.
     * </p>
     */
    private String branchArn;
    /**
     * <p>
     * Name for a branch, part of an Amplify App.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * Description for a branch, part of an Amplify App.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Tag for branch for Amplify App.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Stage for a branch, part of an Amplify App.
     * </p>
     */
    private String stage;
    /**
     * <p>
     * Display name for a branch, part of an Amplify App.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * Enables notifications for a branch, part of an Amplify App.
     * </p>
     */
    private Boolean enableNotification;
    /**
     * <p>
     * Creation date and time for a branch, part of an Amplify App.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * Last updated date and time for a branch, part of an Amplify App.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * Environment Variables specific to a branch, part of an Amplify App.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;
    /**
     * <p>
     * Enables auto-building on push for a branch, part of an Amplify App.
     * </p>
     */
    private Boolean enableAutoBuild;
    /**
     * <p>
     * Custom domains for a branch, part of an Amplify App.
     * </p>
     */
    private java.util.List<String> customDomains;
    /**
     * <p>
     * Framework for a branch, part of an Amplify App.
     * </p>
     */
    private String framework;
    /**
     * <p>
     * Id of the active job for a branch, part of an Amplify App.
     * </p>
     */
    private String activeJobId;
    /**
     * <p>
     * Total number of Jobs part of an Amplify App.
     * </p>
     */
    private String totalNumberOfJobs;
    /**
     * <p>
     * Enables Basic Authorization for a branch, part of an Amplify App.
     * </p>
     */
    private Boolean enableBasicAuth;
    /**
     * <p>
     * Thumbnail Url for the branch.
     * </p>
     */
    private String thumbnailUrl;
    /**
     * <p>
     * Basic Authorization credentials for a branch, part of an Amplify App.
     * </p>
     */
    private String basicAuthCredentials;
    /**
     * <p>
     * BuildSpec content for branch for Amplify App.
     * </p>
     */
    private String buildSpec;
    /**
     * <p>
     * The content TTL for the website in seconds.
     * </p>
     */
    private String ttl;

    /**
     * <p>
     * ARN for a branch, part of an Amplify App.
     * </p>
     * 
     * @param branchArn
     *        ARN for a branch, part of an Amplify App.
     */

    public void setBranchArn(String branchArn) {
        this.branchArn = branchArn;
    }

    /**
     * <p>
     * ARN for a branch, part of an Amplify App.
     * </p>
     * 
     * @return ARN for a branch, part of an Amplify App.
     */

    public String getBranchArn() {
        return this.branchArn;
    }

    /**
     * <p>
     * ARN for a branch, part of an Amplify App.
     * </p>
     * 
     * @param branchArn
     *        ARN for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withBranchArn(String branchArn) {
        setBranchArn(branchArn);
        return this;
    }

    /**
     * <p>
     * Name for a branch, part of an Amplify App.
     * </p>
     * 
     * @param branchName
     *        Name for a branch, part of an Amplify App.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * Name for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Name for a branch, part of an Amplify App.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * Name for a branch, part of an Amplify App.
     * </p>
     * 
     * @param branchName
     *        Name for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * Description for a branch, part of an Amplify App.
     * </p>
     * 
     * @param description
     *        Description for a branch, part of an Amplify App.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Description for a branch, part of an Amplify App.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description for a branch, part of an Amplify App.
     * </p>
     * 
     * @param description
     *        Description for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Tag for branch for Amplify App.
     * </p>
     * 
     * @return Tag for branch for Amplify App.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tag for branch for Amplify App.
     * </p>
     * 
     * @param tags
     *        Tag for branch for Amplify App.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tag for branch for Amplify App.
     * </p>
     * 
     * @param tags
     *        Tag for branch for Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public Branch addTagsEntry(String key, String value) {
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

    public Branch clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Stage for a branch, part of an Amplify App.
     * </p>
     * 
     * @param stage
     *        Stage for a branch, part of an Amplify App.
     * @see Stage
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * Stage for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Stage for a branch, part of an Amplify App.
     * @see Stage
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * Stage for a branch, part of an Amplify App.
     * </p>
     * 
     * @param stage
     *        Stage for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Stage
     */

    public Branch withStage(String stage) {
        setStage(stage);
        return this;
    }

    /**
     * <p>
     * Stage for a branch, part of an Amplify App.
     * </p>
     * 
     * @param stage
     *        Stage for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Stage
     */

    public Branch withStage(Stage stage) {
        this.stage = stage.toString();
        return this;
    }

    /**
     * <p>
     * Display name for a branch, part of an Amplify App.
     * </p>
     * 
     * @param displayName
     *        Display name for a branch, part of an Amplify App.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * Display name for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Display name for a branch, part of an Amplify App.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * Display name for a branch, part of an Amplify App.
     * </p>
     * 
     * @param displayName
     *        Display name for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * Enables notifications for a branch, part of an Amplify App.
     * </p>
     * 
     * @param enableNotification
     *        Enables notifications for a branch, part of an Amplify App.
     */

    public void setEnableNotification(Boolean enableNotification) {
        this.enableNotification = enableNotification;
    }

    /**
     * <p>
     * Enables notifications for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Enables notifications for a branch, part of an Amplify App.
     */

    public Boolean getEnableNotification() {
        return this.enableNotification;
    }

    /**
     * <p>
     * Enables notifications for a branch, part of an Amplify App.
     * </p>
     * 
     * @param enableNotification
     *        Enables notifications for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withEnableNotification(Boolean enableNotification) {
        setEnableNotification(enableNotification);
        return this;
    }

    /**
     * <p>
     * Enables notifications for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Enables notifications for a branch, part of an Amplify App.
     */

    public Boolean isEnableNotification() {
        return this.enableNotification;
    }

    /**
     * <p>
     * Creation date and time for a branch, part of an Amplify App.
     * </p>
     * 
     * @param createTime
     *        Creation date and time for a branch, part of an Amplify App.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * Creation date and time for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Creation date and time for a branch, part of an Amplify App.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * Creation date and time for a branch, part of an Amplify App.
     * </p>
     * 
     * @param createTime
     *        Creation date and time for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * Last updated date and time for a branch, part of an Amplify App.
     * </p>
     * 
     * @param updateTime
     *        Last updated date and time for a branch, part of an Amplify App.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * Last updated date and time for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Last updated date and time for a branch, part of an Amplify App.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * Last updated date and time for a branch, part of an Amplify App.
     * </p>
     * 
     * @param updateTime
     *        Last updated date and time for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * Environment Variables specific to a branch, part of an Amplify App.
     * </p>
     * 
     * @return Environment Variables specific to a branch, part of an Amplify App.
     */

    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * Environment Variables specific to a branch, part of an Amplify App.
     * </p>
     * 
     * @param environmentVariables
     *        Environment Variables specific to a branch, part of an Amplify App.
     */

    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * Environment Variables specific to a branch, part of an Amplify App.
     * </p>
     * 
     * @param environmentVariables
     *        Environment Variables specific to a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    public Branch addEnvironmentVariablesEntry(String key, String value) {
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

    public Branch clearEnvironmentVariablesEntries() {
        this.environmentVariables = null;
        return this;
    }

    /**
     * <p>
     * Enables auto-building on push for a branch, part of an Amplify App.
     * </p>
     * 
     * @param enableAutoBuild
     *        Enables auto-building on push for a branch, part of an Amplify App.
     */

    public void setEnableAutoBuild(Boolean enableAutoBuild) {
        this.enableAutoBuild = enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto-building on push for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Enables auto-building on push for a branch, part of an Amplify App.
     */

    public Boolean getEnableAutoBuild() {
        return this.enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto-building on push for a branch, part of an Amplify App.
     * </p>
     * 
     * @param enableAutoBuild
     *        Enables auto-building on push for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withEnableAutoBuild(Boolean enableAutoBuild) {
        setEnableAutoBuild(enableAutoBuild);
        return this;
    }

    /**
     * <p>
     * Enables auto-building on push for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Enables auto-building on push for a branch, part of an Amplify App.
     */

    public Boolean isEnableAutoBuild() {
        return this.enableAutoBuild;
    }

    /**
     * <p>
     * Custom domains for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Custom domains for a branch, part of an Amplify App.
     */

    public java.util.List<String> getCustomDomains() {
        return customDomains;
    }

    /**
     * <p>
     * Custom domains for a branch, part of an Amplify App.
     * </p>
     * 
     * @param customDomains
     *        Custom domains for a branch, part of an Amplify App.
     */

    public void setCustomDomains(java.util.Collection<String> customDomains) {
        if (customDomains == null) {
            this.customDomains = null;
            return;
        }

        this.customDomains = new java.util.ArrayList<String>(customDomains);
    }

    /**
     * <p>
     * Custom domains for a branch, part of an Amplify App.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomDomains(java.util.Collection)} or {@link #withCustomDomains(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param customDomains
     *        Custom domains for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withCustomDomains(String... customDomains) {
        if (this.customDomains == null) {
            setCustomDomains(new java.util.ArrayList<String>(customDomains.length));
        }
        for (String ele : customDomains) {
            this.customDomains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Custom domains for a branch, part of an Amplify App.
     * </p>
     * 
     * @param customDomains
     *        Custom domains for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withCustomDomains(java.util.Collection<String> customDomains) {
        setCustomDomains(customDomains);
        return this;
    }

    /**
     * <p>
     * Framework for a branch, part of an Amplify App.
     * </p>
     * 
     * @param framework
     *        Framework for a branch, part of an Amplify App.
     */

    public void setFramework(String framework) {
        this.framework = framework;
    }

    /**
     * <p>
     * Framework for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Framework for a branch, part of an Amplify App.
     */

    public String getFramework() {
        return this.framework;
    }

    /**
     * <p>
     * Framework for a branch, part of an Amplify App.
     * </p>
     * 
     * @param framework
     *        Framework for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withFramework(String framework) {
        setFramework(framework);
        return this;
    }

    /**
     * <p>
     * Id of the active job for a branch, part of an Amplify App.
     * </p>
     * 
     * @param activeJobId
     *        Id of the active job for a branch, part of an Amplify App.
     */

    public void setActiveJobId(String activeJobId) {
        this.activeJobId = activeJobId;
    }

    /**
     * <p>
     * Id of the active job for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Id of the active job for a branch, part of an Amplify App.
     */

    public String getActiveJobId() {
        return this.activeJobId;
    }

    /**
     * <p>
     * Id of the active job for a branch, part of an Amplify App.
     * </p>
     * 
     * @param activeJobId
     *        Id of the active job for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withActiveJobId(String activeJobId) {
        setActiveJobId(activeJobId);
        return this;
    }

    /**
     * <p>
     * Total number of Jobs part of an Amplify App.
     * </p>
     * 
     * @param totalNumberOfJobs
     *        Total number of Jobs part of an Amplify App.
     */

    public void setTotalNumberOfJobs(String totalNumberOfJobs) {
        this.totalNumberOfJobs = totalNumberOfJobs;
    }

    /**
     * <p>
     * Total number of Jobs part of an Amplify App.
     * </p>
     * 
     * @return Total number of Jobs part of an Amplify App.
     */

    public String getTotalNumberOfJobs() {
        return this.totalNumberOfJobs;
    }

    /**
     * <p>
     * Total number of Jobs part of an Amplify App.
     * </p>
     * 
     * @param totalNumberOfJobs
     *        Total number of Jobs part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withTotalNumberOfJobs(String totalNumberOfJobs) {
        setTotalNumberOfJobs(totalNumberOfJobs);
        return this;
    }

    /**
     * <p>
     * Enables Basic Authorization for a branch, part of an Amplify App.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enables Basic Authorization for a branch, part of an Amplify App.
     */

    public void setEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
    }

    /**
     * <p>
     * Enables Basic Authorization for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Enables Basic Authorization for a branch, part of an Amplify App.
     */

    public Boolean getEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * Enables Basic Authorization for a branch, part of an Amplify App.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enables Basic Authorization for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withEnableBasicAuth(Boolean enableBasicAuth) {
        setEnableBasicAuth(enableBasicAuth);
        return this;
    }

    /**
     * <p>
     * Enables Basic Authorization for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Enables Basic Authorization for a branch, part of an Amplify App.
     */

    public Boolean isEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * Thumbnail Url for the branch.
     * </p>
     * 
     * @param thumbnailUrl
     *        Thumbnail Url for the branch.
     */

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * <p>
     * Thumbnail Url for the branch.
     * </p>
     * 
     * @return Thumbnail Url for the branch.
     */

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /**
     * <p>
     * Thumbnail Url for the branch.
     * </p>
     * 
     * @param thumbnailUrl
     *        Thumbnail Url for the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withThumbnailUrl(String thumbnailUrl) {
        setThumbnailUrl(thumbnailUrl);
        return this;
    }

    /**
     * <p>
     * Basic Authorization credentials for a branch, part of an Amplify App.
     * </p>
     * 
     * @param basicAuthCredentials
     *        Basic Authorization credentials for a branch, part of an Amplify App.
     */

    public void setBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
    }

    /**
     * <p>
     * Basic Authorization credentials for a branch, part of an Amplify App.
     * </p>
     * 
     * @return Basic Authorization credentials for a branch, part of an Amplify App.
     */

    public String getBasicAuthCredentials() {
        return this.basicAuthCredentials;
    }

    /**
     * <p>
     * Basic Authorization credentials for a branch, part of an Amplify App.
     * </p>
     * 
     * @param basicAuthCredentials
     *        Basic Authorization credentials for a branch, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withBasicAuthCredentials(String basicAuthCredentials) {
        setBasicAuthCredentials(basicAuthCredentials);
        return this;
    }

    /**
     * <p>
     * BuildSpec content for branch for Amplify App.
     * </p>
     * 
     * @param buildSpec
     *        BuildSpec content for branch for Amplify App.
     */

    public void setBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
    }

    /**
     * <p>
     * BuildSpec content for branch for Amplify App.
     * </p>
     * 
     * @return BuildSpec content for branch for Amplify App.
     */

    public String getBuildSpec() {
        return this.buildSpec;
    }

    /**
     * <p>
     * BuildSpec content for branch for Amplify App.
     * </p>
     * 
     * @param buildSpec
     *        BuildSpec content for branch for Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withBuildSpec(String buildSpec) {
        setBuildSpec(buildSpec);
        return this;
    }

    /**
     * <p>
     * The content TTL for the website in seconds.
     * </p>
     * 
     * @param ttl
     *        The content TTL for the website in seconds.
     */

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    /**
     * <p>
     * The content TTL for the website in seconds.
     * </p>
     * 
     * @return The content TTL for the website in seconds.
     */

    public String getTtl() {
        return this.ttl;
    }

    /**
     * <p>
     * The content TTL for the website in seconds.
     * </p>
     * 
     * @param ttl
     *        The content TTL for the website in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withTtl(String ttl) {
        setTtl(ttl);
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
        if (getBranchArn() != null)
            sb.append("BranchArn: ").append(getBranchArn()).append(",");
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getStage() != null)
            sb.append("Stage: ").append(getStage()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getEnableNotification() != null)
            sb.append("EnableNotification: ").append(getEnableNotification()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables()).append(",");
        if (getEnableAutoBuild() != null)
            sb.append("EnableAutoBuild: ").append(getEnableAutoBuild()).append(",");
        if (getCustomDomains() != null)
            sb.append("CustomDomains: ").append(getCustomDomains()).append(",");
        if (getFramework() != null)
            sb.append("Framework: ").append(getFramework()).append(",");
        if (getActiveJobId() != null)
            sb.append("ActiveJobId: ").append(getActiveJobId()).append(",");
        if (getTotalNumberOfJobs() != null)
            sb.append("TotalNumberOfJobs: ").append(getTotalNumberOfJobs()).append(",");
        if (getEnableBasicAuth() != null)
            sb.append("EnableBasicAuth: ").append(getEnableBasicAuth()).append(",");
        if (getThumbnailUrl() != null)
            sb.append("ThumbnailUrl: ").append(getThumbnailUrl()).append(",");
        if (getBasicAuthCredentials() != null)
            sb.append("BasicAuthCredentials: ").append(getBasicAuthCredentials()).append(",");
        if (getBuildSpec() != null)
            sb.append("BuildSpec: ").append(getBuildSpec()).append(",");
        if (getTtl() != null)
            sb.append("Ttl: ").append(getTtl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Branch == false)
            return false;
        Branch other = (Branch) obj;
        if (other.getBranchArn() == null ^ this.getBranchArn() == null)
            return false;
        if (other.getBranchArn() != null && other.getBranchArn().equals(this.getBranchArn()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getEnableNotification() == null ^ this.getEnableNotification() == null)
            return false;
        if (other.getEnableNotification() != null && other.getEnableNotification().equals(this.getEnableNotification()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        if (other.getEnableAutoBuild() == null ^ this.getEnableAutoBuild() == null)
            return false;
        if (other.getEnableAutoBuild() != null && other.getEnableAutoBuild().equals(this.getEnableAutoBuild()) == false)
            return false;
        if (other.getCustomDomains() == null ^ this.getCustomDomains() == null)
            return false;
        if (other.getCustomDomains() != null && other.getCustomDomains().equals(this.getCustomDomains()) == false)
            return false;
        if (other.getFramework() == null ^ this.getFramework() == null)
            return false;
        if (other.getFramework() != null && other.getFramework().equals(this.getFramework()) == false)
            return false;
        if (other.getActiveJobId() == null ^ this.getActiveJobId() == null)
            return false;
        if (other.getActiveJobId() != null && other.getActiveJobId().equals(this.getActiveJobId()) == false)
            return false;
        if (other.getTotalNumberOfJobs() == null ^ this.getTotalNumberOfJobs() == null)
            return false;
        if (other.getTotalNumberOfJobs() != null && other.getTotalNumberOfJobs().equals(this.getTotalNumberOfJobs()) == false)
            return false;
        if (other.getEnableBasicAuth() == null ^ this.getEnableBasicAuth() == null)
            return false;
        if (other.getEnableBasicAuth() != null && other.getEnableBasicAuth().equals(this.getEnableBasicAuth()) == false)
            return false;
        if (other.getThumbnailUrl() == null ^ this.getThumbnailUrl() == null)
            return false;
        if (other.getThumbnailUrl() != null && other.getThumbnailUrl().equals(this.getThumbnailUrl()) == false)
            return false;
        if (other.getBasicAuthCredentials() == null ^ this.getBasicAuthCredentials() == null)
            return false;
        if (other.getBasicAuthCredentials() != null && other.getBasicAuthCredentials().equals(this.getBasicAuthCredentials()) == false)
            return false;
        if (other.getBuildSpec() == null ^ this.getBuildSpec() == null)
            return false;
        if (other.getBuildSpec() != null && other.getBuildSpec().equals(this.getBuildSpec()) == false)
            return false;
        if (other.getTtl() == null ^ this.getTtl() == null)
            return false;
        if (other.getTtl() != null && other.getTtl().equals(this.getTtl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranchArn() == null) ? 0 : getBranchArn().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getEnableNotification() == null) ? 0 : getEnableNotification().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime * hashCode + ((getEnableAutoBuild() == null) ? 0 : getEnableAutoBuild().hashCode());
        hashCode = prime * hashCode + ((getCustomDomains() == null) ? 0 : getCustomDomains().hashCode());
        hashCode = prime * hashCode + ((getFramework() == null) ? 0 : getFramework().hashCode());
        hashCode = prime * hashCode + ((getActiveJobId() == null) ? 0 : getActiveJobId().hashCode());
        hashCode = prime * hashCode + ((getTotalNumberOfJobs() == null) ? 0 : getTotalNumberOfJobs().hashCode());
        hashCode = prime * hashCode + ((getEnableBasicAuth() == null) ? 0 : getEnableBasicAuth().hashCode());
        hashCode = prime * hashCode + ((getThumbnailUrl() == null) ? 0 : getThumbnailUrl().hashCode());
        hashCode = prime * hashCode + ((getBasicAuthCredentials() == null) ? 0 : getBasicAuthCredentials().hashCode());
        hashCode = prime * hashCode + ((getBuildSpec() == null) ? 0 : getBuildSpec().hashCode());
        hashCode = prime * hashCode + ((getTtl() == null) ? 0 : getTtl().hashCode());
        return hashCode;
    }

    @Override
    public Branch clone() {
        try {
            return (Branch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.BranchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

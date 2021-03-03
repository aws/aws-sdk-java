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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a batch build.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BuildBatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildBatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the batch build.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN of the batch build.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the batch build started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time that the batch build ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The current phase of the batch build.
     * </p>
     */
    private String currentPhase;
    /**
     * <p>
     * The status of the batch build.
     * </p>
     */
    private String buildBatchStatus;
    /**
     * <p>
     * The identifier of the version of the source code to be built.
     * </p>
     */
    private String sourceVersion;
    /**
     * <p>
     * The identifier of the resolved version of this batch build's source code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * For AWS CodePipeline, the source revision provided by AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon S3, this does not apply.
     * </p>
     * </li>
     * </ul>
     */
    private String resolvedSourceVersion;
    /**
     * <p>
     * The name of the batch build project.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * An array of <code>BuildBatchPhase</code> objects the specify the phases of the batch build.
     * </p>
     */
    private java.util.List<BuildBatchPhase> phases;

    private ProjectSource source;
    /**
     * <p>
     * An array of <code>ProjectSource</code> objects that define the sources for the batch build.
     * </p>
     */
    private java.util.List<ProjectSource> secondarySources;
    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects. Each <code>ProjectSourceVersion</code> must be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the
     * source code you want to build. If a pull request ID is specified, it must use the format
     * <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a branch name is specified, the branch's
     * HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you
     * want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default
     * branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon S3: the version ID of the object that represents the build input ZIP file to use.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<ProjectSourceVersion> secondarySourceVersions;
    /**
     * <p>
     * A <code>BuildArtifacts</code> object the defines the build artifacts for this batch build.
     * </p>
     */
    private BuildArtifacts artifacts;
    /**
     * <p>
     * An array of <code>BuildArtifacts</code> objects the define the build artifacts for this batch build.
     * </p>
     */
    private java.util.List<BuildArtifacts> secondaryArtifacts;

    private ProjectCache cache;

    private ProjectEnvironment environment;
    /**
     * <p>
     * The name of a service role used for builds in the batch.
     * </p>
     */
    private String serviceRole;

    private LogsConfig logConfig;
    /**
     * <p>
     * Specifies the maximum amount of time, in minutes, that the build in a batch must be completed in.
     * </p>
     */
    private Integer buildTimeoutInMinutes;
    /**
     * <p>
     * Specifies the amount of time, in minutes, that the batch build is allowed to be queued before it times out.
     * </p>
     */
    private Integer queuedTimeoutInMinutes;
    /**
     * <p>
     * Indicates if the batch build is complete.
     * </p>
     */
    private Boolean complete;
    /**
     * <p>
     * The entity that started the batch build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If AWS CodePipeline started the build, the pipeline's name (for example,
     * <code>codepipeline/my-demo-pipeline</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If an AWS Identity and Access Management (IAM) user started the build, the user's name.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the Jenkins plugin for AWS CodeBuild started the build, the string <code>CodeBuild-Jenkins-Plugin</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String initiator;

    private VpcConfig vpcConfig;
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the batch build
     * output artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to
     * that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the
     * format <code>alias/&lt;alias-name&gt;</code>).
     * </p>
     */
    private String encryptionKey;
    /**
     * <p>
     * The number of the batch build. For each project, the <code>buildBatchNumber</code> of its first batch build is
     * <code>1</code>. The <code>buildBatchNumber</code> of each subsequent batch build is incremented by <code>1</code>
     * . If a batch build is deleted, the <code>buildBatchNumber</code> of other batch builds does not change.
     * </p>
     */
    private Long buildBatchNumber;
    /**
     * <p>
     * An array of <code>ProjectFileSystemLocation</code> objects for the batch build project. A
     * <code>ProjectFileSystemLocation</code> object specifies the <code>identifier</code>, <code>location</code>,
     * <code>mountOptions</code>, <code>mountPoint</code>, and <code>type</code> of a file system created using Amazon
     * Elastic File System.
     * </p>
     */
    private java.util.List<ProjectFileSystemLocation> fileSystemLocations;

    private ProjectBuildBatchConfig buildBatchConfig;
    /**
     * <p>
     * An array of <code>BuildGroup</code> objects that define the build groups for the batch build.
     * </p>
     */
    private java.util.List<BuildGroup> buildGroups;
    /**
     * <p/>
     * <p>
     * Specifies if session debugging is enabled for this batch build. For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/session-manager.html">Viewing a running build in
     * Session Manager</a>. Batch session debugging is not supported for matrix batch builds.
     * </p>
     */
    private Boolean debugSessionEnabled;

    /**
     * <p>
     * The identifier of the batch build.
     * </p>
     * 
     * @param id
     *        The identifier of the batch build.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the batch build.
     * </p>
     * 
     * @return The identifier of the batch build.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the batch build.
     * </p>
     * 
     * @param id
     *        The identifier of the batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN of the batch build.
     * </p>
     * 
     * @param arn
     *        The ARN of the batch build.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the batch build.
     * </p>
     * 
     * @return The ARN of the batch build.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the batch build.
     * </p>
     * 
     * @param arn
     *        The ARN of the batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the batch build started.
     * </p>
     * 
     * @param startTime
     *        The date and time that the batch build started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time that the batch build started.
     * </p>
     * 
     * @return The date and time that the batch build started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time that the batch build started.
     * </p>
     * 
     * @param startTime
     *        The date and time that the batch build started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the batch build ended.
     * </p>
     * 
     * @param endTime
     *        The date and time that the batch build ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time that the batch build ended.
     * </p>
     * 
     * @return The date and time that the batch build ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time that the batch build ended.
     * </p>
     * 
     * @param endTime
     *        The date and time that the batch build ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The current phase of the batch build.
     * </p>
     * 
     * @param currentPhase
     *        The current phase of the batch build.
     */

    public void setCurrentPhase(String currentPhase) {
        this.currentPhase = currentPhase;
    }

    /**
     * <p>
     * The current phase of the batch build.
     * </p>
     * 
     * @return The current phase of the batch build.
     */

    public String getCurrentPhase() {
        return this.currentPhase;
    }

    /**
     * <p>
     * The current phase of the batch build.
     * </p>
     * 
     * @param currentPhase
     *        The current phase of the batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withCurrentPhase(String currentPhase) {
        setCurrentPhase(currentPhase);
        return this;
    }

    /**
     * <p>
     * The status of the batch build.
     * </p>
     * 
     * @param buildBatchStatus
     *        The status of the batch build.
     * @see StatusType
     */

    public void setBuildBatchStatus(String buildBatchStatus) {
        this.buildBatchStatus = buildBatchStatus;
    }

    /**
     * <p>
     * The status of the batch build.
     * </p>
     * 
     * @return The status of the batch build.
     * @see StatusType
     */

    public String getBuildBatchStatus() {
        return this.buildBatchStatus;
    }

    /**
     * <p>
     * The status of the batch build.
     * </p>
     * 
     * @param buildBatchStatus
     *        The status of the batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public BuildBatch withBuildBatchStatus(String buildBatchStatus) {
        setBuildBatchStatus(buildBatchStatus);
        return this;
    }

    /**
     * <p>
     * The status of the batch build.
     * </p>
     * 
     * @param buildBatchStatus
     *        The status of the batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public BuildBatch withBuildBatchStatus(StatusType buildBatchStatus) {
        this.buildBatchStatus = buildBatchStatus.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the version of the source code to be built.
     * </p>
     * 
     * @param sourceVersion
     *        The identifier of the version of the source code to be built.
     */

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * The identifier of the version of the source code to be built.
     * </p>
     * 
     * @return The identifier of the version of the source code to be built.
     */

    public String getSourceVersion() {
        return this.sourceVersion;
    }

    /**
     * <p>
     * The identifier of the version of the source code to be built.
     * </p>
     * 
     * @param sourceVersion
     *        The identifier of the version of the source code to be built.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withSourceVersion(String sourceVersion) {
        setSourceVersion(sourceVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the resolved version of this batch build's source code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * For AWS CodePipeline, the source revision provided by AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon S3, this does not apply.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resolvedSourceVersion
     *        The identifier of the resolved version of this batch build's source code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For AWS CodePipeline, the source revision provided by AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon S3, this does not apply.
     *        </p>
     *        </li>
     */

    public void setResolvedSourceVersion(String resolvedSourceVersion) {
        this.resolvedSourceVersion = resolvedSourceVersion;
    }

    /**
     * <p>
     * The identifier of the resolved version of this batch build's source code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * For AWS CodePipeline, the source revision provided by AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon S3, this does not apply.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the resolved version of this batch build's source code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For AWS CodePipeline, the source revision provided by AWS CodePipeline.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Amazon S3, this does not apply.
     *         </p>
     *         </li>
     */

    public String getResolvedSourceVersion() {
        return this.resolvedSourceVersion;
    }

    /**
     * <p>
     * The identifier of the resolved version of this batch build's source code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * For AWS CodePipeline, the source revision provided by AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon S3, this does not apply.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resolvedSourceVersion
     *        The identifier of the resolved version of this batch build's source code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For AWS CodePipeline, the source revision provided by AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon S3, this does not apply.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withResolvedSourceVersion(String resolvedSourceVersion) {
        setResolvedSourceVersion(resolvedSourceVersion);
        return this;
    }

    /**
     * <p>
     * The name of the batch build project.
     * </p>
     * 
     * @param projectName
     *        The name of the batch build project.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the batch build project.
     * </p>
     * 
     * @return The name of the batch build project.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the batch build project.
     * </p>
     * 
     * @param projectName
     *        The name of the batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * An array of <code>BuildBatchPhase</code> objects the specify the phases of the batch build.
     * </p>
     * 
     * @return An array of <code>BuildBatchPhase</code> objects the specify the phases of the batch build.
     */

    public java.util.List<BuildBatchPhase> getPhases() {
        return phases;
    }

    /**
     * <p>
     * An array of <code>BuildBatchPhase</code> objects the specify the phases of the batch build.
     * </p>
     * 
     * @param phases
     *        An array of <code>BuildBatchPhase</code> objects the specify the phases of the batch build.
     */

    public void setPhases(java.util.Collection<BuildBatchPhase> phases) {
        if (phases == null) {
            this.phases = null;
            return;
        }

        this.phases = new java.util.ArrayList<BuildBatchPhase>(phases);
    }

    /**
     * <p>
     * An array of <code>BuildBatchPhase</code> objects the specify the phases of the batch build.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhases(java.util.Collection)} or {@link #withPhases(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param phases
     *        An array of <code>BuildBatchPhase</code> objects the specify the phases of the batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withPhases(BuildBatchPhase... phases) {
        if (this.phases == null) {
            setPhases(new java.util.ArrayList<BuildBatchPhase>(phases.length));
        }
        for (BuildBatchPhase ele : phases) {
            this.phases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BuildBatchPhase</code> objects the specify the phases of the batch build.
     * </p>
     * 
     * @param phases
     *        An array of <code>BuildBatchPhase</code> objects the specify the phases of the batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withPhases(java.util.Collection<BuildBatchPhase> phases) {
        setPhases(phases);
        return this;
    }

    /**
     * @param source
     */

    public void setSource(ProjectSource source) {
        this.source = source;
    }

    /**
     * @return
     */

    public ProjectSource getSource() {
        return this.source;
    }

    /**
     * @param source
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withSource(ProjectSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects that define the sources for the batch build.
     * </p>
     * 
     * @return An array of <code>ProjectSource</code> objects that define the sources for the batch build.
     */

    public java.util.List<ProjectSource> getSecondarySources() {
        return secondarySources;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects that define the sources for the batch build.
     * </p>
     * 
     * @param secondarySources
     *        An array of <code>ProjectSource</code> objects that define the sources for the batch build.
     */

    public void setSecondarySources(java.util.Collection<ProjectSource> secondarySources) {
        if (secondarySources == null) {
            this.secondarySources = null;
            return;
        }

        this.secondarySources = new java.util.ArrayList<ProjectSource>(secondarySources);
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects that define the sources for the batch build.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondarySources(java.util.Collection)} or {@link #withSecondarySources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param secondarySources
     *        An array of <code>ProjectSource</code> objects that define the sources for the batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withSecondarySources(ProjectSource... secondarySources) {
        if (this.secondarySources == null) {
            setSecondarySources(new java.util.ArrayList<ProjectSource>(secondarySources.length));
        }
        for (ProjectSource ele : secondarySources) {
            this.secondarySources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects that define the sources for the batch build.
     * </p>
     * 
     * @param secondarySources
     *        An array of <code>ProjectSource</code> objects that define the sources for the batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withSecondarySources(java.util.Collection<ProjectSource> secondarySources) {
        setSecondarySources(secondarySources);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects. Each <code>ProjectSourceVersion</code> must be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the
     * source code you want to build. If a pull request ID is specified, it must use the format
     * <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a branch name is specified, the branch's
     * HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you
     * want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default
     * branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon S3: the version ID of the object that represents the build input ZIP file to use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of <code>ProjectSourceVersion</code> objects. Each <code>ProjectSourceVersion</code> must be one
     *         of: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of
     *         the source code you want to build. If a pull request ID is specified, it must use the format
     *         <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a branch name is specified, the
     *         branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code
     *         you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified,
     *         the default branch's HEAD commit ID is used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Amazon S3: the version ID of the object that represents the build input ZIP file to use.
     *         </p>
     *         </li>
     */

    public java.util.List<ProjectSourceVersion> getSecondarySourceVersions() {
        return secondarySourceVersions;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects. Each <code>ProjectSourceVersion</code> must be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the
     * source code you want to build. If a pull request ID is specified, it must use the format
     * <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a branch name is specified, the branch's
     * HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you
     * want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default
     * branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon S3: the version ID of the object that represents the build input ZIP file to use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secondarySourceVersions
     *        An array of <code>ProjectSourceVersion</code> objects. Each <code>ProjectSourceVersion</code> must be one
     *        of: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of
     *        the source code you want to build. If a pull request ID is specified, it must use the format
     *        <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a branch name is specified, the
     *        branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code
     *        you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified,
     *        the default branch's HEAD commit ID is used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon S3: the version ID of the object that represents the build input ZIP file to use.
     *        </p>
     *        </li>
     */

    public void setSecondarySourceVersions(java.util.Collection<ProjectSourceVersion> secondarySourceVersions) {
        if (secondarySourceVersions == null) {
            this.secondarySourceVersions = null;
            return;
        }

        this.secondarySourceVersions = new java.util.ArrayList<ProjectSourceVersion>(secondarySourceVersions);
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects. Each <code>ProjectSourceVersion</code> must be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the
     * source code you want to build. If a pull request ID is specified, it must use the format
     * <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a branch name is specified, the branch's
     * HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you
     * want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default
     * branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon S3: the version ID of the object that represents the build input ZIP file to use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondarySourceVersions(java.util.Collection)} or
     * {@link #withSecondarySourceVersions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param secondarySourceVersions
     *        An array of <code>ProjectSourceVersion</code> objects. Each <code>ProjectSourceVersion</code> must be one
     *        of: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of
     *        the source code you want to build. If a pull request ID is specified, it must use the format
     *        <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a branch name is specified, the
     *        branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code
     *        you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified,
     *        the default branch's HEAD commit ID is used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon S3: the version ID of the object that represents the build input ZIP file to use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withSecondarySourceVersions(ProjectSourceVersion... secondarySourceVersions) {
        if (this.secondarySourceVersions == null) {
            setSecondarySourceVersions(new java.util.ArrayList<ProjectSourceVersion>(secondarySourceVersions.length));
        }
        for (ProjectSourceVersion ele : secondarySourceVersions) {
            this.secondarySourceVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects. Each <code>ProjectSourceVersion</code> must be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the
     * source code you want to build. If a pull request ID is specified, it must use the format
     * <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a branch name is specified, the branch's
     * HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you
     * want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default
     * branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon S3: the version ID of the object that represents the build input ZIP file to use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secondarySourceVersions
     *        An array of <code>ProjectSourceVersion</code> objects. Each <code>ProjectSourceVersion</code> must be one
     *        of: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of
     *        the source code you want to build. If a pull request ID is specified, it must use the format
     *        <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a branch name is specified, the
     *        branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code
     *        you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified,
     *        the default branch's HEAD commit ID is used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon S3: the version ID of the object that represents the build input ZIP file to use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withSecondarySourceVersions(java.util.Collection<ProjectSourceVersion> secondarySourceVersions) {
        setSecondarySourceVersions(secondarySourceVersions);
        return this;
    }

    /**
     * <p>
     * A <code>BuildArtifacts</code> object the defines the build artifacts for this batch build.
     * </p>
     * 
     * @param artifacts
     *        A <code>BuildArtifacts</code> object the defines the build artifacts for this batch build.
     */

    public void setArtifacts(BuildArtifacts artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * <p>
     * A <code>BuildArtifacts</code> object the defines the build artifacts for this batch build.
     * </p>
     * 
     * @return A <code>BuildArtifacts</code> object the defines the build artifacts for this batch build.
     */

    public BuildArtifacts getArtifacts() {
        return this.artifacts;
    }

    /**
     * <p>
     * A <code>BuildArtifacts</code> object the defines the build artifacts for this batch build.
     * </p>
     * 
     * @param artifacts
     *        A <code>BuildArtifacts</code> object the defines the build artifacts for this batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withArtifacts(BuildArtifacts artifacts) {
        setArtifacts(artifacts);
        return this;
    }

    /**
     * <p>
     * An array of <code>BuildArtifacts</code> objects the define the build artifacts for this batch build.
     * </p>
     * 
     * @return An array of <code>BuildArtifacts</code> objects the define the build artifacts for this batch build.
     */

    public java.util.List<BuildArtifacts> getSecondaryArtifacts() {
        return secondaryArtifacts;
    }

    /**
     * <p>
     * An array of <code>BuildArtifacts</code> objects the define the build artifacts for this batch build.
     * </p>
     * 
     * @param secondaryArtifacts
     *        An array of <code>BuildArtifacts</code> objects the define the build artifacts for this batch build.
     */

    public void setSecondaryArtifacts(java.util.Collection<BuildArtifacts> secondaryArtifacts) {
        if (secondaryArtifacts == null) {
            this.secondaryArtifacts = null;
            return;
        }

        this.secondaryArtifacts = new java.util.ArrayList<BuildArtifacts>(secondaryArtifacts);
    }

    /**
     * <p>
     * An array of <code>BuildArtifacts</code> objects the define the build artifacts for this batch build.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondaryArtifacts(java.util.Collection)} or {@link #withSecondaryArtifacts(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param secondaryArtifacts
     *        An array of <code>BuildArtifacts</code> objects the define the build artifacts for this batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withSecondaryArtifacts(BuildArtifacts... secondaryArtifacts) {
        if (this.secondaryArtifacts == null) {
            setSecondaryArtifacts(new java.util.ArrayList<BuildArtifacts>(secondaryArtifacts.length));
        }
        for (BuildArtifacts ele : secondaryArtifacts) {
            this.secondaryArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BuildArtifacts</code> objects the define the build artifacts for this batch build.
     * </p>
     * 
     * @param secondaryArtifacts
     *        An array of <code>BuildArtifacts</code> objects the define the build artifacts for this batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withSecondaryArtifacts(java.util.Collection<BuildArtifacts> secondaryArtifacts) {
        setSecondaryArtifacts(secondaryArtifacts);
        return this;
    }

    /**
     * @param cache
     */

    public void setCache(ProjectCache cache) {
        this.cache = cache;
    }

    /**
     * @return
     */

    public ProjectCache getCache() {
        return this.cache;
    }

    /**
     * @param cache
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withCache(ProjectCache cache) {
        setCache(cache);
        return this;
    }

    /**
     * @param environment
     */

    public void setEnvironment(ProjectEnvironment environment) {
        this.environment = environment;
    }

    /**
     * @return
     */

    public ProjectEnvironment getEnvironment() {
        return this.environment;
    }

    /**
     * @param environment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withEnvironment(ProjectEnvironment environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The name of a service role used for builds in the batch.
     * </p>
     * 
     * @param serviceRole
     *        The name of a service role used for builds in the batch.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The name of a service role used for builds in the batch.
     * </p>
     * 
     * @return The name of a service role used for builds in the batch.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The name of a service role used for builds in the batch.
     * </p>
     * 
     * @param serviceRole
     *        The name of a service role used for builds in the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * @param logConfig
     */

    public void setLogConfig(LogsConfig logConfig) {
        this.logConfig = logConfig;
    }

    /**
     * @return
     */

    public LogsConfig getLogConfig() {
        return this.logConfig;
    }

    /**
     * @param logConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withLogConfig(LogsConfig logConfig) {
        setLogConfig(logConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum amount of time, in minutes, that the build in a batch must be completed in.
     * </p>
     * 
     * @param buildTimeoutInMinutes
     *        Specifies the maximum amount of time, in minutes, that the build in a batch must be completed in.
     */

    public void setBuildTimeoutInMinutes(Integer buildTimeoutInMinutes) {
        this.buildTimeoutInMinutes = buildTimeoutInMinutes;
    }

    /**
     * <p>
     * Specifies the maximum amount of time, in minutes, that the build in a batch must be completed in.
     * </p>
     * 
     * @return Specifies the maximum amount of time, in minutes, that the build in a batch must be completed in.
     */

    public Integer getBuildTimeoutInMinutes() {
        return this.buildTimeoutInMinutes;
    }

    /**
     * <p>
     * Specifies the maximum amount of time, in minutes, that the build in a batch must be completed in.
     * </p>
     * 
     * @param buildTimeoutInMinutes
     *        Specifies the maximum amount of time, in minutes, that the build in a batch must be completed in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withBuildTimeoutInMinutes(Integer buildTimeoutInMinutes) {
        setBuildTimeoutInMinutes(buildTimeoutInMinutes);
        return this;
    }

    /**
     * <p>
     * Specifies the amount of time, in minutes, that the batch build is allowed to be queued before it times out.
     * </p>
     * 
     * @param queuedTimeoutInMinutes
     *        Specifies the amount of time, in minutes, that the batch build is allowed to be queued before it times
     *        out.
     */

    public void setQueuedTimeoutInMinutes(Integer queuedTimeoutInMinutes) {
        this.queuedTimeoutInMinutes = queuedTimeoutInMinutes;
    }

    /**
     * <p>
     * Specifies the amount of time, in minutes, that the batch build is allowed to be queued before it times out.
     * </p>
     * 
     * @return Specifies the amount of time, in minutes, that the batch build is allowed to be queued before it times
     *         out.
     */

    public Integer getQueuedTimeoutInMinutes() {
        return this.queuedTimeoutInMinutes;
    }

    /**
     * <p>
     * Specifies the amount of time, in minutes, that the batch build is allowed to be queued before it times out.
     * </p>
     * 
     * @param queuedTimeoutInMinutes
     *        Specifies the amount of time, in minutes, that the batch build is allowed to be queued before it times
     *        out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withQueuedTimeoutInMinutes(Integer queuedTimeoutInMinutes) {
        setQueuedTimeoutInMinutes(queuedTimeoutInMinutes);
        return this;
    }

    /**
     * <p>
     * Indicates if the batch build is complete.
     * </p>
     * 
     * @param complete
     *        Indicates if the batch build is complete.
     */

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    /**
     * <p>
     * Indicates if the batch build is complete.
     * </p>
     * 
     * @return Indicates if the batch build is complete.
     */

    public Boolean getComplete() {
        return this.complete;
    }

    /**
     * <p>
     * Indicates if the batch build is complete.
     * </p>
     * 
     * @param complete
     *        Indicates if the batch build is complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withComplete(Boolean complete) {
        setComplete(complete);
        return this;
    }

    /**
     * <p>
     * Indicates if the batch build is complete.
     * </p>
     * 
     * @return Indicates if the batch build is complete.
     */

    public Boolean isComplete() {
        return this.complete;
    }

    /**
     * <p>
     * The entity that started the batch build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If AWS CodePipeline started the build, the pipeline's name (for example,
     * <code>codepipeline/my-demo-pipeline</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If an AWS Identity and Access Management (IAM) user started the build, the user's name.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the Jenkins plugin for AWS CodeBuild started the build, the string <code>CodeBuild-Jenkins-Plugin</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param initiator
     *        The entity that started the batch build. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If AWS CodePipeline started the build, the pipeline's name (for example,
     *        <code>codepipeline/my-demo-pipeline</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If an AWS Identity and Access Management (IAM) user started the build, the user's name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the Jenkins plugin for AWS CodeBuild started the build, the string
     *        <code>CodeBuild-Jenkins-Plugin</code>.
     *        </p>
     *        </li>
     */

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    /**
     * <p>
     * The entity that started the batch build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If AWS CodePipeline started the build, the pipeline's name (for example,
     * <code>codepipeline/my-demo-pipeline</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If an AWS Identity and Access Management (IAM) user started the build, the user's name.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the Jenkins plugin for AWS CodeBuild started the build, the string <code>CodeBuild-Jenkins-Plugin</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The entity that started the batch build. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If AWS CodePipeline started the build, the pipeline's name (for example,
     *         <code>codepipeline/my-demo-pipeline</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If an AWS Identity and Access Management (IAM) user started the build, the user's name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the Jenkins plugin for AWS CodeBuild started the build, the string
     *         <code>CodeBuild-Jenkins-Plugin</code>.
     *         </p>
     *         </li>
     */

    public String getInitiator() {
        return this.initiator;
    }

    /**
     * <p>
     * The entity that started the batch build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If AWS CodePipeline started the build, the pipeline's name (for example,
     * <code>codepipeline/my-demo-pipeline</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If an AWS Identity and Access Management (IAM) user started the build, the user's name.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the Jenkins plugin for AWS CodeBuild started the build, the string <code>CodeBuild-Jenkins-Plugin</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param initiator
     *        The entity that started the batch build. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If AWS CodePipeline started the build, the pipeline's name (for example,
     *        <code>codepipeline/my-demo-pipeline</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If an AWS Identity and Access Management (IAM) user started the build, the user's name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the Jenkins plugin for AWS CodeBuild started the build, the string
     *        <code>CodeBuild-Jenkins-Plugin</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withInitiator(String initiator) {
        setInitiator(initiator);
        return this;
    }

    /**
     * @param vpcConfig
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * @return
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * @param vpcConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the batch build
     * output artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to
     * that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the
     * format <code>alias/&lt;alias-name&gt;</code>).
     * </p>
     * 
     * @param encryptionKey
     *        The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the batch
     *        build output artifacts.</p> <note>
     *        <p>
     *        You can use a cross-account KMS key to encrypt the build output artifacts if your service role has
     *        permission to that key.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using
     *        the format <code>alias/&lt;alias-name&gt;</code>).
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the batch build
     * output artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to
     * that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the
     * format <code>alias/&lt;alias-name&gt;</code>).
     * </p>
     * 
     * @return The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the batch
     *         build output artifacts.</p> <note>
     *         <p>
     *         You can use a cross-account KMS key to encrypt the build output artifacts if your service role has
     *         permission to that key.
     *         </p>
     *         </note>
     *         <p>
     *         You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using
     *         the format <code>alias/&lt;alias-name&gt;</code>).
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the batch build
     * output artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to
     * that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the
     * format <code>alias/&lt;alias-name&gt;</code>).
     * </p>
     * 
     * @param encryptionKey
     *        The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the batch
     *        build output artifacts.</p> <note>
     *        <p>
     *        You can use a cross-account KMS key to encrypt the build output artifacts if your service role has
     *        permission to that key.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using
     *        the format <code>alias/&lt;alias-name&gt;</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * The number of the batch build. For each project, the <code>buildBatchNumber</code> of its first batch build is
     * <code>1</code>. The <code>buildBatchNumber</code> of each subsequent batch build is incremented by <code>1</code>
     * . If a batch build is deleted, the <code>buildBatchNumber</code> of other batch builds does not change.
     * </p>
     * 
     * @param buildBatchNumber
     *        The number of the batch build. For each project, the <code>buildBatchNumber</code> of its first batch
     *        build is <code>1</code>. The <code>buildBatchNumber</code> of each subsequent batch build is incremented
     *        by <code>1</code>. If a batch build is deleted, the <code>buildBatchNumber</code> of other batch builds
     *        does not change.
     */

    public void setBuildBatchNumber(Long buildBatchNumber) {
        this.buildBatchNumber = buildBatchNumber;
    }

    /**
     * <p>
     * The number of the batch build. For each project, the <code>buildBatchNumber</code> of its first batch build is
     * <code>1</code>. The <code>buildBatchNumber</code> of each subsequent batch build is incremented by <code>1</code>
     * . If a batch build is deleted, the <code>buildBatchNumber</code> of other batch builds does not change.
     * </p>
     * 
     * @return The number of the batch build. For each project, the <code>buildBatchNumber</code> of its first batch
     *         build is <code>1</code>. The <code>buildBatchNumber</code> of each subsequent batch build is incremented
     *         by <code>1</code>. If a batch build is deleted, the <code>buildBatchNumber</code> of other batch builds
     *         does not change.
     */

    public Long getBuildBatchNumber() {
        return this.buildBatchNumber;
    }

    /**
     * <p>
     * The number of the batch build. For each project, the <code>buildBatchNumber</code> of its first batch build is
     * <code>1</code>. The <code>buildBatchNumber</code> of each subsequent batch build is incremented by <code>1</code>
     * . If a batch build is deleted, the <code>buildBatchNumber</code> of other batch builds does not change.
     * </p>
     * 
     * @param buildBatchNumber
     *        The number of the batch build. For each project, the <code>buildBatchNumber</code> of its first batch
     *        build is <code>1</code>. The <code>buildBatchNumber</code> of each subsequent batch build is incremented
     *        by <code>1</code>. If a batch build is deleted, the <code>buildBatchNumber</code> of other batch builds
     *        does not change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withBuildBatchNumber(Long buildBatchNumber) {
        setBuildBatchNumber(buildBatchNumber);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectFileSystemLocation</code> objects for the batch build project. A
     * <code>ProjectFileSystemLocation</code> object specifies the <code>identifier</code>, <code>location</code>,
     * <code>mountOptions</code>, <code>mountPoint</code>, and <code>type</code> of a file system created using Amazon
     * Elastic File System.
     * </p>
     * 
     * @return An array of <code>ProjectFileSystemLocation</code> objects for the batch build project. A
     *         <code>ProjectFileSystemLocation</code> object specifies the <code>identifier</code>,
     *         <code>location</code>, <code>mountOptions</code>, <code>mountPoint</code>, and <code>type</code> of a
     *         file system created using Amazon Elastic File System.
     */

    public java.util.List<ProjectFileSystemLocation> getFileSystemLocations() {
        return fileSystemLocations;
    }

    /**
     * <p>
     * An array of <code>ProjectFileSystemLocation</code> objects for the batch build project. A
     * <code>ProjectFileSystemLocation</code> object specifies the <code>identifier</code>, <code>location</code>,
     * <code>mountOptions</code>, <code>mountPoint</code>, and <code>type</code> of a file system created using Amazon
     * Elastic File System.
     * </p>
     * 
     * @param fileSystemLocations
     *        An array of <code>ProjectFileSystemLocation</code> objects for the batch build project. A
     *        <code>ProjectFileSystemLocation</code> object specifies the <code>identifier</code>, <code>location</code>
     *        , <code>mountOptions</code>, <code>mountPoint</code>, and <code>type</code> of a file system created using
     *        Amazon Elastic File System.
     */

    public void setFileSystemLocations(java.util.Collection<ProjectFileSystemLocation> fileSystemLocations) {
        if (fileSystemLocations == null) {
            this.fileSystemLocations = null;
            return;
        }

        this.fileSystemLocations = new java.util.ArrayList<ProjectFileSystemLocation>(fileSystemLocations);
    }

    /**
     * <p>
     * An array of <code>ProjectFileSystemLocation</code> objects for the batch build project. A
     * <code>ProjectFileSystemLocation</code> object specifies the <code>identifier</code>, <code>location</code>,
     * <code>mountOptions</code>, <code>mountPoint</code>, and <code>type</code> of a file system created using Amazon
     * Elastic File System.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileSystemLocations(java.util.Collection)} or {@link #withFileSystemLocations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param fileSystemLocations
     *        An array of <code>ProjectFileSystemLocation</code> objects for the batch build project. A
     *        <code>ProjectFileSystemLocation</code> object specifies the <code>identifier</code>, <code>location</code>
     *        , <code>mountOptions</code>, <code>mountPoint</code>, and <code>type</code> of a file system created using
     *        Amazon Elastic File System.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withFileSystemLocations(ProjectFileSystemLocation... fileSystemLocations) {
        if (this.fileSystemLocations == null) {
            setFileSystemLocations(new java.util.ArrayList<ProjectFileSystemLocation>(fileSystemLocations.length));
        }
        for (ProjectFileSystemLocation ele : fileSystemLocations) {
            this.fileSystemLocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectFileSystemLocation</code> objects for the batch build project. A
     * <code>ProjectFileSystemLocation</code> object specifies the <code>identifier</code>, <code>location</code>,
     * <code>mountOptions</code>, <code>mountPoint</code>, and <code>type</code> of a file system created using Amazon
     * Elastic File System.
     * </p>
     * 
     * @param fileSystemLocations
     *        An array of <code>ProjectFileSystemLocation</code> objects for the batch build project. A
     *        <code>ProjectFileSystemLocation</code> object specifies the <code>identifier</code>, <code>location</code>
     *        , <code>mountOptions</code>, <code>mountPoint</code>, and <code>type</code> of a file system created using
     *        Amazon Elastic File System.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withFileSystemLocations(java.util.Collection<ProjectFileSystemLocation> fileSystemLocations) {
        setFileSystemLocations(fileSystemLocations);
        return this;
    }

    /**
     * @param buildBatchConfig
     */

    public void setBuildBatchConfig(ProjectBuildBatchConfig buildBatchConfig) {
        this.buildBatchConfig = buildBatchConfig;
    }

    /**
     * @return
     */

    public ProjectBuildBatchConfig getBuildBatchConfig() {
        return this.buildBatchConfig;
    }

    /**
     * @param buildBatchConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withBuildBatchConfig(ProjectBuildBatchConfig buildBatchConfig) {
        setBuildBatchConfig(buildBatchConfig);
        return this;
    }

    /**
     * <p>
     * An array of <code>BuildGroup</code> objects that define the build groups for the batch build.
     * </p>
     * 
     * @return An array of <code>BuildGroup</code> objects that define the build groups for the batch build.
     */

    public java.util.List<BuildGroup> getBuildGroups() {
        return buildGroups;
    }

    /**
     * <p>
     * An array of <code>BuildGroup</code> objects that define the build groups for the batch build.
     * </p>
     * 
     * @param buildGroups
     *        An array of <code>BuildGroup</code> objects that define the build groups for the batch build.
     */

    public void setBuildGroups(java.util.Collection<BuildGroup> buildGroups) {
        if (buildGroups == null) {
            this.buildGroups = null;
            return;
        }

        this.buildGroups = new java.util.ArrayList<BuildGroup>(buildGroups);
    }

    /**
     * <p>
     * An array of <code>BuildGroup</code> objects that define the build groups for the batch build.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBuildGroups(java.util.Collection)} or {@link #withBuildGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param buildGroups
     *        An array of <code>BuildGroup</code> objects that define the build groups for the batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withBuildGroups(BuildGroup... buildGroups) {
        if (this.buildGroups == null) {
            setBuildGroups(new java.util.ArrayList<BuildGroup>(buildGroups.length));
        }
        for (BuildGroup ele : buildGroups) {
            this.buildGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BuildGroup</code> objects that define the build groups for the batch build.
     * </p>
     * 
     * @param buildGroups
     *        An array of <code>BuildGroup</code> objects that define the build groups for the batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withBuildGroups(java.util.Collection<BuildGroup> buildGroups) {
        setBuildGroups(buildGroups);
        return this;
    }

    /**
     * <p/>
     * <p>
     * Specifies if session debugging is enabled for this batch build. For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/session-manager.html">Viewing a running build in
     * Session Manager</a>. Batch session debugging is not supported for matrix batch builds.
     * </p>
     * 
     * @param debugSessionEnabled
     *        <p>
     *        Specifies if session debugging is enabled for this batch build. For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/session-manager.html">Viewing a running build
     *        in Session Manager</a>. Batch session debugging is not supported for matrix batch builds.
     */

    public void setDebugSessionEnabled(Boolean debugSessionEnabled) {
        this.debugSessionEnabled = debugSessionEnabled;
    }

    /**
     * <p/>
     * <p>
     * Specifies if session debugging is enabled for this batch build. For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/session-manager.html">Viewing a running build in
     * Session Manager</a>. Batch session debugging is not supported for matrix batch builds.
     * </p>
     * 
     * @return <p>
     *         Specifies if session debugging is enabled for this batch build. For more information, see <a
     *         href="https://docs.aws.amazon.com/codebuild/latest/userguide/session-manager.html">Viewing a running
     *         build in Session Manager</a>. Batch session debugging is not supported for matrix batch builds.
     */

    public Boolean getDebugSessionEnabled() {
        return this.debugSessionEnabled;
    }

    /**
     * <p/>
     * <p>
     * Specifies if session debugging is enabled for this batch build. For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/session-manager.html">Viewing a running build in
     * Session Manager</a>. Batch session debugging is not supported for matrix batch builds.
     * </p>
     * 
     * @param debugSessionEnabled
     *        <p>
     *        Specifies if session debugging is enabled for this batch build. For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/session-manager.html">Viewing a running build
     *        in Session Manager</a>. Batch session debugging is not supported for matrix batch builds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBatch withDebugSessionEnabled(Boolean debugSessionEnabled) {
        setDebugSessionEnabled(debugSessionEnabled);
        return this;
    }

    /**
     * <p/>
     * <p>
     * Specifies if session debugging is enabled for this batch build. For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/session-manager.html">Viewing a running build in
     * Session Manager</a>. Batch session debugging is not supported for matrix batch builds.
     * </p>
     * 
     * @return <p>
     *         Specifies if session debugging is enabled for this batch build. For more information, see <a
     *         href="https://docs.aws.amazon.com/codebuild/latest/userguide/session-manager.html">Viewing a running
     *         build in Session Manager</a>. Batch session debugging is not supported for matrix batch builds.
     */

    public Boolean isDebugSessionEnabled() {
        return this.debugSessionEnabled;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getCurrentPhase() != null)
            sb.append("CurrentPhase: ").append(getCurrentPhase()).append(",");
        if (getBuildBatchStatus() != null)
            sb.append("BuildBatchStatus: ").append(getBuildBatchStatus()).append(",");
        if (getSourceVersion() != null)
            sb.append("SourceVersion: ").append(getSourceVersion()).append(",");
        if (getResolvedSourceVersion() != null)
            sb.append("ResolvedSourceVersion: ").append(getResolvedSourceVersion()).append(",");
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getPhases() != null)
            sb.append("Phases: ").append(getPhases()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSecondarySources() != null)
            sb.append("SecondarySources: ").append(getSecondarySources()).append(",");
        if (getSecondarySourceVersions() != null)
            sb.append("SecondarySourceVersions: ").append(getSecondarySourceVersions()).append(",");
        if (getArtifacts() != null)
            sb.append("Artifacts: ").append(getArtifacts()).append(",");
        if (getSecondaryArtifacts() != null)
            sb.append("SecondaryArtifacts: ").append(getSecondaryArtifacts()).append(",");
        if (getCache() != null)
            sb.append("Cache: ").append(getCache()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getLogConfig() != null)
            sb.append("LogConfig: ").append(getLogConfig()).append(",");
        if (getBuildTimeoutInMinutes() != null)
            sb.append("BuildTimeoutInMinutes: ").append(getBuildTimeoutInMinutes()).append(",");
        if (getQueuedTimeoutInMinutes() != null)
            sb.append("QueuedTimeoutInMinutes: ").append(getQueuedTimeoutInMinutes()).append(",");
        if (getComplete() != null)
            sb.append("Complete: ").append(getComplete()).append(",");
        if (getInitiator() != null)
            sb.append("Initiator: ").append(getInitiator()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey()).append(",");
        if (getBuildBatchNumber() != null)
            sb.append("BuildBatchNumber: ").append(getBuildBatchNumber()).append(",");
        if (getFileSystemLocations() != null)
            sb.append("FileSystemLocations: ").append(getFileSystemLocations()).append(",");
        if (getBuildBatchConfig() != null)
            sb.append("BuildBatchConfig: ").append(getBuildBatchConfig()).append(",");
        if (getBuildGroups() != null)
            sb.append("BuildGroups: ").append(getBuildGroups()).append(",");
        if (getDebugSessionEnabled() != null)
            sb.append("DebugSessionEnabled: ").append(getDebugSessionEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuildBatch == false)
            return false;
        BuildBatch other = (BuildBatch) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getCurrentPhase() == null ^ this.getCurrentPhase() == null)
            return false;
        if (other.getCurrentPhase() != null && other.getCurrentPhase().equals(this.getCurrentPhase()) == false)
            return false;
        if (other.getBuildBatchStatus() == null ^ this.getBuildBatchStatus() == null)
            return false;
        if (other.getBuildBatchStatus() != null && other.getBuildBatchStatus().equals(this.getBuildBatchStatus()) == false)
            return false;
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        if (other.getResolvedSourceVersion() == null ^ this.getResolvedSourceVersion() == null)
            return false;
        if (other.getResolvedSourceVersion() != null && other.getResolvedSourceVersion().equals(this.getResolvedSourceVersion()) == false)
            return false;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getPhases() == null ^ this.getPhases() == null)
            return false;
        if (other.getPhases() != null && other.getPhases().equals(this.getPhases()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSecondarySources() == null ^ this.getSecondarySources() == null)
            return false;
        if (other.getSecondarySources() != null && other.getSecondarySources().equals(this.getSecondarySources()) == false)
            return false;
        if (other.getSecondarySourceVersions() == null ^ this.getSecondarySourceVersions() == null)
            return false;
        if (other.getSecondarySourceVersions() != null && other.getSecondarySourceVersions().equals(this.getSecondarySourceVersions()) == false)
            return false;
        if (other.getArtifacts() == null ^ this.getArtifacts() == null)
            return false;
        if (other.getArtifacts() != null && other.getArtifacts().equals(this.getArtifacts()) == false)
            return false;
        if (other.getSecondaryArtifacts() == null ^ this.getSecondaryArtifacts() == null)
            return false;
        if (other.getSecondaryArtifacts() != null && other.getSecondaryArtifacts().equals(this.getSecondaryArtifacts()) == false)
            return false;
        if (other.getCache() == null ^ this.getCache() == null)
            return false;
        if (other.getCache() != null && other.getCache().equals(this.getCache()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getLogConfig() == null ^ this.getLogConfig() == null)
            return false;
        if (other.getLogConfig() != null && other.getLogConfig().equals(this.getLogConfig()) == false)
            return false;
        if (other.getBuildTimeoutInMinutes() == null ^ this.getBuildTimeoutInMinutes() == null)
            return false;
        if (other.getBuildTimeoutInMinutes() != null && other.getBuildTimeoutInMinutes().equals(this.getBuildTimeoutInMinutes()) == false)
            return false;
        if (other.getQueuedTimeoutInMinutes() == null ^ this.getQueuedTimeoutInMinutes() == null)
            return false;
        if (other.getQueuedTimeoutInMinutes() != null && other.getQueuedTimeoutInMinutes().equals(this.getQueuedTimeoutInMinutes()) == false)
            return false;
        if (other.getComplete() == null ^ this.getComplete() == null)
            return false;
        if (other.getComplete() != null && other.getComplete().equals(this.getComplete()) == false)
            return false;
        if (other.getInitiator() == null ^ this.getInitiator() == null)
            return false;
        if (other.getInitiator() != null && other.getInitiator().equals(this.getInitiator()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getBuildBatchNumber() == null ^ this.getBuildBatchNumber() == null)
            return false;
        if (other.getBuildBatchNumber() != null && other.getBuildBatchNumber().equals(this.getBuildBatchNumber()) == false)
            return false;
        if (other.getFileSystemLocations() == null ^ this.getFileSystemLocations() == null)
            return false;
        if (other.getFileSystemLocations() != null && other.getFileSystemLocations().equals(this.getFileSystemLocations()) == false)
            return false;
        if (other.getBuildBatchConfig() == null ^ this.getBuildBatchConfig() == null)
            return false;
        if (other.getBuildBatchConfig() != null && other.getBuildBatchConfig().equals(this.getBuildBatchConfig()) == false)
            return false;
        if (other.getBuildGroups() == null ^ this.getBuildGroups() == null)
            return false;
        if (other.getBuildGroups() != null && other.getBuildGroups().equals(this.getBuildGroups()) == false)
            return false;
        if (other.getDebugSessionEnabled() == null ^ this.getDebugSessionEnabled() == null)
            return false;
        if (other.getDebugSessionEnabled() != null && other.getDebugSessionEnabled().equals(this.getDebugSessionEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getCurrentPhase() == null) ? 0 : getCurrentPhase().hashCode());
        hashCode = prime * hashCode + ((getBuildBatchStatus() == null) ? 0 : getBuildBatchStatus().hashCode());
        hashCode = prime * hashCode + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        hashCode = prime * hashCode + ((getResolvedSourceVersion() == null) ? 0 : getResolvedSourceVersion().hashCode());
        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getPhases() == null) ? 0 : getPhases().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSecondarySources() == null) ? 0 : getSecondarySources().hashCode());
        hashCode = prime * hashCode + ((getSecondarySourceVersions() == null) ? 0 : getSecondarySourceVersions().hashCode());
        hashCode = prime * hashCode + ((getArtifacts() == null) ? 0 : getArtifacts().hashCode());
        hashCode = prime * hashCode + ((getSecondaryArtifacts() == null) ? 0 : getSecondaryArtifacts().hashCode());
        hashCode = prime * hashCode + ((getCache() == null) ? 0 : getCache().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getLogConfig() == null) ? 0 : getLogConfig().hashCode());
        hashCode = prime * hashCode + ((getBuildTimeoutInMinutes() == null) ? 0 : getBuildTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode + ((getQueuedTimeoutInMinutes() == null) ? 0 : getQueuedTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode + ((getComplete() == null) ? 0 : getComplete().hashCode());
        hashCode = prime * hashCode + ((getInitiator() == null) ? 0 : getInitiator().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getBuildBatchNumber() == null) ? 0 : getBuildBatchNumber().hashCode());
        hashCode = prime * hashCode + ((getFileSystemLocations() == null) ? 0 : getFileSystemLocations().hashCode());
        hashCode = prime * hashCode + ((getBuildBatchConfig() == null) ? 0 : getBuildBatchConfig().hashCode());
        hashCode = prime * hashCode + ((getBuildGroups() == null) ? 0 : getBuildGroups().hashCode());
        hashCode = prime * hashCode + ((getDebugSessionEnabled() == null) ? 0 : getDebugSessionEnabled().hashCode());
        return hashCode;
    }

    @Override
    public BuildBatch clone() {
        try {
            return (BuildBatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.BuildBatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

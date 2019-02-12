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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a build.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/Build" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Build implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID for the build.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * When the build process started, expressed in Unix time format.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * When the build process ended, expressed in Unix time format.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The current build phase.
     * </p>
     */
    private String currentPhase;
    /**
     * <p>
     * The current status of the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build timed out.
     * </p>
     * </li>
     * </ul>
     */
    private String buildStatus;
    /**
     * <p>
     * Any version identifier for the version of the source code to be built.
     * </p>
     */
    private String sourceVersion;
    /**
     * <p>
     * An identifier for the version of this build's source code.
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
     * For Amazon Simple Storage Service (Amazon S3), this does not apply.
     * </p>
     * </li>
     * </ul>
     */
    private String resolvedSourceVersion;
    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * Information about all previous build phases that are complete and information about any current build phase that
     * is not yet complete.
     * </p>
     */
    private java.util.List<BuildPhase> phases;
    /**
     * <p>
     * Information about the source code to be built.
     * </p>
     */
    private ProjectSource source;
    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
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
     * For AWS CodeCommit: the commit ID to use.
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
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP
     * file to use.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<ProjectSourceVersion> secondarySourceVersions;
    /**
     * <p>
     * Information about the output artifacts for the build.
     * </p>
     */
    private BuildArtifacts artifacts;
    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     */
    private java.util.List<BuildArtifacts> secondaryArtifacts;
    /**
     * <p>
     * Information about the cache for the build.
     * </p>
     */
    private ProjectCache cache;
    /**
     * <p>
     * Information about the build environment for this build.
     * </p>
     */
    private ProjectEnvironment environment;
    /**
     * <p>
     * The name of a service role used for this build.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * Information about the build's logs in Amazon CloudWatch Logs.
     * </p>
     */
    private LogsLocation logs;
    /**
     * <p>
     * How long, in minutes, for AWS CodeBuild to wait before timing out this build if it does not get marked as
     * completed.
     * </p>
     */
    private Integer timeoutInMinutes;
    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times out.
     * </p>
     */
    private Integer queuedTimeoutInMinutes;
    /**
     * <p>
     * Whether the build is complete. True if complete; otherwise, false.
     * </p>
     */
    private Boolean buildComplete;
    /**
     * <p>
     * The entity that started the build. Valid values include:
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
     * If an AWS Identity and Access Management (IAM) user started the build, the user's name (for example,
     * <code>MyUserName</code>).
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
    /**
     * <p>
     * If your AWS CodeBuild project accesses resources in an Amazon VPC, you provide this parameter that identifies the
     * VPC ID and the list of security group IDs and subnet IDs. The security groups and subnets must belong to the same
     * VPC. You must provide at least one security group and one subnet ID.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * Describes a network interface.
     * </p>
     */
    private NetworkInterface networkInterface;
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output
     * artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to
     * that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the
     * format <code>alias/<i>alias-name</i> </code>).
     * </p>
     */
    private String encryptionKey;

    /**
     * <p>
     * The unique ID for the build.
     * </p>
     * 
     * @param id
     *        The unique ID for the build.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID for the build.
     * </p>
     * 
     * @return The unique ID for the build.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID for the build.
     * </p>
     * 
     * @param id
     *        The unique ID for the build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the build.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the build.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * When the build process started, expressed in Unix time format.
     * </p>
     * 
     * @param startTime
     *        When the build process started, expressed in Unix time format.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * When the build process started, expressed in Unix time format.
     * </p>
     * 
     * @return When the build process started, expressed in Unix time format.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * When the build process started, expressed in Unix time format.
     * </p>
     * 
     * @param startTime
     *        When the build process started, expressed in Unix time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * When the build process ended, expressed in Unix time format.
     * </p>
     * 
     * @param endTime
     *        When the build process ended, expressed in Unix time format.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * When the build process ended, expressed in Unix time format.
     * </p>
     * 
     * @return When the build process ended, expressed in Unix time format.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * When the build process ended, expressed in Unix time format.
     * </p>
     * 
     * @param endTime
     *        When the build process ended, expressed in Unix time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The current build phase.
     * </p>
     * 
     * @param currentPhase
     *        The current build phase.
     */

    public void setCurrentPhase(String currentPhase) {
        this.currentPhase = currentPhase;
    }

    /**
     * <p>
     * The current build phase.
     * </p>
     * 
     * @return The current build phase.
     */

    public String getCurrentPhase() {
        return this.currentPhase;
    }

    /**
     * <p>
     * The current build phase.
     * </p>
     * 
     * @param currentPhase
     *        The current build phase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withCurrentPhase(String currentPhase) {
        setCurrentPhase(currentPhase);
        return this;
    }

    /**
     * <p>
     * The current status of the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build timed out.
     * </p>
     * </li>
     * </ul>
     * 
     * @param buildStatus
     *        The current status of the build. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The build failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAULT</code>: The build faulted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The build is still in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code>: The build stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The build succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMED_OUT</code>: The build timed out.
     *        </p>
     *        </li>
     * @see StatusType
     */

    public void setBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
    }

    /**
     * <p>
     * The current status of the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build timed out.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the build. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The build failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAULT</code>: The build faulted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code>: The build is still in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPED</code>: The build stopped.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code>: The build succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TIMED_OUT</code>: The build timed out.
     *         </p>
     *         </li>
     * @see StatusType
     */

    public String getBuildStatus() {
        return this.buildStatus;
    }

    /**
     * <p>
     * The current status of the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build timed out.
     * </p>
     * </li>
     * </ul>
     * 
     * @param buildStatus
     *        The current status of the build. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The build failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAULT</code>: The build faulted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The build is still in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code>: The build stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The build succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMED_OUT</code>: The build timed out.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public Build withBuildStatus(String buildStatus) {
        setBuildStatus(buildStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build timed out.
     * </p>
     * </li>
     * </ul>
     * 
     * @param buildStatus
     *        The current status of the build. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The build failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAULT</code>: The build faulted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The build is still in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code>: The build stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The build succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMED_OUT</code>: The build timed out.
     *        </p>
     *        </li>
     * @see StatusType
     */

    public void setBuildStatus(StatusType buildStatus) {
        withBuildStatus(buildStatus);
    }

    /**
     * <p>
     * The current status of the build. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The build failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAULT</code>: The build faulted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The build is still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The build stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The build succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMED_OUT</code>: The build timed out.
     * </p>
     * </li>
     * </ul>
     * 
     * @param buildStatus
     *        The current status of the build. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The build failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAULT</code>: The build faulted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The build is still in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code>: The build stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The build succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMED_OUT</code>: The build timed out.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public Build withBuildStatus(StatusType buildStatus) {
        this.buildStatus = buildStatus.toString();
        return this;
    }

    /**
     * <p>
     * Any version identifier for the version of the source code to be built.
     * </p>
     * 
     * @param sourceVersion
     *        Any version identifier for the version of the source code to be built.
     */

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * Any version identifier for the version of the source code to be built.
     * </p>
     * 
     * @return Any version identifier for the version of the source code to be built.
     */

    public String getSourceVersion() {
        return this.sourceVersion;
    }

    /**
     * <p>
     * Any version identifier for the version of the source code to be built.
     * </p>
     * 
     * @param sourceVersion
     *        Any version identifier for the version of the source code to be built.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withSourceVersion(String sourceVersion) {
        setSourceVersion(sourceVersion);
        return this;
    }

    /**
     * <p>
     * An identifier for the version of this build's source code.
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
     * For Amazon Simple Storage Service (Amazon S3), this does not apply.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resolvedSourceVersion
     *        An identifier for the version of this build's source code. </p>
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
     *        For Amazon Simple Storage Service (Amazon S3), this does not apply.
     *        </p>
     *        </li>
     */

    public void setResolvedSourceVersion(String resolvedSourceVersion) {
        this.resolvedSourceVersion = resolvedSourceVersion;
    }

    /**
     * <p>
     * An identifier for the version of this build's source code.
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
     * For Amazon Simple Storage Service (Amazon S3), this does not apply.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An identifier for the version of this build's source code. </p>
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
     *         For Amazon Simple Storage Service (Amazon S3), this does not apply.
     *         </p>
     *         </li>
     */

    public String getResolvedSourceVersion() {
        return this.resolvedSourceVersion;
    }

    /**
     * <p>
     * An identifier for the version of this build's source code.
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
     * For Amazon Simple Storage Service (Amazon S3), this does not apply.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resolvedSourceVersion
     *        An identifier for the version of this build's source code. </p>
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
     *        For Amazon Simple Storage Service (Amazon S3), this does not apply.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withResolvedSourceVersion(String resolvedSourceVersion) {
        setResolvedSourceVersion(resolvedSourceVersion);
        return this;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * 
     * @param projectName
     *        The name of the AWS CodeBuild project.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * 
     * @return The name of the AWS CodeBuild project.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * 
     * @param projectName
     *        The name of the AWS CodeBuild project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * Information about all previous build phases that are complete and information about any current build phase that
     * is not yet complete.
     * </p>
     * 
     * @return Information about all previous build phases that are complete and information about any current build
     *         phase that is not yet complete.
     */

    public java.util.List<BuildPhase> getPhases() {
        return phases;
    }

    /**
     * <p>
     * Information about all previous build phases that are complete and information about any current build phase that
     * is not yet complete.
     * </p>
     * 
     * @param phases
     *        Information about all previous build phases that are complete and information about any current build
     *        phase that is not yet complete.
     */

    public void setPhases(java.util.Collection<BuildPhase> phases) {
        if (phases == null) {
            this.phases = null;
            return;
        }

        this.phases = new java.util.ArrayList<BuildPhase>(phases);
    }

    /**
     * <p>
     * Information about all previous build phases that are complete and information about any current build phase that
     * is not yet complete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhases(java.util.Collection)} or {@link #withPhases(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param phases
     *        Information about all previous build phases that are complete and information about any current build
     *        phase that is not yet complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withPhases(BuildPhase... phases) {
        if (this.phases == null) {
            setPhases(new java.util.ArrayList<BuildPhase>(phases.length));
        }
        for (BuildPhase ele : phases) {
            this.phases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about all previous build phases that are complete and information about any current build phase that
     * is not yet complete.
     * </p>
     * 
     * @param phases
     *        Information about all previous build phases that are complete and information about any current build
     *        phase that is not yet complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withPhases(java.util.Collection<BuildPhase> phases) {
        setPhases(phases);
        return this;
    }

    /**
     * <p>
     * Information about the source code to be built.
     * </p>
     * 
     * @param source
     *        Information about the source code to be built.
     */

    public void setSource(ProjectSource source) {
        this.source = source;
    }

    /**
     * <p>
     * Information about the source code to be built.
     * </p>
     * 
     * @return Information about the source code to be built.
     */

    public ProjectSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * Information about the source code to be built.
     * </p>
     * 
     * @param source
     *        Information about the source code to be built.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withSource(ProjectSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     * 
     * @return An array of <code>ProjectSource</code> objects.
     */

    public java.util.List<ProjectSource> getSecondarySources() {
        return secondarySources;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     * 
     * @param secondarySources
     *        An array of <code>ProjectSource</code> objects.
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
     * An array of <code>ProjectSource</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondarySources(java.util.Collection)} or {@link #withSecondarySources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param secondarySources
     *        An array of <code>ProjectSource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withSecondarySources(ProjectSource... secondarySources) {
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
     * An array of <code>ProjectSource</code> objects.
     * </p>
     * 
     * @param secondarySources
     *        An array of <code>ProjectSource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withSecondarySources(java.util.Collection<ProjectSource> secondarySources) {
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
     * For AWS CodeCommit: the commit ID to use.
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
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP
     * file to use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of <code>ProjectSourceVersion</code> objects. Each <code>ProjectSourceVersion</code> must be one
     *         of: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For AWS CodeCommit: the commit ID to use.
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
     *         For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build
     *         input ZIP file to use.
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
     * For AWS CodeCommit: the commit ID to use.
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
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP
     * file to use.
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
     *        For AWS CodeCommit: the commit ID to use.
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
     *        For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build
     *        input ZIP file to use.
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
     * For AWS CodeCommit: the commit ID to use.
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
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP
     * file to use.
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
     *        For AWS CodeCommit: the commit ID to use.
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
     *        For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build
     *        input ZIP file to use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withSecondarySourceVersions(ProjectSourceVersion... secondarySourceVersions) {
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
     * For AWS CodeCommit: the commit ID to use.
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
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP
     * file to use.
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
     *        For AWS CodeCommit: the commit ID to use.
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
     *        For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build
     *        input ZIP file to use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withSecondarySourceVersions(java.util.Collection<ProjectSourceVersion> secondarySourceVersions) {
        setSecondarySourceVersions(secondarySourceVersions);
        return this;
    }

    /**
     * <p>
     * Information about the output artifacts for the build.
     * </p>
     * 
     * @param artifacts
     *        Information about the output artifacts for the build.
     */

    public void setArtifacts(BuildArtifacts artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * <p>
     * Information about the output artifacts for the build.
     * </p>
     * 
     * @return Information about the output artifacts for the build.
     */

    public BuildArtifacts getArtifacts() {
        return this.artifacts;
    }

    /**
     * <p>
     * Information about the output artifacts for the build.
     * </p>
     * 
     * @param artifacts
     *        Information about the output artifacts for the build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withArtifacts(BuildArtifacts artifacts) {
        setArtifacts(artifacts);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     * 
     * @return An array of <code>ProjectArtifacts</code> objects.
     */

    public java.util.List<BuildArtifacts> getSecondaryArtifacts() {
        return secondaryArtifacts;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     * 
     * @param secondaryArtifacts
     *        An array of <code>ProjectArtifacts</code> objects.
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
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondaryArtifacts(java.util.Collection)} or {@link #withSecondaryArtifacts(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param secondaryArtifacts
     *        An array of <code>ProjectArtifacts</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withSecondaryArtifacts(BuildArtifacts... secondaryArtifacts) {
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
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     * 
     * @param secondaryArtifacts
     *        An array of <code>ProjectArtifacts</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withSecondaryArtifacts(java.util.Collection<BuildArtifacts> secondaryArtifacts) {
        setSecondaryArtifacts(secondaryArtifacts);
        return this;
    }

    /**
     * <p>
     * Information about the cache for the build.
     * </p>
     * 
     * @param cache
     *        Information about the cache for the build.
     */

    public void setCache(ProjectCache cache) {
        this.cache = cache;
    }

    /**
     * <p>
     * Information about the cache for the build.
     * </p>
     * 
     * @return Information about the cache for the build.
     */

    public ProjectCache getCache() {
        return this.cache;
    }

    /**
     * <p>
     * Information about the cache for the build.
     * </p>
     * 
     * @param cache
     *        Information about the cache for the build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withCache(ProjectCache cache) {
        setCache(cache);
        return this;
    }

    /**
     * <p>
     * Information about the build environment for this build.
     * </p>
     * 
     * @param environment
     *        Information about the build environment for this build.
     */

    public void setEnvironment(ProjectEnvironment environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Information about the build environment for this build.
     * </p>
     * 
     * @return Information about the build environment for this build.
     */

    public ProjectEnvironment getEnvironment() {
        return this.environment;
    }

    /**
     * <p>
     * Information about the build environment for this build.
     * </p>
     * 
     * @param environment
     *        Information about the build environment for this build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withEnvironment(ProjectEnvironment environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The name of a service role used for this build.
     * </p>
     * 
     * @param serviceRole
     *        The name of a service role used for this build.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The name of a service role used for this build.
     * </p>
     * 
     * @return The name of a service role used for this build.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The name of a service role used for this build.
     * </p>
     * 
     * @param serviceRole
     *        The name of a service role used for this build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * Information about the build's logs in Amazon CloudWatch Logs.
     * </p>
     * 
     * @param logs
     *        Information about the build's logs in Amazon CloudWatch Logs.
     */

    public void setLogs(LogsLocation logs) {
        this.logs = logs;
    }

    /**
     * <p>
     * Information about the build's logs in Amazon CloudWatch Logs.
     * </p>
     * 
     * @return Information about the build's logs in Amazon CloudWatch Logs.
     */

    public LogsLocation getLogs() {
        return this.logs;
    }

    /**
     * <p>
     * Information about the build's logs in Amazon CloudWatch Logs.
     * </p>
     * 
     * @param logs
     *        Information about the build's logs in Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withLogs(LogsLocation logs) {
        setLogs(logs);
        return this;
    }

    /**
     * <p>
     * How long, in minutes, for AWS CodeBuild to wait before timing out this build if it does not get marked as
     * completed.
     * </p>
     * 
     * @param timeoutInMinutes
     *        How long, in minutes, for AWS CodeBuild to wait before timing out this build if it does not get marked as
     *        completed.
     */

    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    /**
     * <p>
     * How long, in minutes, for AWS CodeBuild to wait before timing out this build if it does not get marked as
     * completed.
     * </p>
     * 
     * @return How long, in minutes, for AWS CodeBuild to wait before timing out this build if it does not get marked as
     *         completed.
     */

    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    /**
     * <p>
     * How long, in minutes, for AWS CodeBuild to wait before timing out this build if it does not get marked as
     * completed.
     * </p>
     * 
     * @param timeoutInMinutes
     *        How long, in minutes, for AWS CodeBuild to wait before timing out this build if it does not get marked as
     *        completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withTimeoutInMinutes(Integer timeoutInMinutes) {
        setTimeoutInMinutes(timeoutInMinutes);
        return this;
    }

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times out.
     * </p>
     * 
     * @param queuedTimeoutInMinutes
     *        The number of minutes a build is allowed to be queued before it times out.
     */

    public void setQueuedTimeoutInMinutes(Integer queuedTimeoutInMinutes) {
        this.queuedTimeoutInMinutes = queuedTimeoutInMinutes;
    }

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times out.
     * </p>
     * 
     * @return The number of minutes a build is allowed to be queued before it times out.
     */

    public Integer getQueuedTimeoutInMinutes() {
        return this.queuedTimeoutInMinutes;
    }

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times out.
     * </p>
     * 
     * @param queuedTimeoutInMinutes
     *        The number of minutes a build is allowed to be queued before it times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withQueuedTimeoutInMinutes(Integer queuedTimeoutInMinutes) {
        setQueuedTimeoutInMinutes(queuedTimeoutInMinutes);
        return this;
    }

    /**
     * <p>
     * Whether the build is complete. True if complete; otherwise, false.
     * </p>
     * 
     * @param buildComplete
     *        Whether the build is complete. True if complete; otherwise, false.
     */

    public void setBuildComplete(Boolean buildComplete) {
        this.buildComplete = buildComplete;
    }

    /**
     * <p>
     * Whether the build is complete. True if complete; otherwise, false.
     * </p>
     * 
     * @return Whether the build is complete. True if complete; otherwise, false.
     */

    public Boolean getBuildComplete() {
        return this.buildComplete;
    }

    /**
     * <p>
     * Whether the build is complete. True if complete; otherwise, false.
     * </p>
     * 
     * @param buildComplete
     *        Whether the build is complete. True if complete; otherwise, false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withBuildComplete(Boolean buildComplete) {
        setBuildComplete(buildComplete);
        return this;
    }

    /**
     * <p>
     * Whether the build is complete. True if complete; otherwise, false.
     * </p>
     * 
     * @return Whether the build is complete. True if complete; otherwise, false.
     */

    public Boolean isBuildComplete() {
        return this.buildComplete;
    }

    /**
     * <p>
     * The entity that started the build. Valid values include:
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
     * If an AWS Identity and Access Management (IAM) user started the build, the user's name (for example,
     * <code>MyUserName</code>).
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
     *        The entity that started the build. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If AWS CodePipeline started the build, the pipeline's name (for example,
     *        <code>codepipeline/my-demo-pipeline</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If an AWS Identity and Access Management (IAM) user started the build, the user's name (for example,
     *        <code>MyUserName</code>).
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
     * The entity that started the build. Valid values include:
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
     * If an AWS Identity and Access Management (IAM) user started the build, the user's name (for example,
     * <code>MyUserName</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the Jenkins plugin for AWS CodeBuild started the build, the string <code>CodeBuild-Jenkins-Plugin</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The entity that started the build. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If AWS CodePipeline started the build, the pipeline's name (for example,
     *         <code>codepipeline/my-demo-pipeline</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If an AWS Identity and Access Management (IAM) user started the build, the user's name (for example,
     *         <code>MyUserName</code>).
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
     * The entity that started the build. Valid values include:
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
     * If an AWS Identity and Access Management (IAM) user started the build, the user's name (for example,
     * <code>MyUserName</code>).
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
     *        The entity that started the build. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If AWS CodePipeline started the build, the pipeline's name (for example,
     *        <code>codepipeline/my-demo-pipeline</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If an AWS Identity and Access Management (IAM) user started the build, the user's name (for example,
     *        <code>MyUserName</code>).
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

    public Build withInitiator(String initiator) {
        setInitiator(initiator);
        return this;
    }

    /**
     * <p>
     * If your AWS CodeBuild project accesses resources in an Amazon VPC, you provide this parameter that identifies the
     * VPC ID and the list of security group IDs and subnet IDs. The security groups and subnets must belong to the same
     * VPC. You must provide at least one security group and one subnet ID.
     * </p>
     * 
     * @param vpcConfig
     *        If your AWS CodeBuild project accesses resources in an Amazon VPC, you provide this parameter that
     *        identifies the VPC ID and the list of security group IDs and subnet IDs. The security groups and subnets
     *        must belong to the same VPC. You must provide at least one security group and one subnet ID.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * If your AWS CodeBuild project accesses resources in an Amazon VPC, you provide this parameter that identifies the
     * VPC ID and the list of security group IDs and subnet IDs. The security groups and subnets must belong to the same
     * VPC. You must provide at least one security group and one subnet ID.
     * </p>
     * 
     * @return If your AWS CodeBuild project accesses resources in an Amazon VPC, you provide this parameter that
     *         identifies the VPC ID and the list of security group IDs and subnet IDs. The security groups and subnets
     *         must belong to the same VPC. You must provide at least one security group and one subnet ID.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * If your AWS CodeBuild project accesses resources in an Amazon VPC, you provide this parameter that identifies the
     * VPC ID and the list of security group IDs and subnet IDs. The security groups and subnets must belong to the same
     * VPC. You must provide at least one security group and one subnet ID.
     * </p>
     * 
     * @param vpcConfig
     *        If your AWS CodeBuild project accesses resources in an Amazon VPC, you provide this parameter that
     *        identifies the VPC ID and the list of security group IDs and subnet IDs. The security groups and subnets
     *        must belong to the same VPC. You must provide at least one security group and one subnet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * Describes a network interface.
     * </p>
     * 
     * @param networkInterface
     *        Describes a network interface.
     */

    public void setNetworkInterface(NetworkInterface networkInterface) {
        this.networkInterface = networkInterface;
    }

    /**
     * <p>
     * Describes a network interface.
     * </p>
     * 
     * @return Describes a network interface.
     */

    public NetworkInterface getNetworkInterface() {
        return this.networkInterface;
    }

    /**
     * <p>
     * Describes a network interface.
     * </p>
     * 
     * @param networkInterface
     *        Describes a network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withNetworkInterface(NetworkInterface networkInterface) {
        setNetworkInterface(networkInterface);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output
     * artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to
     * that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the
     * format <code>alias/<i>alias-name</i> </code>).
     * </p>
     * 
     * @param encryptionKey
     *        The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build
     *        output artifacts.</p> <note>
     *        <p>
     *        You can use a cross-account KMS key to encrypt the build output artifacts if your service role has
     *        permission to that key.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using
     *        the format <code>alias/<i>alias-name</i> </code>).
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output
     * artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to
     * that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the
     * format <code>alias/<i>alias-name</i> </code>).
     * </p>
     * 
     * @return The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build
     *         output artifacts.</p> <note>
     *         <p>
     *         You can use a cross-account KMS key to encrypt the build output artifacts if your service role has
     *         permission to that key.
     *         </p>
     *         </note>
     *         <p>
     *         You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using
     *         the format <code>alias/<i>alias-name</i> </code>).
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output
     * artifacts.
     * </p>
     * <note>
     * <p>
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to
     * that key.
     * </p>
     * </note>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the
     * format <code>alias/<i>alias-name</i> </code>).
     * </p>
     * 
     * @param encryptionKey
     *        The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build
     *        output artifacts.</p> <note>
     *        <p>
     *        You can use a cross-account KMS key to encrypt the build output artifacts if your service role has
     *        permission to that key.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using
     *        the format <code>alias/<i>alias-name</i> </code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
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
        if (getBuildStatus() != null)
            sb.append("BuildStatus: ").append(getBuildStatus()).append(",");
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
        if (getLogs() != null)
            sb.append("Logs: ").append(getLogs()).append(",");
        if (getTimeoutInMinutes() != null)
            sb.append("TimeoutInMinutes: ").append(getTimeoutInMinutes()).append(",");
        if (getQueuedTimeoutInMinutes() != null)
            sb.append("QueuedTimeoutInMinutes: ").append(getQueuedTimeoutInMinutes()).append(",");
        if (getBuildComplete() != null)
            sb.append("BuildComplete: ").append(getBuildComplete()).append(",");
        if (getInitiator() != null)
            sb.append("Initiator: ").append(getInitiator()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getNetworkInterface() != null)
            sb.append("NetworkInterface: ").append(getNetworkInterface()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Build == false)
            return false;
        Build other = (Build) obj;
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
        if (other.getBuildStatus() == null ^ this.getBuildStatus() == null)
            return false;
        if (other.getBuildStatus() != null && other.getBuildStatus().equals(this.getBuildStatus()) == false)
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
        if (other.getLogs() == null ^ this.getLogs() == null)
            return false;
        if (other.getLogs() != null && other.getLogs().equals(this.getLogs()) == false)
            return false;
        if (other.getTimeoutInMinutes() == null ^ this.getTimeoutInMinutes() == null)
            return false;
        if (other.getTimeoutInMinutes() != null && other.getTimeoutInMinutes().equals(this.getTimeoutInMinutes()) == false)
            return false;
        if (other.getQueuedTimeoutInMinutes() == null ^ this.getQueuedTimeoutInMinutes() == null)
            return false;
        if (other.getQueuedTimeoutInMinutes() != null && other.getQueuedTimeoutInMinutes().equals(this.getQueuedTimeoutInMinutes()) == false)
            return false;
        if (other.getBuildComplete() == null ^ this.getBuildComplete() == null)
            return false;
        if (other.getBuildComplete() != null && other.getBuildComplete().equals(this.getBuildComplete()) == false)
            return false;
        if (other.getInitiator() == null ^ this.getInitiator() == null)
            return false;
        if (other.getInitiator() != null && other.getInitiator().equals(this.getInitiator()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getNetworkInterface() == null ^ this.getNetworkInterface() == null)
            return false;
        if (other.getNetworkInterface() != null && other.getNetworkInterface().equals(this.getNetworkInterface()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
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
        hashCode = prime * hashCode + ((getBuildStatus() == null) ? 0 : getBuildStatus().hashCode());
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
        hashCode = prime * hashCode + ((getLogs() == null) ? 0 : getLogs().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode + ((getQueuedTimeoutInMinutes() == null) ? 0 : getQueuedTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode + ((getBuildComplete() == null) ? 0 : getBuildComplete().hashCode());
        hashCode = prime * hashCode + ((getInitiator() == null) ? 0 : getInitiator().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterface() == null) ? 0 : getNetworkInterface().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        return hashCode;
    }

    @Override
    public Build clone() {
        try {
            return (Build) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.BuildMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

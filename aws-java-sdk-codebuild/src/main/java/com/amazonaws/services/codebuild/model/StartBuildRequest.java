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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/StartBuild" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartBuildRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the AWS CodeBuild build project to start running a build.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     */
    private java.util.List<ProjectSource> secondarySourcesOverride;
    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects that specify one or more versions of the project's
     * secondary sources to be used for this build only.
     * </p>
     */
    private java.util.List<ProjectSourceVersion> secondarySourcesVersionOverride;
    /**
     * <p>
     * A version of the build input to be built, for this build only. If not specified, the latest version is used. If
     * specified, must be one of:
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
     * <code>pr/pull-request-ID</code> (for example <code>pr/25</code>). If a branch name is specified, the branch's
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
    private String sourceVersion;
    /**
     * <p>
     * Build output artifact settings that override, for this build only, the latest ones already defined in the build
     * project.
     * </p>
     */
    private ProjectArtifacts artifactsOverride;
    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     */
    private java.util.List<ProjectArtifacts> secondaryArtifactsOverride;
    /**
     * <p>
     * A set of environment variables that overrides, for this build only, the latest ones already defined in the build
     * project.
     * </p>
     */
    private java.util.List<EnvironmentVariable> environmentVariablesOverride;
    /**
     * <p>
     * A source input type, for this build, that overrides the source input defined in the build project.
     * </p>
     */
    private String sourceTypeOverride;
    /**
     * <p>
     * A location that overrides, for this build, the source location for the one defined in the build project.
     * </p>
     */
    private String sourceLocationOverride;
    /**
     * <p>
     * An authorization type for this build that overrides the one defined in the build project. This override applies
     * only if the build project's source is BitBucket or GitHub.
     * </p>
     */
    private SourceAuth sourceAuthOverride;
    /**
     * <p>
     * The user-defined depth of history, with a minimum value of 0, that overrides, for this build only, any previous
     * depth of history defined in the build project.
     * </p>
     */
    private Integer gitCloneDepthOverride;
    /**
     * <p>
     * Information about the Git submodules configuration for this build of an AWS CodeBuild build project.
     * </p>
     */
    private GitSubmodulesConfig gitSubmodulesConfigOverride;
    /**
     * <p>
     * A build spec declaration that overrides, for this build only, the latest one already defined in the build
     * project.
     * </p>
     */
    private String buildspecOverride;
    /**
     * <p>
     * Enable this flag to override the insecure SSL setting that is specified in the build project. The insecure SSL
     * setting determines whether to ignore SSL warnings while connecting to the project source code. This override
     * applies only if the build's source is GitHub Enterprise.
     * </p>
     */
    private Boolean insecureSslOverride;
    /**
     * <p>
     * Set to true to report to your source provider the status of a build's start and completion. If you use this
     * option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is
     * thrown.
     * </p>
     */
    private Boolean reportBuildStatusOverride;
    /**
     * <p>
     * A container type for this build that overrides the one specified in the build project.
     * </p>
     */
    private String environmentTypeOverride;
    /**
     * <p>
     * The name of an image for this build that overrides the one specified in the build project.
     * </p>
     */
    private String imageOverride;
    /**
     * <p>
     * The name of a compute type for this build that overrides the one specified in the build project.
     * </p>
     */
    private String computeTypeOverride;
    /**
     * <p>
     * The name of a certificate for this build that overrides the one specified in the build project.
     * </p>
     */
    private String certificateOverride;
    /**
     * <p>
     * A ProjectCache object specified for this build that overrides the one defined in the build project.
     * </p>
     */
    private ProjectCache cacheOverride;
    /**
     * <p>
     * The name of a service role for this build that overrides the one specified in the build project.
     * </p>
     */
    private String serviceRoleOverride;
    /**
     * <p>
     * Enable this flag to override privileged mode in the build project.
     * </p>
     */
    private Boolean privilegedModeOverride;
    /**
     * <p>
     * The number of build timeout minutes, from 5 to 480 (8 hours), that overrides, for this build only, the latest
     * setting already defined in the build project.
     * </p>
     */
    private Integer timeoutInMinutesOverride;
    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times out.
     * </p>
     */
    private Integer queuedTimeoutInMinutesOverride;
    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency of the StartBuild request. The token is
     * included in the StartBuild request and is valid for 12 hours. If you repeat the StartBuild request with the same
     * token, but change a parameter, AWS CodeBuild returns a parameter mismatch error.
     * </p>
     */
    private String idempotencyToken;
    /**
     * <p>
     * Log settings for this build that override the log settings defined in the build project.
     * </p>
     */
    private LogsConfig logsConfigOverride;
    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     */
    private RegistryCredential registryCredentialOverride;
    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using a cross-account or private registry image, you must use SERVICE_ROLE credentials. When using an AWS
     * CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     */
    private String imagePullCredentialsTypeOverride;

    /**
     * <p>
     * The name of the AWS CodeBuild build project to start running a build.
     * </p>
     * 
     * @param projectName
     *        The name of the AWS CodeBuild build project to start running a build.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild build project to start running a build.
     * </p>
     * 
     * @return The name of the AWS CodeBuild build project to start running a build.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild build project to start running a build.
     * </p>
     * 
     * @param projectName
     *        The name of the AWS CodeBuild build project to start running a build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     * 
     * @return An array of <code>ProjectSource</code> objects.
     */

    public java.util.List<ProjectSource> getSecondarySourcesOverride() {
        return secondarySourcesOverride;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     * 
     * @param secondarySourcesOverride
     *        An array of <code>ProjectSource</code> objects.
     */

    public void setSecondarySourcesOverride(java.util.Collection<ProjectSource> secondarySourcesOverride) {
        if (secondarySourcesOverride == null) {
            this.secondarySourcesOverride = null;
            return;
        }

        this.secondarySourcesOverride = new java.util.ArrayList<ProjectSource>(secondarySourcesOverride);
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondarySourcesOverride(java.util.Collection)} or
     * {@link #withSecondarySourcesOverride(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param secondarySourcesOverride
     *        An array of <code>ProjectSource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withSecondarySourcesOverride(ProjectSource... secondarySourcesOverride) {
        if (this.secondarySourcesOverride == null) {
            setSecondarySourcesOverride(new java.util.ArrayList<ProjectSource>(secondarySourcesOverride.length));
        }
        for (ProjectSource ele : secondarySourcesOverride) {
            this.secondarySourcesOverride.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects.
     * </p>
     * 
     * @param secondarySourcesOverride
     *        An array of <code>ProjectSource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withSecondarySourcesOverride(java.util.Collection<ProjectSource> secondarySourcesOverride) {
        setSecondarySourcesOverride(secondarySourcesOverride);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects that specify one or more versions of the project's
     * secondary sources to be used for this build only.
     * </p>
     * 
     * @return An array of <code>ProjectSourceVersion</code> objects that specify one or more versions of the project's
     *         secondary sources to be used for this build only.
     */

    public java.util.List<ProjectSourceVersion> getSecondarySourcesVersionOverride() {
        return secondarySourcesVersionOverride;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects that specify one or more versions of the project's
     * secondary sources to be used for this build only.
     * </p>
     * 
     * @param secondarySourcesVersionOverride
     *        An array of <code>ProjectSourceVersion</code> objects that specify one or more versions of the project's
     *        secondary sources to be used for this build only.
     */

    public void setSecondarySourcesVersionOverride(java.util.Collection<ProjectSourceVersion> secondarySourcesVersionOverride) {
        if (secondarySourcesVersionOverride == null) {
            this.secondarySourcesVersionOverride = null;
            return;
        }

        this.secondarySourcesVersionOverride = new java.util.ArrayList<ProjectSourceVersion>(secondarySourcesVersionOverride);
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects that specify one or more versions of the project's
     * secondary sources to be used for this build only.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondarySourcesVersionOverride(java.util.Collection)} or
     * {@link #withSecondarySourcesVersionOverride(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param secondarySourcesVersionOverride
     *        An array of <code>ProjectSourceVersion</code> objects that specify one or more versions of the project's
     *        secondary sources to be used for this build only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withSecondarySourcesVersionOverride(ProjectSourceVersion... secondarySourcesVersionOverride) {
        if (this.secondarySourcesVersionOverride == null) {
            setSecondarySourcesVersionOverride(new java.util.ArrayList<ProjectSourceVersion>(secondarySourcesVersionOverride.length));
        }
        for (ProjectSourceVersion ele : secondarySourcesVersionOverride) {
            this.secondarySourcesVersionOverride.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects that specify one or more versions of the project's
     * secondary sources to be used for this build only.
     * </p>
     * 
     * @param secondarySourcesVersionOverride
     *        An array of <code>ProjectSourceVersion</code> objects that specify one or more versions of the project's
     *        secondary sources to be used for this build only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withSecondarySourcesVersionOverride(java.util.Collection<ProjectSourceVersion> secondarySourcesVersionOverride) {
        setSecondarySourcesVersionOverride(secondarySourcesVersionOverride);
        return this;
    }

    /**
     * <p>
     * A version of the build input to be built, for this build only. If not specified, the latest version is used. If
     * specified, must be one of:
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
     * <code>pr/pull-request-ID</code> (for example <code>pr/25</code>). If a branch name is specified, the branch's
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
     * @param sourceVersion
     *        A version of the build input to be built, for this build only. If not specified, the latest version is
     *        used. If specified, must be one of:</p>
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
     *        <code>pr/pull-request-ID</code> (for example <code>pr/25</code>). If a branch name is specified, the
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

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * A version of the build input to be built, for this build only. If not specified, the latest version is used. If
     * specified, must be one of:
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
     * <code>pr/pull-request-ID</code> (for example <code>pr/25</code>). If a branch name is specified, the branch's
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
     * @return A version of the build input to be built, for this build only. If not specified, the latest version is
     *         used. If specified, must be one of:</p>
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
     *         <code>pr/pull-request-ID</code> (for example <code>pr/25</code>). If a branch name is specified, the
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

    public String getSourceVersion() {
        return this.sourceVersion;
    }

    /**
     * <p>
     * A version of the build input to be built, for this build only. If not specified, the latest version is used. If
     * specified, must be one of:
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
     * <code>pr/pull-request-ID</code> (for example <code>pr/25</code>). If a branch name is specified, the branch's
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
     * @param sourceVersion
     *        A version of the build input to be built, for this build only. If not specified, the latest version is
     *        used. If specified, must be one of:</p>
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
     *        <code>pr/pull-request-ID</code> (for example <code>pr/25</code>). If a branch name is specified, the
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

    public StartBuildRequest withSourceVersion(String sourceVersion) {
        setSourceVersion(sourceVersion);
        return this;
    }

    /**
     * <p>
     * Build output artifact settings that override, for this build only, the latest ones already defined in the build
     * project.
     * </p>
     * 
     * @param artifactsOverride
     *        Build output artifact settings that override, for this build only, the latest ones already defined in the
     *        build project.
     */

    public void setArtifactsOverride(ProjectArtifacts artifactsOverride) {
        this.artifactsOverride = artifactsOverride;
    }

    /**
     * <p>
     * Build output artifact settings that override, for this build only, the latest ones already defined in the build
     * project.
     * </p>
     * 
     * @return Build output artifact settings that override, for this build only, the latest ones already defined in the
     *         build project.
     */

    public ProjectArtifacts getArtifactsOverride() {
        return this.artifactsOverride;
    }

    /**
     * <p>
     * Build output artifact settings that override, for this build only, the latest ones already defined in the build
     * project.
     * </p>
     * 
     * @param artifactsOverride
     *        Build output artifact settings that override, for this build only, the latest ones already defined in the
     *        build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withArtifactsOverride(ProjectArtifacts artifactsOverride) {
        setArtifactsOverride(artifactsOverride);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     * 
     * @return An array of <code>ProjectArtifacts</code> objects.
     */

    public java.util.List<ProjectArtifacts> getSecondaryArtifactsOverride() {
        return secondaryArtifactsOverride;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     * 
     * @param secondaryArtifactsOverride
     *        An array of <code>ProjectArtifacts</code> objects.
     */

    public void setSecondaryArtifactsOverride(java.util.Collection<ProjectArtifacts> secondaryArtifactsOverride) {
        if (secondaryArtifactsOverride == null) {
            this.secondaryArtifactsOverride = null;
            return;
        }

        this.secondaryArtifactsOverride = new java.util.ArrayList<ProjectArtifacts>(secondaryArtifactsOverride);
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondaryArtifactsOverride(java.util.Collection)} or
     * {@link #withSecondaryArtifactsOverride(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param secondaryArtifactsOverride
     *        An array of <code>ProjectArtifacts</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withSecondaryArtifactsOverride(ProjectArtifacts... secondaryArtifactsOverride) {
        if (this.secondaryArtifactsOverride == null) {
            setSecondaryArtifactsOverride(new java.util.ArrayList<ProjectArtifacts>(secondaryArtifactsOverride.length));
        }
        for (ProjectArtifacts ele : secondaryArtifactsOverride) {
            this.secondaryArtifactsOverride.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects.
     * </p>
     * 
     * @param secondaryArtifactsOverride
     *        An array of <code>ProjectArtifacts</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withSecondaryArtifactsOverride(java.util.Collection<ProjectArtifacts> secondaryArtifactsOverride) {
        setSecondaryArtifactsOverride(secondaryArtifactsOverride);
        return this;
    }

    /**
     * <p>
     * A set of environment variables that overrides, for this build only, the latest ones already defined in the build
     * project.
     * </p>
     * 
     * @return A set of environment variables that overrides, for this build only, the latest ones already defined in
     *         the build project.
     */

    public java.util.List<EnvironmentVariable> getEnvironmentVariablesOverride() {
        return environmentVariablesOverride;
    }

    /**
     * <p>
     * A set of environment variables that overrides, for this build only, the latest ones already defined in the build
     * project.
     * </p>
     * 
     * @param environmentVariablesOverride
     *        A set of environment variables that overrides, for this build only, the latest ones already defined in the
     *        build project.
     */

    public void setEnvironmentVariablesOverride(java.util.Collection<EnvironmentVariable> environmentVariablesOverride) {
        if (environmentVariablesOverride == null) {
            this.environmentVariablesOverride = null;
            return;
        }

        this.environmentVariablesOverride = new java.util.ArrayList<EnvironmentVariable>(environmentVariablesOverride);
    }

    /**
     * <p>
     * A set of environment variables that overrides, for this build only, the latest ones already defined in the build
     * project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentVariablesOverride(java.util.Collection)} or
     * {@link #withEnvironmentVariablesOverride(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param environmentVariablesOverride
     *        A set of environment variables that overrides, for this build only, the latest ones already defined in the
     *        build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withEnvironmentVariablesOverride(EnvironmentVariable... environmentVariablesOverride) {
        if (this.environmentVariablesOverride == null) {
            setEnvironmentVariablesOverride(new java.util.ArrayList<EnvironmentVariable>(environmentVariablesOverride.length));
        }
        for (EnvironmentVariable ele : environmentVariablesOverride) {
            this.environmentVariablesOverride.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of environment variables that overrides, for this build only, the latest ones already defined in the build
     * project.
     * </p>
     * 
     * @param environmentVariablesOverride
     *        A set of environment variables that overrides, for this build only, the latest ones already defined in the
     *        build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withEnvironmentVariablesOverride(java.util.Collection<EnvironmentVariable> environmentVariablesOverride) {
        setEnvironmentVariablesOverride(environmentVariablesOverride);
        return this;
    }

    /**
     * <p>
     * A source input type, for this build, that overrides the source input defined in the build project.
     * </p>
     * 
     * @param sourceTypeOverride
     *        A source input type, for this build, that overrides the source input defined in the build project.
     * @see SourceType
     */

    public void setSourceTypeOverride(String sourceTypeOverride) {
        this.sourceTypeOverride = sourceTypeOverride;
    }

    /**
     * <p>
     * A source input type, for this build, that overrides the source input defined in the build project.
     * </p>
     * 
     * @return A source input type, for this build, that overrides the source input defined in the build project.
     * @see SourceType
     */

    public String getSourceTypeOverride() {
        return this.sourceTypeOverride;
    }

    /**
     * <p>
     * A source input type, for this build, that overrides the source input defined in the build project.
     * </p>
     * 
     * @param sourceTypeOverride
     *        A source input type, for this build, that overrides the source input defined in the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public StartBuildRequest withSourceTypeOverride(String sourceTypeOverride) {
        setSourceTypeOverride(sourceTypeOverride);
        return this;
    }

    /**
     * <p>
     * A source input type, for this build, that overrides the source input defined in the build project.
     * </p>
     * 
     * @param sourceTypeOverride
     *        A source input type, for this build, that overrides the source input defined in the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public StartBuildRequest withSourceTypeOverride(SourceType sourceTypeOverride) {
        this.sourceTypeOverride = sourceTypeOverride.toString();
        return this;
    }

    /**
     * <p>
     * A location that overrides, for this build, the source location for the one defined in the build project.
     * </p>
     * 
     * @param sourceLocationOverride
     *        A location that overrides, for this build, the source location for the one defined in the build project.
     */

    public void setSourceLocationOverride(String sourceLocationOverride) {
        this.sourceLocationOverride = sourceLocationOverride;
    }

    /**
     * <p>
     * A location that overrides, for this build, the source location for the one defined in the build project.
     * </p>
     * 
     * @return A location that overrides, for this build, the source location for the one defined in the build project.
     */

    public String getSourceLocationOverride() {
        return this.sourceLocationOverride;
    }

    /**
     * <p>
     * A location that overrides, for this build, the source location for the one defined in the build project.
     * </p>
     * 
     * @param sourceLocationOverride
     *        A location that overrides, for this build, the source location for the one defined in the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withSourceLocationOverride(String sourceLocationOverride) {
        setSourceLocationOverride(sourceLocationOverride);
        return this;
    }

    /**
     * <p>
     * An authorization type for this build that overrides the one defined in the build project. This override applies
     * only if the build project's source is BitBucket or GitHub.
     * </p>
     * 
     * @param sourceAuthOverride
     *        An authorization type for this build that overrides the one defined in the build project. This override
     *        applies only if the build project's source is BitBucket or GitHub.
     */

    public void setSourceAuthOverride(SourceAuth sourceAuthOverride) {
        this.sourceAuthOverride = sourceAuthOverride;
    }

    /**
     * <p>
     * An authorization type for this build that overrides the one defined in the build project. This override applies
     * only if the build project's source is BitBucket or GitHub.
     * </p>
     * 
     * @return An authorization type for this build that overrides the one defined in the build project. This override
     *         applies only if the build project's source is BitBucket or GitHub.
     */

    public SourceAuth getSourceAuthOverride() {
        return this.sourceAuthOverride;
    }

    /**
     * <p>
     * An authorization type for this build that overrides the one defined in the build project. This override applies
     * only if the build project's source is BitBucket or GitHub.
     * </p>
     * 
     * @param sourceAuthOverride
     *        An authorization type for this build that overrides the one defined in the build project. This override
     *        applies only if the build project's source is BitBucket or GitHub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withSourceAuthOverride(SourceAuth sourceAuthOverride) {
        setSourceAuthOverride(sourceAuthOverride);
        return this;
    }

    /**
     * <p>
     * The user-defined depth of history, with a minimum value of 0, that overrides, for this build only, any previous
     * depth of history defined in the build project.
     * </p>
     * 
     * @param gitCloneDepthOverride
     *        The user-defined depth of history, with a minimum value of 0, that overrides, for this build only, any
     *        previous depth of history defined in the build project.
     */

    public void setGitCloneDepthOverride(Integer gitCloneDepthOverride) {
        this.gitCloneDepthOverride = gitCloneDepthOverride;
    }

    /**
     * <p>
     * The user-defined depth of history, with a minimum value of 0, that overrides, for this build only, any previous
     * depth of history defined in the build project.
     * </p>
     * 
     * @return The user-defined depth of history, with a minimum value of 0, that overrides, for this build only, any
     *         previous depth of history defined in the build project.
     */

    public Integer getGitCloneDepthOverride() {
        return this.gitCloneDepthOverride;
    }

    /**
     * <p>
     * The user-defined depth of history, with a minimum value of 0, that overrides, for this build only, any previous
     * depth of history defined in the build project.
     * </p>
     * 
     * @param gitCloneDepthOverride
     *        The user-defined depth of history, with a minimum value of 0, that overrides, for this build only, any
     *        previous depth of history defined in the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withGitCloneDepthOverride(Integer gitCloneDepthOverride) {
        setGitCloneDepthOverride(gitCloneDepthOverride);
        return this;
    }

    /**
     * <p>
     * Information about the Git submodules configuration for this build of an AWS CodeBuild build project.
     * </p>
     * 
     * @param gitSubmodulesConfigOverride
     *        Information about the Git submodules configuration for this build of an AWS CodeBuild build project.
     */

    public void setGitSubmodulesConfigOverride(GitSubmodulesConfig gitSubmodulesConfigOverride) {
        this.gitSubmodulesConfigOverride = gitSubmodulesConfigOverride;
    }

    /**
     * <p>
     * Information about the Git submodules configuration for this build of an AWS CodeBuild build project.
     * </p>
     * 
     * @return Information about the Git submodules configuration for this build of an AWS CodeBuild build project.
     */

    public GitSubmodulesConfig getGitSubmodulesConfigOverride() {
        return this.gitSubmodulesConfigOverride;
    }

    /**
     * <p>
     * Information about the Git submodules configuration for this build of an AWS CodeBuild build project.
     * </p>
     * 
     * @param gitSubmodulesConfigOverride
     *        Information about the Git submodules configuration for this build of an AWS CodeBuild build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withGitSubmodulesConfigOverride(GitSubmodulesConfig gitSubmodulesConfigOverride) {
        setGitSubmodulesConfigOverride(gitSubmodulesConfigOverride);
        return this;
    }

    /**
     * <p>
     * A build spec declaration that overrides, for this build only, the latest one already defined in the build
     * project.
     * </p>
     * 
     * @param buildspecOverride
     *        A build spec declaration that overrides, for this build only, the latest one already defined in the build
     *        project.
     */

    public void setBuildspecOverride(String buildspecOverride) {
        this.buildspecOverride = buildspecOverride;
    }

    /**
     * <p>
     * A build spec declaration that overrides, for this build only, the latest one already defined in the build
     * project.
     * </p>
     * 
     * @return A build spec declaration that overrides, for this build only, the latest one already defined in the build
     *         project.
     */

    public String getBuildspecOverride() {
        return this.buildspecOverride;
    }

    /**
     * <p>
     * A build spec declaration that overrides, for this build only, the latest one already defined in the build
     * project.
     * </p>
     * 
     * @param buildspecOverride
     *        A build spec declaration that overrides, for this build only, the latest one already defined in the build
     *        project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withBuildspecOverride(String buildspecOverride) {
        setBuildspecOverride(buildspecOverride);
        return this;
    }

    /**
     * <p>
     * Enable this flag to override the insecure SSL setting that is specified in the build project. The insecure SSL
     * setting determines whether to ignore SSL warnings while connecting to the project source code. This override
     * applies only if the build's source is GitHub Enterprise.
     * </p>
     * 
     * @param insecureSslOverride
     *        Enable this flag to override the insecure SSL setting that is specified in the build project. The insecure
     *        SSL setting determines whether to ignore SSL warnings while connecting to the project source code. This
     *        override applies only if the build's source is GitHub Enterprise.
     */

    public void setInsecureSslOverride(Boolean insecureSslOverride) {
        this.insecureSslOverride = insecureSslOverride;
    }

    /**
     * <p>
     * Enable this flag to override the insecure SSL setting that is specified in the build project. The insecure SSL
     * setting determines whether to ignore SSL warnings while connecting to the project source code. This override
     * applies only if the build's source is GitHub Enterprise.
     * </p>
     * 
     * @return Enable this flag to override the insecure SSL setting that is specified in the build project. The
     *         insecure SSL setting determines whether to ignore SSL warnings while connecting to the project source
     *         code. This override applies only if the build's source is GitHub Enterprise.
     */

    public Boolean getInsecureSslOverride() {
        return this.insecureSslOverride;
    }

    /**
     * <p>
     * Enable this flag to override the insecure SSL setting that is specified in the build project. The insecure SSL
     * setting determines whether to ignore SSL warnings while connecting to the project source code. This override
     * applies only if the build's source is GitHub Enterprise.
     * </p>
     * 
     * @param insecureSslOverride
     *        Enable this flag to override the insecure SSL setting that is specified in the build project. The insecure
     *        SSL setting determines whether to ignore SSL warnings while connecting to the project source code. This
     *        override applies only if the build's source is GitHub Enterprise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withInsecureSslOverride(Boolean insecureSslOverride) {
        setInsecureSslOverride(insecureSslOverride);
        return this;
    }

    /**
     * <p>
     * Enable this flag to override the insecure SSL setting that is specified in the build project. The insecure SSL
     * setting determines whether to ignore SSL warnings while connecting to the project source code. This override
     * applies only if the build's source is GitHub Enterprise.
     * </p>
     * 
     * @return Enable this flag to override the insecure SSL setting that is specified in the build project. The
     *         insecure SSL setting determines whether to ignore SSL warnings while connecting to the project source
     *         code. This override applies only if the build's source is GitHub Enterprise.
     */

    public Boolean isInsecureSslOverride() {
        return this.insecureSslOverride;
    }

    /**
     * <p>
     * Set to true to report to your source provider the status of a build's start and completion. If you use this
     * option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is
     * thrown.
     * </p>
     * 
     * @param reportBuildStatusOverride
     *        Set to true to report to your source provider the status of a build's start and completion. If you use
     *        this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an
     *        invalidInputException is thrown.
     */

    public void setReportBuildStatusOverride(Boolean reportBuildStatusOverride) {
        this.reportBuildStatusOverride = reportBuildStatusOverride;
    }

    /**
     * <p>
     * Set to true to report to your source provider the status of a build's start and completion. If you use this
     * option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is
     * thrown.
     * </p>
     * 
     * @return Set to true to report to your source provider the status of a build's start and completion. If you use
     *         this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an
     *         invalidInputException is thrown.
     */

    public Boolean getReportBuildStatusOverride() {
        return this.reportBuildStatusOverride;
    }

    /**
     * <p>
     * Set to true to report to your source provider the status of a build's start and completion. If you use this
     * option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is
     * thrown.
     * </p>
     * 
     * @param reportBuildStatusOverride
     *        Set to true to report to your source provider the status of a build's start and completion. If you use
     *        this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an
     *        invalidInputException is thrown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withReportBuildStatusOverride(Boolean reportBuildStatusOverride) {
        setReportBuildStatusOverride(reportBuildStatusOverride);
        return this;
    }

    /**
     * <p>
     * Set to true to report to your source provider the status of a build's start and completion. If you use this
     * option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is
     * thrown.
     * </p>
     * 
     * @return Set to true to report to your source provider the status of a build's start and completion. If you use
     *         this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an
     *         invalidInputException is thrown.
     */

    public Boolean isReportBuildStatusOverride() {
        return this.reportBuildStatusOverride;
    }

    /**
     * <p>
     * A container type for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @param environmentTypeOverride
     *        A container type for this build that overrides the one specified in the build project.
     * @see EnvironmentType
     */

    public void setEnvironmentTypeOverride(String environmentTypeOverride) {
        this.environmentTypeOverride = environmentTypeOverride;
    }

    /**
     * <p>
     * A container type for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @return A container type for this build that overrides the one specified in the build project.
     * @see EnvironmentType
     */

    public String getEnvironmentTypeOverride() {
        return this.environmentTypeOverride;
    }

    /**
     * <p>
     * A container type for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @param environmentTypeOverride
     *        A container type for this build that overrides the one specified in the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentType
     */

    public StartBuildRequest withEnvironmentTypeOverride(String environmentTypeOverride) {
        setEnvironmentTypeOverride(environmentTypeOverride);
        return this;
    }

    /**
     * <p>
     * A container type for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @param environmentTypeOverride
     *        A container type for this build that overrides the one specified in the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentType
     */

    public StartBuildRequest withEnvironmentTypeOverride(EnvironmentType environmentTypeOverride) {
        this.environmentTypeOverride = environmentTypeOverride.toString();
        return this;
    }

    /**
     * <p>
     * The name of an image for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @param imageOverride
     *        The name of an image for this build that overrides the one specified in the build project.
     */

    public void setImageOverride(String imageOverride) {
        this.imageOverride = imageOverride;
    }

    /**
     * <p>
     * The name of an image for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @return The name of an image for this build that overrides the one specified in the build project.
     */

    public String getImageOverride() {
        return this.imageOverride;
    }

    /**
     * <p>
     * The name of an image for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @param imageOverride
     *        The name of an image for this build that overrides the one specified in the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withImageOverride(String imageOverride) {
        setImageOverride(imageOverride);
        return this;
    }

    /**
     * <p>
     * The name of a compute type for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @param computeTypeOverride
     *        The name of a compute type for this build that overrides the one specified in the build project.
     * @see ComputeType
     */

    public void setComputeTypeOverride(String computeTypeOverride) {
        this.computeTypeOverride = computeTypeOverride;
    }

    /**
     * <p>
     * The name of a compute type for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @return The name of a compute type for this build that overrides the one specified in the build project.
     * @see ComputeType
     */

    public String getComputeTypeOverride() {
        return this.computeTypeOverride;
    }

    /**
     * <p>
     * The name of a compute type for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @param computeTypeOverride
     *        The name of a compute type for this build that overrides the one specified in the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public StartBuildRequest withComputeTypeOverride(String computeTypeOverride) {
        setComputeTypeOverride(computeTypeOverride);
        return this;
    }

    /**
     * <p>
     * The name of a compute type for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @param computeTypeOverride
     *        The name of a compute type for this build that overrides the one specified in the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public StartBuildRequest withComputeTypeOverride(ComputeType computeTypeOverride) {
        this.computeTypeOverride = computeTypeOverride.toString();
        return this;
    }

    /**
     * <p>
     * The name of a certificate for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @param certificateOverride
     *        The name of a certificate for this build that overrides the one specified in the build project.
     */

    public void setCertificateOverride(String certificateOverride) {
        this.certificateOverride = certificateOverride;
    }

    /**
     * <p>
     * The name of a certificate for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @return The name of a certificate for this build that overrides the one specified in the build project.
     */

    public String getCertificateOverride() {
        return this.certificateOverride;
    }

    /**
     * <p>
     * The name of a certificate for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @param certificateOverride
     *        The name of a certificate for this build that overrides the one specified in the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withCertificateOverride(String certificateOverride) {
        setCertificateOverride(certificateOverride);
        return this;
    }

    /**
     * <p>
     * A ProjectCache object specified for this build that overrides the one defined in the build project.
     * </p>
     * 
     * @param cacheOverride
     *        A ProjectCache object specified for this build that overrides the one defined in the build project.
     */

    public void setCacheOverride(ProjectCache cacheOverride) {
        this.cacheOverride = cacheOverride;
    }

    /**
     * <p>
     * A ProjectCache object specified for this build that overrides the one defined in the build project.
     * </p>
     * 
     * @return A ProjectCache object specified for this build that overrides the one defined in the build project.
     */

    public ProjectCache getCacheOverride() {
        return this.cacheOverride;
    }

    /**
     * <p>
     * A ProjectCache object specified for this build that overrides the one defined in the build project.
     * </p>
     * 
     * @param cacheOverride
     *        A ProjectCache object specified for this build that overrides the one defined in the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withCacheOverride(ProjectCache cacheOverride) {
        setCacheOverride(cacheOverride);
        return this;
    }

    /**
     * <p>
     * The name of a service role for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @param serviceRoleOverride
     *        The name of a service role for this build that overrides the one specified in the build project.
     */

    public void setServiceRoleOverride(String serviceRoleOverride) {
        this.serviceRoleOverride = serviceRoleOverride;
    }

    /**
     * <p>
     * The name of a service role for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @return The name of a service role for this build that overrides the one specified in the build project.
     */

    public String getServiceRoleOverride() {
        return this.serviceRoleOverride;
    }

    /**
     * <p>
     * The name of a service role for this build that overrides the one specified in the build project.
     * </p>
     * 
     * @param serviceRoleOverride
     *        The name of a service role for this build that overrides the one specified in the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withServiceRoleOverride(String serviceRoleOverride) {
        setServiceRoleOverride(serviceRoleOverride);
        return this;
    }

    /**
     * <p>
     * Enable this flag to override privileged mode in the build project.
     * </p>
     * 
     * @param privilegedModeOverride
     *        Enable this flag to override privileged mode in the build project.
     */

    public void setPrivilegedModeOverride(Boolean privilegedModeOverride) {
        this.privilegedModeOverride = privilegedModeOverride;
    }

    /**
     * <p>
     * Enable this flag to override privileged mode in the build project.
     * </p>
     * 
     * @return Enable this flag to override privileged mode in the build project.
     */

    public Boolean getPrivilegedModeOverride() {
        return this.privilegedModeOverride;
    }

    /**
     * <p>
     * Enable this flag to override privileged mode in the build project.
     * </p>
     * 
     * @param privilegedModeOverride
     *        Enable this flag to override privileged mode in the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withPrivilegedModeOverride(Boolean privilegedModeOverride) {
        setPrivilegedModeOverride(privilegedModeOverride);
        return this;
    }

    /**
     * <p>
     * Enable this flag to override privileged mode in the build project.
     * </p>
     * 
     * @return Enable this flag to override privileged mode in the build project.
     */

    public Boolean isPrivilegedModeOverride() {
        return this.privilegedModeOverride;
    }

    /**
     * <p>
     * The number of build timeout minutes, from 5 to 480 (8 hours), that overrides, for this build only, the latest
     * setting already defined in the build project.
     * </p>
     * 
     * @param timeoutInMinutesOverride
     *        The number of build timeout minutes, from 5 to 480 (8 hours), that overrides, for this build only, the
     *        latest setting already defined in the build project.
     */

    public void setTimeoutInMinutesOverride(Integer timeoutInMinutesOverride) {
        this.timeoutInMinutesOverride = timeoutInMinutesOverride;
    }

    /**
     * <p>
     * The number of build timeout minutes, from 5 to 480 (8 hours), that overrides, for this build only, the latest
     * setting already defined in the build project.
     * </p>
     * 
     * @return The number of build timeout minutes, from 5 to 480 (8 hours), that overrides, for this build only, the
     *         latest setting already defined in the build project.
     */

    public Integer getTimeoutInMinutesOverride() {
        return this.timeoutInMinutesOverride;
    }

    /**
     * <p>
     * The number of build timeout minutes, from 5 to 480 (8 hours), that overrides, for this build only, the latest
     * setting already defined in the build project.
     * </p>
     * 
     * @param timeoutInMinutesOverride
     *        The number of build timeout minutes, from 5 to 480 (8 hours), that overrides, for this build only, the
     *        latest setting already defined in the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withTimeoutInMinutesOverride(Integer timeoutInMinutesOverride) {
        setTimeoutInMinutesOverride(timeoutInMinutesOverride);
        return this;
    }

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times out.
     * </p>
     * 
     * @param queuedTimeoutInMinutesOverride
     *        The number of minutes a build is allowed to be queued before it times out.
     */

    public void setQueuedTimeoutInMinutesOverride(Integer queuedTimeoutInMinutesOverride) {
        this.queuedTimeoutInMinutesOverride = queuedTimeoutInMinutesOverride;
    }

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times out.
     * </p>
     * 
     * @return The number of minutes a build is allowed to be queued before it times out.
     */

    public Integer getQueuedTimeoutInMinutesOverride() {
        return this.queuedTimeoutInMinutesOverride;
    }

    /**
     * <p>
     * The number of minutes a build is allowed to be queued before it times out.
     * </p>
     * 
     * @param queuedTimeoutInMinutesOverride
     *        The number of minutes a build is allowed to be queued before it times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withQueuedTimeoutInMinutesOverride(Integer queuedTimeoutInMinutesOverride) {
        setQueuedTimeoutInMinutesOverride(queuedTimeoutInMinutesOverride);
        return this;
    }

    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency of the StartBuild request. The token is
     * included in the StartBuild request and is valid for 12 hours. If you repeat the StartBuild request with the same
     * token, but change a parameter, AWS CodeBuild returns a parameter mismatch error.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique, case sensitive identifier you provide to ensure the idempotency of the StartBuild request. The
     *        token is included in the StartBuild request and is valid for 12 hours. If you repeat the StartBuild
     *        request with the same token, but change a parameter, AWS CodeBuild returns a parameter mismatch error.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency of the StartBuild request. The token is
     * included in the StartBuild request and is valid for 12 hours. If you repeat the StartBuild request with the same
     * token, but change a parameter, AWS CodeBuild returns a parameter mismatch error.
     * </p>
     * 
     * @return A unique, case sensitive identifier you provide to ensure the idempotency of the StartBuild request. The
     *         token is included in the StartBuild request and is valid for 12 hours. If you repeat the StartBuild
     *         request with the same token, but change a parameter, AWS CodeBuild returns a parameter mismatch error.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency of the StartBuild request. The token is
     * included in the StartBuild request and is valid for 12 hours. If you repeat the StartBuild request with the same
     * token, but change a parameter, AWS CodeBuild returns a parameter mismatch error.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique, case sensitive identifier you provide to ensure the idempotency of the StartBuild request. The
     *        token is included in the StartBuild request and is valid for 12 hours. If you repeat the StartBuild
     *        request with the same token, but change a parameter, AWS CodeBuild returns a parameter mismatch error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
        return this;
    }

    /**
     * <p>
     * Log settings for this build that override the log settings defined in the build project.
     * </p>
     * 
     * @param logsConfigOverride
     *        Log settings for this build that override the log settings defined in the build project.
     */

    public void setLogsConfigOverride(LogsConfig logsConfigOverride) {
        this.logsConfigOverride = logsConfigOverride;
    }

    /**
     * <p>
     * Log settings for this build that override the log settings defined in the build project.
     * </p>
     * 
     * @return Log settings for this build that override the log settings defined in the build project.
     */

    public LogsConfig getLogsConfigOverride() {
        return this.logsConfigOverride;
    }

    /**
     * <p>
     * Log settings for this build that override the log settings defined in the build project.
     * </p>
     * 
     * @param logsConfigOverride
     *        Log settings for this build that override the log settings defined in the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withLogsConfigOverride(LogsConfig logsConfigOverride) {
        setLogsConfigOverride(logsConfigOverride);
        return this;
    }

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     * 
     * @param registryCredentialOverride
     *        The credentials for access to a private registry.
     */

    public void setRegistryCredentialOverride(RegistryCredential registryCredentialOverride) {
        this.registryCredentialOverride = registryCredentialOverride;
    }

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     * 
     * @return The credentials for access to a private registry.
     */

    public RegistryCredential getRegistryCredentialOverride() {
        return this.registryCredentialOverride;
    }

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     * 
     * @param registryCredentialOverride
     *        The credentials for access to a private registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withRegistryCredentialOverride(RegistryCredential registryCredentialOverride) {
        setRegistryCredentialOverride(registryCredentialOverride);
        return this;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using a cross-account or private registry image, you must use SERVICE_ROLE credentials. When using an AWS
     * CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     * 
     * @param imagePullCredentialsTypeOverride
     *        The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you
     *        modify your ECR repository policy to trust AWS CodeBuild's service principal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When using a cross-account or private registry image, you must use SERVICE_ROLE credentials. When using an
     *        AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * @see ImagePullCredentialsType
     */

    public void setImagePullCredentialsTypeOverride(String imagePullCredentialsTypeOverride) {
        this.imagePullCredentialsTypeOverride = imagePullCredentialsTypeOverride;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using a cross-account or private registry image, you must use SERVICE_ROLE credentials. When using an AWS
     * CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     * 
     * @return The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you
     *         modify your ECR repository policy to trust AWS CodeBuild's service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When using a cross-account or private registry image, you must use SERVICE_ROLE credentials. When using
     *         an AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * @see ImagePullCredentialsType
     */

    public String getImagePullCredentialsTypeOverride() {
        return this.imagePullCredentialsTypeOverride;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using a cross-account or private registry image, you must use SERVICE_ROLE credentials. When using an AWS
     * CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     * 
     * @param imagePullCredentialsTypeOverride
     *        The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you
     *        modify your ECR repository policy to trust AWS CodeBuild's service principal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When using a cross-account or private registry image, you must use SERVICE_ROLE credentials. When using an
     *        AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImagePullCredentialsType
     */

    public StartBuildRequest withImagePullCredentialsTypeOverride(String imagePullCredentialsTypeOverride) {
        setImagePullCredentialsTypeOverride(imagePullCredentialsTypeOverride);
        return this;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you modify your
     * ECR repository policy to trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using a cross-account or private registry image, you must use SERVICE_ROLE credentials. When using an AWS
     * CodeBuild curated image, you must use CODEBUILD credentials.
     * </p>
     * 
     * @param imagePullCredentialsTypeOverride
     *        The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own credentials. This requires that you
     *        modify your ECR repository policy to trust AWS CodeBuild's service principal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build project's service role.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When using a cross-account or private registry image, you must use SERVICE_ROLE credentials. When using an
     *        AWS CodeBuild curated image, you must use CODEBUILD credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImagePullCredentialsType
     */

    public StartBuildRequest withImagePullCredentialsTypeOverride(ImagePullCredentialsType imagePullCredentialsTypeOverride) {
        this.imagePullCredentialsTypeOverride = imagePullCredentialsTypeOverride.toString();
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getSecondarySourcesOverride() != null)
            sb.append("SecondarySourcesOverride: ").append(getSecondarySourcesOverride()).append(",");
        if (getSecondarySourcesVersionOverride() != null)
            sb.append("SecondarySourcesVersionOverride: ").append(getSecondarySourcesVersionOverride()).append(",");
        if (getSourceVersion() != null)
            sb.append("SourceVersion: ").append(getSourceVersion()).append(",");
        if (getArtifactsOverride() != null)
            sb.append("ArtifactsOverride: ").append(getArtifactsOverride()).append(",");
        if (getSecondaryArtifactsOverride() != null)
            sb.append("SecondaryArtifactsOverride: ").append(getSecondaryArtifactsOverride()).append(",");
        if (getEnvironmentVariablesOverride() != null)
            sb.append("EnvironmentVariablesOverride: ").append(getEnvironmentVariablesOverride()).append(",");
        if (getSourceTypeOverride() != null)
            sb.append("SourceTypeOverride: ").append(getSourceTypeOverride()).append(",");
        if (getSourceLocationOverride() != null)
            sb.append("SourceLocationOverride: ").append(getSourceLocationOverride()).append(",");
        if (getSourceAuthOverride() != null)
            sb.append("SourceAuthOverride: ").append(getSourceAuthOverride()).append(",");
        if (getGitCloneDepthOverride() != null)
            sb.append("GitCloneDepthOverride: ").append(getGitCloneDepthOverride()).append(",");
        if (getGitSubmodulesConfigOverride() != null)
            sb.append("GitSubmodulesConfigOverride: ").append(getGitSubmodulesConfigOverride()).append(",");
        if (getBuildspecOverride() != null)
            sb.append("BuildspecOverride: ").append(getBuildspecOverride()).append(",");
        if (getInsecureSslOverride() != null)
            sb.append("InsecureSslOverride: ").append(getInsecureSslOverride()).append(",");
        if (getReportBuildStatusOverride() != null)
            sb.append("ReportBuildStatusOverride: ").append(getReportBuildStatusOverride()).append(",");
        if (getEnvironmentTypeOverride() != null)
            sb.append("EnvironmentTypeOverride: ").append(getEnvironmentTypeOverride()).append(",");
        if (getImageOverride() != null)
            sb.append("ImageOverride: ").append(getImageOverride()).append(",");
        if (getComputeTypeOverride() != null)
            sb.append("ComputeTypeOverride: ").append(getComputeTypeOverride()).append(",");
        if (getCertificateOverride() != null)
            sb.append("CertificateOverride: ").append(getCertificateOverride()).append(",");
        if (getCacheOverride() != null)
            sb.append("CacheOverride: ").append(getCacheOverride()).append(",");
        if (getServiceRoleOverride() != null)
            sb.append("ServiceRoleOverride: ").append(getServiceRoleOverride()).append(",");
        if (getPrivilegedModeOverride() != null)
            sb.append("PrivilegedModeOverride: ").append(getPrivilegedModeOverride()).append(",");
        if (getTimeoutInMinutesOverride() != null)
            sb.append("TimeoutInMinutesOverride: ").append(getTimeoutInMinutesOverride()).append(",");
        if (getQueuedTimeoutInMinutesOverride() != null)
            sb.append("QueuedTimeoutInMinutesOverride: ").append(getQueuedTimeoutInMinutesOverride()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken()).append(",");
        if (getLogsConfigOverride() != null)
            sb.append("LogsConfigOverride: ").append(getLogsConfigOverride()).append(",");
        if (getRegistryCredentialOverride() != null)
            sb.append("RegistryCredentialOverride: ").append(getRegistryCredentialOverride()).append(",");
        if (getImagePullCredentialsTypeOverride() != null)
            sb.append("ImagePullCredentialsTypeOverride: ").append(getImagePullCredentialsTypeOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartBuildRequest == false)
            return false;
        StartBuildRequest other = (StartBuildRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getSecondarySourcesOverride() == null ^ this.getSecondarySourcesOverride() == null)
            return false;
        if (other.getSecondarySourcesOverride() != null && other.getSecondarySourcesOverride().equals(this.getSecondarySourcesOverride()) == false)
            return false;
        if (other.getSecondarySourcesVersionOverride() == null ^ this.getSecondarySourcesVersionOverride() == null)
            return false;
        if (other.getSecondarySourcesVersionOverride() != null
                && other.getSecondarySourcesVersionOverride().equals(this.getSecondarySourcesVersionOverride()) == false)
            return false;
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        if (other.getArtifactsOverride() == null ^ this.getArtifactsOverride() == null)
            return false;
        if (other.getArtifactsOverride() != null && other.getArtifactsOverride().equals(this.getArtifactsOverride()) == false)
            return false;
        if (other.getSecondaryArtifactsOverride() == null ^ this.getSecondaryArtifactsOverride() == null)
            return false;
        if (other.getSecondaryArtifactsOverride() != null && other.getSecondaryArtifactsOverride().equals(this.getSecondaryArtifactsOverride()) == false)
            return false;
        if (other.getEnvironmentVariablesOverride() == null ^ this.getEnvironmentVariablesOverride() == null)
            return false;
        if (other.getEnvironmentVariablesOverride() != null && other.getEnvironmentVariablesOverride().equals(this.getEnvironmentVariablesOverride()) == false)
            return false;
        if (other.getSourceTypeOverride() == null ^ this.getSourceTypeOverride() == null)
            return false;
        if (other.getSourceTypeOverride() != null && other.getSourceTypeOverride().equals(this.getSourceTypeOverride()) == false)
            return false;
        if (other.getSourceLocationOverride() == null ^ this.getSourceLocationOverride() == null)
            return false;
        if (other.getSourceLocationOverride() != null && other.getSourceLocationOverride().equals(this.getSourceLocationOverride()) == false)
            return false;
        if (other.getSourceAuthOverride() == null ^ this.getSourceAuthOverride() == null)
            return false;
        if (other.getSourceAuthOverride() != null && other.getSourceAuthOverride().equals(this.getSourceAuthOverride()) == false)
            return false;
        if (other.getGitCloneDepthOverride() == null ^ this.getGitCloneDepthOverride() == null)
            return false;
        if (other.getGitCloneDepthOverride() != null && other.getGitCloneDepthOverride().equals(this.getGitCloneDepthOverride()) == false)
            return false;
        if (other.getGitSubmodulesConfigOverride() == null ^ this.getGitSubmodulesConfigOverride() == null)
            return false;
        if (other.getGitSubmodulesConfigOverride() != null && other.getGitSubmodulesConfigOverride().equals(this.getGitSubmodulesConfigOverride()) == false)
            return false;
        if (other.getBuildspecOverride() == null ^ this.getBuildspecOverride() == null)
            return false;
        if (other.getBuildspecOverride() != null && other.getBuildspecOverride().equals(this.getBuildspecOverride()) == false)
            return false;
        if (other.getInsecureSslOverride() == null ^ this.getInsecureSslOverride() == null)
            return false;
        if (other.getInsecureSslOverride() != null && other.getInsecureSslOverride().equals(this.getInsecureSslOverride()) == false)
            return false;
        if (other.getReportBuildStatusOverride() == null ^ this.getReportBuildStatusOverride() == null)
            return false;
        if (other.getReportBuildStatusOverride() != null && other.getReportBuildStatusOverride().equals(this.getReportBuildStatusOverride()) == false)
            return false;
        if (other.getEnvironmentTypeOverride() == null ^ this.getEnvironmentTypeOverride() == null)
            return false;
        if (other.getEnvironmentTypeOverride() != null && other.getEnvironmentTypeOverride().equals(this.getEnvironmentTypeOverride()) == false)
            return false;
        if (other.getImageOverride() == null ^ this.getImageOverride() == null)
            return false;
        if (other.getImageOverride() != null && other.getImageOverride().equals(this.getImageOverride()) == false)
            return false;
        if (other.getComputeTypeOverride() == null ^ this.getComputeTypeOverride() == null)
            return false;
        if (other.getComputeTypeOverride() != null && other.getComputeTypeOverride().equals(this.getComputeTypeOverride()) == false)
            return false;
        if (other.getCertificateOverride() == null ^ this.getCertificateOverride() == null)
            return false;
        if (other.getCertificateOverride() != null && other.getCertificateOverride().equals(this.getCertificateOverride()) == false)
            return false;
        if (other.getCacheOverride() == null ^ this.getCacheOverride() == null)
            return false;
        if (other.getCacheOverride() != null && other.getCacheOverride().equals(this.getCacheOverride()) == false)
            return false;
        if (other.getServiceRoleOverride() == null ^ this.getServiceRoleOverride() == null)
            return false;
        if (other.getServiceRoleOverride() != null && other.getServiceRoleOverride().equals(this.getServiceRoleOverride()) == false)
            return false;
        if (other.getPrivilegedModeOverride() == null ^ this.getPrivilegedModeOverride() == null)
            return false;
        if (other.getPrivilegedModeOverride() != null && other.getPrivilegedModeOverride().equals(this.getPrivilegedModeOverride()) == false)
            return false;
        if (other.getTimeoutInMinutesOverride() == null ^ this.getTimeoutInMinutesOverride() == null)
            return false;
        if (other.getTimeoutInMinutesOverride() != null && other.getTimeoutInMinutesOverride().equals(this.getTimeoutInMinutesOverride()) == false)
            return false;
        if (other.getQueuedTimeoutInMinutesOverride() == null ^ this.getQueuedTimeoutInMinutesOverride() == null)
            return false;
        if (other.getQueuedTimeoutInMinutesOverride() != null
                && other.getQueuedTimeoutInMinutesOverride().equals(this.getQueuedTimeoutInMinutesOverride()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        if (other.getLogsConfigOverride() == null ^ this.getLogsConfigOverride() == null)
            return false;
        if (other.getLogsConfigOverride() != null && other.getLogsConfigOverride().equals(this.getLogsConfigOverride()) == false)
            return false;
        if (other.getRegistryCredentialOverride() == null ^ this.getRegistryCredentialOverride() == null)
            return false;
        if (other.getRegistryCredentialOverride() != null && other.getRegistryCredentialOverride().equals(this.getRegistryCredentialOverride()) == false)
            return false;
        if (other.getImagePullCredentialsTypeOverride() == null ^ this.getImagePullCredentialsTypeOverride() == null)
            return false;
        if (other.getImagePullCredentialsTypeOverride() != null
                && other.getImagePullCredentialsTypeOverride().equals(this.getImagePullCredentialsTypeOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getSecondarySourcesOverride() == null) ? 0 : getSecondarySourcesOverride().hashCode());
        hashCode = prime * hashCode + ((getSecondarySourcesVersionOverride() == null) ? 0 : getSecondarySourcesVersionOverride().hashCode());
        hashCode = prime * hashCode + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        hashCode = prime * hashCode + ((getArtifactsOverride() == null) ? 0 : getArtifactsOverride().hashCode());
        hashCode = prime * hashCode + ((getSecondaryArtifactsOverride() == null) ? 0 : getSecondaryArtifactsOverride().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariablesOverride() == null) ? 0 : getEnvironmentVariablesOverride().hashCode());
        hashCode = prime * hashCode + ((getSourceTypeOverride() == null) ? 0 : getSourceTypeOverride().hashCode());
        hashCode = prime * hashCode + ((getSourceLocationOverride() == null) ? 0 : getSourceLocationOverride().hashCode());
        hashCode = prime * hashCode + ((getSourceAuthOverride() == null) ? 0 : getSourceAuthOverride().hashCode());
        hashCode = prime * hashCode + ((getGitCloneDepthOverride() == null) ? 0 : getGitCloneDepthOverride().hashCode());
        hashCode = prime * hashCode + ((getGitSubmodulesConfigOverride() == null) ? 0 : getGitSubmodulesConfigOverride().hashCode());
        hashCode = prime * hashCode + ((getBuildspecOverride() == null) ? 0 : getBuildspecOverride().hashCode());
        hashCode = prime * hashCode + ((getInsecureSslOverride() == null) ? 0 : getInsecureSslOverride().hashCode());
        hashCode = prime * hashCode + ((getReportBuildStatusOverride() == null) ? 0 : getReportBuildStatusOverride().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentTypeOverride() == null) ? 0 : getEnvironmentTypeOverride().hashCode());
        hashCode = prime * hashCode + ((getImageOverride() == null) ? 0 : getImageOverride().hashCode());
        hashCode = prime * hashCode + ((getComputeTypeOverride() == null) ? 0 : getComputeTypeOverride().hashCode());
        hashCode = prime * hashCode + ((getCertificateOverride() == null) ? 0 : getCertificateOverride().hashCode());
        hashCode = prime * hashCode + ((getCacheOverride() == null) ? 0 : getCacheOverride().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleOverride() == null) ? 0 : getServiceRoleOverride().hashCode());
        hashCode = prime * hashCode + ((getPrivilegedModeOverride() == null) ? 0 : getPrivilegedModeOverride().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMinutesOverride() == null) ? 0 : getTimeoutInMinutesOverride().hashCode());
        hashCode = prime * hashCode + ((getQueuedTimeoutInMinutesOverride() == null) ? 0 : getQueuedTimeoutInMinutesOverride().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getLogsConfigOverride() == null) ? 0 : getLogsConfigOverride().hashCode());
        hashCode = prime * hashCode + ((getRegistryCredentialOverride() == null) ? 0 : getRegistryCredentialOverride().hashCode());
        hashCode = prime * hashCode + ((getImagePullCredentialsTypeOverride() == null) ? 0 : getImagePullCredentialsTypeOverride().hashCode());
        return hashCode;
    }

    @Override
    public StartBuildRequest clone() {
        return (StartBuildRequest) super.clone();
    }

}

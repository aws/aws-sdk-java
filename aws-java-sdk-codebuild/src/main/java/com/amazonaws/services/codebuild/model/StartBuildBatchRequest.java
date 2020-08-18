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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/StartBuildBatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartBuildBatchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * An array of <code>ProjectSource</code> objects that override the secondary sources defined in the batch build
     * project.
     * </p>
     */
    private java.util.List<ProjectSource> secondarySourcesOverride;
    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects that override the secondary source versions in the batch
     * build project.
     * </p>
     */
    private java.util.List<ProjectSourceVersion> secondarySourcesVersionOverride;
    /**
     * <p>
     * The version of the batch build input to be built, for this build only. If not specified, the latest version is
     * used. If specified, the contents depends on the source provider:
     * </p>
     * <dl>
     * <dt>AWS CodeCommit</dt>
     * <dd>
     * <p>
     * The commit ID, branch, or Git tag to use.
     * </p>
     * </dd>
     * <dt>GitHub</dt>
     * <dd>
     * <p>
     * The commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you
     * want to build. If a pull request ID is specified, it must use the format <code>pr/pull-request-ID</code> (for
     * example <code>pr/25</code>). If a branch name is specified, the branch's HEAD commit ID is used. If not
     * specified, the default branch's HEAD commit ID is used.
     * </p>
     * </dd>
     * <dt>Bitbucket</dt>
     * <dd>
     * <p>
     * The commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If
     * a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD
     * commit ID is used.
     * </p>
     * </dd>
     * <dt>Amazon Simple Storage Service (Amazon S3)</dt>
     * <dd>
     * <p>
     * The version ID of the object that represents the build input ZIP file to use.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * If <code>sourceVersion</code> is specified at the project level, then this <code>sourceVersion</code> (at the
     * build level) takes precedence.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html">Source Version Sample
     * with CodeBuild</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     */
    private String sourceVersion;
    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects that contains information about the build output artifact
     * overrides for the build project.
     * </p>
     */
    private ProjectArtifacts artifactsOverride;
    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects that override the secondary artifacts defined in the batch
     * build project.
     * </p>
     */
    private java.util.List<ProjectArtifacts> secondaryArtifactsOverride;
    /**
     * <p>
     * An array of <code>EnvironmentVariable</code> objects that override, or add to, the environment variables defined
     * in the batch build project.
     * </p>
     */
    private java.util.List<EnvironmentVariable> environmentVariablesOverride;
    /**
     * <p>
     * The source input type that overrides the source input defined in the batch build project.
     * </p>
     */
    private String sourceTypeOverride;
    /**
     * <p>
     * A location that overrides, for this batch build, the source location defined in the batch build project.
     * </p>
     */
    private String sourceLocationOverride;
    /**
     * <p>
     * A <code>SourceAuth</code> object that overrides the one defined in the batch build project. This override applies
     * only if the build project's source is BitBucket or GitHub.
     * </p>
     */
    private SourceAuth sourceAuthOverride;
    /**
     * <p>
     * The user-defined depth of history, with a minimum value of 0, that overrides, for this batch build only, any
     * previous depth of history defined in the batch build project.
     * </p>
     */
    private Integer gitCloneDepthOverride;
    /**
     * <p>
     * A <code>GitSubmodulesConfig</code> object that overrides the Git submodules configuration for this batch build.
     * </p>
     */
    private GitSubmodulesConfig gitSubmodulesConfigOverride;
    /**
     * <p>
     * A buildspec file declaration that overrides, for this build only, the latest one already defined in the build
     * project.
     * </p>
     * <p>
     * If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec file
     * relative to the value of the built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the path to an S3
     * bucket. The bucket must be in the same AWS Region as the build project. Specify the buildspec file using its ARN
     * (for example, <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>). If this value is not provided or is
     * set to an empty string, the source code must contain a buildspec file in its root directory. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     * >Buildspec File Name and Storage Location</a>.
     * </p>
     */
    private String buildspecOverride;
    /**
     * <p>
     * Enable this flag to override the insecure SSL setting that is specified in the batch build project. The insecure
     * SSL setting determines whether to ignore SSL warnings while connecting to the project source code. This override
     * applies only if the build's source is GitHub Enterprise.
     * </p>
     */
    private Boolean insecureSslOverride;
    /**
     * <p>
     * Set to <code>true</code> to report to your source provider the status of a batch build's start and completion. If
     * you use this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an
     * <code>invalidInputException</code> is thrown.
     * </p>
     * <note>
     * <p>
     * The status of a build triggered by a webhook is always reported to your source provider.
     * </p>
     * </note>
     */
    private Boolean reportBuildBatchStatusOverride;
    /**
     * <p>
     * A container type for this batch build that overrides the one specified in the batch build project.
     * </p>
     */
    private String environmentTypeOverride;
    /**
     * <p>
     * The name of an image for this batch build that overrides the one specified in the batch build project.
     * </p>
     */
    private String imageOverride;
    /**
     * <p>
     * The name of a compute type for this batch build that overrides the one specified in the batch build project.
     * </p>
     */
    private String computeTypeOverride;
    /**
     * <p>
     * The name of a certificate for this batch build that overrides the one specified in the batch build project.
     * </p>
     */
    private String certificateOverride;
    /**
     * <p>
     * A <code>ProjectCache</code> object that specifies cache overrides.
     * </p>
     */
    private ProjectCache cacheOverride;
    /**
     * <p>
     * The name of a service role for this batch build that overrides the one specified in the batch build project.
     * </p>
     */
    private String serviceRoleOverride;
    /**
     * <p>
     * Enable this flag to override privileged mode in the batch build project.
     * </p>
     */
    private Boolean privilegedModeOverride;
    /**
     * <p>
     * Overrides the build timeout specified in the batch build project.
     * </p>
     */
    private Integer buildTimeoutInMinutesOverride;
    /**
     * <p>
     * The number of minutes a batch build is allowed to be queued before it times out.
     * </p>
     */
    private Integer queuedTimeoutInMinutesOverride;
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) that overrides the one specified in the batch
     * build project. The CMK key encrypts the build output artifacts.
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
    private String encryptionKeyOverride;
    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency of the <code>StartBuildBatch</code>
     * request. The token is included in the <code>StartBuildBatch</code> request and is valid for five minutes. If you
     * repeat the <code>StartBuildBatch</code> request with the same token, but change a parameter, AWS CodeBuild
     * returns a parameter mismatch error.
     * </p>
     */
    private String idempotencyToken;
    /**
     * <p>
     * A <code>LogsConfig</code> object that override the log settings defined in the batch build project.
     * </p>
     */
    private LogsConfig logsConfigOverride;
    /**
     * <p>
     * A <code>RegistryCredential</code> object that overrides credentials for access to a private registry.
     * </p>
     */
    private RegistryCredential registryCredentialOverride;
    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your batch build. There are two valid values:
     * </p>
     * <dl>
     * <dt>CODEBUILD</dt>
     * <dd>
     * <p>
     * Specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository policy
     * to trust AWS CodeBuild's service principal.
     * </p>
     * </dd>
     * <dt>SERVICE_ROLE</dt>
     * <dd>
     * <p>
     * Specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When using a cross-account or private registry image, you must use <code>SERVICE_ROLE</code> credentials. When
     * using an AWS CodeBuild curated image, you must use <code>CODEBUILD</code> credentials.
     * </p>
     */
    private String imagePullCredentialsTypeOverride;
    /**
     * <p>
     * A <code>BuildBatchConfigOverride</code> object that contains batch build configuration overrides.
     * </p>
     */
    private ProjectBuildBatchConfig buildBatchConfigOverride;

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @param projectName
     *        The name of the project.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @return The name of the project.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @param projectName
     *        The name of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects that override the secondary sources defined in the batch build
     * project.
     * </p>
     * 
     * @return An array of <code>ProjectSource</code> objects that override the secondary sources defined in the batch
     *         build project.
     */

    public java.util.List<ProjectSource> getSecondarySourcesOverride() {
        return secondarySourcesOverride;
    }

    /**
     * <p>
     * An array of <code>ProjectSource</code> objects that override the secondary sources defined in the batch build
     * project.
     * </p>
     * 
     * @param secondarySourcesOverride
     *        An array of <code>ProjectSource</code> objects that override the secondary sources defined in the batch
     *        build project.
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
     * An array of <code>ProjectSource</code> objects that override the secondary sources defined in the batch build
     * project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondarySourcesOverride(java.util.Collection)} or
     * {@link #withSecondarySourcesOverride(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param secondarySourcesOverride
     *        An array of <code>ProjectSource</code> objects that override the secondary sources defined in the batch
     *        build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withSecondarySourcesOverride(ProjectSource... secondarySourcesOverride) {
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
     * An array of <code>ProjectSource</code> objects that override the secondary sources defined in the batch build
     * project.
     * </p>
     * 
     * @param secondarySourcesOverride
     *        An array of <code>ProjectSource</code> objects that override the secondary sources defined in the batch
     *        build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withSecondarySourcesOverride(java.util.Collection<ProjectSource> secondarySourcesOverride) {
        setSecondarySourcesOverride(secondarySourcesOverride);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects that override the secondary source versions in the batch
     * build project.
     * </p>
     * 
     * @return An array of <code>ProjectSourceVersion</code> objects that override the secondary source versions in the
     *         batch build project.
     */

    public java.util.List<ProjectSourceVersion> getSecondarySourcesVersionOverride() {
        return secondarySourcesVersionOverride;
    }

    /**
     * <p>
     * An array of <code>ProjectSourceVersion</code> objects that override the secondary source versions in the batch
     * build project.
     * </p>
     * 
     * @param secondarySourcesVersionOverride
     *        An array of <code>ProjectSourceVersion</code> objects that override the secondary source versions in the
     *        batch build project.
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
     * An array of <code>ProjectSourceVersion</code> objects that override the secondary source versions in the batch
     * build project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondarySourcesVersionOverride(java.util.Collection)} or
     * {@link #withSecondarySourcesVersionOverride(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param secondarySourcesVersionOverride
     *        An array of <code>ProjectSourceVersion</code> objects that override the secondary source versions in the
     *        batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withSecondarySourcesVersionOverride(ProjectSourceVersion... secondarySourcesVersionOverride) {
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
     * An array of <code>ProjectSourceVersion</code> objects that override the secondary source versions in the batch
     * build project.
     * </p>
     * 
     * @param secondarySourcesVersionOverride
     *        An array of <code>ProjectSourceVersion</code> objects that override the secondary source versions in the
     *        batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withSecondarySourcesVersionOverride(java.util.Collection<ProjectSourceVersion> secondarySourcesVersionOverride) {
        setSecondarySourcesVersionOverride(secondarySourcesVersionOverride);
        return this;
    }

    /**
     * <p>
     * The version of the batch build input to be built, for this build only. If not specified, the latest version is
     * used. If specified, the contents depends on the source provider:
     * </p>
     * <dl>
     * <dt>AWS CodeCommit</dt>
     * <dd>
     * <p>
     * The commit ID, branch, or Git tag to use.
     * </p>
     * </dd>
     * <dt>GitHub</dt>
     * <dd>
     * <p>
     * The commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you
     * want to build. If a pull request ID is specified, it must use the format <code>pr/pull-request-ID</code> (for
     * example <code>pr/25</code>). If a branch name is specified, the branch's HEAD commit ID is used. If not
     * specified, the default branch's HEAD commit ID is used.
     * </p>
     * </dd>
     * <dt>Bitbucket</dt>
     * <dd>
     * <p>
     * The commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If
     * a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD
     * commit ID is used.
     * </p>
     * </dd>
     * <dt>Amazon Simple Storage Service (Amazon S3)</dt>
     * <dd>
     * <p>
     * The version ID of the object that represents the build input ZIP file to use.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * If <code>sourceVersion</code> is specified at the project level, then this <code>sourceVersion</code> (at the
     * build level) takes precedence.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html">Source Version Sample
     * with CodeBuild</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * 
     * @param sourceVersion
     *        The version of the batch build input to be built, for this build only. If not specified, the latest
     *        version is used. If specified, the contents depends on the source provider:</p>
     *        <dl>
     *        <dt>AWS CodeCommit</dt>
     *        <dd>
     *        <p>
     *        The commit ID, branch, or Git tag to use.
     *        </p>
     *        </dd>
     *        <dt>GitHub</dt>
     *        <dd>
     *        <p>
     *        The commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source
     *        code you want to build. If a pull request ID is specified, it must use the format
     *        <code>pr/pull-request-ID</code> (for example <code>pr/25</code>). If a branch name is specified, the
     *        branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
     *        </p>
     *        </dd>
     *        <dt>Bitbucket</dt>
     *        <dd>
     *        <p>
     *        The commit ID, branch name, or tag name that corresponds to the version of the source code you want to
     *        build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default
     *        branch's HEAD commit ID is used.
     *        </p>
     *        </dd>
     *        <dt>Amazon Simple Storage Service (Amazon S3)</dt>
     *        <dd>
     *        <p>
     *        The version ID of the object that represents the build input ZIP file to use.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        If <code>sourceVersion</code> is specified at the project level, then this <code>sourceVersion</code> (at
     *        the build level) takes precedence.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html">Source Version
     *        Sample with CodeBuild</a> in the <i>AWS CodeBuild User Guide</i>.
     */

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * The version of the batch build input to be built, for this build only. If not specified, the latest version is
     * used. If specified, the contents depends on the source provider:
     * </p>
     * <dl>
     * <dt>AWS CodeCommit</dt>
     * <dd>
     * <p>
     * The commit ID, branch, or Git tag to use.
     * </p>
     * </dd>
     * <dt>GitHub</dt>
     * <dd>
     * <p>
     * The commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you
     * want to build. If a pull request ID is specified, it must use the format <code>pr/pull-request-ID</code> (for
     * example <code>pr/25</code>). If a branch name is specified, the branch's HEAD commit ID is used. If not
     * specified, the default branch's HEAD commit ID is used.
     * </p>
     * </dd>
     * <dt>Bitbucket</dt>
     * <dd>
     * <p>
     * The commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If
     * a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD
     * commit ID is used.
     * </p>
     * </dd>
     * <dt>Amazon Simple Storage Service (Amazon S3)</dt>
     * <dd>
     * <p>
     * The version ID of the object that represents the build input ZIP file to use.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * If <code>sourceVersion</code> is specified at the project level, then this <code>sourceVersion</code> (at the
     * build level) takes precedence.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html">Source Version Sample
     * with CodeBuild</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * 
     * @return The version of the batch build input to be built, for this build only. If not specified, the latest
     *         version is used. If specified, the contents depends on the source provider:</p>
     *         <dl>
     *         <dt>AWS CodeCommit</dt>
     *         <dd>
     *         <p>
     *         The commit ID, branch, or Git tag to use.
     *         </p>
     *         </dd>
     *         <dt>GitHub</dt>
     *         <dd>
     *         <p>
     *         The commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source
     *         code you want to build. If a pull request ID is specified, it must use the format
     *         <code>pr/pull-request-ID</code> (for example <code>pr/25</code>). If a branch name is specified, the
     *         branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
     *         </p>
     *         </dd>
     *         <dt>Bitbucket</dt>
     *         <dd>
     *         <p>
     *         The commit ID, branch name, or tag name that corresponds to the version of the source code you want to
     *         build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default
     *         branch's HEAD commit ID is used.
     *         </p>
     *         </dd>
     *         <dt>Amazon Simple Storage Service (Amazon S3)</dt>
     *         <dd>
     *         <p>
     *         The version ID of the object that represents the build input ZIP file to use.
     *         </p>
     *         </dd>
     *         </dl>
     *         <p>
     *         If <code>sourceVersion</code> is specified at the project level, then this <code>sourceVersion</code> (at
     *         the build level) takes precedence.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html">Source Version
     *         Sample with CodeBuild</a> in the <i>AWS CodeBuild User Guide</i>.
     */

    public String getSourceVersion() {
        return this.sourceVersion;
    }

    /**
     * <p>
     * The version of the batch build input to be built, for this build only. If not specified, the latest version is
     * used. If specified, the contents depends on the source provider:
     * </p>
     * <dl>
     * <dt>AWS CodeCommit</dt>
     * <dd>
     * <p>
     * The commit ID, branch, or Git tag to use.
     * </p>
     * </dd>
     * <dt>GitHub</dt>
     * <dd>
     * <p>
     * The commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you
     * want to build. If a pull request ID is specified, it must use the format <code>pr/pull-request-ID</code> (for
     * example <code>pr/25</code>). If a branch name is specified, the branch's HEAD commit ID is used. If not
     * specified, the default branch's HEAD commit ID is used.
     * </p>
     * </dd>
     * <dt>Bitbucket</dt>
     * <dd>
     * <p>
     * The commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If
     * a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD
     * commit ID is used.
     * </p>
     * </dd>
     * <dt>Amazon Simple Storage Service (Amazon S3)</dt>
     * <dd>
     * <p>
     * The version ID of the object that represents the build input ZIP file to use.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * If <code>sourceVersion</code> is specified at the project level, then this <code>sourceVersion</code> (at the
     * build level) takes precedence.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html">Source Version Sample
     * with CodeBuild</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * 
     * @param sourceVersion
     *        The version of the batch build input to be built, for this build only. If not specified, the latest
     *        version is used. If specified, the contents depends on the source provider:</p>
     *        <dl>
     *        <dt>AWS CodeCommit</dt>
     *        <dd>
     *        <p>
     *        The commit ID, branch, or Git tag to use.
     *        </p>
     *        </dd>
     *        <dt>GitHub</dt>
     *        <dd>
     *        <p>
     *        The commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source
     *        code you want to build. If a pull request ID is specified, it must use the format
     *        <code>pr/pull-request-ID</code> (for example <code>pr/25</code>). If a branch name is specified, the
     *        branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
     *        </p>
     *        </dd>
     *        <dt>Bitbucket</dt>
     *        <dd>
     *        <p>
     *        The commit ID, branch name, or tag name that corresponds to the version of the source code you want to
     *        build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default
     *        branch's HEAD commit ID is used.
     *        </p>
     *        </dd>
     *        <dt>Amazon Simple Storage Service (Amazon S3)</dt>
     *        <dd>
     *        <p>
     *        The version ID of the object that represents the build input ZIP file to use.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        If <code>sourceVersion</code> is specified at the project level, then this <code>sourceVersion</code> (at
     *        the build level) takes precedence.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html">Source Version
     *        Sample with CodeBuild</a> in the <i>AWS CodeBuild User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withSourceVersion(String sourceVersion) {
        setSourceVersion(sourceVersion);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects that contains information about the build output artifact
     * overrides for the build project.
     * </p>
     * 
     * @param artifactsOverride
     *        An array of <code>ProjectArtifacts</code> objects that contains information about the build output
     *        artifact overrides for the build project.
     */

    public void setArtifactsOverride(ProjectArtifacts artifactsOverride) {
        this.artifactsOverride = artifactsOverride;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects that contains information about the build output artifact
     * overrides for the build project.
     * </p>
     * 
     * @return An array of <code>ProjectArtifacts</code> objects that contains information about the build output
     *         artifact overrides for the build project.
     */

    public ProjectArtifacts getArtifactsOverride() {
        return this.artifactsOverride;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects that contains information about the build output artifact
     * overrides for the build project.
     * </p>
     * 
     * @param artifactsOverride
     *        An array of <code>ProjectArtifacts</code> objects that contains information about the build output
     *        artifact overrides for the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withArtifactsOverride(ProjectArtifacts artifactsOverride) {
        setArtifactsOverride(artifactsOverride);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects that override the secondary artifacts defined in the batch
     * build project.
     * </p>
     * 
     * @return An array of <code>ProjectArtifacts</code> objects that override the secondary artifacts defined in the
     *         batch build project.
     */

    public java.util.List<ProjectArtifacts> getSecondaryArtifactsOverride() {
        return secondaryArtifactsOverride;
    }

    /**
     * <p>
     * An array of <code>ProjectArtifacts</code> objects that override the secondary artifacts defined in the batch
     * build project.
     * </p>
     * 
     * @param secondaryArtifactsOverride
     *        An array of <code>ProjectArtifacts</code> objects that override the secondary artifacts defined in the
     *        batch build project.
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
     * An array of <code>ProjectArtifacts</code> objects that override the secondary artifacts defined in the batch
     * build project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondaryArtifactsOverride(java.util.Collection)} or
     * {@link #withSecondaryArtifactsOverride(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param secondaryArtifactsOverride
     *        An array of <code>ProjectArtifacts</code> objects that override the secondary artifacts defined in the
     *        batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withSecondaryArtifactsOverride(ProjectArtifacts... secondaryArtifactsOverride) {
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
     * An array of <code>ProjectArtifacts</code> objects that override the secondary artifacts defined in the batch
     * build project.
     * </p>
     * 
     * @param secondaryArtifactsOverride
     *        An array of <code>ProjectArtifacts</code> objects that override the secondary artifacts defined in the
     *        batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withSecondaryArtifactsOverride(java.util.Collection<ProjectArtifacts> secondaryArtifactsOverride) {
        setSecondaryArtifactsOverride(secondaryArtifactsOverride);
        return this;
    }

    /**
     * <p>
     * An array of <code>EnvironmentVariable</code> objects that override, or add to, the environment variables defined
     * in the batch build project.
     * </p>
     * 
     * @return An array of <code>EnvironmentVariable</code> objects that override, or add to, the environment variables
     *         defined in the batch build project.
     */

    public java.util.List<EnvironmentVariable> getEnvironmentVariablesOverride() {
        return environmentVariablesOverride;
    }

    /**
     * <p>
     * An array of <code>EnvironmentVariable</code> objects that override, or add to, the environment variables defined
     * in the batch build project.
     * </p>
     * 
     * @param environmentVariablesOverride
     *        An array of <code>EnvironmentVariable</code> objects that override, or add to, the environment variables
     *        defined in the batch build project.
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
     * An array of <code>EnvironmentVariable</code> objects that override, or add to, the environment variables defined
     * in the batch build project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentVariablesOverride(java.util.Collection)} or
     * {@link #withEnvironmentVariablesOverride(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param environmentVariablesOverride
     *        An array of <code>EnvironmentVariable</code> objects that override, or add to, the environment variables
     *        defined in the batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withEnvironmentVariablesOverride(EnvironmentVariable... environmentVariablesOverride) {
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
     * An array of <code>EnvironmentVariable</code> objects that override, or add to, the environment variables defined
     * in the batch build project.
     * </p>
     * 
     * @param environmentVariablesOverride
     *        An array of <code>EnvironmentVariable</code> objects that override, or add to, the environment variables
     *        defined in the batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withEnvironmentVariablesOverride(java.util.Collection<EnvironmentVariable> environmentVariablesOverride) {
        setEnvironmentVariablesOverride(environmentVariablesOverride);
        return this;
    }

    /**
     * <p>
     * The source input type that overrides the source input defined in the batch build project.
     * </p>
     * 
     * @param sourceTypeOverride
     *        The source input type that overrides the source input defined in the batch build project.
     * @see SourceType
     */

    public void setSourceTypeOverride(String sourceTypeOverride) {
        this.sourceTypeOverride = sourceTypeOverride;
    }

    /**
     * <p>
     * The source input type that overrides the source input defined in the batch build project.
     * </p>
     * 
     * @return The source input type that overrides the source input defined in the batch build project.
     * @see SourceType
     */

    public String getSourceTypeOverride() {
        return this.sourceTypeOverride;
    }

    /**
     * <p>
     * The source input type that overrides the source input defined in the batch build project.
     * </p>
     * 
     * @param sourceTypeOverride
     *        The source input type that overrides the source input defined in the batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public StartBuildBatchRequest withSourceTypeOverride(String sourceTypeOverride) {
        setSourceTypeOverride(sourceTypeOverride);
        return this;
    }

    /**
     * <p>
     * The source input type that overrides the source input defined in the batch build project.
     * </p>
     * 
     * @param sourceTypeOverride
     *        The source input type that overrides the source input defined in the batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public StartBuildBatchRequest withSourceTypeOverride(SourceType sourceTypeOverride) {
        this.sourceTypeOverride = sourceTypeOverride.toString();
        return this;
    }

    /**
     * <p>
     * A location that overrides, for this batch build, the source location defined in the batch build project.
     * </p>
     * 
     * @param sourceLocationOverride
     *        A location that overrides, for this batch build, the source location defined in the batch build project.
     */

    public void setSourceLocationOverride(String sourceLocationOverride) {
        this.sourceLocationOverride = sourceLocationOverride;
    }

    /**
     * <p>
     * A location that overrides, for this batch build, the source location defined in the batch build project.
     * </p>
     * 
     * @return A location that overrides, for this batch build, the source location defined in the batch build project.
     */

    public String getSourceLocationOverride() {
        return this.sourceLocationOverride;
    }

    /**
     * <p>
     * A location that overrides, for this batch build, the source location defined in the batch build project.
     * </p>
     * 
     * @param sourceLocationOverride
     *        A location that overrides, for this batch build, the source location defined in the batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withSourceLocationOverride(String sourceLocationOverride) {
        setSourceLocationOverride(sourceLocationOverride);
        return this;
    }

    /**
     * <p>
     * A <code>SourceAuth</code> object that overrides the one defined in the batch build project. This override applies
     * only if the build project's source is BitBucket or GitHub.
     * </p>
     * 
     * @param sourceAuthOverride
     *        A <code>SourceAuth</code> object that overrides the one defined in the batch build project. This override
     *        applies only if the build project's source is BitBucket or GitHub.
     */

    public void setSourceAuthOverride(SourceAuth sourceAuthOverride) {
        this.sourceAuthOverride = sourceAuthOverride;
    }

    /**
     * <p>
     * A <code>SourceAuth</code> object that overrides the one defined in the batch build project. This override applies
     * only if the build project's source is BitBucket or GitHub.
     * </p>
     * 
     * @return A <code>SourceAuth</code> object that overrides the one defined in the batch build project. This override
     *         applies only if the build project's source is BitBucket or GitHub.
     */

    public SourceAuth getSourceAuthOverride() {
        return this.sourceAuthOverride;
    }

    /**
     * <p>
     * A <code>SourceAuth</code> object that overrides the one defined in the batch build project. This override applies
     * only if the build project's source is BitBucket or GitHub.
     * </p>
     * 
     * @param sourceAuthOverride
     *        A <code>SourceAuth</code> object that overrides the one defined in the batch build project. This override
     *        applies only if the build project's source is BitBucket or GitHub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withSourceAuthOverride(SourceAuth sourceAuthOverride) {
        setSourceAuthOverride(sourceAuthOverride);
        return this;
    }

    /**
     * <p>
     * The user-defined depth of history, with a minimum value of 0, that overrides, for this batch build only, any
     * previous depth of history defined in the batch build project.
     * </p>
     * 
     * @param gitCloneDepthOverride
     *        The user-defined depth of history, with a minimum value of 0, that overrides, for this batch build only,
     *        any previous depth of history defined in the batch build project.
     */

    public void setGitCloneDepthOverride(Integer gitCloneDepthOverride) {
        this.gitCloneDepthOverride = gitCloneDepthOverride;
    }

    /**
     * <p>
     * The user-defined depth of history, with a minimum value of 0, that overrides, for this batch build only, any
     * previous depth of history defined in the batch build project.
     * </p>
     * 
     * @return The user-defined depth of history, with a minimum value of 0, that overrides, for this batch build only,
     *         any previous depth of history defined in the batch build project.
     */

    public Integer getGitCloneDepthOverride() {
        return this.gitCloneDepthOverride;
    }

    /**
     * <p>
     * The user-defined depth of history, with a minimum value of 0, that overrides, for this batch build only, any
     * previous depth of history defined in the batch build project.
     * </p>
     * 
     * @param gitCloneDepthOverride
     *        The user-defined depth of history, with a minimum value of 0, that overrides, for this batch build only,
     *        any previous depth of history defined in the batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withGitCloneDepthOverride(Integer gitCloneDepthOverride) {
        setGitCloneDepthOverride(gitCloneDepthOverride);
        return this;
    }

    /**
     * <p>
     * A <code>GitSubmodulesConfig</code> object that overrides the Git submodules configuration for this batch build.
     * </p>
     * 
     * @param gitSubmodulesConfigOverride
     *        A <code>GitSubmodulesConfig</code> object that overrides the Git submodules configuration for this batch
     *        build.
     */

    public void setGitSubmodulesConfigOverride(GitSubmodulesConfig gitSubmodulesConfigOverride) {
        this.gitSubmodulesConfigOverride = gitSubmodulesConfigOverride;
    }

    /**
     * <p>
     * A <code>GitSubmodulesConfig</code> object that overrides the Git submodules configuration for this batch build.
     * </p>
     * 
     * @return A <code>GitSubmodulesConfig</code> object that overrides the Git submodules configuration for this batch
     *         build.
     */

    public GitSubmodulesConfig getGitSubmodulesConfigOverride() {
        return this.gitSubmodulesConfigOverride;
    }

    /**
     * <p>
     * A <code>GitSubmodulesConfig</code> object that overrides the Git submodules configuration for this batch build.
     * </p>
     * 
     * @param gitSubmodulesConfigOverride
     *        A <code>GitSubmodulesConfig</code> object that overrides the Git submodules configuration for this batch
     *        build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withGitSubmodulesConfigOverride(GitSubmodulesConfig gitSubmodulesConfigOverride) {
        setGitSubmodulesConfigOverride(gitSubmodulesConfigOverride);
        return this;
    }

    /**
     * <p>
     * A buildspec file declaration that overrides, for this build only, the latest one already defined in the build
     * project.
     * </p>
     * <p>
     * If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec file
     * relative to the value of the built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the path to an S3
     * bucket. The bucket must be in the same AWS Region as the build project. Specify the buildspec file using its ARN
     * (for example, <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>). If this value is not provided or is
     * set to an empty string, the source code must contain a buildspec file in its root directory. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     * >Buildspec File Name and Storage Location</a>.
     * </p>
     * 
     * @param buildspecOverride
     *        A buildspec file declaration that overrides, for this build only, the latest one already defined in the
     *        build project.</p>
     *        <p>
     *        If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec
     *        file relative to the value of the built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the
     *        path to an S3 bucket. The bucket must be in the same AWS Region as the build project. Specify the
     *        buildspec file using its ARN (for example, <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>).
     *        If this value is not provided or is set to an empty string, the source code must contain a buildspec file
     *        in its root directory. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     *        >Buildspec File Name and Storage Location</a>.
     */

    public void setBuildspecOverride(String buildspecOverride) {
        this.buildspecOverride = buildspecOverride;
    }

    /**
     * <p>
     * A buildspec file declaration that overrides, for this build only, the latest one already defined in the build
     * project.
     * </p>
     * <p>
     * If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec file
     * relative to the value of the built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the path to an S3
     * bucket. The bucket must be in the same AWS Region as the build project. Specify the buildspec file using its ARN
     * (for example, <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>). If this value is not provided or is
     * set to an empty string, the source code must contain a buildspec file in its root directory. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     * >Buildspec File Name and Storage Location</a>.
     * </p>
     * 
     * @return A buildspec file declaration that overrides, for this build only, the latest one already defined in the
     *         build project.</p>
     *         <p>
     *         If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec
     *         file relative to the value of the built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the
     *         path to an S3 bucket. The bucket must be in the same AWS Region as the build project. Specify the
     *         buildspec file using its ARN (for example, <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>).
     *         If this value is not provided or is set to an empty string, the source code must contain a buildspec file
     *         in its root directory. For more information, see <a href=
     *         "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     *         >Buildspec File Name and Storage Location</a>.
     */

    public String getBuildspecOverride() {
        return this.buildspecOverride;
    }

    /**
     * <p>
     * A buildspec file declaration that overrides, for this build only, the latest one already defined in the build
     * project.
     * </p>
     * <p>
     * If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec file
     * relative to the value of the built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the path to an S3
     * bucket. The bucket must be in the same AWS Region as the build project. Specify the buildspec file using its ARN
     * (for example, <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>). If this value is not provided or is
     * set to an empty string, the source code must contain a buildspec file in its root directory. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     * >Buildspec File Name and Storage Location</a>.
     * </p>
     * 
     * @param buildspecOverride
     *        A buildspec file declaration that overrides, for this build only, the latest one already defined in the
     *        build project.</p>
     *        <p>
     *        If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec
     *        file relative to the value of the built-in <code>CODEBUILD_SRC_DIR</code> environment variable, or the
     *        path to an S3 bucket. The bucket must be in the same AWS Region as the build project. Specify the
     *        buildspec file using its ARN (for example, <code>arn:aws:s3:::my-codebuild-sample2/buildspec.yml</code>).
     *        If this value is not provided or is set to an empty string, the source code must contain a buildspec file
     *        in its root directory. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-name-storage"
     *        >Buildspec File Name and Storage Location</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withBuildspecOverride(String buildspecOverride) {
        setBuildspecOverride(buildspecOverride);
        return this;
    }

    /**
     * <p>
     * Enable this flag to override the insecure SSL setting that is specified in the batch build project. The insecure
     * SSL setting determines whether to ignore SSL warnings while connecting to the project source code. This override
     * applies only if the build's source is GitHub Enterprise.
     * </p>
     * 
     * @param insecureSslOverride
     *        Enable this flag to override the insecure SSL setting that is specified in the batch build project. The
     *        insecure SSL setting determines whether to ignore SSL warnings while connecting to the project source
     *        code. This override applies only if the build's source is GitHub Enterprise.
     */

    public void setInsecureSslOverride(Boolean insecureSslOverride) {
        this.insecureSslOverride = insecureSslOverride;
    }

    /**
     * <p>
     * Enable this flag to override the insecure SSL setting that is specified in the batch build project. The insecure
     * SSL setting determines whether to ignore SSL warnings while connecting to the project source code. This override
     * applies only if the build's source is GitHub Enterprise.
     * </p>
     * 
     * @return Enable this flag to override the insecure SSL setting that is specified in the batch build project. The
     *         insecure SSL setting determines whether to ignore SSL warnings while connecting to the project source
     *         code. This override applies only if the build's source is GitHub Enterprise.
     */

    public Boolean getInsecureSslOverride() {
        return this.insecureSslOverride;
    }

    /**
     * <p>
     * Enable this flag to override the insecure SSL setting that is specified in the batch build project. The insecure
     * SSL setting determines whether to ignore SSL warnings while connecting to the project source code. This override
     * applies only if the build's source is GitHub Enterprise.
     * </p>
     * 
     * @param insecureSslOverride
     *        Enable this flag to override the insecure SSL setting that is specified in the batch build project. The
     *        insecure SSL setting determines whether to ignore SSL warnings while connecting to the project source
     *        code. This override applies only if the build's source is GitHub Enterprise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withInsecureSslOverride(Boolean insecureSslOverride) {
        setInsecureSslOverride(insecureSslOverride);
        return this;
    }

    /**
     * <p>
     * Enable this flag to override the insecure SSL setting that is specified in the batch build project. The insecure
     * SSL setting determines whether to ignore SSL warnings while connecting to the project source code. This override
     * applies only if the build's source is GitHub Enterprise.
     * </p>
     * 
     * @return Enable this flag to override the insecure SSL setting that is specified in the batch build project. The
     *         insecure SSL setting determines whether to ignore SSL warnings while connecting to the project source
     *         code. This override applies only if the build's source is GitHub Enterprise.
     */

    public Boolean isInsecureSslOverride() {
        return this.insecureSslOverride;
    }

    /**
     * <p>
     * Set to <code>true</code> to report to your source provider the status of a batch build's start and completion. If
     * you use this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an
     * <code>invalidInputException</code> is thrown.
     * </p>
     * <note>
     * <p>
     * The status of a build triggered by a webhook is always reported to your source provider.
     * </p>
     * </note>
     * 
     * @param reportBuildBatchStatusOverride
     *        Set to <code>true</code> to report to your source provider the status of a batch build's start and
     *        completion. If you use this option with a source provider other than GitHub, GitHub Enterprise, or
     *        Bitbucket, an <code>invalidInputException</code> is thrown. </p> <note>
     *        <p>
     *        The status of a build triggered by a webhook is always reported to your source provider.
     *        </p>
     */

    public void setReportBuildBatchStatusOverride(Boolean reportBuildBatchStatusOverride) {
        this.reportBuildBatchStatusOverride = reportBuildBatchStatusOverride;
    }

    /**
     * <p>
     * Set to <code>true</code> to report to your source provider the status of a batch build's start and completion. If
     * you use this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an
     * <code>invalidInputException</code> is thrown.
     * </p>
     * <note>
     * <p>
     * The status of a build triggered by a webhook is always reported to your source provider.
     * </p>
     * </note>
     * 
     * @return Set to <code>true</code> to report to your source provider the status of a batch build's start and
     *         completion. If you use this option with a source provider other than GitHub, GitHub Enterprise, or
     *         Bitbucket, an <code>invalidInputException</code> is thrown. </p> <note>
     *         <p>
     *         The status of a build triggered by a webhook is always reported to your source provider.
     *         </p>
     */

    public Boolean getReportBuildBatchStatusOverride() {
        return this.reportBuildBatchStatusOverride;
    }

    /**
     * <p>
     * Set to <code>true</code> to report to your source provider the status of a batch build's start and completion. If
     * you use this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an
     * <code>invalidInputException</code> is thrown.
     * </p>
     * <note>
     * <p>
     * The status of a build triggered by a webhook is always reported to your source provider.
     * </p>
     * </note>
     * 
     * @param reportBuildBatchStatusOverride
     *        Set to <code>true</code> to report to your source provider the status of a batch build's start and
     *        completion. If you use this option with a source provider other than GitHub, GitHub Enterprise, or
     *        Bitbucket, an <code>invalidInputException</code> is thrown. </p> <note>
     *        <p>
     *        The status of a build triggered by a webhook is always reported to your source provider.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withReportBuildBatchStatusOverride(Boolean reportBuildBatchStatusOverride) {
        setReportBuildBatchStatusOverride(reportBuildBatchStatusOverride);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to report to your source provider the status of a batch build's start and completion. If
     * you use this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an
     * <code>invalidInputException</code> is thrown.
     * </p>
     * <note>
     * <p>
     * The status of a build triggered by a webhook is always reported to your source provider.
     * </p>
     * </note>
     * 
     * @return Set to <code>true</code> to report to your source provider the status of a batch build's start and
     *         completion. If you use this option with a source provider other than GitHub, GitHub Enterprise, or
     *         Bitbucket, an <code>invalidInputException</code> is thrown. </p> <note>
     *         <p>
     *         The status of a build triggered by a webhook is always reported to your source provider.
     *         </p>
     */

    public Boolean isReportBuildBatchStatusOverride() {
        return this.reportBuildBatchStatusOverride;
    }

    /**
     * <p>
     * A container type for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @param environmentTypeOverride
     *        A container type for this batch build that overrides the one specified in the batch build project.
     * @see EnvironmentType
     */

    public void setEnvironmentTypeOverride(String environmentTypeOverride) {
        this.environmentTypeOverride = environmentTypeOverride;
    }

    /**
     * <p>
     * A container type for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @return A container type for this batch build that overrides the one specified in the batch build project.
     * @see EnvironmentType
     */

    public String getEnvironmentTypeOverride() {
        return this.environmentTypeOverride;
    }

    /**
     * <p>
     * A container type for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @param environmentTypeOverride
     *        A container type for this batch build that overrides the one specified in the batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentType
     */

    public StartBuildBatchRequest withEnvironmentTypeOverride(String environmentTypeOverride) {
        setEnvironmentTypeOverride(environmentTypeOverride);
        return this;
    }

    /**
     * <p>
     * A container type for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @param environmentTypeOverride
     *        A container type for this batch build that overrides the one specified in the batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentType
     */

    public StartBuildBatchRequest withEnvironmentTypeOverride(EnvironmentType environmentTypeOverride) {
        this.environmentTypeOverride = environmentTypeOverride.toString();
        return this;
    }

    /**
     * <p>
     * The name of an image for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @param imageOverride
     *        The name of an image for this batch build that overrides the one specified in the batch build project.
     */

    public void setImageOverride(String imageOverride) {
        this.imageOverride = imageOverride;
    }

    /**
     * <p>
     * The name of an image for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @return The name of an image for this batch build that overrides the one specified in the batch build project.
     */

    public String getImageOverride() {
        return this.imageOverride;
    }

    /**
     * <p>
     * The name of an image for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @param imageOverride
     *        The name of an image for this batch build that overrides the one specified in the batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withImageOverride(String imageOverride) {
        setImageOverride(imageOverride);
        return this;
    }

    /**
     * <p>
     * The name of a compute type for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @param computeTypeOverride
     *        The name of a compute type for this batch build that overrides the one specified in the batch build
     *        project.
     * @see ComputeType
     */

    public void setComputeTypeOverride(String computeTypeOverride) {
        this.computeTypeOverride = computeTypeOverride;
    }

    /**
     * <p>
     * The name of a compute type for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @return The name of a compute type for this batch build that overrides the one specified in the batch build
     *         project.
     * @see ComputeType
     */

    public String getComputeTypeOverride() {
        return this.computeTypeOverride;
    }

    /**
     * <p>
     * The name of a compute type for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @param computeTypeOverride
     *        The name of a compute type for this batch build that overrides the one specified in the batch build
     *        project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public StartBuildBatchRequest withComputeTypeOverride(String computeTypeOverride) {
        setComputeTypeOverride(computeTypeOverride);
        return this;
    }

    /**
     * <p>
     * The name of a compute type for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @param computeTypeOverride
     *        The name of a compute type for this batch build that overrides the one specified in the batch build
     *        project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public StartBuildBatchRequest withComputeTypeOverride(ComputeType computeTypeOverride) {
        this.computeTypeOverride = computeTypeOverride.toString();
        return this;
    }

    /**
     * <p>
     * The name of a certificate for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @param certificateOverride
     *        The name of a certificate for this batch build that overrides the one specified in the batch build
     *        project.
     */

    public void setCertificateOverride(String certificateOverride) {
        this.certificateOverride = certificateOverride;
    }

    /**
     * <p>
     * The name of a certificate for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @return The name of a certificate for this batch build that overrides the one specified in the batch build
     *         project.
     */

    public String getCertificateOverride() {
        return this.certificateOverride;
    }

    /**
     * <p>
     * The name of a certificate for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @param certificateOverride
     *        The name of a certificate for this batch build that overrides the one specified in the batch build
     *        project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withCertificateOverride(String certificateOverride) {
        setCertificateOverride(certificateOverride);
        return this;
    }

    /**
     * <p>
     * A <code>ProjectCache</code> object that specifies cache overrides.
     * </p>
     * 
     * @param cacheOverride
     *        A <code>ProjectCache</code> object that specifies cache overrides.
     */

    public void setCacheOverride(ProjectCache cacheOverride) {
        this.cacheOverride = cacheOverride;
    }

    /**
     * <p>
     * A <code>ProjectCache</code> object that specifies cache overrides.
     * </p>
     * 
     * @return A <code>ProjectCache</code> object that specifies cache overrides.
     */

    public ProjectCache getCacheOverride() {
        return this.cacheOverride;
    }

    /**
     * <p>
     * A <code>ProjectCache</code> object that specifies cache overrides.
     * </p>
     * 
     * @param cacheOverride
     *        A <code>ProjectCache</code> object that specifies cache overrides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withCacheOverride(ProjectCache cacheOverride) {
        setCacheOverride(cacheOverride);
        return this;
    }

    /**
     * <p>
     * The name of a service role for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @param serviceRoleOverride
     *        The name of a service role for this batch build that overrides the one specified in the batch build
     *        project.
     */

    public void setServiceRoleOverride(String serviceRoleOverride) {
        this.serviceRoleOverride = serviceRoleOverride;
    }

    /**
     * <p>
     * The name of a service role for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @return The name of a service role for this batch build that overrides the one specified in the batch build
     *         project.
     */

    public String getServiceRoleOverride() {
        return this.serviceRoleOverride;
    }

    /**
     * <p>
     * The name of a service role for this batch build that overrides the one specified in the batch build project.
     * </p>
     * 
     * @param serviceRoleOverride
     *        The name of a service role for this batch build that overrides the one specified in the batch build
     *        project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withServiceRoleOverride(String serviceRoleOverride) {
        setServiceRoleOverride(serviceRoleOverride);
        return this;
    }

    /**
     * <p>
     * Enable this flag to override privileged mode in the batch build project.
     * </p>
     * 
     * @param privilegedModeOverride
     *        Enable this flag to override privileged mode in the batch build project.
     */

    public void setPrivilegedModeOverride(Boolean privilegedModeOverride) {
        this.privilegedModeOverride = privilegedModeOverride;
    }

    /**
     * <p>
     * Enable this flag to override privileged mode in the batch build project.
     * </p>
     * 
     * @return Enable this flag to override privileged mode in the batch build project.
     */

    public Boolean getPrivilegedModeOverride() {
        return this.privilegedModeOverride;
    }

    /**
     * <p>
     * Enable this flag to override privileged mode in the batch build project.
     * </p>
     * 
     * @param privilegedModeOverride
     *        Enable this flag to override privileged mode in the batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withPrivilegedModeOverride(Boolean privilegedModeOverride) {
        setPrivilegedModeOverride(privilegedModeOverride);
        return this;
    }

    /**
     * <p>
     * Enable this flag to override privileged mode in the batch build project.
     * </p>
     * 
     * @return Enable this flag to override privileged mode in the batch build project.
     */

    public Boolean isPrivilegedModeOverride() {
        return this.privilegedModeOverride;
    }

    /**
     * <p>
     * Overrides the build timeout specified in the batch build project.
     * </p>
     * 
     * @param buildTimeoutInMinutesOverride
     *        Overrides the build timeout specified in the batch build project.
     */

    public void setBuildTimeoutInMinutesOverride(Integer buildTimeoutInMinutesOverride) {
        this.buildTimeoutInMinutesOverride = buildTimeoutInMinutesOverride;
    }

    /**
     * <p>
     * Overrides the build timeout specified in the batch build project.
     * </p>
     * 
     * @return Overrides the build timeout specified in the batch build project.
     */

    public Integer getBuildTimeoutInMinutesOverride() {
        return this.buildTimeoutInMinutesOverride;
    }

    /**
     * <p>
     * Overrides the build timeout specified in the batch build project.
     * </p>
     * 
     * @param buildTimeoutInMinutesOverride
     *        Overrides the build timeout specified in the batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withBuildTimeoutInMinutesOverride(Integer buildTimeoutInMinutesOverride) {
        setBuildTimeoutInMinutesOverride(buildTimeoutInMinutesOverride);
        return this;
    }

    /**
     * <p>
     * The number of minutes a batch build is allowed to be queued before it times out.
     * </p>
     * 
     * @param queuedTimeoutInMinutesOverride
     *        The number of minutes a batch build is allowed to be queued before it times out.
     */

    public void setQueuedTimeoutInMinutesOverride(Integer queuedTimeoutInMinutesOverride) {
        this.queuedTimeoutInMinutesOverride = queuedTimeoutInMinutesOverride;
    }

    /**
     * <p>
     * The number of minutes a batch build is allowed to be queued before it times out.
     * </p>
     * 
     * @return The number of minutes a batch build is allowed to be queued before it times out.
     */

    public Integer getQueuedTimeoutInMinutesOverride() {
        return this.queuedTimeoutInMinutesOverride;
    }

    /**
     * <p>
     * The number of minutes a batch build is allowed to be queued before it times out.
     * </p>
     * 
     * @param queuedTimeoutInMinutesOverride
     *        The number of minutes a batch build is allowed to be queued before it times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withQueuedTimeoutInMinutesOverride(Integer queuedTimeoutInMinutesOverride) {
        setQueuedTimeoutInMinutesOverride(queuedTimeoutInMinutesOverride);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) that overrides the one specified in the batch
     * build project. The CMK key encrypts the build output artifacts.
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
     * @param encryptionKeyOverride
     *        The AWS Key Management Service (AWS KMS) customer master key (CMK) that overrides the one specified in the
     *        batch build project. The CMK key encrypts the build output artifacts.</p> <note>
     *        <p>
     *        You can use a cross-account KMS key to encrypt the build output artifacts if your service role has
     *        permission to that key.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using
     *        the format <code>alias/&lt;alias-name&gt;</code>).
     */

    public void setEncryptionKeyOverride(String encryptionKeyOverride) {
        this.encryptionKeyOverride = encryptionKeyOverride;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) that overrides the one specified in the batch
     * build project. The CMK key encrypts the build output artifacts.
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
     * @return The AWS Key Management Service (AWS KMS) customer master key (CMK) that overrides the one specified in
     *         the batch build project. The CMK key encrypts the build output artifacts.</p> <note>
     *         <p>
     *         You can use a cross-account KMS key to encrypt the build output artifacts if your service role has
     *         permission to that key.
     *         </p>
     *         </note>
     *         <p>
     *         You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using
     *         the format <code>alias/&lt;alias-name&gt;</code>).
     */

    public String getEncryptionKeyOverride() {
        return this.encryptionKeyOverride;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) that overrides the one specified in the batch
     * build project. The CMK key encrypts the build output artifacts.
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
     * @param encryptionKeyOverride
     *        The AWS Key Management Service (AWS KMS) customer master key (CMK) that overrides the one specified in the
     *        batch build project. The CMK key encrypts the build output artifacts.</p> <note>
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

    public StartBuildBatchRequest withEncryptionKeyOverride(String encryptionKeyOverride) {
        setEncryptionKeyOverride(encryptionKeyOverride);
        return this;
    }

    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency of the <code>StartBuildBatch</code>
     * request. The token is included in the <code>StartBuildBatch</code> request and is valid for five minutes. If you
     * repeat the <code>StartBuildBatch</code> request with the same token, but change a parameter, AWS CodeBuild
     * returns a parameter mismatch error.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique, case sensitive identifier you provide to ensure the idempotency of the
     *        <code>StartBuildBatch</code> request. The token is included in the <code>StartBuildBatch</code> request
     *        and is valid for five minutes. If you repeat the <code>StartBuildBatch</code> request with the same token,
     *        but change a parameter, AWS CodeBuild returns a parameter mismatch error.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency of the <code>StartBuildBatch</code>
     * request. The token is included in the <code>StartBuildBatch</code> request and is valid for five minutes. If you
     * repeat the <code>StartBuildBatch</code> request with the same token, but change a parameter, AWS CodeBuild
     * returns a parameter mismatch error.
     * </p>
     * 
     * @return A unique, case sensitive identifier you provide to ensure the idempotency of the
     *         <code>StartBuildBatch</code> request. The token is included in the <code>StartBuildBatch</code> request
     *         and is valid for five minutes. If you repeat the <code>StartBuildBatch</code> request with the same
     *         token, but change a parameter, AWS CodeBuild returns a parameter mismatch error.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A unique, case sensitive identifier you provide to ensure the idempotency of the <code>StartBuildBatch</code>
     * request. The token is included in the <code>StartBuildBatch</code> request and is valid for five minutes. If you
     * repeat the <code>StartBuildBatch</code> request with the same token, but change a parameter, AWS CodeBuild
     * returns a parameter mismatch error.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique, case sensitive identifier you provide to ensure the idempotency of the
     *        <code>StartBuildBatch</code> request. The token is included in the <code>StartBuildBatch</code> request
     *        and is valid for five minutes. If you repeat the <code>StartBuildBatch</code> request with the same token,
     *        but change a parameter, AWS CodeBuild returns a parameter mismatch error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
        return this;
    }

    /**
     * <p>
     * A <code>LogsConfig</code> object that override the log settings defined in the batch build project.
     * </p>
     * 
     * @param logsConfigOverride
     *        A <code>LogsConfig</code> object that override the log settings defined in the batch build project.
     */

    public void setLogsConfigOverride(LogsConfig logsConfigOverride) {
        this.logsConfigOverride = logsConfigOverride;
    }

    /**
     * <p>
     * A <code>LogsConfig</code> object that override the log settings defined in the batch build project.
     * </p>
     * 
     * @return A <code>LogsConfig</code> object that override the log settings defined in the batch build project.
     */

    public LogsConfig getLogsConfigOverride() {
        return this.logsConfigOverride;
    }

    /**
     * <p>
     * A <code>LogsConfig</code> object that override the log settings defined in the batch build project.
     * </p>
     * 
     * @param logsConfigOverride
     *        A <code>LogsConfig</code> object that override the log settings defined in the batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withLogsConfigOverride(LogsConfig logsConfigOverride) {
        setLogsConfigOverride(logsConfigOverride);
        return this;
    }

    /**
     * <p>
     * A <code>RegistryCredential</code> object that overrides credentials for access to a private registry.
     * </p>
     * 
     * @param registryCredentialOverride
     *        A <code>RegistryCredential</code> object that overrides credentials for access to a private registry.
     */

    public void setRegistryCredentialOverride(RegistryCredential registryCredentialOverride) {
        this.registryCredentialOverride = registryCredentialOverride;
    }

    /**
     * <p>
     * A <code>RegistryCredential</code> object that overrides credentials for access to a private registry.
     * </p>
     * 
     * @return A <code>RegistryCredential</code> object that overrides credentials for access to a private registry.
     */

    public RegistryCredential getRegistryCredentialOverride() {
        return this.registryCredentialOverride;
    }

    /**
     * <p>
     * A <code>RegistryCredential</code> object that overrides credentials for access to a private registry.
     * </p>
     * 
     * @param registryCredentialOverride
     *        A <code>RegistryCredential</code> object that overrides credentials for access to a private registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withRegistryCredentialOverride(RegistryCredential registryCredentialOverride) {
        setRegistryCredentialOverride(registryCredentialOverride);
        return this;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your batch build. There are two valid values:
     * </p>
     * <dl>
     * <dt>CODEBUILD</dt>
     * <dd>
     * <p>
     * Specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository policy
     * to trust AWS CodeBuild's service principal.
     * </p>
     * </dd>
     * <dt>SERVICE_ROLE</dt>
     * <dd>
     * <p>
     * Specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When using a cross-account or private registry image, you must use <code>SERVICE_ROLE</code> credentials. When
     * using an AWS CodeBuild curated image, you must use <code>CODEBUILD</code> credentials.
     * </p>
     * 
     * @param imagePullCredentialsTypeOverride
     *        The type of credentials AWS CodeBuild uses to pull images in your batch build. There are two valid values:
     *        </p>
     *        <dl>
     *        <dt>CODEBUILD</dt>
     *        <dd>
     *        <p>
     *        Specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository
     *        policy to trust AWS CodeBuild's service principal.
     *        </p>
     *        </dd>
     *        <dt>SERVICE_ROLE</dt>
     *        <dd>
     *        <p>
     *        Specifies that AWS CodeBuild uses your build project's service role.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        When using a cross-account or private registry image, you must use <code>SERVICE_ROLE</code> credentials.
     *        When using an AWS CodeBuild curated image, you must use <code>CODEBUILD</code> credentials.
     * @see ImagePullCredentialsType
     */

    public void setImagePullCredentialsTypeOverride(String imagePullCredentialsTypeOverride) {
        this.imagePullCredentialsTypeOverride = imagePullCredentialsTypeOverride;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your batch build. There are two valid values:
     * </p>
     * <dl>
     * <dt>CODEBUILD</dt>
     * <dd>
     * <p>
     * Specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository policy
     * to trust AWS CodeBuild's service principal.
     * </p>
     * </dd>
     * <dt>SERVICE_ROLE</dt>
     * <dd>
     * <p>
     * Specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When using a cross-account or private registry image, you must use <code>SERVICE_ROLE</code> credentials. When
     * using an AWS CodeBuild curated image, you must use <code>CODEBUILD</code> credentials.
     * </p>
     * 
     * @return The type of credentials AWS CodeBuild uses to pull images in your batch build. There are two valid
     *         values: </p>
     *         <dl>
     *         <dt>CODEBUILD</dt>
     *         <dd>
     *         <p>
     *         Specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository
     *         policy to trust AWS CodeBuild's service principal.
     *         </p>
     *         </dd>
     *         <dt>SERVICE_ROLE</dt>
     *         <dd>
     *         <p>
     *         Specifies that AWS CodeBuild uses your build project's service role.
     *         </p>
     *         </dd>
     *         </dl>
     *         <p>
     *         When using a cross-account or private registry image, you must use <code>SERVICE_ROLE</code> credentials.
     *         When using an AWS CodeBuild curated image, you must use <code>CODEBUILD</code> credentials.
     * @see ImagePullCredentialsType
     */

    public String getImagePullCredentialsTypeOverride() {
        return this.imagePullCredentialsTypeOverride;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your batch build. There are two valid values:
     * </p>
     * <dl>
     * <dt>CODEBUILD</dt>
     * <dd>
     * <p>
     * Specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository policy
     * to trust AWS CodeBuild's service principal.
     * </p>
     * </dd>
     * <dt>SERVICE_ROLE</dt>
     * <dd>
     * <p>
     * Specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When using a cross-account or private registry image, you must use <code>SERVICE_ROLE</code> credentials. When
     * using an AWS CodeBuild curated image, you must use <code>CODEBUILD</code> credentials.
     * </p>
     * 
     * @param imagePullCredentialsTypeOverride
     *        The type of credentials AWS CodeBuild uses to pull images in your batch build. There are two valid values:
     *        </p>
     *        <dl>
     *        <dt>CODEBUILD</dt>
     *        <dd>
     *        <p>
     *        Specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository
     *        policy to trust AWS CodeBuild's service principal.
     *        </p>
     *        </dd>
     *        <dt>SERVICE_ROLE</dt>
     *        <dd>
     *        <p>
     *        Specifies that AWS CodeBuild uses your build project's service role.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        When using a cross-account or private registry image, you must use <code>SERVICE_ROLE</code> credentials.
     *        When using an AWS CodeBuild curated image, you must use <code>CODEBUILD</code> credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImagePullCredentialsType
     */

    public StartBuildBatchRequest withImagePullCredentialsTypeOverride(String imagePullCredentialsTypeOverride) {
        setImagePullCredentialsTypeOverride(imagePullCredentialsTypeOverride);
        return this;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your batch build. There are two valid values:
     * </p>
     * <dl>
     * <dt>CODEBUILD</dt>
     * <dd>
     * <p>
     * Specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository policy
     * to trust AWS CodeBuild's service principal.
     * </p>
     * </dd>
     * <dt>SERVICE_ROLE</dt>
     * <dd>
     * <p>
     * Specifies that AWS CodeBuild uses your build project's service role.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When using a cross-account or private registry image, you must use <code>SERVICE_ROLE</code> credentials. When
     * using an AWS CodeBuild curated image, you must use <code>CODEBUILD</code> credentials.
     * </p>
     * 
     * @param imagePullCredentialsTypeOverride
     *        The type of credentials AWS CodeBuild uses to pull images in your batch build. There are two valid values:
     *        </p>
     *        <dl>
     *        <dt>CODEBUILD</dt>
     *        <dd>
     *        <p>
     *        Specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository
     *        policy to trust AWS CodeBuild's service principal.
     *        </p>
     *        </dd>
     *        <dt>SERVICE_ROLE</dt>
     *        <dd>
     *        <p>
     *        Specifies that AWS CodeBuild uses your build project's service role.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        When using a cross-account or private registry image, you must use <code>SERVICE_ROLE</code> credentials.
     *        When using an AWS CodeBuild curated image, you must use <code>CODEBUILD</code> credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImagePullCredentialsType
     */

    public StartBuildBatchRequest withImagePullCredentialsTypeOverride(ImagePullCredentialsType imagePullCredentialsTypeOverride) {
        this.imagePullCredentialsTypeOverride = imagePullCredentialsTypeOverride.toString();
        return this;
    }

    /**
     * <p>
     * A <code>BuildBatchConfigOverride</code> object that contains batch build configuration overrides.
     * </p>
     * 
     * @param buildBatchConfigOverride
     *        A <code>BuildBatchConfigOverride</code> object that contains batch build configuration overrides.
     */

    public void setBuildBatchConfigOverride(ProjectBuildBatchConfig buildBatchConfigOverride) {
        this.buildBatchConfigOverride = buildBatchConfigOverride;
    }

    /**
     * <p>
     * A <code>BuildBatchConfigOverride</code> object that contains batch build configuration overrides.
     * </p>
     * 
     * @return A <code>BuildBatchConfigOverride</code> object that contains batch build configuration overrides.
     */

    public ProjectBuildBatchConfig getBuildBatchConfigOverride() {
        return this.buildBatchConfigOverride;
    }

    /**
     * <p>
     * A <code>BuildBatchConfigOverride</code> object that contains batch build configuration overrides.
     * </p>
     * 
     * @param buildBatchConfigOverride
     *        A <code>BuildBatchConfigOverride</code> object that contains batch build configuration overrides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildBatchRequest withBuildBatchConfigOverride(ProjectBuildBatchConfig buildBatchConfigOverride) {
        setBuildBatchConfigOverride(buildBatchConfigOverride);
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
        if (getReportBuildBatchStatusOverride() != null)
            sb.append("ReportBuildBatchStatusOverride: ").append(getReportBuildBatchStatusOverride()).append(",");
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
        if (getBuildTimeoutInMinutesOverride() != null)
            sb.append("BuildTimeoutInMinutesOverride: ").append(getBuildTimeoutInMinutesOverride()).append(",");
        if (getQueuedTimeoutInMinutesOverride() != null)
            sb.append("QueuedTimeoutInMinutesOverride: ").append(getQueuedTimeoutInMinutesOverride()).append(",");
        if (getEncryptionKeyOverride() != null)
            sb.append("EncryptionKeyOverride: ").append(getEncryptionKeyOverride()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken()).append(",");
        if (getLogsConfigOverride() != null)
            sb.append("LogsConfigOverride: ").append(getLogsConfigOverride()).append(",");
        if (getRegistryCredentialOverride() != null)
            sb.append("RegistryCredentialOverride: ").append(getRegistryCredentialOverride()).append(",");
        if (getImagePullCredentialsTypeOverride() != null)
            sb.append("ImagePullCredentialsTypeOverride: ").append(getImagePullCredentialsTypeOverride()).append(",");
        if (getBuildBatchConfigOverride() != null)
            sb.append("BuildBatchConfigOverride: ").append(getBuildBatchConfigOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartBuildBatchRequest == false)
            return false;
        StartBuildBatchRequest other = (StartBuildBatchRequest) obj;
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
        if (other.getReportBuildBatchStatusOverride() == null ^ this.getReportBuildBatchStatusOverride() == null)
            return false;
        if (other.getReportBuildBatchStatusOverride() != null
                && other.getReportBuildBatchStatusOverride().equals(this.getReportBuildBatchStatusOverride()) == false)
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
        if (other.getBuildTimeoutInMinutesOverride() == null ^ this.getBuildTimeoutInMinutesOverride() == null)
            return false;
        if (other.getBuildTimeoutInMinutesOverride() != null
                && other.getBuildTimeoutInMinutesOverride().equals(this.getBuildTimeoutInMinutesOverride()) == false)
            return false;
        if (other.getQueuedTimeoutInMinutesOverride() == null ^ this.getQueuedTimeoutInMinutesOverride() == null)
            return false;
        if (other.getQueuedTimeoutInMinutesOverride() != null
                && other.getQueuedTimeoutInMinutesOverride().equals(this.getQueuedTimeoutInMinutesOverride()) == false)
            return false;
        if (other.getEncryptionKeyOverride() == null ^ this.getEncryptionKeyOverride() == null)
            return false;
        if (other.getEncryptionKeyOverride() != null && other.getEncryptionKeyOverride().equals(this.getEncryptionKeyOverride()) == false)
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
        if (other.getBuildBatchConfigOverride() == null ^ this.getBuildBatchConfigOverride() == null)
            return false;
        if (other.getBuildBatchConfigOverride() != null && other.getBuildBatchConfigOverride().equals(this.getBuildBatchConfigOverride()) == false)
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
        hashCode = prime * hashCode + ((getReportBuildBatchStatusOverride() == null) ? 0 : getReportBuildBatchStatusOverride().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentTypeOverride() == null) ? 0 : getEnvironmentTypeOverride().hashCode());
        hashCode = prime * hashCode + ((getImageOverride() == null) ? 0 : getImageOverride().hashCode());
        hashCode = prime * hashCode + ((getComputeTypeOverride() == null) ? 0 : getComputeTypeOverride().hashCode());
        hashCode = prime * hashCode + ((getCertificateOverride() == null) ? 0 : getCertificateOverride().hashCode());
        hashCode = prime * hashCode + ((getCacheOverride() == null) ? 0 : getCacheOverride().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleOverride() == null) ? 0 : getServiceRoleOverride().hashCode());
        hashCode = prime * hashCode + ((getPrivilegedModeOverride() == null) ? 0 : getPrivilegedModeOverride().hashCode());
        hashCode = prime * hashCode + ((getBuildTimeoutInMinutesOverride() == null) ? 0 : getBuildTimeoutInMinutesOverride().hashCode());
        hashCode = prime * hashCode + ((getQueuedTimeoutInMinutesOverride() == null) ? 0 : getQueuedTimeoutInMinutesOverride().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKeyOverride() == null) ? 0 : getEncryptionKeyOverride().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getLogsConfigOverride() == null) ? 0 : getLogsConfigOverride().hashCode());
        hashCode = prime * hashCode + ((getRegistryCredentialOverride() == null) ? 0 : getRegistryCredentialOverride().hashCode());
        hashCode = prime * hashCode + ((getImagePullCredentialsTypeOverride() == null) ? 0 : getImagePullCredentialsTypeOverride().hashCode());
        hashCode = prime * hashCode + ((getBuildBatchConfigOverride() == null) ? 0 : getBuildBatchConfigOverride().hashCode());
        return hashCode;
    }

    @Override
    public StartBuildBatchRequest clone() {
        return (StartBuildBatchRequest) super.clone();
    }

}

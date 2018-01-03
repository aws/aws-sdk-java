/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The name of the build project to start running a build.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * A version of the build input to be built, for this build only. If not specified, the latest version will be used.
     * If specified, must be one of:
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
     * HEAD commit ID will be used. If not specified, the default branch's HEAD commit ID will be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you
     * want to build. If a branch name is specified, the branch's HEAD commit ID will be used. If not specified, the
     * default branch's HEAD commit ID will be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the object representing the build input ZIP file
     * to use.
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
     * A set of environment variables that overrides, for this build only, the latest ones already defined in the build
     * project.
     * </p>
     */
    private java.util.List<EnvironmentVariable> environmentVariablesOverride;
    /**
     * <p>
     * A build spec declaration that overrides, for this build only, the latest one already defined in the build
     * project.
     * </p>
     */
    private String buildspecOverride;
    /**
     * <p>
     * The number of build timeout minutes, from 5 to 480 (8 hours), that overrides, for this build only, the latest
     * setting already defined in the build project.
     * </p>
     */
    private Integer timeoutInMinutesOverride;

    /**
     * <p>
     * The name of the build project to start running a build.
     * </p>
     * 
     * @param projectName
     *        The name of the build project to start running a build.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the build project to start running a build.
     * </p>
     * 
     * @return The name of the build project to start running a build.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the build project to start running a build.
     * </p>
     * 
     * @param projectName
     *        The name of the build project to start running a build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBuildRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * A version of the build input to be built, for this build only. If not specified, the latest version will be used.
     * If specified, must be one of:
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
     * HEAD commit ID will be used. If not specified, the default branch's HEAD commit ID will be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you
     * want to build. If a branch name is specified, the branch's HEAD commit ID will be used. If not specified, the
     * default branch's HEAD commit ID will be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the object representing the build input ZIP file
     * to use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceVersion
     *        A version of the build input to be built, for this build only. If not specified, the latest version will
     *        be used. If specified, must be one of:</p>
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
     *        branch's HEAD commit ID will be used. If not specified, the default branch's HEAD commit ID will be used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code
     *        you want to build. If a branch name is specified, the branch's HEAD commit ID will be used. If not
     *        specified, the default branch's HEAD commit ID will be used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon Simple Storage Service (Amazon S3): the version ID of the object representing the build input
     *        ZIP file to use.
     *        </p>
     *        </li>
     */

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * A version of the build input to be built, for this build only. If not specified, the latest version will be used.
     * If specified, must be one of:
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
     * HEAD commit ID will be used. If not specified, the default branch's HEAD commit ID will be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you
     * want to build. If a branch name is specified, the branch's HEAD commit ID will be used. If not specified, the
     * default branch's HEAD commit ID will be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the object representing the build input ZIP file
     * to use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A version of the build input to be built, for this build only. If not specified, the latest version will
     *         be used. If specified, must be one of:</p>
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
     *         branch's HEAD commit ID will be used. If not specified, the default branch's HEAD commit ID will be used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code
     *         you want to build. If a branch name is specified, the branch's HEAD commit ID will be used. If not
     *         specified, the default branch's HEAD commit ID will be used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Amazon Simple Storage Service (Amazon S3): the version ID of the object representing the build input
     *         ZIP file to use.
     *         </p>
     *         </li>
     */

    public String getSourceVersion() {
        return this.sourceVersion;
    }

    /**
     * <p>
     * A version of the build input to be built, for this build only. If not specified, the latest version will be used.
     * If specified, must be one of:
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
     * HEAD commit ID will be used. If not specified, the default branch's HEAD commit ID will be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you
     * want to build. If a branch name is specified, the branch's HEAD commit ID will be used. If not specified, the
     * default branch's HEAD commit ID will be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the object representing the build input ZIP file
     * to use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceVersion
     *        A version of the build input to be built, for this build only. If not specified, the latest version will
     *        be used. If specified, must be one of:</p>
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
     *        branch's HEAD commit ID will be used. If not specified, the default branch's HEAD commit ID will be used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code
     *        you want to build. If a branch name is specified, the branch's HEAD commit ID will be used. If not
     *        specified, the default branch's HEAD commit ID will be used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon Simple Storage Service (Amazon S3): the version ID of the object representing the build input
     *        ZIP file to use.
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
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getSourceVersion() != null)
            sb.append("SourceVersion: ").append(getSourceVersion()).append(",");
        if (getArtifactsOverride() != null)
            sb.append("ArtifactsOverride: ").append(getArtifactsOverride()).append(",");
        if (getEnvironmentVariablesOverride() != null)
            sb.append("EnvironmentVariablesOverride: ").append(getEnvironmentVariablesOverride()).append(",");
        if (getBuildspecOverride() != null)
            sb.append("BuildspecOverride: ").append(getBuildspecOverride()).append(",");
        if (getTimeoutInMinutesOverride() != null)
            sb.append("TimeoutInMinutesOverride: ").append(getTimeoutInMinutesOverride());
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
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        if (other.getArtifactsOverride() == null ^ this.getArtifactsOverride() == null)
            return false;
        if (other.getArtifactsOverride() != null && other.getArtifactsOverride().equals(this.getArtifactsOverride()) == false)
            return false;
        if (other.getEnvironmentVariablesOverride() == null ^ this.getEnvironmentVariablesOverride() == null)
            return false;
        if (other.getEnvironmentVariablesOverride() != null && other.getEnvironmentVariablesOverride().equals(this.getEnvironmentVariablesOverride()) == false)
            return false;
        if (other.getBuildspecOverride() == null ^ this.getBuildspecOverride() == null)
            return false;
        if (other.getBuildspecOverride() != null && other.getBuildspecOverride().equals(this.getBuildspecOverride()) == false)
            return false;
        if (other.getTimeoutInMinutesOverride() == null ^ this.getTimeoutInMinutesOverride() == null)
            return false;
        if (other.getTimeoutInMinutesOverride() != null && other.getTimeoutInMinutesOverride().equals(this.getTimeoutInMinutesOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        hashCode = prime * hashCode + ((getArtifactsOverride() == null) ? 0 : getArtifactsOverride().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariablesOverride() == null) ? 0 : getEnvironmentVariablesOverride().hashCode());
        hashCode = prime * hashCode + ((getBuildspecOverride() == null) ? 0 : getBuildspecOverride().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMinutesOverride() == null) ? 0 : getTimeoutInMinutesOverride().hashCode());
        return hashCode;
    }

    @Override
    public StartBuildRequest clone() {
        return (StartBuildRequest) super.clone();
    }

}

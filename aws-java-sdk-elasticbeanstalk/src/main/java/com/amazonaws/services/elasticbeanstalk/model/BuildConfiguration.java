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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Settings for an AWS CodeBuild build.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/BuildConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the artifact of the CodeBuild build. If provided, Elastic Beanstalk stores the build artifact in the
     * S3 location
     * <i>S3-bucket</i>/resources/<i>application-name</i>/codebuild/codebuild-<i>version-label</i>-<i>artifact
     * -name</i>.zip. If not provided, Elastic Beanstalk stores the build artifact in the S3 location
     * <i>S3-bucket</i>/resources/<i>application-name</i>/codebuild/codebuild-<i>version-label</i>.zip.
     * </p>
     */
    private String artifactName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to
     * interact with dependent AWS services on behalf of the AWS account.
     * </p>
     */
    private String codeBuildServiceRole;
    /**
     * <p>
     * Information about the compute resources the build project will use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds</code>
     * </p>
     * </li>
     * </ul>
     */
    private String computeType;
    /**
     * <p>
     * The ID of the Docker image to use for this build project.
     * </p>
     */
    private String image;
    /**
     * <p>
     * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that
     * does not get marked as completed. The default is 60 minutes.
     * </p>
     */
    private Integer timeoutInMinutes;

    /**
     * <p>
     * The name of the artifact of the CodeBuild build. If provided, Elastic Beanstalk stores the build artifact in the
     * S3 location
     * <i>S3-bucket</i>/resources/<i>application-name</i>/codebuild/codebuild-<i>version-label</i>-<i>artifact
     * -name</i>.zip. If not provided, Elastic Beanstalk stores the build artifact in the S3 location
     * <i>S3-bucket</i>/resources/<i>application-name</i>/codebuild/codebuild-<i>version-label</i>.zip.
     * </p>
     * 
     * @param artifactName
     *        The name of the artifact of the CodeBuild build. If provided, Elastic Beanstalk stores the build artifact
     *        in the S3 location
     *        <i>S3-bucket</i>/resources/<i>application-name</i>/codebuild/codebuild-<i>version-label<
     *        /i>-<i>artifact-name</i>.zip. If not provided, Elastic Beanstalk stores the build artifact in the S3
     *        location <i>S3-bucket</i>/resources/<i>application-name</i>/codebuild/codebuild-<i>version-label</i>.zip.
     */

    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }

    /**
     * <p>
     * The name of the artifact of the CodeBuild build. If provided, Elastic Beanstalk stores the build artifact in the
     * S3 location
     * <i>S3-bucket</i>/resources/<i>application-name</i>/codebuild/codebuild-<i>version-label</i>-<i>artifact
     * -name</i>.zip. If not provided, Elastic Beanstalk stores the build artifact in the S3 location
     * <i>S3-bucket</i>/resources/<i>application-name</i>/codebuild/codebuild-<i>version-label</i>.zip.
     * </p>
     * 
     * @return The name of the artifact of the CodeBuild build. If provided, Elastic Beanstalk stores the build artifact
     *         in the S3 location
     *         <i>S3-bucket</i>/resources/<i>application-name</i>/codebuild/codebuild-<i>version-label
     *         </i>-<i>artifact-name</i>.zip. If not provided, Elastic Beanstalk stores the build artifact in the S3
     *         location <i>S3-bucket</i>/resources/<i>application-name</i>/codebuild/codebuild-<i>version-label</i>.zip.
     */

    public String getArtifactName() {
        return this.artifactName;
    }

    /**
     * <p>
     * The name of the artifact of the CodeBuild build. If provided, Elastic Beanstalk stores the build artifact in the
     * S3 location
     * <i>S3-bucket</i>/resources/<i>application-name</i>/codebuild/codebuild-<i>version-label</i>-<i>artifact
     * -name</i>.zip. If not provided, Elastic Beanstalk stores the build artifact in the S3 location
     * <i>S3-bucket</i>/resources/<i>application-name</i>/codebuild/codebuild-<i>version-label</i>.zip.
     * </p>
     * 
     * @param artifactName
     *        The name of the artifact of the CodeBuild build. If provided, Elastic Beanstalk stores the build artifact
     *        in the S3 location
     *        <i>S3-bucket</i>/resources/<i>application-name</i>/codebuild/codebuild-<i>version-label<
     *        /i>-<i>artifact-name</i>.zip. If not provided, Elastic Beanstalk stores the build artifact in the S3
     *        location <i>S3-bucket</i>/resources/<i>application-name</i>/codebuild/codebuild-<i>version-label</i>.zip.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildConfiguration withArtifactName(String artifactName) {
        setArtifactName(artifactName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to
     * interact with dependent AWS services on behalf of the AWS account.
     * </p>
     * 
     * @param codeBuildServiceRole
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS
     *        CodeBuild to interact with dependent AWS services on behalf of the AWS account.
     */

    public void setCodeBuildServiceRole(String codeBuildServiceRole) {
        this.codeBuildServiceRole = codeBuildServiceRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to
     * interact with dependent AWS services on behalf of the AWS account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS
     *         CodeBuild to interact with dependent AWS services on behalf of the AWS account.
     */

    public String getCodeBuildServiceRole() {
        return this.codeBuildServiceRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to
     * interact with dependent AWS services on behalf of the AWS account.
     * </p>
     * 
     * @param codeBuildServiceRole
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS
     *        CodeBuild to interact with dependent AWS services on behalf of the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildConfiguration withCodeBuildServiceRole(String codeBuildServiceRole) {
        setCodeBuildServiceRole(codeBuildServiceRole);
        return this;
    }

    /**
     * <p>
     * Information about the compute resources the build project will use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        Information about the compute resources the build project will use.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds</code>
     *        </p>
     *        </li>
     * @see ComputeType
     */

    public void setComputeType(String computeType) {
        this.computeType = computeType;
    }

    /**
     * <p>
     * Information about the compute resources the build project will use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the compute resources the build project will use.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds</code>
     *         </p>
     *         </li>
     * @see ComputeType
     */

    public String getComputeType() {
        return this.computeType;
    }

    /**
     * <p>
     * Information about the compute resources the build project will use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        Information about the compute resources the build project will use.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public BuildConfiguration withComputeType(String computeType) {
        setComputeType(computeType);
        return this;
    }

    /**
     * <p>
     * Information about the compute resources the build project will use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        Information about the compute resources the build project will use.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds</code>
     *        </p>
     *        </li>
     * @see ComputeType
     */

    public void setComputeType(ComputeType computeType) {
        withComputeType(computeType);
    }

    /**
     * <p>
     * Information about the compute resources the build project will use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        Information about the compute resources the build project will use.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public BuildConfiguration withComputeType(ComputeType computeType) {
        this.computeType = computeType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Docker image to use for this build project.
     * </p>
     * 
     * @param image
     *        The ID of the Docker image to use for this build project.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The ID of the Docker image to use for this build project.
     * </p>
     * 
     * @return The ID of the Docker image to use for this build project.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The ID of the Docker image to use for this build project.
     * </p>
     * 
     * @param image
     *        The ID of the Docker image to use for this build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildConfiguration withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that
     * does not get marked as completed. The default is 60 minutes.
     * </p>
     * 
     * @param timeoutInMinutes
     *        How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build
     *        that does not get marked as completed. The default is 60 minutes.
     */

    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    /**
     * <p>
     * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that
     * does not get marked as completed. The default is 60 minutes.
     * </p>
     * 
     * @return How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related
     *         build that does not get marked as completed. The default is 60 minutes.
     */

    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    /**
     * <p>
     * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that
     * does not get marked as completed. The default is 60 minutes.
     * </p>
     * 
     * @param timeoutInMinutes
     *        How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build
     *        that does not get marked as completed. The default is 60 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildConfiguration withTimeoutInMinutes(Integer timeoutInMinutes) {
        setTimeoutInMinutes(timeoutInMinutes);
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
        if (getArtifactName() != null)
            sb.append("ArtifactName: ").append(getArtifactName()).append(",");
        if (getCodeBuildServiceRole() != null)
            sb.append("CodeBuildServiceRole: ").append(getCodeBuildServiceRole()).append(",");
        if (getComputeType() != null)
            sb.append("ComputeType: ").append(getComputeType()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getTimeoutInMinutes() != null)
            sb.append("TimeoutInMinutes: ").append(getTimeoutInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuildConfiguration == false)
            return false;
        BuildConfiguration other = (BuildConfiguration) obj;
        if (other.getArtifactName() == null ^ this.getArtifactName() == null)
            return false;
        if (other.getArtifactName() != null && other.getArtifactName().equals(this.getArtifactName()) == false)
            return false;
        if (other.getCodeBuildServiceRole() == null ^ this.getCodeBuildServiceRole() == null)
            return false;
        if (other.getCodeBuildServiceRole() != null && other.getCodeBuildServiceRole().equals(this.getCodeBuildServiceRole()) == false)
            return false;
        if (other.getComputeType() == null ^ this.getComputeType() == null)
            return false;
        if (other.getComputeType() != null && other.getComputeType().equals(this.getComputeType()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getTimeoutInMinutes() == null ^ this.getTimeoutInMinutes() == null)
            return false;
        if (other.getTimeoutInMinutes() != null && other.getTimeoutInMinutes().equals(this.getTimeoutInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArtifactName() == null) ? 0 : getArtifactName().hashCode());
        hashCode = prime * hashCode + ((getCodeBuildServiceRole() == null) ? 0 : getCodeBuildServiceRole().hashCode());
        hashCode = prime * hashCode + ((getComputeType() == null) ? 0 : getComputeType().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public BuildConfiguration clone() {
        try {
            return (BuildConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

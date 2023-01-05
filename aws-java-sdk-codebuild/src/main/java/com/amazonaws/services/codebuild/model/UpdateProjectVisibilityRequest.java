/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateProjectVisibility" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProjectVisibilityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build project.
     * </p>
     */
    private String projectArn;

    private String projectVisibility;
    /**
     * <p>
     * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3 artifacts for the
     * project's builds.
     * </p>
     */
    private String resourceAccessRole;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build project.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the build project.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build project.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the build project.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build project.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectVisibilityRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * @param projectVisibility
     * @see ProjectVisibilityType
     */

    public void setProjectVisibility(String projectVisibility) {
        this.projectVisibility = projectVisibility;
    }

    /**
     * @return
     * @see ProjectVisibilityType
     */

    public String getProjectVisibility() {
        return this.projectVisibility;
    }

    /**
     * @param projectVisibility
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectVisibilityType
     */

    public UpdateProjectVisibilityRequest withProjectVisibility(String projectVisibility) {
        setProjectVisibility(projectVisibility);
        return this;
    }

    /**
     * @param projectVisibility
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectVisibilityType
     */

    public UpdateProjectVisibilityRequest withProjectVisibility(ProjectVisibilityType projectVisibility) {
        this.projectVisibility = projectVisibility.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3 artifacts for the
     * project's builds.
     * </p>
     * 
     * @param resourceAccessRole
     *        The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3 artifacts for
     *        the project's builds.
     */

    public void setResourceAccessRole(String resourceAccessRole) {
        this.resourceAccessRole = resourceAccessRole;
    }

    /**
     * <p>
     * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3 artifacts for the
     * project's builds.
     * </p>
     * 
     * @return The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3 artifacts for
     *         the project's builds.
     */

    public String getResourceAccessRole() {
        return this.resourceAccessRole;
    }

    /**
     * <p>
     * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3 artifacts for the
     * project's builds.
     * </p>
     * 
     * @param resourceAccessRole
     *        The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3 artifacts for
     *        the project's builds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectVisibilityRequest withResourceAccessRole(String resourceAccessRole) {
        setResourceAccessRole(resourceAccessRole);
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getProjectVisibility() != null)
            sb.append("ProjectVisibility: ").append(getProjectVisibility()).append(",");
        if (getResourceAccessRole() != null)
            sb.append("ResourceAccessRole: ").append(getResourceAccessRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProjectVisibilityRequest == false)
            return false;
        UpdateProjectVisibilityRequest other = (UpdateProjectVisibilityRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getProjectVisibility() == null ^ this.getProjectVisibility() == null)
            return false;
        if (other.getProjectVisibility() != null && other.getProjectVisibility().equals(this.getProjectVisibility()) == false)
            return false;
        if (other.getResourceAccessRole() == null ^ this.getResourceAccessRole() == null)
            return false;
        if (other.getResourceAccessRole() != null && other.getResourceAccessRole().equals(this.getResourceAccessRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getProjectVisibility() == null) ? 0 : getProjectVisibility().hashCode());
        hashCode = prime * hashCode + ((getResourceAccessRole() == null) ? 0 : getResourceAccessRole().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProjectVisibilityRequest clone() {
        return (UpdateProjectVisibilityRequest) super.clone();
    }

}

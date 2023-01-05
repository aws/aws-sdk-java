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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateProjectVisibility" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProjectVisibilityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the build project.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * Contains the project identifier used with the public build APIs.
     * </p>
     */
    private String publicProjectAlias;

    private String projectVisibility;

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

    public UpdateProjectVisibilityResult withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * Contains the project identifier used with the public build APIs.
     * </p>
     * 
     * @param publicProjectAlias
     *        Contains the project identifier used with the public build APIs.
     */

    public void setPublicProjectAlias(String publicProjectAlias) {
        this.publicProjectAlias = publicProjectAlias;
    }

    /**
     * <p>
     * Contains the project identifier used with the public build APIs.
     * </p>
     * 
     * @return Contains the project identifier used with the public build APIs.
     */

    public String getPublicProjectAlias() {
        return this.publicProjectAlias;
    }

    /**
     * <p>
     * Contains the project identifier used with the public build APIs.
     * </p>
     * 
     * @param publicProjectAlias
     *        Contains the project identifier used with the public build APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectVisibilityResult withPublicProjectAlias(String publicProjectAlias) {
        setPublicProjectAlias(publicProjectAlias);
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

    public UpdateProjectVisibilityResult withProjectVisibility(String projectVisibility) {
        setProjectVisibility(projectVisibility);
        return this;
    }

    /**
     * @param projectVisibility
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectVisibilityType
     */

    public UpdateProjectVisibilityResult withProjectVisibility(ProjectVisibilityType projectVisibility) {
        this.projectVisibility = projectVisibility.toString();
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
        if (getPublicProjectAlias() != null)
            sb.append("PublicProjectAlias: ").append(getPublicProjectAlias()).append(",");
        if (getProjectVisibility() != null)
            sb.append("ProjectVisibility: ").append(getProjectVisibility());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProjectVisibilityResult == false)
            return false;
        UpdateProjectVisibilityResult other = (UpdateProjectVisibilityResult) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getPublicProjectAlias() == null ^ this.getPublicProjectAlias() == null)
            return false;
        if (other.getPublicProjectAlias() != null && other.getPublicProjectAlias().equals(this.getPublicProjectAlias()) == false)
            return false;
        if (other.getProjectVisibility() == null ^ this.getProjectVisibility() == null)
            return false;
        if (other.getProjectVisibility() != null && other.getProjectVisibility().equals(this.getProjectVisibility()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getPublicProjectAlias() == null) ? 0 : getPublicProjectAlias().hashCode());
        hashCode = prime * hashCode + ((getProjectVisibility() == null) ? 0 : getProjectVisibility().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProjectVisibilityResult clone() {
        try {
            return (UpdateProjectVisibilityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

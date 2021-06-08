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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the project.
     * </p>
     */
    private ProjectDescription projectDescription;

    /**
     * <p>
     * The description of the project.
     * </p>
     * 
     * @param projectDescription
     *        The description of the project.
     */

    public void setProjectDescription(ProjectDescription projectDescription) {
        this.projectDescription = projectDescription;
    }

    /**
     * <p>
     * The description of the project.
     * </p>
     * 
     * @return The description of the project.
     */

    public ProjectDescription getProjectDescription() {
        return this.projectDescription;
    }

    /**
     * <p>
     * The description of the project.
     * </p>
     * 
     * @param projectDescription
     *        The description of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withProjectDescription(ProjectDescription projectDescription) {
        setProjectDescription(projectDescription);
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
        if (getProjectDescription() != null)
            sb.append("ProjectDescription: ").append(getProjectDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProjectResult == false)
            return false;
        DescribeProjectResult other = (DescribeProjectResult) obj;
        if (other.getProjectDescription() == null ^ this.getProjectDescription() == null)
            return false;
        if (other.getProjectDescription() != null && other.getProjectDescription().equals(this.getProjectDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectDescription() == null) ? 0 : getProjectDescription().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProjectResult clone() {
        try {
            return (DescribeProjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

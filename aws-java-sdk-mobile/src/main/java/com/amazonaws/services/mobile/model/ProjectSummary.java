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
package com.amazonaws.services.mobile.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about an AWS Mobile Hub project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ProjectSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the project.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Unique project identifier.
     * </p>
     */
    private String projectId;

    /**
     * <p>
     * Name of the project.
     * </p>
     * 
     * @param name
     *        Name of the project.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the project.
     * </p>
     * 
     * @return Name of the project.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the project.
     * </p>
     * 
     * @param name
     *        Name of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Unique project identifier.
     * </p>
     * 
     * @param projectId
     *        Unique project identifier.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * Unique project identifier.
     * </p>
     * 
     * @return Unique project identifier.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * Unique project identifier.
     * </p>
     * 
     * @param projectId
     *        Unique project identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withProjectId(String projectId) {
        setProjectId(projectId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectSummary == false)
            return false;
        ProjectSummary other = (ProjectSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        return hashCode;
    }

    @Override
    public ProjectSummary clone() {
        try {
            return (ProjectSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mobile.model.transform.ProjectSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.iot1clickprojects.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object providing summary information for a particular project for an associated AWS account and region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ProjectSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the project being summarized.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The date when the project was originally created, in UNIX epoch time format.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The date when the project was last updated, in UNIX epoch time format. If the project was not updated, then
     * <code>createdDate</code> and <code>updatedDate</code> are the same.
     * </p>
     */
    private java.util.Date updatedDate;

    /**
     * <p>
     * The name of the project being summarized.
     * </p>
     * 
     * @param projectName
     *        The name of the project being summarized.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project being summarized.
     * </p>
     * 
     * @return The name of the project being summarized.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project being summarized.
     * </p>
     * 
     * @param projectName
     *        The name of the project being summarized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The date when the project was originally created, in UNIX epoch time format.
     * </p>
     * 
     * @param createdDate
     *        The date when the project was originally created, in UNIX epoch time format.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date when the project was originally created, in UNIX epoch time format.
     * </p>
     * 
     * @return The date when the project was originally created, in UNIX epoch time format.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date when the project was originally created, in UNIX epoch time format.
     * </p>
     * 
     * @param createdDate
     *        The date when the project was originally created, in UNIX epoch time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The date when the project was last updated, in UNIX epoch time format. If the project was not updated, then
     * <code>createdDate</code> and <code>updatedDate</code> are the same.
     * </p>
     * 
     * @param updatedDate
     *        The date when the project was last updated, in UNIX epoch time format. If the project was not updated,
     *        then <code>createdDate</code> and <code>updatedDate</code> are the same.
     */

    public void setUpdatedDate(java.util.Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * <p>
     * The date when the project was last updated, in UNIX epoch time format. If the project was not updated, then
     * <code>createdDate</code> and <code>updatedDate</code> are the same.
     * </p>
     * 
     * @return The date when the project was last updated, in UNIX epoch time format. If the project was not updated,
     *         then <code>createdDate</code> and <code>updatedDate</code> are the same.
     */

    public java.util.Date getUpdatedDate() {
        return this.updatedDate;
    }

    /**
     * <p>
     * The date when the project was last updated, in UNIX epoch time format. If the project was not updated, then
     * <code>createdDate</code> and <code>updatedDate</code> are the same.
     * </p>
     * 
     * @param updatedDate
     *        The date when the project was last updated, in UNIX epoch time format. If the project was not updated,
     *        then <code>createdDate</code> and <code>updatedDate</code> are the same.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withUpdatedDate(java.util.Date updatedDate) {
        setUpdatedDate(updatedDate);
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
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getUpdatedDate() != null)
            sb.append("UpdatedDate: ").append(getUpdatedDate());
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
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getUpdatedDate() == null ^ this.getUpdatedDate() == null)
            return false;
        if (other.getUpdatedDate() != null && other.getUpdatedDate().equals(this.getUpdatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getUpdatedDate() == null) ? 0 : getUpdatedDate().hashCode());
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
        com.amazonaws.services.iot1clickprojects.model.transform.ProjectSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the project.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the project,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:project/${ProjectId}</code>
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * The name of the project.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The ID of the portal that the project is in.
     * </p>
     */
    private String portalId;
    /**
     * <p>
     * The project's description.
     * </p>
     */
    private String projectDescription;
    /**
     * <p>
     * The date the project was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date projectCreationDate;
    /**
     * <p>
     * The date the project was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date projectLastUpdateDate;

    /**
     * <p>
     * The ID of the project.
     * </p>
     * 
     * @param projectId
     *        The ID of the project.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The ID of the project.
     * </p>
     * 
     * @return The ID of the project.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The ID of the project.
     * </p>
     * 
     * @param projectId
     *        The ID of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the project,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:project/${ProjectId}</code>
     * </p>
     * 
     * @param projectArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        project, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:project/${ProjectId}</code>
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the project,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:project/${ProjectId}</code>
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         project, which has the following format.</p>
     *         <p>
     *         <code>arn:${Partition}:iotsitewise:${Region}:${Account}:project/${ProjectId}</code>
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the project,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:project/${ProjectId}</code>
     * </p>
     * 
     * @param projectArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        project, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:project/${ProjectId}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

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

    public DescribeProjectResult withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The ID of the portal that the project is in.
     * </p>
     * 
     * @param portalId
     *        The ID of the portal that the project is in.
     */

    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    /**
     * <p>
     * The ID of the portal that the project is in.
     * </p>
     * 
     * @return The ID of the portal that the project is in.
     */

    public String getPortalId() {
        return this.portalId;
    }

    /**
     * <p>
     * The ID of the portal that the project is in.
     * </p>
     * 
     * @param portalId
     *        The ID of the portal that the project is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withPortalId(String portalId) {
        setPortalId(portalId);
        return this;
    }

    /**
     * <p>
     * The project's description.
     * </p>
     * 
     * @param projectDescription
     *        The project's description.
     */

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    /**
     * <p>
     * The project's description.
     * </p>
     * 
     * @return The project's description.
     */

    public String getProjectDescription() {
        return this.projectDescription;
    }

    /**
     * <p>
     * The project's description.
     * </p>
     * 
     * @param projectDescription
     *        The project's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withProjectDescription(String projectDescription) {
        setProjectDescription(projectDescription);
        return this;
    }

    /**
     * <p>
     * The date the project was created, in Unix epoch time.
     * </p>
     * 
     * @param projectCreationDate
     *        The date the project was created, in Unix epoch time.
     */

    public void setProjectCreationDate(java.util.Date projectCreationDate) {
        this.projectCreationDate = projectCreationDate;
    }

    /**
     * <p>
     * The date the project was created, in Unix epoch time.
     * </p>
     * 
     * @return The date the project was created, in Unix epoch time.
     */

    public java.util.Date getProjectCreationDate() {
        return this.projectCreationDate;
    }

    /**
     * <p>
     * The date the project was created, in Unix epoch time.
     * </p>
     * 
     * @param projectCreationDate
     *        The date the project was created, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withProjectCreationDate(java.util.Date projectCreationDate) {
        setProjectCreationDate(projectCreationDate);
        return this;
    }

    /**
     * <p>
     * The date the project was last updated, in Unix epoch time.
     * </p>
     * 
     * @param projectLastUpdateDate
     *        The date the project was last updated, in Unix epoch time.
     */

    public void setProjectLastUpdateDate(java.util.Date projectLastUpdateDate) {
        this.projectLastUpdateDate = projectLastUpdateDate;
    }

    /**
     * <p>
     * The date the project was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date the project was last updated, in Unix epoch time.
     */

    public java.util.Date getProjectLastUpdateDate() {
        return this.projectLastUpdateDate;
    }

    /**
     * <p>
     * The date the project was last updated, in Unix epoch time.
     * </p>
     * 
     * @param projectLastUpdateDate
     *        The date the project was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withProjectLastUpdateDate(java.util.Date projectLastUpdateDate) {
        setProjectLastUpdateDate(projectLastUpdateDate);
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
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getPortalId() != null)
            sb.append("PortalId: ").append(getPortalId()).append(",");
        if (getProjectDescription() != null)
            sb.append("ProjectDescription: ").append(getProjectDescription()).append(",");
        if (getProjectCreationDate() != null)
            sb.append("ProjectCreationDate: ").append(getProjectCreationDate()).append(",");
        if (getProjectLastUpdateDate() != null)
            sb.append("ProjectLastUpdateDate: ").append(getProjectLastUpdateDate());
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
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getPortalId() == null ^ this.getPortalId() == null)
            return false;
        if (other.getPortalId() != null && other.getPortalId().equals(this.getPortalId()) == false)
            return false;
        if (other.getProjectDescription() == null ^ this.getProjectDescription() == null)
            return false;
        if (other.getProjectDescription() != null && other.getProjectDescription().equals(this.getProjectDescription()) == false)
            return false;
        if (other.getProjectCreationDate() == null ^ this.getProjectCreationDate() == null)
            return false;
        if (other.getProjectCreationDate() != null && other.getProjectCreationDate().equals(this.getProjectCreationDate()) == false)
            return false;
        if (other.getProjectLastUpdateDate() == null ^ this.getProjectLastUpdateDate() == null)
            return false;
        if (other.getProjectLastUpdateDate() != null && other.getProjectLastUpdateDate().equals(this.getProjectLastUpdateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getPortalId() == null) ? 0 : getPortalId().hashCode());
        hashCode = prime * hashCode + ((getProjectDescription() == null) ? 0 : getProjectDescription().hashCode());
        hashCode = prime * hashCode + ((getProjectCreationDate() == null) ? 0 : getProjectCreationDate().hashCode());
        hashCode = prime * hashCode + ((getProjectLastUpdateDate() == null) ? 0 : getProjectLastUpdateDate().hashCode());
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

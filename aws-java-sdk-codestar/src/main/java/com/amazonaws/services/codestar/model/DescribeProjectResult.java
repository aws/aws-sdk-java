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
package com.amazonaws.services.codestar.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DescribeProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The display name for the project.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the project.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the project.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The description of the project, if any.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project creation.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The date and time the project was created, in timestamp format.
     * </p>
     */
    private java.util.Date createdTimeStamp;
    /**
     * <p>
     * The ID of the primary stack in AWS CloudFormation used to generate resources for the project.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The ID for the AWS CodeStar project template used to create the project.
     * </p>
     */
    private String projectTemplateId;
    /**
     * <p>
     * The project creation or deletion status.
     * </p>
     */
    private ProjectStatus status;

    /**
     * <p>
     * The display name for the project.
     * </p>
     * 
     * @param name
     *        The display name for the project.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name for the project.
     * </p>
     * 
     * @return The display name for the project.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The display name for the project.
     * </p>
     * 
     * @param name
     *        The display name for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the project.
     * </p>
     * 
     * @param id
     *        The ID of the project.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the project.
     * </p>
     * 
     * @return The ID of the project.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the project.
     * </p>
     * 
     * @param id
     *        The ID of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the project.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the project.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the project.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the project.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the project.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The description of the project, if any.
     * </p>
     * 
     * @param description
     *        The description of the project, if any.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the project, if any.
     * </p>
     * 
     * @return The description of the project, if any.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the project, if any.
     * </p>
     * 
     * @param description
     *        The description of the project, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project creation.
     * </p>
     * 
     * @param clientRequestToken
     *        A user- or system-generated token that identifies the entity that requested project creation.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project creation.
     * </p>
     * 
     * @return A user- or system-generated token that identifies the entity that requested project creation.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project creation.
     * </p>
     * 
     * @param clientRequestToken
     *        A user- or system-generated token that identifies the entity that requested project creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The date and time the project was created, in timestamp format.
     * </p>
     * 
     * @param createdTimeStamp
     *        The date and time the project was created, in timestamp format.
     */

    public void setCreatedTimeStamp(java.util.Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }

    /**
     * <p>
     * The date and time the project was created, in timestamp format.
     * </p>
     * 
     * @return The date and time the project was created, in timestamp format.
     */

    public java.util.Date getCreatedTimeStamp() {
        return this.createdTimeStamp;
    }

    /**
     * <p>
     * The date and time the project was created, in timestamp format.
     * </p>
     * 
     * @param createdTimeStamp
     *        The date and time the project was created, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withCreatedTimeStamp(java.util.Date createdTimeStamp) {
        setCreatedTimeStamp(createdTimeStamp);
        return this;
    }

    /**
     * <p>
     * The ID of the primary stack in AWS CloudFormation used to generate resources for the project.
     * </p>
     * 
     * @param stackId
     *        The ID of the primary stack in AWS CloudFormation used to generate resources for the project.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The ID of the primary stack in AWS CloudFormation used to generate resources for the project.
     * </p>
     * 
     * @return The ID of the primary stack in AWS CloudFormation used to generate resources for the project.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The ID of the primary stack in AWS CloudFormation used to generate resources for the project.
     * </p>
     * 
     * @param stackId
     *        The ID of the primary stack in AWS CloudFormation used to generate resources for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The ID for the AWS CodeStar project template used to create the project.
     * </p>
     * 
     * @param projectTemplateId
     *        The ID for the AWS CodeStar project template used to create the project.
     */

    public void setProjectTemplateId(String projectTemplateId) {
        this.projectTemplateId = projectTemplateId;
    }

    /**
     * <p>
     * The ID for the AWS CodeStar project template used to create the project.
     * </p>
     * 
     * @return The ID for the AWS CodeStar project template used to create the project.
     */

    public String getProjectTemplateId() {
        return this.projectTemplateId;
    }

    /**
     * <p>
     * The ID for the AWS CodeStar project template used to create the project.
     * </p>
     * 
     * @param projectTemplateId
     *        The ID for the AWS CodeStar project template used to create the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withProjectTemplateId(String projectTemplateId) {
        setProjectTemplateId(projectTemplateId);
        return this;
    }

    /**
     * <p>
     * The project creation or deletion status.
     * </p>
     * 
     * @param status
     *        The project creation or deletion status.
     */

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The project creation or deletion status.
     * </p>
     * 
     * @return The project creation or deletion status.
     */

    public ProjectStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The project creation or deletion status.
     * </p>
     * 
     * @param status
     *        The project creation or deletion status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withStatus(ProjectStatus status) {
        setStatus(status);
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
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getCreatedTimeStamp() != null)
            sb.append("CreatedTimeStamp: ").append(getCreatedTimeStamp()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getProjectTemplateId() != null)
            sb.append("ProjectTemplateId: ").append(getProjectTemplateId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getCreatedTimeStamp() == null ^ this.getCreatedTimeStamp() == null)
            return false;
        if (other.getCreatedTimeStamp() != null && other.getCreatedTimeStamp().equals(this.getCreatedTimeStamp()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getProjectTemplateId() == null ^ this.getProjectTemplateId() == null)
            return false;
        if (other.getProjectTemplateId() != null && other.getProjectTemplateId().equals(this.getProjectTemplateId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimeStamp() == null) ? 0 : getCreatedTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getProjectTemplateId() == null) ? 0 : getProjectTemplateId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
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

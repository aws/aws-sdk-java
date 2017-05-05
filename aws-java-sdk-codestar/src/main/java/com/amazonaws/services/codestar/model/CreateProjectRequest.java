/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CreateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The friendly name for the project. This friendly name serves as the basis for the names for resources associated
     * with the project, such as a repository name in AWS CodeCommit. The name is limited to 100 characters and cannot
     * contain certain restricted symbols. For more information, see <a
     * href="http://docs.aws.amazon.com/codestar/latest/userguide/limits.html">Limits</a> in the AWS CodeStar User
     * Guide.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID for the AWS CodeStar project. Project IDs must be unique within an AWS account. Project IDs cannot exceed
     * 15 characters and cannot contain capital letters and other restricted symbols. For more information, see <a
     * href="http://docs.aws.amazon.com/codestar/latest/userguide/limits.html">Limits</a> in the AWS CodeStar User
     * Guide.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Optional. The description for the project.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project creation. This token can be
     * used to repeat the request. It can also be used to identify which user or system made the request in
     * DescribeProject and ListProjects.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The friendly name for the project. This friendly name serves as the basis for the names for resources associated
     * with the project, such as a repository name in AWS CodeCommit. The name is limited to 100 characters and cannot
     * contain certain restricted symbols. For more information, see <a
     * href="http://docs.aws.amazon.com/codestar/latest/userguide/limits.html">Limits</a> in the AWS CodeStar User
     * Guide.
     * </p>
     * 
     * @param name
     *        The friendly name for the project. This friendly name serves as the basis for the names for resources
     *        associated with the project, such as a repository name in AWS CodeCommit. The name is limited to 100
     *        characters and cannot contain certain restricted symbols. For more information, see <a
     *        href="http://docs.aws.amazon.com/codestar/latest/userguide/limits.html">Limits</a> in the AWS CodeStar
     *        User Guide.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name for the project. This friendly name serves as the basis for the names for resources associated
     * with the project, such as a repository name in AWS CodeCommit. The name is limited to 100 characters and cannot
     * contain certain restricted symbols. For more information, see <a
     * href="http://docs.aws.amazon.com/codestar/latest/userguide/limits.html">Limits</a> in the AWS CodeStar User
     * Guide.
     * </p>
     * 
     * @return The friendly name for the project. This friendly name serves as the basis for the names for resources
     *         associated with the project, such as a repository name in AWS CodeCommit. The name is limited to 100
     *         characters and cannot contain certain restricted symbols. For more information, see <a
     *         href="http://docs.aws.amazon.com/codestar/latest/userguide/limits.html">Limits</a> in the AWS CodeStar
     *         User Guide.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name for the project. This friendly name serves as the basis for the names for resources associated
     * with the project, such as a repository name in AWS CodeCommit. The name is limited to 100 characters and cannot
     * contain certain restricted symbols. For more information, see <a
     * href="http://docs.aws.amazon.com/codestar/latest/userguide/limits.html">Limits</a> in the AWS CodeStar User
     * Guide.
     * </p>
     * 
     * @param name
     *        The friendly name for the project. This friendly name serves as the basis for the names for resources
     *        associated with the project, such as a repository name in AWS CodeCommit. The name is limited to 100
     *        characters and cannot contain certain restricted symbols. For more information, see <a
     *        href="http://docs.aws.amazon.com/codestar/latest/userguide/limits.html">Limits</a> in the AWS CodeStar
     *        User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID for the AWS CodeStar project. Project IDs must be unique within an AWS account. Project IDs cannot exceed
     * 15 characters and cannot contain capital letters and other restricted symbols. For more information, see <a
     * href="http://docs.aws.amazon.com/codestar/latest/userguide/limits.html">Limits</a> in the AWS CodeStar User
     * Guide.
     * </p>
     * 
     * @param id
     *        The ID for the AWS CodeStar project. Project IDs must be unique within an AWS account. Project IDs cannot
     *        exceed 15 characters and cannot contain capital letters and other restricted symbols. For more
     *        information, see <a href="http://docs.aws.amazon.com/codestar/latest/userguide/limits.html">Limits</a> in
     *        the AWS CodeStar User Guide.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for the AWS CodeStar project. Project IDs must be unique within an AWS account. Project IDs cannot exceed
     * 15 characters and cannot contain capital letters and other restricted symbols. For more information, see <a
     * href="http://docs.aws.amazon.com/codestar/latest/userguide/limits.html">Limits</a> in the AWS CodeStar User
     * Guide.
     * </p>
     * 
     * @return The ID for the AWS CodeStar project. Project IDs must be unique within an AWS account. Project IDs cannot
     *         exceed 15 characters and cannot contain capital letters and other restricted symbols. For more
     *         information, see <a href="http://docs.aws.amazon.com/codestar/latest/userguide/limits.html">Limits</a> in
     *         the AWS CodeStar User Guide.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for the AWS CodeStar project. Project IDs must be unique within an AWS account. Project IDs cannot exceed
     * 15 characters and cannot contain capital letters and other restricted symbols. For more information, see <a
     * href="http://docs.aws.amazon.com/codestar/latest/userguide/limits.html">Limits</a> in the AWS CodeStar User
     * Guide.
     * </p>
     * 
     * @param id
     *        The ID for the AWS CodeStar project. Project IDs must be unique within an AWS account. Project IDs cannot
     *        exceed 15 characters and cannot contain capital letters and other restricted symbols. For more
     *        information, see <a href="http://docs.aws.amazon.com/codestar/latest/userguide/limits.html">Limits</a> in
     *        the AWS CodeStar User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Optional. The description for the project.
     * </p>
     * 
     * @param description
     *        Optional. The description for the project.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Optional. The description for the project.
     * </p>
     * 
     * @return Optional. The description for the project.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Optional. The description for the project.
     * </p>
     * 
     * @param description
     *        Optional. The description for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project creation. This token can be
     * used to repeat the request. It can also be used to identify which user or system made the request in
     * DescribeProject and ListProjects.
     * </p>
     * 
     * @param clientRequestToken
     *        A user- or system-generated token that identifies the entity that requested project creation. This token
     *        can be used to repeat the request. It can also be used to identify which user or system made the request
     *        in DescribeProject and ListProjects.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project creation. This token can be
     * used to repeat the request. It can also be used to identify which user or system made the request in
     * DescribeProject and ListProjects.
     * </p>
     * 
     * @return A user- or system-generated token that identifies the entity that requested project creation. This token
     *         can be used to repeat the request. It can also be used to identify which user or system made the request
     *         in DescribeProject and ListProjects.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project creation. This token can be
     * used to repeat the request. It can also be used to identify which user or system made the request in
     * DescribeProject and ListProjects.
     * </p>
     * 
     * @param clientRequestToken
     *        A user- or system-generated token that identifies the entity that requested project creation. This token
     *        can be used to repeat the request. It can also be used to identify which user or system made the request
     *        in DescribeProject and ListProjects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProjectRequest == false)
            return false;
        CreateProjectRequest other = (CreateProjectRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectRequest clone() {
        return (CreateProjectRequest) super.clone();
    }

}

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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CreateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the project.
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
     * The user- or system-generated token from the initial request that can be used to repeat the request. It can also
     * be used to identify which user or system made the request in DescribeProject and ListProjects.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The ID for the AWS CodeStar project template used to create the project.
     * </p>
     */
    private String projectTemplateId;

    /**
     * <p>
     * The ID for the project.
     * </p>
     * 
     * @param id
     *        The ID for the project.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for the project.
     * </p>
     * 
     * @return The ID for the project.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for the project.
     * </p>
     * 
     * @param id
     *        The ID for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectResult withId(String id) {
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

    public CreateProjectResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The user- or system-generated token from the initial request that can be used to repeat the request. It can also
     * be used to identify which user or system made the request in DescribeProject and ListProjects.
     * </p>
     * 
     * @param clientRequestToken
     *        The user- or system-generated token from the initial request that can be used to repeat the request. It
     *        can also be used to identify which user or system made the request in DescribeProject and ListProjects.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The user- or system-generated token from the initial request that can be used to repeat the request. It can also
     * be used to identify which user or system made the request in DescribeProject and ListProjects.
     * </p>
     * 
     * @return The user- or system-generated token from the initial request that can be used to repeat the request. It
     *         can also be used to identify which user or system made the request in DescribeProject and ListProjects.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The user- or system-generated token from the initial request that can be used to repeat the request. It can also
     * be used to identify which user or system made the request in DescribeProject and ListProjects.
     * </p>
     * 
     * @param clientRequestToken
     *        The user- or system-generated token from the initial request that can be used to repeat the request. It
     *        can also be used to identify which user or system made the request in DescribeProject and ListProjects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectResult withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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

    public CreateProjectResult withProjectTemplateId(String projectTemplateId) {
        setProjectTemplateId(projectTemplateId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getProjectTemplateId() != null)
            sb.append("ProjectTemplateId: ").append(getProjectTemplateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProjectResult == false)
            return false;
        CreateProjectResult other = (CreateProjectResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getProjectTemplateId() == null ^ this.getProjectTemplateId() == null)
            return false;
        if (other.getProjectTemplateId() != null && other.getProjectTemplateId().equals(this.getProjectTemplateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getProjectTemplateId() == null) ? 0 : getProjectTemplateId().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectResult clone() {
        try {
            return (CreateProjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

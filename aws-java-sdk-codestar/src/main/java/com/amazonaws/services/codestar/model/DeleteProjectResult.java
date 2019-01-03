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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DeleteProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the primary stack in AWS CloudFormation that will be deleted as part of deleting the project and its
     * resources.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deleted project.
     * </p>
     */
    private String projectArn;

    /**
     * <p>
     * The ID of the primary stack in AWS CloudFormation that will be deleted as part of deleting the project and its
     * resources.
     * </p>
     * 
     * @param stackId
     *        The ID of the primary stack in AWS CloudFormation that will be deleted as part of deleting the project and
     *        its resources.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The ID of the primary stack in AWS CloudFormation that will be deleted as part of deleting the project and its
     * resources.
     * </p>
     * 
     * @return The ID of the primary stack in AWS CloudFormation that will be deleted as part of deleting the project
     *         and its resources.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The ID of the primary stack in AWS CloudFormation that will be deleted as part of deleting the project and its
     * resources.
     * </p>
     * 
     * @param stackId
     *        The ID of the primary stack in AWS CloudFormation that will be deleted as part of deleting the project and
     *        its resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProjectResult withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deleted project.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the deleted project.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deleted project.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the deleted project.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deleted project.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the deleted project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProjectResult withProjectArn(String projectArn) {
        setProjectArn(projectArn);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteProjectResult == false)
            return false;
        DeleteProjectResult other = (DeleteProjectResult) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteProjectResult clone() {
        try {
            return (DeleteProjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DeleteProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the project to be deleted in AWS CodeStar.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project deletion. This token can be
     * used to repeat the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Whether to send a delete request for the primary stack in AWS CloudFormation originally used to generate the
     * project and its resources. This option will delete all AWS resources for the project (except for any buckets in
     * Amazon S3) as well as deleting the project itself. Recommended for most use cases.
     * </p>
     */
    private Boolean deleteStack;

    /**
     * <p>
     * The ID of the project to be deleted in AWS CodeStar.
     * </p>
     * 
     * @param id
     *        The ID of the project to be deleted in AWS CodeStar.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the project to be deleted in AWS CodeStar.
     * </p>
     * 
     * @return The ID of the project to be deleted in AWS CodeStar.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the project to be deleted in AWS CodeStar.
     * </p>
     * 
     * @param id
     *        The ID of the project to be deleted in AWS CodeStar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProjectRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project deletion. This token can be
     * used to repeat the request.
     * </p>
     * 
     * @param clientRequestToken
     *        A user- or system-generated token that identifies the entity that requested project deletion. This token
     *        can be used to repeat the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project deletion. This token can be
     * used to repeat the request.
     * </p>
     * 
     * @return A user- or system-generated token that identifies the entity that requested project deletion. This token
     *         can be used to repeat the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project deletion. This token can be
     * used to repeat the request.
     * </p>
     * 
     * @param clientRequestToken
     *        A user- or system-generated token that identifies the entity that requested project deletion. This token
     *        can be used to repeat the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProjectRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Whether to send a delete request for the primary stack in AWS CloudFormation originally used to generate the
     * project and its resources. This option will delete all AWS resources for the project (except for any buckets in
     * Amazon S3) as well as deleting the project itself. Recommended for most use cases.
     * </p>
     * 
     * @param deleteStack
     *        Whether to send a delete request for the primary stack in AWS CloudFormation originally used to generate
     *        the project and its resources. This option will delete all AWS resources for the project (except for any
     *        buckets in Amazon S3) as well as deleting the project itself. Recommended for most use cases.
     */

    public void setDeleteStack(Boolean deleteStack) {
        this.deleteStack = deleteStack;
    }

    /**
     * <p>
     * Whether to send a delete request for the primary stack in AWS CloudFormation originally used to generate the
     * project and its resources. This option will delete all AWS resources for the project (except for any buckets in
     * Amazon S3) as well as deleting the project itself. Recommended for most use cases.
     * </p>
     * 
     * @return Whether to send a delete request for the primary stack in AWS CloudFormation originally used to generate
     *         the project and its resources. This option will delete all AWS resources for the project (except for any
     *         buckets in Amazon S3) as well as deleting the project itself. Recommended for most use cases.
     */

    public Boolean getDeleteStack() {
        return this.deleteStack;
    }

    /**
     * <p>
     * Whether to send a delete request for the primary stack in AWS CloudFormation originally used to generate the
     * project and its resources. This option will delete all AWS resources for the project (except for any buckets in
     * Amazon S3) as well as deleting the project itself. Recommended for most use cases.
     * </p>
     * 
     * @param deleteStack
     *        Whether to send a delete request for the primary stack in AWS CloudFormation originally used to generate
     *        the project and its resources. This option will delete all AWS resources for the project (except for any
     *        buckets in Amazon S3) as well as deleting the project itself. Recommended for most use cases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProjectRequest withDeleteStack(Boolean deleteStack) {
        setDeleteStack(deleteStack);
        return this;
    }

    /**
     * <p>
     * Whether to send a delete request for the primary stack in AWS CloudFormation originally used to generate the
     * project and its resources. This option will delete all AWS resources for the project (except for any buckets in
     * Amazon S3) as well as deleting the project itself. Recommended for most use cases.
     * </p>
     * 
     * @return Whether to send a delete request for the primary stack in AWS CloudFormation originally used to generate
     *         the project and its resources. This option will delete all AWS resources for the project (except for any
     *         buckets in Amazon S3) as well as deleting the project itself. Recommended for most use cases.
     */

    public Boolean isDeleteStack() {
        return this.deleteStack;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getDeleteStack() != null)
            sb.append("DeleteStack: ").append(getDeleteStack());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteProjectRequest == false)
            return false;
        DeleteProjectRequest other = (DeleteProjectRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getDeleteStack() == null ^ this.getDeleteStack() == null)
            return false;
        if (other.getDeleteStack() != null && other.getDeleteStack().equals(this.getDeleteStack()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getDeleteStack() == null) ? 0 : getDeleteStack().hashCode());
        return hashCode;
    }

    @Override
    public DeleteProjectRequest clone() {
        return (DeleteProjectRequest) super.clone();
    }

}

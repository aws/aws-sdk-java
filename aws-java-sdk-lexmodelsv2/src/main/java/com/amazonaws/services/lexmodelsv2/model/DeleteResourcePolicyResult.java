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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteResourcePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteResourcePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy was deleted from.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The current revision of the resource policy. Use the revision ID to make sure that you are updating the most
     * current version of a resource policy when you add a policy statement to a resource, delete a resource, or update
     * a resource.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy was deleted from.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy was deleted from.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy was deleted from.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy was deleted from.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy was deleted from.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy was deleted from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteResourcePolicyResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The current revision of the resource policy. Use the revision ID to make sure that you are updating the most
     * current version of a resource policy when you add a policy statement to a resource, delete a resource, or update
     * a resource.
     * </p>
     * 
     * @param revisionId
     *        The current revision of the resource policy. Use the revision ID to make sure that you are updating the
     *        most current version of a resource policy when you add a policy statement to a resource, delete a
     *        resource, or update a resource.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The current revision of the resource policy. Use the revision ID to make sure that you are updating the most
     * current version of a resource policy when you add a policy statement to a resource, delete a resource, or update
     * a resource.
     * </p>
     * 
     * @return The current revision of the resource policy. Use the revision ID to make sure that you are updating the
     *         most current version of a resource policy when you add a policy statement to a resource, delete a
     *         resource, or update a resource.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The current revision of the resource policy. Use the revision ID to make sure that you are updating the most
     * current version of a resource policy when you add a policy statement to a resource, delete a resource, or update
     * a resource.
     * </p>
     * 
     * @param revisionId
     *        The current revision of the resource policy. Use the revision ID to make sure that you are updating the
     *        most current version of a resource policy when you add a policy statement to a resource, delete a
     *        resource, or update a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteResourcePolicyResult withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteResourcePolicyResult == false)
            return false;
        DeleteResourcePolicyResult other = (DeleteResourcePolicyResult) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteResourcePolicyResult clone() {
        try {
            return (DeleteResourcePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

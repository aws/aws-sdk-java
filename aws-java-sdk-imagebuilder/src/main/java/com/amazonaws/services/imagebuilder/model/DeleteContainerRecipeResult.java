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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteContainerRecipe" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteContainerRecipeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container recipe that was deleted.
     * </p>
     */
    private String containerRecipeArn;

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @return The request ID that uniquely identifies this request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteContainerRecipeResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container recipe that was deleted.
     * </p>
     * 
     * @param containerRecipeArn
     *        The Amazon Resource Name (ARN) of the container recipe that was deleted.
     */

    public void setContainerRecipeArn(String containerRecipeArn) {
        this.containerRecipeArn = containerRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container recipe that was deleted.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container recipe that was deleted.
     */

    public String getContainerRecipeArn() {
        return this.containerRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container recipe that was deleted.
     * </p>
     * 
     * @param containerRecipeArn
     *        The Amazon Resource Name (ARN) of the container recipe that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteContainerRecipeResult withContainerRecipeArn(String containerRecipeArn) {
        setContainerRecipeArn(containerRecipeArn);
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
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getContainerRecipeArn() != null)
            sb.append("ContainerRecipeArn: ").append(getContainerRecipeArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteContainerRecipeResult == false)
            return false;
        DeleteContainerRecipeResult other = (DeleteContainerRecipeResult) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getContainerRecipeArn() == null ^ this.getContainerRecipeArn() == null)
            return false;
        if (other.getContainerRecipeArn() != null && other.getContainerRecipeArn().equals(this.getContainerRecipeArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getContainerRecipeArn() == null) ? 0 : getContainerRecipeArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteContainerRecipeResult clone() {
        try {
            return (DeleteContainerRecipeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

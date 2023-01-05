/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/CreateIndex" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIndexResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the new local index for the Region. You can reference this ARN in IAM permission policies to authorize
     * the following operations: <a>DeleteIndex</a> | <a>GetIndex</a> | <a>UpdateIndexType</a> | <a>CreateView</a>
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and timestamp when the index was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Indicates the current state of the index. You can check for changes to the state for asynchronous operations by
     * calling the <a>GetIndex</a> operation.
     * </p>
     * <note>
     * <p>
     * The state can remain in the <code>CREATING</code> or <code>UPDATING</code> state for several hours as Resource
     * Explorer discovers the information about your resources and populates the index.
     * </p>
     * </note>
     */
    private String state;

    /**
     * <p>
     * The ARN of the new local index for the Region. You can reference this ARN in IAM permission policies to authorize
     * the following operations: <a>DeleteIndex</a> | <a>GetIndex</a> | <a>UpdateIndexType</a> | <a>CreateView</a>
     * </p>
     * 
     * @param arn
     *        The ARN of the new local index for the Region. You can reference this ARN in IAM permission policies to
     *        authorize the following operations: <a>DeleteIndex</a> | <a>GetIndex</a> | <a>UpdateIndexType</a> |
     *        <a>CreateView</a>
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the new local index for the Region. You can reference this ARN in IAM permission policies to authorize
     * the following operations: <a>DeleteIndex</a> | <a>GetIndex</a> | <a>UpdateIndexType</a> | <a>CreateView</a>
     * </p>
     * 
     * @return The ARN of the new local index for the Region. You can reference this ARN in IAM permission policies to
     *         authorize the following operations: <a>DeleteIndex</a> | <a>GetIndex</a> | <a>UpdateIndexType</a> |
     *         <a>CreateView</a>
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the new local index for the Region. You can reference this ARN in IAM permission policies to authorize
     * the following operations: <a>DeleteIndex</a> | <a>GetIndex</a> | <a>UpdateIndexType</a> | <a>CreateView</a>
     * </p>
     * 
     * @param arn
     *        The ARN of the new local index for the Region. You can reference this ARN in IAM permission policies to
     *        authorize the following operations: <a>DeleteIndex</a> | <a>GetIndex</a> | <a>UpdateIndexType</a> |
     *        <a>CreateView</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and timestamp when the index was created.
     * </p>
     * 
     * @param createdAt
     *        The date and timestamp when the index was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and timestamp when the index was created.
     * </p>
     * 
     * @return The date and timestamp when the index was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and timestamp when the index was created.
     * </p>
     * 
     * @param createdAt
     *        The date and timestamp when the index was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Indicates the current state of the index. You can check for changes to the state for asynchronous operations by
     * calling the <a>GetIndex</a> operation.
     * </p>
     * <note>
     * <p>
     * The state can remain in the <code>CREATING</code> or <code>UPDATING</code> state for several hours as Resource
     * Explorer discovers the information about your resources and populates the index.
     * </p>
     * </note>
     * 
     * @param state
     *        Indicates the current state of the index. You can check for changes to the state for asynchronous
     *        operations by calling the <a>GetIndex</a> operation.</p> <note>
     *        <p>
     *        The state can remain in the <code>CREATING</code> or <code>UPDATING</code> state for several hours as
     *        Resource Explorer discovers the information about your resources and populates the index.
     *        </p>
     * @see IndexState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Indicates the current state of the index. You can check for changes to the state for asynchronous operations by
     * calling the <a>GetIndex</a> operation.
     * </p>
     * <note>
     * <p>
     * The state can remain in the <code>CREATING</code> or <code>UPDATING</code> state for several hours as Resource
     * Explorer discovers the information about your resources and populates the index.
     * </p>
     * </note>
     * 
     * @return Indicates the current state of the index. You can check for changes to the state for asynchronous
     *         operations by calling the <a>GetIndex</a> operation.</p> <note>
     *         <p>
     *         The state can remain in the <code>CREATING</code> or <code>UPDATING</code> state for several hours as
     *         Resource Explorer discovers the information about your resources and populates the index.
     *         </p>
     * @see IndexState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Indicates the current state of the index. You can check for changes to the state for asynchronous operations by
     * calling the <a>GetIndex</a> operation.
     * </p>
     * <note>
     * <p>
     * The state can remain in the <code>CREATING</code> or <code>UPDATING</code> state for several hours as Resource
     * Explorer discovers the information about your resources and populates the index.
     * </p>
     * </note>
     * 
     * @param state
     *        Indicates the current state of the index. You can check for changes to the state for asynchronous
     *        operations by calling the <a>GetIndex</a> operation.</p> <note>
     *        <p>
     *        The state can remain in the <code>CREATING</code> or <code>UPDATING</code> state for several hours as
     *        Resource Explorer discovers the information about your resources and populates the index.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexState
     */

    public CreateIndexResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Indicates the current state of the index. You can check for changes to the state for asynchronous operations by
     * calling the <a>GetIndex</a> operation.
     * </p>
     * <note>
     * <p>
     * The state can remain in the <code>CREATING</code> or <code>UPDATING</code> state for several hours as Resource
     * Explorer discovers the information about your resources and populates the index.
     * </p>
     * </note>
     * 
     * @param state
     *        Indicates the current state of the index. You can check for changes to the state for asynchronous
     *        operations by calling the <a>GetIndex</a> operation.</p> <note>
     *        <p>
     *        The state can remain in the <code>CREATING</code> or <code>UPDATING</code> state for several hours as
     *        Resource Explorer discovers the information about your resources and populates the index.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexState
     */

    public CreateIndexResult withState(IndexState state) {
        this.state = state.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIndexResult == false)
            return false;
        CreateIndexResult other = (CreateIndexResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public CreateIndexResult clone() {
        try {
            return (CreateIndexResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

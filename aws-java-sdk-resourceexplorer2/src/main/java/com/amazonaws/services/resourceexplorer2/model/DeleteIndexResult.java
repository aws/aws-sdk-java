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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/DeleteIndex" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteIndexResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index that you successfully started the deletion process.
     * </p>
     * <note>
     * <p>
     * This operation is asynchronous. To check its status, call the <a>GetIndex</a> operation.
     * </p>
     * </note>
     */
    private String arn;
    /**
     * <p>
     * The date and time when you last updated this index.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * Indicates the current state of the index.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index that you successfully started the deletion process.
     * </p>
     * <note>
     * <p>
     * This operation is asynchronous. To check its status, call the <a>GetIndex</a> operation.
     * </p>
     * </note>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the index that you successfully started the deletion process.</p> <note>
     *        <p>
     *        This operation is asynchronous. To check its status, call the <a>GetIndex</a> operation.
     *        </p>
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index that you successfully started the deletion process.
     * </p>
     * <note>
     * <p>
     * This operation is asynchronous. To check its status, call the <a>GetIndex</a> operation.
     * </p>
     * </note>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *         name (ARN)</a> of the index that you successfully started the deletion process.</p> <note>
     *         <p>
     *         This operation is asynchronous. To check its status, call the <a>GetIndex</a> operation.
     *         </p>
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index that you successfully started the deletion process.
     * </p>
     * <note>
     * <p>
     * This operation is asynchronous. To check its status, call the <a>GetIndex</a> operation.
     * </p>
     * </note>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the index that you successfully started the deletion process.</p> <note>
     *        <p>
     *        This operation is asynchronous. To check its status, call the <a>GetIndex</a> operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIndexResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time when you last updated this index.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when you last updated this index.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when you last updated this index.
     * </p>
     * 
     * @return The date and time when you last updated this index.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when you last updated this index.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when you last updated this index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIndexResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * Indicates the current state of the index.
     * </p>
     * 
     * @param state
     *        Indicates the current state of the index.
     * @see IndexState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Indicates the current state of the index.
     * </p>
     * 
     * @return Indicates the current state of the index.
     * @see IndexState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Indicates the current state of the index.
     * </p>
     * 
     * @param state
     *        Indicates the current state of the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexState
     */

    public DeleteIndexResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Indicates the current state of the index.
     * </p>
     * 
     * @param state
     *        Indicates the current state of the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexState
     */

    public DeleteIndexResult withState(IndexState state) {
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
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
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

        if (obj instanceof DeleteIndexResult == false)
            return false;
        DeleteIndexResult other = (DeleteIndexResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
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
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public DeleteIndexResult clone() {
        try {
            return (DeleteIndexResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

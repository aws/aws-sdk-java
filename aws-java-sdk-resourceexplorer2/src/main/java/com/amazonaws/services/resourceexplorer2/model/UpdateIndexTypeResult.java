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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/UpdateIndexType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIndexTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index that you updated.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and timestamp when the index was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * Indicates the state of the request to update the index. This operation is asynchronous. Call the <a>GetIndex</a>
     * operation to check for changes.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Specifies the type of the specified index after the operation completes.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index that you updated.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the index that you updated.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index that you updated.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *         name (ARN)</a> of the index that you updated.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index that you updated.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the index that you updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexTypeResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and timestamp when the index was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and timestamp when the index was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and timestamp when the index was last updated.
     * </p>
     * 
     * @return The date and timestamp when the index was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and timestamp when the index was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and timestamp when the index was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexTypeResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * Indicates the state of the request to update the index. This operation is asynchronous. Call the <a>GetIndex</a>
     * operation to check for changes.
     * </p>
     * 
     * @param state
     *        Indicates the state of the request to update the index. This operation is asynchronous. Call the
     *        <a>GetIndex</a> operation to check for changes.
     * @see IndexState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Indicates the state of the request to update the index. This operation is asynchronous. Call the <a>GetIndex</a>
     * operation to check for changes.
     * </p>
     * 
     * @return Indicates the state of the request to update the index. This operation is asynchronous. Call the
     *         <a>GetIndex</a> operation to check for changes.
     * @see IndexState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Indicates the state of the request to update the index. This operation is asynchronous. Call the <a>GetIndex</a>
     * operation to check for changes.
     * </p>
     * 
     * @param state
     *        Indicates the state of the request to update the index. This operation is asynchronous. Call the
     *        <a>GetIndex</a> operation to check for changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexState
     */

    public UpdateIndexTypeResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Indicates the state of the request to update the index. This operation is asynchronous. Call the <a>GetIndex</a>
     * operation to check for changes.
     * </p>
     * 
     * @param state
     *        Indicates the state of the request to update the index. This operation is asynchronous. Call the
     *        <a>GetIndex</a> operation to check for changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexState
     */

    public UpdateIndexTypeResult withState(IndexState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of the specified index after the operation completes.
     * </p>
     * 
     * @param type
     *        Specifies the type of the specified index after the operation completes.
     * @see IndexType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the type of the specified index after the operation completes.
     * </p>
     * 
     * @return Specifies the type of the specified index after the operation completes.
     * @see IndexType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the type of the specified index after the operation completes.
     * </p>
     * 
     * @param type
     *        Specifies the type of the specified index after the operation completes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexType
     */

    public UpdateIndexTypeResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the specified index after the operation completes.
     * </p>
     * 
     * @param type
     *        Specifies the type of the specified index after the operation completes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexType
     */

    public UpdateIndexTypeResult withType(IndexType type) {
        this.type = type.toString();
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
            sb.append("State: ").append(getState()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIndexTypeResult == false)
            return false;
        UpdateIndexTypeResult other = (UpdateIndexTypeResult) obj;
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
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIndexTypeResult clone() {
        try {
            return (UpdateIndexTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

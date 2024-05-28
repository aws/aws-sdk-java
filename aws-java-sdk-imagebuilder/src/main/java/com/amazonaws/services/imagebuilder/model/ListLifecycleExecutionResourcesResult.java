/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListLifecycleExecutionResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLifecycleExecutionResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Runtime details for the specified runtime instance of the lifecycle policy.
     * </p>
     */
    private String lifecycleExecutionId;
    /**
     * <p>
     * The current state of the lifecycle runtime instance.
     * </p>
     */
    private LifecycleExecutionState lifecycleExecutionState;
    /**
     * <p>
     * A list of resources that were identified for lifecycle actions.
     * </p>
     */
    private java.util.List<LifecycleExecutionResource> resources;
    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Runtime details for the specified runtime instance of the lifecycle policy.
     * </p>
     * 
     * @param lifecycleExecutionId
     *        Runtime details for the specified runtime instance of the lifecycle policy.
     */

    public void setLifecycleExecutionId(String lifecycleExecutionId) {
        this.lifecycleExecutionId = lifecycleExecutionId;
    }

    /**
     * <p>
     * Runtime details for the specified runtime instance of the lifecycle policy.
     * </p>
     * 
     * @return Runtime details for the specified runtime instance of the lifecycle policy.
     */

    public String getLifecycleExecutionId() {
        return this.lifecycleExecutionId;
    }

    /**
     * <p>
     * Runtime details for the specified runtime instance of the lifecycle policy.
     * </p>
     * 
     * @param lifecycleExecutionId
     *        Runtime details for the specified runtime instance of the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLifecycleExecutionResourcesResult withLifecycleExecutionId(String lifecycleExecutionId) {
        setLifecycleExecutionId(lifecycleExecutionId);
        return this;
    }

    /**
     * <p>
     * The current state of the lifecycle runtime instance.
     * </p>
     * 
     * @param lifecycleExecutionState
     *        The current state of the lifecycle runtime instance.
     */

    public void setLifecycleExecutionState(LifecycleExecutionState lifecycleExecutionState) {
        this.lifecycleExecutionState = lifecycleExecutionState;
    }

    /**
     * <p>
     * The current state of the lifecycle runtime instance.
     * </p>
     * 
     * @return The current state of the lifecycle runtime instance.
     */

    public LifecycleExecutionState getLifecycleExecutionState() {
        return this.lifecycleExecutionState;
    }

    /**
     * <p>
     * The current state of the lifecycle runtime instance.
     * </p>
     * 
     * @param lifecycleExecutionState
     *        The current state of the lifecycle runtime instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLifecycleExecutionResourcesResult withLifecycleExecutionState(LifecycleExecutionState lifecycleExecutionState) {
        setLifecycleExecutionState(lifecycleExecutionState);
        return this;
    }

    /**
     * <p>
     * A list of resources that were identified for lifecycle actions.
     * </p>
     * 
     * @return A list of resources that were identified for lifecycle actions.
     */

    public java.util.List<LifecycleExecutionResource> getResources() {
        return resources;
    }

    /**
     * <p>
     * A list of resources that were identified for lifecycle actions.
     * </p>
     * 
     * @param resources
     *        A list of resources that were identified for lifecycle actions.
     */

    public void setResources(java.util.Collection<LifecycleExecutionResource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<LifecycleExecutionResource>(resources);
    }

    /**
     * <p>
     * A list of resources that were identified for lifecycle actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        A list of resources that were identified for lifecycle actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLifecycleExecutionResourcesResult withResources(LifecycleExecutionResource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<LifecycleExecutionResource>(resources.length));
        }
        for (LifecycleExecutionResource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resources that were identified for lifecycle actions.
     * </p>
     * 
     * @param resources
     *        A list of resources that were identified for lifecycle actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLifecycleExecutionResourcesResult withResources(java.util.Collection<LifecycleExecutionResource> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this field isn't empty, there are additional elements
     *        that the service hasn't included in this request. Use this token with the next request to retrieve
     *        additional objects.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @return The next token used for paginated responses. When this field isn't empty, there are additional elements
     *         that the service hasn't included in this request. Use this token with the next request to retrieve
     *         additional objects.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this field isn't empty, there are additional elements
     *        that the service hasn't included in this request. Use this token with the next request to retrieve
     *        additional objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLifecycleExecutionResourcesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getLifecycleExecutionId() != null)
            sb.append("LifecycleExecutionId: ").append(getLifecycleExecutionId()).append(",");
        if (getLifecycleExecutionState() != null)
            sb.append("LifecycleExecutionState: ").append(getLifecycleExecutionState()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLifecycleExecutionResourcesResult == false)
            return false;
        ListLifecycleExecutionResourcesResult other = (ListLifecycleExecutionResourcesResult) obj;
        if (other.getLifecycleExecutionId() == null ^ this.getLifecycleExecutionId() == null)
            return false;
        if (other.getLifecycleExecutionId() != null && other.getLifecycleExecutionId().equals(this.getLifecycleExecutionId()) == false)
            return false;
        if (other.getLifecycleExecutionState() == null ^ this.getLifecycleExecutionState() == null)
            return false;
        if (other.getLifecycleExecutionState() != null && other.getLifecycleExecutionState().equals(this.getLifecycleExecutionState()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycleExecutionId() == null) ? 0 : getLifecycleExecutionId().hashCode());
        hashCode = prime * hashCode + ((getLifecycleExecutionState() == null) ? 0 : getLifecycleExecutionState().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLifecycleExecutionResourcesResult clone() {
        try {
            return (ListLifecycleExecutionResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListLifecycleExecutionResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLifecycleExecutionResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use the unique identifier for a runtime instance of the lifecycle policy to get runtime details.
     * </p>
     */
    private String lifecycleExecutionId;
    /**
     * <p>
     * You can leave this empty to get a list of Image Builder resources that were identified for lifecycle actions.
     * </p>
     * <p>
     * To get a list of associated resources that are impacted for an individual resource (the parent), specify its
     * Amazon Resource Name (ARN). Associated resources are produced from your image and distributed when you run a
     * build, such as AMIs or container images stored in ECR repositories.
     * </p>
     */
    private String parentResourceId;
    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Use the unique identifier for a runtime instance of the lifecycle policy to get runtime details.
     * </p>
     * 
     * @param lifecycleExecutionId
     *        Use the unique identifier for a runtime instance of the lifecycle policy to get runtime details.
     */

    public void setLifecycleExecutionId(String lifecycleExecutionId) {
        this.lifecycleExecutionId = lifecycleExecutionId;
    }

    /**
     * <p>
     * Use the unique identifier for a runtime instance of the lifecycle policy to get runtime details.
     * </p>
     * 
     * @return Use the unique identifier for a runtime instance of the lifecycle policy to get runtime details.
     */

    public String getLifecycleExecutionId() {
        return this.lifecycleExecutionId;
    }

    /**
     * <p>
     * Use the unique identifier for a runtime instance of the lifecycle policy to get runtime details.
     * </p>
     * 
     * @param lifecycleExecutionId
     *        Use the unique identifier for a runtime instance of the lifecycle policy to get runtime details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLifecycleExecutionResourcesRequest withLifecycleExecutionId(String lifecycleExecutionId) {
        setLifecycleExecutionId(lifecycleExecutionId);
        return this;
    }

    /**
     * <p>
     * You can leave this empty to get a list of Image Builder resources that were identified for lifecycle actions.
     * </p>
     * <p>
     * To get a list of associated resources that are impacted for an individual resource (the parent), specify its
     * Amazon Resource Name (ARN). Associated resources are produced from your image and distributed when you run a
     * build, such as AMIs or container images stored in ECR repositories.
     * </p>
     * 
     * @param parentResourceId
     *        You can leave this empty to get a list of Image Builder resources that were identified for lifecycle
     *        actions.</p>
     *        <p>
     *        To get a list of associated resources that are impacted for an individual resource (the parent), specify
     *        its Amazon Resource Name (ARN). Associated resources are produced from your image and distributed when you
     *        run a build, such as AMIs or container images stored in ECR repositories.
     */

    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
    }

    /**
     * <p>
     * You can leave this empty to get a list of Image Builder resources that were identified for lifecycle actions.
     * </p>
     * <p>
     * To get a list of associated resources that are impacted for an individual resource (the parent), specify its
     * Amazon Resource Name (ARN). Associated resources are produced from your image and distributed when you run a
     * build, such as AMIs or container images stored in ECR repositories.
     * </p>
     * 
     * @return You can leave this empty to get a list of Image Builder resources that were identified for lifecycle
     *         actions.</p>
     *         <p>
     *         To get a list of associated resources that are impacted for an individual resource (the parent), specify
     *         its Amazon Resource Name (ARN). Associated resources are produced from your image and distributed when
     *         you run a build, such as AMIs or container images stored in ECR repositories.
     */

    public String getParentResourceId() {
        return this.parentResourceId;
    }

    /**
     * <p>
     * You can leave this empty to get a list of Image Builder resources that were identified for lifecycle actions.
     * </p>
     * <p>
     * To get a list of associated resources that are impacted for an individual resource (the parent), specify its
     * Amazon Resource Name (ARN). Associated resources are produced from your image and distributed when you run a
     * build, such as AMIs or container images stored in ECR repositories.
     * </p>
     * 
     * @param parentResourceId
     *        You can leave this empty to get a list of Image Builder resources that were identified for lifecycle
     *        actions.</p>
     *        <p>
     *        To get a list of associated resources that are impacted for an individual resource (the parent), specify
     *        its Amazon Resource Name (ARN). Associated resources are produced from your image and distributed when you
     *        run a build, such as AMIs or container images stored in ECR repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLifecycleExecutionResourcesRequest withParentResourceId(String parentResourceId) {
        setParentResourceId(parentResourceId);
        return this;
    }

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * 
     * @param maxResults
     *        The maximum items to return in a request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * 
     * @return The maximum items to return in a request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * 
     * @param maxResults
     *        The maximum items to return in a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLifecycleExecutionResourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the nextToken from a previously truncated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
     * </p>
     * 
     * @return A token to specify where to start paginating. This is the nextToken from a previously truncated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the nextToken from a previously truncated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLifecycleExecutionResourcesRequest withNextToken(String nextToken) {
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
        if (getParentResourceId() != null)
            sb.append("ParentResourceId: ").append(getParentResourceId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListLifecycleExecutionResourcesRequest == false)
            return false;
        ListLifecycleExecutionResourcesRequest other = (ListLifecycleExecutionResourcesRequest) obj;
        if (other.getLifecycleExecutionId() == null ^ this.getLifecycleExecutionId() == null)
            return false;
        if (other.getLifecycleExecutionId() != null && other.getLifecycleExecutionId().equals(this.getLifecycleExecutionId()) == false)
            return false;
        if (other.getParentResourceId() == null ^ this.getParentResourceId() == null)
            return false;
        if (other.getParentResourceId() != null && other.getParentResourceId().equals(this.getParentResourceId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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
        hashCode = prime * hashCode + ((getParentResourceId() == null) ? 0 : getParentResourceId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLifecycleExecutionResourcesRequest clone() {
        return (ListLifecycleExecutionResourcesRequest) super.clone();
    }

}

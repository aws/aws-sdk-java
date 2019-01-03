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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListContainerInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContainerInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of container instances with full ARN entries for each container instance associated with the specified
     * cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> containerInstanceArns;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListContainerInstances</code> request. When the
     * results of a <code>ListContainerInstances</code> request exceed <code>maxResults</code>, this value can be used
     * to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of container instances with full ARN entries for each container instance associated with the specified
     * cluster.
     * </p>
     * 
     * @return The list of container instances with full ARN entries for each container instance associated with the
     *         specified cluster.
     */

    public java.util.List<String> getContainerInstanceArns() {
        if (containerInstanceArns == null) {
            containerInstanceArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return containerInstanceArns;
    }

    /**
     * <p>
     * The list of container instances with full ARN entries for each container instance associated with the specified
     * cluster.
     * </p>
     * 
     * @param containerInstanceArns
     *        The list of container instances with full ARN entries for each container instance associated with the
     *        specified cluster.
     */

    public void setContainerInstanceArns(java.util.Collection<String> containerInstanceArns) {
        if (containerInstanceArns == null) {
            this.containerInstanceArns = null;
            return;
        }

        this.containerInstanceArns = new com.amazonaws.internal.SdkInternalList<String>(containerInstanceArns);
    }

    /**
     * <p>
     * The list of container instances with full ARN entries for each container instance associated with the specified
     * cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerInstanceArns(java.util.Collection)} or
     * {@link #withContainerInstanceArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param containerInstanceArns
     *        The list of container instances with full ARN entries for each container instance associated with the
     *        specified cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerInstancesResult withContainerInstanceArns(String... containerInstanceArns) {
        if (this.containerInstanceArns == null) {
            setContainerInstanceArns(new com.amazonaws.internal.SdkInternalList<String>(containerInstanceArns.length));
        }
        for (String ele : containerInstanceArns) {
            this.containerInstanceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of container instances with full ARN entries for each container instance associated with the specified
     * cluster.
     * </p>
     * 
     * @param containerInstanceArns
     *        The list of container instances with full ARN entries for each container instance associated with the
     *        specified cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerInstancesResult withContainerInstanceArns(java.util.Collection<String> containerInstanceArns) {
        setContainerInstanceArns(containerInstanceArns);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListContainerInstances</code> request. When the
     * results of a <code>ListContainerInstances</code> request exceed <code>maxResults</code>, this value can be used
     * to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListContainerInstances</code> request. When
     *        the results of a <code>ListContainerInstances</code> request exceed <code>maxResults</code>, this value
     *        can be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     *        results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListContainerInstances</code> request. When the
     * results of a <code>ListContainerInstances</code> request exceed <code>maxResults</code>, this value can be used
     * to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListContainerInstances</code> request. When
     *         the results of a <code>ListContainerInstances</code> request exceed <code>maxResults</code>, this value
     *         can be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     *         results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListContainerInstances</code> request. When the
     * results of a <code>ListContainerInstances</code> request exceed <code>maxResults</code>, this value can be used
     * to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListContainerInstances</code> request. When
     *        the results of a <code>ListContainerInstances</code> request exceed <code>maxResults</code>, this value
     *        can be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     *        results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerInstancesResult withNextToken(String nextToken) {
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
        if (getContainerInstanceArns() != null)
            sb.append("ContainerInstanceArns: ").append(getContainerInstanceArns()).append(",");
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

        if (obj instanceof ListContainerInstancesResult == false)
            return false;
        ListContainerInstancesResult other = (ListContainerInstancesResult) obj;
        if (other.getContainerInstanceArns() == null ^ this.getContainerInstanceArns() == null)
            return false;
        if (other.getContainerInstanceArns() != null && other.getContainerInstanceArns().equals(this.getContainerInstanceArns()) == false)
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

        hashCode = prime * hashCode + ((getContainerInstanceArns() == null) ? 0 : getContainerInstanceArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListContainerInstancesResult clone() {
        try {
            return (ListContainerInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

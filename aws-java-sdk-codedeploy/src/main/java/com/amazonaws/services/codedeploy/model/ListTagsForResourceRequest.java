/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListTagsForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of a CodeDeploy resource. <code>ListTagsForResource</code> returns all the tags associated with the
     * resource that is identified by the <code>ResourceArn</code>.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * An identifier returned from the previous <code>ListTagsForResource</code> call. It can be used to return the next
     * set of applications in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ARN of a CodeDeploy resource. <code>ListTagsForResource</code> returns all the tags associated with the
     * resource that is identified by the <code>ResourceArn</code>.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of a CodeDeploy resource. <code>ListTagsForResource</code> returns all the tags associated with
     *        the resource that is identified by the <code>ResourceArn</code>.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of a CodeDeploy resource. <code>ListTagsForResource</code> returns all the tags associated with the
     * resource that is identified by the <code>ResourceArn</code>.
     * </p>
     * 
     * @return The ARN of a CodeDeploy resource. <code>ListTagsForResource</code> returns all the tags associated with
     *         the resource that is identified by the <code>ResourceArn</code>.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of a CodeDeploy resource. <code>ListTagsForResource</code> returns all the tags associated with the
     * resource that is identified by the <code>ResourceArn</code>.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of a CodeDeploy resource. <code>ListTagsForResource</code> returns all the tags associated with
     *        the resource that is identified by the <code>ResourceArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * An identifier returned from the previous <code>ListTagsForResource</code> call. It can be used to return the next
     * set of applications in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier returned from the previous <code>ListTagsForResource</code> call. It can be used to return
     *        the next set of applications in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous <code>ListTagsForResource</code> call. It can be used to return the next
     * set of applications in the list.
     * </p>
     * 
     * @return An identifier returned from the previous <code>ListTagsForResource</code> call. It can be used to return
     *         the next set of applications in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous <code>ListTagsForResource</code> call. It can be used to return the next
     * set of applications in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier returned from the previous <code>ListTagsForResource</code> call. It can be used to return
     *        the next set of applications in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withNextToken(String nextToken) {
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
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

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
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

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }

}

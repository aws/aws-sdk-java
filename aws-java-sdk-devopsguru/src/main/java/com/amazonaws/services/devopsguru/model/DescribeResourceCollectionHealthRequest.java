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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeResourceCollectionHealth"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeResourceCollectionHealthRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String nextToken;

    private String resourceCollectionType;

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceCollectionHealthRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param resourceCollectionType
     */

    public void setResourceCollectionType(String resourceCollectionType) {
        this.resourceCollectionType = resourceCollectionType;
    }

    /**
     * @return
     */

    public String getResourceCollectionType() {
        return this.resourceCollectionType;
    }

    /**
     * @param resourceCollectionType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceCollectionHealthRequest withResourceCollectionType(String resourceCollectionType) {
        setResourceCollectionType(resourceCollectionType);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResourceCollectionType() != null)
            sb.append("ResourceCollectionType: ").append(getResourceCollectionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeResourceCollectionHealthRequest == false)
            return false;
        DescribeResourceCollectionHealthRequest other = (DescribeResourceCollectionHealthRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResourceCollectionType() == null ^ this.getResourceCollectionType() == null)
            return false;
        if (other.getResourceCollectionType() != null && other.getResourceCollectionType().equals(this.getResourceCollectionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResourceCollectionType() == null) ? 0 : getResourceCollectionType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeResourceCollectionHealthRequest clone() {
        return (DescribeResourceCollectionHealthRequest) super.clone();
    }

}

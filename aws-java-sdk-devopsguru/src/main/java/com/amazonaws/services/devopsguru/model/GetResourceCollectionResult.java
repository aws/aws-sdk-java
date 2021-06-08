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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/GetResourceCollection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceCollectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requested list of AWS resource collections. The one type of AWS resource collection supported is AWS
     * CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS resources that are defined in the
     * stacks. You can specify up to 500 AWS CloudFormation stacks.
     * </p>
     */
    private ResourceCollectionFilter resourceCollection;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The requested list of AWS resource collections. The one type of AWS resource collection supported is AWS
     * CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS resources that are defined in the
     * stacks. You can specify up to 500 AWS CloudFormation stacks.
     * </p>
     * 
     * @param resourceCollection
     *        The requested list of AWS resource collections. The one type of AWS resource collection supported is AWS
     *        CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS resources that are defined in
     *        the stacks. You can specify up to 500 AWS CloudFormation stacks.
     */

    public void setResourceCollection(ResourceCollectionFilter resourceCollection) {
        this.resourceCollection = resourceCollection;
    }

    /**
     * <p>
     * The requested list of AWS resource collections. The one type of AWS resource collection supported is AWS
     * CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS resources that are defined in the
     * stacks. You can specify up to 500 AWS CloudFormation stacks.
     * </p>
     * 
     * @return The requested list of AWS resource collections. The one type of AWS resource collection supported is AWS
     *         CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS resources that are defined
     *         in the stacks. You can specify up to 500 AWS CloudFormation stacks.
     */

    public ResourceCollectionFilter getResourceCollection() {
        return this.resourceCollection;
    }

    /**
     * <p>
     * The requested list of AWS resource collections. The one type of AWS resource collection supported is AWS
     * CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS resources that are defined in the
     * stacks. You can specify up to 500 AWS CloudFormation stacks.
     * </p>
     * 
     * @param resourceCollection
     *        The requested list of AWS resource collections. The one type of AWS resource collection supported is AWS
     *        CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS resources that are defined in
     *        the stacks. You can specify up to 500 AWS CloudFormation stacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceCollectionResult withResourceCollection(ResourceCollectionFilter resourceCollection) {
        setResourceCollection(resourceCollection);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceCollectionResult withNextToken(String nextToken) {
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
        if (getResourceCollection() != null)
            sb.append("ResourceCollection: ").append(getResourceCollection()).append(",");
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

        if (obj instanceof GetResourceCollectionResult == false)
            return false;
        GetResourceCollectionResult other = (GetResourceCollectionResult) obj;
        if (other.getResourceCollection() == null ^ this.getResourceCollection() == null)
            return false;
        if (other.getResourceCollection() != null && other.getResourceCollection().equals(this.getResourceCollection()) == false)
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

        hashCode = prime * hashCode + ((getResourceCollection() == null) ? 0 : getResourceCollection().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceCollectionResult clone() {
        try {
            return (GetResourceCollectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

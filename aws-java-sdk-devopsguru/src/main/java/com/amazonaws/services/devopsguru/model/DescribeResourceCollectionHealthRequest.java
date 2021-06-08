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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeResourceCollectionHealth"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeResourceCollectionHealthRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An AWS resource collection type. This type specifies how analyzed AWS resources are defined. The one type of AWS
     * resource collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS
     * resources that are defined in the stacks. You can specify up to 500 AWS CloudFormation stacks.
     * </p>
     */
    private String resourceCollectionType;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An AWS resource collection type. This type specifies how analyzed AWS resources are defined. The one type of AWS
     * resource collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS
     * resources that are defined in the stacks. You can specify up to 500 AWS CloudFormation stacks.
     * </p>
     * 
     * @param resourceCollectionType
     *        An AWS resource collection type. This type specifies how analyzed AWS resources are defined. The one type
     *        of AWS resource collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to
     *        analyze only the AWS resources that are defined in the stacks. You can specify up to 500 AWS
     *        CloudFormation stacks.
     * @see ResourceCollectionType
     */

    public void setResourceCollectionType(String resourceCollectionType) {
        this.resourceCollectionType = resourceCollectionType;
    }

    /**
     * <p>
     * An AWS resource collection type. This type specifies how analyzed AWS resources are defined. The one type of AWS
     * resource collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS
     * resources that are defined in the stacks. You can specify up to 500 AWS CloudFormation stacks.
     * </p>
     * 
     * @return An AWS resource collection type. This type specifies how analyzed AWS resources are defined. The one type
     *         of AWS resource collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to
     *         analyze only the AWS resources that are defined in the stacks. You can specify up to 500 AWS
     *         CloudFormation stacks.
     * @see ResourceCollectionType
     */

    public String getResourceCollectionType() {
        return this.resourceCollectionType;
    }

    /**
     * <p>
     * An AWS resource collection type. This type specifies how analyzed AWS resources are defined. The one type of AWS
     * resource collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS
     * resources that are defined in the stacks. You can specify up to 500 AWS CloudFormation stacks.
     * </p>
     * 
     * @param resourceCollectionType
     *        An AWS resource collection type. This type specifies how analyzed AWS resources are defined. The one type
     *        of AWS resource collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to
     *        analyze only the AWS resources that are defined in the stacks. You can specify up to 500 AWS
     *        CloudFormation stacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceCollectionType
     */

    public DescribeResourceCollectionHealthRequest withResourceCollectionType(String resourceCollectionType) {
        setResourceCollectionType(resourceCollectionType);
        return this;
    }

    /**
     * <p>
     * An AWS resource collection type. This type specifies how analyzed AWS resources are defined. The one type of AWS
     * resource collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS
     * resources that are defined in the stacks. You can specify up to 500 AWS CloudFormation stacks.
     * </p>
     * 
     * @param resourceCollectionType
     *        An AWS resource collection type. This type specifies how analyzed AWS resources are defined. The one type
     *        of AWS resource collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to
     *        analyze only the AWS resources that are defined in the stacks. You can specify up to 500 AWS
     *        CloudFormation stacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceCollectionType
     */

    public DescribeResourceCollectionHealthRequest withResourceCollectionType(ResourceCollectionType resourceCollectionType) {
        this.resourceCollectionType = resourceCollectionType.toString();
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If this value is
     *        null, it retrieves the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If this value is
     *         null, it retrieves the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If this value is
     *        null, it retrieves the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceCollectionHealthRequest withNextToken(String nextToken) {
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
        if (getResourceCollectionType() != null)
            sb.append("ResourceCollectionType: ").append(getResourceCollectionType()).append(",");
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

        if (obj instanceof DescribeResourceCollectionHealthRequest == false)
            return false;
        DescribeResourceCollectionHealthRequest other = (DescribeResourceCollectionHealthRequest) obj;
        if (other.getResourceCollectionType() == null ^ this.getResourceCollectionType() == null)
            return false;
        if (other.getResourceCollectionType() != null && other.getResourceCollectionType().equals(this.getResourceCollectionType()) == false)
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

        hashCode = prime * hashCode + ((getResourceCollectionType() == null) ? 0 : getResourceCollectionType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeResourceCollectionHealthRequest clone() {
        return (DescribeResourceCollectionHealthRequest) super.clone();
    }

}

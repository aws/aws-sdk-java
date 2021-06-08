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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeResourceCollectionHealth"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeResourceCollectionHealthResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The returned <code>CloudFormationHealthOverview</code> object that contains an <code>InsightHealthOverview</code>
     * object with the requested system health information.
     * </p>
     */
    private java.util.List<CloudFormationHealth> cloudFormation;
    /**
     * <p>
     * An array of <code>ServiceHealth</code> objects that describes the health of the AWS services associated with the
     * resources in the collection.
     * </p>
     */
    private java.util.List<ServiceHealth> service;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The returned <code>CloudFormationHealthOverview</code> object that contains an <code>InsightHealthOverview</code>
     * object with the requested system health information.
     * </p>
     * 
     * @return The returned <code>CloudFormationHealthOverview</code> object that contains an
     *         <code>InsightHealthOverview</code> object with the requested system health information.
     */

    public java.util.List<CloudFormationHealth> getCloudFormation() {
        return cloudFormation;
    }

    /**
     * <p>
     * The returned <code>CloudFormationHealthOverview</code> object that contains an <code>InsightHealthOverview</code>
     * object with the requested system health information.
     * </p>
     * 
     * @param cloudFormation
     *        The returned <code>CloudFormationHealthOverview</code> object that contains an
     *        <code>InsightHealthOverview</code> object with the requested system health information.
     */

    public void setCloudFormation(java.util.Collection<CloudFormationHealth> cloudFormation) {
        if (cloudFormation == null) {
            this.cloudFormation = null;
            return;
        }

        this.cloudFormation = new java.util.ArrayList<CloudFormationHealth>(cloudFormation);
    }

    /**
     * <p>
     * The returned <code>CloudFormationHealthOverview</code> object that contains an <code>InsightHealthOverview</code>
     * object with the requested system health information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCloudFormation(java.util.Collection)} or {@link #withCloudFormation(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param cloudFormation
     *        The returned <code>CloudFormationHealthOverview</code> object that contains an
     *        <code>InsightHealthOverview</code> object with the requested system health information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceCollectionHealthResult withCloudFormation(CloudFormationHealth... cloudFormation) {
        if (this.cloudFormation == null) {
            setCloudFormation(new java.util.ArrayList<CloudFormationHealth>(cloudFormation.length));
        }
        for (CloudFormationHealth ele : cloudFormation) {
            this.cloudFormation.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The returned <code>CloudFormationHealthOverview</code> object that contains an <code>InsightHealthOverview</code>
     * object with the requested system health information.
     * </p>
     * 
     * @param cloudFormation
     *        The returned <code>CloudFormationHealthOverview</code> object that contains an
     *        <code>InsightHealthOverview</code> object with the requested system health information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceCollectionHealthResult withCloudFormation(java.util.Collection<CloudFormationHealth> cloudFormation) {
        setCloudFormation(cloudFormation);
        return this;
    }

    /**
     * <p>
     * An array of <code>ServiceHealth</code> objects that describes the health of the AWS services associated with the
     * resources in the collection.
     * </p>
     * 
     * @return An array of <code>ServiceHealth</code> objects that describes the health of the AWS services associated
     *         with the resources in the collection.
     */

    public java.util.List<ServiceHealth> getService() {
        return service;
    }

    /**
     * <p>
     * An array of <code>ServiceHealth</code> objects that describes the health of the AWS services associated with the
     * resources in the collection.
     * </p>
     * 
     * @param service
     *        An array of <code>ServiceHealth</code> objects that describes the health of the AWS services associated
     *        with the resources in the collection.
     */

    public void setService(java.util.Collection<ServiceHealth> service) {
        if (service == null) {
            this.service = null;
            return;
        }

        this.service = new java.util.ArrayList<ServiceHealth>(service);
    }

    /**
     * <p>
     * An array of <code>ServiceHealth</code> objects that describes the health of the AWS services associated with the
     * resources in the collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setService(java.util.Collection)} or {@link #withService(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param service
     *        An array of <code>ServiceHealth</code> objects that describes the health of the AWS services associated
     *        with the resources in the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceCollectionHealthResult withService(ServiceHealth... service) {
        if (this.service == null) {
            setService(new java.util.ArrayList<ServiceHealth>(service.length));
        }
        for (ServiceHealth ele : service) {
            this.service.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ServiceHealth</code> objects that describes the health of the AWS services associated with the
     * resources in the collection.
     * </p>
     * 
     * @param service
     *        An array of <code>ServiceHealth</code> objects that describes the health of the AWS services associated
     *        with the resources in the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceCollectionHealthResult withService(java.util.Collection<ServiceHealth> service) {
        setService(service);
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

    public DescribeResourceCollectionHealthResult withNextToken(String nextToken) {
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
        if (getCloudFormation() != null)
            sb.append("CloudFormation: ").append(getCloudFormation()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
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

        if (obj instanceof DescribeResourceCollectionHealthResult == false)
            return false;
        DescribeResourceCollectionHealthResult other = (DescribeResourceCollectionHealthResult) obj;
        if (other.getCloudFormation() == null ^ this.getCloudFormation() == null)
            return false;
        if (other.getCloudFormation() != null && other.getCloudFormation().equals(this.getCloudFormation()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
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

        hashCode = prime * hashCode + ((getCloudFormation() == null) ? 0 : getCloudFormation().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeResourceCollectionHealthResult clone() {
        try {
            return (DescribeResourceCollectionHealthResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

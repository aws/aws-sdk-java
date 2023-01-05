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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListEntitledApplications" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEntitledApplicationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stack with which the entitlement is associated.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The name of the entitlement.
     * </p>
     */
    private String entitlementName;
    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum size of each page of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the stack with which the entitlement is associated.
     * </p>
     * 
     * @param stackName
     *        The name of the stack with which the entitlement is associated.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack with which the entitlement is associated.
     * </p>
     * 
     * @return The name of the stack with which the entitlement is associated.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name of the stack with which the entitlement is associated.
     * </p>
     * 
     * @param stackName
     *        The name of the stack with which the entitlement is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitledApplicationsRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The name of the entitlement.
     * </p>
     * 
     * @param entitlementName
     *        The name of the entitlement.
     */

    public void setEntitlementName(String entitlementName) {
        this.entitlementName = entitlementName;
    }

    /**
     * <p>
     * The name of the entitlement.
     * </p>
     * 
     * @return The name of the entitlement.
     */

    public String getEntitlementName() {
        return this.entitlementName;
    }

    /**
     * <p>
     * The name of the entitlement.
     * </p>
     * 
     * @param entitlementName
     *        The name of the entitlement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitledApplicationsRequest withEntitlementName(String entitlementName) {
        setEntitlementName(entitlementName);
        return this;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @return The pagination token used to retrieve the next page of results for this operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitledApplicationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum size of each page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of each page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum size of each page of results.
     * </p>
     * 
     * @return The maximum size of each page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum size of each page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of each page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitledApplicationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getEntitlementName() != null)
            sb.append("EntitlementName: ").append(getEntitlementName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEntitledApplicationsRequest == false)
            return false;
        ListEntitledApplicationsRequest other = (ListEntitledApplicationsRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getEntitlementName() == null ^ this.getEntitlementName() == null)
            return false;
        if (other.getEntitlementName() != null && other.getEntitlementName().equals(this.getEntitlementName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getEntitlementName() == null) ? 0 : getEntitlementName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListEntitledApplicationsRequest clone() {
        return (ListEntitledApplicationsRequest) super.clone();
    }

}

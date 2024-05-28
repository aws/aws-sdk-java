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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeApplicationAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of associations to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The identifier of the specified application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The resource type of the associated resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> associatedResourceTypes;

    /**
     * <p>
     * The maximum number of associations to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of associations to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of associations to return.
     * </p>
     * 
     * @return The maximum number of associations to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of associations to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of associations to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationAssociationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *        receive the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @return If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *         receive the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *        receive the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationAssociationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the specified application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the specified application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the specified application.
     * </p>
     * 
     * @return The identifier of the specified application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the specified application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the specified application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationAssociationsRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The resource type of the associated resources.
     * </p>
     * 
     * @return The resource type of the associated resources.
     * @see ApplicationAssociatedResourceType
     */

    public java.util.List<String> getAssociatedResourceTypes() {
        if (associatedResourceTypes == null) {
            associatedResourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return associatedResourceTypes;
    }

    /**
     * <p>
     * The resource type of the associated resources.
     * </p>
     * 
     * @param associatedResourceTypes
     *        The resource type of the associated resources.
     * @see ApplicationAssociatedResourceType
     */

    public void setAssociatedResourceTypes(java.util.Collection<String> associatedResourceTypes) {
        if (associatedResourceTypes == null) {
            this.associatedResourceTypes = null;
            return;
        }

        this.associatedResourceTypes = new com.amazonaws.internal.SdkInternalList<String>(associatedResourceTypes);
    }

    /**
     * <p>
     * The resource type of the associated resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedResourceTypes(java.util.Collection)} or
     * {@link #withAssociatedResourceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param associatedResourceTypes
     *        The resource type of the associated resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationAssociatedResourceType
     */

    public DescribeApplicationAssociationsRequest withAssociatedResourceTypes(String... associatedResourceTypes) {
        if (this.associatedResourceTypes == null) {
            setAssociatedResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(associatedResourceTypes.length));
        }
        for (String ele : associatedResourceTypes) {
            this.associatedResourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource type of the associated resources.
     * </p>
     * 
     * @param associatedResourceTypes
     *        The resource type of the associated resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationAssociatedResourceType
     */

    public DescribeApplicationAssociationsRequest withAssociatedResourceTypes(java.util.Collection<String> associatedResourceTypes) {
        setAssociatedResourceTypes(associatedResourceTypes);
        return this;
    }

    /**
     * <p>
     * The resource type of the associated resources.
     * </p>
     * 
     * @param associatedResourceTypes
     *        The resource type of the associated resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationAssociatedResourceType
     */

    public DescribeApplicationAssociationsRequest withAssociatedResourceTypes(ApplicationAssociatedResourceType... associatedResourceTypes) {
        com.amazonaws.internal.SdkInternalList<String> associatedResourceTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                associatedResourceTypes.length);
        for (ApplicationAssociatedResourceType value : associatedResourceTypes) {
            associatedResourceTypesCopy.add(value.toString());
        }
        if (getAssociatedResourceTypes() == null) {
            setAssociatedResourceTypes(associatedResourceTypesCopy);
        } else {
            getAssociatedResourceTypes().addAll(associatedResourceTypesCopy);
        }
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getAssociatedResourceTypes() != null)
            sb.append("AssociatedResourceTypes: ").append(getAssociatedResourceTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationAssociationsRequest == false)
            return false;
        DescribeApplicationAssociationsRequest other = (DescribeApplicationAssociationsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getAssociatedResourceTypes() == null ^ this.getAssociatedResourceTypes() == null)
            return false;
        if (other.getAssociatedResourceTypes() != null && other.getAssociatedResourceTypes().equals(this.getAssociatedResourceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getAssociatedResourceTypes() == null) ? 0 : getAssociatedResourceTypes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationAssociationsRequest clone() {
        return (DescribeApplicationAssociationsRequest) super.clone();
    }

}

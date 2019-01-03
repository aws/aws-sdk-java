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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisionedProductPlan"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProvisionedProductPlanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the plan.
     * </p>
     */
    private ProvisionedProductPlanDetails provisionedProductPlanDetails;
    /**
     * <p>
     * Information about the resource changes that will occur when the plan is executed.
     * </p>
     */
    private java.util.List<ResourceChange> resourceChanges;
    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * Information about the plan.
     * </p>
     * 
     * @param provisionedProductPlanDetails
     *        Information about the plan.
     */

    public void setProvisionedProductPlanDetails(ProvisionedProductPlanDetails provisionedProductPlanDetails) {
        this.provisionedProductPlanDetails = provisionedProductPlanDetails;
    }

    /**
     * <p>
     * Information about the plan.
     * </p>
     * 
     * @return Information about the plan.
     */

    public ProvisionedProductPlanDetails getProvisionedProductPlanDetails() {
        return this.provisionedProductPlanDetails;
    }

    /**
     * <p>
     * Information about the plan.
     * </p>
     * 
     * @param provisionedProductPlanDetails
     *        Information about the plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisionedProductPlanResult withProvisionedProductPlanDetails(ProvisionedProductPlanDetails provisionedProductPlanDetails) {
        setProvisionedProductPlanDetails(provisionedProductPlanDetails);
        return this;
    }

    /**
     * <p>
     * Information about the resource changes that will occur when the plan is executed.
     * </p>
     * 
     * @return Information about the resource changes that will occur when the plan is executed.
     */

    public java.util.List<ResourceChange> getResourceChanges() {
        return resourceChanges;
    }

    /**
     * <p>
     * Information about the resource changes that will occur when the plan is executed.
     * </p>
     * 
     * @param resourceChanges
     *        Information about the resource changes that will occur when the plan is executed.
     */

    public void setResourceChanges(java.util.Collection<ResourceChange> resourceChanges) {
        if (resourceChanges == null) {
            this.resourceChanges = null;
            return;
        }

        this.resourceChanges = new java.util.ArrayList<ResourceChange>(resourceChanges);
    }

    /**
     * <p>
     * Information about the resource changes that will occur when the plan is executed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceChanges(java.util.Collection)} or {@link #withResourceChanges(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourceChanges
     *        Information about the resource changes that will occur when the plan is executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisionedProductPlanResult withResourceChanges(ResourceChange... resourceChanges) {
        if (this.resourceChanges == null) {
            setResourceChanges(new java.util.ArrayList<ResourceChange>(resourceChanges.length));
        }
        for (ResourceChange ele : resourceChanges) {
            this.resourceChanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resource changes that will occur when the plan is executed.
     * </p>
     * 
     * @param resourceChanges
     *        Information about the resource changes that will occur when the plan is executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisionedProductPlanResult withResourceChanges(java.util.Collection<ResourceChange> resourceChanges) {
        setResourceChanges(resourceChanges);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @return The page token to use to retrieve the next set of results. If there are no additional results, this value
     *         is null.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisionedProductPlanResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getProvisionedProductPlanDetails() != null)
            sb.append("ProvisionedProductPlanDetails: ").append(getProvisionedProductPlanDetails()).append(",");
        if (getResourceChanges() != null)
            sb.append("ResourceChanges: ").append(getResourceChanges()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProvisionedProductPlanResult == false)
            return false;
        DescribeProvisionedProductPlanResult other = (DescribeProvisionedProductPlanResult) obj;
        if (other.getProvisionedProductPlanDetails() == null ^ this.getProvisionedProductPlanDetails() == null)
            return false;
        if (other.getProvisionedProductPlanDetails() != null
                && other.getProvisionedProductPlanDetails().equals(this.getProvisionedProductPlanDetails()) == false)
            return false;
        if (other.getResourceChanges() == null ^ this.getResourceChanges() == null)
            return false;
        if (other.getResourceChanges() != null && other.getResourceChanges().equals(this.getResourceChanges()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisionedProductPlanDetails() == null) ? 0 : getProvisionedProductPlanDetails().hashCode());
        hashCode = prime * hashCode + ((getResourceChanges() == null) ? 0 : getResourceChanges().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProvisionedProductPlanResult clone() {
        try {
            return (DescribeProvisionedProductPlanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

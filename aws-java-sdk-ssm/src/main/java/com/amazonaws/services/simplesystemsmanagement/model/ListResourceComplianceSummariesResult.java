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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListResourceComplianceSummaries"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceComplianceSummariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A summary count for specified or targeted managed instances. Summary count includes information about compliant
     * and non-compliant State Manager associations, patch status, or custom items according to the filter criteria that
     * you specify.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceComplianceSummaryItem> resourceComplianceSummaryItems;
    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A summary count for specified or targeted managed instances. Summary count includes information about compliant
     * and non-compliant State Manager associations, patch status, or custom items according to the filter criteria that
     * you specify.
     * </p>
     * 
     * @return A summary count for specified or targeted managed instances. Summary count includes information about
     *         compliant and non-compliant State Manager associations, patch status, or custom items according to the
     *         filter criteria that you specify.
     */

    public java.util.List<ResourceComplianceSummaryItem> getResourceComplianceSummaryItems() {
        if (resourceComplianceSummaryItems == null) {
            resourceComplianceSummaryItems = new com.amazonaws.internal.SdkInternalList<ResourceComplianceSummaryItem>();
        }
        return resourceComplianceSummaryItems;
    }

    /**
     * <p>
     * A summary count for specified or targeted managed instances. Summary count includes information about compliant
     * and non-compliant State Manager associations, patch status, or custom items according to the filter criteria that
     * you specify.
     * </p>
     * 
     * @param resourceComplianceSummaryItems
     *        A summary count for specified or targeted managed instances. Summary count includes information about
     *        compliant and non-compliant State Manager associations, patch status, or custom items according to the
     *        filter criteria that you specify.
     */

    public void setResourceComplianceSummaryItems(java.util.Collection<ResourceComplianceSummaryItem> resourceComplianceSummaryItems) {
        if (resourceComplianceSummaryItems == null) {
            this.resourceComplianceSummaryItems = null;
            return;
        }

        this.resourceComplianceSummaryItems = new com.amazonaws.internal.SdkInternalList<ResourceComplianceSummaryItem>(resourceComplianceSummaryItems);
    }

    /**
     * <p>
     * A summary count for specified or targeted managed instances. Summary count includes information about compliant
     * and non-compliant State Manager associations, patch status, or custom items according to the filter criteria that
     * you specify.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceComplianceSummaryItems(java.util.Collection)} or
     * {@link #withResourceComplianceSummaryItems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceComplianceSummaryItems
     *        A summary count for specified or targeted managed instances. Summary count includes information about
     *        compliant and non-compliant State Manager associations, patch status, or custom items according to the
     *        filter criteria that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceComplianceSummariesResult withResourceComplianceSummaryItems(ResourceComplianceSummaryItem... resourceComplianceSummaryItems) {
        if (this.resourceComplianceSummaryItems == null) {
            setResourceComplianceSummaryItems(new com.amazonaws.internal.SdkInternalList<ResourceComplianceSummaryItem>(resourceComplianceSummaryItems.length));
        }
        for (ResourceComplianceSummaryItem ele : resourceComplianceSummaryItems) {
            this.resourceComplianceSummaryItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A summary count for specified or targeted managed instances. Summary count includes information about compliant
     * and non-compliant State Manager associations, patch status, or custom items according to the filter criteria that
     * you specify.
     * </p>
     * 
     * @param resourceComplianceSummaryItems
     *        A summary count for specified or targeted managed instances. Summary count includes information about
     *        compliant and non-compliant State Manager associations, patch status, or custom items according to the
     *        filter criteria that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceComplianceSummariesResult withResourceComplianceSummaryItems(
            java.util.Collection<ResourceComplianceSummaryItem> resourceComplianceSummaryItems) {
        setResourceComplianceSummaryItems(resourceComplianceSummaryItems);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @return The token for the next set of items to return. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceComplianceSummariesResult withNextToken(String nextToken) {
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
        if (getResourceComplianceSummaryItems() != null)
            sb.append("ResourceComplianceSummaryItems: ").append(getResourceComplianceSummaryItems()).append(",");
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

        if (obj instanceof ListResourceComplianceSummariesResult == false)
            return false;
        ListResourceComplianceSummariesResult other = (ListResourceComplianceSummariesResult) obj;
        if (other.getResourceComplianceSummaryItems() == null ^ this.getResourceComplianceSummaryItems() == null)
            return false;
        if (other.getResourceComplianceSummaryItems() != null
                && other.getResourceComplianceSummaryItems().equals(this.getResourceComplianceSummaryItems()) == false)
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

        hashCode = prime * hashCode + ((getResourceComplianceSummaryItems() == null) ? 0 : getResourceComplianceSummaryItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceComplianceSummariesResult clone() {
        try {
            return (ListResourceComplianceSummariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

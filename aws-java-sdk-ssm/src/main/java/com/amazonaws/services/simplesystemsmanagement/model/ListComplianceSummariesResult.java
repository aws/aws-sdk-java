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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListComplianceSummaries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComplianceSummariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of compliant and non-compliant summary counts based on compliance types. For example, this call returns
     * State Manager associations, patches, or custom compliance types according to the filter criteria that you
     * specified.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ComplianceSummaryItem> complianceSummaryItems;
    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of compliant and non-compliant summary counts based on compliance types. For example, this call returns
     * State Manager associations, patches, or custom compliance types according to the filter criteria that you
     * specified.
     * </p>
     * 
     * @return A list of compliant and non-compliant summary counts based on compliance types. For example, this call
     *         returns State Manager associations, patches, or custom compliance types according to the filter criteria
     *         that you specified.
     */

    public java.util.List<ComplianceSummaryItem> getComplianceSummaryItems() {
        if (complianceSummaryItems == null) {
            complianceSummaryItems = new com.amazonaws.internal.SdkInternalList<ComplianceSummaryItem>();
        }
        return complianceSummaryItems;
    }

    /**
     * <p>
     * A list of compliant and non-compliant summary counts based on compliance types. For example, this call returns
     * State Manager associations, patches, or custom compliance types according to the filter criteria that you
     * specified.
     * </p>
     * 
     * @param complianceSummaryItems
     *        A list of compliant and non-compliant summary counts based on compliance types. For example, this call
     *        returns State Manager associations, patches, or custom compliance types according to the filter criteria
     *        that you specified.
     */

    public void setComplianceSummaryItems(java.util.Collection<ComplianceSummaryItem> complianceSummaryItems) {
        if (complianceSummaryItems == null) {
            this.complianceSummaryItems = null;
            return;
        }

        this.complianceSummaryItems = new com.amazonaws.internal.SdkInternalList<ComplianceSummaryItem>(complianceSummaryItems);
    }

    /**
     * <p>
     * A list of compliant and non-compliant summary counts based on compliance types. For example, this call returns
     * State Manager associations, patches, or custom compliance types according to the filter criteria that you
     * specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComplianceSummaryItems(java.util.Collection)} or
     * {@link #withComplianceSummaryItems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param complianceSummaryItems
     *        A list of compliant and non-compliant summary counts based on compliance types. For example, this call
     *        returns State Manager associations, patches, or custom compliance types according to the filter criteria
     *        that you specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceSummariesResult withComplianceSummaryItems(ComplianceSummaryItem... complianceSummaryItems) {
        if (this.complianceSummaryItems == null) {
            setComplianceSummaryItems(new com.amazonaws.internal.SdkInternalList<ComplianceSummaryItem>(complianceSummaryItems.length));
        }
        for (ComplianceSummaryItem ele : complianceSummaryItems) {
            this.complianceSummaryItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of compliant and non-compliant summary counts based on compliance types. For example, this call returns
     * State Manager associations, patches, or custom compliance types according to the filter criteria that you
     * specified.
     * </p>
     * 
     * @param complianceSummaryItems
     *        A list of compliant and non-compliant summary counts based on compliance types. For example, this call
     *        returns State Manager associations, patches, or custom compliance types according to the filter criteria
     *        that you specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceSummariesResult withComplianceSummaryItems(java.util.Collection<ComplianceSummaryItem> complianceSummaryItems) {
        setComplianceSummaryItems(complianceSummaryItems);
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

    public ListComplianceSummariesResult withNextToken(String nextToken) {
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
        if (getComplianceSummaryItems() != null)
            sb.append("ComplianceSummaryItems: ").append(getComplianceSummaryItems()).append(",");
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

        if (obj instanceof ListComplianceSummariesResult == false)
            return false;
        ListComplianceSummariesResult other = (ListComplianceSummariesResult) obj;
        if (other.getComplianceSummaryItems() == null ^ this.getComplianceSummaryItems() == null)
            return false;
        if (other.getComplianceSummaryItems() != null && other.getComplianceSummaryItems().equals(this.getComplianceSummaryItems()) == false)
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

        hashCode = prime * hashCode + ((getComplianceSummaryItems() == null) ? 0 : getComplianceSummaryItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListComplianceSummariesResult clone() {
        try {
            return (ListComplianceSummariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

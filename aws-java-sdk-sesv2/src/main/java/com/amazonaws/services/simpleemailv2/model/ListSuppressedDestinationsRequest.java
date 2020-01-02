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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to obtain a list of email destinations that are on the suppression list for your account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListSuppressedDestinations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSuppressedDestinationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The factors that caused the email address to be added to .
     * </p>
     */
    private java.util.List<String> reasons;
    /**
     * <p>
     * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to
     * the list after a specific date. The date that you specify should be in Unix time format.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to
     * the list before a specific date. The date that you specify should be in Unix time format.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * A token returned from a previous call to <code>ListSuppressedDestinations</code> to indicate the position in the
     * list of suppressed email addresses.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of results to show in a single call to <code>ListSuppressedDestinations</code>. If the number of
     * results is larger than the number you specified in this parameter, then the response includes a
     * <code>NextToken</code> element, which you can use to obtain additional results.
     * </p>
     */
    private Integer pageSize;

    /**
     * <p>
     * The factors that caused the email address to be added to .
     * </p>
     * 
     * @return The factors that caused the email address to be added to .
     * @see SuppressionListReason
     */

    public java.util.List<String> getReasons() {
        return reasons;
    }

    /**
     * <p>
     * The factors that caused the email address to be added to .
     * </p>
     * 
     * @param reasons
     *        The factors that caused the email address to be added to .
     * @see SuppressionListReason
     */

    public void setReasons(java.util.Collection<String> reasons) {
        if (reasons == null) {
            this.reasons = null;
            return;
        }

        this.reasons = new java.util.ArrayList<String>(reasons);
    }

    /**
     * <p>
     * The factors that caused the email address to be added to .
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReasons(java.util.Collection)} or {@link #withReasons(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param reasons
     *        The factors that caused the email address to be added to .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionListReason
     */

    public ListSuppressedDestinationsRequest withReasons(String... reasons) {
        if (this.reasons == null) {
            setReasons(new java.util.ArrayList<String>(reasons.length));
        }
        for (String ele : reasons) {
            this.reasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The factors that caused the email address to be added to .
     * </p>
     * 
     * @param reasons
     *        The factors that caused the email address to be added to .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionListReason
     */

    public ListSuppressedDestinationsRequest withReasons(java.util.Collection<String> reasons) {
        setReasons(reasons);
        return this;
    }

    /**
     * <p>
     * The factors that caused the email address to be added to .
     * </p>
     * 
     * @param reasons
     *        The factors that caused the email address to be added to .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionListReason
     */

    public ListSuppressedDestinationsRequest withReasons(SuppressionListReason... reasons) {
        java.util.ArrayList<String> reasonsCopy = new java.util.ArrayList<String>(reasons.length);
        for (SuppressionListReason value : reasons) {
            reasonsCopy.add(value.toString());
        }
        if (getReasons() == null) {
            setReasons(reasonsCopy);
        } else {
            getReasons().addAll(reasonsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to
     * the list after a specific date. The date that you specify should be in Unix time format.
     * </p>
     * 
     * @param startDate
     *        Used to filter the list of suppressed email destinations so that it only includes addresses that were
     *        added to the list after a specific date. The date that you specify should be in Unix time format.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to
     * the list after a specific date. The date that you specify should be in Unix time format.
     * </p>
     * 
     * @return Used to filter the list of suppressed email destinations so that it only includes addresses that were
     *         added to the list after a specific date. The date that you specify should be in Unix time format.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to
     * the list after a specific date. The date that you specify should be in Unix time format.
     * </p>
     * 
     * @param startDate
     *        Used to filter the list of suppressed email destinations so that it only includes addresses that were
     *        added to the list after a specific date. The date that you specify should be in Unix time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuppressedDestinationsRequest withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to
     * the list before a specific date. The date that you specify should be in Unix time format.
     * </p>
     * 
     * @param endDate
     *        Used to filter the list of suppressed email destinations so that it only includes addresses that were
     *        added to the list before a specific date. The date that you specify should be in Unix time format.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to
     * the list before a specific date. The date that you specify should be in Unix time format.
     * </p>
     * 
     * @return Used to filter the list of suppressed email destinations so that it only includes addresses that were
     *         added to the list before a specific date. The date that you specify should be in Unix time format.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to
     * the list before a specific date. The date that you specify should be in Unix time format.
     * </p>
     * 
     * @param endDate
     *        Used to filter the list of suppressed email destinations so that it only includes addresses that were
     *        added to the list before a specific date. The date that you specify should be in Unix time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuppressedDestinationsRequest withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListSuppressedDestinations</code> to indicate the position in the
     * list of suppressed email addresses.
     * </p>
     * 
     * @param nextToken
     *        A token returned from a previous call to <code>ListSuppressedDestinations</code> to indicate the position
     *        in the list of suppressed email addresses.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListSuppressedDestinations</code> to indicate the position in the
     * list of suppressed email addresses.
     * </p>
     * 
     * @return A token returned from a previous call to <code>ListSuppressedDestinations</code> to indicate the position
     *         in the list of suppressed email addresses.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListSuppressedDestinations</code> to indicate the position in the
     * list of suppressed email addresses.
     * </p>
     * 
     * @param nextToken
     *        A token returned from a previous call to <code>ListSuppressedDestinations</code> to indicate the position
     *        in the list of suppressed email addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuppressedDestinationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of results to show in a single call to <code>ListSuppressedDestinations</code>. If the number of
     * results is larger than the number you specified in this parameter, then the response includes a
     * <code>NextToken</code> element, which you can use to obtain additional results.
     * </p>
     * 
     * @param pageSize
     *        The number of results to show in a single call to <code>ListSuppressedDestinations</code>. If the number
     *        of results is larger than the number you specified in this parameter, then the response includes a
     *        <code>NextToken</code> element, which you can use to obtain additional results.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The number of results to show in a single call to <code>ListSuppressedDestinations</code>. If the number of
     * results is larger than the number you specified in this parameter, then the response includes a
     * <code>NextToken</code> element, which you can use to obtain additional results.
     * </p>
     * 
     * @return The number of results to show in a single call to <code>ListSuppressedDestinations</code>. If the number
     *         of results is larger than the number you specified in this parameter, then the response includes a
     *         <code>NextToken</code> element, which you can use to obtain additional results.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The number of results to show in a single call to <code>ListSuppressedDestinations</code>. If the number of
     * results is larger than the number you specified in this parameter, then the response includes a
     * <code>NextToken</code> element, which you can use to obtain additional results.
     * </p>
     * 
     * @param pageSize
     *        The number of results to show in a single call to <code>ListSuppressedDestinations</code>. If the number
     *        of results is larger than the number you specified in this parameter, then the response includes a
     *        <code>NextToken</code> element, which you can use to obtain additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuppressedDestinationsRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
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
        if (getReasons() != null)
            sb.append("Reasons: ").append(getReasons()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSuppressedDestinationsRequest == false)
            return false;
        ListSuppressedDestinationsRequest other = (ListSuppressedDestinationsRequest) obj;
        if (other.getReasons() == null ^ this.getReasons() == null)
            return false;
        if (other.getReasons() != null && other.getReasons().equals(this.getReasons()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReasons() == null) ? 0 : getReasons().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public ListSuppressedDestinationsRequest clone() {
        return (ListSuppressedDestinationsRequest) super.clone();
    }

}

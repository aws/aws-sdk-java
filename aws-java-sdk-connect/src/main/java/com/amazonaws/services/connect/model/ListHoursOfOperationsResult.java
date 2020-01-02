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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListHoursOfOperations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHoursOfOperationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the hours of operation.
     * </p>
     */
    private java.util.List<HoursOfOperationSummary> hoursOfOperationSummaryList;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the hours of operation.
     * </p>
     * 
     * @return Information about the hours of operation.
     */

    public java.util.List<HoursOfOperationSummary> getHoursOfOperationSummaryList() {
        return hoursOfOperationSummaryList;
    }

    /**
     * <p>
     * Information about the hours of operation.
     * </p>
     * 
     * @param hoursOfOperationSummaryList
     *        Information about the hours of operation.
     */

    public void setHoursOfOperationSummaryList(java.util.Collection<HoursOfOperationSummary> hoursOfOperationSummaryList) {
        if (hoursOfOperationSummaryList == null) {
            this.hoursOfOperationSummaryList = null;
            return;
        }

        this.hoursOfOperationSummaryList = new java.util.ArrayList<HoursOfOperationSummary>(hoursOfOperationSummaryList);
    }

    /**
     * <p>
     * Information about the hours of operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHoursOfOperationSummaryList(java.util.Collection)} or
     * {@link #withHoursOfOperationSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param hoursOfOperationSummaryList
     *        Information about the hours of operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHoursOfOperationsResult withHoursOfOperationSummaryList(HoursOfOperationSummary... hoursOfOperationSummaryList) {
        if (this.hoursOfOperationSummaryList == null) {
            setHoursOfOperationSummaryList(new java.util.ArrayList<HoursOfOperationSummary>(hoursOfOperationSummaryList.length));
        }
        for (HoursOfOperationSummary ele : hoursOfOperationSummaryList) {
            this.hoursOfOperationSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the hours of operation.
     * </p>
     * 
     * @param hoursOfOperationSummaryList
     *        Information about the hours of operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHoursOfOperationsResult withHoursOfOperationSummaryList(java.util.Collection<HoursOfOperationSummary> hoursOfOperationSummaryList) {
        setHoursOfOperationSummaryList(hoursOfOperationSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHoursOfOperationsResult withNextToken(String nextToken) {
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
        if (getHoursOfOperationSummaryList() != null)
            sb.append("HoursOfOperationSummaryList: ").append(getHoursOfOperationSummaryList()).append(",");
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

        if (obj instanceof ListHoursOfOperationsResult == false)
            return false;
        ListHoursOfOperationsResult other = (ListHoursOfOperationsResult) obj;
        if (other.getHoursOfOperationSummaryList() == null ^ this.getHoursOfOperationSummaryList() == null)
            return false;
        if (other.getHoursOfOperationSummaryList() != null && other.getHoursOfOperationSummaryList().equals(this.getHoursOfOperationSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getHoursOfOperationSummaryList() == null) ? 0 : getHoursOfOperationSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHoursOfOperationsResult clone() {
        try {
            return (ListHoursOfOperationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

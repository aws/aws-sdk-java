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
package com.amazonaws.services.worklink.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListFleets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFleetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The summary list of the fleets.
     * </p>
     */
    private java.util.List<FleetSummary> fleetSummaryList;
    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The summary list of the fleets.
     * </p>
     * 
     * @return The summary list of the fleets.
     */

    public java.util.List<FleetSummary> getFleetSummaryList() {
        return fleetSummaryList;
    }

    /**
     * <p>
     * The summary list of the fleets.
     * </p>
     * 
     * @param fleetSummaryList
     *        The summary list of the fleets.
     */

    public void setFleetSummaryList(java.util.Collection<FleetSummary> fleetSummaryList) {
        if (fleetSummaryList == null) {
            this.fleetSummaryList = null;
            return;
        }

        this.fleetSummaryList = new java.util.ArrayList<FleetSummary>(fleetSummaryList);
    }

    /**
     * <p>
     * The summary list of the fleets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleetSummaryList(java.util.Collection)} or {@link #withFleetSummaryList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param fleetSummaryList
     *        The summary list of the fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsResult withFleetSummaryList(FleetSummary... fleetSummaryList) {
        if (this.fleetSummaryList == null) {
            setFleetSummaryList(new java.util.ArrayList<FleetSummary>(fleetSummaryList.length));
        }
        for (FleetSummary ele : fleetSummaryList) {
            this.fleetSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summary list of the fleets.
     * </p>
     * 
     * @param fleetSummaryList
     *        The summary list of the fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsResult withFleetSummaryList(java.util.Collection<FleetSummary> fleetSummaryList) {
        setFleetSummaryList(fleetSummaryList);
        return this;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @return The pagination token used to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsResult withNextToken(String nextToken) {
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
        if (getFleetSummaryList() != null)
            sb.append("FleetSummaryList: ").append(getFleetSummaryList()).append(",");
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

        if (obj instanceof ListFleetsResult == false)
            return false;
        ListFleetsResult other = (ListFleetsResult) obj;
        if (other.getFleetSummaryList() == null ^ this.getFleetSummaryList() == null)
            return false;
        if (other.getFleetSummaryList() != null && other.getFleetSummaryList().equals(this.getFleetSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getFleetSummaryList() == null) ? 0 : getFleetSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFleetsResult clone() {
        try {
            return (ListFleetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

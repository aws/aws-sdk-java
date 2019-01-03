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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListFleets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFleetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of fleet details meeting the request criteria.
     * </p>
     */
    private java.util.List<Fleet> fleetDetails;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListDeploymentJobs</code> request. When the results
     * of a <code>ListFleets</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of fleet details meeting the request criteria.
     * </p>
     * 
     * @return A list of fleet details meeting the request criteria.
     */

    public java.util.List<Fleet> getFleetDetails() {
        return fleetDetails;
    }

    /**
     * <p>
     * A list of fleet details meeting the request criteria.
     * </p>
     * 
     * @param fleetDetails
     *        A list of fleet details meeting the request criteria.
     */

    public void setFleetDetails(java.util.Collection<Fleet> fleetDetails) {
        if (fleetDetails == null) {
            this.fleetDetails = null;
            return;
        }

        this.fleetDetails = new java.util.ArrayList<Fleet>(fleetDetails);
    }

    /**
     * <p>
     * A list of fleet details meeting the request criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleetDetails(java.util.Collection)} or {@link #withFleetDetails(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fleetDetails
     *        A list of fleet details meeting the request criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsResult withFleetDetails(Fleet... fleetDetails) {
        if (this.fleetDetails == null) {
            setFleetDetails(new java.util.ArrayList<Fleet>(fleetDetails.length));
        }
        for (Fleet ele : fleetDetails) {
            this.fleetDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of fleet details meeting the request criteria.
     * </p>
     * 
     * @param fleetDetails
     *        A list of fleet details meeting the request criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsResult withFleetDetails(java.util.Collection<Fleet> fleetDetails) {
        setFleetDetails(fleetDetails);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListDeploymentJobs</code> request. When the results
     * of a <code>ListFleets</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListDeploymentJobs</code> request. When the
     *        results of a <code>ListFleets</code> request exceed <code>maxResults</code>, this value can be used to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListDeploymentJobs</code> request. When the results
     * of a <code>ListFleets</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListDeploymentJobs</code> request. When the
     *         results of a <code>ListFleets</code> request exceed <code>maxResults</code>, this value can be used to
     *         retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *         return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListDeploymentJobs</code> request. When the results
     * of a <code>ListFleets</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListDeploymentJobs</code> request. When the
     *        results of a <code>ListFleets</code> request exceed <code>maxResults</code>, this value can be used to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
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
        if (getFleetDetails() != null)
            sb.append("FleetDetails: ").append(getFleetDetails()).append(",");
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
        if (other.getFleetDetails() == null ^ this.getFleetDetails() == null)
            return false;
        if (other.getFleetDetails() != null && other.getFleetDetails().equals(this.getFleetDetails()) == false)
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

        hashCode = prime * hashCode + ((getFleetDetails() == null) ? 0 : getFleetDetails().hashCode());
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

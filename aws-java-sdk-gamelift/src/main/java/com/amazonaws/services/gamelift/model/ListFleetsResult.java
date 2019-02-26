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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListFleets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFleetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Set of fleet IDs matching the list request. You can retrieve additional information about all returned fleets by
     * passing this result set to a call to <a>DescribeFleetAttributes</a>, <a>DescribeFleetCapacity</a>, or
     * <a>DescribeFleetUtilization</a>.
     * </p>
     */
    private java.util.List<String> fleetIds;
    /**
     * <p>
     * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Set of fleet IDs matching the list request. You can retrieve additional information about all returned fleets by
     * passing this result set to a call to <a>DescribeFleetAttributes</a>, <a>DescribeFleetCapacity</a>, or
     * <a>DescribeFleetUtilization</a>.
     * </p>
     * 
     * @return Set of fleet IDs matching the list request. You can retrieve additional information about all returned
     *         fleets by passing this result set to a call to <a>DescribeFleetAttributes</a>,
     *         <a>DescribeFleetCapacity</a>, or <a>DescribeFleetUtilization</a>.
     */

    public java.util.List<String> getFleetIds() {
        return fleetIds;
    }

    /**
     * <p>
     * Set of fleet IDs matching the list request. You can retrieve additional information about all returned fleets by
     * passing this result set to a call to <a>DescribeFleetAttributes</a>, <a>DescribeFleetCapacity</a>, or
     * <a>DescribeFleetUtilization</a>.
     * </p>
     * 
     * @param fleetIds
     *        Set of fleet IDs matching the list request. You can retrieve additional information about all returned
     *        fleets by passing this result set to a call to <a>DescribeFleetAttributes</a>,
     *        <a>DescribeFleetCapacity</a>, or <a>DescribeFleetUtilization</a>.
     */

    public void setFleetIds(java.util.Collection<String> fleetIds) {
        if (fleetIds == null) {
            this.fleetIds = null;
            return;
        }

        this.fleetIds = new java.util.ArrayList<String>(fleetIds);
    }

    /**
     * <p>
     * Set of fleet IDs matching the list request. You can retrieve additional information about all returned fleets by
     * passing this result set to a call to <a>DescribeFleetAttributes</a>, <a>DescribeFleetCapacity</a>, or
     * <a>DescribeFleetUtilization</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleetIds(java.util.Collection)} or {@link #withFleetIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param fleetIds
     *        Set of fleet IDs matching the list request. You can retrieve additional information about all returned
     *        fleets by passing this result set to a call to <a>DescribeFleetAttributes</a>,
     *        <a>DescribeFleetCapacity</a>, or <a>DescribeFleetUtilization</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsResult withFleetIds(String... fleetIds) {
        if (this.fleetIds == null) {
            setFleetIds(new java.util.ArrayList<String>(fleetIds.length));
        }
        for (String ele : fleetIds) {
            this.fleetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Set of fleet IDs matching the list request. You can retrieve additional information about all returned fleets by
     * passing this result set to a call to <a>DescribeFleetAttributes</a>, <a>DescribeFleetCapacity</a>, or
     * <a>DescribeFleetUtilization</a>.
     * </p>
     * 
     * @param fleetIds
     *        Set of fleet IDs matching the list request. You can retrieve additional information about all returned
     *        fleets by passing this result set to a call to <a>DescribeFleetAttributes</a>,
     *        <a>DescribeFleetCapacity</a>, or <a>DescribeFleetUtilization</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsResult withFleetIds(java.util.Collection<String> fleetIds) {
        setFleetIds(fleetIds);
        return this;
    }

    /**
     * <p>
     * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        Token that indicates where to resume retrieving results on the next call to this action. If no token is
     *        returned, these results represent the end of the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     * 
     * @return Token that indicates where to resume retrieving results on the next call to this action. If no token is
     *         returned, these results represent the end of the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        Token that indicates where to resume retrieving results on the next call to this action. If no token is
     *        returned, these results represent the end of the list.
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
        if (getFleetIds() != null)
            sb.append("FleetIds: ").append(getFleetIds()).append(",");
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
        if (other.getFleetIds() == null ^ this.getFleetIds() == null)
            return false;
        if (other.getFleetIds() != null && other.getFleetIds().equals(this.getFleetIds()) == false)
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

        hashCode = prime * hashCode + ((getFleetIds() == null) ? 0 : getFleetIds().hashCode());
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

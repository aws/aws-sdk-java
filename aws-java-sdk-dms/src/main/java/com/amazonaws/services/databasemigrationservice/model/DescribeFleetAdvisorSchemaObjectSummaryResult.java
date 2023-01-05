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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeFleetAdvisorSchemaObjectSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetAdvisorSchemaObjectSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A collection of <code>FleetAdvisorSchemaObjectResponse</code> objects.
     * </p>
     */
    private java.util.List<FleetAdvisorSchemaObjectResponse> fleetAdvisorSchemaObjects;
    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A collection of <code>FleetAdvisorSchemaObjectResponse</code> objects.
     * </p>
     * 
     * @return A collection of <code>FleetAdvisorSchemaObjectResponse</code> objects.
     */

    public java.util.List<FleetAdvisorSchemaObjectResponse> getFleetAdvisorSchemaObjects() {
        return fleetAdvisorSchemaObjects;
    }

    /**
     * <p>
     * A collection of <code>FleetAdvisorSchemaObjectResponse</code> objects.
     * </p>
     * 
     * @param fleetAdvisorSchemaObjects
     *        A collection of <code>FleetAdvisorSchemaObjectResponse</code> objects.
     */

    public void setFleetAdvisorSchemaObjects(java.util.Collection<FleetAdvisorSchemaObjectResponse> fleetAdvisorSchemaObjects) {
        if (fleetAdvisorSchemaObjects == null) {
            this.fleetAdvisorSchemaObjects = null;
            return;
        }

        this.fleetAdvisorSchemaObjects = new java.util.ArrayList<FleetAdvisorSchemaObjectResponse>(fleetAdvisorSchemaObjects);
    }

    /**
     * <p>
     * A collection of <code>FleetAdvisorSchemaObjectResponse</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleetAdvisorSchemaObjects(java.util.Collection)} or
     * {@link #withFleetAdvisorSchemaObjects(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param fleetAdvisorSchemaObjects
     *        A collection of <code>FleetAdvisorSchemaObjectResponse</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetAdvisorSchemaObjectSummaryResult withFleetAdvisorSchemaObjects(FleetAdvisorSchemaObjectResponse... fleetAdvisorSchemaObjects) {
        if (this.fleetAdvisorSchemaObjects == null) {
            setFleetAdvisorSchemaObjects(new java.util.ArrayList<FleetAdvisorSchemaObjectResponse>(fleetAdvisorSchemaObjects.length));
        }
        for (FleetAdvisorSchemaObjectResponse ele : fleetAdvisorSchemaObjects) {
            this.fleetAdvisorSchemaObjects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of <code>FleetAdvisorSchemaObjectResponse</code> objects.
     * </p>
     * 
     * @param fleetAdvisorSchemaObjects
     *        A collection of <code>FleetAdvisorSchemaObjectResponse</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetAdvisorSchemaObjectSummaryResult withFleetAdvisorSchemaObjects(
            java.util.Collection<FleetAdvisorSchemaObjectResponse> fleetAdvisorSchemaObjects) {
        setFleetAdvisorSchemaObjects(fleetAdvisorSchemaObjects);
        return this;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned, there are more results available. The value of
     *        <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged.
     * </p>
     * 
     * @return If <code>NextToken</code> is returned, there are more results available. The value of
     *         <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page. Keep all other arguments unchanged.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned, there are more results available. The value of
     *        <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetAdvisorSchemaObjectSummaryResult withNextToken(String nextToken) {
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
        if (getFleetAdvisorSchemaObjects() != null)
            sb.append("FleetAdvisorSchemaObjects: ").append(getFleetAdvisorSchemaObjects()).append(",");
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

        if (obj instanceof DescribeFleetAdvisorSchemaObjectSummaryResult == false)
            return false;
        DescribeFleetAdvisorSchemaObjectSummaryResult other = (DescribeFleetAdvisorSchemaObjectSummaryResult) obj;
        if (other.getFleetAdvisorSchemaObjects() == null ^ this.getFleetAdvisorSchemaObjects() == null)
            return false;
        if (other.getFleetAdvisorSchemaObjects() != null && other.getFleetAdvisorSchemaObjects().equals(this.getFleetAdvisorSchemaObjects()) == false)
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

        hashCode = prime * hashCode + ((getFleetAdvisorSchemaObjects() == null) ? 0 : getFleetAdvisorSchemaObjects().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetAdvisorSchemaObjectSummaryResult clone() {
        try {
            return (DescribeFleetAdvisorSchemaObjectSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

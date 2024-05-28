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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListFlywheels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFlywheelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of flywheel properties retrieved by the service in response to the request.
     * </p>
     */
    private java.util.List<FlywheelSummary> flywheelSummaryList;
    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of flywheel properties retrieved by the service in response to the request.
     * </p>
     * 
     * @return A list of flywheel properties retrieved by the service in response to the request.
     */

    public java.util.List<FlywheelSummary> getFlywheelSummaryList() {
        return flywheelSummaryList;
    }

    /**
     * <p>
     * A list of flywheel properties retrieved by the service in response to the request.
     * </p>
     * 
     * @param flywheelSummaryList
     *        A list of flywheel properties retrieved by the service in response to the request.
     */

    public void setFlywheelSummaryList(java.util.Collection<FlywheelSummary> flywheelSummaryList) {
        if (flywheelSummaryList == null) {
            this.flywheelSummaryList = null;
            return;
        }

        this.flywheelSummaryList = new java.util.ArrayList<FlywheelSummary>(flywheelSummaryList);
    }

    /**
     * <p>
     * A list of flywheel properties retrieved by the service in response to the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFlywheelSummaryList(java.util.Collection)} or {@link #withFlywheelSummaryList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param flywheelSummaryList
     *        A list of flywheel properties retrieved by the service in response to the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlywheelsResult withFlywheelSummaryList(FlywheelSummary... flywheelSummaryList) {
        if (this.flywheelSummaryList == null) {
            setFlywheelSummaryList(new java.util.ArrayList<FlywheelSummary>(flywheelSummaryList.length));
        }
        for (FlywheelSummary ele : flywheelSummaryList) {
            this.flywheelSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of flywheel properties retrieved by the service in response to the request.
     * </p>
     * 
     * @param flywheelSummaryList
     *        A list of flywheel properties retrieved by the service in response to the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlywheelsResult withFlywheelSummaryList(java.util.Collection<FlywheelSummary> flywheelSummaryList) {
        setFlywheelSummaryList(flywheelSummaryList);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @return Identifies the next page of results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlywheelsResult withNextToken(String nextToken) {
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
        if (getFlywheelSummaryList() != null)
            sb.append("FlywheelSummaryList: ").append(getFlywheelSummaryList()).append(",");
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

        if (obj instanceof ListFlywheelsResult == false)
            return false;
        ListFlywheelsResult other = (ListFlywheelsResult) obj;
        if (other.getFlywheelSummaryList() == null ^ this.getFlywheelSummaryList() == null)
            return false;
        if (other.getFlywheelSummaryList() != null && other.getFlywheelSummaryList().equals(this.getFlywheelSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getFlywheelSummaryList() == null) ? 0 : getFlywheelSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFlywheelsResult clone() {
        try {
            return (ListFlywheelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

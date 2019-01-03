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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of the predictive inbox placement test reports that are available for your account, regardless of whether or
 * not those tests are complete.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListDeliverabilityTestReports"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeliverabilityTestReportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An object that contains a lists of predictive inbox placement tests that you've performed.
     * </p>
     */
    private java.util.List<DeliverabilityTestReport> deliverabilityTestReports;
    /**
     * <p>
     * A token that indicates that there are additional predictive inbox placement tests to list. To view additional
     * predictive inbox placement tests, issue another request to <code>ListDeliverabilityTestReports</code>, and pass
     * this token in the <code>NextToken</code> parameter.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An object that contains a lists of predictive inbox placement tests that you've performed.
     * </p>
     * 
     * @return An object that contains a lists of predictive inbox placement tests that you've performed.
     */

    public java.util.List<DeliverabilityTestReport> getDeliverabilityTestReports() {
        return deliverabilityTestReports;
    }

    /**
     * <p>
     * An object that contains a lists of predictive inbox placement tests that you've performed.
     * </p>
     * 
     * @param deliverabilityTestReports
     *        An object that contains a lists of predictive inbox placement tests that you've performed.
     */

    public void setDeliverabilityTestReports(java.util.Collection<DeliverabilityTestReport> deliverabilityTestReports) {
        if (deliverabilityTestReports == null) {
            this.deliverabilityTestReports = null;
            return;
        }

        this.deliverabilityTestReports = new java.util.ArrayList<DeliverabilityTestReport>(deliverabilityTestReports);
    }

    /**
     * <p>
     * An object that contains a lists of predictive inbox placement tests that you've performed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeliverabilityTestReports(java.util.Collection)} or
     * {@link #withDeliverabilityTestReports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param deliverabilityTestReports
     *        An object that contains a lists of predictive inbox placement tests that you've performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeliverabilityTestReportsResult withDeliverabilityTestReports(DeliverabilityTestReport... deliverabilityTestReports) {
        if (this.deliverabilityTestReports == null) {
            setDeliverabilityTestReports(new java.util.ArrayList<DeliverabilityTestReport>(deliverabilityTestReports.length));
        }
        for (DeliverabilityTestReport ele : deliverabilityTestReports) {
            this.deliverabilityTestReports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that contains a lists of predictive inbox placement tests that you've performed.
     * </p>
     * 
     * @param deliverabilityTestReports
     *        An object that contains a lists of predictive inbox placement tests that you've performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeliverabilityTestReportsResult withDeliverabilityTestReports(java.util.Collection<DeliverabilityTestReport> deliverabilityTestReports) {
        setDeliverabilityTestReports(deliverabilityTestReports);
        return this;
    }

    /**
     * <p>
     * A token that indicates that there are additional predictive inbox placement tests to list. To view additional
     * predictive inbox placement tests, issue another request to <code>ListDeliverabilityTestReports</code>, and pass
     * this token in the <code>NextToken</code> parameter.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there are additional predictive inbox placement tests to list. To view
     *        additional predictive inbox placement tests, issue another request to
     *        <code>ListDeliverabilityTestReports</code>, and pass this token in the <code>NextToken</code> parameter.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there are additional predictive inbox placement tests to list. To view additional
     * predictive inbox placement tests, issue another request to <code>ListDeliverabilityTestReports</code>, and pass
     * this token in the <code>NextToken</code> parameter.
     * </p>
     * 
     * @return A token that indicates that there are additional predictive inbox placement tests to list. To view
     *         additional predictive inbox placement tests, issue another request to
     *         <code>ListDeliverabilityTestReports</code>, and pass this token in the <code>NextToken</code> parameter.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates that there are additional predictive inbox placement tests to list. To view additional
     * predictive inbox placement tests, issue another request to <code>ListDeliverabilityTestReports</code>, and pass
     * this token in the <code>NextToken</code> parameter.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there are additional predictive inbox placement tests to list. To view
     *        additional predictive inbox placement tests, issue another request to
     *        <code>ListDeliverabilityTestReports</code>, and pass this token in the <code>NextToken</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeliverabilityTestReportsResult withNextToken(String nextToken) {
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
        if (getDeliverabilityTestReports() != null)
            sb.append("DeliverabilityTestReports: ").append(getDeliverabilityTestReports()).append(",");
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

        if (obj instanceof ListDeliverabilityTestReportsResult == false)
            return false;
        ListDeliverabilityTestReportsResult other = (ListDeliverabilityTestReportsResult) obj;
        if (other.getDeliverabilityTestReports() == null ^ this.getDeliverabilityTestReports() == null)
            return false;
        if (other.getDeliverabilityTestReports() != null && other.getDeliverabilityTestReports().equals(this.getDeliverabilityTestReports()) == false)
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

        hashCode = prime * hashCode + ((getDeliverabilityTestReports() == null) ? 0 : getDeliverabilityTestReports().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDeliverabilityTestReportsResult clone() {
        try {
            return (ListDeliverabilityTestReportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

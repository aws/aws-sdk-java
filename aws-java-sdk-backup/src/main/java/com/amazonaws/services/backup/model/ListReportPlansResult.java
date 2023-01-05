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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListReportPlans" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReportPlansResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of your report plans with detailed information for each plan. This information includes the Amazon
     * Resource Name (ARN), report plan name, description, settings, delivery channel, deployment status, creation time,
     * and last times the report plan attempted to and successfully ran.
     * </p>
     */
    private java.util.List<ReportPlan> reportPlans;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of your report plans with detailed information for each plan. This information includes the Amazon
     * Resource Name (ARN), report plan name, description, settings, delivery channel, deployment status, creation time,
     * and last times the report plan attempted to and successfully ran.
     * </p>
     * 
     * @return A list of your report plans with detailed information for each plan. This information includes the Amazon
     *         Resource Name (ARN), report plan name, description, settings, delivery channel, deployment status,
     *         creation time, and last times the report plan attempted to and successfully ran.
     */

    public java.util.List<ReportPlan> getReportPlans() {
        return reportPlans;
    }

    /**
     * <p>
     * A list of your report plans with detailed information for each plan. This information includes the Amazon
     * Resource Name (ARN), report plan name, description, settings, delivery channel, deployment status, creation time,
     * and last times the report plan attempted to and successfully ran.
     * </p>
     * 
     * @param reportPlans
     *        A list of your report plans with detailed information for each plan. This information includes the Amazon
     *        Resource Name (ARN), report plan name, description, settings, delivery channel, deployment status,
     *        creation time, and last times the report plan attempted to and successfully ran.
     */

    public void setReportPlans(java.util.Collection<ReportPlan> reportPlans) {
        if (reportPlans == null) {
            this.reportPlans = null;
            return;
        }

        this.reportPlans = new java.util.ArrayList<ReportPlan>(reportPlans);
    }

    /**
     * <p>
     * A list of your report plans with detailed information for each plan. This information includes the Amazon
     * Resource Name (ARN), report plan name, description, settings, delivery channel, deployment status, creation time,
     * and last times the report plan attempted to and successfully ran.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReportPlans(java.util.Collection)} or {@link #withReportPlans(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param reportPlans
     *        A list of your report plans with detailed information for each plan. This information includes the Amazon
     *        Resource Name (ARN), report plan name, description, settings, delivery channel, deployment status,
     *        creation time, and last times the report plan attempted to and successfully ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportPlansResult withReportPlans(ReportPlan... reportPlans) {
        if (this.reportPlans == null) {
            setReportPlans(new java.util.ArrayList<ReportPlan>(reportPlans.length));
        }
        for (ReportPlan ele : reportPlans) {
            this.reportPlans.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of your report plans with detailed information for each plan. This information includes the Amazon
     * Resource Name (ARN), report plan name, description, settings, delivery channel, deployment status, creation time,
     * and last times the report plan attempted to and successfully ran.
     * </p>
     * 
     * @param reportPlans
     *        A list of your report plans with detailed information for each plan. This information includes the Amazon
     *        Resource Name (ARN), report plan name, description, settings, delivery channel, deployment status,
     *        creation time, and last times the report plan attempted to and successfully ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportPlansResult withReportPlans(java.util.Collection<ReportPlan> reportPlans) {
        setReportPlans(reportPlans);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportPlansResult withNextToken(String nextToken) {
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
        if (getReportPlans() != null)
            sb.append("ReportPlans: ").append(getReportPlans()).append(",");
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

        if (obj instanceof ListReportPlansResult == false)
            return false;
        ListReportPlansResult other = (ListReportPlansResult) obj;
        if (other.getReportPlans() == null ^ this.getReportPlans() == null)
            return false;
        if (other.getReportPlans() != null && other.getReportPlans().equals(this.getReportPlans()) == false)
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

        hashCode = prime * hashCode + ((getReportPlans() == null) ? 0 : getReportPlans().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListReportPlansResult clone() {
        try {
            return (ListReportPlansResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

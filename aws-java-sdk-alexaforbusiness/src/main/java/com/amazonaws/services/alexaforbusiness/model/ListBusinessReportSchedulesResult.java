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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListBusinessReportSchedules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBusinessReportSchedulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The schedule of the reports.
     * </p>
     */
    private java.util.List<BusinessReportSchedule> businessReportSchedules;
    /**
     * <p>
     * The token used to list the remaining schedules from the previous API call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The schedule of the reports.
     * </p>
     * 
     * @return The schedule of the reports.
     */

    public java.util.List<BusinessReportSchedule> getBusinessReportSchedules() {
        return businessReportSchedules;
    }

    /**
     * <p>
     * The schedule of the reports.
     * </p>
     * 
     * @param businessReportSchedules
     *        The schedule of the reports.
     */

    public void setBusinessReportSchedules(java.util.Collection<BusinessReportSchedule> businessReportSchedules) {
        if (businessReportSchedules == null) {
            this.businessReportSchedules = null;
            return;
        }

        this.businessReportSchedules = new java.util.ArrayList<BusinessReportSchedule>(businessReportSchedules);
    }

    /**
     * <p>
     * The schedule of the reports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBusinessReportSchedules(java.util.Collection)} or
     * {@link #withBusinessReportSchedules(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param businessReportSchedules
     *        The schedule of the reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBusinessReportSchedulesResult withBusinessReportSchedules(BusinessReportSchedule... businessReportSchedules) {
        if (this.businessReportSchedules == null) {
            setBusinessReportSchedules(new java.util.ArrayList<BusinessReportSchedule>(businessReportSchedules.length));
        }
        for (BusinessReportSchedule ele : businessReportSchedules) {
            this.businessReportSchedules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The schedule of the reports.
     * </p>
     * 
     * @param businessReportSchedules
     *        The schedule of the reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBusinessReportSchedulesResult withBusinessReportSchedules(java.util.Collection<BusinessReportSchedule> businessReportSchedules) {
        setBusinessReportSchedules(businessReportSchedules);
        return this;
    }

    /**
     * <p>
     * The token used to list the remaining schedules from the previous API call.
     * </p>
     * 
     * @param nextToken
     *        The token used to list the remaining schedules from the previous API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to list the remaining schedules from the previous API call.
     * </p>
     * 
     * @return The token used to list the remaining schedules from the previous API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to list the remaining schedules from the previous API call.
     * </p>
     * 
     * @param nextToken
     *        The token used to list the remaining schedules from the previous API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBusinessReportSchedulesResult withNextToken(String nextToken) {
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
        if (getBusinessReportSchedules() != null)
            sb.append("BusinessReportSchedules: ").append(getBusinessReportSchedules()).append(",");
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

        if (obj instanceof ListBusinessReportSchedulesResult == false)
            return false;
        ListBusinessReportSchedulesResult other = (ListBusinessReportSchedulesResult) obj;
        if (other.getBusinessReportSchedules() == null ^ this.getBusinessReportSchedules() == null)
            return false;
        if (other.getBusinessReportSchedules() != null && other.getBusinessReportSchedules().equals(this.getBusinessReportSchedules()) == false)
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

        hashCode = prime * hashCode + ((getBusinessReportSchedules() == null) ? 0 : getBusinessReportSchedules().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBusinessReportSchedulesResult clone() {
        try {
            return (ListBusinessReportSchedulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

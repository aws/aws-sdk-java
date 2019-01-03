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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to retrieve the results of a predictive inbox placement test.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDeliverabilityTestReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeliverabilityTestReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique string that identifies the predictive inbox placement test.
     * </p>
     */
    private String reportId;

    /**
     * <p>
     * A unique string that identifies the predictive inbox placement test.
     * </p>
     * 
     * @param reportId
     *        A unique string that identifies the predictive inbox placement test.
     */

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    /**
     * <p>
     * A unique string that identifies the predictive inbox placement test.
     * </p>
     * 
     * @return A unique string that identifies the predictive inbox placement test.
     */

    public String getReportId() {
        return this.reportId;
    }

    /**
     * <p>
     * A unique string that identifies the predictive inbox placement test.
     * </p>
     * 
     * @param reportId
     *        A unique string that identifies the predictive inbox placement test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeliverabilityTestReportRequest withReportId(String reportId) {
        setReportId(reportId);
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
        if (getReportId() != null)
            sb.append("ReportId: ").append(getReportId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeliverabilityTestReportRequest == false)
            return false;
        GetDeliverabilityTestReportRequest other = (GetDeliverabilityTestReportRequest) obj;
        if (other.getReportId() == null ^ this.getReportId() == null)
            return false;
        if (other.getReportId() != null && other.getReportId().equals(this.getReportId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportId() == null) ? 0 : getReportId().hashCode());
        return hashCode;
    }

    @Override
    public GetDeliverabilityTestReportRequest clone() {
        return (GetDeliverabilityTestReportRequest) super.clone();
    }

}

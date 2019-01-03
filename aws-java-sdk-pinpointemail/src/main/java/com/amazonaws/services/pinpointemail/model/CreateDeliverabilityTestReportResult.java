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
 * Information about the predictive inbox placement test that you created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateDeliverabilityTestReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeliverabilityTestReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A unique string that identifies the predictive inbox placement test.
     * </p>
     */
    private String reportId;
    /**
     * <p>
     * The status of the predictive inbox placement test. If the status is <code>IN_PROGRESS</code>, then the predictive
     * inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours
     * of creating the test. If the status is <code>COMPLETE</code>, then the test is finished, and you can use the
     * <code>GetDeliverabilityTestReport</code> to view the results of the test.
     * </p>
     */
    private String deliverabilityTestStatus;

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

    public CreateDeliverabilityTestReportResult withReportId(String reportId) {
        setReportId(reportId);
        return this;
    }

    /**
     * <p>
     * The status of the predictive inbox placement test. If the status is <code>IN_PROGRESS</code>, then the predictive
     * inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours
     * of creating the test. If the status is <code>COMPLETE</code>, then the test is finished, and you can use the
     * <code>GetDeliverabilityTestReport</code> to view the results of the test.
     * </p>
     * 
     * @param deliverabilityTestStatus
     *        The status of the predictive inbox placement test. If the status is <code>IN_PROGRESS</code>, then the
     *        predictive inbox placement test is currently running. Predictive inbox placement tests are usually
     *        complete within 24 hours of creating the test. If the status is <code>COMPLETE</code>, then the test is
     *        finished, and you can use the <code>GetDeliverabilityTestReport</code> to view the results of the test.
     * @see DeliverabilityTestStatus
     */

    public void setDeliverabilityTestStatus(String deliverabilityTestStatus) {
        this.deliverabilityTestStatus = deliverabilityTestStatus;
    }

    /**
     * <p>
     * The status of the predictive inbox placement test. If the status is <code>IN_PROGRESS</code>, then the predictive
     * inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours
     * of creating the test. If the status is <code>COMPLETE</code>, then the test is finished, and you can use the
     * <code>GetDeliverabilityTestReport</code> to view the results of the test.
     * </p>
     * 
     * @return The status of the predictive inbox placement test. If the status is <code>IN_PROGRESS</code>, then the
     *         predictive inbox placement test is currently running. Predictive inbox placement tests are usually
     *         complete within 24 hours of creating the test. If the status is <code>COMPLETE</code>, then the test is
     *         finished, and you can use the <code>GetDeliverabilityTestReport</code> to view the results of the test.
     * @see DeliverabilityTestStatus
     */

    public String getDeliverabilityTestStatus() {
        return this.deliverabilityTestStatus;
    }

    /**
     * <p>
     * The status of the predictive inbox placement test. If the status is <code>IN_PROGRESS</code>, then the predictive
     * inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours
     * of creating the test. If the status is <code>COMPLETE</code>, then the test is finished, and you can use the
     * <code>GetDeliverabilityTestReport</code> to view the results of the test.
     * </p>
     * 
     * @param deliverabilityTestStatus
     *        The status of the predictive inbox placement test. If the status is <code>IN_PROGRESS</code>, then the
     *        predictive inbox placement test is currently running. Predictive inbox placement tests are usually
     *        complete within 24 hours of creating the test. If the status is <code>COMPLETE</code>, then the test is
     *        finished, and you can use the <code>GetDeliverabilityTestReport</code> to view the results of the test.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliverabilityTestStatus
     */

    public CreateDeliverabilityTestReportResult withDeliverabilityTestStatus(String deliverabilityTestStatus) {
        setDeliverabilityTestStatus(deliverabilityTestStatus);
        return this;
    }

    /**
     * <p>
     * The status of the predictive inbox placement test. If the status is <code>IN_PROGRESS</code>, then the predictive
     * inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours
     * of creating the test. If the status is <code>COMPLETE</code>, then the test is finished, and you can use the
     * <code>GetDeliverabilityTestReport</code> to view the results of the test.
     * </p>
     * 
     * @param deliverabilityTestStatus
     *        The status of the predictive inbox placement test. If the status is <code>IN_PROGRESS</code>, then the
     *        predictive inbox placement test is currently running. Predictive inbox placement tests are usually
     *        complete within 24 hours of creating the test. If the status is <code>COMPLETE</code>, then the test is
     *        finished, and you can use the <code>GetDeliverabilityTestReport</code> to view the results of the test.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliverabilityTestStatus
     */

    public CreateDeliverabilityTestReportResult withDeliverabilityTestStatus(DeliverabilityTestStatus deliverabilityTestStatus) {
        this.deliverabilityTestStatus = deliverabilityTestStatus.toString();
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
            sb.append("ReportId: ").append(getReportId()).append(",");
        if (getDeliverabilityTestStatus() != null)
            sb.append("DeliverabilityTestStatus: ").append(getDeliverabilityTestStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeliverabilityTestReportResult == false)
            return false;
        CreateDeliverabilityTestReportResult other = (CreateDeliverabilityTestReportResult) obj;
        if (other.getReportId() == null ^ this.getReportId() == null)
            return false;
        if (other.getReportId() != null && other.getReportId().equals(this.getReportId()) == false)
            return false;
        if (other.getDeliverabilityTestStatus() == null ^ this.getDeliverabilityTestStatus() == null)
            return false;
        if (other.getDeliverabilityTestStatus() != null && other.getDeliverabilityTestStatus().equals(this.getDeliverabilityTestStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportId() == null) ? 0 : getReportId().hashCode());
        hashCode = prime * hashCode + ((getDeliverabilityTestStatus() == null) ? 0 : getDeliverabilityTestStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeliverabilityTestReportResult clone() {
        try {
            return (CreateDeliverabilityTestReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains metadata related to a predictive inbox placement test.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeliverabilityTestReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliverabilityTestReport implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique string that identifies the predictive inbox placement test.
     * </p>
     */
    private String reportId;
    /**
     * <p>
     * A name that helps you identify a predictive inbox placement test report.
     * </p>
     */
    private String reportName;
    /**
     * <p>
     * The subject line for an email that you submitted in a predictive inbox placement test.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * The sender address that you specified for the predictive inbox placement test.
     * </p>
     */
    private String fromEmailAddress;
    /**
     * <p>
     * The date and time when the predictive inbox placement test was created, in Unix time format.
     * </p>
     */
    private java.util.Date createDate;
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

    public DeliverabilityTestReport withReportId(String reportId) {
        setReportId(reportId);
        return this;
    }

    /**
     * <p>
     * A name that helps you identify a predictive inbox placement test report.
     * </p>
     * 
     * @param reportName
     *        A name that helps you identify a predictive inbox placement test report.
     */

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     * <p>
     * A name that helps you identify a predictive inbox placement test report.
     * </p>
     * 
     * @return A name that helps you identify a predictive inbox placement test report.
     */

    public String getReportName() {
        return this.reportName;
    }

    /**
     * <p>
     * A name that helps you identify a predictive inbox placement test report.
     * </p>
     * 
     * @param reportName
     *        A name that helps you identify a predictive inbox placement test report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliverabilityTestReport withReportName(String reportName) {
        setReportName(reportName);
        return this;
    }

    /**
     * <p>
     * The subject line for an email that you submitted in a predictive inbox placement test.
     * </p>
     * 
     * @param subject
     *        The subject line for an email that you submitted in a predictive inbox placement test.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject line for an email that you submitted in a predictive inbox placement test.
     * </p>
     * 
     * @return The subject line for an email that you submitted in a predictive inbox placement test.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The subject line for an email that you submitted in a predictive inbox placement test.
     * </p>
     * 
     * @param subject
     *        The subject line for an email that you submitted in a predictive inbox placement test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliverabilityTestReport withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The sender address that you specified for the predictive inbox placement test.
     * </p>
     * 
     * @param fromEmailAddress
     *        The sender address that you specified for the predictive inbox placement test.
     */

    public void setFromEmailAddress(String fromEmailAddress) {
        this.fromEmailAddress = fromEmailAddress;
    }

    /**
     * <p>
     * The sender address that you specified for the predictive inbox placement test.
     * </p>
     * 
     * @return The sender address that you specified for the predictive inbox placement test.
     */

    public String getFromEmailAddress() {
        return this.fromEmailAddress;
    }

    /**
     * <p>
     * The sender address that you specified for the predictive inbox placement test.
     * </p>
     * 
     * @param fromEmailAddress
     *        The sender address that you specified for the predictive inbox placement test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliverabilityTestReport withFromEmailAddress(String fromEmailAddress) {
        setFromEmailAddress(fromEmailAddress);
        return this;
    }

    /**
     * <p>
     * The date and time when the predictive inbox placement test was created, in Unix time format.
     * </p>
     * 
     * @param createDate
     *        The date and time when the predictive inbox placement test was created, in Unix time format.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time when the predictive inbox placement test was created, in Unix time format.
     * </p>
     * 
     * @return The date and time when the predictive inbox placement test was created, in Unix time format.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time when the predictive inbox placement test was created, in Unix time format.
     * </p>
     * 
     * @param createDate
     *        The date and time when the predictive inbox placement test was created, in Unix time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliverabilityTestReport withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
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

    public DeliverabilityTestReport withDeliverabilityTestStatus(String deliverabilityTestStatus) {
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

    public DeliverabilityTestReport withDeliverabilityTestStatus(DeliverabilityTestStatus deliverabilityTestStatus) {
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
        if (getReportName() != null)
            sb.append("ReportName: ").append(getReportName()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getFromEmailAddress() != null)
            sb.append("FromEmailAddress: ").append(getFromEmailAddress()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
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

        if (obj instanceof DeliverabilityTestReport == false)
            return false;
        DeliverabilityTestReport other = (DeliverabilityTestReport) obj;
        if (other.getReportId() == null ^ this.getReportId() == null)
            return false;
        if (other.getReportId() != null && other.getReportId().equals(this.getReportId()) == false)
            return false;
        if (other.getReportName() == null ^ this.getReportName() == null)
            return false;
        if (other.getReportName() != null && other.getReportName().equals(this.getReportName()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getFromEmailAddress() == null ^ this.getFromEmailAddress() == null)
            return false;
        if (other.getFromEmailAddress() != null && other.getFromEmailAddress().equals(this.getFromEmailAddress()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
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
        hashCode = prime * hashCode + ((getReportName() == null) ? 0 : getReportName().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getFromEmailAddress() == null) ? 0 : getFromEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getDeliverabilityTestStatus() == null) ? 0 : getDeliverabilityTestStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeliverabilityTestReport clone() {
        try {
            return (DeliverabilityTestReport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.DeliverabilityTestReportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

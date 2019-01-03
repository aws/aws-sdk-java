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
 * The results of the predictive inbox placement test.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDeliverabilityTestReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeliverabilityTestReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains the results of the predictive inbox placement test.
     * </p>
     */
    private DeliverabilityTestReport deliverabilityTestReport;
    /**
     * <p>
     * An object that specifies how many test messages that were sent during the predictive inbox placement test were
     * delivered to recipients' inboxes, how many were sent to recipients' spam folders, and how many weren't delivered.
     * </p>
     */
    private PlacementStatistics overallPlacement;
    /**
     * <p>
     * An object that describes how the test email was handled by several email providers, including Gmail, Hotmail,
     * Yahoo, AOL, and others.
     * </p>
     */
    private java.util.List<IspPlacement> ispPlacements;
    /**
     * <p>
     * An object that contains the message that you sent when you performed this predictive inbox placement test.
     * </p>
     */
    private String message;

    /**
     * <p>
     * An object that contains the results of the predictive inbox placement test.
     * </p>
     * 
     * @param deliverabilityTestReport
     *        An object that contains the results of the predictive inbox placement test.
     */

    public void setDeliverabilityTestReport(DeliverabilityTestReport deliverabilityTestReport) {
        this.deliverabilityTestReport = deliverabilityTestReport;
    }

    /**
     * <p>
     * An object that contains the results of the predictive inbox placement test.
     * </p>
     * 
     * @return An object that contains the results of the predictive inbox placement test.
     */

    public DeliverabilityTestReport getDeliverabilityTestReport() {
        return this.deliverabilityTestReport;
    }

    /**
     * <p>
     * An object that contains the results of the predictive inbox placement test.
     * </p>
     * 
     * @param deliverabilityTestReport
     *        An object that contains the results of the predictive inbox placement test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeliverabilityTestReportResult withDeliverabilityTestReport(DeliverabilityTestReport deliverabilityTestReport) {
        setDeliverabilityTestReport(deliverabilityTestReport);
        return this;
    }

    /**
     * <p>
     * An object that specifies how many test messages that were sent during the predictive inbox placement test were
     * delivered to recipients' inboxes, how many were sent to recipients' spam folders, and how many weren't delivered.
     * </p>
     * 
     * @param overallPlacement
     *        An object that specifies how many test messages that were sent during the predictive inbox placement test
     *        were delivered to recipients' inboxes, how many were sent to recipients' spam folders, and how many
     *        weren't delivered.
     */

    public void setOverallPlacement(PlacementStatistics overallPlacement) {
        this.overallPlacement = overallPlacement;
    }

    /**
     * <p>
     * An object that specifies how many test messages that were sent during the predictive inbox placement test were
     * delivered to recipients' inboxes, how many were sent to recipients' spam folders, and how many weren't delivered.
     * </p>
     * 
     * @return An object that specifies how many test messages that were sent during the predictive inbox placement test
     *         were delivered to recipients' inboxes, how many were sent to recipients' spam folders, and how many
     *         weren't delivered.
     */

    public PlacementStatistics getOverallPlacement() {
        return this.overallPlacement;
    }

    /**
     * <p>
     * An object that specifies how many test messages that were sent during the predictive inbox placement test were
     * delivered to recipients' inboxes, how many were sent to recipients' spam folders, and how many weren't delivered.
     * </p>
     * 
     * @param overallPlacement
     *        An object that specifies how many test messages that were sent during the predictive inbox placement test
     *        were delivered to recipients' inboxes, how many were sent to recipients' spam folders, and how many
     *        weren't delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeliverabilityTestReportResult withOverallPlacement(PlacementStatistics overallPlacement) {
        setOverallPlacement(overallPlacement);
        return this;
    }

    /**
     * <p>
     * An object that describes how the test email was handled by several email providers, including Gmail, Hotmail,
     * Yahoo, AOL, and others.
     * </p>
     * 
     * @return An object that describes how the test email was handled by several email providers, including Gmail,
     *         Hotmail, Yahoo, AOL, and others.
     */

    public java.util.List<IspPlacement> getIspPlacements() {
        return ispPlacements;
    }

    /**
     * <p>
     * An object that describes how the test email was handled by several email providers, including Gmail, Hotmail,
     * Yahoo, AOL, and others.
     * </p>
     * 
     * @param ispPlacements
     *        An object that describes how the test email was handled by several email providers, including Gmail,
     *        Hotmail, Yahoo, AOL, and others.
     */

    public void setIspPlacements(java.util.Collection<IspPlacement> ispPlacements) {
        if (ispPlacements == null) {
            this.ispPlacements = null;
            return;
        }

        this.ispPlacements = new java.util.ArrayList<IspPlacement>(ispPlacements);
    }

    /**
     * <p>
     * An object that describes how the test email was handled by several email providers, including Gmail, Hotmail,
     * Yahoo, AOL, and others.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIspPlacements(java.util.Collection)} or {@link #withIspPlacements(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ispPlacements
     *        An object that describes how the test email was handled by several email providers, including Gmail,
     *        Hotmail, Yahoo, AOL, and others.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeliverabilityTestReportResult withIspPlacements(IspPlacement... ispPlacements) {
        if (this.ispPlacements == null) {
            setIspPlacements(new java.util.ArrayList<IspPlacement>(ispPlacements.length));
        }
        for (IspPlacement ele : ispPlacements) {
            this.ispPlacements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that describes how the test email was handled by several email providers, including Gmail, Hotmail,
     * Yahoo, AOL, and others.
     * </p>
     * 
     * @param ispPlacements
     *        An object that describes how the test email was handled by several email providers, including Gmail,
     *        Hotmail, Yahoo, AOL, and others.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeliverabilityTestReportResult withIspPlacements(java.util.Collection<IspPlacement> ispPlacements) {
        setIspPlacements(ispPlacements);
        return this;
    }

    /**
     * <p>
     * An object that contains the message that you sent when you performed this predictive inbox placement test.
     * </p>
     * 
     * @param message
     *        An object that contains the message that you sent when you performed this predictive inbox placement test.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * An object that contains the message that you sent when you performed this predictive inbox placement test.
     * </p>
     * 
     * @return An object that contains the message that you sent when you performed this predictive inbox placement
     *         test.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * An object that contains the message that you sent when you performed this predictive inbox placement test.
     * </p>
     * 
     * @param message
     *        An object that contains the message that you sent when you performed this predictive inbox placement test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeliverabilityTestReportResult withMessage(String message) {
        setMessage(message);
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
        if (getDeliverabilityTestReport() != null)
            sb.append("DeliverabilityTestReport: ").append(getDeliverabilityTestReport()).append(",");
        if (getOverallPlacement() != null)
            sb.append("OverallPlacement: ").append(getOverallPlacement()).append(",");
        if (getIspPlacements() != null)
            sb.append("IspPlacements: ").append(getIspPlacements()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeliverabilityTestReportResult == false)
            return false;
        GetDeliverabilityTestReportResult other = (GetDeliverabilityTestReportResult) obj;
        if (other.getDeliverabilityTestReport() == null ^ this.getDeliverabilityTestReport() == null)
            return false;
        if (other.getDeliverabilityTestReport() != null && other.getDeliverabilityTestReport().equals(this.getDeliverabilityTestReport()) == false)
            return false;
        if (other.getOverallPlacement() == null ^ this.getOverallPlacement() == null)
            return false;
        if (other.getOverallPlacement() != null && other.getOverallPlacement().equals(this.getOverallPlacement()) == false)
            return false;
        if (other.getIspPlacements() == null ^ this.getIspPlacements() == null)
            return false;
        if (other.getIspPlacements() != null && other.getIspPlacements().equals(this.getIspPlacements()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliverabilityTestReport() == null) ? 0 : getDeliverabilityTestReport().hashCode());
        hashCode = prime * hashCode + ((getOverallPlacement() == null) ? 0 : getOverallPlacement().hashCode());
        hashCode = prime * hashCode + ((getIspPlacements() == null) ? 0 : getIspPlacements().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public GetDeliverabilityTestReportResult clone() {
        try {
            return (GetDeliverabilityTestReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

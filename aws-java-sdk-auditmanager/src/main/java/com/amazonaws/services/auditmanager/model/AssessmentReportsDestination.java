/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The location in which AWS Audit Manager saves assessment reports for the given assessment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/AssessmentReportsDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentReportsDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The destination type, such as Amazon S3.
     * </p>
     */
    private String destinationType;
    /**
     * <p>
     * The destination of the assessment report.
     * </p>
     */
    private String destination;

    /**
     * <p>
     * The destination type, such as Amazon S3.
     * </p>
     * 
     * @param destinationType
     *        The destination type, such as Amazon S3.
     * @see AssessmentReportDestinationType
     */

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    /**
     * <p>
     * The destination type, such as Amazon S3.
     * </p>
     * 
     * @return The destination type, such as Amazon S3.
     * @see AssessmentReportDestinationType
     */

    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * <p>
     * The destination type, such as Amazon S3.
     * </p>
     * 
     * @param destinationType
     *        The destination type, such as Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentReportDestinationType
     */

    public AssessmentReportsDestination withDestinationType(String destinationType) {
        setDestinationType(destinationType);
        return this;
    }

    /**
     * <p>
     * The destination type, such as Amazon S3.
     * </p>
     * 
     * @param destinationType
     *        The destination type, such as Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentReportDestinationType
     */

    public AssessmentReportsDestination withDestinationType(AssessmentReportDestinationType destinationType) {
        this.destinationType = destinationType.toString();
        return this;
    }

    /**
     * <p>
     * The destination of the assessment report.
     * </p>
     * 
     * @param destination
     *        The destination of the assessment report.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination of the assessment report.
     * </p>
     * 
     * @return The destination of the assessment report.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The destination of the assessment report.
     * </p>
     * 
     * @param destination
     *        The destination of the assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentReportsDestination withDestination(String destination) {
        setDestination(destination);
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
        if (getDestinationType() != null)
            sb.append("DestinationType: ").append(getDestinationType()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentReportsDestination == false)
            return false;
        AssessmentReportsDestination other = (AssessmentReportsDestination) obj;
        if (other.getDestinationType() == null ^ this.getDestinationType() == null)
            return false;
        if (other.getDestinationType() != null && other.getDestinationType().equals(this.getDestinationType()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationType() == null) ? 0 : getDestinationType().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentReportsDestination clone() {
        try {
            return (AssessmentReportsDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.AssessmentReportsDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

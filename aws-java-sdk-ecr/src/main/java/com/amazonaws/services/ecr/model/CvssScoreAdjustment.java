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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on adjustments Amazon Inspector made to the CVSS score for a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/CvssScoreAdjustment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CvssScoreAdjustment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric used to adjust the CVSS score.
     * </p>
     */
    private String metric;
    /**
     * <p>
     * The reason the CVSS score has been adjustment.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The metric used to adjust the CVSS score.
     * </p>
     * 
     * @param metric
     *        The metric used to adjust the CVSS score.
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The metric used to adjust the CVSS score.
     * </p>
     * 
     * @return The metric used to adjust the CVSS score.
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The metric used to adjust the CVSS score.
     * </p>
     * 
     * @param metric
     *        The metric used to adjust the CVSS score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CvssScoreAdjustment withMetric(String metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The reason the CVSS score has been adjustment.
     * </p>
     * 
     * @param reason
     *        The reason the CVSS score has been adjustment.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason the CVSS score has been adjustment.
     * </p>
     * 
     * @return The reason the CVSS score has been adjustment.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason the CVSS score has been adjustment.
     * </p>
     * 
     * @param reason
     *        The reason the CVSS score has been adjustment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CvssScoreAdjustment withReason(String reason) {
        setReason(reason);
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
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CvssScoreAdjustment == false)
            return false;
        CvssScoreAdjustment other = (CvssScoreAdjustment) obj;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public CvssScoreAdjustment clone() {
        try {
            return (CvssScoreAdjustment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.CvssScoreAdjustmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

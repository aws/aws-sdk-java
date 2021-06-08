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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ProvideAnomalyFeedback" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvideAnomalyFeedbackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A cost anomaly ID.
     * </p>
     */
    private String anomalyId;
    /**
     * <p>
     * Describes whether the cost anomaly was a planned activity or you considered it an anomaly.
     * </p>
     */
    private String feedback;

    /**
     * <p>
     * A cost anomaly ID.
     * </p>
     * 
     * @param anomalyId
     *        A cost anomaly ID.
     */

    public void setAnomalyId(String anomalyId) {
        this.anomalyId = anomalyId;
    }

    /**
     * <p>
     * A cost anomaly ID.
     * </p>
     * 
     * @return A cost anomaly ID.
     */

    public String getAnomalyId() {
        return this.anomalyId;
    }

    /**
     * <p>
     * A cost anomaly ID.
     * </p>
     * 
     * @param anomalyId
     *        A cost anomaly ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvideAnomalyFeedbackRequest withAnomalyId(String anomalyId) {
        setAnomalyId(anomalyId);
        return this;
    }

    /**
     * <p>
     * Describes whether the cost anomaly was a planned activity or you considered it an anomaly.
     * </p>
     * 
     * @param feedback
     *        Describes whether the cost anomaly was a planned activity or you considered it an anomaly.
     * @see AnomalyFeedbackType
     */

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * <p>
     * Describes whether the cost anomaly was a planned activity or you considered it an anomaly.
     * </p>
     * 
     * @return Describes whether the cost anomaly was a planned activity or you considered it an anomaly.
     * @see AnomalyFeedbackType
     */

    public String getFeedback() {
        return this.feedback;
    }

    /**
     * <p>
     * Describes whether the cost anomaly was a planned activity or you considered it an anomaly.
     * </p>
     * 
     * @param feedback
     *        Describes whether the cost anomaly was a planned activity or you considered it an anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyFeedbackType
     */

    public ProvideAnomalyFeedbackRequest withFeedback(String feedback) {
        setFeedback(feedback);
        return this;
    }

    /**
     * <p>
     * Describes whether the cost anomaly was a planned activity or you considered it an anomaly.
     * </p>
     * 
     * @param feedback
     *        Describes whether the cost anomaly was a planned activity or you considered it an anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyFeedbackType
     */

    public ProvideAnomalyFeedbackRequest withFeedback(AnomalyFeedbackType feedback) {
        this.feedback = feedback.toString();
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
        if (getAnomalyId() != null)
            sb.append("AnomalyId: ").append(getAnomalyId()).append(",");
        if (getFeedback() != null)
            sb.append("Feedback: ").append(getFeedback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvideAnomalyFeedbackRequest == false)
            return false;
        ProvideAnomalyFeedbackRequest other = (ProvideAnomalyFeedbackRequest) obj;
        if (other.getAnomalyId() == null ^ this.getAnomalyId() == null)
            return false;
        if (other.getAnomalyId() != null && other.getAnomalyId().equals(this.getAnomalyId()) == false)
            return false;
        if (other.getFeedback() == null ^ this.getFeedback() == null)
            return false;
        if (other.getFeedback() != null && other.getFeedback().equals(this.getFeedback()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyId() == null) ? 0 : getAnomalyId().hashCode());
        hashCode = prime * hashCode + ((getFeedback() == null) ? 0 : getFeedback().hashCode());
        return hashCode;
    }

    @Override
    public ProvideAnomalyFeedbackRequest clone() {
        return (ProvideAnomalyFeedbackRequest) super.clone();
    }

}

/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a skipped analytics feature during the analysis of a call analytics job.
 * </p>
 * <p>
 * The <code>Feature</code> field indicates the type of analytics feature that was skipped.
 * </p>
 * <p>
 * The <code>Message</code> field contains additional information or a message explaining why the analytics feature was
 * skipped.
 * </p>
 * <p>
 * The <code>ReasonCode</code> field provides a code indicating the reason why the analytics feature was skipped.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CallAnalyticsSkippedFeature"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CallAnalyticsSkippedFeature implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the type of analytics feature that was skipped during the analysis of a call analytics job.
     * </p>
     */
    private String feature;
    /**
     * <p>
     * Provides a code indicating the reason why a specific analytics feature was skipped during the analysis of a call
     * analytics job.
     * </p>
     */
    private String reasonCode;
    /**
     * <p>
     * Contains additional information or a message explaining why a specific analytics feature was skipped during the
     * analysis of a call analytics job.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Indicates the type of analytics feature that was skipped during the analysis of a call analytics job.
     * </p>
     * 
     * @param feature
     *        Indicates the type of analytics feature that was skipped during the analysis of a call analytics job.
     * @see CallAnalyticsFeature
     */

    public void setFeature(String feature) {
        this.feature = feature;
    }

    /**
     * <p>
     * Indicates the type of analytics feature that was skipped during the analysis of a call analytics job.
     * </p>
     * 
     * @return Indicates the type of analytics feature that was skipped during the analysis of a call analytics job.
     * @see CallAnalyticsFeature
     */

    public String getFeature() {
        return this.feature;
    }

    /**
     * <p>
     * Indicates the type of analytics feature that was skipped during the analysis of a call analytics job.
     * </p>
     * 
     * @param feature
     *        Indicates the type of analytics feature that was skipped during the analysis of a call analytics job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsFeature
     */

    public CallAnalyticsSkippedFeature withFeature(String feature) {
        setFeature(feature);
        return this;
    }

    /**
     * <p>
     * Indicates the type of analytics feature that was skipped during the analysis of a call analytics job.
     * </p>
     * 
     * @param feature
     *        Indicates the type of analytics feature that was skipped during the analysis of a call analytics job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsFeature
     */

    public CallAnalyticsSkippedFeature withFeature(CallAnalyticsFeature feature) {
        this.feature = feature.toString();
        return this;
    }

    /**
     * <p>
     * Provides a code indicating the reason why a specific analytics feature was skipped during the analysis of a call
     * analytics job.
     * </p>
     * 
     * @param reasonCode
     *        Provides a code indicating the reason why a specific analytics feature was skipped during the analysis of
     *        a call analytics job.
     * @see CallAnalyticsSkippedReasonCode
     */

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * <p>
     * Provides a code indicating the reason why a specific analytics feature was skipped during the analysis of a call
     * analytics job.
     * </p>
     * 
     * @return Provides a code indicating the reason why a specific analytics feature was skipped during the analysis of
     *         a call analytics job.
     * @see CallAnalyticsSkippedReasonCode
     */

    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * <p>
     * Provides a code indicating the reason why a specific analytics feature was skipped during the analysis of a call
     * analytics job.
     * </p>
     * 
     * @param reasonCode
     *        Provides a code indicating the reason why a specific analytics feature was skipped during the analysis of
     *        a call analytics job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsSkippedReasonCode
     */

    public CallAnalyticsSkippedFeature withReasonCode(String reasonCode) {
        setReasonCode(reasonCode);
        return this;
    }

    /**
     * <p>
     * Provides a code indicating the reason why a specific analytics feature was skipped during the analysis of a call
     * analytics job.
     * </p>
     * 
     * @param reasonCode
     *        Provides a code indicating the reason why a specific analytics feature was skipped during the analysis of
     *        a call analytics job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsSkippedReasonCode
     */

    public CallAnalyticsSkippedFeature withReasonCode(CallAnalyticsSkippedReasonCode reasonCode) {
        this.reasonCode = reasonCode.toString();
        return this;
    }

    /**
     * <p>
     * Contains additional information or a message explaining why a specific analytics feature was skipped during the
     * analysis of a call analytics job.
     * </p>
     * 
     * @param message
     *        Contains additional information or a message explaining why a specific analytics feature was skipped
     *        during the analysis of a call analytics job.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Contains additional information or a message explaining why a specific analytics feature was skipped during the
     * analysis of a call analytics job.
     * </p>
     * 
     * @return Contains additional information or a message explaining why a specific analytics feature was skipped
     *         during the analysis of a call analytics job.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Contains additional information or a message explaining why a specific analytics feature was skipped during the
     * analysis of a call analytics job.
     * </p>
     * 
     * @param message
     *        Contains additional information or a message explaining why a specific analytics feature was skipped
     *        during the analysis of a call analytics job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsSkippedFeature withMessage(String message) {
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
        if (getFeature() != null)
            sb.append("Feature: ").append(getFeature()).append(",");
        if (getReasonCode() != null)
            sb.append("ReasonCode: ").append(getReasonCode()).append(",");
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

        if (obj instanceof CallAnalyticsSkippedFeature == false)
            return false;
        CallAnalyticsSkippedFeature other = (CallAnalyticsSkippedFeature) obj;
        if (other.getFeature() == null ^ this.getFeature() == null)
            return false;
        if (other.getFeature() != null && other.getFeature().equals(this.getFeature()) == false)
            return false;
        if (other.getReasonCode() == null ^ this.getReasonCode() == null)
            return false;
        if (other.getReasonCode() != null && other.getReasonCode().equals(this.getReasonCode()) == false)
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

        hashCode = prime * hashCode + ((getFeature() == null) ? 0 : getFeature().hashCode());
        hashCode = prime * hashCode + ((getReasonCode() == null) ? 0 : getReasonCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public CallAnalyticsSkippedFeature clone() {
        try {
            return (CallAnalyticsSkippedFeature) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.CallAnalyticsSkippedFeatureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

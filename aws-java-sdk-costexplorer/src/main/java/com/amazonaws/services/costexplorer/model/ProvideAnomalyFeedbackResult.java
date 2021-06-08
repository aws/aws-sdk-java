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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ProvideAnomalyFeedback" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvideAnomalyFeedbackResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the modified cost anomaly.
     * </p>
     */
    private String anomalyId;

    /**
     * <p>
     * The ID of the modified cost anomaly.
     * </p>
     * 
     * @param anomalyId
     *        The ID of the modified cost anomaly.
     */

    public void setAnomalyId(String anomalyId) {
        this.anomalyId = anomalyId;
    }

    /**
     * <p>
     * The ID of the modified cost anomaly.
     * </p>
     * 
     * @return The ID of the modified cost anomaly.
     */

    public String getAnomalyId() {
        return this.anomalyId;
    }

    /**
     * <p>
     * The ID of the modified cost anomaly.
     * </p>
     * 
     * @param anomalyId
     *        The ID of the modified cost anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvideAnomalyFeedbackResult withAnomalyId(String anomalyId) {
        setAnomalyId(anomalyId);
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
            sb.append("AnomalyId: ").append(getAnomalyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvideAnomalyFeedbackResult == false)
            return false;
        ProvideAnomalyFeedbackResult other = (ProvideAnomalyFeedbackResult) obj;
        if (other.getAnomalyId() == null ^ this.getAnomalyId() == null)
            return false;
        if (other.getAnomalyId() != null && other.getAnomalyId().equals(this.getAnomalyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyId() == null) ? 0 : getAnomalyId().hashCode());
        return hashCode;
    }

    @Override
    public ProvideAnomalyFeedbackResult clone() {
        try {
            return (ProvideAnomalyFeedbackResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Transaction Fraud Insights (TFI) model performance score.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/TFIModelPerformance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TFIModelPerformance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The area under the curve (auc). This summarizes the total positive rate (tpr) and false positive rate (FPR)
     * across all possible model score thresholds.
     * </p>
     */
    private Float auc;

    /**
     * <p>
     * The area under the curve (auc). This summarizes the total positive rate (tpr) and false positive rate (FPR)
     * across all possible model score thresholds.
     * </p>
     * 
     * @param auc
     *        The area under the curve (auc). This summarizes the total positive rate (tpr) and false positive rate
     *        (FPR) across all possible model score thresholds.
     */

    public void setAuc(Float auc) {
        this.auc = auc;
    }

    /**
     * <p>
     * The area under the curve (auc). This summarizes the total positive rate (tpr) and false positive rate (FPR)
     * across all possible model score thresholds.
     * </p>
     * 
     * @return The area under the curve (auc). This summarizes the total positive rate (tpr) and false positive rate
     *         (FPR) across all possible model score thresholds.
     */

    public Float getAuc() {
        return this.auc;
    }

    /**
     * <p>
     * The area under the curve (auc). This summarizes the total positive rate (tpr) and false positive rate (FPR)
     * across all possible model score thresholds.
     * </p>
     * 
     * @param auc
     *        The area under the curve (auc). This summarizes the total positive rate (tpr) and false positive rate
     *        (FPR) across all possible model score thresholds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TFIModelPerformance withAuc(Float auc) {
        setAuc(auc);
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
        if (getAuc() != null)
            sb.append("Auc: ").append(getAuc());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TFIModelPerformance == false)
            return false;
        TFIModelPerformance other = (TFIModelPerformance) obj;
        if (other.getAuc() == null ^ this.getAuc() == null)
            return false;
        if (other.getAuc() != null && other.getAuc().equals(this.getAuc()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuc() == null) ? 0 : getAuc().hashCode());
        return hashCode;
    }

    @Override
    public TFIModelPerformance clone() {
        try {
            return (TFIModelPerformance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.TFIModelPerformanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

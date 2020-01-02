/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details on the backtests performed to evaluate the accuracy of the predictor. The tests are returned in
 * descending order of accuracy, with the most accurate backtest appearing first. You specify the number of backtests to
 * perform when you call the operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/PredictorExecutionDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictorExecutionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of the backtests performed to evaluate the accuracy of the predictor against a particular algorithm. The
     * <code>NumberOfBacktestWindows</code> from the object determines the number of windows in the array.
     * </p>
     */
    private java.util.List<PredictorExecution> predictorExecutions;

    /**
     * <p>
     * An array of the backtests performed to evaluate the accuracy of the predictor against a particular algorithm. The
     * <code>NumberOfBacktestWindows</code> from the object determines the number of windows in the array.
     * </p>
     * 
     * @return An array of the backtests performed to evaluate the accuracy of the predictor against a particular
     *         algorithm. The <code>NumberOfBacktestWindows</code> from the object determines the number of windows in
     *         the array.
     */

    public java.util.List<PredictorExecution> getPredictorExecutions() {
        return predictorExecutions;
    }

    /**
     * <p>
     * An array of the backtests performed to evaluate the accuracy of the predictor against a particular algorithm. The
     * <code>NumberOfBacktestWindows</code> from the object determines the number of windows in the array.
     * </p>
     * 
     * @param predictorExecutions
     *        An array of the backtests performed to evaluate the accuracy of the predictor against a particular
     *        algorithm. The <code>NumberOfBacktestWindows</code> from the object determines the number of windows in
     *        the array.
     */

    public void setPredictorExecutions(java.util.Collection<PredictorExecution> predictorExecutions) {
        if (predictorExecutions == null) {
            this.predictorExecutions = null;
            return;
        }

        this.predictorExecutions = new java.util.ArrayList<PredictorExecution>(predictorExecutions);
    }

    /**
     * <p>
     * An array of the backtests performed to evaluate the accuracy of the predictor against a particular algorithm. The
     * <code>NumberOfBacktestWindows</code> from the object determines the number of windows in the array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPredictorExecutions(java.util.Collection)} or {@link #withPredictorExecutions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param predictorExecutions
     *        An array of the backtests performed to evaluate the accuracy of the predictor against a particular
     *        algorithm. The <code>NumberOfBacktestWindows</code> from the object determines the number of windows in
     *        the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorExecutionDetails withPredictorExecutions(PredictorExecution... predictorExecutions) {
        if (this.predictorExecutions == null) {
            setPredictorExecutions(new java.util.ArrayList<PredictorExecution>(predictorExecutions.length));
        }
        for (PredictorExecution ele : predictorExecutions) {
            this.predictorExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the backtests performed to evaluate the accuracy of the predictor against a particular algorithm. The
     * <code>NumberOfBacktestWindows</code> from the object determines the number of windows in the array.
     * </p>
     * 
     * @param predictorExecutions
     *        An array of the backtests performed to evaluate the accuracy of the predictor against a particular
     *        algorithm. The <code>NumberOfBacktestWindows</code> from the object determines the number of windows in
     *        the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorExecutionDetails withPredictorExecutions(java.util.Collection<PredictorExecution> predictorExecutions) {
        setPredictorExecutions(predictorExecutions);
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
        if (getPredictorExecutions() != null)
            sb.append("PredictorExecutions: ").append(getPredictorExecutions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictorExecutionDetails == false)
            return false;
        PredictorExecutionDetails other = (PredictorExecutionDetails) obj;
        if (other.getPredictorExecutions() == null ^ this.getPredictorExecutions() == null)
            return false;
        if (other.getPredictorExecutions() != null && other.getPredictorExecutions().equals(this.getPredictorExecutions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredictorExecutions() == null) ? 0 : getPredictorExecutions().hashCode());
        return hashCode;
    }

    @Override
    public PredictorExecutionDetails clone() {
        try {
            return (PredictorExecutionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.PredictorExecutionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

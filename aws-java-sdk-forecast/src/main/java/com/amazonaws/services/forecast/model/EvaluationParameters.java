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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameters that define how to split a dataset into training data and testing data, and the number of iterations to
 * perform. These parameters are specified in the predefined algorithms and can be overridden in the
 * <a>CreatePredictor</a> request.
 * </p>
 * <p>
 * For example, suppose that you have a dataset with data collection frequency set to every day and you have 200 days
 * worth of data (that is, 200 data points). Now suppose that you set the <code>NumberOfBacktestWindows</code> to 2 and
 * the <code>BackTestWindowOffset</code> parameter to 20. The algorithm splits the data twice. The first time, the
 * algorithm trains the model using the first 180 data points and uses the last 20 data points for evaluation. The
 * second time, the algorithm trains the model using the first 160 data points and uses the last 40 data points for
 * evaluation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/EvaluationParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of times to split the input data. The default is 1. The range is 1 through 5.
     * </p>
     */
    private Integer numberOfBacktestWindows;
    /**
     * <p>
     * The point from the end of the dataset where you want to split the data for model training and evaluation. The
     * value is specified as the number of data points.
     * </p>
     */
    private Integer backTestWindowOffset;

    /**
     * <p>
     * The number of times to split the input data. The default is 1. The range is 1 through 5.
     * </p>
     * 
     * @param numberOfBacktestWindows
     *        The number of times to split the input data. The default is 1. The range is 1 through 5.
     */

    public void setNumberOfBacktestWindows(Integer numberOfBacktestWindows) {
        this.numberOfBacktestWindows = numberOfBacktestWindows;
    }

    /**
     * <p>
     * The number of times to split the input data. The default is 1. The range is 1 through 5.
     * </p>
     * 
     * @return The number of times to split the input data. The default is 1. The range is 1 through 5.
     */

    public Integer getNumberOfBacktestWindows() {
        return this.numberOfBacktestWindows;
    }

    /**
     * <p>
     * The number of times to split the input data. The default is 1. The range is 1 through 5.
     * </p>
     * 
     * @param numberOfBacktestWindows
     *        The number of times to split the input data. The default is 1. The range is 1 through 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationParameters withNumberOfBacktestWindows(Integer numberOfBacktestWindows) {
        setNumberOfBacktestWindows(numberOfBacktestWindows);
        return this;
    }

    /**
     * <p>
     * The point from the end of the dataset where you want to split the data for model training and evaluation. The
     * value is specified as the number of data points.
     * </p>
     * 
     * @param backTestWindowOffset
     *        The point from the end of the dataset where you want to split the data for model training and evaluation.
     *        The value is specified as the number of data points.
     */

    public void setBackTestWindowOffset(Integer backTestWindowOffset) {
        this.backTestWindowOffset = backTestWindowOffset;
    }

    /**
     * <p>
     * The point from the end of the dataset where you want to split the data for model training and evaluation. The
     * value is specified as the number of data points.
     * </p>
     * 
     * @return The point from the end of the dataset where you want to split the data for model training and evaluation.
     *         The value is specified as the number of data points.
     */

    public Integer getBackTestWindowOffset() {
        return this.backTestWindowOffset;
    }

    /**
     * <p>
     * The point from the end of the dataset where you want to split the data for model training and evaluation. The
     * value is specified as the number of data points.
     * </p>
     * 
     * @param backTestWindowOffset
     *        The point from the end of the dataset where you want to split the data for model training and evaluation.
     *        The value is specified as the number of data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationParameters withBackTestWindowOffset(Integer backTestWindowOffset) {
        setBackTestWindowOffset(backTestWindowOffset);
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
        if (getNumberOfBacktestWindows() != null)
            sb.append("NumberOfBacktestWindows: ").append(getNumberOfBacktestWindows()).append(",");
        if (getBackTestWindowOffset() != null)
            sb.append("BackTestWindowOffset: ").append(getBackTestWindowOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationParameters == false)
            return false;
        EvaluationParameters other = (EvaluationParameters) obj;
        if (other.getNumberOfBacktestWindows() == null ^ this.getNumberOfBacktestWindows() == null)
            return false;
        if (other.getNumberOfBacktestWindows() != null && other.getNumberOfBacktestWindows().equals(this.getNumberOfBacktestWindows()) == false)
            return false;
        if (other.getBackTestWindowOffset() == null ^ this.getBackTestWindowOffset() == null)
            return false;
        if (other.getBackTestWindowOffset() != null && other.getBackTestWindowOffset().equals(this.getBackTestWindowOffset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfBacktestWindows() == null) ? 0 : getNumberOfBacktestWindows().hashCode());
        hashCode = prime * hashCode + ((getBackTestWindowOffset() == null) ? 0 : getBackTestWindowOffset().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationParameters clone() {
        try {
            return (EvaluationParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.EvaluationParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

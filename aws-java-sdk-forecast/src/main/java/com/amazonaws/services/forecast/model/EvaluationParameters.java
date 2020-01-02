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
 * Parameters that define how to split a dataset into training data and testing data, and the number of iterations to
 * perform. These parameters are specified in the predefined algorithms but you can override them in the
 * <a>CreatePredictor</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/EvaluationParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of times to split the input data. The default is 1. Valid values are 1 through 5.
     * </p>
     */
    private Integer numberOfBacktestWindows;
    /**
     * <p>
     * The point from the end of the dataset where you want to split the data for model training and testing
     * (evaluation). Specify the value as the number of data points. The default is the value of the forecast horizon.
     * <code>BackTestWindowOffset</code> can be used to mimic a past virtual forecast start date. This value must be
     * greater than or equal to the forecast horizon and less than half of the TARGET_TIME_SERIES dataset length.
     * </p>
     * <p>
     * <code>ForecastHorizon</code> &lt;= <code>BackTestWindowOffset</code> &lt; 1/2 * TARGET_TIME_SERIES dataset length
     * </p>
     */
    private Integer backTestWindowOffset;

    /**
     * <p>
     * The number of times to split the input data. The default is 1. Valid values are 1 through 5.
     * </p>
     * 
     * @param numberOfBacktestWindows
     *        The number of times to split the input data. The default is 1. Valid values are 1 through 5.
     */

    public void setNumberOfBacktestWindows(Integer numberOfBacktestWindows) {
        this.numberOfBacktestWindows = numberOfBacktestWindows;
    }

    /**
     * <p>
     * The number of times to split the input data. The default is 1. Valid values are 1 through 5.
     * </p>
     * 
     * @return The number of times to split the input data. The default is 1. Valid values are 1 through 5.
     */

    public Integer getNumberOfBacktestWindows() {
        return this.numberOfBacktestWindows;
    }

    /**
     * <p>
     * The number of times to split the input data. The default is 1. Valid values are 1 through 5.
     * </p>
     * 
     * @param numberOfBacktestWindows
     *        The number of times to split the input data. The default is 1. Valid values are 1 through 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationParameters withNumberOfBacktestWindows(Integer numberOfBacktestWindows) {
        setNumberOfBacktestWindows(numberOfBacktestWindows);
        return this;
    }

    /**
     * <p>
     * The point from the end of the dataset where you want to split the data for model training and testing
     * (evaluation). Specify the value as the number of data points. The default is the value of the forecast horizon.
     * <code>BackTestWindowOffset</code> can be used to mimic a past virtual forecast start date. This value must be
     * greater than or equal to the forecast horizon and less than half of the TARGET_TIME_SERIES dataset length.
     * </p>
     * <p>
     * <code>ForecastHorizon</code> &lt;= <code>BackTestWindowOffset</code> &lt; 1/2 * TARGET_TIME_SERIES dataset length
     * </p>
     * 
     * @param backTestWindowOffset
     *        The point from the end of the dataset where you want to split the data for model training and testing
     *        (evaluation). Specify the value as the number of data points. The default is the value of the forecast
     *        horizon. <code>BackTestWindowOffset</code> can be used to mimic a past virtual forecast start date. This
     *        value must be greater than or equal to the forecast horizon and less than half of the TARGET_TIME_SERIES
     *        dataset length.</p>
     *        <p>
     *        <code>ForecastHorizon</code> &lt;= <code>BackTestWindowOffset</code> &lt; 1/2 * TARGET_TIME_SERIES dataset
     *        length
     */

    public void setBackTestWindowOffset(Integer backTestWindowOffset) {
        this.backTestWindowOffset = backTestWindowOffset;
    }

    /**
     * <p>
     * The point from the end of the dataset where you want to split the data for model training and testing
     * (evaluation). Specify the value as the number of data points. The default is the value of the forecast horizon.
     * <code>BackTestWindowOffset</code> can be used to mimic a past virtual forecast start date. This value must be
     * greater than or equal to the forecast horizon and less than half of the TARGET_TIME_SERIES dataset length.
     * </p>
     * <p>
     * <code>ForecastHorizon</code> &lt;= <code>BackTestWindowOffset</code> &lt; 1/2 * TARGET_TIME_SERIES dataset length
     * </p>
     * 
     * @return The point from the end of the dataset where you want to split the data for model training and testing
     *         (evaluation). Specify the value as the number of data points. The default is the value of the forecast
     *         horizon. <code>BackTestWindowOffset</code> can be used to mimic a past virtual forecast start date. This
     *         value must be greater than or equal to the forecast horizon and less than half of the TARGET_TIME_SERIES
     *         dataset length.</p>
     *         <p>
     *         <code>ForecastHorizon</code> &lt;= <code>BackTestWindowOffset</code> &lt; 1/2 * TARGET_TIME_SERIES
     *         dataset length
     */

    public Integer getBackTestWindowOffset() {
        return this.backTestWindowOffset;
    }

    /**
     * <p>
     * The point from the end of the dataset where you want to split the data for model training and testing
     * (evaluation). Specify the value as the number of data points. The default is the value of the forecast horizon.
     * <code>BackTestWindowOffset</code> can be used to mimic a past virtual forecast start date. This value must be
     * greater than or equal to the forecast horizon and less than half of the TARGET_TIME_SERIES dataset length.
     * </p>
     * <p>
     * <code>ForecastHorizon</code> &lt;= <code>BackTestWindowOffset</code> &lt; 1/2 * TARGET_TIME_SERIES dataset length
     * </p>
     * 
     * @param backTestWindowOffset
     *        The point from the end of the dataset where you want to split the data for model training and testing
     *        (evaluation). Specify the value as the number of data points. The default is the value of the forecast
     *        horizon. <code>BackTestWindowOffset</code> can be used to mimic a past virtual forecast start date. This
     *        value must be greater than or equal to the forecast horizon and less than half of the TARGET_TIME_SERIES
     *        dataset length.</p>
     *        <p>
     *        <code>ForecastHorizon</code> &lt;= <code>BackTestWindowOffset</code> &lt; 1/2 * TARGET_TIME_SERIES dataset
     *        length
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

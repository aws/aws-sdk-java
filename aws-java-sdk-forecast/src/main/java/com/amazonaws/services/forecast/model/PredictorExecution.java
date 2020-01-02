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
 * The algorithm used to perform a backtest and the status of those tests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/PredictorExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictorExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the algorithm used to test the predictor.
     * </p>
     */
    private String algorithmArn;
    /**
     * <p>
     * An array of test windows used to evaluate the algorithm. The <code>NumberOfBacktestWindows</code> from the object
     * determines the number of windows in the array.
     * </p>
     */
    private java.util.List<TestWindowSummary> testWindows;

    /**
     * <p>
     * The ARN of the algorithm used to test the predictor.
     * </p>
     * 
     * @param algorithmArn
     *        The ARN of the algorithm used to test the predictor.
     */

    public void setAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
    }

    /**
     * <p>
     * The ARN of the algorithm used to test the predictor.
     * </p>
     * 
     * @return The ARN of the algorithm used to test the predictor.
     */

    public String getAlgorithmArn() {
        return this.algorithmArn;
    }

    /**
     * <p>
     * The ARN of the algorithm used to test the predictor.
     * </p>
     * 
     * @param algorithmArn
     *        The ARN of the algorithm used to test the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorExecution withAlgorithmArn(String algorithmArn) {
        setAlgorithmArn(algorithmArn);
        return this;
    }

    /**
     * <p>
     * An array of test windows used to evaluate the algorithm. The <code>NumberOfBacktestWindows</code> from the object
     * determines the number of windows in the array.
     * </p>
     * 
     * @return An array of test windows used to evaluate the algorithm. The <code>NumberOfBacktestWindows</code> from
     *         the object determines the number of windows in the array.
     */

    public java.util.List<TestWindowSummary> getTestWindows() {
        return testWindows;
    }

    /**
     * <p>
     * An array of test windows used to evaluate the algorithm. The <code>NumberOfBacktestWindows</code> from the object
     * determines the number of windows in the array.
     * </p>
     * 
     * @param testWindows
     *        An array of test windows used to evaluate the algorithm. The <code>NumberOfBacktestWindows</code> from the
     *        object determines the number of windows in the array.
     */

    public void setTestWindows(java.util.Collection<TestWindowSummary> testWindows) {
        if (testWindows == null) {
            this.testWindows = null;
            return;
        }

        this.testWindows = new java.util.ArrayList<TestWindowSummary>(testWindows);
    }

    /**
     * <p>
     * An array of test windows used to evaluate the algorithm. The <code>NumberOfBacktestWindows</code> from the object
     * determines the number of windows in the array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestWindows(java.util.Collection)} or {@link #withTestWindows(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param testWindows
     *        An array of test windows used to evaluate the algorithm. The <code>NumberOfBacktestWindows</code> from the
     *        object determines the number of windows in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorExecution withTestWindows(TestWindowSummary... testWindows) {
        if (this.testWindows == null) {
            setTestWindows(new java.util.ArrayList<TestWindowSummary>(testWindows.length));
        }
        for (TestWindowSummary ele : testWindows) {
            this.testWindows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of test windows used to evaluate the algorithm. The <code>NumberOfBacktestWindows</code> from the object
     * determines the number of windows in the array.
     * </p>
     * 
     * @param testWindows
     *        An array of test windows used to evaluate the algorithm. The <code>NumberOfBacktestWindows</code> from the
     *        object determines the number of windows in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorExecution withTestWindows(java.util.Collection<TestWindowSummary> testWindows) {
        setTestWindows(testWindows);
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
        if (getAlgorithmArn() != null)
            sb.append("AlgorithmArn: ").append(getAlgorithmArn()).append(",");
        if (getTestWindows() != null)
            sb.append("TestWindows: ").append(getTestWindows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictorExecution == false)
            return false;
        PredictorExecution other = (PredictorExecution) obj;
        if (other.getAlgorithmArn() == null ^ this.getAlgorithmArn() == null)
            return false;
        if (other.getAlgorithmArn() != null && other.getAlgorithmArn().equals(this.getAlgorithmArn()) == false)
            return false;
        if (other.getTestWindows() == null ^ this.getTestWindows() == null)
            return false;
        if (other.getTestWindows() != null && other.getTestWindows().equals(this.getTestWindows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithmArn() == null) ? 0 : getAlgorithmArn().hashCode());
        hashCode = prime * hashCode + ((getTestWindows() == null) ? 0 : getTestWindows().hashCode());
        return hashCode;
    }

    @Override
    public PredictorExecution clone() {
        try {
            return (PredictorExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.PredictorExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

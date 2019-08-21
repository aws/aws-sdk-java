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
 * The results of evaluating an algorithm. Returned as part of the <a>GetAccuracyMetrics</a> response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/EvaluationResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm that was evaluated.
     * </p>
     */
    private String algorithmArn;
    /**
     * <p>
     * The array of test windows used for evaluating the algorithm. The <code>NumberOfBacktestWindows</code> from the
     * <a>EvaluationParameters</a> object determines the number of windows in the array.
     * </p>
     */
    private java.util.List<WindowSummary> testWindows;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm that was evaluated.
     * </p>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm that was evaluated.
     */

    public void setAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm that was evaluated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the algorithm that was evaluated.
     */

    public String getAlgorithmArn() {
        return this.algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm that was evaluated.
     * </p>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm that was evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResult withAlgorithmArn(String algorithmArn) {
        setAlgorithmArn(algorithmArn);
        return this;
    }

    /**
     * <p>
     * The array of test windows used for evaluating the algorithm. The <code>NumberOfBacktestWindows</code> from the
     * <a>EvaluationParameters</a> object determines the number of windows in the array.
     * </p>
     * 
     * @return The array of test windows used for evaluating the algorithm. The <code>NumberOfBacktestWindows</code>
     *         from the <a>EvaluationParameters</a> object determines the number of windows in the array.
     */

    public java.util.List<WindowSummary> getTestWindows() {
        return testWindows;
    }

    /**
     * <p>
     * The array of test windows used for evaluating the algorithm. The <code>NumberOfBacktestWindows</code> from the
     * <a>EvaluationParameters</a> object determines the number of windows in the array.
     * </p>
     * 
     * @param testWindows
     *        The array of test windows used for evaluating the algorithm. The <code>NumberOfBacktestWindows</code> from
     *        the <a>EvaluationParameters</a> object determines the number of windows in the array.
     */

    public void setTestWindows(java.util.Collection<WindowSummary> testWindows) {
        if (testWindows == null) {
            this.testWindows = null;
            return;
        }

        this.testWindows = new java.util.ArrayList<WindowSummary>(testWindows);
    }

    /**
     * <p>
     * The array of test windows used for evaluating the algorithm. The <code>NumberOfBacktestWindows</code> from the
     * <a>EvaluationParameters</a> object determines the number of windows in the array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestWindows(java.util.Collection)} or {@link #withTestWindows(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param testWindows
     *        The array of test windows used for evaluating the algorithm. The <code>NumberOfBacktestWindows</code> from
     *        the <a>EvaluationParameters</a> object determines the number of windows in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResult withTestWindows(WindowSummary... testWindows) {
        if (this.testWindows == null) {
            setTestWindows(new java.util.ArrayList<WindowSummary>(testWindows.length));
        }
        for (WindowSummary ele : testWindows) {
            this.testWindows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of test windows used for evaluating the algorithm. The <code>NumberOfBacktestWindows</code> from the
     * <a>EvaluationParameters</a> object determines the number of windows in the array.
     * </p>
     * 
     * @param testWindows
     *        The array of test windows used for evaluating the algorithm. The <code>NumberOfBacktestWindows</code> from
     *        the <a>EvaluationParameters</a> object determines the number of windows in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResult withTestWindows(java.util.Collection<WindowSummary> testWindows) {
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

        if (obj instanceof EvaluationResult == false)
            return false;
        EvaluationResult other = (EvaluationResult) obj;
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
    public EvaluationResult clone() {
        try {
            return (EvaluationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.EvaluationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

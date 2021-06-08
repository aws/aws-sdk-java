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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeletePredictorBacktestExportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePredictorBacktestExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor backtest export job to delete.
     * </p>
     */
    private String predictorBacktestExportJobArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor backtest export job to delete.
     * </p>
     * 
     * @param predictorBacktestExportJobArn
     *        The Amazon Resource Name (ARN) of the predictor backtest export job to delete.
     */

    public void setPredictorBacktestExportJobArn(String predictorBacktestExportJobArn) {
        this.predictorBacktestExportJobArn = predictorBacktestExportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor backtest export job to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the predictor backtest export job to delete.
     */

    public String getPredictorBacktestExportJobArn() {
        return this.predictorBacktestExportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor backtest export job to delete.
     * </p>
     * 
     * @param predictorBacktestExportJobArn
     *        The Amazon Resource Name (ARN) of the predictor backtest export job to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePredictorBacktestExportJobRequest withPredictorBacktestExportJobArn(String predictorBacktestExportJobArn) {
        setPredictorBacktestExportJobArn(predictorBacktestExportJobArn);
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
        if (getPredictorBacktestExportJobArn() != null)
            sb.append("PredictorBacktestExportJobArn: ").append(getPredictorBacktestExportJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePredictorBacktestExportJobRequest == false)
            return false;
        DeletePredictorBacktestExportJobRequest other = (DeletePredictorBacktestExportJobRequest) obj;
        if (other.getPredictorBacktestExportJobArn() == null ^ this.getPredictorBacktestExportJobArn() == null)
            return false;
        if (other.getPredictorBacktestExportJobArn() != null
                && other.getPredictorBacktestExportJobArn().equals(this.getPredictorBacktestExportJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredictorBacktestExportJobArn() == null) ? 0 : getPredictorBacktestExportJobArn().hashCode());
        return hashCode;
    }

    @Override
    public DeletePredictorBacktestExportJobRequest clone() {
        return (DeletePredictorBacktestExportJobRequest) super.clone();
    }

}

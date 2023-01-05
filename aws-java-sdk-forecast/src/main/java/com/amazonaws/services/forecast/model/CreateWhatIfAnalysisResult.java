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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateWhatIfAnalysis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWhatIfAnalysisResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis.
     * </p>
     */
    private String whatIfAnalysisArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis.
     * </p>
     * 
     * @param whatIfAnalysisArn
     *        The Amazon Resource Name (ARN) of the what-if analysis.
     */

    public void setWhatIfAnalysisArn(String whatIfAnalysisArn) {
        this.whatIfAnalysisArn = whatIfAnalysisArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the what-if analysis.
     */

    public String getWhatIfAnalysisArn() {
        return this.whatIfAnalysisArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if analysis.
     * </p>
     * 
     * @param whatIfAnalysisArn
     *        The Amazon Resource Name (ARN) of the what-if analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfAnalysisResult withWhatIfAnalysisArn(String whatIfAnalysisArn) {
        setWhatIfAnalysisArn(whatIfAnalysisArn);
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
        if (getWhatIfAnalysisArn() != null)
            sb.append("WhatIfAnalysisArn: ").append(getWhatIfAnalysisArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWhatIfAnalysisResult == false)
            return false;
        CreateWhatIfAnalysisResult other = (CreateWhatIfAnalysisResult) obj;
        if (other.getWhatIfAnalysisArn() == null ^ this.getWhatIfAnalysisArn() == null)
            return false;
        if (other.getWhatIfAnalysisArn() != null && other.getWhatIfAnalysisArn().equals(this.getWhatIfAnalysisArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWhatIfAnalysisArn() == null) ? 0 : getWhatIfAnalysisArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateWhatIfAnalysisResult clone() {
        try {
            return (CreateWhatIfAnalysisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateWhatIfForecast" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWhatIfForecastResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if forecast.
     * </p>
     */
    private String whatIfForecastArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if forecast.
     * </p>
     * 
     * @param whatIfForecastArn
     *        The Amazon Resource Name (ARN) of the what-if forecast.
     */

    public void setWhatIfForecastArn(String whatIfForecastArn) {
        this.whatIfForecastArn = whatIfForecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if forecast.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the what-if forecast.
     */

    public String getWhatIfForecastArn() {
        return this.whatIfForecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the what-if forecast.
     * </p>
     * 
     * @param whatIfForecastArn
     *        The Amazon Resource Name (ARN) of the what-if forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfForecastResult withWhatIfForecastArn(String whatIfForecastArn) {
        setWhatIfForecastArn(whatIfForecastArn);
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
        if (getWhatIfForecastArn() != null)
            sb.append("WhatIfForecastArn: ").append(getWhatIfForecastArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWhatIfForecastResult == false)
            return false;
        CreateWhatIfForecastResult other = (CreateWhatIfForecastResult) obj;
        if (other.getWhatIfForecastArn() == null ^ this.getWhatIfForecastArn() == null)
            return false;
        if (other.getWhatIfForecastArn() != null && other.getWhatIfForecastArn().equals(this.getWhatIfForecastArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWhatIfForecastArn() == null) ? 0 : getWhatIfForecastArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateWhatIfForecastResult clone() {
        try {
            return (CreateWhatIfForecastResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

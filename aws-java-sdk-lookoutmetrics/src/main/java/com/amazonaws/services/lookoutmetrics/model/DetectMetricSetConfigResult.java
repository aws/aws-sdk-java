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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DetectMetricSetConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectMetricSetConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The inferred dataset configuration for the datasource.
     * </p>
     */
    private DetectedMetricSetConfig detectedMetricSetConfig;

    /**
     * <p>
     * The inferred dataset configuration for the datasource.
     * </p>
     * 
     * @param detectedMetricSetConfig
     *        The inferred dataset configuration for the datasource.
     */

    public void setDetectedMetricSetConfig(DetectedMetricSetConfig detectedMetricSetConfig) {
        this.detectedMetricSetConfig = detectedMetricSetConfig;
    }

    /**
     * <p>
     * The inferred dataset configuration for the datasource.
     * </p>
     * 
     * @return The inferred dataset configuration for the datasource.
     */

    public DetectedMetricSetConfig getDetectedMetricSetConfig() {
        return this.detectedMetricSetConfig;
    }

    /**
     * <p>
     * The inferred dataset configuration for the datasource.
     * </p>
     * 
     * @param detectedMetricSetConfig
     *        The inferred dataset configuration for the datasource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMetricSetConfigResult withDetectedMetricSetConfig(DetectedMetricSetConfig detectedMetricSetConfig) {
        setDetectedMetricSetConfig(detectedMetricSetConfig);
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
        if (getDetectedMetricSetConfig() != null)
            sb.append("DetectedMetricSetConfig: ").append(getDetectedMetricSetConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectMetricSetConfigResult == false)
            return false;
        DetectMetricSetConfigResult other = (DetectMetricSetConfigResult) obj;
        if (other.getDetectedMetricSetConfig() == null ^ this.getDetectedMetricSetConfig() == null)
            return false;
        if (other.getDetectedMetricSetConfig() != null && other.getDetectedMetricSetConfig().equals(this.getDetectedMetricSetConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectedMetricSetConfig() == null) ? 0 : getDetectedMetricSetConfig().hashCode());
        return hashCode;
    }

    @Override
    public DetectMetricSetConfigResult clone() {
        try {
            return (DetectMetricSetConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

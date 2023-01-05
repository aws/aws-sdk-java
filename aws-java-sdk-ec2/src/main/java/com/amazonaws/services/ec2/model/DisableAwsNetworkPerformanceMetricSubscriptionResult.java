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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableAwsNetworkPerformanceMetricSubscriptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the unsubscribe action was successful.
     * </p>
     */
    private Boolean output;

    /**
     * <p>
     * Indicates whether the unsubscribe action was successful.
     * </p>
     * 
     * @param output
     *        Indicates whether the unsubscribe action was successful.
     */

    public void setOutput(Boolean output) {
        this.output = output;
    }

    /**
     * <p>
     * Indicates whether the unsubscribe action was successful.
     * </p>
     * 
     * @return Indicates whether the unsubscribe action was successful.
     */

    public Boolean getOutput() {
        return this.output;
    }

    /**
     * <p>
     * Indicates whether the unsubscribe action was successful.
     * </p>
     * 
     * @param output
     *        Indicates whether the unsubscribe action was successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableAwsNetworkPerformanceMetricSubscriptionResult withOutput(Boolean output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * Indicates whether the unsubscribe action was successful.
     * </p>
     * 
     * @return Indicates whether the unsubscribe action was successful.
     */

    public Boolean isOutput() {
        return this.output;
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
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableAwsNetworkPerformanceMetricSubscriptionResult == false)
            return false;
        DisableAwsNetworkPerformanceMetricSubscriptionResult other = (DisableAwsNetworkPerformanceMetricSubscriptionResult) obj;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        return hashCode;
    }

    @Override
    public DisableAwsNetworkPerformanceMetricSubscriptionResult clone() {
        try {
            return (DisableAwsNetworkPerformanceMetricSubscriptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

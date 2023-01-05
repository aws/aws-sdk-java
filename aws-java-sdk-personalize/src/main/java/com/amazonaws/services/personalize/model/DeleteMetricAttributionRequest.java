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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteMetricAttribution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMetricAttributionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The metric attribution's Amazon Resource Name (ARN).
     * </p>
     */
    private String metricAttributionArn;

    /**
     * <p>
     * The metric attribution's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param metricAttributionArn
     *        The metric attribution's Amazon Resource Name (ARN).
     */

    public void setMetricAttributionArn(String metricAttributionArn) {
        this.metricAttributionArn = metricAttributionArn;
    }

    /**
     * <p>
     * The metric attribution's Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The metric attribution's Amazon Resource Name (ARN).
     */

    public String getMetricAttributionArn() {
        return this.metricAttributionArn;
    }

    /**
     * <p>
     * The metric attribution's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param metricAttributionArn
     *        The metric attribution's Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMetricAttributionRequest withMetricAttributionArn(String metricAttributionArn) {
        setMetricAttributionArn(metricAttributionArn);
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
        if (getMetricAttributionArn() != null)
            sb.append("MetricAttributionArn: ").append(getMetricAttributionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMetricAttributionRequest == false)
            return false;
        DeleteMetricAttributionRequest other = (DeleteMetricAttributionRequest) obj;
        if (other.getMetricAttributionArn() == null ^ this.getMetricAttributionArn() == null)
            return false;
        if (other.getMetricAttributionArn() != null && other.getMetricAttributionArn().equals(this.getMetricAttributionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricAttributionArn() == null) ? 0 : getMetricAttributionArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMetricAttributionRequest clone() {
        return (DeleteMetricAttributionRequest) super.clone();
    }

}

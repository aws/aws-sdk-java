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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about metrics to publish to CloudWatch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StatelessCustomPublishMetricAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatelessCustomPublishMetricAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines CloudWatch dimension values to publish.
     * </p>
     */
    private java.util.List<StatelessCustomPublishMetricActionDimension> dimensions;

    /**
     * <p>
     * Defines CloudWatch dimension values to publish.
     * </p>
     * 
     * @return Defines CloudWatch dimension values to publish.
     */

    public java.util.List<StatelessCustomPublishMetricActionDimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * Defines CloudWatch dimension values to publish.
     * </p>
     * 
     * @param dimensions
     *        Defines CloudWatch dimension values to publish.
     */

    public void setDimensions(java.util.Collection<StatelessCustomPublishMetricActionDimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<StatelessCustomPublishMetricActionDimension>(dimensions);
    }

    /**
     * <p>
     * Defines CloudWatch dimension values to publish.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        Defines CloudWatch dimension values to publish.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatelessCustomPublishMetricAction withDimensions(StatelessCustomPublishMetricActionDimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new java.util.ArrayList<StatelessCustomPublishMetricActionDimension>(dimensions.length));
        }
        for (StatelessCustomPublishMetricActionDimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines CloudWatch dimension values to publish.
     * </p>
     * 
     * @param dimensions
     *        Defines CloudWatch dimension values to publish.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatelessCustomPublishMetricAction withDimensions(java.util.Collection<StatelessCustomPublishMetricActionDimension> dimensions) {
        setDimensions(dimensions);
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
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatelessCustomPublishMetricAction == false)
            return false;
        StatelessCustomPublishMetricAction other = (StatelessCustomPublishMetricAction) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        return hashCode;
    }

    @Override
    public StatelessCustomPublishMetricAction clone() {
        try {
            return (StatelessCustomPublishMetricAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.StatelessCustomPublishMetricActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

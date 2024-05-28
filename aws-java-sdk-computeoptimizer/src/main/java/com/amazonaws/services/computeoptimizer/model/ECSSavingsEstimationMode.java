/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the savings estimation mode used for calculating savings opportunity for Amazon ECS services.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ECSSavingsEstimationMode"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ECSSavingsEstimationMode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the source for calculating the savings opportunity for Amazon ECS services.
     * </p>
     */
    private String source;

    /**
     * <p>
     * Describes the source for calculating the savings opportunity for Amazon ECS services.
     * </p>
     * 
     * @param source
     *        Describes the source for calculating the savings opportunity for Amazon ECS services.
     * @see ECSSavingsEstimationModeSource
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * Describes the source for calculating the savings opportunity for Amazon ECS services.
     * </p>
     * 
     * @return Describes the source for calculating the savings opportunity for Amazon ECS services.
     * @see ECSSavingsEstimationModeSource
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * Describes the source for calculating the savings opportunity for Amazon ECS services.
     * </p>
     * 
     * @param source
     *        Describes the source for calculating the savings opportunity for Amazon ECS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ECSSavingsEstimationModeSource
     */

    public ECSSavingsEstimationMode withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * Describes the source for calculating the savings opportunity for Amazon ECS services.
     * </p>
     * 
     * @param source
     *        Describes the source for calculating the savings opportunity for Amazon ECS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ECSSavingsEstimationModeSource
     */

    public ECSSavingsEstimationMode withSource(ECSSavingsEstimationModeSource source) {
        this.source = source.toString();
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ECSSavingsEstimationMode == false)
            return false;
        ECSSavingsEstimationMode other = (ECSSavingsEstimationMode) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public ECSSavingsEstimationMode clone() {
        try {
            return (ECSSavingsEstimationMode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.ECSSavingsEstimationModeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides an estimate of the number of aggregation functions that the member who can query can run given the epsilon
 * and noise parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/PrivacyImpact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrivacyImpact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that lists the number and type of aggregation functions you can perform.
     * </p>
     */
    private DifferentialPrivacyPrivacyImpact differentialPrivacy;

    /**
     * <p>
     * An object that lists the number and type of aggregation functions you can perform.
     * </p>
     * 
     * @param differentialPrivacy
     *        An object that lists the number and type of aggregation functions you can perform.
     */

    public void setDifferentialPrivacy(DifferentialPrivacyPrivacyImpact differentialPrivacy) {
        this.differentialPrivacy = differentialPrivacy;
    }

    /**
     * <p>
     * An object that lists the number and type of aggregation functions you can perform.
     * </p>
     * 
     * @return An object that lists the number and type of aggregation functions you can perform.
     */

    public DifferentialPrivacyPrivacyImpact getDifferentialPrivacy() {
        return this.differentialPrivacy;
    }

    /**
     * <p>
     * An object that lists the number and type of aggregation functions you can perform.
     * </p>
     * 
     * @param differentialPrivacy
     *        An object that lists the number and type of aggregation functions you can perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyImpact withDifferentialPrivacy(DifferentialPrivacyPrivacyImpact differentialPrivacy) {
        setDifferentialPrivacy(differentialPrivacy);
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
        if (getDifferentialPrivacy() != null)
            sb.append("DifferentialPrivacy: ").append(getDifferentialPrivacy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrivacyImpact == false)
            return false;
        PrivacyImpact other = (PrivacyImpact) obj;
        if (other.getDifferentialPrivacy() == null ^ this.getDifferentialPrivacy() == null)
            return false;
        if (other.getDifferentialPrivacy() != null && other.getDifferentialPrivacy().equals(this.getDifferentialPrivacy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDifferentialPrivacy() == null) ? 0 : getDifferentialPrivacy().hashCode());
        return hashCode;
    }

    @Override
    public PrivacyImpact clone() {
        try {
            return (PrivacyImpact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.PrivacyImpactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

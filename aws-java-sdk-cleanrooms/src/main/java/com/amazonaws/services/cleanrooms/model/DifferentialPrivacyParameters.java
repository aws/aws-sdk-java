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
 * An array that contains the sensitivity parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DifferentialPrivacyParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DifferentialPrivacyParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides the sensitivity parameters that you can use to better understand the total amount of noise in query
     * results.
     * </p>
     */
    private java.util.List<DifferentialPrivacySensitivityParameters> sensitivityParameters;

    /**
     * <p>
     * Provides the sensitivity parameters that you can use to better understand the total amount of noise in query
     * results.
     * </p>
     * 
     * @return Provides the sensitivity parameters that you can use to better understand the total amount of noise in
     *         query results.
     */

    public java.util.List<DifferentialPrivacySensitivityParameters> getSensitivityParameters() {
        return sensitivityParameters;
    }

    /**
     * <p>
     * Provides the sensitivity parameters that you can use to better understand the total amount of noise in query
     * results.
     * </p>
     * 
     * @param sensitivityParameters
     *        Provides the sensitivity parameters that you can use to better understand the total amount of noise in
     *        query results.
     */

    public void setSensitivityParameters(java.util.Collection<DifferentialPrivacySensitivityParameters> sensitivityParameters) {
        if (sensitivityParameters == null) {
            this.sensitivityParameters = null;
            return;
        }

        this.sensitivityParameters = new java.util.ArrayList<DifferentialPrivacySensitivityParameters>(sensitivityParameters);
    }

    /**
     * <p>
     * Provides the sensitivity parameters that you can use to better understand the total amount of noise in query
     * results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSensitivityParameters(java.util.Collection)} or
     * {@link #withSensitivityParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sensitivityParameters
     *        Provides the sensitivity parameters that you can use to better understand the total amount of noise in
     *        query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DifferentialPrivacyParameters withSensitivityParameters(DifferentialPrivacySensitivityParameters... sensitivityParameters) {
        if (this.sensitivityParameters == null) {
            setSensitivityParameters(new java.util.ArrayList<DifferentialPrivacySensitivityParameters>(sensitivityParameters.length));
        }
        for (DifferentialPrivacySensitivityParameters ele : sensitivityParameters) {
            this.sensitivityParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the sensitivity parameters that you can use to better understand the total amount of noise in query
     * results.
     * </p>
     * 
     * @param sensitivityParameters
     *        Provides the sensitivity parameters that you can use to better understand the total amount of noise in
     *        query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DifferentialPrivacyParameters withSensitivityParameters(java.util.Collection<DifferentialPrivacySensitivityParameters> sensitivityParameters) {
        setSensitivityParameters(sensitivityParameters);
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
        if (getSensitivityParameters() != null)
            sb.append("SensitivityParameters: ").append(getSensitivityParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DifferentialPrivacyParameters == false)
            return false;
        DifferentialPrivacyParameters other = (DifferentialPrivacyParameters) obj;
        if (other.getSensitivityParameters() == null ^ this.getSensitivityParameters() == null)
            return false;
        if (other.getSensitivityParameters() != null && other.getSensitivityParameters().equals(this.getSensitivityParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSensitivityParameters() == null) ? 0 : getSensitivityParameters().hashCode());
        return hashCode;
    }

    @Override
    public DifferentialPrivacyParameters clone() {
        try {
            return (DifferentialPrivacyParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.DifferentialPrivacyParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

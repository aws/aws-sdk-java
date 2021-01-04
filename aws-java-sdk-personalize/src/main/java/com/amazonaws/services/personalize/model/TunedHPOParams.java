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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * If hyperparameter optimization (HPO) was performed, contains the hyperparameter values of the best performing model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/TunedHPOParams" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TunedHPOParams implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the hyperparameter values of the best performing model.
     * </p>
     */
    private java.util.Map<String, String> algorithmHyperParameters;

    /**
     * <p>
     * A list of the hyperparameter values of the best performing model.
     * </p>
     * 
     * @return A list of the hyperparameter values of the best performing model.
     */

    public java.util.Map<String, String> getAlgorithmHyperParameters() {
        return algorithmHyperParameters;
    }

    /**
     * <p>
     * A list of the hyperparameter values of the best performing model.
     * </p>
     * 
     * @param algorithmHyperParameters
     *        A list of the hyperparameter values of the best performing model.
     */

    public void setAlgorithmHyperParameters(java.util.Map<String, String> algorithmHyperParameters) {
        this.algorithmHyperParameters = algorithmHyperParameters;
    }

    /**
     * <p>
     * A list of the hyperparameter values of the best performing model.
     * </p>
     * 
     * @param algorithmHyperParameters
     *        A list of the hyperparameter values of the best performing model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunedHPOParams withAlgorithmHyperParameters(java.util.Map<String, String> algorithmHyperParameters) {
        setAlgorithmHyperParameters(algorithmHyperParameters);
        return this;
    }

    /**
     * Add a single AlgorithmHyperParameters entry
     *
     * @see TunedHPOParams#withAlgorithmHyperParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TunedHPOParams addAlgorithmHyperParametersEntry(String key, String value) {
        if (null == this.algorithmHyperParameters) {
            this.algorithmHyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.algorithmHyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.algorithmHyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AlgorithmHyperParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunedHPOParams clearAlgorithmHyperParametersEntries() {
        this.algorithmHyperParameters = null;
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
        if (getAlgorithmHyperParameters() != null)
            sb.append("AlgorithmHyperParameters: ").append(getAlgorithmHyperParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TunedHPOParams == false)
            return false;
        TunedHPOParams other = (TunedHPOParams) obj;
        if (other.getAlgorithmHyperParameters() == null ^ this.getAlgorithmHyperParameters() == null)
            return false;
        if (other.getAlgorithmHyperParameters() != null && other.getAlgorithmHyperParameters().equals(this.getAlgorithmHyperParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithmHyperParameters() == null) ? 0 : getAlgorithmHyperParameters().hashCode());
        return hashCode;
    }

    @Override
    public TunedHPOParams clone() {
        try {
            return (TunedHPOParams) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.TunedHPOParamsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

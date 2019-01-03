/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code>DescribeScalingParameters</code> request. Contains the scaling parameters configured for the
 * domain specified in the request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScalingParametersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private ScalingParametersStatus scalingParameters;

    /**
     * @param scalingParameters
     */

    public void setScalingParameters(ScalingParametersStatus scalingParameters) {
        this.scalingParameters = scalingParameters;
    }

    /**
     * @return
     */

    public ScalingParametersStatus getScalingParameters() {
        return this.scalingParameters;
    }

    /**
     * @param scalingParameters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingParametersResult withScalingParameters(ScalingParametersStatus scalingParameters) {
        setScalingParameters(scalingParameters);
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
        if (getScalingParameters() != null)
            sb.append("ScalingParameters: ").append(getScalingParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScalingParametersResult == false)
            return false;
        DescribeScalingParametersResult other = (DescribeScalingParametersResult) obj;
        if (other.getScalingParameters() == null ^ this.getScalingParameters() == null)
            return false;
        if (other.getScalingParameters() != null && other.getScalingParameters().equals(this.getScalingParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScalingParameters() == null) ? 0 : getScalingParameters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScalingParametersResult clone() {
        try {
            return (DescribeScalingParametersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

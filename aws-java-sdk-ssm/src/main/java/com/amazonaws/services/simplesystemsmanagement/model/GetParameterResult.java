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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetParameterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about a parameter.
     * </p>
     */
    private Parameter parameter;

    /**
     * <p>
     * Information about a parameter.
     * </p>
     * 
     * @param parameter
     *        Information about a parameter.
     */

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    /**
     * <p>
     * Information about a parameter.
     * </p>
     * 
     * @return Information about a parameter.
     */

    public Parameter getParameter() {
        return this.parameter;
    }

    /**
     * <p>
     * Information about a parameter.
     * </p>
     * 
     * @param parameter
     *        Information about a parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParameterResult withParameter(Parameter parameter) {
        setParameter(parameter);
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
        if (getParameter() != null)
            sb.append("Parameter: ").append(getParameter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParameterResult == false)
            return false;
        GetParameterResult other = (GetParameterResult) obj;
        if (other.getParameter() == null ^ this.getParameter() == null)
            return false;
        if (other.getParameter() != null && other.getParameter().equals(this.getParameter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameter() == null) ? 0 : getParameter().hashCode());
        return hashCode;
    }

    @Override
    public GetParameterResult clone() {
        try {
            return (GetParameterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * AWS Systems Manager Parameter Store parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/SsmParameterStoreParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SsmParameterStoreParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * AWS Systems Manager Parameter Store parameter name.
     * </p>
     */
    private String parameterName;
    /**
     * <p>
     * AWS Systems Manager Parameter Store parameter type.
     * </p>
     */
    private String parameterType;

    /**
     * <p>
     * AWS Systems Manager Parameter Store parameter name.
     * </p>
     * 
     * @param parameterName
     *        AWS Systems Manager Parameter Store parameter name.
     */

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * AWS Systems Manager Parameter Store parameter name.
     * </p>
     * 
     * @return AWS Systems Manager Parameter Store parameter name.
     */

    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * <p>
     * AWS Systems Manager Parameter Store parameter name.
     * </p>
     * 
     * @param parameterName
     *        AWS Systems Manager Parameter Store parameter name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsmParameterStoreParameter withParameterName(String parameterName) {
        setParameterName(parameterName);
        return this;
    }

    /**
     * <p>
     * AWS Systems Manager Parameter Store parameter type.
     * </p>
     * 
     * @param parameterType
     *        AWS Systems Manager Parameter Store parameter type.
     * @see SsmParameterStoreParameterType
     */

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    /**
     * <p>
     * AWS Systems Manager Parameter Store parameter type.
     * </p>
     * 
     * @return AWS Systems Manager Parameter Store parameter type.
     * @see SsmParameterStoreParameterType
     */

    public String getParameterType() {
        return this.parameterType;
    }

    /**
     * <p>
     * AWS Systems Manager Parameter Store parameter type.
     * </p>
     * 
     * @param parameterType
     *        AWS Systems Manager Parameter Store parameter type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SsmParameterStoreParameterType
     */

    public SsmParameterStoreParameter withParameterType(String parameterType) {
        setParameterType(parameterType);
        return this;
    }

    /**
     * <p>
     * AWS Systems Manager Parameter Store parameter type.
     * </p>
     * 
     * @param parameterType
     *        AWS Systems Manager Parameter Store parameter type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SsmParameterStoreParameterType
     */

    public SsmParameterStoreParameter withParameterType(SsmParameterStoreParameterType parameterType) {
        this.parameterType = parameterType.toString();
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
        if (getParameterName() != null)
            sb.append("ParameterName: ").append(getParameterName()).append(",");
        if (getParameterType() != null)
            sb.append("ParameterType: ").append(getParameterType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SsmParameterStoreParameter == false)
            return false;
        SsmParameterStoreParameter other = (SsmParameterStoreParameter) obj;
        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false)
            return false;
        if (other.getParameterType() == null ^ this.getParameterType() == null)
            return false;
        if (other.getParameterType() != null && other.getParameterType().equals(this.getParameterType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode + ((getParameterType() == null) ? 0 : getParameterType().hashCode());
        return hashCode;
    }

    @Override
    public SsmParameterStoreParameter clone() {
        try {
            return (SsmParameterStoreParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.SsmParameterStoreParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

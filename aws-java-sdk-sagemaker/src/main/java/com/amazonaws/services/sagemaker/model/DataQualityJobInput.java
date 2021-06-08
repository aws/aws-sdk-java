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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The input for the data quality monitoring job. Currently endpoints are supported for input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DataQualityJobInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualityJobInput implements Serializable, Cloneable, StructuredPojo {

    private EndpointInput endpointInput;

    /**
     * @param endpointInput
     */

    public void setEndpointInput(EndpointInput endpointInput) {
        this.endpointInput = endpointInput;
    }

    /**
     * @return
     */

    public EndpointInput getEndpointInput() {
        return this.endpointInput;
    }

    /**
     * @param endpointInput
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityJobInput withEndpointInput(EndpointInput endpointInput) {
        setEndpointInput(endpointInput);
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
        if (getEndpointInput() != null)
            sb.append("EndpointInput: ").append(getEndpointInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQualityJobInput == false)
            return false;
        DataQualityJobInput other = (DataQualityJobInput) obj;
        if (other.getEndpointInput() == null ^ this.getEndpointInput() == null)
            return false;
        if (other.getEndpointInput() != null && other.getEndpointInput().equals(this.getEndpointInput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointInput() == null) ? 0 : getEndpointInput().hashCode());
        return hashCode;
    }

    @Override
    public DataQualityJobInput clone() {
        try {
            return (DataQualityJobInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DataQualityJobInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

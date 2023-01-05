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
package com.amazonaws.services.appconfigdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about the input that failed to satisfy the constraints specified by a call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/BadRequestDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BadRequestDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more specified parameters are not valid for the call.
     * </p>
     */
    private java.util.Map<String, InvalidParameterDetail> invalidParameters;

    /**
     * <p>
     * One or more specified parameters are not valid for the call.
     * </p>
     * 
     * @return One or more specified parameters are not valid for the call.
     */

    public java.util.Map<String, InvalidParameterDetail> getInvalidParameters() {
        return invalidParameters;
    }

    /**
     * <p>
     * One or more specified parameters are not valid for the call.
     * </p>
     * 
     * @param invalidParameters
     *        One or more specified parameters are not valid for the call.
     */

    public void setInvalidParameters(java.util.Map<String, InvalidParameterDetail> invalidParameters) {
        this.invalidParameters = invalidParameters;
    }

    /**
     * <p>
     * One or more specified parameters are not valid for the call.
     * </p>
     * 
     * @param invalidParameters
     *        One or more specified parameters are not valid for the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestDetails withInvalidParameters(java.util.Map<String, InvalidParameterDetail> invalidParameters) {
        setInvalidParameters(invalidParameters);
        return this;
    }

    /**
     * Add a single InvalidParameters entry
     *
     * @see BadRequestDetails#withInvalidParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestDetails addInvalidParametersEntry(String key, InvalidParameterDetail value) {
        if (null == this.invalidParameters) {
            this.invalidParameters = new java.util.HashMap<String, InvalidParameterDetail>();
        }
        if (this.invalidParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.invalidParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into InvalidParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestDetails clearInvalidParametersEntries() {
        this.invalidParameters = null;
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
        if (getInvalidParameters() != null)
            sb.append("InvalidParameters: ").append(getInvalidParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BadRequestDetails == false)
            return false;
        BadRequestDetails other = (BadRequestDetails) obj;
        if (other.getInvalidParameters() == null ^ this.getInvalidParameters() == null)
            return false;
        if (other.getInvalidParameters() != null && other.getInvalidParameters().equals(this.getInvalidParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvalidParameters() == null) ? 0 : getInvalidParameters().hashCode());
        return hashCode;
    }

    @Override
    public BadRequestDetails clone() {
        try {
            return (BadRequestDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appconfigdata.model.transform.BadRequestDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

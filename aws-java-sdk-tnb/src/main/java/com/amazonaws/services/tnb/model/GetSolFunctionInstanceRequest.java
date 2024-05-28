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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolFunctionInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the network function.
     * </p>
     */
    private String vnfInstanceId;

    /**
     * <p>
     * ID of the network function.
     * </p>
     * 
     * @param vnfInstanceId
     *        ID of the network function.
     */

    public void setVnfInstanceId(String vnfInstanceId) {
        this.vnfInstanceId = vnfInstanceId;
    }

    /**
     * <p>
     * ID of the network function.
     * </p>
     * 
     * @return ID of the network function.
     */

    public String getVnfInstanceId() {
        return this.vnfInstanceId;
    }

    /**
     * <p>
     * ID of the network function.
     * </p>
     * 
     * @param vnfInstanceId
     *        ID of the network function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionInstanceRequest withVnfInstanceId(String vnfInstanceId) {
        setVnfInstanceId(vnfInstanceId);
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
        if (getVnfInstanceId() != null)
            sb.append("VnfInstanceId: ").append(getVnfInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolFunctionInstanceRequest == false)
            return false;
        GetSolFunctionInstanceRequest other = (GetSolFunctionInstanceRequest) obj;
        if (other.getVnfInstanceId() == null ^ this.getVnfInstanceId() == null)
            return false;
        if (other.getVnfInstanceId() != null && other.getVnfInstanceId().equals(this.getVnfInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVnfInstanceId() == null) ? 0 : getVnfInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public GetSolFunctionInstanceRequest clone() {
        return (GetSolFunctionInstanceRequest) super.clone();
    }

}

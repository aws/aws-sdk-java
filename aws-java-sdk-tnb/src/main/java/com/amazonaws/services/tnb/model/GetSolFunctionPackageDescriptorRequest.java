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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackageDescriptor"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolFunctionPackageDescriptorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates which content types, expressed as MIME types, the client is able to understand.
     * </p>
     */
    private String accept;
    /**
     * <p>
     * ID of the function package.
     * </p>
     */
    private String vnfPkgId;

    /**
     * <p>
     * Indicates which content types, expressed as MIME types, the client is able to understand.
     * </p>
     * 
     * @param accept
     *        Indicates which content types, expressed as MIME types, the client is able to understand.
     * @see DescriptorContentType
     */

    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * <p>
     * Indicates which content types, expressed as MIME types, the client is able to understand.
     * </p>
     * 
     * @return Indicates which content types, expressed as MIME types, the client is able to understand.
     * @see DescriptorContentType
     */

    public String getAccept() {
        return this.accept;
    }

    /**
     * <p>
     * Indicates which content types, expressed as MIME types, the client is able to understand.
     * </p>
     * 
     * @param accept
     *        Indicates which content types, expressed as MIME types, the client is able to understand.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DescriptorContentType
     */

    public GetSolFunctionPackageDescriptorRequest withAccept(String accept) {
        setAccept(accept);
        return this;
    }

    /**
     * <p>
     * Indicates which content types, expressed as MIME types, the client is able to understand.
     * </p>
     * 
     * @param accept
     *        Indicates which content types, expressed as MIME types, the client is able to understand.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DescriptorContentType
     */

    public GetSolFunctionPackageDescriptorRequest withAccept(DescriptorContentType accept) {
        this.accept = accept.toString();
        return this;
    }

    /**
     * <p>
     * ID of the function package.
     * </p>
     * 
     * @param vnfPkgId
     *        ID of the function package.
     */

    public void setVnfPkgId(String vnfPkgId) {
        this.vnfPkgId = vnfPkgId;
    }

    /**
     * <p>
     * ID of the function package.
     * </p>
     * 
     * @return ID of the function package.
     */

    public String getVnfPkgId() {
        return this.vnfPkgId;
    }

    /**
     * <p>
     * ID of the function package.
     * </p>
     * 
     * @param vnfPkgId
     *        ID of the function package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionPackageDescriptorRequest withVnfPkgId(String vnfPkgId) {
        setVnfPkgId(vnfPkgId);
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
        if (getAccept() != null)
            sb.append("Accept: ").append(getAccept()).append(",");
        if (getVnfPkgId() != null)
            sb.append("VnfPkgId: ").append(getVnfPkgId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolFunctionPackageDescriptorRequest == false)
            return false;
        GetSolFunctionPackageDescriptorRequest other = (GetSolFunctionPackageDescriptorRequest) obj;
        if (other.getAccept() == null ^ this.getAccept() == null)
            return false;
        if (other.getAccept() != null && other.getAccept().equals(this.getAccept()) == false)
            return false;
        if (other.getVnfPkgId() == null ^ this.getVnfPkgId() == null)
            return false;
        if (other.getVnfPkgId() != null && other.getVnfPkgId().equals(this.getVnfPkgId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        hashCode = prime * hashCode + ((getVnfPkgId() == null) ? 0 : getVnfPkgId().hashCode());
        return hashCode;
    }

    @Override
    public GetSolFunctionPackageDescriptorRequest clone() {
        return (GetSolFunctionPackageDescriptorRequest) super.clone();
    }

}

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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to get information about the current <a>ClientCertificate</a> resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetClientCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The identifier of the <a>ClientCertificate</a> resource to be described.
     * </p>
     */
    private String clientCertificateId;

    /**
     * <p>
     * [Required] The identifier of the <a>ClientCertificate</a> resource to be described.
     * </p>
     * 
     * @param clientCertificateId
     *        [Required] The identifier of the <a>ClientCertificate</a> resource to be described.
     */

    public void setClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>ClientCertificate</a> resource to be described.
     * </p>
     * 
     * @return [Required] The identifier of the <a>ClientCertificate</a> resource to be described.
     */

    public String getClientCertificateId() {
        return this.clientCertificateId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>ClientCertificate</a> resource to be described.
     * </p>
     * 
     * @param clientCertificateId
     *        [Required] The identifier of the <a>ClientCertificate</a> resource to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClientCertificateRequest withClientCertificateId(String clientCertificateId) {
        setClientCertificateId(clientCertificateId);
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
        if (getClientCertificateId() != null)
            sb.append("ClientCertificateId: ").append(getClientCertificateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClientCertificateRequest == false)
            return false;
        GetClientCertificateRequest other = (GetClientCertificateRequest) obj;
        if (other.getClientCertificateId() == null ^ this.getClientCertificateId() == null)
            return false;
        if (other.getClientCertificateId() != null && other.getClientCertificateId().equals(this.getClientCertificateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientCertificateId() == null) ? 0 : getClientCertificateId().hashCode());
        return hashCode;
    }

    @Override
    public GetClientCertificateRequest clone() {
        return (GetClientCertificateRequest) super.clone();
    }

}

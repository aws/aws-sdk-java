/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to delete the <a>ClientCertificate</a> resource.
 * </p>
 */
public class DeleteClientCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the <a>ClientCertificate</a> resource to be deleted.
     * </p>
     */
    private String clientCertificateId;

    /**
     * <p>
     * The identifier of the <a>ClientCertificate</a> resource to be deleted.
     * </p>
     * 
     * @param clientCertificateId
     *        The identifier of the <a>ClientCertificate</a> resource to be deleted.
     */

    public void setClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    /**
     * <p>
     * The identifier of the <a>ClientCertificate</a> resource to be deleted.
     * </p>
     * 
     * @return The identifier of the <a>ClientCertificate</a> resource to be deleted.
     */

    public String getClientCertificateId() {
        return this.clientCertificateId;
    }

    /**
     * <p>
     * The identifier of the <a>ClientCertificate</a> resource to be deleted.
     * </p>
     * 
     * @param clientCertificateId
     *        The identifier of the <a>ClientCertificate</a> resource to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteClientCertificateRequest withClientCertificateId(String clientCertificateId) {
        setClientCertificateId(clientCertificateId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ClientCertificateId: " + getClientCertificateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteClientCertificateRequest == false)
            return false;
        DeleteClientCertificateRequest other = (DeleteClientCertificateRequest) obj;
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
    public DeleteClientCertificateRequest clone() {
        return (DeleteClientCertificateRequest) super.clone();
    }
}

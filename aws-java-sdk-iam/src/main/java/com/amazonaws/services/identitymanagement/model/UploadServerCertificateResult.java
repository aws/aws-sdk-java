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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a successful <a>UploadServerCertificate</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UploadServerCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadServerCertificateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The meta information of the uploaded server certificate without its certificate body, certificate chain, and
     * private key.
     * </p>
     */
    private ServerCertificateMetadata serverCertificateMetadata;

    /**
     * <p>
     * The meta information of the uploaded server certificate without its certificate body, certificate chain, and
     * private key.
     * </p>
     * 
     * @param serverCertificateMetadata
     *        The meta information of the uploaded server certificate without its certificate body, certificate chain,
     *        and private key.
     */

    public void setServerCertificateMetadata(ServerCertificateMetadata serverCertificateMetadata) {
        this.serverCertificateMetadata = serverCertificateMetadata;
    }

    /**
     * <p>
     * The meta information of the uploaded server certificate without its certificate body, certificate chain, and
     * private key.
     * </p>
     * 
     * @return The meta information of the uploaded server certificate without its certificate body, certificate chain,
     *         and private key.
     */

    public ServerCertificateMetadata getServerCertificateMetadata() {
        return this.serverCertificateMetadata;
    }

    /**
     * <p>
     * The meta information of the uploaded server certificate without its certificate body, certificate chain, and
     * private key.
     * </p>
     * 
     * @param serverCertificateMetadata
     *        The meta information of the uploaded server certificate without its certificate body, certificate chain,
     *        and private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadServerCertificateResult withServerCertificateMetadata(ServerCertificateMetadata serverCertificateMetadata) {
        setServerCertificateMetadata(serverCertificateMetadata);
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
        if (getServerCertificateMetadata() != null)
            sb.append("ServerCertificateMetadata: ").append(getServerCertificateMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadServerCertificateResult == false)
            return false;
        UploadServerCertificateResult other = (UploadServerCertificateResult) obj;
        if (other.getServerCertificateMetadata() == null ^ this.getServerCertificateMetadata() == null)
            return false;
        if (other.getServerCertificateMetadata() != null && other.getServerCertificateMetadata().equals(this.getServerCertificateMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerCertificateMetadata() == null) ? 0 : getServerCertificateMetadata().hashCode());
        return hashCode;
    }

    @Override
    public UploadServerCertificateResult clone() {
        try {
            return (UploadServerCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

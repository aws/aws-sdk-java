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
 * Contains information about a server certificate.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>GetServerCertificate</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ServerCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerCertificate implements Serializable, Cloneable {

    /**
     * <p>
     * The meta information of the server certificate, such as its name, path, ID, and ARN.
     * </p>
     */
    private ServerCertificateMetadata serverCertificateMetadata;
    /**
     * <p>
     * The contents of the public key certificate.
     * </p>
     */
    private String certificateBody;
    /**
     * <p>
     * The contents of the public key certificate chain.
     * </p>
     */
    private String certificateChain;

    /**
     * Default constructor for ServerCertificate object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public ServerCertificate() {
    }

    /**
     * Constructs a new ServerCertificate object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param serverCertificateMetadata
     *        The meta information of the server certificate, such as its name, path, ID, and ARN.
     * @param certificateBody
     *        The contents of the public key certificate.
     */
    public ServerCertificate(ServerCertificateMetadata serverCertificateMetadata, String certificateBody) {
        setServerCertificateMetadata(serverCertificateMetadata);
        setCertificateBody(certificateBody);
    }

    /**
     * <p>
     * The meta information of the server certificate, such as its name, path, ID, and ARN.
     * </p>
     * 
     * @param serverCertificateMetadata
     *        The meta information of the server certificate, such as its name, path, ID, and ARN.
     */

    public void setServerCertificateMetadata(ServerCertificateMetadata serverCertificateMetadata) {
        this.serverCertificateMetadata = serverCertificateMetadata;
    }

    /**
     * <p>
     * The meta information of the server certificate, such as its name, path, ID, and ARN.
     * </p>
     * 
     * @return The meta information of the server certificate, such as its name, path, ID, and ARN.
     */

    public ServerCertificateMetadata getServerCertificateMetadata() {
        return this.serverCertificateMetadata;
    }

    /**
     * <p>
     * The meta information of the server certificate, such as its name, path, ID, and ARN.
     * </p>
     * 
     * @param serverCertificateMetadata
     *        The meta information of the server certificate, such as its name, path, ID, and ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificate withServerCertificateMetadata(ServerCertificateMetadata serverCertificateMetadata) {
        setServerCertificateMetadata(serverCertificateMetadata);
        return this;
    }

    /**
     * <p>
     * The contents of the public key certificate.
     * </p>
     * 
     * @param certificateBody
     *        The contents of the public key certificate.
     */

    public void setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
    }

    /**
     * <p>
     * The contents of the public key certificate.
     * </p>
     * 
     * @return The contents of the public key certificate.
     */

    public String getCertificateBody() {
        return this.certificateBody;
    }

    /**
     * <p>
     * The contents of the public key certificate.
     * </p>
     * 
     * @param certificateBody
     *        The contents of the public key certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificate withCertificateBody(String certificateBody) {
        setCertificateBody(certificateBody);
        return this;
    }

    /**
     * <p>
     * The contents of the public key certificate chain.
     * </p>
     * 
     * @param certificateChain
     *        The contents of the public key certificate chain.
     */

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * The contents of the public key certificate chain.
     * </p>
     * 
     * @return The contents of the public key certificate chain.
     */

    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * The contents of the public key certificate chain.
     * </p>
     * 
     * @param certificateChain
     *        The contents of the public key certificate chain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificate withCertificateChain(String certificateChain) {
        setCertificateChain(certificateChain);
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
            sb.append("ServerCertificateMetadata: ").append(getServerCertificateMetadata()).append(",");
        if (getCertificateBody() != null)
            sb.append("CertificateBody: ").append(getCertificateBody()).append(",");
        if (getCertificateChain() != null)
            sb.append("CertificateChain: ").append(getCertificateChain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerCertificate == false)
            return false;
        ServerCertificate other = (ServerCertificate) obj;
        if (other.getServerCertificateMetadata() == null ^ this.getServerCertificateMetadata() == null)
            return false;
        if (other.getServerCertificateMetadata() != null && other.getServerCertificateMetadata().equals(this.getServerCertificateMetadata()) == false)
            return false;
        if (other.getCertificateBody() == null ^ this.getCertificateBody() == null)
            return false;
        if (other.getCertificateBody() != null && other.getCertificateBody().equals(this.getCertificateBody()) == false)
            return false;
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerCertificateMetadata() == null) ? 0 : getServerCertificateMetadata().hashCode());
        hashCode = prime * hashCode + ((getCertificateBody() == null) ? 0 : getCertificateBody().hashCode());
        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        return hashCode;
    }

    @Override
    public ServerCertificate clone() {
        try {
            return (ServerCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

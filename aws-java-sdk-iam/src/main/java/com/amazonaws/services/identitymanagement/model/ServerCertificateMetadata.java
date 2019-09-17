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
 * Contains information about a server certificate without its certificate body, certificate chain, and private key.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>UploadServerCertificate</a> and <a>ListServerCertificates</a>
 * operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ServerCertificateMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerCertificateMetadata implements Serializable, Cloneable {

    /**
     * <p>
     * The path to the server certificate. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The name that identifies the server certificate.
     * </p>
     */
    private String serverCertificateName;
    /**
     * <p>
     * The stable and unique string identifying the server certificate. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     */
    private String serverCertificateId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the server certificate. For more information about ARNs and how to use
     * them in policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date when the server certificate was uploaded.
     * </p>
     */
    private java.util.Date uploadDate;
    /**
     * <p>
     * The date on which the certificate is set to expire.
     * </p>
     */
    private java.util.Date expiration;

    /**
     * Default constructor for ServerCertificateMetadata object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public ServerCertificateMetadata() {
    }

    /**
     * Constructs a new ServerCertificateMetadata object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param path
     *        The path to the server certificate. For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @param serverCertificateName
     *        The name that identifies the server certificate.
     * @param serverCertificateId
     *        The stable and unique string identifying the server certificate. For more information about IDs, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @param arn
     *        The Amazon Resource Name (ARN) specifying the server certificate. For more information about ARNs and how
     *        to use them in policies, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */
    public ServerCertificateMetadata(String path, String serverCertificateName, String serverCertificateId, String arn) {
        setPath(path);
        setServerCertificateName(serverCertificateName);
        setServerCertificateId(serverCertificateId);
        setArn(arn);
    }

    /**
     * <p>
     * The path to the server certificate. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the server certificate. For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the server certificate. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @return The path to the server certificate. For more information about paths, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the server certificate. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the server certificate. For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateMetadata withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The name that identifies the server certificate.
     * </p>
     * 
     * @param serverCertificateName
     *        The name that identifies the server certificate.
     */

    public void setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
    }

    /**
     * <p>
     * The name that identifies the server certificate.
     * </p>
     * 
     * @return The name that identifies the server certificate.
     */

    public String getServerCertificateName() {
        return this.serverCertificateName;
    }

    /**
     * <p>
     * The name that identifies the server certificate.
     * </p>
     * 
     * @param serverCertificateName
     *        The name that identifies the server certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateMetadata withServerCertificateName(String serverCertificateName) {
        setServerCertificateName(serverCertificateName);
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the server certificate. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param serverCertificateId
     *        The stable and unique string identifying the server certificate. For more information about IDs, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
    }

    /**
     * <p>
     * The stable and unique string identifying the server certificate. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @return The stable and unique string identifying the server certificate. For more information about IDs, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    /**
     * <p>
     * The stable and unique string identifying the server certificate. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param serverCertificateId
     *        The stable and unique string identifying the server certificate. For more information about IDs, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateMetadata withServerCertificateId(String serverCertificateId) {
        setServerCertificateId(serverCertificateId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the server certificate. For more information about ARNs and how to use
     * them in policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) specifying the server certificate. For more information about ARNs and how
     *        to use them in policies, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the server certificate. For more information about ARNs and how to use
     * them in policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) specifying the server certificate. For more information about ARNs and how
     *         to use them in policies, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the server certificate. For more information about ARNs and how to use
     * them in policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) specifying the server certificate. For more information about ARNs and how
     *        to use them in policies, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateMetadata withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date when the server certificate was uploaded.
     * </p>
     * 
     * @param uploadDate
     *        The date when the server certificate was uploaded.
     */

    public void setUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * <p>
     * The date when the server certificate was uploaded.
     * </p>
     * 
     * @return The date when the server certificate was uploaded.
     */

    public java.util.Date getUploadDate() {
        return this.uploadDate;
    }

    /**
     * <p>
     * The date when the server certificate was uploaded.
     * </p>
     * 
     * @param uploadDate
     *        The date when the server certificate was uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateMetadata withUploadDate(java.util.Date uploadDate) {
        setUploadDate(uploadDate);
        return this;
    }

    /**
     * <p>
     * The date on which the certificate is set to expire.
     * </p>
     * 
     * @param expiration
     *        The date on which the certificate is set to expire.
     */

    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * The date on which the certificate is set to expire.
     * </p>
     * 
     * @return The date on which the certificate is set to expire.
     */

    public java.util.Date getExpiration() {
        return this.expiration;
    }

    /**
     * <p>
     * The date on which the certificate is set to expire.
     * </p>
     * 
     * @param expiration
     *        The date on which the certificate is set to expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateMetadata withExpiration(java.util.Date expiration) {
        setExpiration(expiration);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getServerCertificateName() != null)
            sb.append("ServerCertificateName: ").append(getServerCertificateName()).append(",");
        if (getServerCertificateId() != null)
            sb.append("ServerCertificateId: ").append(getServerCertificateId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getUploadDate() != null)
            sb.append("UploadDate: ").append(getUploadDate()).append(",");
        if (getExpiration() != null)
            sb.append("Expiration: ").append(getExpiration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerCertificateMetadata == false)
            return false;
        ServerCertificateMetadata other = (ServerCertificateMetadata) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getServerCertificateName() == null ^ this.getServerCertificateName() == null)
            return false;
        if (other.getServerCertificateName() != null && other.getServerCertificateName().equals(this.getServerCertificateName()) == false)
            return false;
        if (other.getServerCertificateId() == null ^ this.getServerCertificateId() == null)
            return false;
        if (other.getServerCertificateId() != null && other.getServerCertificateId().equals(this.getServerCertificateId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getUploadDate() == null ^ this.getUploadDate() == null)
            return false;
        if (other.getUploadDate() != null && other.getUploadDate().equals(this.getUploadDate()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getServerCertificateName() == null) ? 0 : getServerCertificateName().hashCode());
        hashCode = prime * hashCode + ((getServerCertificateId() == null) ? 0 : getServerCertificateId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getUploadDate() == null) ? 0 : getUploadDate().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        return hashCode;
    }

    @Override
    public ServerCertificateMetadata clone() {
        try {
            return (ServerCertificateMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

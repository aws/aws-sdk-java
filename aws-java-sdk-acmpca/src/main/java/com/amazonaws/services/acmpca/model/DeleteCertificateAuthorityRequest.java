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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DeleteCertificateAuthority" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCertificateAuthorityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a>CreateCertificateAuthority</a>. This must
     * have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * The number of days to make a CA restorable after it has been deleted. This can be anywhere from 7 to 30 days,
     * with 30 being the default.
     * </p>
     */
    private Integer permanentDeletionTimeInDays;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a>CreateCertificateAuthority</a>. This must
     * have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a>CreateCertificateAuthority</a>. This
     *        must have the following form: </p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>.
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a>CreateCertificateAuthority</a>. This must
     * have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that was returned when you called <a>CreateCertificateAuthority</a>. This
     *         must have the following form: </p>
     *         <p>
     *         <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>.
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a>CreateCertificateAuthority</a>. This must
     * have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a>CreateCertificateAuthority</a>. This
     *        must have the following form: </p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCertificateAuthorityRequest withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * The number of days to make a CA restorable after it has been deleted. This can be anywhere from 7 to 30 days,
     * with 30 being the default.
     * </p>
     * 
     * @param permanentDeletionTimeInDays
     *        The number of days to make a CA restorable after it has been deleted. This can be anywhere from 7 to 30
     *        days, with 30 being the default.
     */

    public void setPermanentDeletionTimeInDays(Integer permanentDeletionTimeInDays) {
        this.permanentDeletionTimeInDays = permanentDeletionTimeInDays;
    }

    /**
     * <p>
     * The number of days to make a CA restorable after it has been deleted. This can be anywhere from 7 to 30 days,
     * with 30 being the default.
     * </p>
     * 
     * @return The number of days to make a CA restorable after it has been deleted. This can be anywhere from 7 to 30
     *         days, with 30 being the default.
     */

    public Integer getPermanentDeletionTimeInDays() {
        return this.permanentDeletionTimeInDays;
    }

    /**
     * <p>
     * The number of days to make a CA restorable after it has been deleted. This can be anywhere from 7 to 30 days,
     * with 30 being the default.
     * </p>
     * 
     * @param permanentDeletionTimeInDays
     *        The number of days to make a CA restorable after it has been deleted. This can be anywhere from 7 to 30
     *        days, with 30 being the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCertificateAuthorityRequest withPermanentDeletionTimeInDays(Integer permanentDeletionTimeInDays) {
        setPermanentDeletionTimeInDays(permanentDeletionTimeInDays);
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
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn()).append(",");
        if (getPermanentDeletionTimeInDays() != null)
            sb.append("PermanentDeletionTimeInDays: ").append(getPermanentDeletionTimeInDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCertificateAuthorityRequest == false)
            return false;
        DeleteCertificateAuthorityRequest other = (DeleteCertificateAuthorityRequest) obj;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getPermanentDeletionTimeInDays() == null ^ this.getPermanentDeletionTimeInDays() == null)
            return false;
        if (other.getPermanentDeletionTimeInDays() != null && other.getPermanentDeletionTimeInDays().equals(this.getPermanentDeletionTimeInDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getPermanentDeletionTimeInDays() == null) ? 0 : getPermanentDeletionTimeInDays().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCertificateAuthorityRequest clone() {
        return (DeleteCertificateAuthorityRequest) super.clone();
    }

}

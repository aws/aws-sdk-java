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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/UpdateCertificateOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCertificateOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN of the requested certificate to update. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:us-east-1:<i>account</i>:certificate/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * Use to update the options for your certificate. Currently, you can specify whether to add your certificate to a
     * transparency log. Certificate transparency makes it possible to detect SSL/TLS certificates that have been
     * mistakenly or maliciously issued. Certificates that have not been logged typically produce an error message in a
     * browser.
     * </p>
     */
    private CertificateOptions options;

    /**
     * <p>
     * ARN of the requested certificate to update. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:us-east-1:<i>account</i>:certificate/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     * 
     * @param certificateArn
     *        ARN of the requested certificate to update. This must be of the form:</p>
     *        <p>
     *        <code>arn:aws:acm:us-east-1:<i>account</i>:certificate/<i>12345678-1234-1234-1234-123456789012</i> </code>
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * ARN of the requested certificate to update. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:us-east-1:<i>account</i>:certificate/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     * 
     * @return ARN of the requested certificate to update. This must be of the form:</p>
     *         <p>
     *         <code>arn:aws:acm:us-east-1:<i>account</i>:certificate/<i>12345678-1234-1234-1234-123456789012</i> </code>
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * ARN of the requested certificate to update. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:us-east-1:<i>account</i>:certificate/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     * 
     * @param certificateArn
     *        ARN of the requested certificate to update. This must be of the form:</p>
     *        <p>
     *        <code>arn:aws:acm:us-east-1:<i>account</i>:certificate/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCertificateOptionsRequest withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * Use to update the options for your certificate. Currently, you can specify whether to add your certificate to a
     * transparency log. Certificate transparency makes it possible to detect SSL/TLS certificates that have been
     * mistakenly or maliciously issued. Certificates that have not been logged typically produce an error message in a
     * browser.
     * </p>
     * 
     * @param options
     *        Use to update the options for your certificate. Currently, you can specify whether to add your certificate
     *        to a transparency log. Certificate transparency makes it possible to detect SSL/TLS certificates that have
     *        been mistakenly or maliciously issued. Certificates that have not been logged typically produce an error
     *        message in a browser.
     */

    public void setOptions(CertificateOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * Use to update the options for your certificate. Currently, you can specify whether to add your certificate to a
     * transparency log. Certificate transparency makes it possible to detect SSL/TLS certificates that have been
     * mistakenly or maliciously issued. Certificates that have not been logged typically produce an error message in a
     * browser.
     * </p>
     * 
     * @return Use to update the options for your certificate. Currently, you can specify whether to add your
     *         certificate to a transparency log. Certificate transparency makes it possible to detect SSL/TLS
     *         certificates that have been mistakenly or maliciously issued. Certificates that have not been logged
     *         typically produce an error message in a browser.
     */

    public CertificateOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * Use to update the options for your certificate. Currently, you can specify whether to add your certificate to a
     * transparency log. Certificate transparency makes it possible to detect SSL/TLS certificates that have been
     * mistakenly or maliciously issued. Certificates that have not been logged typically produce an error message in a
     * browser.
     * </p>
     * 
     * @param options
     *        Use to update the options for your certificate. Currently, you can specify whether to add your certificate
     *        to a transparency log. Certificate transparency makes it possible to detect SSL/TLS certificates that have
     *        been mistakenly or maliciously issued. Certificates that have not been logged typically produce an error
     *        message in a browser.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCertificateOptionsRequest withOptions(CertificateOptions options) {
        setOptions(options);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCertificateOptionsRequest == false)
            return false;
        UpdateCertificateOptionsRequest other = (UpdateCertificateOptionsRequest) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCertificateOptionsRequest clone() {
        return (UpdateCertificateOptionsRequest) super.clone();
    }

}

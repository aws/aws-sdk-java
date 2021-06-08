/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * If specified, API Gateway performs two-way authentication between the client and the server. Clients must present a
 * trusted certificate to access your custom domain name.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MutualTlsAuthentication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example
     * <code>s3://bucket-name/key-name</code>. The truststore can contain certificates from public or private
     * certificate authorities. To update the truststore, upload a new version to S3, and then update your custom domain
     * name to use the new version. To update the truststore, you must have permissions to access the S3 object.
     * </p>
     */
    private String truststoreUri;
    /**
     * <p>
     * The version of the S3 object that contains your truststore. To specify a version, you must have versioning
     * enabled for the S3 bucket.
     * </p>
     */
    private String truststoreVersion;
    /**
     * <p>
     * A list of warnings that API Gateway returns while processing your truststore. Invalid certificates produce
     * warnings. Mutual TLS is still enabled, but some clients might not be able to access your API. To resolve
     * warnings, upload a new truststore to S3, and then update you domain name to use the new version.
     * </p>
     */
    private java.util.List<String> truststoreWarnings;

    /**
     * <p>
     * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example
     * <code>s3://bucket-name/key-name</code>. The truststore can contain certificates from public or private
     * certificate authorities. To update the truststore, upload a new version to S3, and then update your custom domain
     * name to use the new version. To update the truststore, you must have permissions to access the S3 object.
     * </p>
     * 
     * @param truststoreUri
     *        An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example
     *        <code>s3://bucket-name/key-name</code>. The truststore can contain certificates from public or private
     *        certificate authorities. To update the truststore, upload a new version to S3, and then update your custom
     *        domain name to use the new version. To update the truststore, you must have permissions to access the S3
     *        object.
     */

    public void setTruststoreUri(String truststoreUri) {
        this.truststoreUri = truststoreUri;
    }

    /**
     * <p>
     * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example
     * <code>s3://bucket-name/key-name</code>. The truststore can contain certificates from public or private
     * certificate authorities. To update the truststore, upload a new version to S3, and then update your custom domain
     * name to use the new version. To update the truststore, you must have permissions to access the S3 object.
     * </p>
     * 
     * @return An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example
     *         <code>s3://bucket-name/key-name</code>. The truststore can contain certificates from public or private
     *         certificate authorities. To update the truststore, upload a new version to S3, and then update your
     *         custom domain name to use the new version. To update the truststore, you must have permissions to access
     *         the S3 object.
     */

    public String getTruststoreUri() {
        return this.truststoreUri;
    }

    /**
     * <p>
     * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example
     * <code>s3://bucket-name/key-name</code>. The truststore can contain certificates from public or private
     * certificate authorities. To update the truststore, upload a new version to S3, and then update your custom domain
     * name to use the new version. To update the truststore, you must have permissions to access the S3 object.
     * </p>
     * 
     * @param truststoreUri
     *        An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example
     *        <code>s3://bucket-name/key-name</code>. The truststore can contain certificates from public or private
     *        certificate authorities. To update the truststore, upload a new version to S3, and then update your custom
     *        domain name to use the new version. To update the truststore, you must have permissions to access the S3
     *        object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutualTlsAuthentication withTruststoreUri(String truststoreUri) {
        setTruststoreUri(truststoreUri);
        return this;
    }

    /**
     * <p>
     * The version of the S3 object that contains your truststore. To specify a version, you must have versioning
     * enabled for the S3 bucket.
     * </p>
     * 
     * @param truststoreVersion
     *        The version of the S3 object that contains your truststore. To specify a version, you must have versioning
     *        enabled for the S3 bucket.
     */

    public void setTruststoreVersion(String truststoreVersion) {
        this.truststoreVersion = truststoreVersion;
    }

    /**
     * <p>
     * The version of the S3 object that contains your truststore. To specify a version, you must have versioning
     * enabled for the S3 bucket.
     * </p>
     * 
     * @return The version of the S3 object that contains your truststore. To specify a version, you must have
     *         versioning enabled for the S3 bucket.
     */

    public String getTruststoreVersion() {
        return this.truststoreVersion;
    }

    /**
     * <p>
     * The version of the S3 object that contains your truststore. To specify a version, you must have versioning
     * enabled for the S3 bucket.
     * </p>
     * 
     * @param truststoreVersion
     *        The version of the S3 object that contains your truststore. To specify a version, you must have versioning
     *        enabled for the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutualTlsAuthentication withTruststoreVersion(String truststoreVersion) {
        setTruststoreVersion(truststoreVersion);
        return this;
    }

    /**
     * <p>
     * A list of warnings that API Gateway returns while processing your truststore. Invalid certificates produce
     * warnings. Mutual TLS is still enabled, but some clients might not be able to access your API. To resolve
     * warnings, upload a new truststore to S3, and then update you domain name to use the new version.
     * </p>
     * 
     * @return A list of warnings that API Gateway returns while processing your truststore. Invalid certificates
     *         produce warnings. Mutual TLS is still enabled, but some clients might not be able to access your API. To
     *         resolve warnings, upload a new truststore to S3, and then update you domain name to use the new version.
     */

    public java.util.List<String> getTruststoreWarnings() {
        return truststoreWarnings;
    }

    /**
     * <p>
     * A list of warnings that API Gateway returns while processing your truststore. Invalid certificates produce
     * warnings. Mutual TLS is still enabled, but some clients might not be able to access your API. To resolve
     * warnings, upload a new truststore to S3, and then update you domain name to use the new version.
     * </p>
     * 
     * @param truststoreWarnings
     *        A list of warnings that API Gateway returns while processing your truststore. Invalid certificates produce
     *        warnings. Mutual TLS is still enabled, but some clients might not be able to access your API. To resolve
     *        warnings, upload a new truststore to S3, and then update you domain name to use the new version.
     */

    public void setTruststoreWarnings(java.util.Collection<String> truststoreWarnings) {
        if (truststoreWarnings == null) {
            this.truststoreWarnings = null;
            return;
        }

        this.truststoreWarnings = new java.util.ArrayList<String>(truststoreWarnings);
    }

    /**
     * <p>
     * A list of warnings that API Gateway returns while processing your truststore. Invalid certificates produce
     * warnings. Mutual TLS is still enabled, but some clients might not be able to access your API. To resolve
     * warnings, upload a new truststore to S3, and then update you domain name to use the new version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTruststoreWarnings(java.util.Collection)} or {@link #withTruststoreWarnings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param truststoreWarnings
     *        A list of warnings that API Gateway returns while processing your truststore. Invalid certificates produce
     *        warnings. Mutual TLS is still enabled, but some clients might not be able to access your API. To resolve
     *        warnings, upload a new truststore to S3, and then update you domain name to use the new version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutualTlsAuthentication withTruststoreWarnings(String... truststoreWarnings) {
        if (this.truststoreWarnings == null) {
            setTruststoreWarnings(new java.util.ArrayList<String>(truststoreWarnings.length));
        }
        for (String ele : truststoreWarnings) {
            this.truststoreWarnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of warnings that API Gateway returns while processing your truststore. Invalid certificates produce
     * warnings. Mutual TLS is still enabled, but some clients might not be able to access your API. To resolve
     * warnings, upload a new truststore to S3, and then update you domain name to use the new version.
     * </p>
     * 
     * @param truststoreWarnings
     *        A list of warnings that API Gateway returns while processing your truststore. Invalid certificates produce
     *        warnings. Mutual TLS is still enabled, but some clients might not be able to access your API. To resolve
     *        warnings, upload a new truststore to S3, and then update you domain name to use the new version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutualTlsAuthentication withTruststoreWarnings(java.util.Collection<String> truststoreWarnings) {
        setTruststoreWarnings(truststoreWarnings);
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
        if (getTruststoreUri() != null)
            sb.append("TruststoreUri: ").append(getTruststoreUri()).append(",");
        if (getTruststoreVersion() != null)
            sb.append("TruststoreVersion: ").append(getTruststoreVersion()).append(",");
        if (getTruststoreWarnings() != null)
            sb.append("TruststoreWarnings: ").append(getTruststoreWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MutualTlsAuthentication == false)
            return false;
        MutualTlsAuthentication other = (MutualTlsAuthentication) obj;
        if (other.getTruststoreUri() == null ^ this.getTruststoreUri() == null)
            return false;
        if (other.getTruststoreUri() != null && other.getTruststoreUri().equals(this.getTruststoreUri()) == false)
            return false;
        if (other.getTruststoreVersion() == null ^ this.getTruststoreVersion() == null)
            return false;
        if (other.getTruststoreVersion() != null && other.getTruststoreVersion().equals(this.getTruststoreVersion()) == false)
            return false;
        if (other.getTruststoreWarnings() == null ^ this.getTruststoreWarnings() == null)
            return false;
        if (other.getTruststoreWarnings() != null && other.getTruststoreWarnings().equals(this.getTruststoreWarnings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTruststoreUri() == null) ? 0 : getTruststoreUri().hashCode());
        hashCode = prime * hashCode + ((getTruststoreVersion() == null) ? 0 : getTruststoreVersion().hashCode());
        hashCode = prime * hashCode + ((getTruststoreWarnings() == null) ? 0 : getTruststoreWarnings().hashCode());
        return hashCode;
    }

    @Override
    public MutualTlsAuthentication clone() {
        try {
            return (MutualTlsAuthentication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigateway.model.transform.MutualTlsAuthenticationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

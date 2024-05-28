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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the mutual authentication attributes of a listener.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/MutualAuthenticationAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MutualAuthenticationAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The client certificate handling method. Options are <code>off</code>, <code>passthrough</code> or
     * <code>verify</code>. The default value is <code>off</code>.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     */
    private String trustStoreArn;
    /**
     * <p>
     * Indicates whether expired client certificates are ignored.
     * </p>
     */
    private Boolean ignoreClientCertificateExpiry;

    /**
     * <p>
     * The client certificate handling method. Options are <code>off</code>, <code>passthrough</code> or
     * <code>verify</code>. The default value is <code>off</code>.
     * </p>
     * 
     * @param mode
     *        The client certificate handling method. Options are <code>off</code>, <code>passthrough</code> or
     *        <code>verify</code>. The default value is <code>off</code>.
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The client certificate handling method. Options are <code>off</code>, <code>passthrough</code> or
     * <code>verify</code>. The default value is <code>off</code>.
     * </p>
     * 
     * @return The client certificate handling method. Options are <code>off</code>, <code>passthrough</code> or
     *         <code>verify</code>. The default value is <code>off</code>.
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The client certificate handling method. Options are <code>off</code>, <code>passthrough</code> or
     * <code>verify</code>. The default value is <code>off</code>.
     * </p>
     * 
     * @param mode
     *        The client certificate handling method. Options are <code>off</code>, <code>passthrough</code> or
     *        <code>verify</code>. The default value is <code>off</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutualAuthenticationAttributes withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The Amazon Resource Name (ARN) of the trust store.
     */

    public void setTrustStoreArn(String trustStoreArn) {
        this.trustStoreArn = trustStoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the trust store.
     */

    public String getTrustStoreArn() {
        return this.trustStoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The Amazon Resource Name (ARN) of the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutualAuthenticationAttributes withTrustStoreArn(String trustStoreArn) {
        setTrustStoreArn(trustStoreArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether expired client certificates are ignored.
     * </p>
     * 
     * @param ignoreClientCertificateExpiry
     *        Indicates whether expired client certificates are ignored.
     */

    public void setIgnoreClientCertificateExpiry(Boolean ignoreClientCertificateExpiry) {
        this.ignoreClientCertificateExpiry = ignoreClientCertificateExpiry;
    }

    /**
     * <p>
     * Indicates whether expired client certificates are ignored.
     * </p>
     * 
     * @return Indicates whether expired client certificates are ignored.
     */

    public Boolean getIgnoreClientCertificateExpiry() {
        return this.ignoreClientCertificateExpiry;
    }

    /**
     * <p>
     * Indicates whether expired client certificates are ignored.
     * </p>
     * 
     * @param ignoreClientCertificateExpiry
     *        Indicates whether expired client certificates are ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutualAuthenticationAttributes withIgnoreClientCertificateExpiry(Boolean ignoreClientCertificateExpiry) {
        setIgnoreClientCertificateExpiry(ignoreClientCertificateExpiry);
        return this;
    }

    /**
     * <p>
     * Indicates whether expired client certificates are ignored.
     * </p>
     * 
     * @return Indicates whether expired client certificates are ignored.
     */

    public Boolean isIgnoreClientCertificateExpiry() {
        return this.ignoreClientCertificateExpiry;
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getTrustStoreArn() != null)
            sb.append("TrustStoreArn: ").append(getTrustStoreArn()).append(",");
        if (getIgnoreClientCertificateExpiry() != null)
            sb.append("IgnoreClientCertificateExpiry: ").append(getIgnoreClientCertificateExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MutualAuthenticationAttributes == false)
            return false;
        MutualAuthenticationAttributes other = (MutualAuthenticationAttributes) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getTrustStoreArn() == null ^ this.getTrustStoreArn() == null)
            return false;
        if (other.getTrustStoreArn() != null && other.getTrustStoreArn().equals(this.getTrustStoreArn()) == false)
            return false;
        if (other.getIgnoreClientCertificateExpiry() == null ^ this.getIgnoreClientCertificateExpiry() == null)
            return false;
        if (other.getIgnoreClientCertificateExpiry() != null
                && other.getIgnoreClientCertificateExpiry().equals(this.getIgnoreClientCertificateExpiry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getTrustStoreArn() == null) ? 0 : getTrustStoreArn().hashCode());
        hashCode = prime * hashCode + ((getIgnoreClientCertificateExpiry() == null) ? 0 : getIgnoreClientCertificateExpiry().hashCode());
        return hashCode;
    }

    @Override
    public MutualAuthenticationAttributes clone() {
        try {
            return (MutualAuthenticationAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

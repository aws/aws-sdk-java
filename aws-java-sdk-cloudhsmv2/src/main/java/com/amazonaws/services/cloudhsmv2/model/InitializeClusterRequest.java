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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/InitializeCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InitializeClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier (ID) of the cluster that you are claiming. To find the cluster ID, use <a>DescribeClusters</a>.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The cluster certificate issued (signed) by your issuing certificate authority (CA). The certificate must be in
     * PEM format and can contain a maximum of 5000 characters.
     * </p>
     */
    private String signedCert;
    /**
     * <p>
     * The issuing certificate of the issuing certificate authority (CA) that issued (signed) the cluster certificate.
     * This can be a root (self-signed) certificate or a certificate chain that begins with the certificate that issued
     * the cluster certificate and ends with a root certificate. The certificate or certificate chain must be in PEM
     * format and can contain a maximum of 5000 characters.
     * </p>
     */
    private String trustAnchor;

    /**
     * <p>
     * The identifier (ID) of the cluster that you are claiming. To find the cluster ID, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @param clusterId
     *        The identifier (ID) of the cluster that you are claiming. To find the cluster ID, use
     *        <a>DescribeClusters</a>.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that you are claiming. To find the cluster ID, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @return The identifier (ID) of the cluster that you are claiming. To find the cluster ID, use
     *         <a>DescribeClusters</a>.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that you are claiming. To find the cluster ID, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @param clusterId
     *        The identifier (ID) of the cluster that you are claiming. To find the cluster ID, use
     *        <a>DescribeClusters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitializeClusterRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The cluster certificate issued (signed) by your issuing certificate authority (CA). The certificate must be in
     * PEM format and can contain a maximum of 5000 characters.
     * </p>
     * 
     * @param signedCert
     *        The cluster certificate issued (signed) by your issuing certificate authority (CA). The certificate must
     *        be in PEM format and can contain a maximum of 5000 characters.
     */

    public void setSignedCert(String signedCert) {
        this.signedCert = signedCert;
    }

    /**
     * <p>
     * The cluster certificate issued (signed) by your issuing certificate authority (CA). The certificate must be in
     * PEM format and can contain a maximum of 5000 characters.
     * </p>
     * 
     * @return The cluster certificate issued (signed) by your issuing certificate authority (CA). The certificate must
     *         be in PEM format and can contain a maximum of 5000 characters.
     */

    public String getSignedCert() {
        return this.signedCert;
    }

    /**
     * <p>
     * The cluster certificate issued (signed) by your issuing certificate authority (CA). The certificate must be in
     * PEM format and can contain a maximum of 5000 characters.
     * </p>
     * 
     * @param signedCert
     *        The cluster certificate issued (signed) by your issuing certificate authority (CA). The certificate must
     *        be in PEM format and can contain a maximum of 5000 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitializeClusterRequest withSignedCert(String signedCert) {
        setSignedCert(signedCert);
        return this;
    }

    /**
     * <p>
     * The issuing certificate of the issuing certificate authority (CA) that issued (signed) the cluster certificate.
     * This can be a root (self-signed) certificate or a certificate chain that begins with the certificate that issued
     * the cluster certificate and ends with a root certificate. The certificate or certificate chain must be in PEM
     * format and can contain a maximum of 5000 characters.
     * </p>
     * 
     * @param trustAnchor
     *        The issuing certificate of the issuing certificate authority (CA) that issued (signed) the cluster
     *        certificate. This can be a root (self-signed) certificate or a certificate chain that begins with the
     *        certificate that issued the cluster certificate and ends with a root certificate. The certificate or
     *        certificate chain must be in PEM format and can contain a maximum of 5000 characters.
     */

    public void setTrustAnchor(String trustAnchor) {
        this.trustAnchor = trustAnchor;
    }

    /**
     * <p>
     * The issuing certificate of the issuing certificate authority (CA) that issued (signed) the cluster certificate.
     * This can be a root (self-signed) certificate or a certificate chain that begins with the certificate that issued
     * the cluster certificate and ends with a root certificate. The certificate or certificate chain must be in PEM
     * format and can contain a maximum of 5000 characters.
     * </p>
     * 
     * @return The issuing certificate of the issuing certificate authority (CA) that issued (signed) the cluster
     *         certificate. This can be a root (self-signed) certificate or a certificate chain that begins with the
     *         certificate that issued the cluster certificate and ends with a root certificate. The certificate or
     *         certificate chain must be in PEM format and can contain a maximum of 5000 characters.
     */

    public String getTrustAnchor() {
        return this.trustAnchor;
    }

    /**
     * <p>
     * The issuing certificate of the issuing certificate authority (CA) that issued (signed) the cluster certificate.
     * This can be a root (self-signed) certificate or a certificate chain that begins with the certificate that issued
     * the cluster certificate and ends with a root certificate. The certificate or certificate chain must be in PEM
     * format and can contain a maximum of 5000 characters.
     * </p>
     * 
     * @param trustAnchor
     *        The issuing certificate of the issuing certificate authority (CA) that issued (signed) the cluster
     *        certificate. This can be a root (self-signed) certificate or a certificate chain that begins with the
     *        certificate that issued the cluster certificate and ends with a root certificate. The certificate or
     *        certificate chain must be in PEM format and can contain a maximum of 5000 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitializeClusterRequest withTrustAnchor(String trustAnchor) {
        setTrustAnchor(trustAnchor);
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getSignedCert() != null)
            sb.append("SignedCert: ").append(getSignedCert()).append(",");
        if (getTrustAnchor() != null)
            sb.append("TrustAnchor: ").append(getTrustAnchor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InitializeClusterRequest == false)
            return false;
        InitializeClusterRequest other = (InitializeClusterRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getSignedCert() == null ^ this.getSignedCert() == null)
            return false;
        if (other.getSignedCert() != null && other.getSignedCert().equals(this.getSignedCert()) == false)
            return false;
        if (other.getTrustAnchor() == null ^ this.getTrustAnchor() == null)
            return false;
        if (other.getTrustAnchor() != null && other.getTrustAnchor().equals(this.getTrustAnchor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getSignedCert() == null) ? 0 : getSignedCert().hashCode());
        hashCode = prime * hashCode + ((getTrustAnchor() == null) ? 0 : getTrustAnchor().hashCode());
        return hashCode;
    }

    @Override
    public InitializeClusterRequest clone() {
        return (InitializeClusterRequest) super.clone();
    }

}

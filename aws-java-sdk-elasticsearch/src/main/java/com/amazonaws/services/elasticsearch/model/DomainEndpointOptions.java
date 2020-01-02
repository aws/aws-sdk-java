/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Options to configure endpoint for the Elasticsearch domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainEndpointOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify if only HTTPS endpoint should be enabled for the Elasticsearch domain.
     * </p>
     */
    private Boolean enforceHTTPS;
    /**
     * <p>
     * Specify the TLS security policy that needs to be applied to the HTTPS endpoint of Elasticsearch domain. <br/>
     * It can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which supports only TLSv1.2</li>
     * </ul>
     * </p>
     */
    private String tLSSecurityPolicy;

    /**
     * <p>
     * Specify if only HTTPS endpoint should be enabled for the Elasticsearch domain.
     * </p>
     * 
     * @param enforceHTTPS
     *        Specify if only HTTPS endpoint should be enabled for the Elasticsearch domain.
     */

    public void setEnforceHTTPS(Boolean enforceHTTPS) {
        this.enforceHTTPS = enforceHTTPS;
    }

    /**
     * <p>
     * Specify if only HTTPS endpoint should be enabled for the Elasticsearch domain.
     * </p>
     * 
     * @return Specify if only HTTPS endpoint should be enabled for the Elasticsearch domain.
     */

    public Boolean getEnforceHTTPS() {
        return this.enforceHTTPS;
    }

    /**
     * <p>
     * Specify if only HTTPS endpoint should be enabled for the Elasticsearch domain.
     * </p>
     * 
     * @param enforceHTTPS
     *        Specify if only HTTPS endpoint should be enabled for the Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEndpointOptions withEnforceHTTPS(Boolean enforceHTTPS) {
        setEnforceHTTPS(enforceHTTPS);
        return this;
    }

    /**
     * <p>
     * Specify if only HTTPS endpoint should be enabled for the Elasticsearch domain.
     * </p>
     * 
     * @return Specify if only HTTPS endpoint should be enabled for the Elasticsearch domain.
     */

    public Boolean isEnforceHTTPS() {
        return this.enforceHTTPS;
    }

    /**
     * <p>
     * Specify the TLS security policy that needs to be applied to the HTTPS endpoint of Elasticsearch domain. <br/>
     * It can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which supports only TLSv1.2</li>
     * </ul>
     * </p>
     * 
     * @param tLSSecurityPolicy
     *        Specify the TLS security policy that needs to be applied to the HTTPS endpoint of Elasticsearch domain. <br/>
     *        It can be one of the following values:
     *        <ul>
     *        <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which supports TLSv1.0 and higher.</li>
     *        <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which supports only TLSv1.2</li>
     *        </ul>
     * @see TLSSecurityPolicy
     */

    public void setTLSSecurityPolicy(String tLSSecurityPolicy) {
        this.tLSSecurityPolicy = tLSSecurityPolicy;
    }

    /**
     * <p>
     * Specify the TLS security policy that needs to be applied to the HTTPS endpoint of Elasticsearch domain. <br/>
     * It can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which supports only TLSv1.2</li>
     * </ul>
     * </p>
     * 
     * @return Specify the TLS security policy that needs to be applied to the HTTPS endpoint of Elasticsearch domain. <br/>
     *         It can be one of the following values:
     *         <ul>
     *         <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which supports TLSv1.0 and higher.</li>
     *         <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which supports only TLSv1.2</li>
     *         </ul>
     * @see TLSSecurityPolicy
     */

    public String getTLSSecurityPolicy() {
        return this.tLSSecurityPolicy;
    }

    /**
     * <p>
     * Specify the TLS security policy that needs to be applied to the HTTPS endpoint of Elasticsearch domain. <br/>
     * It can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which supports only TLSv1.2</li>
     * </ul>
     * </p>
     * 
     * @param tLSSecurityPolicy
     *        Specify the TLS security policy that needs to be applied to the HTTPS endpoint of Elasticsearch domain. <br/>
     *        It can be one of the following values:
     *        <ul>
     *        <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which supports TLSv1.0 and higher.</li>
     *        <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which supports only TLSv1.2</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TLSSecurityPolicy
     */

    public DomainEndpointOptions withTLSSecurityPolicy(String tLSSecurityPolicy) {
        setTLSSecurityPolicy(tLSSecurityPolicy);
        return this;
    }

    /**
     * <p>
     * Specify the TLS security policy that needs to be applied to the HTTPS endpoint of Elasticsearch domain. <br/>
     * It can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which supports only TLSv1.2</li>
     * </ul>
     * </p>
     * 
     * @param tLSSecurityPolicy
     *        Specify the TLS security policy that needs to be applied to the HTTPS endpoint of Elasticsearch domain. <br/>
     *        It can be one of the following values:
     *        <ul>
     *        <li><b>Policy-Min-TLS-1-0-2019-07: </b> TLS security policy which supports TLSv1.0 and higher.</li>
     *        <li><b>Policy-Min-TLS-1-2-2019-07: </b> TLS security policy which supports only TLSv1.2</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TLSSecurityPolicy
     */

    public DomainEndpointOptions withTLSSecurityPolicy(TLSSecurityPolicy tLSSecurityPolicy) {
        this.tLSSecurityPolicy = tLSSecurityPolicy.toString();
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
        if (getEnforceHTTPS() != null)
            sb.append("EnforceHTTPS: ").append(getEnforceHTTPS()).append(",");
        if (getTLSSecurityPolicy() != null)
            sb.append("TLSSecurityPolicy: ").append(getTLSSecurityPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainEndpointOptions == false)
            return false;
        DomainEndpointOptions other = (DomainEndpointOptions) obj;
        if (other.getEnforceHTTPS() == null ^ this.getEnforceHTTPS() == null)
            return false;
        if (other.getEnforceHTTPS() != null && other.getEnforceHTTPS().equals(this.getEnforceHTTPS()) == false)
            return false;
        if (other.getTLSSecurityPolicy() == null ^ this.getTLSSecurityPolicy() == null)
            return false;
        if (other.getTLSSecurityPolicy() != null && other.getTLSSecurityPolicy().equals(this.getTLSSecurityPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnforceHTTPS() == null) ? 0 : getEnforceHTTPS().hashCode());
        hashCode = prime * hashCode + ((getTLSSecurityPolicy() == null) ? 0 : getTLSSecurityPolicy().hashCode());
        return hashCode;
    }

    @Override
    public DomainEndpointOptions clone() {
        try {
            return (DomainEndpointOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.DomainEndpointOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

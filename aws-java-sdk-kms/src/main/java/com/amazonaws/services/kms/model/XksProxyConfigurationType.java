/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about the external key store proxy (XKS proxy). Your external key store proxy translates KMS
 * requests into a format that your external key manager can understand. These fields appear in a
 * <a>DescribeCustomKeyStores</a> response only when the <code>CustomKeyStoreType</code> is
 * <code>EXTERNAL_KEY_STORE</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/XksProxyConfigurationType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XksProxyConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the external key store proxy uses a public endpoint or an Amazon VPC endpoint service to
     * communicate with KMS.
     * </p>
     */
    private String connectivity;
    /**
     * <p>
     * The part of the external key store <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateCustomKeyStore.html#KMS-CreateCustomKeyStore-request-XksProxyAuthenticationCredential"
     * >proxy authentication credential</a> that uniquely identifies the secret access key.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * The URI endpoint for the external key store proxy.
     * </p>
     * <p>
     * If the external key store proxy has a public endpoint, it is displayed here.
     * </p>
     * <p>
     * If the external key store proxy uses an Amazon VPC endpoint service name, this field displays the private DNS
     * name associated with the VPC endpoint service.
     * </p>
     */
    private String uriEndpoint;
    /**
     * <p>
     * The path to the external key store proxy APIs.
     * </p>
     */
    private String uriPath;
    /**
     * <p>
     * The Amazon VPC endpoint service used to communicate with the external key store proxy. This field appears only
     * when the external key store proxy uses an Amazon VPC endpoint service to communicate with KMS.
     * </p>
     */
    private String vpcEndpointServiceName;

    /**
     * <p>
     * Indicates whether the external key store proxy uses a public endpoint or an Amazon VPC endpoint service to
     * communicate with KMS.
     * </p>
     * 
     * @param connectivity
     *        Indicates whether the external key store proxy uses a public endpoint or an Amazon VPC endpoint service to
     *        communicate with KMS.
     * @see XksProxyConnectivityType
     */

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    /**
     * <p>
     * Indicates whether the external key store proxy uses a public endpoint or an Amazon VPC endpoint service to
     * communicate with KMS.
     * </p>
     * 
     * @return Indicates whether the external key store proxy uses a public endpoint or an Amazon VPC endpoint service
     *         to communicate with KMS.
     * @see XksProxyConnectivityType
     */

    public String getConnectivity() {
        return this.connectivity;
    }

    /**
     * <p>
     * Indicates whether the external key store proxy uses a public endpoint or an Amazon VPC endpoint service to
     * communicate with KMS.
     * </p>
     * 
     * @param connectivity
     *        Indicates whether the external key store proxy uses a public endpoint or an Amazon VPC endpoint service to
     *        communicate with KMS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XksProxyConnectivityType
     */

    public XksProxyConfigurationType withConnectivity(String connectivity) {
        setConnectivity(connectivity);
        return this;
    }

    /**
     * <p>
     * Indicates whether the external key store proxy uses a public endpoint or an Amazon VPC endpoint service to
     * communicate with KMS.
     * </p>
     * 
     * @param connectivity
     *        Indicates whether the external key store proxy uses a public endpoint or an Amazon VPC endpoint service to
     *        communicate with KMS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XksProxyConnectivityType
     */

    public XksProxyConfigurationType withConnectivity(XksProxyConnectivityType connectivity) {
        this.connectivity = connectivity.toString();
        return this;
    }

    /**
     * <p>
     * The part of the external key store <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateCustomKeyStore.html#KMS-CreateCustomKeyStore-request-XksProxyAuthenticationCredential"
     * >proxy authentication credential</a> that uniquely identifies the secret access key.
     * </p>
     * 
     * @param accessKeyId
     *        The part of the external key store <a href=
     *        "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateCustomKeyStore.html#KMS-CreateCustomKeyStore-request-XksProxyAuthenticationCredential"
     *        >proxy authentication credential</a> that uniquely identifies the secret access key.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The part of the external key store <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateCustomKeyStore.html#KMS-CreateCustomKeyStore-request-XksProxyAuthenticationCredential"
     * >proxy authentication credential</a> that uniquely identifies the secret access key.
     * </p>
     * 
     * @return The part of the external key store <a href=
     *         "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateCustomKeyStore.html#KMS-CreateCustomKeyStore-request-XksProxyAuthenticationCredential"
     *         >proxy authentication credential</a> that uniquely identifies the secret access key.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The part of the external key store <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateCustomKeyStore.html#KMS-CreateCustomKeyStore-request-XksProxyAuthenticationCredential"
     * >proxy authentication credential</a> that uniquely identifies the secret access key.
     * </p>
     * 
     * @param accessKeyId
     *        The part of the external key store <a href=
     *        "https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateCustomKeyStore.html#KMS-CreateCustomKeyStore-request-XksProxyAuthenticationCredential"
     *        >proxy authentication credential</a> that uniquely identifies the secret access key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XksProxyConfigurationType withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * The URI endpoint for the external key store proxy.
     * </p>
     * <p>
     * If the external key store proxy has a public endpoint, it is displayed here.
     * </p>
     * <p>
     * If the external key store proxy uses an Amazon VPC endpoint service name, this field displays the private DNS
     * name associated with the VPC endpoint service.
     * </p>
     * 
     * @param uriEndpoint
     *        The URI endpoint for the external key store proxy.</p>
     *        <p>
     *        If the external key store proxy has a public endpoint, it is displayed here.
     *        </p>
     *        <p>
     *        If the external key store proxy uses an Amazon VPC endpoint service name, this field displays the private
     *        DNS name associated with the VPC endpoint service.
     */

    public void setUriEndpoint(String uriEndpoint) {
        this.uriEndpoint = uriEndpoint;
    }

    /**
     * <p>
     * The URI endpoint for the external key store proxy.
     * </p>
     * <p>
     * If the external key store proxy has a public endpoint, it is displayed here.
     * </p>
     * <p>
     * If the external key store proxy uses an Amazon VPC endpoint service name, this field displays the private DNS
     * name associated with the VPC endpoint service.
     * </p>
     * 
     * @return The URI endpoint for the external key store proxy.</p>
     *         <p>
     *         If the external key store proxy has a public endpoint, it is displayed here.
     *         </p>
     *         <p>
     *         If the external key store proxy uses an Amazon VPC endpoint service name, this field displays the private
     *         DNS name associated with the VPC endpoint service.
     */

    public String getUriEndpoint() {
        return this.uriEndpoint;
    }

    /**
     * <p>
     * The URI endpoint for the external key store proxy.
     * </p>
     * <p>
     * If the external key store proxy has a public endpoint, it is displayed here.
     * </p>
     * <p>
     * If the external key store proxy uses an Amazon VPC endpoint service name, this field displays the private DNS
     * name associated with the VPC endpoint service.
     * </p>
     * 
     * @param uriEndpoint
     *        The URI endpoint for the external key store proxy.</p>
     *        <p>
     *        If the external key store proxy has a public endpoint, it is displayed here.
     *        </p>
     *        <p>
     *        If the external key store proxy uses an Amazon VPC endpoint service name, this field displays the private
     *        DNS name associated with the VPC endpoint service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XksProxyConfigurationType withUriEndpoint(String uriEndpoint) {
        setUriEndpoint(uriEndpoint);
        return this;
    }

    /**
     * <p>
     * The path to the external key store proxy APIs.
     * </p>
     * 
     * @param uriPath
     *        The path to the external key store proxy APIs.
     */

    public void setUriPath(String uriPath) {
        this.uriPath = uriPath;
    }

    /**
     * <p>
     * The path to the external key store proxy APIs.
     * </p>
     * 
     * @return The path to the external key store proxy APIs.
     */

    public String getUriPath() {
        return this.uriPath;
    }

    /**
     * <p>
     * The path to the external key store proxy APIs.
     * </p>
     * 
     * @param uriPath
     *        The path to the external key store proxy APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XksProxyConfigurationType withUriPath(String uriPath) {
        setUriPath(uriPath);
        return this;
    }

    /**
     * <p>
     * The Amazon VPC endpoint service used to communicate with the external key store proxy. This field appears only
     * when the external key store proxy uses an Amazon VPC endpoint service to communicate with KMS.
     * </p>
     * 
     * @param vpcEndpointServiceName
     *        The Amazon VPC endpoint service used to communicate with the external key store proxy. This field appears
     *        only when the external key store proxy uses an Amazon VPC endpoint service to communicate with KMS.
     */

    public void setVpcEndpointServiceName(String vpcEndpointServiceName) {
        this.vpcEndpointServiceName = vpcEndpointServiceName;
    }

    /**
     * <p>
     * The Amazon VPC endpoint service used to communicate with the external key store proxy. This field appears only
     * when the external key store proxy uses an Amazon VPC endpoint service to communicate with KMS.
     * </p>
     * 
     * @return The Amazon VPC endpoint service used to communicate with the external key store proxy. This field appears
     *         only when the external key store proxy uses an Amazon VPC endpoint service to communicate with KMS.
     */

    public String getVpcEndpointServiceName() {
        return this.vpcEndpointServiceName;
    }

    /**
     * <p>
     * The Amazon VPC endpoint service used to communicate with the external key store proxy. This field appears only
     * when the external key store proxy uses an Amazon VPC endpoint service to communicate with KMS.
     * </p>
     * 
     * @param vpcEndpointServiceName
     *        The Amazon VPC endpoint service used to communicate with the external key store proxy. This field appears
     *        only when the external key store proxy uses an Amazon VPC endpoint service to communicate with KMS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XksProxyConfigurationType withVpcEndpointServiceName(String vpcEndpointServiceName) {
        setVpcEndpointServiceName(vpcEndpointServiceName);
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
        if (getConnectivity() != null)
            sb.append("Connectivity: ").append(getConnectivity()).append(",");
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: ").append("***Sensitive Data Redacted***").append(",");
        if (getUriEndpoint() != null)
            sb.append("UriEndpoint: ").append(getUriEndpoint()).append(",");
        if (getUriPath() != null)
            sb.append("UriPath: ").append(getUriPath()).append(",");
        if (getVpcEndpointServiceName() != null)
            sb.append("VpcEndpointServiceName: ").append(getVpcEndpointServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof XksProxyConfigurationType == false)
            return false;
        XksProxyConfigurationType other = (XksProxyConfigurationType) obj;
        if (other.getConnectivity() == null ^ this.getConnectivity() == null)
            return false;
        if (other.getConnectivity() != null && other.getConnectivity().equals(this.getConnectivity()) == false)
            return false;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getUriEndpoint() == null ^ this.getUriEndpoint() == null)
            return false;
        if (other.getUriEndpoint() != null && other.getUriEndpoint().equals(this.getUriEndpoint()) == false)
            return false;
        if (other.getUriPath() == null ^ this.getUriPath() == null)
            return false;
        if (other.getUriPath() != null && other.getUriPath().equals(this.getUriPath()) == false)
            return false;
        if (other.getVpcEndpointServiceName() == null ^ this.getVpcEndpointServiceName() == null)
            return false;
        if (other.getVpcEndpointServiceName() != null && other.getVpcEndpointServiceName().equals(this.getVpcEndpointServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectivity() == null) ? 0 : getConnectivity().hashCode());
        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getUriEndpoint() == null) ? 0 : getUriEndpoint().hashCode());
        hashCode = prime * hashCode + ((getUriPath() == null) ? 0 : getUriPath().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointServiceName() == null) ? 0 : getVpcEndpointServiceName().hashCode());
        return hashCode;
    }

    @Override
    public XksProxyConfigurationType clone() {
        try {
            return (XksProxyConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kms.model.transform.XksProxyConfigurationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

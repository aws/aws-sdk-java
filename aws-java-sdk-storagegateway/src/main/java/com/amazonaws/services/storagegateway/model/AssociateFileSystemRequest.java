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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AssociateFileSystem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateFileSystemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user name of the user credential that has permission to access the root share D$ of the Amazon FSx file
     * system. The user account must belong to the Amazon FSx delegated admin user group.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The password of the user credential.
     * </p>
     */
    private String password;
    /**
     * <p>
     * A unique string value that you supply that is used by the FSx File Gateway to ensure idempotent file system
     * association creation.
     * </p>
     */
    private String clientToken;

    private String gatewayARN;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
     * </p>
     */
    private String locationARN;
    /**
     * <p>
     * A list of up to 50 tags that can be assigned to the file system association. Each tag is a key-value pair.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * </p>
     */
    private String auditDestinationARN;

    private CacheAttributes cacheAttributes;
    /**
     * <p>
     * Specifies the network configuration information for the gateway associated with the Amazon FSx file system.
     * </p>
     * <note>
     * <p>
     * If multiple file systems are associated with this gateway, this parameter's <code>IpAddresses</code> field is
     * required.
     * </p>
     * </note>
     */
    private EndpointNetworkConfiguration endpointNetworkConfiguration;

    /**
     * <p>
     * The user name of the user credential that has permission to access the root share D$ of the Amazon FSx file
     * system. The user account must belong to the Amazon FSx delegated admin user group.
     * </p>
     * 
     * @param userName
     *        The user name of the user credential that has permission to access the root share D$ of the Amazon FSx
     *        file system. The user account must belong to the Amazon FSx delegated admin user group.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user name of the user credential that has permission to access the root share D$ of the Amazon FSx file
     * system. The user account must belong to the Amazon FSx delegated admin user group.
     * </p>
     * 
     * @return The user name of the user credential that has permission to access the root share D$ of the Amazon FSx
     *         file system. The user account must belong to the Amazon FSx delegated admin user group.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The user name of the user credential that has permission to access the root share D$ of the Amazon FSx file
     * system. The user account must belong to the Amazon FSx delegated admin user group.
     * </p>
     * 
     * @param userName
     *        The user name of the user credential that has permission to access the root share D$ of the Amazon FSx
     *        file system. The user account must belong to the Amazon FSx delegated admin user group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFileSystemRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The password of the user credential.
     * </p>
     * 
     * @param password
     *        The password of the user credential.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password of the user credential.
     * </p>
     * 
     * @return The password of the user credential.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password of the user credential.
     * </p>
     * 
     * @param password
     *        The password of the user credential.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFileSystemRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * A unique string value that you supply that is used by the FSx File Gateway to ensure idempotent file system
     * association creation.
     * </p>
     * 
     * @param clientToken
     *        A unique string value that you supply that is used by the FSx File Gateway to ensure idempotent file
     *        system association creation.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique string value that you supply that is used by the FSx File Gateway to ensure idempotent file system
     * association creation.
     * </p>
     * 
     * @return A unique string value that you supply that is used by the FSx File Gateway to ensure idempotent file
     *         system association creation.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique string value that you supply that is used by the FSx File Gateway to ensure idempotent file system
     * association creation.
     * </p>
     * 
     * @param clientToken
     *        A unique string value that you supply that is used by the FSx File Gateway to ensure idempotent file
     *        system association creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFileSystemRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFileSystemRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
     * </p>
     * 
     * @param locationARN
     *        The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
     */

    public void setLocationARN(String locationARN) {
        this.locationARN = locationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
     */

    public String getLocationARN() {
        return this.locationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
     * </p>
     * 
     * @param locationARN
     *        The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFileSystemRequest withLocationARN(String locationARN) {
        setLocationARN(locationARN);
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to the file system association. Each tag is a key-value pair.
     * </p>
     * 
     * @return A list of up to 50 tags that can be assigned to the file system association. Each tag is a key-value
     *         pair.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to the file system association. Each tag is a key-value pair.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags that can be assigned to the file system association. Each tag is a key-value pair.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to the file system association. Each tag is a key-value pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags that can be assigned to the file system association. Each tag is a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFileSystemRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to the file system association. Each tag is a key-value pair.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags that can be assigned to the file system association. Each tag is a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFileSystemRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * </p>
     * 
     * @param auditDestinationARN
     *        The Amazon Resource Name (ARN) of the storage used for the audit logs.
     */

    public void setAuditDestinationARN(String auditDestinationARN) {
        this.auditDestinationARN = auditDestinationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the storage used for the audit logs.
     */

    public String getAuditDestinationARN() {
        return this.auditDestinationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * </p>
     * 
     * @param auditDestinationARN
     *        The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFileSystemRequest withAuditDestinationARN(String auditDestinationARN) {
        setAuditDestinationARN(auditDestinationARN);
        return this;
    }

    /**
     * @param cacheAttributes
     */

    public void setCacheAttributes(CacheAttributes cacheAttributes) {
        this.cacheAttributes = cacheAttributes;
    }

    /**
     * @return
     */

    public CacheAttributes getCacheAttributes() {
        return this.cacheAttributes;
    }

    /**
     * @param cacheAttributes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFileSystemRequest withCacheAttributes(CacheAttributes cacheAttributes) {
        setCacheAttributes(cacheAttributes);
        return this;
    }

    /**
     * <p>
     * Specifies the network configuration information for the gateway associated with the Amazon FSx file system.
     * </p>
     * <note>
     * <p>
     * If multiple file systems are associated with this gateway, this parameter's <code>IpAddresses</code> field is
     * required.
     * </p>
     * </note>
     * 
     * @param endpointNetworkConfiguration
     *        Specifies the network configuration information for the gateway associated with the Amazon FSx file
     *        system.</p> <note>
     *        <p>
     *        If multiple file systems are associated with this gateway, this parameter's <code>IpAddresses</code> field
     *        is required.
     *        </p>
     */

    public void setEndpointNetworkConfiguration(EndpointNetworkConfiguration endpointNetworkConfiguration) {
        this.endpointNetworkConfiguration = endpointNetworkConfiguration;
    }

    /**
     * <p>
     * Specifies the network configuration information for the gateway associated with the Amazon FSx file system.
     * </p>
     * <note>
     * <p>
     * If multiple file systems are associated with this gateway, this parameter's <code>IpAddresses</code> field is
     * required.
     * </p>
     * </note>
     * 
     * @return Specifies the network configuration information for the gateway associated with the Amazon FSx file
     *         system.</p> <note>
     *         <p>
     *         If multiple file systems are associated with this gateway, this parameter's <code>IpAddresses</code>
     *         field is required.
     *         </p>
     */

    public EndpointNetworkConfiguration getEndpointNetworkConfiguration() {
        return this.endpointNetworkConfiguration;
    }

    /**
     * <p>
     * Specifies the network configuration information for the gateway associated with the Amazon FSx file system.
     * </p>
     * <note>
     * <p>
     * If multiple file systems are associated with this gateway, this parameter's <code>IpAddresses</code> field is
     * required.
     * </p>
     * </note>
     * 
     * @param endpointNetworkConfiguration
     *        Specifies the network configuration information for the gateway associated with the Amazon FSx file
     *        system.</p> <note>
     *        <p>
     *        If multiple file systems are associated with this gateway, this parameter's <code>IpAddresses</code> field
     *        is required.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFileSystemRequest withEndpointNetworkConfiguration(EndpointNetworkConfiguration endpointNetworkConfiguration) {
        setEndpointNetworkConfiguration(endpointNetworkConfiguration);
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getLocationARN() != null)
            sb.append("LocationARN: ").append(getLocationARN()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAuditDestinationARN() != null)
            sb.append("AuditDestinationARN: ").append(getAuditDestinationARN()).append(",");
        if (getCacheAttributes() != null)
            sb.append("CacheAttributes: ").append(getCacheAttributes()).append(",");
        if (getEndpointNetworkConfiguration() != null)
            sb.append("EndpointNetworkConfiguration: ").append(getEndpointNetworkConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateFileSystemRequest == false)
            return false;
        AssociateFileSystemRequest other = (AssociateFileSystemRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getLocationARN() == null ^ this.getLocationARN() == null)
            return false;
        if (other.getLocationARN() != null && other.getLocationARN().equals(this.getLocationARN()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAuditDestinationARN() == null ^ this.getAuditDestinationARN() == null)
            return false;
        if (other.getAuditDestinationARN() != null && other.getAuditDestinationARN().equals(this.getAuditDestinationARN()) == false)
            return false;
        if (other.getCacheAttributes() == null ^ this.getCacheAttributes() == null)
            return false;
        if (other.getCacheAttributes() != null && other.getCacheAttributes().equals(this.getCacheAttributes()) == false)
            return false;
        if (other.getEndpointNetworkConfiguration() == null ^ this.getEndpointNetworkConfiguration() == null)
            return false;
        if (other.getEndpointNetworkConfiguration() != null && other.getEndpointNetworkConfiguration().equals(this.getEndpointNetworkConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getLocationARN() == null) ? 0 : getLocationARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAuditDestinationARN() == null) ? 0 : getAuditDestinationARN().hashCode());
        hashCode = prime * hashCode + ((getCacheAttributes() == null) ? 0 : getCacheAttributes().hashCode());
        hashCode = prime * hashCode + ((getEndpointNetworkConfiguration() == null) ? 0 : getEndpointNetworkConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AssociateFileSystemRequest clone() {
        return (AssociateFileSystemRequest) super.clone();
    }

}

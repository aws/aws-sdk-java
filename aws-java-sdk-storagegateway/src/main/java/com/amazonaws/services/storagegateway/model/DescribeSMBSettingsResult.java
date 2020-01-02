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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeSMBSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSMBSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * The name of the domain that the gateway is joined to.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Indicates the status of a gateway that is a member of the Active Directory domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCESS_DENIED: Indicates that the <code>JoinDomain</code> operation failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * DETACHED: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINED: Indicates that the gateway has successfully joined a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINING: Indicates that a <code>JoinDomain</code> operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation failed due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: Indicates that the <code>JoinDomain</code> operation failed because the operation didn't complete within
     * the allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code> operation failed due to another type of error.
     * </p>
     * </li>
     * </ul>
     */
    private String activeDirectoryStatus;
    /**
     * <p>
     * This value is true if a password for the guest user “smbguest” is set, and otherwise false.
     * </p>
     */
    private Boolean sMBGuestPasswordSet;
    /**
     * <p>
     * The type of security strategy that was specified for file gateway.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based on what is negotiated by the client. This
     * option is recommended when you want to maximize compatibility across different clients in your environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that
     * have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or
     * newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that have
     * encryption enabled. This option is highly recommended for environments that handle sensitive data. This option
     * works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * </p>
     */
    private String sMBSecurityStrategy;

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

    public DescribeSMBSettingsResult withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The name of the domain that the gateway is joined to.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that the gateway is joined to.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that the gateway is joined to.
     * </p>
     * 
     * @return The name of the domain that the gateway is joined to.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that the gateway is joined to.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that the gateway is joined to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSMBSettingsResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Indicates the status of a gateway that is a member of the Active Directory domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCESS_DENIED: Indicates that the <code>JoinDomain</code> operation failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * DETACHED: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINED: Indicates that the gateway has successfully joined a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINING: Indicates that a <code>JoinDomain</code> operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation failed due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: Indicates that the <code>JoinDomain</code> operation failed because the operation didn't complete within
     * the allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code> operation failed due to another type of error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param activeDirectoryStatus
     *        Indicates the status of a gateway that is a member of the Active Directory domain.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACCESS_DENIED: Indicates that the <code>JoinDomain</code> operation failed due to an authentication error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DETACHED: Indicates that gateway is not joined to a domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        JOINED: Indicates that the gateway has successfully joined a domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        JOINING: Indicates that a <code>JoinDomain</code> operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation failed due to a network or connectivity
     *        error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TIMEOUT: Indicates that the <code>JoinDomain</code> operation failed because the operation didn't complete
     *        within the allotted time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code> operation failed due to another type of error.
     *        </p>
     *        </li>
     * @see ActiveDirectoryStatus
     */

    public void setActiveDirectoryStatus(String activeDirectoryStatus) {
        this.activeDirectoryStatus = activeDirectoryStatus;
    }

    /**
     * <p>
     * Indicates the status of a gateway that is a member of the Active Directory domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCESS_DENIED: Indicates that the <code>JoinDomain</code> operation failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * DETACHED: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINED: Indicates that the gateway has successfully joined a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINING: Indicates that a <code>JoinDomain</code> operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation failed due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: Indicates that the <code>JoinDomain</code> operation failed because the operation didn't complete within
     * the allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code> operation failed due to another type of error.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the status of a gateway that is a member of the Active Directory domain.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCESS_DENIED: Indicates that the <code>JoinDomain</code> operation failed due to an authentication
     *         error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DETACHED: Indicates that gateway is not joined to a domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         JOINED: Indicates that the gateway has successfully joined a domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         JOINING: Indicates that a <code>JoinDomain</code> operation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation failed due to a network or connectivity
     *         error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TIMEOUT: Indicates that the <code>JoinDomain</code> operation failed because the operation didn't
     *         complete within the allotted time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code> operation failed due to another type of error.
     *         </p>
     *         </li>
     * @see ActiveDirectoryStatus
     */

    public String getActiveDirectoryStatus() {
        return this.activeDirectoryStatus;
    }

    /**
     * <p>
     * Indicates the status of a gateway that is a member of the Active Directory domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCESS_DENIED: Indicates that the <code>JoinDomain</code> operation failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * DETACHED: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINED: Indicates that the gateway has successfully joined a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINING: Indicates that a <code>JoinDomain</code> operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation failed due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: Indicates that the <code>JoinDomain</code> operation failed because the operation didn't complete within
     * the allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code> operation failed due to another type of error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param activeDirectoryStatus
     *        Indicates the status of a gateway that is a member of the Active Directory domain.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACCESS_DENIED: Indicates that the <code>JoinDomain</code> operation failed due to an authentication error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DETACHED: Indicates that gateway is not joined to a domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        JOINED: Indicates that the gateway has successfully joined a domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        JOINING: Indicates that a <code>JoinDomain</code> operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation failed due to a network or connectivity
     *        error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TIMEOUT: Indicates that the <code>JoinDomain</code> operation failed because the operation didn't complete
     *        within the allotted time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code> operation failed due to another type of error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActiveDirectoryStatus
     */

    public DescribeSMBSettingsResult withActiveDirectoryStatus(String activeDirectoryStatus) {
        setActiveDirectoryStatus(activeDirectoryStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of a gateway that is a member of the Active Directory domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCESS_DENIED: Indicates that the <code>JoinDomain</code> operation failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * DETACHED: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINED: Indicates that the gateway has successfully joined a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINING: Indicates that a <code>JoinDomain</code> operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation failed due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: Indicates that the <code>JoinDomain</code> operation failed because the operation didn't complete within
     * the allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code> operation failed due to another type of error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param activeDirectoryStatus
     *        Indicates the status of a gateway that is a member of the Active Directory domain.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACCESS_DENIED: Indicates that the <code>JoinDomain</code> operation failed due to an authentication error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DETACHED: Indicates that gateway is not joined to a domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        JOINED: Indicates that the gateway has successfully joined a domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        JOINING: Indicates that a <code>JoinDomain</code> operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation failed due to a network or connectivity
     *        error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TIMEOUT: Indicates that the <code>JoinDomain</code> operation failed because the operation didn't complete
     *        within the allotted time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code> operation failed due to another type of error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActiveDirectoryStatus
     */

    public DescribeSMBSettingsResult withActiveDirectoryStatus(ActiveDirectoryStatus activeDirectoryStatus) {
        this.activeDirectoryStatus = activeDirectoryStatus.toString();
        return this;
    }

    /**
     * <p>
     * This value is true if a password for the guest user “smbguest” is set, and otherwise false.
     * </p>
     * 
     * @param sMBGuestPasswordSet
     *        This value is true if a password for the guest user “smbguest” is set, and otherwise false.
     */

    public void setSMBGuestPasswordSet(Boolean sMBGuestPasswordSet) {
        this.sMBGuestPasswordSet = sMBGuestPasswordSet;
    }

    /**
     * <p>
     * This value is true if a password for the guest user “smbguest” is set, and otherwise false.
     * </p>
     * 
     * @return This value is true if a password for the guest user “smbguest” is set, and otherwise false.
     */

    public Boolean getSMBGuestPasswordSet() {
        return this.sMBGuestPasswordSet;
    }

    /**
     * <p>
     * This value is true if a password for the guest user “smbguest” is set, and otherwise false.
     * </p>
     * 
     * @param sMBGuestPasswordSet
     *        This value is true if a password for the guest user “smbguest” is set, and otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSMBSettingsResult withSMBGuestPasswordSet(Boolean sMBGuestPasswordSet) {
        setSMBGuestPasswordSet(sMBGuestPasswordSet);
        return this;
    }

    /**
     * <p>
     * This value is true if a password for the guest user “smbguest” is set, and otherwise false.
     * </p>
     * 
     * @return This value is true if a password for the guest user “smbguest” is set, and otherwise false.
     */

    public Boolean isSMBGuestPasswordSet() {
        return this.sMBGuestPasswordSet;
    }

    /**
     * <p>
     * The type of security strategy that was specified for file gateway.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based on what is negotiated by the client. This
     * option is recommended when you want to maximize compatibility across different clients in your environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that
     * have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or
     * newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that have
     * encryption enabled. This option is highly recommended for environments that handle sensitive data. This option
     * works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * </p>
     * 
     * @param sMBSecurityStrategy
     *        The type of security strategy that was specified for file gateway.</p>
     *        <p>
     *        ClientSpecified: if you use this option, requests are established based on what is negotiated by the
     *        client. This option is recommended when you want to maximize compatibility across different clients in
     *        your environment.
     *        </p>
     *        <p>
     *        MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients
     *        that have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server
     *        2008 or newer.
     *        </p>
     *        <p>
     *        MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that
     *        have encryption enabled. This option is highly recommended for environments that handle sensitive data.
     *        This option works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * @see SMBSecurityStrategy
     */

    public void setSMBSecurityStrategy(String sMBSecurityStrategy) {
        this.sMBSecurityStrategy = sMBSecurityStrategy;
    }

    /**
     * <p>
     * The type of security strategy that was specified for file gateway.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based on what is negotiated by the client. This
     * option is recommended when you want to maximize compatibility across different clients in your environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that
     * have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or
     * newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that have
     * encryption enabled. This option is highly recommended for environments that handle sensitive data. This option
     * works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * </p>
     * 
     * @return The type of security strategy that was specified for file gateway.</p>
     *         <p>
     *         ClientSpecified: if you use this option, requests are established based on what is negotiated by the
     *         client. This option is recommended when you want to maximize compatibility across different clients in
     *         your environment.
     *         </p>
     *         <p>
     *         MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3
     *         clients that have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows
     *         Server 2008 or newer.
     *         </p>
     *         <p>
     *         MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that
     *         have encryption enabled. This option is highly recommended for environments that handle sensitive data.
     *         This option works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * @see SMBSecurityStrategy
     */

    public String getSMBSecurityStrategy() {
        return this.sMBSecurityStrategy;
    }

    /**
     * <p>
     * The type of security strategy that was specified for file gateway.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based on what is negotiated by the client. This
     * option is recommended when you want to maximize compatibility across different clients in your environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that
     * have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or
     * newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that have
     * encryption enabled. This option is highly recommended for environments that handle sensitive data. This option
     * works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * </p>
     * 
     * @param sMBSecurityStrategy
     *        The type of security strategy that was specified for file gateway.</p>
     *        <p>
     *        ClientSpecified: if you use this option, requests are established based on what is negotiated by the
     *        client. This option is recommended when you want to maximize compatibility across different clients in
     *        your environment.
     *        </p>
     *        <p>
     *        MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients
     *        that have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server
     *        2008 or newer.
     *        </p>
     *        <p>
     *        MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that
     *        have encryption enabled. This option is highly recommended for environments that handle sensitive data.
     *        This option works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SMBSecurityStrategy
     */

    public DescribeSMBSettingsResult withSMBSecurityStrategy(String sMBSecurityStrategy) {
        setSMBSecurityStrategy(sMBSecurityStrategy);
        return this;
    }

    /**
     * <p>
     * The type of security strategy that was specified for file gateway.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based on what is negotiated by the client. This
     * option is recommended when you want to maximize compatibility across different clients in your environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that
     * have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or
     * newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that have
     * encryption enabled. This option is highly recommended for environments that handle sensitive data. This option
     * works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * </p>
     * 
     * @param sMBSecurityStrategy
     *        The type of security strategy that was specified for file gateway.</p>
     *        <p>
     *        ClientSpecified: if you use this option, requests are established based on what is negotiated by the
     *        client. This option is recommended when you want to maximize compatibility across different clients in
     *        your environment.
     *        </p>
     *        <p>
     *        MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients
     *        that have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server
     *        2008 or newer.
     *        </p>
     *        <p>
     *        MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that
     *        have encryption enabled. This option is highly recommended for environments that handle sensitive data.
     *        This option works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SMBSecurityStrategy
     */

    public DescribeSMBSettingsResult withSMBSecurityStrategy(SMBSecurityStrategy sMBSecurityStrategy) {
        this.sMBSecurityStrategy = sMBSecurityStrategy.toString();
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getActiveDirectoryStatus() != null)
            sb.append("ActiveDirectoryStatus: ").append(getActiveDirectoryStatus()).append(",");
        if (getSMBGuestPasswordSet() != null)
            sb.append("SMBGuestPasswordSet: ").append(getSMBGuestPasswordSet()).append(",");
        if (getSMBSecurityStrategy() != null)
            sb.append("SMBSecurityStrategy: ").append(getSMBSecurityStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSMBSettingsResult == false)
            return false;
        DescribeSMBSettingsResult other = (DescribeSMBSettingsResult) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getActiveDirectoryStatus() == null ^ this.getActiveDirectoryStatus() == null)
            return false;
        if (other.getActiveDirectoryStatus() != null && other.getActiveDirectoryStatus().equals(this.getActiveDirectoryStatus()) == false)
            return false;
        if (other.getSMBGuestPasswordSet() == null ^ this.getSMBGuestPasswordSet() == null)
            return false;
        if (other.getSMBGuestPasswordSet() != null && other.getSMBGuestPasswordSet().equals(this.getSMBGuestPasswordSet()) == false)
            return false;
        if (other.getSMBSecurityStrategy() == null ^ this.getSMBSecurityStrategy() == null)
            return false;
        if (other.getSMBSecurityStrategy() != null && other.getSMBSecurityStrategy().equals(this.getSMBSecurityStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getActiveDirectoryStatus() == null) ? 0 : getActiveDirectoryStatus().hashCode());
        hashCode = prime * hashCode + ((getSMBGuestPasswordSet() == null) ? 0 : getSMBGuestPasswordSet().hashCode());
        hashCode = prime * hashCode + ((getSMBSecurityStrategy() == null) ? 0 : getSMBSecurityStrategy().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSMBSettingsResult clone() {
        try {
            return (DescribeSMBSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

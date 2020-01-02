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
 * <p>
 * JoinDomainOutput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/JoinDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JoinDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the gateway that joined the domain.
     * </p>
     */
    private String gatewayARN;
    /**
     * <p>
     * Indicates the status of the gateway as a member of the Active Directory domain.
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
     * The unique Amazon Resource Name (ARN) of the gateway that joined the domain.
     * </p>
     * 
     * @param gatewayARN
     *        The unique Amazon Resource Name (ARN) of the gateway that joined the domain.
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the gateway that joined the domain.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) of the gateway that joined the domain.
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the gateway that joined the domain.
     * </p>
     * 
     * @param gatewayARN
     *        The unique Amazon Resource Name (ARN) of the gateway that joined the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinDomainResult withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the gateway as a member of the Active Directory domain.
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
     *        Indicates the status of the gateway as a member of the Active Directory domain.</p>
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
     * Indicates the status of the gateway as a member of the Active Directory domain.
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
     * @return Indicates the status of the gateway as a member of the Active Directory domain.</p>
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
     * Indicates the status of the gateway as a member of the Active Directory domain.
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
     *        Indicates the status of the gateway as a member of the Active Directory domain.</p>
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

    public JoinDomainResult withActiveDirectoryStatus(String activeDirectoryStatus) {
        setActiveDirectoryStatus(activeDirectoryStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the gateway as a member of the Active Directory domain.
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
     *        Indicates the status of the gateway as a member of the Active Directory domain.</p>
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

    public JoinDomainResult withActiveDirectoryStatus(ActiveDirectoryStatus activeDirectoryStatus) {
        this.activeDirectoryStatus = activeDirectoryStatus.toString();
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
        if (getActiveDirectoryStatus() != null)
            sb.append("ActiveDirectoryStatus: ").append(getActiveDirectoryStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JoinDomainResult == false)
            return false;
        JoinDomainResult other = (JoinDomainResult) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getActiveDirectoryStatus() == null ^ this.getActiveDirectoryStatus() == null)
            return false;
        if (other.getActiveDirectoryStatus() != null && other.getActiveDirectoryStatus().equals(this.getActiveDirectoryStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getActiveDirectoryStatus() == null) ? 0 : getActiveDirectoryStatus().hashCode());
        return hashCode;
    }

    @Override
    public JoinDomainResult clone() {
        try {
            return (JoinDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An IPAM discovered account. A discovered account is an Amazon Web Services account that is monitored under a resource
 * discovery. If you have integrated IPAM with Amazon Web Services Organizations, all accounts in the organization are
 * discovered accounts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpamDiscoveredAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamDiscoveredAccount implements Serializable, Cloneable {

    /**
     * <p>
     * The account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Web Services Region that the account information is returned from. An account can be discovered in
     * multiple regions and will have a separate discovered account for each Region.
     * </p>
     */
    private String discoveryRegion;
    /**
     * <p>
     * The resource discovery failure reason.
     * </p>
     */
    private IpamDiscoveryFailureReason failureReason;
    /**
     * <p>
     * The last attempted resource discovery time.
     * </p>
     */
    private java.util.Date lastAttemptedDiscoveryTime;
    /**
     * <p>
     * The last successful resource discovery time.
     * </p>
     */
    private java.util.Date lastSuccessfulDiscoveryTime;

    /**
     * <p>
     * The account ID.
     * </p>
     * 
     * @param accountId
     *        The account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID.
     * </p>
     * 
     * @return The account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID.
     * </p>
     * 
     * @param accountId
     *        The account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredAccount withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region that the account information is returned from. An account can be discovered in
     * multiple regions and will have a separate discovered account for each Region.
     * </p>
     * 
     * @param discoveryRegion
     *        The Amazon Web Services Region that the account information is returned from. An account can be discovered
     *        in multiple regions and will have a separate discovered account for each Region.
     */

    public void setDiscoveryRegion(String discoveryRegion) {
        this.discoveryRegion = discoveryRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region that the account information is returned from. An account can be discovered in
     * multiple regions and will have a separate discovered account for each Region.
     * </p>
     * 
     * @return The Amazon Web Services Region that the account information is returned from. An account can be
     *         discovered in multiple regions and will have a separate discovered account for each Region.
     */

    public String getDiscoveryRegion() {
        return this.discoveryRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region that the account information is returned from. An account can be discovered in
     * multiple regions and will have a separate discovered account for each Region.
     * </p>
     * 
     * @param discoveryRegion
     *        The Amazon Web Services Region that the account information is returned from. An account can be discovered
     *        in multiple regions and will have a separate discovered account for each Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredAccount withDiscoveryRegion(String discoveryRegion) {
        setDiscoveryRegion(discoveryRegion);
        return this;
    }

    /**
     * <p>
     * The resource discovery failure reason.
     * </p>
     * 
     * @param failureReason
     *        The resource discovery failure reason.
     */

    public void setFailureReason(IpamDiscoveryFailureReason failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The resource discovery failure reason.
     * </p>
     * 
     * @return The resource discovery failure reason.
     */

    public IpamDiscoveryFailureReason getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The resource discovery failure reason.
     * </p>
     * 
     * @param failureReason
     *        The resource discovery failure reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredAccount withFailureReason(IpamDiscoveryFailureReason failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The last attempted resource discovery time.
     * </p>
     * 
     * @param lastAttemptedDiscoveryTime
     *        The last attempted resource discovery time.
     */

    public void setLastAttemptedDiscoveryTime(java.util.Date lastAttemptedDiscoveryTime) {
        this.lastAttemptedDiscoveryTime = lastAttemptedDiscoveryTime;
    }

    /**
     * <p>
     * The last attempted resource discovery time.
     * </p>
     * 
     * @return The last attempted resource discovery time.
     */

    public java.util.Date getLastAttemptedDiscoveryTime() {
        return this.lastAttemptedDiscoveryTime;
    }

    /**
     * <p>
     * The last attempted resource discovery time.
     * </p>
     * 
     * @param lastAttemptedDiscoveryTime
     *        The last attempted resource discovery time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredAccount withLastAttemptedDiscoveryTime(java.util.Date lastAttemptedDiscoveryTime) {
        setLastAttemptedDiscoveryTime(lastAttemptedDiscoveryTime);
        return this;
    }

    /**
     * <p>
     * The last successful resource discovery time.
     * </p>
     * 
     * @param lastSuccessfulDiscoveryTime
     *        The last successful resource discovery time.
     */

    public void setLastSuccessfulDiscoveryTime(java.util.Date lastSuccessfulDiscoveryTime) {
        this.lastSuccessfulDiscoveryTime = lastSuccessfulDiscoveryTime;
    }

    /**
     * <p>
     * The last successful resource discovery time.
     * </p>
     * 
     * @return The last successful resource discovery time.
     */

    public java.util.Date getLastSuccessfulDiscoveryTime() {
        return this.lastSuccessfulDiscoveryTime;
    }

    /**
     * <p>
     * The last successful resource discovery time.
     * </p>
     * 
     * @param lastSuccessfulDiscoveryTime
     *        The last successful resource discovery time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamDiscoveredAccount withLastSuccessfulDiscoveryTime(java.util.Date lastSuccessfulDiscoveryTime) {
        setLastSuccessfulDiscoveryTime(lastSuccessfulDiscoveryTime);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getDiscoveryRegion() != null)
            sb.append("DiscoveryRegion: ").append(getDiscoveryRegion()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getLastAttemptedDiscoveryTime() != null)
            sb.append("LastAttemptedDiscoveryTime: ").append(getLastAttemptedDiscoveryTime()).append(",");
        if (getLastSuccessfulDiscoveryTime() != null)
            sb.append("LastSuccessfulDiscoveryTime: ").append(getLastSuccessfulDiscoveryTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpamDiscoveredAccount == false)
            return false;
        IpamDiscoveredAccount other = (IpamDiscoveredAccount) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getDiscoveryRegion() == null ^ this.getDiscoveryRegion() == null)
            return false;
        if (other.getDiscoveryRegion() != null && other.getDiscoveryRegion().equals(this.getDiscoveryRegion()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getLastAttemptedDiscoveryTime() == null ^ this.getLastAttemptedDiscoveryTime() == null)
            return false;
        if (other.getLastAttemptedDiscoveryTime() != null && other.getLastAttemptedDiscoveryTime().equals(this.getLastAttemptedDiscoveryTime()) == false)
            return false;
        if (other.getLastSuccessfulDiscoveryTime() == null ^ this.getLastSuccessfulDiscoveryTime() == null)
            return false;
        if (other.getLastSuccessfulDiscoveryTime() != null && other.getLastSuccessfulDiscoveryTime().equals(this.getLastSuccessfulDiscoveryTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getDiscoveryRegion() == null) ? 0 : getDiscoveryRegion().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getLastAttemptedDiscoveryTime() == null) ? 0 : getLastAttemptedDiscoveryTime().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulDiscoveryTime() == null) ? 0 : getLastSuccessfulDiscoveryTime().hashCode());
        return hashCode;
    }

    @Override
    public IpamDiscoveredAccount clone() {
        try {
            return (IpamDiscoveredAccount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

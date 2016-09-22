/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;

/**
 * 
 */
public class GetContactReachabilityStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The domain name for which you requested the reachability status.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Whether the registrant contact has responded. <code>PENDING</code> indicates that we sent the confirmation email
     * and haven't received a response yet, <code>DONE</code> indicates that we sent the email and got confirmation from
     * the registrant contact, and <code>EXPIRED</code> indicates that the time limit expired before the registrant
     * contact responded.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values: <code>PENDING</code>, <code>DONE</code>, <code>EXPIRED</code>
     * </p>
     */
    private String status;

    /**
     * <p>
     * The domain name for which you requested the reachability status.
     * </p>
     * 
     * @param domainName
     *        The domain name for which you requested the reachability status.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name for which you requested the reachability status.
     * </p>
     * 
     * @return The domain name for which you requested the reachability status.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name for which you requested the reachability status.
     * </p>
     * 
     * @param domainName
     *        The domain name for which you requested the reachability status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactReachabilityStatusResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Whether the registrant contact has responded. <code>PENDING</code> indicates that we sent the confirmation email
     * and haven't received a response yet, <code>DONE</code> indicates that we sent the email and got confirmation from
     * the registrant contact, and <code>EXPIRED</code> indicates that the time limit expired before the registrant
     * contact responded.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values: <code>PENDING</code>, <code>DONE</code>, <code>EXPIRED</code>
     * </p>
     * 
     * @param status
     *        Whether the registrant contact has responded. <code>PENDING</code> indicates that we sent the confirmation
     *        email and haven't received a response yet, <code>DONE</code> indicates that we sent the email and got
     *        confirmation from the registrant contact, and <code>EXPIRED</code> indicates that the time limit expired
     *        before the registrant contact responded. </p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Valid values: <code>PENDING</code>, <code>DONE</code>, <code>EXPIRED</code>
     * @see ReachabilityStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Whether the registrant contact has responded. <code>PENDING</code> indicates that we sent the confirmation email
     * and haven't received a response yet, <code>DONE</code> indicates that we sent the email and got confirmation from
     * the registrant contact, and <code>EXPIRED</code> indicates that the time limit expired before the registrant
     * contact responded.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values: <code>PENDING</code>, <code>DONE</code>, <code>EXPIRED</code>
     * </p>
     * 
     * @return Whether the registrant contact has responded. <code>PENDING</code> indicates that we sent the
     *         confirmation email and haven't received a response yet, <code>DONE</code> indicates that we sent the
     *         email and got confirmation from the registrant contact, and <code>EXPIRED</code> indicates that the time
     *         limit expired before the registrant contact responded. </p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Valid values: <code>PENDING</code>, <code>DONE</code>, <code>EXPIRED</code>
     * @see ReachabilityStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Whether the registrant contact has responded. <code>PENDING</code> indicates that we sent the confirmation email
     * and haven't received a response yet, <code>DONE</code> indicates that we sent the email and got confirmation from
     * the registrant contact, and <code>EXPIRED</code> indicates that the time limit expired before the registrant
     * contact responded.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values: <code>PENDING</code>, <code>DONE</code>, <code>EXPIRED</code>
     * </p>
     * 
     * @param status
     *        Whether the registrant contact has responded. <code>PENDING</code> indicates that we sent the confirmation
     *        email and haven't received a response yet, <code>DONE</code> indicates that we sent the email and got
     *        confirmation from the registrant contact, and <code>EXPIRED</code> indicates that the time limit expired
     *        before the registrant contact responded. </p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Valid values: <code>PENDING</code>, <code>DONE</code>, <code>EXPIRED</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReachabilityStatus
     */

    public GetContactReachabilityStatusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Whether the registrant contact has responded. <code>PENDING</code> indicates that we sent the confirmation email
     * and haven't received a response yet, <code>DONE</code> indicates that we sent the email and got confirmation from
     * the registrant contact, and <code>EXPIRED</code> indicates that the time limit expired before the registrant
     * contact responded.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values: <code>PENDING</code>, <code>DONE</code>, <code>EXPIRED</code>
     * </p>
     * 
     * @param status
     *        Whether the registrant contact has responded. <code>PENDING</code> indicates that we sent the confirmation
     *        email and haven't received a response yet, <code>DONE</code> indicates that we sent the email and got
     *        confirmation from the registrant contact, and <code>EXPIRED</code> indicates that the time limit expired
     *        before the registrant contact responded. </p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Valid values: <code>PENDING</code>, <code>DONE</code>, <code>EXPIRED</code>
     * @see ReachabilityStatus
     */

    public void setStatus(ReachabilityStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Whether the registrant contact has responded. <code>PENDING</code> indicates that we sent the confirmation email
     * and haven't received a response yet, <code>DONE</code> indicates that we sent the email and got confirmation from
     * the registrant contact, and <code>EXPIRED</code> indicates that the time limit expired before the registrant
     * contact responded.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values: <code>PENDING</code>, <code>DONE</code>, <code>EXPIRED</code>
     * </p>
     * 
     * @param status
     *        Whether the registrant contact has responded. <code>PENDING</code> indicates that we sent the confirmation
     *        email and haven't received a response yet, <code>DONE</code> indicates that we sent the email and got
     *        confirmation from the registrant contact, and <code>EXPIRED</code> indicates that the time limit expired
     *        before the registrant contact responded. </p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Valid values: <code>PENDING</code>, <code>DONE</code>, <code>EXPIRED</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReachabilityStatus
     */

    public GetContactReachabilityStatusResult withStatus(ReachabilityStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContactReachabilityStatusResult == false)
            return false;
        GetContactReachabilityStatusResult other = (GetContactReachabilityStatusResult) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetContactReachabilityStatusResult clone() {
        try {
            return (GetContactReachabilityStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

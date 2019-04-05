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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/GetContactReachabilityStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContactReachabilityStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The domain name for which you requested the reachability status.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Whether the registrant contact has responded. Values include the following:
     * </p>
     * <dl>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * We sent the confirmation email and haven't received a response yet.
     * </p>
     * </dd>
     * <dt>DONE</dt>
     * <dd>
     * <p>
     * We sent the email and got confirmation from the registrant contact.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The time limit expired before the registrant contact responded.
     * </p>
     * </dd>
     * </dl>
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
     * Whether the registrant contact has responded. Values include the following:
     * </p>
     * <dl>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * We sent the confirmation email and haven't received a response yet.
     * </p>
     * </dd>
     * <dt>DONE</dt>
     * <dd>
     * <p>
     * We sent the email and got confirmation from the registrant contact.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The time limit expired before the registrant contact responded.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        Whether the registrant contact has responded. Values include the following:</p>
     *        <dl>
     *        <dt>PENDING</dt>
     *        <dd>
     *        <p>
     *        We sent the confirmation email and haven't received a response yet.
     *        </p>
     *        </dd>
     *        <dt>DONE</dt>
     *        <dd>
     *        <p>
     *        We sent the email and got confirmation from the registrant contact.
     *        </p>
     *        </dd>
     *        <dt>EXPIRED</dt>
     *        <dd>
     *        <p>
     *        The time limit expired before the registrant contact responded.
     *        </p>
     *        </dd>
     * @see ReachabilityStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Whether the registrant contact has responded. Values include the following:
     * </p>
     * <dl>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * We sent the confirmation email and haven't received a response yet.
     * </p>
     * </dd>
     * <dt>DONE</dt>
     * <dd>
     * <p>
     * We sent the email and got confirmation from the registrant contact.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The time limit expired before the registrant contact responded.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Whether the registrant contact has responded. Values include the following:</p>
     *         <dl>
     *         <dt>PENDING</dt>
     *         <dd>
     *         <p>
     *         We sent the confirmation email and haven't received a response yet.
     *         </p>
     *         </dd>
     *         <dt>DONE</dt>
     *         <dd>
     *         <p>
     *         We sent the email and got confirmation from the registrant contact.
     *         </p>
     *         </dd>
     *         <dt>EXPIRED</dt>
     *         <dd>
     *         <p>
     *         The time limit expired before the registrant contact responded.
     *         </p>
     *         </dd>
     * @see ReachabilityStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Whether the registrant contact has responded. Values include the following:
     * </p>
     * <dl>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * We sent the confirmation email and haven't received a response yet.
     * </p>
     * </dd>
     * <dt>DONE</dt>
     * <dd>
     * <p>
     * We sent the email and got confirmation from the registrant contact.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The time limit expired before the registrant contact responded.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        Whether the registrant contact has responded. Values include the following:</p>
     *        <dl>
     *        <dt>PENDING</dt>
     *        <dd>
     *        <p>
     *        We sent the confirmation email and haven't received a response yet.
     *        </p>
     *        </dd>
     *        <dt>DONE</dt>
     *        <dd>
     *        <p>
     *        We sent the email and got confirmation from the registrant contact.
     *        </p>
     *        </dd>
     *        <dt>EXPIRED</dt>
     *        <dd>
     *        <p>
     *        The time limit expired before the registrant contact responded.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReachabilityStatus
     */

    public GetContactReachabilityStatusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Whether the registrant contact has responded. Values include the following:
     * </p>
     * <dl>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * We sent the confirmation email and haven't received a response yet.
     * </p>
     * </dd>
     * <dt>DONE</dt>
     * <dd>
     * <p>
     * We sent the email and got confirmation from the registrant contact.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The time limit expired before the registrant contact responded.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        Whether the registrant contact has responded. Values include the following:</p>
     *        <dl>
     *        <dt>PENDING</dt>
     *        <dd>
     *        <p>
     *        We sent the confirmation email and haven't received a response yet.
     *        </p>
     *        </dd>
     *        <dt>DONE</dt>
     *        <dd>
     *        <p>
     *        We sent the email and got confirmation from the registrant contact.
     *        </p>
     *        </dd>
     *        <dt>EXPIRED</dt>
     *        <dd>
     *        <p>
     *        The time limit expired before the registrant contact responded.
     *        </p>
     *        </dd>
     * @see ReachabilityStatus
     */

    public void setStatus(ReachabilityStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * Whether the registrant contact has responded. Values include the following:
     * </p>
     * <dl>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * We sent the confirmation email and haven't received a response yet.
     * </p>
     * </dd>
     * <dt>DONE</dt>
     * <dd>
     * <p>
     * We sent the email and got confirmation from the registrant contact.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The time limit expired before the registrant contact responded.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        Whether the registrant contact has responded. Values include the following:</p>
     *        <dl>
     *        <dt>PENDING</dt>
     *        <dd>
     *        <p>
     *        We sent the confirmation email and haven't received a response yet.
     *        </p>
     *        </dd>
     *        <dt>DONE</dt>
     *        <dd>
     *        <p>
     *        We sent the email and got confirmation from the registrant contact.
     *        </p>
     *        </dd>
     *        <dt>EXPIRED</dt>
     *        <dd>
     *        <p>
     *        The time limit expired before the registrant contact responded.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReachabilityStatus
     */

    public GetContactReachabilityStatusResult withStatus(ReachabilityStatus status) {
        this.status = status.toString();
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
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

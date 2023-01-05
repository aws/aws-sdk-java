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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the delegation state of an Amazon Route 53 registered domain to Amazon Lightsail.
 * </p>
 * <p>
 * When you delegate an Amazon Route 53 registered domain to Lightsail, you can manage the DNS of the domain using a
 * Lightsail DNS zone. You no longer use the Route 53 hosted zone to manage the DNS of the domain. To delegate the
 * domain, Lightsail automatically updates the domain's name servers in Route 53 to the name servers of the Lightsail
 * DNS zone. Then, Lightsail automatically deletes the Route 53 hosted zone for the domain.
 * </p>
 * <p>
 * All of the following conditions must be true for automatic domain delegation to be successful:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The registered domain must be in the same Amazon Web Services account as the Lightsail account making the request.
 * </p>
 * </li>
 * <li>
 * <p>
 * The user or entity making the request must have permission to manage domains in Route 53.
 * </p>
 * </li>
 * <li>
 * <p>
 * The Route 53 hosted zone for the domain must be empty. It cannot contain DNS records other than start of authority
 * (SOA) and name server records.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If automatic domain delegation fails, or if you manage the DNS of your domain using a service other than Route 53,
 * then you must manually add the Lightsail DNS zone name servers to your domain in order to delegate management of its
 * DNS to Lightsail. For more information, see <a
 * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-create-dns-entry">Creating a DNS zone
 * to manage your domain’s records in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RegisteredDomainDelegationInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisteredDomainDelegationInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that describes the state of the name server records that are automatically added to the Route 53 domain
     * by Lightsail.
     * </p>
     */
    private NameServersUpdateState nameServersUpdateState;

    private R53HostedZoneDeletionState r53HostedZoneDeletionState;

    /**
     * <p>
     * An object that describes the state of the name server records that are automatically added to the Route 53 domain
     * by Lightsail.
     * </p>
     * 
     * @param nameServersUpdateState
     *        An object that describes the state of the name server records that are automatically added to the Route 53
     *        domain by Lightsail.
     */

    public void setNameServersUpdateState(NameServersUpdateState nameServersUpdateState) {
        this.nameServersUpdateState = nameServersUpdateState;
    }

    /**
     * <p>
     * An object that describes the state of the name server records that are automatically added to the Route 53 domain
     * by Lightsail.
     * </p>
     * 
     * @return An object that describes the state of the name server records that are automatically added to the
     *         Route 53 domain by Lightsail.
     */

    public NameServersUpdateState getNameServersUpdateState() {
        return this.nameServersUpdateState;
    }

    /**
     * <p>
     * An object that describes the state of the name server records that are automatically added to the Route 53 domain
     * by Lightsail.
     * </p>
     * 
     * @param nameServersUpdateState
     *        An object that describes the state of the name server records that are automatically added to the Route 53
     *        domain by Lightsail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisteredDomainDelegationInfo withNameServersUpdateState(NameServersUpdateState nameServersUpdateState) {
        setNameServersUpdateState(nameServersUpdateState);
        return this;
    }

    /**
     * @param r53HostedZoneDeletionState
     */

    public void setR53HostedZoneDeletionState(R53HostedZoneDeletionState r53HostedZoneDeletionState) {
        this.r53HostedZoneDeletionState = r53HostedZoneDeletionState;
    }

    /**
     * @return
     */

    public R53HostedZoneDeletionState getR53HostedZoneDeletionState() {
        return this.r53HostedZoneDeletionState;
    }

    /**
     * @param r53HostedZoneDeletionState
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisteredDomainDelegationInfo withR53HostedZoneDeletionState(R53HostedZoneDeletionState r53HostedZoneDeletionState) {
        setR53HostedZoneDeletionState(r53HostedZoneDeletionState);
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
        if (getNameServersUpdateState() != null)
            sb.append("NameServersUpdateState: ").append(getNameServersUpdateState()).append(",");
        if (getR53HostedZoneDeletionState() != null)
            sb.append("R53HostedZoneDeletionState: ").append(getR53HostedZoneDeletionState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisteredDomainDelegationInfo == false)
            return false;
        RegisteredDomainDelegationInfo other = (RegisteredDomainDelegationInfo) obj;
        if (other.getNameServersUpdateState() == null ^ this.getNameServersUpdateState() == null)
            return false;
        if (other.getNameServersUpdateState() != null && other.getNameServersUpdateState().equals(this.getNameServersUpdateState()) == false)
            return false;
        if (other.getR53HostedZoneDeletionState() == null ^ this.getR53HostedZoneDeletionState() == null)
            return false;
        if (other.getR53HostedZoneDeletionState() != null && other.getR53HostedZoneDeletionState().equals(this.getR53HostedZoneDeletionState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNameServersUpdateState() == null) ? 0 : getNameServersUpdateState().hashCode());
        hashCode = prime * hashCode + ((getR53HostedZoneDeletionState() == null) ? 0 : getR53HostedZoneDeletionState().hashCode());
        return hashCode;
    }

    @Override
    public RegisteredDomainDelegationInfo clone() {
        try {
            return (RegisteredDomainDelegationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.RegisteredDomainDelegationInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ImportFirewallDomains"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportFirewallDomainsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Id of the firewall domain list that DNS Firewall just updated.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the domain list.
     * </p>
     */
    private String name;
    /**
     * <p>
     * </p>
     */
    private String status;
    /**
     * <p>
     * Additional information about the status of the list, if available.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The Id of the firewall domain list that DNS Firewall just updated.
     * </p>
     * 
     * @param id
     *        The Id of the firewall domain list that DNS Firewall just updated.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The Id of the firewall domain list that DNS Firewall just updated.
     * </p>
     * 
     * @return The Id of the firewall domain list that DNS Firewall just updated.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The Id of the firewall domain list that DNS Firewall just updated.
     * </p>
     * 
     * @param id
     *        The Id of the firewall domain list that DNS Firewall just updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportFirewallDomainsResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the domain list.
     * </p>
     * 
     * @param name
     *        The name of the domain list.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain list.
     * </p>
     * 
     * @return The name of the domain list.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain list.
     * </p>
     * 
     * @param name
     *        The name of the domain list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportFirewallDomainsResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param status
     * @see FirewallDomainListStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     * @see FirewallDomainListStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * </p>
     * 
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallDomainListStatus
     */

    public ImportFirewallDomainsResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallDomainListStatus
     */

    public ImportFirewallDomainsResult withStatus(FirewallDomainListStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about the status of the list, if available.
     * </p>
     * 
     * @param statusMessage
     *        Additional information about the status of the list, if available.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Additional information about the status of the list, if available.
     * </p>
     * 
     * @return Additional information about the status of the list, if available.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Additional information about the status of the list, if available.
     * </p>
     * 
     * @param statusMessage
     *        Additional information about the status of the list, if available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportFirewallDomainsResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportFirewallDomainsResult == false)
            return false;
        ImportFirewallDomainsResult other = (ImportFirewallDomainsResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public ImportFirewallDomainsResult clone() {
        try {
            return (ImportFirewallDomainsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

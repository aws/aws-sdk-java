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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ImportFirewallDomains"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportFirewallDomainsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the domain list that you want to modify with the import operation.
     * </p>
     */
    private String firewallDomainListId;
    /**
     * <p>
     * What you want DNS Firewall to do with the domains that are listed in the file. This must be set to
     * <code>REPLACE</code>, which updates the domain list to exactly match the list in the file.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * The fully qualified URL or URI of the file stored in Amazon Simple Storage Service (Amazon S3) that contains the
     * list of domains to import.
     * </p>
     * <p>
     * The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file must be a text file and
     * must contain a single domain per line.
     * </p>
     */
    private String domainFileUrl;

    /**
     * <p>
     * The ID of the domain list that you want to modify with the import operation.
     * </p>
     * 
     * @param firewallDomainListId
     *        The ID of the domain list that you want to modify with the import operation.
     */

    public void setFirewallDomainListId(String firewallDomainListId) {
        this.firewallDomainListId = firewallDomainListId;
    }

    /**
     * <p>
     * The ID of the domain list that you want to modify with the import operation.
     * </p>
     * 
     * @return The ID of the domain list that you want to modify with the import operation.
     */

    public String getFirewallDomainListId() {
        return this.firewallDomainListId;
    }

    /**
     * <p>
     * The ID of the domain list that you want to modify with the import operation.
     * </p>
     * 
     * @param firewallDomainListId
     *        The ID of the domain list that you want to modify with the import operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportFirewallDomainsRequest withFirewallDomainListId(String firewallDomainListId) {
        setFirewallDomainListId(firewallDomainListId);
        return this;
    }

    /**
     * <p>
     * What you want DNS Firewall to do with the domains that are listed in the file. This must be set to
     * <code>REPLACE</code>, which updates the domain list to exactly match the list in the file.
     * </p>
     * 
     * @param operation
     *        What you want DNS Firewall to do with the domains that are listed in the file. This must be set to
     *        <code>REPLACE</code>, which updates the domain list to exactly match the list in the file.
     * @see FirewallDomainImportOperation
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * What you want DNS Firewall to do with the domains that are listed in the file. This must be set to
     * <code>REPLACE</code>, which updates the domain list to exactly match the list in the file.
     * </p>
     * 
     * @return What you want DNS Firewall to do with the domains that are listed in the file. This must be set to
     *         <code>REPLACE</code>, which updates the domain list to exactly match the list in the file.
     * @see FirewallDomainImportOperation
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * What you want DNS Firewall to do with the domains that are listed in the file. This must be set to
     * <code>REPLACE</code>, which updates the domain list to exactly match the list in the file.
     * </p>
     * 
     * @param operation
     *        What you want DNS Firewall to do with the domains that are listed in the file. This must be set to
     *        <code>REPLACE</code>, which updates the domain list to exactly match the list in the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallDomainImportOperation
     */

    public ImportFirewallDomainsRequest withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * What you want DNS Firewall to do with the domains that are listed in the file. This must be set to
     * <code>REPLACE</code>, which updates the domain list to exactly match the list in the file.
     * </p>
     * 
     * @param operation
     *        What you want DNS Firewall to do with the domains that are listed in the file. This must be set to
     *        <code>REPLACE</code>, which updates the domain list to exactly match the list in the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallDomainImportOperation
     */

    public ImportFirewallDomainsRequest withOperation(FirewallDomainImportOperation operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>
     * The fully qualified URL or URI of the file stored in Amazon Simple Storage Service (Amazon S3) that contains the
     * list of domains to import.
     * </p>
     * <p>
     * The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file must be a text file and
     * must contain a single domain per line.
     * </p>
     * 
     * @param domainFileUrl
     *        The fully qualified URL or URI of the file stored in Amazon Simple Storage Service (Amazon S3) that
     *        contains the list of domains to import.</p>
     *        <p>
     *        The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file must be a text
     *        file and must contain a single domain per line.
     */

    public void setDomainFileUrl(String domainFileUrl) {
        this.domainFileUrl = domainFileUrl;
    }

    /**
     * <p>
     * The fully qualified URL or URI of the file stored in Amazon Simple Storage Service (Amazon S3) that contains the
     * list of domains to import.
     * </p>
     * <p>
     * The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file must be a text file and
     * must contain a single domain per line.
     * </p>
     * 
     * @return The fully qualified URL or URI of the file stored in Amazon Simple Storage Service (Amazon S3) that
     *         contains the list of domains to import.</p>
     *         <p>
     *         The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file must be a text
     *         file and must contain a single domain per line.
     */

    public String getDomainFileUrl() {
        return this.domainFileUrl;
    }

    /**
     * <p>
     * The fully qualified URL or URI of the file stored in Amazon Simple Storage Service (Amazon S3) that contains the
     * list of domains to import.
     * </p>
     * <p>
     * The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file must be a text file and
     * must contain a single domain per line.
     * </p>
     * 
     * @param domainFileUrl
     *        The fully qualified URL or URI of the file stored in Amazon Simple Storage Service (Amazon S3) that
     *        contains the list of domains to import.</p>
     *        <p>
     *        The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file must be a text
     *        file and must contain a single domain per line.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportFirewallDomainsRequest withDomainFileUrl(String domainFileUrl) {
        setDomainFileUrl(domainFileUrl);
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
        if (getFirewallDomainListId() != null)
            sb.append("FirewallDomainListId: ").append(getFirewallDomainListId()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getDomainFileUrl() != null)
            sb.append("DomainFileUrl: ").append(getDomainFileUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportFirewallDomainsRequest == false)
            return false;
        ImportFirewallDomainsRequest other = (ImportFirewallDomainsRequest) obj;
        if (other.getFirewallDomainListId() == null ^ this.getFirewallDomainListId() == null)
            return false;
        if (other.getFirewallDomainListId() != null && other.getFirewallDomainListId().equals(this.getFirewallDomainListId()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getDomainFileUrl() == null ^ this.getDomainFileUrl() == null)
            return false;
        if (other.getDomainFileUrl() != null && other.getDomainFileUrl().equals(this.getDomainFileUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallDomainListId() == null) ? 0 : getFirewallDomainListId().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getDomainFileUrl() == null) ? 0 : getDomainFileUrl().hashCode());
        return hashCode;
    }

    @Override
    public ImportFirewallDomainsRequest clone() {
        return (ImportFirewallDomainsRequest) super.clone();
    }

}

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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateOrganization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOrganizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS Directory Service directory ID.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The organization alias.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The idempotency token associated with the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The email domains to associate with the organization.
     * </p>
     */
    private java.util.List<Domain> domains;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a customer managed master key from AWS KMS.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * When <code>true</code>, allows organization interoperability between Amazon WorkMail and Microsoft Exchange. Can
     * only be set to <code>true</code> if an AD Connector directory ID is included in the request.
     * </p>
     */
    private Boolean enableInteroperability;

    /**
     * <p>
     * The AWS Directory Service directory ID.
     * </p>
     * 
     * @param directoryId
     *        The AWS Directory Service directory ID.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The AWS Directory Service directory ID.
     * </p>
     * 
     * @return The AWS Directory Service directory ID.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The AWS Directory Service directory ID.
     * </p>
     * 
     * @param directoryId
     *        The AWS Directory Service directory ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOrganizationRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The organization alias.
     * </p>
     * 
     * @param alias
     *        The organization alias.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The organization alias.
     * </p>
     * 
     * @return The organization alias.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The organization alias.
     * </p>
     * 
     * @param alias
     *        The organization alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOrganizationRequest withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The idempotency token associated with the request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token associated with the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token associated with the request.
     * </p>
     * 
     * @return The idempotency token associated with the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token associated with the request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOrganizationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The email domains to associate with the organization.
     * </p>
     * 
     * @return The email domains to associate with the organization.
     */

    public java.util.List<Domain> getDomains() {
        return domains;
    }

    /**
     * <p>
     * The email domains to associate with the organization.
     * </p>
     * 
     * @param domains
     *        The email domains to associate with the organization.
     */

    public void setDomains(java.util.Collection<Domain> domains) {
        if (domains == null) {
            this.domains = null;
            return;
        }

        this.domains = new java.util.ArrayList<Domain>(domains);
    }

    /**
     * <p>
     * The email domains to associate with the organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomains(java.util.Collection)} or {@link #withDomains(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param domains
     *        The email domains to associate with the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOrganizationRequest withDomains(Domain... domains) {
        if (this.domains == null) {
            setDomains(new java.util.ArrayList<Domain>(domains.length));
        }
        for (Domain ele : domains) {
            this.domains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The email domains to associate with the organization.
     * </p>
     * 
     * @param domains
     *        The email domains to associate with the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOrganizationRequest withDomains(java.util.Collection<Domain> domains) {
        setDomains(domains);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a customer managed master key from AWS KMS.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of a customer managed master key from AWS KMS.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a customer managed master key from AWS KMS.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a customer managed master key from AWS KMS.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a customer managed master key from AWS KMS.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of a customer managed master key from AWS KMS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOrganizationRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, allows organization interoperability between Amazon WorkMail and Microsoft Exchange. Can
     * only be set to <code>true</code> if an AD Connector directory ID is included in the request.
     * </p>
     * 
     * @param enableInteroperability
     *        When <code>true</code>, allows organization interoperability between Amazon WorkMail and Microsoft
     *        Exchange. Can only be set to <code>true</code> if an AD Connector directory ID is included in the request.
     */

    public void setEnableInteroperability(Boolean enableInteroperability) {
        this.enableInteroperability = enableInteroperability;
    }

    /**
     * <p>
     * When <code>true</code>, allows organization interoperability between Amazon WorkMail and Microsoft Exchange. Can
     * only be set to <code>true</code> if an AD Connector directory ID is included in the request.
     * </p>
     * 
     * @return When <code>true</code>, allows organization interoperability between Amazon WorkMail and Microsoft
     *         Exchange. Can only be set to <code>true</code> if an AD Connector directory ID is included in the
     *         request.
     */

    public Boolean getEnableInteroperability() {
        return this.enableInteroperability;
    }

    /**
     * <p>
     * When <code>true</code>, allows organization interoperability between Amazon WorkMail and Microsoft Exchange. Can
     * only be set to <code>true</code> if an AD Connector directory ID is included in the request.
     * </p>
     * 
     * @param enableInteroperability
     *        When <code>true</code>, allows organization interoperability between Amazon WorkMail and Microsoft
     *        Exchange. Can only be set to <code>true</code> if an AD Connector directory ID is included in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOrganizationRequest withEnableInteroperability(Boolean enableInteroperability) {
        setEnableInteroperability(enableInteroperability);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, allows organization interoperability between Amazon WorkMail and Microsoft Exchange. Can
     * only be set to <code>true</code> if an AD Connector directory ID is included in the request.
     * </p>
     * 
     * @return When <code>true</code>, allows organization interoperability between Amazon WorkMail and Microsoft
     *         Exchange. Can only be set to <code>true</code> if an AD Connector directory ID is included in the
     *         request.
     */

    public Boolean isEnableInteroperability() {
        return this.enableInteroperability;
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDomains() != null)
            sb.append("Domains: ").append(getDomains()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getEnableInteroperability() != null)
            sb.append("EnableInteroperability: ").append(getEnableInteroperability());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOrganizationRequest == false)
            return false;
        CreateOrganizationRequest other = (CreateOrganizationRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDomains() == null ^ this.getDomains() == null)
            return false;
        if (other.getDomains() != null && other.getDomains().equals(this.getDomains()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getEnableInteroperability() == null ^ this.getEnableInteroperability() == null)
            return false;
        if (other.getEnableInteroperability() != null && other.getEnableInteroperability().equals(this.getEnableInteroperability()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDomains() == null) ? 0 : getDomains().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getEnableInteroperability() == null) ? 0 : getEnableInteroperability().hashCode());
        return hashCode;
    }

    @Override
    public CreateOrganizationRequest clone() {
        return (CreateOrganizationRequest) super.clone();
    }

}

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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Replaces the current set of name servers for the domain with the specified set of name servers. If you use Amazon
 * Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted zone for the domain.
 * </p>
 * <p>
 * If successful, this operation returns an operation ID that you can use to track the progress and completion of the
 * action. If the request is not completed successfully, the domain registrant will be notified by email.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/UpdateDomainNameservers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDomainNameserversRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that you want to change name servers for.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The authorization key for .fi domains
     * </p>
     */
    @Deprecated
    private String fIAuthKey;
    /**
     * <p>
     * A list of new name servers for the domain.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Nameserver> nameservers;

    /**
     * <p>
     * The name of the domain that you want to change name servers for.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you want to change name servers for.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to change name servers for.
     * </p>
     * 
     * @return The name of the domain that you want to change name servers for.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to change name servers for.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you want to change name servers for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainNameserversRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The authorization key for .fi domains
     * </p>
     * 
     * @param fIAuthKey
     *        The authorization key for .fi domains
     */
    @Deprecated
    public void setFIAuthKey(String fIAuthKey) {
        this.fIAuthKey = fIAuthKey;
    }

    /**
     * <p>
     * The authorization key for .fi domains
     * </p>
     * 
     * @return The authorization key for .fi domains
     */
    @Deprecated
    public String getFIAuthKey() {
        return this.fIAuthKey;
    }

    /**
     * <p>
     * The authorization key for .fi domains
     * </p>
     * 
     * @param fIAuthKey
     *        The authorization key for .fi domains
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public UpdateDomainNameserversRequest withFIAuthKey(String fIAuthKey) {
        setFIAuthKey(fIAuthKey);
        return this;
    }

    /**
     * <p>
     * A list of new name servers for the domain.
     * </p>
     * 
     * @return A list of new name servers for the domain.
     */

    public java.util.List<Nameserver> getNameservers() {
        if (nameservers == null) {
            nameservers = new com.amazonaws.internal.SdkInternalList<Nameserver>();
        }
        return nameservers;
    }

    /**
     * <p>
     * A list of new name servers for the domain.
     * </p>
     * 
     * @param nameservers
     *        A list of new name servers for the domain.
     */

    public void setNameservers(java.util.Collection<Nameserver> nameservers) {
        if (nameservers == null) {
            this.nameservers = null;
            return;
        }

        this.nameservers = new com.amazonaws.internal.SdkInternalList<Nameserver>(nameservers);
    }

    /**
     * <p>
     * A list of new name servers for the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNameservers(java.util.Collection)} or {@link #withNameservers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nameservers
     *        A list of new name servers for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainNameserversRequest withNameservers(Nameserver... nameservers) {
        if (this.nameservers == null) {
            setNameservers(new com.amazonaws.internal.SdkInternalList<Nameserver>(nameservers.length));
        }
        for (Nameserver ele : nameservers) {
            this.nameservers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of new name servers for the domain.
     * </p>
     * 
     * @param nameservers
     *        A list of new name servers for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainNameserversRequest withNameservers(java.util.Collection<Nameserver> nameservers) {
        setNameservers(nameservers);
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
        if (getFIAuthKey() != null)
            sb.append("FIAuthKey: ").append(getFIAuthKey()).append(",");
        if (getNameservers() != null)
            sb.append("Nameservers: ").append(getNameservers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainNameserversRequest == false)
            return false;
        UpdateDomainNameserversRequest other = (UpdateDomainNameserversRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getFIAuthKey() == null ^ this.getFIAuthKey() == null)
            return false;
        if (other.getFIAuthKey() != null && other.getFIAuthKey().equals(this.getFIAuthKey()) == false)
            return false;
        if (other.getNameservers() == null ^ this.getNameservers() == null)
            return false;
        if (other.getNameservers() != null && other.getNameservers().equals(this.getNameservers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getFIAuthKey() == null) ? 0 : getFIAuthKey().hashCode());
        hashCode = prime * hashCode + ((getNameservers() == null) ? 0 : getNameservers().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainNameserversRequest clone() {
        return (UpdateDomainNameserversRequest) super.clone();
    }

}

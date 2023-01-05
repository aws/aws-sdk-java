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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List all the <code>AvailabilityConfiguration</code>'s for the given WorkMail organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AvailabilityConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailabilityConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Displays the domain to which the provider applies.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Displays the provider type that applies to this domain.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * If <code>ProviderType</code> is <code>EWS</code>, then this field contains
     * <code>RedactedEwsAvailabilityProvider</code>. Otherwise, it is not required.
     * </p>
     */
    private RedactedEwsAvailabilityProvider ewsProvider;
    /**
     * <p>
     * If ProviderType is <code>LAMBDA</code> then this field contains <code>LambdaAvailabilityProvider</code>.
     * Otherwise, it is not required.
     * </p>
     */
    private LambdaAvailabilityProvider lambdaProvider;
    /**
     * <p>
     * The date and time at which the availability configuration was created.
     * </p>
     */
    private java.util.Date dateCreated;
    /**
     * <p>
     * The date and time at which the availability configuration was last modified.
     * </p>
     */
    private java.util.Date dateModified;

    /**
     * <p>
     * Displays the domain to which the provider applies.
     * </p>
     * 
     * @param domainName
     *        Displays the domain to which the provider applies.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Displays the domain to which the provider applies.
     * </p>
     * 
     * @return Displays the domain to which the provider applies.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Displays the domain to which the provider applies.
     * </p>
     * 
     * @param domainName
     *        Displays the domain to which the provider applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityConfiguration withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Displays the provider type that applies to this domain.
     * </p>
     * 
     * @param providerType
     *        Displays the provider type that applies to this domain.
     * @see AvailabilityProviderType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * Displays the provider type that applies to this domain.
     * </p>
     * 
     * @return Displays the provider type that applies to this domain.
     * @see AvailabilityProviderType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * Displays the provider type that applies to this domain.
     * </p>
     * 
     * @param providerType
     *        Displays the provider type that applies to this domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvailabilityProviderType
     */

    public AvailabilityConfiguration withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * Displays the provider type that applies to this domain.
     * </p>
     * 
     * @param providerType
     *        Displays the provider type that applies to this domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvailabilityProviderType
     */

    public AvailabilityConfiguration withProviderType(AvailabilityProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * If <code>ProviderType</code> is <code>EWS</code>, then this field contains
     * <code>RedactedEwsAvailabilityProvider</code>. Otherwise, it is not required.
     * </p>
     * 
     * @param ewsProvider
     *        If <code>ProviderType</code> is <code>EWS</code>, then this field contains
     *        <code>RedactedEwsAvailabilityProvider</code>. Otherwise, it is not required.
     */

    public void setEwsProvider(RedactedEwsAvailabilityProvider ewsProvider) {
        this.ewsProvider = ewsProvider;
    }

    /**
     * <p>
     * If <code>ProviderType</code> is <code>EWS</code>, then this field contains
     * <code>RedactedEwsAvailabilityProvider</code>. Otherwise, it is not required.
     * </p>
     * 
     * @return If <code>ProviderType</code> is <code>EWS</code>, then this field contains
     *         <code>RedactedEwsAvailabilityProvider</code>. Otherwise, it is not required.
     */

    public RedactedEwsAvailabilityProvider getEwsProvider() {
        return this.ewsProvider;
    }

    /**
     * <p>
     * If <code>ProviderType</code> is <code>EWS</code>, then this field contains
     * <code>RedactedEwsAvailabilityProvider</code>. Otherwise, it is not required.
     * </p>
     * 
     * @param ewsProvider
     *        If <code>ProviderType</code> is <code>EWS</code>, then this field contains
     *        <code>RedactedEwsAvailabilityProvider</code>. Otherwise, it is not required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityConfiguration withEwsProvider(RedactedEwsAvailabilityProvider ewsProvider) {
        setEwsProvider(ewsProvider);
        return this;
    }

    /**
     * <p>
     * If ProviderType is <code>LAMBDA</code> then this field contains <code>LambdaAvailabilityProvider</code>.
     * Otherwise, it is not required.
     * </p>
     * 
     * @param lambdaProvider
     *        If ProviderType is <code>LAMBDA</code> then this field contains <code>LambdaAvailabilityProvider</code>.
     *        Otherwise, it is not required.
     */

    public void setLambdaProvider(LambdaAvailabilityProvider lambdaProvider) {
        this.lambdaProvider = lambdaProvider;
    }

    /**
     * <p>
     * If ProviderType is <code>LAMBDA</code> then this field contains <code>LambdaAvailabilityProvider</code>.
     * Otherwise, it is not required.
     * </p>
     * 
     * @return If ProviderType is <code>LAMBDA</code> then this field contains <code>LambdaAvailabilityProvider</code>.
     *         Otherwise, it is not required.
     */

    public LambdaAvailabilityProvider getLambdaProvider() {
        return this.lambdaProvider;
    }

    /**
     * <p>
     * If ProviderType is <code>LAMBDA</code> then this field contains <code>LambdaAvailabilityProvider</code>.
     * Otherwise, it is not required.
     * </p>
     * 
     * @param lambdaProvider
     *        If ProviderType is <code>LAMBDA</code> then this field contains <code>LambdaAvailabilityProvider</code>.
     *        Otherwise, it is not required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityConfiguration withLambdaProvider(LambdaAvailabilityProvider lambdaProvider) {
        setLambdaProvider(lambdaProvider);
        return this;
    }

    /**
     * <p>
     * The date and time at which the availability configuration was created.
     * </p>
     * 
     * @param dateCreated
     *        The date and time at which the availability configuration was created.
     */

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date and time at which the availability configuration was created.
     * </p>
     * 
     * @return The date and time at which the availability configuration was created.
     */

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date and time at which the availability configuration was created.
     * </p>
     * 
     * @param dateCreated
     *        The date and time at which the availability configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityConfiguration withDateCreated(java.util.Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The date and time at which the availability configuration was last modified.
     * </p>
     * 
     * @param dateModified
     *        The date and time at which the availability configuration was last modified.
     */

    public void setDateModified(java.util.Date dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * <p>
     * The date and time at which the availability configuration was last modified.
     * </p>
     * 
     * @return The date and time at which the availability configuration was last modified.
     */

    public java.util.Date getDateModified() {
        return this.dateModified;
    }

    /**
     * <p>
     * The date and time at which the availability configuration was last modified.
     * </p>
     * 
     * @param dateModified
     *        The date and time at which the availability configuration was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityConfiguration withDateModified(java.util.Date dateModified) {
        setDateModified(dateModified);
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
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getEwsProvider() != null)
            sb.append("EwsProvider: ").append(getEwsProvider()).append(",");
        if (getLambdaProvider() != null)
            sb.append("LambdaProvider: ").append(getLambdaProvider()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getDateModified() != null)
            sb.append("DateModified: ").append(getDateModified());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailabilityConfiguration == false)
            return false;
        AvailabilityConfiguration other = (AvailabilityConfiguration) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getEwsProvider() == null ^ this.getEwsProvider() == null)
            return false;
        if (other.getEwsProvider() != null && other.getEwsProvider().equals(this.getEwsProvider()) == false)
            return false;
        if (other.getLambdaProvider() == null ^ this.getLambdaProvider() == null)
            return false;
        if (other.getLambdaProvider() != null && other.getLambdaProvider().equals(this.getLambdaProvider()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateModified() == null ^ this.getDateModified() == null)
            return false;
        if (other.getDateModified() != null && other.getDateModified().equals(this.getDateModified()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getEwsProvider() == null) ? 0 : getEwsProvider().hashCode());
        hashCode = prime * hashCode + ((getLambdaProvider() == null) ? 0 : getLambdaProvider().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getDateModified() == null) ? 0 : getDateModified().hashCode());
        return hashCode;
    }

    @Override
    public AvailabilityConfiguration clone() {
        try {
            return (AvailabilityConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.AvailabilityConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

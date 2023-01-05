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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateAvailabilityConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAvailabilityConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An idempotent token that ensures that an API request is executed only once.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The WorkMail organization for which the <code>AvailabilityConfiguration</code> will be created.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The domain to which the provider applies.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Exchange Web Services (EWS) availability provider definition. The request must contain exactly one provider
     * definition, either <code>EwsProvider</code> or <code>LambdaProvider</code>.
     * </p>
     */
    private EwsAvailabilityProvider ewsProvider;
    /**
     * <p>
     * Lambda availability provider definition. The request must contain exactly one provider definition, either
     * <code>EwsProvider</code> or <code>LambdaProvider</code>.
     * </p>
     */
    private LambdaAvailabilityProvider lambdaProvider;

    /**
     * <p>
     * An idempotent token that ensures that an API request is executed only once.
     * </p>
     * 
     * @param clientToken
     *        An idempotent token that ensures that an API request is executed only once.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * An idempotent token that ensures that an API request is executed only once.
     * </p>
     * 
     * @return An idempotent token that ensures that an API request is executed only once.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * An idempotent token that ensures that an API request is executed only once.
     * </p>
     * 
     * @param clientToken
     *        An idempotent token that ensures that an API request is executed only once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAvailabilityConfigurationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The WorkMail organization for which the <code>AvailabilityConfiguration</code> will be created.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization for which the <code>AvailabilityConfiguration</code> will be created.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The WorkMail organization for which the <code>AvailabilityConfiguration</code> will be created.
     * </p>
     * 
     * @return The WorkMail organization for which the <code>AvailabilityConfiguration</code> will be created.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The WorkMail organization for which the <code>AvailabilityConfiguration</code> will be created.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization for which the <code>AvailabilityConfiguration</code> will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAvailabilityConfigurationRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The domain to which the provider applies.
     * </p>
     * 
     * @param domainName
     *        The domain to which the provider applies.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain to which the provider applies.
     * </p>
     * 
     * @return The domain to which the provider applies.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain to which the provider applies.
     * </p>
     * 
     * @param domainName
     *        The domain to which the provider applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAvailabilityConfigurationRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Exchange Web Services (EWS) availability provider definition. The request must contain exactly one provider
     * definition, either <code>EwsProvider</code> or <code>LambdaProvider</code>.
     * </p>
     * 
     * @param ewsProvider
     *        Exchange Web Services (EWS) availability provider definition. The request must contain exactly one
     *        provider definition, either <code>EwsProvider</code> or <code>LambdaProvider</code>.
     */

    public void setEwsProvider(EwsAvailabilityProvider ewsProvider) {
        this.ewsProvider = ewsProvider;
    }

    /**
     * <p>
     * Exchange Web Services (EWS) availability provider definition. The request must contain exactly one provider
     * definition, either <code>EwsProvider</code> or <code>LambdaProvider</code>.
     * </p>
     * 
     * @return Exchange Web Services (EWS) availability provider definition. The request must contain exactly one
     *         provider definition, either <code>EwsProvider</code> or <code>LambdaProvider</code>.
     */

    public EwsAvailabilityProvider getEwsProvider() {
        return this.ewsProvider;
    }

    /**
     * <p>
     * Exchange Web Services (EWS) availability provider definition. The request must contain exactly one provider
     * definition, either <code>EwsProvider</code> or <code>LambdaProvider</code>.
     * </p>
     * 
     * @param ewsProvider
     *        Exchange Web Services (EWS) availability provider definition. The request must contain exactly one
     *        provider definition, either <code>EwsProvider</code> or <code>LambdaProvider</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAvailabilityConfigurationRequest withEwsProvider(EwsAvailabilityProvider ewsProvider) {
        setEwsProvider(ewsProvider);
        return this;
    }

    /**
     * <p>
     * Lambda availability provider definition. The request must contain exactly one provider definition, either
     * <code>EwsProvider</code> or <code>LambdaProvider</code>.
     * </p>
     * 
     * @param lambdaProvider
     *        Lambda availability provider definition. The request must contain exactly one provider definition, either
     *        <code>EwsProvider</code> or <code>LambdaProvider</code>.
     */

    public void setLambdaProvider(LambdaAvailabilityProvider lambdaProvider) {
        this.lambdaProvider = lambdaProvider;
    }

    /**
     * <p>
     * Lambda availability provider definition. The request must contain exactly one provider definition, either
     * <code>EwsProvider</code> or <code>LambdaProvider</code>.
     * </p>
     * 
     * @return Lambda availability provider definition. The request must contain exactly one provider definition, either
     *         <code>EwsProvider</code> or <code>LambdaProvider</code>.
     */

    public LambdaAvailabilityProvider getLambdaProvider() {
        return this.lambdaProvider;
    }

    /**
     * <p>
     * Lambda availability provider definition. The request must contain exactly one provider definition, either
     * <code>EwsProvider</code> or <code>LambdaProvider</code>.
     * </p>
     * 
     * @param lambdaProvider
     *        Lambda availability provider definition. The request must contain exactly one provider definition, either
     *        <code>EwsProvider</code> or <code>LambdaProvider</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAvailabilityConfigurationRequest withLambdaProvider(LambdaAvailabilityProvider lambdaProvider) {
        setLambdaProvider(lambdaProvider);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getEwsProvider() != null)
            sb.append("EwsProvider: ").append(getEwsProvider()).append(",");
        if (getLambdaProvider() != null)
            sb.append("LambdaProvider: ").append(getLambdaProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAvailabilityConfigurationRequest == false)
            return false;
        CreateAvailabilityConfigurationRequest other = (CreateAvailabilityConfigurationRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEwsProvider() == null ^ this.getEwsProvider() == null)
            return false;
        if (other.getEwsProvider() != null && other.getEwsProvider().equals(this.getEwsProvider()) == false)
            return false;
        if (other.getLambdaProvider() == null ^ this.getLambdaProvider() == null)
            return false;
        if (other.getLambdaProvider() != null && other.getLambdaProvider().equals(this.getLambdaProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getEwsProvider() == null) ? 0 : getEwsProvider().hashCode());
        hashCode = prime * hashCode + ((getLambdaProvider() == null) ? 0 : getLambdaProvider().hashCode());
        return hashCode;
    }

    @Override
    public CreateAvailabilityConfigurationRequest clone() {
        return (CreateAvailabilityConfigurationRequest) super.clone();
    }

}

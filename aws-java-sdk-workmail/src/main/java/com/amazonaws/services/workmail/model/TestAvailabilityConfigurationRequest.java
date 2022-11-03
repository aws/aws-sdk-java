/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/TestAvailabilityConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestAvailabilityConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The WorkMail organization where the availability provider will be tested.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The domain to which the provider applies. If this field is provided, a stored availability provider associated to
     * this domain name will be tested.
     * </p>
     */
    private String domainName;

    private EwsAvailabilityProvider ewsProvider;

    private LambdaAvailabilityProvider lambdaProvider;

    /**
     * <p>
     * The WorkMail organization where the availability provider will be tested.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization where the availability provider will be tested.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The WorkMail organization where the availability provider will be tested.
     * </p>
     * 
     * @return The WorkMail organization where the availability provider will be tested.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The WorkMail organization where the availability provider will be tested.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization where the availability provider will be tested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAvailabilityConfigurationRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The domain to which the provider applies. If this field is provided, a stored availability provider associated to
     * this domain name will be tested.
     * </p>
     * 
     * @param domainName
     *        The domain to which the provider applies. If this field is provided, a stored availability provider
     *        associated to this domain name will be tested.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain to which the provider applies. If this field is provided, a stored availability provider associated to
     * this domain name will be tested.
     * </p>
     * 
     * @return The domain to which the provider applies. If this field is provided, a stored availability provider
     *         associated to this domain name will be tested.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain to which the provider applies. If this field is provided, a stored availability provider associated to
     * this domain name will be tested.
     * </p>
     * 
     * @param domainName
     *        The domain to which the provider applies. If this field is provided, a stored availability provider
     *        associated to this domain name will be tested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAvailabilityConfigurationRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * @param ewsProvider
     */

    public void setEwsProvider(EwsAvailabilityProvider ewsProvider) {
        this.ewsProvider = ewsProvider;
    }

    /**
     * @return
     */

    public EwsAvailabilityProvider getEwsProvider() {
        return this.ewsProvider;
    }

    /**
     * @param ewsProvider
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAvailabilityConfigurationRequest withEwsProvider(EwsAvailabilityProvider ewsProvider) {
        setEwsProvider(ewsProvider);
        return this;
    }

    /**
     * @param lambdaProvider
     */

    public void setLambdaProvider(LambdaAvailabilityProvider lambdaProvider) {
        this.lambdaProvider = lambdaProvider;
    }

    /**
     * @return
     */

    public LambdaAvailabilityProvider getLambdaProvider() {
        return this.lambdaProvider;
    }

    /**
     * @param lambdaProvider
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAvailabilityConfigurationRequest withLambdaProvider(LambdaAvailabilityProvider lambdaProvider) {
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

        if (obj instanceof TestAvailabilityConfigurationRequest == false)
            return false;
        TestAvailabilityConfigurationRequest other = (TestAvailabilityConfigurationRequest) obj;
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

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getEwsProvider() == null) ? 0 : getEwsProvider().hashCode());
        hashCode = prime * hashCode + ((getLambdaProvider() == null) ? 0 : getLambdaProvider().hashCode());
        return hashCode;
    }

    @Override
    public TestAvailabilityConfigurationRequest clone() {
        return (TestAvailabilityConfigurationRequest) super.clone();
    }

}

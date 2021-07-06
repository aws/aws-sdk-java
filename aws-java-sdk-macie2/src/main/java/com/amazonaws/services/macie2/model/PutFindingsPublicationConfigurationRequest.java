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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/PutFindingsPublicationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutFindingsPublicationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The configuration settings that determine which findings to publish to Security Hub.
     * </p>
     */
    private SecurityHubConfiguration securityHubConfiguration;

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFindingsPublicationConfigurationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The configuration settings that determine which findings to publish to Security Hub.
     * </p>
     * 
     * @param securityHubConfiguration
     *        The configuration settings that determine which findings to publish to Security Hub.
     */

    public void setSecurityHubConfiguration(SecurityHubConfiguration securityHubConfiguration) {
        this.securityHubConfiguration = securityHubConfiguration;
    }

    /**
     * <p>
     * The configuration settings that determine which findings to publish to Security Hub.
     * </p>
     * 
     * @return The configuration settings that determine which findings to publish to Security Hub.
     */

    public SecurityHubConfiguration getSecurityHubConfiguration() {
        return this.securityHubConfiguration;
    }

    /**
     * <p>
     * The configuration settings that determine which findings to publish to Security Hub.
     * </p>
     * 
     * @param securityHubConfiguration
     *        The configuration settings that determine which findings to publish to Security Hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFindingsPublicationConfigurationRequest withSecurityHubConfiguration(SecurityHubConfiguration securityHubConfiguration) {
        setSecurityHubConfiguration(securityHubConfiguration);
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
        if (getSecurityHubConfiguration() != null)
            sb.append("SecurityHubConfiguration: ").append(getSecurityHubConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutFindingsPublicationConfigurationRequest == false)
            return false;
        PutFindingsPublicationConfigurationRequest other = (PutFindingsPublicationConfigurationRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getSecurityHubConfiguration() == null ^ this.getSecurityHubConfiguration() == null)
            return false;
        if (other.getSecurityHubConfiguration() != null && other.getSecurityHubConfiguration().equals(this.getSecurityHubConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getSecurityHubConfiguration() == null) ? 0 : getSecurityHubConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutFindingsPublicationConfigurationRequest clone() {
        return (PutFindingsPublicationConfigurationRequest) super.clone();
    }

}

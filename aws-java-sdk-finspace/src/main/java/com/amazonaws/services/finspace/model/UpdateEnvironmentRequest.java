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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the FinSpace environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The name of the environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Authentication mode for the environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     * </p>
     * </li>
     * </ul>
     */
    private String federationMode;

    private FederationParameters federationParameters;

    /**
     * <p>
     * The identifier of the FinSpace environment.
     * </p>
     * 
     * @param environmentId
     *        The identifier of the FinSpace environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The identifier of the FinSpace environment.
     * </p>
     * 
     * @return The identifier of the FinSpace environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The identifier of the FinSpace environment.
     * </p>
     * 
     * @param environmentId
     *        The identifier of the FinSpace environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @return The name of the environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @param description
     *        The description of the environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @return The description of the environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @param description
     *        The description of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Authentication mode for the environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param federationMode
     *        Authentication mode for the environment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     *        </p>
     *        </li>
     * @see FederationMode
     */

    public void setFederationMode(String federationMode) {
        this.federationMode = federationMode;
    }

    /**
     * <p>
     * Authentication mode for the environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Authentication mode for the environment.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace
     *         environment.
     *         </p>
     *         </li>
     * @see FederationMode
     */

    public String getFederationMode() {
        return this.federationMode;
    }

    /**
     * <p>
     * Authentication mode for the environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param federationMode
     *        Authentication mode for the environment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FederationMode
     */

    public UpdateEnvironmentRequest withFederationMode(String federationMode) {
        setFederationMode(federationMode);
        return this;
    }

    /**
     * <p>
     * Authentication mode for the environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param federationMode
     *        Authentication mode for the environment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FederationMode
     */

    public UpdateEnvironmentRequest withFederationMode(FederationMode federationMode) {
        this.federationMode = federationMode.toString();
        return this;
    }

    /**
     * @param federationParameters
     */

    public void setFederationParameters(FederationParameters federationParameters) {
        this.federationParameters = federationParameters;
    }

    /**
     * @return
     */

    public FederationParameters getFederationParameters() {
        return this.federationParameters;
    }

    /**
     * @param federationParameters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withFederationParameters(FederationParameters federationParameters) {
        setFederationParameters(federationParameters);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFederationMode() != null)
            sb.append("FederationMode: ").append(getFederationMode()).append(",");
        if (getFederationParameters() != null)
            sb.append("FederationParameters: ").append(getFederationParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentRequest == false)
            return false;
        UpdateEnvironmentRequest other = (UpdateEnvironmentRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFederationMode() == null ^ this.getFederationMode() == null)
            return false;
        if (other.getFederationMode() != null && other.getFederationMode().equals(this.getFederationMode()) == false)
            return false;
        if (other.getFederationParameters() == null ^ this.getFederationParameters() == null)
            return false;
        if (other.getFederationParameters() != null && other.getFederationParameters().equals(this.getFederationParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFederationMode() == null) ? 0 : getFederationMode().hashCode());
        hashCode = prime * hashCode + ((getFederationParameters() == null) ? 0 : getFederationParameters().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnvironmentRequest clone() {
        return (UpdateEnvironmentRequest) super.clone();
    }

}

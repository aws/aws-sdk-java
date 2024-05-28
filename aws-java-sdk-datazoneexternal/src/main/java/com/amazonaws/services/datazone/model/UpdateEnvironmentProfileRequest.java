/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateEnvironmentProfile" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnvironmentProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account in which a specified environment profile is to be udpated.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The Amazon Web Services Region in which a specified environment profile is to be updated.
     * </p>
     */
    private String awsAccountRegion;
    /**
     * <p>
     * The description to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which an environment profile is to be updated.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The identifier of the environment profile that is to be updated.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The name to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The user parameters to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * </p>
     */
    private java.util.List<EnvironmentParameter> userParameters;

    /**
     * <p>
     * The Amazon Web Services account in which a specified environment profile is to be udpated.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account in which a specified environment profile is to be udpated.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account in which a specified environment profile is to be udpated.
     * </p>
     * 
     * @return The Amazon Web Services account in which a specified environment profile is to be udpated.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account in which a specified environment profile is to be udpated.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account in which a specified environment profile is to be udpated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentProfileRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which a specified environment profile is to be updated.
     * </p>
     * 
     * @param awsAccountRegion
     *        The Amazon Web Services Region in which a specified environment profile is to be updated.
     */

    public void setAwsAccountRegion(String awsAccountRegion) {
        this.awsAccountRegion = awsAccountRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which a specified environment profile is to be updated.
     * </p>
     * 
     * @return The Amazon Web Services Region in which a specified environment profile is to be updated.
     */

    public String getAwsAccountRegion() {
        return this.awsAccountRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which a specified environment profile is to be updated.
     * </p>
     * 
     * @param awsAccountRegion
     *        The Amazon Web Services Region in which a specified environment profile is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentProfileRequest withAwsAccountRegion(String awsAccountRegion) {
        setAwsAccountRegion(awsAccountRegion);
        return this;
    }

    /**
     * <p>
     * The description to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * </p>
     * 
     * @param description
     *        The description to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * </p>
     * 
     * @return The description to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * </p>
     * 
     * @param description
     *        The description to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentProfileRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which an environment profile is to be updated.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which an environment profile is to be updated.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which an environment profile is to be updated.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which an environment profile is to be updated.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which an environment profile is to be updated.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which an environment profile is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentProfileRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the environment profile that is to be updated.
     * </p>
     * 
     * @param identifier
     *        The identifier of the environment profile that is to be updated.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the environment profile that is to be updated.
     * </p>
     * 
     * @return The identifier of the environment profile that is to be updated.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the environment profile that is to be updated.
     * </p>
     * 
     * @param identifier
     *        The identifier of the environment profile that is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentProfileRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * </p>
     * 
     * @param name
     *        The name to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * </p>
     * 
     * @return The name to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * </p>
     * 
     * @param name
     *        The name to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentProfileRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The user parameters to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * </p>
     * 
     * @return The user parameters to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     */

    public java.util.List<EnvironmentParameter> getUserParameters() {
        return userParameters;
    }

    /**
     * <p>
     * The user parameters to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * </p>
     * 
     * @param userParameters
     *        The user parameters to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     */

    public void setUserParameters(java.util.Collection<EnvironmentParameter> userParameters) {
        if (userParameters == null) {
            this.userParameters = null;
            return;
        }

        this.userParameters = new java.util.ArrayList<EnvironmentParameter>(userParameters);
    }

    /**
     * <p>
     * The user parameters to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserParameters(java.util.Collection)} or {@link #withUserParameters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userParameters
     *        The user parameters to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentProfileRequest withUserParameters(EnvironmentParameter... userParameters) {
        if (this.userParameters == null) {
            setUserParameters(new java.util.ArrayList<EnvironmentParameter>(userParameters.length));
        }
        for (EnvironmentParameter ele : userParameters) {
            this.userParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user parameters to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * </p>
     * 
     * @param userParameters
     *        The user parameters to be updated as part of the <code>UpdateEnvironmentProfile</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentProfileRequest withUserParameters(java.util.Collection<EnvironmentParameter> userParameters) {
        setUserParameters(userParameters);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAwsAccountRegion() != null)
            sb.append("AwsAccountRegion: ").append(getAwsAccountRegion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserParameters() != null)
            sb.append("UserParameters: ").append(getUserParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentProfileRequest == false)
            return false;
        UpdateEnvironmentProfileRequest other = (UpdateEnvironmentProfileRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAwsAccountRegion() == null ^ this.getAwsAccountRegion() == null)
            return false;
        if (other.getAwsAccountRegion() != null && other.getAwsAccountRegion().equals(this.getAwsAccountRegion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUserParameters() == null ^ this.getUserParameters() == null)
            return false;
        if (other.getUserParameters() != null && other.getUserParameters().equals(this.getUserParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountRegion() == null) ? 0 : getAwsAccountRegion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUserParameters() == null) ? 0 : getUserParameters().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnvironmentProfileRequest clone() {
        return (UpdateEnvironmentProfileRequest) super.clone();
    }

}

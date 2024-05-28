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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateEnvironmentProfile" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account in which the Amazon DataZone environment is created.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The Amazon Web Services region in which this environment profile is created.
     * </p>
     */
    private String awsAccountRegion;
    /**
     * <p>
     * The description of this Amazon DataZone environment profile.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this environment profile is created.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The ID of the blueprint with which this environment profile is created.
     * </p>
     */
    private String environmentBlueprintIdentifier;
    /**
     * <p>
     * The name of this Amazon DataZone environment profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the project in which to create the environment profile.
     * </p>
     */
    private String projectIdentifier;
    /**
     * <p>
     * The user parameters of this Amazon DataZone environment profile.
     * </p>
     */
    private java.util.List<EnvironmentParameter> userParameters;

    /**
     * <p>
     * The Amazon Web Services account in which the Amazon DataZone environment is created.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account in which the Amazon DataZone environment is created.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account in which the Amazon DataZone environment is created.
     * </p>
     * 
     * @return The Amazon Web Services account in which the Amazon DataZone environment is created.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account in which the Amazon DataZone environment is created.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account in which the Amazon DataZone environment is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentProfileRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services region in which this environment profile is created.
     * </p>
     * 
     * @param awsAccountRegion
     *        The Amazon Web Services region in which this environment profile is created.
     */

    public void setAwsAccountRegion(String awsAccountRegion) {
        this.awsAccountRegion = awsAccountRegion;
    }

    /**
     * <p>
     * The Amazon Web Services region in which this environment profile is created.
     * </p>
     * 
     * @return The Amazon Web Services region in which this environment profile is created.
     */

    public String getAwsAccountRegion() {
        return this.awsAccountRegion;
    }

    /**
     * <p>
     * The Amazon Web Services region in which this environment profile is created.
     * </p>
     * 
     * @param awsAccountRegion
     *        The Amazon Web Services region in which this environment profile is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentProfileRequest withAwsAccountRegion(String awsAccountRegion) {
        setAwsAccountRegion(awsAccountRegion);
        return this;
    }

    /**
     * <p>
     * The description of this Amazon DataZone environment profile.
     * </p>
     * 
     * @param description
     *        The description of this Amazon DataZone environment profile.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of this Amazon DataZone environment profile.
     * </p>
     * 
     * @return The description of this Amazon DataZone environment profile.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of this Amazon DataZone environment profile.
     * </p>
     * 
     * @param description
     *        The description of this Amazon DataZone environment profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentProfileRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this environment profile is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which this environment profile is created.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this environment profile is created.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which this environment profile is created.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which this environment profile is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which this environment profile is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentProfileRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the blueprint with which this environment profile is created.
     * </p>
     * 
     * @param environmentBlueprintIdentifier
     *        The ID of the blueprint with which this environment profile is created.
     */

    public void setEnvironmentBlueprintIdentifier(String environmentBlueprintIdentifier) {
        this.environmentBlueprintIdentifier = environmentBlueprintIdentifier;
    }

    /**
     * <p>
     * The ID of the blueprint with which this environment profile is created.
     * </p>
     * 
     * @return The ID of the blueprint with which this environment profile is created.
     */

    public String getEnvironmentBlueprintIdentifier() {
        return this.environmentBlueprintIdentifier;
    }

    /**
     * <p>
     * The ID of the blueprint with which this environment profile is created.
     * </p>
     * 
     * @param environmentBlueprintIdentifier
     *        The ID of the blueprint with which this environment profile is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentProfileRequest withEnvironmentBlueprintIdentifier(String environmentBlueprintIdentifier) {
        setEnvironmentBlueprintIdentifier(environmentBlueprintIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of this Amazon DataZone environment profile.
     * </p>
     * 
     * @param name
     *        The name of this Amazon DataZone environment profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this Amazon DataZone environment profile.
     * </p>
     * 
     * @return The name of this Amazon DataZone environment profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this Amazon DataZone environment profile.
     * </p>
     * 
     * @param name
     *        The name of this Amazon DataZone environment profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentProfileRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the project in which to create the environment profile.
     * </p>
     * 
     * @param projectIdentifier
     *        The identifier of the project in which to create the environment profile.
     */

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    /**
     * <p>
     * The identifier of the project in which to create the environment profile.
     * </p>
     * 
     * @return The identifier of the project in which to create the environment profile.
     */

    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * <p>
     * The identifier of the project in which to create the environment profile.
     * </p>
     * 
     * @param projectIdentifier
     *        The identifier of the project in which to create the environment profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentProfileRequest withProjectIdentifier(String projectIdentifier) {
        setProjectIdentifier(projectIdentifier);
        return this;
    }

    /**
     * <p>
     * The user parameters of this Amazon DataZone environment profile.
     * </p>
     * 
     * @return The user parameters of this Amazon DataZone environment profile.
     */

    public java.util.List<EnvironmentParameter> getUserParameters() {
        return userParameters;
    }

    /**
     * <p>
     * The user parameters of this Amazon DataZone environment profile.
     * </p>
     * 
     * @param userParameters
     *        The user parameters of this Amazon DataZone environment profile.
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
     * The user parameters of this Amazon DataZone environment profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserParameters(java.util.Collection)} or {@link #withUserParameters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userParameters
     *        The user parameters of this Amazon DataZone environment profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentProfileRequest withUserParameters(EnvironmentParameter... userParameters) {
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
     * The user parameters of this Amazon DataZone environment profile.
     * </p>
     * 
     * @param userParameters
     *        The user parameters of this Amazon DataZone environment profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentProfileRequest withUserParameters(java.util.Collection<EnvironmentParameter> userParameters) {
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
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEnvironmentBlueprintIdentifier() != null)
            sb.append("EnvironmentBlueprintIdentifier: ").append(getEnvironmentBlueprintIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getProjectIdentifier() != null)
            sb.append("ProjectIdentifier: ").append(getProjectIdentifier()).append(",");
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

        if (obj instanceof CreateEnvironmentProfileRequest == false)
            return false;
        CreateEnvironmentProfileRequest other = (CreateEnvironmentProfileRequest) obj;
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
        if (other.getEnvironmentBlueprintIdentifier() == null ^ this.getEnvironmentBlueprintIdentifier() == null)
            return false;
        if (other.getEnvironmentBlueprintIdentifier() != null
                && other.getEnvironmentBlueprintIdentifier().equals(this.getEnvironmentBlueprintIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProjectIdentifier() == null ^ this.getProjectIdentifier() == null)
            return false;
        if (other.getProjectIdentifier() != null && other.getProjectIdentifier().equals(this.getProjectIdentifier()) == false)
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
        hashCode = prime * hashCode + ((getEnvironmentBlueprintIdentifier() == null) ? 0 : getEnvironmentBlueprintIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProjectIdentifier() == null) ? 0 : getProjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getUserParameters() == null) ? 0 : getUserParameters().hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentProfileRequest clone() {
        return (CreateEnvironmentProfileRequest) super.clone();
    }

}

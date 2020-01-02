/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetConfigurationProfile" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConfigurationProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The application ID.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The configuration profile ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the configuration profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The configuration profile description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The URI location of the configuration.
     * </p>
     */
    private String locationUri;
    /**
     * <p>
     * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
     * </p>
     */
    private String retrievalRoleArn;
    /**
     * <p>
     * A list of methods for validating the configuration.
     * </p>
     */
    private java.util.List<Validator> validators;

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @return The application ID.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationProfileResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * 
     * @param id
     *        The configuration profile ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * 
     * @return The configuration profile ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * 
     * @param id
     *        The configuration profile ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationProfileResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the configuration profile.
     * </p>
     * 
     * @param name
     *        The name of the configuration profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configuration profile.
     * </p>
     * 
     * @return The name of the configuration profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configuration profile.
     * </p>
     * 
     * @param name
     *        The name of the configuration profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationProfileResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The configuration profile description.
     * </p>
     * 
     * @param description
     *        The configuration profile description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The configuration profile description.
     * </p>
     * 
     * @return The configuration profile description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The configuration profile description.
     * </p>
     * 
     * @param description
     *        The configuration profile description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationProfileResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The URI location of the configuration.
     * </p>
     * 
     * @param locationUri
     *        The URI location of the configuration.
     */

    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * The URI location of the configuration.
     * </p>
     * 
     * @return The URI location of the configuration.
     */

    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * <p>
     * The URI location of the configuration.
     * </p>
     * 
     * @param locationUri
     *        The URI location of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationProfileResult withLocationUri(String locationUri) {
        setLocationUri(locationUri);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
     * </p>
     * 
     * @param retrievalRoleArn
     *        The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
     */

    public void setRetrievalRoleArn(String retrievalRoleArn) {
        this.retrievalRoleArn = retrievalRoleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
     * </p>
     * 
     * @return The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
     */

    public String getRetrievalRoleArn() {
        return this.retrievalRoleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
     * </p>
     * 
     * @param retrievalRoleArn
     *        The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationProfileResult withRetrievalRoleArn(String retrievalRoleArn) {
        setRetrievalRoleArn(retrievalRoleArn);
        return this;
    }

    /**
     * <p>
     * A list of methods for validating the configuration.
     * </p>
     * 
     * @return A list of methods for validating the configuration.
     */

    public java.util.List<Validator> getValidators() {
        return validators;
    }

    /**
     * <p>
     * A list of methods for validating the configuration.
     * </p>
     * 
     * @param validators
     *        A list of methods for validating the configuration.
     */

    public void setValidators(java.util.Collection<Validator> validators) {
        if (validators == null) {
            this.validators = null;
            return;
        }

        this.validators = new java.util.ArrayList<Validator>(validators);
    }

    /**
     * <p>
     * A list of methods for validating the configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidators(java.util.Collection)} or {@link #withValidators(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param validators
     *        A list of methods for validating the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationProfileResult withValidators(Validator... validators) {
        if (this.validators == null) {
            setValidators(new java.util.ArrayList<Validator>(validators.length));
        }
        for (Validator ele : validators) {
            this.validators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of methods for validating the configuration.
     * </p>
     * 
     * @param validators
     *        A list of methods for validating the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationProfileResult withValidators(java.util.Collection<Validator> validators) {
        setValidators(validators);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLocationUri() != null)
            sb.append("LocationUri: ").append(getLocationUri()).append(",");
        if (getRetrievalRoleArn() != null)
            sb.append("RetrievalRoleArn: ").append(getRetrievalRoleArn()).append(",");
        if (getValidators() != null)
            sb.append("Validators: ").append(getValidators());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConfigurationProfileResult == false)
            return false;
        GetConfigurationProfileResult other = (GetConfigurationProfileResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getRetrievalRoleArn() == null ^ this.getRetrievalRoleArn() == null)
            return false;
        if (other.getRetrievalRoleArn() != null && other.getRetrievalRoleArn().equals(this.getRetrievalRoleArn()) == false)
            return false;
        if (other.getValidators() == null ^ this.getValidators() == null)
            return false;
        if (other.getValidators() != null && other.getValidators().equals(this.getValidators()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode + ((getRetrievalRoleArn() == null) ? 0 : getRetrievalRoleArn().hashCode());
        hashCode = prime * hashCode + ((getValidators() == null) ? 0 : getValidators().hashCode());
        return hashCode;
    }

    @Override
    public GetConfigurationProfileResult clone() {
        try {
            return (GetConfigurationProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

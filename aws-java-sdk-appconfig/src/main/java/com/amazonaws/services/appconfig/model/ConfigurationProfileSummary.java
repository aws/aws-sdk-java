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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of a configuration profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ConfigurationProfileSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationProfileSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application ID.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The ID of the configuration profile.
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
     * The URI location of the configuration.
     * </p>
     */
    private String locationUri;
    /**
     * <p>
     * The types of validators in the configuration profile.
     * </p>
     */
    private java.util.List<String> validatorTypes;

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

    public ConfigurationProfileSummary withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The ID of the configuration profile.
     * </p>
     * 
     * @param id
     *        The ID of the configuration profile.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the configuration profile.
     * </p>
     * 
     * @return The ID of the configuration profile.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the configuration profile.
     * </p>
     * 
     * @param id
     *        The ID of the configuration profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationProfileSummary withId(String id) {
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

    public ConfigurationProfileSummary withName(String name) {
        setName(name);
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

    public ConfigurationProfileSummary withLocationUri(String locationUri) {
        setLocationUri(locationUri);
        return this;
    }

    /**
     * <p>
     * The types of validators in the configuration profile.
     * </p>
     * 
     * @return The types of validators in the configuration profile.
     * @see ValidatorType
     */

    public java.util.List<String> getValidatorTypes() {
        return validatorTypes;
    }

    /**
     * <p>
     * The types of validators in the configuration profile.
     * </p>
     * 
     * @param validatorTypes
     *        The types of validators in the configuration profile.
     * @see ValidatorType
     */

    public void setValidatorTypes(java.util.Collection<String> validatorTypes) {
        if (validatorTypes == null) {
            this.validatorTypes = null;
            return;
        }

        this.validatorTypes = new java.util.ArrayList<String>(validatorTypes);
    }

    /**
     * <p>
     * The types of validators in the configuration profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidatorTypes(java.util.Collection)} or {@link #withValidatorTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param validatorTypes
     *        The types of validators in the configuration profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidatorType
     */

    public ConfigurationProfileSummary withValidatorTypes(String... validatorTypes) {
        if (this.validatorTypes == null) {
            setValidatorTypes(new java.util.ArrayList<String>(validatorTypes.length));
        }
        for (String ele : validatorTypes) {
            this.validatorTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types of validators in the configuration profile.
     * </p>
     * 
     * @param validatorTypes
     *        The types of validators in the configuration profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidatorType
     */

    public ConfigurationProfileSummary withValidatorTypes(java.util.Collection<String> validatorTypes) {
        setValidatorTypes(validatorTypes);
        return this;
    }

    /**
     * <p>
     * The types of validators in the configuration profile.
     * </p>
     * 
     * @param validatorTypes
     *        The types of validators in the configuration profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidatorType
     */

    public ConfigurationProfileSummary withValidatorTypes(ValidatorType... validatorTypes) {
        java.util.ArrayList<String> validatorTypesCopy = new java.util.ArrayList<String>(validatorTypes.length);
        for (ValidatorType value : validatorTypes) {
            validatorTypesCopy.add(value.toString());
        }
        if (getValidatorTypes() == null) {
            setValidatorTypes(validatorTypesCopy);
        } else {
            getValidatorTypes().addAll(validatorTypesCopy);
        }
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
        if (getLocationUri() != null)
            sb.append("LocationUri: ").append(getLocationUri()).append(",");
        if (getValidatorTypes() != null)
            sb.append("ValidatorTypes: ").append(getValidatorTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationProfileSummary == false)
            return false;
        ConfigurationProfileSummary other = (ConfigurationProfileSummary) obj;
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
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getValidatorTypes() == null ^ this.getValidatorTypes() == null)
            return false;
        if (other.getValidatorTypes() != null && other.getValidatorTypes().equals(this.getValidatorTypes()) == false)
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
        hashCode = prime * hashCode + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode + ((getValidatorTypes() == null) ? 0 : getValidatorTypes().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationProfileSummary clone() {
        try {
            return (ConfigurationProfileSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appconfig.model.transform.ConfigurationProfileSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

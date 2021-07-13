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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The resource config for the data model, configured as a part of the Amplify project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/BackendAPIResourceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackendAPIResourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Additional authentication methods used to interact with your data models.
     * </p>
     */
    private java.util.List<BackendAPIAuthType> additionalAuthTypes;
    /**
     * <p>
     * The API name used to interact with the data model, configured as a part of your Amplify project.
     * </p>
     */
    private String apiName;
    /**
     * <p>
     * The conflict resolution strategy for your data stored in the data models.
     * </p>
     */
    private BackendAPIConflictResolution conflictResolution;
    /**
     * <p>
     * The default authentication type for interacting with the configured data models in your Amplify project.
     * </p>
     */
    private BackendAPIAuthType defaultAuthType;
    /**
     * <p>
     * The service used to provision and interact with the data model.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The definition of the data model in the annotated transform of the GraphQL schema.
     * </p>
     */
    private String transformSchema;

    /**
     * <p>
     * Additional authentication methods used to interact with your data models.
     * </p>
     * 
     * @return Additional authentication methods used to interact with your data models.
     */

    public java.util.List<BackendAPIAuthType> getAdditionalAuthTypes() {
        return additionalAuthTypes;
    }

    /**
     * <p>
     * Additional authentication methods used to interact with your data models.
     * </p>
     * 
     * @param additionalAuthTypes
     *        Additional authentication methods used to interact with your data models.
     */

    public void setAdditionalAuthTypes(java.util.Collection<BackendAPIAuthType> additionalAuthTypes) {
        if (additionalAuthTypes == null) {
            this.additionalAuthTypes = null;
            return;
        }

        this.additionalAuthTypes = new java.util.ArrayList<BackendAPIAuthType>(additionalAuthTypes);
    }

    /**
     * <p>
     * Additional authentication methods used to interact with your data models.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalAuthTypes(java.util.Collection)} or {@link #withAdditionalAuthTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param additionalAuthTypes
     *        Additional authentication methods used to interact with your data models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIResourceConfig withAdditionalAuthTypes(BackendAPIAuthType... additionalAuthTypes) {
        if (this.additionalAuthTypes == null) {
            setAdditionalAuthTypes(new java.util.ArrayList<BackendAPIAuthType>(additionalAuthTypes.length));
        }
        for (BackendAPIAuthType ele : additionalAuthTypes) {
            this.additionalAuthTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional authentication methods used to interact with your data models.
     * </p>
     * 
     * @param additionalAuthTypes
     *        Additional authentication methods used to interact with your data models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIResourceConfig withAdditionalAuthTypes(java.util.Collection<BackendAPIAuthType> additionalAuthTypes) {
        setAdditionalAuthTypes(additionalAuthTypes);
        return this;
    }

    /**
     * <p>
     * The API name used to interact with the data model, configured as a part of your Amplify project.
     * </p>
     * 
     * @param apiName
     *        The API name used to interact with the data model, configured as a part of your Amplify project.
     */

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    /**
     * <p>
     * The API name used to interact with the data model, configured as a part of your Amplify project.
     * </p>
     * 
     * @return The API name used to interact with the data model, configured as a part of your Amplify project.
     */

    public String getApiName() {
        return this.apiName;
    }

    /**
     * <p>
     * The API name used to interact with the data model, configured as a part of your Amplify project.
     * </p>
     * 
     * @param apiName
     *        The API name used to interact with the data model, configured as a part of your Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIResourceConfig withApiName(String apiName) {
        setApiName(apiName);
        return this;
    }

    /**
     * <p>
     * The conflict resolution strategy for your data stored in the data models.
     * </p>
     * 
     * @param conflictResolution
     *        The conflict resolution strategy for your data stored in the data models.
     */

    public void setConflictResolution(BackendAPIConflictResolution conflictResolution) {
        this.conflictResolution = conflictResolution;
    }

    /**
     * <p>
     * The conflict resolution strategy for your data stored in the data models.
     * </p>
     * 
     * @return The conflict resolution strategy for your data stored in the data models.
     */

    public BackendAPIConflictResolution getConflictResolution() {
        return this.conflictResolution;
    }

    /**
     * <p>
     * The conflict resolution strategy for your data stored in the data models.
     * </p>
     * 
     * @param conflictResolution
     *        The conflict resolution strategy for your data stored in the data models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIResourceConfig withConflictResolution(BackendAPIConflictResolution conflictResolution) {
        setConflictResolution(conflictResolution);
        return this;
    }

    /**
     * <p>
     * The default authentication type for interacting with the configured data models in your Amplify project.
     * </p>
     * 
     * @param defaultAuthType
     *        The default authentication type for interacting with the configured data models in your Amplify project.
     */

    public void setDefaultAuthType(BackendAPIAuthType defaultAuthType) {
        this.defaultAuthType = defaultAuthType;
    }

    /**
     * <p>
     * The default authentication type for interacting with the configured data models in your Amplify project.
     * </p>
     * 
     * @return The default authentication type for interacting with the configured data models in your Amplify project.
     */

    public BackendAPIAuthType getDefaultAuthType() {
        return this.defaultAuthType;
    }

    /**
     * <p>
     * The default authentication type for interacting with the configured data models in your Amplify project.
     * </p>
     * 
     * @param defaultAuthType
     *        The default authentication type for interacting with the configured data models in your Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIResourceConfig withDefaultAuthType(BackendAPIAuthType defaultAuthType) {
        setDefaultAuthType(defaultAuthType);
        return this;
    }

    /**
     * <p>
     * The service used to provision and interact with the data model.
     * </p>
     * 
     * @param service
     *        The service used to provision and interact with the data model.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The service used to provision and interact with the data model.
     * </p>
     * 
     * @return The service used to provision and interact with the data model.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The service used to provision and interact with the data model.
     * </p>
     * 
     * @param service
     *        The service used to provision and interact with the data model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIResourceConfig withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The definition of the data model in the annotated transform of the GraphQL schema.
     * </p>
     * 
     * @param transformSchema
     *        The definition of the data model in the annotated transform of the GraphQL schema.
     */

    public void setTransformSchema(String transformSchema) {
        this.transformSchema = transformSchema;
    }

    /**
     * <p>
     * The definition of the data model in the annotated transform of the GraphQL schema.
     * </p>
     * 
     * @return The definition of the data model in the annotated transform of the GraphQL schema.
     */

    public String getTransformSchema() {
        return this.transformSchema;
    }

    /**
     * <p>
     * The definition of the data model in the annotated transform of the GraphQL schema.
     * </p>
     * 
     * @param transformSchema
     *        The definition of the data model in the annotated transform of the GraphQL schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIResourceConfig withTransformSchema(String transformSchema) {
        setTransformSchema(transformSchema);
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
        if (getAdditionalAuthTypes() != null)
            sb.append("AdditionalAuthTypes: ").append(getAdditionalAuthTypes()).append(",");
        if (getApiName() != null)
            sb.append("ApiName: ").append(getApiName()).append(",");
        if (getConflictResolution() != null)
            sb.append("ConflictResolution: ").append(getConflictResolution()).append(",");
        if (getDefaultAuthType() != null)
            sb.append("DefaultAuthType: ").append(getDefaultAuthType()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getTransformSchema() != null)
            sb.append("TransformSchema: ").append(getTransformSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackendAPIResourceConfig == false)
            return false;
        BackendAPIResourceConfig other = (BackendAPIResourceConfig) obj;
        if (other.getAdditionalAuthTypes() == null ^ this.getAdditionalAuthTypes() == null)
            return false;
        if (other.getAdditionalAuthTypes() != null && other.getAdditionalAuthTypes().equals(this.getAdditionalAuthTypes()) == false)
            return false;
        if (other.getApiName() == null ^ this.getApiName() == null)
            return false;
        if (other.getApiName() != null && other.getApiName().equals(this.getApiName()) == false)
            return false;
        if (other.getConflictResolution() == null ^ this.getConflictResolution() == null)
            return false;
        if (other.getConflictResolution() != null && other.getConflictResolution().equals(this.getConflictResolution()) == false)
            return false;
        if (other.getDefaultAuthType() == null ^ this.getDefaultAuthType() == null)
            return false;
        if (other.getDefaultAuthType() != null && other.getDefaultAuthType().equals(this.getDefaultAuthType()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getTransformSchema() == null ^ this.getTransformSchema() == null)
            return false;
        if (other.getTransformSchema() != null && other.getTransformSchema().equals(this.getTransformSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalAuthTypes() == null) ? 0 : getAdditionalAuthTypes().hashCode());
        hashCode = prime * hashCode + ((getApiName() == null) ? 0 : getApiName().hashCode());
        hashCode = prime * hashCode + ((getConflictResolution() == null) ? 0 : getConflictResolution().hashCode());
        hashCode = prime * hashCode + ((getDefaultAuthType() == null) ? 0 : getDefaultAuthType().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getTransformSchema() == null) ? 0 : getTransformSchema().hashCode());
        return hashCode;
    }

    @Override
    public BackendAPIResourceConfig clone() {
        try {
            return (BackendAPIResourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.BackendAPIResourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

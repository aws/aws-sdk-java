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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Displays the properties of the data store, including the ID, ARN, name, and the status of the data store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DatastoreProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatastoreProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS-generated ID number for the data store.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The Amazon Resource Name used in the creation of the data store.
     * </p>
     */
    private String datastoreArn;
    /**
     * <p>
     * The user-generated name for the data store.
     * </p>
     */
    private String datastoreName;
    /**
     * <p>
     * The status of the data store.
     * </p>
     */
    private String datastoreStatus;
    /**
     * <p>
     * The time that a data store was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The FHIR version. Only R4 version data is supported.
     * </p>
     */
    private String datastoreTypeVersion;
    /**
     * <p>
     * The AWS endpoint for the data store. Each data store will have it's own endpoint with data store ID in the
     * endpoint URL.
     * </p>
     */
    private String datastoreEndpoint;
    /**
     * <p>
     * The server-side encryption key configuration for a customer provided encryption key (CMK).
     * </p>
     */
    private SseConfiguration sseConfiguration;
    /**
     * <p>
     * The preloaded data configuration for the data store. Only data preloaded from Synthea is supported.
     * </p>
     */
    private PreloadDataConfig preloadDataConfig;
    /**
     * <p>
     * The identity provider that you selected when you created the data store.
     * </p>
     */
    private IdentityProviderConfiguration identityProviderConfiguration;
    /**
     * <p>
     * The error cause for the current data store operation.
     * </p>
     */
    private ErrorCause errorCause;

    /**
     * <p>
     * The AWS-generated ID number for the data store.
     * </p>
     * 
     * @param datastoreId
     *        The AWS-generated ID number for the data store.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The AWS-generated ID number for the data store.
     * </p>
     * 
     * @return The AWS-generated ID number for the data store.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The AWS-generated ID number for the data store.
     * </p>
     * 
     * @param datastoreId
     *        The AWS-generated ID number for the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreProperties withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name used in the creation of the data store.
     * </p>
     * 
     * @param datastoreArn
     *        The Amazon Resource Name used in the creation of the data store.
     */

    public void setDatastoreArn(String datastoreArn) {
        this.datastoreArn = datastoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name used in the creation of the data store.
     * </p>
     * 
     * @return The Amazon Resource Name used in the creation of the data store.
     */

    public String getDatastoreArn() {
        return this.datastoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name used in the creation of the data store.
     * </p>
     * 
     * @param datastoreArn
     *        The Amazon Resource Name used in the creation of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreProperties withDatastoreArn(String datastoreArn) {
        setDatastoreArn(datastoreArn);
        return this;
    }

    /**
     * <p>
     * The user-generated name for the data store.
     * </p>
     * 
     * @param datastoreName
     *        The user-generated name for the data store.
     */

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    /**
     * <p>
     * The user-generated name for the data store.
     * </p>
     * 
     * @return The user-generated name for the data store.
     */

    public String getDatastoreName() {
        return this.datastoreName;
    }

    /**
     * <p>
     * The user-generated name for the data store.
     * </p>
     * 
     * @param datastoreName
     *        The user-generated name for the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreProperties withDatastoreName(String datastoreName) {
        setDatastoreName(datastoreName);
        return this;
    }

    /**
     * <p>
     * The status of the data store.
     * </p>
     * 
     * @param datastoreStatus
     *        The status of the data store.
     * @see DatastoreStatus
     */

    public void setDatastoreStatus(String datastoreStatus) {
        this.datastoreStatus = datastoreStatus;
    }

    /**
     * <p>
     * The status of the data store.
     * </p>
     * 
     * @return The status of the data store.
     * @see DatastoreStatus
     */

    public String getDatastoreStatus() {
        return this.datastoreStatus;
    }

    /**
     * <p>
     * The status of the data store.
     * </p>
     * 
     * @param datastoreStatus
     *        The status of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public DatastoreProperties withDatastoreStatus(String datastoreStatus) {
        setDatastoreStatus(datastoreStatus);
        return this;
    }

    /**
     * <p>
     * The status of the data store.
     * </p>
     * 
     * @param datastoreStatus
     *        The status of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public DatastoreProperties withDatastoreStatus(DatastoreStatus datastoreStatus) {
        this.datastoreStatus = datastoreStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time that a data store was created.
     * </p>
     * 
     * @param createdAt
     *        The time that a data store was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time that a data store was created.
     * </p>
     * 
     * @return The time that a data store was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time that a data store was created.
     * </p>
     * 
     * @param createdAt
     *        The time that a data store was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreProperties withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The FHIR version. Only R4 version data is supported.
     * </p>
     * 
     * @param datastoreTypeVersion
     *        The FHIR version. Only R4 version data is supported.
     * @see FHIRVersion
     */

    public void setDatastoreTypeVersion(String datastoreTypeVersion) {
        this.datastoreTypeVersion = datastoreTypeVersion;
    }

    /**
     * <p>
     * The FHIR version. Only R4 version data is supported.
     * </p>
     * 
     * @return The FHIR version. Only R4 version data is supported.
     * @see FHIRVersion
     */

    public String getDatastoreTypeVersion() {
        return this.datastoreTypeVersion;
    }

    /**
     * <p>
     * The FHIR version. Only R4 version data is supported.
     * </p>
     * 
     * @param datastoreTypeVersion
     *        The FHIR version. Only R4 version data is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FHIRVersion
     */

    public DatastoreProperties withDatastoreTypeVersion(String datastoreTypeVersion) {
        setDatastoreTypeVersion(datastoreTypeVersion);
        return this;
    }

    /**
     * <p>
     * The FHIR version. Only R4 version data is supported.
     * </p>
     * 
     * @param datastoreTypeVersion
     *        The FHIR version. Only R4 version data is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FHIRVersion
     */

    public DatastoreProperties withDatastoreTypeVersion(FHIRVersion datastoreTypeVersion) {
        this.datastoreTypeVersion = datastoreTypeVersion.toString();
        return this;
    }

    /**
     * <p>
     * The AWS endpoint for the data store. Each data store will have it's own endpoint with data store ID in the
     * endpoint URL.
     * </p>
     * 
     * @param datastoreEndpoint
     *        The AWS endpoint for the data store. Each data store will have it's own endpoint with data store ID in the
     *        endpoint URL.
     */

    public void setDatastoreEndpoint(String datastoreEndpoint) {
        this.datastoreEndpoint = datastoreEndpoint;
    }

    /**
     * <p>
     * The AWS endpoint for the data store. Each data store will have it's own endpoint with data store ID in the
     * endpoint URL.
     * </p>
     * 
     * @return The AWS endpoint for the data store. Each data store will have it's own endpoint with data store ID in
     *         the endpoint URL.
     */

    public String getDatastoreEndpoint() {
        return this.datastoreEndpoint;
    }

    /**
     * <p>
     * The AWS endpoint for the data store. Each data store will have it's own endpoint with data store ID in the
     * endpoint URL.
     * </p>
     * 
     * @param datastoreEndpoint
     *        The AWS endpoint for the data store. Each data store will have it's own endpoint with data store ID in the
     *        endpoint URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreProperties withDatastoreEndpoint(String datastoreEndpoint) {
        setDatastoreEndpoint(datastoreEndpoint);
        return this;
    }

    /**
     * <p>
     * The server-side encryption key configuration for a customer provided encryption key (CMK).
     * </p>
     * 
     * @param sseConfiguration
     *        The server-side encryption key configuration for a customer provided encryption key (CMK).
     */

    public void setSseConfiguration(SseConfiguration sseConfiguration) {
        this.sseConfiguration = sseConfiguration;
    }

    /**
     * <p>
     * The server-side encryption key configuration for a customer provided encryption key (CMK).
     * </p>
     * 
     * @return The server-side encryption key configuration for a customer provided encryption key (CMK).
     */

    public SseConfiguration getSseConfiguration() {
        return this.sseConfiguration;
    }

    /**
     * <p>
     * The server-side encryption key configuration for a customer provided encryption key (CMK).
     * </p>
     * 
     * @param sseConfiguration
     *        The server-side encryption key configuration for a customer provided encryption key (CMK).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreProperties withSseConfiguration(SseConfiguration sseConfiguration) {
        setSseConfiguration(sseConfiguration);
        return this;
    }

    /**
     * <p>
     * The preloaded data configuration for the data store. Only data preloaded from Synthea is supported.
     * </p>
     * 
     * @param preloadDataConfig
     *        The preloaded data configuration for the data store. Only data preloaded from Synthea is supported.
     */

    public void setPreloadDataConfig(PreloadDataConfig preloadDataConfig) {
        this.preloadDataConfig = preloadDataConfig;
    }

    /**
     * <p>
     * The preloaded data configuration for the data store. Only data preloaded from Synthea is supported.
     * </p>
     * 
     * @return The preloaded data configuration for the data store. Only data preloaded from Synthea is supported.
     */

    public PreloadDataConfig getPreloadDataConfig() {
        return this.preloadDataConfig;
    }

    /**
     * <p>
     * The preloaded data configuration for the data store. Only data preloaded from Synthea is supported.
     * </p>
     * 
     * @param preloadDataConfig
     *        The preloaded data configuration for the data store. Only data preloaded from Synthea is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreProperties withPreloadDataConfig(PreloadDataConfig preloadDataConfig) {
        setPreloadDataConfig(preloadDataConfig);
        return this;
    }

    /**
     * <p>
     * The identity provider that you selected when you created the data store.
     * </p>
     * 
     * @param identityProviderConfiguration
     *        The identity provider that you selected when you created the data store.
     */

    public void setIdentityProviderConfiguration(IdentityProviderConfiguration identityProviderConfiguration) {
        this.identityProviderConfiguration = identityProviderConfiguration;
    }

    /**
     * <p>
     * The identity provider that you selected when you created the data store.
     * </p>
     * 
     * @return The identity provider that you selected when you created the data store.
     */

    public IdentityProviderConfiguration getIdentityProviderConfiguration() {
        return this.identityProviderConfiguration;
    }

    /**
     * <p>
     * The identity provider that you selected when you created the data store.
     * </p>
     * 
     * @param identityProviderConfiguration
     *        The identity provider that you selected when you created the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreProperties withIdentityProviderConfiguration(IdentityProviderConfiguration identityProviderConfiguration) {
        setIdentityProviderConfiguration(identityProviderConfiguration);
        return this;
    }

    /**
     * <p>
     * The error cause for the current data store operation.
     * </p>
     * 
     * @param errorCause
     *        The error cause for the current data store operation.
     */

    public void setErrorCause(ErrorCause errorCause) {
        this.errorCause = errorCause;
    }

    /**
     * <p>
     * The error cause for the current data store operation.
     * </p>
     * 
     * @return The error cause for the current data store operation.
     */

    public ErrorCause getErrorCause() {
        return this.errorCause;
    }

    /**
     * <p>
     * The error cause for the current data store operation.
     * </p>
     * 
     * @param errorCause
     *        The error cause for the current data store operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreProperties withErrorCause(ErrorCause errorCause) {
        setErrorCause(errorCause);
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
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getDatastoreArn() != null)
            sb.append("DatastoreArn: ").append(getDatastoreArn()).append(",");
        if (getDatastoreName() != null)
            sb.append("DatastoreName: ").append(getDatastoreName()).append(",");
        if (getDatastoreStatus() != null)
            sb.append("DatastoreStatus: ").append(getDatastoreStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDatastoreTypeVersion() != null)
            sb.append("DatastoreTypeVersion: ").append(getDatastoreTypeVersion()).append(",");
        if (getDatastoreEndpoint() != null)
            sb.append("DatastoreEndpoint: ").append(getDatastoreEndpoint()).append(",");
        if (getSseConfiguration() != null)
            sb.append("SseConfiguration: ").append(getSseConfiguration()).append(",");
        if (getPreloadDataConfig() != null)
            sb.append("PreloadDataConfig: ").append(getPreloadDataConfig()).append(",");
        if (getIdentityProviderConfiguration() != null)
            sb.append("IdentityProviderConfiguration: ").append(getIdentityProviderConfiguration()).append(",");
        if (getErrorCause() != null)
            sb.append("ErrorCause: ").append(getErrorCause());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatastoreProperties == false)
            return false;
        DatastoreProperties other = (DatastoreProperties) obj;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getDatastoreArn() == null ^ this.getDatastoreArn() == null)
            return false;
        if (other.getDatastoreArn() != null && other.getDatastoreArn().equals(this.getDatastoreArn()) == false)
            return false;
        if (other.getDatastoreName() == null ^ this.getDatastoreName() == null)
            return false;
        if (other.getDatastoreName() != null && other.getDatastoreName().equals(this.getDatastoreName()) == false)
            return false;
        if (other.getDatastoreStatus() == null ^ this.getDatastoreStatus() == null)
            return false;
        if (other.getDatastoreStatus() != null && other.getDatastoreStatus().equals(this.getDatastoreStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDatastoreTypeVersion() == null ^ this.getDatastoreTypeVersion() == null)
            return false;
        if (other.getDatastoreTypeVersion() != null && other.getDatastoreTypeVersion().equals(this.getDatastoreTypeVersion()) == false)
            return false;
        if (other.getDatastoreEndpoint() == null ^ this.getDatastoreEndpoint() == null)
            return false;
        if (other.getDatastoreEndpoint() != null && other.getDatastoreEndpoint().equals(this.getDatastoreEndpoint()) == false)
            return false;
        if (other.getSseConfiguration() == null ^ this.getSseConfiguration() == null)
            return false;
        if (other.getSseConfiguration() != null && other.getSseConfiguration().equals(this.getSseConfiguration()) == false)
            return false;
        if (other.getPreloadDataConfig() == null ^ this.getPreloadDataConfig() == null)
            return false;
        if (other.getPreloadDataConfig() != null && other.getPreloadDataConfig().equals(this.getPreloadDataConfig()) == false)
            return false;
        if (other.getIdentityProviderConfiguration() == null ^ this.getIdentityProviderConfiguration() == null)
            return false;
        if (other.getIdentityProviderConfiguration() != null
                && other.getIdentityProviderConfiguration().equals(this.getIdentityProviderConfiguration()) == false)
            return false;
        if (other.getErrorCause() == null ^ this.getErrorCause() == null)
            return false;
        if (other.getErrorCause() != null && other.getErrorCause().equals(this.getErrorCause()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getDatastoreArn() == null) ? 0 : getDatastoreArn().hashCode());
        hashCode = prime * hashCode + ((getDatastoreName() == null) ? 0 : getDatastoreName().hashCode());
        hashCode = prime * hashCode + ((getDatastoreStatus() == null) ? 0 : getDatastoreStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDatastoreTypeVersion() == null) ? 0 : getDatastoreTypeVersion().hashCode());
        hashCode = prime * hashCode + ((getDatastoreEndpoint() == null) ? 0 : getDatastoreEndpoint().hashCode());
        hashCode = prime * hashCode + ((getSseConfiguration() == null) ? 0 : getSseConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPreloadDataConfig() == null) ? 0 : getPreloadDataConfig().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderConfiguration() == null) ? 0 : getIdentityProviderConfiguration().hashCode());
        hashCode = prime * hashCode + ((getErrorCause() == null) ? 0 : getErrorCause().hashCode());
        return hashCode;
    }

    @Override
    public DatastoreProperties clone() {
        try {
            return (DatastoreProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.healthlake.model.transform.DatastorePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

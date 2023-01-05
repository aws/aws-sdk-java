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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a security configuration for OpenSearch Serverless.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/SecurityConfigDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityConfigDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the security configuration.
     * </p>
     */
    private String configVersion;
    /**
     * <p>
     * The date the configuration was created.
     * </p>
     */
    private Long createdDate;
    /**
     * <p>
     * The description of the security configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the security configuration.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The timestamp of when the configuration was last modified.
     * </p>
     */
    private Long lastModifiedDate;
    /**
     * <p>
     * SAML options for the security configuration in the form of a key-value map.
     * </p>
     */
    private SamlConfigOptions samlOptions;
    /**
     * <p>
     * The type of security configuration.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The version of the security configuration.
     * </p>
     * 
     * @param configVersion
     *        The version of the security configuration.
     */

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
    }

    /**
     * <p>
     * The version of the security configuration.
     * </p>
     * 
     * @return The version of the security configuration.
     */

    public String getConfigVersion() {
        return this.configVersion;
    }

    /**
     * <p>
     * The version of the security configuration.
     * </p>
     * 
     * @param configVersion
     *        The version of the security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityConfigDetail withConfigVersion(String configVersion) {
        setConfigVersion(configVersion);
        return this;
    }

    /**
     * <p>
     * The date the configuration was created.
     * </p>
     * 
     * @param createdDate
     *        The date the configuration was created.
     */

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date the configuration was created.
     * </p>
     * 
     * @return The date the configuration was created.
     */

    public Long getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date the configuration was created.
     * </p>
     * 
     * @param createdDate
     *        The date the configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityConfigDetail withCreatedDate(Long createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The description of the security configuration.
     * </p>
     * 
     * @param description
     *        The description of the security configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the security configuration.
     * </p>
     * 
     * @return The description of the security configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the security configuration.
     * </p>
     * 
     * @param description
     *        The description of the security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityConfigDetail withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the security configuration.
     * </p>
     * 
     * @param id
     *        The unique identifier of the security configuration.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the security configuration.
     * </p>
     * 
     * @return The unique identifier of the security configuration.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the security configuration.
     * </p>
     * 
     * @param id
     *        The unique identifier of the security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityConfigDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the configuration was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The timestamp of when the configuration was last modified.
     */

    public void setLastModifiedDate(Long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The timestamp of when the configuration was last modified.
     * </p>
     * 
     * @return The timestamp of when the configuration was last modified.
     */

    public Long getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The timestamp of when the configuration was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The timestamp of when the configuration was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityConfigDetail withLastModifiedDate(Long lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * SAML options for the security configuration in the form of a key-value map.
     * </p>
     * 
     * @param samlOptions
     *        SAML options for the security configuration in the form of a key-value map.
     */

    public void setSamlOptions(SamlConfigOptions samlOptions) {
        this.samlOptions = samlOptions;
    }

    /**
     * <p>
     * SAML options for the security configuration in the form of a key-value map.
     * </p>
     * 
     * @return SAML options for the security configuration in the form of a key-value map.
     */

    public SamlConfigOptions getSamlOptions() {
        return this.samlOptions;
    }

    /**
     * <p>
     * SAML options for the security configuration in the form of a key-value map.
     * </p>
     * 
     * @param samlOptions
     *        SAML options for the security configuration in the form of a key-value map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityConfigDetail withSamlOptions(SamlConfigOptions samlOptions) {
        setSamlOptions(samlOptions);
        return this;
    }

    /**
     * <p>
     * The type of security configuration.
     * </p>
     * 
     * @param type
     *        The type of security configuration.
     * @see SecurityConfigType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of security configuration.
     * </p>
     * 
     * @return The type of security configuration.
     * @see SecurityConfigType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of security configuration.
     * </p>
     * 
     * @param type
     *        The type of security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityConfigType
     */

    public SecurityConfigDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of security configuration.
     * </p>
     * 
     * @param type
     *        The type of security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityConfigType
     */

    public SecurityConfigDetail withType(SecurityConfigType type) {
        this.type = type.toString();
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
        if (getConfigVersion() != null)
            sb.append("ConfigVersion: ").append(getConfigVersion()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getSamlOptions() != null)
            sb.append("SamlOptions: ").append(getSamlOptions()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityConfigDetail == false)
            return false;
        SecurityConfigDetail other = (SecurityConfigDetail) obj;
        if (other.getConfigVersion() == null ^ this.getConfigVersion() == null)
            return false;
        if (other.getConfigVersion() != null && other.getConfigVersion().equals(this.getConfigVersion()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getSamlOptions() == null ^ this.getSamlOptions() == null)
            return false;
        if (other.getSamlOptions() != null && other.getSamlOptions().equals(this.getSamlOptions()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigVersion() == null) ? 0 : getConfigVersion().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getSamlOptions() == null) ? 0 : getSamlOptions().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SecurityConfigDetail clone() {
        try {
            return (SecurityConfigDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.SecurityConfigDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

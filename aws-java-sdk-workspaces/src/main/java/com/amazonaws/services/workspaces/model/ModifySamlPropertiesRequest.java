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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifySamlProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySamlPropertiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The directory identifier for which you want to configure SAML properties.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The properties for configuring SAML 2.0 authentication.
     * </p>
     */
    private SamlProperties samlProperties;
    /**
     * <p>
     * The SAML properties to delete as part of your request.
     * </p>
     * <p>
     * Specify one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAML_PROPERTIES_USER_ACCESS_URL</code> to delete the user access URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME</code> to delete the relay state parameter name.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> propertiesToDelete;

    /**
     * <p>
     * The directory identifier for which you want to configure SAML properties.
     * </p>
     * 
     * @param resourceId
     *        The directory identifier for which you want to configure SAML properties.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The directory identifier for which you want to configure SAML properties.
     * </p>
     * 
     * @return The directory identifier for which you want to configure SAML properties.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The directory identifier for which you want to configure SAML properties.
     * </p>
     * 
     * @param resourceId
     *        The directory identifier for which you want to configure SAML properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySamlPropertiesRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The properties for configuring SAML 2.0 authentication.
     * </p>
     * 
     * @param samlProperties
     *        The properties for configuring SAML 2.0 authentication.
     */

    public void setSamlProperties(SamlProperties samlProperties) {
        this.samlProperties = samlProperties;
    }

    /**
     * <p>
     * The properties for configuring SAML 2.0 authentication.
     * </p>
     * 
     * @return The properties for configuring SAML 2.0 authentication.
     */

    public SamlProperties getSamlProperties() {
        return this.samlProperties;
    }

    /**
     * <p>
     * The properties for configuring SAML 2.0 authentication.
     * </p>
     * 
     * @param samlProperties
     *        The properties for configuring SAML 2.0 authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySamlPropertiesRequest withSamlProperties(SamlProperties samlProperties) {
        setSamlProperties(samlProperties);
        return this;
    }

    /**
     * <p>
     * The SAML properties to delete as part of your request.
     * </p>
     * <p>
     * Specify one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAML_PROPERTIES_USER_ACCESS_URL</code> to delete the user access URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME</code> to delete the relay state parameter name.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The SAML properties to delete as part of your request.</p>
     *         <p>
     *         Specify one of the following options:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SAML_PROPERTIES_USER_ACCESS_URL</code> to delete the user access URL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME</code> to delete the relay state parameter name.
     *         </p>
     *         </li>
     * @see DeletableSamlProperty
     */

    public java.util.List<String> getPropertiesToDelete() {
        if (propertiesToDelete == null) {
            propertiesToDelete = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return propertiesToDelete;
    }

    /**
     * <p>
     * The SAML properties to delete as part of your request.
     * </p>
     * <p>
     * Specify one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAML_PROPERTIES_USER_ACCESS_URL</code> to delete the user access URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME</code> to delete the relay state parameter name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param propertiesToDelete
     *        The SAML properties to delete as part of your request.</p>
     *        <p>
     *        Specify one of the following options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SAML_PROPERTIES_USER_ACCESS_URL</code> to delete the user access URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME</code> to delete the relay state parameter name.
     *        </p>
     *        </li>
     * @see DeletableSamlProperty
     */

    public void setPropertiesToDelete(java.util.Collection<String> propertiesToDelete) {
        if (propertiesToDelete == null) {
            this.propertiesToDelete = null;
            return;
        }

        this.propertiesToDelete = new com.amazonaws.internal.SdkInternalList<String>(propertiesToDelete);
    }

    /**
     * <p>
     * The SAML properties to delete as part of your request.
     * </p>
     * <p>
     * Specify one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAML_PROPERTIES_USER_ACCESS_URL</code> to delete the user access URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME</code> to delete the relay state parameter name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertiesToDelete(java.util.Collection)} or {@link #withPropertiesToDelete(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param propertiesToDelete
     *        The SAML properties to delete as part of your request.</p>
     *        <p>
     *        Specify one of the following options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SAML_PROPERTIES_USER_ACCESS_URL</code> to delete the user access URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME</code> to delete the relay state parameter name.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeletableSamlProperty
     */

    public ModifySamlPropertiesRequest withPropertiesToDelete(String... propertiesToDelete) {
        if (this.propertiesToDelete == null) {
            setPropertiesToDelete(new com.amazonaws.internal.SdkInternalList<String>(propertiesToDelete.length));
        }
        for (String ele : propertiesToDelete) {
            this.propertiesToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The SAML properties to delete as part of your request.
     * </p>
     * <p>
     * Specify one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAML_PROPERTIES_USER_ACCESS_URL</code> to delete the user access URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME</code> to delete the relay state parameter name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param propertiesToDelete
     *        The SAML properties to delete as part of your request.</p>
     *        <p>
     *        Specify one of the following options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SAML_PROPERTIES_USER_ACCESS_URL</code> to delete the user access URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME</code> to delete the relay state parameter name.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeletableSamlProperty
     */

    public ModifySamlPropertiesRequest withPropertiesToDelete(java.util.Collection<String> propertiesToDelete) {
        setPropertiesToDelete(propertiesToDelete);
        return this;
    }

    /**
     * <p>
     * The SAML properties to delete as part of your request.
     * </p>
     * <p>
     * Specify one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAML_PROPERTIES_USER_ACCESS_URL</code> to delete the user access URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME</code> to delete the relay state parameter name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param propertiesToDelete
     *        The SAML properties to delete as part of your request.</p>
     *        <p>
     *        Specify one of the following options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SAML_PROPERTIES_USER_ACCESS_URL</code> to delete the user access URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME</code> to delete the relay state parameter name.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeletableSamlProperty
     */

    public ModifySamlPropertiesRequest withPropertiesToDelete(DeletableSamlProperty... propertiesToDelete) {
        com.amazonaws.internal.SdkInternalList<String> propertiesToDeleteCopy = new com.amazonaws.internal.SdkInternalList<String>(propertiesToDelete.length);
        for (DeletableSamlProperty value : propertiesToDelete) {
            propertiesToDeleteCopy.add(value.toString());
        }
        if (getPropertiesToDelete() == null) {
            setPropertiesToDelete(propertiesToDeleteCopy);
        } else {
            getPropertiesToDelete().addAll(propertiesToDeleteCopy);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getSamlProperties() != null)
            sb.append("SamlProperties: ").append(getSamlProperties()).append(",");
        if (getPropertiesToDelete() != null)
            sb.append("PropertiesToDelete: ").append(getPropertiesToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySamlPropertiesRequest == false)
            return false;
        ModifySamlPropertiesRequest other = (ModifySamlPropertiesRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getSamlProperties() == null ^ this.getSamlProperties() == null)
            return false;
        if (other.getSamlProperties() != null && other.getSamlProperties().equals(this.getSamlProperties()) == false)
            return false;
        if (other.getPropertiesToDelete() == null ^ this.getPropertiesToDelete() == null)
            return false;
        if (other.getPropertiesToDelete() != null && other.getPropertiesToDelete().equals(this.getPropertiesToDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getSamlProperties() == null) ? 0 : getSamlProperties().hashCode());
        hashCode = prime * hashCode + ((getPropertiesToDelete() == null) ? 0 : getPropertiesToDelete().hashCode());
        return hashCode;
    }

    @Override
    public ModifySamlPropertiesRequest clone() {
        return (ModifySamlPropertiesRequest) super.clone();
    }

}

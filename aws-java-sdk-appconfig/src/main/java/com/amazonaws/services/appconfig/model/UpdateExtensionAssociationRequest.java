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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateExtensionAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateExtensionAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID for the association.
     * </p>
     */
    private String extensionAssociationId;
    /**
     * <p>
     * The parameter names and values defined in the extension.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The system-generated ID for the association.
     * </p>
     * 
     * @param extensionAssociationId
     *        The system-generated ID for the association.
     */

    public void setExtensionAssociationId(String extensionAssociationId) {
        this.extensionAssociationId = extensionAssociationId;
    }

    /**
     * <p>
     * The system-generated ID for the association.
     * </p>
     * 
     * @return The system-generated ID for the association.
     */

    public String getExtensionAssociationId() {
        return this.extensionAssociationId;
    }

    /**
     * <p>
     * The system-generated ID for the association.
     * </p>
     * 
     * @param extensionAssociationId
     *        The system-generated ID for the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionAssociationRequest withExtensionAssociationId(String extensionAssociationId) {
        setExtensionAssociationId(extensionAssociationId);
        return this;
    }

    /**
     * <p>
     * The parameter names and values defined in the extension.
     * </p>
     * 
     * @return The parameter names and values defined in the extension.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameter names and values defined in the extension.
     * </p>
     * 
     * @param parameters
     *        The parameter names and values defined in the extension.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameter names and values defined in the extension.
     * </p>
     * 
     * @param parameters
     *        The parameter names and values defined in the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionAssociationRequest withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see UpdateExtensionAssociationRequest#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionAssociationRequest addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionAssociationRequest clearParametersEntries() {
        this.parameters = null;
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
        if (getExtensionAssociationId() != null)
            sb.append("ExtensionAssociationId: ").append(getExtensionAssociationId()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateExtensionAssociationRequest == false)
            return false;
        UpdateExtensionAssociationRequest other = (UpdateExtensionAssociationRequest) obj;
        if (other.getExtensionAssociationId() == null ^ this.getExtensionAssociationId() == null)
            return false;
        if (other.getExtensionAssociationId() != null && other.getExtensionAssociationId().equals(this.getExtensionAssociationId()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExtensionAssociationId() == null) ? 0 : getExtensionAssociationId().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public UpdateExtensionAssociationRequest clone() {
        return (UpdateExtensionAssociationRequest) super.clone();
    }

}

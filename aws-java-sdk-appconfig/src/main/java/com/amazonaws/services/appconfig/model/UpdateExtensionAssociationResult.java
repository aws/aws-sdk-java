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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateExtensionAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateExtensionAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID for the association.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN of the extension defined in the association.
     * </p>
     */
    private String extensionArn;
    /**
     * <p>
     * The ARNs of applications, configuration profiles, or environments defined in the association.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The system-generated Amazon Resource Name (ARN) for the extension.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The parameter names and values defined in the association.
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * The version number for the extension defined in the association.
     * </p>
     */
    private Integer extensionVersionNumber;

    /**
     * <p>
     * The system-generated ID for the association.
     * </p>
     * 
     * @param id
     *        The system-generated ID for the association.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The system-generated ID for the association.
     * </p>
     * 
     * @return The system-generated ID for the association.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The system-generated ID for the association.
     * </p>
     * 
     * @param id
     *        The system-generated ID for the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionAssociationResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN of the extension defined in the association.
     * </p>
     * 
     * @param extensionArn
     *        The ARN of the extension defined in the association.
     */

    public void setExtensionArn(String extensionArn) {
        this.extensionArn = extensionArn;
    }

    /**
     * <p>
     * The ARN of the extension defined in the association.
     * </p>
     * 
     * @return The ARN of the extension defined in the association.
     */

    public String getExtensionArn() {
        return this.extensionArn;
    }

    /**
     * <p>
     * The ARN of the extension defined in the association.
     * </p>
     * 
     * @param extensionArn
     *        The ARN of the extension defined in the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionAssociationResult withExtensionArn(String extensionArn) {
        setExtensionArn(extensionArn);
        return this;
    }

    /**
     * <p>
     * The ARNs of applications, configuration profiles, or environments defined in the association.
     * </p>
     * 
     * @param resourceArn
     *        The ARNs of applications, configuration profiles, or environments defined in the association.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARNs of applications, configuration profiles, or environments defined in the association.
     * </p>
     * 
     * @return The ARNs of applications, configuration profiles, or environments defined in the association.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARNs of applications, configuration profiles, or environments defined in the association.
     * </p>
     * 
     * @param resourceArn
     *        The ARNs of applications, configuration profiles, or environments defined in the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionAssociationResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The system-generated Amazon Resource Name (ARN) for the extension.
     * </p>
     * 
     * @param arn
     *        The system-generated Amazon Resource Name (ARN) for the extension.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The system-generated Amazon Resource Name (ARN) for the extension.
     * </p>
     * 
     * @return The system-generated Amazon Resource Name (ARN) for the extension.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The system-generated Amazon Resource Name (ARN) for the extension.
     * </p>
     * 
     * @param arn
     *        The system-generated Amazon Resource Name (ARN) for the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionAssociationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The parameter names and values defined in the association.
     * </p>
     * 
     * @return The parameter names and values defined in the association.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameter names and values defined in the association.
     * </p>
     * 
     * @param parameters
     *        The parameter names and values defined in the association.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameter names and values defined in the association.
     * </p>
     * 
     * @param parameters
     *        The parameter names and values defined in the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionAssociationResult withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see UpdateExtensionAssociationResult#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionAssociationResult addParametersEntry(String key, String value) {
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

    public UpdateExtensionAssociationResult clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The version number for the extension defined in the association.
     * </p>
     * 
     * @param extensionVersionNumber
     *        The version number for the extension defined in the association.
     */

    public void setExtensionVersionNumber(Integer extensionVersionNumber) {
        this.extensionVersionNumber = extensionVersionNumber;
    }

    /**
     * <p>
     * The version number for the extension defined in the association.
     * </p>
     * 
     * @return The version number for the extension defined in the association.
     */

    public Integer getExtensionVersionNumber() {
        return this.extensionVersionNumber;
    }

    /**
     * <p>
     * The version number for the extension defined in the association.
     * </p>
     * 
     * @param extensionVersionNumber
     *        The version number for the extension defined in the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionAssociationResult withExtensionVersionNumber(Integer extensionVersionNumber) {
        setExtensionVersionNumber(extensionVersionNumber);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getExtensionArn() != null)
            sb.append("ExtensionArn: ").append(getExtensionArn()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getExtensionVersionNumber() != null)
            sb.append("ExtensionVersionNumber: ").append(getExtensionVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateExtensionAssociationResult == false)
            return false;
        UpdateExtensionAssociationResult other = (UpdateExtensionAssociationResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getExtensionArn() == null ^ this.getExtensionArn() == null)
            return false;
        if (other.getExtensionArn() != null && other.getExtensionArn().equals(this.getExtensionArn()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getExtensionVersionNumber() == null ^ this.getExtensionVersionNumber() == null)
            return false;
        if (other.getExtensionVersionNumber() != null && other.getExtensionVersionNumber().equals(this.getExtensionVersionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getExtensionArn() == null) ? 0 : getExtensionArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getExtensionVersionNumber() == null) ? 0 : getExtensionVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public UpdateExtensionAssociationResult clone() {
        try {
            return (UpdateExtensionAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

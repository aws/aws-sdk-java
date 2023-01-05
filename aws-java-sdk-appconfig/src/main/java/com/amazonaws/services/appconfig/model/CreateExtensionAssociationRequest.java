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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateExtensionAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExtensionAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     */
    private String extensionIdentifier;
    /**
     * <p>
     * The version number of the extension. If not specified, AppConfig uses the maximum version of the extension.
     * </p>
     */
    private Integer extensionVersionNumber;
    /**
     * <p>
     * The ARN of an application, configuration profile, or environment.
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * The parameter names and values defined in the extensions. Extension parameters marked <code>Required</code> must
     * be entered for this field.
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * Adds one or more tags for the specified extension association. Tags are metadata that help you categorize
     * resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an
     * optional value, both of which you define.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @param extensionIdentifier
     *        The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     */

    public void setExtensionIdentifier(String extensionIdentifier) {
        this.extensionIdentifier = extensionIdentifier;
    }

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @return The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     */

    public String getExtensionIdentifier() {
        return this.extensionIdentifier;
    }

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @param extensionIdentifier
     *        The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionAssociationRequest withExtensionIdentifier(String extensionIdentifier) {
        setExtensionIdentifier(extensionIdentifier);
        return this;
    }

    /**
     * <p>
     * The version number of the extension. If not specified, AppConfig uses the maximum version of the extension.
     * </p>
     * 
     * @param extensionVersionNumber
     *        The version number of the extension. If not specified, AppConfig uses the maximum version of the
     *        extension.
     */

    public void setExtensionVersionNumber(Integer extensionVersionNumber) {
        this.extensionVersionNumber = extensionVersionNumber;
    }

    /**
     * <p>
     * The version number of the extension. If not specified, AppConfig uses the maximum version of the extension.
     * </p>
     * 
     * @return The version number of the extension. If not specified, AppConfig uses the maximum version of the
     *         extension.
     */

    public Integer getExtensionVersionNumber() {
        return this.extensionVersionNumber;
    }

    /**
     * <p>
     * The version number of the extension. If not specified, AppConfig uses the maximum version of the extension.
     * </p>
     * 
     * @param extensionVersionNumber
     *        The version number of the extension. If not specified, AppConfig uses the maximum version of the
     *        extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionAssociationRequest withExtensionVersionNumber(Integer extensionVersionNumber) {
        setExtensionVersionNumber(extensionVersionNumber);
        return this;
    }

    /**
     * <p>
     * The ARN of an application, configuration profile, or environment.
     * </p>
     * 
     * @param resourceIdentifier
     *        The ARN of an application, configuration profile, or environment.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The ARN of an application, configuration profile, or environment.
     * </p>
     * 
     * @return The ARN of an application, configuration profile, or environment.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The ARN of an application, configuration profile, or environment.
     * </p>
     * 
     * @param resourceIdentifier
     *        The ARN of an application, configuration profile, or environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionAssociationRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The parameter names and values defined in the extensions. Extension parameters marked <code>Required</code> must
     * be entered for this field.
     * </p>
     * 
     * @return The parameter names and values defined in the extensions. Extension parameters marked
     *         <code>Required</code> must be entered for this field.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameter names and values defined in the extensions. Extension parameters marked <code>Required</code> must
     * be entered for this field.
     * </p>
     * 
     * @param parameters
     *        The parameter names and values defined in the extensions. Extension parameters marked
     *        <code>Required</code> must be entered for this field.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameter names and values defined in the extensions. Extension parameters marked <code>Required</code> must
     * be entered for this field.
     * </p>
     * 
     * @param parameters
     *        The parameter names and values defined in the extensions. Extension parameters marked
     *        <code>Required</code> must be entered for this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionAssociationRequest withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see CreateExtensionAssociationRequest#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionAssociationRequest addParametersEntry(String key, String value) {
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

    public CreateExtensionAssociationRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * Adds one or more tags for the specified extension association. Tags are metadata that help you categorize
     * resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an
     * optional value, both of which you define.
     * </p>
     * 
     * @return Adds one or more tags for the specified extension association. Tags are metadata that help you categorize
     *         resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key
     *         and an optional value, both of which you define.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Adds one or more tags for the specified extension association. Tags are metadata that help you categorize
     * resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an
     * optional value, both of which you define.
     * </p>
     * 
     * @param tags
     *        Adds one or more tags for the specified extension association. Tags are metadata that help you categorize
     *        resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key
     *        and an optional value, both of which you define.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Adds one or more tags for the specified extension association. Tags are metadata that help you categorize
     * resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an
     * optional value, both of which you define.
     * </p>
     * 
     * @param tags
     *        Adds one or more tags for the specified extension association. Tags are metadata that help you categorize
     *        resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key
     *        and an optional value, both of which you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionAssociationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateExtensionAssociationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionAssociationRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionAssociationRequest clearTagsEntries() {
        this.tags = null;
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
        if (getExtensionIdentifier() != null)
            sb.append("ExtensionIdentifier: ").append(getExtensionIdentifier()).append(",");
        if (getExtensionVersionNumber() != null)
            sb.append("ExtensionVersionNumber: ").append(getExtensionVersionNumber()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExtensionAssociationRequest == false)
            return false;
        CreateExtensionAssociationRequest other = (CreateExtensionAssociationRequest) obj;
        if (other.getExtensionIdentifier() == null ^ this.getExtensionIdentifier() == null)
            return false;
        if (other.getExtensionIdentifier() != null && other.getExtensionIdentifier().equals(this.getExtensionIdentifier()) == false)
            return false;
        if (other.getExtensionVersionNumber() == null ^ this.getExtensionVersionNumber() == null)
            return false;
        if (other.getExtensionVersionNumber() != null && other.getExtensionVersionNumber().equals(this.getExtensionVersionNumber()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExtensionIdentifier() == null) ? 0 : getExtensionIdentifier().hashCode());
        hashCode = prime * hashCode + ((getExtensionVersionNumber() == null) ? 0 : getExtensionVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateExtensionAssociationRequest clone() {
        return (CreateExtensionAssociationRequest) super.clone();
    }

}

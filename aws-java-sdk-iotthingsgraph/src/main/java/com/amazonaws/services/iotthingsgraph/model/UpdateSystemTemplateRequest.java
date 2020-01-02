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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UpdateSystemTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSystemTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the system to be updated.
     * </p>
     * <p>
     * The ID should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME</code>
     * </p>
     */
    private String id;
    /**
     * <p>
     * The <code>DefinitionDocument</code> that contains the updated system definition.
     * </p>
     */
    private DefinitionDocument definition;
    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * <p>
     * If no value is specified, the latest version is used by default.
     * </p>
     */
    private Long compatibleNamespaceVersion;

    /**
     * <p>
     * The ID of the system to be updated.
     * </p>
     * <p>
     * The ID should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME</code>
     * </p>
     * 
     * @param id
     *        The ID of the system to be updated.</p>
     *        <p>
     *        The ID should be in the following format.
     *        </p>
     *        <p>
     *        <code>urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME</code>
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the system to be updated.
     * </p>
     * <p>
     * The ID should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME</code>
     * </p>
     * 
     * @return The ID of the system to be updated.</p>
     *         <p>
     *         The ID should be in the following format.
     *         </p>
     *         <p>
     *         <code>urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME</code>
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the system to be updated.
     * </p>
     * <p>
     * The ID should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME</code>
     * </p>
     * 
     * @param id
     *        The ID of the system to be updated.</p>
     *        <p>
     *        The ID should be in the following format.
     *        </p>
     *        <p>
     *        <code>urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSystemTemplateRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The <code>DefinitionDocument</code> that contains the updated system definition.
     * </p>
     * 
     * @param definition
     *        The <code>DefinitionDocument</code> that contains the updated system definition.
     */

    public void setDefinition(DefinitionDocument definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The <code>DefinitionDocument</code> that contains the updated system definition.
     * </p>
     * 
     * @return The <code>DefinitionDocument</code> that contains the updated system definition.
     */

    public DefinitionDocument getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The <code>DefinitionDocument</code> that contains the updated system definition.
     * </p>
     * 
     * @param definition
     *        The <code>DefinitionDocument</code> that contains the updated system definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSystemTemplateRequest withDefinition(DefinitionDocument definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * <p>
     * If no value is specified, the latest version is used by default.
     * </p>
     * 
     * @param compatibleNamespaceVersion
     *        The version of the user's namespace. Defaults to the latest version of the user's namespace.</p>
     *        <p>
     *        If no value is specified, the latest version is used by default.
     */

    public void setCompatibleNamespaceVersion(Long compatibleNamespaceVersion) {
        this.compatibleNamespaceVersion = compatibleNamespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * <p>
     * If no value is specified, the latest version is used by default.
     * </p>
     * 
     * @return The version of the user's namespace. Defaults to the latest version of the user's namespace.</p>
     *         <p>
     *         If no value is specified, the latest version is used by default.
     */

    public Long getCompatibleNamespaceVersion() {
        return this.compatibleNamespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * <p>
     * If no value is specified, the latest version is used by default.
     * </p>
     * 
     * @param compatibleNamespaceVersion
     *        The version of the user's namespace. Defaults to the latest version of the user's namespace.</p>
     *        <p>
     *        If no value is specified, the latest version is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSystemTemplateRequest withCompatibleNamespaceVersion(Long compatibleNamespaceVersion) {
        setCompatibleNamespaceVersion(compatibleNamespaceVersion);
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
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getCompatibleNamespaceVersion() != null)
            sb.append("CompatibleNamespaceVersion: ").append(getCompatibleNamespaceVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSystemTemplateRequest == false)
            return false;
        UpdateSystemTemplateRequest other = (UpdateSystemTemplateRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getCompatibleNamespaceVersion() == null ^ this.getCompatibleNamespaceVersion() == null)
            return false;
        if (other.getCompatibleNamespaceVersion() != null && other.getCompatibleNamespaceVersion().equals(this.getCompatibleNamespaceVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getCompatibleNamespaceVersion() == null) ? 0 : getCompatibleNamespaceVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSystemTemplateRequest clone() {
        return (UpdateSystemTemplateRequest) super.clone();
    }

}

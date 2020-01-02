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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/CreateFlowTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFlowTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The workflow <code>DefinitionDocument</code>.
     * </p>
     */
    private DefinitionDocument definition;
    /**
     * <p>
     * The namespace version in which the workflow is to be created.
     * </p>
     * <p>
     * If no value is specified, the latest version is used by default.
     * </p>
     */
    private Long compatibleNamespaceVersion;

    /**
     * <p>
     * The workflow <code>DefinitionDocument</code>.
     * </p>
     * 
     * @param definition
     *        The workflow <code>DefinitionDocument</code>.
     */

    public void setDefinition(DefinitionDocument definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The workflow <code>DefinitionDocument</code>.
     * </p>
     * 
     * @return The workflow <code>DefinitionDocument</code>.
     */

    public DefinitionDocument getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The workflow <code>DefinitionDocument</code>.
     * </p>
     * 
     * @param definition
     *        The workflow <code>DefinitionDocument</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowTemplateRequest withDefinition(DefinitionDocument definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The namespace version in which the workflow is to be created.
     * </p>
     * <p>
     * If no value is specified, the latest version is used by default.
     * </p>
     * 
     * @param compatibleNamespaceVersion
     *        The namespace version in which the workflow is to be created.</p>
     *        <p>
     *        If no value is specified, the latest version is used by default.
     */

    public void setCompatibleNamespaceVersion(Long compatibleNamespaceVersion) {
        this.compatibleNamespaceVersion = compatibleNamespaceVersion;
    }

    /**
     * <p>
     * The namespace version in which the workflow is to be created.
     * </p>
     * <p>
     * If no value is specified, the latest version is used by default.
     * </p>
     * 
     * @return The namespace version in which the workflow is to be created.</p>
     *         <p>
     *         If no value is specified, the latest version is used by default.
     */

    public Long getCompatibleNamespaceVersion() {
        return this.compatibleNamespaceVersion;
    }

    /**
     * <p>
     * The namespace version in which the workflow is to be created.
     * </p>
     * <p>
     * If no value is specified, the latest version is used by default.
     * </p>
     * 
     * @param compatibleNamespaceVersion
     *        The namespace version in which the workflow is to be created.</p>
     *        <p>
     *        If no value is specified, the latest version is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowTemplateRequest withCompatibleNamespaceVersion(Long compatibleNamespaceVersion) {
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

        if (obj instanceof CreateFlowTemplateRequest == false)
            return false;
        CreateFlowTemplateRequest other = (CreateFlowTemplateRequest) obj;
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

        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getCompatibleNamespaceVersion() == null) ? 0 : getCompatibleNamespaceVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateFlowTemplateRequest clone() {
        return (CreateFlowTemplateRequest) super.clone();
    }

}

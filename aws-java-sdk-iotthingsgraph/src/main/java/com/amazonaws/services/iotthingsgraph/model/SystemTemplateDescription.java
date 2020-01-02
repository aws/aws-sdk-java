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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains a system's definition document and summary information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SystemTemplateDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SystemTemplateDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains summary information about a system.
     * </p>
     */
    private SystemTemplateSummary summary;
    /**
     * <p>
     * The definition document of a system.
     * </p>
     */
    private DefinitionDocument definition;
    /**
     * <p>
     * The namespace version against which the system was validated. Use this value in your system instance.
     * </p>
     */
    private Long validatedNamespaceVersion;

    /**
     * <p>
     * An object that contains summary information about a system.
     * </p>
     * 
     * @param summary
     *        An object that contains summary information about a system.
     */

    public void setSummary(SystemTemplateSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * An object that contains summary information about a system.
     * </p>
     * 
     * @return An object that contains summary information about a system.
     */

    public SystemTemplateSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * An object that contains summary information about a system.
     * </p>
     * 
     * @param summary
     *        An object that contains summary information about a system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemTemplateDescription withSummary(SystemTemplateSummary summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * The definition document of a system.
     * </p>
     * 
     * @param definition
     *        The definition document of a system.
     */

    public void setDefinition(DefinitionDocument definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The definition document of a system.
     * </p>
     * 
     * @return The definition document of a system.
     */

    public DefinitionDocument getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The definition document of a system.
     * </p>
     * 
     * @param definition
     *        The definition document of a system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemTemplateDescription withDefinition(DefinitionDocument definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The namespace version against which the system was validated. Use this value in your system instance.
     * </p>
     * 
     * @param validatedNamespaceVersion
     *        The namespace version against which the system was validated. Use this value in your system instance.
     */

    public void setValidatedNamespaceVersion(Long validatedNamespaceVersion) {
        this.validatedNamespaceVersion = validatedNamespaceVersion;
    }

    /**
     * <p>
     * The namespace version against which the system was validated. Use this value in your system instance.
     * </p>
     * 
     * @return The namespace version against which the system was validated. Use this value in your system instance.
     */

    public Long getValidatedNamespaceVersion() {
        return this.validatedNamespaceVersion;
    }

    /**
     * <p>
     * The namespace version against which the system was validated. Use this value in your system instance.
     * </p>
     * 
     * @param validatedNamespaceVersion
     *        The namespace version against which the system was validated. Use this value in your system instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemTemplateDescription withValidatedNamespaceVersion(Long validatedNamespaceVersion) {
        setValidatedNamespaceVersion(validatedNamespaceVersion);
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
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getValidatedNamespaceVersion() != null)
            sb.append("ValidatedNamespaceVersion: ").append(getValidatedNamespaceVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SystemTemplateDescription == false)
            return false;
        SystemTemplateDescription other = (SystemTemplateDescription) obj;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getValidatedNamespaceVersion() == null ^ this.getValidatedNamespaceVersion() == null)
            return false;
        if (other.getValidatedNamespaceVersion() != null && other.getValidatedNamespaceVersion().equals(this.getValidatedNamespaceVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getValidatedNamespaceVersion() == null) ? 0 : getValidatedNamespaceVersion().hashCode());
        return hashCode;
    }

    @Override
    public SystemTemplateDescription clone() {
        try {
            return (SystemTemplateDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotthingsgraph.model.transform.SystemTemplateDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

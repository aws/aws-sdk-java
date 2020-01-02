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
 * An object that contains a workflow's definition and summary information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/FlowTemplateDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowTemplateDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains summary information about a workflow.
     * </p>
     */
    private FlowTemplateSummary summary;
    /**
     * <p>
     * A workflow's definition document.
     * </p>
     */
    private DefinitionDocument definition;
    /**
     * <p>
     * The version of the user's namespace against which the workflow was validated. Use this value in your system
     * instance.
     * </p>
     */
    private Long validatedNamespaceVersion;

    /**
     * <p>
     * An object that contains summary information about a workflow.
     * </p>
     * 
     * @param summary
     *        An object that contains summary information about a workflow.
     */

    public void setSummary(FlowTemplateSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * An object that contains summary information about a workflow.
     * </p>
     * 
     * @return An object that contains summary information about a workflow.
     */

    public FlowTemplateSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * An object that contains summary information about a workflow.
     * </p>
     * 
     * @param summary
     *        An object that contains summary information about a workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowTemplateDescription withSummary(FlowTemplateSummary summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * A workflow's definition document.
     * </p>
     * 
     * @param definition
     *        A workflow's definition document.
     */

    public void setDefinition(DefinitionDocument definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * A workflow's definition document.
     * </p>
     * 
     * @return A workflow's definition document.
     */

    public DefinitionDocument getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * A workflow's definition document.
     * </p>
     * 
     * @param definition
     *        A workflow's definition document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowTemplateDescription withDefinition(DefinitionDocument definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The version of the user's namespace against which the workflow was validated. Use this value in your system
     * instance.
     * </p>
     * 
     * @param validatedNamespaceVersion
     *        The version of the user's namespace against which the workflow was validated. Use this value in your
     *        system instance.
     */

    public void setValidatedNamespaceVersion(Long validatedNamespaceVersion) {
        this.validatedNamespaceVersion = validatedNamespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace against which the workflow was validated. Use this value in your system
     * instance.
     * </p>
     * 
     * @return The version of the user's namespace against which the workflow was validated. Use this value in your
     *         system instance.
     */

    public Long getValidatedNamespaceVersion() {
        return this.validatedNamespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace against which the workflow was validated. Use this value in your system
     * instance.
     * </p>
     * 
     * @param validatedNamespaceVersion
     *        The version of the user's namespace against which the workflow was validated. Use this value in your
     *        system instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowTemplateDescription withValidatedNamespaceVersion(Long validatedNamespaceVersion) {
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

        if (obj instanceof FlowTemplateDescription == false)
            return false;
        FlowTemplateDescription other = (FlowTemplateDescription) obj;
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
    public FlowTemplateDescription clone() {
        try {
            return (FlowTemplateDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotthingsgraph.model.transform.FlowTemplateDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

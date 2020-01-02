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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UpdateFlowTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFlowTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workflow to be updated.
     * </p>
     * <p>
     * The ID should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME</code>
     * </p>
     */
    private String id;
    /**
     * <p>
     * The <code>DefinitionDocument</code> that contains the updated workflow definition.
     * </p>
     */
    private DefinitionDocument definition;
    /**
     * <p>
     * The version of the user's namespace.
     * </p>
     * <p>
     * If no value is specified, the latest version is used by default. Use the <code>GetFlowTemplateRevisions</code> if
     * you want to find earlier revisions of the flow to update.
     * </p>
     */
    private Long compatibleNamespaceVersion;

    /**
     * <p>
     * The ID of the workflow to be updated.
     * </p>
     * <p>
     * The ID should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME</code>
     * </p>
     * 
     * @param id
     *        The ID of the workflow to be updated.</p>
     *        <p>
     *        The ID should be in the following format.
     *        </p>
     *        <p>
     *        <code>urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME</code>
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the workflow to be updated.
     * </p>
     * <p>
     * The ID should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME</code>
     * </p>
     * 
     * @return The ID of the workflow to be updated.</p>
     *         <p>
     *         The ID should be in the following format.
     *         </p>
     *         <p>
     *         <code>urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME</code>
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the workflow to be updated.
     * </p>
     * <p>
     * The ID should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME</code>
     * </p>
     * 
     * @param id
     *        The ID of the workflow to be updated.</p>
     *        <p>
     *        The ID should be in the following format.
     *        </p>
     *        <p>
     *        <code>urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowTemplateRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The <code>DefinitionDocument</code> that contains the updated workflow definition.
     * </p>
     * 
     * @param definition
     *        The <code>DefinitionDocument</code> that contains the updated workflow definition.
     */

    public void setDefinition(DefinitionDocument definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The <code>DefinitionDocument</code> that contains the updated workflow definition.
     * </p>
     * 
     * @return The <code>DefinitionDocument</code> that contains the updated workflow definition.
     */

    public DefinitionDocument getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The <code>DefinitionDocument</code> that contains the updated workflow definition.
     * </p>
     * 
     * @param definition
     *        The <code>DefinitionDocument</code> that contains the updated workflow definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowTemplateRequest withDefinition(DefinitionDocument definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The version of the user's namespace.
     * </p>
     * <p>
     * If no value is specified, the latest version is used by default. Use the <code>GetFlowTemplateRevisions</code> if
     * you want to find earlier revisions of the flow to update.
     * </p>
     * 
     * @param compatibleNamespaceVersion
     *        The version of the user's namespace.</p>
     *        <p>
     *        If no value is specified, the latest version is used by default. Use the
     *        <code>GetFlowTemplateRevisions</code> if you want to find earlier revisions of the flow to update.
     */

    public void setCompatibleNamespaceVersion(Long compatibleNamespaceVersion) {
        this.compatibleNamespaceVersion = compatibleNamespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace.
     * </p>
     * <p>
     * If no value is specified, the latest version is used by default. Use the <code>GetFlowTemplateRevisions</code> if
     * you want to find earlier revisions of the flow to update.
     * </p>
     * 
     * @return The version of the user's namespace.</p>
     *         <p>
     *         If no value is specified, the latest version is used by default. Use the
     *         <code>GetFlowTemplateRevisions</code> if you want to find earlier revisions of the flow to update.
     */

    public Long getCompatibleNamespaceVersion() {
        return this.compatibleNamespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace.
     * </p>
     * <p>
     * If no value is specified, the latest version is used by default. Use the <code>GetFlowTemplateRevisions</code> if
     * you want to find earlier revisions of the flow to update.
     * </p>
     * 
     * @param compatibleNamespaceVersion
     *        The version of the user's namespace.</p>
     *        <p>
     *        If no value is specified, the latest version is used by default. Use the
     *        <code>GetFlowTemplateRevisions</code> if you want to find earlier revisions of the flow to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowTemplateRequest withCompatibleNamespaceVersion(Long compatibleNamespaceVersion) {
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

        if (obj instanceof UpdateFlowTemplateRequest == false)
            return false;
        UpdateFlowTemplateRequest other = (UpdateFlowTemplateRequest) obj;
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
    public UpdateFlowTemplateRequest clone() {
        return (UpdateFlowTemplateRequest) super.clone();
    }

}

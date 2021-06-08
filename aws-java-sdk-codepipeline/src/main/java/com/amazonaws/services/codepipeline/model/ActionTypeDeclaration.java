/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for the action type definition that are provided when the action type is created or updated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionTypeDeclaration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionTypeDeclaration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description for the action type to be updated.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the executor for an action type that was created with any supported integration model.
     * </p>
     */
    private ActionTypeExecutor executor;
    /**
     * <p>
     * The action category, owner, provider, and version of the action type to be updated.
     * </p>
     */
    private ActionTypeIdentifier id;
    /**
     * <p>
     * Details for the artifacts, such as application files, to be worked on by the action. For example, the minimum and
     * maximum number of input artifacts allowed.
     * </p>
     */
    private ActionTypeArtifactDetails inputArtifactDetails;
    /**
     * <p>
     * Details for the output artifacts, such as a built application, that are the result of the action. For example,
     * the minimum and maximum number of output artifacts allowed.
     * </p>
     */
    private ActionTypeArtifactDetails outputArtifactDetails;
    /**
     * <p>
     * Details identifying the accounts with permissions to use the action type.
     * </p>
     */
    private ActionTypePermissions permissions;
    /**
     * <p>
     * The properties of the action type to be updated.
     * </p>
     */
    private java.util.List<ActionTypeProperty> properties;
    /**
     * <p>
     * The links associated with the action type to be updated.
     * </p>
     */
    private ActionTypeUrls urls;

    /**
     * <p>
     * The description for the action type to be updated.
     * </p>
     * 
     * @param description
     *        The description for the action type to be updated.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the action type to be updated.
     * </p>
     * 
     * @return The description for the action type to be updated.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the action type to be updated.
     * </p>
     * 
     * @param description
     *        The description for the action type to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeDeclaration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the executor for an action type that was created with any supported integration model.
     * </p>
     * 
     * @param executor
     *        Information about the executor for an action type that was created with any supported integration model.
     */

    public void setExecutor(ActionTypeExecutor executor) {
        this.executor = executor;
    }

    /**
     * <p>
     * Information about the executor for an action type that was created with any supported integration model.
     * </p>
     * 
     * @return Information about the executor for an action type that was created with any supported integration model.
     */

    public ActionTypeExecutor getExecutor() {
        return this.executor;
    }

    /**
     * <p>
     * Information about the executor for an action type that was created with any supported integration model.
     * </p>
     * 
     * @param executor
     *        Information about the executor for an action type that was created with any supported integration model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeDeclaration withExecutor(ActionTypeExecutor executor) {
        setExecutor(executor);
        return this;
    }

    /**
     * <p>
     * The action category, owner, provider, and version of the action type to be updated.
     * </p>
     * 
     * @param id
     *        The action category, owner, provider, and version of the action type to be updated.
     */

    public void setId(ActionTypeIdentifier id) {
        this.id = id;
    }

    /**
     * <p>
     * The action category, owner, provider, and version of the action type to be updated.
     * </p>
     * 
     * @return The action category, owner, provider, and version of the action type to be updated.
     */

    public ActionTypeIdentifier getId() {
        return this.id;
    }

    /**
     * <p>
     * The action category, owner, provider, and version of the action type to be updated.
     * </p>
     * 
     * @param id
     *        The action category, owner, provider, and version of the action type to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeDeclaration withId(ActionTypeIdentifier id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Details for the artifacts, such as application files, to be worked on by the action. For example, the minimum and
     * maximum number of input artifacts allowed.
     * </p>
     * 
     * @param inputArtifactDetails
     *        Details for the artifacts, such as application files, to be worked on by the action. For example, the
     *        minimum and maximum number of input artifacts allowed.
     */

    public void setInputArtifactDetails(ActionTypeArtifactDetails inputArtifactDetails) {
        this.inputArtifactDetails = inputArtifactDetails;
    }

    /**
     * <p>
     * Details for the artifacts, such as application files, to be worked on by the action. For example, the minimum and
     * maximum number of input artifacts allowed.
     * </p>
     * 
     * @return Details for the artifacts, such as application files, to be worked on by the action. For example, the
     *         minimum and maximum number of input artifacts allowed.
     */

    public ActionTypeArtifactDetails getInputArtifactDetails() {
        return this.inputArtifactDetails;
    }

    /**
     * <p>
     * Details for the artifacts, such as application files, to be worked on by the action. For example, the minimum and
     * maximum number of input artifacts allowed.
     * </p>
     * 
     * @param inputArtifactDetails
     *        Details for the artifacts, such as application files, to be worked on by the action. For example, the
     *        minimum and maximum number of input artifacts allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeDeclaration withInputArtifactDetails(ActionTypeArtifactDetails inputArtifactDetails) {
        setInputArtifactDetails(inputArtifactDetails);
        return this;
    }

    /**
     * <p>
     * Details for the output artifacts, such as a built application, that are the result of the action. For example,
     * the minimum and maximum number of output artifacts allowed.
     * </p>
     * 
     * @param outputArtifactDetails
     *        Details for the output artifacts, such as a built application, that are the result of the action. For
     *        example, the minimum and maximum number of output artifacts allowed.
     */

    public void setOutputArtifactDetails(ActionTypeArtifactDetails outputArtifactDetails) {
        this.outputArtifactDetails = outputArtifactDetails;
    }

    /**
     * <p>
     * Details for the output artifacts, such as a built application, that are the result of the action. For example,
     * the minimum and maximum number of output artifacts allowed.
     * </p>
     * 
     * @return Details for the output artifacts, such as a built application, that are the result of the action. For
     *         example, the minimum and maximum number of output artifacts allowed.
     */

    public ActionTypeArtifactDetails getOutputArtifactDetails() {
        return this.outputArtifactDetails;
    }

    /**
     * <p>
     * Details for the output artifacts, such as a built application, that are the result of the action. For example,
     * the minimum and maximum number of output artifacts allowed.
     * </p>
     * 
     * @param outputArtifactDetails
     *        Details for the output artifacts, such as a built application, that are the result of the action. For
     *        example, the minimum and maximum number of output artifacts allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeDeclaration withOutputArtifactDetails(ActionTypeArtifactDetails outputArtifactDetails) {
        setOutputArtifactDetails(outputArtifactDetails);
        return this;
    }

    /**
     * <p>
     * Details identifying the accounts with permissions to use the action type.
     * </p>
     * 
     * @param permissions
     *        Details identifying the accounts with permissions to use the action type.
     */

    public void setPermissions(ActionTypePermissions permissions) {
        this.permissions = permissions;
    }

    /**
     * <p>
     * Details identifying the accounts with permissions to use the action type.
     * </p>
     * 
     * @return Details identifying the accounts with permissions to use the action type.
     */

    public ActionTypePermissions getPermissions() {
        return this.permissions;
    }

    /**
     * <p>
     * Details identifying the accounts with permissions to use the action type.
     * </p>
     * 
     * @param permissions
     *        Details identifying the accounts with permissions to use the action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeDeclaration withPermissions(ActionTypePermissions permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The properties of the action type to be updated.
     * </p>
     * 
     * @return The properties of the action type to be updated.
     */

    public java.util.List<ActionTypeProperty> getProperties() {
        return properties;
    }

    /**
     * <p>
     * The properties of the action type to be updated.
     * </p>
     * 
     * @param properties
     *        The properties of the action type to be updated.
     */

    public void setProperties(java.util.Collection<ActionTypeProperty> properties) {
        if (properties == null) {
            this.properties = null;
            return;
        }

        this.properties = new java.util.ArrayList<ActionTypeProperty>(properties);
    }

    /**
     * <p>
     * The properties of the action type to be updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProperties(java.util.Collection)} or {@link #withProperties(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param properties
     *        The properties of the action type to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeDeclaration withProperties(ActionTypeProperty... properties) {
        if (this.properties == null) {
            setProperties(new java.util.ArrayList<ActionTypeProperty>(properties.length));
        }
        for (ActionTypeProperty ele : properties) {
            this.properties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The properties of the action type to be updated.
     * </p>
     * 
     * @param properties
     *        The properties of the action type to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeDeclaration withProperties(java.util.Collection<ActionTypeProperty> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * <p>
     * The links associated with the action type to be updated.
     * </p>
     * 
     * @param urls
     *        The links associated with the action type to be updated.
     */

    public void setUrls(ActionTypeUrls urls) {
        this.urls = urls;
    }

    /**
     * <p>
     * The links associated with the action type to be updated.
     * </p>
     * 
     * @return The links associated with the action type to be updated.
     */

    public ActionTypeUrls getUrls() {
        return this.urls;
    }

    /**
     * <p>
     * The links associated with the action type to be updated.
     * </p>
     * 
     * @param urls
     *        The links associated with the action type to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeDeclaration withUrls(ActionTypeUrls urls) {
        setUrls(urls);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExecutor() != null)
            sb.append("Executor: ").append(getExecutor()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getInputArtifactDetails() != null)
            sb.append("InputArtifactDetails: ").append(getInputArtifactDetails()).append(",");
        if (getOutputArtifactDetails() != null)
            sb.append("OutputArtifactDetails: ").append(getOutputArtifactDetails()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getUrls() != null)
            sb.append("Urls: ").append(getUrls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionTypeDeclaration == false)
            return false;
        ActionTypeDeclaration other = (ActionTypeDeclaration) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExecutor() == null ^ this.getExecutor() == null)
            return false;
        if (other.getExecutor() != null && other.getExecutor().equals(this.getExecutor()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInputArtifactDetails() == null ^ this.getInputArtifactDetails() == null)
            return false;
        if (other.getInputArtifactDetails() != null && other.getInputArtifactDetails().equals(this.getInputArtifactDetails()) == false)
            return false;
        if (other.getOutputArtifactDetails() == null ^ this.getOutputArtifactDetails() == null)
            return false;
        if (other.getOutputArtifactDetails() != null && other.getOutputArtifactDetails().equals(this.getOutputArtifactDetails()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getUrls() == null ^ this.getUrls() == null)
            return false;
        if (other.getUrls() != null && other.getUrls().equals(this.getUrls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExecutor() == null) ? 0 : getExecutor().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInputArtifactDetails() == null) ? 0 : getInputArtifactDetails().hashCode());
        hashCode = prime * hashCode + ((getOutputArtifactDetails() == null) ? 0 : getOutputArtifactDetails().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getUrls() == null) ? 0 : getUrls().hashCode());
        return hashCode;
    }

    @Override
    public ActionTypeDeclaration clone() {
        try {
            return (ActionTypeDeclaration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionTypeDeclarationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * Specifies the category, owner, provider, and version of the action type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionTypeIdentifier" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionTypeIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines what kind of action can be taken in the stage, one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Source</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Build</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Test</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deploy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Approval</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invoke</code>
     * </p>
     * </li>
     * </ul>
     */
    private String category;
    /**
     * <p>
     * The creator of the action type being called: <code>AWS</code> or <code>ThirdParty</code>.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The provider of the action type being called. The provider name is supplied when the action type is created.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * A string that describes the action type version.
     * </p>
     */
    private String version;

    /**
     * <p>
     * Defines what kind of action can be taken in the stage, one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Source</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Build</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Test</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deploy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Approval</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invoke</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param category
     *        Defines what kind of action can be taken in the stage, one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Source</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Build</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Test</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deploy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Approval</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invoke</code>
     *        </p>
     *        </li>
     * @see ActionCategory
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * Defines what kind of action can be taken in the stage, one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Source</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Build</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Test</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deploy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Approval</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invoke</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Defines what kind of action can be taken in the stage, one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Source</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Build</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Test</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Deploy</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Approval</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invoke</code>
     *         </p>
     *         </li>
     * @see ActionCategory
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * Defines what kind of action can be taken in the stage, one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Source</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Build</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Test</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deploy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Approval</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invoke</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param category
     *        Defines what kind of action can be taken in the stage, one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Source</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Build</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Test</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deploy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Approval</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invoke</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionCategory
     */

    public ActionTypeIdentifier withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * Defines what kind of action can be taken in the stage, one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Source</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Build</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Test</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deploy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Approval</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invoke</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param category
     *        Defines what kind of action can be taken in the stage, one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Source</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Build</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Test</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deploy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Approval</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invoke</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionCategory
     */

    public ActionTypeIdentifier withCategory(ActionCategory category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * The creator of the action type being called: <code>AWS</code> or <code>ThirdParty</code>.
     * </p>
     * 
     * @param owner
     *        The creator of the action type being called: <code>AWS</code> or <code>ThirdParty</code>.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The creator of the action type being called: <code>AWS</code> or <code>ThirdParty</code>.
     * </p>
     * 
     * @return The creator of the action type being called: <code>AWS</code> or <code>ThirdParty</code>.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The creator of the action type being called: <code>AWS</code> or <code>ThirdParty</code>.
     * </p>
     * 
     * @param owner
     *        The creator of the action type being called: <code>AWS</code> or <code>ThirdParty</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeIdentifier withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The provider of the action type being called. The provider name is supplied when the action type is created.
     * </p>
     * 
     * @param provider
     *        The provider of the action type being called. The provider name is supplied when the action type is
     *        created.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider of the action type being called. The provider name is supplied when the action type is created.
     * </p>
     * 
     * @return The provider of the action type being called. The provider name is supplied when the action type is
     *         created.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider of the action type being called. The provider name is supplied when the action type is created.
     * </p>
     * 
     * @param provider
     *        The provider of the action type being called. The provider name is supplied when the action type is
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeIdentifier withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * A string that describes the action type version.
     * </p>
     * 
     * @param version
     *        A string that describes the action type version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * A string that describes the action type version.
     * </p>
     * 
     * @return A string that describes the action type version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * A string that describes the action type version.
     * </p>
     * 
     * @param version
     *        A string that describes the action type version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeIdentifier withVersion(String version) {
        setVersion(version);
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionTypeIdentifier == false)
            return false;
        ActionTypeIdentifier other = (ActionTypeIdentifier) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public ActionTypeIdentifier clone() {
        try {
            return (ActionTypeIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionTypeIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

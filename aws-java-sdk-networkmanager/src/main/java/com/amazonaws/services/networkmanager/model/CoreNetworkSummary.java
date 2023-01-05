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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns summary information about a core network.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CoreNetworkSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetworkSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a core network.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * a core network ARN.
     * </p>
     */
    private String coreNetworkArn;
    /**
     * <p>
     * The global network ID.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The ID of the account owner.
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * The state of a core network.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The description of a core network.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The key-value tags associated with a core network summary.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @return The ID of a core network.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkSummary withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * a core network ARN.
     * </p>
     * 
     * @param coreNetworkArn
     *        a core network ARN.
     */

    public void setCoreNetworkArn(String coreNetworkArn) {
        this.coreNetworkArn = coreNetworkArn;
    }

    /**
     * <p>
     * a core network ARN.
     * </p>
     * 
     * @return a core network ARN.
     */

    public String getCoreNetworkArn() {
        return this.coreNetworkArn;
    }

    /**
     * <p>
     * a core network ARN.
     * </p>
     * 
     * @param coreNetworkArn
     *        a core network ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkSummary withCoreNetworkArn(String coreNetworkArn) {
        setCoreNetworkArn(coreNetworkArn);
        return this;
    }

    /**
     * <p>
     * The global network ID.
     * </p>
     * 
     * @param globalNetworkId
     *        The global network ID.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The global network ID.
     * </p>
     * 
     * @return The global network ID.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The global network ID.
     * </p>
     * 
     * @param globalNetworkId
     *        The global network ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkSummary withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of the account owner.
     * </p>
     * 
     * @param ownerAccountId
     *        The ID of the account owner.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * The ID of the account owner.
     * </p>
     * 
     * @return The ID of the account owner.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * The ID of the account owner.
     * </p>
     * 
     * @param ownerAccountId
     *        The ID of the account owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkSummary withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
        return this;
    }

    /**
     * <p>
     * The state of a core network.
     * </p>
     * 
     * @param state
     *        The state of a core network.
     * @see CoreNetworkState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of a core network.
     * </p>
     * 
     * @return The state of a core network.
     * @see CoreNetworkState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of a core network.
     * </p>
     * 
     * @param state
     *        The state of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoreNetworkState
     */

    public CoreNetworkSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of a core network.
     * </p>
     * 
     * @param state
     *        The state of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoreNetworkState
     */

    public CoreNetworkSummary withState(CoreNetworkState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The description of a core network.
     * </p>
     * 
     * @param description
     *        The description of a core network.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a core network.
     * </p>
     * 
     * @return The description of a core network.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a core network.
     * </p>
     * 
     * @param description
     *        The description of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The key-value tags associated with a core network summary.
     * </p>
     * 
     * @return The key-value tags associated with a core network summary.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value tags associated with a core network summary.
     * </p>
     * 
     * @param tags
     *        The key-value tags associated with a core network summary.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The key-value tags associated with a core network summary.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key-value tags associated with a core network summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkSummary withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key-value tags associated with a core network summary.
     * </p>
     * 
     * @param tags
     *        The key-value tags associated with a core network summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkSummary withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getCoreNetworkArn() != null)
            sb.append("CoreNetworkArn: ").append(getCoreNetworkArn()).append(",");
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CoreNetworkSummary == false)
            return false;
        CoreNetworkSummary other = (CoreNetworkSummary) obj;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getCoreNetworkArn() == null ^ this.getCoreNetworkArn() == null)
            return false;
        if (other.getCoreNetworkArn() != null && other.getCoreNetworkArn().equals(this.getCoreNetworkArn()) == false)
            return false;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getCoreNetworkArn() == null) ? 0 : getCoreNetworkArn().hashCode());
        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CoreNetworkSummary clone() {
        try {
            return (CoreNetworkSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.CoreNetworkSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

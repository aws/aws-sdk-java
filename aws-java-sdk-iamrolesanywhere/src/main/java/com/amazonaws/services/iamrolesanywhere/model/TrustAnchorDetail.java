/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The state of the trust anchor after a read or write operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/TrustAnchorDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrustAnchorDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ISO-8601 timestamp when the trust anchor was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Indicates whether the trust anchor is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The name of the trust anchor.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The trust anchor type and its related certificate data.
     * </p>
     */
    private Source source;
    /**
     * <p>
     * The ARN of the trust anchor.
     * </p>
     */
    private String trustAnchorArn;
    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     */
    private String trustAnchorId;
    /**
     * <p>
     * The ISO-8601 timestamp when the trust anchor was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ISO-8601 timestamp when the trust anchor was created.
     * </p>
     * 
     * @param createdAt
     *        The ISO-8601 timestamp when the trust anchor was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the trust anchor was created.
     * </p>
     * 
     * @return The ISO-8601 timestamp when the trust anchor was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the trust anchor was created.
     * </p>
     * 
     * @param createdAt
     *        The ISO-8601 timestamp when the trust anchor was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustAnchorDetail withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Indicates whether the trust anchor is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the trust anchor is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether the trust anchor is enabled.
     * </p>
     * 
     * @return Indicates whether the trust anchor is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether the trust anchor is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the trust anchor is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustAnchorDetail withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the trust anchor is enabled.
     * </p>
     * 
     * @return Indicates whether the trust anchor is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The name of the trust anchor.
     * </p>
     * 
     * @param name
     *        The name of the trust anchor.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the trust anchor.
     * </p>
     * 
     * @return The name of the trust anchor.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the trust anchor.
     * </p>
     * 
     * @param name
     *        The name of the trust anchor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustAnchorDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The trust anchor type and its related certificate data.
     * </p>
     * 
     * @param source
     *        The trust anchor type and its related certificate data.
     */

    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * <p>
     * The trust anchor type and its related certificate data.
     * </p>
     * 
     * @return The trust anchor type and its related certificate data.
     */

    public Source getSource() {
        return this.source;
    }

    /**
     * <p>
     * The trust anchor type and its related certificate data.
     * </p>
     * 
     * @param source
     *        The trust anchor type and its related certificate data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustAnchorDetail withSource(Source source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The ARN of the trust anchor.
     * </p>
     * 
     * @param trustAnchorArn
     *        The ARN of the trust anchor.
     */

    public void setTrustAnchorArn(String trustAnchorArn) {
        this.trustAnchorArn = trustAnchorArn;
    }

    /**
     * <p>
     * The ARN of the trust anchor.
     * </p>
     * 
     * @return The ARN of the trust anchor.
     */

    public String getTrustAnchorArn() {
        return this.trustAnchorArn;
    }

    /**
     * <p>
     * The ARN of the trust anchor.
     * </p>
     * 
     * @param trustAnchorArn
     *        The ARN of the trust anchor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustAnchorDetail withTrustAnchorArn(String trustAnchorArn) {
        setTrustAnchorArn(trustAnchorArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     * 
     * @param trustAnchorId
     *        The unique identifier of the trust anchor.
     */

    public void setTrustAnchorId(String trustAnchorId) {
        this.trustAnchorId = trustAnchorId;
    }

    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     * 
     * @return The unique identifier of the trust anchor.
     */

    public String getTrustAnchorId() {
        return this.trustAnchorId;
    }

    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     * 
     * @param trustAnchorId
     *        The unique identifier of the trust anchor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustAnchorDetail withTrustAnchorId(String trustAnchorId) {
        setTrustAnchorId(trustAnchorId);
        return this;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the trust anchor was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The ISO-8601 timestamp when the trust anchor was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the trust anchor was last updated.
     * </p>
     * 
     * @return The ISO-8601 timestamp when the trust anchor was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the trust anchor was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The ISO-8601 timestamp when the trust anchor was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustAnchorDetail withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getTrustAnchorArn() != null)
            sb.append("TrustAnchorArn: ").append(getTrustAnchorArn()).append(",");
        if (getTrustAnchorId() != null)
            sb.append("TrustAnchorId: ").append(getTrustAnchorId()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustAnchorDetail == false)
            return false;
        TrustAnchorDetail other = (TrustAnchorDetail) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTrustAnchorArn() == null ^ this.getTrustAnchorArn() == null)
            return false;
        if (other.getTrustAnchorArn() != null && other.getTrustAnchorArn().equals(this.getTrustAnchorArn()) == false)
            return false;
        if (other.getTrustAnchorId() == null ^ this.getTrustAnchorId() == null)
            return false;
        if (other.getTrustAnchorId() != null && other.getTrustAnchorId().equals(this.getTrustAnchorId()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTrustAnchorArn() == null) ? 0 : getTrustAnchorArn().hashCode());
        hashCode = prime * hashCode + ((getTrustAnchorId() == null) ? 0 : getTrustAnchorId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public TrustAnchorDetail clone() {
        try {
            return (TrustAnchorDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iamrolesanywhere.model.transform.TrustAnchorDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

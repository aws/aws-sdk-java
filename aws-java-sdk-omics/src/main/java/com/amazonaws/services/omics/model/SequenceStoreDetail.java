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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a sequence store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/SequenceStoreDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SequenceStoreDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The store's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * When the store was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The store's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The store's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The store's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The store's server-side encryption (SSE) settings.
     * </p>
     */
    private SseConfig sseConfig;

    /**
     * <p>
     * The store's ARN.
     * </p>
     * 
     * @param arn
     *        The store's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The store's ARN.
     * </p>
     * 
     * @return The store's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The store's ARN.
     * </p>
     * 
     * @param arn
     *        The store's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SequenceStoreDetail withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * When the store was created.
     * </p>
     * 
     * @param creationTime
     *        When the store was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the store was created.
     * </p>
     * 
     * @return When the store was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the store was created.
     * </p>
     * 
     * @param creationTime
     *        When the store was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SequenceStoreDetail withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The store's description.
     * </p>
     * 
     * @param description
     *        The store's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The store's description.
     * </p>
     * 
     * @return The store's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The store's description.
     * </p>
     * 
     * @param description
     *        The store's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SequenceStoreDetail withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The store's ID.
     * </p>
     * 
     * @param id
     *        The store's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The store's ID.
     * </p>
     * 
     * @return The store's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The store's ID.
     * </p>
     * 
     * @param id
     *        The store's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SequenceStoreDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The store's name.
     * </p>
     * 
     * @param name
     *        The store's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The store's name.
     * </p>
     * 
     * @return The store's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The store's name.
     * </p>
     * 
     * @param name
     *        The store's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SequenceStoreDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The store's server-side encryption (SSE) settings.
     * </p>
     * 
     * @param sseConfig
     *        The store's server-side encryption (SSE) settings.
     */

    public void setSseConfig(SseConfig sseConfig) {
        this.sseConfig = sseConfig;
    }

    /**
     * <p>
     * The store's server-side encryption (SSE) settings.
     * </p>
     * 
     * @return The store's server-side encryption (SSE) settings.
     */

    public SseConfig getSseConfig() {
        return this.sseConfig;
    }

    /**
     * <p>
     * The store's server-side encryption (SSE) settings.
     * </p>
     * 
     * @param sseConfig
     *        The store's server-side encryption (SSE) settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SequenceStoreDetail withSseConfig(SseConfig sseConfig) {
        setSseConfig(sseConfig);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSseConfig() != null)
            sb.append("SseConfig: ").append(getSseConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SequenceStoreDetail == false)
            return false;
        SequenceStoreDetail other = (SequenceStoreDetail) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSseConfig() == null ^ this.getSseConfig() == null)
            return false;
        if (other.getSseConfig() != null && other.getSseConfig().equals(this.getSseConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSseConfig() == null) ? 0 : getSseConfig().hashCode());
        return hashCode;
    }

    @Override
    public SequenceStoreDetail clone() {
        try {
            return (SequenceStoreDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.SequenceStoreDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

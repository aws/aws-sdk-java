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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An array of summary information for one or more thesauruses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ThesaurusSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThesaurusSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the thesaurus.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the thesaurus.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the thesaurus.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Unix datetime that the thesaurus was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix datetime that the thesaurus was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The identifier of the thesaurus.
     * </p>
     * 
     * @param id
     *        The identifier of the thesaurus.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the thesaurus.
     * </p>
     * 
     * @return The identifier of the thesaurus.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the thesaurus.
     * </p>
     * 
     * @param id
     *        The identifier of the thesaurus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThesaurusSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the thesaurus.
     * </p>
     * 
     * @param name
     *        The name of the thesaurus.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the thesaurus.
     * </p>
     * 
     * @return The name of the thesaurus.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the thesaurus.
     * </p>
     * 
     * @param name
     *        The name of the thesaurus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThesaurusSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the thesaurus.
     * </p>
     * 
     * @param status
     *        The status of the thesaurus.
     * @see ThesaurusStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the thesaurus.
     * </p>
     * 
     * @return The status of the thesaurus.
     * @see ThesaurusStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the thesaurus.
     * </p>
     * 
     * @param status
     *        The status of the thesaurus.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThesaurusStatus
     */

    public ThesaurusSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the thesaurus.
     * </p>
     * 
     * @param status
     *        The status of the thesaurus.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThesaurusStatus
     */

    public ThesaurusSummary withStatus(ThesaurusStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Unix datetime that the thesaurus was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix datetime that the thesaurus was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix datetime that the thesaurus was created.
     * </p>
     * 
     * @return The Unix datetime that the thesaurus was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix datetime that the thesaurus was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix datetime that the thesaurus was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThesaurusSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix datetime that the thesaurus was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix datetime that the thesaurus was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix datetime that the thesaurus was last updated.
     * </p>
     * 
     * @return The Unix datetime that the thesaurus was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix datetime that the thesaurus was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix datetime that the thesaurus was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThesaurusSummary withUpdatedAt(java.util.Date updatedAt) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
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

        if (obj instanceof ThesaurusSummary == false)
            return false;
        ThesaurusSummary other = (ThesaurusSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ThesaurusSummary clone() {
        try {
            return (ThesaurusSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ThesaurusSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of ID namespaces.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/IdNamespaceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdNamespaceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when the ID namespace was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of the ID namespace.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ID namespace.
     * </p>
     */
    private String idNamespaceArn;
    /**
     * <p>
     * The name of the ID namespace.
     * </p>
     */
    private String idNamespaceName;
    /**
     * <p>
     * The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.
     * </p>
     * <p>
     * The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in an ID
     * mapping workflow.
     * </p>
     * <p>
     * The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all <code>sourceIds</code>
     * will resolve to.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The timestamp of when the ID namespace was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The timestamp of when the ID namespace was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the ID namespace was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the ID namespace was created.
     * </p>
     * 
     * @return The timestamp of when the ID namespace was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the ID namespace was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the ID namespace was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdNamespaceSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description of the ID namespace.
     * </p>
     * 
     * @param description
     *        The description of the ID namespace.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the ID namespace.
     * </p>
     * 
     * @return The description of the ID namespace.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the ID namespace.
     * </p>
     * 
     * @param description
     *        The description of the ID namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdNamespaceSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ID namespace.
     * </p>
     * 
     * @param idNamespaceArn
     *        The Amazon Resource Name (ARN) of the ID namespace.
     */

    public void setIdNamespaceArn(String idNamespaceArn) {
        this.idNamespaceArn = idNamespaceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ID namespace.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the ID namespace.
     */

    public String getIdNamespaceArn() {
        return this.idNamespaceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ID namespace.
     * </p>
     * 
     * @param idNamespaceArn
     *        The Amazon Resource Name (ARN) of the ID namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdNamespaceSummary withIdNamespaceArn(String idNamespaceArn) {
        setIdNamespaceArn(idNamespaceArn);
        return this;
    }

    /**
     * <p>
     * The name of the ID namespace.
     * </p>
     * 
     * @param idNamespaceName
     *        The name of the ID namespace.
     */

    public void setIdNamespaceName(String idNamespaceName) {
        this.idNamespaceName = idNamespaceName;
    }

    /**
     * <p>
     * The name of the ID namespace.
     * </p>
     * 
     * @return The name of the ID namespace.
     */

    public String getIdNamespaceName() {
        return this.idNamespaceName;
    }

    /**
     * <p>
     * The name of the ID namespace.
     * </p>
     * 
     * @param idNamespaceName
     *        The name of the ID namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdNamespaceSummary withIdNamespaceName(String idNamespaceName) {
        setIdNamespaceName(idNamespaceName);
        return this;
    }

    /**
     * <p>
     * The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.
     * </p>
     * <p>
     * The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in an ID
     * mapping workflow.
     * </p>
     * <p>
     * The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all <code>sourceIds</code>
     * will resolve to.
     * </p>
     * 
     * @param type
     *        The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.</p>
     *        <p>
     *        The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in
     *        an ID mapping workflow.
     *        </p>
     *        <p>
     *        The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all
     *        <code>sourceIds</code> will resolve to.
     * @see IdNamespaceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.
     * </p>
     * <p>
     * The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in an ID
     * mapping workflow.
     * </p>
     * <p>
     * The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all <code>sourceIds</code>
     * will resolve to.
     * </p>
     * 
     * @return The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.</p>
     *         <p>
     *         The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in
     *         an ID mapping workflow.
     *         </p>
     *         <p>
     *         The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all
     *         <code>sourceIds</code> will resolve to.
     * @see IdNamespaceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.
     * </p>
     * <p>
     * The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in an ID
     * mapping workflow.
     * </p>
     * <p>
     * The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all <code>sourceIds</code>
     * will resolve to.
     * </p>
     * 
     * @param type
     *        The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.</p>
     *        <p>
     *        The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in
     *        an ID mapping workflow.
     *        </p>
     *        <p>
     *        The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all
     *        <code>sourceIds</code> will resolve to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdNamespaceType
     */

    public IdNamespaceSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.
     * </p>
     * <p>
     * The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in an ID
     * mapping workflow.
     * </p>
     * <p>
     * The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all <code>sourceIds</code>
     * will resolve to.
     * </p>
     * 
     * @param type
     *        The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.</p>
     *        <p>
     *        The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in
     *        an ID mapping workflow.
     *        </p>
     *        <p>
     *        The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all
     *        <code>sourceIds</code> will resolve to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdNamespaceType
     */

    public IdNamespaceSummary withType(IdNamespaceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the ID namespace was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the ID namespace was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the ID namespace was last updated.
     * </p>
     * 
     * @return The timestamp of when the ID namespace was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the ID namespace was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the ID namespace was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdNamespaceSummary withUpdatedAt(java.util.Date updatedAt) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIdNamespaceArn() != null)
            sb.append("IdNamespaceArn: ").append(getIdNamespaceArn()).append(",");
        if (getIdNamespaceName() != null)
            sb.append("IdNamespaceName: ").append(getIdNamespaceName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof IdNamespaceSummary == false)
            return false;
        IdNamespaceSummary other = (IdNamespaceSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIdNamespaceArn() == null ^ this.getIdNamespaceArn() == null)
            return false;
        if (other.getIdNamespaceArn() != null && other.getIdNamespaceArn().equals(this.getIdNamespaceArn()) == false)
            return false;
        if (other.getIdNamespaceName() == null ^ this.getIdNamespaceName() == null)
            return false;
        if (other.getIdNamespaceName() != null && other.getIdNamespaceName().equals(this.getIdNamespaceName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIdNamespaceArn() == null) ? 0 : getIdNamespaceArn().hashCode());
        hashCode = prime * hashCode + ((getIdNamespaceName() == null) ? 0 : getIdNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public IdNamespaceSummary clone() {
        try {
            return (IdNamespaceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.IdNamespaceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DisassociatePersonasFromEntities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociatePersonasFromEntitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of your Amazon Kendra experience.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The identifiers of users or groups in your IAM Identity Center identity source. For example, user IDs could be
     * user emails.
     * </p>
     */
    private java.util.List<String> entityIds;

    /**
     * <p>
     * The identifier of your Amazon Kendra experience.
     * </p>
     * 
     * @param id
     *        The identifier of your Amazon Kendra experience.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of your Amazon Kendra experience.
     * </p>
     * 
     * @return The identifier of your Amazon Kendra experience.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of your Amazon Kendra experience.
     * </p>
     * 
     * @param id
     *        The identifier of your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociatePersonasFromEntitiesRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for your Amazon Kendra experience.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @return The identifier of the index for your Amazon Kendra experience.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociatePersonasFromEntitiesRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The identifiers of users or groups in your IAM Identity Center identity source. For example, user IDs could be
     * user emails.
     * </p>
     * 
     * @return The identifiers of users or groups in your IAM Identity Center identity source. For example, user IDs
     *         could be user emails.
     */

    public java.util.List<String> getEntityIds() {
        return entityIds;
    }

    /**
     * <p>
     * The identifiers of users or groups in your IAM Identity Center identity source. For example, user IDs could be
     * user emails.
     * </p>
     * 
     * @param entityIds
     *        The identifiers of users or groups in your IAM Identity Center identity source. For example, user IDs
     *        could be user emails.
     */

    public void setEntityIds(java.util.Collection<String> entityIds) {
        if (entityIds == null) {
            this.entityIds = null;
            return;
        }

        this.entityIds = new java.util.ArrayList<String>(entityIds);
    }

    /**
     * <p>
     * The identifiers of users or groups in your IAM Identity Center identity source. For example, user IDs could be
     * user emails.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityIds(java.util.Collection)} or {@link #withEntityIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityIds
     *        The identifiers of users or groups in your IAM Identity Center identity source. For example, user IDs
     *        could be user emails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociatePersonasFromEntitiesRequest withEntityIds(String... entityIds) {
        if (this.entityIds == null) {
            setEntityIds(new java.util.ArrayList<String>(entityIds.length));
        }
        for (String ele : entityIds) {
            this.entityIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of users or groups in your IAM Identity Center identity source. For example, user IDs could be
     * user emails.
     * </p>
     * 
     * @param entityIds
     *        The identifiers of users or groups in your IAM Identity Center identity source. For example, user IDs
     *        could be user emails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociatePersonasFromEntitiesRequest withEntityIds(java.util.Collection<String> entityIds) {
        setEntityIds(entityIds);
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getEntityIds() != null)
            sb.append("EntityIds: ").append(getEntityIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociatePersonasFromEntitiesRequest == false)
            return false;
        DisassociatePersonasFromEntitiesRequest other = (DisassociatePersonasFromEntitiesRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getEntityIds() == null ^ this.getEntityIds() == null)
            return false;
        if (other.getEntityIds() != null && other.getEntityIds().equals(this.getEntityIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getEntityIds() == null) ? 0 : getEntityIds().hashCode());
        return hashCode;
    }

    @Override
    public DisassociatePersonasFromEntitiesRequest clone() {
        return (DisassociatePersonasFromEntitiesRequest) super.clone();
    }

}

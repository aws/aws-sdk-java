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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Analysis results for one of the documents in the batch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectTargetedSentimentItemResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDetectTargetedSentimentItemResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The zero-based index of this result in the input list.
     * </p>
     */
    private Integer index;
    /**
     * <p>
     * An array of targeted sentiment entities.
     * </p>
     */
    private java.util.List<TargetedSentimentEntity> entities;

    /**
     * <p>
     * The zero-based index of this result in the input list.
     * </p>
     * 
     * @param index
     *        The zero-based index of this result in the input list.
     */

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The zero-based index of this result in the input list.
     * </p>
     * 
     * @return The zero-based index of this result in the input list.
     */

    public Integer getIndex() {
        return this.index;
    }

    /**
     * <p>
     * The zero-based index of this result in the input list.
     * </p>
     * 
     * @param index
     *        The zero-based index of this result in the input list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectTargetedSentimentItemResult withIndex(Integer index) {
        setIndex(index);
        return this;
    }

    /**
     * <p>
     * An array of targeted sentiment entities.
     * </p>
     * 
     * @return An array of targeted sentiment entities.
     */

    public java.util.List<TargetedSentimentEntity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * An array of targeted sentiment entities.
     * </p>
     * 
     * @param entities
     *        An array of targeted sentiment entities.
     */

    public void setEntities(java.util.Collection<TargetedSentimentEntity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<TargetedSentimentEntity>(entities);
    }

    /**
     * <p>
     * An array of targeted sentiment entities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntities(java.util.Collection)} or {@link #withEntities(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entities
     *        An array of targeted sentiment entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectTargetedSentimentItemResult withEntities(TargetedSentimentEntity... entities) {
        if (this.entities == null) {
            setEntities(new java.util.ArrayList<TargetedSentimentEntity>(entities.length));
        }
        for (TargetedSentimentEntity ele : entities) {
            this.entities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of targeted sentiment entities.
     * </p>
     * 
     * @param entities
     *        An array of targeted sentiment entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectTargetedSentimentItemResult withEntities(java.util.Collection<TargetedSentimentEntity> entities) {
        setEntities(entities);
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
        if (getIndex() != null)
            sb.append("Index: ").append(getIndex()).append(",");
        if (getEntities() != null)
            sb.append("Entities: ").append(getEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetectTargetedSentimentItemResult == false)
            return false;
        BatchDetectTargetedSentimentItemResult other = (BatchDetectTargetedSentimentItemResult) obj;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        return hashCode;
    }

    @Override
    public BatchDetectTargetedSentimentItemResult clone() {
        try {
            return (BatchDetectTargetedSentimentItemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.BatchDetectTargetedSentimentItemResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

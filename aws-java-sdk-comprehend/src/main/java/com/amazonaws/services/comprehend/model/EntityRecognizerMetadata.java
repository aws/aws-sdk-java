/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Detailed information about an entity recognizer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EntityRecognizerMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityRecognizerMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of documents in the input data that were used to train the entity recognizer. Typically this is 80 to
     * 90 percent of the input documents.
     * </p>
     */
    private Integer numberOfTrainedDocuments;
    /**
     * <p>
     * The number of documents in the input data that were used to test the entity recognizer. Typically this is 10 to
     * 20 percent of the input documents.
     * </p>
     */
    private Integer numberOfTestDocuments;
    /**
     * <p>
     * Detailed information about the accuracy of an entity recognizer.
     * </p>
     */
    private EntityRecognizerEvaluationMetrics evaluationMetrics;
    /**
     * <p>
     * Entity types from the metadata of an entity recognizer.
     * </p>
     */
    private java.util.List<EntityRecognizerMetadataEntityTypesListItem> entityTypes;

    /**
     * <p>
     * The number of documents in the input data that were used to train the entity recognizer. Typically this is 80 to
     * 90 percent of the input documents.
     * </p>
     * 
     * @param numberOfTrainedDocuments
     *        The number of documents in the input data that were used to train the entity recognizer. Typically this is
     *        80 to 90 percent of the input documents.
     */

    public void setNumberOfTrainedDocuments(Integer numberOfTrainedDocuments) {
        this.numberOfTrainedDocuments = numberOfTrainedDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to train the entity recognizer. Typically this is 80 to
     * 90 percent of the input documents.
     * </p>
     * 
     * @return The number of documents in the input data that were used to train the entity recognizer. Typically this
     *         is 80 to 90 percent of the input documents.
     */

    public Integer getNumberOfTrainedDocuments() {
        return this.numberOfTrainedDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to train the entity recognizer. Typically this is 80 to
     * 90 percent of the input documents.
     * </p>
     * 
     * @param numberOfTrainedDocuments
     *        The number of documents in the input data that were used to train the entity recognizer. Typically this is
     *        80 to 90 percent of the input documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerMetadata withNumberOfTrainedDocuments(Integer numberOfTrainedDocuments) {
        setNumberOfTrainedDocuments(numberOfTrainedDocuments);
        return this;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to test the entity recognizer. Typically this is 10 to
     * 20 percent of the input documents.
     * </p>
     * 
     * @param numberOfTestDocuments
     *        The number of documents in the input data that were used to test the entity recognizer. Typically this is
     *        10 to 20 percent of the input documents.
     */

    public void setNumberOfTestDocuments(Integer numberOfTestDocuments) {
        this.numberOfTestDocuments = numberOfTestDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to test the entity recognizer. Typically this is 10 to
     * 20 percent of the input documents.
     * </p>
     * 
     * @return The number of documents in the input data that were used to test the entity recognizer. Typically this is
     *         10 to 20 percent of the input documents.
     */

    public Integer getNumberOfTestDocuments() {
        return this.numberOfTestDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to test the entity recognizer. Typically this is 10 to
     * 20 percent of the input documents.
     * </p>
     * 
     * @param numberOfTestDocuments
     *        The number of documents in the input data that were used to test the entity recognizer. Typically this is
     *        10 to 20 percent of the input documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerMetadata withNumberOfTestDocuments(Integer numberOfTestDocuments) {
        setNumberOfTestDocuments(numberOfTestDocuments);
        return this;
    }

    /**
     * <p>
     * Detailed information about the accuracy of an entity recognizer.
     * </p>
     * 
     * @param evaluationMetrics
     *        Detailed information about the accuracy of an entity recognizer.
     */

    public void setEvaluationMetrics(EntityRecognizerEvaluationMetrics evaluationMetrics) {
        this.evaluationMetrics = evaluationMetrics;
    }

    /**
     * <p>
     * Detailed information about the accuracy of an entity recognizer.
     * </p>
     * 
     * @return Detailed information about the accuracy of an entity recognizer.
     */

    public EntityRecognizerEvaluationMetrics getEvaluationMetrics() {
        return this.evaluationMetrics;
    }

    /**
     * <p>
     * Detailed information about the accuracy of an entity recognizer.
     * </p>
     * 
     * @param evaluationMetrics
     *        Detailed information about the accuracy of an entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerMetadata withEvaluationMetrics(EntityRecognizerEvaluationMetrics evaluationMetrics) {
        setEvaluationMetrics(evaluationMetrics);
        return this;
    }

    /**
     * <p>
     * Entity types from the metadata of an entity recognizer.
     * </p>
     * 
     * @return Entity types from the metadata of an entity recognizer.
     */

    public java.util.List<EntityRecognizerMetadataEntityTypesListItem> getEntityTypes() {
        return entityTypes;
    }

    /**
     * <p>
     * Entity types from the metadata of an entity recognizer.
     * </p>
     * 
     * @param entityTypes
     *        Entity types from the metadata of an entity recognizer.
     */

    public void setEntityTypes(java.util.Collection<EntityRecognizerMetadataEntityTypesListItem> entityTypes) {
        if (entityTypes == null) {
            this.entityTypes = null;
            return;
        }

        this.entityTypes = new java.util.ArrayList<EntityRecognizerMetadataEntityTypesListItem>(entityTypes);
    }

    /**
     * <p>
     * Entity types from the metadata of an entity recognizer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityTypes(java.util.Collection)} or {@link #withEntityTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityTypes
     *        Entity types from the metadata of an entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerMetadata withEntityTypes(EntityRecognizerMetadataEntityTypesListItem... entityTypes) {
        if (this.entityTypes == null) {
            setEntityTypes(new java.util.ArrayList<EntityRecognizerMetadataEntityTypesListItem>(entityTypes.length));
        }
        for (EntityRecognizerMetadataEntityTypesListItem ele : entityTypes) {
            this.entityTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Entity types from the metadata of an entity recognizer.
     * </p>
     * 
     * @param entityTypes
     *        Entity types from the metadata of an entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerMetadata withEntityTypes(java.util.Collection<EntityRecognizerMetadataEntityTypesListItem> entityTypes) {
        setEntityTypes(entityTypes);
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
        if (getNumberOfTrainedDocuments() != null)
            sb.append("NumberOfTrainedDocuments: ").append(getNumberOfTrainedDocuments()).append(",");
        if (getNumberOfTestDocuments() != null)
            sb.append("NumberOfTestDocuments: ").append(getNumberOfTestDocuments()).append(",");
        if (getEvaluationMetrics() != null)
            sb.append("EvaluationMetrics: ").append(getEvaluationMetrics()).append(",");
        if (getEntityTypes() != null)
            sb.append("EntityTypes: ").append(getEntityTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerMetadata == false)
            return false;
        EntityRecognizerMetadata other = (EntityRecognizerMetadata) obj;
        if (other.getNumberOfTrainedDocuments() == null ^ this.getNumberOfTrainedDocuments() == null)
            return false;
        if (other.getNumberOfTrainedDocuments() != null && other.getNumberOfTrainedDocuments().equals(this.getNumberOfTrainedDocuments()) == false)
            return false;
        if (other.getNumberOfTestDocuments() == null ^ this.getNumberOfTestDocuments() == null)
            return false;
        if (other.getNumberOfTestDocuments() != null && other.getNumberOfTestDocuments().equals(this.getNumberOfTestDocuments()) == false)
            return false;
        if (other.getEvaluationMetrics() == null ^ this.getEvaluationMetrics() == null)
            return false;
        if (other.getEvaluationMetrics() != null && other.getEvaluationMetrics().equals(this.getEvaluationMetrics()) == false)
            return false;
        if (other.getEntityTypes() == null ^ this.getEntityTypes() == null)
            return false;
        if (other.getEntityTypes() != null && other.getEntityTypes().equals(this.getEntityTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfTrainedDocuments() == null) ? 0 : getNumberOfTrainedDocuments().hashCode());
        hashCode = prime * hashCode + ((getNumberOfTestDocuments() == null) ? 0 : getNumberOfTestDocuments().hashCode());
        hashCode = prime * hashCode + ((getEvaluationMetrics() == null) ? 0 : getEvaluationMetrics().hashCode());
        hashCode = prime * hashCode + ((getEntityTypes() == null) ? 0 : getEntityTypes().hashCode());
        return hashCode;
    }

    @Override
    public EntityRecognizerMetadata clone() {
        try {
            return (EntityRecognizerMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EntityRecognizerMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

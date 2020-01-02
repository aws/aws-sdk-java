/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The ICD-10-CM concepts that the entity could refer to, along with a score indicating the likelihood of the match.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/ICD10CMConcept" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ICD10CMConcept implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The long description of the ICD-10-CM code in the ontology.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ICD-10-CM code that identifies the concept found in the knowledge base from the Centers for Disease Control.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to an ICD-10-CM
     * concept.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * The long description of the ICD-10-CM code in the ontology.
     * </p>
     * 
     * @param description
     *        The long description of the ICD-10-CM code in the ontology.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The long description of the ICD-10-CM code in the ontology.
     * </p>
     * 
     * @return The long description of the ICD-10-CM code in the ontology.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The long description of the ICD-10-CM code in the ontology.
     * </p>
     * 
     * @param description
     *        The long description of the ICD-10-CM code in the ontology.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ICD10CMConcept withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ICD-10-CM code that identifies the concept found in the knowledge base from the Centers for Disease Control.
     * </p>
     * 
     * @param code
     *        The ICD-10-CM code that identifies the concept found in the knowledge base from the Centers for Disease
     *        Control.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The ICD-10-CM code that identifies the concept found in the knowledge base from the Centers for Disease Control.
     * </p>
     * 
     * @return The ICD-10-CM code that identifies the concept found in the knowledge base from the Centers for Disease
     *         Control.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The ICD-10-CM code that identifies the concept found in the knowledge base from the Centers for Disease Control.
     * </p>
     * 
     * @param code
     *        The ICD-10-CM code that identifies the concept found in the knowledge base from the Centers for Disease
     *        Control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ICD10CMConcept withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to an ICD-10-CM
     * concept.
     * </p>
     * 
     * @param score
     *        The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to an
     *        ICD-10-CM concept.
     */

    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to an ICD-10-CM
     * concept.
     * </p>
     * 
     * @return The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to an
     *         ICD-10-CM concept.
     */

    public Float getScore() {
        return this.score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to an ICD-10-CM
     * concept.
     * </p>
     * 
     * @param score
     *        The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to an
     *        ICD-10-CM concept.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ICD10CMConcept withScore(Float score) {
        setScore(score);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ICD10CMConcept == false)
            return false;
        ICD10CMConcept other = (ICD10CMConcept) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public ICD10CMConcept clone() {
        try {
            return (ICD10CMConcept) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehendmedical.model.transform.ICD10CMConceptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

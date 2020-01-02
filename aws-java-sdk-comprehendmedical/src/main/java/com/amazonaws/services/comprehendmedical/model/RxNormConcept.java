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
 * The RxNorm concept that the entity could refer to, along with a score indicating the likelihood of the match.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/RxNormConcept" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RxNormConcept implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the RxNorm concept.
     * </p>
     */
    private String description;
    /**
     * <p>
     * RxNorm concept ID, also known as the RxCUI.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to the reported
     * RxNorm concept.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * The description of the RxNorm concept.
     * </p>
     * 
     * @param description
     *        The description of the RxNorm concept.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the RxNorm concept.
     * </p>
     * 
     * @return The description of the RxNorm concept.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the RxNorm concept.
     * </p>
     * 
     * @param description
     *        The description of the RxNorm concept.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RxNormConcept withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * RxNorm concept ID, also known as the RxCUI.
     * </p>
     * 
     * @param code
     *        RxNorm concept ID, also known as the RxCUI.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * RxNorm concept ID, also known as the RxCUI.
     * </p>
     * 
     * @return RxNorm concept ID, also known as the RxCUI.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * RxNorm concept ID, also known as the RxCUI.
     * </p>
     * 
     * @param code
     *        RxNorm concept ID, also known as the RxCUI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RxNormConcept withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to the reported
     * RxNorm concept.
     * </p>
     * 
     * @param score
     *        The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to the
     *        reported RxNorm concept.
     */

    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to the reported
     * RxNorm concept.
     * </p>
     * 
     * @return The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to the
     *         reported RxNorm concept.
     */

    public Float getScore() {
        return this.score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to the reported
     * RxNorm concept.
     * </p>
     * 
     * @param score
     *        The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to the
     *        reported RxNorm concept.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RxNormConcept withScore(Float score) {
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

        if (obj instanceof RxNormConcept == false)
            return false;
        RxNormConcept other = (RxNormConcept) obj;
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
    public RxNormConcept clone() {
        try {
            return (RxNormConcept) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehendmedical.model.transform.RxNormConceptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

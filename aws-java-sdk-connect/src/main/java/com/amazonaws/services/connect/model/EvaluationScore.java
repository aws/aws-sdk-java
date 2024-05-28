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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about scores of a contact evaluation item (section or question).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationScore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationScore implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The score percentage for an item in a contact evaluation.
     * </p>
     */
    private Double percentage;
    /**
     * <p>
     * The flag to mark the item as not applicable for scoring.
     * </p>
     */
    private Boolean notApplicable;
    /**
     * <p>
     * The flag that marks the item as automatic fail. If the item or a child item gets an automatic fail answer, this
     * flag will be true.
     * </p>
     */
    private Boolean automaticFail;

    /**
     * <p>
     * The score percentage for an item in a contact evaluation.
     * </p>
     * 
     * @param percentage
     *        The score percentage for an item in a contact evaluation.
     */

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    /**
     * <p>
     * The score percentage for an item in a contact evaluation.
     * </p>
     * 
     * @return The score percentage for an item in a contact evaluation.
     */

    public Double getPercentage() {
        return this.percentage;
    }

    /**
     * <p>
     * The score percentage for an item in a contact evaluation.
     * </p>
     * 
     * @param percentage
     *        The score percentage for an item in a contact evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationScore withPercentage(Double percentage) {
        setPercentage(percentage);
        return this;
    }

    /**
     * <p>
     * The flag to mark the item as not applicable for scoring.
     * </p>
     * 
     * @param notApplicable
     *        The flag to mark the item as not applicable for scoring.
     */

    public void setNotApplicable(Boolean notApplicable) {
        this.notApplicable = notApplicable;
    }

    /**
     * <p>
     * The flag to mark the item as not applicable for scoring.
     * </p>
     * 
     * @return The flag to mark the item as not applicable for scoring.
     */

    public Boolean getNotApplicable() {
        return this.notApplicable;
    }

    /**
     * <p>
     * The flag to mark the item as not applicable for scoring.
     * </p>
     * 
     * @param notApplicable
     *        The flag to mark the item as not applicable for scoring.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationScore withNotApplicable(Boolean notApplicable) {
        setNotApplicable(notApplicable);
        return this;
    }

    /**
     * <p>
     * The flag to mark the item as not applicable for scoring.
     * </p>
     * 
     * @return The flag to mark the item as not applicable for scoring.
     */

    public Boolean isNotApplicable() {
        return this.notApplicable;
    }

    /**
     * <p>
     * The flag that marks the item as automatic fail. If the item or a child item gets an automatic fail answer, this
     * flag will be true.
     * </p>
     * 
     * @param automaticFail
     *        The flag that marks the item as automatic fail. If the item or a child item gets an automatic fail answer,
     *        this flag will be true.
     */

    public void setAutomaticFail(Boolean automaticFail) {
        this.automaticFail = automaticFail;
    }

    /**
     * <p>
     * The flag that marks the item as automatic fail. If the item or a child item gets an automatic fail answer, this
     * flag will be true.
     * </p>
     * 
     * @return The flag that marks the item as automatic fail. If the item or a child item gets an automatic fail
     *         answer, this flag will be true.
     */

    public Boolean getAutomaticFail() {
        return this.automaticFail;
    }

    /**
     * <p>
     * The flag that marks the item as automatic fail. If the item or a child item gets an automatic fail answer, this
     * flag will be true.
     * </p>
     * 
     * @param automaticFail
     *        The flag that marks the item as automatic fail. If the item or a child item gets an automatic fail answer,
     *        this flag will be true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationScore withAutomaticFail(Boolean automaticFail) {
        setAutomaticFail(automaticFail);
        return this;
    }

    /**
     * <p>
     * The flag that marks the item as automatic fail. If the item or a child item gets an automatic fail answer, this
     * flag will be true.
     * </p>
     * 
     * @return The flag that marks the item as automatic fail. If the item or a child item gets an automatic fail
     *         answer, this flag will be true.
     */

    public Boolean isAutomaticFail() {
        return this.automaticFail;
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
        if (getPercentage() != null)
            sb.append("Percentage: ").append(getPercentage()).append(",");
        if (getNotApplicable() != null)
            sb.append("NotApplicable: ").append(getNotApplicable()).append(",");
        if (getAutomaticFail() != null)
            sb.append("AutomaticFail: ").append(getAutomaticFail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationScore == false)
            return false;
        EvaluationScore other = (EvaluationScore) obj;
        if (other.getPercentage() == null ^ this.getPercentage() == null)
            return false;
        if (other.getPercentage() != null && other.getPercentage().equals(this.getPercentage()) == false)
            return false;
        if (other.getNotApplicable() == null ^ this.getNotApplicable() == null)
            return false;
        if (other.getNotApplicable() != null && other.getNotApplicable().equals(this.getNotApplicable()) == false)
            return false;
        if (other.getAutomaticFail() == null ^ this.getAutomaticFail() == null)
            return false;
        if (other.getAutomaticFail() != null && other.getAutomaticFail().equals(this.getAutomaticFail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPercentage() == null) ? 0 : getPercentage().hashCode());
        hashCode = prime * hashCode + ((getNotApplicable() == null) ? 0 : getNotApplicable().hashCode());
        hashCode = prime * hashCode + ((getAutomaticFail() == null) ? 0 : getAutomaticFail().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationScore clone() {
        try {
            return (EvaluationScore) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationScoreMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

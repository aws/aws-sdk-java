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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A pillar difference return object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/PillarDifference" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PillarDifference implements Serializable, Cloneable, StructuredPojo {

    private String pillarId;
    /**
     * <p>
     * Indicates the type of change to the pillar.
     * </p>
     */
    private String differenceStatus;
    /**
     * <p>
     * List of question differences.
     * </p>
     */
    private java.util.List<QuestionDifference> questionDifferences;

    /**
     * @param pillarId
     */

    public void setPillarId(String pillarId) {
        this.pillarId = pillarId;
    }

    /**
     * @return
     */

    public String getPillarId() {
        return this.pillarId;
    }

    /**
     * @param pillarId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PillarDifference withPillarId(String pillarId) {
        setPillarId(pillarId);
        return this;
    }

    /**
     * <p>
     * Indicates the type of change to the pillar.
     * </p>
     * 
     * @param differenceStatus
     *        Indicates the type of change to the pillar.
     * @see DifferenceStatus
     */

    public void setDifferenceStatus(String differenceStatus) {
        this.differenceStatus = differenceStatus;
    }

    /**
     * <p>
     * Indicates the type of change to the pillar.
     * </p>
     * 
     * @return Indicates the type of change to the pillar.
     * @see DifferenceStatus
     */

    public String getDifferenceStatus() {
        return this.differenceStatus;
    }

    /**
     * <p>
     * Indicates the type of change to the pillar.
     * </p>
     * 
     * @param differenceStatus
     *        Indicates the type of change to the pillar.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DifferenceStatus
     */

    public PillarDifference withDifferenceStatus(String differenceStatus) {
        setDifferenceStatus(differenceStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the type of change to the pillar.
     * </p>
     * 
     * @param differenceStatus
     *        Indicates the type of change to the pillar.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DifferenceStatus
     */

    public PillarDifference withDifferenceStatus(DifferenceStatus differenceStatus) {
        this.differenceStatus = differenceStatus.toString();
        return this;
    }

    /**
     * <p>
     * List of question differences.
     * </p>
     * 
     * @return List of question differences.
     */

    public java.util.List<QuestionDifference> getQuestionDifferences() {
        return questionDifferences;
    }

    /**
     * <p>
     * List of question differences.
     * </p>
     * 
     * @param questionDifferences
     *        List of question differences.
     */

    public void setQuestionDifferences(java.util.Collection<QuestionDifference> questionDifferences) {
        if (questionDifferences == null) {
            this.questionDifferences = null;
            return;
        }

        this.questionDifferences = new java.util.ArrayList<QuestionDifference>(questionDifferences);
    }

    /**
     * <p>
     * List of question differences.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQuestionDifferences(java.util.Collection)} or {@link #withQuestionDifferences(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param questionDifferences
     *        List of question differences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PillarDifference withQuestionDifferences(QuestionDifference... questionDifferences) {
        if (this.questionDifferences == null) {
            setQuestionDifferences(new java.util.ArrayList<QuestionDifference>(questionDifferences.length));
        }
        for (QuestionDifference ele : questionDifferences) {
            this.questionDifferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of question differences.
     * </p>
     * 
     * @param questionDifferences
     *        List of question differences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PillarDifference withQuestionDifferences(java.util.Collection<QuestionDifference> questionDifferences) {
        setQuestionDifferences(questionDifferences);
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
        if (getPillarId() != null)
            sb.append("PillarId: ").append(getPillarId()).append(",");
        if (getDifferenceStatus() != null)
            sb.append("DifferenceStatus: ").append(getDifferenceStatus()).append(",");
        if (getQuestionDifferences() != null)
            sb.append("QuestionDifferences: ").append(getQuestionDifferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PillarDifference == false)
            return false;
        PillarDifference other = (PillarDifference) obj;
        if (other.getPillarId() == null ^ this.getPillarId() == null)
            return false;
        if (other.getPillarId() != null && other.getPillarId().equals(this.getPillarId()) == false)
            return false;
        if (other.getDifferenceStatus() == null ^ this.getDifferenceStatus() == null)
            return false;
        if (other.getDifferenceStatus() != null && other.getDifferenceStatus().equals(this.getDifferenceStatus()) == false)
            return false;
        if (other.getQuestionDifferences() == null ^ this.getQuestionDifferences() == null)
            return false;
        if (other.getQuestionDifferences() != null && other.getQuestionDifferences().equals(this.getQuestionDifferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPillarId() == null) ? 0 : getPillarId().hashCode());
        hashCode = prime * hashCode + ((getDifferenceStatus() == null) ? 0 : getDifferenceStatus().hashCode());
        hashCode = prime * hashCode + ((getQuestionDifferences() == null) ? 0 : getQuestionDifferences().hashCode());
        return hashCode;
    }

    @Override
    public PillarDifference clone() {
        try {
            return (PillarDifference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.PillarDifferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

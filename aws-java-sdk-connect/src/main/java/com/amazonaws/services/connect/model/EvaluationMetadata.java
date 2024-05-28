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
 * Metadata information about a contact evaluation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the evaluation.
     * </p>
     */
    private String evaluatorArn;
    /**
     * <p>
     * The identifier of the agent who performed the contact.
     * </p>
     */
    private String contactAgentId;
    /**
     * <p>
     * The overall score of the contact evaluation.
     * </p>
     */
    private EvaluationScore score;

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact in this instance of Amazon Connect.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @return The identifier of the contact in this instance of Amazon Connect.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact in this instance of Amazon Connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationMetadata withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the evaluation.
     * </p>
     * 
     * @param evaluatorArn
     *        The Amazon Resource Name (ARN) of the user who last updated the evaluation.
     */

    public void setEvaluatorArn(String evaluatorArn) {
        this.evaluatorArn = evaluatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the evaluation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who last updated the evaluation.
     */

    public String getEvaluatorArn() {
        return this.evaluatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the evaluation.
     * </p>
     * 
     * @param evaluatorArn
     *        The Amazon Resource Name (ARN) of the user who last updated the evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationMetadata withEvaluatorArn(String evaluatorArn) {
        setEvaluatorArn(evaluatorArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the agent who performed the contact.
     * </p>
     * 
     * @param contactAgentId
     *        The identifier of the agent who performed the contact.
     */

    public void setContactAgentId(String contactAgentId) {
        this.contactAgentId = contactAgentId;
    }

    /**
     * <p>
     * The identifier of the agent who performed the contact.
     * </p>
     * 
     * @return The identifier of the agent who performed the contact.
     */

    public String getContactAgentId() {
        return this.contactAgentId;
    }

    /**
     * <p>
     * The identifier of the agent who performed the contact.
     * </p>
     * 
     * @param contactAgentId
     *        The identifier of the agent who performed the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationMetadata withContactAgentId(String contactAgentId) {
        setContactAgentId(contactAgentId);
        return this;
    }

    /**
     * <p>
     * The overall score of the contact evaluation.
     * </p>
     * 
     * @param score
     *        The overall score of the contact evaluation.
     */

    public void setScore(EvaluationScore score) {
        this.score = score;
    }

    /**
     * <p>
     * The overall score of the contact evaluation.
     * </p>
     * 
     * @return The overall score of the contact evaluation.
     */

    public EvaluationScore getScore() {
        return this.score;
    }

    /**
     * <p>
     * The overall score of the contact evaluation.
     * </p>
     * 
     * @param score
     *        The overall score of the contact evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationMetadata withScore(EvaluationScore score) {
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
        if (getContactId() != null)
            sb.append("ContactId: ").append(getContactId()).append(",");
        if (getEvaluatorArn() != null)
            sb.append("EvaluatorArn: ").append(getEvaluatorArn()).append(",");
        if (getContactAgentId() != null)
            sb.append("ContactAgentId: ").append(getContactAgentId()).append(",");
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

        if (obj instanceof EvaluationMetadata == false)
            return false;
        EvaluationMetadata other = (EvaluationMetadata) obj;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getEvaluatorArn() == null ^ this.getEvaluatorArn() == null)
            return false;
        if (other.getEvaluatorArn() != null && other.getEvaluatorArn().equals(this.getEvaluatorArn()) == false)
            return false;
        if (other.getContactAgentId() == null ^ this.getContactAgentId() == null)
            return false;
        if (other.getContactAgentId() != null && other.getContactAgentId().equals(this.getContactAgentId()) == false)
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

        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getEvaluatorArn() == null) ? 0 : getEvaluatorArn().hashCode());
        hashCode = prime * hashCode + ((getContactAgentId() == null) ? 0 : getContactAgentId().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationMetadata clone() {
        try {
            return (EvaluationMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

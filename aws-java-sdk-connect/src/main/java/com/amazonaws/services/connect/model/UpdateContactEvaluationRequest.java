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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactEvaluation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContactEvaluationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     */
    private String evaluationId;
    /**
     * <p>
     * A map of question identifiers to answer value.
     * </p>
     */
    private java.util.Map<String, EvaluationAnswerInput> answers;
    /**
     * <p>
     * A map of question identifiers to note value.
     * </p>
     */
    private java.util.Map<String, EvaluationNote> notes;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *         ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactEvaluationRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     * 
     * @param evaluationId
     *        A unique identifier for the contact evaluation.
     */

    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }

    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     * 
     * @return A unique identifier for the contact evaluation.
     */

    public String getEvaluationId() {
        return this.evaluationId;
    }

    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     * 
     * @param evaluationId
     *        A unique identifier for the contact evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactEvaluationRequest withEvaluationId(String evaluationId) {
        setEvaluationId(evaluationId);
        return this;
    }

    /**
     * <p>
     * A map of question identifiers to answer value.
     * </p>
     * 
     * @return A map of question identifiers to answer value.
     */

    public java.util.Map<String, EvaluationAnswerInput> getAnswers() {
        return answers;
    }

    /**
     * <p>
     * A map of question identifiers to answer value.
     * </p>
     * 
     * @param answers
     *        A map of question identifiers to answer value.
     */

    public void setAnswers(java.util.Map<String, EvaluationAnswerInput> answers) {
        this.answers = answers;
    }

    /**
     * <p>
     * A map of question identifiers to answer value.
     * </p>
     * 
     * @param answers
     *        A map of question identifiers to answer value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactEvaluationRequest withAnswers(java.util.Map<String, EvaluationAnswerInput> answers) {
        setAnswers(answers);
        return this;
    }

    /**
     * Add a single Answers entry
     *
     * @see UpdateContactEvaluationRequest#withAnswers
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactEvaluationRequest addAnswersEntry(String key, EvaluationAnswerInput value) {
        if (null == this.answers) {
            this.answers = new java.util.HashMap<String, EvaluationAnswerInput>();
        }
        if (this.answers.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.answers.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Answers.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactEvaluationRequest clearAnswersEntries() {
        this.answers = null;
        return this;
    }

    /**
     * <p>
     * A map of question identifiers to note value.
     * </p>
     * 
     * @return A map of question identifiers to note value.
     */

    public java.util.Map<String, EvaluationNote> getNotes() {
        return notes;
    }

    /**
     * <p>
     * A map of question identifiers to note value.
     * </p>
     * 
     * @param notes
     *        A map of question identifiers to note value.
     */

    public void setNotes(java.util.Map<String, EvaluationNote> notes) {
        this.notes = notes;
    }

    /**
     * <p>
     * A map of question identifiers to note value.
     * </p>
     * 
     * @param notes
     *        A map of question identifiers to note value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactEvaluationRequest withNotes(java.util.Map<String, EvaluationNote> notes) {
        setNotes(notes);
        return this;
    }

    /**
     * Add a single Notes entry
     *
     * @see UpdateContactEvaluationRequest#withNotes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactEvaluationRequest addNotesEntry(String key, EvaluationNote value) {
        if (null == this.notes) {
            this.notes = new java.util.HashMap<String, EvaluationNote>();
        }
        if (this.notes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.notes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Notes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactEvaluationRequest clearNotesEntries() {
        this.notes = null;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getEvaluationId() != null)
            sb.append("EvaluationId: ").append(getEvaluationId()).append(",");
        if (getAnswers() != null)
            sb.append("Answers: ").append(getAnswers()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContactEvaluationRequest == false)
            return false;
        UpdateContactEvaluationRequest other = (UpdateContactEvaluationRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getEvaluationId() == null ^ this.getEvaluationId() == null)
            return false;
        if (other.getEvaluationId() != null && other.getEvaluationId().equals(this.getEvaluationId()) == false)
            return false;
        if (other.getAnswers() == null ^ this.getAnswers() == null)
            return false;
        if (other.getAnswers() != null && other.getAnswers().equals(this.getAnswers()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getEvaluationId() == null) ? 0 : getEvaluationId().hashCode());
        hashCode = prime * hashCode + ((getAnswers() == null) ? 0 : getAnswers().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContactEvaluationRequest clone() {
        return (UpdateContactEvaluationRequest) super.clone();
    }

}

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
 * Information about a contact evaluation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Evaluation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Evaluation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     */
    private String evaluationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     */
    private String evaluationArn;
    /**
     * <p>
     * Metadata about the contact evaluation.
     * </p>
     */
    private EvaluationMetadata metadata;
    /**
     * <p>
     * A map of question identifiers to answer value.
     * </p>
     */
    private java.util.Map<String, EvaluationAnswerOutput> answers;
    /**
     * <p>
     * A map of question identifiers to note value.
     * </p>
     */
    private java.util.Map<String, EvaluationNote> notes;
    /**
     * <p>
     * The status of the contact evaluation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A map of item (section or question) identifiers to score value.
     * </p>
     */
    private java.util.Map<String, EvaluationScore> scores;
    /**
     * <p>
     * The timestamp for when the evaluation was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The timestamp for when the evaluation was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;

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

    public Evaluation withEvaluationId(String evaluationId) {
        setEvaluationId(evaluationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     * 
     * @param evaluationArn
     *        The Amazon Resource Name (ARN) for the contact evaluation resource.
     */

    public void setEvaluationArn(String evaluationArn) {
        this.evaluationArn = evaluationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the contact evaluation resource.
     */

    public String getEvaluationArn() {
        return this.evaluationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     * 
     * @param evaluationArn
     *        The Amazon Resource Name (ARN) for the contact evaluation resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withEvaluationArn(String evaluationArn) {
        setEvaluationArn(evaluationArn);
        return this;
    }

    /**
     * <p>
     * Metadata about the contact evaluation.
     * </p>
     * 
     * @param metadata
     *        Metadata about the contact evaluation.
     */

    public void setMetadata(EvaluationMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Metadata about the contact evaluation.
     * </p>
     * 
     * @return Metadata about the contact evaluation.
     */

    public EvaluationMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * Metadata about the contact evaluation.
     * </p>
     * 
     * @param metadata
     *        Metadata about the contact evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withMetadata(EvaluationMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * A map of question identifiers to answer value.
     * </p>
     * 
     * @return A map of question identifiers to answer value.
     */

    public java.util.Map<String, EvaluationAnswerOutput> getAnswers() {
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

    public void setAnswers(java.util.Map<String, EvaluationAnswerOutput> answers) {
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

    public Evaluation withAnswers(java.util.Map<String, EvaluationAnswerOutput> answers) {
        setAnswers(answers);
        return this;
    }

    /**
     * Add a single Answers entry
     *
     * @see Evaluation#withAnswers
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation addAnswersEntry(String key, EvaluationAnswerOutput value) {
        if (null == this.answers) {
            this.answers = new java.util.HashMap<String, EvaluationAnswerOutput>();
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

    public Evaluation clearAnswersEntries() {
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

    public Evaluation withNotes(java.util.Map<String, EvaluationNote> notes) {
        setNotes(notes);
        return this;
    }

    /**
     * Add a single Notes entry
     *
     * @see Evaluation#withNotes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation addNotesEntry(String key, EvaluationNote value) {
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

    public Evaluation clearNotesEntries() {
        this.notes = null;
        return this;
    }

    /**
     * <p>
     * The status of the contact evaluation.
     * </p>
     * 
     * @param status
     *        The status of the contact evaluation.
     * @see EvaluationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the contact evaluation.
     * </p>
     * 
     * @return The status of the contact evaluation.
     * @see EvaluationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the contact evaluation.
     * </p>
     * 
     * @param status
     *        The status of the contact evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationStatus
     */

    public Evaluation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the contact evaluation.
     * </p>
     * 
     * @param status
     *        The status of the contact evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationStatus
     */

    public Evaluation withStatus(EvaluationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A map of item (section or question) identifiers to score value.
     * </p>
     * 
     * @return A map of item (section or question) identifiers to score value.
     */

    public java.util.Map<String, EvaluationScore> getScores() {
        return scores;
    }

    /**
     * <p>
     * A map of item (section or question) identifiers to score value.
     * </p>
     * 
     * @param scores
     *        A map of item (section or question) identifiers to score value.
     */

    public void setScores(java.util.Map<String, EvaluationScore> scores) {
        this.scores = scores;
    }

    /**
     * <p>
     * A map of item (section or question) identifiers to score value.
     * </p>
     * 
     * @param scores
     *        A map of item (section or question) identifiers to score value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withScores(java.util.Map<String, EvaluationScore> scores) {
        setScores(scores);
        return this;
    }

    /**
     * Add a single Scores entry
     *
     * @see Evaluation#withScores
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation addScoresEntry(String key, EvaluationScore value) {
        if (null == this.scores) {
            this.scores = new java.util.HashMap<String, EvaluationScore>();
        }
        if (this.scores.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.scores.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Scores.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation clearScoresEntries() {
        this.scores = null;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the evaluation was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp for when the evaluation was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation was created.
     * </p>
     * 
     * @return The timestamp for when the evaluation was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp for when the evaluation was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the evaluation was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp for when the evaluation was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation was last updated.
     * </p>
     * 
     * @return The timestamp for when the evaluation was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp for when the evaluation was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource. For example, { "Tags":
     *         {"key1":"value1", "key2":"value2"} }.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "Tags":
     *        {"key1":"value1", "key2":"value2"} }.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "Tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Evaluation#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation clearTagsEntries() {
        this.tags = null;
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
        if (getEvaluationId() != null)
            sb.append("EvaluationId: ").append(getEvaluationId()).append(",");
        if (getEvaluationArn() != null)
            sb.append("EvaluationArn: ").append(getEvaluationArn()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getAnswers() != null)
            sb.append("Answers: ").append(getAnswers()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getScores() != null)
            sb.append("Scores: ").append(getScores()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Evaluation == false)
            return false;
        Evaluation other = (Evaluation) obj;
        if (other.getEvaluationId() == null ^ this.getEvaluationId() == null)
            return false;
        if (other.getEvaluationId() != null && other.getEvaluationId().equals(this.getEvaluationId()) == false)
            return false;
        if (other.getEvaluationArn() == null ^ this.getEvaluationArn() == null)
            return false;
        if (other.getEvaluationArn() != null && other.getEvaluationArn().equals(this.getEvaluationArn()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getAnswers() == null ^ this.getAnswers() == null)
            return false;
        if (other.getAnswers() != null && other.getAnswers().equals(this.getAnswers()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getScores() == null ^ this.getScores() == null)
            return false;
        if (other.getScores() != null && other.getScores().equals(this.getScores()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationId() == null) ? 0 : getEvaluationId().hashCode());
        hashCode = prime * hashCode + ((getEvaluationArn() == null) ? 0 : getEvaluationArn().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getAnswers() == null) ? 0 : getAnswers().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getScores() == null) ? 0 : getScores().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Evaluation clone() {
        try {
            return (Evaluation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

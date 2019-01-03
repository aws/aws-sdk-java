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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A collection of attributes that specify what findings you want to update.
     * </p>
     */
    private AwsSecurityFindingFilters filters;
    /**
     * <p>
     * The updated note for the finding.
     * </p>
     */
    private NoteUpdate note;
    /**
     * <p>
     * The updated record state for the finding.
     * </p>
     */
    private String recordState;

    /**
     * <p>
     * A collection of attributes that specify what findings you want to update.
     * </p>
     * 
     * @param filters
     *        A collection of attributes that specify what findings you want to update.
     */

    public void setFilters(AwsSecurityFindingFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * A collection of attributes that specify what findings you want to update.
     * </p>
     * 
     * @return A collection of attributes that specify what findings you want to update.
     */

    public AwsSecurityFindingFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * A collection of attributes that specify what findings you want to update.
     * </p>
     * 
     * @param filters
     *        A collection of attributes that specify what findings you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFindingsRequest withFilters(AwsSecurityFindingFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The updated note for the finding.
     * </p>
     * 
     * @param note
     *        The updated note for the finding.
     */

    public void setNote(NoteUpdate note) {
        this.note = note;
    }

    /**
     * <p>
     * The updated note for the finding.
     * </p>
     * 
     * @return The updated note for the finding.
     */

    public NoteUpdate getNote() {
        return this.note;
    }

    /**
     * <p>
     * The updated note for the finding.
     * </p>
     * 
     * @param note
     *        The updated note for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFindingsRequest withNote(NoteUpdate note) {
        setNote(note);
        return this;
    }

    /**
     * <p>
     * The updated record state for the finding.
     * </p>
     * 
     * @param recordState
     *        The updated record state for the finding.
     * @see RecordState
     */

    public void setRecordState(String recordState) {
        this.recordState = recordState;
    }

    /**
     * <p>
     * The updated record state for the finding.
     * </p>
     * 
     * @return The updated record state for the finding.
     * @see RecordState
     */

    public String getRecordState() {
        return this.recordState;
    }

    /**
     * <p>
     * The updated record state for the finding.
     * </p>
     * 
     * @param recordState
     *        The updated record state for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordState
     */

    public UpdateFindingsRequest withRecordState(String recordState) {
        setRecordState(recordState);
        return this;
    }

    /**
     * <p>
     * The updated record state for the finding.
     * </p>
     * 
     * @param recordState
     *        The updated record state for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordState
     */

    public UpdateFindingsRequest withRecordState(RecordState recordState) {
        this.recordState = recordState.toString();
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNote() != null)
            sb.append("Note: ").append(getNote()).append(",");
        if (getRecordState() != null)
            sb.append("RecordState: ").append(getRecordState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFindingsRequest == false)
            return false;
        UpdateFindingsRequest other = (UpdateFindingsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNote() == null ^ this.getNote() == null)
            return false;
        if (other.getNote() != null && other.getNote().equals(this.getNote()) == false)
            return false;
        if (other.getRecordState() == null ^ this.getRecordState() == null)
            return false;
        if (other.getRecordState() != null && other.getRecordState().equals(this.getRecordState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNote() == null) ? 0 : getNote().hashCode());
        hashCode = prime * hashCode + ((getRecordState() == null) ? 0 : getRecordState().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFindingsRequest clone() {
        return (UpdateFindingsRequest) super.clone();
    }

}

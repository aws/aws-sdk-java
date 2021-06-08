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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for update lens review.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateLensReview" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLensReviewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String workloadId;

    private String lensAlias;

    private String lensNotes;

    private java.util.Map<String, String> pillarNotes;

    /**
     * @param workloadId
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * @return
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @param workloadId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLensReviewRequest withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * @param lensAlias
     */

    public void setLensAlias(String lensAlias) {
        this.lensAlias = lensAlias;
    }

    /**
     * @return
     */

    public String getLensAlias() {
        return this.lensAlias;
    }

    /**
     * @param lensAlias
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLensReviewRequest withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

    /**
     * @param lensNotes
     */

    public void setLensNotes(String lensNotes) {
        this.lensNotes = lensNotes;
    }

    /**
     * @return
     */

    public String getLensNotes() {
        return this.lensNotes;
    }

    /**
     * @param lensNotes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLensReviewRequest withLensNotes(String lensNotes) {
        setLensNotes(lensNotes);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getPillarNotes() {
        return pillarNotes;
    }

    /**
     * @param pillarNotes
     */

    public void setPillarNotes(java.util.Map<String, String> pillarNotes) {
        this.pillarNotes = pillarNotes;
    }

    /**
     * @param pillarNotes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLensReviewRequest withPillarNotes(java.util.Map<String, String> pillarNotes) {
        setPillarNotes(pillarNotes);
        return this;
    }

    /**
     * Add a single PillarNotes entry
     *
     * @see UpdateLensReviewRequest#withPillarNotes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLensReviewRequest addPillarNotesEntry(String key, String value) {
        if (null == this.pillarNotes) {
            this.pillarNotes = new java.util.HashMap<String, String>();
        }
        if (this.pillarNotes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.pillarNotes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PillarNotes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLensReviewRequest clearPillarNotesEntries() {
        this.pillarNotes = null;
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
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getLensAlias() != null)
            sb.append("LensAlias: ").append(getLensAlias()).append(",");
        if (getLensNotes() != null)
            sb.append("LensNotes: ").append(getLensNotes()).append(",");
        if (getPillarNotes() != null)
            sb.append("PillarNotes: ").append(getPillarNotes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLensReviewRequest == false)
            return false;
        UpdateLensReviewRequest other = (UpdateLensReviewRequest) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getLensNotes() == null ^ this.getLensNotes() == null)
            return false;
        if (other.getLensNotes() != null && other.getLensNotes().equals(this.getLensNotes()) == false)
            return false;
        if (other.getPillarNotes() == null ^ this.getPillarNotes() == null)
            return false;
        if (other.getPillarNotes() != null && other.getPillarNotes().equals(this.getPillarNotes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getLensNotes() == null) ? 0 : getLensNotes().hashCode());
        hashCode = prime * hashCode + ((getPillarNotes() == null) ? 0 : getPillarNotes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLensReviewRequest clone() {
        return (UpdateLensReviewRequest) super.clone();
    }

}

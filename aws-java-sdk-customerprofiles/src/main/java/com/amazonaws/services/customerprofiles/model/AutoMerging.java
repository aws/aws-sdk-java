/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration settings for how to perform the auto-merging of profiles.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/AutoMerging" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMerging implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The flag that enables the auto-merging of duplicate profiles.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * A list of matching attributes that represent matching criteria. If two profiles meet at least one of the
     * requirements in the matching attributes list, they will be merged.
     * </p>
     */
    private Consolidation consolidation;
    /**
     * <p>
     * How the auto-merging process should resolve conflicts between different profiles. For example, if Profile A and
     * Profile B have the same <code>FirstName</code> and <code>LastName</code> (and that is the matching criteria),
     * which <code>EmailAddress</code> should be used?
     * </p>
     */
    private ConflictResolution conflictResolution;
    /**
     * <p>
     * A number between 0 and 1 that represents the minimum confidence score required for profiles within a matching
     * group to be merged during the auto-merge process. A higher score means higher similarity required to merge
     * profiles.
     * </p>
     */
    private Double minAllowedConfidenceScoreForMerging;

    /**
     * <p>
     * The flag that enables the auto-merging of duplicate profiles.
     * </p>
     * 
     * @param enabled
     *        The flag that enables the auto-merging of duplicate profiles.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * The flag that enables the auto-merging of duplicate profiles.
     * </p>
     * 
     * @return The flag that enables the auto-merging of duplicate profiles.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The flag that enables the auto-merging of duplicate profiles.
     * </p>
     * 
     * @param enabled
     *        The flag that enables the auto-merging of duplicate profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMerging withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * The flag that enables the auto-merging of duplicate profiles.
     * </p>
     * 
     * @return The flag that enables the auto-merging of duplicate profiles.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A list of matching attributes that represent matching criteria. If two profiles meet at least one of the
     * requirements in the matching attributes list, they will be merged.
     * </p>
     * 
     * @param consolidation
     *        A list of matching attributes that represent matching criteria. If two profiles meet at least one of the
     *        requirements in the matching attributes list, they will be merged.
     */

    public void setConsolidation(Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    /**
     * <p>
     * A list of matching attributes that represent matching criteria. If two profiles meet at least one of the
     * requirements in the matching attributes list, they will be merged.
     * </p>
     * 
     * @return A list of matching attributes that represent matching criteria. If two profiles meet at least one of the
     *         requirements in the matching attributes list, they will be merged.
     */

    public Consolidation getConsolidation() {
        return this.consolidation;
    }

    /**
     * <p>
     * A list of matching attributes that represent matching criteria. If two profiles meet at least one of the
     * requirements in the matching attributes list, they will be merged.
     * </p>
     * 
     * @param consolidation
     *        A list of matching attributes that represent matching criteria. If two profiles meet at least one of the
     *        requirements in the matching attributes list, they will be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMerging withConsolidation(Consolidation consolidation) {
        setConsolidation(consolidation);
        return this;
    }

    /**
     * <p>
     * How the auto-merging process should resolve conflicts between different profiles. For example, if Profile A and
     * Profile B have the same <code>FirstName</code> and <code>LastName</code> (and that is the matching criteria),
     * which <code>EmailAddress</code> should be used?
     * </p>
     * 
     * @param conflictResolution
     *        How the auto-merging process should resolve conflicts between different profiles. For example, if Profile
     *        A and Profile B have the same <code>FirstName</code> and <code>LastName</code> (and that is the matching
     *        criteria), which <code>EmailAddress</code> should be used?
     */

    public void setConflictResolution(ConflictResolution conflictResolution) {
        this.conflictResolution = conflictResolution;
    }

    /**
     * <p>
     * How the auto-merging process should resolve conflicts between different profiles. For example, if Profile A and
     * Profile B have the same <code>FirstName</code> and <code>LastName</code> (and that is the matching criteria),
     * which <code>EmailAddress</code> should be used?
     * </p>
     * 
     * @return How the auto-merging process should resolve conflicts between different profiles. For example, if Profile
     *         A and Profile B have the same <code>FirstName</code> and <code>LastName</code> (and that is the matching
     *         criteria), which <code>EmailAddress</code> should be used?
     */

    public ConflictResolution getConflictResolution() {
        return this.conflictResolution;
    }

    /**
     * <p>
     * How the auto-merging process should resolve conflicts between different profiles. For example, if Profile A and
     * Profile B have the same <code>FirstName</code> and <code>LastName</code> (and that is the matching criteria),
     * which <code>EmailAddress</code> should be used?
     * </p>
     * 
     * @param conflictResolution
     *        How the auto-merging process should resolve conflicts between different profiles. For example, if Profile
     *        A and Profile B have the same <code>FirstName</code> and <code>LastName</code> (and that is the matching
     *        criteria), which <code>EmailAddress</code> should be used?
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMerging withConflictResolution(ConflictResolution conflictResolution) {
        setConflictResolution(conflictResolution);
        return this;
    }

    /**
     * <p>
     * A number between 0 and 1 that represents the minimum confidence score required for profiles within a matching
     * group to be merged during the auto-merge process. A higher score means higher similarity required to merge
     * profiles.
     * </p>
     * 
     * @param minAllowedConfidenceScoreForMerging
     *        A number between 0 and 1 that represents the minimum confidence score required for profiles within a
     *        matching group to be merged during the auto-merge process. A higher score means higher similarity required
     *        to merge profiles.
     */

    public void setMinAllowedConfidenceScoreForMerging(Double minAllowedConfidenceScoreForMerging) {
        this.minAllowedConfidenceScoreForMerging = minAllowedConfidenceScoreForMerging;
    }

    /**
     * <p>
     * A number between 0 and 1 that represents the minimum confidence score required for profiles within a matching
     * group to be merged during the auto-merge process. A higher score means higher similarity required to merge
     * profiles.
     * </p>
     * 
     * @return A number between 0 and 1 that represents the minimum confidence score required for profiles within a
     *         matching group to be merged during the auto-merge process. A higher score means higher similarity
     *         required to merge profiles.
     */

    public Double getMinAllowedConfidenceScoreForMerging() {
        return this.minAllowedConfidenceScoreForMerging;
    }

    /**
     * <p>
     * A number between 0 and 1 that represents the minimum confidence score required for profiles within a matching
     * group to be merged during the auto-merge process. A higher score means higher similarity required to merge
     * profiles.
     * </p>
     * 
     * @param minAllowedConfidenceScoreForMerging
     *        A number between 0 and 1 that represents the minimum confidence score required for profiles within a
     *        matching group to be merged during the auto-merge process. A higher score means higher similarity required
     *        to merge profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMerging withMinAllowedConfidenceScoreForMerging(Double minAllowedConfidenceScoreForMerging) {
        setMinAllowedConfidenceScoreForMerging(minAllowedConfidenceScoreForMerging);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getConsolidation() != null)
            sb.append("Consolidation: ").append(getConsolidation()).append(",");
        if (getConflictResolution() != null)
            sb.append("ConflictResolution: ").append(getConflictResolution()).append(",");
        if (getMinAllowedConfidenceScoreForMerging() != null)
            sb.append("MinAllowedConfidenceScoreForMerging: ").append(getMinAllowedConfidenceScoreForMerging());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMerging == false)
            return false;
        AutoMerging other = (AutoMerging) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getConsolidation() == null ^ this.getConsolidation() == null)
            return false;
        if (other.getConsolidation() != null && other.getConsolidation().equals(this.getConsolidation()) == false)
            return false;
        if (other.getConflictResolution() == null ^ this.getConflictResolution() == null)
            return false;
        if (other.getConflictResolution() != null && other.getConflictResolution().equals(this.getConflictResolution()) == false)
            return false;
        if (other.getMinAllowedConfidenceScoreForMerging() == null ^ this.getMinAllowedConfidenceScoreForMerging() == null)
            return false;
        if (other.getMinAllowedConfidenceScoreForMerging() != null
                && other.getMinAllowedConfidenceScoreForMerging().equals(this.getMinAllowedConfidenceScoreForMerging()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getConsolidation() == null) ? 0 : getConsolidation().hashCode());
        hashCode = prime * hashCode + ((getConflictResolution() == null) ? 0 : getConflictResolution().hashCode());
        hashCode = prime * hashCode + ((getMinAllowedConfidenceScoreForMerging() == null) ? 0 : getMinAllowedConfidenceScoreForMerging().hashCode());
        return hashCode;
    }

    @Override
    public AutoMerging clone() {
        try {
            return (AutoMerging) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.AutoMergingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

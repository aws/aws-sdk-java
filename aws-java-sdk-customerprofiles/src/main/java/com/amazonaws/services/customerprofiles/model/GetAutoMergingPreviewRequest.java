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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetAutoMergingPreview"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAutoMergingPreviewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A list of matching attributes that represent matching criteria.
     * </p>
     */
    private Consolidation consolidation;
    /**
     * <p>
     * How the auto-merging process should resolve conflicts between different profiles.
     * </p>
     */
    private ConflictResolution conflictResolution;
    /**
     * <p>
     * Minimum confidence score required for profiles within a matching group to be merged during the auto-merge
     * process.
     * </p>
     */
    private Double minAllowedConfidenceScoreForMerging;

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoMergingPreviewRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A list of matching attributes that represent matching criteria.
     * </p>
     * 
     * @param consolidation
     *        A list of matching attributes that represent matching criteria.
     */

    public void setConsolidation(Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    /**
     * <p>
     * A list of matching attributes that represent matching criteria.
     * </p>
     * 
     * @return A list of matching attributes that represent matching criteria.
     */

    public Consolidation getConsolidation() {
        return this.consolidation;
    }

    /**
     * <p>
     * A list of matching attributes that represent matching criteria.
     * </p>
     * 
     * @param consolidation
     *        A list of matching attributes that represent matching criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoMergingPreviewRequest withConsolidation(Consolidation consolidation) {
        setConsolidation(consolidation);
        return this;
    }

    /**
     * <p>
     * How the auto-merging process should resolve conflicts between different profiles.
     * </p>
     * 
     * @param conflictResolution
     *        How the auto-merging process should resolve conflicts between different profiles.
     */

    public void setConflictResolution(ConflictResolution conflictResolution) {
        this.conflictResolution = conflictResolution;
    }

    /**
     * <p>
     * How the auto-merging process should resolve conflicts between different profiles.
     * </p>
     * 
     * @return How the auto-merging process should resolve conflicts between different profiles.
     */

    public ConflictResolution getConflictResolution() {
        return this.conflictResolution;
    }

    /**
     * <p>
     * How the auto-merging process should resolve conflicts between different profiles.
     * </p>
     * 
     * @param conflictResolution
     *        How the auto-merging process should resolve conflicts between different profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoMergingPreviewRequest withConflictResolution(ConflictResolution conflictResolution) {
        setConflictResolution(conflictResolution);
        return this;
    }

    /**
     * <p>
     * Minimum confidence score required for profiles within a matching group to be merged during the auto-merge
     * process.
     * </p>
     * 
     * @param minAllowedConfidenceScoreForMerging
     *        Minimum confidence score required for profiles within a matching group to be merged during the auto-merge
     *        process.
     */

    public void setMinAllowedConfidenceScoreForMerging(Double minAllowedConfidenceScoreForMerging) {
        this.minAllowedConfidenceScoreForMerging = minAllowedConfidenceScoreForMerging;
    }

    /**
     * <p>
     * Minimum confidence score required for profiles within a matching group to be merged during the auto-merge
     * process.
     * </p>
     * 
     * @return Minimum confidence score required for profiles within a matching group to be merged during the auto-merge
     *         process.
     */

    public Double getMinAllowedConfidenceScoreForMerging() {
        return this.minAllowedConfidenceScoreForMerging;
    }

    /**
     * <p>
     * Minimum confidence score required for profiles within a matching group to be merged during the auto-merge
     * process.
     * </p>
     * 
     * @param minAllowedConfidenceScoreForMerging
     *        Minimum confidence score required for profiles within a matching group to be merged during the auto-merge
     *        process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoMergingPreviewRequest withMinAllowedConfidenceScoreForMerging(Double minAllowedConfidenceScoreForMerging) {
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
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

        if (obj instanceof GetAutoMergingPreviewRequest == false)
            return false;
        GetAutoMergingPreviewRequest other = (GetAutoMergingPreviewRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
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

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getConsolidation() == null) ? 0 : getConsolidation().hashCode());
        hashCode = prime * hashCode + ((getConflictResolution() == null) ? 0 : getConflictResolution().hashCode());
        hashCode = prime * hashCode + ((getMinAllowedConfidenceScoreForMerging() == null) ? 0 : getMinAllowedConfidenceScoreForMerging().hashCode());
        return hashCode;
    }

    @Override
    public GetAutoMergingPreviewRequest clone() {
        return (GetAutoMergingPreviewRequest) super.clone();
    }

}

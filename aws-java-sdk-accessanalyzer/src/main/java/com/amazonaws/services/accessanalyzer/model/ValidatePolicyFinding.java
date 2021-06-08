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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A finding in a policy. Each finding is an actionable recommendation that can be used to improve the policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ValidatePolicyFinding"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidatePolicyFinding implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A localized message that explains the finding and provides guidance on how to address it.
     * </p>
     */
    private String findingDetails;
    /**
     * <p>
     * The impact of the finding.
     * </p>
     * <p>
     * Security warnings report when the policy allows access that we consider overly permissive.
     * </p>
     * <p>
     * Errors report when a part of the policy is not functional.
     * </p>
     * <p>
     * Warnings report non-security issues when a policy does not conform to policy writing best practices.
     * </p>
     * <p>
     * Suggestions recommend stylistic improvements in the policy that do not impact access.
     * </p>
     */
    private String findingType;
    /**
     * <p>
     * The issue code provides an identifier of the issue associated with this finding.
     * </p>
     */
    private String issueCode;
    /**
     * <p>
     * A link to additional documentation about the type of finding.
     * </p>
     */
    private String learnMoreLink;
    /**
     * <p>
     * The list of locations in the policy document that are related to the finding. The issue code provides a summary
     * of an issue identified by the finding.
     * </p>
     */
    private java.util.List<Location> locations;

    /**
     * <p>
     * A localized message that explains the finding and provides guidance on how to address it.
     * </p>
     * 
     * @param findingDetails
     *        A localized message that explains the finding and provides guidance on how to address it.
     */

    public void setFindingDetails(String findingDetails) {
        this.findingDetails = findingDetails;
    }

    /**
     * <p>
     * A localized message that explains the finding and provides guidance on how to address it.
     * </p>
     * 
     * @return A localized message that explains the finding and provides guidance on how to address it.
     */

    public String getFindingDetails() {
        return this.findingDetails;
    }

    /**
     * <p>
     * A localized message that explains the finding and provides guidance on how to address it.
     * </p>
     * 
     * @param findingDetails
     *        A localized message that explains the finding and provides guidance on how to address it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePolicyFinding withFindingDetails(String findingDetails) {
        setFindingDetails(findingDetails);
        return this;
    }

    /**
     * <p>
     * The impact of the finding.
     * </p>
     * <p>
     * Security warnings report when the policy allows access that we consider overly permissive.
     * </p>
     * <p>
     * Errors report when a part of the policy is not functional.
     * </p>
     * <p>
     * Warnings report non-security issues when a policy does not conform to policy writing best practices.
     * </p>
     * <p>
     * Suggestions recommend stylistic improvements in the policy that do not impact access.
     * </p>
     * 
     * @param findingType
     *        The impact of the finding.</p>
     *        <p>
     *        Security warnings report when the policy allows access that we consider overly permissive.
     *        </p>
     *        <p>
     *        Errors report when a part of the policy is not functional.
     *        </p>
     *        <p>
     *        Warnings report non-security issues when a policy does not conform to policy writing best practices.
     *        </p>
     *        <p>
     *        Suggestions recommend stylistic improvements in the policy that do not impact access.
     * @see ValidatePolicyFindingType
     */

    public void setFindingType(String findingType) {
        this.findingType = findingType;
    }

    /**
     * <p>
     * The impact of the finding.
     * </p>
     * <p>
     * Security warnings report when the policy allows access that we consider overly permissive.
     * </p>
     * <p>
     * Errors report when a part of the policy is not functional.
     * </p>
     * <p>
     * Warnings report non-security issues when a policy does not conform to policy writing best practices.
     * </p>
     * <p>
     * Suggestions recommend stylistic improvements in the policy that do not impact access.
     * </p>
     * 
     * @return The impact of the finding.</p>
     *         <p>
     *         Security warnings report when the policy allows access that we consider overly permissive.
     *         </p>
     *         <p>
     *         Errors report when a part of the policy is not functional.
     *         </p>
     *         <p>
     *         Warnings report non-security issues when a policy does not conform to policy writing best practices.
     *         </p>
     *         <p>
     *         Suggestions recommend stylistic improvements in the policy that do not impact access.
     * @see ValidatePolicyFindingType
     */

    public String getFindingType() {
        return this.findingType;
    }

    /**
     * <p>
     * The impact of the finding.
     * </p>
     * <p>
     * Security warnings report when the policy allows access that we consider overly permissive.
     * </p>
     * <p>
     * Errors report when a part of the policy is not functional.
     * </p>
     * <p>
     * Warnings report non-security issues when a policy does not conform to policy writing best practices.
     * </p>
     * <p>
     * Suggestions recommend stylistic improvements in the policy that do not impact access.
     * </p>
     * 
     * @param findingType
     *        The impact of the finding.</p>
     *        <p>
     *        Security warnings report when the policy allows access that we consider overly permissive.
     *        </p>
     *        <p>
     *        Errors report when a part of the policy is not functional.
     *        </p>
     *        <p>
     *        Warnings report non-security issues when a policy does not conform to policy writing best practices.
     *        </p>
     *        <p>
     *        Suggestions recommend stylistic improvements in the policy that do not impact access.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidatePolicyFindingType
     */

    public ValidatePolicyFinding withFindingType(String findingType) {
        setFindingType(findingType);
        return this;
    }

    /**
     * <p>
     * The impact of the finding.
     * </p>
     * <p>
     * Security warnings report when the policy allows access that we consider overly permissive.
     * </p>
     * <p>
     * Errors report when a part of the policy is not functional.
     * </p>
     * <p>
     * Warnings report non-security issues when a policy does not conform to policy writing best practices.
     * </p>
     * <p>
     * Suggestions recommend stylistic improvements in the policy that do not impact access.
     * </p>
     * 
     * @param findingType
     *        The impact of the finding.</p>
     *        <p>
     *        Security warnings report when the policy allows access that we consider overly permissive.
     *        </p>
     *        <p>
     *        Errors report when a part of the policy is not functional.
     *        </p>
     *        <p>
     *        Warnings report non-security issues when a policy does not conform to policy writing best practices.
     *        </p>
     *        <p>
     *        Suggestions recommend stylistic improvements in the policy that do not impact access.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidatePolicyFindingType
     */

    public ValidatePolicyFinding withFindingType(ValidatePolicyFindingType findingType) {
        this.findingType = findingType.toString();
        return this;
    }

    /**
     * <p>
     * The issue code provides an identifier of the issue associated with this finding.
     * </p>
     * 
     * @param issueCode
     *        The issue code provides an identifier of the issue associated with this finding.
     */

    public void setIssueCode(String issueCode) {
        this.issueCode = issueCode;
    }

    /**
     * <p>
     * The issue code provides an identifier of the issue associated with this finding.
     * </p>
     * 
     * @return The issue code provides an identifier of the issue associated with this finding.
     */

    public String getIssueCode() {
        return this.issueCode;
    }

    /**
     * <p>
     * The issue code provides an identifier of the issue associated with this finding.
     * </p>
     * 
     * @param issueCode
     *        The issue code provides an identifier of the issue associated with this finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePolicyFinding withIssueCode(String issueCode) {
        setIssueCode(issueCode);
        return this;
    }

    /**
     * <p>
     * A link to additional documentation about the type of finding.
     * </p>
     * 
     * @param learnMoreLink
     *        A link to additional documentation about the type of finding.
     */

    public void setLearnMoreLink(String learnMoreLink) {
        this.learnMoreLink = learnMoreLink;
    }

    /**
     * <p>
     * A link to additional documentation about the type of finding.
     * </p>
     * 
     * @return A link to additional documentation about the type of finding.
     */

    public String getLearnMoreLink() {
        return this.learnMoreLink;
    }

    /**
     * <p>
     * A link to additional documentation about the type of finding.
     * </p>
     * 
     * @param learnMoreLink
     *        A link to additional documentation about the type of finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePolicyFinding withLearnMoreLink(String learnMoreLink) {
        setLearnMoreLink(learnMoreLink);
        return this;
    }

    /**
     * <p>
     * The list of locations in the policy document that are related to the finding. The issue code provides a summary
     * of an issue identified by the finding.
     * </p>
     * 
     * @return The list of locations in the policy document that are related to the finding. The issue code provides a
     *         summary of an issue identified by the finding.
     */

    public java.util.List<Location> getLocations() {
        return locations;
    }

    /**
     * <p>
     * The list of locations in the policy document that are related to the finding. The issue code provides a summary
     * of an issue identified by the finding.
     * </p>
     * 
     * @param locations
     *        The list of locations in the policy document that are related to the finding. The issue code provides a
     *        summary of an issue identified by the finding.
     */

    public void setLocations(java.util.Collection<Location> locations) {
        if (locations == null) {
            this.locations = null;
            return;
        }

        this.locations = new java.util.ArrayList<Location>(locations);
    }

    /**
     * <p>
     * The list of locations in the policy document that are related to the finding. The issue code provides a summary
     * of an issue identified by the finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocations(java.util.Collection)} or {@link #withLocations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param locations
     *        The list of locations in the policy document that are related to the finding. The issue code provides a
     *        summary of an issue identified by the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePolicyFinding withLocations(Location... locations) {
        if (this.locations == null) {
            setLocations(new java.util.ArrayList<Location>(locations.length));
        }
        for (Location ele : locations) {
            this.locations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of locations in the policy document that are related to the finding. The issue code provides a summary
     * of an issue identified by the finding.
     * </p>
     * 
     * @param locations
     *        The list of locations in the policy document that are related to the finding. The issue code provides a
     *        summary of an issue identified by the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePolicyFinding withLocations(java.util.Collection<Location> locations) {
        setLocations(locations);
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
        if (getFindingDetails() != null)
            sb.append("FindingDetails: ").append(getFindingDetails()).append(",");
        if (getFindingType() != null)
            sb.append("FindingType: ").append(getFindingType()).append(",");
        if (getIssueCode() != null)
            sb.append("IssueCode: ").append(getIssueCode()).append(",");
        if (getLearnMoreLink() != null)
            sb.append("LearnMoreLink: ").append(getLearnMoreLink()).append(",");
        if (getLocations() != null)
            sb.append("Locations: ").append(getLocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidatePolicyFinding == false)
            return false;
        ValidatePolicyFinding other = (ValidatePolicyFinding) obj;
        if (other.getFindingDetails() == null ^ this.getFindingDetails() == null)
            return false;
        if (other.getFindingDetails() != null && other.getFindingDetails().equals(this.getFindingDetails()) == false)
            return false;
        if (other.getFindingType() == null ^ this.getFindingType() == null)
            return false;
        if (other.getFindingType() != null && other.getFindingType().equals(this.getFindingType()) == false)
            return false;
        if (other.getIssueCode() == null ^ this.getIssueCode() == null)
            return false;
        if (other.getIssueCode() != null && other.getIssueCode().equals(this.getIssueCode()) == false)
            return false;
        if (other.getLearnMoreLink() == null ^ this.getLearnMoreLink() == null)
            return false;
        if (other.getLearnMoreLink() != null && other.getLearnMoreLink().equals(this.getLearnMoreLink()) == false)
            return false;
        if (other.getLocations() == null ^ this.getLocations() == null)
            return false;
        if (other.getLocations() != null && other.getLocations().equals(this.getLocations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingDetails() == null) ? 0 : getFindingDetails().hashCode());
        hashCode = prime * hashCode + ((getFindingType() == null) ? 0 : getFindingType().hashCode());
        hashCode = prime * hashCode + ((getIssueCode() == null) ? 0 : getIssueCode().hashCode());
        hashCode = prime * hashCode + ((getLearnMoreLink() == null) ? 0 : getLearnMoreLink().hashCode());
        hashCode = prime * hashCode + ((getLocations() == null) ? 0 : getLocations().hashCode());
        return hashCode;
    }

    @Override
    public ValidatePolicyFinding clone() {
        try {
            return (ValidatePolicyFinding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.ValidatePolicyFindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

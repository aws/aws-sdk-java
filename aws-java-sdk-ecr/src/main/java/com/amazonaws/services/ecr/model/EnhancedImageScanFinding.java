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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an enhanced image scan. This is returned when enhanced scanning is enabled for your private registry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/EnhancedImageScanFinding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnhancedImageScanFinding implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID associated with the image.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The description of the finding.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the finding.
     * </p>
     */
    private String findingArn;
    /**
     * <p>
     * The date and time that the finding was first observed.
     * </p>
     */
    private java.util.Date firstObservedAt;
    /**
     * <p>
     * The date and time that the finding was last observed.
     * </p>
     */
    private java.util.Date lastObservedAt;
    /**
     * <p>
     * An object that contains the details of a package vulnerability finding.
     * </p>
     */
    private PackageVulnerabilityDetails packageVulnerabilityDetails;
    /**
     * <p>
     * An object that contains the details about how to remediate a finding.
     * </p>
     */
    private Remediation remediation;
    /**
     * <p>
     * Contains information on the resources involved in a finding.
     * </p>
     */
    private java.util.List<Resource> resources;
    /**
     * <p>
     * The Amazon Inspector score given to the finding.
     * </p>
     */
    private Double score;
    /**
     * <p>
     * An object that contains details of the Amazon Inspector score.
     * </p>
     */
    private ScoreDetails scoreDetails;
    /**
     * <p>
     * The severity of the finding.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The status of the finding.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The title of the finding.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The type of the finding.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The date and time the finding was last updated at.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Web Services account ID associated with the image.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID associated with the image.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the image.
     * </p>
     * 
     * @return The Amazon Web Services account ID associated with the image.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the image.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID associated with the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @param description
     *        The description of the finding.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @return The description of the finding.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @param description
     *        The description of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the finding.
     * </p>
     * 
     * @param findingArn
     *        The Amazon Resource Number (ARN) of the finding.
     */

    public void setFindingArn(String findingArn) {
        this.findingArn = findingArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the finding.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the finding.
     */

    public String getFindingArn() {
        return this.findingArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the finding.
     * </p>
     * 
     * @param findingArn
     *        The Amazon Resource Number (ARN) of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withFindingArn(String findingArn) {
        setFindingArn(findingArn);
        return this;
    }

    /**
     * <p>
     * The date and time that the finding was first observed.
     * </p>
     * 
     * @param firstObservedAt
     *        The date and time that the finding was first observed.
     */

    public void setFirstObservedAt(java.util.Date firstObservedAt) {
        this.firstObservedAt = firstObservedAt;
    }

    /**
     * <p>
     * The date and time that the finding was first observed.
     * </p>
     * 
     * @return The date and time that the finding was first observed.
     */

    public java.util.Date getFirstObservedAt() {
        return this.firstObservedAt;
    }

    /**
     * <p>
     * The date and time that the finding was first observed.
     * </p>
     * 
     * @param firstObservedAt
     *        The date and time that the finding was first observed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withFirstObservedAt(java.util.Date firstObservedAt) {
        setFirstObservedAt(firstObservedAt);
        return this;
    }

    /**
     * <p>
     * The date and time that the finding was last observed.
     * </p>
     * 
     * @param lastObservedAt
     *        The date and time that the finding was last observed.
     */

    public void setLastObservedAt(java.util.Date lastObservedAt) {
        this.lastObservedAt = lastObservedAt;
    }

    /**
     * <p>
     * The date and time that the finding was last observed.
     * </p>
     * 
     * @return The date and time that the finding was last observed.
     */

    public java.util.Date getLastObservedAt() {
        return this.lastObservedAt;
    }

    /**
     * <p>
     * The date and time that the finding was last observed.
     * </p>
     * 
     * @param lastObservedAt
     *        The date and time that the finding was last observed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withLastObservedAt(java.util.Date lastObservedAt) {
        setLastObservedAt(lastObservedAt);
        return this;
    }

    /**
     * <p>
     * An object that contains the details of a package vulnerability finding.
     * </p>
     * 
     * @param packageVulnerabilityDetails
     *        An object that contains the details of a package vulnerability finding.
     */

    public void setPackageVulnerabilityDetails(PackageVulnerabilityDetails packageVulnerabilityDetails) {
        this.packageVulnerabilityDetails = packageVulnerabilityDetails;
    }

    /**
     * <p>
     * An object that contains the details of a package vulnerability finding.
     * </p>
     * 
     * @return An object that contains the details of a package vulnerability finding.
     */

    public PackageVulnerabilityDetails getPackageVulnerabilityDetails() {
        return this.packageVulnerabilityDetails;
    }

    /**
     * <p>
     * An object that contains the details of a package vulnerability finding.
     * </p>
     * 
     * @param packageVulnerabilityDetails
     *        An object that contains the details of a package vulnerability finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withPackageVulnerabilityDetails(PackageVulnerabilityDetails packageVulnerabilityDetails) {
        setPackageVulnerabilityDetails(packageVulnerabilityDetails);
        return this;
    }

    /**
     * <p>
     * An object that contains the details about how to remediate a finding.
     * </p>
     * 
     * @param remediation
     *        An object that contains the details about how to remediate a finding.
     */

    public void setRemediation(Remediation remediation) {
        this.remediation = remediation;
    }

    /**
     * <p>
     * An object that contains the details about how to remediate a finding.
     * </p>
     * 
     * @return An object that contains the details about how to remediate a finding.
     */

    public Remediation getRemediation() {
        return this.remediation;
    }

    /**
     * <p>
     * An object that contains the details about how to remediate a finding.
     * </p>
     * 
     * @param remediation
     *        An object that contains the details about how to remediate a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withRemediation(Remediation remediation) {
        setRemediation(remediation);
        return this;
    }

    /**
     * <p>
     * Contains information on the resources involved in a finding.
     * </p>
     * 
     * @return Contains information on the resources involved in a finding.
     */

    public java.util.List<Resource> getResources() {
        return resources;
    }

    /**
     * <p>
     * Contains information on the resources involved in a finding.
     * </p>
     * 
     * @param resources
     *        Contains information on the resources involved in a finding.
     */

    public void setResources(java.util.Collection<Resource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<Resource>(resources);
    }

    /**
     * <p>
     * Contains information on the resources involved in a finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        Contains information on the resources involved in a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withResources(Resource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<Resource>(resources.length));
        }
        for (Resource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information on the resources involved in a finding.
     * </p>
     * 
     * @param resources
     *        Contains information on the resources involved in a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withResources(java.util.Collection<Resource> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The Amazon Inspector score given to the finding.
     * </p>
     * 
     * @param score
     *        The Amazon Inspector score given to the finding.
     */

    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * <p>
     * The Amazon Inspector score given to the finding.
     * </p>
     * 
     * @return The Amazon Inspector score given to the finding.
     */

    public Double getScore() {
        return this.score;
    }

    /**
     * <p>
     * The Amazon Inspector score given to the finding.
     * </p>
     * 
     * @param score
     *        The Amazon Inspector score given to the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withScore(Double score) {
        setScore(score);
        return this;
    }

    /**
     * <p>
     * An object that contains details of the Amazon Inspector score.
     * </p>
     * 
     * @param scoreDetails
     *        An object that contains details of the Amazon Inspector score.
     */

    public void setScoreDetails(ScoreDetails scoreDetails) {
        this.scoreDetails = scoreDetails;
    }

    /**
     * <p>
     * An object that contains details of the Amazon Inspector score.
     * </p>
     * 
     * @return An object that contains details of the Amazon Inspector score.
     */

    public ScoreDetails getScoreDetails() {
        return this.scoreDetails;
    }

    /**
     * <p>
     * An object that contains details of the Amazon Inspector score.
     * </p>
     * 
     * @param scoreDetails
     *        An object that contains details of the Amazon Inspector score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withScoreDetails(ScoreDetails scoreDetails) {
        setScoreDetails(scoreDetails);
        return this;
    }

    /**
     * <p>
     * The severity of the finding.
     * </p>
     * 
     * @param severity
     *        The severity of the finding.
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the finding.
     * </p>
     * 
     * @return The severity of the finding.
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the finding.
     * </p>
     * 
     * @param severity
     *        The severity of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * 
     * @param status
     *        The status of the finding.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * 
     * @return The status of the finding.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * 
     * @param status
     *        The status of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The title of the finding.
     * </p>
     * 
     * @param title
     *        The title of the finding.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the finding.
     * </p>
     * 
     * @return The title of the finding.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the finding.
     * </p>
     * 
     * @param title
     *        The title of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The type of the finding.
     * </p>
     * 
     * @param type
     *        The type of the finding.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the finding.
     * </p>
     * 
     * @return The type of the finding.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the finding.
     * </p>
     * 
     * @param type
     *        The type of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The date and time the finding was last updated at.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the finding was last updated at.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time the finding was last updated at.
     * </p>
     * 
     * @return The date and time the finding was last updated at.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time the finding was last updated at.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the finding was last updated at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnhancedImageScanFinding withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFindingArn() != null)
            sb.append("FindingArn: ").append(getFindingArn()).append(",");
        if (getFirstObservedAt() != null)
            sb.append("FirstObservedAt: ").append(getFirstObservedAt()).append(",");
        if (getLastObservedAt() != null)
            sb.append("LastObservedAt: ").append(getLastObservedAt()).append(",");
        if (getPackageVulnerabilityDetails() != null)
            sb.append("PackageVulnerabilityDetails: ").append(getPackageVulnerabilityDetails()).append(",");
        if (getRemediation() != null)
            sb.append("Remediation: ").append(getRemediation()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore()).append(",");
        if (getScoreDetails() != null)
            sb.append("ScoreDetails: ").append(getScoreDetails()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnhancedImageScanFinding == false)
            return false;
        EnhancedImageScanFinding other = (EnhancedImageScanFinding) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFindingArn() == null ^ this.getFindingArn() == null)
            return false;
        if (other.getFindingArn() != null && other.getFindingArn().equals(this.getFindingArn()) == false)
            return false;
        if (other.getFirstObservedAt() == null ^ this.getFirstObservedAt() == null)
            return false;
        if (other.getFirstObservedAt() != null && other.getFirstObservedAt().equals(this.getFirstObservedAt()) == false)
            return false;
        if (other.getLastObservedAt() == null ^ this.getLastObservedAt() == null)
            return false;
        if (other.getLastObservedAt() != null && other.getLastObservedAt().equals(this.getLastObservedAt()) == false)
            return false;
        if (other.getPackageVulnerabilityDetails() == null ^ this.getPackageVulnerabilityDetails() == null)
            return false;
        if (other.getPackageVulnerabilityDetails() != null && other.getPackageVulnerabilityDetails().equals(this.getPackageVulnerabilityDetails()) == false)
            return false;
        if (other.getRemediation() == null ^ this.getRemediation() == null)
            return false;
        if (other.getRemediation() != null && other.getRemediation().equals(this.getRemediation()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getScoreDetails() == null ^ this.getScoreDetails() == null)
            return false;
        if (other.getScoreDetails() != null && other.getScoreDetails().equals(this.getScoreDetails()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFindingArn() == null) ? 0 : getFindingArn().hashCode());
        hashCode = prime * hashCode + ((getFirstObservedAt() == null) ? 0 : getFirstObservedAt().hashCode());
        hashCode = prime * hashCode + ((getLastObservedAt() == null) ? 0 : getLastObservedAt().hashCode());
        hashCode = prime * hashCode + ((getPackageVulnerabilityDetails() == null) ? 0 : getPackageVulnerabilityDetails().hashCode());
        hashCode = prime * hashCode + ((getRemediation() == null) ? 0 : getRemediation().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getScoreDetails() == null) ? 0 : getScoreDetails().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public EnhancedImageScanFinding clone() {
        try {
            return (EnhancedImageScanFinding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.EnhancedImageScanFindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

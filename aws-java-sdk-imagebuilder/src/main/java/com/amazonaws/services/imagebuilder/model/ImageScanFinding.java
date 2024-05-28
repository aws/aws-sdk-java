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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about a vulnerability scan finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImageScanFinding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageScanFinding implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID that's associated with the finding.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version that's associated with the finding.
     * </p>
     */
    private String imageBuildVersionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that's associated with the finding.
     * </p>
     */
    private String imagePipelineArn;
    /**
     * <p>
     * The type of the finding. Image Builder looks for findings of the type <code>PACKAGE_VULNERABILITY</code> that
     * apply to output images, and excludes other types.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The description of the finding.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The title of the finding.
     * </p>
     */
    private String title;
    /**
     * <p>
     * An object that contains the details about how to remediate the finding.
     * </p>
     */
    private Remediation remediation;
    /**
     * <p>
     * The severity of the finding.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The date and time when the finding was first observed.
     * </p>
     */
    private java.util.Date firstObservedAt;
    /**
     * <p>
     * The timestamp when the finding was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The score that Amazon Inspector assigned for the finding.
     * </p>
     */
    private Double inspectorScore;
    /**
     * <p>
     * An object that contains details of the Amazon Inspector score.
     * </p>
     */
    private InspectorScoreDetails inspectorScoreDetails;
    /**
     * <p>
     * An object that contains the details of a package vulnerability finding.
     * </p>
     */
    private PackageVulnerabilityDetails packageVulnerabilityDetails;
    /**
     * <p>
     * Details about whether a fix is available for any of the packages that are identified in the finding through a
     * version update.
     * </p>
     */
    private String fixAvailable;

    /**
     * <p>
     * The Amazon Web Services account ID that's associated with the finding.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID that's associated with the finding.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that's associated with the finding.
     * </p>
     * 
     * @return The Amazon Web Services account ID that's associated with the finding.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that's associated with the finding.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID that's associated with the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFinding withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version that's associated with the finding.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image build version that's associated with the finding.
     */

    public void setImageBuildVersionArn(String imageBuildVersionArn) {
        this.imageBuildVersionArn = imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version that's associated with the finding.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image build version that's associated with the finding.
     */

    public String getImageBuildVersionArn() {
        return this.imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version that's associated with the finding.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image build version that's associated with the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFinding withImageBuildVersionArn(String imageBuildVersionArn) {
        setImageBuildVersionArn(imageBuildVersionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that's associated with the finding.
     * </p>
     * 
     * @param imagePipelineArn
     *        The Amazon Resource Name (ARN) of the image pipeline that's associated with the finding.
     */

    public void setImagePipelineArn(String imagePipelineArn) {
        this.imagePipelineArn = imagePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that's associated with the finding.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image pipeline that's associated with the finding.
     */

    public String getImagePipelineArn() {
        return this.imagePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that's associated with the finding.
     * </p>
     * 
     * @param imagePipelineArn
     *        The Amazon Resource Name (ARN) of the image pipeline that's associated with the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFinding withImagePipelineArn(String imagePipelineArn) {
        setImagePipelineArn(imagePipelineArn);
        return this;
    }

    /**
     * <p>
     * The type of the finding. Image Builder looks for findings of the type <code>PACKAGE_VULNERABILITY</code> that
     * apply to output images, and excludes other types.
     * </p>
     * 
     * @param type
     *        The type of the finding. Image Builder looks for findings of the type <code>PACKAGE_VULNERABILITY</code>
     *        that apply to output images, and excludes other types.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the finding. Image Builder looks for findings of the type <code>PACKAGE_VULNERABILITY</code> that
     * apply to output images, and excludes other types.
     * </p>
     * 
     * @return The type of the finding. Image Builder looks for findings of the type <code>PACKAGE_VULNERABILITY</code>
     *         that apply to output images, and excludes other types.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the finding. Image Builder looks for findings of the type <code>PACKAGE_VULNERABILITY</code> that
     * apply to output images, and excludes other types.
     * </p>
     * 
     * @param type
     *        The type of the finding. Image Builder looks for findings of the type <code>PACKAGE_VULNERABILITY</code>
     *        that apply to output images, and excludes other types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFinding withType(String type) {
        setType(type);
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

    public ImageScanFinding withDescription(String description) {
        setDescription(description);
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

    public ImageScanFinding withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * An object that contains the details about how to remediate the finding.
     * </p>
     * 
     * @param remediation
     *        An object that contains the details about how to remediate the finding.
     */

    public void setRemediation(Remediation remediation) {
        this.remediation = remediation;
    }

    /**
     * <p>
     * An object that contains the details about how to remediate the finding.
     * </p>
     * 
     * @return An object that contains the details about how to remediate the finding.
     */

    public Remediation getRemediation() {
        return this.remediation;
    }

    /**
     * <p>
     * An object that contains the details about how to remediate the finding.
     * </p>
     * 
     * @param remediation
     *        An object that contains the details about how to remediate the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFinding withRemediation(Remediation remediation) {
        setRemediation(remediation);
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

    public ImageScanFinding withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The date and time when the finding was first observed.
     * </p>
     * 
     * @param firstObservedAt
     *        The date and time when the finding was first observed.
     */

    public void setFirstObservedAt(java.util.Date firstObservedAt) {
        this.firstObservedAt = firstObservedAt;
    }

    /**
     * <p>
     * The date and time when the finding was first observed.
     * </p>
     * 
     * @return The date and time when the finding was first observed.
     */

    public java.util.Date getFirstObservedAt() {
        return this.firstObservedAt;
    }

    /**
     * <p>
     * The date and time when the finding was first observed.
     * </p>
     * 
     * @param firstObservedAt
     *        The date and time when the finding was first observed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFinding withFirstObservedAt(java.util.Date firstObservedAt) {
        setFirstObservedAt(firstObservedAt);
        return this;
    }

    /**
     * <p>
     * The timestamp when the finding was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp when the finding was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp when the finding was last updated.
     * </p>
     * 
     * @return The timestamp when the finding was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp when the finding was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp when the finding was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFinding withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The score that Amazon Inspector assigned for the finding.
     * </p>
     * 
     * @param inspectorScore
     *        The score that Amazon Inspector assigned for the finding.
     */

    public void setInspectorScore(Double inspectorScore) {
        this.inspectorScore = inspectorScore;
    }

    /**
     * <p>
     * The score that Amazon Inspector assigned for the finding.
     * </p>
     * 
     * @return The score that Amazon Inspector assigned for the finding.
     */

    public Double getInspectorScore() {
        return this.inspectorScore;
    }

    /**
     * <p>
     * The score that Amazon Inspector assigned for the finding.
     * </p>
     * 
     * @param inspectorScore
     *        The score that Amazon Inspector assigned for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFinding withInspectorScore(Double inspectorScore) {
        setInspectorScore(inspectorScore);
        return this;
    }

    /**
     * <p>
     * An object that contains details of the Amazon Inspector score.
     * </p>
     * 
     * @param inspectorScoreDetails
     *        An object that contains details of the Amazon Inspector score.
     */

    public void setInspectorScoreDetails(InspectorScoreDetails inspectorScoreDetails) {
        this.inspectorScoreDetails = inspectorScoreDetails;
    }

    /**
     * <p>
     * An object that contains details of the Amazon Inspector score.
     * </p>
     * 
     * @return An object that contains details of the Amazon Inspector score.
     */

    public InspectorScoreDetails getInspectorScoreDetails() {
        return this.inspectorScoreDetails;
    }

    /**
     * <p>
     * An object that contains details of the Amazon Inspector score.
     * </p>
     * 
     * @param inspectorScoreDetails
     *        An object that contains details of the Amazon Inspector score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFinding withInspectorScoreDetails(InspectorScoreDetails inspectorScoreDetails) {
        setInspectorScoreDetails(inspectorScoreDetails);
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

    public ImageScanFinding withPackageVulnerabilityDetails(PackageVulnerabilityDetails packageVulnerabilityDetails) {
        setPackageVulnerabilityDetails(packageVulnerabilityDetails);
        return this;
    }

    /**
     * <p>
     * Details about whether a fix is available for any of the packages that are identified in the finding through a
     * version update.
     * </p>
     * 
     * @param fixAvailable
     *        Details about whether a fix is available for any of the packages that are identified in the finding
     *        through a version update.
     */

    public void setFixAvailable(String fixAvailable) {
        this.fixAvailable = fixAvailable;
    }

    /**
     * <p>
     * Details about whether a fix is available for any of the packages that are identified in the finding through a
     * version update.
     * </p>
     * 
     * @return Details about whether a fix is available for any of the packages that are identified in the finding
     *         through a version update.
     */

    public String getFixAvailable() {
        return this.fixAvailable;
    }

    /**
     * <p>
     * Details about whether a fix is available for any of the packages that are identified in the finding through a
     * version update.
     * </p>
     * 
     * @param fixAvailable
     *        Details about whether a fix is available for any of the packages that are identified in the finding
     *        through a version update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFinding withFixAvailable(String fixAvailable) {
        setFixAvailable(fixAvailable);
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
        if (getImageBuildVersionArn() != null)
            sb.append("ImageBuildVersionArn: ").append(getImageBuildVersionArn()).append(",");
        if (getImagePipelineArn() != null)
            sb.append("ImagePipelineArn: ").append(getImagePipelineArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getRemediation() != null)
            sb.append("Remediation: ").append(getRemediation()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getFirstObservedAt() != null)
            sb.append("FirstObservedAt: ").append(getFirstObservedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getInspectorScore() != null)
            sb.append("InspectorScore: ").append(getInspectorScore()).append(",");
        if (getInspectorScoreDetails() != null)
            sb.append("InspectorScoreDetails: ").append(getInspectorScoreDetails()).append(",");
        if (getPackageVulnerabilityDetails() != null)
            sb.append("PackageVulnerabilityDetails: ").append(getPackageVulnerabilityDetails()).append(",");
        if (getFixAvailable() != null)
            sb.append("FixAvailable: ").append(getFixAvailable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageScanFinding == false)
            return false;
        ImageScanFinding other = (ImageScanFinding) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getImageBuildVersionArn() == null ^ this.getImageBuildVersionArn() == null)
            return false;
        if (other.getImageBuildVersionArn() != null && other.getImageBuildVersionArn().equals(this.getImageBuildVersionArn()) == false)
            return false;
        if (other.getImagePipelineArn() == null ^ this.getImagePipelineArn() == null)
            return false;
        if (other.getImagePipelineArn() != null && other.getImagePipelineArn().equals(this.getImagePipelineArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getRemediation() == null ^ this.getRemediation() == null)
            return false;
        if (other.getRemediation() != null && other.getRemediation().equals(this.getRemediation()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getFirstObservedAt() == null ^ this.getFirstObservedAt() == null)
            return false;
        if (other.getFirstObservedAt() != null && other.getFirstObservedAt().equals(this.getFirstObservedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getInspectorScore() == null ^ this.getInspectorScore() == null)
            return false;
        if (other.getInspectorScore() != null && other.getInspectorScore().equals(this.getInspectorScore()) == false)
            return false;
        if (other.getInspectorScoreDetails() == null ^ this.getInspectorScoreDetails() == null)
            return false;
        if (other.getInspectorScoreDetails() != null && other.getInspectorScoreDetails().equals(this.getInspectorScoreDetails()) == false)
            return false;
        if (other.getPackageVulnerabilityDetails() == null ^ this.getPackageVulnerabilityDetails() == null)
            return false;
        if (other.getPackageVulnerabilityDetails() != null && other.getPackageVulnerabilityDetails().equals(this.getPackageVulnerabilityDetails()) == false)
            return false;
        if (other.getFixAvailable() == null ^ this.getFixAvailable() == null)
            return false;
        if (other.getFixAvailable() != null && other.getFixAvailable().equals(this.getFixAvailable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getImageBuildVersionArn() == null) ? 0 : getImageBuildVersionArn().hashCode());
        hashCode = prime * hashCode + ((getImagePipelineArn() == null) ? 0 : getImagePipelineArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getRemediation() == null) ? 0 : getRemediation().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getFirstObservedAt() == null) ? 0 : getFirstObservedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getInspectorScore() == null) ? 0 : getInspectorScore().hashCode());
        hashCode = prime * hashCode + ((getInspectorScoreDetails() == null) ? 0 : getInspectorScoreDetails().hashCode());
        hashCode = prime * hashCode + ((getPackageVulnerabilityDetails() == null) ? 0 : getPackageVulnerabilityDetails().hashCode());
        hashCode = prime * hashCode + ((getFixAvailable() == null) ? 0 : getFixAvailable().hashCode());
        return hashCode;
    }

    @Override
    public ImageScanFinding clone() {
        try {
            return (ImageScanFinding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ImageScanFindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

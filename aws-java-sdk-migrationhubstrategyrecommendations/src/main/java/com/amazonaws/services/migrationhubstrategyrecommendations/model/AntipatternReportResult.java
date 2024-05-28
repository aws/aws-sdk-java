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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The anti-pattern report result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/AntipatternReportResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AntipatternReportResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The analyzer name.
     * </p>
     */
    private AnalyzerNameUnion analyzerName;

    private S3Object antiPatternReportS3Object;
    /**
     * <p>
     * The status of the anti-pattern report generation.
     * </p>
     */
    private String antipatternReportStatus;
    /**
     * <p>
     * The status message for the anti-pattern.
     * </p>
     */
    private String antipatternReportStatusMessage;

    /**
     * <p>
     * The analyzer name.
     * </p>
     * 
     * @param analyzerName
     *        The analyzer name.
     */

    public void setAnalyzerName(AnalyzerNameUnion analyzerName) {
        this.analyzerName = analyzerName;
    }

    /**
     * <p>
     * The analyzer name.
     * </p>
     * 
     * @return The analyzer name.
     */

    public AnalyzerNameUnion getAnalyzerName() {
        return this.analyzerName;
    }

    /**
     * <p>
     * The analyzer name.
     * </p>
     * 
     * @param analyzerName
     *        The analyzer name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AntipatternReportResult withAnalyzerName(AnalyzerNameUnion analyzerName) {
        setAnalyzerName(analyzerName);
        return this;
    }

    /**
     * @param antiPatternReportS3Object
     */

    public void setAntiPatternReportS3Object(S3Object antiPatternReportS3Object) {
        this.antiPatternReportS3Object = antiPatternReportS3Object;
    }

    /**
     * @return
     */

    public S3Object getAntiPatternReportS3Object() {
        return this.antiPatternReportS3Object;
    }

    /**
     * @param antiPatternReportS3Object
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AntipatternReportResult withAntiPatternReportS3Object(S3Object antiPatternReportS3Object) {
        setAntiPatternReportS3Object(antiPatternReportS3Object);
        return this;
    }

    /**
     * <p>
     * The status of the anti-pattern report generation.
     * </p>
     * 
     * @param antipatternReportStatus
     *        The status of the anti-pattern report generation.
     * @see AntipatternReportStatus
     */

    public void setAntipatternReportStatus(String antipatternReportStatus) {
        this.antipatternReportStatus = antipatternReportStatus;
    }

    /**
     * <p>
     * The status of the anti-pattern report generation.
     * </p>
     * 
     * @return The status of the anti-pattern report generation.
     * @see AntipatternReportStatus
     */

    public String getAntipatternReportStatus() {
        return this.antipatternReportStatus;
    }

    /**
     * <p>
     * The status of the anti-pattern report generation.
     * </p>
     * 
     * @param antipatternReportStatus
     *        The status of the anti-pattern report generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AntipatternReportStatus
     */

    public AntipatternReportResult withAntipatternReportStatus(String antipatternReportStatus) {
        setAntipatternReportStatus(antipatternReportStatus);
        return this;
    }

    /**
     * <p>
     * The status of the anti-pattern report generation.
     * </p>
     * 
     * @param antipatternReportStatus
     *        The status of the anti-pattern report generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AntipatternReportStatus
     */

    public AntipatternReportResult withAntipatternReportStatus(AntipatternReportStatus antipatternReportStatus) {
        this.antipatternReportStatus = antipatternReportStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the anti-pattern.
     * </p>
     * 
     * @param antipatternReportStatusMessage
     *        The status message for the anti-pattern.
     */

    public void setAntipatternReportStatusMessage(String antipatternReportStatusMessage) {
        this.antipatternReportStatusMessage = antipatternReportStatusMessage;
    }

    /**
     * <p>
     * The status message for the anti-pattern.
     * </p>
     * 
     * @return The status message for the anti-pattern.
     */

    public String getAntipatternReportStatusMessage() {
        return this.antipatternReportStatusMessage;
    }

    /**
     * <p>
     * The status message for the anti-pattern.
     * </p>
     * 
     * @param antipatternReportStatusMessage
     *        The status message for the anti-pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AntipatternReportResult withAntipatternReportStatusMessage(String antipatternReportStatusMessage) {
        setAntipatternReportStatusMessage(antipatternReportStatusMessage);
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
        if (getAnalyzerName() != null)
            sb.append("AnalyzerName: ").append(getAnalyzerName()).append(",");
        if (getAntiPatternReportS3Object() != null)
            sb.append("AntiPatternReportS3Object: ").append(getAntiPatternReportS3Object()).append(",");
        if (getAntipatternReportStatus() != null)
            sb.append("AntipatternReportStatus: ").append(getAntipatternReportStatus()).append(",");
        if (getAntipatternReportStatusMessage() != null)
            sb.append("AntipatternReportStatusMessage: ").append(getAntipatternReportStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AntipatternReportResult == false)
            return false;
        AntipatternReportResult other = (AntipatternReportResult) obj;
        if (other.getAnalyzerName() == null ^ this.getAnalyzerName() == null)
            return false;
        if (other.getAnalyzerName() != null && other.getAnalyzerName().equals(this.getAnalyzerName()) == false)
            return false;
        if (other.getAntiPatternReportS3Object() == null ^ this.getAntiPatternReportS3Object() == null)
            return false;
        if (other.getAntiPatternReportS3Object() != null && other.getAntiPatternReportS3Object().equals(this.getAntiPatternReportS3Object()) == false)
            return false;
        if (other.getAntipatternReportStatus() == null ^ this.getAntipatternReportStatus() == null)
            return false;
        if (other.getAntipatternReportStatus() != null && other.getAntipatternReportStatus().equals(this.getAntipatternReportStatus()) == false)
            return false;
        if (other.getAntipatternReportStatusMessage() == null ^ this.getAntipatternReportStatusMessage() == null)
            return false;
        if (other.getAntipatternReportStatusMessage() != null
                && other.getAntipatternReportStatusMessage().equals(this.getAntipatternReportStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalyzerName() == null) ? 0 : getAnalyzerName().hashCode());
        hashCode = prime * hashCode + ((getAntiPatternReportS3Object() == null) ? 0 : getAntiPatternReportS3Object().hashCode());
        hashCode = prime * hashCode + ((getAntipatternReportStatus() == null) ? 0 : getAntipatternReportStatus().hashCode());
        hashCode = prime * hashCode + ((getAntipatternReportStatusMessage() == null) ? 0 : getAntipatternReportStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public AntipatternReportResult clone() {
        try {
            return (AntipatternReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.AntipatternReportResultMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

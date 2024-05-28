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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Evidence that's manually added to a control in Audit Manager. <code>manualEvidence</code> can be one of the
 * following: <code>evidenceFileName</code>, <code>s3ResourcePath</code>, or <code>textResponse</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ManualEvidence" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManualEvidence implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 URL of the object that's imported as manual evidence.
     * </p>
     */
    private String s3ResourcePath;
    /**
     * <p>
     * The plain text response that's entered and saved as manual evidence.
     * </p>
     */
    private String textResponse;
    /**
     * <p>
     * The name of the file that's uploaded as manual evidence. This name is populated using the
     * <code>evidenceFileName</code> value from the <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_GetEvidenceFileUploadUrl.html">
     * <code>GetEvidenceFileUploadUrl</code> </a> API response.
     * </p>
     */
    private String evidenceFileName;

    /**
     * <p>
     * The S3 URL of the object that's imported as manual evidence.
     * </p>
     * 
     * @param s3ResourcePath
     *        The S3 URL of the object that's imported as manual evidence.
     */

    public void setS3ResourcePath(String s3ResourcePath) {
        this.s3ResourcePath = s3ResourcePath;
    }

    /**
     * <p>
     * The S3 URL of the object that's imported as manual evidence.
     * </p>
     * 
     * @return The S3 URL of the object that's imported as manual evidence.
     */

    public String getS3ResourcePath() {
        return this.s3ResourcePath;
    }

    /**
     * <p>
     * The S3 URL of the object that's imported as manual evidence.
     * </p>
     * 
     * @param s3ResourcePath
     *        The S3 URL of the object that's imported as manual evidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManualEvidence withS3ResourcePath(String s3ResourcePath) {
        setS3ResourcePath(s3ResourcePath);
        return this;
    }

    /**
     * <p>
     * The plain text response that's entered and saved as manual evidence.
     * </p>
     * 
     * @param textResponse
     *        The plain text response that's entered and saved as manual evidence.
     */

    public void setTextResponse(String textResponse) {
        this.textResponse = textResponse;
    }

    /**
     * <p>
     * The plain text response that's entered and saved as manual evidence.
     * </p>
     * 
     * @return The plain text response that's entered and saved as manual evidence.
     */

    public String getTextResponse() {
        return this.textResponse;
    }

    /**
     * <p>
     * The plain text response that's entered and saved as manual evidence.
     * </p>
     * 
     * @param textResponse
     *        The plain text response that's entered and saved as manual evidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManualEvidence withTextResponse(String textResponse) {
        setTextResponse(textResponse);
        return this;
    }

    /**
     * <p>
     * The name of the file that's uploaded as manual evidence. This name is populated using the
     * <code>evidenceFileName</code> value from the <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_GetEvidenceFileUploadUrl.html">
     * <code>GetEvidenceFileUploadUrl</code> </a> API response.
     * </p>
     * 
     * @param evidenceFileName
     *        The name of the file that's uploaded as manual evidence. This name is populated using the
     *        <code>evidenceFileName</code> value from the <a
     *        href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_GetEvidenceFileUploadUrl.html">
     *        <code>GetEvidenceFileUploadUrl</code> </a> API response.
     */

    public void setEvidenceFileName(String evidenceFileName) {
        this.evidenceFileName = evidenceFileName;
    }

    /**
     * <p>
     * The name of the file that's uploaded as manual evidence. This name is populated using the
     * <code>evidenceFileName</code> value from the <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_GetEvidenceFileUploadUrl.html">
     * <code>GetEvidenceFileUploadUrl</code> </a> API response.
     * </p>
     * 
     * @return The name of the file that's uploaded as manual evidence. This name is populated using the
     *         <code>evidenceFileName</code> value from the <a
     *         href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_GetEvidenceFileUploadUrl.html">
     *         <code>GetEvidenceFileUploadUrl</code> </a> API response.
     */

    public String getEvidenceFileName() {
        return this.evidenceFileName;
    }

    /**
     * <p>
     * The name of the file that's uploaded as manual evidence. This name is populated using the
     * <code>evidenceFileName</code> value from the <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_GetEvidenceFileUploadUrl.html">
     * <code>GetEvidenceFileUploadUrl</code> </a> API response.
     * </p>
     * 
     * @param evidenceFileName
     *        The name of the file that's uploaded as manual evidence. This name is populated using the
     *        <code>evidenceFileName</code> value from the <a
     *        href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_GetEvidenceFileUploadUrl.html">
     *        <code>GetEvidenceFileUploadUrl</code> </a> API response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManualEvidence withEvidenceFileName(String evidenceFileName) {
        setEvidenceFileName(evidenceFileName);
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
        if (getS3ResourcePath() != null)
            sb.append("S3ResourcePath: ").append(getS3ResourcePath()).append(",");
        if (getTextResponse() != null)
            sb.append("TextResponse: ").append("***Sensitive Data Redacted***").append(",");
        if (getEvidenceFileName() != null)
            sb.append("EvidenceFileName: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManualEvidence == false)
            return false;
        ManualEvidence other = (ManualEvidence) obj;
        if (other.getS3ResourcePath() == null ^ this.getS3ResourcePath() == null)
            return false;
        if (other.getS3ResourcePath() != null && other.getS3ResourcePath().equals(this.getS3ResourcePath()) == false)
            return false;
        if (other.getTextResponse() == null ^ this.getTextResponse() == null)
            return false;
        if (other.getTextResponse() != null && other.getTextResponse().equals(this.getTextResponse()) == false)
            return false;
        if (other.getEvidenceFileName() == null ^ this.getEvidenceFileName() == null)
            return false;
        if (other.getEvidenceFileName() != null && other.getEvidenceFileName().equals(this.getEvidenceFileName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3ResourcePath() == null) ? 0 : getS3ResourcePath().hashCode());
        hashCode = prime * hashCode + ((getTextResponse() == null) ? 0 : getTextResponse().hashCode());
        hashCode = prime * hashCode + ((getEvidenceFileName() == null) ? 0 : getEvidenceFileName().hashCode());
        return hashCode;
    }

    @Override
    public ManualEvidence clone() {
        try {
            return (ManualEvidence) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.ManualEvidenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

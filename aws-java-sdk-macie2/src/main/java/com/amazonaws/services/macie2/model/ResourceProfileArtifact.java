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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an S3 object that Amazon Macie selected for analysis while performing automated sensitive
 * data discovery for an S3 bucket, and the status and results of the analysis. This information is available only if
 * automated sensitive data discovery is currently enabled for your account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ResourceProfileArtifact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceProfileArtifact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the object.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of the analysis. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie successfully completed its analysis of the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * PARTIAL - Macie analyzed only a subset of data in the object. For example, the object is an archive file that
     * contains files in an unsupported format.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED - Macie wasn't able to analyze the object. For example, the object is a malformed file.
     * </p>
     * </li>
     * </ul>
     */
    private String classificationResultStatus;
    /**
     * <p>
     * Specifies whether Amazon Macie found sensitive data in the object.
     * </p>
     */
    private Boolean sensitive;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the object.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the object.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the object.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the object.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the object.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceProfileArtifact withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of the analysis. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie successfully completed its analysis of the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * PARTIAL - Macie analyzed only a subset of data in the object. For example, the object is an archive file that
     * contains files in an unsupported format.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED - Macie wasn't able to analyze the object. For example, the object is a malformed file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param classificationResultStatus
     *        The status of the analysis. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        COMPLETE - Amazon Macie successfully completed its analysis of the object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PARTIAL - Macie analyzed only a subset of data in the object. For example, the object is an archive file
     *        that contains files in an unsupported format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SKIPPED - Macie wasn't able to analyze the object. For example, the object is a malformed file.
     *        </p>
     *        </li>
     */

    public void setClassificationResultStatus(String classificationResultStatus) {
        this.classificationResultStatus = classificationResultStatus;
    }

    /**
     * <p>
     * The status of the analysis. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie successfully completed its analysis of the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * PARTIAL - Macie analyzed only a subset of data in the object. For example, the object is an archive file that
     * contains files in an unsupported format.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED - Macie wasn't able to analyze the object. For example, the object is a malformed file.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the analysis. Possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         COMPLETE - Amazon Macie successfully completed its analysis of the object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PARTIAL - Macie analyzed only a subset of data in the object. For example, the object is an archive file
     *         that contains files in an unsupported format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SKIPPED - Macie wasn't able to analyze the object. For example, the object is a malformed file.
     *         </p>
     *         </li>
     */

    public String getClassificationResultStatus() {
        return this.classificationResultStatus;
    }

    /**
     * <p>
     * The status of the analysis. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie successfully completed its analysis of the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * PARTIAL - Macie analyzed only a subset of data in the object. For example, the object is an archive file that
     * contains files in an unsupported format.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED - Macie wasn't able to analyze the object. For example, the object is a malformed file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param classificationResultStatus
     *        The status of the analysis. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        COMPLETE - Amazon Macie successfully completed its analysis of the object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PARTIAL - Macie analyzed only a subset of data in the object. For example, the object is an archive file
     *        that contains files in an unsupported format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SKIPPED - Macie wasn't able to analyze the object. For example, the object is a malformed file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceProfileArtifact withClassificationResultStatus(String classificationResultStatus) {
        setClassificationResultStatus(classificationResultStatus);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon Macie found sensitive data in the object.
     * </p>
     * 
     * @param sensitive
     *        Specifies whether Amazon Macie found sensitive data in the object.
     */

    public void setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
    }

    /**
     * <p>
     * Specifies whether Amazon Macie found sensitive data in the object.
     * </p>
     * 
     * @return Specifies whether Amazon Macie found sensitive data in the object.
     */

    public Boolean getSensitive() {
        return this.sensitive;
    }

    /**
     * <p>
     * Specifies whether Amazon Macie found sensitive data in the object.
     * </p>
     * 
     * @param sensitive
     *        Specifies whether Amazon Macie found sensitive data in the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceProfileArtifact withSensitive(Boolean sensitive) {
        setSensitive(sensitive);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon Macie found sensitive data in the object.
     * </p>
     * 
     * @return Specifies whether Amazon Macie found sensitive data in the object.
     */

    public Boolean isSensitive() {
        return this.sensitive;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getClassificationResultStatus() != null)
            sb.append("ClassificationResultStatus: ").append(getClassificationResultStatus()).append(",");
        if (getSensitive() != null)
            sb.append("Sensitive: ").append(getSensitive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceProfileArtifact == false)
            return false;
        ResourceProfileArtifact other = (ResourceProfileArtifact) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getClassificationResultStatus() == null ^ this.getClassificationResultStatus() == null)
            return false;
        if (other.getClassificationResultStatus() != null && other.getClassificationResultStatus().equals(this.getClassificationResultStatus()) == false)
            return false;
        if (other.getSensitive() == null ^ this.getSensitive() == null)
            return false;
        if (other.getSensitive() != null && other.getSensitive().equals(this.getSensitive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getClassificationResultStatus() == null) ? 0 : getClassificationResultStatus().hashCode());
        hashCode = prime * hashCode + ((getSensitive() == null) ? 0 : getSensitive().hashCode());
        return hashCode;
    }

    @Override
    public ResourceProfileArtifact clone() {
        try {
            return (ResourceProfileArtifact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ResourceProfileArtifactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

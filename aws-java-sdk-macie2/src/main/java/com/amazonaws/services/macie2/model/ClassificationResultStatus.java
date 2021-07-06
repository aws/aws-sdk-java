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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the status of a sensitive data finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ClassificationResultStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClassificationResultStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie successfully completed its analysis of the S3 object that the finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * PARTIAL - Macie analyzed only a subset of the data in the S3 object that the finding applies to. For example, the
     * object is an archive file that contains files in an unsupported format.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED - Macie wasn't able to analyze the S3 object that the finding applies to. For example, the object is a
     * file in an unsupported format.
     * </p>
     * </li>
     * </ul>
     */
    private String code;
    /**
     * <p>
     * A brief description of the status of the finding. Amazon Macie uses this value to notify you of any errors,
     * warnings, or considerations that might impact your analysis of the finding.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The status of the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie successfully completed its analysis of the S3 object that the finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * PARTIAL - Macie analyzed only a subset of the data in the S3 object that the finding applies to. For example, the
     * object is an archive file that contains files in an unsupported format.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED - Macie wasn't able to analyze the S3 object that the finding applies to. For example, the object is a
     * file in an unsupported format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        <p>
     *        The status of the finding. Possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        COMPLETE - Amazon Macie successfully completed its analysis of the S3 object that the finding applies to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PARTIAL - Macie analyzed only a subset of the data in the S3 object that the finding applies to. For
     *        example, the object is an archive file that contains files in an unsupported format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SKIPPED - Macie wasn't able to analyze the S3 object that the finding applies to. For example, the object
     *        is a file in an unsupported format.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The status of the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie successfully completed its analysis of the S3 object that the finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * PARTIAL - Macie analyzed only a subset of the data in the S3 object that the finding applies to. For example, the
     * object is an archive file that contains files in an unsupported format.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED - Macie wasn't able to analyze the S3 object that the finding applies to. For example, the object is a
     * file in an unsupported format.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <p>
     *         The status of the finding. Possible values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         COMPLETE - Amazon Macie successfully completed its analysis of the S3 object that the finding applies to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PARTIAL - Macie analyzed only a subset of the data in the S3 object that the finding applies to. For
     *         example, the object is an archive file that contains files in an unsupported format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SKIPPED - Macie wasn't able to analyze the S3 object that the finding applies to. For example, the object
     *         is a file in an unsupported format.
     *         </p>
     *         </li>
     *         </ul>
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The status of the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie successfully completed its analysis of the S3 object that the finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * PARTIAL - Macie analyzed only a subset of the data in the S3 object that the finding applies to. For example, the
     * object is an archive file that contains files in an unsupported format.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED - Macie wasn't able to analyze the S3 object that the finding applies to. For example, the object is a
     * file in an unsupported format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        <p>
     *        The status of the finding. Possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        COMPLETE - Amazon Macie successfully completed its analysis of the S3 object that the finding applies to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PARTIAL - Macie analyzed only a subset of the data in the S3 object that the finding applies to. For
     *        example, the object is an archive file that contains files in an unsupported format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SKIPPED - Macie wasn't able to analyze the S3 object that the finding applies to. For example, the object
     *        is a file in an unsupported format.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResultStatus withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A brief description of the status of the finding. Amazon Macie uses this value to notify you of any errors,
     * warnings, or considerations that might impact your analysis of the finding.
     * </p>
     * 
     * @param reason
     *        A brief description of the status of the finding. Amazon Macie uses this value to notify you of any
     *        errors, warnings, or considerations that might impact your analysis of the finding.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A brief description of the status of the finding. Amazon Macie uses this value to notify you of any errors,
     * warnings, or considerations that might impact your analysis of the finding.
     * </p>
     * 
     * @return A brief description of the status of the finding. Amazon Macie uses this value to notify you of any
     *         errors, warnings, or considerations that might impact your analysis of the finding.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A brief description of the status of the finding. Amazon Macie uses this value to notify you of any errors,
     * warnings, or considerations that might impact your analysis of the finding.
     * </p>
     * 
     * @param reason
     *        A brief description of the status of the finding. Amazon Macie uses this value to notify you of any
     *        errors, warnings, or considerations that might impact your analysis of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResultStatus withReason(String reason) {
        setReason(reason);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassificationResultStatus == false)
            return false;
        ClassificationResultStatus other = (ClassificationResultStatus) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public ClassificationResultStatus clone() {
        try {
            return (ClassificationResultStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ClassificationResultStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

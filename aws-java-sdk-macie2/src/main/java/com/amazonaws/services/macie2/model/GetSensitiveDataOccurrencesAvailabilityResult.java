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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetSensitiveDataOccurrencesAvailability"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSensitiveDataOccurrencesAvailabilityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether occurrences of sensitive data can be retrieved for the finding. Possible values are: AVAILABLE,
     * the sensitive data can be retrieved; and, UNAVAILABLE, the sensitive data can't be retrieved. If this value is
     * UNAVAILABLE, the reasons array indicates why the data can't be retrieved.
     * </p>
     */
    private String code;
    /**
     * <p>
     * Specifies why occurrences of sensitive data can't be retrieved for the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INVALID_CLASSIFICATION_RESULT - Amazon Macie can't verify the location of the sensitive data to retrieve. There
     * isn't a corresponding sensitive data discovery result for the finding. Or the sensitive data discovery result
     * specified by the ClassificationDetails.detailedResultsLocation field of the finding isn't available, is malformed
     * or corrupted, or uses an unsupported storage format.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_EXCEEDS_SIZE_QUOTA - The storage size of the affected S3 object exceeds the size quota for retrieving
     * occurrences of sensitive data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_UNAVAILABLE - The affected S3 object isn't available. The object might have been renamed, moved, or
     * deleted. Or the object was changed after Macie created the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_FINDING_TYPE - The specified finding isn't a sensitive data finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_OBJECT_TYPE - The affected S3 object uses a file or storage format that Macie doesn't support for
     * retrieving occurrences of sensitive data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value is null if sensitive data can be retrieved for the finding.
     * </p>
     */
    private java.util.List<String> reasons;

    /**
     * <p>
     * Specifies whether occurrences of sensitive data can be retrieved for the finding. Possible values are: AVAILABLE,
     * the sensitive data can be retrieved; and, UNAVAILABLE, the sensitive data can't be retrieved. If this value is
     * UNAVAILABLE, the reasons array indicates why the data can't be retrieved.
     * </p>
     * 
     * @param code
     *        Specifies whether occurrences of sensitive data can be retrieved for the finding. Possible values are:
     *        AVAILABLE, the sensitive data can be retrieved; and, UNAVAILABLE, the sensitive data can't be retrieved.
     *        If this value is UNAVAILABLE, the reasons array indicates why the data can't be retrieved.
     * @see AvailabilityCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * Specifies whether occurrences of sensitive data can be retrieved for the finding. Possible values are: AVAILABLE,
     * the sensitive data can be retrieved; and, UNAVAILABLE, the sensitive data can't be retrieved. If this value is
     * UNAVAILABLE, the reasons array indicates why the data can't be retrieved.
     * </p>
     * 
     * @return Specifies whether occurrences of sensitive data can be retrieved for the finding. Possible values are:
     *         AVAILABLE, the sensitive data can be retrieved; and, UNAVAILABLE, the sensitive data can't be retrieved.
     *         If this value is UNAVAILABLE, the reasons array indicates why the data can't be retrieved.
     * @see AvailabilityCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * Specifies whether occurrences of sensitive data can be retrieved for the finding. Possible values are: AVAILABLE,
     * the sensitive data can be retrieved; and, UNAVAILABLE, the sensitive data can't be retrieved. If this value is
     * UNAVAILABLE, the reasons array indicates why the data can't be retrieved.
     * </p>
     * 
     * @param code
     *        Specifies whether occurrences of sensitive data can be retrieved for the finding. Possible values are:
     *        AVAILABLE, the sensitive data can be retrieved; and, UNAVAILABLE, the sensitive data can't be retrieved.
     *        If this value is UNAVAILABLE, the reasons array indicates why the data can't be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvailabilityCode
     */

    public GetSensitiveDataOccurrencesAvailabilityResult withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * Specifies whether occurrences of sensitive data can be retrieved for the finding. Possible values are: AVAILABLE,
     * the sensitive data can be retrieved; and, UNAVAILABLE, the sensitive data can't be retrieved. If this value is
     * UNAVAILABLE, the reasons array indicates why the data can't be retrieved.
     * </p>
     * 
     * @param code
     *        Specifies whether occurrences of sensitive data can be retrieved for the finding. Possible values are:
     *        AVAILABLE, the sensitive data can be retrieved; and, UNAVAILABLE, the sensitive data can't be retrieved.
     *        If this value is UNAVAILABLE, the reasons array indicates why the data can't be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvailabilityCode
     */

    public GetSensitiveDataOccurrencesAvailabilityResult withCode(AvailabilityCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * Specifies why occurrences of sensitive data can't be retrieved for the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INVALID_CLASSIFICATION_RESULT - Amazon Macie can't verify the location of the sensitive data to retrieve. There
     * isn't a corresponding sensitive data discovery result for the finding. Or the sensitive data discovery result
     * specified by the ClassificationDetails.detailedResultsLocation field of the finding isn't available, is malformed
     * or corrupted, or uses an unsupported storage format.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_EXCEEDS_SIZE_QUOTA - The storage size of the affected S3 object exceeds the size quota for retrieving
     * occurrences of sensitive data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_UNAVAILABLE - The affected S3 object isn't available. The object might have been renamed, moved, or
     * deleted. Or the object was changed after Macie created the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_FINDING_TYPE - The specified finding isn't a sensitive data finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_OBJECT_TYPE - The affected S3 object uses a file or storage format that Macie doesn't support for
     * retrieving occurrences of sensitive data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value is null if sensitive data can be retrieved for the finding.
     * </p>
     * 
     * @return Specifies why occurrences of sensitive data can't be retrieved for the finding. Possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         INVALID_CLASSIFICATION_RESULT - Amazon Macie can't verify the location of the sensitive data to retrieve.
     *         There isn't a corresponding sensitive data discovery result for the finding. Or the sensitive data
     *         discovery result specified by the ClassificationDetails.detailedResultsLocation field of the finding
     *         isn't available, is malformed or corrupted, or uses an unsupported storage format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OBJECT_EXCEEDS_SIZE_QUOTA - The storage size of the affected S3 object exceeds the size quota for
     *         retrieving occurrences of sensitive data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OBJECT_UNAVAILABLE - The affected S3 object isn't available. The object might have been renamed, moved,
     *         or deleted. Or the object was changed after Macie created the finding.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNSUPPORTED_FINDING_TYPE - The specified finding isn't a sensitive data finding.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNSUPPORTED_OBJECT_TYPE - The affected S3 object uses a file or storage format that Macie doesn't support
     *         for retrieving occurrences of sensitive data.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This value is null if sensitive data can be retrieved for the finding.
     * @see UnavailabilityReasonCode
     */

    public java.util.List<String> getReasons() {
        return reasons;
    }

    /**
     * <p>
     * Specifies why occurrences of sensitive data can't be retrieved for the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INVALID_CLASSIFICATION_RESULT - Amazon Macie can't verify the location of the sensitive data to retrieve. There
     * isn't a corresponding sensitive data discovery result for the finding. Or the sensitive data discovery result
     * specified by the ClassificationDetails.detailedResultsLocation field of the finding isn't available, is malformed
     * or corrupted, or uses an unsupported storage format.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_EXCEEDS_SIZE_QUOTA - The storage size of the affected S3 object exceeds the size quota for retrieving
     * occurrences of sensitive data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_UNAVAILABLE - The affected S3 object isn't available. The object might have been renamed, moved, or
     * deleted. Or the object was changed after Macie created the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_FINDING_TYPE - The specified finding isn't a sensitive data finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_OBJECT_TYPE - The affected S3 object uses a file or storage format that Macie doesn't support for
     * retrieving occurrences of sensitive data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value is null if sensitive data can be retrieved for the finding.
     * </p>
     * 
     * @param reasons
     *        Specifies why occurrences of sensitive data can't be retrieved for the finding. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        INVALID_CLASSIFICATION_RESULT - Amazon Macie can't verify the location of the sensitive data to retrieve.
     *        There isn't a corresponding sensitive data discovery result for the finding. Or the sensitive data
     *        discovery result specified by the ClassificationDetails.detailedResultsLocation field of the finding isn't
     *        available, is malformed or corrupted, or uses an unsupported storage format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_EXCEEDS_SIZE_QUOTA - The storage size of the affected S3 object exceeds the size quota for
     *        retrieving occurrences of sensitive data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_UNAVAILABLE - The affected S3 object isn't available. The object might have been renamed, moved, or
     *        deleted. Or the object was changed after Macie created the finding.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNSUPPORTED_FINDING_TYPE - The specified finding isn't a sensitive data finding.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNSUPPORTED_OBJECT_TYPE - The affected S3 object uses a file or storage format that Macie doesn't support
     *        for retrieving occurrences of sensitive data.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This value is null if sensitive data can be retrieved for the finding.
     * @see UnavailabilityReasonCode
     */

    public void setReasons(java.util.Collection<String> reasons) {
        if (reasons == null) {
            this.reasons = null;
            return;
        }

        this.reasons = new java.util.ArrayList<String>(reasons);
    }

    /**
     * <p>
     * Specifies why occurrences of sensitive data can't be retrieved for the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INVALID_CLASSIFICATION_RESULT - Amazon Macie can't verify the location of the sensitive data to retrieve. There
     * isn't a corresponding sensitive data discovery result for the finding. Or the sensitive data discovery result
     * specified by the ClassificationDetails.detailedResultsLocation field of the finding isn't available, is malformed
     * or corrupted, or uses an unsupported storage format.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_EXCEEDS_SIZE_QUOTA - The storage size of the affected S3 object exceeds the size quota for retrieving
     * occurrences of sensitive data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_UNAVAILABLE - The affected S3 object isn't available. The object might have been renamed, moved, or
     * deleted. Or the object was changed after Macie created the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_FINDING_TYPE - The specified finding isn't a sensitive data finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_OBJECT_TYPE - The affected S3 object uses a file or storage format that Macie doesn't support for
     * retrieving occurrences of sensitive data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value is null if sensitive data can be retrieved for the finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReasons(java.util.Collection)} or {@link #withReasons(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param reasons
     *        Specifies why occurrences of sensitive data can't be retrieved for the finding. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        INVALID_CLASSIFICATION_RESULT - Amazon Macie can't verify the location of the sensitive data to retrieve.
     *        There isn't a corresponding sensitive data discovery result for the finding. Or the sensitive data
     *        discovery result specified by the ClassificationDetails.detailedResultsLocation field of the finding isn't
     *        available, is malformed or corrupted, or uses an unsupported storage format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_EXCEEDS_SIZE_QUOTA - The storage size of the affected S3 object exceeds the size quota for
     *        retrieving occurrences of sensitive data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_UNAVAILABLE - The affected S3 object isn't available. The object might have been renamed, moved, or
     *        deleted. Or the object was changed after Macie created the finding.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNSUPPORTED_FINDING_TYPE - The specified finding isn't a sensitive data finding.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNSUPPORTED_OBJECT_TYPE - The affected S3 object uses a file or storage format that Macie doesn't support
     *        for retrieving occurrences of sensitive data.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This value is null if sensitive data can be retrieved for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnavailabilityReasonCode
     */

    public GetSensitiveDataOccurrencesAvailabilityResult withReasons(String... reasons) {
        if (this.reasons == null) {
            setReasons(new java.util.ArrayList<String>(reasons.length));
        }
        for (String ele : reasons) {
            this.reasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies why occurrences of sensitive data can't be retrieved for the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INVALID_CLASSIFICATION_RESULT - Amazon Macie can't verify the location of the sensitive data to retrieve. There
     * isn't a corresponding sensitive data discovery result for the finding. Or the sensitive data discovery result
     * specified by the ClassificationDetails.detailedResultsLocation field of the finding isn't available, is malformed
     * or corrupted, or uses an unsupported storage format.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_EXCEEDS_SIZE_QUOTA - The storage size of the affected S3 object exceeds the size quota for retrieving
     * occurrences of sensitive data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_UNAVAILABLE - The affected S3 object isn't available. The object might have been renamed, moved, or
     * deleted. Or the object was changed after Macie created the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_FINDING_TYPE - The specified finding isn't a sensitive data finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_OBJECT_TYPE - The affected S3 object uses a file or storage format that Macie doesn't support for
     * retrieving occurrences of sensitive data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value is null if sensitive data can be retrieved for the finding.
     * </p>
     * 
     * @param reasons
     *        Specifies why occurrences of sensitive data can't be retrieved for the finding. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        INVALID_CLASSIFICATION_RESULT - Amazon Macie can't verify the location of the sensitive data to retrieve.
     *        There isn't a corresponding sensitive data discovery result for the finding. Or the sensitive data
     *        discovery result specified by the ClassificationDetails.detailedResultsLocation field of the finding isn't
     *        available, is malformed or corrupted, or uses an unsupported storage format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_EXCEEDS_SIZE_QUOTA - The storage size of the affected S3 object exceeds the size quota for
     *        retrieving occurrences of sensitive data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_UNAVAILABLE - The affected S3 object isn't available. The object might have been renamed, moved, or
     *        deleted. Or the object was changed after Macie created the finding.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNSUPPORTED_FINDING_TYPE - The specified finding isn't a sensitive data finding.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNSUPPORTED_OBJECT_TYPE - The affected S3 object uses a file or storage format that Macie doesn't support
     *        for retrieving occurrences of sensitive data.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This value is null if sensitive data can be retrieved for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnavailabilityReasonCode
     */

    public GetSensitiveDataOccurrencesAvailabilityResult withReasons(java.util.Collection<String> reasons) {
        setReasons(reasons);
        return this;
    }

    /**
     * <p>
     * Specifies why occurrences of sensitive data can't be retrieved for the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INVALID_CLASSIFICATION_RESULT - Amazon Macie can't verify the location of the sensitive data to retrieve. There
     * isn't a corresponding sensitive data discovery result for the finding. Or the sensitive data discovery result
     * specified by the ClassificationDetails.detailedResultsLocation field of the finding isn't available, is malformed
     * or corrupted, or uses an unsupported storage format.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_EXCEEDS_SIZE_QUOTA - The storage size of the affected S3 object exceeds the size quota for retrieving
     * occurrences of sensitive data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_UNAVAILABLE - The affected S3 object isn't available. The object might have been renamed, moved, or
     * deleted. Or the object was changed after Macie created the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_FINDING_TYPE - The specified finding isn't a sensitive data finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_OBJECT_TYPE - The affected S3 object uses a file or storage format that Macie doesn't support for
     * retrieving occurrences of sensitive data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value is null if sensitive data can be retrieved for the finding.
     * </p>
     * 
     * @param reasons
     *        Specifies why occurrences of sensitive data can't be retrieved for the finding. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        INVALID_CLASSIFICATION_RESULT - Amazon Macie can't verify the location of the sensitive data to retrieve.
     *        There isn't a corresponding sensitive data discovery result for the finding. Or the sensitive data
     *        discovery result specified by the ClassificationDetails.detailedResultsLocation field of the finding isn't
     *        available, is malformed or corrupted, or uses an unsupported storage format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_EXCEEDS_SIZE_QUOTA - The storage size of the affected S3 object exceeds the size quota for
     *        retrieving occurrences of sensitive data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_UNAVAILABLE - The affected S3 object isn't available. The object might have been renamed, moved, or
     *        deleted. Or the object was changed after Macie created the finding.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNSUPPORTED_FINDING_TYPE - The specified finding isn't a sensitive data finding.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNSUPPORTED_OBJECT_TYPE - The affected S3 object uses a file or storage format that Macie doesn't support
     *        for retrieving occurrences of sensitive data.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This value is null if sensitive data can be retrieved for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnavailabilityReasonCode
     */

    public GetSensitiveDataOccurrencesAvailabilityResult withReasons(UnavailabilityReasonCode... reasons) {
        java.util.ArrayList<String> reasonsCopy = new java.util.ArrayList<String>(reasons.length);
        for (UnavailabilityReasonCode value : reasons) {
            reasonsCopy.add(value.toString());
        }
        if (getReasons() == null) {
            setReasons(reasonsCopy);
        } else {
            getReasons().addAll(reasonsCopy);
        }
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
        if (getReasons() != null)
            sb.append("Reasons: ").append(getReasons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSensitiveDataOccurrencesAvailabilityResult == false)
            return false;
        GetSensitiveDataOccurrencesAvailabilityResult other = (GetSensitiveDataOccurrencesAvailabilityResult) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getReasons() == null ^ this.getReasons() == null)
            return false;
        if (other.getReasons() != null && other.getReasons().equals(this.getReasons()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getReasons() == null) ? 0 : getReasons().hashCode());
        return hashCode;
    }

    @Override
    public GetSensitiveDataOccurrencesAvailabilityResult clone() {
        try {
            return (GetSensitiveDataOccurrencesAvailabilityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List of operational recommendations that did not get included or excluded.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/BatchUpdateRecommendationStatusFailedEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateRecommendationStatusFailedEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier of an entry in this batch that is used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>entryId</code>s of a batch request need to be unique within a request.
     * </p>
     * </note>
     */
    private String entryId;
    /**
     * <p>
     * Indicates the error that occurred while excluding an operational recommendation.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * An identifier of an entry in this batch that is used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>entryId</code>s of a batch request need to be unique within a request.
     * </p>
     * </note>
     * 
     * @param entryId
     *        An identifier of an entry in this batch that is used to communicate the result.</p> <note>
     *        <p>
     *        The <code>entryId</code>s of a batch request need to be unique within a request.
     *        </p>
     */

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * <p>
     * An identifier of an entry in this batch that is used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>entryId</code>s of a batch request need to be unique within a request.
     * </p>
     * </note>
     * 
     * @return An identifier of an entry in this batch that is used to communicate the result.</p> <note>
     *         <p>
     *         The <code>entryId</code>s of a batch request need to be unique within a request.
     *         </p>
     */

    public String getEntryId() {
        return this.entryId;
    }

    /**
     * <p>
     * An identifier of an entry in this batch that is used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>entryId</code>s of a batch request need to be unique within a request.
     * </p>
     * </note>
     * 
     * @param entryId
     *        An identifier of an entry in this batch that is used to communicate the result.</p> <note>
     *        <p>
     *        The <code>entryId</code>s of a batch request need to be unique within a request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationStatusFailedEntry withEntryId(String entryId) {
        setEntryId(entryId);
        return this;
    }

    /**
     * <p>
     * Indicates the error that occurred while excluding an operational recommendation.
     * </p>
     * 
     * @param errorMessage
     *        Indicates the error that occurred while excluding an operational recommendation.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Indicates the error that occurred while excluding an operational recommendation.
     * </p>
     * 
     * @return Indicates the error that occurred while excluding an operational recommendation.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Indicates the error that occurred while excluding an operational recommendation.
     * </p>
     * 
     * @param errorMessage
     *        Indicates the error that occurred while excluding an operational recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationStatusFailedEntry withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getEntryId() != null)
            sb.append("EntryId: ").append(getEntryId()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateRecommendationStatusFailedEntry == false)
            return false;
        BatchUpdateRecommendationStatusFailedEntry other = (BatchUpdateRecommendationStatusFailedEntry) obj;
        if (other.getEntryId() == null ^ this.getEntryId() == null)
            return false;
        if (other.getEntryId() != null && other.getEntryId().equals(this.getEntryId()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateRecommendationStatusFailedEntry clone() {
        try {
            return (BatchUpdateRecommendationStatusFailedEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.BatchUpdateRecommendationStatusFailedEntryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

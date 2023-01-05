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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetSensitiveDataOccurrences" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSensitiveDataOccurrencesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If an error occurred when Amazon Macie attempted to retrieve occurrences of sensitive data reported by the
     * finding, a description of the error that occurred. This value is null if the status (status) of the request is
     * PROCESSING or SUCCESS.
     * </p>
     */
    private String error;
    /**
     * <p>
     * A map that specifies 1-100 types of sensitive data reported by the finding and, for each type, 1-10 occurrences
     * of sensitive data.
     * </p>
     */
    private java.util.Map<String, java.util.List<DetectedDataDetails>> sensitiveDataOccurrences;
    /**
     * <p>
     * The status of the request to retrieve occurrences of sensitive data reported by the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ERROR - An error occurred when Amazon Macie attempted to locate, retrieve, or encrypt the sensitive data. The
     * error value indicates the nature of the error that occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING - Macie is processing the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESS - Macie successfully located, retrieved, and encrypted the sensitive data.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * If an error occurred when Amazon Macie attempted to retrieve occurrences of sensitive data reported by the
     * finding, a description of the error that occurred. This value is null if the status (status) of the request is
     * PROCESSING or SUCCESS.
     * </p>
     * 
     * @param error
     *        If an error occurred when Amazon Macie attempted to retrieve occurrences of sensitive data reported by the
     *        finding, a description of the error that occurred. This value is null if the status (status) of the
     *        request is PROCESSING or SUCCESS.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * If an error occurred when Amazon Macie attempted to retrieve occurrences of sensitive data reported by the
     * finding, a description of the error that occurred. This value is null if the status (status) of the request is
     * PROCESSING or SUCCESS.
     * </p>
     * 
     * @return If an error occurred when Amazon Macie attempted to retrieve occurrences of sensitive data reported by
     *         the finding, a description of the error that occurred. This value is null if the status (status) of the
     *         request is PROCESSING or SUCCESS.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * If an error occurred when Amazon Macie attempted to retrieve occurrences of sensitive data reported by the
     * finding, a description of the error that occurred. This value is null if the status (status) of the request is
     * PROCESSING or SUCCESS.
     * </p>
     * 
     * @param error
     *        If an error occurred when Amazon Macie attempted to retrieve occurrences of sensitive data reported by the
     *        finding, a description of the error that occurred. This value is null if the status (status) of the
     *        request is PROCESSING or SUCCESS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSensitiveDataOccurrencesResult withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * A map that specifies 1-100 types of sensitive data reported by the finding and, for each type, 1-10 occurrences
     * of sensitive data.
     * </p>
     * 
     * @return A map that specifies 1-100 types of sensitive data reported by the finding and, for each type, 1-10
     *         occurrences of sensitive data.
     */

    public java.util.Map<String, java.util.List<DetectedDataDetails>> getSensitiveDataOccurrences() {
        return sensitiveDataOccurrences;
    }

    /**
     * <p>
     * A map that specifies 1-100 types of sensitive data reported by the finding and, for each type, 1-10 occurrences
     * of sensitive data.
     * </p>
     * 
     * @param sensitiveDataOccurrences
     *        A map that specifies 1-100 types of sensitive data reported by the finding and, for each type, 1-10
     *        occurrences of sensitive data.
     */

    public void setSensitiveDataOccurrences(java.util.Map<String, java.util.List<DetectedDataDetails>> sensitiveDataOccurrences) {
        this.sensitiveDataOccurrences = sensitiveDataOccurrences;
    }

    /**
     * <p>
     * A map that specifies 1-100 types of sensitive data reported by the finding and, for each type, 1-10 occurrences
     * of sensitive data.
     * </p>
     * 
     * @param sensitiveDataOccurrences
     *        A map that specifies 1-100 types of sensitive data reported by the finding and, for each type, 1-10
     *        occurrences of sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSensitiveDataOccurrencesResult withSensitiveDataOccurrences(java.util.Map<String, java.util.List<DetectedDataDetails>> sensitiveDataOccurrences) {
        setSensitiveDataOccurrences(sensitiveDataOccurrences);
        return this;
    }

    /**
     * Add a single SensitiveDataOccurrences entry
     *
     * @see GetSensitiveDataOccurrencesResult#withSensitiveDataOccurrences
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetSensitiveDataOccurrencesResult addSensitiveDataOccurrencesEntry(String key, java.util.List<DetectedDataDetails> value) {
        if (null == this.sensitiveDataOccurrences) {
            this.sensitiveDataOccurrences = new java.util.HashMap<String, java.util.List<DetectedDataDetails>>();
        }
        if (this.sensitiveDataOccurrences.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sensitiveDataOccurrences.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SensitiveDataOccurrences.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSensitiveDataOccurrencesResult clearSensitiveDataOccurrencesEntries() {
        this.sensitiveDataOccurrences = null;
        return this;
    }

    /**
     * <p>
     * The status of the request to retrieve occurrences of sensitive data reported by the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ERROR - An error occurred when Amazon Macie attempted to locate, retrieve, or encrypt the sensitive data. The
     * error value indicates the nature of the error that occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING - Macie is processing the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESS - Macie successfully located, retrieved, and encrypted the sensitive data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the request to retrieve occurrences of sensitive data reported by the finding. Possible
     *        values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ERROR - An error occurred when Amazon Macie attempted to locate, retrieve, or encrypt the sensitive data.
     *        The error value indicates the nature of the error that occurred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PROCESSING - Macie is processing the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUCCESS - Macie successfully located, retrieved, and encrypted the sensitive data.
     *        </p>
     *        </li>
     * @see RevealRequestStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the request to retrieve occurrences of sensitive data reported by the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ERROR - An error occurred when Amazon Macie attempted to locate, retrieve, or encrypt the sensitive data. The
     * error value indicates the nature of the error that occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING - Macie is processing the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESS - Macie successfully located, retrieved, and encrypted the sensitive data.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the request to retrieve occurrences of sensitive data reported by the finding. Possible
     *         values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ERROR - An error occurred when Amazon Macie attempted to locate, retrieve, or encrypt the sensitive data.
     *         The error value indicates the nature of the error that occurred.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PROCESSING - Macie is processing the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SUCCESS - Macie successfully located, retrieved, and encrypted the sensitive data.
     *         </p>
     *         </li>
     * @see RevealRequestStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the request to retrieve occurrences of sensitive data reported by the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ERROR - An error occurred when Amazon Macie attempted to locate, retrieve, or encrypt the sensitive data. The
     * error value indicates the nature of the error that occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING - Macie is processing the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESS - Macie successfully located, retrieved, and encrypted the sensitive data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the request to retrieve occurrences of sensitive data reported by the finding. Possible
     *        values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ERROR - An error occurred when Amazon Macie attempted to locate, retrieve, or encrypt the sensitive data.
     *        The error value indicates the nature of the error that occurred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PROCESSING - Macie is processing the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUCCESS - Macie successfully located, retrieved, and encrypted the sensitive data.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevealRequestStatus
     */

    public GetSensitiveDataOccurrencesResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the request to retrieve occurrences of sensitive data reported by the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ERROR - An error occurred when Amazon Macie attempted to locate, retrieve, or encrypt the sensitive data. The
     * error value indicates the nature of the error that occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING - Macie is processing the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESS - Macie successfully located, retrieved, and encrypted the sensitive data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the request to retrieve occurrences of sensitive data reported by the finding. Possible
     *        values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ERROR - An error occurred when Amazon Macie attempted to locate, retrieve, or encrypt the sensitive data.
     *        The error value indicates the nature of the error that occurred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PROCESSING - Macie is processing the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUCCESS - Macie successfully located, retrieved, and encrypted the sensitive data.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevealRequestStatus
     */

    public GetSensitiveDataOccurrencesResult withStatus(RevealRequestStatus status) {
        this.status = status.toString();
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
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getSensitiveDataOccurrences() != null)
            sb.append("SensitiveDataOccurrences: ").append(getSensitiveDataOccurrences()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSensitiveDataOccurrencesResult == false)
            return false;
        GetSensitiveDataOccurrencesResult other = (GetSensitiveDataOccurrencesResult) obj;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getSensitiveDataOccurrences() == null ^ this.getSensitiveDataOccurrences() == null)
            return false;
        if (other.getSensitiveDataOccurrences() != null && other.getSensitiveDataOccurrences().equals(this.getSensitiveDataOccurrences()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getSensitiveDataOccurrences() == null) ? 0 : getSensitiveDataOccurrences().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetSensitiveDataOccurrencesResult clone() {
        try {
            return (GetSensitiveDataOccurrencesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

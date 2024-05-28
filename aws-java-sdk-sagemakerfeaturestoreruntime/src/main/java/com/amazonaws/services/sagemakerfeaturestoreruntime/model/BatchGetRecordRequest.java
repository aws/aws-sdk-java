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
package com.amazonaws.services.sagemakerfeaturestoreruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/BatchGetRecord"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetRecordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list containing the name or Amazon Resource Name (ARN) of the <code>FeatureGroup</code>, the list of names of
     * <code>Feature</code>s to be retrieved, and the corresponding <code>RecordIdentifier</code> values as strings.
     * </p>
     */
    private java.util.List<BatchGetRecordIdentifier> identifiers;
    /**
     * <p>
     * Parameter to request <code>ExpiresAt</code> in response. If <code>Enabled</code>, <code>BatchGetRecord</code>
     * will return the value of <code>ExpiresAt</code>, if it is not null. If <code>Disabled</code> and null,
     * <code>BatchGetRecord</code> will return null.
     * </p>
     */
    private String expirationTimeResponse;

    /**
     * <p>
     * A list containing the name or Amazon Resource Name (ARN) of the <code>FeatureGroup</code>, the list of names of
     * <code>Feature</code>s to be retrieved, and the corresponding <code>RecordIdentifier</code> values as strings.
     * </p>
     * 
     * @return A list containing the name or Amazon Resource Name (ARN) of the <code>FeatureGroup</code>, the list of
     *         names of <code>Feature</code>s to be retrieved, and the corresponding <code>RecordIdentifier</code>
     *         values as strings.
     */

    public java.util.List<BatchGetRecordIdentifier> getIdentifiers() {
        return identifiers;
    }

    /**
     * <p>
     * A list containing the name or Amazon Resource Name (ARN) of the <code>FeatureGroup</code>, the list of names of
     * <code>Feature</code>s to be retrieved, and the corresponding <code>RecordIdentifier</code> values as strings.
     * </p>
     * 
     * @param identifiers
     *        A list containing the name or Amazon Resource Name (ARN) of the <code>FeatureGroup</code>, the list of
     *        names of <code>Feature</code>s to be retrieved, and the corresponding <code>RecordIdentifier</code> values
     *        as strings.
     */

    public void setIdentifiers(java.util.Collection<BatchGetRecordIdentifier> identifiers) {
        if (identifiers == null) {
            this.identifiers = null;
            return;
        }

        this.identifiers = new java.util.ArrayList<BatchGetRecordIdentifier>(identifiers);
    }

    /**
     * <p>
     * A list containing the name or Amazon Resource Name (ARN) of the <code>FeatureGroup</code>, the list of names of
     * <code>Feature</code>s to be retrieved, and the corresponding <code>RecordIdentifier</code> values as strings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentifiers(java.util.Collection)} or {@link #withIdentifiers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param identifiers
     *        A list containing the name or Amazon Resource Name (ARN) of the <code>FeatureGroup</code>, the list of
     *        names of <code>Feature</code>s to be retrieved, and the corresponding <code>RecordIdentifier</code> values
     *        as strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordRequest withIdentifiers(BatchGetRecordIdentifier... identifiers) {
        if (this.identifiers == null) {
            setIdentifiers(new java.util.ArrayList<BatchGetRecordIdentifier>(identifiers.length));
        }
        for (BatchGetRecordIdentifier ele : identifiers) {
            this.identifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the name or Amazon Resource Name (ARN) of the <code>FeatureGroup</code>, the list of names of
     * <code>Feature</code>s to be retrieved, and the corresponding <code>RecordIdentifier</code> values as strings.
     * </p>
     * 
     * @param identifiers
     *        A list containing the name or Amazon Resource Name (ARN) of the <code>FeatureGroup</code>, the list of
     *        names of <code>Feature</code>s to be retrieved, and the corresponding <code>RecordIdentifier</code> values
     *        as strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordRequest withIdentifiers(java.util.Collection<BatchGetRecordIdentifier> identifiers) {
        setIdentifiers(identifiers);
        return this;
    }

    /**
     * <p>
     * Parameter to request <code>ExpiresAt</code> in response. If <code>Enabled</code>, <code>BatchGetRecord</code>
     * will return the value of <code>ExpiresAt</code>, if it is not null. If <code>Disabled</code> and null,
     * <code>BatchGetRecord</code> will return null.
     * </p>
     * 
     * @param expirationTimeResponse
     *        Parameter to request <code>ExpiresAt</code> in response. If <code>Enabled</code>,
     *        <code>BatchGetRecord</code> will return the value of <code>ExpiresAt</code>, if it is not null. If
     *        <code>Disabled</code> and null, <code>BatchGetRecord</code> will return null.
     * @see ExpirationTimeResponse
     */

    public void setExpirationTimeResponse(String expirationTimeResponse) {
        this.expirationTimeResponse = expirationTimeResponse;
    }

    /**
     * <p>
     * Parameter to request <code>ExpiresAt</code> in response. If <code>Enabled</code>, <code>BatchGetRecord</code>
     * will return the value of <code>ExpiresAt</code>, if it is not null. If <code>Disabled</code> and null,
     * <code>BatchGetRecord</code> will return null.
     * </p>
     * 
     * @return Parameter to request <code>ExpiresAt</code> in response. If <code>Enabled</code>,
     *         <code>BatchGetRecord</code> will return the value of <code>ExpiresAt</code>, if it is not null. If
     *         <code>Disabled</code> and null, <code>BatchGetRecord</code> will return null.
     * @see ExpirationTimeResponse
     */

    public String getExpirationTimeResponse() {
        return this.expirationTimeResponse;
    }

    /**
     * <p>
     * Parameter to request <code>ExpiresAt</code> in response. If <code>Enabled</code>, <code>BatchGetRecord</code>
     * will return the value of <code>ExpiresAt</code>, if it is not null. If <code>Disabled</code> and null,
     * <code>BatchGetRecord</code> will return null.
     * </p>
     * 
     * @param expirationTimeResponse
     *        Parameter to request <code>ExpiresAt</code> in response. If <code>Enabled</code>,
     *        <code>BatchGetRecord</code> will return the value of <code>ExpiresAt</code>, if it is not null. If
     *        <code>Disabled</code> and null, <code>BatchGetRecord</code> will return null.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpirationTimeResponse
     */

    public BatchGetRecordRequest withExpirationTimeResponse(String expirationTimeResponse) {
        setExpirationTimeResponse(expirationTimeResponse);
        return this;
    }

    /**
     * <p>
     * Parameter to request <code>ExpiresAt</code> in response. If <code>Enabled</code>, <code>BatchGetRecord</code>
     * will return the value of <code>ExpiresAt</code>, if it is not null. If <code>Disabled</code> and null,
     * <code>BatchGetRecord</code> will return null.
     * </p>
     * 
     * @param expirationTimeResponse
     *        Parameter to request <code>ExpiresAt</code> in response. If <code>Enabled</code>,
     *        <code>BatchGetRecord</code> will return the value of <code>ExpiresAt</code>, if it is not null. If
     *        <code>Disabled</code> and null, <code>BatchGetRecord</code> will return null.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpirationTimeResponse
     */

    public BatchGetRecordRequest withExpirationTimeResponse(ExpirationTimeResponse expirationTimeResponse) {
        this.expirationTimeResponse = expirationTimeResponse.toString();
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
        if (getIdentifiers() != null)
            sb.append("Identifiers: ").append(getIdentifiers()).append(",");
        if (getExpirationTimeResponse() != null)
            sb.append("ExpirationTimeResponse: ").append(getExpirationTimeResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetRecordRequest == false)
            return false;
        BatchGetRecordRequest other = (BatchGetRecordRequest) obj;
        if (other.getIdentifiers() == null ^ this.getIdentifiers() == null)
            return false;
        if (other.getIdentifiers() != null && other.getIdentifiers().equals(this.getIdentifiers()) == false)
            return false;
        if (other.getExpirationTimeResponse() == null ^ this.getExpirationTimeResponse() == null)
            return false;
        if (other.getExpirationTimeResponse() != null && other.getExpirationTimeResponse().equals(this.getExpirationTimeResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifiers() == null) ? 0 : getIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getExpirationTimeResponse() == null) ? 0 : getExpirationTimeResponse().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetRecordRequest clone() {
        return (BatchGetRecordRequest) super.clone();
    }

}

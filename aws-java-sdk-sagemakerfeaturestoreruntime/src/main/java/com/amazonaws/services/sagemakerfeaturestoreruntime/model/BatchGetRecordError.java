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
package com.amazonaws.services.sagemakerfeaturestoreruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The error that has occurred when attempting to retrieve a batch of Records.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/BatchGetRecordError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetRecordError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the feature group that the record belongs to.
     * </p>
     */
    private String featureGroupName;
    /**
     * <p>
     * The value for the <code>RecordIdentifier</code> in string format of a Record from a <code>FeatureGroup</code>
     * that is causing an error when attempting to be retrieved.
     * </p>
     */
    private String recordIdentifierValueAsString;
    /**
     * <p>
     * The error code of an error that has occured when attempting to retrieve a batch of Records. For more information
     * on errors, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_GetRecord.html#API_feature_store_GetRecord_Errors"
     * > Errors</a>.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message of an error that has occured when attempting to retrieve a record in the batch.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The name of the feature group that the record belongs to.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group that the record belongs to.
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group that the record belongs to.
     * </p>
     * 
     * @return The name of the feature group that the record belongs to.
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group that the record belongs to.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group that the record belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordError withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
        return this;
    }

    /**
     * <p>
     * The value for the <code>RecordIdentifier</code> in string format of a Record from a <code>FeatureGroup</code>
     * that is causing an error when attempting to be retrieved.
     * </p>
     * 
     * @param recordIdentifierValueAsString
     *        The value for the <code>RecordIdentifier</code> in string format of a Record from a
     *        <code>FeatureGroup</code> that is causing an error when attempting to be retrieved.
     */

    public void setRecordIdentifierValueAsString(String recordIdentifierValueAsString) {
        this.recordIdentifierValueAsString = recordIdentifierValueAsString;
    }

    /**
     * <p>
     * The value for the <code>RecordIdentifier</code> in string format of a Record from a <code>FeatureGroup</code>
     * that is causing an error when attempting to be retrieved.
     * </p>
     * 
     * @return The value for the <code>RecordIdentifier</code> in string format of a Record from a
     *         <code>FeatureGroup</code> that is causing an error when attempting to be retrieved.
     */

    public String getRecordIdentifierValueAsString() {
        return this.recordIdentifierValueAsString;
    }

    /**
     * <p>
     * The value for the <code>RecordIdentifier</code> in string format of a Record from a <code>FeatureGroup</code>
     * that is causing an error when attempting to be retrieved.
     * </p>
     * 
     * @param recordIdentifierValueAsString
     *        The value for the <code>RecordIdentifier</code> in string format of a Record from a
     *        <code>FeatureGroup</code> that is causing an error when attempting to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordError withRecordIdentifierValueAsString(String recordIdentifierValueAsString) {
        setRecordIdentifierValueAsString(recordIdentifierValueAsString);
        return this;
    }

    /**
     * <p>
     * The error code of an error that has occured when attempting to retrieve a batch of Records. For more information
     * on errors, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_GetRecord.html#API_feature_store_GetRecord_Errors"
     * > Errors</a>.
     * </p>
     * 
     * @param errorCode
     *        The error code of an error that has occured when attempting to retrieve a batch of Records. For more
     *        information on errors, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_GetRecord.html#API_feature_store_GetRecord_Errors"
     *        > Errors</a>.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code of an error that has occured when attempting to retrieve a batch of Records. For more information
     * on errors, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_GetRecord.html#API_feature_store_GetRecord_Errors"
     * > Errors</a>.
     * </p>
     * 
     * @return The error code of an error that has occured when attempting to retrieve a batch of Records. For more
     *         information on errors, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_GetRecord.html#API_feature_store_GetRecord_Errors"
     *         > Errors</a>.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code of an error that has occured when attempting to retrieve a batch of Records. For more information
     * on errors, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_GetRecord.html#API_feature_store_GetRecord_Errors"
     * > Errors</a>.
     * </p>
     * 
     * @param errorCode
     *        The error code of an error that has occured when attempting to retrieve a batch of Records. For more
     *        information on errors, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_GetRecord.html#API_feature_store_GetRecord_Errors"
     *        > Errors</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error message of an error that has occured when attempting to retrieve a record in the batch.
     * </p>
     * 
     * @param errorMessage
     *        The error message of an error that has occured when attempting to retrieve a record in the batch.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message of an error that has occured when attempting to retrieve a record in the batch.
     * </p>
     * 
     * @return The error message of an error that has occured when attempting to retrieve a record in the batch.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message of an error that has occured when attempting to retrieve a record in the batch.
     * </p>
     * 
     * @param errorMessage
     *        The error message of an error that has occured when attempting to retrieve a record in the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordError withErrorMessage(String errorMessage) {
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
        if (getFeatureGroupName() != null)
            sb.append("FeatureGroupName: ").append(getFeatureGroupName()).append(",");
        if (getRecordIdentifierValueAsString() != null)
            sb.append("RecordIdentifierValueAsString: ").append(getRecordIdentifierValueAsString()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
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

        if (obj instanceof BatchGetRecordError == false)
            return false;
        BatchGetRecordError other = (BatchGetRecordError) obj;
        if (other.getFeatureGroupName() == null ^ this.getFeatureGroupName() == null)
            return false;
        if (other.getFeatureGroupName() != null && other.getFeatureGroupName().equals(this.getFeatureGroupName()) == false)
            return false;
        if (other.getRecordIdentifierValueAsString() == null ^ this.getRecordIdentifierValueAsString() == null)
            return false;
        if (other.getRecordIdentifierValueAsString() != null
                && other.getRecordIdentifierValueAsString().equals(this.getRecordIdentifierValueAsString()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
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

        hashCode = prime * hashCode + ((getFeatureGroupName() == null) ? 0 : getFeatureGroupName().hashCode());
        hashCode = prime * hashCode + ((getRecordIdentifierValueAsString() == null) ? 0 : getRecordIdentifierValueAsString().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetRecordError clone() {
        try {
            return (BatchGetRecordError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakerfeaturestoreruntime.model.transform.BatchGetRecordErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

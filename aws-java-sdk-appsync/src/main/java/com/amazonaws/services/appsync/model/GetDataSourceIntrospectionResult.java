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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetDataSourceIntrospection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataSourceIntrospectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The introspection ID. Each introspection contains a unique ID that can be used to reference the instrospection
     * record.
     * </p>
     */
    private String introspectionId;
    /**
     * <p>
     * The status of the introspection during retrieval. By default, when a new instrospection is being retrieved, the
     * status will be set to <code>PROCESSING</code>. Once the operation has been completed, the status will change to
     * <code>SUCCESS</code> or <code>FAILED</code> depending on how the data was parsed. A <code>FAILED</code> operation
     * will return an error and its details as an <code>introspectionStatusDetail</code>.
     * </p>
     */
    private String introspectionStatus;
    /**
     * <p>
     * The error detail field. When a <code>FAILED</code> <code>introspectionStatus</code> is returned, the
     * <code>introspectionStatusDetail</code> will also return the exact error that was generated during the operation.
     * </p>
     */
    private String introspectionStatusDetail;
    /**
     * <p>
     * The <code>DataSourceIntrospectionResult</code> object data.
     * </p>
     */
    private DataSourceIntrospectionResult introspectionResult;

    /**
     * <p>
     * The introspection ID. Each introspection contains a unique ID that can be used to reference the instrospection
     * record.
     * </p>
     * 
     * @param introspectionId
     *        The introspection ID. Each introspection contains a unique ID that can be used to reference the
     *        instrospection record.
     */

    public void setIntrospectionId(String introspectionId) {
        this.introspectionId = introspectionId;
    }

    /**
     * <p>
     * The introspection ID. Each introspection contains a unique ID that can be used to reference the instrospection
     * record.
     * </p>
     * 
     * @return The introspection ID. Each introspection contains a unique ID that can be used to reference the
     *         instrospection record.
     */

    public String getIntrospectionId() {
        return this.introspectionId;
    }

    /**
     * <p>
     * The introspection ID. Each introspection contains a unique ID that can be used to reference the instrospection
     * record.
     * </p>
     * 
     * @param introspectionId
     *        The introspection ID. Each introspection contains a unique ID that can be used to reference the
     *        instrospection record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceIntrospectionResult withIntrospectionId(String introspectionId) {
        setIntrospectionId(introspectionId);
        return this;
    }

    /**
     * <p>
     * The status of the introspection during retrieval. By default, when a new instrospection is being retrieved, the
     * status will be set to <code>PROCESSING</code>. Once the operation has been completed, the status will change to
     * <code>SUCCESS</code> or <code>FAILED</code> depending on how the data was parsed. A <code>FAILED</code> operation
     * will return an error and its details as an <code>introspectionStatusDetail</code>.
     * </p>
     * 
     * @param introspectionStatus
     *        The status of the introspection during retrieval. By default, when a new instrospection is being
     *        retrieved, the status will be set to <code>PROCESSING</code>. Once the operation has been completed, the
     *        status will change to <code>SUCCESS</code> or <code>FAILED</code> depending on how the data was parsed. A
     *        <code>FAILED</code> operation will return an error and its details as an
     *        <code>introspectionStatusDetail</code>.
     * @see DataSourceIntrospectionStatus
     */

    public void setIntrospectionStatus(String introspectionStatus) {
        this.introspectionStatus = introspectionStatus;
    }

    /**
     * <p>
     * The status of the introspection during retrieval. By default, when a new instrospection is being retrieved, the
     * status will be set to <code>PROCESSING</code>. Once the operation has been completed, the status will change to
     * <code>SUCCESS</code> or <code>FAILED</code> depending on how the data was parsed. A <code>FAILED</code> operation
     * will return an error and its details as an <code>introspectionStatusDetail</code>.
     * </p>
     * 
     * @return The status of the introspection during retrieval. By default, when a new instrospection is being
     *         retrieved, the status will be set to <code>PROCESSING</code>. Once the operation has been completed, the
     *         status will change to <code>SUCCESS</code> or <code>FAILED</code> depending on how the data was parsed. A
     *         <code>FAILED</code> operation will return an error and its details as an
     *         <code>introspectionStatusDetail</code>.
     * @see DataSourceIntrospectionStatus
     */

    public String getIntrospectionStatus() {
        return this.introspectionStatus;
    }

    /**
     * <p>
     * The status of the introspection during retrieval. By default, when a new instrospection is being retrieved, the
     * status will be set to <code>PROCESSING</code>. Once the operation has been completed, the status will change to
     * <code>SUCCESS</code> or <code>FAILED</code> depending on how the data was parsed. A <code>FAILED</code> operation
     * will return an error and its details as an <code>introspectionStatusDetail</code>.
     * </p>
     * 
     * @param introspectionStatus
     *        The status of the introspection during retrieval. By default, when a new instrospection is being
     *        retrieved, the status will be set to <code>PROCESSING</code>. Once the operation has been completed, the
     *        status will change to <code>SUCCESS</code> or <code>FAILED</code> depending on how the data was parsed. A
     *        <code>FAILED</code> operation will return an error and its details as an
     *        <code>introspectionStatusDetail</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceIntrospectionStatus
     */

    public GetDataSourceIntrospectionResult withIntrospectionStatus(String introspectionStatus) {
        setIntrospectionStatus(introspectionStatus);
        return this;
    }

    /**
     * <p>
     * The status of the introspection during retrieval. By default, when a new instrospection is being retrieved, the
     * status will be set to <code>PROCESSING</code>. Once the operation has been completed, the status will change to
     * <code>SUCCESS</code> or <code>FAILED</code> depending on how the data was parsed. A <code>FAILED</code> operation
     * will return an error and its details as an <code>introspectionStatusDetail</code>.
     * </p>
     * 
     * @param introspectionStatus
     *        The status of the introspection during retrieval. By default, when a new instrospection is being
     *        retrieved, the status will be set to <code>PROCESSING</code>. Once the operation has been completed, the
     *        status will change to <code>SUCCESS</code> or <code>FAILED</code> depending on how the data was parsed. A
     *        <code>FAILED</code> operation will return an error and its details as an
     *        <code>introspectionStatusDetail</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceIntrospectionStatus
     */

    public GetDataSourceIntrospectionResult withIntrospectionStatus(DataSourceIntrospectionStatus introspectionStatus) {
        this.introspectionStatus = introspectionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The error detail field. When a <code>FAILED</code> <code>introspectionStatus</code> is returned, the
     * <code>introspectionStatusDetail</code> will also return the exact error that was generated during the operation.
     * </p>
     * 
     * @param introspectionStatusDetail
     *        The error detail field. When a <code>FAILED</code> <code>introspectionStatus</code> is returned, the
     *        <code>introspectionStatusDetail</code> will also return the exact error that was generated during the
     *        operation.
     */

    public void setIntrospectionStatusDetail(String introspectionStatusDetail) {
        this.introspectionStatusDetail = introspectionStatusDetail;
    }

    /**
     * <p>
     * The error detail field. When a <code>FAILED</code> <code>introspectionStatus</code> is returned, the
     * <code>introspectionStatusDetail</code> will also return the exact error that was generated during the operation.
     * </p>
     * 
     * @return The error detail field. When a <code>FAILED</code> <code>introspectionStatus</code> is returned, the
     *         <code>introspectionStatusDetail</code> will also return the exact error that was generated during the
     *         operation.
     */

    public String getIntrospectionStatusDetail() {
        return this.introspectionStatusDetail;
    }

    /**
     * <p>
     * The error detail field. When a <code>FAILED</code> <code>introspectionStatus</code> is returned, the
     * <code>introspectionStatusDetail</code> will also return the exact error that was generated during the operation.
     * </p>
     * 
     * @param introspectionStatusDetail
     *        The error detail field. When a <code>FAILED</code> <code>introspectionStatus</code> is returned, the
     *        <code>introspectionStatusDetail</code> will also return the exact error that was generated during the
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceIntrospectionResult withIntrospectionStatusDetail(String introspectionStatusDetail) {
        setIntrospectionStatusDetail(introspectionStatusDetail);
        return this;
    }

    /**
     * <p>
     * The <code>DataSourceIntrospectionResult</code> object data.
     * </p>
     * 
     * @param introspectionResult
     *        The <code>DataSourceIntrospectionResult</code> object data.
     */

    public void setIntrospectionResult(DataSourceIntrospectionResult introspectionResult) {
        this.introspectionResult = introspectionResult;
    }

    /**
     * <p>
     * The <code>DataSourceIntrospectionResult</code> object data.
     * </p>
     * 
     * @return The <code>DataSourceIntrospectionResult</code> object data.
     */

    public DataSourceIntrospectionResult getIntrospectionResult() {
        return this.introspectionResult;
    }

    /**
     * <p>
     * The <code>DataSourceIntrospectionResult</code> object data.
     * </p>
     * 
     * @param introspectionResult
     *        The <code>DataSourceIntrospectionResult</code> object data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceIntrospectionResult withIntrospectionResult(DataSourceIntrospectionResult introspectionResult) {
        setIntrospectionResult(introspectionResult);
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
        if (getIntrospectionId() != null)
            sb.append("IntrospectionId: ").append(getIntrospectionId()).append(",");
        if (getIntrospectionStatus() != null)
            sb.append("IntrospectionStatus: ").append(getIntrospectionStatus()).append(",");
        if (getIntrospectionStatusDetail() != null)
            sb.append("IntrospectionStatusDetail: ").append(getIntrospectionStatusDetail()).append(",");
        if (getIntrospectionResult() != null)
            sb.append("IntrospectionResult: ").append(getIntrospectionResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataSourceIntrospectionResult == false)
            return false;
        GetDataSourceIntrospectionResult other = (GetDataSourceIntrospectionResult) obj;
        if (other.getIntrospectionId() == null ^ this.getIntrospectionId() == null)
            return false;
        if (other.getIntrospectionId() != null && other.getIntrospectionId().equals(this.getIntrospectionId()) == false)
            return false;
        if (other.getIntrospectionStatus() == null ^ this.getIntrospectionStatus() == null)
            return false;
        if (other.getIntrospectionStatus() != null && other.getIntrospectionStatus().equals(this.getIntrospectionStatus()) == false)
            return false;
        if (other.getIntrospectionStatusDetail() == null ^ this.getIntrospectionStatusDetail() == null)
            return false;
        if (other.getIntrospectionStatusDetail() != null && other.getIntrospectionStatusDetail().equals(this.getIntrospectionStatusDetail()) == false)
            return false;
        if (other.getIntrospectionResult() == null ^ this.getIntrospectionResult() == null)
            return false;
        if (other.getIntrospectionResult() != null && other.getIntrospectionResult().equals(this.getIntrospectionResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntrospectionId() == null) ? 0 : getIntrospectionId().hashCode());
        hashCode = prime * hashCode + ((getIntrospectionStatus() == null) ? 0 : getIntrospectionStatus().hashCode());
        hashCode = prime * hashCode + ((getIntrospectionStatusDetail() == null) ? 0 : getIntrospectionStatusDetail().hashCode());
        hashCode = prime * hashCode + ((getIntrospectionResult() == null) ? 0 : getIntrospectionResult().hashCode());
        return hashCode;
    }

    @Override
    public GetDataSourceIntrospectionResult clone() {
        try {
            return (GetDataSourceIntrospectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

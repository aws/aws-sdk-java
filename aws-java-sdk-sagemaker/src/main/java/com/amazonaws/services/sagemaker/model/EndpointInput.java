/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Input object for the endpoint
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EndpointInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An endpoint in customer's account which has enabled <code>DataCaptureConfig</code> enabled.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * Path to the filesystem where the endpoint data is available to the container.
     * </p>
     */
    private String localPath;
    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     * monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     */
    private String s3InputMode;
    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     * <code>FullyReplicated</code>
     * </p>
     */
    private String s3DataDistributionType;

    /**
     * <p>
     * An endpoint in customer's account which has enabled <code>DataCaptureConfig</code> enabled.
     * </p>
     * 
     * @param endpointName
     *        An endpoint in customer's account which has enabled <code>DataCaptureConfig</code> enabled.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * An endpoint in customer's account which has enabled <code>DataCaptureConfig</code> enabled.
     * </p>
     * 
     * @return An endpoint in customer's account which has enabled <code>DataCaptureConfig</code> enabled.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * An endpoint in customer's account which has enabled <code>DataCaptureConfig</code> enabled.
     * </p>
     * 
     * @param endpointName
     *        An endpoint in customer's account which has enabled <code>DataCaptureConfig</code> enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointInput withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * Path to the filesystem where the endpoint data is available to the container.
     * </p>
     * 
     * @param localPath
     *        Path to the filesystem where the endpoint data is available to the container.
     */

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * Path to the filesystem where the endpoint data is available to the container.
     * </p>
     * 
     * @return Path to the filesystem where the endpoint data is available to the container.
     */

    public String getLocalPath() {
        return this.localPath;
    }

    /**
     * <p>
     * Path to the filesystem where the endpoint data is available to the container.
     * </p>
     * 
     * @param localPath
     *        Path to the filesystem where the endpoint data is available to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointInput withLocalPath(String localPath) {
        setLocalPath(localPath);
        return this;
    }

    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     * monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     * 
     * @param s3InputMode
     *        Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     *        monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful
     *        for small files that fit in memory. Defaults to <code>File</code>.
     * @see ProcessingS3InputMode
     */

    public void setS3InputMode(String s3InputMode) {
        this.s3InputMode = s3InputMode;
    }

    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     * monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     * 
     * @return Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     *         monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is
     *         useful for small files that fit in memory. Defaults to <code>File</code>.
     * @see ProcessingS3InputMode
     */

    public String getS3InputMode() {
        return this.s3InputMode;
    }

    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     * monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     * 
     * @param s3InputMode
     *        Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     *        monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful
     *        for small files that fit in memory. Defaults to <code>File</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3InputMode
     */

    public EndpointInput withS3InputMode(String s3InputMode) {
        setS3InputMode(s3InputMode);
        return this;
    }

    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     * monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     * 
     * @param s3InputMode
     *        Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     *        monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful
     *        for small files that fit in memory. Defaults to <code>File</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3InputMode
     */

    public EndpointInput withS3InputMode(ProcessingS3InputMode s3InputMode) {
        this.s3InputMode = s3InputMode.toString();
        return this;
    }

    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     * <code>FullyReplicated</code>
     * </p>
     * 
     * @param s3DataDistributionType
     *        Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     *        <code>FullyReplicated</code>
     * @see ProcessingS3DataDistributionType
     */

    public void setS3DataDistributionType(String s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType;
    }

    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     * <code>FullyReplicated</code>
     * </p>
     * 
     * @return Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     *         <code>FullyReplicated</code>
     * @see ProcessingS3DataDistributionType
     */

    public String getS3DataDistributionType() {
        return this.s3DataDistributionType;
    }

    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     * <code>FullyReplicated</code>
     * </p>
     * 
     * @param s3DataDistributionType
     *        Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     *        <code>FullyReplicated</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3DataDistributionType
     */

    public EndpointInput withS3DataDistributionType(String s3DataDistributionType) {
        setS3DataDistributionType(s3DataDistributionType);
        return this;
    }

    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     * <code>FullyReplicated</code>
     * </p>
     * 
     * @param s3DataDistributionType
     *        Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     *        <code>FullyReplicated</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3DataDistributionType
     */

    public EndpointInput withS3DataDistributionType(ProcessingS3DataDistributionType s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType.toString();
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getLocalPath() != null)
            sb.append("LocalPath: ").append(getLocalPath()).append(",");
        if (getS3InputMode() != null)
            sb.append("S3InputMode: ").append(getS3InputMode()).append(",");
        if (getS3DataDistributionType() != null)
            sb.append("S3DataDistributionType: ").append(getS3DataDistributionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointInput == false)
            return false;
        EndpointInput other = (EndpointInput) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        if (other.getS3InputMode() == null ^ this.getS3InputMode() == null)
            return false;
        if (other.getS3InputMode() != null && other.getS3InputMode().equals(this.getS3InputMode()) == false)
            return false;
        if (other.getS3DataDistributionType() == null ^ this.getS3DataDistributionType() == null)
            return false;
        if (other.getS3DataDistributionType() != null && other.getS3DataDistributionType().equals(this.getS3DataDistributionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        hashCode = prime * hashCode + ((getS3InputMode() == null) ? 0 : getS3InputMode().hashCode());
        hashCode = prime * hashCode + ((getS3DataDistributionType() == null) ? 0 : getS3DataDistributionType().hashCode());
        return hashCode;
    }

    @Override
    public EndpointInput clone() {
        try {
            return (EndpointInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EndpointInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

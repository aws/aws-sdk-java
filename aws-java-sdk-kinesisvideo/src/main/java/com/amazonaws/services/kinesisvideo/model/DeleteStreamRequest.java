/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DeleteStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to delete.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * Optional: The version of the stream that you want to delete.
     * </p>
     * <p>
     * Specify the version as a safeguard to ensure that your are deleting the correct stream. To get the stream
     * version, use the <code>DescribeStream</code> API.
     * </p>
     * <p>
     * If not specified, only the <code>CreationTime</code> is checked before deleting the stream.
     * </p>
     */
    private String currentVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to delete.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream that you want to delete.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stream that you want to delete.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to delete.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStreamRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * Optional: The version of the stream that you want to delete.
     * </p>
     * <p>
     * Specify the version as a safeguard to ensure that your are deleting the correct stream. To get the stream
     * version, use the <code>DescribeStream</code> API.
     * </p>
     * <p>
     * If not specified, only the <code>CreationTime</code> is checked before deleting the stream.
     * </p>
     * 
     * @param currentVersion
     *        Optional: The version of the stream that you want to delete. </p>
     *        <p>
     *        Specify the version as a safeguard to ensure that your are deleting the correct stream. To get the stream
     *        version, use the <code>DescribeStream</code> API.
     *        </p>
     *        <p>
     *        If not specified, only the <code>CreationTime</code> is checked before deleting the stream.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * Optional: The version of the stream that you want to delete.
     * </p>
     * <p>
     * Specify the version as a safeguard to ensure that your are deleting the correct stream. To get the stream
     * version, use the <code>DescribeStream</code> API.
     * </p>
     * <p>
     * If not specified, only the <code>CreationTime</code> is checked before deleting the stream.
     * </p>
     * 
     * @return Optional: The version of the stream that you want to delete. </p>
     *         <p>
     *         Specify the version as a safeguard to ensure that your are deleting the correct stream. To get the stream
     *         version, use the <code>DescribeStream</code> API.
     *         </p>
     *         <p>
     *         If not specified, only the <code>CreationTime</code> is checked before deleting the stream.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * Optional: The version of the stream that you want to delete.
     * </p>
     * <p>
     * Specify the version as a safeguard to ensure that your are deleting the correct stream. To get the stream
     * version, use the <code>DescribeStream</code> API.
     * </p>
     * <p>
     * If not specified, only the <code>CreationTime</code> is checked before deleting the stream.
     * </p>
     * 
     * @param currentVersion
     *        Optional: The version of the stream that you want to delete. </p>
     *        <p>
     *        Specify the version as a safeguard to ensure that your are deleting the correct stream. To get the stream
     *        version, use the <code>DescribeStream</code> API.
     *        </p>
     *        <p>
     *        If not specified, only the <code>CreationTime</code> is checked before deleting the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStreamRequest withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
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
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteStreamRequest == false)
            return false;
        DeleteStreamRequest other = (DeleteStreamRequest) obj;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        return hashCode;
    }

    @Override
    public DeleteStreamRequest clone() {
        return (DeleteStreamRequest) super.clone();
    }

}

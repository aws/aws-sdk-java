/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateFileSystemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * String of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     * </p>
     */
    private String creationToken;
    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance mode
     * for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of
     * aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file
     * operations. This can't be changed after the file system has been created.
     * </p>
     */
    private String performanceMode;

    /**
     * <p>
     * String of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     * </p>
     * 
     * @param creationToken
     *        String of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     */

    public void setCreationToken(String creationToken) {
        this.creationToken = creationToken;
    }

    /**
     * <p>
     * String of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     * </p>
     * 
     * @return String of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     */

    public String getCreationToken() {
        return this.creationToken;
    }

    /**
     * <p>
     * String of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     * </p>
     * 
     * @param creationToken
     *        String of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withCreationToken(String creationToken) {
        setCreationToken(creationToken);
        return this;
    }

    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance mode
     * for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of
     * aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file
     * operations. This can't be changed after the file system has been created.
     * </p>
     * 
     * @param performanceMode
     *        The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance
     *        mode for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher
     *        levels of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for
     *        most file operations. This can't be changed after the file system has been created.
     * @see PerformanceMode
     */

    public void setPerformanceMode(String performanceMode) {
        this.performanceMode = performanceMode;
    }

    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance mode
     * for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of
     * aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file
     * operations. This can't be changed after the file system has been created.
     * </p>
     * 
     * @return The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance
     *         mode for most file systems. File systems using the <code>maxIO</code> performance mode can scale to
     *         higher levels of aggregate throughput and operations per second with a tradeoff of slightly higher
     *         latencies for most file operations. This can't be changed after the file system has been created.
     * @see PerformanceMode
     */

    public String getPerformanceMode() {
        return this.performanceMode;
    }

    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance mode
     * for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of
     * aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file
     * operations. This can't be changed after the file system has been created.
     * </p>
     * 
     * @param performanceMode
     *        The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance
     *        mode for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher
     *        levels of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for
     *        most file operations. This can't be changed after the file system has been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PerformanceMode
     */

    public CreateFileSystemRequest withPerformanceMode(String performanceMode) {
        setPerformanceMode(performanceMode);
        return this;
    }

    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance mode
     * for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of
     * aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file
     * operations. This can't be changed after the file system has been created.
     * </p>
     * 
     * @param performanceMode
     *        The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance
     *        mode for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher
     *        levels of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for
     *        most file operations. This can't be changed after the file system has been created.
     * @see PerformanceMode
     */

    public void setPerformanceMode(PerformanceMode performanceMode) {
        this.performanceMode = performanceMode.toString();
    }

    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance mode
     * for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of
     * aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file
     * operations. This can't be changed after the file system has been created.
     * </p>
     * 
     * @param performanceMode
     *        The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance
     *        mode for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher
     *        levels of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for
     *        most file operations. This can't be changed after the file system has been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PerformanceMode
     */

    public CreateFileSystemRequest withPerformanceMode(PerformanceMode performanceMode) {
        setPerformanceMode(performanceMode);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCreationToken() != null)
            sb.append("CreationToken: " + getCreationToken() + ",");
        if (getPerformanceMode() != null)
            sb.append("PerformanceMode: " + getPerformanceMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFileSystemRequest == false)
            return false;
        CreateFileSystemRequest other = (CreateFileSystemRequest) obj;
        if (other.getCreationToken() == null ^ this.getCreationToken() == null)
            return false;
        if (other.getCreationToken() != null && other.getCreationToken().equals(this.getCreationToken()) == false)
            return false;
        if (other.getPerformanceMode() == null ^ this.getPerformanceMode() == null)
            return false;
        if (other.getPerformanceMode() != null && other.getPerformanceMode().equals(this.getPerformanceMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationToken() == null) ? 0 : getCreationToken().hashCode());
        hashCode = prime * hashCode + ((getPerformanceMode() == null) ? 0 : getPerformanceMode().hashCode());
        return hashCode;
    }

    @Override
    public CreateFileSystemRequest clone() {
        return (CreateFileSystemRequest) super.clone();
    }
}

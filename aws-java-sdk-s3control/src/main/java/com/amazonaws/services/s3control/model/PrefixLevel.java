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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A container for the prefix-level configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PrefixLevel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrefixLevel implements Serializable, Cloneable {

    /**
     * <p>
     * A container for the prefix-level storage metrics for S3 Storage Lens.
     * </p>
     */
    private PrefixLevelStorageMetrics storageMetrics;

    /**
     * <p>
     * A container for the prefix-level storage metrics for S3 Storage Lens.
     * </p>
     * 
     * @param storageMetrics
     *        A container for the prefix-level storage metrics for S3 Storage Lens.
     */

    public void setStorageMetrics(PrefixLevelStorageMetrics storageMetrics) {
        this.storageMetrics = storageMetrics;
    }

    /**
     * <p>
     * A container for the prefix-level storage metrics for S3 Storage Lens.
     * </p>
     * 
     * @return A container for the prefix-level storage metrics for S3 Storage Lens.
     */

    public PrefixLevelStorageMetrics getStorageMetrics() {
        return this.storageMetrics;
    }

    /**
     * <p>
     * A container for the prefix-level storage metrics for S3 Storage Lens.
     * </p>
     * 
     * @param storageMetrics
     *        A container for the prefix-level storage metrics for S3 Storage Lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefixLevel withStorageMetrics(PrefixLevelStorageMetrics storageMetrics) {
        setStorageMetrics(storageMetrics);
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
        if (getStorageMetrics() != null)
            sb.append("StorageMetrics: ").append(getStorageMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrefixLevel == false)
            return false;
        PrefixLevel other = (PrefixLevel) obj;
        if (other.getStorageMetrics() == null ^ this.getStorageMetrics() == null)
            return false;
        if (other.getStorageMetrics() != null && other.getStorageMetrics().equals(this.getStorageMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageMetrics() == null) ? 0 : getStorageMetrics().hashCode());
        return hashCode;
    }

    @Override
    public PrefixLevel clone() {
        try {
            return (PrefixLevel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

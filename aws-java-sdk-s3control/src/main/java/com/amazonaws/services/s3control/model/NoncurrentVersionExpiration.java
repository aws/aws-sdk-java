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
 * The container of the noncurrent version expiration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/NoncurrentVersionExpiration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NoncurrentVersionExpiration implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For
     * information about the noncurrent days calculations, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     * >How Amazon S3 Calculates When an Object Became Noncurrent</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     */
    private Integer noncurrentDays;

    /**
     * <p>
     * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For
     * information about the noncurrent days calculations, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     * >How Amazon S3 Calculates When an Object Became Noncurrent</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param noncurrentDays
     *        Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action.
     *        For information about the noncurrent days calculations, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     *        >How Amazon S3 Calculates When an Object Became Noncurrent</a> in the <i>Amazon S3 User Guide</i>.
     */

    public void setNoncurrentDays(Integer noncurrentDays) {
        this.noncurrentDays = noncurrentDays;
    }

    /**
     * <p>
     * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For
     * information about the noncurrent days calculations, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     * >How Amazon S3 Calculates When an Object Became Noncurrent</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action.
     *         For information about the noncurrent days calculations, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     *         >How Amazon S3 Calculates When an Object Became Noncurrent</a> in the <i>Amazon S3 User Guide</i>.
     */

    public Integer getNoncurrentDays() {
        return this.noncurrentDays;
    }

    /**
     * <p>
     * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For
     * information about the noncurrent days calculations, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     * >How Amazon S3 Calculates When an Object Became Noncurrent</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param noncurrentDays
     *        Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action.
     *        For information about the noncurrent days calculations, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     *        >How Amazon S3 Calculates When an Object Became Noncurrent</a> in the <i>Amazon S3 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NoncurrentVersionExpiration withNoncurrentDays(Integer noncurrentDays) {
        setNoncurrentDays(noncurrentDays);
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
        if (getNoncurrentDays() != null)
            sb.append("NoncurrentDays: ").append(getNoncurrentDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NoncurrentVersionExpiration == false)
            return false;
        NoncurrentVersionExpiration other = (NoncurrentVersionExpiration) obj;
        if (other.getNoncurrentDays() == null ^ this.getNoncurrentDays() == null)
            return false;
        if (other.getNoncurrentDays() != null && other.getNoncurrentDays().equals(this.getNoncurrentDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNoncurrentDays() == null) ? 0 : getNoncurrentDays().hashCode());
        return hashCode;
    }

    @Override
    public NoncurrentVersionExpiration clone() {
        try {
            return (NoncurrentVersionExpiration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A filter condition that specifies the object size range of included objects in bytes. Only integers are supported.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/MatchObjectSize" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchObjectSize implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the minimum object size in Bytes. The value must be a positive number, greater than 0 and less than 5
     * TB.
     * </p>
     */
    private Long bytesGreaterThan;
    /**
     * <p>
     * Specifies the maximum object size in Bytes. The value must be a positive number, greater than the minimum object
     * size and less than 5 TB.
     * </p>
     */
    private Long bytesLessThan;

    /**
     * <p>
     * Specifies the minimum object size in Bytes. The value must be a positive number, greater than 0 and less than 5
     * TB.
     * </p>
     * 
     * @param bytesGreaterThan
     *        Specifies the minimum object size in Bytes. The value must be a positive number, greater than 0 and less
     *        than 5 TB.
     */

    public void setBytesGreaterThan(Long bytesGreaterThan) {
        this.bytesGreaterThan = bytesGreaterThan;
    }

    /**
     * <p>
     * Specifies the minimum object size in Bytes. The value must be a positive number, greater than 0 and less than 5
     * TB.
     * </p>
     * 
     * @return Specifies the minimum object size in Bytes. The value must be a positive number, greater than 0 and less
     *         than 5 TB.
     */

    public Long getBytesGreaterThan() {
        return this.bytesGreaterThan;
    }

    /**
     * <p>
     * Specifies the minimum object size in Bytes. The value must be a positive number, greater than 0 and less than 5
     * TB.
     * </p>
     * 
     * @param bytesGreaterThan
     *        Specifies the minimum object size in Bytes. The value must be a positive number, greater than 0 and less
     *        than 5 TB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchObjectSize withBytesGreaterThan(Long bytesGreaterThan) {
        setBytesGreaterThan(bytesGreaterThan);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum object size in Bytes. The value must be a positive number, greater than the minimum object
     * size and less than 5 TB.
     * </p>
     * 
     * @param bytesLessThan
     *        Specifies the maximum object size in Bytes. The value must be a positive number, greater than the minimum
     *        object size and less than 5 TB.
     */

    public void setBytesLessThan(Long bytesLessThan) {
        this.bytesLessThan = bytesLessThan;
    }

    /**
     * <p>
     * Specifies the maximum object size in Bytes. The value must be a positive number, greater than the minimum object
     * size and less than 5 TB.
     * </p>
     * 
     * @return Specifies the maximum object size in Bytes. The value must be a positive number, greater than the minimum
     *         object size and less than 5 TB.
     */

    public Long getBytesLessThan() {
        return this.bytesLessThan;
    }

    /**
     * <p>
     * Specifies the maximum object size in Bytes. The value must be a positive number, greater than the minimum object
     * size and less than 5 TB.
     * </p>
     * 
     * @param bytesLessThan
     *        Specifies the maximum object size in Bytes. The value must be a positive number, greater than the minimum
     *        object size and less than 5 TB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchObjectSize withBytesLessThan(Long bytesLessThan) {
        setBytesLessThan(bytesLessThan);
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
        if (getBytesGreaterThan() != null)
            sb.append("BytesGreaterThan: ").append(getBytesGreaterThan()).append(",");
        if (getBytesLessThan() != null)
            sb.append("BytesLessThan: ").append(getBytesLessThan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchObjectSize == false)
            return false;
        MatchObjectSize other = (MatchObjectSize) obj;
        if (other.getBytesGreaterThan() == null ^ this.getBytesGreaterThan() == null)
            return false;
        if (other.getBytesGreaterThan() != null && other.getBytesGreaterThan().equals(this.getBytesGreaterThan()) == false)
            return false;
        if (other.getBytesLessThan() == null ^ this.getBytesLessThan() == null)
            return false;
        if (other.getBytesLessThan() != null && other.getBytesLessThan().equals(this.getBytesLessThan()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBytesGreaterThan() == null) ? 0 : getBytesGreaterThan().hashCode());
        hashCode = prime * hashCode + ((getBytesLessThan() == null) ? 0 : getBytesLessThan().hashCode());
        return hashCode;
    }

    @Override
    public MatchObjectSize clone() {
        try {
            return (MatchObjectSize) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

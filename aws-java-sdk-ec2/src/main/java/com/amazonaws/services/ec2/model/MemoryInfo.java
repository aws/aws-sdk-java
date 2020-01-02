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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the memory for the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/MemoryInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemoryInfo implements Serializable, Cloneable {

    /**
     * <p>
     * Size of the memory, in MiB.
     * </p>
     */
    private Long sizeInMiB;

    /**
     * <p>
     * Size of the memory, in MiB.
     * </p>
     * 
     * @param sizeInMiB
     *        Size of the memory, in MiB.
     */

    public void setSizeInMiB(Long sizeInMiB) {
        this.sizeInMiB = sizeInMiB;
    }

    /**
     * <p>
     * Size of the memory, in MiB.
     * </p>
     * 
     * @return Size of the memory, in MiB.
     */

    public Long getSizeInMiB() {
        return this.sizeInMiB;
    }

    /**
     * <p>
     * Size of the memory, in MiB.
     * </p>
     * 
     * @param sizeInMiB
     *        Size of the memory, in MiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemoryInfo withSizeInMiB(Long sizeInMiB) {
        setSizeInMiB(sizeInMiB);
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
        if (getSizeInMiB() != null)
            sb.append("SizeInMiB: ").append(getSizeInMiB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemoryInfo == false)
            return false;
        MemoryInfo other = (MemoryInfo) obj;
        if (other.getSizeInMiB() == null ^ this.getSizeInMiB() == null)
            return false;
        if (other.getSizeInMiB() != null && other.getSizeInMiB().equals(this.getSizeInMiB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSizeInMiB() == null) ? 0 : getSizeInMiB().hashCode());
        return hashCode;
    }

    @Override
    public MemoryInfo clone() {
        try {
            return (MemoryInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

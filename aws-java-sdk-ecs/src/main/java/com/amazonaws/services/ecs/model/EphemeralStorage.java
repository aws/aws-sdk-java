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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of
 * ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/userguide/using_data_volumes.html">Fargate task storage</a> in the
 * <i>Amazon ECS User Guide for AWS Fargate</i>.
 * </p>
 * <note>
 * <p>
 * This parameter is only supported for tasks hosted on AWS Fargate using platform version <code>1.4.0</code> or later.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/EphemeralStorage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EphemeralStorage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total amount, in GiB, of ephemeral storage to set for the task. The minimum supported value is
     * <code>21</code> GiB and the maximum supported value is <code>200</code> GiB.
     * </p>
     */
    private Integer sizeInGiB;

    /**
     * <p>
     * The total amount, in GiB, of ephemeral storage to set for the task. The minimum supported value is
     * <code>21</code> GiB and the maximum supported value is <code>200</code> GiB.
     * </p>
     * 
     * @param sizeInGiB
     *        The total amount, in GiB, of ephemeral storage to set for the task. The minimum supported value is
     *        <code>21</code> GiB and the maximum supported value is <code>200</code> GiB.
     */

    public void setSizeInGiB(Integer sizeInGiB) {
        this.sizeInGiB = sizeInGiB;
    }

    /**
     * <p>
     * The total amount, in GiB, of ephemeral storage to set for the task. The minimum supported value is
     * <code>21</code> GiB and the maximum supported value is <code>200</code> GiB.
     * </p>
     * 
     * @return The total amount, in GiB, of ephemeral storage to set for the task. The minimum supported value is
     *         <code>21</code> GiB and the maximum supported value is <code>200</code> GiB.
     */

    public Integer getSizeInGiB() {
        return this.sizeInGiB;
    }

    /**
     * <p>
     * The total amount, in GiB, of ephemeral storage to set for the task. The minimum supported value is
     * <code>21</code> GiB and the maximum supported value is <code>200</code> GiB.
     * </p>
     * 
     * @param sizeInGiB
     *        The total amount, in GiB, of ephemeral storage to set for the task. The minimum supported value is
     *        <code>21</code> GiB and the maximum supported value is <code>200</code> GiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EphemeralStorage withSizeInGiB(Integer sizeInGiB) {
        setSizeInGiB(sizeInGiB);
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
        if (getSizeInGiB() != null)
            sb.append("SizeInGiB: ").append(getSizeInGiB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EphemeralStorage == false)
            return false;
        EphemeralStorage other = (EphemeralStorage) obj;
        if (other.getSizeInGiB() == null ^ this.getSizeInGiB() == null)
            return false;
        if (other.getSizeInGiB() != null && other.getSizeInGiB().equals(this.getSizeInGiB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSizeInGiB() == null) ? 0 : getSizeInGiB().hashCode());
        return hashCode;
    }

    @Override
    public EphemeralStorage clone() {
        try {
            return (EphemeralStorage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.EphemeralStorageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

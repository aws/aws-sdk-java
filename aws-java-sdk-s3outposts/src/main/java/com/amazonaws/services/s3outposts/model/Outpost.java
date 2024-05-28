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
package com.amazonaws.services.s3outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the details for the Outpost object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/Outpost" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Outpost implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the outpost.
     * </p>
     */
    private String outpostArn;
    /**
     * <p>
     * Specifies the unique S3 on Outposts ARN for use with Resource Access Manager (RAM).
     * </p>
     */
    private String s3OutpostArn;
    /**
     * <p>
     * Specifies the unique identifier for the outpost.
     * </p>
     */
    private String outpostId;
    /**
     * <p>
     * Returns the Amazon Web Services account ID of the outpost owner. Useful for comparing owned versus shared
     * outposts.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The Amazon S3 capacity of the outpost in bytes.
     * </p>
     */
    private Long capacityInBytes;

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the outpost.
     * </p>
     * 
     * @param outpostArn
     *        Specifies the unique Amazon Resource Name (ARN) for the outpost.
     */

    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the outpost.
     * </p>
     * 
     * @return Specifies the unique Amazon Resource Name (ARN) for the outpost.
     */

    public String getOutpostArn() {
        return this.outpostArn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the outpost.
     * </p>
     * 
     * @param outpostArn
     *        Specifies the unique Amazon Resource Name (ARN) for the outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Outpost withOutpostArn(String outpostArn) {
        setOutpostArn(outpostArn);
        return this;
    }

    /**
     * <p>
     * Specifies the unique S3 on Outposts ARN for use with Resource Access Manager (RAM).
     * </p>
     * 
     * @param s3OutpostArn
     *        Specifies the unique S3 on Outposts ARN for use with Resource Access Manager (RAM).
     */

    public void setS3OutpostArn(String s3OutpostArn) {
        this.s3OutpostArn = s3OutpostArn;
    }

    /**
     * <p>
     * Specifies the unique S3 on Outposts ARN for use with Resource Access Manager (RAM).
     * </p>
     * 
     * @return Specifies the unique S3 on Outposts ARN for use with Resource Access Manager (RAM).
     */

    public String getS3OutpostArn() {
        return this.s3OutpostArn;
    }

    /**
     * <p>
     * Specifies the unique S3 on Outposts ARN for use with Resource Access Manager (RAM).
     * </p>
     * 
     * @param s3OutpostArn
     *        Specifies the unique S3 on Outposts ARN for use with Resource Access Manager (RAM).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Outpost withS3OutpostArn(String s3OutpostArn) {
        setS3OutpostArn(s3OutpostArn);
        return this;
    }

    /**
     * <p>
     * Specifies the unique identifier for the outpost.
     * </p>
     * 
     * @param outpostId
     *        Specifies the unique identifier for the outpost.
     */

    public void setOutpostId(String outpostId) {
        this.outpostId = outpostId;
    }

    /**
     * <p>
     * Specifies the unique identifier for the outpost.
     * </p>
     * 
     * @return Specifies the unique identifier for the outpost.
     */

    public String getOutpostId() {
        return this.outpostId;
    }

    /**
     * <p>
     * Specifies the unique identifier for the outpost.
     * </p>
     * 
     * @param outpostId
     *        Specifies the unique identifier for the outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Outpost withOutpostId(String outpostId) {
        setOutpostId(outpostId);
        return this;
    }

    /**
     * <p>
     * Returns the Amazon Web Services account ID of the outpost owner. Useful for comparing owned versus shared
     * outposts.
     * </p>
     * 
     * @param ownerId
     *        Returns the Amazon Web Services account ID of the outpost owner. Useful for comparing owned versus shared
     *        outposts.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * Returns the Amazon Web Services account ID of the outpost owner. Useful for comparing owned versus shared
     * outposts.
     * </p>
     * 
     * @return Returns the Amazon Web Services account ID of the outpost owner. Useful for comparing owned versus shared
     *         outposts.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * Returns the Amazon Web Services account ID of the outpost owner. Useful for comparing owned versus shared
     * outposts.
     * </p>
     * 
     * @param ownerId
     *        Returns the Amazon Web Services account ID of the outpost owner. Useful for comparing owned versus shared
     *        outposts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Outpost withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 capacity of the outpost in bytes.
     * </p>
     * 
     * @param capacityInBytes
     *        The Amazon S3 capacity of the outpost in bytes.
     */

    public void setCapacityInBytes(Long capacityInBytes) {
        this.capacityInBytes = capacityInBytes;
    }

    /**
     * <p>
     * The Amazon S3 capacity of the outpost in bytes.
     * </p>
     * 
     * @return The Amazon S3 capacity of the outpost in bytes.
     */

    public Long getCapacityInBytes() {
        return this.capacityInBytes;
    }

    /**
     * <p>
     * The Amazon S3 capacity of the outpost in bytes.
     * </p>
     * 
     * @param capacityInBytes
     *        The Amazon S3 capacity of the outpost in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Outpost withCapacityInBytes(Long capacityInBytes) {
        setCapacityInBytes(capacityInBytes);
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
        if (getOutpostArn() != null)
            sb.append("OutpostArn: ").append(getOutpostArn()).append(",");
        if (getS3OutpostArn() != null)
            sb.append("S3OutpostArn: ").append(getS3OutpostArn()).append(",");
        if (getOutpostId() != null)
            sb.append("OutpostId: ").append(getOutpostId()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getCapacityInBytes() != null)
            sb.append("CapacityInBytes: ").append(getCapacityInBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Outpost == false)
            return false;
        Outpost other = (Outpost) obj;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getS3OutpostArn() == null ^ this.getS3OutpostArn() == null)
            return false;
        if (other.getS3OutpostArn() != null && other.getS3OutpostArn().equals(this.getS3OutpostArn()) == false)
            return false;
        if (other.getOutpostId() == null ^ this.getOutpostId() == null)
            return false;
        if (other.getOutpostId() != null && other.getOutpostId().equals(this.getOutpostId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getCapacityInBytes() == null ^ this.getCapacityInBytes() == null)
            return false;
        if (other.getCapacityInBytes() != null && other.getCapacityInBytes().equals(this.getCapacityInBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getS3OutpostArn() == null) ? 0 : getS3OutpostArn().hashCode());
        hashCode = prime * hashCode + ((getOutpostId() == null) ? 0 : getOutpostId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getCapacityInBytes() == null) ? 0 : getCapacityInBytes().hashCode());
        return hashCode;
    }

    @Override
    public Outpost clone() {
        try {
            return (Outpost) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.s3outposts.model.transform.OutpostMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

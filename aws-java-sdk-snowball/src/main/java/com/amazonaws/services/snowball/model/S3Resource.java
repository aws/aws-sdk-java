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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Each <code>S3Resource</code> object represents an Amazon S3 bucket that your transferred data will be exported from
 * or imported into. For export jobs, this object can have an optional <code>KeyRange</code> value. The length of the
 * range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an inclusive
 * <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/S3Resource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket.
     * </p>
     */
    private String bucketArn;
    /**
     * <p>
     * For export jobs, you can provide an optional <code>KeyRange</code> within a specific Amazon S3 bucket. The length
     * of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an inclusive
     * <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
     * </p>
     */
    private KeyRange keyRange;
    /**
     * <p>
     * Specifies the service or services on the Snow Family device that your transferred data will be exported from or
     * imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     * </p>
     */
    private java.util.List<TargetOnDeviceService> targetOnDeviceServices;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket.
     * </p>
     * 
     * @param bucketArn
     *        The Amazon Resource Name (ARN) of an Amazon S3 bucket.
     */

    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Amazon S3 bucket.
     */

    public String getBucketArn() {
        return this.bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket.
     * </p>
     * 
     * @param bucketArn
     *        The Amazon Resource Name (ARN) of an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Resource withBucketArn(String bucketArn) {
        setBucketArn(bucketArn);
        return this;
    }

    /**
     * <p>
     * For export jobs, you can provide an optional <code>KeyRange</code> within a specific Amazon S3 bucket. The length
     * of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an inclusive
     * <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
     * </p>
     * 
     * @param keyRange
     *        For export jobs, you can provide an optional <code>KeyRange</code> within a specific Amazon S3 bucket. The
     *        length of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an
     *        inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
     */

    public void setKeyRange(KeyRange keyRange) {
        this.keyRange = keyRange;
    }

    /**
     * <p>
     * For export jobs, you can provide an optional <code>KeyRange</code> within a specific Amazon S3 bucket. The length
     * of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an inclusive
     * <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
     * </p>
     * 
     * @return For export jobs, you can provide an optional <code>KeyRange</code> within a specific Amazon S3 bucket.
     *         The length of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>,
     *         an inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
     */

    public KeyRange getKeyRange() {
        return this.keyRange;
    }

    /**
     * <p>
     * For export jobs, you can provide an optional <code>KeyRange</code> within a specific Amazon S3 bucket. The length
     * of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an inclusive
     * <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
     * </p>
     * 
     * @param keyRange
     *        For export jobs, you can provide an optional <code>KeyRange</code> within a specific Amazon S3 bucket. The
     *        length of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an
     *        inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Resource withKeyRange(KeyRange keyRange) {
        setKeyRange(keyRange);
        return this;
    }

    /**
     * <p>
     * Specifies the service or services on the Snow Family device that your transferred data will be exported from or
     * imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     * </p>
     * 
     * @return Specifies the service or services on the Snow Family device that your transferred data will be exported
     *         from or imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     */

    public java.util.List<TargetOnDeviceService> getTargetOnDeviceServices() {
        return targetOnDeviceServices;
    }

    /**
     * <p>
     * Specifies the service or services on the Snow Family device that your transferred data will be exported from or
     * imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     * </p>
     * 
     * @param targetOnDeviceServices
     *        Specifies the service or services on the Snow Family device that your transferred data will be exported
     *        from or imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     */

    public void setTargetOnDeviceServices(java.util.Collection<TargetOnDeviceService> targetOnDeviceServices) {
        if (targetOnDeviceServices == null) {
            this.targetOnDeviceServices = null;
            return;
        }

        this.targetOnDeviceServices = new java.util.ArrayList<TargetOnDeviceService>(targetOnDeviceServices);
    }

    /**
     * <p>
     * Specifies the service or services on the Snow Family device that your transferred data will be exported from or
     * imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetOnDeviceServices(java.util.Collection)} or
     * {@link #withTargetOnDeviceServices(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetOnDeviceServices
     *        Specifies the service or services on the Snow Family device that your transferred data will be exported
     *        from or imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Resource withTargetOnDeviceServices(TargetOnDeviceService... targetOnDeviceServices) {
        if (this.targetOnDeviceServices == null) {
            setTargetOnDeviceServices(new java.util.ArrayList<TargetOnDeviceService>(targetOnDeviceServices.length));
        }
        for (TargetOnDeviceService ele : targetOnDeviceServices) {
            this.targetOnDeviceServices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the service or services on the Snow Family device that your transferred data will be exported from or
     * imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     * </p>
     * 
     * @param targetOnDeviceServices
     *        Specifies the service or services on the Snow Family device that your transferred data will be exported
     *        from or imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Resource withTargetOnDeviceServices(java.util.Collection<TargetOnDeviceService> targetOnDeviceServices) {
        setTargetOnDeviceServices(targetOnDeviceServices);
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
        if (getBucketArn() != null)
            sb.append("BucketArn: ").append(getBucketArn()).append(",");
        if (getKeyRange() != null)
            sb.append("KeyRange: ").append(getKeyRange()).append(",");
        if (getTargetOnDeviceServices() != null)
            sb.append("TargetOnDeviceServices: ").append(getTargetOnDeviceServices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Resource == false)
            return false;
        S3Resource other = (S3Resource) obj;
        if (other.getBucketArn() == null ^ this.getBucketArn() == null)
            return false;
        if (other.getBucketArn() != null && other.getBucketArn().equals(this.getBucketArn()) == false)
            return false;
        if (other.getKeyRange() == null ^ this.getKeyRange() == null)
            return false;
        if (other.getKeyRange() != null && other.getKeyRange().equals(this.getKeyRange()) == false)
            return false;
        if (other.getTargetOnDeviceServices() == null ^ this.getTargetOnDeviceServices() == null)
            return false;
        if (other.getTargetOnDeviceServices() != null && other.getTargetOnDeviceServices().equals(this.getTargetOnDeviceServices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketArn() == null) ? 0 : getBucketArn().hashCode());
        hashCode = prime * hashCode + ((getKeyRange() == null) ? 0 : getKeyRange().hashCode());
        hashCode = prime * hashCode + ((getTargetOnDeviceServices() == null) ? 0 : getTargetOnDeviceServices().hashCode());
        return hashCode;
    }

    @Override
    public S3Resource clone() {
        try {
            return (S3Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.S3ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

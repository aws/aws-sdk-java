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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure representing input configuration of ZonalStatistics operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ZonalStatisticsConfigInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ZonalStatisticsConfigInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of zonal statistics to compute.
     * </p>
     */
    private java.util.List<String> statistics;
    /**
     * <p>
     * Bands used in the operation. If no target bands are specified, it uses all bands available input.
     * </p>
     */
    private java.util.List<String> targetBands;
    /**
     * <p>
     * The Amazon S3 path pointing to the GeoJSON containing the polygonal zones.
     * </p>
     */
    private String zoneS3Path;
    /**
     * <p>
     * The Amazon Resource Name (ARN) or an ID of a Amazon Web Services Key Management Service (Amazon Web Services KMS)
     * key that Amazon SageMaker uses to decrypt your output artifacts with Amazon S3 server-side encryption. The
     * SageMaker execution role must have <code>kms:GenerateDataKey</code> permission.
     * </p>
     * <p>
     * The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about key identifiers, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     * (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     * </p>
     */
    private String zoneS3PathKmsKeyId;

    /**
     * <p>
     * List of zonal statistics to compute.
     * </p>
     * 
     * @return List of zonal statistics to compute.
     * @see ZonalStatistics
     */

    public java.util.List<String> getStatistics() {
        return statistics;
    }

    /**
     * <p>
     * List of zonal statistics to compute.
     * </p>
     * 
     * @param statistics
     *        List of zonal statistics to compute.
     * @see ZonalStatistics
     */

    public void setStatistics(java.util.Collection<String> statistics) {
        if (statistics == null) {
            this.statistics = null;
            return;
        }

        this.statistics = new java.util.ArrayList<String>(statistics);
    }

    /**
     * <p>
     * List of zonal statistics to compute.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatistics(java.util.Collection)} or {@link #withStatistics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statistics
     *        List of zonal statistics to compute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalStatistics
     */

    public ZonalStatisticsConfigInput withStatistics(String... statistics) {
        if (this.statistics == null) {
            setStatistics(new java.util.ArrayList<String>(statistics.length));
        }
        for (String ele : statistics) {
            this.statistics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of zonal statistics to compute.
     * </p>
     * 
     * @param statistics
     *        List of zonal statistics to compute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalStatistics
     */

    public ZonalStatisticsConfigInput withStatistics(java.util.Collection<String> statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * List of zonal statistics to compute.
     * </p>
     * 
     * @param statistics
     *        List of zonal statistics to compute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalStatistics
     */

    public ZonalStatisticsConfigInput withStatistics(ZonalStatistics... statistics) {
        java.util.ArrayList<String> statisticsCopy = new java.util.ArrayList<String>(statistics.length);
        for (ZonalStatistics value : statistics) {
            statisticsCopy.add(value.toString());
        }
        if (getStatistics() == null) {
            setStatistics(statisticsCopy);
        } else {
            getStatistics().addAll(statisticsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Bands used in the operation. If no target bands are specified, it uses all bands available input.
     * </p>
     * 
     * @return Bands used in the operation. If no target bands are specified, it uses all bands available input.
     */

    public java.util.List<String> getTargetBands() {
        return targetBands;
    }

    /**
     * <p>
     * Bands used in the operation. If no target bands are specified, it uses all bands available input.
     * </p>
     * 
     * @param targetBands
     *        Bands used in the operation. If no target bands are specified, it uses all bands available input.
     */

    public void setTargetBands(java.util.Collection<String> targetBands) {
        if (targetBands == null) {
            this.targetBands = null;
            return;
        }

        this.targetBands = new java.util.ArrayList<String>(targetBands);
    }

    /**
     * <p>
     * Bands used in the operation. If no target bands are specified, it uses all bands available input.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetBands(java.util.Collection)} or {@link #withTargetBands(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetBands
     *        Bands used in the operation. If no target bands are specified, it uses all bands available input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZonalStatisticsConfigInput withTargetBands(String... targetBands) {
        if (this.targetBands == null) {
            setTargetBands(new java.util.ArrayList<String>(targetBands.length));
        }
        for (String ele : targetBands) {
            this.targetBands.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Bands used in the operation. If no target bands are specified, it uses all bands available input.
     * </p>
     * 
     * @param targetBands
     *        Bands used in the operation. If no target bands are specified, it uses all bands available input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZonalStatisticsConfigInput withTargetBands(java.util.Collection<String> targetBands) {
        setTargetBands(targetBands);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path pointing to the GeoJSON containing the polygonal zones.
     * </p>
     * 
     * @param zoneS3Path
     *        The Amazon S3 path pointing to the GeoJSON containing the polygonal zones.
     */

    public void setZoneS3Path(String zoneS3Path) {
        this.zoneS3Path = zoneS3Path;
    }

    /**
     * <p>
     * The Amazon S3 path pointing to the GeoJSON containing the polygonal zones.
     * </p>
     * 
     * @return The Amazon S3 path pointing to the GeoJSON containing the polygonal zones.
     */

    public String getZoneS3Path() {
        return this.zoneS3Path;
    }

    /**
     * <p>
     * The Amazon S3 path pointing to the GeoJSON containing the polygonal zones.
     * </p>
     * 
     * @param zoneS3Path
     *        The Amazon S3 path pointing to the GeoJSON containing the polygonal zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZonalStatisticsConfigInput withZoneS3Path(String zoneS3Path) {
        setZoneS3Path(zoneS3Path);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or an ID of a Amazon Web Services Key Management Service (Amazon Web Services KMS)
     * key that Amazon SageMaker uses to decrypt your output artifacts with Amazon S3 server-side encryption. The
     * SageMaker execution role must have <code>kms:GenerateDataKey</code> permission.
     * </p>
     * <p>
     * The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about key identifiers, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     * (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     * </p>
     * 
     * @param zoneS3PathKmsKeyId
     *        The Amazon Resource Name (ARN) or an ID of a Amazon Web Services Key Management Service (Amazon Web
     *        Services KMS) key that Amazon SageMaker uses to decrypt your output artifacts with Amazon S3 server-side
     *        encryption. The SageMaker execution role must have <code>kms:GenerateDataKey</code> permission.</p>
     *        <p>
     *        The <code>KmsKeyId</code> can be any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        // KMS Key ID
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about key identifiers, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     *        (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     */

    public void setZoneS3PathKmsKeyId(String zoneS3PathKmsKeyId) {
        this.zoneS3PathKmsKeyId = zoneS3PathKmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or an ID of a Amazon Web Services Key Management Service (Amazon Web Services KMS)
     * key that Amazon SageMaker uses to decrypt your output artifacts with Amazon S3 server-side encryption. The
     * SageMaker execution role must have <code>kms:GenerateDataKey</code> permission.
     * </p>
     * <p>
     * The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about key identifiers, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     * (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) or an ID of a Amazon Web Services Key Management Service (Amazon Web
     *         Services KMS) key that Amazon SageMaker uses to decrypt your output artifacts with Amazon S3 server-side
     *         encryption. The SageMaker execution role must have <code>kms:GenerateDataKey</code> permission.</p>
     *         <p>
     *         The <code>KmsKeyId</code> can be any of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         // KMS Key ID
     *         </p>
     *         <p>
     *         <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         // Amazon Resource Name (ARN) of a KMS Key
     *         </p>
     *         <p>
     *         <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about key identifiers, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     *         (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     */

    public String getZoneS3PathKmsKeyId() {
        return this.zoneS3PathKmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or an ID of a Amazon Web Services Key Management Service (Amazon Web Services KMS)
     * key that Amazon SageMaker uses to decrypt your output artifacts with Amazon S3 server-side encryption. The
     * SageMaker execution role must have <code>kms:GenerateDataKey</code> permission.
     * </p>
     * <p>
     * The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about key identifiers, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     * (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     * </p>
     * 
     * @param zoneS3PathKmsKeyId
     *        The Amazon Resource Name (ARN) or an ID of a Amazon Web Services Key Management Service (Amazon Web
     *        Services KMS) key that Amazon SageMaker uses to decrypt your output artifacts with Amazon S3 server-side
     *        encryption. The SageMaker execution role must have <code>kms:GenerateDataKey</code> permission.</p>
     *        <p>
     *        The <code>KmsKeyId</code> can be any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        // KMS Key ID
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about key identifiers, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     *        (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZonalStatisticsConfigInput withZoneS3PathKmsKeyId(String zoneS3PathKmsKeyId) {
        setZoneS3PathKmsKeyId(zoneS3PathKmsKeyId);
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
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
        if (getTargetBands() != null)
            sb.append("TargetBands: ").append(getTargetBands()).append(",");
        if (getZoneS3Path() != null)
            sb.append("ZoneS3Path: ").append(getZoneS3Path()).append(",");
        if (getZoneS3PathKmsKeyId() != null)
            sb.append("ZoneS3PathKmsKeyId: ").append(getZoneS3PathKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ZonalStatisticsConfigInput == false)
            return false;
        ZonalStatisticsConfigInput other = (ZonalStatisticsConfigInput) obj;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getTargetBands() == null ^ this.getTargetBands() == null)
            return false;
        if (other.getTargetBands() != null && other.getTargetBands().equals(this.getTargetBands()) == false)
            return false;
        if (other.getZoneS3Path() == null ^ this.getZoneS3Path() == null)
            return false;
        if (other.getZoneS3Path() != null && other.getZoneS3Path().equals(this.getZoneS3Path()) == false)
            return false;
        if (other.getZoneS3PathKmsKeyId() == null ^ this.getZoneS3PathKmsKeyId() == null)
            return false;
        if (other.getZoneS3PathKmsKeyId() != null && other.getZoneS3PathKmsKeyId().equals(this.getZoneS3PathKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getTargetBands() == null) ? 0 : getTargetBands().hashCode());
        hashCode = prime * hashCode + ((getZoneS3Path() == null) ? 0 : getZoneS3Path().hashCode());
        hashCode = prime * hashCode + ((getZoneS3PathKmsKeyId() == null) ? 0 : getZoneS3PathKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public ZonalStatisticsConfigInput clone() {
        try {
            return (ZonalStatisticsConfigInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.ZonalStatisticsConfigInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

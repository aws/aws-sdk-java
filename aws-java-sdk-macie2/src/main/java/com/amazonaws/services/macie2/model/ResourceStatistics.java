/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides statistical data for sensitive data discovery metrics that apply to an S3 bucket that Amazon Macie monitors
 * and analyzes for your account. The statistics capture the results of automated sensitive data discovery activities
 * that Macie has performed for the bucket. The data is available only if automated sensitive data discovery is
 * currently enabled for your account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ResourceStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total amount of data, in bytes, that Amazon Macie has analyzed in the bucket.
     * </p>
     */
    private Long totalBytesClassified;
    /**
     * <p>
     * The total number of occurrences of sensitive data that Amazon Macie has found in the bucket's objects. This
     * includes occurrences that are currently suppressed by the sensitivity scoring settings for the bucket
     * (totalDetectionsSuppressed).
     * </p>
     */
    private Long totalDetections;
    /**
     * <p>
     * The total number of occurrences of sensitive data that are currently suppressed by the sensitivity scoring
     * settings for the bucket. These represent occurrences of sensitive data that Amazon Macie found in the bucket's
     * objects, but the occurrences were manually suppressed. By default, suppressed occurrences are excluded from the
     * bucket's sensitivity score.
     * </p>
     */
    private Long totalDetectionsSuppressed;
    /**
     * <p>
     * The total number of objects that Amazon Macie has analyzed in the bucket.
     * </p>
     */
    private Long totalItemsClassified;
    /**
     * <p>
     * The total number of the bucket's objects that Amazon Macie has found sensitive data in.
     * </p>
     */
    private Long totalItemsSensitive;
    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket due to an error or issue. For
     * example, the object is a malformed file. This value includes objects that Macie hasn't analyzed for reasons
     * reported by other statistics in the ResourceStatistics object.
     * </p>
     */
    private Long totalItemsSkipped;
    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are encrypted
     * with a key that Macie isn't allowed to use.
     * </p>
     */
    private Long totalItemsSkippedInvalidEncryption;
    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are encrypted
     * with an KMS key that was disabled or deleted.
     * </p>
     */
    private Long totalItemsSkippedInvalidKms;
    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket because Macie isn't allowed to access
     * the objects.
     * </p>
     */
    private Long totalItemsSkippedPermissionDenied;

    /**
     * <p>
     * The total amount of data, in bytes, that Amazon Macie has analyzed in the bucket.
     * </p>
     * 
     * @param totalBytesClassified
     *        The total amount of data, in bytes, that Amazon Macie has analyzed in the bucket.
     */

    public void setTotalBytesClassified(Long totalBytesClassified) {
        this.totalBytesClassified = totalBytesClassified;
    }

    /**
     * <p>
     * The total amount of data, in bytes, that Amazon Macie has analyzed in the bucket.
     * </p>
     * 
     * @return The total amount of data, in bytes, that Amazon Macie has analyzed in the bucket.
     */

    public Long getTotalBytesClassified() {
        return this.totalBytesClassified;
    }

    /**
     * <p>
     * The total amount of data, in bytes, that Amazon Macie has analyzed in the bucket.
     * </p>
     * 
     * @param totalBytesClassified
     *        The total amount of data, in bytes, that Amazon Macie has analyzed in the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceStatistics withTotalBytesClassified(Long totalBytesClassified) {
        setTotalBytesClassified(totalBytesClassified);
        return this;
    }

    /**
     * <p>
     * The total number of occurrences of sensitive data that Amazon Macie has found in the bucket's objects. This
     * includes occurrences that are currently suppressed by the sensitivity scoring settings for the bucket
     * (totalDetectionsSuppressed).
     * </p>
     * 
     * @param totalDetections
     *        The total number of occurrences of sensitive data that Amazon Macie has found in the bucket's objects.
     *        This includes occurrences that are currently suppressed by the sensitivity scoring settings for the bucket
     *        (totalDetectionsSuppressed).
     */

    public void setTotalDetections(Long totalDetections) {
        this.totalDetections = totalDetections;
    }

    /**
     * <p>
     * The total number of occurrences of sensitive data that Amazon Macie has found in the bucket's objects. This
     * includes occurrences that are currently suppressed by the sensitivity scoring settings for the bucket
     * (totalDetectionsSuppressed).
     * </p>
     * 
     * @return The total number of occurrences of sensitive data that Amazon Macie has found in the bucket's objects.
     *         This includes occurrences that are currently suppressed by the sensitivity scoring settings for the
     *         bucket (totalDetectionsSuppressed).
     */

    public Long getTotalDetections() {
        return this.totalDetections;
    }

    /**
     * <p>
     * The total number of occurrences of sensitive data that Amazon Macie has found in the bucket's objects. This
     * includes occurrences that are currently suppressed by the sensitivity scoring settings for the bucket
     * (totalDetectionsSuppressed).
     * </p>
     * 
     * @param totalDetections
     *        The total number of occurrences of sensitive data that Amazon Macie has found in the bucket's objects.
     *        This includes occurrences that are currently suppressed by the sensitivity scoring settings for the bucket
     *        (totalDetectionsSuppressed).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceStatistics withTotalDetections(Long totalDetections) {
        setTotalDetections(totalDetections);
        return this;
    }

    /**
     * <p>
     * The total number of occurrences of sensitive data that are currently suppressed by the sensitivity scoring
     * settings for the bucket. These represent occurrences of sensitive data that Amazon Macie found in the bucket's
     * objects, but the occurrences were manually suppressed. By default, suppressed occurrences are excluded from the
     * bucket's sensitivity score.
     * </p>
     * 
     * @param totalDetectionsSuppressed
     *        The total number of occurrences of sensitive data that are currently suppressed by the sensitivity scoring
     *        settings for the bucket. These represent occurrences of sensitive data that Amazon Macie found in the
     *        bucket's objects, but the occurrences were manually suppressed. By default, suppressed occurrences are
     *        excluded from the bucket's sensitivity score.
     */

    public void setTotalDetectionsSuppressed(Long totalDetectionsSuppressed) {
        this.totalDetectionsSuppressed = totalDetectionsSuppressed;
    }

    /**
     * <p>
     * The total number of occurrences of sensitive data that are currently suppressed by the sensitivity scoring
     * settings for the bucket. These represent occurrences of sensitive data that Amazon Macie found in the bucket's
     * objects, but the occurrences were manually suppressed. By default, suppressed occurrences are excluded from the
     * bucket's sensitivity score.
     * </p>
     * 
     * @return The total number of occurrences of sensitive data that are currently suppressed by the sensitivity
     *         scoring settings for the bucket. These represent occurrences of sensitive data that Amazon Macie found in
     *         the bucket's objects, but the occurrences were manually suppressed. By default, suppressed occurrences
     *         are excluded from the bucket's sensitivity score.
     */

    public Long getTotalDetectionsSuppressed() {
        return this.totalDetectionsSuppressed;
    }

    /**
     * <p>
     * The total number of occurrences of sensitive data that are currently suppressed by the sensitivity scoring
     * settings for the bucket. These represent occurrences of sensitive data that Amazon Macie found in the bucket's
     * objects, but the occurrences were manually suppressed. By default, suppressed occurrences are excluded from the
     * bucket's sensitivity score.
     * </p>
     * 
     * @param totalDetectionsSuppressed
     *        The total number of occurrences of sensitive data that are currently suppressed by the sensitivity scoring
     *        settings for the bucket. These represent occurrences of sensitive data that Amazon Macie found in the
     *        bucket's objects, but the occurrences were manually suppressed. By default, suppressed occurrences are
     *        excluded from the bucket's sensitivity score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceStatistics withTotalDetectionsSuppressed(Long totalDetectionsSuppressed) {
        setTotalDetectionsSuppressed(totalDetectionsSuppressed);
        return this;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie has analyzed in the bucket.
     * </p>
     * 
     * @param totalItemsClassified
     *        The total number of objects that Amazon Macie has analyzed in the bucket.
     */

    public void setTotalItemsClassified(Long totalItemsClassified) {
        this.totalItemsClassified = totalItemsClassified;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie has analyzed in the bucket.
     * </p>
     * 
     * @return The total number of objects that Amazon Macie has analyzed in the bucket.
     */

    public Long getTotalItemsClassified() {
        return this.totalItemsClassified;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie has analyzed in the bucket.
     * </p>
     * 
     * @param totalItemsClassified
     *        The total number of objects that Amazon Macie has analyzed in the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceStatistics withTotalItemsClassified(Long totalItemsClassified) {
        setTotalItemsClassified(totalItemsClassified);
        return this;
    }

    /**
     * <p>
     * The total number of the bucket's objects that Amazon Macie has found sensitive data in.
     * </p>
     * 
     * @param totalItemsSensitive
     *        The total number of the bucket's objects that Amazon Macie has found sensitive data in.
     */

    public void setTotalItemsSensitive(Long totalItemsSensitive) {
        this.totalItemsSensitive = totalItemsSensitive;
    }

    /**
     * <p>
     * The total number of the bucket's objects that Amazon Macie has found sensitive data in.
     * </p>
     * 
     * @return The total number of the bucket's objects that Amazon Macie has found sensitive data in.
     */

    public Long getTotalItemsSensitive() {
        return this.totalItemsSensitive;
    }

    /**
     * <p>
     * The total number of the bucket's objects that Amazon Macie has found sensitive data in.
     * </p>
     * 
     * @param totalItemsSensitive
     *        The total number of the bucket's objects that Amazon Macie has found sensitive data in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceStatistics withTotalItemsSensitive(Long totalItemsSensitive) {
        setTotalItemsSensitive(totalItemsSensitive);
        return this;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket due to an error or issue. For
     * example, the object is a malformed file. This value includes objects that Macie hasn't analyzed for reasons
     * reported by other statistics in the ResourceStatistics object.
     * </p>
     * 
     * @param totalItemsSkipped
     *        The total number of objects that Amazon Macie hasn't analyzed in the bucket due to an error or issue. For
     *        example, the object is a malformed file. This value includes objects that Macie hasn't analyzed for
     *        reasons reported by other statistics in the ResourceStatistics object.
     */

    public void setTotalItemsSkipped(Long totalItemsSkipped) {
        this.totalItemsSkipped = totalItemsSkipped;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket due to an error or issue. For
     * example, the object is a malformed file. This value includes objects that Macie hasn't analyzed for reasons
     * reported by other statistics in the ResourceStatistics object.
     * </p>
     * 
     * @return The total number of objects that Amazon Macie hasn't analyzed in the bucket due to an error or issue. For
     *         example, the object is a malformed file. This value includes objects that Macie hasn't analyzed for
     *         reasons reported by other statistics in the ResourceStatistics object.
     */

    public Long getTotalItemsSkipped() {
        return this.totalItemsSkipped;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket due to an error or issue. For
     * example, the object is a malformed file. This value includes objects that Macie hasn't analyzed for reasons
     * reported by other statistics in the ResourceStatistics object.
     * </p>
     * 
     * @param totalItemsSkipped
     *        The total number of objects that Amazon Macie hasn't analyzed in the bucket due to an error or issue. For
     *        example, the object is a malformed file. This value includes objects that Macie hasn't analyzed for
     *        reasons reported by other statistics in the ResourceStatistics object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceStatistics withTotalItemsSkipped(Long totalItemsSkipped) {
        setTotalItemsSkipped(totalItemsSkipped);
        return this;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are encrypted
     * with a key that Macie isn't allowed to use.
     * </p>
     * 
     * @param totalItemsSkippedInvalidEncryption
     *        The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are
     *        encrypted with a key that Macie isn't allowed to use.
     */

    public void setTotalItemsSkippedInvalidEncryption(Long totalItemsSkippedInvalidEncryption) {
        this.totalItemsSkippedInvalidEncryption = totalItemsSkippedInvalidEncryption;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are encrypted
     * with a key that Macie isn't allowed to use.
     * </p>
     * 
     * @return The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are
     *         encrypted with a key that Macie isn't allowed to use.
     */

    public Long getTotalItemsSkippedInvalidEncryption() {
        return this.totalItemsSkippedInvalidEncryption;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are encrypted
     * with a key that Macie isn't allowed to use.
     * </p>
     * 
     * @param totalItemsSkippedInvalidEncryption
     *        The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are
     *        encrypted with a key that Macie isn't allowed to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceStatistics withTotalItemsSkippedInvalidEncryption(Long totalItemsSkippedInvalidEncryption) {
        setTotalItemsSkippedInvalidEncryption(totalItemsSkippedInvalidEncryption);
        return this;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are encrypted
     * with an KMS key that was disabled or deleted.
     * </p>
     * 
     * @param totalItemsSkippedInvalidKms
     *        The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are
     *        encrypted with an KMS key that was disabled or deleted.
     */

    public void setTotalItemsSkippedInvalidKms(Long totalItemsSkippedInvalidKms) {
        this.totalItemsSkippedInvalidKms = totalItemsSkippedInvalidKms;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are encrypted
     * with an KMS key that was disabled or deleted.
     * </p>
     * 
     * @return The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are
     *         encrypted with an KMS key that was disabled or deleted.
     */

    public Long getTotalItemsSkippedInvalidKms() {
        return this.totalItemsSkippedInvalidKms;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are encrypted
     * with an KMS key that was disabled or deleted.
     * </p>
     * 
     * @param totalItemsSkippedInvalidKms
     *        The total number of objects that Amazon Macie hasn't analyzed in the bucket because the objects are
     *        encrypted with an KMS key that was disabled or deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceStatistics withTotalItemsSkippedInvalidKms(Long totalItemsSkippedInvalidKms) {
        setTotalItemsSkippedInvalidKms(totalItemsSkippedInvalidKms);
        return this;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket because Macie isn't allowed to access
     * the objects.
     * </p>
     * 
     * @param totalItemsSkippedPermissionDenied
     *        The total number of objects that Amazon Macie hasn't analyzed in the bucket because Macie isn't allowed to
     *        access the objects.
     */

    public void setTotalItemsSkippedPermissionDenied(Long totalItemsSkippedPermissionDenied) {
        this.totalItemsSkippedPermissionDenied = totalItemsSkippedPermissionDenied;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket because Macie isn't allowed to access
     * the objects.
     * </p>
     * 
     * @return The total number of objects that Amazon Macie hasn't analyzed in the bucket because Macie isn't allowed
     *         to access the objects.
     */

    public Long getTotalItemsSkippedPermissionDenied() {
        return this.totalItemsSkippedPermissionDenied;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie hasn't analyzed in the bucket because Macie isn't allowed to access
     * the objects.
     * </p>
     * 
     * @param totalItemsSkippedPermissionDenied
     *        The total number of objects that Amazon Macie hasn't analyzed in the bucket because Macie isn't allowed to
     *        access the objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceStatistics withTotalItemsSkippedPermissionDenied(Long totalItemsSkippedPermissionDenied) {
        setTotalItemsSkippedPermissionDenied(totalItemsSkippedPermissionDenied);
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
        if (getTotalBytesClassified() != null)
            sb.append("TotalBytesClassified: ").append(getTotalBytesClassified()).append(",");
        if (getTotalDetections() != null)
            sb.append("TotalDetections: ").append(getTotalDetections()).append(",");
        if (getTotalDetectionsSuppressed() != null)
            sb.append("TotalDetectionsSuppressed: ").append(getTotalDetectionsSuppressed()).append(",");
        if (getTotalItemsClassified() != null)
            sb.append("TotalItemsClassified: ").append(getTotalItemsClassified()).append(",");
        if (getTotalItemsSensitive() != null)
            sb.append("TotalItemsSensitive: ").append(getTotalItemsSensitive()).append(",");
        if (getTotalItemsSkipped() != null)
            sb.append("TotalItemsSkipped: ").append(getTotalItemsSkipped()).append(",");
        if (getTotalItemsSkippedInvalidEncryption() != null)
            sb.append("TotalItemsSkippedInvalidEncryption: ").append(getTotalItemsSkippedInvalidEncryption()).append(",");
        if (getTotalItemsSkippedInvalidKms() != null)
            sb.append("TotalItemsSkippedInvalidKms: ").append(getTotalItemsSkippedInvalidKms()).append(",");
        if (getTotalItemsSkippedPermissionDenied() != null)
            sb.append("TotalItemsSkippedPermissionDenied: ").append(getTotalItemsSkippedPermissionDenied());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceStatistics == false)
            return false;
        ResourceStatistics other = (ResourceStatistics) obj;
        if (other.getTotalBytesClassified() == null ^ this.getTotalBytesClassified() == null)
            return false;
        if (other.getTotalBytesClassified() != null && other.getTotalBytesClassified().equals(this.getTotalBytesClassified()) == false)
            return false;
        if (other.getTotalDetections() == null ^ this.getTotalDetections() == null)
            return false;
        if (other.getTotalDetections() != null && other.getTotalDetections().equals(this.getTotalDetections()) == false)
            return false;
        if (other.getTotalDetectionsSuppressed() == null ^ this.getTotalDetectionsSuppressed() == null)
            return false;
        if (other.getTotalDetectionsSuppressed() != null && other.getTotalDetectionsSuppressed().equals(this.getTotalDetectionsSuppressed()) == false)
            return false;
        if (other.getTotalItemsClassified() == null ^ this.getTotalItemsClassified() == null)
            return false;
        if (other.getTotalItemsClassified() != null && other.getTotalItemsClassified().equals(this.getTotalItemsClassified()) == false)
            return false;
        if (other.getTotalItemsSensitive() == null ^ this.getTotalItemsSensitive() == null)
            return false;
        if (other.getTotalItemsSensitive() != null && other.getTotalItemsSensitive().equals(this.getTotalItemsSensitive()) == false)
            return false;
        if (other.getTotalItemsSkipped() == null ^ this.getTotalItemsSkipped() == null)
            return false;
        if (other.getTotalItemsSkipped() != null && other.getTotalItemsSkipped().equals(this.getTotalItemsSkipped()) == false)
            return false;
        if (other.getTotalItemsSkippedInvalidEncryption() == null ^ this.getTotalItemsSkippedInvalidEncryption() == null)
            return false;
        if (other.getTotalItemsSkippedInvalidEncryption() != null
                && other.getTotalItemsSkippedInvalidEncryption().equals(this.getTotalItemsSkippedInvalidEncryption()) == false)
            return false;
        if (other.getTotalItemsSkippedInvalidKms() == null ^ this.getTotalItemsSkippedInvalidKms() == null)
            return false;
        if (other.getTotalItemsSkippedInvalidKms() != null && other.getTotalItemsSkippedInvalidKms().equals(this.getTotalItemsSkippedInvalidKms()) == false)
            return false;
        if (other.getTotalItemsSkippedPermissionDenied() == null ^ this.getTotalItemsSkippedPermissionDenied() == null)
            return false;
        if (other.getTotalItemsSkippedPermissionDenied() != null
                && other.getTotalItemsSkippedPermissionDenied().equals(this.getTotalItemsSkippedPermissionDenied()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalBytesClassified() == null) ? 0 : getTotalBytesClassified().hashCode());
        hashCode = prime * hashCode + ((getTotalDetections() == null) ? 0 : getTotalDetections().hashCode());
        hashCode = prime * hashCode + ((getTotalDetectionsSuppressed() == null) ? 0 : getTotalDetectionsSuppressed().hashCode());
        hashCode = prime * hashCode + ((getTotalItemsClassified() == null) ? 0 : getTotalItemsClassified().hashCode());
        hashCode = prime * hashCode + ((getTotalItemsSensitive() == null) ? 0 : getTotalItemsSensitive().hashCode());
        hashCode = prime * hashCode + ((getTotalItemsSkipped() == null) ? 0 : getTotalItemsSkipped().hashCode());
        hashCode = prime * hashCode + ((getTotalItemsSkippedInvalidEncryption() == null) ? 0 : getTotalItemsSkippedInvalidEncryption().hashCode());
        hashCode = prime * hashCode + ((getTotalItemsSkippedInvalidKms() == null) ? 0 : getTotalItemsSkippedInvalidKms().hashCode());
        hashCode = prime * hashCode + ((getTotalItemsSkippedPermissionDenied() == null) ? 0 : getTotalItemsSkippedPermissionDenied().hashCode());
        return hashCode;
    }

    @Override
    public ResourceStatistics clone() {
        try {
            return (ResourceStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ResourceStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

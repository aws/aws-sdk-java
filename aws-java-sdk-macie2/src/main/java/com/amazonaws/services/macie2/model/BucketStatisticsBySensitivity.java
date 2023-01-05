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
 * Provides aggregated statistical data for sensitive data discovery metrics that apply to S3 buckets, grouped by bucket
 * sensitivity score (sensitivityScore). If automated sensitive data discovery is currently disabled for your account,
 * the value for each metric is 0.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BucketStatisticsBySensitivity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketStatisticsBySensitivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of -1.
     * </p>
     */
    private SensitivityAggregations classificationError;
    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of 50.
     * </p>
     */
    private SensitivityAggregations notClassified;
    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of 0-49.
     * </p>
     */
    private SensitivityAggregations notSensitive;
    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of 51-100.
     * </p>
     */
    private SensitivityAggregations sensitive;

    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of -1.
     * </p>
     * 
     * @param classificationError
     *        The aggregated statistical data for all buckets that have a sensitivity score of -1.
     */

    public void setClassificationError(SensitivityAggregations classificationError) {
        this.classificationError = classificationError;
    }

    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of -1.
     * </p>
     * 
     * @return The aggregated statistical data for all buckets that have a sensitivity score of -1.
     */

    public SensitivityAggregations getClassificationError() {
        return this.classificationError;
    }

    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of -1.
     * </p>
     * 
     * @param classificationError
     *        The aggregated statistical data for all buckets that have a sensitivity score of -1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketStatisticsBySensitivity withClassificationError(SensitivityAggregations classificationError) {
        setClassificationError(classificationError);
        return this;
    }

    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of 50.
     * </p>
     * 
     * @param notClassified
     *        The aggregated statistical data for all buckets that have a sensitivity score of 50.
     */

    public void setNotClassified(SensitivityAggregations notClassified) {
        this.notClassified = notClassified;
    }

    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of 50.
     * </p>
     * 
     * @return The aggregated statistical data for all buckets that have a sensitivity score of 50.
     */

    public SensitivityAggregations getNotClassified() {
        return this.notClassified;
    }

    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of 50.
     * </p>
     * 
     * @param notClassified
     *        The aggregated statistical data for all buckets that have a sensitivity score of 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketStatisticsBySensitivity withNotClassified(SensitivityAggregations notClassified) {
        setNotClassified(notClassified);
        return this;
    }

    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of 0-49.
     * </p>
     * 
     * @param notSensitive
     *        The aggregated statistical data for all buckets that have a sensitivity score of 0-49.
     */

    public void setNotSensitive(SensitivityAggregations notSensitive) {
        this.notSensitive = notSensitive;
    }

    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of 0-49.
     * </p>
     * 
     * @return The aggregated statistical data for all buckets that have a sensitivity score of 0-49.
     */

    public SensitivityAggregations getNotSensitive() {
        return this.notSensitive;
    }

    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of 0-49.
     * </p>
     * 
     * @param notSensitive
     *        The aggregated statistical data for all buckets that have a sensitivity score of 0-49.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketStatisticsBySensitivity withNotSensitive(SensitivityAggregations notSensitive) {
        setNotSensitive(notSensitive);
        return this;
    }

    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of 51-100.
     * </p>
     * 
     * @param sensitive
     *        The aggregated statistical data for all buckets that have a sensitivity score of 51-100.
     */

    public void setSensitive(SensitivityAggregations sensitive) {
        this.sensitive = sensitive;
    }

    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of 51-100.
     * </p>
     * 
     * @return The aggregated statistical data for all buckets that have a sensitivity score of 51-100.
     */

    public SensitivityAggregations getSensitive() {
        return this.sensitive;
    }

    /**
     * <p>
     * The aggregated statistical data for all buckets that have a sensitivity score of 51-100.
     * </p>
     * 
     * @param sensitive
     *        The aggregated statistical data for all buckets that have a sensitivity score of 51-100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketStatisticsBySensitivity withSensitive(SensitivityAggregations sensitive) {
        setSensitive(sensitive);
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
        if (getClassificationError() != null)
            sb.append("ClassificationError: ").append(getClassificationError()).append(",");
        if (getNotClassified() != null)
            sb.append("NotClassified: ").append(getNotClassified()).append(",");
        if (getNotSensitive() != null)
            sb.append("NotSensitive: ").append(getNotSensitive()).append(",");
        if (getSensitive() != null)
            sb.append("Sensitive: ").append(getSensitive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketStatisticsBySensitivity == false)
            return false;
        BucketStatisticsBySensitivity other = (BucketStatisticsBySensitivity) obj;
        if (other.getClassificationError() == null ^ this.getClassificationError() == null)
            return false;
        if (other.getClassificationError() != null && other.getClassificationError().equals(this.getClassificationError()) == false)
            return false;
        if (other.getNotClassified() == null ^ this.getNotClassified() == null)
            return false;
        if (other.getNotClassified() != null && other.getNotClassified().equals(this.getNotClassified()) == false)
            return false;
        if (other.getNotSensitive() == null ^ this.getNotSensitive() == null)
            return false;
        if (other.getNotSensitive() != null && other.getNotSensitive().equals(this.getNotSensitive()) == false)
            return false;
        if (other.getSensitive() == null ^ this.getSensitive() == null)
            return false;
        if (other.getSensitive() != null && other.getSensitive().equals(this.getSensitive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClassificationError() == null) ? 0 : getClassificationError().hashCode());
        hashCode = prime * hashCode + ((getNotClassified() == null) ? 0 : getNotClassified().hashCode());
        hashCode = prime * hashCode + ((getNotSensitive() == null) ? 0 : getNotSensitive().hashCode());
        hashCode = prime * hashCode + ((getSensitive() == null) ? 0 : getSensitive().hashCode());
        return hashCode;
    }

    @Override
    public BucketStatisticsBySensitivity clone() {
        try {
            return (BucketStatisticsBySensitivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.BucketStatisticsBySensitivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the weights for the fair share identifiers for the fair share policy. Fair share identifiers that aren't
 * included have a default weight of <code>1.0</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ShareAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShareAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A fair share identifier or fair share identifier prefix. If the string ends with an asterisk (*), this entry
     * specifies the weight factor to use for fair share identifiers that start with that prefix. The list of fair share
     * identifiers in a fair share policy can't overlap. For example, you can't have one that specifies a
     * <code>shareIdentifier</code> of <code>UserA*</code> and another that specifies a <code>shareIdentifier</code> of
     * <code>UserA-1</code>.
     * </p>
     * <p>
     * There can be no more than 500 fair share identifiers active in a job queue.
     * </p>
     * <p>
     * The string is limited to 255 alphanumeric characters, and can be followed by an asterisk (*).
     * </p>
     */
    private String shareIdentifier;
    /**
     * <p>
     * The weight factor for the fair share identifier. The default value is 1.0. A lower value has a higher priority
     * for compute resources. For example, jobs that use a share identifier with a weight factor of 0.125 (1/8) get 8
     * times the compute resources of jobs that use a share identifier with a weight factor of 1.
     * </p>
     * <p>
     * The smallest supported value is 0.0001, and the largest supported value is 999.9999.
     * </p>
     */
    private Float weightFactor;

    /**
     * <p>
     * A fair share identifier or fair share identifier prefix. If the string ends with an asterisk (*), this entry
     * specifies the weight factor to use for fair share identifiers that start with that prefix. The list of fair share
     * identifiers in a fair share policy can't overlap. For example, you can't have one that specifies a
     * <code>shareIdentifier</code> of <code>UserA*</code> and another that specifies a <code>shareIdentifier</code> of
     * <code>UserA-1</code>.
     * </p>
     * <p>
     * There can be no more than 500 fair share identifiers active in a job queue.
     * </p>
     * <p>
     * The string is limited to 255 alphanumeric characters, and can be followed by an asterisk (*).
     * </p>
     * 
     * @param shareIdentifier
     *        A fair share identifier or fair share identifier prefix. If the string ends with an asterisk (*), this
     *        entry specifies the weight factor to use for fair share identifiers that start with that prefix. The list
     *        of fair share identifiers in a fair share policy can't overlap. For example, you can't have one that
     *        specifies a <code>shareIdentifier</code> of <code>UserA*</code> and another that specifies a
     *        <code>shareIdentifier</code> of <code>UserA-1</code>.</p>
     *        <p>
     *        There can be no more than 500 fair share identifiers active in a job queue.
     *        </p>
     *        <p>
     *        The string is limited to 255 alphanumeric characters, and can be followed by an asterisk (*).
     */

    public void setShareIdentifier(String shareIdentifier) {
        this.shareIdentifier = shareIdentifier;
    }

    /**
     * <p>
     * A fair share identifier or fair share identifier prefix. If the string ends with an asterisk (*), this entry
     * specifies the weight factor to use for fair share identifiers that start with that prefix. The list of fair share
     * identifiers in a fair share policy can't overlap. For example, you can't have one that specifies a
     * <code>shareIdentifier</code> of <code>UserA*</code> and another that specifies a <code>shareIdentifier</code> of
     * <code>UserA-1</code>.
     * </p>
     * <p>
     * There can be no more than 500 fair share identifiers active in a job queue.
     * </p>
     * <p>
     * The string is limited to 255 alphanumeric characters, and can be followed by an asterisk (*).
     * </p>
     * 
     * @return A fair share identifier or fair share identifier prefix. If the string ends with an asterisk (*), this
     *         entry specifies the weight factor to use for fair share identifiers that start with that prefix. The list
     *         of fair share identifiers in a fair share policy can't overlap. For example, you can't have one that
     *         specifies a <code>shareIdentifier</code> of <code>UserA*</code> and another that specifies a
     *         <code>shareIdentifier</code> of <code>UserA-1</code>.</p>
     *         <p>
     *         There can be no more than 500 fair share identifiers active in a job queue.
     *         </p>
     *         <p>
     *         The string is limited to 255 alphanumeric characters, and can be followed by an asterisk (*).
     */

    public String getShareIdentifier() {
        return this.shareIdentifier;
    }

    /**
     * <p>
     * A fair share identifier or fair share identifier prefix. If the string ends with an asterisk (*), this entry
     * specifies the weight factor to use for fair share identifiers that start with that prefix. The list of fair share
     * identifiers in a fair share policy can't overlap. For example, you can't have one that specifies a
     * <code>shareIdentifier</code> of <code>UserA*</code> and another that specifies a <code>shareIdentifier</code> of
     * <code>UserA-1</code>.
     * </p>
     * <p>
     * There can be no more than 500 fair share identifiers active in a job queue.
     * </p>
     * <p>
     * The string is limited to 255 alphanumeric characters, and can be followed by an asterisk (*).
     * </p>
     * 
     * @param shareIdentifier
     *        A fair share identifier or fair share identifier prefix. If the string ends with an asterisk (*), this
     *        entry specifies the weight factor to use for fair share identifiers that start with that prefix. The list
     *        of fair share identifiers in a fair share policy can't overlap. For example, you can't have one that
     *        specifies a <code>shareIdentifier</code> of <code>UserA*</code> and another that specifies a
     *        <code>shareIdentifier</code> of <code>UserA-1</code>.</p>
     *        <p>
     *        There can be no more than 500 fair share identifiers active in a job queue.
     *        </p>
     *        <p>
     *        The string is limited to 255 alphanumeric characters, and can be followed by an asterisk (*).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareAttributes withShareIdentifier(String shareIdentifier) {
        setShareIdentifier(shareIdentifier);
        return this;
    }

    /**
     * <p>
     * The weight factor for the fair share identifier. The default value is 1.0. A lower value has a higher priority
     * for compute resources. For example, jobs that use a share identifier with a weight factor of 0.125 (1/8) get 8
     * times the compute resources of jobs that use a share identifier with a weight factor of 1.
     * </p>
     * <p>
     * The smallest supported value is 0.0001, and the largest supported value is 999.9999.
     * </p>
     * 
     * @param weightFactor
     *        The weight factor for the fair share identifier. The default value is 1.0. A lower value has a higher
     *        priority for compute resources. For example, jobs that use a share identifier with a weight factor of
     *        0.125 (1/8) get 8 times the compute resources of jobs that use a share identifier with a weight factor of
     *        1.</p>
     *        <p>
     *        The smallest supported value is 0.0001, and the largest supported value is 999.9999.
     */

    public void setWeightFactor(Float weightFactor) {
        this.weightFactor = weightFactor;
    }

    /**
     * <p>
     * The weight factor for the fair share identifier. The default value is 1.0. A lower value has a higher priority
     * for compute resources. For example, jobs that use a share identifier with a weight factor of 0.125 (1/8) get 8
     * times the compute resources of jobs that use a share identifier with a weight factor of 1.
     * </p>
     * <p>
     * The smallest supported value is 0.0001, and the largest supported value is 999.9999.
     * </p>
     * 
     * @return The weight factor for the fair share identifier. The default value is 1.0. A lower value has a higher
     *         priority for compute resources. For example, jobs that use a share identifier with a weight factor of
     *         0.125 (1/8) get 8 times the compute resources of jobs that use a share identifier with a weight factor of
     *         1.</p>
     *         <p>
     *         The smallest supported value is 0.0001, and the largest supported value is 999.9999.
     */

    public Float getWeightFactor() {
        return this.weightFactor;
    }

    /**
     * <p>
     * The weight factor for the fair share identifier. The default value is 1.0. A lower value has a higher priority
     * for compute resources. For example, jobs that use a share identifier with a weight factor of 0.125 (1/8) get 8
     * times the compute resources of jobs that use a share identifier with a weight factor of 1.
     * </p>
     * <p>
     * The smallest supported value is 0.0001, and the largest supported value is 999.9999.
     * </p>
     * 
     * @param weightFactor
     *        The weight factor for the fair share identifier. The default value is 1.0. A lower value has a higher
     *        priority for compute resources. For example, jobs that use a share identifier with a weight factor of
     *        0.125 (1/8) get 8 times the compute resources of jobs that use a share identifier with a weight factor of
     *        1.</p>
     *        <p>
     *        The smallest supported value is 0.0001, and the largest supported value is 999.9999.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareAttributes withWeightFactor(Float weightFactor) {
        setWeightFactor(weightFactor);
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
        if (getShareIdentifier() != null)
            sb.append("ShareIdentifier: ").append(getShareIdentifier()).append(",");
        if (getWeightFactor() != null)
            sb.append("WeightFactor: ").append(getWeightFactor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShareAttributes == false)
            return false;
        ShareAttributes other = (ShareAttributes) obj;
        if (other.getShareIdentifier() == null ^ this.getShareIdentifier() == null)
            return false;
        if (other.getShareIdentifier() != null && other.getShareIdentifier().equals(this.getShareIdentifier()) == false)
            return false;
        if (other.getWeightFactor() == null ^ this.getWeightFactor() == null)
            return false;
        if (other.getWeightFactor() != null && other.getWeightFactor().equals(this.getWeightFactor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShareIdentifier() == null) ? 0 : getShareIdentifier().hashCode());
        hashCode = prime * hashCode + ((getWeightFactor() == null) ? 0 : getWeightFactor().hashCode());
        return hashCode;
    }

    @Override
    public ShareAttributes clone() {
        try {
            return (ShareAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.ShareAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

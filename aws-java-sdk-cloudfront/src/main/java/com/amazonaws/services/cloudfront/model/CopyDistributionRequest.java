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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CopyDistribution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyDistributionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the primary distribution whose configuration you are copying. To get a distribution ID, use
     * <code>ListDistributions</code>.
     * </p>
     */
    private String primaryDistributionId;
    /**
     * <p>
     * The type of distribution that your primary distribution will be copied to. The only valid value is
     * <code>True</code>, indicating that you are copying to a staging distribution.
     * </p>
     */
    private Boolean staging;
    /**
     * <p>
     * The version identifier of the primary distribution whose configuration you are copying. This is the
     * <code>ETag</code> value returned in the response to <code>GetDistribution</code> and
     * <code>GetDistributionConfig</code>.
     * </p>
     */
    private String ifMatch;
    /**
     * <p>
     * A value that uniquely identifies a request to create a resource. This helps to prevent CloudFront from creating a
     * duplicate resource if you accidentally resubmit an identical request.
     * </p>
     */
    private String callerReference;

    /**
     * <p>
     * The identifier of the primary distribution whose configuration you are copying. To get a distribution ID, use
     * <code>ListDistributions</code>.
     * </p>
     * 
     * @param primaryDistributionId
     *        The identifier of the primary distribution whose configuration you are copying. To get a distribution ID,
     *        use <code>ListDistributions</code>.
     */

    public void setPrimaryDistributionId(String primaryDistributionId) {
        this.primaryDistributionId = primaryDistributionId;
    }

    /**
     * <p>
     * The identifier of the primary distribution whose configuration you are copying. To get a distribution ID, use
     * <code>ListDistributions</code>.
     * </p>
     * 
     * @return The identifier of the primary distribution whose configuration you are copying. To get a distribution ID,
     *         use <code>ListDistributions</code>.
     */

    public String getPrimaryDistributionId() {
        return this.primaryDistributionId;
    }

    /**
     * <p>
     * The identifier of the primary distribution whose configuration you are copying. To get a distribution ID, use
     * <code>ListDistributions</code>.
     * </p>
     * 
     * @param primaryDistributionId
     *        The identifier of the primary distribution whose configuration you are copying. To get a distribution ID,
     *        use <code>ListDistributions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDistributionRequest withPrimaryDistributionId(String primaryDistributionId) {
        setPrimaryDistributionId(primaryDistributionId);
        return this;
    }

    /**
     * <p>
     * The type of distribution that your primary distribution will be copied to. The only valid value is
     * <code>True</code>, indicating that you are copying to a staging distribution.
     * </p>
     * 
     * @param staging
     *        The type of distribution that your primary distribution will be copied to. The only valid value is
     *        <code>True</code>, indicating that you are copying to a staging distribution.
     */

    public void setStaging(Boolean staging) {
        this.staging = staging;
    }

    /**
     * <p>
     * The type of distribution that your primary distribution will be copied to. The only valid value is
     * <code>True</code>, indicating that you are copying to a staging distribution.
     * </p>
     * 
     * @return The type of distribution that your primary distribution will be copied to. The only valid value is
     *         <code>True</code>, indicating that you are copying to a staging distribution.
     */

    public Boolean getStaging() {
        return this.staging;
    }

    /**
     * <p>
     * The type of distribution that your primary distribution will be copied to. The only valid value is
     * <code>True</code>, indicating that you are copying to a staging distribution.
     * </p>
     * 
     * @param staging
     *        The type of distribution that your primary distribution will be copied to. The only valid value is
     *        <code>True</code>, indicating that you are copying to a staging distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDistributionRequest withStaging(Boolean staging) {
        setStaging(staging);
        return this;
    }

    /**
     * <p>
     * The type of distribution that your primary distribution will be copied to. The only valid value is
     * <code>True</code>, indicating that you are copying to a staging distribution.
     * </p>
     * 
     * @return The type of distribution that your primary distribution will be copied to. The only valid value is
     *         <code>True</code>, indicating that you are copying to a staging distribution.
     */

    public Boolean isStaging() {
        return this.staging;
    }

    /**
     * <p>
     * The version identifier of the primary distribution whose configuration you are copying. This is the
     * <code>ETag</code> value returned in the response to <code>GetDistribution</code> and
     * <code>GetDistributionConfig</code>.
     * </p>
     * 
     * @param ifMatch
     *        The version identifier of the primary distribution whose configuration you are copying. This is the
     *        <code>ETag</code> value returned in the response to <code>GetDistribution</code> and
     *        <code>GetDistributionConfig</code>.
     */

    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The version identifier of the primary distribution whose configuration you are copying. This is the
     * <code>ETag</code> value returned in the response to <code>GetDistribution</code> and
     * <code>GetDistributionConfig</code>.
     * </p>
     * 
     * @return The version identifier of the primary distribution whose configuration you are copying. This is the
     *         <code>ETag</code> value returned in the response to <code>GetDistribution</code> and
     *         <code>GetDistributionConfig</code>.
     */

    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * <p>
     * The version identifier of the primary distribution whose configuration you are copying. This is the
     * <code>ETag</code> value returned in the response to <code>GetDistribution</code> and
     * <code>GetDistributionConfig</code>.
     * </p>
     * 
     * @param ifMatch
     *        The version identifier of the primary distribution whose configuration you are copying. This is the
     *        <code>ETag</code> value returned in the response to <code>GetDistribution</code> and
     *        <code>GetDistributionConfig</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDistributionRequest withIfMatch(String ifMatch) {
        setIfMatch(ifMatch);
        return this;
    }

    /**
     * <p>
     * A value that uniquely identifies a request to create a resource. This helps to prevent CloudFront from creating a
     * duplicate resource if you accidentally resubmit an identical request.
     * </p>
     * 
     * @param callerReference
     *        A value that uniquely identifies a request to create a resource. This helps to prevent CloudFront from
     *        creating a duplicate resource if you accidentally resubmit an identical request.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A value that uniquely identifies a request to create a resource. This helps to prevent CloudFront from creating a
     * duplicate resource if you accidentally resubmit an identical request.
     * </p>
     * 
     * @return A value that uniquely identifies a request to create a resource. This helps to prevent CloudFront from
     *         creating a duplicate resource if you accidentally resubmit an identical request.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A value that uniquely identifies a request to create a resource. This helps to prevent CloudFront from creating a
     * duplicate resource if you accidentally resubmit an identical request.
     * </p>
     * 
     * @param callerReference
     *        A value that uniquely identifies a request to create a resource. This helps to prevent CloudFront from
     *        creating a duplicate resource if you accidentally resubmit an identical request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDistributionRequest withCallerReference(String callerReference) {
        setCallerReference(callerReference);
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
        if (getPrimaryDistributionId() != null)
            sb.append("PrimaryDistributionId: ").append(getPrimaryDistributionId()).append(",");
        if (getStaging() != null)
            sb.append("Staging: ").append(getStaging()).append(",");
        if (getIfMatch() != null)
            sb.append("IfMatch: ").append(getIfMatch()).append(",");
        if (getCallerReference() != null)
            sb.append("CallerReference: ").append(getCallerReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyDistributionRequest == false)
            return false;
        CopyDistributionRequest other = (CopyDistributionRequest) obj;
        if (other.getPrimaryDistributionId() == null ^ this.getPrimaryDistributionId() == null)
            return false;
        if (other.getPrimaryDistributionId() != null && other.getPrimaryDistributionId().equals(this.getPrimaryDistributionId()) == false)
            return false;
        if (other.getStaging() == null ^ this.getStaging() == null)
            return false;
        if (other.getStaging() != null && other.getStaging().equals(this.getStaging()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimaryDistributionId() == null) ? 0 : getPrimaryDistributionId().hashCode());
        hashCode = prime * hashCode + ((getStaging() == null) ? 0 : getStaging().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        return hashCode;
    }

    @Override
    public CopyDistributionRequest clone() {
        return (CopyDistributionRequest) super.clone();
    }

}

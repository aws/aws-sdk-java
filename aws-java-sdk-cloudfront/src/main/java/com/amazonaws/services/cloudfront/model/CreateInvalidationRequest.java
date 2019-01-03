/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * The request to create an invalidation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreateInvalidation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInvalidationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The distribution's id.
     * </p>
     */
    private String distributionId;
    /**
     * <p>
     * The batch information for the invalidation.
     * </p>
     */
    private InvalidationBatch invalidationBatch;

    /**
     * Default constructor for CreateInvalidationRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreateInvalidationRequest() {
    }

    /**
     * Constructs a new CreateInvalidationRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param distributionId
     *        The distribution's id.
     * @param invalidationBatch
     *        The batch information for the invalidation.
     */
    public CreateInvalidationRequest(String distributionId, InvalidationBatch invalidationBatch) {
        setDistributionId(distributionId);
        setInvalidationBatch(invalidationBatch);
    }

    /**
     * <p>
     * The distribution's id.
     * </p>
     * 
     * @param distributionId
     *        The distribution's id.
     */

    public void setDistributionId(String distributionId) {
        this.distributionId = distributionId;
    }

    /**
     * <p>
     * The distribution's id.
     * </p>
     * 
     * @return The distribution's id.
     */

    public String getDistributionId() {
        return this.distributionId;
    }

    /**
     * <p>
     * The distribution's id.
     * </p>
     * 
     * @param distributionId
     *        The distribution's id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInvalidationRequest withDistributionId(String distributionId) {
        setDistributionId(distributionId);
        return this;
    }

    /**
     * <p>
     * The batch information for the invalidation.
     * </p>
     * 
     * @param invalidationBatch
     *        The batch information for the invalidation.
     */

    public void setInvalidationBatch(InvalidationBatch invalidationBatch) {
        this.invalidationBatch = invalidationBatch;
    }

    /**
     * <p>
     * The batch information for the invalidation.
     * </p>
     * 
     * @return The batch information for the invalidation.
     */

    public InvalidationBatch getInvalidationBatch() {
        return this.invalidationBatch;
    }

    /**
     * <p>
     * The batch information for the invalidation.
     * </p>
     * 
     * @param invalidationBatch
     *        The batch information for the invalidation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInvalidationRequest withInvalidationBatch(InvalidationBatch invalidationBatch) {
        setInvalidationBatch(invalidationBatch);
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
        if (getDistributionId() != null)
            sb.append("DistributionId: ").append(getDistributionId()).append(",");
        if (getInvalidationBatch() != null)
            sb.append("InvalidationBatch: ").append(getInvalidationBatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInvalidationRequest == false)
            return false;
        CreateInvalidationRequest other = (CreateInvalidationRequest) obj;
        if (other.getDistributionId() == null ^ this.getDistributionId() == null)
            return false;
        if (other.getDistributionId() != null && other.getDistributionId().equals(this.getDistributionId()) == false)
            return false;
        if (other.getInvalidationBatch() == null ^ this.getInvalidationBatch() == null)
            return false;
        if (other.getInvalidationBatch() != null && other.getInvalidationBatch().equals(this.getInvalidationBatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistributionId() == null) ? 0 : getDistributionId().hashCode());
        hashCode = prime * hashCode + ((getInvalidationBatch() == null) ? 0 : getInvalidationBatch().hashCode());
        return hashCode;
    }

    @Override
    public CreateInvalidationRequest clone() {
        return (CreateInvalidationRequest) super.clone();
    }

}

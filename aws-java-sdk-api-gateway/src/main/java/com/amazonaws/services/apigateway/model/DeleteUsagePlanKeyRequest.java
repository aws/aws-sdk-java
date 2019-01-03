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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The DELETE request to delete a usage plan key and remove the underlying API key from the associated usage plan.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteUsagePlanKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The Id of the <a>UsagePlan</a> resource representing the usage plan containing the to-be-deleted
     * <a>UsagePlanKey</a> resource representing a plan customer.
     * </p>
     */
    private String usagePlanId;
    /**
     * <p>
     * [Required] The Id of the <a>UsagePlanKey</a> resource to be deleted.
     * </p>
     */
    private String keyId;

    /**
     * <p>
     * [Required] The Id of the <a>UsagePlan</a> resource representing the usage plan containing the to-be-deleted
     * <a>UsagePlanKey</a> resource representing a plan customer.
     * </p>
     * 
     * @param usagePlanId
     *        [Required] The Id of the <a>UsagePlan</a> resource representing the usage plan containing the
     *        to-be-deleted <a>UsagePlanKey</a> resource representing a plan customer.
     */

    public void setUsagePlanId(String usagePlanId) {
        this.usagePlanId = usagePlanId;
    }

    /**
     * <p>
     * [Required] The Id of the <a>UsagePlan</a> resource representing the usage plan containing the to-be-deleted
     * <a>UsagePlanKey</a> resource representing a plan customer.
     * </p>
     * 
     * @return [Required] The Id of the <a>UsagePlan</a> resource representing the usage plan containing the
     *         to-be-deleted <a>UsagePlanKey</a> resource representing a plan customer.
     */

    public String getUsagePlanId() {
        return this.usagePlanId;
    }

    /**
     * <p>
     * [Required] The Id of the <a>UsagePlan</a> resource representing the usage plan containing the to-be-deleted
     * <a>UsagePlanKey</a> resource representing a plan customer.
     * </p>
     * 
     * @param usagePlanId
     *        [Required] The Id of the <a>UsagePlan</a> resource representing the usage plan containing the
     *        to-be-deleted <a>UsagePlanKey</a> resource representing a plan customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUsagePlanKeyRequest withUsagePlanId(String usagePlanId) {
        setUsagePlanId(usagePlanId);
        return this;
    }

    /**
     * <p>
     * [Required] The Id of the <a>UsagePlanKey</a> resource to be deleted.
     * </p>
     * 
     * @param keyId
     *        [Required] The Id of the <a>UsagePlanKey</a> resource to be deleted.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * [Required] The Id of the <a>UsagePlanKey</a> resource to be deleted.
     * </p>
     * 
     * @return [Required] The Id of the <a>UsagePlanKey</a> resource to be deleted.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * [Required] The Id of the <a>UsagePlanKey</a> resource to be deleted.
     * </p>
     * 
     * @param keyId
     *        [Required] The Id of the <a>UsagePlanKey</a> resource to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUsagePlanKeyRequest withKeyId(String keyId) {
        setKeyId(keyId);
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
        if (getUsagePlanId() != null)
            sb.append("UsagePlanId: ").append(getUsagePlanId()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteUsagePlanKeyRequest == false)
            return false;
        DeleteUsagePlanKeyRequest other = (DeleteUsagePlanKeyRequest) obj;
        if (other.getUsagePlanId() == null ^ this.getUsagePlanId() == null)
            return false;
        if (other.getUsagePlanId() != null && other.getUsagePlanId().equals(this.getUsagePlanId()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsagePlanId() == null) ? 0 : getUsagePlanId().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteUsagePlanKeyRequest clone() {
        return (DeleteUsagePlanKeyRequest) super.clone();
    }

}

/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The POST request to create a usage plan key for adding an existing API key to a usage plan.
 * </p>
 */
public class CreateUsagePlanKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Id of the <a>UsagePlan</a> resource representing the usage plan containing the to-be-created
     * <a>UsagePlanKey</a> resource representing a plan customer.
     * </p>
     */
    private String usagePlanId;
    /**
     * <p>
     * The identifier of a <a>UsagePlanKey</a> resource for a plan customer.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The type of a <a>UsagePlanKey</a> resource for a plan customer.
     * </p>
     */
    private String keyType;

    /**
     * <p>
     * The Id of the <a>UsagePlan</a> resource representing the usage plan containing the to-be-created
     * <a>UsagePlanKey</a> resource representing a plan customer.
     * </p>
     * 
     * @param usagePlanId
     *        The Id of the <a>UsagePlan</a> resource representing the usage plan containing the to-be-created
     *        <a>UsagePlanKey</a> resource representing a plan customer.
     */

    public void setUsagePlanId(String usagePlanId) {
        this.usagePlanId = usagePlanId;
    }

    /**
     * <p>
     * The Id of the <a>UsagePlan</a> resource representing the usage plan containing the to-be-created
     * <a>UsagePlanKey</a> resource representing a plan customer.
     * </p>
     * 
     * @return The Id of the <a>UsagePlan</a> resource representing the usage plan containing the to-be-created
     *         <a>UsagePlanKey</a> resource representing a plan customer.
     */

    public String getUsagePlanId() {
        return this.usagePlanId;
    }

    /**
     * <p>
     * The Id of the <a>UsagePlan</a> resource representing the usage plan containing the to-be-created
     * <a>UsagePlanKey</a> resource representing a plan customer.
     * </p>
     * 
     * @param usagePlanId
     *        The Id of the <a>UsagePlan</a> resource representing the usage plan containing the to-be-created
     *        <a>UsagePlanKey</a> resource representing a plan customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanKeyRequest withUsagePlanId(String usagePlanId) {
        setUsagePlanId(usagePlanId);
        return this;
    }

    /**
     * <p>
     * The identifier of a <a>UsagePlanKey</a> resource for a plan customer.
     * </p>
     * 
     * @param keyId
     *        The identifier of a <a>UsagePlanKey</a> resource for a plan customer.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The identifier of a <a>UsagePlanKey</a> resource for a plan customer.
     * </p>
     * 
     * @return The identifier of a <a>UsagePlanKey</a> resource for a plan customer.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The identifier of a <a>UsagePlanKey</a> resource for a plan customer.
     * </p>
     * 
     * @param keyId
     *        The identifier of a <a>UsagePlanKey</a> resource for a plan customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanKeyRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The type of a <a>UsagePlanKey</a> resource for a plan customer.
     * </p>
     * 
     * @param keyType
     *        The type of a <a>UsagePlanKey</a> resource for a plan customer.
     */

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    /**
     * <p>
     * The type of a <a>UsagePlanKey</a> resource for a plan customer.
     * </p>
     * 
     * @return The type of a <a>UsagePlanKey</a> resource for a plan customer.
     */

    public String getKeyType() {
        return this.keyType;
    }

    /**
     * <p>
     * The type of a <a>UsagePlanKey</a> resource for a plan customer.
     * </p>
     * 
     * @param keyType
     *        The type of a <a>UsagePlanKey</a> resource for a plan customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsagePlanKeyRequest withKeyType(String keyType) {
        setKeyType(keyType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("UsagePlanId: " + getUsagePlanId() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getKeyType() != null)
            sb.append("KeyType: " + getKeyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUsagePlanKeyRequest == false)
            return false;
        CreateUsagePlanKeyRequest other = (CreateUsagePlanKeyRequest) obj;
        if (other.getUsagePlanId() == null ^ this.getUsagePlanId() == null)
            return false;
        if (other.getUsagePlanId() != null && other.getUsagePlanId().equals(this.getUsagePlanId()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getKeyType() == null ^ this.getKeyType() == null)
            return false;
        if (other.getKeyType() != null && other.getKeyType().equals(this.getKeyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsagePlanId() == null) ? 0 : getUsagePlanId().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getKeyType() == null) ? 0 : getKeyType().hashCode());
        return hashCode;
    }

    @Override
    public CreateUsagePlanKeyRequest clone() {
        return (CreateUsagePlanKeyRequest) super.clone();
    }
}

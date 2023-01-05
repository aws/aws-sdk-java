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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteUsageLimit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteUsageLimitResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The deleted usage limit object.
     * </p>
     */
    private UsageLimit usageLimit;

    /**
     * <p>
     * The deleted usage limit object.
     * </p>
     * 
     * @param usageLimit
     *        The deleted usage limit object.
     */

    public void setUsageLimit(UsageLimit usageLimit) {
        this.usageLimit = usageLimit;
    }

    /**
     * <p>
     * The deleted usage limit object.
     * </p>
     * 
     * @return The deleted usage limit object.
     */

    public UsageLimit getUsageLimit() {
        return this.usageLimit;
    }

    /**
     * <p>
     * The deleted usage limit object.
     * </p>
     * 
     * @param usageLimit
     *        The deleted usage limit object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUsageLimitResult withUsageLimit(UsageLimit usageLimit) {
        setUsageLimit(usageLimit);
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
        if (getUsageLimit() != null)
            sb.append("UsageLimit: ").append(getUsageLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteUsageLimitResult == false)
            return false;
        DeleteUsageLimitResult other = (DeleteUsageLimitResult) obj;
        if (other.getUsageLimit() == null ^ this.getUsageLimit() == null)
            return false;
        if (other.getUsageLimit() != null && other.getUsageLimit().equals(this.getUsageLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsageLimit() == null) ? 0 : getUsageLimit().hashCode());
        return hashCode;
    }

    @Override
    public DeleteUsageLimitResult clone() {
        try {
            return (DeleteUsageLimitResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

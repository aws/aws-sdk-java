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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Response to a successful DescribeIdentityPoolUsage request.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DescribeIdentityPoolUsage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIdentityPoolUsageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Information about the usage of the identity pool. */
    private IdentityPoolUsage identityPoolUsage;

    /**
     * Information about the usage of the identity pool.
     * 
     * @param identityPoolUsage
     *        Information about the usage of the identity pool.
     */

    public void setIdentityPoolUsage(IdentityPoolUsage identityPoolUsage) {
        this.identityPoolUsage = identityPoolUsage;
    }

    /**
     * Information about the usage of the identity pool.
     * 
     * @return Information about the usage of the identity pool.
     */

    public IdentityPoolUsage getIdentityPoolUsage() {
        return this.identityPoolUsage;
    }

    /**
     * Information about the usage of the identity pool.
     * 
     * @param identityPoolUsage
     *        Information about the usage of the identity pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIdentityPoolUsageResult withIdentityPoolUsage(IdentityPoolUsage identityPoolUsage) {
        setIdentityPoolUsage(identityPoolUsage);
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
        if (getIdentityPoolUsage() != null)
            sb.append("IdentityPoolUsage: ").append(getIdentityPoolUsage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIdentityPoolUsageResult == false)
            return false;
        DescribeIdentityPoolUsageResult other = (DescribeIdentityPoolUsageResult) obj;
        if (other.getIdentityPoolUsage() == null ^ this.getIdentityPoolUsage() == null)
            return false;
        if (other.getIdentityPoolUsage() != null && other.getIdentityPoolUsage().equals(this.getIdentityPoolUsage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityPoolUsage() == null) ? 0 : getIdentityPoolUsage().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIdentityPoolUsageResult clone() {
        try {
            return (DescribeIdentityPoolUsageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

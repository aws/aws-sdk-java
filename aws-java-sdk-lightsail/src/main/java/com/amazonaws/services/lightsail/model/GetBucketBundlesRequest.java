/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBucketBundles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBucketBundlesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A Boolean value that indicates whether to include inactive (unavailable) bundles in the response.
     * </p>
     */
    private Boolean includeInactive;

    /**
     * <p>
     * A Boolean value that indicates whether to include inactive (unavailable) bundles in the response.
     * </p>
     * 
     * @param includeInactive
     *        A Boolean value that indicates whether to include inactive (unavailable) bundles in the response.
     */

    public void setIncludeInactive(Boolean includeInactive) {
        this.includeInactive = includeInactive;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to include inactive (unavailable) bundles in the response.
     * </p>
     * 
     * @return A Boolean value that indicates whether to include inactive (unavailable) bundles in the response.
     */

    public Boolean getIncludeInactive() {
        return this.includeInactive;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to include inactive (unavailable) bundles in the response.
     * </p>
     * 
     * @param includeInactive
     *        A Boolean value that indicates whether to include inactive (unavailable) bundles in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketBundlesRequest withIncludeInactive(Boolean includeInactive) {
        setIncludeInactive(includeInactive);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to include inactive (unavailable) bundles in the response.
     * </p>
     * 
     * @return A Boolean value that indicates whether to include inactive (unavailable) bundles in the response.
     */

    public Boolean isIncludeInactive() {
        return this.includeInactive;
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
        if (getIncludeInactive() != null)
            sb.append("IncludeInactive: ").append(getIncludeInactive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketBundlesRequest == false)
            return false;
        GetBucketBundlesRequest other = (GetBucketBundlesRequest) obj;
        if (other.getIncludeInactive() == null ^ this.getIncludeInactive() == null)
            return false;
        if (other.getIncludeInactive() != null && other.getIncludeInactive().equals(this.getIncludeInactive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludeInactive() == null) ? 0 : getIncludeInactive().hashCode());
        return hashCode;
    }

    @Override
    public GetBucketBundlesRequest clone() {
        return (GetBucketBundlesRequest) super.clone();
    }

}

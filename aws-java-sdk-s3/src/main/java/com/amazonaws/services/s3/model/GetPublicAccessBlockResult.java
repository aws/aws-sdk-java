/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class GetPublicAccessBlockResult implements Serializable, Cloneable {

    private PublicAccessBlockConfiguration publicAccessBlockConfiguration;

    /**
     * The Public Access Block configuration currently in effect for this Amazon S3 bucket.
     */
    public PublicAccessBlockConfiguration getPublicAccessBlockConfiguration() {
        return publicAccessBlockConfiguration;
    }

    /**
     * The Public Access Block configuration currently in effect for this Amazon S3 bucket.
     *
     * @param publicAccessBlockConfiguration Configuration of bucket.
     */
    public void setPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
    }

    /**
     * The Public Access Block configuration currently in effect for this Amazon S3 bucket.
     *
     * @param publicAccessBlockConfiguration Configuration of bucket.
     * @return This object for method chaining.
     */
    public GetPublicAccessBlockResult withPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        setPublicAccessBlockConfiguration(publicAccessBlockConfiguration);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final GetPublicAccessBlockResult that = (GetPublicAccessBlockResult) o;

        return publicAccessBlockConfiguration != null ? publicAccessBlockConfiguration.equals(that.publicAccessBlockConfiguration) : that.publicAccessBlockConfiguration == null;
    }

    @Override
    public int hashCode() {
        return publicAccessBlockConfiguration != null ? publicAccessBlockConfiguration.hashCode() : 0;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPublicAccessBlockConfiguration() != null) {
            sb.append("PublicAccessBlockConfiguration: ").append(getPublicAccessBlockConfiguration()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public GetPublicAccessBlockResult clone() {
        try {
            return (GetPublicAccessBlockResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

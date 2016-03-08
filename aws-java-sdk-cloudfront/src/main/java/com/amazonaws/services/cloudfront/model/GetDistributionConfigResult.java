/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * The returned result of the corresponding request.
 */
public class GetDistributionConfigResult implements Serializable, Cloneable {

    /** The distribution's configuration information. */
    private DistributionConfig distributionConfig;
    /** The current version of the configuration. For example: E2QWRUHAPOMQZL. */
    private String eTag;

    /**
     * The distribution's configuration information.
     * 
     * @param distributionConfig
     *        The distribution's configuration information.
     */

    public void setDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
    }

    /**
     * The distribution's configuration information.
     * 
     * @return The distribution's configuration information.
     */

    public DistributionConfig getDistributionConfig() {
        return this.distributionConfig;
    }

    /**
     * The distribution's configuration information.
     * 
     * @param distributionConfig
     *        The distribution's configuration information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetDistributionConfigResult withDistributionConfig(
            DistributionConfig distributionConfig) {
        setDistributionConfig(distributionConfig);
        return this;
    }

    /**
     * The current version of the configuration. For example: E2QWRUHAPOMQZL.
     * 
     * @param eTag
     *        The current version of the configuration. For example:
     *        E2QWRUHAPOMQZL.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * The current version of the configuration. For example: E2QWRUHAPOMQZL.
     * 
     * @return The current version of the configuration. For example:
     *         E2QWRUHAPOMQZL.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * The current version of the configuration. For example: E2QWRUHAPOMQZL.
     * 
     * @param eTag
     *        The current version of the configuration. For example:
     *        E2QWRUHAPOMQZL.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetDistributionConfigResult withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDistributionConfig() != null)
            sb.append("DistributionConfig: " + getDistributionConfig() + ",");
        if (getETag() != null)
            sb.append("ETag: " + getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDistributionConfigResult == false)
            return false;
        GetDistributionConfigResult other = (GetDistributionConfigResult) obj;
        if (other.getDistributionConfig() == null
                ^ this.getDistributionConfig() == null)
            return false;
        if (other.getDistributionConfig() != null
                && other.getDistributionConfig().equals(
                        this.getDistributionConfig()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null
                && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDistributionConfig() == null) ? 0
                        : getDistributionConfig().hashCode());
        hashCode = prime * hashCode
                + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public GetDistributionConfigResult clone() {
        try {
            return (GetDistributionConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

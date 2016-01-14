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
 * 
 */
public class Origin implements Serializable, Cloneable {

    private String id;

    private String domainName;

    private String originPath;

    private CustomHeaders customHeaders;

    private S3OriginConfig s3OriginConfig;

    private CustomOriginConfig customOriginConfig;

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Origin withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * @return
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @param domainName
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Origin withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * @param originPath
     */
    public void setOriginPath(String originPath) {
        this.originPath = originPath;
    }

    /**
     * @return
     */
    public String getOriginPath() {
        return this.originPath;
    }

    /**
     * @param originPath
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Origin withOriginPath(String originPath) {
        setOriginPath(originPath);
        return this;
    }

    /**
     * @param customHeaders
     */
    public void setCustomHeaders(CustomHeaders customHeaders) {
        this.customHeaders = customHeaders;
    }

    /**
     * @return
     */
    public CustomHeaders getCustomHeaders() {
        return this.customHeaders;
    }

    /**
     * @param customHeaders
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Origin withCustomHeaders(CustomHeaders customHeaders) {
        setCustomHeaders(customHeaders);
        return this;
    }

    /**
     * @param s3OriginConfig
     */
    public void setS3OriginConfig(S3OriginConfig s3OriginConfig) {
        this.s3OriginConfig = s3OriginConfig;
    }

    /**
     * @return
     */
    public S3OriginConfig getS3OriginConfig() {
        return this.s3OriginConfig;
    }

    /**
     * @param s3OriginConfig
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Origin withS3OriginConfig(S3OriginConfig s3OriginConfig) {
        setS3OriginConfig(s3OriginConfig);
        return this;
    }

    /**
     * @param customOriginConfig
     */
    public void setCustomOriginConfig(CustomOriginConfig customOriginConfig) {
        this.customOriginConfig = customOriginConfig;
    }

    /**
     * @return
     */
    public CustomOriginConfig getCustomOriginConfig() {
        return this.customOriginConfig;
    }

    /**
     * @param customOriginConfig
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Origin withCustomOriginConfig(CustomOriginConfig customOriginConfig) {
        setCustomOriginConfig(customOriginConfig);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getOriginPath() != null)
            sb.append("OriginPath: " + getOriginPath() + ",");
        if (getCustomHeaders() != null)
            sb.append("CustomHeaders: " + getCustomHeaders() + ",");
        if (getS3OriginConfig() != null)
            sb.append("S3OriginConfig: " + getS3OriginConfig() + ",");
        if (getCustomOriginConfig() != null)
            sb.append("CustomOriginConfig: " + getCustomOriginConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Origin == false)
            return false;
        Origin other = (Origin) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getOriginPath() == null ^ this.getOriginPath() == null)
            return false;
        if (other.getOriginPath() != null
                && other.getOriginPath().equals(this.getOriginPath()) == false)
            return false;
        if (other.getCustomHeaders() == null ^ this.getCustomHeaders() == null)
            return false;
        if (other.getCustomHeaders() != null
                && other.getCustomHeaders().equals(this.getCustomHeaders()) == false)
            return false;
        if (other.getS3OriginConfig() == null
                ^ this.getS3OriginConfig() == null)
            return false;
        if (other.getS3OriginConfig() != null
                && other.getS3OriginConfig().equals(this.getS3OriginConfig()) == false)
            return false;
        if (other.getCustomOriginConfig() == null
                ^ this.getCustomOriginConfig() == null)
            return false;
        if (other.getCustomOriginConfig() != null
                && other.getCustomOriginConfig().equals(
                        this.getCustomOriginConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getOriginPath() == null) ? 0 : getOriginPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomHeaders() == null) ? 0 : getCustomHeaders()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getS3OriginConfig() == null) ? 0 : getS3OriginConfig()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomOriginConfig() == null) ? 0
                        : getCustomOriginConfig().hashCode());
        return hashCode;
    }

    @Override
    public Origin clone() {
        try {
            return (Origin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
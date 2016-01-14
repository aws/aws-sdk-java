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
public class LoggingConfig implements Serializable, Cloneable {

    private Boolean enabled;

    private Boolean includeCookies;

    private String bucket;

    private String prefix;

    /**
     * Default constructor for LoggingConfig object. Callers should use the
     * setter or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public LoggingConfig() {
    }

    /**
     * Constructs a new LoggingConfig object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param bucket
     * @param prefix
     */
    public LoggingConfig(String bucket, String prefix) {
        setBucket(bucket);
        setPrefix(prefix);
    }

    /**
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * @return
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @param enabled
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LoggingConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * @return
     */
    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * @param includeCookies
     */
    public void setIncludeCookies(Boolean includeCookies) {
        this.includeCookies = includeCookies;
    }

    /**
     * @return
     */
    public Boolean getIncludeCookies() {
        return this.includeCookies;
    }

    /**
     * @param includeCookies
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LoggingConfig withIncludeCookies(Boolean includeCookies) {
        setIncludeCookies(includeCookies);
        return this;
    }

    /**
     * @return
     */
    public Boolean isIncludeCookies() {
        return this.includeCookies;
    }

    /**
     * @param bucket
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * @return
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @param bucket
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LoggingConfig withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * @param prefix
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * @return
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @param prefix
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LoggingConfig withPrefix(String prefix) {
        setPrefix(prefix);
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
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getIncludeCookies() != null)
            sb.append("IncludeCookies: " + getIncludeCookies() + ",");
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfig == false)
            return false;
        LoggingConfig other = (LoggingConfig) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null
                && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getIncludeCookies() == null
                ^ this.getIncludeCookies() == null)
            return false;
        if (other.getIncludeCookies() != null
                && other.getIncludeCookies().equals(this.getIncludeCookies()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null
                && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null
                && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludeCookies() == null) ? 0 : getIncludeCookies()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode
                + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public LoggingConfig clone() {
        try {
            return (LoggingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
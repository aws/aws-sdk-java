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
public class CustomErrorResponse implements Serializable, Cloneable {

    private Integer errorCode;

    private String responsePagePath;

    private String responseCode;

    private Long errorCachingMinTTL;

    /**
     * @param errorCode
     */
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @param errorCode
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CustomErrorResponse withErrorCode(Integer errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * @param responsePagePath
     */
    public void setResponsePagePath(String responsePagePath) {
        this.responsePagePath = responsePagePath;
    }

    /**
     * @return
     */
    public String getResponsePagePath() {
        return this.responsePagePath;
    }

    /**
     * @param responsePagePath
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CustomErrorResponse withResponsePagePath(String responsePagePath) {
        setResponsePagePath(responsePagePath);
        return this;
    }

    /**
     * @param responseCode
     */
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * @return
     */
    public String getResponseCode() {
        return this.responseCode;
    }

    /**
     * @param responseCode
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CustomErrorResponse withResponseCode(String responseCode) {
        setResponseCode(responseCode);
        return this;
    }

    /**
     * @param errorCachingMinTTL
     */
    public void setErrorCachingMinTTL(Long errorCachingMinTTL) {
        this.errorCachingMinTTL = errorCachingMinTTL;
    }

    /**
     * @return
     */
    public Long getErrorCachingMinTTL() {
        return this.errorCachingMinTTL;
    }

    /**
     * @param errorCachingMinTTL
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CustomErrorResponse withErrorCachingMinTTL(Long errorCachingMinTTL) {
        setErrorCachingMinTTL(errorCachingMinTTL);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getResponsePagePath() != null)
            sb.append("ResponsePagePath: " + getResponsePagePath() + ",");
        if (getResponseCode() != null)
            sb.append("ResponseCode: " + getResponseCode() + ",");
        if (getErrorCachingMinTTL() != null)
            sb.append("ErrorCachingMinTTL: " + getErrorCachingMinTTL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomErrorResponse == false)
            return false;
        CustomErrorResponse other = (CustomErrorResponse) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getResponsePagePath() == null
                ^ this.getResponsePagePath() == null)
            return false;
        if (other.getResponsePagePath() != null
                && other.getResponsePagePath().equals(
                        this.getResponsePagePath()) == false)
            return false;
        if (other.getResponseCode() == null ^ this.getResponseCode() == null)
            return false;
        if (other.getResponseCode() != null
                && other.getResponseCode().equals(this.getResponseCode()) == false)
            return false;
        if (other.getErrorCachingMinTTL() == null
                ^ this.getErrorCachingMinTTL() == null)
            return false;
        if (other.getErrorCachingMinTTL() != null
                && other.getErrorCachingMinTTL().equals(
                        this.getErrorCachingMinTTL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getResponsePagePath() == null) ? 0 : getResponsePagePath()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getResponseCode() == null) ? 0 : getResponseCode()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getErrorCachingMinTTL() == null) ? 0
                        : getErrorCachingMinTTL().hashCode());
        return hashCode;
    }

    @Override
    public CustomErrorResponse clone() {
        try {
            return (CustomErrorResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
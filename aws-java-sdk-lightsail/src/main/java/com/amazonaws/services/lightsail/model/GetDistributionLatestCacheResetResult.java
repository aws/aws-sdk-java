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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionLatestCacheReset"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDistributionLatestCacheResetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The status of the last cache reset.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp of the last cache reset (e.g., <code>1479734909.17</code>) in Unix time format.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The status of the last cache reset.
     * </p>
     * 
     * @param status
     *        The status of the last cache reset.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the last cache reset.
     * </p>
     * 
     * @return The status of the last cache reset.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the last cache reset.
     * </p>
     * 
     * @param status
     *        The status of the last cache reset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDistributionLatestCacheResetResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The timestamp of the last cache reset (e.g., <code>1479734909.17</code>) in Unix time format.
     * </p>
     * 
     * @param createTime
     *        The timestamp of the last cache reset (e.g., <code>1479734909.17</code>) in Unix time format.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp of the last cache reset (e.g., <code>1479734909.17</code>) in Unix time format.
     * </p>
     * 
     * @return The timestamp of the last cache reset (e.g., <code>1479734909.17</code>) in Unix time format.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The timestamp of the last cache reset (e.g., <code>1479734909.17</code>) in Unix time format.
     * </p>
     * 
     * @param createTime
     *        The timestamp of the last cache reset (e.g., <code>1479734909.17</code>) in Unix time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDistributionLatestCacheResetResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDistributionLatestCacheResetResult == false)
            return false;
        GetDistributionLatestCacheResetResult other = (GetDistributionLatestCacheResetResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return hashCode;
    }

    @Override
    public GetDistributionLatestCacheResetResult clone() {
        try {
            return (GetDistributionLatestCacheResetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

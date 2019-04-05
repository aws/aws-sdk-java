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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * RefreshCacheOutput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RefreshCache" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RefreshCacheResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String fileShareARN;

    private String notificationId;

    /**
     * @param fileShareARN
     */

    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * @return
     */

    public String getFileShareARN() {
        return this.fileShareARN;
    }

    /**
     * @param fileShareARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshCacheResult withFileShareARN(String fileShareARN) {
        setFileShareARN(fileShareARN);
        return this;
    }

    /**
     * @param notificationId
     */

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    /**
     * @return
     */

    public String getNotificationId() {
        return this.notificationId;
    }

    /**
     * @param notificationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshCacheResult withNotificationId(String notificationId) {
        setNotificationId(notificationId);
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
        if (getFileShareARN() != null)
            sb.append("FileShareARN: ").append(getFileShareARN()).append(",");
        if (getNotificationId() != null)
            sb.append("NotificationId: ").append(getNotificationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RefreshCacheResult == false)
            return false;
        RefreshCacheResult other = (RefreshCacheResult) obj;
        if (other.getFileShareARN() == null ^ this.getFileShareARN() == null)
            return false;
        if (other.getFileShareARN() != null && other.getFileShareARN().equals(this.getFileShareARN()) == false)
            return false;
        if (other.getNotificationId() == null ^ this.getNotificationId() == null)
            return false;
        if (other.getNotificationId() != null && other.getNotificationId().equals(this.getNotificationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileShareARN() == null) ? 0 : getFileShareARN().hashCode());
        hashCode = prime * hashCode + ((getNotificationId() == null) ? 0 : getNotificationId().hashCode());
        return hashCode;
    }

    @Override
    public RefreshCacheResult clone() {
        try {
            return (RefreshCacheResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

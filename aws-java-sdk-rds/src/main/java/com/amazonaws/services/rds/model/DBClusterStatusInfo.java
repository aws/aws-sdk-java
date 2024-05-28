/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Reserved for future use.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBClusterStatusInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBClusterStatusInfo implements Serializable, Cloneable {

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String statusType;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Boolean normal;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param statusType
     *        Reserved for future use.
     */

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getStatusType() {
        return this.statusType;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param statusType
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterStatusInfo withStatusType(String statusType) {
        setStatusType(statusType);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param normal
     *        Reserved for future use.
     */

    public void setNormal(Boolean normal) {
        this.normal = normal;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public Boolean getNormal() {
        return this.normal;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param normal
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterStatusInfo withNormal(Boolean normal) {
        setNormal(normal);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public Boolean isNormal() {
        return this.normal;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param status
     *        Reserved for future use.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param status
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterStatusInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param message
     *        Reserved for future use.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param message
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterStatusInfo withMessage(String message) {
        setMessage(message);
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
        if (getStatusType() != null)
            sb.append("StatusType: ").append(getStatusType()).append(",");
        if (getNormal() != null)
            sb.append("Normal: ").append(getNormal()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBClusterStatusInfo == false)
            return false;
        DBClusterStatusInfo other = (DBClusterStatusInfo) obj;
        if (other.getStatusType() == null ^ this.getStatusType() == null)
            return false;
        if (other.getStatusType() != null && other.getStatusType().equals(this.getStatusType()) == false)
            return false;
        if (other.getNormal() == null ^ this.getNormal() == null)
            return false;
        if (other.getNormal() != null && other.getNormal().equals(this.getNormal()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusType() == null) ? 0 : getStatusType().hashCode());
        hashCode = prime * hashCode + ((getNormal() == null) ? 0 : getNormal().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public DBClusterStatusInfo clone() {
        try {
            return (DBClusterStatusInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

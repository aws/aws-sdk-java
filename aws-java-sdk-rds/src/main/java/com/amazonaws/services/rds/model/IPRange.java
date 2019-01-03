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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This data type is used as a response element in the <a>DescribeDBSecurityGroups</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/IPRange" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IPRange implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the status of the IP range. Status can be "authorizing", "authorized", "revoking", and "revoked".
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies the IP range.
     * </p>
     */
    private String cIDRIP;

    /**
     * <p>
     * Specifies the status of the IP range. Status can be "authorizing", "authorized", "revoking", and "revoked".
     * </p>
     * 
     * @param status
     *        Specifies the status of the IP range. Status can be "authorizing", "authorized", "revoking", and
     *        "revoked".
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of the IP range. Status can be "authorizing", "authorized", "revoking", and "revoked".
     * </p>
     * 
     * @return Specifies the status of the IP range. Status can be "authorizing", "authorized", "revoking", and
     *         "revoked".
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the status of the IP range. Status can be "authorizing", "authorized", "revoking", and "revoked".
     * </p>
     * 
     * @param status
     *        Specifies the status of the IP range. Status can be "authorizing", "authorized", "revoking", and
     *        "revoked".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPRange withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the IP range.
     * </p>
     * 
     * @param cIDRIP
     *        Specifies the IP range.
     */

    public void setCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
    }

    /**
     * <p>
     * Specifies the IP range.
     * </p>
     * 
     * @return Specifies the IP range.
     */

    public String getCIDRIP() {
        return this.cIDRIP;
    }

    /**
     * <p>
     * Specifies the IP range.
     * </p>
     * 
     * @param cIDRIP
     *        Specifies the IP range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPRange withCIDRIP(String cIDRIP) {
        setCIDRIP(cIDRIP);
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
        if (getCIDRIP() != null)
            sb.append("CIDRIP: ").append(getCIDRIP());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IPRange == false)
            return false;
        IPRange other = (IPRange) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCIDRIP() == null ^ this.getCIDRIP() == null)
            return false;
        if (other.getCIDRIP() != null && other.getCIDRIP().equals(this.getCIDRIP()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCIDRIP() == null) ? 0 : getCIDRIP().hashCode());
        return hashCode;
    }

    @Override
    public IPRange clone() {
        try {
            return (IPRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

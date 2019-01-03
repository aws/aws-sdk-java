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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RemoveIpRoutes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveIpRoutesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier (ID) of the directory from which you want to remove the IP addresses.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * IP address blocks that you want to remove.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cidrIps;

    /**
     * <p>
     * Identifier (ID) of the directory from which you want to remove the IP addresses.
     * </p>
     * 
     * @param directoryId
     *        Identifier (ID) of the directory from which you want to remove the IP addresses.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * Identifier (ID) of the directory from which you want to remove the IP addresses.
     * </p>
     * 
     * @return Identifier (ID) of the directory from which you want to remove the IP addresses.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * Identifier (ID) of the directory from which you want to remove the IP addresses.
     * </p>
     * 
     * @param directoryId
     *        Identifier (ID) of the directory from which you want to remove the IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveIpRoutesRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * IP address blocks that you want to remove.
     * </p>
     * 
     * @return IP address blocks that you want to remove.
     */

    public java.util.List<String> getCidrIps() {
        if (cidrIps == null) {
            cidrIps = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cidrIps;
    }

    /**
     * <p>
     * IP address blocks that you want to remove.
     * </p>
     * 
     * @param cidrIps
     *        IP address blocks that you want to remove.
     */

    public void setCidrIps(java.util.Collection<String> cidrIps) {
        if (cidrIps == null) {
            this.cidrIps = null;
            return;
        }

        this.cidrIps = new com.amazonaws.internal.SdkInternalList<String>(cidrIps);
    }

    /**
     * <p>
     * IP address blocks that you want to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrIps(java.util.Collection)} or {@link #withCidrIps(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param cidrIps
     *        IP address blocks that you want to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveIpRoutesRequest withCidrIps(String... cidrIps) {
        if (this.cidrIps == null) {
            setCidrIps(new com.amazonaws.internal.SdkInternalList<String>(cidrIps.length));
        }
        for (String ele : cidrIps) {
            this.cidrIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * IP address blocks that you want to remove.
     * </p>
     * 
     * @param cidrIps
     *        IP address blocks that you want to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveIpRoutesRequest withCidrIps(java.util.Collection<String> cidrIps) {
        setCidrIps(cidrIps);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getCidrIps() != null)
            sb.append("CidrIps: ").append(getCidrIps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveIpRoutesRequest == false)
            return false;
        RemoveIpRoutesRequest other = (RemoveIpRoutesRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getCidrIps() == null ^ this.getCidrIps() == null)
            return false;
        if (other.getCidrIps() != null && other.getCidrIps().equals(this.getCidrIps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getCidrIps() == null) ? 0 : getCidrIps().hashCode());
        return hashCode;
    }

    @Override
    public RemoveIpRoutesRequest clone() {
        return (RemoveIpRoutesRequest) super.clone();
    }

}

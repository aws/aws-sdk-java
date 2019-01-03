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
 * <p>
 * Describes a conditional forwarder.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeConditionalForwarders" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConditionalForwardersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The directory ID for which to get the list of associated conditional forwarders.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated conditional
     * forwarders. If this member is null, all conditional forwarders are returned.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> remoteDomainNames;

    /**
     * <p>
     * The directory ID for which to get the list of associated conditional forwarders.
     * </p>
     * 
     * @param directoryId
     *        The directory ID for which to get the list of associated conditional forwarders.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The directory ID for which to get the list of associated conditional forwarders.
     * </p>
     * 
     * @return The directory ID for which to get the list of associated conditional forwarders.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The directory ID for which to get the list of associated conditional forwarders.
     * </p>
     * 
     * @param directoryId
     *        The directory ID for which to get the list of associated conditional forwarders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConditionalForwardersRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated conditional
     * forwarders. If this member is null, all conditional forwarders are returned.
     * </p>
     * 
     * @return The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated
     *         conditional forwarders. If this member is null, all conditional forwarders are returned.
     */

    public java.util.List<String> getRemoteDomainNames() {
        if (remoteDomainNames == null) {
            remoteDomainNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return remoteDomainNames;
    }

    /**
     * <p>
     * The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated conditional
     * forwarders. If this member is null, all conditional forwarders are returned.
     * </p>
     * 
     * @param remoteDomainNames
     *        The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated
     *        conditional forwarders. If this member is null, all conditional forwarders are returned.
     */

    public void setRemoteDomainNames(java.util.Collection<String> remoteDomainNames) {
        if (remoteDomainNames == null) {
            this.remoteDomainNames = null;
            return;
        }

        this.remoteDomainNames = new com.amazonaws.internal.SdkInternalList<String>(remoteDomainNames);
    }

    /**
     * <p>
     * The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated conditional
     * forwarders. If this member is null, all conditional forwarders are returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoteDomainNames(java.util.Collection)} or {@link #withRemoteDomainNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param remoteDomainNames
     *        The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated
     *        conditional forwarders. If this member is null, all conditional forwarders are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConditionalForwardersRequest withRemoteDomainNames(String... remoteDomainNames) {
        if (this.remoteDomainNames == null) {
            setRemoteDomainNames(new com.amazonaws.internal.SdkInternalList<String>(remoteDomainNames.length));
        }
        for (String ele : remoteDomainNames) {
            this.remoteDomainNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated conditional
     * forwarders. If this member is null, all conditional forwarders are returned.
     * </p>
     * 
     * @param remoteDomainNames
     *        The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated
     *        conditional forwarders. If this member is null, all conditional forwarders are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConditionalForwardersRequest withRemoteDomainNames(java.util.Collection<String> remoteDomainNames) {
        setRemoteDomainNames(remoteDomainNames);
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
        if (getRemoteDomainNames() != null)
            sb.append("RemoteDomainNames: ").append(getRemoteDomainNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConditionalForwardersRequest == false)
            return false;
        DescribeConditionalForwardersRequest other = (DescribeConditionalForwardersRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getRemoteDomainNames() == null ^ this.getRemoteDomainNames() == null)
            return false;
        if (other.getRemoteDomainNames() != null && other.getRemoteDomainNames().equals(this.getRemoteDomainNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getRemoteDomainNames() == null) ? 0 : getRemoteDomainNames().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConditionalForwardersRequest clone() {
        return (DescribeConditionalForwardersRequest) super.clone();
    }

}

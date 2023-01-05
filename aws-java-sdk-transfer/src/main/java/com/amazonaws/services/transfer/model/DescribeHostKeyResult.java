/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeHostKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHostKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the details for the specified host key.
     * </p>
     */
    private DescribedHostKey hostKey;

    /**
     * <p>
     * Returns the details for the specified host key.
     * </p>
     * 
     * @param hostKey
     *        Returns the details for the specified host key.
     */

    public void setHostKey(DescribedHostKey hostKey) {
        this.hostKey = hostKey;
    }

    /**
     * <p>
     * Returns the details for the specified host key.
     * </p>
     * 
     * @return Returns the details for the specified host key.
     */

    public DescribedHostKey getHostKey() {
        return this.hostKey;
    }

    /**
     * <p>
     * Returns the details for the specified host key.
     * </p>
     * 
     * @param hostKey
     *        Returns the details for the specified host key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostKeyResult withHostKey(DescribedHostKey hostKey) {
        setHostKey(hostKey);
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
        if (getHostKey() != null)
            sb.append("HostKey: ").append(getHostKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHostKeyResult == false)
            return false;
        DescribeHostKeyResult other = (DescribeHostKeyResult) obj;
        if (other.getHostKey() == null ^ this.getHostKey() == null)
            return false;
        if (other.getHostKey() != null && other.getHostKey().equals(this.getHostKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostKey() == null) ? 0 : getHostKey().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHostKeyResult clone() {
        try {
            return (DescribeHostKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

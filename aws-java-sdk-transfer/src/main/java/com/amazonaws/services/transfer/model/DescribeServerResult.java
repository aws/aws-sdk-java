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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array containing the properties of the server with the <code>ServerID</code> you specified.
     * </p>
     */
    private DescribedServer server;

    /**
     * <p>
     * An array containing the properties of the server with the <code>ServerID</code> you specified.
     * </p>
     * 
     * @param server
     *        An array containing the properties of the server with the <code>ServerID</code> you specified.
     */

    public void setServer(DescribedServer server) {
        this.server = server;
    }

    /**
     * <p>
     * An array containing the properties of the server with the <code>ServerID</code> you specified.
     * </p>
     * 
     * @return An array containing the properties of the server with the <code>ServerID</code> you specified.
     */

    public DescribedServer getServer() {
        return this.server;
    }

    /**
     * <p>
     * An array containing the properties of the server with the <code>ServerID</code> you specified.
     * </p>
     * 
     * @param server
     *        An array containing the properties of the server with the <code>ServerID</code> you specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServerResult withServer(DescribedServer server) {
        setServer(server);
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
        if (getServer() != null)
            sb.append("Server: ").append(getServer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServerResult == false)
            return false;
        DescribeServerResult other = (DescribeServerResult) obj;
        if (other.getServer() == null ^ this.getServer() == null)
            return false;
        if (other.getServer() != null && other.getServer().equals(this.getServer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServer() == null) ? 0 : getServer().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServerResult clone() {
        try {
            return (DescribeServerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object containing details about the servers imported by Application Discovery Service
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ServerSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Type of operating system for the servers.
     * </p>
     */
    private String serverOsType;
    /**
     * <p>
     * Number of servers.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * Type of operating system for the servers.
     * </p>
     * 
     * @param serverOsType
     *        Type of operating system for the servers.
     * @see ServerOsType
     */

    public void setServerOsType(String serverOsType) {
        this.serverOsType = serverOsType;
    }

    /**
     * <p>
     * Type of operating system for the servers.
     * </p>
     * 
     * @return Type of operating system for the servers.
     * @see ServerOsType
     */

    public String getServerOsType() {
        return this.serverOsType;
    }

    /**
     * <p>
     * Type of operating system for the servers.
     * </p>
     * 
     * @param serverOsType
     *        Type of operating system for the servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerOsType
     */

    public ServerSummary withServerOsType(String serverOsType) {
        setServerOsType(serverOsType);
        return this;
    }

    /**
     * <p>
     * Type of operating system for the servers.
     * </p>
     * 
     * @param serverOsType
     *        Type of operating system for the servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerOsType
     */

    public ServerSummary withServerOsType(ServerOsType serverOsType) {
        this.serverOsType = serverOsType.toString();
        return this;
    }

    /**
     * <p>
     * Number of servers.
     * </p>
     * 
     * @param count
     *        Number of servers.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * Number of servers.
     * </p>
     * 
     * @return Number of servers.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * Number of servers.
     * </p>
     * 
     * @param count
     *        Number of servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerSummary withCount(Integer count) {
        setCount(count);
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
        if (getServerOsType() != null)
            sb.append("ServerOsType: ").append(getServerOsType()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerSummary == false)
            return false;
        ServerSummary other = (ServerSummary) obj;
        if (other.getServerOsType() == null ^ this.getServerOsType() == null)
            return false;
        if (other.getServerOsType() != null && other.getServerOsType().equals(this.getServerOsType()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerOsType() == null) ? 0 : getServerOsType().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public ServerSummary clone() {
        try {
            return (ServerSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ServerSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeServers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the response to a <code>DescribeServers</code> request.
     * </p>
     * <p>
     * <i>For Puppet Server:</i> <code>DescribeServersResponse$Servers$EngineAttributes</code> contains
     * PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used by the Puppet API over TCP port number
     * 8140. The CA certificate is also used to sign node certificates.
     * </p>
     */
    private java.util.List<Server> servers;
    /**
     * <p>
     * This is not currently implemented for <code>DescribeServers</code> requests.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains the response to a <code>DescribeServers</code> request.
     * </p>
     * <p>
     * <i>For Puppet Server:</i> <code>DescribeServersResponse$Servers$EngineAttributes</code> contains
     * PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used by the Puppet API over TCP port number
     * 8140. The CA certificate is also used to sign node certificates.
     * </p>
     * 
     * @return Contains the response to a <code>DescribeServers</code> request.</p>
     *         <p>
     *         <i>For Puppet Server:</i> <code>DescribeServersResponse$Servers$EngineAttributes</code> contains
     *         PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used by the Puppet API over TCP port
     *         number 8140. The CA certificate is also used to sign node certificates.
     */

    public java.util.List<Server> getServers() {
        return servers;
    }

    /**
     * <p>
     * Contains the response to a <code>DescribeServers</code> request.
     * </p>
     * <p>
     * <i>For Puppet Server:</i> <code>DescribeServersResponse$Servers$EngineAttributes</code> contains
     * PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used by the Puppet API over TCP port number
     * 8140. The CA certificate is also used to sign node certificates.
     * </p>
     * 
     * @param servers
     *        Contains the response to a <code>DescribeServers</code> request.</p>
     *        <p>
     *        <i>For Puppet Server:</i> <code>DescribeServersResponse$Servers$EngineAttributes</code> contains
     *        PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used by the Puppet API over TCP port
     *        number 8140. The CA certificate is also used to sign node certificates.
     */

    public void setServers(java.util.Collection<Server> servers) {
        if (servers == null) {
            this.servers = null;
            return;
        }

        this.servers = new java.util.ArrayList<Server>(servers);
    }

    /**
     * <p>
     * Contains the response to a <code>DescribeServers</code> request.
     * </p>
     * <p>
     * <i>For Puppet Server:</i> <code>DescribeServersResponse$Servers$EngineAttributes</code> contains
     * PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used by the Puppet API over TCP port number
     * 8140. The CA certificate is also used to sign node certificates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServers(java.util.Collection)} or {@link #withServers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param servers
     *        Contains the response to a <code>DescribeServers</code> request.</p>
     *        <p>
     *        <i>For Puppet Server:</i> <code>DescribeServersResponse$Servers$EngineAttributes</code> contains
     *        PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used by the Puppet API over TCP port
     *        number 8140. The CA certificate is also used to sign node certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServersResult withServers(Server... servers) {
        if (this.servers == null) {
            setServers(new java.util.ArrayList<Server>(servers.length));
        }
        for (Server ele : servers) {
            this.servers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the response to a <code>DescribeServers</code> request.
     * </p>
     * <p>
     * <i>For Puppet Server:</i> <code>DescribeServersResponse$Servers$EngineAttributes</code> contains
     * PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used by the Puppet API over TCP port number
     * 8140. The CA certificate is also used to sign node certificates.
     * </p>
     * 
     * @param servers
     *        Contains the response to a <code>DescribeServers</code> request.</p>
     *        <p>
     *        <i>For Puppet Server:</i> <code>DescribeServersResponse$Servers$EngineAttributes</code> contains
     *        PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used by the Puppet API over TCP port
     *        number 8140. The CA certificate is also used to sign node certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServersResult withServers(java.util.Collection<Server> servers) {
        setServers(servers);
        return this;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeServers</code> requests.
     * </p>
     * 
     * @param nextToken
     *        This is not currently implemented for <code>DescribeServers</code> requests.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeServers</code> requests.
     * </p>
     * 
     * @return This is not currently implemented for <code>DescribeServers</code> requests.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeServers</code> requests.
     * </p>
     * 
     * @param nextToken
     *        This is not currently implemented for <code>DescribeServers</code> requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getServers() != null)
            sb.append("Servers: ").append(getServers()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServersResult == false)
            return false;
        DescribeServersResult other = (DescribeServersResult) obj;
        if (other.getServers() == null ^ this.getServers() == null)
            return false;
        if (other.getServers() != null && other.getServers().equals(this.getServers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServers() == null) ? 0 : getServers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServersResult clone() {
        try {
            return (DescribeServersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

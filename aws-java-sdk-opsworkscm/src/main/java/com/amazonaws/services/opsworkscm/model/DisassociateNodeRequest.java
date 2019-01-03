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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DisassociateNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateNodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the server from which to disassociate the node.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The name of the client node.
     * </p>
     */
    private String nodeName;
    /**
     * <p>
     * Engine attributes that are used for disassociating the node. No attributes are required for Puppet.
     * </p>
     * <p class="title">
     * <b>Attributes required in a DisassociateNode request for Chef</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node was associated. By default only one
     * organization named <code>default</code> can exist.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<EngineAttribute> engineAttributes;

    /**
     * <p>
     * The name of the server from which to disassociate the node.
     * </p>
     * 
     * @param serverName
     *        The name of the server from which to disassociate the node.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server from which to disassociate the node.
     * </p>
     * 
     * @return The name of the server from which to disassociate the node.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server from which to disassociate the node.
     * </p>
     * 
     * @param serverName
     *        The name of the server from which to disassociate the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateNodeRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The name of the client node.
     * </p>
     * 
     * @param nodeName
     *        The name of the client node.
     */

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * <p>
     * The name of the client node.
     * </p>
     * 
     * @return The name of the client node.
     */

    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * <p>
     * The name of the client node.
     * </p>
     * 
     * @param nodeName
     *        The name of the client node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateNodeRequest withNodeName(String nodeName) {
        setNodeName(nodeName);
        return this;
    }

    /**
     * <p>
     * Engine attributes that are used for disassociating the node. No attributes are required for Puppet.
     * </p>
     * <p class="title">
     * <b>Attributes required in a DisassociateNode request for Chef</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node was associated. By default only one
     * organization named <code>default</code> can exist.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Engine attributes that are used for disassociating the node. No attributes are required for Puppet. </p>
     *         <p class="title">
     *         <b>Attributes required in a DisassociateNode request for Chef</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node was associated. By default only
     *         one organization named <code>default</code> can exist.
     *         </p>
     *         </li>
     */

    public java.util.List<EngineAttribute> getEngineAttributes() {
        return engineAttributes;
    }

    /**
     * <p>
     * Engine attributes that are used for disassociating the node. No attributes are required for Puppet.
     * </p>
     * <p class="title">
     * <b>Attributes required in a DisassociateNode request for Chef</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node was associated. By default only one
     * organization named <code>default</code> can exist.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineAttributes
     *        Engine attributes that are used for disassociating the node. No attributes are required for Puppet. </p>
     *        <p class="title">
     *        <b>Attributes required in a DisassociateNode request for Chef</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node was associated. By default only
     *        one organization named <code>default</code> can exist.
     *        </p>
     *        </li>
     */

    public void setEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        if (engineAttributes == null) {
            this.engineAttributes = null;
            return;
        }

        this.engineAttributes = new java.util.ArrayList<EngineAttribute>(engineAttributes);
    }

    /**
     * <p>
     * Engine attributes that are used for disassociating the node. No attributes are required for Puppet.
     * </p>
     * <p class="title">
     * <b>Attributes required in a DisassociateNode request for Chef</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node was associated. By default only one
     * organization named <code>default</code> can exist.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEngineAttributes(java.util.Collection)} or {@link #withEngineAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param engineAttributes
     *        Engine attributes that are used for disassociating the node. No attributes are required for Puppet. </p>
     *        <p class="title">
     *        <b>Attributes required in a DisassociateNode request for Chef</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node was associated. By default only
     *        one organization named <code>default</code> can exist.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateNodeRequest withEngineAttributes(EngineAttribute... engineAttributes) {
        if (this.engineAttributes == null) {
            setEngineAttributes(new java.util.ArrayList<EngineAttribute>(engineAttributes.length));
        }
        for (EngineAttribute ele : engineAttributes) {
            this.engineAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Engine attributes that are used for disassociating the node. No attributes are required for Puppet.
     * </p>
     * <p class="title">
     * <b>Attributes required in a DisassociateNode request for Chef</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node was associated. By default only one
     * organization named <code>default</code> can exist.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineAttributes
     *        Engine attributes that are used for disassociating the node. No attributes are required for Puppet. </p>
     *        <p class="title">
     *        <b>Attributes required in a DisassociateNode request for Chef</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node was associated. By default only
     *        one organization named <code>default</code> can exist.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateNodeRequest withEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        setEngineAttributes(engineAttributes);
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
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getNodeName() != null)
            sb.append("NodeName: ").append(getNodeName()).append(",");
        if (getEngineAttributes() != null)
            sb.append("EngineAttributes: ").append(getEngineAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateNodeRequest == false)
            return false;
        DisassociateNodeRequest other = (DisassociateNodeRequest) obj;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getNodeName() == null ^ this.getNodeName() == null)
            return false;
        if (other.getNodeName() != null && other.getNodeName().equals(this.getNodeName()) == false)
            return false;
        if (other.getEngineAttributes() == null ^ this.getEngineAttributes() == null)
            return false;
        if (other.getEngineAttributes() != null && other.getEngineAttributes().equals(this.getEngineAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getNodeName() == null) ? 0 : getNodeName().hashCode());
        hashCode = prime * hashCode + ((getEngineAttributes() == null) ? 0 : getEngineAttributes().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateNodeRequest clone() {
        return (DisassociateNodeRequest) super.clone();
    }

}

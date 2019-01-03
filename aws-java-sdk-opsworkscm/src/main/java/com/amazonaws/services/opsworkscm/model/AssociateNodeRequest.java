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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/AssociateNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateNodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the server with which to associate the node.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The name of the node.
     * </p>
     */
    private String nodeName;
    /**
     * <p>
     * Engine attributes used for associating the node.
     * </p>
     * <p class="title">
     * <b>Attributes accepted in a AssociateNode request for Chef</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node is associated. By default only one
     * organization named <code>default</code> can exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHEF_NODE_PUBLIC_KEY</code>: A PEM-formatted public key. This key is required for the
     * <code>chef-client</code> agent to access the Chef API.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attributes accepted in a AssociateNode request for Puppet</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUPPET_NODE_CSR</code>: A PEM-formatted certificate-signing request (CSR) that is created by the node.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<EngineAttribute> engineAttributes;

    /**
     * <p>
     * The name of the server with which to associate the node.
     * </p>
     * 
     * @param serverName
     *        The name of the server with which to associate the node.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server with which to associate the node.
     * </p>
     * 
     * @return The name of the server with which to associate the node.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server with which to associate the node.
     * </p>
     * 
     * @param serverName
     *        The name of the server with which to associate the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateNodeRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The name of the node.
     * </p>
     * 
     * @param nodeName
     *        The name of the node.
     */

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * <p>
     * The name of the node.
     * </p>
     * 
     * @return The name of the node.
     */

    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * <p>
     * The name of the node.
     * </p>
     * 
     * @param nodeName
     *        The name of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateNodeRequest withNodeName(String nodeName) {
        setNodeName(nodeName);
        return this;
    }

    /**
     * <p>
     * Engine attributes used for associating the node.
     * </p>
     * <p class="title">
     * <b>Attributes accepted in a AssociateNode request for Chef</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node is associated. By default only one
     * organization named <code>default</code> can exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHEF_NODE_PUBLIC_KEY</code>: A PEM-formatted public key. This key is required for the
     * <code>chef-client</code> agent to access the Chef API.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attributes accepted in a AssociateNode request for Puppet</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUPPET_NODE_CSR</code>: A PEM-formatted certificate-signing request (CSR) that is created by the node.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Engine attributes used for associating the node. </p>
     *         <p class="title">
     *         <b>Attributes accepted in a AssociateNode request for Chef</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node is associated. By default only
     *         one organization named <code>default</code> can exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CHEF_NODE_PUBLIC_KEY</code>: A PEM-formatted public key. This key is required for the
     *         <code>chef-client</code> agent to access the Chef API.
     *         </p>
     *         </li>
     *         </ul>
     *         <p class="title">
     *         <b>Attributes accepted in a AssociateNode request for Puppet</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PUPPET_NODE_CSR</code>: A PEM-formatted certificate-signing request (CSR) that is created by the
     *         node.
     *         </p>
     *         </li>
     */

    public java.util.List<EngineAttribute> getEngineAttributes() {
        return engineAttributes;
    }

    /**
     * <p>
     * Engine attributes used for associating the node.
     * </p>
     * <p class="title">
     * <b>Attributes accepted in a AssociateNode request for Chef</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node is associated. By default only one
     * organization named <code>default</code> can exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHEF_NODE_PUBLIC_KEY</code>: A PEM-formatted public key. This key is required for the
     * <code>chef-client</code> agent to access the Chef API.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attributes accepted in a AssociateNode request for Puppet</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUPPET_NODE_CSR</code>: A PEM-formatted certificate-signing request (CSR) that is created by the node.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineAttributes
     *        Engine attributes used for associating the node. </p>
     *        <p class="title">
     *        <b>Attributes accepted in a AssociateNode request for Chef</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node is associated. By default only
     *        one organization named <code>default</code> can exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CHEF_NODE_PUBLIC_KEY</code>: A PEM-formatted public key. This key is required for the
     *        <code>chef-client</code> agent to access the Chef API.
     *        </p>
     *        </li>
     *        </ul>
     *        <p class="title">
     *        <b>Attributes accepted in a AssociateNode request for Puppet</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUPPET_NODE_CSR</code>: A PEM-formatted certificate-signing request (CSR) that is created by the
     *        node.
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
     * Engine attributes used for associating the node.
     * </p>
     * <p class="title">
     * <b>Attributes accepted in a AssociateNode request for Chef</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node is associated. By default only one
     * organization named <code>default</code> can exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHEF_NODE_PUBLIC_KEY</code>: A PEM-formatted public key. This key is required for the
     * <code>chef-client</code> agent to access the Chef API.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attributes accepted in a AssociateNode request for Puppet</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUPPET_NODE_CSR</code>: A PEM-formatted certificate-signing request (CSR) that is created by the node.
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
     *        Engine attributes used for associating the node. </p>
     *        <p class="title">
     *        <b>Attributes accepted in a AssociateNode request for Chef</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node is associated. By default only
     *        one organization named <code>default</code> can exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CHEF_NODE_PUBLIC_KEY</code>: A PEM-formatted public key. This key is required for the
     *        <code>chef-client</code> agent to access the Chef API.
     *        </p>
     *        </li>
     *        </ul>
     *        <p class="title">
     *        <b>Attributes accepted in a AssociateNode request for Puppet</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUPPET_NODE_CSR</code>: A PEM-formatted certificate-signing request (CSR) that is created by the
     *        node.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateNodeRequest withEngineAttributes(EngineAttribute... engineAttributes) {
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
     * Engine attributes used for associating the node.
     * </p>
     * <p class="title">
     * <b>Attributes accepted in a AssociateNode request for Chef</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node is associated. By default only one
     * organization named <code>default</code> can exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHEF_NODE_PUBLIC_KEY</code>: A PEM-formatted public key. This key is required for the
     * <code>chef-client</code> agent to access the Chef API.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attributes accepted in a AssociateNode request for Puppet</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUPPET_NODE_CSR</code>: A PEM-formatted certificate-signing request (CSR) that is created by the node.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineAttributes
     *        Engine attributes used for associating the node. </p>
     *        <p class="title">
     *        <b>Attributes accepted in a AssociateNode request for Chef</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHEF_ORGANIZATION</code>: The Chef organization with which the node is associated. By default only
     *        one organization named <code>default</code> can exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CHEF_NODE_PUBLIC_KEY</code>: A PEM-formatted public key. This key is required for the
     *        <code>chef-client</code> agent to access the Chef API.
     *        </p>
     *        </li>
     *        </ul>
     *        <p class="title">
     *        <b>Attributes accepted in a AssociateNode request for Puppet</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUPPET_NODE_CSR</code>: A PEM-formatted certificate-signing request (CSR) that is created by the
     *        node.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateNodeRequest withEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
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

        if (obj instanceof AssociateNodeRequest == false)
            return false;
        AssociateNodeRequest other = (AssociateNodeRequest) obj;
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
    public AssociateNodeRequest clone() {
        return (AssociateNodeRequest) super.clone();
    }

}

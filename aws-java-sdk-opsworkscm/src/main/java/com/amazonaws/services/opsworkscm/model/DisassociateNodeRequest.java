/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DisassociateNodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String serverName;

    private String nodeName;

    private java.util.List<EngineAttribute> engineAttributes;

    /**
     * @param serverName
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * @return
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * @param serverName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateNodeRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * @param nodeName
     */

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * @return
     */

    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @param nodeName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateNodeRequest withNodeName(String nodeName) {
        setNodeName(nodeName);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<EngineAttribute> getEngineAttributes() {
        return engineAttributes;
    }

    /**
     * @param engineAttributes
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEngineAttributes(java.util.Collection)} or {@link #withEngineAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param engineAttributes
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
     * @param engineAttributes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateNodeRequest withEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        setEngineAttributes(engineAttributes);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ServerName: " + getServerName() + ",");
        if (getNodeName() != null)
            sb.append("NodeName: " + getNodeName() + ",");
        if (getEngineAttributes() != null)
            sb.append("EngineAttributes: " + getEngineAttributes());
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

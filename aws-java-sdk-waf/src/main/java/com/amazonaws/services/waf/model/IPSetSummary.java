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
package com.amazonaws.services.waf.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the identifier and the name of the <code>IPSet</code>.
 * </p>
 */
public class IPSetSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>IPSetId</code> for an <a>IPSet</a>. You can use <code>IPSetId</code> in a <a>GetIPSet</a> request to
     * get detailed information about an <a>IPSet</a>.
     * </p>
     */
    private String iPSetId;
    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the name of an <code>IPSet</code> after you
     * create it.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The <code>IPSetId</code> for an <a>IPSet</a>. You can use <code>IPSetId</code> in a <a>GetIPSet</a> request to
     * get detailed information about an <a>IPSet</a>.
     * </p>
     * 
     * @param iPSetId
     *        The <code>IPSetId</code> for an <a>IPSet</a>. You can use <code>IPSetId</code> in a <a>GetIPSet</a>
     *        request to get detailed information about an <a>IPSet</a>.
     */

    public void setIPSetId(String iPSetId) {
        this.iPSetId = iPSetId;
    }

    /**
     * <p>
     * The <code>IPSetId</code> for an <a>IPSet</a>. You can use <code>IPSetId</code> in a <a>GetIPSet</a> request to
     * get detailed information about an <a>IPSet</a>.
     * </p>
     * 
     * @return The <code>IPSetId</code> for an <a>IPSet</a>. You can use <code>IPSetId</code> in a <a>GetIPSet</a>
     *         request to get detailed information about an <a>IPSet</a>.
     */

    public String getIPSetId() {
        return this.iPSetId;
    }

    /**
     * <p>
     * The <code>IPSetId</code> for an <a>IPSet</a>. You can use <code>IPSetId</code> in a <a>GetIPSet</a> request to
     * get detailed information about an <a>IPSet</a>.
     * </p>
     * 
     * @param iPSetId
     *        The <code>IPSetId</code> for an <a>IPSet</a>. You can use <code>IPSetId</code> in a <a>GetIPSet</a>
     *        request to get detailed information about an <a>IPSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPSetSummary withIPSetId(String iPSetId) {
        setIPSetId(iPSetId);
        return this;
    }

    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the name of an <code>IPSet</code> after you
     * create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>IPSet</a>. You can't change the name of an <code>IPSet</code>
     *        after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the name of an <code>IPSet</code> after you
     * create it.
     * </p>
     * 
     * @return A friendly name or description of the <a>IPSet</a>. You can't change the name of an <code>IPSet</code>
     *         after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the name of an <code>IPSet</code> after you
     * create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>IPSet</a>. You can't change the name of an <code>IPSet</code>
     *        after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPSetSummary withName(String name) {
        setName(name);
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
        if (getIPSetId() != null)
            sb.append("IPSetId: " + getIPSetId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IPSetSummary == false)
            return false;
        IPSetSummary other = (IPSetSummary) obj;
        if (other.getIPSetId() == null ^ this.getIPSetId() == null)
            return false;
        if (other.getIPSetId() != null && other.getIPSetId().equals(this.getIPSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIPSetId() == null) ? 0 : getIPSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public IPSetSummary clone() {
        try {
            return (IPSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

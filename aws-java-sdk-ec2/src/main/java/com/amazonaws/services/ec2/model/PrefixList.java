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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes prefixes for AWS services.
 * </p>
 */
public class PrefixList implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the prefix.
     * </p>
     */
    private String prefixListId;
    /**
     * <p>
     * The name of the prefix.
     * </p>
     */
    private String prefixListName;
    /**
     * <p>
     * The IP address range of the AWS service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cidrs;

    /**
     * <p>
     * The ID of the prefix.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix.
     */

    public void setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix.
     * </p>
     * 
     * @return The ID of the prefix.
     */

    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefixList withPrefixListId(String prefixListId) {
        setPrefixListId(prefixListId);
        return this;
    }

    /**
     * <p>
     * The name of the prefix.
     * </p>
     * 
     * @param prefixListName
     *        The name of the prefix.
     */

    public void setPrefixListName(String prefixListName) {
        this.prefixListName = prefixListName;
    }

    /**
     * <p>
     * The name of the prefix.
     * </p>
     * 
     * @return The name of the prefix.
     */

    public String getPrefixListName() {
        return this.prefixListName;
    }

    /**
     * <p>
     * The name of the prefix.
     * </p>
     * 
     * @param prefixListName
     *        The name of the prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefixList withPrefixListName(String prefixListName) {
        setPrefixListName(prefixListName);
        return this;
    }

    /**
     * <p>
     * The IP address range of the AWS service.
     * </p>
     * 
     * @return The IP address range of the AWS service.
     */

    public java.util.List<String> getCidrs() {
        if (cidrs == null) {
            cidrs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cidrs;
    }

    /**
     * <p>
     * The IP address range of the AWS service.
     * </p>
     * 
     * @param cidrs
     *        The IP address range of the AWS service.
     */

    public void setCidrs(java.util.Collection<String> cidrs) {
        if (cidrs == null) {
            this.cidrs = null;
            return;
        }

        this.cidrs = new com.amazonaws.internal.SdkInternalList<String>(cidrs);
    }

    /**
     * <p>
     * The IP address range of the AWS service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrs(java.util.Collection)} or {@link #withCidrs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cidrs
     *        The IP address range of the AWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefixList withCidrs(String... cidrs) {
        if (this.cidrs == null) {
            setCidrs(new com.amazonaws.internal.SdkInternalList<String>(cidrs.length));
        }
        for (String ele : cidrs) {
            this.cidrs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP address range of the AWS service.
     * </p>
     * 
     * @param cidrs
     *        The IP address range of the AWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefixList withCidrs(java.util.Collection<String> cidrs) {
        setCidrs(cidrs);
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
        if (getPrefixListId() != null)
            sb.append("PrefixListId: " + getPrefixListId() + ",");
        if (getPrefixListName() != null)
            sb.append("PrefixListName: " + getPrefixListName() + ",");
        if (getCidrs() != null)
            sb.append("Cidrs: " + getCidrs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrefixList == false)
            return false;
        PrefixList other = (PrefixList) obj;
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null)
            return false;
        if (other.getPrefixListId() != null && other.getPrefixListId().equals(this.getPrefixListId()) == false)
            return false;
        if (other.getPrefixListName() == null ^ this.getPrefixListName() == null)
            return false;
        if (other.getPrefixListName() != null && other.getPrefixListName().equals(this.getPrefixListName()) == false)
            return false;
        if (other.getCidrs() == null ^ this.getCidrs() == null)
            return false;
        if (other.getCidrs() != null && other.getCidrs().equals(this.getCidrs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getPrefixListName() == null) ? 0 : getPrefixListName().hashCode());
        hashCode = prime * hashCode + ((getCidrs() == null) ? 0 : getCidrs().hashCode());
        return hashCode;
    }

    @Override
    public PrefixList clone() {
        try {
            return (PrefixList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

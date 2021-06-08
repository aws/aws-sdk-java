/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing the name of a column resource and the tags attached to it.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ColumnLFTag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnLFTag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a column resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The tags attached to a column resource.
     * </p>
     */
    private java.util.List<LFTagPair> lFTags;

    /**
     * <p>
     * The name of a column resource.
     * </p>
     * 
     * @param name
     *        The name of a column resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a column resource.
     * </p>
     * 
     * @return The name of a column resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a column resource.
     * </p>
     * 
     * @param name
     *        The name of a column resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnLFTag withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The tags attached to a column resource.
     * </p>
     * 
     * @return The tags attached to a column resource.
     */

    public java.util.List<LFTagPair> getLFTags() {
        return lFTags;
    }

    /**
     * <p>
     * The tags attached to a column resource.
     * </p>
     * 
     * @param lFTags
     *        The tags attached to a column resource.
     */

    public void setLFTags(java.util.Collection<LFTagPair> lFTags) {
        if (lFTags == null) {
            this.lFTags = null;
            return;
        }

        this.lFTags = new java.util.ArrayList<LFTagPair>(lFTags);
    }

    /**
     * <p>
     * The tags attached to a column resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLFTags(java.util.Collection)} or {@link #withLFTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param lFTags
     *        The tags attached to a column resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnLFTag withLFTags(LFTagPair... lFTags) {
        if (this.lFTags == null) {
            setLFTags(new java.util.ArrayList<LFTagPair>(lFTags.length));
        }
        for (LFTagPair ele : lFTags) {
            this.lFTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags attached to a column resource.
     * </p>
     * 
     * @param lFTags
     *        The tags attached to a column resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnLFTag withLFTags(java.util.Collection<LFTagPair> lFTags) {
        setLFTags(lFTags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLFTags() != null)
            sb.append("LFTags: ").append(getLFTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnLFTag == false)
            return false;
        ColumnLFTag other = (ColumnLFTag) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLFTags() == null ^ this.getLFTags() == null)
            return false;
        if (other.getLFTags() != null && other.getLFTags().equals(this.getLFTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLFTags() == null) ? 0 : getLFTags().hashCode());
        return hashCode;
    }

    @Override
    public ColumnLFTag clone() {
        try {
            return (ColumnLFTag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.ColumnLFTagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to filter the workflow executions in visibility APIs based on a tag.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/TagFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the tag that must be associated with the execution for it to meet the filter criteria.
     * </p>
     */
    private String tag;

    /**
     * <p>
     * Specifies the tag that must be associated with the execution for it to meet the filter criteria.
     * </p>
     * 
     * @param tag
     *        Specifies the tag that must be associated with the execution for it to meet the filter criteria.
     */

    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * <p>
     * Specifies the tag that must be associated with the execution for it to meet the filter criteria.
     * </p>
     * 
     * @return Specifies the tag that must be associated with the execution for it to meet the filter criteria.
     */

    public String getTag() {
        return this.tag;
    }

    /**
     * <p>
     * Specifies the tag that must be associated with the execution for it to meet the filter criteria.
     * </p>
     * 
     * @param tag
     *        Specifies the tag that must be associated with the execution for it to meet the filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagFilter withTag(String tag) {
        setTag(tag);
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
        if (getTag() != null)
            sb.append("Tag: ").append(getTag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagFilter == false)
            return false;
        TagFilter other = (TagFilter) obj;
        if (other.getTag() == null ^ this.getTag() == null)
            return false;
        if (other.getTag() != null && other.getTag().equals(this.getTag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTag() == null) ? 0 : getTag().hashCode());
        return hashCode;
    }

    @Override
    public TagFilter clone() {
        try {
            return (TagFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.TagFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

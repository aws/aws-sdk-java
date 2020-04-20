/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/TagrisSweepListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagrisSweepListItem implements Serializable, Cloneable, StructuredPojo {

    private String tagrisAccountId;

    private String tagrisAmazonResourceName;

    private String tagrisInternalId;

    private Long tagrisVersion;

    /**
     * @param tagrisAccountId
     */

    public void setTagrisAccountId(String tagrisAccountId) {
        this.tagrisAccountId = tagrisAccountId;
    }

    /**
     * @return
     */

    public String getTagrisAccountId() {
        return this.tagrisAccountId;
    }

    /**
     * @param tagrisAccountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagrisSweepListItem withTagrisAccountId(String tagrisAccountId) {
        setTagrisAccountId(tagrisAccountId);
        return this;
    }

    /**
     * @param tagrisAmazonResourceName
     */

    public void setTagrisAmazonResourceName(String tagrisAmazonResourceName) {
        this.tagrisAmazonResourceName = tagrisAmazonResourceName;
    }

    /**
     * @return
     */

    public String getTagrisAmazonResourceName() {
        return this.tagrisAmazonResourceName;
    }

    /**
     * @param tagrisAmazonResourceName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagrisSweepListItem withTagrisAmazonResourceName(String tagrisAmazonResourceName) {
        setTagrisAmazonResourceName(tagrisAmazonResourceName);
        return this;
    }

    /**
     * @param tagrisInternalId
     */

    public void setTagrisInternalId(String tagrisInternalId) {
        this.tagrisInternalId = tagrisInternalId;
    }

    /**
     * @return
     */

    public String getTagrisInternalId() {
        return this.tagrisInternalId;
    }

    /**
     * @param tagrisInternalId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagrisSweepListItem withTagrisInternalId(String tagrisInternalId) {
        setTagrisInternalId(tagrisInternalId);
        return this;
    }

    /**
     * @param tagrisVersion
     */

    public void setTagrisVersion(Long tagrisVersion) {
        this.tagrisVersion = tagrisVersion;
    }

    /**
     * @return
     */

    public Long getTagrisVersion() {
        return this.tagrisVersion;
    }

    /**
     * @param tagrisVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagrisSweepListItem withTagrisVersion(Long tagrisVersion) {
        setTagrisVersion(tagrisVersion);
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
        if (getTagrisAccountId() != null)
            sb.append("TagrisAccountId: ").append(getTagrisAccountId()).append(",");
        if (getTagrisAmazonResourceName() != null)
            sb.append("TagrisAmazonResourceName: ").append(getTagrisAmazonResourceName()).append(",");
        if (getTagrisInternalId() != null)
            sb.append("TagrisInternalId: ").append(getTagrisInternalId()).append(",");
        if (getTagrisVersion() != null)
            sb.append("TagrisVersion: ").append(getTagrisVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagrisSweepListItem == false)
            return false;
        TagrisSweepListItem other = (TagrisSweepListItem) obj;
        if (other.getTagrisAccountId() == null ^ this.getTagrisAccountId() == null)
            return false;
        if (other.getTagrisAccountId() != null && other.getTagrisAccountId().equals(this.getTagrisAccountId()) == false)
            return false;
        if (other.getTagrisAmazonResourceName() == null ^ this.getTagrisAmazonResourceName() == null)
            return false;
        if (other.getTagrisAmazonResourceName() != null && other.getTagrisAmazonResourceName().equals(this.getTagrisAmazonResourceName()) == false)
            return false;
        if (other.getTagrisInternalId() == null ^ this.getTagrisInternalId() == null)
            return false;
        if (other.getTagrisInternalId() != null && other.getTagrisInternalId().equals(this.getTagrisInternalId()) == false)
            return false;
        if (other.getTagrisVersion() == null ^ this.getTagrisVersion() == null)
            return false;
        if (other.getTagrisVersion() != null && other.getTagrisVersion().equals(this.getTagrisVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagrisAccountId() == null) ? 0 : getTagrisAccountId().hashCode());
        hashCode = prime * hashCode + ((getTagrisAmazonResourceName() == null) ? 0 : getTagrisAmazonResourceName().hashCode());
        hashCode = prime * hashCode + ((getTagrisInternalId() == null) ? 0 : getTagrisInternalId().hashCode());
        hashCode = prime * hashCode + ((getTagrisVersion() == null) ? 0 : getTagrisVersion().hashCode());
        return hashCode;
    }

    @Override
    public TagrisSweepListItem clone() {
        try {
            return (TagrisSweepListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.TagrisSweepListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

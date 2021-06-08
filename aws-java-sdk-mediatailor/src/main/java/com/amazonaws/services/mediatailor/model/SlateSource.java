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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Slate VOD source configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/SlateSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlateSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the source location where the slate VOD source is stored.
     * </p>
     */
    private String sourceLocationName;
    /**
     * <p>
     * The slate VOD source name. The VOD source must already exist in a source location before it can be used for
     * slate.
     * </p>
     */
    private String vodSourceName;

    /**
     * <p>
     * The name of the source location where the slate VOD source is stored.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location where the slate VOD source is stored.
     */

    public void setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location where the slate VOD source is stored.
     * </p>
     * 
     * @return The name of the source location where the slate VOD source is stored.
     */

    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location where the slate VOD source is stored.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location where the slate VOD source is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlateSource withSourceLocationName(String sourceLocationName) {
        setSourceLocationName(sourceLocationName);
        return this;
    }

    /**
     * <p>
     * The slate VOD source name. The VOD source must already exist in a source location before it can be used for
     * slate.
     * </p>
     * 
     * @param vodSourceName
     *        The slate VOD source name. The VOD source must already exist in a source location before it can be used
     *        for slate.
     */

    public void setVodSourceName(String vodSourceName) {
        this.vodSourceName = vodSourceName;
    }

    /**
     * <p>
     * The slate VOD source name. The VOD source must already exist in a source location before it can be used for
     * slate.
     * </p>
     * 
     * @return The slate VOD source name. The VOD source must already exist in a source location before it can be used
     *         for slate.
     */

    public String getVodSourceName() {
        return this.vodSourceName;
    }

    /**
     * <p>
     * The slate VOD source name. The VOD source must already exist in a source location before it can be used for
     * slate.
     * </p>
     * 
     * @param vodSourceName
     *        The slate VOD source name. The VOD source must already exist in a source location before it can be used
     *        for slate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlateSource withVodSourceName(String vodSourceName) {
        setVodSourceName(vodSourceName);
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
        if (getSourceLocationName() != null)
            sb.append("SourceLocationName: ").append(getSourceLocationName()).append(",");
        if (getVodSourceName() != null)
            sb.append("VodSourceName: ").append(getVodSourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlateSource == false)
            return false;
        SlateSource other = (SlateSource) obj;
        if (other.getSourceLocationName() == null ^ this.getSourceLocationName() == null)
            return false;
        if (other.getSourceLocationName() != null && other.getSourceLocationName().equals(this.getSourceLocationName()) == false)
            return false;
        if (other.getVodSourceName() == null ^ this.getVodSourceName() == null)
            return false;
        if (other.getVodSourceName() != null && other.getVodSourceName().equals(this.getVodSourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceLocationName() == null) ? 0 : getSourceLocationName().hashCode());
        hashCode = prime * hashCode + ((getVodSourceName() == null) ? 0 : getVodSourceName().hashCode());
        return hashCode;
    }

    @Override
    public SlateSource clone() {
        try {
            return (SlateSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.SlateSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of what related item data is published through the case event stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/RelatedItemEventIncludedData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelatedItemEventIncludedData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details of what related item data is published through the case event stream.
     * </p>
     */
    private Boolean includeContent;

    /**
     * <p>
     * Details of what related item data is published through the case event stream.
     * </p>
     * 
     * @param includeContent
     *        Details of what related item data is published through the case event stream.
     */

    public void setIncludeContent(Boolean includeContent) {
        this.includeContent = includeContent;
    }

    /**
     * <p>
     * Details of what related item data is published through the case event stream.
     * </p>
     * 
     * @return Details of what related item data is published through the case event stream.
     */

    public Boolean getIncludeContent() {
        return this.includeContent;
    }

    /**
     * <p>
     * Details of what related item data is published through the case event stream.
     * </p>
     * 
     * @param includeContent
     *        Details of what related item data is published through the case event stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedItemEventIncludedData withIncludeContent(Boolean includeContent) {
        setIncludeContent(includeContent);
        return this;
    }

    /**
     * <p>
     * Details of what related item data is published through the case event stream.
     * </p>
     * 
     * @return Details of what related item data is published through the case event stream.
     */

    public Boolean isIncludeContent() {
        return this.includeContent;
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
        if (getIncludeContent() != null)
            sb.append("IncludeContent: ").append(getIncludeContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelatedItemEventIncludedData == false)
            return false;
        RelatedItemEventIncludedData other = (RelatedItemEventIncludedData) obj;
        if (other.getIncludeContent() == null ^ this.getIncludeContent() == null)
            return false;
        if (other.getIncludeContent() != null && other.getIncludeContent().equals(this.getIncludeContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludeContent() == null) ? 0 : getIncludeContent().hashCode());
        return hashCode;
    }

    @Override
    public RelatedItemEventIncludedData clone() {
        try {
            return (RelatedItemEventIncludedData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.RelatedItemEventIncludedDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

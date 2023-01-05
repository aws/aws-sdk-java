/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Array of the number of characters extracted from each page.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ExtractedCharactersListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExtractedCharactersListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Page number.
     * </p>
     */
    private Integer page;
    /**
     * <p>
     * Number of characters extracted from each page.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * Page number.
     * </p>
     * 
     * @param page
     *        Page number.
     */

    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * <p>
     * Page number.
     * </p>
     * 
     * @return Page number.
     */

    public Integer getPage() {
        return this.page;
    }

    /**
     * <p>
     * Page number.
     * </p>
     * 
     * @param page
     *        Page number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtractedCharactersListItem withPage(Integer page) {
        setPage(page);
        return this;
    }

    /**
     * <p>
     * Number of characters extracted from each page.
     * </p>
     * 
     * @param count
     *        Number of characters extracted from each page.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * Number of characters extracted from each page.
     * </p>
     * 
     * @return Number of characters extracted from each page.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * Number of characters extracted from each page.
     * </p>
     * 
     * @param count
     *        Number of characters extracted from each page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtractedCharactersListItem withCount(Integer count) {
        setCount(count);
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
        if (getPage() != null)
            sb.append("Page: ").append(getPage()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExtractedCharactersListItem == false)
            return false;
        ExtractedCharactersListItem other = (ExtractedCharactersListItem) obj;
        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public ExtractedCharactersListItem clone() {
        try {
            return (ExtractedCharactersListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.ExtractedCharactersListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

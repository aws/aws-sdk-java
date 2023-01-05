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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetContentSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContentSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The content summary.
     * </p>
     */
    private ContentSummary contentSummary;

    /**
     * <p>
     * The content summary.
     * </p>
     * 
     * @param contentSummary
     *        The content summary.
     */

    public void setContentSummary(ContentSummary contentSummary) {
        this.contentSummary = contentSummary;
    }

    /**
     * <p>
     * The content summary.
     * </p>
     * 
     * @return The content summary.
     */

    public ContentSummary getContentSummary() {
        return this.contentSummary;
    }

    /**
     * <p>
     * The content summary.
     * </p>
     * 
     * @param contentSummary
     *        The content summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentSummaryResult withContentSummary(ContentSummary contentSummary) {
        setContentSummary(contentSummary);
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
        if (getContentSummary() != null)
            sb.append("ContentSummary: ").append(getContentSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContentSummaryResult == false)
            return false;
        GetContentSummaryResult other = (GetContentSummaryResult) obj;
        if (other.getContentSummary() == null ^ this.getContentSummary() == null)
            return false;
        if (other.getContentSummary() != null && other.getContentSummary().equals(this.getContentSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentSummary() == null) ? 0 : getContentSummary().hashCode());
        return hashCode;
    }

    @Override
    public GetContentSummaryResult clone() {
        try {
            return (GetContentSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

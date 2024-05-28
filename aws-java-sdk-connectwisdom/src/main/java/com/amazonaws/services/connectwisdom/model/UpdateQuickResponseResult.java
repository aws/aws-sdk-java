/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UpdateQuickResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateQuickResponseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The quick response.
     * </p>
     */
    private QuickResponseData quickResponse;

    /**
     * <p>
     * The quick response.
     * </p>
     * 
     * @param quickResponse
     *        The quick response.
     */

    public void setQuickResponse(QuickResponseData quickResponse) {
        this.quickResponse = quickResponse;
    }

    /**
     * <p>
     * The quick response.
     * </p>
     * 
     * @return The quick response.
     */

    public QuickResponseData getQuickResponse() {
        return this.quickResponse;
    }

    /**
     * <p>
     * The quick response.
     * </p>
     * 
     * @param quickResponse
     *        The quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickResponseResult withQuickResponse(QuickResponseData quickResponse) {
        setQuickResponse(quickResponse);
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
        if (getQuickResponse() != null)
            sb.append("QuickResponse: ").append(getQuickResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateQuickResponseResult == false)
            return false;
        UpdateQuickResponseResult other = (UpdateQuickResponseResult) obj;
        if (other.getQuickResponse() == null ^ this.getQuickResponse() == null)
            return false;
        if (other.getQuickResponse() != null && other.getQuickResponse().equals(this.getQuickResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuickResponse() == null) ? 0 : getQuickResponse().hashCode());
        return hashCode;
    }

    @Override
    public UpdateQuickResponseResult clone() {
        try {
            return (UpdateQuickResponseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

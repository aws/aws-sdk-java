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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ListTemplateVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTemplateVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private TemplateVersionsResponse templateVersionsResponse;

    /**
     * @param templateVersionsResponse
     */

    public void setTemplateVersionsResponse(TemplateVersionsResponse templateVersionsResponse) {
        this.templateVersionsResponse = templateVersionsResponse;
    }

    /**
     * @return
     */

    public TemplateVersionsResponse getTemplateVersionsResponse() {
        return this.templateVersionsResponse;
    }

    /**
     * @param templateVersionsResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateVersionsResult withTemplateVersionsResponse(TemplateVersionsResponse templateVersionsResponse) {
        setTemplateVersionsResponse(templateVersionsResponse);
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
        if (getTemplateVersionsResponse() != null)
            sb.append("TemplateVersionsResponse: ").append(getTemplateVersionsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTemplateVersionsResult == false)
            return false;
        ListTemplateVersionsResult other = (ListTemplateVersionsResult) obj;
        if (other.getTemplateVersionsResponse() == null ^ this.getTemplateVersionsResponse() == null)
            return false;
        if (other.getTemplateVersionsResponse() != null && other.getTemplateVersionsResponse().equals(this.getTemplateVersionsResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateVersionsResponse() == null) ? 0 : getTemplateVersionsResponse().hashCode());
        return hashCode;
    }

    @Override
    public ListTemplateVersionsResult clone() {
        try {
            return (ListTemplateVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

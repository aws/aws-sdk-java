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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/CreateExclusionsPreview" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExclusionsPreviewResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the unique identifier of the requested exclusions preview. You can use the unique identifier to
     * retrieve the exclusions preview when running the GetExclusionsPreview API.
     * </p>
     */
    private String previewToken;

    /**
     * <p>
     * Specifies the unique identifier of the requested exclusions preview. You can use the unique identifier to
     * retrieve the exclusions preview when running the GetExclusionsPreview API.
     * </p>
     * 
     * @param previewToken
     *        Specifies the unique identifier of the requested exclusions preview. You can use the unique identifier to
     *        retrieve the exclusions preview when running the GetExclusionsPreview API.
     */

    public void setPreviewToken(String previewToken) {
        this.previewToken = previewToken;
    }

    /**
     * <p>
     * Specifies the unique identifier of the requested exclusions preview. You can use the unique identifier to
     * retrieve the exclusions preview when running the GetExclusionsPreview API.
     * </p>
     * 
     * @return Specifies the unique identifier of the requested exclusions preview. You can use the unique identifier to
     *         retrieve the exclusions preview when running the GetExclusionsPreview API.
     */

    public String getPreviewToken() {
        return this.previewToken;
    }

    /**
     * <p>
     * Specifies the unique identifier of the requested exclusions preview. You can use the unique identifier to
     * retrieve the exclusions preview when running the GetExclusionsPreview API.
     * </p>
     * 
     * @param previewToken
     *        Specifies the unique identifier of the requested exclusions preview. You can use the unique identifier to
     *        retrieve the exclusions preview when running the GetExclusionsPreview API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExclusionsPreviewResult withPreviewToken(String previewToken) {
        setPreviewToken(previewToken);
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
        if (getPreviewToken() != null)
            sb.append("PreviewToken: ").append(getPreviewToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExclusionsPreviewResult == false)
            return false;
        CreateExclusionsPreviewResult other = (CreateExclusionsPreviewResult) obj;
        if (other.getPreviewToken() == null ^ this.getPreviewToken() == null)
            return false;
        if (other.getPreviewToken() != null && other.getPreviewToken().equals(this.getPreviewToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreviewToken() == null) ? 0 : getPreviewToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateExclusionsPreviewResult clone() {
        try {
            return (CreateExclusionsPreviewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

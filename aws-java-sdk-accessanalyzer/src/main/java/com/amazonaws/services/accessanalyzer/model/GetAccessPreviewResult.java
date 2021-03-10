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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetAccessPreview" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessPreviewResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains information about the access preview.
     * </p>
     */
    private AccessPreview accessPreview;

    /**
     * <p>
     * An object that contains information about the access preview.
     * </p>
     * 
     * @param accessPreview
     *        An object that contains information about the access preview.
     */

    public void setAccessPreview(AccessPreview accessPreview) {
        this.accessPreview = accessPreview;
    }

    /**
     * <p>
     * An object that contains information about the access preview.
     * </p>
     * 
     * @return An object that contains information about the access preview.
     */

    public AccessPreview getAccessPreview() {
        return this.accessPreview;
    }

    /**
     * <p>
     * An object that contains information about the access preview.
     * </p>
     * 
     * @param accessPreview
     *        An object that contains information about the access preview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessPreviewResult withAccessPreview(AccessPreview accessPreview) {
        setAccessPreview(accessPreview);
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
        if (getAccessPreview() != null)
            sb.append("AccessPreview: ").append(getAccessPreview());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessPreviewResult == false)
            return false;
        GetAccessPreviewResult other = (GetAccessPreviewResult) obj;
        if (other.getAccessPreview() == null ^ this.getAccessPreview() == null)
            return false;
        if (other.getAccessPreview() != null && other.getAccessPreview().equals(this.getAccessPreview()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPreview() == null) ? 0 : getAccessPreview().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessPreviewResult clone() {
        try {
            return (GetAccessPreviewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

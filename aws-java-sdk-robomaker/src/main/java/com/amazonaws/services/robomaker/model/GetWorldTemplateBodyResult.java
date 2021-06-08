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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/GetWorldTemplateBody" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorldTemplateBodyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The world template body.
     * </p>
     */
    private String templateBody;

    /**
     * <p>
     * The world template body.
     * </p>
     * 
     * @param templateBody
     *        The world template body.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The world template body.
     * </p>
     * 
     * @return The world template body.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * The world template body.
     * </p>
     * 
     * @param templateBody
     *        The world template body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorldTemplateBodyResult withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
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
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorldTemplateBodyResult == false)
            return false;
        GetWorldTemplateBodyResult other = (GetWorldTemplateBodyResult) obj;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        return hashCode;
    }

    @Override
    public GetWorldTemplateBodyResult clone() {
        try {
            return (GetWorldTemplateBodyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

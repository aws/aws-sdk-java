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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/GetForm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFormResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Represents the configuration settings for the form.
     * </p>
     */
    private Form form;

    /**
     * <p>
     * Represents the configuration settings for the form.
     * </p>
     * 
     * @param form
     *        Represents the configuration settings for the form.
     */

    public void setForm(Form form) {
        this.form = form;
    }

    /**
     * <p>
     * Represents the configuration settings for the form.
     * </p>
     * 
     * @return Represents the configuration settings for the form.
     */

    public Form getForm() {
        return this.form;
    }

    /**
     * <p>
     * Represents the configuration settings for the form.
     * </p>
     * 
     * @param form
     *        Represents the configuration settings for the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFormResult withForm(Form form) {
        setForm(form);
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
        if (getForm() != null)
            sb.append("Form: ").append(getForm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFormResult == false)
            return false;
        GetFormResult other = (GetFormResult) obj;
        if (other.getForm() == null ^ this.getForm() == null)
            return false;
        if (other.getForm() != null && other.getForm().equals(this.getForm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForm() == null) ? 0 : getForm().hashCode());
        return hashCode;
    }

    @Override
    public GetFormResult clone() {
        try {
            return (GetFormResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/UpdateView" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateViewResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the view that you changed with this operation.
     * </p>
     */
    private View view;

    /**
     * <p>
     * Details about the view that you changed with this operation.
     * </p>
     * 
     * @param view
     *        Details about the view that you changed with this operation.
     */

    public void setView(View view) {
        this.view = view;
    }

    /**
     * <p>
     * Details about the view that you changed with this operation.
     * </p>
     * 
     * @return Details about the view that you changed with this operation.
     */

    public View getView() {
        return this.view;
    }

    /**
     * <p>
     * Details about the view that you changed with this operation.
     * </p>
     * 
     * @param view
     *        Details about the view that you changed with this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateViewResult withView(View view) {
        setView(view);
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
        if (getView() != null)
            sb.append("View: ").append(getView());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateViewResult == false)
            return false;
        UpdateViewResult other = (UpdateViewResult) obj;
        if (other.getView() == null ^ this.getView() == null)
            return false;
        if (other.getView() != null && other.getView().equals(this.getView()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getView() == null) ? 0 : getView().hashCode());
        return hashCode;
    }

    @Override
    public UpdateViewResult clone() {
        try {
            return (UpdateViewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

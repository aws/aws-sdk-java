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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateLayout" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLayoutResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the newly created layout.
     * </p>
     */
    private String layoutArn;
    /**
     * <p>
     * The unique identifier of the layout.
     * </p>
     */
    private String layoutId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the newly created layout.
     * </p>
     * 
     * @param layoutArn
     *        The Amazon Resource Name (ARN) of the newly created layout.
     */

    public void setLayoutArn(String layoutArn) {
        this.layoutArn = layoutArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the newly created layout.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the newly created layout.
     */

    public String getLayoutArn() {
        return this.layoutArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the newly created layout.
     * </p>
     * 
     * @param layoutArn
     *        The Amazon Resource Name (ARN) of the newly created layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLayoutResult withLayoutArn(String layoutArn) {
        setLayoutArn(layoutArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the layout.
     * </p>
     * 
     * @param layoutId
     *        The unique identifier of the layout.
     */

    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    /**
     * <p>
     * The unique identifier of the layout.
     * </p>
     * 
     * @return The unique identifier of the layout.
     */

    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * <p>
     * The unique identifier of the layout.
     * </p>
     * 
     * @param layoutId
     *        The unique identifier of the layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLayoutResult withLayoutId(String layoutId) {
        setLayoutId(layoutId);
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
        if (getLayoutArn() != null)
            sb.append("LayoutArn: ").append(getLayoutArn()).append(",");
        if (getLayoutId() != null)
            sb.append("LayoutId: ").append(getLayoutId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLayoutResult == false)
            return false;
        CreateLayoutResult other = (CreateLayoutResult) obj;
        if (other.getLayoutArn() == null ^ this.getLayoutArn() == null)
            return false;
        if (other.getLayoutArn() != null && other.getLayoutArn().equals(this.getLayoutArn()) == false)
            return false;
        if (other.getLayoutId() == null ^ this.getLayoutId() == null)
            return false;
        if (other.getLayoutId() != null && other.getLayoutId().equals(this.getLayoutId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayoutArn() == null) ? 0 : getLayoutArn().hashCode());
        hashCode = prime * hashCode + ((getLayoutId() == null) ? 0 : getLayoutId().hashCode());
        return hashCode;
    }

    @Override
    public CreateLayoutResult clone() {
        try {
            return (CreateLayoutResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

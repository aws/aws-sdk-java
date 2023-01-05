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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateRelatedItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRelatedItemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related item.
     * </p>
     */
    private String relatedItemArn;
    /**
     * <p>
     * The unique identifier of the related item.
     * </p>
     */
    private String relatedItemId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related item.
     * </p>
     * 
     * @param relatedItemArn
     *        The Amazon Resource Name (ARN) of the related item.
     */

    public void setRelatedItemArn(String relatedItemArn) {
        this.relatedItemArn = relatedItemArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related item.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the related item.
     */

    public String getRelatedItemArn() {
        return this.relatedItemArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related item.
     * </p>
     * 
     * @param relatedItemArn
     *        The Amazon Resource Name (ARN) of the related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelatedItemResult withRelatedItemArn(String relatedItemArn) {
        setRelatedItemArn(relatedItemArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the related item.
     * </p>
     * 
     * @param relatedItemId
     *        The unique identifier of the related item.
     */

    public void setRelatedItemId(String relatedItemId) {
        this.relatedItemId = relatedItemId;
    }

    /**
     * <p>
     * The unique identifier of the related item.
     * </p>
     * 
     * @return The unique identifier of the related item.
     */

    public String getRelatedItemId() {
        return this.relatedItemId;
    }

    /**
     * <p>
     * The unique identifier of the related item.
     * </p>
     * 
     * @param relatedItemId
     *        The unique identifier of the related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelatedItemResult withRelatedItemId(String relatedItemId) {
        setRelatedItemId(relatedItemId);
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
        if (getRelatedItemArn() != null)
            sb.append("RelatedItemArn: ").append(getRelatedItemArn()).append(",");
        if (getRelatedItemId() != null)
            sb.append("RelatedItemId: ").append(getRelatedItemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRelatedItemResult == false)
            return false;
        CreateRelatedItemResult other = (CreateRelatedItemResult) obj;
        if (other.getRelatedItemArn() == null ^ this.getRelatedItemArn() == null)
            return false;
        if (other.getRelatedItemArn() != null && other.getRelatedItemArn().equals(this.getRelatedItemArn()) == false)
            return false;
        if (other.getRelatedItemId() == null ^ this.getRelatedItemId() == null)
            return false;
        if (other.getRelatedItemId() != null && other.getRelatedItemId().equals(this.getRelatedItemId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelatedItemArn() == null) ? 0 : getRelatedItemArn().hashCode());
        hashCode = prime * hashCode + ((getRelatedItemId() == null) ? 0 : getRelatedItemId().hashCode());
        return hashCode;
    }

    @Override
    public CreateRelatedItemResult clone() {
        try {
            return (CreateRelatedItemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

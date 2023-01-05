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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/BatchAssociateResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAssociateResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the resource set, used in a TODO to refer to the resource set.
     * </p>
     */
    private String resourceSetIdentifier;
    /**
     * <p>
     * The resources that failed to associate to the resource set.
     * </p>
     */
    private java.util.List<FailedItem> failedItems;

    /**
     * <p>
     * A unique identifier for the resource set, used in a TODO to refer to the resource set.
     * </p>
     * 
     * @param resourceSetIdentifier
     *        A unique identifier for the resource set, used in a TODO to refer to the resource set.
     */

    public void setResourceSetIdentifier(String resourceSetIdentifier) {
        this.resourceSetIdentifier = resourceSetIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the resource set, used in a TODO to refer to the resource set.
     * </p>
     * 
     * @return A unique identifier for the resource set, used in a TODO to refer to the resource set.
     */

    public String getResourceSetIdentifier() {
        return this.resourceSetIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the resource set, used in a TODO to refer to the resource set.
     * </p>
     * 
     * @param resourceSetIdentifier
     *        A unique identifier for the resource set, used in a TODO to refer to the resource set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateResourceResult withResourceSetIdentifier(String resourceSetIdentifier) {
        setResourceSetIdentifier(resourceSetIdentifier);
        return this;
    }

    /**
     * <p>
     * The resources that failed to associate to the resource set.
     * </p>
     * 
     * @return The resources that failed to associate to the resource set.
     */

    public java.util.List<FailedItem> getFailedItems() {
        return failedItems;
    }

    /**
     * <p>
     * The resources that failed to associate to the resource set.
     * </p>
     * 
     * @param failedItems
     *        The resources that failed to associate to the resource set.
     */

    public void setFailedItems(java.util.Collection<FailedItem> failedItems) {
        if (failedItems == null) {
            this.failedItems = null;
            return;
        }

        this.failedItems = new java.util.ArrayList<FailedItem>(failedItems);
    }

    /**
     * <p>
     * The resources that failed to associate to the resource set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedItems(java.util.Collection)} or {@link #withFailedItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param failedItems
     *        The resources that failed to associate to the resource set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateResourceResult withFailedItems(FailedItem... failedItems) {
        if (this.failedItems == null) {
            setFailedItems(new java.util.ArrayList<FailedItem>(failedItems.length));
        }
        for (FailedItem ele : failedItems) {
            this.failedItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources that failed to associate to the resource set.
     * </p>
     * 
     * @param failedItems
     *        The resources that failed to associate to the resource set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateResourceResult withFailedItems(java.util.Collection<FailedItem> failedItems) {
        setFailedItems(failedItems);
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
        if (getResourceSetIdentifier() != null)
            sb.append("ResourceSetIdentifier: ").append(getResourceSetIdentifier()).append(",");
        if (getFailedItems() != null)
            sb.append("FailedItems: ").append(getFailedItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAssociateResourceResult == false)
            return false;
        BatchAssociateResourceResult other = (BatchAssociateResourceResult) obj;
        if (other.getResourceSetIdentifier() == null ^ this.getResourceSetIdentifier() == null)
            return false;
        if (other.getResourceSetIdentifier() != null && other.getResourceSetIdentifier().equals(this.getResourceSetIdentifier()) == false)
            return false;
        if (other.getFailedItems() == null ^ this.getFailedItems() == null)
            return false;
        if (other.getFailedItems() != null && other.getFailedItems().equals(this.getFailedItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceSetIdentifier() == null) ? 0 : getResourceSetIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFailedItems() == null) ? 0 : getFailedItems().hashCode());
        return hashCode;
    }

    @Override
    public BatchAssociateResourceResult clone() {
        try {
            return (BatchAssociateResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

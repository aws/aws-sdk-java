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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartAssociationsOnce" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartAssociationsOnceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The association IDs that you want to run immediately and only one time.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> associationIds;

    /**
     * <p>
     * The association IDs that you want to run immediately and only one time.
     * </p>
     * 
     * @return The association IDs that you want to run immediately and only one time.
     */

    public java.util.List<String> getAssociationIds() {
        if (associationIds == null) {
            associationIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return associationIds;
    }

    /**
     * <p>
     * The association IDs that you want to run immediately and only one time.
     * </p>
     * 
     * @param associationIds
     *        The association IDs that you want to run immediately and only one time.
     */

    public void setAssociationIds(java.util.Collection<String> associationIds) {
        if (associationIds == null) {
            this.associationIds = null;
            return;
        }

        this.associationIds = new com.amazonaws.internal.SdkInternalList<String>(associationIds);
    }

    /**
     * <p>
     * The association IDs that you want to run immediately and only one time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociationIds(java.util.Collection)} or {@link #withAssociationIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param associationIds
     *        The association IDs that you want to run immediately and only one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssociationsOnceRequest withAssociationIds(String... associationIds) {
        if (this.associationIds == null) {
            setAssociationIds(new com.amazonaws.internal.SdkInternalList<String>(associationIds.length));
        }
        for (String ele : associationIds) {
            this.associationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The association IDs that you want to run immediately and only one time.
     * </p>
     * 
     * @param associationIds
     *        The association IDs that you want to run immediately and only one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssociationsOnceRequest withAssociationIds(java.util.Collection<String> associationIds) {
        setAssociationIds(associationIds);
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
        if (getAssociationIds() != null)
            sb.append("AssociationIds: ").append(getAssociationIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAssociationsOnceRequest == false)
            return false;
        StartAssociationsOnceRequest other = (StartAssociationsOnceRequest) obj;
        if (other.getAssociationIds() == null ^ this.getAssociationIds() == null)
            return false;
        if (other.getAssociationIds() != null && other.getAssociationIds().equals(this.getAssociationIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationIds() == null) ? 0 : getAssociationIds().hashCode());
        return hashCode;
    }

    @Override
    public StartAssociationsOnceRequest clone() {
        return (StartAssociationsOnceRequest) super.clone();
    }

}

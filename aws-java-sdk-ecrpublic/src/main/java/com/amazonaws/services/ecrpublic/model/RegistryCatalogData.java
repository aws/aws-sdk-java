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
package com.amazonaws.services.ecrpublic.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata for a public registry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/RegistryCatalogData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistryCatalogData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The display name for a public registry. This appears on the Amazon ECR Public Gallery.
     * </p>
     * <important>
     * <p>
     * Only accounts that have the verified account badge can have a registry display name.
     * </p>
     * </important>
     */
    private String displayName;

    /**
     * <p>
     * The display name for a public registry. This appears on the Amazon ECR Public Gallery.
     * </p>
     * <important>
     * <p>
     * Only accounts that have the verified account badge can have a registry display name.
     * </p>
     * </important>
     * 
     * @param displayName
     *        The display name for a public registry. This appears on the Amazon ECR Public Gallery.</p> <important>
     *        <p>
     *        Only accounts that have the verified account badge can have a registry display name.
     *        </p>
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name for a public registry. This appears on the Amazon ECR Public Gallery.
     * </p>
     * <important>
     * <p>
     * Only accounts that have the verified account badge can have a registry display name.
     * </p>
     * </important>
     * 
     * @return The display name for a public registry. This appears on the Amazon ECR Public Gallery.</p> <important>
     *         <p>
     *         Only accounts that have the verified account badge can have a registry display name.
     *         </p>
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name for a public registry. This appears on the Amazon ECR Public Gallery.
     * </p>
     * <important>
     * <p>
     * Only accounts that have the verified account badge can have a registry display name.
     * </p>
     * </important>
     * 
     * @param displayName
     *        The display name for a public registry. This appears on the Amazon ECR Public Gallery.</p> <important>
     *        <p>
     *        Only accounts that have the verified account badge can have a registry display name.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistryCatalogData withDisplayName(String displayName) {
        setDisplayName(displayName);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegistryCatalogData == false)
            return false;
        RegistryCatalogData other = (RegistryCatalogData) obj;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public RegistryCatalogData clone() {
        try {
            return (RegistryCatalogData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecrpublic.model.transform.RegistryCatalogDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

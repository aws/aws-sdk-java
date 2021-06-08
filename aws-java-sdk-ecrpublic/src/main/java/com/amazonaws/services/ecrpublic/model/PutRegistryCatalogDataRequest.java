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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/PutRegistryCatalogData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRegistryCatalogDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The display name for a public registry. The display name is shown as the repository author in the Amazon ECR
     * Public Gallery.
     * </p>
     * <note>
     * <p>
     * The registry display name is only publicly visible in the Amazon ECR Public Gallery for verified accounts.
     * </p>
     * </note>
     */
    private String displayName;

    /**
     * <p>
     * The display name for a public registry. The display name is shown as the repository author in the Amazon ECR
     * Public Gallery.
     * </p>
     * <note>
     * <p>
     * The registry display name is only publicly visible in the Amazon ECR Public Gallery for verified accounts.
     * </p>
     * </note>
     * 
     * @param displayName
     *        The display name for a public registry. The display name is shown as the repository author in the Amazon
     *        ECR Public Gallery.</p> <note>
     *        <p>
     *        The registry display name is only publicly visible in the Amazon ECR Public Gallery for verified accounts.
     *        </p>
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name for a public registry. The display name is shown as the repository author in the Amazon ECR
     * Public Gallery.
     * </p>
     * <note>
     * <p>
     * The registry display name is only publicly visible in the Amazon ECR Public Gallery for verified accounts.
     * </p>
     * </note>
     * 
     * @return The display name for a public registry. The display name is shown as the repository author in the Amazon
     *         ECR Public Gallery.</p> <note>
     *         <p>
     *         The registry display name is only publicly visible in the Amazon ECR Public Gallery for verified
     *         accounts.
     *         </p>
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name for a public registry. The display name is shown as the repository author in the Amazon ECR
     * Public Gallery.
     * </p>
     * <note>
     * <p>
     * The registry display name is only publicly visible in the Amazon ECR Public Gallery for verified accounts.
     * </p>
     * </note>
     * 
     * @param displayName
     *        The display name for a public registry. The display name is shown as the repository author in the Amazon
     *        ECR Public Gallery.</p> <note>
     *        <p>
     *        The registry display name is only publicly visible in the Amazon ECR Public Gallery for verified accounts.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRegistryCatalogDataRequest withDisplayName(String displayName) {
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

        if (obj instanceof PutRegistryCatalogDataRequest == false)
            return false;
        PutRegistryCatalogDataRequest other = (PutRegistryCatalogDataRequest) obj;
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
    public PutRegistryCatalogDataRequest clone() {
        return (PutRegistryCatalogDataRequest) super.clone();
    }

}

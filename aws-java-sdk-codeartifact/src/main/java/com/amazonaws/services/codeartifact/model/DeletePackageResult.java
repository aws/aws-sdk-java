/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeletePackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePackageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private PackageSummary deletedPackage;

    /**
     * @param deletedPackage
     */

    public void setDeletedPackage(PackageSummary deletedPackage) {
        this.deletedPackage = deletedPackage;
    }

    /**
     * @return
     */

    public PackageSummary getDeletedPackage() {
        return this.deletedPackage;
    }

    /**
     * @param deletedPackage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePackageResult withDeletedPackage(PackageSummary deletedPackage) {
        setDeletedPackage(deletedPackage);
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
        if (getDeletedPackage() != null)
            sb.append("DeletedPackage: ").append(getDeletedPackage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePackageResult == false)
            return false;
        DeletePackageResult other = (DeletePackageResult) obj;
        if (other.getDeletedPackage() == null ^ this.getDeletedPackage() == null)
            return false;
        if (other.getDeletedPackage() != null && other.getDeletedPackage().equals(this.getDeletedPackage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeletedPackage() == null) ? 0 : getDeletedPackage().hashCode());
        return hashCode;
    }

    @Override
    public DeletePackageResult clone() {
        try {
            return (DeletePackageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

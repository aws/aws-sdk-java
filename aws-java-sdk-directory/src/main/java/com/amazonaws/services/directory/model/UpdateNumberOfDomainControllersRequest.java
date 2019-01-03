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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateNumberOfDomainControllers" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNumberOfDomainControllersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier of the directory to which the domain controllers will be added or removed.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The number of domain controllers desired in the directory.
     * </p>
     */
    private Integer desiredNumber;

    /**
     * <p>
     * Identifier of the directory to which the domain controllers will be added or removed.
     * </p>
     * 
     * @param directoryId
     *        Identifier of the directory to which the domain controllers will be added or removed.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * Identifier of the directory to which the domain controllers will be added or removed.
     * </p>
     * 
     * @return Identifier of the directory to which the domain controllers will be added or removed.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * Identifier of the directory to which the domain controllers will be added or removed.
     * </p>
     * 
     * @param directoryId
     *        Identifier of the directory to which the domain controllers will be added or removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNumberOfDomainControllersRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The number of domain controllers desired in the directory.
     * </p>
     * 
     * @param desiredNumber
     *        The number of domain controllers desired in the directory.
     */

    public void setDesiredNumber(Integer desiredNumber) {
        this.desiredNumber = desiredNumber;
    }

    /**
     * <p>
     * The number of domain controllers desired in the directory.
     * </p>
     * 
     * @return The number of domain controllers desired in the directory.
     */

    public Integer getDesiredNumber() {
        return this.desiredNumber;
    }

    /**
     * <p>
     * The number of domain controllers desired in the directory.
     * </p>
     * 
     * @param desiredNumber
     *        The number of domain controllers desired in the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNumberOfDomainControllersRequest withDesiredNumber(Integer desiredNumber) {
        setDesiredNumber(desiredNumber);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getDesiredNumber() != null)
            sb.append("DesiredNumber: ").append(getDesiredNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNumberOfDomainControllersRequest == false)
            return false;
        UpdateNumberOfDomainControllersRequest other = (UpdateNumberOfDomainControllersRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getDesiredNumber() == null ^ this.getDesiredNumber() == null)
            return false;
        if (other.getDesiredNumber() != null && other.getDesiredNumber().equals(this.getDesiredNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getDesiredNumber() == null) ? 0 : getDesiredNumber().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNumberOfDomainControllersRequest clone() {
        return (UpdateNumberOfDomainControllersRequest) super.clone();
    }

}

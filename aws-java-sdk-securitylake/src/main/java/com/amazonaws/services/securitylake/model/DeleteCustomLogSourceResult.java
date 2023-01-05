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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteCustomLogSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCustomLogSourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The location of the partition in the Amazon S3 bucket for Security Lake.
     * </p>
     */
    private String customDataLocation;

    /**
     * <p>
     * The location of the partition in the Amazon S3 bucket for Security Lake.
     * </p>
     * 
     * @param customDataLocation
     *        The location of the partition in the Amazon S3 bucket for Security Lake.
     */

    public void setCustomDataLocation(String customDataLocation) {
        this.customDataLocation = customDataLocation;
    }

    /**
     * <p>
     * The location of the partition in the Amazon S3 bucket for Security Lake.
     * </p>
     * 
     * @return The location of the partition in the Amazon S3 bucket for Security Lake.
     */

    public String getCustomDataLocation() {
        return this.customDataLocation;
    }

    /**
     * <p>
     * The location of the partition in the Amazon S3 bucket for Security Lake.
     * </p>
     * 
     * @param customDataLocation
     *        The location of the partition in the Amazon S3 bucket for Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomLogSourceResult withCustomDataLocation(String customDataLocation) {
        setCustomDataLocation(customDataLocation);
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
        if (getCustomDataLocation() != null)
            sb.append("CustomDataLocation: ").append(getCustomDataLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCustomLogSourceResult == false)
            return false;
        DeleteCustomLogSourceResult other = (DeleteCustomLogSourceResult) obj;
        if (other.getCustomDataLocation() == null ^ this.getCustomDataLocation() == null)
            return false;
        if (other.getCustomDataLocation() != null && other.getCustomDataLocation().equals(this.getCustomDataLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomDataLocation() == null) ? 0 : getCustomDataLocation().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCustomLogSourceResult clone() {
        try {
            return (DeleteCustomLogSourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

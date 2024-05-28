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
package com.amazonaws.services.workspacesthinclient.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/GetSoftwareSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSoftwareSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes a software set.
     * </p>
     */
    private SoftwareSet softwareSet;

    /**
     * <p>
     * Describes a software set.
     * </p>
     * 
     * @param softwareSet
     *        Describes a software set.
     */

    public void setSoftwareSet(SoftwareSet softwareSet) {
        this.softwareSet = softwareSet;
    }

    /**
     * <p>
     * Describes a software set.
     * </p>
     * 
     * @return Describes a software set.
     */

    public SoftwareSet getSoftwareSet() {
        return this.softwareSet;
    }

    /**
     * <p>
     * Describes a software set.
     * </p>
     * 
     * @param softwareSet
     *        Describes a software set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSoftwareSetResult withSoftwareSet(SoftwareSet softwareSet) {
        setSoftwareSet(softwareSet);
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
        if (getSoftwareSet() != null)
            sb.append("SoftwareSet: ").append(getSoftwareSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSoftwareSetResult == false)
            return false;
        GetSoftwareSetResult other = (GetSoftwareSetResult) obj;
        if (other.getSoftwareSet() == null ^ this.getSoftwareSet() == null)
            return false;
        if (other.getSoftwareSet() != null && other.getSoftwareSet().equals(this.getSoftwareSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSoftwareSet() == null) ? 0 : getSoftwareSet().hashCode());
        return hashCode;
    }

    @Override
    public GetSoftwareSetResult clone() {
        try {
            return (GetSoftwareSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

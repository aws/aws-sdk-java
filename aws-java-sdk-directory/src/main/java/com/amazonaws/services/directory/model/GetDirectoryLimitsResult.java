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

/**
 * <p>
 * Contains the results of the <a>GetDirectoryLimits</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/GetDirectoryLimits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDirectoryLimitsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <a>DirectoryLimits</a> object that contains the directory limits for the current region.
     * </p>
     */
    private DirectoryLimits directoryLimits;

    /**
     * <p>
     * A <a>DirectoryLimits</a> object that contains the directory limits for the current region.
     * </p>
     * 
     * @param directoryLimits
     *        A <a>DirectoryLimits</a> object that contains the directory limits for the current region.
     */

    public void setDirectoryLimits(DirectoryLimits directoryLimits) {
        this.directoryLimits = directoryLimits;
    }

    /**
     * <p>
     * A <a>DirectoryLimits</a> object that contains the directory limits for the current region.
     * </p>
     * 
     * @return A <a>DirectoryLimits</a> object that contains the directory limits for the current region.
     */

    public DirectoryLimits getDirectoryLimits() {
        return this.directoryLimits;
    }

    /**
     * <p>
     * A <a>DirectoryLimits</a> object that contains the directory limits for the current region.
     * </p>
     * 
     * @param directoryLimits
     *        A <a>DirectoryLimits</a> object that contains the directory limits for the current region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDirectoryLimitsResult withDirectoryLimits(DirectoryLimits directoryLimits) {
        setDirectoryLimits(directoryLimits);
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
        if (getDirectoryLimits() != null)
            sb.append("DirectoryLimits: ").append(getDirectoryLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDirectoryLimitsResult == false)
            return false;
        GetDirectoryLimitsResult other = (GetDirectoryLimitsResult) obj;
        if (other.getDirectoryLimits() == null ^ this.getDirectoryLimits() == null)
            return false;
        if (other.getDirectoryLimits() != null && other.getDirectoryLimits().equals(this.getDirectoryLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryLimits() == null) ? 0 : getDirectoryLimits().hashCode());
        return hashCode;
    }

    @Override
    public GetDirectoryLimitsResult clone() {
        try {
            return (GetDirectoryLimitsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

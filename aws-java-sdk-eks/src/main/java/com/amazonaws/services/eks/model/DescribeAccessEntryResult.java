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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeAccessEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccessEntryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the access entry.
     * </p>
     */
    private AccessEntry accessEntry;

    /**
     * <p>
     * Information about the access entry.
     * </p>
     * 
     * @param accessEntry
     *        Information about the access entry.
     */

    public void setAccessEntry(AccessEntry accessEntry) {
        this.accessEntry = accessEntry;
    }

    /**
     * <p>
     * Information about the access entry.
     * </p>
     * 
     * @return Information about the access entry.
     */

    public AccessEntry getAccessEntry() {
        return this.accessEntry;
    }

    /**
     * <p>
     * Information about the access entry.
     * </p>
     * 
     * @param accessEntry
     *        Information about the access entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessEntryResult withAccessEntry(AccessEntry accessEntry) {
        setAccessEntry(accessEntry);
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
        if (getAccessEntry() != null)
            sb.append("AccessEntry: ").append(getAccessEntry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccessEntryResult == false)
            return false;
        DescribeAccessEntryResult other = (DescribeAccessEntryResult) obj;
        if (other.getAccessEntry() == null ^ this.getAccessEntry() == null)
            return false;
        if (other.getAccessEntry() != null && other.getAccessEntry().equals(this.getAccessEntry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessEntry() == null) ? 0 : getAccessEntry().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccessEntryResult clone() {
        try {
            return (DescribeAccessEntryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

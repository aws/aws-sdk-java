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
 * Contains the results of the <a>GetSnapshotLimits</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/GetSnapshotLimits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSnapshotLimitsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <a>SnapshotLimits</a> object that contains the manual snapshot limits for the specified directory.
     * </p>
     */
    private SnapshotLimits snapshotLimits;

    /**
     * <p>
     * A <a>SnapshotLimits</a> object that contains the manual snapshot limits for the specified directory.
     * </p>
     * 
     * @param snapshotLimits
     *        A <a>SnapshotLimits</a> object that contains the manual snapshot limits for the specified directory.
     */

    public void setSnapshotLimits(SnapshotLimits snapshotLimits) {
        this.snapshotLimits = snapshotLimits;
    }

    /**
     * <p>
     * A <a>SnapshotLimits</a> object that contains the manual snapshot limits for the specified directory.
     * </p>
     * 
     * @return A <a>SnapshotLimits</a> object that contains the manual snapshot limits for the specified directory.
     */

    public SnapshotLimits getSnapshotLimits() {
        return this.snapshotLimits;
    }

    /**
     * <p>
     * A <a>SnapshotLimits</a> object that contains the manual snapshot limits for the specified directory.
     * </p>
     * 
     * @param snapshotLimits
     *        A <a>SnapshotLimits</a> object that contains the manual snapshot limits for the specified directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotLimitsResult withSnapshotLimits(SnapshotLimits snapshotLimits) {
        setSnapshotLimits(snapshotLimits);
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
        if (getSnapshotLimits() != null)
            sb.append("SnapshotLimits: ").append(getSnapshotLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSnapshotLimitsResult == false)
            return false;
        GetSnapshotLimitsResult other = (GetSnapshotLimitsResult) obj;
        if (other.getSnapshotLimits() == null ^ this.getSnapshotLimits() == null)
            return false;
        if (other.getSnapshotLimits() != null && other.getSnapshotLimits().equals(this.getSnapshotLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotLimits() == null) ? 0 : getSnapshotLimits().hashCode());
        return hashCode;
    }

    @Override
    public GetSnapshotLimitsResult clone() {
        try {
            return (GetSnapshotLimitsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

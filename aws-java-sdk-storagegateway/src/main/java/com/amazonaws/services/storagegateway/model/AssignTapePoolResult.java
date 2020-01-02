/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AssignTapePool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignTapePoolResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Amazon Resource Names (ARN) of the virtual tape that was added to the tape pool.
     * </p>
     */
    private String tapeARN;

    /**
     * <p>
     * The unique Amazon Resource Names (ARN) of the virtual tape that was added to the tape pool.
     * </p>
     * 
     * @param tapeARN
     *        The unique Amazon Resource Names (ARN) of the virtual tape that was added to the tape pool.
     */

    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Names (ARN) of the virtual tape that was added to the tape pool.
     * </p>
     * 
     * @return The unique Amazon Resource Names (ARN) of the virtual tape that was added to the tape pool.
     */

    public String getTapeARN() {
        return this.tapeARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Names (ARN) of the virtual tape that was added to the tape pool.
     * </p>
     * 
     * @param tapeARN
     *        The unique Amazon Resource Names (ARN) of the virtual tape that was added to the tape pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignTapePoolResult withTapeARN(String tapeARN) {
        setTapeARN(tapeARN);
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
        if (getTapeARN() != null)
            sb.append("TapeARN: ").append(getTapeARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssignTapePoolResult == false)
            return false;
        AssignTapePoolResult other = (AssignTapePoolResult) obj;
        if (other.getTapeARN() == null ^ this.getTapeARN() == null)
            return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode());
        return hashCode;
    }

    @Override
    public AssignTapePoolResult clone() {
        try {
            return (AssignTapePoolResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

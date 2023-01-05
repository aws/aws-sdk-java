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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/RestoreTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the restored table.
     * </p>
     */
    private String restoredTableARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the restored table.
     * </p>
     * 
     * @param restoredTableARN
     *        The Amazon Resource Name (ARN) of the restored table.
     */

    public void setRestoredTableARN(String restoredTableARN) {
        this.restoredTableARN = restoredTableARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the restored table.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the restored table.
     */

    public String getRestoredTableARN() {
        return this.restoredTableARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the restored table.
     * </p>
     * 
     * @param restoredTableARN
     *        The Amazon Resource Name (ARN) of the restored table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableResult withRestoredTableARN(String restoredTableARN) {
        setRestoredTableARN(restoredTableARN);
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
        if (getRestoredTableARN() != null)
            sb.append("RestoredTableARN: ").append(getRestoredTableARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTableResult == false)
            return false;
        RestoreTableResult other = (RestoreTableResult) obj;
        if (other.getRestoredTableARN() == null ^ this.getRestoredTableARN() == null)
            return false;
        if (other.getRestoredTableARN() != null && other.getRestoredTableARN().equals(this.getRestoredTableARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestoredTableARN() == null) ? 0 : getRestoredTableARN().hashCode());
        return hashCode;
    }

    @Override
    public RestoreTableResult clone() {
        try {
            return (RestoreTableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

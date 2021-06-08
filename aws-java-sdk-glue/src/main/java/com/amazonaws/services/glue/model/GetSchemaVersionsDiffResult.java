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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSchemaVersionsDiff" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSchemaVersionsDiffResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The difference between schemas as a string in JsonPatch format.
     * </p>
     */
    private String diff;

    /**
     * <p>
     * The difference between schemas as a string in JsonPatch format.
     * </p>
     * 
     * @param diff
     *        The difference between schemas as a string in JsonPatch format.
     */

    public void setDiff(String diff) {
        this.diff = diff;
    }

    /**
     * <p>
     * The difference between schemas as a string in JsonPatch format.
     * </p>
     * 
     * @return The difference between schemas as a string in JsonPatch format.
     */

    public String getDiff() {
        return this.diff;
    }

    /**
     * <p>
     * The difference between schemas as a string in JsonPatch format.
     * </p>
     * 
     * @param diff
     *        The difference between schemas as a string in JsonPatch format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaVersionsDiffResult withDiff(String diff) {
        setDiff(diff);
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
        if (getDiff() != null)
            sb.append("Diff: ").append(getDiff());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSchemaVersionsDiffResult == false)
            return false;
        GetSchemaVersionsDiffResult other = (GetSchemaVersionsDiffResult) obj;
        if (other.getDiff() == null ^ this.getDiff() == null)
            return false;
        if (other.getDiff() != null && other.getDiff().equals(this.getDiff()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiff() == null) ? 0 : getDiff().hashCode());
        return hashCode;
    }

    @Override
    public GetSchemaVersionsDiffResult clone() {
        try {
            return (GetSchemaVersionsDiffResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

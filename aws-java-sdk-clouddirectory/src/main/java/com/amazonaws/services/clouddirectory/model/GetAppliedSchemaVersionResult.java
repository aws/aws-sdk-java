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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetAppliedSchemaVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAppliedSchemaVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Current applied schema ARN, including the minor version in use if one was provided.
     * </p>
     */
    private String appliedSchemaArn;

    /**
     * <p>
     * Current applied schema ARN, including the minor version in use if one was provided.
     * </p>
     * 
     * @param appliedSchemaArn
     *        Current applied schema ARN, including the minor version in use if one was provided.
     */

    public void setAppliedSchemaArn(String appliedSchemaArn) {
        this.appliedSchemaArn = appliedSchemaArn;
    }

    /**
     * <p>
     * Current applied schema ARN, including the minor version in use if one was provided.
     * </p>
     * 
     * @return Current applied schema ARN, including the minor version in use if one was provided.
     */

    public String getAppliedSchemaArn() {
        return this.appliedSchemaArn;
    }

    /**
     * <p>
     * Current applied schema ARN, including the minor version in use if one was provided.
     * </p>
     * 
     * @param appliedSchemaArn
     *        Current applied schema ARN, including the minor version in use if one was provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppliedSchemaVersionResult withAppliedSchemaArn(String appliedSchemaArn) {
        setAppliedSchemaArn(appliedSchemaArn);
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
        if (getAppliedSchemaArn() != null)
            sb.append("AppliedSchemaArn: ").append(getAppliedSchemaArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAppliedSchemaVersionResult == false)
            return false;
        GetAppliedSchemaVersionResult other = (GetAppliedSchemaVersionResult) obj;
        if (other.getAppliedSchemaArn() == null ^ this.getAppliedSchemaArn() == null)
            return false;
        if (other.getAppliedSchemaArn() != null && other.getAppliedSchemaArn().equals(this.getAppliedSchemaArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppliedSchemaArn() == null) ? 0 : getAppliedSchemaArn().hashCode());
        return hashCode;
    }

    @Override
    public GetAppliedSchemaVersionResult clone() {
        try {
            return (GetAppliedSchemaVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

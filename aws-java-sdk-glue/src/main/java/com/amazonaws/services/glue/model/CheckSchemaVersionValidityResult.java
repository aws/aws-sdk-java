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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CheckSchemaVersionValidity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckSchemaVersionValidityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Return true, if the schema is valid and false otherwise.
     * </p>
     */
    private Boolean valid;
    /**
     * <p>
     * A validation failure error message.
     * </p>
     */
    private String error;

    /**
     * <p>
     * Return true, if the schema is valid and false otherwise.
     * </p>
     * 
     * @param valid
     *        Return true, if the schema is valid and false otherwise.
     */

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
     * <p>
     * Return true, if the schema is valid and false otherwise.
     * </p>
     * 
     * @return Return true, if the schema is valid and false otherwise.
     */

    public Boolean getValid() {
        return this.valid;
    }

    /**
     * <p>
     * Return true, if the schema is valid and false otherwise.
     * </p>
     * 
     * @param valid
     *        Return true, if the schema is valid and false otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckSchemaVersionValidityResult withValid(Boolean valid) {
        setValid(valid);
        return this;
    }

    /**
     * <p>
     * Return true, if the schema is valid and false otherwise.
     * </p>
     * 
     * @return Return true, if the schema is valid and false otherwise.
     */

    public Boolean isValid() {
        return this.valid;
    }

    /**
     * <p>
     * A validation failure error message.
     * </p>
     * 
     * @param error
     *        A validation failure error message.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * A validation failure error message.
     * </p>
     * 
     * @return A validation failure error message.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * A validation failure error message.
     * </p>
     * 
     * @param error
     *        A validation failure error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckSchemaVersionValidityResult withError(String error) {
        setError(error);
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
        if (getValid() != null)
            sb.append("Valid: ").append(getValid()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckSchemaVersionValidityResult == false)
            return false;
        CheckSchemaVersionValidityResult other = (CheckSchemaVersionValidityResult) obj;
        if (other.getValid() == null ^ this.getValid() == null)
            return false;
        if (other.getValid() != null && other.getValid().equals(this.getValid()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValid() == null) ? 0 : getValid().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public CheckSchemaVersionValidityResult clone() {
        try {
            return (CheckSchemaVersionValidityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.redshiftdataapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/CancelStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelStatementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A value that indicates whether the cancel statement succeeded (true).
     * </p>
     */
    private Boolean status;

    /**
     * <p>
     * A value that indicates whether the cancel statement succeeded (true).
     * </p>
     * 
     * @param status
     *        A value that indicates whether the cancel statement succeeded (true).
     */

    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * <p>
     * A value that indicates whether the cancel statement succeeded (true).
     * </p>
     * 
     * @return A value that indicates whether the cancel statement succeeded (true).
     */

    public Boolean getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A value that indicates whether the cancel statement succeeded (true).
     * </p>
     * 
     * @param status
     *        A value that indicates whether the cancel statement succeeded (true).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelStatementResult withStatus(Boolean status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the cancel statement succeeded (true).
     * </p>
     * 
     * @return A value that indicates whether the cancel statement succeeded (true).
     */

    public Boolean isStatus() {
        return this.status;
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelStatementResult == false)
            return false;
        CancelStatementResult other = (CancelStatementResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CancelStatementResult clone() {
        try {
            return (CancelStatementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

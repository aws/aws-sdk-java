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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A structure for the output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetWorkUnitResults" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkUnitResultsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Rows returned from the <code>GetWorkUnitResults</code> operation as a stream of Apache Arrow v1.0 messages.
     * </p>
     */
    private java.io.InputStream resultStream;

    /**
     * <p>
     * Rows returned from the <code>GetWorkUnitResults</code> operation as a stream of Apache Arrow v1.0 messages.
     * </p>
     * 
     * @param resultStream
     *        Rows returned from the <code>GetWorkUnitResults</code> operation as a stream of Apache Arrow v1.0
     *        messages.
     */

    public void setResultStream(java.io.InputStream resultStream) {
        this.resultStream = resultStream;
    }

    /**
     * <p>
     * Rows returned from the <code>GetWorkUnitResults</code> operation as a stream of Apache Arrow v1.0 messages.
     * </p>
     * 
     * @return Rows returned from the <code>GetWorkUnitResults</code> operation as a stream of Apache Arrow v1.0
     *         messages.
     */

    public java.io.InputStream getResultStream() {
        return this.resultStream;
    }

    /**
     * <p>
     * Rows returned from the <code>GetWorkUnitResults</code> operation as a stream of Apache Arrow v1.0 messages.
     * </p>
     * 
     * @param resultStream
     *        Rows returned from the <code>GetWorkUnitResults</code> operation as a stream of Apache Arrow v1.0
     *        messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkUnitResultsResult withResultStream(java.io.InputStream resultStream) {
        setResultStream(resultStream);
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
        if (getResultStream() != null)
            sb.append("ResultStream: ").append(getResultStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkUnitResultsResult == false)
            return false;
        GetWorkUnitResultsResult other = (GetWorkUnitResultsResult) obj;
        if (other.getResultStream() == null ^ this.getResultStream() == null)
            return false;
        if (other.getResultStream() != null && other.getResultStream().equals(this.getResultStream()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultStream() == null) ? 0 : getResultStream().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkUnitResultsResult clone() {
        try {
            return (GetWorkUnitResultsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the result of a get suite request.
 * </p>
 */
public class GetSuiteResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Suite suite;

    /**
     * @param suite
     */

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    /**
     * @return
     */

    public Suite getSuite() {
        return this.suite;
    }

    /**
     * @param suite
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteResult withSuite(Suite suite) {
        setSuite(suite);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSuite() != null)
            sb.append("Suite: " + getSuite());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSuiteResult == false)
            return false;
        GetSuiteResult other = (GetSuiteResult) obj;
        if (other.getSuite() == null ^ this.getSuite() == null)
            return false;
        if (other.getSuite() != null && other.getSuite().equals(this.getSuite()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuite() == null) ? 0 : getSuite().hashCode());
        return hashCode;
    }

    @Override
    public GetSuiteResult clone() {
        try {
            return (GetSuiteResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

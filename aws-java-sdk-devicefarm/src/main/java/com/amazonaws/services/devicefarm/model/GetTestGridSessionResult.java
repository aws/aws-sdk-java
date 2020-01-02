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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetTestGridSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTestGridSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <a>TestGridSession</a> that was requested.
     * </p>
     */
    private TestGridSession testGridSession;

    /**
     * <p>
     * The <a>TestGridSession</a> that was requested.
     * </p>
     * 
     * @param testGridSession
     *        The <a>TestGridSession</a> that was requested.
     */

    public void setTestGridSession(TestGridSession testGridSession) {
        this.testGridSession = testGridSession;
    }

    /**
     * <p>
     * The <a>TestGridSession</a> that was requested.
     * </p>
     * 
     * @return The <a>TestGridSession</a> that was requested.
     */

    public TestGridSession getTestGridSession() {
        return this.testGridSession;
    }

    /**
     * <p>
     * The <a>TestGridSession</a> that was requested.
     * </p>
     * 
     * @param testGridSession
     *        The <a>TestGridSession</a> that was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestGridSessionResult withTestGridSession(TestGridSession testGridSession) {
        setTestGridSession(testGridSession);
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
        if (getTestGridSession() != null)
            sb.append("TestGridSession: ").append(getTestGridSession());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTestGridSessionResult == false)
            return false;
        GetTestGridSessionResult other = (GetTestGridSessionResult) obj;
        if (other.getTestGridSession() == null ^ this.getTestGridSession() == null)
            return false;
        if (other.getTestGridSession() != null && other.getTestGridSession().equals(this.getTestGridSession()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestGridSession() == null) ? 0 : getTestGridSession().hashCode());
        return hashCode;
    }

    @Override
    public GetTestGridSessionResult clone() {
        try {
            return (GetTestGridSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

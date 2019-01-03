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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/TestEventPattern" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestEventPatternResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the event matches the event pattern.
     * </p>
     */
    private Boolean result;

    /**
     * <p>
     * Indicates whether the event matches the event pattern.
     * </p>
     * 
     * @param result
     *        Indicates whether the event matches the event pattern.
     */

    public void setResult(Boolean result) {
        this.result = result;
    }

    /**
     * <p>
     * Indicates whether the event matches the event pattern.
     * </p>
     * 
     * @return Indicates whether the event matches the event pattern.
     */

    public Boolean getResult() {
        return this.result;
    }

    /**
     * <p>
     * Indicates whether the event matches the event pattern.
     * </p>
     * 
     * @param result
     *        Indicates whether the event matches the event pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestEventPatternResult withResult(Boolean result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * Indicates whether the event matches the event pattern.
     * </p>
     * 
     * @return Indicates whether the event matches the event pattern.
     */

    public Boolean isResult() {
        return this.result;
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
        if (getResult() != null)
            sb.append("Result: ").append(getResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestEventPatternResult == false)
            return false;
        TestEventPatternResult other = (TestEventPatternResult) obj;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        return hashCode;
    }

    @Override
    public TestEventPatternResult clone() {
        try {
            return (TestEventPatternResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

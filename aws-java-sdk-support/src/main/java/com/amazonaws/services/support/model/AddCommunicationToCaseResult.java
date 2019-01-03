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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of the <a>AddCommunicationToCase</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/AddCommunicationToCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddCommunicationToCaseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * True if <a>AddCommunicationToCase</a> succeeds. Otherwise, returns an error.
     * </p>
     */
    private Boolean result;

    /**
     * <p>
     * True if <a>AddCommunicationToCase</a> succeeds. Otherwise, returns an error.
     * </p>
     * 
     * @param result
     *        True if <a>AddCommunicationToCase</a> succeeds. Otherwise, returns an error.
     */

    public void setResult(Boolean result) {
        this.result = result;
    }

    /**
     * <p>
     * True if <a>AddCommunicationToCase</a> succeeds. Otherwise, returns an error.
     * </p>
     * 
     * @return True if <a>AddCommunicationToCase</a> succeeds. Otherwise, returns an error.
     */

    public Boolean getResult() {
        return this.result;
    }

    /**
     * <p>
     * True if <a>AddCommunicationToCase</a> succeeds. Otherwise, returns an error.
     * </p>
     * 
     * @param result
     *        True if <a>AddCommunicationToCase</a> succeeds. Otherwise, returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddCommunicationToCaseResult withResult(Boolean result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * True if <a>AddCommunicationToCase</a> succeeds. Otherwise, returns an error.
     * </p>
     * 
     * @return True if <a>AddCommunicationToCase</a> succeeds. Otherwise, returns an error.
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

        if (obj instanceof AddCommunicationToCaseResult == false)
            return false;
        AddCommunicationToCaseResult other = (AddCommunicationToCaseResult) obj;
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
    public AddCommunicationToCaseResult clone() {
        try {
            return (AddCommunicationToCaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

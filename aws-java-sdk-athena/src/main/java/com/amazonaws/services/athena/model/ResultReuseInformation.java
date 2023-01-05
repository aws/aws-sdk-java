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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about whether the result of a previous query was reused.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ResultReuseInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultReuseInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * True if a previous query result was reused; false if the result was generated from a new run of the query.
     * </p>
     */
    private Boolean reusedPreviousResult;

    /**
     * <p>
     * True if a previous query result was reused; false if the result was generated from a new run of the query.
     * </p>
     * 
     * @param reusedPreviousResult
     *        True if a previous query result was reused; false if the result was generated from a new run of the query.
     */

    public void setReusedPreviousResult(Boolean reusedPreviousResult) {
        this.reusedPreviousResult = reusedPreviousResult;
    }

    /**
     * <p>
     * True if a previous query result was reused; false if the result was generated from a new run of the query.
     * </p>
     * 
     * @return True if a previous query result was reused; false if the result was generated from a new run of the
     *         query.
     */

    public Boolean getReusedPreviousResult() {
        return this.reusedPreviousResult;
    }

    /**
     * <p>
     * True if a previous query result was reused; false if the result was generated from a new run of the query.
     * </p>
     * 
     * @param reusedPreviousResult
     *        True if a previous query result was reused; false if the result was generated from a new run of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultReuseInformation withReusedPreviousResult(Boolean reusedPreviousResult) {
        setReusedPreviousResult(reusedPreviousResult);
        return this;
    }

    /**
     * <p>
     * True if a previous query result was reused; false if the result was generated from a new run of the query.
     * </p>
     * 
     * @return True if a previous query result was reused; false if the result was generated from a new run of the
     *         query.
     */

    public Boolean isReusedPreviousResult() {
        return this.reusedPreviousResult;
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
        if (getReusedPreviousResult() != null)
            sb.append("ReusedPreviousResult: ").append(getReusedPreviousResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultReuseInformation == false)
            return false;
        ResultReuseInformation other = (ResultReuseInformation) obj;
        if (other.getReusedPreviousResult() == null ^ this.getReusedPreviousResult() == null)
            return false;
        if (other.getReusedPreviousResult() != null && other.getReusedPreviousResult().equals(this.getReusedPreviousResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReusedPreviousResult() == null) ? 0 : getReusedPreviousResult().hashCode());
        return hashCode;
    }

    @Override
    public ResultReuseInformation clone() {
        try {
            return (ResultReuseInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.ResultReuseInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

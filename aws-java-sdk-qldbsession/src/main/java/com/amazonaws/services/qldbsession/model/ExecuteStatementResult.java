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
package com.amazonaws.services.qldbsession.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the details of the executed statement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-session-2019-07-11/ExecuteStatementResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteStatementResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the details of the first fetched page.
     * </p>
     */
    private Page firstPage;

    /**
     * <p>
     * Contains the details of the first fetched page.
     * </p>
     * 
     * @param firstPage
     *        Contains the details of the first fetched page.
     */

    public void setFirstPage(Page firstPage) {
        this.firstPage = firstPage;
    }

    /**
     * <p>
     * Contains the details of the first fetched page.
     * </p>
     * 
     * @return Contains the details of the first fetched page.
     */

    public Page getFirstPage() {
        return this.firstPage;
    }

    /**
     * <p>
     * Contains the details of the first fetched page.
     * </p>
     * 
     * @param firstPage
     *        Contains the details of the first fetched page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withFirstPage(Page firstPage) {
        setFirstPage(firstPage);
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
        if (getFirstPage() != null)
            sb.append("FirstPage: ").append(getFirstPage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteStatementResult == false)
            return false;
        ExecuteStatementResult other = (ExecuteStatementResult) obj;
        if (other.getFirstPage() == null ^ this.getFirstPage() == null)
            return false;
        if (other.getFirstPage() != null && other.getFirstPage().equals(this.getFirstPage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirstPage() == null) ? 0 : getFirstPage().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteStatementResult clone() {
        try {
            return (ExecuteStatementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldbsession.model.transform.ExecuteStatementResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

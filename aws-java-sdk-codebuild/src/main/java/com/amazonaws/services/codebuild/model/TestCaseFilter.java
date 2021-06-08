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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter used to return specific types of test cases. In order to pass the filter, the report must meet all of the
 * filter properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/TestCaseFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestCaseFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status used to filter test cases. A <code>TestCaseFilter</code> can have one status. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * A keyword that is used to filter on the <code>name</code> or the <code>prefix</code> of the test cases. Only test
     * cases where the keyword is a substring of the <code>name</code> or the <code>prefix</code> will be returned.
     * </p>
     */
    private String keyword;

    /**
     * <p>
     * The status used to filter test cases. A <code>TestCaseFilter</code> can have one status. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status used to filter test cases. A <code>TestCaseFilter</code> can have one status. Valid values
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIPPED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code>
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status used to filter test cases. A <code>TestCaseFilter</code> can have one status. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status used to filter test cases. A <code>TestCaseFilter</code> can have one status. Valid values
     *         are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ERROR</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SKIPPED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNKNOWN</code>
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status used to filter test cases. A <code>TestCaseFilter</code> can have one status. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status used to filter test cases. A <code>TestCaseFilter</code> can have one status. Valid values
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIPPED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseFilter withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A keyword that is used to filter on the <code>name</code> or the <code>prefix</code> of the test cases. Only test
     * cases where the keyword is a substring of the <code>name</code> or the <code>prefix</code> will be returned.
     * </p>
     * 
     * @param keyword
     *        A keyword that is used to filter on the <code>name</code> or the <code>prefix</code> of the test cases.
     *        Only test cases where the keyword is a substring of the <code>name</code> or the <code>prefix</code> will
     *        be returned.
     */

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * <p>
     * A keyword that is used to filter on the <code>name</code> or the <code>prefix</code> of the test cases. Only test
     * cases where the keyword is a substring of the <code>name</code> or the <code>prefix</code> will be returned.
     * </p>
     * 
     * @return A keyword that is used to filter on the <code>name</code> or the <code>prefix</code> of the test cases.
     *         Only test cases where the keyword is a substring of the <code>name</code> or the <code>prefix</code> will
     *         be returned.
     */

    public String getKeyword() {
        return this.keyword;
    }

    /**
     * <p>
     * A keyword that is used to filter on the <code>name</code> or the <code>prefix</code> of the test cases. Only test
     * cases where the keyword is a substring of the <code>name</code> or the <code>prefix</code> will be returned.
     * </p>
     * 
     * @param keyword
     *        A keyword that is used to filter on the <code>name</code> or the <code>prefix</code> of the test cases.
     *        Only test cases where the keyword is a substring of the <code>name</code> or the <code>prefix</code> will
     *        be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseFilter withKeyword(String keyword) {
        setKeyword(keyword);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getKeyword() != null)
            sb.append("Keyword: ").append(getKeyword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestCaseFilter == false)
            return false;
        TestCaseFilter other = (TestCaseFilter) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getKeyword() == null ^ this.getKeyword() == null)
            return false;
        if (other.getKeyword() != null && other.getKeyword().equals(this.getKeyword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        return hashCode;
    }

    @Override
    public TestCaseFilter clone() {
        try {
            return (TestCaseFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.TestCaseFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

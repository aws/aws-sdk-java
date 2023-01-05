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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetPreparedStatement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetPreparedStatementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of prepared statement names to return.
     * </p>
     */
    private java.util.List<String> preparedStatementNames;
    /**
     * <p>
     * The name of the workgroup to which the prepared statements belong.
     * </p>
     */
    private String workGroup;

    /**
     * <p>
     * A list of prepared statement names to return.
     * </p>
     * 
     * @return A list of prepared statement names to return.
     */

    public java.util.List<String> getPreparedStatementNames() {
        return preparedStatementNames;
    }

    /**
     * <p>
     * A list of prepared statement names to return.
     * </p>
     * 
     * @param preparedStatementNames
     *        A list of prepared statement names to return.
     */

    public void setPreparedStatementNames(java.util.Collection<String> preparedStatementNames) {
        if (preparedStatementNames == null) {
            this.preparedStatementNames = null;
            return;
        }

        this.preparedStatementNames = new java.util.ArrayList<String>(preparedStatementNames);
    }

    /**
     * <p>
     * A list of prepared statement names to return.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPreparedStatementNames(java.util.Collection)} or
     * {@link #withPreparedStatementNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param preparedStatementNames
     *        A list of prepared statement names to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetPreparedStatementRequest withPreparedStatementNames(String... preparedStatementNames) {
        if (this.preparedStatementNames == null) {
            setPreparedStatementNames(new java.util.ArrayList<String>(preparedStatementNames.length));
        }
        for (String ele : preparedStatementNames) {
            this.preparedStatementNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of prepared statement names to return.
     * </p>
     * 
     * @param preparedStatementNames
     *        A list of prepared statement names to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetPreparedStatementRequest withPreparedStatementNames(java.util.Collection<String> preparedStatementNames) {
        setPreparedStatementNames(preparedStatementNames);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup to which the prepared statements belong.
     * </p>
     * 
     * @param workGroup
     *        The name of the workgroup to which the prepared statements belong.
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The name of the workgroup to which the prepared statements belong.
     * </p>
     * 
     * @return The name of the workgroup to which the prepared statements belong.
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * <p>
     * The name of the workgroup to which the prepared statements belong.
     * </p>
     * 
     * @param workGroup
     *        The name of the workgroup to which the prepared statements belong.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetPreparedStatementRequest withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
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
        if (getPreparedStatementNames() != null)
            sb.append("PreparedStatementNames: ").append(getPreparedStatementNames()).append(",");
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetPreparedStatementRequest == false)
            return false;
        BatchGetPreparedStatementRequest other = (BatchGetPreparedStatementRequest) obj;
        if (other.getPreparedStatementNames() == null ^ this.getPreparedStatementNames() == null)
            return false;
        if (other.getPreparedStatementNames() != null && other.getPreparedStatementNames().equals(this.getPreparedStatementNames()) == false)
            return false;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreparedStatementNames() == null) ? 0 : getPreparedStatementNames().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetPreparedStatementRequest clone() {
        return (BatchGetPreparedStatementRequest) super.clone();
    }

}

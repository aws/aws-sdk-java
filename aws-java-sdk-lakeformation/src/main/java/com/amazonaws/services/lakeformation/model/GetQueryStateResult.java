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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetQueryState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueryStateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An error message when the operation fails.
     * </p>
     */
    private String error;
    /**
     * <p>
     * The state of a query previously submitted. The possible states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: the query is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * WORKUNITS_AVAILABLE: some work units are ready for retrieval and execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * FINISHED: the query planning finished successfully, and all work units are ready for retrieval and execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERROR: an error occurred with the query, such as an invalid query ID or a backend error.
     * </p>
     * </li>
     * </ul>
     */
    private String state;

    /**
     * <p>
     * An error message when the operation fails.
     * </p>
     * 
     * @param error
     *        An error message when the operation fails.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * An error message when the operation fails.
     * </p>
     * 
     * @return An error message when the operation fails.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * An error message when the operation fails.
     * </p>
     * 
     * @param error
     *        An error message when the operation fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryStateResult withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The state of a query previously submitted. The possible states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: the query is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * WORKUNITS_AVAILABLE: some work units are ready for retrieval and execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * FINISHED: the query planning finished successfully, and all work units are ready for retrieval and execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERROR: an error occurred with the query, such as an invalid query ID or a backend error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of a query previously submitted. The possible states are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: the query is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WORKUNITS_AVAILABLE: some work units are ready for retrieval and execution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FINISHED: the query planning finished successfully, and all work units are ready for retrieval and
     *        execution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ERROR: an error occurred with the query, such as an invalid query ID or a backend error.
     *        </p>
     *        </li>
     * @see QueryStateString
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of a query previously submitted. The possible states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: the query is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * WORKUNITS_AVAILABLE: some work units are ready for retrieval and execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * FINISHED: the query planning finished successfully, and all work units are ready for retrieval and execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERROR: an error occurred with the query, such as an invalid query ID or a backend error.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of a query previously submitted. The possible states are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PENDING: the query is pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         WORKUNITS_AVAILABLE: some work units are ready for retrieval and execution.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FINISHED: the query planning finished successfully, and all work units are ready for retrieval and
     *         execution.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ERROR: an error occurred with the query, such as an invalid query ID or a backend error.
     *         </p>
     *         </li>
     * @see QueryStateString
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of a query previously submitted. The possible states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: the query is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * WORKUNITS_AVAILABLE: some work units are ready for retrieval and execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * FINISHED: the query planning finished successfully, and all work units are ready for retrieval and execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERROR: an error occurred with the query, such as an invalid query ID or a backend error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of a query previously submitted. The possible states are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: the query is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WORKUNITS_AVAILABLE: some work units are ready for retrieval and execution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FINISHED: the query planning finished successfully, and all work units are ready for retrieval and
     *        execution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ERROR: an error occurred with the query, such as an invalid query ID or a backend error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStateString
     */

    public GetQueryStateResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of a query previously submitted. The possible states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: the query is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * WORKUNITS_AVAILABLE: some work units are ready for retrieval and execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * FINISHED: the query planning finished successfully, and all work units are ready for retrieval and execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERROR: an error occurred with the query, such as an invalid query ID or a backend error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of a query previously submitted. The possible states are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: the query is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WORKUNITS_AVAILABLE: some work units are ready for retrieval and execution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FINISHED: the query planning finished successfully, and all work units are ready for retrieval and
     *        execution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ERROR: an error occurred with the query, such as an invalid query ID or a backend error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStateString
     */

    public GetQueryStateResult withState(QueryStateString state) {
        this.state = state.toString();
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
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueryStateResult == false)
            return false;
        GetQueryStateResult other = (GetQueryStateResult) obj;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public GetQueryStateResult clone() {
        try {
            return (GetQueryStateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

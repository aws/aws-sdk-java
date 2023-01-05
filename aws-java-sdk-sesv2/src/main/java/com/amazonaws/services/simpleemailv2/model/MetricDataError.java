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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An error corresponding to the unsuccessful processing of a single metric data query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/MetricDataError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDataError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The query identifier.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The query error code. Can be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INTERNAL_FAILURE</code> – Amazon SES has failed to process one of the queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code> – You have insufficient access to retrieve metrics based on the given query.
     * </p>
     * </li>
     * </ul>
     */
    private String code;
    /**
     * <p>
     * The error message associated with the current query error.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The query identifier.
     * </p>
     * 
     * @param id
     *        The query identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The query identifier.
     * </p>
     * 
     * @return The query identifier.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The query identifier.
     * </p>
     * 
     * @param id
     *        The query identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataError withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The query error code. Can be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INTERNAL_FAILURE</code> – Amazon SES has failed to process one of the queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code> – You have insufficient access to retrieve metrics based on the given query.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The query error code. Can be one of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INTERNAL_FAILURE</code> – Amazon SES has failed to process one of the queries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCESS_DENIED</code> – You have insufficient access to retrieve metrics based on the given query.
     *        </p>
     *        </li>
     * @see QueryErrorCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The query error code. Can be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INTERNAL_FAILURE</code> – Amazon SES has failed to process one of the queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code> – You have insufficient access to retrieve metrics based on the given query.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The query error code. Can be one of:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INTERNAL_FAILURE</code> – Amazon SES has failed to process one of the queries.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACCESS_DENIED</code> – You have insufficient access to retrieve metrics based on the given query.
     *         </p>
     *         </li>
     * @see QueryErrorCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The query error code. Can be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INTERNAL_FAILURE</code> – Amazon SES has failed to process one of the queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code> – You have insufficient access to retrieve metrics based on the given query.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The query error code. Can be one of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INTERNAL_FAILURE</code> – Amazon SES has failed to process one of the queries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCESS_DENIED</code> – You have insufficient access to retrieve metrics based on the given query.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryErrorCode
     */

    public MetricDataError withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The query error code. Can be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INTERNAL_FAILURE</code> – Amazon SES has failed to process one of the queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code> – You have insufficient access to retrieve metrics based on the given query.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The query error code. Can be one of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INTERNAL_FAILURE</code> – Amazon SES has failed to process one of the queries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCESS_DENIED</code> – You have insufficient access to retrieve metrics based on the given query.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryErrorCode
     */

    public MetricDataError withCode(QueryErrorCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * The error message associated with the current query error.
     * </p>
     * 
     * @param message
     *        The error message associated with the current query error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The error message associated with the current query error.
     * </p>
     * 
     * @return The error message associated with the current query error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The error message associated with the current query error.
     * </p>
     * 
     * @param message
     *        The error message associated with the current query error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataError withMessage(String message) {
        setMessage(message);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDataError == false)
            return false;
        MetricDataError other = (MetricDataError) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public MetricDataError clone() {
        try {
            return (MetricDataError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.MetricDataErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

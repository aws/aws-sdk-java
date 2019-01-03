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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogGroupFields" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLogGroupFieldsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The array of fields found in the query. Each object in the array contains the name of the field, along with the
     * percentage of time it appeared in the log events that were queried.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LogGroupField> logGroupFields;

    /**
     * <p>
     * The array of fields found in the query. Each object in the array contains the name of the field, along with the
     * percentage of time it appeared in the log events that were queried.
     * </p>
     * 
     * @return The array of fields found in the query. Each object in the array contains the name of the field, along
     *         with the percentage of time it appeared in the log events that were queried.
     */

    public java.util.List<LogGroupField> getLogGroupFields() {
        if (logGroupFields == null) {
            logGroupFields = new com.amazonaws.internal.SdkInternalList<LogGroupField>();
        }
        return logGroupFields;
    }

    /**
     * <p>
     * The array of fields found in the query. Each object in the array contains the name of the field, along with the
     * percentage of time it appeared in the log events that were queried.
     * </p>
     * 
     * @param logGroupFields
     *        The array of fields found in the query. Each object in the array contains the name of the field, along
     *        with the percentage of time it appeared in the log events that were queried.
     */

    public void setLogGroupFields(java.util.Collection<LogGroupField> logGroupFields) {
        if (logGroupFields == null) {
            this.logGroupFields = null;
            return;
        }

        this.logGroupFields = new com.amazonaws.internal.SdkInternalList<LogGroupField>(logGroupFields);
    }

    /**
     * <p>
     * The array of fields found in the query. Each object in the array contains the name of the field, along with the
     * percentage of time it appeared in the log events that were queried.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogGroupFields(java.util.Collection)} or {@link #withLogGroupFields(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param logGroupFields
     *        The array of fields found in the query. Each object in the array contains the name of the field, along
     *        with the percentage of time it appeared in the log events that were queried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogGroupFieldsResult withLogGroupFields(LogGroupField... logGroupFields) {
        if (this.logGroupFields == null) {
            setLogGroupFields(new com.amazonaws.internal.SdkInternalList<LogGroupField>(logGroupFields.length));
        }
        for (LogGroupField ele : logGroupFields) {
            this.logGroupFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of fields found in the query. Each object in the array contains the name of the field, along with the
     * percentage of time it appeared in the log events that were queried.
     * </p>
     * 
     * @param logGroupFields
     *        The array of fields found in the query. Each object in the array contains the name of the field, along
     *        with the percentage of time it appeared in the log events that were queried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogGroupFieldsResult withLogGroupFields(java.util.Collection<LogGroupField> logGroupFields) {
        setLogGroupFields(logGroupFields);
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
        if (getLogGroupFields() != null)
            sb.append("LogGroupFields: ").append(getLogGroupFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLogGroupFieldsResult == false)
            return false;
        GetLogGroupFieldsResult other = (GetLogGroupFieldsResult) obj;
        if (other.getLogGroupFields() == null ^ this.getLogGroupFields() == null)
            return false;
        if (other.getLogGroupFields() != null && other.getLogGroupFields().equals(this.getLogGroupFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupFields() == null) ? 0 : getLogGroupFields().hashCode());
        return hashCode;
    }

    @Override
    public GetLogGroupFieldsResult clone() {
        try {
            return (GetLogGroupFieldsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

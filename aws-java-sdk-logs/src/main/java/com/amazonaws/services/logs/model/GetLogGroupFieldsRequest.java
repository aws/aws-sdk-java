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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogGroupFields" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLogGroupFieldsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log group to search.
     * </p>
     * <p>
     * If you specify values for both <code>logGroupName</code> and <code>logGroupIdentifier</code>, the action returns
     * an <code>InvalidParameterException</code> error.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The time to set as the center of the query. If you specify <code>time</code>, the 15 minutes before this time are
     * queries. If you omit <code>time</code>, the 8 minutes before and 8 minutes after this time are searched.
     * </p>
     * <p>
     * The <code>time</code> value is specified as epoch time, which is the number of seconds since
     * <code>January 1, 1970, 00:00:00 UTC</code>.
     * </p>
     */
    private Long time;
    /**
     * <p>
     * Specify either the name or ARN of the log group to view. If the log group is in a source account and you are
     * using a monitoring account, you must specify the ARN.
     * </p>
     * <p>
     * If you specify values for both <code>logGroupName</code> and <code>logGroupIdentifier</code>, the action returns
     * an <code>InvalidParameterException</code> error.
     * </p>
     */
    private String logGroupIdentifier;

    /**
     * <p>
     * The name of the log group to search.
     * </p>
     * <p>
     * If you specify values for both <code>logGroupName</code> and <code>logGroupIdentifier</code>, the action returns
     * an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group to search.</p>
     *        <p>
     *        If you specify values for both <code>logGroupName</code> and <code>logGroupIdentifier</code>, the action
     *        returns an <code>InvalidParameterException</code> error.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group to search.
     * </p>
     * <p>
     * If you specify values for both <code>logGroupName</code> and <code>logGroupIdentifier</code>, the action returns
     * an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @return The name of the log group to search.</p>
     *         <p>
     *         If you specify values for both <code>logGroupName</code> and <code>logGroupIdentifier</code>, the action
     *         returns an <code>InvalidParameterException</code> error.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group to search.
     * </p>
     * <p>
     * If you specify values for both <code>logGroupName</code> and <code>logGroupIdentifier</code>, the action returns
     * an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group to search.</p>
     *        <p>
     *        If you specify values for both <code>logGroupName</code> and <code>logGroupIdentifier</code>, the action
     *        returns an <code>InvalidParameterException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogGroupFieldsRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The time to set as the center of the query. If you specify <code>time</code>, the 15 minutes before this time are
     * queries. If you omit <code>time</code>, the 8 minutes before and 8 minutes after this time are searched.
     * </p>
     * <p>
     * The <code>time</code> value is specified as epoch time, which is the number of seconds since
     * <code>January 1, 1970, 00:00:00 UTC</code>.
     * </p>
     * 
     * @param time
     *        The time to set as the center of the query. If you specify <code>time</code>, the 15 minutes before this
     *        time are queries. If you omit <code>time</code>, the 8 minutes before and 8 minutes after this time are
     *        searched.</p>
     *        <p>
     *        The <code>time</code> value is specified as epoch time, which is the number of seconds since
     *        <code>January 1, 1970, 00:00:00 UTC</code>.
     */

    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * <p>
     * The time to set as the center of the query. If you specify <code>time</code>, the 15 minutes before this time are
     * queries. If you omit <code>time</code>, the 8 minutes before and 8 minutes after this time are searched.
     * </p>
     * <p>
     * The <code>time</code> value is specified as epoch time, which is the number of seconds since
     * <code>January 1, 1970, 00:00:00 UTC</code>.
     * </p>
     * 
     * @return The time to set as the center of the query. If you specify <code>time</code>, the 15 minutes before this
     *         time are queries. If you omit <code>time</code>, the 8 minutes before and 8 minutes after this time are
     *         searched.</p>
     *         <p>
     *         The <code>time</code> value is specified as epoch time, which is the number of seconds since
     *         <code>January 1, 1970, 00:00:00 UTC</code>.
     */

    public Long getTime() {
        return this.time;
    }

    /**
     * <p>
     * The time to set as the center of the query. If you specify <code>time</code>, the 15 minutes before this time are
     * queries. If you omit <code>time</code>, the 8 minutes before and 8 minutes after this time are searched.
     * </p>
     * <p>
     * The <code>time</code> value is specified as epoch time, which is the number of seconds since
     * <code>January 1, 1970, 00:00:00 UTC</code>.
     * </p>
     * 
     * @param time
     *        The time to set as the center of the query. If you specify <code>time</code>, the 15 minutes before this
     *        time are queries. If you omit <code>time</code>, the 8 minutes before and 8 minutes after this time are
     *        searched.</p>
     *        <p>
     *        The <code>time</code> value is specified as epoch time, which is the number of seconds since
     *        <code>January 1, 1970, 00:00:00 UTC</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogGroupFieldsRequest withTime(Long time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * Specify either the name or ARN of the log group to view. If the log group is in a source account and you are
     * using a monitoring account, you must specify the ARN.
     * </p>
     * <p>
     * If you specify values for both <code>logGroupName</code> and <code>logGroupIdentifier</code>, the action returns
     * an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param logGroupIdentifier
     *        Specify either the name or ARN of the log group to view. If the log group is in a source account and you
     *        are using a monitoring account, you must specify the ARN.</p>
     *        <p>
     *        If you specify values for both <code>logGroupName</code> and <code>logGroupIdentifier</code>, the action
     *        returns an <code>InvalidParameterException</code> error.
     */

    public void setLogGroupIdentifier(String logGroupIdentifier) {
        this.logGroupIdentifier = logGroupIdentifier;
    }

    /**
     * <p>
     * Specify either the name or ARN of the log group to view. If the log group is in a source account and you are
     * using a monitoring account, you must specify the ARN.
     * </p>
     * <p>
     * If you specify values for both <code>logGroupName</code> and <code>logGroupIdentifier</code>, the action returns
     * an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @return Specify either the name or ARN of the log group to view. If the log group is in a source account and you
     *         are using a monitoring account, you must specify the ARN.</p>
     *         <p>
     *         If you specify values for both <code>logGroupName</code> and <code>logGroupIdentifier</code>, the action
     *         returns an <code>InvalidParameterException</code> error.
     */

    public String getLogGroupIdentifier() {
        return this.logGroupIdentifier;
    }

    /**
     * <p>
     * Specify either the name or ARN of the log group to view. If the log group is in a source account and you are
     * using a monitoring account, you must specify the ARN.
     * </p>
     * <p>
     * If you specify values for both <code>logGroupName</code> and <code>logGroupIdentifier</code>, the action returns
     * an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param logGroupIdentifier
     *        Specify either the name or ARN of the log group to view. If the log group is in a source account and you
     *        are using a monitoring account, you must specify the ARN.</p>
     *        <p>
     *        If you specify values for both <code>logGroupName</code> and <code>logGroupIdentifier</code>, the action
     *        returns an <code>InvalidParameterException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogGroupFieldsRequest withLogGroupIdentifier(String logGroupIdentifier) {
        setLogGroupIdentifier(logGroupIdentifier);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getTime() != null)
            sb.append("Time: ").append(getTime()).append(",");
        if (getLogGroupIdentifier() != null)
            sb.append("LogGroupIdentifier: ").append(getLogGroupIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLogGroupFieldsRequest == false)
            return false;
        GetLogGroupFieldsRequest other = (GetLogGroupFieldsRequest) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        if (other.getLogGroupIdentifier() == null ^ this.getLogGroupIdentifier() == null)
            return false;
        if (other.getLogGroupIdentifier() != null && other.getLogGroupIdentifier().equals(this.getLogGroupIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getLogGroupIdentifier() == null) ? 0 : getLogGroupIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetLogGroupFieldsRequest clone() {
        return (GetLogGroupFieldsRequest) super.clone();
    }

}

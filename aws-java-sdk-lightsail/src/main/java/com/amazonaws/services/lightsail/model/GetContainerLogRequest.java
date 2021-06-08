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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerLog" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContainerLogRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the container service for which to get a container log.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The name of the container that is either running or previously ran on the container service for which to return a
     * log.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The start of the time interval for which to get log data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify <code>1538424000</code> as
     * the start time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time interval for which to get log data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify <code>1538427600</code> as
     * the end time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The pattern to use to filter the returned log events to a specific term.
     * </p>
     * <p>
     * The following are a few examples of filter patterns that you can specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To return all log events, specify a filter pattern of <code>""</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude log events that contain the <code>ERROR</code> term, and return all other log events, specify a filter
     * pattern of <code>"-ERROR"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To return log events that contain the <code>ERROR</code> term, specify a filter pattern of <code>"ERROR"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To return log events that contain both the <code>ERROR</code> and <code>Exception</code> terms, specify a filter
     * pattern of <code>"ERROR Exception"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To return log events that contain the <code>ERROR</code> <i>or</i> the <code>Exception</code> term, specify a
     * filter pattern of <code>"?ERROR ?Exception"</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String filterPattern;
    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetContainerLog</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * The name of the container service for which to get a container log.
     * </p>
     * 
     * @param serviceName
     *        The name of the container service for which to get a container log.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the container service for which to get a container log.
     * </p>
     * 
     * @return The name of the container service for which to get a container log.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the container service for which to get a container log.
     * </p>
     * 
     * @param serviceName
     *        The name of the container service for which to get a container log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerLogRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The name of the container that is either running or previously ran on the container service for which to return a
     * log.
     * </p>
     * 
     * @param containerName
     *        The name of the container that is either running or previously ran on the container service for which to
     *        return a log.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of the container that is either running or previously ran on the container service for which to return a
     * log.
     * </p>
     * 
     * @return The name of the container that is either running or previously ran on the container service for which to
     *         return a log.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name of the container that is either running or previously ran on the container service for which to return a
     * log.
     * </p>
     * 
     * @param containerName
     *        The name of the container that is either running or previously ran on the container service for which to
     *        return a log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerLogRequest withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The start of the time interval for which to get log data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify <code>1538424000</code> as
     * the start time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @param startTime
     *        The start of the time interval for which to get log data.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify
     *        <code>1538424000</code> as the start time.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can convert a human-friendly time to Unix time format using a converter like <a
     *        href="https://www.epochconverter.com/">Epoch converter</a>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time interval for which to get log data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify <code>1538424000</code> as
     * the start time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @return The start of the time interval for which to get log data.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specified in Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in the Unix time format.
     *         </p>
     *         <p>
     *         For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify
     *         <code>1538424000</code> as the start time.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can convert a human-friendly time to Unix time format using a converter like <a
     *         href="https://www.epochconverter.com/">Epoch converter</a>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start of the time interval for which to get log data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify <code>1538424000</code> as
     * the start time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @param startTime
     *        The start of the time interval for which to get log data.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify
     *        <code>1538424000</code> as the start time.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can convert a human-friendly time to Unix time format using a converter like <a
     *        href="https://www.epochconverter.com/">Epoch converter</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerLogRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time interval for which to get log data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify <code>1538427600</code> as
     * the end time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @param endTime
     *        The end of the time interval for which to get log data.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify
     *        <code>1538427600</code> as the end time.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can convert a human-friendly time to Unix time format using a converter like <a
     *        href="https://www.epochconverter.com/">Epoch converter</a>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time interval for which to get log data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify <code>1538427600</code> as
     * the end time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @return The end of the time interval for which to get log data.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specified in Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in the Unix time format.
     *         </p>
     *         <p>
     *         For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify
     *         <code>1538427600</code> as the end time.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can convert a human-friendly time to Unix time format using a converter like <a
     *         href="https://www.epochconverter.com/">Epoch converter</a>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time interval for which to get log data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify <code>1538427600</code> as
     * the end time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @param endTime
     *        The end of the time interval for which to get log data.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify
     *        <code>1538427600</code> as the end time.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can convert a human-friendly time to Unix time format using a converter like <a
     *        href="https://www.epochconverter.com/">Epoch converter</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerLogRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The pattern to use to filter the returned log events to a specific term.
     * </p>
     * <p>
     * The following are a few examples of filter patterns that you can specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To return all log events, specify a filter pattern of <code>""</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude log events that contain the <code>ERROR</code> term, and return all other log events, specify a filter
     * pattern of <code>"-ERROR"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To return log events that contain the <code>ERROR</code> term, specify a filter pattern of <code>"ERROR"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To return log events that contain both the <code>ERROR</code> and <code>Exception</code> terms, specify a filter
     * pattern of <code>"ERROR Exception"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To return log events that contain the <code>ERROR</code> <i>or</i> the <code>Exception</code> term, specify a
     * filter pattern of <code>"?ERROR ?Exception"</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filterPattern
     *        The pattern to use to filter the returned log events to a specific term.</p>
     *        <p>
     *        The following are a few examples of filter patterns that you can specify:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To return all log events, specify a filter pattern of <code>""</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To exclude log events that contain the <code>ERROR</code> term, and return all other log events, specify a
     *        filter pattern of <code>"-ERROR"</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To return log events that contain the <code>ERROR</code> term, specify a filter pattern of
     *        <code>"ERROR"</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To return log events that contain both the <code>ERROR</code> and <code>Exception</code> terms, specify a
     *        filter pattern of <code>"ERROR Exception"</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To return log events that contain the <code>ERROR</code> <i>or</i> the <code>Exception</code> term,
     *        specify a filter pattern of <code>"?ERROR ?Exception"</code>.
     *        </p>
     *        </li>
     */

    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    /**
     * <p>
     * The pattern to use to filter the returned log events to a specific term.
     * </p>
     * <p>
     * The following are a few examples of filter patterns that you can specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To return all log events, specify a filter pattern of <code>""</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude log events that contain the <code>ERROR</code> term, and return all other log events, specify a filter
     * pattern of <code>"-ERROR"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To return log events that contain the <code>ERROR</code> term, specify a filter pattern of <code>"ERROR"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To return log events that contain both the <code>ERROR</code> and <code>Exception</code> terms, specify a filter
     * pattern of <code>"ERROR Exception"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To return log events that contain the <code>ERROR</code> <i>or</i> the <code>Exception</code> term, specify a
     * filter pattern of <code>"?ERROR ?Exception"</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The pattern to use to filter the returned log events to a specific term.</p>
     *         <p>
     *         The following are a few examples of filter patterns that you can specify:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To return all log events, specify a filter pattern of <code>""</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To exclude log events that contain the <code>ERROR</code> term, and return all other log events, specify
     *         a filter pattern of <code>"-ERROR"</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To return log events that contain the <code>ERROR</code> term, specify a filter pattern of
     *         <code>"ERROR"</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To return log events that contain both the <code>ERROR</code> and <code>Exception</code> terms, specify a
     *         filter pattern of <code>"ERROR Exception"</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To return log events that contain the <code>ERROR</code> <i>or</i> the <code>Exception</code> term,
     *         specify a filter pattern of <code>"?ERROR ?Exception"</code>.
     *         </p>
     *         </li>
     */

    public String getFilterPattern() {
        return this.filterPattern;
    }

    /**
     * <p>
     * The pattern to use to filter the returned log events to a specific term.
     * </p>
     * <p>
     * The following are a few examples of filter patterns that you can specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To return all log events, specify a filter pattern of <code>""</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude log events that contain the <code>ERROR</code> term, and return all other log events, specify a filter
     * pattern of <code>"-ERROR"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To return log events that contain the <code>ERROR</code> term, specify a filter pattern of <code>"ERROR"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To return log events that contain both the <code>ERROR</code> and <code>Exception</code> terms, specify a filter
     * pattern of <code>"ERROR Exception"</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To return log events that contain the <code>ERROR</code> <i>or</i> the <code>Exception</code> term, specify a
     * filter pattern of <code>"?ERROR ?Exception"</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filterPattern
     *        The pattern to use to filter the returned log events to a specific term.</p>
     *        <p>
     *        The following are a few examples of filter patterns that you can specify:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To return all log events, specify a filter pattern of <code>""</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To exclude log events that contain the <code>ERROR</code> term, and return all other log events, specify a
     *        filter pattern of <code>"-ERROR"</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To return log events that contain the <code>ERROR</code> term, specify a filter pattern of
     *        <code>"ERROR"</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To return log events that contain both the <code>ERROR</code> and <code>Exception</code> terms, specify a
     *        filter pattern of <code>"ERROR Exception"</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To return log events that contain the <code>ERROR</code> <i>or</i> the <code>Exception</code> term,
     *        specify a filter pattern of <code>"?ERROR ?Exception"</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerLogRequest withFilterPattern(String filterPattern) {
        setFilterPattern(filterPattern);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetContainerLog</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     * 
     * @param pageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        To get a page token, perform an initial <code>GetContainerLog</code> request. If your results are
     *        paginated, the response will return a next page token that you can specify as the page token in a
     *        subsequent request.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetContainerLog</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     * 
     * @return The token to advance to the next page of results from your request.</p>
     *         <p>
     *         To get a page token, perform an initial <code>GetContainerLog</code> request. If your results are
     *         paginated, the response will return a next page token that you can specify as the page token in a
     *         subsequent request.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetContainerLog</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     * 
     * @param pageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        To get a page token, perform an initial <code>GetContainerLog</code> request. If your results are
     *        paginated, the response will return a next page token that you can specify as the page token in a
     *        subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerLogRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
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
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getFilterPattern() != null)
            sb.append("FilterPattern: ").append(getFilterPattern()).append(",");
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContainerLogRequest == false)
            return false;
        GetContainerLogRequest other = (GetContainerLogRequest) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null)
            return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetContainerLogRequest clone() {
        return (GetContainerLogRequest) super.clone();
    }

}

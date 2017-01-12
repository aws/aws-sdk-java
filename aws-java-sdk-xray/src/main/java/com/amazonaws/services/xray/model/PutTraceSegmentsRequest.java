/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutTraceSegments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutTraceSegmentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A JSON document defining one or more segments or subsegments. Segments must include the following fields.
     * </p>
     * <p class="title">
     * <b>Required Segment Document Fields</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>name</code> - The name of the service that handled the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>id</code> - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal
     * digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trace_id</code> - A unique identifier that connects all segments and subsegments originating from a single
     * client request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start_time</code> - Time the segment or subsegment was created, in floating point seconds in epoch time,
     * accurate to milliseconds. For example, <code>1480615200.010</code> or <code>1.480615200010E9</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end_time</code> - Time the segment or subsegment was closed. For example, <code>1480615200.090</code> or
     * <code>1.480615200090E9</code>. Specify either an <code>end_time</code> or <code>in_progress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>in_progress</code> - Set to <code>true</code> instead of specifying an <code>end_time</code> to record that
     * a segment has been started, but is not complete. Send an in progress segment when your application receives a
     * request that will take a long time to serve, to trace the fact that the request was received. When the response
     * is sent, send the complete segment to overwrite the in-progress segment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A <code>trace_id</code> consists of three numbers separated by hyphens. For example,
     * 1-58406520-a006649127e371903a2de979. This includes:
     * </p>
     * <p class="title">
     * <b>Trace ID Format</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The version number, i.e. <code>1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd,
     * 2016 PST in epoch time is <code>1480615200</code> seconds, or <code>58406520</code> in hexadecimal.
     * </p>
     * </li>
     * <li>
     * <p>
     * A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> traceSegmentDocuments;

    /**
     * <p>
     * A JSON document defining one or more segments or subsegments. Segments must include the following fields.
     * </p>
     * <p class="title">
     * <b>Required Segment Document Fields</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>name</code> - The name of the service that handled the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>id</code> - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal
     * digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trace_id</code> - A unique identifier that connects all segments and subsegments originating from a single
     * client request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start_time</code> - Time the segment or subsegment was created, in floating point seconds in epoch time,
     * accurate to milliseconds. For example, <code>1480615200.010</code> or <code>1.480615200010E9</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end_time</code> - Time the segment or subsegment was closed. For example, <code>1480615200.090</code> or
     * <code>1.480615200090E9</code>. Specify either an <code>end_time</code> or <code>in_progress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>in_progress</code> - Set to <code>true</code> instead of specifying an <code>end_time</code> to record that
     * a segment has been started, but is not complete. Send an in progress segment when your application receives a
     * request that will take a long time to serve, to trace the fact that the request was received. When the response
     * is sent, send the complete segment to overwrite the in-progress segment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A <code>trace_id</code> consists of three numbers separated by hyphens. For example,
     * 1-58406520-a006649127e371903a2de979. This includes:
     * </p>
     * <p class="title">
     * <b>Trace ID Format</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The version number, i.e. <code>1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd,
     * 2016 PST in epoch time is <code>1480615200</code> seconds, or <code>58406520</code> in hexadecimal.
     * </p>
     * </li>
     * <li>
     * <p>
     * A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A JSON document defining one or more segments or subsegments. Segments must include the following
     *         fields.</p>
     *         <p class="title">
     *         <b>Required Segment Document Fields</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>name</code> - The name of the service that handled the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>id</code> - A 64-bit identifier for the segment, unique among segments in the same trace, in 16
     *         hexadecimal digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>trace_id</code> - A unique identifier that connects all segments and subsegments originating from a
     *         single client request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>start_time</code> - Time the segment or subsegment was created, in floating point seconds in epoch
     *         time, accurate to milliseconds. For example, <code>1480615200.010</code> or <code>1.480615200010E9</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>end_time</code> - Time the segment or subsegment was closed. For example,
     *         <code>1480615200.090</code> or <code>1.480615200090E9</code>. Specify either an <code>end_time</code> or
     *         <code>in_progress</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>in_progress</code> - Set to <code>true</code> instead of specifying an <code>end_time</code> to
     *         record that a segment has been started, but is not complete. Send an in progress segment when your
     *         application receives a request that will take a long time to serve, to trace the fact that the request
     *         was received. When the response is sent, send the complete segment to overwrite the in-progress segment.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         A <code>trace_id</code> consists of three numbers separated by hyphens. For example,
     *         1-58406520-a006649127e371903a2de979. This includes:
     *         </p>
     *         <p class="title">
     *         <b>Trace ID Format</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The version number, i.e. <code>1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM
     *         December 2nd, 2016 PST in epoch time is <code>1480615200</code> seconds, or <code>58406520</code> in
     *         hexadecimal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getTraceSegmentDocuments() {
        return traceSegmentDocuments;
    }

    /**
     * <p>
     * A JSON document defining one or more segments or subsegments. Segments must include the following fields.
     * </p>
     * <p class="title">
     * <b>Required Segment Document Fields</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>name</code> - The name of the service that handled the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>id</code> - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal
     * digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trace_id</code> - A unique identifier that connects all segments and subsegments originating from a single
     * client request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start_time</code> - Time the segment or subsegment was created, in floating point seconds in epoch time,
     * accurate to milliseconds. For example, <code>1480615200.010</code> or <code>1.480615200010E9</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end_time</code> - Time the segment or subsegment was closed. For example, <code>1480615200.090</code> or
     * <code>1.480615200090E9</code>. Specify either an <code>end_time</code> or <code>in_progress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>in_progress</code> - Set to <code>true</code> instead of specifying an <code>end_time</code> to record that
     * a segment has been started, but is not complete. Send an in progress segment when your application receives a
     * request that will take a long time to serve, to trace the fact that the request was received. When the response
     * is sent, send the complete segment to overwrite the in-progress segment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A <code>trace_id</code> consists of three numbers separated by hyphens. For example,
     * 1-58406520-a006649127e371903a2de979. This includes:
     * </p>
     * <p class="title">
     * <b>Trace ID Format</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The version number, i.e. <code>1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd,
     * 2016 PST in epoch time is <code>1480615200</code> seconds, or <code>58406520</code> in hexadecimal.
     * </p>
     * </li>
     * <li>
     * <p>
     * A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param traceSegmentDocuments
     *        A JSON document defining one or more segments or subsegments. Segments must include the following
     *        fields.</p>
     *        <p class="title">
     *        <b>Required Segment Document Fields</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>name</code> - The name of the service that handled the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>id</code> - A 64-bit identifier for the segment, unique among segments in the same trace, in 16
     *        hexadecimal digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>trace_id</code> - A unique identifier that connects all segments and subsegments originating from a
     *        single client request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start_time</code> - Time the segment or subsegment was created, in floating point seconds in epoch
     *        time, accurate to milliseconds. For example, <code>1480615200.010</code> or <code>1.480615200010E9</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>end_time</code> - Time the segment or subsegment was closed. For example,
     *        <code>1480615200.090</code> or <code>1.480615200090E9</code>. Specify either an <code>end_time</code> or
     *        <code>in_progress</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>in_progress</code> - Set to <code>true</code> instead of specifying an <code>end_time</code> to
     *        record that a segment has been started, but is not complete. Send an in progress segment when your
     *        application receives a request that will take a long time to serve, to trace the fact that the request was
     *        received. When the response is sent, send the complete segment to overwrite the in-progress segment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        A <code>trace_id</code> consists of three numbers separated by hyphens. For example,
     *        1-58406520-a006649127e371903a2de979. This includes:
     *        </p>
     *        <p class="title">
     *        <b>Trace ID Format</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The version number, i.e. <code>1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM
     *        December 2nd, 2016 PST in epoch time is <code>1480615200</code> seconds, or <code>58406520</code> in
     *        hexadecimal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.
     *        </p>
     *        </li>
     */

    public void setTraceSegmentDocuments(java.util.Collection<String> traceSegmentDocuments) {
        if (traceSegmentDocuments == null) {
            this.traceSegmentDocuments = null;
            return;
        }

        this.traceSegmentDocuments = new java.util.ArrayList<String>(traceSegmentDocuments);
    }

    /**
     * <p>
     * A JSON document defining one or more segments or subsegments. Segments must include the following fields.
     * </p>
     * <p class="title">
     * <b>Required Segment Document Fields</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>name</code> - The name of the service that handled the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>id</code> - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal
     * digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trace_id</code> - A unique identifier that connects all segments and subsegments originating from a single
     * client request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start_time</code> - Time the segment or subsegment was created, in floating point seconds in epoch time,
     * accurate to milliseconds. For example, <code>1480615200.010</code> or <code>1.480615200010E9</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end_time</code> - Time the segment or subsegment was closed. For example, <code>1480615200.090</code> or
     * <code>1.480615200090E9</code>. Specify either an <code>end_time</code> or <code>in_progress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>in_progress</code> - Set to <code>true</code> instead of specifying an <code>end_time</code> to record that
     * a segment has been started, but is not complete. Send an in progress segment when your application receives a
     * request that will take a long time to serve, to trace the fact that the request was received. When the response
     * is sent, send the complete segment to overwrite the in-progress segment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A <code>trace_id</code> consists of three numbers separated by hyphens. For example,
     * 1-58406520-a006649127e371903a2de979. This includes:
     * </p>
     * <p class="title">
     * <b>Trace ID Format</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The version number, i.e. <code>1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd,
     * 2016 PST in epoch time is <code>1480615200</code> seconds, or <code>58406520</code> in hexadecimal.
     * </p>
     * </li>
     * <li>
     * <p>
     * A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTraceSegmentDocuments(java.util.Collection)} or
     * {@link #withTraceSegmentDocuments(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param traceSegmentDocuments
     *        A JSON document defining one or more segments or subsegments. Segments must include the following
     *        fields.</p>
     *        <p class="title">
     *        <b>Required Segment Document Fields</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>name</code> - The name of the service that handled the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>id</code> - A 64-bit identifier for the segment, unique among segments in the same trace, in 16
     *        hexadecimal digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>trace_id</code> - A unique identifier that connects all segments and subsegments originating from a
     *        single client request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start_time</code> - Time the segment or subsegment was created, in floating point seconds in epoch
     *        time, accurate to milliseconds. For example, <code>1480615200.010</code> or <code>1.480615200010E9</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>end_time</code> - Time the segment or subsegment was closed. For example,
     *        <code>1480615200.090</code> or <code>1.480615200090E9</code>. Specify either an <code>end_time</code> or
     *        <code>in_progress</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>in_progress</code> - Set to <code>true</code> instead of specifying an <code>end_time</code> to
     *        record that a segment has been started, but is not complete. Send an in progress segment when your
     *        application receives a request that will take a long time to serve, to trace the fact that the request was
     *        received. When the response is sent, send the complete segment to overwrite the in-progress segment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        A <code>trace_id</code> consists of three numbers separated by hyphens. For example,
     *        1-58406520-a006649127e371903a2de979. This includes:
     *        </p>
     *        <p class="title">
     *        <b>Trace ID Format</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The version number, i.e. <code>1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM
     *        December 2nd, 2016 PST in epoch time is <code>1480615200</code> seconds, or <code>58406520</code> in
     *        hexadecimal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTraceSegmentsRequest withTraceSegmentDocuments(String... traceSegmentDocuments) {
        if (this.traceSegmentDocuments == null) {
            setTraceSegmentDocuments(new java.util.ArrayList<String>(traceSegmentDocuments.length));
        }
        for (String ele : traceSegmentDocuments) {
            this.traceSegmentDocuments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON document defining one or more segments or subsegments. Segments must include the following fields.
     * </p>
     * <p class="title">
     * <b>Required Segment Document Fields</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>name</code> - The name of the service that handled the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>id</code> - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal
     * digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trace_id</code> - A unique identifier that connects all segments and subsegments originating from a single
     * client request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start_time</code> - Time the segment or subsegment was created, in floating point seconds in epoch time,
     * accurate to milliseconds. For example, <code>1480615200.010</code> or <code>1.480615200010E9</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end_time</code> - Time the segment or subsegment was closed. For example, <code>1480615200.090</code> or
     * <code>1.480615200090E9</code>. Specify either an <code>end_time</code> or <code>in_progress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>in_progress</code> - Set to <code>true</code> instead of specifying an <code>end_time</code> to record that
     * a segment has been started, but is not complete. Send an in progress segment when your application receives a
     * request that will take a long time to serve, to trace the fact that the request was received. When the response
     * is sent, send the complete segment to overwrite the in-progress segment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A <code>trace_id</code> consists of three numbers separated by hyphens. For example,
     * 1-58406520-a006649127e371903a2de979. This includes:
     * </p>
     * <p class="title">
     * <b>Trace ID Format</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The version number, i.e. <code>1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd,
     * 2016 PST in epoch time is <code>1480615200</code> seconds, or <code>58406520</code> in hexadecimal.
     * </p>
     * </li>
     * <li>
     * <p>
     * A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param traceSegmentDocuments
     *        A JSON document defining one or more segments or subsegments. Segments must include the following
     *        fields.</p>
     *        <p class="title">
     *        <b>Required Segment Document Fields</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>name</code> - The name of the service that handled the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>id</code> - A 64-bit identifier for the segment, unique among segments in the same trace, in 16
     *        hexadecimal digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>trace_id</code> - A unique identifier that connects all segments and subsegments originating from a
     *        single client request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start_time</code> - Time the segment or subsegment was created, in floating point seconds in epoch
     *        time, accurate to milliseconds. For example, <code>1480615200.010</code> or <code>1.480615200010E9</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>end_time</code> - Time the segment or subsegment was closed. For example,
     *        <code>1480615200.090</code> or <code>1.480615200090E9</code>. Specify either an <code>end_time</code> or
     *        <code>in_progress</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>in_progress</code> - Set to <code>true</code> instead of specifying an <code>end_time</code> to
     *        record that a segment has been started, but is not complete. Send an in progress segment when your
     *        application receives a request that will take a long time to serve, to trace the fact that the request was
     *        received. When the response is sent, send the complete segment to overwrite the in-progress segment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        A <code>trace_id</code> consists of three numbers separated by hyphens. For example,
     *        1-58406520-a006649127e371903a2de979. This includes:
     *        </p>
     *        <p class="title">
     *        <b>Trace ID Format</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The version number, i.e. <code>1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM
     *        December 2nd, 2016 PST in epoch time is <code>1480615200</code> seconds, or <code>58406520</code> in
     *        hexadecimal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTraceSegmentsRequest withTraceSegmentDocuments(java.util.Collection<String> traceSegmentDocuments) {
        setTraceSegmentDocuments(traceSegmentDocuments);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTraceSegmentDocuments() != null)
            sb.append("TraceSegmentDocuments: ").append(getTraceSegmentDocuments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutTraceSegmentsRequest == false)
            return false;
        PutTraceSegmentsRequest other = (PutTraceSegmentsRequest) obj;
        if (other.getTraceSegmentDocuments() == null ^ this.getTraceSegmentDocuments() == null)
            return false;
        if (other.getTraceSegmentDocuments() != null && other.getTraceSegmentDocuments().equals(this.getTraceSegmentDocuments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTraceSegmentDocuments() == null) ? 0 : getTraceSegmentDocuments().hashCode());
        return hashCode;
    }

    @Override
    public PutTraceSegmentsRequest clone() {
        return (PutTraceSegmentsRequest) super.clone();
    }

}

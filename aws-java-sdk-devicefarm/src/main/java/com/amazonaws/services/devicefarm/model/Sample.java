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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a sample of performance data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/Sample" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Sample implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sample's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The sample's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CPU: A CPU sample type. This is expressed as the app processing CPU time (including child processes) as reported
     * by process, as a percentage.
     * </p>
     * </li>
     * <li>
     * <p>
     * MEMORY: A memory usage sample type. This is expressed as the total proportional set size of an app process, in
     * kilobytes.
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_AVG_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_FPS
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_FRAMES
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_MAX_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_MIN_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_AVG_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_FPS
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_FRAMES
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_MAX_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_MIN_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * RX
     * </p>
     * </li>
     * <li>
     * <p>
     * RX_RATE: The total number of bytes per second (TCP and UDP) that are sent, by app process.
     * </p>
     * </li>
     * <li>
     * <p>
     * THREADS: A threads sample type. This is expressed as the total number of threads per app process.
     * </p>
     * </li>
     * <li>
     * <p>
     * TX
     * </p>
     * </li>
     * <li>
     * <p>
     * TX_RATE: The total number of bytes per second (TCP and UDP) that are received, by app process.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The pre-signed Amazon S3 URL that can be used with a corresponding GET request to download the sample's file.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The sample's ARN.
     * </p>
     * 
     * @param arn
     *        The sample's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The sample's ARN.
     * </p>
     * 
     * @return The sample's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The sample's ARN.
     * </p>
     * 
     * @param arn
     *        The sample's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sample withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The sample's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CPU: A CPU sample type. This is expressed as the app processing CPU time (including child processes) as reported
     * by process, as a percentage.
     * </p>
     * </li>
     * <li>
     * <p>
     * MEMORY: A memory usage sample type. This is expressed as the total proportional set size of an app process, in
     * kilobytes.
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_AVG_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_FPS
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_FRAMES
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_MAX_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_MIN_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_AVG_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_FPS
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_FRAMES
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_MAX_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_MIN_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * RX
     * </p>
     * </li>
     * <li>
     * <p>
     * RX_RATE: The total number of bytes per second (TCP and UDP) that are sent, by app process.
     * </p>
     * </li>
     * <li>
     * <p>
     * THREADS: A threads sample type. This is expressed as the total number of threads per app process.
     * </p>
     * </li>
     * <li>
     * <p>
     * TX
     * </p>
     * </li>
     * <li>
     * <p>
     * TX_RATE: The total number of bytes per second (TCP and UDP) that are received, by app process.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The sample's type.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CPU: A CPU sample type. This is expressed as the app processing CPU time (including child processes) as
     *        reported by process, as a percentage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MEMORY: A memory usage sample type. This is expressed as the total proportional set size of an app
     *        process, in kilobytes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_AVG_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_FPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_FRAMES
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_MAX_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_MIN_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_AVG_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_FPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_FRAMES
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_MAX_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_MIN_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RX
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RX_RATE: The total number of bytes per second (TCP and UDP) that are sent, by app process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        THREADS: A threads sample type. This is expressed as the total number of threads per app process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TX
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TX_RATE: The total number of bytes per second (TCP and UDP) that are received, by app process.
     *        </p>
     *        </li>
     * @see SampleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The sample's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CPU: A CPU sample type. This is expressed as the app processing CPU time (including child processes) as reported
     * by process, as a percentage.
     * </p>
     * </li>
     * <li>
     * <p>
     * MEMORY: A memory usage sample type. This is expressed as the total proportional set size of an app process, in
     * kilobytes.
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_AVG_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_FPS
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_FRAMES
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_MAX_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_MIN_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_AVG_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_FPS
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_FRAMES
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_MAX_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_MIN_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * RX
     * </p>
     * </li>
     * <li>
     * <p>
     * RX_RATE: The total number of bytes per second (TCP and UDP) that are sent, by app process.
     * </p>
     * </li>
     * <li>
     * <p>
     * THREADS: A threads sample type. This is expressed as the total number of threads per app process.
     * </p>
     * </li>
     * <li>
     * <p>
     * TX
     * </p>
     * </li>
     * <li>
     * <p>
     * TX_RATE: The total number of bytes per second (TCP and UDP) that are received, by app process.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The sample's type.</p>
     *         <p>
     *         Must be one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CPU: A CPU sample type. This is expressed as the app processing CPU time (including child processes) as
     *         reported by process, as a percentage.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMORY: A memory usage sample type. This is expressed as the total proportional set size of an app
     *         process, in kilobytes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NATIVE_AVG_DRAWTIME
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NATIVE_FPS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NATIVE_FRAMES
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NATIVE_MAX_DRAWTIME
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NATIVE_MIN_DRAWTIME
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OPENGL_AVG_DRAWTIME
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OPENGL_FPS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OPENGL_FRAMES
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OPENGL_MAX_DRAWTIME
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OPENGL_MIN_DRAWTIME
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RX
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RX_RATE: The total number of bytes per second (TCP and UDP) that are sent, by app process.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         THREADS: A threads sample type. This is expressed as the total number of threads per app process.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TX
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TX_RATE: The total number of bytes per second (TCP and UDP) that are received, by app process.
     *         </p>
     *         </li>
     * @see SampleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The sample's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CPU: A CPU sample type. This is expressed as the app processing CPU time (including child processes) as reported
     * by process, as a percentage.
     * </p>
     * </li>
     * <li>
     * <p>
     * MEMORY: A memory usage sample type. This is expressed as the total proportional set size of an app process, in
     * kilobytes.
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_AVG_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_FPS
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_FRAMES
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_MAX_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_MIN_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_AVG_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_FPS
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_FRAMES
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_MAX_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_MIN_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * RX
     * </p>
     * </li>
     * <li>
     * <p>
     * RX_RATE: The total number of bytes per second (TCP and UDP) that are sent, by app process.
     * </p>
     * </li>
     * <li>
     * <p>
     * THREADS: A threads sample type. This is expressed as the total number of threads per app process.
     * </p>
     * </li>
     * <li>
     * <p>
     * TX
     * </p>
     * </li>
     * <li>
     * <p>
     * TX_RATE: The total number of bytes per second (TCP and UDP) that are received, by app process.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The sample's type.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CPU: A CPU sample type. This is expressed as the app processing CPU time (including child processes) as
     *        reported by process, as a percentage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MEMORY: A memory usage sample type. This is expressed as the total proportional set size of an app
     *        process, in kilobytes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_AVG_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_FPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_FRAMES
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_MAX_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_MIN_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_AVG_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_FPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_FRAMES
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_MAX_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_MIN_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RX
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RX_RATE: The total number of bytes per second (TCP and UDP) that are sent, by app process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        THREADS: A threads sample type. This is expressed as the total number of threads per app process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TX
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TX_RATE: The total number of bytes per second (TCP and UDP) that are received, by app process.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SampleType
     */

    public Sample withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The sample's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CPU: A CPU sample type. This is expressed as the app processing CPU time (including child processes) as reported
     * by process, as a percentage.
     * </p>
     * </li>
     * <li>
     * <p>
     * MEMORY: A memory usage sample type. This is expressed as the total proportional set size of an app process, in
     * kilobytes.
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_AVG_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_FPS
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_FRAMES
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_MAX_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_MIN_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_AVG_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_FPS
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_FRAMES
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_MAX_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_MIN_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * RX
     * </p>
     * </li>
     * <li>
     * <p>
     * RX_RATE: The total number of bytes per second (TCP and UDP) that are sent, by app process.
     * </p>
     * </li>
     * <li>
     * <p>
     * THREADS: A threads sample type. This is expressed as the total number of threads per app process.
     * </p>
     * </li>
     * <li>
     * <p>
     * TX
     * </p>
     * </li>
     * <li>
     * <p>
     * TX_RATE: The total number of bytes per second (TCP and UDP) that are received, by app process.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The sample's type.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CPU: A CPU sample type. This is expressed as the app processing CPU time (including child processes) as
     *        reported by process, as a percentage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MEMORY: A memory usage sample type. This is expressed as the total proportional set size of an app
     *        process, in kilobytes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_AVG_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_FPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_FRAMES
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_MAX_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_MIN_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_AVG_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_FPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_FRAMES
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_MAX_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_MIN_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RX
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RX_RATE: The total number of bytes per second (TCP and UDP) that are sent, by app process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        THREADS: A threads sample type. This is expressed as the total number of threads per app process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TX
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TX_RATE: The total number of bytes per second (TCP and UDP) that are received, by app process.
     *        </p>
     *        </li>
     * @see SampleType
     */

    public void setType(SampleType type) {
        withType(type);
    }

    /**
     * <p>
     * The sample's type.
     * </p>
     * <p>
     * Must be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CPU: A CPU sample type. This is expressed as the app processing CPU time (including child processes) as reported
     * by process, as a percentage.
     * </p>
     * </li>
     * <li>
     * <p>
     * MEMORY: A memory usage sample type. This is expressed as the total proportional set size of an app process, in
     * kilobytes.
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_AVG_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_FPS
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_FRAMES
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_MAX_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * NATIVE_MIN_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_AVG_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_FPS
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_FRAMES
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_MAX_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * OPENGL_MIN_DRAWTIME
     * </p>
     * </li>
     * <li>
     * <p>
     * RX
     * </p>
     * </li>
     * <li>
     * <p>
     * RX_RATE: The total number of bytes per second (TCP and UDP) that are sent, by app process.
     * </p>
     * </li>
     * <li>
     * <p>
     * THREADS: A threads sample type. This is expressed as the total number of threads per app process.
     * </p>
     * </li>
     * <li>
     * <p>
     * TX
     * </p>
     * </li>
     * <li>
     * <p>
     * TX_RATE: The total number of bytes per second (TCP and UDP) that are received, by app process.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The sample's type.</p>
     *        <p>
     *        Must be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CPU: A CPU sample type. This is expressed as the app processing CPU time (including child processes) as
     *        reported by process, as a percentage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MEMORY: A memory usage sample type. This is expressed as the total proportional set size of an app
     *        process, in kilobytes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_AVG_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_FPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_FRAMES
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_MAX_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NATIVE_MIN_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_AVG_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_FPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_FRAMES
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_MAX_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPENGL_MIN_DRAWTIME
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RX
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RX_RATE: The total number of bytes per second (TCP and UDP) that are sent, by app process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        THREADS: A threads sample type. This is expressed as the total number of threads per app process.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TX
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TX_RATE: The total number of bytes per second (TCP and UDP) that are received, by app process.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SampleType
     */

    public Sample withType(SampleType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The pre-signed Amazon S3 URL that can be used with a corresponding GET request to download the sample's file.
     * </p>
     * 
     * @param url
     *        The pre-signed Amazon S3 URL that can be used with a corresponding GET request to download the sample's
     *        file.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The pre-signed Amazon S3 URL that can be used with a corresponding GET request to download the sample's file.
     * </p>
     * 
     * @return The pre-signed Amazon S3 URL that can be used with a corresponding GET request to download the sample's
     *         file.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The pre-signed Amazon S3 URL that can be used with a corresponding GET request to download the sample's file.
     * </p>
     * 
     * @param url
     *        The pre-signed Amazon S3 URL that can be used with a corresponding GET request to download the sample's
     *        file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sample withUrl(String url) {
        setUrl(url);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Sample == false)
            return false;
        Sample other = (Sample) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public Sample clone() {
        try {
            return (Sample) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.SampleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

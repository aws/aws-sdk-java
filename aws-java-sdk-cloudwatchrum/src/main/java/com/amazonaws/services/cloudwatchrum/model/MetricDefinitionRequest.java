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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use this structure to define one extended metric that RUM will send to CloudWatch or CloudWatch Evidently. For more
 * information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-vended-metrics.html"> Additional
 * metrics that you can send to CloudWatch and CloudWatch Evidently</a>.
 * </p>
 * <p>
 * Only certain combinations of values for <code>Name</code>, <code>ValueKey</code>, and <code>EventPattern</code> are
 * valid. In addition to what is displayed in the list below, the <code>EventPattern</code> can also include information
 * used by the <code>DimensionKeys</code> field.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If <code>Name</code> is <code>PerformanceNavigationDuration</code>, then <code>ValueKey</code>must be
 * <code>event_details.duration</code> and the <code>EventPattern</code> must include
 * <code>{"event_type":["com.amazon.rum.performance_navigation_event"]}</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * If <code>Name</code> is <code>PerformanceResourceDuration</code>, then <code>ValueKey</code>must be
 * <code>event_details.duration</code> and the <code>EventPattern</code> must include
 * <code>{"event_type":["com.amazon.rum.performance_resource_event"]}</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * If <code>Name</code> is <code>NavigationSatisfiedTransaction</code>, then <code>ValueKey</code>must be null and the
 * <code>EventPattern</code> must include
 * <code>{ "event_type": ["com.amazon.rum.performance_navigation_event"], "event_details": { "duration": [{ "numeric": ["&gt;",2000] }] } }</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * If <code>Name</code> is <code>NavigationToleratedTransaction</code>, then <code>ValueKey</code>must be null and the
 * <code>EventPattern</code> must include
 * <code>{ "event_type": ["com.amazon.rum.performance_navigation_event"], "event_details": { "duration": [{ "numeric": ["&gt;=",2000,"&lt;"8000] }] } }</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * If <code>Name</code> is <code>NavigationFrustratedTransaction</code>, then <code>ValueKey</code>must be null and the
 * <code>EventPattern</code> must include
 * <code>{ "event_type": ["com.amazon.rum.performance_navigation_event"], "event_details": { "duration": [{ "numeric": ["&gt;=",8000] }] } }</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * If <code>Name</code> is <code>WebVitalsCumulativeLayoutShift</code>, then <code>ValueKey</code>must be
 * <code>event_details.value</code> and the <code>EventPattern</code> must include
 * <code>{"event_type":["com.amazon.rum.cumulative_layout_shift_event"]}</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * If <code>Name</code> is <code>WebVitalsFirstInputDelay</code>, then <code>ValueKey</code>must be
 * <code>event_details.value</code> and the <code>EventPattern</code> must include
 * <code>{"event_type":["com.amazon.rum.first_input_delay_event"]}</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * If <code>Name</code> is <code>WebVitalsLargestContentfulPaint</code>, then <code>ValueKey</code>must be
 * <code>event_details.value</code> and the <code>EventPattern</code> must include
 * <code>{"event_type":["com.amazon.rum.largest_contentful_paint_event"]}</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * If <code>Name</code> is <code>JsErrorCount</code>, then <code>ValueKey</code>must be null and the
 * <code>EventPattern</code> must include <code>{"event_type":["com.amazon.rum.js_error_event"]}</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * If <code>Name</code> is <code>HttpErrorCount</code>, then <code>ValueKey</code>must be null and the
 * <code>EventPattern</code> must include <code>{"event_type":["com.amazon.rum.http_event"]}</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * If <code>Name</code> is <code>SessionCount</code>, then <code>ValueKey</code>must be null and the
 * <code>EventPattern</code> must include <code>{"event_type":["com.amazon.rum.session_start_event"]}</code>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/MetricDefinitionRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDefinitionRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use this field only if you are sending the metric to CloudWatch.
     * </p>
     * <p>
     * This field is a map of field paths to dimension names. It defines the dimensions to associate with this metric in
     * CloudWatch. Valid values for the entries in this field are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"metadata.pageId": "PageId"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.browserName": "BrowserName"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.deviceType": "DeviceType"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.osName": "OSName"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.countryCode": "CountryCode"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"event_details.fileType": "FileType"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * All dimensions listed in this field must also be included in <code>EventPattern</code>.
     * </p>
     */
    private java.util.Map<String, String> dimensionKeys;
    /**
     * <p>
     * The pattern that defines the metric, specified as a JSON object. RUM checks events that happen in a user's
     * session against the pattern, and events that match the pattern are sent to the metric destination.
     * </p>
     * <p>
     * When you define extended metrics, the metric definition is not valid if <code>EventPattern</code> is omitted.
     * </p>
     * <p>
     * Example event patterns:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'{ "event_type": ["com.amazon.rum.js_error_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], } }'</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Firefox" ] }, "event_details": { "duration": [{ "numeric": [ "&lt;", 2000 ] }] } }'</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], "countryCode": [ "US" ] }, "event_details": { "duration": [{ "numeric": [ "&gt;=", 2000, "&lt;", 8000 ] }] } }'</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the metrics destination' is <code>CloudWatch</code> and the event also matches a value in
     * <code>DimensionKeys</code>, then the metric is published with the specified dimensions.
     * </p>
     */
    private String eventPattern;
    /**
     * <p>
     * The name for the metric that is defined in this structure. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PerformanceNavigationDuration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PerformanceResourceDuration </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NavigationSatisfiedTransaction</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NavigationToleratedTransaction</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NavigationFrustratedTransaction</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WebVitalsCumulativeLayoutShift</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WebVitalsFirstInputDelay</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WebVitalsLargestContentfulPaint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JsErrorCount</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HttpErrorCount</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SessionCount</code>
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The CloudWatch metric unit to use for this metric. If you omit this field, the metric is recorded with no unit.
     * </p>
     */
    private String unitLabel;
    /**
     * <p>
     * The field within the event object that the metric value is sourced from.
     * </p>
     * <p>
     * If you omit this field, a hardcoded value of 1 is pushed as the metric value. This is useful if you just want to
     * count the number of events that the filter catches.
     * </p>
     * <p>
     * If this metric is sent to CloudWatch Evidently, this field will be passed to Evidently raw and Evidently will
     * handle data extraction from the event.
     * </p>
     */
    private String valueKey;

    /**
     * <p>
     * Use this field only if you are sending the metric to CloudWatch.
     * </p>
     * <p>
     * This field is a map of field paths to dimension names. It defines the dimensions to associate with this metric in
     * CloudWatch. Valid values for the entries in this field are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"metadata.pageId": "PageId"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.browserName": "BrowserName"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.deviceType": "DeviceType"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.osName": "OSName"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.countryCode": "CountryCode"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"event_details.fileType": "FileType"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * All dimensions listed in this field must also be included in <code>EventPattern</code>.
     * </p>
     * 
     * @return Use this field only if you are sending the metric to CloudWatch.</p>
     *         <p>
     *         This field is a map of field paths to dimension names. It defines the dimensions to associate with this
     *         metric in CloudWatch. Valid values for the entries in this field are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"metadata.pageId": "PageId"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"metadata.browserName": "BrowserName"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"metadata.deviceType": "DeviceType"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"metadata.osName": "OSName"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"metadata.countryCode": "CountryCode"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"event_details.fileType": "FileType"</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         All dimensions listed in this field must also be included in <code>EventPattern</code>.
     */

    public java.util.Map<String, String> getDimensionKeys() {
        return dimensionKeys;
    }

    /**
     * <p>
     * Use this field only if you are sending the metric to CloudWatch.
     * </p>
     * <p>
     * This field is a map of field paths to dimension names. It defines the dimensions to associate with this metric in
     * CloudWatch. Valid values for the entries in this field are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"metadata.pageId": "PageId"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.browserName": "BrowserName"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.deviceType": "DeviceType"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.osName": "OSName"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.countryCode": "CountryCode"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"event_details.fileType": "FileType"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * All dimensions listed in this field must also be included in <code>EventPattern</code>.
     * </p>
     * 
     * @param dimensionKeys
     *        Use this field only if you are sending the metric to CloudWatch.</p>
     *        <p>
     *        This field is a map of field paths to dimension names. It defines the dimensions to associate with this
     *        metric in CloudWatch. Valid values for the entries in this field are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"metadata.pageId": "PageId"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"metadata.browserName": "BrowserName"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"metadata.deviceType": "DeviceType"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"metadata.osName": "OSName"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"metadata.countryCode": "CountryCode"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"event_details.fileType": "FileType"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        All dimensions listed in this field must also be included in <code>EventPattern</code>.
     */

    public void setDimensionKeys(java.util.Map<String, String> dimensionKeys) {
        this.dimensionKeys = dimensionKeys;
    }

    /**
     * <p>
     * Use this field only if you are sending the metric to CloudWatch.
     * </p>
     * <p>
     * This field is a map of field paths to dimension names. It defines the dimensions to associate with this metric in
     * CloudWatch. Valid values for the entries in this field are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"metadata.pageId": "PageId"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.browserName": "BrowserName"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.deviceType": "DeviceType"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.osName": "OSName"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"metadata.countryCode": "CountryCode"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"event_details.fileType": "FileType"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * All dimensions listed in this field must also be included in <code>EventPattern</code>.
     * </p>
     * 
     * @param dimensionKeys
     *        Use this field only if you are sending the metric to CloudWatch.</p>
     *        <p>
     *        This field is a map of field paths to dimension names. It defines the dimensions to associate with this
     *        metric in CloudWatch. Valid values for the entries in this field are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"metadata.pageId": "PageId"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"metadata.browserName": "BrowserName"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"metadata.deviceType": "DeviceType"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"metadata.osName": "OSName"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"metadata.countryCode": "CountryCode"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"event_details.fileType": "FileType"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        All dimensions listed in this field must also be included in <code>EventPattern</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinitionRequest withDimensionKeys(java.util.Map<String, String> dimensionKeys) {
        setDimensionKeys(dimensionKeys);
        return this;
    }

    /**
     * Add a single DimensionKeys entry
     *
     * @see MetricDefinitionRequest#withDimensionKeys
     * @returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinitionRequest addDimensionKeysEntry(String key, String value) {
        if (null == this.dimensionKeys) {
            this.dimensionKeys = new java.util.HashMap<String, String>();
        }
        if (this.dimensionKeys.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dimensionKeys.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DimensionKeys.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinitionRequest clearDimensionKeysEntries() {
        this.dimensionKeys = null;
        return this;
    }

    /**
     * <p>
     * The pattern that defines the metric, specified as a JSON object. RUM checks events that happen in a user's
     * session against the pattern, and events that match the pattern are sent to the metric destination.
     * </p>
     * <p>
     * When you define extended metrics, the metric definition is not valid if <code>EventPattern</code> is omitted.
     * </p>
     * <p>
     * Example event patterns:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'{ "event_type": ["com.amazon.rum.js_error_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], } }'</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Firefox" ] }, "event_details": { "duration": [{ "numeric": [ "&lt;", 2000 ] }] } }'</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], "countryCode": [ "US" ] }, "event_details": { "duration": [{ "numeric": [ "&gt;=", 2000, "&lt;", 8000 ] }] } }'</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the metrics destination' is <code>CloudWatch</code> and the event also matches a value in
     * <code>DimensionKeys</code>, then the metric is published with the specified dimensions.
     * </p>
     * 
     * @param eventPattern
     *        The pattern that defines the metric, specified as a JSON object. RUM checks events that happen in a user's
     *        session against the pattern, and events that match the pattern are sent to the metric destination.</p>
     *        <p>
     *        When you define extended metrics, the metric definition is not valid if <code>EventPattern</code> is
     *        omitted.
     *        </p>
     *        <p>
     *        Example event patterns:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>'{ "event_type": ["com.amazon.rum.js_error_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], } }'</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>'{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Firefox" ] }, "event_details": { "duration": [{ "numeric": [ "&lt;", 2000 ] }] } }'</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>'{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], "countryCode": [ "US" ] }, "event_details": { "duration": [{ "numeric": [ "&gt;=", 2000, "&lt;", 8000 ] }] } }'</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the metrics destination' is <code>CloudWatch</code> and the event also matches a value in
     *        <code>DimensionKeys</code>, then the metric is published with the specified dimensions.
     */

    public void setEventPattern(String eventPattern) {
        this.eventPattern = eventPattern;
    }

    /**
     * <p>
     * The pattern that defines the metric, specified as a JSON object. RUM checks events that happen in a user's
     * session against the pattern, and events that match the pattern are sent to the metric destination.
     * </p>
     * <p>
     * When you define extended metrics, the metric definition is not valid if <code>EventPattern</code> is omitted.
     * </p>
     * <p>
     * Example event patterns:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'{ "event_type": ["com.amazon.rum.js_error_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], } }'</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Firefox" ] }, "event_details": { "duration": [{ "numeric": [ "&lt;", 2000 ] }] } }'</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], "countryCode": [ "US" ] }, "event_details": { "duration": [{ "numeric": [ "&gt;=", 2000, "&lt;", 8000 ] }] } }'</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the metrics destination' is <code>CloudWatch</code> and the event also matches a value in
     * <code>DimensionKeys</code>, then the metric is published with the specified dimensions.
     * </p>
     * 
     * @return The pattern that defines the metric, specified as a JSON object. RUM checks events that happen in a
     *         user's session against the pattern, and events that match the pattern are sent to the metric
     *         destination.</p>
     *         <p>
     *         When you define extended metrics, the metric definition is not valid if <code>EventPattern</code> is
     *         omitted.
     *         </p>
     *         <p>
     *         Example event patterns:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>'{ "event_type": ["com.amazon.rum.js_error_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], } }'</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>'{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Firefox" ] }, "event_details": { "duration": [{ "numeric": [ "&lt;", 2000 ] }] } }'</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>'{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], "countryCode": [ "US" ] }, "event_details": { "duration": [{ "numeric": [ "&gt;=", 2000, "&lt;", 8000 ] }] } }'</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the metrics destination' is <code>CloudWatch</code> and the event also matches a value in
     *         <code>DimensionKeys</code>, then the metric is published with the specified dimensions.
     */

    public String getEventPattern() {
        return this.eventPattern;
    }

    /**
     * <p>
     * The pattern that defines the metric, specified as a JSON object. RUM checks events that happen in a user's
     * session against the pattern, and events that match the pattern are sent to the metric destination.
     * </p>
     * <p>
     * When you define extended metrics, the metric definition is not valid if <code>EventPattern</code> is omitted.
     * </p>
     * <p>
     * Example event patterns:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'{ "event_type": ["com.amazon.rum.js_error_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], } }'</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Firefox" ] }, "event_details": { "duration": [{ "numeric": [ "&lt;", 2000 ] }] } }'</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], "countryCode": [ "US" ] }, "event_details": { "duration": [{ "numeric": [ "&gt;=", 2000, "&lt;", 8000 ] }] } }'</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the metrics destination' is <code>CloudWatch</code> and the event also matches a value in
     * <code>DimensionKeys</code>, then the metric is published with the specified dimensions.
     * </p>
     * 
     * @param eventPattern
     *        The pattern that defines the metric, specified as a JSON object. RUM checks events that happen in a user's
     *        session against the pattern, and events that match the pattern are sent to the metric destination.</p>
     *        <p>
     *        When you define extended metrics, the metric definition is not valid if <code>EventPattern</code> is
     *        omitted.
     *        </p>
     *        <p>
     *        Example event patterns:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>'{ "event_type": ["com.amazon.rum.js_error_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], } }'</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>'{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Firefox" ] }, "event_details": { "duration": [{ "numeric": [ "&lt;", 2000 ] }] } }'</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>'{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], "countryCode": [ "US" ] }, "event_details": { "duration": [{ "numeric": [ "&gt;=", 2000, "&lt;", 8000 ] }] } }'</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the metrics destination' is <code>CloudWatch</code> and the event also matches a value in
     *        <code>DimensionKeys</code>, then the metric is published with the specified dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinitionRequest withEventPattern(String eventPattern) {
        setEventPattern(eventPattern);
        return this;
    }

    /**
     * <p>
     * The name for the metric that is defined in this structure. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PerformanceNavigationDuration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PerformanceResourceDuration </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NavigationSatisfiedTransaction</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NavigationToleratedTransaction</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NavigationFrustratedTransaction</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WebVitalsCumulativeLayoutShift</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WebVitalsFirstInputDelay</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WebVitalsLargestContentfulPaint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JsErrorCount</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HttpErrorCount</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SessionCount</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name for the metric that is defined in this structure. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PerformanceNavigationDuration</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PerformanceResourceDuration </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NavigationSatisfiedTransaction</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NavigationToleratedTransaction</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NavigationFrustratedTransaction</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WebVitalsCumulativeLayoutShift</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WebVitalsFirstInputDelay</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WebVitalsLargestContentfulPaint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JsErrorCount</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HttpErrorCount</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SessionCount</code>
     *        </p>
     *        </li>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the metric that is defined in this structure. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PerformanceNavigationDuration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PerformanceResourceDuration </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NavigationSatisfiedTransaction</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NavigationToleratedTransaction</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NavigationFrustratedTransaction</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WebVitalsCumulativeLayoutShift</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WebVitalsFirstInputDelay</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WebVitalsLargestContentfulPaint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JsErrorCount</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HttpErrorCount</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SessionCount</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name for the metric that is defined in this structure. Valid values are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PerformanceNavigationDuration</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PerformanceResourceDuration </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NavigationSatisfiedTransaction</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NavigationToleratedTransaction</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NavigationFrustratedTransaction</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WebVitalsCumulativeLayoutShift</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WebVitalsFirstInputDelay</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WebVitalsLargestContentfulPaint</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JsErrorCount</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HttpErrorCount</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SessionCount</code>
     *         </p>
     *         </li>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the metric that is defined in this structure. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PerformanceNavigationDuration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PerformanceResourceDuration </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NavigationSatisfiedTransaction</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NavigationToleratedTransaction</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NavigationFrustratedTransaction</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WebVitalsCumulativeLayoutShift</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WebVitalsFirstInputDelay</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WebVitalsLargestContentfulPaint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JsErrorCount</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HttpErrorCount</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SessionCount</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name for the metric that is defined in this structure. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PerformanceNavigationDuration</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PerformanceResourceDuration </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NavigationSatisfiedTransaction</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NavigationToleratedTransaction</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NavigationFrustratedTransaction</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WebVitalsCumulativeLayoutShift</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WebVitalsFirstInputDelay</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WebVitalsLargestContentfulPaint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JsErrorCount</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HttpErrorCount</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SessionCount</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinitionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The CloudWatch metric unit to use for this metric. If you omit this field, the metric is recorded with no unit.
     * </p>
     * 
     * @param unitLabel
     *        The CloudWatch metric unit to use for this metric. If you omit this field, the metric is recorded with no
     *        unit.
     */

    public void setUnitLabel(String unitLabel) {
        this.unitLabel = unitLabel;
    }

    /**
     * <p>
     * The CloudWatch metric unit to use for this metric. If you omit this field, the metric is recorded with no unit.
     * </p>
     * 
     * @return The CloudWatch metric unit to use for this metric. If you omit this field, the metric is recorded with no
     *         unit.
     */

    public String getUnitLabel() {
        return this.unitLabel;
    }

    /**
     * <p>
     * The CloudWatch metric unit to use for this metric. If you omit this field, the metric is recorded with no unit.
     * </p>
     * 
     * @param unitLabel
     *        The CloudWatch metric unit to use for this metric. If you omit this field, the metric is recorded with no
     *        unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinitionRequest withUnitLabel(String unitLabel) {
        setUnitLabel(unitLabel);
        return this;
    }

    /**
     * <p>
     * The field within the event object that the metric value is sourced from.
     * </p>
     * <p>
     * If you omit this field, a hardcoded value of 1 is pushed as the metric value. This is useful if you just want to
     * count the number of events that the filter catches.
     * </p>
     * <p>
     * If this metric is sent to CloudWatch Evidently, this field will be passed to Evidently raw and Evidently will
     * handle data extraction from the event.
     * </p>
     * 
     * @param valueKey
     *        The field within the event object that the metric value is sourced from.</p>
     *        <p>
     *        If you omit this field, a hardcoded value of 1 is pushed as the metric value. This is useful if you just
     *        want to count the number of events that the filter catches.
     *        </p>
     *        <p>
     *        If this metric is sent to CloudWatch Evidently, this field will be passed to Evidently raw and Evidently
     *        will handle data extraction from the event.
     */

    public void setValueKey(String valueKey) {
        this.valueKey = valueKey;
    }

    /**
     * <p>
     * The field within the event object that the metric value is sourced from.
     * </p>
     * <p>
     * If you omit this field, a hardcoded value of 1 is pushed as the metric value. This is useful if you just want to
     * count the number of events that the filter catches.
     * </p>
     * <p>
     * If this metric is sent to CloudWatch Evidently, this field will be passed to Evidently raw and Evidently will
     * handle data extraction from the event.
     * </p>
     * 
     * @return The field within the event object that the metric value is sourced from.</p>
     *         <p>
     *         If you omit this field, a hardcoded value of 1 is pushed as the metric value. This is useful if you just
     *         want to count the number of events that the filter catches.
     *         </p>
     *         <p>
     *         If this metric is sent to CloudWatch Evidently, this field will be passed to Evidently raw and Evidently
     *         will handle data extraction from the event.
     */

    public String getValueKey() {
        return this.valueKey;
    }

    /**
     * <p>
     * The field within the event object that the metric value is sourced from.
     * </p>
     * <p>
     * If you omit this field, a hardcoded value of 1 is pushed as the metric value. This is useful if you just want to
     * count the number of events that the filter catches.
     * </p>
     * <p>
     * If this metric is sent to CloudWatch Evidently, this field will be passed to Evidently raw and Evidently will
     * handle data extraction from the event.
     * </p>
     * 
     * @param valueKey
     *        The field within the event object that the metric value is sourced from.</p>
     *        <p>
     *        If you omit this field, a hardcoded value of 1 is pushed as the metric value. This is useful if you just
     *        want to count the number of events that the filter catches.
     *        </p>
     *        <p>
     *        If this metric is sent to CloudWatch Evidently, this field will be passed to Evidently raw and Evidently
     *        will handle data extraction from the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinitionRequest withValueKey(String valueKey) {
        setValueKey(valueKey);
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
        if (getDimensionKeys() != null)
            sb.append("DimensionKeys: ").append(getDimensionKeys()).append(",");
        if (getEventPattern() != null)
            sb.append("EventPattern: ").append(getEventPattern()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUnitLabel() != null)
            sb.append("UnitLabel: ").append(getUnitLabel()).append(",");
        if (getValueKey() != null)
            sb.append("ValueKey: ").append(getValueKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDefinitionRequest == false)
            return false;
        MetricDefinitionRequest other = (MetricDefinitionRequest) obj;
        if (other.getDimensionKeys() == null ^ this.getDimensionKeys() == null)
            return false;
        if (other.getDimensionKeys() != null && other.getDimensionKeys().equals(this.getDimensionKeys()) == false)
            return false;
        if (other.getEventPattern() == null ^ this.getEventPattern() == null)
            return false;
        if (other.getEventPattern() != null && other.getEventPattern().equals(this.getEventPattern()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUnitLabel() == null ^ this.getUnitLabel() == null)
            return false;
        if (other.getUnitLabel() != null && other.getUnitLabel().equals(this.getUnitLabel()) == false)
            return false;
        if (other.getValueKey() == null ^ this.getValueKey() == null)
            return false;
        if (other.getValueKey() != null && other.getValueKey().equals(this.getValueKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensionKeys() == null) ? 0 : getDimensionKeys().hashCode());
        hashCode = prime * hashCode + ((getEventPattern() == null) ? 0 : getEventPattern().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUnitLabel() == null) ? 0 : getUnitLabel().hashCode());
        hashCode = prime * hashCode + ((getValueKey() == null) ? 0 : getValueKey().hashCode());
        return hashCode;
    }

    @Override
    public MetricDefinitionRequest clone() {
        try {
            return (MetricDefinitionRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchrum.model.transform.MetricDefinitionRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

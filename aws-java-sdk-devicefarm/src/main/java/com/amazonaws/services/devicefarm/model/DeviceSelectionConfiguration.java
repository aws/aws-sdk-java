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
 * Represents the device filters used in a test run as well as the maximum number of devices to be included in the run.
 * It is passed in as the <code>deviceSelectionConfiguration</code> request parameter in <a>ScheduleRun</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeviceSelectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceSelectionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Used to dynamically select a set of devices for a test run. A filter is made up of an attribute, an operator, and
     * one or more values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Attribute</b>
     * </p>
     * <p>
     * The aspect of a device such as platform or model used as the selection criteria in a device filter.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The Amazon Resource Name (ARN) of the device. For example,
     * "arn:aws:devicefarm:us-west-2::device:12345Example".
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * OS_VERSION: The operating system version. For example, "10.3.2".
     * </p>
     * </li>
     * <li>
     * <p>
     * MODEL: The device model. For example, "iPad 5th Gen".
     * </p>
     * </li>
     * <li>
     * <p>
     * AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY",
     * or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The device manufacturer. For example, "Apple".
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access. Valid values are "TRUE" or "FALSE".
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging. Valid values are "TRUE" or "FALSE".
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_LABELS: The label of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Operator</b>
     * </p>
     * <p>
     * The filter operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     * </p>
     * </li>
     * <li>
     * <p>
     * The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available for the
     * OS_VERSION attribute.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Values</b>
     * </p>
     * <p>
     * An array of one or more filter values.
     * </p>
     * <p class="title">
     * <b>Operator Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IN and NOT_IN operators can take a values array that has more than one element.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other operators require an array with a single element.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attribute Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The PLATFORM attribute can be set to "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.List<DeviceFilter> filters;
    /**
     * <p>
     * The maximum number of devices to be included in a test run.
     * </p>
     */
    private Integer maxDevices;

    /**
     * <p>
     * Used to dynamically select a set of devices for a test run. A filter is made up of an attribute, an operator, and
     * one or more values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Attribute</b>
     * </p>
     * <p>
     * The aspect of a device such as platform or model used as the selection criteria in a device filter.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The Amazon Resource Name (ARN) of the device. For example,
     * "arn:aws:devicefarm:us-west-2::device:12345Example".
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * OS_VERSION: The operating system version. For example, "10.3.2".
     * </p>
     * </li>
     * <li>
     * <p>
     * MODEL: The device model. For example, "iPad 5th Gen".
     * </p>
     * </li>
     * <li>
     * <p>
     * AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY",
     * or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The device manufacturer. For example, "Apple".
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access. Valid values are "TRUE" or "FALSE".
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging. Valid values are "TRUE" or "FALSE".
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_LABELS: The label of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Operator</b>
     * </p>
     * <p>
     * The filter operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     * </p>
     * </li>
     * <li>
     * <p>
     * The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available for the
     * OS_VERSION attribute.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Values</b>
     * </p>
     * <p>
     * An array of one or more filter values.
     * </p>
     * <p class="title">
     * <b>Operator Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IN and NOT_IN operators can take a values array that has more than one element.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other operators require an array with a single element.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attribute Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The PLATFORM attribute can be set to "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return Used to dynamically select a set of devices for a test run. A filter is made up of an attribute, an
     *         operator, and one or more values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Attribute</b>
     *         </p>
     *         <p>
     *         The aspect of a device such as platform or model used as the selection criteria in a device filter.
     *         </p>
     *         <p>
     *         Allowed values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ARN: The Amazon Resource Name (ARN) of the device. For example,
     *         "arn:aws:devicefarm:us-west-2::device:12345Example".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OS_VERSION: The operating system version. For example, "10.3.2".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MODEL: The device model. For example, "iPad 5th Gen".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE",
     *         "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MANUFACTURER: The device manufacturer. For example, "Apple".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access. Valid values are "TRUE" or
     *         "FALSE".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging. Valid values are "TRUE" or
     *         "FALSE".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTANCE_LABELS: The label of the device instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Operator</b>
     *         </p>
     *         <p>
     *         The filter operator.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     *         attributes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available
     *         for the OS_VERSION attribute.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Values</b>
     *         </p>
     *         <p>
     *         An array of one or more filter values.
     *         </p>
     *         <p class="title">
     *         <b>Operator Values</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The IN and NOT_IN operators can take a values array that has more than one element.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The other operators require an array with a single element.
     *         </p>
     *         </li>
     *         </ul>
     *         <p class="title">
     *         <b>Attribute Values</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The PLATFORM attribute can be set to "ANDROID" or "IOS".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     *         "TEMPORARY_NOT_AVAILABLE".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public java.util.List<DeviceFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Used to dynamically select a set of devices for a test run. A filter is made up of an attribute, an operator, and
     * one or more values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Attribute</b>
     * </p>
     * <p>
     * The aspect of a device such as platform or model used as the selection criteria in a device filter.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The Amazon Resource Name (ARN) of the device. For example,
     * "arn:aws:devicefarm:us-west-2::device:12345Example".
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * OS_VERSION: The operating system version. For example, "10.3.2".
     * </p>
     * </li>
     * <li>
     * <p>
     * MODEL: The device model. For example, "iPad 5th Gen".
     * </p>
     * </li>
     * <li>
     * <p>
     * AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY",
     * or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The device manufacturer. For example, "Apple".
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access. Valid values are "TRUE" or "FALSE".
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging. Valid values are "TRUE" or "FALSE".
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_LABELS: The label of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Operator</b>
     * </p>
     * <p>
     * The filter operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     * </p>
     * </li>
     * <li>
     * <p>
     * The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available for the
     * OS_VERSION attribute.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Values</b>
     * </p>
     * <p>
     * An array of one or more filter values.
     * </p>
     * <p class="title">
     * <b>Operator Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IN and NOT_IN operators can take a values array that has more than one element.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other operators require an array with a single element.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attribute Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The PLATFORM attribute can be set to "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Used to dynamically select a set of devices for a test run. A filter is made up of an attribute, an
     *        operator, and one or more values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Attribute</b>
     *        </p>
     *        <p>
     *        The aspect of a device such as platform or model used as the selection criteria in a device filter.
     *        </p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARN: The Amazon Resource Name (ARN) of the device. For example,
     *        "arn:aws:devicefarm:us-west-2::device:12345Example".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OS_VERSION: The operating system version. For example, "10.3.2".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MODEL: The device model. For example, "iPad 5th Gen".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE",
     *        "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MANUFACTURER: The device manufacturer. For example, "Apple".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access. Valid values are "TRUE" or
     *        "FALSE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging. Valid values are "TRUE" or
     *        "FALSE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_LABELS: The label of the device instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Operator</b>
     *        </p>
     *        <p>
     *        The filter operator.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     *        attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available
     *        for the OS_VERSION attribute.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Values</b>
     *        </p>
     *        <p>
     *        An array of one or more filter values.
     *        </p>
     *        <p class="title">
     *        <b>Operator Values</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The IN and NOT_IN operators can take a values array that has more than one element.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The other operators require an array with a single element.
     *        </p>
     *        </li>
     *        </ul>
     *        <p class="title">
     *        <b>Attribute Values</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The PLATFORM attribute can be set to "ANDROID" or "IOS".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     *        "TEMPORARY_NOT_AVAILABLE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setFilters(java.util.Collection<DeviceFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<DeviceFilter>(filters);
    }

    /**
     * <p>
     * Used to dynamically select a set of devices for a test run. A filter is made up of an attribute, an operator, and
     * one or more values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Attribute</b>
     * </p>
     * <p>
     * The aspect of a device such as platform or model used as the selection criteria in a device filter.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The Amazon Resource Name (ARN) of the device. For example,
     * "arn:aws:devicefarm:us-west-2::device:12345Example".
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * OS_VERSION: The operating system version. For example, "10.3.2".
     * </p>
     * </li>
     * <li>
     * <p>
     * MODEL: The device model. For example, "iPad 5th Gen".
     * </p>
     * </li>
     * <li>
     * <p>
     * AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY",
     * or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The device manufacturer. For example, "Apple".
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access. Valid values are "TRUE" or "FALSE".
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging. Valid values are "TRUE" or "FALSE".
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_LABELS: The label of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Operator</b>
     * </p>
     * <p>
     * The filter operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     * </p>
     * </li>
     * <li>
     * <p>
     * The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available for the
     * OS_VERSION attribute.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Values</b>
     * </p>
     * <p>
     * An array of one or more filter values.
     * </p>
     * <p class="title">
     * <b>Operator Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IN and NOT_IN operators can take a values array that has more than one element.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other operators require an array with a single element.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attribute Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The PLATFORM attribute can be set to "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Used to dynamically select a set of devices for a test run. A filter is made up of an attribute, an
     *        operator, and one or more values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Attribute</b>
     *        </p>
     *        <p>
     *        The aspect of a device such as platform or model used as the selection criteria in a device filter.
     *        </p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARN: The Amazon Resource Name (ARN) of the device. For example,
     *        "arn:aws:devicefarm:us-west-2::device:12345Example".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OS_VERSION: The operating system version. For example, "10.3.2".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MODEL: The device model. For example, "iPad 5th Gen".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE",
     *        "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MANUFACTURER: The device manufacturer. For example, "Apple".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access. Valid values are "TRUE" or
     *        "FALSE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging. Valid values are "TRUE" or
     *        "FALSE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_LABELS: The label of the device instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Operator</b>
     *        </p>
     *        <p>
     *        The filter operator.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     *        attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available
     *        for the OS_VERSION attribute.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Values</b>
     *        </p>
     *        <p>
     *        An array of one or more filter values.
     *        </p>
     *        <p class="title">
     *        <b>Operator Values</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The IN and NOT_IN operators can take a values array that has more than one element.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The other operators require an array with a single element.
     *        </p>
     *        </li>
     *        </ul>
     *        <p class="title">
     *        <b>Attribute Values</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The PLATFORM attribute can be set to "ANDROID" or "IOS".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     *        "TEMPORARY_NOT_AVAILABLE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSelectionConfiguration withFilters(DeviceFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<DeviceFilter>(filters.length));
        }
        for (DeviceFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Used to dynamically select a set of devices for a test run. A filter is made up of an attribute, an operator, and
     * one or more values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Attribute</b>
     * </p>
     * <p>
     * The aspect of a device such as platform or model used as the selection criteria in a device filter.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The Amazon Resource Name (ARN) of the device. For example,
     * "arn:aws:devicefarm:us-west-2::device:12345Example".
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * OS_VERSION: The operating system version. For example, "10.3.2".
     * </p>
     * </li>
     * <li>
     * <p>
     * MODEL: The device model. For example, "iPad 5th Gen".
     * </p>
     * </li>
     * <li>
     * <p>
     * AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY",
     * or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The device manufacturer. For example, "Apple".
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access. Valid values are "TRUE" or "FALSE".
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging. Valid values are "TRUE" or "FALSE".
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_LABELS: The label of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Operator</b>
     * </p>
     * <p>
     * The filter operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     * </p>
     * </li>
     * <li>
     * <p>
     * The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available for the
     * OS_VERSION attribute.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Values</b>
     * </p>
     * <p>
     * An array of one or more filter values.
     * </p>
     * <p class="title">
     * <b>Operator Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IN and NOT_IN operators can take a values array that has more than one element.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other operators require an array with a single element.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attribute Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The PLATFORM attribute can be set to "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Used to dynamically select a set of devices for a test run. A filter is made up of an attribute, an
     *        operator, and one or more values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Attribute</b>
     *        </p>
     *        <p>
     *        The aspect of a device such as platform or model used as the selection criteria in a device filter.
     *        </p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARN: The Amazon Resource Name (ARN) of the device. For example,
     *        "arn:aws:devicefarm:us-west-2::device:12345Example".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OS_VERSION: The operating system version. For example, "10.3.2".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MODEL: The device model. For example, "iPad 5th Gen".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE",
     *        "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MANUFACTURER: The device manufacturer. For example, "Apple".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access. Valid values are "TRUE" or
     *        "FALSE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging. Valid values are "TRUE" or
     *        "FALSE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_LABELS: The label of the device instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Operator</b>
     *        </p>
     *        <p>
     *        The filter operator.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     *        attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available
     *        for the OS_VERSION attribute.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Values</b>
     *        </p>
     *        <p>
     *        An array of one or more filter values.
     *        </p>
     *        <p class="title">
     *        <b>Operator Values</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The IN and NOT_IN operators can take a values array that has more than one element.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The other operators require an array with a single element.
     *        </p>
     *        </li>
     *        </ul>
     *        <p class="title">
     *        <b>Attribute Values</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The PLATFORM attribute can be set to "ANDROID" or "IOS".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     *        "TEMPORARY_NOT_AVAILABLE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSelectionConfiguration withFilters(java.util.Collection<DeviceFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of devices to be included in a test run.
     * </p>
     * 
     * @param maxDevices
     *        The maximum number of devices to be included in a test run.
     */

    public void setMaxDevices(Integer maxDevices) {
        this.maxDevices = maxDevices;
    }

    /**
     * <p>
     * The maximum number of devices to be included in a test run.
     * </p>
     * 
     * @return The maximum number of devices to be included in a test run.
     */

    public Integer getMaxDevices() {
        return this.maxDevices;
    }

    /**
     * <p>
     * The maximum number of devices to be included in a test run.
     * </p>
     * 
     * @param maxDevices
     *        The maximum number of devices to be included in a test run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSelectionConfiguration withMaxDevices(Integer maxDevices) {
        setMaxDevices(maxDevices);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxDevices() != null)
            sb.append("MaxDevices: ").append(getMaxDevices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceSelectionConfiguration == false)
            return false;
        DeviceSelectionConfiguration other = (DeviceSelectionConfiguration) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxDevices() == null ^ this.getMaxDevices() == null)
            return false;
        if (other.getMaxDevices() != null && other.getMaxDevices().equals(this.getMaxDevices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxDevices() == null) ? 0 : getMaxDevices().hashCode());
        return hashCode;
    }

    @Override
    public DeviceSelectionConfiguration clone() {
        try {
            return (DeviceSelectionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.DeviceSelectionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

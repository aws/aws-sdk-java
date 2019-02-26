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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the result of a list devices request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDevicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Used to select a set of devices. A filter is made up of an attribute, an operator, and one or more values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Attribute: The aspect of a device such as platform or model used as the selction criteria in a device filter.
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
     * Operator: The filter operator.
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
     * Values: An array of one or more filter values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IN and NOT_IN operators take a values array that has one or more elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other operators require an array with a single element.
     * </p>
     * </li>
     * <li>
     * <p>
     * In a request, the AVAILABILITY attribute takes "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     * "TEMPORARY_NOT_AVAILABLE" as values.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.List<DeviceFilter> filters;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the project.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Used to select a set of devices. A filter is made up of an attribute, an operator, and one or more values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Attribute: The aspect of a device such as platform or model used as the selction criteria in a device filter.
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
     * Operator: The filter operator.
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
     * Values: An array of one or more filter values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IN and NOT_IN operators take a values array that has one or more elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other operators require an array with a single element.
     * </p>
     * </li>
     * <li>
     * <p>
     * In a request, the AVAILABILITY attribute takes "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     * "TEMPORARY_NOT_AVAILABLE" as values.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return Used to select a set of devices. A filter is made up of an attribute, an operator, and one or more
     *         values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Attribute: The aspect of a device such as platform or model used as the selction criteria in a device
     *         filter.
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
     *         Operator: The filter operator.
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
     *         Values: An array of one or more filter values.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The IN and NOT_IN operators take a values array that has one or more elements.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The other operators require an array with a single element.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In a request, the AVAILABILITY attribute takes "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     *         "TEMPORARY_NOT_AVAILABLE" as values.
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
     * Used to select a set of devices. A filter is made up of an attribute, an operator, and one or more values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Attribute: The aspect of a device such as platform or model used as the selction criteria in a device filter.
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
     * Operator: The filter operator.
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
     * Values: An array of one or more filter values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IN and NOT_IN operators take a values array that has one or more elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other operators require an array with a single element.
     * </p>
     * </li>
     * <li>
     * <p>
     * In a request, the AVAILABILITY attribute takes "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     * "TEMPORARY_NOT_AVAILABLE" as values.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Used to select a set of devices. A filter is made up of an attribute, an operator, and one or more
     *        values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Attribute: The aspect of a device such as platform or model used as the selction criteria in a device
     *        filter.
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
     *        Operator: The filter operator.
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
     *        Values: An array of one or more filter values.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The IN and NOT_IN operators take a values array that has one or more elements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The other operators require an array with a single element.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In a request, the AVAILABILITY attribute takes "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     *        "TEMPORARY_NOT_AVAILABLE" as values.
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
     * Used to select a set of devices. A filter is made up of an attribute, an operator, and one or more values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Attribute: The aspect of a device such as platform or model used as the selction criteria in a device filter.
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
     * Operator: The filter operator.
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
     * Values: An array of one or more filter values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IN and NOT_IN operators take a values array that has one or more elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other operators require an array with a single element.
     * </p>
     * </li>
     * <li>
     * <p>
     * In a request, the AVAILABILITY attribute takes "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     * "TEMPORARY_NOT_AVAILABLE" as values.
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
     *        Used to select a set of devices. A filter is made up of an attribute, an operator, and one or more
     *        values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Attribute: The aspect of a device such as platform or model used as the selction criteria in a device
     *        filter.
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
     *        Operator: The filter operator.
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
     *        Values: An array of one or more filter values.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The IN and NOT_IN operators take a values array that has one or more elements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The other operators require an array with a single element.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In a request, the AVAILABILITY attribute takes "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     *        "TEMPORARY_NOT_AVAILABLE" as values.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesRequest withFilters(DeviceFilter... filters) {
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
     * Used to select a set of devices. A filter is made up of an attribute, an operator, and one or more values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Attribute: The aspect of a device such as platform or model used as the selction criteria in a device filter.
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
     * Operator: The filter operator.
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
     * Values: An array of one or more filter values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IN and NOT_IN operators take a values array that has one or more elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other operators require an array with a single element.
     * </p>
     * </li>
     * <li>
     * <p>
     * In a request, the AVAILABILITY attribute takes "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     * "TEMPORARY_NOT_AVAILABLE" as values.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Used to select a set of devices. A filter is made up of an attribute, an operator, and one or more
     *        values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Attribute: The aspect of a device such as platform or model used as the selction criteria in a device
     *        filter.
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
     *        Operator: The filter operator.
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
     *        Values: An array of one or more filter values.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The IN and NOT_IN operators take a values array that has one or more elements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The other operators require an array with a single element.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In a request, the AVAILABILITY attribute takes "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     *        "TEMPORARY_NOT_AVAILABLE" as values.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesRequest withFilters(java.util.Collection<DeviceFilter> filters) {
        setFilters(filters);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDevicesRequest == false)
            return false;
        ListDevicesRequest other = (ListDevicesRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListDevicesRequest clone() {
        return (ListDevicesRequest) super.clone();
    }

}

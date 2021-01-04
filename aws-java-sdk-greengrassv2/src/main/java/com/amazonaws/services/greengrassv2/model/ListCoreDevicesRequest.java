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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListCoreDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCoreDevicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * thing group by which to filter. If you specify this parameter, the list includes only core devices that are
     * members of this thing group.
     * </p>
     */
    private String thingGroupArn;
    /**
     * <p>
     * The core device status by which to filter. If you specify this parameter, the list includes only core devices
     * that have this status. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device without
     * issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the core
     * device.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * thing group by which to filter. If you specify this parameter, the list includes only core devices that are
     * members of this thing group.
     * </p>
     * 
     * @param thingGroupArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        AWS IoT thing group by which to filter. If you specify this parameter, the list includes only core devices
     *        that are members of this thing group.
     */

    public void setThingGroupArn(String thingGroupArn) {
        this.thingGroupArn = thingGroupArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * thing group by which to filter. If you specify this parameter, the list includes only core devices that are
     * members of this thing group.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         AWS IoT thing group by which to filter. If you specify this parameter, the list includes only core
     *         devices that are members of this thing group.
     */

    public String getThingGroupArn() {
        return this.thingGroupArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * thing group by which to filter. If you specify this parameter, the list includes only core devices that are
     * members of this thing group.
     * </p>
     * 
     * @param thingGroupArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        AWS IoT thing group by which to filter. If you specify this parameter, the list includes only core devices
     *        that are members of this thing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoreDevicesRequest withThingGroupArn(String thingGroupArn) {
        setThingGroupArn(thingGroupArn);
        return this;
    }

    /**
     * <p>
     * The core device status by which to filter. If you specify this parameter, the list includes only core devices
     * that have this status. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device without
     * issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the core
     * device.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The core device status by which to filter. If you specify this parameter, the list includes only core
     *        devices that have this status. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device
     *        without issue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the
     *        core device.
     *        </p>
     *        </li>
     * @see CoreDeviceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The core device status by which to filter. If you specify this parameter, the list includes only core devices
     * that have this status. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device without
     * issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the core
     * device.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The core device status by which to filter. If you specify this parameter, the list includes only core
     *         devices that have this status. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device
     *         without issue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the
     *         core device.
     *         </p>
     *         </li>
     * @see CoreDeviceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The core device status by which to filter. If you specify this parameter, the list includes only core devices
     * that have this status. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device without
     * issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the core
     * device.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The core device status by which to filter. If you specify this parameter, the list includes only core
     *        devices that have this status. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device
     *        without issue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the
     *        core device.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoreDeviceStatus
     */

    public ListCoreDevicesRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The core device status by which to filter. If you specify this parameter, the list includes only core devices
     * that have this status. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device without
     * issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the core
     * device.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The core device status by which to filter. If you specify this parameter, the list includes only core
     *        devices that have this status. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device
     *        without issue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the
     *        core device.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoreDeviceStatus
     */

    public ListCoreDevicesRequest withStatus(CoreDeviceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per paginated request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * 
     * @return The maximum number of results to be returned per paginated request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per paginated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoreDevicesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoreDevicesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getThingGroupArn() != null)
            sb.append("ThingGroupArn: ").append(getThingGroupArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCoreDevicesRequest == false)
            return false;
        ListCoreDevicesRequest other = (ListCoreDevicesRequest) obj;
        if (other.getThingGroupArn() == null ^ this.getThingGroupArn() == null)
            return false;
        if (other.getThingGroupArn() != null && other.getThingGroupArn().equals(this.getThingGroupArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingGroupArn() == null) ? 0 : getThingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCoreDevicesRequest clone() {
        return (ListCoreDevicesRequest) super.clone();
    }

}

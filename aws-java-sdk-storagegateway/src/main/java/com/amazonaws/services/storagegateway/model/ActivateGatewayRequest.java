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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A JSON object containing one or more of the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ActivateGatewayInput$ActivationKey</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ActivateGatewayInput$GatewayName</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ActivateGatewayInput$GatewayRegion</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ActivateGatewayInput$GatewayTimezone</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ActivateGatewayInput$GatewayType</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ActivateGatewayInput$TapeDriveType</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ActivateGatewayInput$MediumChangerType</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ActivateGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivateGatewayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Your gateway activation key. You can obtain the activation key by sending an HTTP GET request with redirects
     * enabled to the gateway IP address (port 80). The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter <code>activationKey</code>. It may also include
     * other activation-related parameters, however, these are merely defaults -- the arguments you pass to the
     * <code>ActivateGateway</code> API call determine the actual configuration of your gateway.
     * </p>
     * <p>
     * For more information, see https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html in
     * the Storage Gateway User Guide.
     * </p>
     */
    private String activationKey;
    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     */
    private String gatewayName;
    /**
     * <p>
     * A value that indicates the time zone you want to set for the gateway. The time zone is of the format "GMT-hr:mm"
     * or "GMT+hr:mm". For example, GMT-4:00 indicates the time is 4 hours behind GMT. GMT+2:00 indicates the time is 2
     * hours ahead of GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance
     * schedule.
     * </p>
     */
    private String gatewayTimezone;
    /**
     * <p>
     * A value that indicates the region where you want to store your data. The gateway region specified must be the
     * same region as the region in your <code>Host</code> header in the request. For more information about available
     * regions and endpoints for AWS Storage Gateway, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">Regions and Endpoints</a> in the
     * <i>Amazon Web Services Glossary</i>.
     * </p>
     * <p>
     * Valid Values: See <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">AWS Storage
     * Gateway Regions and Endpoints</a> in the AWS General Reference.
     * </p>
     */
    private String gatewayRegion;
    /**
     * <p>
     * A value that defines the type of gateway to activate. The type specified is critical to all later functions of
     * the gateway and cannot be changed after activation. The default value is <code>CACHED</code>.
     * </p>
     * <p>
     * Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
     * </p>
     */
    private String gatewayType;
    /**
     * <p>
     * The value that indicates the type of tape drive to use for tape gateway. This field is optional.
     * </p>
     * <p>
     * Valid Values: "IBM-ULT3580-TD5"
     * </p>
     */
    private String tapeDriveType;
    /**
     * <p>
     * The value that indicates the type of medium changer to use for tape gateway. This field is optional.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     */
    private String mediumChangerType;
    /**
     * <p>
     * A list of up to 50 tags that can be assigned to the gateway. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * Your gateway activation key. You can obtain the activation key by sending an HTTP GET request with redirects
     * enabled to the gateway IP address (port 80). The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter <code>activationKey</code>. It may also include
     * other activation-related parameters, however, these are merely defaults -- the arguments you pass to the
     * <code>ActivateGateway</code> API call determine the actual configuration of your gateway.
     * </p>
     * <p>
     * For more information, see https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html in
     * the Storage Gateway User Guide.
     * </p>
     * 
     * @param activationKey
     *        Your gateway activation key. You can obtain the activation key by sending an HTTP GET request with
     *        redirects enabled to the gateway IP address (port 80). The redirect URL returned in the response provides
     *        you the activation key for your gateway in the query string parameter <code>activationKey</code>. It may
     *        also include other activation-related parameters, however, these are merely defaults -- the arguments you
     *        pass to the <code>ActivateGateway</code> API call determine the actual configuration of your gateway. </p>
     *        <p>
     *        For more information, see
     *        https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html in the Storage Gateway
     *        User Guide.
     */

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    /**
     * <p>
     * Your gateway activation key. You can obtain the activation key by sending an HTTP GET request with redirects
     * enabled to the gateway IP address (port 80). The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter <code>activationKey</code>. It may also include
     * other activation-related parameters, however, these are merely defaults -- the arguments you pass to the
     * <code>ActivateGateway</code> API call determine the actual configuration of your gateway.
     * </p>
     * <p>
     * For more information, see https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html in
     * the Storage Gateway User Guide.
     * </p>
     * 
     * @return Your gateway activation key. You can obtain the activation key by sending an HTTP GET request with
     *         redirects enabled to the gateway IP address (port 80). The redirect URL returned in the response provides
     *         you the activation key for your gateway in the query string parameter <code>activationKey</code>. It may
     *         also include other activation-related parameters, however, these are merely defaults -- the arguments you
     *         pass to the <code>ActivateGateway</code> API call determine the actual configuration of your gateway.
     *         </p>
     *         <p>
     *         For more information, see
     *         https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html in the Storage
     *         Gateway User Guide.
     */

    public String getActivationKey() {
        return this.activationKey;
    }

    /**
     * <p>
     * Your gateway activation key. You can obtain the activation key by sending an HTTP GET request with redirects
     * enabled to the gateway IP address (port 80). The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter <code>activationKey</code>. It may also include
     * other activation-related parameters, however, these are merely defaults -- the arguments you pass to the
     * <code>ActivateGateway</code> API call determine the actual configuration of your gateway.
     * </p>
     * <p>
     * For more information, see https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html in
     * the Storage Gateway User Guide.
     * </p>
     * 
     * @param activationKey
     *        Your gateway activation key. You can obtain the activation key by sending an HTTP GET request with
     *        redirects enabled to the gateway IP address (port 80). The redirect URL returned in the response provides
     *        you the activation key for your gateway in the query string parameter <code>activationKey</code>. It may
     *        also include other activation-related parameters, however, these are merely defaults -- the arguments you
     *        pass to the <code>ActivateGateway</code> API call determine the actual configuration of your gateway. </p>
     *        <p>
     *        For more information, see
     *        https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html in the Storage Gateway
     *        User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateGatewayRequest withActivationKey(String activationKey) {
        setActivationKey(activationKey);
        return this;
    }

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     * 
     * @param gatewayName
     *        The name you configured for your gateway.
     */

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     * 
     * @return The name you configured for your gateway.
     */

    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     * 
     * @param gatewayName
     *        The name you configured for your gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateGatewayRequest withGatewayName(String gatewayName) {
        setGatewayName(gatewayName);
        return this;
    }

    /**
     * <p>
     * A value that indicates the time zone you want to set for the gateway. The time zone is of the format "GMT-hr:mm"
     * or "GMT+hr:mm". For example, GMT-4:00 indicates the time is 4 hours behind GMT. GMT+2:00 indicates the time is 2
     * hours ahead of GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance
     * schedule.
     * </p>
     * 
     * @param gatewayTimezone
     *        A value that indicates the time zone you want to set for the gateway. The time zone is of the format
     *        "GMT-hr:mm" or "GMT+hr:mm". For example, GMT-4:00 indicates the time is 4 hours behind GMT. GMT+2:00
     *        indicates the time is 2 hours ahead of GMT. The time zone is used, for example, for scheduling snapshots
     *        and your gateway's maintenance schedule.
     */

    public void setGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
    }

    /**
     * <p>
     * A value that indicates the time zone you want to set for the gateway. The time zone is of the format "GMT-hr:mm"
     * or "GMT+hr:mm". For example, GMT-4:00 indicates the time is 4 hours behind GMT. GMT+2:00 indicates the time is 2
     * hours ahead of GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance
     * schedule.
     * </p>
     * 
     * @return A value that indicates the time zone you want to set for the gateway. The time zone is of the format
     *         "GMT-hr:mm" or "GMT+hr:mm". For example, GMT-4:00 indicates the time is 4 hours behind GMT. GMT+2:00
     *         indicates the time is 2 hours ahead of GMT. The time zone is used, for example, for scheduling snapshots
     *         and your gateway's maintenance schedule.
     */

    public String getGatewayTimezone() {
        return this.gatewayTimezone;
    }

    /**
     * <p>
     * A value that indicates the time zone you want to set for the gateway. The time zone is of the format "GMT-hr:mm"
     * or "GMT+hr:mm". For example, GMT-4:00 indicates the time is 4 hours behind GMT. GMT+2:00 indicates the time is 2
     * hours ahead of GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance
     * schedule.
     * </p>
     * 
     * @param gatewayTimezone
     *        A value that indicates the time zone you want to set for the gateway. The time zone is of the format
     *        "GMT-hr:mm" or "GMT+hr:mm". For example, GMT-4:00 indicates the time is 4 hours behind GMT. GMT+2:00
     *        indicates the time is 2 hours ahead of GMT. The time zone is used, for example, for scheduling snapshots
     *        and your gateway's maintenance schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateGatewayRequest withGatewayTimezone(String gatewayTimezone) {
        setGatewayTimezone(gatewayTimezone);
        return this;
    }

    /**
     * <p>
     * A value that indicates the region where you want to store your data. The gateway region specified must be the
     * same region as the region in your <code>Host</code> header in the request. For more information about available
     * regions and endpoints for AWS Storage Gateway, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">Regions and Endpoints</a> in the
     * <i>Amazon Web Services Glossary</i>.
     * </p>
     * <p>
     * Valid Values: See <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">AWS Storage
     * Gateway Regions and Endpoints</a> in the AWS General Reference.
     * </p>
     * 
     * @param gatewayRegion
     *        A value that indicates the region where you want to store your data. The gateway region specified must be
     *        the same region as the region in your <code>Host</code> header in the request. For more information about
     *        available regions and endpoints for AWS Storage Gateway, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">Regions and Endpoints</a> in the
     *        <i>Amazon Web Services Glossary</i>.</p>
     *        <p>
     *        Valid Values: See <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">AWS Storage
     *        Gateway Regions and Endpoints</a> in the AWS General Reference.
     */

    public void setGatewayRegion(String gatewayRegion) {
        this.gatewayRegion = gatewayRegion;
    }

    /**
     * <p>
     * A value that indicates the region where you want to store your data. The gateway region specified must be the
     * same region as the region in your <code>Host</code> header in the request. For more information about available
     * regions and endpoints for AWS Storage Gateway, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">Regions and Endpoints</a> in the
     * <i>Amazon Web Services Glossary</i>.
     * </p>
     * <p>
     * Valid Values: See <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">AWS Storage
     * Gateway Regions and Endpoints</a> in the AWS General Reference.
     * </p>
     * 
     * @return A value that indicates the region where you want to store your data. The gateway region specified must be
     *         the same region as the region in your <code>Host</code> header in the request. For more information about
     *         available regions and endpoints for AWS Storage Gateway, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">Regions and Endpoints</a> in
     *         the <i>Amazon Web Services Glossary</i>.</p>
     *         <p>
     *         Valid Values: See <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">AWS
     *         Storage Gateway Regions and Endpoints</a> in the AWS General Reference.
     */

    public String getGatewayRegion() {
        return this.gatewayRegion;
    }

    /**
     * <p>
     * A value that indicates the region where you want to store your data. The gateway region specified must be the
     * same region as the region in your <code>Host</code> header in the request. For more information about available
     * regions and endpoints for AWS Storage Gateway, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">Regions and Endpoints</a> in the
     * <i>Amazon Web Services Glossary</i>.
     * </p>
     * <p>
     * Valid Values: See <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">AWS Storage
     * Gateway Regions and Endpoints</a> in the AWS General Reference.
     * </p>
     * 
     * @param gatewayRegion
     *        A value that indicates the region where you want to store your data. The gateway region specified must be
     *        the same region as the region in your <code>Host</code> header in the request. For more information about
     *        available regions and endpoints for AWS Storage Gateway, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">Regions and Endpoints</a> in the
     *        <i>Amazon Web Services Glossary</i>.</p>
     *        <p>
     *        Valid Values: See <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">AWS Storage
     *        Gateway Regions and Endpoints</a> in the AWS General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateGatewayRequest withGatewayRegion(String gatewayRegion) {
        setGatewayRegion(gatewayRegion);
        return this;
    }

    /**
     * <p>
     * A value that defines the type of gateway to activate. The type specified is critical to all later functions of
     * the gateway and cannot be changed after activation. The default value is <code>CACHED</code>.
     * </p>
     * <p>
     * Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
     * </p>
     * 
     * @param gatewayType
     *        A value that defines the type of gateway to activate. The type specified is critical to all later
     *        functions of the gateway and cannot be changed after activation. The default value is <code>CACHED</code>.
     *        </p>
     *        <p>
     *        Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
     */

    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }

    /**
     * <p>
     * A value that defines the type of gateway to activate. The type specified is critical to all later functions of
     * the gateway and cannot be changed after activation. The default value is <code>CACHED</code>.
     * </p>
     * <p>
     * Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
     * </p>
     * 
     * @return A value that defines the type of gateway to activate. The type specified is critical to all later
     *         functions of the gateway and cannot be changed after activation. The default value is <code>CACHED</code>
     *         . </p>
     *         <p>
     *         Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
     */

    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * <p>
     * A value that defines the type of gateway to activate. The type specified is critical to all later functions of
     * the gateway and cannot be changed after activation. The default value is <code>CACHED</code>.
     * </p>
     * <p>
     * Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
     * </p>
     * 
     * @param gatewayType
     *        A value that defines the type of gateway to activate. The type specified is critical to all later
     *        functions of the gateway and cannot be changed after activation. The default value is <code>CACHED</code>.
     *        </p>
     *        <p>
     *        Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateGatewayRequest withGatewayType(String gatewayType) {
        setGatewayType(gatewayType);
        return this;
    }

    /**
     * <p>
     * The value that indicates the type of tape drive to use for tape gateway. This field is optional.
     * </p>
     * <p>
     * Valid Values: "IBM-ULT3580-TD5"
     * </p>
     * 
     * @param tapeDriveType
     *        The value that indicates the type of tape drive to use for tape gateway. This field is optional.</p>
     *        <p>
     *        Valid Values: "IBM-ULT3580-TD5"
     */

    public void setTapeDriveType(String tapeDriveType) {
        this.tapeDriveType = tapeDriveType;
    }

    /**
     * <p>
     * The value that indicates the type of tape drive to use for tape gateway. This field is optional.
     * </p>
     * <p>
     * Valid Values: "IBM-ULT3580-TD5"
     * </p>
     * 
     * @return The value that indicates the type of tape drive to use for tape gateway. This field is optional.</p>
     *         <p>
     *         Valid Values: "IBM-ULT3580-TD5"
     */

    public String getTapeDriveType() {
        return this.tapeDriveType;
    }

    /**
     * <p>
     * The value that indicates the type of tape drive to use for tape gateway. This field is optional.
     * </p>
     * <p>
     * Valid Values: "IBM-ULT3580-TD5"
     * </p>
     * 
     * @param tapeDriveType
     *        The value that indicates the type of tape drive to use for tape gateway. This field is optional.</p>
     *        <p>
     *        Valid Values: "IBM-ULT3580-TD5"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateGatewayRequest withTapeDriveType(String tapeDriveType) {
        setTapeDriveType(tapeDriveType);
        return this;
    }

    /**
     * <p>
     * The value that indicates the type of medium changer to use for tape gateway. This field is optional.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * 
     * @param mediumChangerType
     *        The value that indicates the type of medium changer to use for tape gateway. This field is optional.</p>
     *        <p>
     *        Valid Values: "STK-L700", "AWS-Gateway-VTL"
     */

    public void setMediumChangerType(String mediumChangerType) {
        this.mediumChangerType = mediumChangerType;
    }

    /**
     * <p>
     * The value that indicates the type of medium changer to use for tape gateway. This field is optional.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * 
     * @return The value that indicates the type of medium changer to use for tape gateway. This field is optional.</p>
     *         <p>
     *         Valid Values: "STK-L700", "AWS-Gateway-VTL"
     */

    public String getMediumChangerType() {
        return this.mediumChangerType;
    }

    /**
     * <p>
     * The value that indicates the type of medium changer to use for tape gateway. This field is optional.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * 
     * @param mediumChangerType
     *        The value that indicates the type of medium changer to use for tape gateway. This field is optional.</p>
     *        <p>
     *        Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateGatewayRequest withMediumChangerType(String mediumChangerType) {
        setMediumChangerType(mediumChangerType);
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to the gateway. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * 
     * @return A list of up to 50 tags that can be assigned to the gateway. Each tag is a key-value pair.</p> <note>
     *         <p>
     *         Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and
     *         the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters,
     *         and the maximum length for a tag's value is 256.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to the gateway. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of up to 50 tags that can be assigned to the gateway. Each tag is a key-value pair.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     *        the maximum length for a tag's value is 256.
     *        </p>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to the gateway. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags that can be assigned to the gateway. Each tag is a key-value pair.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     *        the maximum length for a tag's value is 256.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateGatewayRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to the gateway. Each tag is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of up to 50 tags that can be assigned to the gateway. Each tag is a key-value pair.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     *        the maximum length for a tag's value is 256.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateGatewayRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getActivationKey() != null)
            sb.append("ActivationKey: ").append(getActivationKey()).append(",");
        if (getGatewayName() != null)
            sb.append("GatewayName: ").append(getGatewayName()).append(",");
        if (getGatewayTimezone() != null)
            sb.append("GatewayTimezone: ").append(getGatewayTimezone()).append(",");
        if (getGatewayRegion() != null)
            sb.append("GatewayRegion: ").append(getGatewayRegion()).append(",");
        if (getGatewayType() != null)
            sb.append("GatewayType: ").append(getGatewayType()).append(",");
        if (getTapeDriveType() != null)
            sb.append("TapeDriveType: ").append(getTapeDriveType()).append(",");
        if (getMediumChangerType() != null)
            sb.append("MediumChangerType: ").append(getMediumChangerType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivateGatewayRequest == false)
            return false;
        ActivateGatewayRequest other = (ActivateGatewayRequest) obj;
        if (other.getActivationKey() == null ^ this.getActivationKey() == null)
            return false;
        if (other.getActivationKey() != null && other.getActivationKey().equals(this.getActivationKey()) == false)
            return false;
        if (other.getGatewayName() == null ^ this.getGatewayName() == null)
            return false;
        if (other.getGatewayName() != null && other.getGatewayName().equals(this.getGatewayName()) == false)
            return false;
        if (other.getGatewayTimezone() == null ^ this.getGatewayTimezone() == null)
            return false;
        if (other.getGatewayTimezone() != null && other.getGatewayTimezone().equals(this.getGatewayTimezone()) == false)
            return false;
        if (other.getGatewayRegion() == null ^ this.getGatewayRegion() == null)
            return false;
        if (other.getGatewayRegion() != null && other.getGatewayRegion().equals(this.getGatewayRegion()) == false)
            return false;
        if (other.getGatewayType() == null ^ this.getGatewayType() == null)
            return false;
        if (other.getGatewayType() != null && other.getGatewayType().equals(this.getGatewayType()) == false)
            return false;
        if (other.getTapeDriveType() == null ^ this.getTapeDriveType() == null)
            return false;
        if (other.getTapeDriveType() != null && other.getTapeDriveType().equals(this.getTapeDriveType()) == false)
            return false;
        if (other.getMediumChangerType() == null ^ this.getMediumChangerType() == null)
            return false;
        if (other.getMediumChangerType() != null && other.getMediumChangerType().equals(this.getMediumChangerType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivationKey() == null) ? 0 : getActivationKey().hashCode());
        hashCode = prime * hashCode + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode());
        hashCode = prime * hashCode + ((getGatewayTimezone() == null) ? 0 : getGatewayTimezone().hashCode());
        hashCode = prime * hashCode + ((getGatewayRegion() == null) ? 0 : getGatewayRegion().hashCode());
        hashCode = prime * hashCode + ((getGatewayType() == null) ? 0 : getGatewayType().hashCode());
        hashCode = prime * hashCode + ((getTapeDriveType() == null) ? 0 : getTapeDriveType().hashCode());
        hashCode = prime * hashCode + ((getMediumChangerType() == null) ? 0 : getMediumChangerType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ActivateGatewayRequest clone() {
        return (ActivateGatewayRequest) super.clone();
    }

}

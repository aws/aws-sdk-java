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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The client branding attributes to import for iOS device types. These attributes are displayed on the iOS client login
 * screen.
 * </p>
 * <important>
 * <p>
 * Client branding attributes are public facing. Ensure you do not include sensitive information.
 * </p>
 * </important>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/IosImportClientBrandingAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IosImportClientBrandingAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The logo. This is the standard-resolution display that has a 1:1 pixel density (or @1x), where one pixel is equal
     * to one point. The only image format accepted is a binary data object that is converted from a <code>.png</code>
     * file.
     * </p>
     */
    private java.nio.ByteBuffer logo;
    /**
     * <p>
     * The @2x version of the logo. This is the higher resolution display that offers a scale factor of 2.0 (or @2x).
     * The only image format accepted is a binary data object that is converted from a <code>.png</code> file.
     * </p>
     * <note>
     * <p>
     * For more information about iOS image size and resolution, see <a href=
     * "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     * >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     * </p>
     * </note>
     */
    private java.nio.ByteBuffer logo2x;
    /**
     * <p>
     * The @3x version of the logo. This is the higher resolution display that offers a scale factor of 3.0 (or @3x).
     * The only image format accepted is a binary data object that is converted from a <code>.png</code> file.
     * </p>
     * <note>
     * <p>
     * For more information about iOS image size and resolution, see <a href=
     * "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     * >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     * </p>
     * </note>
     */
    private java.nio.ByteBuffer logo3x;
    /**
     * <p>
     * The support email. The company's customer support email address.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     * exclusive. You can specify one parameter for each platform type, but not both.
     * </p>
     * </li>
     * <li>
     * <p>
     * The default email is <code>workspaces-feedback@amazon.com</code>.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private String supportEmail;
    /**
     * <p>
     * The support link. The link for the company's customer support page for their WorkSpace.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     * exclusive. You can specify one parameter for each platform type, but not both.
     * </p>
     * </li>
     * <li>
     * <p>
     * The default support link is <code>workspaces-feedback@amazon.com</code>.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private String supportLink;
    /**
     * <p>
     * The forgotten password link. This is the web address that users can go to if they forget the password for their
     * WorkSpace.
     * </p>
     */
    private String forgotPasswordLink;
    /**
     * <p>
     * The login message. Specified as a key value pair, in which the key is a locale and the value is the localized
     * message for that locale. The only key supported is <code>en_US</code>. The HTML tags supported include the
     * following:
     * <code>a, b, blockquote, br, cite, code, dd, dl, dt, div, em, i, li, ol, p, pre, q, small, span, strike, strong, sub, sup, u, ul</code>
     * .
     * </p>
     */
    private java.util.Map<String, String> loginMessage;

    /**
     * <p>
     * The logo. This is the standard-resolution display that has a 1:1 pixel density (or @1x), where one pixel is equal
     * to one point. The only image format accepted is a binary data object that is converted from a <code>.png</code>
     * file.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param logo
     *        The logo. This is the standard-resolution display that has a 1:1 pixel density (or @1x), where one pixel
     *        is equal to one point. The only image format accepted is a binary data object that is converted from a
     *        <code>.png</code> file.
     */

    public void setLogo(java.nio.ByteBuffer logo) {
        this.logo = logo;
    }

    /**
     * <p>
     * The logo. This is the standard-resolution display that has a 1:1 pixel density (or @1x), where one pixel is equal
     * to one point. The only image format accepted is a binary data object that is converted from a <code>.png</code>
     * file.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The logo. This is the standard-resolution display that has a 1:1 pixel density (or @1x), where one pixel
     *         is equal to one point. The only image format accepted is a binary data object that is converted from a
     *         <code>.png</code> file.
     */

    public java.nio.ByteBuffer getLogo() {
        return this.logo;
    }

    /**
     * <p>
     * The logo. This is the standard-resolution display that has a 1:1 pixel density (or @1x), where one pixel is equal
     * to one point. The only image format accepted is a binary data object that is converted from a <code>.png</code>
     * file.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param logo
     *        The logo. This is the standard-resolution display that has a 1:1 pixel density (or @1x), where one pixel
     *        is equal to one point. The only image format accepted is a binary data object that is converted from a
     *        <code>.png</code> file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IosImportClientBrandingAttributes withLogo(java.nio.ByteBuffer logo) {
        setLogo(logo);
        return this;
    }

    /**
     * <p>
     * The @2x version of the logo. This is the higher resolution display that offers a scale factor of 2.0 (or @2x).
     * The only image format accepted is a binary data object that is converted from a <code>.png</code> file.
     * </p>
     * <note>
     * <p>
     * For more information about iOS image size and resolution, see <a href=
     * "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     * >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     * </p>
     * </note>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param logo2x
     *        The @2x version of the logo. This is the higher resolution display that offers a scale factor of 2.0 (or
     *        @2x). The only image format accepted is a binary data object that is converted from a <code>.png</code>
     *        file.</p> <note>
     *        <p>
     *        For more information about iOS image size and resolution, see <a href=
     *        "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     *        >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     *        </p>
     */

    public void setLogo2x(java.nio.ByteBuffer logo2x) {
        this.logo2x = logo2x;
    }

    /**
     * <p>
     * The @2x version of the logo. This is the higher resolution display that offers a scale factor of 2.0 (or @2x).
     * The only image format accepted is a binary data object that is converted from a <code>.png</code> file.
     * </p>
     * <note>
     * <p>
     * For more information about iOS image size and resolution, see <a href=
     * "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     * >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     * </p>
     * </note>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The @2x version of the logo. This is the higher resolution display that offers a scale factor of 2.0 (or
     *         @2x). The only image format accepted is a binary data object that is converted from a <code>.png</code>
     *         file.</p> <note>
     *         <p>
     *         For more information about iOS image size and resolution, see <a href=
     *         "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     *         >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     *         </p>
     */

    public java.nio.ByteBuffer getLogo2x() {
        return this.logo2x;
    }

    /**
     * <p>
     * The @2x version of the logo. This is the higher resolution display that offers a scale factor of 2.0 (or @2x).
     * The only image format accepted is a binary data object that is converted from a <code>.png</code> file.
     * </p>
     * <note>
     * <p>
     * For more information about iOS image size and resolution, see <a href=
     * "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     * >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     * </p>
     * </note>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param logo2x
     *        The @2x version of the logo. This is the higher resolution display that offers a scale factor of 2.0 (or
     *        @2x). The only image format accepted is a binary data object that is converted from a <code>.png</code>
     *        file.</p> <note>
     *        <p>
     *        For more information about iOS image size and resolution, see <a href=
     *        "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     *        >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IosImportClientBrandingAttributes withLogo2x(java.nio.ByteBuffer logo2x) {
        setLogo2x(logo2x);
        return this;
    }

    /**
     * <p>
     * The @3x version of the logo. This is the higher resolution display that offers a scale factor of 3.0 (or @3x).
     * The only image format accepted is a binary data object that is converted from a <code>.png</code> file.
     * </p>
     * <note>
     * <p>
     * For more information about iOS image size and resolution, see <a href=
     * "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     * >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     * </p>
     * </note>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param logo3x
     *        The @3x version of the logo. This is the higher resolution display that offers a scale factor of 3.0 (or
     *        @3x). The only image format accepted is a binary data object that is converted from a <code>.png</code>
     *        file.</p> <note>
     *        <p>
     *        For more information about iOS image size and resolution, see <a href=
     *        "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     *        >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     *        </p>
     */

    public void setLogo3x(java.nio.ByteBuffer logo3x) {
        this.logo3x = logo3x;
    }

    /**
     * <p>
     * The @3x version of the logo. This is the higher resolution display that offers a scale factor of 3.0 (or @3x).
     * The only image format accepted is a binary data object that is converted from a <code>.png</code> file.
     * </p>
     * <note>
     * <p>
     * For more information about iOS image size and resolution, see <a href=
     * "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     * >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     * </p>
     * </note>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The @3x version of the logo. This is the higher resolution display that offers a scale factor of 3.0 (or
     *         @3x). The only image format accepted is a binary data object that is converted from a <code>.png</code>
     *         file.</p> <note>
     *         <p>
     *         For more information about iOS image size and resolution, see <a href=
     *         "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     *         >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     *         </p>
     */

    public java.nio.ByteBuffer getLogo3x() {
        return this.logo3x;
    }

    /**
     * <p>
     * The @3x version of the logo. This is the higher resolution display that offers a scale factor of 3.0 (or @3x).
     * The only image format accepted is a binary data object that is converted from a <code>.png</code> file.
     * </p>
     * <note>
     * <p>
     * For more information about iOS image size and resolution, see <a href=
     * "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     * >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     * </p>
     * </note>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param logo3x
     *        The @3x version of the logo. This is the higher resolution display that offers a scale factor of 3.0 (or
     *        @3x). The only image format accepted is a binary data object that is converted from a <code>.png</code>
     *        file.</p> <note>
     *        <p>
     *        For more information about iOS image size and resolution, see <a href=
     *        "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     *        >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IosImportClientBrandingAttributes withLogo3x(java.nio.ByteBuffer logo3x) {
        setLogo3x(logo3x);
        return this;
    }

    /**
     * <p>
     * The support email. The company's customer support email address.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     * exclusive. You can specify one parameter for each platform type, but not both.
     * </p>
     * </li>
     * <li>
     * <p>
     * The default email is <code>workspaces-feedback@amazon.com</code>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param supportEmail
     *        The support email. The company's customer support email address.</p> <note>
     *        <ul>
     *        <li>
     *        <p>
     *        In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     *        exclusive. You can specify one parameter for each platform type, but not both.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The default email is <code>workspaces-feedback@amazon.com</code>.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    /**
     * <p>
     * The support email. The company's customer support email address.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     * exclusive. You can specify one parameter for each platform type, but not both.
     * </p>
     * </li>
     * <li>
     * <p>
     * The default email is <code>workspaces-feedback@amazon.com</code>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return The support email. The company's customer support email address.</p> <note>
     *         <ul>
     *         <li>
     *         <p>
     *         In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     *         exclusive. You can specify one parameter for each platform type, but not both.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The default email is <code>workspaces-feedback@amazon.com</code>.
     *         </p>
     *         </li>
     *         </ul>
     */

    public String getSupportEmail() {
        return this.supportEmail;
    }

    /**
     * <p>
     * The support email. The company's customer support email address.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     * exclusive. You can specify one parameter for each platform type, but not both.
     * </p>
     * </li>
     * <li>
     * <p>
     * The default email is <code>workspaces-feedback@amazon.com</code>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param supportEmail
     *        The support email. The company's customer support email address.</p> <note>
     *        <ul>
     *        <li>
     *        <p>
     *        In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     *        exclusive. You can specify one parameter for each platform type, but not both.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The default email is <code>workspaces-feedback@amazon.com</code>.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IosImportClientBrandingAttributes withSupportEmail(String supportEmail) {
        setSupportEmail(supportEmail);
        return this;
    }

    /**
     * <p>
     * The support link. The link for the company's customer support page for their WorkSpace.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     * exclusive. You can specify one parameter for each platform type, but not both.
     * </p>
     * </li>
     * <li>
     * <p>
     * The default support link is <code>workspaces-feedback@amazon.com</code>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param supportLink
     *        The support link. The link for the company's customer support page for their WorkSpace.</p> <note>
     *        <ul>
     *        <li>
     *        <p>
     *        In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     *        exclusive. You can specify one parameter for each platform type, but not both.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The default support link is <code>workspaces-feedback@amazon.com</code>.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setSupportLink(String supportLink) {
        this.supportLink = supportLink;
    }

    /**
     * <p>
     * The support link. The link for the company's customer support page for their WorkSpace.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     * exclusive. You can specify one parameter for each platform type, but not both.
     * </p>
     * </li>
     * <li>
     * <p>
     * The default support link is <code>workspaces-feedback@amazon.com</code>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return The support link. The link for the company's customer support page for their WorkSpace.</p> <note>
     *         <ul>
     *         <li>
     *         <p>
     *         In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     *         exclusive. You can specify one parameter for each platform type, but not both.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The default support link is <code>workspaces-feedback@amazon.com</code>.
     *         </p>
     *         </li>
     *         </ul>
     */

    public String getSupportLink() {
        return this.supportLink;
    }

    /**
     * <p>
     * The support link. The link for the company's customer support page for their WorkSpace.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     * exclusive. You can specify one parameter for each platform type, but not both.
     * </p>
     * </li>
     * <li>
     * <p>
     * The default support link is <code>workspaces-feedback@amazon.com</code>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param supportLink
     *        The support link. The link for the company's customer support page for their WorkSpace.</p> <note>
     *        <ul>
     *        <li>
     *        <p>
     *        In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     *        exclusive. You can specify one parameter for each platform type, but not both.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The default support link is <code>workspaces-feedback@amazon.com</code>.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IosImportClientBrandingAttributes withSupportLink(String supportLink) {
        setSupportLink(supportLink);
        return this;
    }

    /**
     * <p>
     * The forgotten password link. This is the web address that users can go to if they forget the password for their
     * WorkSpace.
     * </p>
     * 
     * @param forgotPasswordLink
     *        The forgotten password link. This is the web address that users can go to if they forget the password for
     *        their WorkSpace.
     */

    public void setForgotPasswordLink(String forgotPasswordLink) {
        this.forgotPasswordLink = forgotPasswordLink;
    }

    /**
     * <p>
     * The forgotten password link. This is the web address that users can go to if they forget the password for their
     * WorkSpace.
     * </p>
     * 
     * @return The forgotten password link. This is the web address that users can go to if they forget the password for
     *         their WorkSpace.
     */

    public String getForgotPasswordLink() {
        return this.forgotPasswordLink;
    }

    /**
     * <p>
     * The forgotten password link. This is the web address that users can go to if they forget the password for their
     * WorkSpace.
     * </p>
     * 
     * @param forgotPasswordLink
     *        The forgotten password link. This is the web address that users can go to if they forget the password for
     *        their WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IosImportClientBrandingAttributes withForgotPasswordLink(String forgotPasswordLink) {
        setForgotPasswordLink(forgotPasswordLink);
        return this;
    }

    /**
     * <p>
     * The login message. Specified as a key value pair, in which the key is a locale and the value is the localized
     * message for that locale. The only key supported is <code>en_US</code>. The HTML tags supported include the
     * following:
     * <code>a, b, blockquote, br, cite, code, dd, dl, dt, div, em, i, li, ol, p, pre, q, small, span, strike, strong, sub, sup, u, ul</code>
     * .
     * </p>
     * 
     * @return The login message. Specified as a key value pair, in which the key is a locale and the value is the
     *         localized message for that locale. The only key supported is <code>en_US</code>. The HTML tags supported
     *         include the following:
     *         <code>a, b, blockquote, br, cite, code, dd, dl, dt, div, em, i, li, ol, p, pre, q, small, span, strike, strong, sub, sup, u, ul</code>
     *         .
     */

    public java.util.Map<String, String> getLoginMessage() {
        return loginMessage;
    }

    /**
     * <p>
     * The login message. Specified as a key value pair, in which the key is a locale and the value is the localized
     * message for that locale. The only key supported is <code>en_US</code>. The HTML tags supported include the
     * following:
     * <code>a, b, blockquote, br, cite, code, dd, dl, dt, div, em, i, li, ol, p, pre, q, small, span, strike, strong, sub, sup, u, ul</code>
     * .
     * </p>
     * 
     * @param loginMessage
     *        The login message. Specified as a key value pair, in which the key is a locale and the value is the
     *        localized message for that locale. The only key supported is <code>en_US</code>. The HTML tags supported
     *        include the following:
     *        <code>a, b, blockquote, br, cite, code, dd, dl, dt, div, em, i, li, ol, p, pre, q, small, span, strike, strong, sub, sup, u, ul</code>
     *        .
     */

    public void setLoginMessage(java.util.Map<String, String> loginMessage) {
        this.loginMessage = loginMessage;
    }

    /**
     * <p>
     * The login message. Specified as a key value pair, in which the key is a locale and the value is the localized
     * message for that locale. The only key supported is <code>en_US</code>. The HTML tags supported include the
     * following:
     * <code>a, b, blockquote, br, cite, code, dd, dl, dt, div, em, i, li, ol, p, pre, q, small, span, strike, strong, sub, sup, u, ul</code>
     * .
     * </p>
     * 
     * @param loginMessage
     *        The login message. Specified as a key value pair, in which the key is a locale and the value is the
     *        localized message for that locale. The only key supported is <code>en_US</code>. The HTML tags supported
     *        include the following:
     *        <code>a, b, blockquote, br, cite, code, dd, dl, dt, div, em, i, li, ol, p, pre, q, small, span, strike, strong, sub, sup, u, ul</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IosImportClientBrandingAttributes withLoginMessage(java.util.Map<String, String> loginMessage) {
        setLoginMessage(loginMessage);
        return this;
    }

    /**
     * Add a single LoginMessage entry
     *
     * @see IosImportClientBrandingAttributes#withLoginMessage
     * @returns a reference to this object so that method calls can be chained together.
     */

    public IosImportClientBrandingAttributes addLoginMessageEntry(String key, String value) {
        if (null == this.loginMessage) {
            this.loginMessage = new java.util.HashMap<String, String>();
        }
        if (this.loginMessage.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.loginMessage.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LoginMessage.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IosImportClientBrandingAttributes clearLoginMessageEntries() {
        this.loginMessage = null;
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
        if (getLogo() != null)
            sb.append("Logo: ").append(getLogo()).append(",");
        if (getLogo2x() != null)
            sb.append("Logo2x: ").append(getLogo2x()).append(",");
        if (getLogo3x() != null)
            sb.append("Logo3x: ").append(getLogo3x()).append(",");
        if (getSupportEmail() != null)
            sb.append("SupportEmail: ").append(getSupportEmail()).append(",");
        if (getSupportLink() != null)
            sb.append("SupportLink: ").append(getSupportLink()).append(",");
        if (getForgotPasswordLink() != null)
            sb.append("ForgotPasswordLink: ").append(getForgotPasswordLink()).append(",");
        if (getLoginMessage() != null)
            sb.append("LoginMessage: ").append(getLoginMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IosImportClientBrandingAttributes == false)
            return false;
        IosImportClientBrandingAttributes other = (IosImportClientBrandingAttributes) obj;
        if (other.getLogo() == null ^ this.getLogo() == null)
            return false;
        if (other.getLogo() != null && other.getLogo().equals(this.getLogo()) == false)
            return false;
        if (other.getLogo2x() == null ^ this.getLogo2x() == null)
            return false;
        if (other.getLogo2x() != null && other.getLogo2x().equals(this.getLogo2x()) == false)
            return false;
        if (other.getLogo3x() == null ^ this.getLogo3x() == null)
            return false;
        if (other.getLogo3x() != null && other.getLogo3x().equals(this.getLogo3x()) == false)
            return false;
        if (other.getSupportEmail() == null ^ this.getSupportEmail() == null)
            return false;
        if (other.getSupportEmail() != null && other.getSupportEmail().equals(this.getSupportEmail()) == false)
            return false;
        if (other.getSupportLink() == null ^ this.getSupportLink() == null)
            return false;
        if (other.getSupportLink() != null && other.getSupportLink().equals(this.getSupportLink()) == false)
            return false;
        if (other.getForgotPasswordLink() == null ^ this.getForgotPasswordLink() == null)
            return false;
        if (other.getForgotPasswordLink() != null && other.getForgotPasswordLink().equals(this.getForgotPasswordLink()) == false)
            return false;
        if (other.getLoginMessage() == null ^ this.getLoginMessage() == null)
            return false;
        if (other.getLoginMessage() != null && other.getLoginMessage().equals(this.getLoginMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogo() == null) ? 0 : getLogo().hashCode());
        hashCode = prime * hashCode + ((getLogo2x() == null) ? 0 : getLogo2x().hashCode());
        hashCode = prime * hashCode + ((getLogo3x() == null) ? 0 : getLogo3x().hashCode());
        hashCode = prime * hashCode + ((getSupportEmail() == null) ? 0 : getSupportEmail().hashCode());
        hashCode = prime * hashCode + ((getSupportLink() == null) ? 0 : getSupportLink().hashCode());
        hashCode = prime * hashCode + ((getForgotPasswordLink() == null) ? 0 : getForgotPasswordLink().hashCode());
        hashCode = prime * hashCode + ((getLoginMessage() == null) ? 0 : getLoginMessage().hashCode());
        return hashCode;
    }

    @Override
    public IosImportClientBrandingAttributes clone() {
        try {
            return (IosImportClientBrandingAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.IosImportClientBrandingAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

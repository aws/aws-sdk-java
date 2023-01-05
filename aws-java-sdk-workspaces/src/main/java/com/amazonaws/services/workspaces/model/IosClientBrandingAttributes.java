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
 * The client branding attributes for iOS device types. These attributes are displayed on the iOS client login screen
 * only.
 * </p>
 * <important>
 * <p>
 * Client branding attributes are public facing. Ensure you do not include sensitive information.
 * </p>
 * </important>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/IosClientBrandingAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IosClientBrandingAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The logo. This is the standard-resolution display that has a 1:1 pixel density (or @1x), where one pixel is equal
     * to one point. The only image format accepted is a binary data object that is converted from a <code>.png</code>
     * file.
     * </p>
     */
    private String logoUrl;
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
    private String logo2xUrl;
    /**
     * <p>
     * The @3x version of the logo. This is the higher resolution display that offers a scale factor of 3.0 (or @3x).The
     * only image format accepted is a binary data object that is converted from a <code>.png</code> file.
     * </p>
     * <note>
     * <p>
     * For more information about iOS image size and resolution, see <a href=
     * "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     * >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     * </p>
     * </note>
     */
    private String logo3xUrl;
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
     * 
     * @param logoUrl
     *        The logo. This is the standard-resolution display that has a 1:1 pixel density (or @1x), where one pixel
     *        is equal to one point. The only image format accepted is a binary data object that is converted from a
     *        <code>.png</code> file.
     */

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    /**
     * <p>
     * The logo. This is the standard-resolution display that has a 1:1 pixel density (or @1x), where one pixel is equal
     * to one point. The only image format accepted is a binary data object that is converted from a <code>.png</code>
     * file.
     * </p>
     * 
     * @return The logo. This is the standard-resolution display that has a 1:1 pixel density (or @1x), where one pixel
     *         is equal to one point. The only image format accepted is a binary data object that is converted from a
     *         <code>.png</code> file.
     */

    public String getLogoUrl() {
        return this.logoUrl;
    }

    /**
     * <p>
     * The logo. This is the standard-resolution display that has a 1:1 pixel density (or @1x), where one pixel is equal
     * to one point. The only image format accepted is a binary data object that is converted from a <code>.png</code>
     * file.
     * </p>
     * 
     * @param logoUrl
     *        The logo. This is the standard-resolution display that has a 1:1 pixel density (or @1x), where one pixel
     *        is equal to one point. The only image format accepted is a binary data object that is converted from a
     *        <code>.png</code> file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IosClientBrandingAttributes withLogoUrl(String logoUrl) {
        setLogoUrl(logoUrl);
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
     * 
     * @param logo2xUrl
     *        The @2x version of the logo. This is the higher resolution display that offers a scale factor of 2.0 (or
     *        @2x). The only image format accepted is a binary data object that is converted from a <code>.png</code>
     *        file.</p> <note>
     *        <p>
     *        For more information about iOS image size and resolution, see <a href=
     *        "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     *        >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     *        </p>
     */

    public void setLogo2xUrl(String logo2xUrl) {
        this.logo2xUrl = logo2xUrl;
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

    public String getLogo2xUrl() {
        return this.logo2xUrl;
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
     * 
     * @param logo2xUrl
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

    public IosClientBrandingAttributes withLogo2xUrl(String logo2xUrl) {
        setLogo2xUrl(logo2xUrl);
        return this;
    }

    /**
     * <p>
     * The @3x version of the logo. This is the higher resolution display that offers a scale factor of 3.0 (or @3x).The
     * only image format accepted is a binary data object that is converted from a <code>.png</code> file.
     * </p>
     * <note>
     * <p>
     * For more information about iOS image size and resolution, see <a href=
     * "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     * >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     * </p>
     * </note>
     * 
     * @param logo3xUrl
     *        The @3x version of the logo. This is the higher resolution display that offers a scale factor of 3.0 (or
     *        @3x).The only image format accepted is a binary data object that is converted from a <code>.png</code>
     *        file.</p> <note>
     *        <p>
     *        For more information about iOS image size and resolution, see <a href=
     *        "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     *        >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     *        </p>
     */

    public void setLogo3xUrl(String logo3xUrl) {
        this.logo3xUrl = logo3xUrl;
    }

    /**
     * <p>
     * The @3x version of the logo. This is the higher resolution display that offers a scale factor of 3.0 (or @3x).The
     * only image format accepted is a binary data object that is converted from a <code>.png</code> file.
     * </p>
     * <note>
     * <p>
     * For more information about iOS image size and resolution, see <a href=
     * "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     * >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     * </p>
     * </note>
     * 
     * @return The @3x version of the logo. This is the higher resolution display that offers a scale factor of 3.0 (or
     *         @3x).The only image format accepted is a binary data object that is converted from a <code>.png</code>
     *         file.</p> <note>
     *         <p>
     *         For more information about iOS image size and resolution, see <a href=
     *         "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     *         >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     *         </p>
     */

    public String getLogo3xUrl() {
        return this.logo3xUrl;
    }

    /**
     * <p>
     * The @3x version of the logo. This is the higher resolution display that offers a scale factor of 3.0 (or @3x).The
     * only image format accepted is a binary data object that is converted from a <code>.png</code> file.
     * </p>
     * <note>
     * <p>
     * For more information about iOS image size and resolution, see <a href=
     * "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     * >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     * </p>
     * </note>
     * 
     * @param logo3xUrl
     *        The @3x version of the logo. This is the higher resolution display that offers a scale factor of 3.0 (or
     *        @3x).The only image format accepted is a binary data object that is converted from a <code>.png</code>
     *        file.</p> <note>
     *        <p>
     *        For more information about iOS image size and resolution, see <a href=
     *        "https://developer.apple.com/design/human-interface-guidelines/ios/icons-and-images/image-size-and-resolution/"
     *        >Image Size and Resolution </a> in the <i>Apple Human Interface Guidelines</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IosClientBrandingAttributes withLogo3xUrl(String logo3xUrl) {
        setLogo3xUrl(logo3xUrl);
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

    public IosClientBrandingAttributes withSupportEmail(String supportEmail) {
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

    public IosClientBrandingAttributes withSupportLink(String supportLink) {
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

    public IosClientBrandingAttributes withForgotPasswordLink(String forgotPasswordLink) {
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

    public IosClientBrandingAttributes withLoginMessage(java.util.Map<String, String> loginMessage) {
        setLoginMessage(loginMessage);
        return this;
    }

    /**
     * Add a single LoginMessage entry
     *
     * @see IosClientBrandingAttributes#withLoginMessage
     * @returns a reference to this object so that method calls can be chained together.
     */

    public IosClientBrandingAttributes addLoginMessageEntry(String key, String value) {
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

    public IosClientBrandingAttributes clearLoginMessageEntries() {
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
        if (getLogoUrl() != null)
            sb.append("LogoUrl: ").append(getLogoUrl()).append(",");
        if (getLogo2xUrl() != null)
            sb.append("Logo2xUrl: ").append(getLogo2xUrl()).append(",");
        if (getLogo3xUrl() != null)
            sb.append("Logo3xUrl: ").append(getLogo3xUrl()).append(",");
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

        if (obj instanceof IosClientBrandingAttributes == false)
            return false;
        IosClientBrandingAttributes other = (IosClientBrandingAttributes) obj;
        if (other.getLogoUrl() == null ^ this.getLogoUrl() == null)
            return false;
        if (other.getLogoUrl() != null && other.getLogoUrl().equals(this.getLogoUrl()) == false)
            return false;
        if (other.getLogo2xUrl() == null ^ this.getLogo2xUrl() == null)
            return false;
        if (other.getLogo2xUrl() != null && other.getLogo2xUrl().equals(this.getLogo2xUrl()) == false)
            return false;
        if (other.getLogo3xUrl() == null ^ this.getLogo3xUrl() == null)
            return false;
        if (other.getLogo3xUrl() != null && other.getLogo3xUrl().equals(this.getLogo3xUrl()) == false)
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

        hashCode = prime * hashCode + ((getLogoUrl() == null) ? 0 : getLogoUrl().hashCode());
        hashCode = prime * hashCode + ((getLogo2xUrl() == null) ? 0 : getLogo2xUrl().hashCode());
        hashCode = prime * hashCode + ((getLogo3xUrl() == null) ? 0 : getLogo3xUrl().hashCode());
        hashCode = prime * hashCode + ((getSupportEmail() == null) ? 0 : getSupportEmail().hashCode());
        hashCode = prime * hashCode + ((getSupportLink() == null) ? 0 : getSupportLink().hashCode());
        hashCode = prime * hashCode + ((getForgotPasswordLink() == null) ? 0 : getForgotPasswordLink().hashCode());
        hashCode = prime * hashCode + ((getLoginMessage() == null) ? 0 : getLoginMessage().hashCode());
        return hashCode;
    }

    @Override
    public IosClientBrandingAttributes clone() {
        try {
            return (IosClientBrandingAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.IosClientBrandingAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

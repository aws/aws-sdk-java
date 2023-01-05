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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A CloudFront origin access control configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/OriginAccessControlConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginAccessControlConfig implements Serializable, Cloneable {

    /**
     * <p>
     * A name to identify the origin access control.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the origin access control.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The signing protocol of the origin access control, which determines how CloudFront signs (authenticates)
     * requests. The only valid value is <code>sigv4</code>.
     * </p>
     */
    private String signingProtocol;
    /**
     * <p>
     * Specifies which requests CloudFront signs (adds authentication information to). Specify <code>always</code> for
     * the most common use case. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html#oac-advanced-settings"
     * >origin access control advanced settings</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * This field can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>always</code> – CloudFront signs all origin requests, overwriting the <code>Authorization</code> header
     * from the viewer request if one exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>never</code> – CloudFront doesn't sign any origin requests. This value turns off origin access control for
     * all origins in all distributions that use this origin access control.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>no-override</code> – If the viewer request doesn't contain the <code>Authorization</code> header, then
     * CloudFront signs the origin request. If the viewer request contains the <code>Authorization</code> header, then
     * CloudFront doesn't sign the origin request and instead passes along the <code>Authorization</code> header from
     * the viewer request. <b>WARNING: To pass along the <code>Authorization</code> header from the viewer request, you
     * <i>must</i> add the <code>Authorization</code> header to a <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html">cache
     * policy</a> for all cache behaviors that use origins associated with this origin access control.</b>
     * </p>
     * </li>
     * </ul>
     */
    private String signingBehavior;
    /**
     * <p>
     * The type of origin that this origin access control is for. The only valid value is <code>s3</code>.
     * </p>
     */
    private String originAccessControlOriginType;

    /**
     * <p>
     * A name to identify the origin access control.
     * </p>
     * 
     * @param name
     *        A name to identify the origin access control.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name to identify the origin access control.
     * </p>
     * 
     * @return A name to identify the origin access control.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name to identify the origin access control.
     * </p>
     * 
     * @param name
     *        A name to identify the origin access control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginAccessControlConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the origin access control.
     * </p>
     * 
     * @param description
     *        A description of the origin access control.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the origin access control.
     * </p>
     * 
     * @return A description of the origin access control.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the origin access control.
     * </p>
     * 
     * @param description
     *        A description of the origin access control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginAccessControlConfig withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The signing protocol of the origin access control, which determines how CloudFront signs (authenticates)
     * requests. The only valid value is <code>sigv4</code>.
     * </p>
     * 
     * @param signingProtocol
     *        The signing protocol of the origin access control, which determines how CloudFront signs (authenticates)
     *        requests. The only valid value is <code>sigv4</code>.
     * @see OriginAccessControlSigningProtocols
     */

    public void setSigningProtocol(String signingProtocol) {
        this.signingProtocol = signingProtocol;
    }

    /**
     * <p>
     * The signing protocol of the origin access control, which determines how CloudFront signs (authenticates)
     * requests. The only valid value is <code>sigv4</code>.
     * </p>
     * 
     * @return The signing protocol of the origin access control, which determines how CloudFront signs (authenticates)
     *         requests. The only valid value is <code>sigv4</code>.
     * @see OriginAccessControlSigningProtocols
     */

    public String getSigningProtocol() {
        return this.signingProtocol;
    }

    /**
     * <p>
     * The signing protocol of the origin access control, which determines how CloudFront signs (authenticates)
     * requests. The only valid value is <code>sigv4</code>.
     * </p>
     * 
     * @param signingProtocol
     *        The signing protocol of the origin access control, which determines how CloudFront signs (authenticates)
     *        requests. The only valid value is <code>sigv4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginAccessControlSigningProtocols
     */

    public OriginAccessControlConfig withSigningProtocol(String signingProtocol) {
        setSigningProtocol(signingProtocol);
        return this;
    }

    /**
     * <p>
     * The signing protocol of the origin access control, which determines how CloudFront signs (authenticates)
     * requests. The only valid value is <code>sigv4</code>.
     * </p>
     * 
     * @param signingProtocol
     *        The signing protocol of the origin access control, which determines how CloudFront signs (authenticates)
     *        requests. The only valid value is <code>sigv4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginAccessControlSigningProtocols
     */

    public OriginAccessControlConfig withSigningProtocol(OriginAccessControlSigningProtocols signingProtocol) {
        this.signingProtocol = signingProtocol.toString();
        return this;
    }

    /**
     * <p>
     * Specifies which requests CloudFront signs (adds authentication information to). Specify <code>always</code> for
     * the most common use case. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html#oac-advanced-settings"
     * >origin access control advanced settings</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * This field can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>always</code> – CloudFront signs all origin requests, overwriting the <code>Authorization</code> header
     * from the viewer request if one exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>never</code> – CloudFront doesn't sign any origin requests. This value turns off origin access control for
     * all origins in all distributions that use this origin access control.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>no-override</code> – If the viewer request doesn't contain the <code>Authorization</code> header, then
     * CloudFront signs the origin request. If the viewer request contains the <code>Authorization</code> header, then
     * CloudFront doesn't sign the origin request and instead passes along the <code>Authorization</code> header from
     * the viewer request. <b>WARNING: To pass along the <code>Authorization</code> header from the viewer request, you
     * <i>must</i> add the <code>Authorization</code> header to a <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html">cache
     * policy</a> for all cache behaviors that use origins associated with this origin access control.</b>
     * </p>
     * </li>
     * </ul>
     * 
     * @param signingBehavior
     *        Specifies which requests CloudFront signs (adds authentication information to). Specify
     *        <code>always</code> for the most common use case. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html#oac-advanced-settings"
     *        >origin access control advanced settings</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *        <p>
     *        This field can have one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>always</code> – CloudFront signs all origin requests, overwriting the <code>Authorization</code>
     *        header from the viewer request if one exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>never</code> – CloudFront doesn't sign any origin requests. This value turns off origin access
     *        control for all origins in all distributions that use this origin access control.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>no-override</code> – If the viewer request doesn't contain the <code>Authorization</code> header,
     *        then CloudFront signs the origin request. If the viewer request contains the <code>Authorization</code>
     *        header, then CloudFront doesn't sign the origin request and instead passes along the
     *        <code>Authorization</code> header from the viewer request. <b>WARNING: To pass along the
     *        <code>Authorization</code> header from the viewer request, you <i>must</i> add the
     *        <code>Authorization</code> header to a <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html"
     *        >cache policy</a> for all cache behaviors that use origins associated with this origin access control.</b>
     *        </p>
     *        </li>
     * @see OriginAccessControlSigningBehaviors
     */

    public void setSigningBehavior(String signingBehavior) {
        this.signingBehavior = signingBehavior;
    }

    /**
     * <p>
     * Specifies which requests CloudFront signs (adds authentication information to). Specify <code>always</code> for
     * the most common use case. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html#oac-advanced-settings"
     * >origin access control advanced settings</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * This field can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>always</code> – CloudFront signs all origin requests, overwriting the <code>Authorization</code> header
     * from the viewer request if one exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>never</code> – CloudFront doesn't sign any origin requests. This value turns off origin access control for
     * all origins in all distributions that use this origin access control.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>no-override</code> – If the viewer request doesn't contain the <code>Authorization</code> header, then
     * CloudFront signs the origin request. If the viewer request contains the <code>Authorization</code> header, then
     * CloudFront doesn't sign the origin request and instead passes along the <code>Authorization</code> header from
     * the viewer request. <b>WARNING: To pass along the <code>Authorization</code> header from the viewer request, you
     * <i>must</i> add the <code>Authorization</code> header to a <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html">cache
     * policy</a> for all cache behaviors that use origins associated with this origin access control.</b>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies which requests CloudFront signs (adds authentication information to). Specify
     *         <code>always</code> for the most common use case. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html#oac-advanced-settings"
     *         >origin access control advanced settings</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *         <p>
     *         This field can have one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>always</code> – CloudFront signs all origin requests, overwriting the <code>Authorization</code>
     *         header from the viewer request if one exists.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>never</code> – CloudFront doesn't sign any origin requests. This value turns off origin access
     *         control for all origins in all distributions that use this origin access control.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>no-override</code> – If the viewer request doesn't contain the <code>Authorization</code> header,
     *         then CloudFront signs the origin request. If the viewer request contains the <code>Authorization</code>
     *         header, then CloudFront doesn't sign the origin request and instead passes along the
     *         <code>Authorization</code> header from the viewer request. <b>WARNING: To pass along the
     *         <code>Authorization</code> header from the viewer request, you <i>must</i> add the
     *         <code>Authorization</code> header to a <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html"
     *         >cache policy</a> for all cache behaviors that use origins associated with this origin access
     *         control.</b>
     *         </p>
     *         </li>
     * @see OriginAccessControlSigningBehaviors
     */

    public String getSigningBehavior() {
        return this.signingBehavior;
    }

    /**
     * <p>
     * Specifies which requests CloudFront signs (adds authentication information to). Specify <code>always</code> for
     * the most common use case. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html#oac-advanced-settings"
     * >origin access control advanced settings</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * This field can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>always</code> – CloudFront signs all origin requests, overwriting the <code>Authorization</code> header
     * from the viewer request if one exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>never</code> – CloudFront doesn't sign any origin requests. This value turns off origin access control for
     * all origins in all distributions that use this origin access control.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>no-override</code> – If the viewer request doesn't contain the <code>Authorization</code> header, then
     * CloudFront signs the origin request. If the viewer request contains the <code>Authorization</code> header, then
     * CloudFront doesn't sign the origin request and instead passes along the <code>Authorization</code> header from
     * the viewer request. <b>WARNING: To pass along the <code>Authorization</code> header from the viewer request, you
     * <i>must</i> add the <code>Authorization</code> header to a <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html">cache
     * policy</a> for all cache behaviors that use origins associated with this origin access control.</b>
     * </p>
     * </li>
     * </ul>
     * 
     * @param signingBehavior
     *        Specifies which requests CloudFront signs (adds authentication information to). Specify
     *        <code>always</code> for the most common use case. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html#oac-advanced-settings"
     *        >origin access control advanced settings</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *        <p>
     *        This field can have one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>always</code> – CloudFront signs all origin requests, overwriting the <code>Authorization</code>
     *        header from the viewer request if one exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>never</code> – CloudFront doesn't sign any origin requests. This value turns off origin access
     *        control for all origins in all distributions that use this origin access control.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>no-override</code> – If the viewer request doesn't contain the <code>Authorization</code> header,
     *        then CloudFront signs the origin request. If the viewer request contains the <code>Authorization</code>
     *        header, then CloudFront doesn't sign the origin request and instead passes along the
     *        <code>Authorization</code> header from the viewer request. <b>WARNING: To pass along the
     *        <code>Authorization</code> header from the viewer request, you <i>must</i> add the
     *        <code>Authorization</code> header to a <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html"
     *        >cache policy</a> for all cache behaviors that use origins associated with this origin access control.</b>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginAccessControlSigningBehaviors
     */

    public OriginAccessControlConfig withSigningBehavior(String signingBehavior) {
        setSigningBehavior(signingBehavior);
        return this;
    }

    /**
     * <p>
     * Specifies which requests CloudFront signs (adds authentication information to). Specify <code>always</code> for
     * the most common use case. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html#oac-advanced-settings"
     * >origin access control advanced settings</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * This field can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>always</code> – CloudFront signs all origin requests, overwriting the <code>Authorization</code> header
     * from the viewer request if one exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>never</code> – CloudFront doesn't sign any origin requests. This value turns off origin access control for
     * all origins in all distributions that use this origin access control.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>no-override</code> – If the viewer request doesn't contain the <code>Authorization</code> header, then
     * CloudFront signs the origin request. If the viewer request contains the <code>Authorization</code> header, then
     * CloudFront doesn't sign the origin request and instead passes along the <code>Authorization</code> header from
     * the viewer request. <b>WARNING: To pass along the <code>Authorization</code> header from the viewer request, you
     * <i>must</i> add the <code>Authorization</code> header to a <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html">cache
     * policy</a> for all cache behaviors that use origins associated with this origin access control.</b>
     * </p>
     * </li>
     * </ul>
     * 
     * @param signingBehavior
     *        Specifies which requests CloudFront signs (adds authentication information to). Specify
     *        <code>always</code> for the most common use case. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html#oac-advanced-settings"
     *        >origin access control advanced settings</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *        <p>
     *        This field can have one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>always</code> – CloudFront signs all origin requests, overwriting the <code>Authorization</code>
     *        header from the viewer request if one exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>never</code> – CloudFront doesn't sign any origin requests. This value turns off origin access
     *        control for all origins in all distributions that use this origin access control.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>no-override</code> – If the viewer request doesn't contain the <code>Authorization</code> header,
     *        then CloudFront signs the origin request. If the viewer request contains the <code>Authorization</code>
     *        header, then CloudFront doesn't sign the origin request and instead passes along the
     *        <code>Authorization</code> header from the viewer request. <b>WARNING: To pass along the
     *        <code>Authorization</code> header from the viewer request, you <i>must</i> add the
     *        <code>Authorization</code> header to a <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html"
     *        >cache policy</a> for all cache behaviors that use origins associated with this origin access control.</b>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginAccessControlSigningBehaviors
     */

    public OriginAccessControlConfig withSigningBehavior(OriginAccessControlSigningBehaviors signingBehavior) {
        this.signingBehavior = signingBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The type of origin that this origin access control is for. The only valid value is <code>s3</code>.
     * </p>
     * 
     * @param originAccessControlOriginType
     *        The type of origin that this origin access control is for. The only valid value is <code>s3</code>.
     * @see OriginAccessControlOriginTypes
     */

    public void setOriginAccessControlOriginType(String originAccessControlOriginType) {
        this.originAccessControlOriginType = originAccessControlOriginType;
    }

    /**
     * <p>
     * The type of origin that this origin access control is for. The only valid value is <code>s3</code>.
     * </p>
     * 
     * @return The type of origin that this origin access control is for. The only valid value is <code>s3</code>.
     * @see OriginAccessControlOriginTypes
     */

    public String getOriginAccessControlOriginType() {
        return this.originAccessControlOriginType;
    }

    /**
     * <p>
     * The type of origin that this origin access control is for. The only valid value is <code>s3</code>.
     * </p>
     * 
     * @param originAccessControlOriginType
     *        The type of origin that this origin access control is for. The only valid value is <code>s3</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginAccessControlOriginTypes
     */

    public OriginAccessControlConfig withOriginAccessControlOriginType(String originAccessControlOriginType) {
        setOriginAccessControlOriginType(originAccessControlOriginType);
        return this;
    }

    /**
     * <p>
     * The type of origin that this origin access control is for. The only valid value is <code>s3</code>.
     * </p>
     * 
     * @param originAccessControlOriginType
     *        The type of origin that this origin access control is for. The only valid value is <code>s3</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginAccessControlOriginTypes
     */

    public OriginAccessControlConfig withOriginAccessControlOriginType(OriginAccessControlOriginTypes originAccessControlOriginType) {
        this.originAccessControlOriginType = originAccessControlOriginType.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSigningProtocol() != null)
            sb.append("SigningProtocol: ").append(getSigningProtocol()).append(",");
        if (getSigningBehavior() != null)
            sb.append("SigningBehavior: ").append(getSigningBehavior()).append(",");
        if (getOriginAccessControlOriginType() != null)
            sb.append("OriginAccessControlOriginType: ").append(getOriginAccessControlOriginType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginAccessControlConfig == false)
            return false;
        OriginAccessControlConfig other = (OriginAccessControlConfig) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSigningProtocol() == null ^ this.getSigningProtocol() == null)
            return false;
        if (other.getSigningProtocol() != null && other.getSigningProtocol().equals(this.getSigningProtocol()) == false)
            return false;
        if (other.getSigningBehavior() == null ^ this.getSigningBehavior() == null)
            return false;
        if (other.getSigningBehavior() != null && other.getSigningBehavior().equals(this.getSigningBehavior()) == false)
            return false;
        if (other.getOriginAccessControlOriginType() == null ^ this.getOriginAccessControlOriginType() == null)
            return false;
        if (other.getOriginAccessControlOriginType() != null
                && other.getOriginAccessControlOriginType().equals(this.getOriginAccessControlOriginType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSigningProtocol() == null) ? 0 : getSigningProtocol().hashCode());
        hashCode = prime * hashCode + ((getSigningBehavior() == null) ? 0 : getSigningBehavior().hashCode());
        hashCode = prime * hashCode + ((getOriginAccessControlOriginType() == null) ? 0 : getOriginAccessControlOriginType().hashCode());
        return hashCode;
    }

    @Override
    public OriginAccessControlConfig clone() {
        try {
            return (OriginAccessControlConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

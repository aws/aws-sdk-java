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
 * This structure contains much of the configuration data for the app monitor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/AppMonitorConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppMonitorConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If you set this to <code>true</code>, the RUM web client sets two cookies, a session cookie and a user cookie.
     * The cookies allow the RUM web client to collect data relating to the number of users an application has and the
     * behavior of the application across a sequence of events. Cookies are stored in the top-level domain of the
     * current page.
     * </p>
     */
    private Boolean allowCookies;
    /**
     * <p>
     * If you set this to <code>true</code>, RUM enables X-Ray tracing for the user sessions that RUM samples. RUM adds
     * an X-Ray trace header to allowed HTTP requests. It also records an X-Ray segment for allowed HTTP requests. You
     * can see traces and segments from these user sessions in the X-Ray console and the CloudWatch ServiceLens console.
     * For more information, see <a href="https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html">What is
     * X-Ray?</a>
     * </p>
     */
    private Boolean enableXRay;
    /**
     * <p>
     * A list of URLs in your website or application to exclude from RUM data collection.
     * </p>
     * <p>
     * You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     * </p>
     */
    private java.util.List<String> excludedPages;
    /**
     * <p>
     * A list of pages in your application that are to be displayed with a "favorite" icon in the CloudWatch RUM
     * console.
     * </p>
     */
    private java.util.List<String> favoritePages;
    /**
     * <p>
     * The ARN of the guest IAM role that is attached to the Amazon Cognito identity pool that is used to authorize the
     * sending of data to RUM.
     * </p>
     */
    private String guestRoleArn;
    /**
     * <p>
     * The ID of the Amazon Cognito identity pool that is used to authorize the sending of data to RUM.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * If this app monitor is to collect data from only certain pages in your application, this structure lists those
     * pages.
     * </p>
     * <p>
     * You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     * </p>
     */
    private java.util.List<String> includedPages;
    /**
     * <p>
     * Specifies the portion of user sessions to use for RUM data collection. Choosing a higher portion gives you more
     * data but also incurs more costs.
     * </p>
     * <p>
     * The range for this value is 0 to 1 inclusive. Setting this to 1 means that 100% of user sessions are sampled, and
     * setting it to 0.1 means that 10% of user sessions are sampled.
     * </p>
     * <p>
     * If you omit this parameter, the default of 0.1 is used, and 10% of sessions will be sampled.
     * </p>
     */
    private Double sessionSampleRate;
    /**
     * <p>
     * An array that lists the types of telemetry data that this app monitor is to collect.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>errors</code> indicates that RUM collects data about unhandled JavaScript errors raised by your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance</code> indicates that RUM collects performance data about how your application and its
     * resources are loaded and rendered. This includes Core Web Vitals.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>http</code> indicates that RUM collects data about HTTP errors thrown by your application.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> telemetries;

    /**
     * <p>
     * If you set this to <code>true</code>, the RUM web client sets two cookies, a session cookie and a user cookie.
     * The cookies allow the RUM web client to collect data relating to the number of users an application has and the
     * behavior of the application across a sequence of events. Cookies are stored in the top-level domain of the
     * current page.
     * </p>
     * 
     * @param allowCookies
     *        If you set this to <code>true</code>, the RUM web client sets two cookies, a session cookie and a user
     *        cookie. The cookies allow the RUM web client to collect data relating to the number of users an
     *        application has and the behavior of the application across a sequence of events. Cookies are stored in the
     *        top-level domain of the current page.
     */

    public void setAllowCookies(Boolean allowCookies) {
        this.allowCookies = allowCookies;
    }

    /**
     * <p>
     * If you set this to <code>true</code>, the RUM web client sets two cookies, a session cookie and a user cookie.
     * The cookies allow the RUM web client to collect data relating to the number of users an application has and the
     * behavior of the application across a sequence of events. Cookies are stored in the top-level domain of the
     * current page.
     * </p>
     * 
     * @return If you set this to <code>true</code>, the RUM web client sets two cookies, a session cookie and a user
     *         cookie. The cookies allow the RUM web client to collect data relating to the number of users an
     *         application has and the behavior of the application across a sequence of events. Cookies are stored in
     *         the top-level domain of the current page.
     */

    public Boolean getAllowCookies() {
        return this.allowCookies;
    }

    /**
     * <p>
     * If you set this to <code>true</code>, the RUM web client sets two cookies, a session cookie and a user cookie.
     * The cookies allow the RUM web client to collect data relating to the number of users an application has and the
     * behavior of the application across a sequence of events. Cookies are stored in the top-level domain of the
     * current page.
     * </p>
     * 
     * @param allowCookies
     *        If you set this to <code>true</code>, the RUM web client sets two cookies, a session cookie and a user
     *        cookie. The cookies allow the RUM web client to collect data relating to the number of users an
     *        application has and the behavior of the application across a sequence of events. Cookies are stored in the
     *        top-level domain of the current page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitorConfiguration withAllowCookies(Boolean allowCookies) {
        setAllowCookies(allowCookies);
        return this;
    }

    /**
     * <p>
     * If you set this to <code>true</code>, the RUM web client sets two cookies, a session cookie and a user cookie.
     * The cookies allow the RUM web client to collect data relating to the number of users an application has and the
     * behavior of the application across a sequence of events. Cookies are stored in the top-level domain of the
     * current page.
     * </p>
     * 
     * @return If you set this to <code>true</code>, the RUM web client sets two cookies, a session cookie and a user
     *         cookie. The cookies allow the RUM web client to collect data relating to the number of users an
     *         application has and the behavior of the application across a sequence of events. Cookies are stored in
     *         the top-level domain of the current page.
     */

    public Boolean isAllowCookies() {
        return this.allowCookies;
    }

    /**
     * <p>
     * If you set this to <code>true</code>, RUM enables X-Ray tracing for the user sessions that RUM samples. RUM adds
     * an X-Ray trace header to allowed HTTP requests. It also records an X-Ray segment for allowed HTTP requests. You
     * can see traces and segments from these user sessions in the X-Ray console and the CloudWatch ServiceLens console.
     * For more information, see <a href="https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html">What is
     * X-Ray?</a>
     * </p>
     * 
     * @param enableXRay
     *        If you set this to <code>true</code>, RUM enables X-Ray tracing for the user sessions that RUM samples.
     *        RUM adds an X-Ray trace header to allowed HTTP requests. It also records an X-Ray segment for allowed HTTP
     *        requests. You can see traces and segments from these user sessions in the X-Ray console and the CloudWatch
     *        ServiceLens console. For more information, see <a
     *        href="https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html">What is X-Ray?</a>
     */

    public void setEnableXRay(Boolean enableXRay) {
        this.enableXRay = enableXRay;
    }

    /**
     * <p>
     * If you set this to <code>true</code>, RUM enables X-Ray tracing for the user sessions that RUM samples. RUM adds
     * an X-Ray trace header to allowed HTTP requests. It also records an X-Ray segment for allowed HTTP requests. You
     * can see traces and segments from these user sessions in the X-Ray console and the CloudWatch ServiceLens console.
     * For more information, see <a href="https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html">What is
     * X-Ray?</a>
     * </p>
     * 
     * @return If you set this to <code>true</code>, RUM enables X-Ray tracing for the user sessions that RUM samples.
     *         RUM adds an X-Ray trace header to allowed HTTP requests. It also records an X-Ray segment for allowed
     *         HTTP requests. You can see traces and segments from these user sessions in the X-Ray console and the
     *         CloudWatch ServiceLens console. For more information, see <a
     *         href="https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html">What is X-Ray?</a>
     */

    public Boolean getEnableXRay() {
        return this.enableXRay;
    }

    /**
     * <p>
     * If you set this to <code>true</code>, RUM enables X-Ray tracing for the user sessions that RUM samples. RUM adds
     * an X-Ray trace header to allowed HTTP requests. It also records an X-Ray segment for allowed HTTP requests. You
     * can see traces and segments from these user sessions in the X-Ray console and the CloudWatch ServiceLens console.
     * For more information, see <a href="https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html">What is
     * X-Ray?</a>
     * </p>
     * 
     * @param enableXRay
     *        If you set this to <code>true</code>, RUM enables X-Ray tracing for the user sessions that RUM samples.
     *        RUM adds an X-Ray trace header to allowed HTTP requests. It also records an X-Ray segment for allowed HTTP
     *        requests. You can see traces and segments from these user sessions in the X-Ray console and the CloudWatch
     *        ServiceLens console. For more information, see <a
     *        href="https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html">What is X-Ray?</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitorConfiguration withEnableXRay(Boolean enableXRay) {
        setEnableXRay(enableXRay);
        return this;
    }

    /**
     * <p>
     * If you set this to <code>true</code>, RUM enables X-Ray tracing for the user sessions that RUM samples. RUM adds
     * an X-Ray trace header to allowed HTTP requests. It also records an X-Ray segment for allowed HTTP requests. You
     * can see traces and segments from these user sessions in the X-Ray console and the CloudWatch ServiceLens console.
     * For more information, see <a href="https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html">What is
     * X-Ray?</a>
     * </p>
     * 
     * @return If you set this to <code>true</code>, RUM enables X-Ray tracing for the user sessions that RUM samples.
     *         RUM adds an X-Ray trace header to allowed HTTP requests. It also records an X-Ray segment for allowed
     *         HTTP requests. You can see traces and segments from these user sessions in the X-Ray console and the
     *         CloudWatch ServiceLens console. For more information, see <a
     *         href="https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html">What is X-Ray?</a>
     */

    public Boolean isEnableXRay() {
        return this.enableXRay;
    }

    /**
     * <p>
     * A list of URLs in your website or application to exclude from RUM data collection.
     * </p>
     * <p>
     * You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     * </p>
     * 
     * @return A list of URLs in your website or application to exclude from RUM data collection.</p>
     *         <p>
     *         You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     */

    public java.util.List<String> getExcludedPages() {
        return excludedPages;
    }

    /**
     * <p>
     * A list of URLs in your website or application to exclude from RUM data collection.
     * </p>
     * <p>
     * You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     * </p>
     * 
     * @param excludedPages
     *        A list of URLs in your website or application to exclude from RUM data collection.</p>
     *        <p>
     *        You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     */

    public void setExcludedPages(java.util.Collection<String> excludedPages) {
        if (excludedPages == null) {
            this.excludedPages = null;
            return;
        }

        this.excludedPages = new java.util.ArrayList<String>(excludedPages);
    }

    /**
     * <p>
     * A list of URLs in your website or application to exclude from RUM data collection.
     * </p>
     * <p>
     * You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedPages(java.util.Collection)} or {@link #withExcludedPages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param excludedPages
     *        A list of URLs in your website or application to exclude from RUM data collection.</p>
     *        <p>
     *        You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitorConfiguration withExcludedPages(String... excludedPages) {
        if (this.excludedPages == null) {
            setExcludedPages(new java.util.ArrayList<String>(excludedPages.length));
        }
        for (String ele : excludedPages) {
            this.excludedPages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of URLs in your website or application to exclude from RUM data collection.
     * </p>
     * <p>
     * You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     * </p>
     * 
     * @param excludedPages
     *        A list of URLs in your website or application to exclude from RUM data collection.</p>
     *        <p>
     *        You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitorConfiguration withExcludedPages(java.util.Collection<String> excludedPages) {
        setExcludedPages(excludedPages);
        return this;
    }

    /**
     * <p>
     * A list of pages in your application that are to be displayed with a "favorite" icon in the CloudWatch RUM
     * console.
     * </p>
     * 
     * @return A list of pages in your application that are to be displayed with a "favorite" icon in the CloudWatch RUM
     *         console.
     */

    public java.util.List<String> getFavoritePages() {
        return favoritePages;
    }

    /**
     * <p>
     * A list of pages in your application that are to be displayed with a "favorite" icon in the CloudWatch RUM
     * console.
     * </p>
     * 
     * @param favoritePages
     *        A list of pages in your application that are to be displayed with a "favorite" icon in the CloudWatch RUM
     *        console.
     */

    public void setFavoritePages(java.util.Collection<String> favoritePages) {
        if (favoritePages == null) {
            this.favoritePages = null;
            return;
        }

        this.favoritePages = new java.util.ArrayList<String>(favoritePages);
    }

    /**
     * <p>
     * A list of pages in your application that are to be displayed with a "favorite" icon in the CloudWatch RUM
     * console.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFavoritePages(java.util.Collection)} or {@link #withFavoritePages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param favoritePages
     *        A list of pages in your application that are to be displayed with a "favorite" icon in the CloudWatch RUM
     *        console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitorConfiguration withFavoritePages(String... favoritePages) {
        if (this.favoritePages == null) {
            setFavoritePages(new java.util.ArrayList<String>(favoritePages.length));
        }
        for (String ele : favoritePages) {
            this.favoritePages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of pages in your application that are to be displayed with a "favorite" icon in the CloudWatch RUM
     * console.
     * </p>
     * 
     * @param favoritePages
     *        A list of pages in your application that are to be displayed with a "favorite" icon in the CloudWatch RUM
     *        console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitorConfiguration withFavoritePages(java.util.Collection<String> favoritePages) {
        setFavoritePages(favoritePages);
        return this;
    }

    /**
     * <p>
     * The ARN of the guest IAM role that is attached to the Amazon Cognito identity pool that is used to authorize the
     * sending of data to RUM.
     * </p>
     * 
     * @param guestRoleArn
     *        The ARN of the guest IAM role that is attached to the Amazon Cognito identity pool that is used to
     *        authorize the sending of data to RUM.
     */

    public void setGuestRoleArn(String guestRoleArn) {
        this.guestRoleArn = guestRoleArn;
    }

    /**
     * <p>
     * The ARN of the guest IAM role that is attached to the Amazon Cognito identity pool that is used to authorize the
     * sending of data to RUM.
     * </p>
     * 
     * @return The ARN of the guest IAM role that is attached to the Amazon Cognito identity pool that is used to
     *         authorize the sending of data to RUM.
     */

    public String getGuestRoleArn() {
        return this.guestRoleArn;
    }

    /**
     * <p>
     * The ARN of the guest IAM role that is attached to the Amazon Cognito identity pool that is used to authorize the
     * sending of data to RUM.
     * </p>
     * 
     * @param guestRoleArn
     *        The ARN of the guest IAM role that is attached to the Amazon Cognito identity pool that is used to
     *        authorize the sending of data to RUM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitorConfiguration withGuestRoleArn(String guestRoleArn) {
        setGuestRoleArn(guestRoleArn);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito identity pool that is used to authorize the sending of data to RUM.
     * </p>
     * 
     * @param identityPoolId
     *        The ID of the Amazon Cognito identity pool that is used to authorize the sending of data to RUM.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito identity pool that is used to authorize the sending of data to RUM.
     * </p>
     * 
     * @return The ID of the Amazon Cognito identity pool that is used to authorize the sending of data to RUM.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito identity pool that is used to authorize the sending of data to RUM.
     * </p>
     * 
     * @param identityPoolId
     *        The ID of the Amazon Cognito identity pool that is used to authorize the sending of data to RUM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitorConfiguration withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * If this app monitor is to collect data from only certain pages in your application, this structure lists those
     * pages.
     * </p>
     * <p>
     * You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     * </p>
     * 
     * @return If this app monitor is to collect data from only certain pages in your application, this structure lists
     *         those pages. </p>
     *         <p>
     *         You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     */

    public java.util.List<String> getIncludedPages() {
        return includedPages;
    }

    /**
     * <p>
     * If this app monitor is to collect data from only certain pages in your application, this structure lists those
     * pages.
     * </p>
     * <p>
     * You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     * </p>
     * 
     * @param includedPages
     *        If this app monitor is to collect data from only certain pages in your application, this structure lists
     *        those pages. </p>
     *        <p>
     *        You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     */

    public void setIncludedPages(java.util.Collection<String> includedPages) {
        if (includedPages == null) {
            this.includedPages = null;
            return;
        }

        this.includedPages = new java.util.ArrayList<String>(includedPages);
    }

    /**
     * <p>
     * If this app monitor is to collect data from only certain pages in your application, this structure lists those
     * pages.
     * </p>
     * <p>
     * You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludedPages(java.util.Collection)} or {@link #withIncludedPages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param includedPages
     *        If this app monitor is to collect data from only certain pages in your application, this structure lists
     *        those pages. </p>
     *        <p>
     *        You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitorConfiguration withIncludedPages(String... includedPages) {
        if (this.includedPages == null) {
            setIncludedPages(new java.util.ArrayList<String>(includedPages.length));
        }
        for (String ele : includedPages) {
            this.includedPages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If this app monitor is to collect data from only certain pages in your application, this structure lists those
     * pages.
     * </p>
     * <p>
     * You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     * </p>
     * 
     * @param includedPages
     *        If this app monitor is to collect data from only certain pages in your application, this structure lists
     *        those pages. </p>
     *        <p>
     *        You can't include both <code>ExcludedPages</code> and <code>IncludedPages</code> in the same operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitorConfiguration withIncludedPages(java.util.Collection<String> includedPages) {
        setIncludedPages(includedPages);
        return this;
    }

    /**
     * <p>
     * Specifies the portion of user sessions to use for RUM data collection. Choosing a higher portion gives you more
     * data but also incurs more costs.
     * </p>
     * <p>
     * The range for this value is 0 to 1 inclusive. Setting this to 1 means that 100% of user sessions are sampled, and
     * setting it to 0.1 means that 10% of user sessions are sampled.
     * </p>
     * <p>
     * If you omit this parameter, the default of 0.1 is used, and 10% of sessions will be sampled.
     * </p>
     * 
     * @param sessionSampleRate
     *        Specifies the portion of user sessions to use for RUM data collection. Choosing a higher portion gives you
     *        more data but also incurs more costs.</p>
     *        <p>
     *        The range for this value is 0 to 1 inclusive. Setting this to 1 means that 100% of user sessions are
     *        sampled, and setting it to 0.1 means that 10% of user sessions are sampled.
     *        </p>
     *        <p>
     *        If you omit this parameter, the default of 0.1 is used, and 10% of sessions will be sampled.
     */

    public void setSessionSampleRate(Double sessionSampleRate) {
        this.sessionSampleRate = sessionSampleRate;
    }

    /**
     * <p>
     * Specifies the portion of user sessions to use for RUM data collection. Choosing a higher portion gives you more
     * data but also incurs more costs.
     * </p>
     * <p>
     * The range for this value is 0 to 1 inclusive. Setting this to 1 means that 100% of user sessions are sampled, and
     * setting it to 0.1 means that 10% of user sessions are sampled.
     * </p>
     * <p>
     * If you omit this parameter, the default of 0.1 is used, and 10% of sessions will be sampled.
     * </p>
     * 
     * @return Specifies the portion of user sessions to use for RUM data collection. Choosing a higher portion gives
     *         you more data but also incurs more costs.</p>
     *         <p>
     *         The range for this value is 0 to 1 inclusive. Setting this to 1 means that 100% of user sessions are
     *         sampled, and setting it to 0.1 means that 10% of user sessions are sampled.
     *         </p>
     *         <p>
     *         If you omit this parameter, the default of 0.1 is used, and 10% of sessions will be sampled.
     */

    public Double getSessionSampleRate() {
        return this.sessionSampleRate;
    }

    /**
     * <p>
     * Specifies the portion of user sessions to use for RUM data collection. Choosing a higher portion gives you more
     * data but also incurs more costs.
     * </p>
     * <p>
     * The range for this value is 0 to 1 inclusive. Setting this to 1 means that 100% of user sessions are sampled, and
     * setting it to 0.1 means that 10% of user sessions are sampled.
     * </p>
     * <p>
     * If you omit this parameter, the default of 0.1 is used, and 10% of sessions will be sampled.
     * </p>
     * 
     * @param sessionSampleRate
     *        Specifies the portion of user sessions to use for RUM data collection. Choosing a higher portion gives you
     *        more data but also incurs more costs.</p>
     *        <p>
     *        The range for this value is 0 to 1 inclusive. Setting this to 1 means that 100% of user sessions are
     *        sampled, and setting it to 0.1 means that 10% of user sessions are sampled.
     *        </p>
     *        <p>
     *        If you omit this parameter, the default of 0.1 is used, and 10% of sessions will be sampled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitorConfiguration withSessionSampleRate(Double sessionSampleRate) {
        setSessionSampleRate(sessionSampleRate);
        return this;
    }

    /**
     * <p>
     * An array that lists the types of telemetry data that this app monitor is to collect.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>errors</code> indicates that RUM collects data about unhandled JavaScript errors raised by your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance</code> indicates that RUM collects performance data about how your application and its
     * resources are loaded and rendered. This includes Core Web Vitals.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>http</code> indicates that RUM collects data about HTTP errors thrown by your application.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array that lists the types of telemetry data that this app monitor is to collect.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>errors</code> indicates that RUM collects data about unhandled JavaScript errors raised by your
     *         application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>performance</code> indicates that RUM collects performance data about how your application and its
     *         resources are loaded and rendered. This includes Core Web Vitals.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>http</code> indicates that RUM collects data about HTTP errors thrown by your application.
     *         </p>
     *         </li>
     * @see Telemetry
     */

    public java.util.List<String> getTelemetries() {
        return telemetries;
    }

    /**
     * <p>
     * An array that lists the types of telemetry data that this app monitor is to collect.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>errors</code> indicates that RUM collects data about unhandled JavaScript errors raised by your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance</code> indicates that RUM collects performance data about how your application and its
     * resources are loaded and rendered. This includes Core Web Vitals.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>http</code> indicates that RUM collects data about HTTP errors thrown by your application.
     * </p>
     * </li>
     * </ul>
     * 
     * @param telemetries
     *        An array that lists the types of telemetry data that this app monitor is to collect.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>errors</code> indicates that RUM collects data about unhandled JavaScript errors raised by your
     *        application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance</code> indicates that RUM collects performance data about how your application and its
     *        resources are loaded and rendered. This includes Core Web Vitals.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>http</code> indicates that RUM collects data about HTTP errors thrown by your application.
     *        </p>
     *        </li>
     * @see Telemetry
     */

    public void setTelemetries(java.util.Collection<String> telemetries) {
        if (telemetries == null) {
            this.telemetries = null;
            return;
        }

        this.telemetries = new java.util.ArrayList<String>(telemetries);
    }

    /**
     * <p>
     * An array that lists the types of telemetry data that this app monitor is to collect.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>errors</code> indicates that RUM collects data about unhandled JavaScript errors raised by your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance</code> indicates that RUM collects performance data about how your application and its
     * resources are loaded and rendered. This includes Core Web Vitals.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>http</code> indicates that RUM collects data about HTTP errors thrown by your application.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTelemetries(java.util.Collection)} or {@link #withTelemetries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param telemetries
     *        An array that lists the types of telemetry data that this app monitor is to collect.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>errors</code> indicates that RUM collects data about unhandled JavaScript errors raised by your
     *        application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance</code> indicates that RUM collects performance data about how your application and its
     *        resources are loaded and rendered. This includes Core Web Vitals.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>http</code> indicates that RUM collects data about HTTP errors thrown by your application.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Telemetry
     */

    public AppMonitorConfiguration withTelemetries(String... telemetries) {
        if (this.telemetries == null) {
            setTelemetries(new java.util.ArrayList<String>(telemetries.length));
        }
        for (String ele : telemetries) {
            this.telemetries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists the types of telemetry data that this app monitor is to collect.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>errors</code> indicates that RUM collects data about unhandled JavaScript errors raised by your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance</code> indicates that RUM collects performance data about how your application and its
     * resources are loaded and rendered. This includes Core Web Vitals.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>http</code> indicates that RUM collects data about HTTP errors thrown by your application.
     * </p>
     * </li>
     * </ul>
     * 
     * @param telemetries
     *        An array that lists the types of telemetry data that this app monitor is to collect.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>errors</code> indicates that RUM collects data about unhandled JavaScript errors raised by your
     *        application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance</code> indicates that RUM collects performance data about how your application and its
     *        resources are loaded and rendered. This includes Core Web Vitals.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>http</code> indicates that RUM collects data about HTTP errors thrown by your application.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Telemetry
     */

    public AppMonitorConfiguration withTelemetries(java.util.Collection<String> telemetries) {
        setTelemetries(telemetries);
        return this;
    }

    /**
     * <p>
     * An array that lists the types of telemetry data that this app monitor is to collect.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>errors</code> indicates that RUM collects data about unhandled JavaScript errors raised by your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance</code> indicates that RUM collects performance data about how your application and its
     * resources are loaded and rendered. This includes Core Web Vitals.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>http</code> indicates that RUM collects data about HTTP errors thrown by your application.
     * </p>
     * </li>
     * </ul>
     * 
     * @param telemetries
     *        An array that lists the types of telemetry data that this app monitor is to collect.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>errors</code> indicates that RUM collects data about unhandled JavaScript errors raised by your
     *        application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance</code> indicates that RUM collects performance data about how your application and its
     *        resources are loaded and rendered. This includes Core Web Vitals.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>http</code> indicates that RUM collects data about HTTP errors thrown by your application.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Telemetry
     */

    public AppMonitorConfiguration withTelemetries(Telemetry... telemetries) {
        java.util.ArrayList<String> telemetriesCopy = new java.util.ArrayList<String>(telemetries.length);
        for (Telemetry value : telemetries) {
            telemetriesCopy.add(value.toString());
        }
        if (getTelemetries() == null) {
            setTelemetries(telemetriesCopy);
        } else {
            getTelemetries().addAll(telemetriesCopy);
        }
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
        if (getAllowCookies() != null)
            sb.append("AllowCookies: ").append(getAllowCookies()).append(",");
        if (getEnableXRay() != null)
            sb.append("EnableXRay: ").append(getEnableXRay()).append(",");
        if (getExcludedPages() != null)
            sb.append("ExcludedPages: ").append(getExcludedPages()).append(",");
        if (getFavoritePages() != null)
            sb.append("FavoritePages: ").append(getFavoritePages()).append(",");
        if (getGuestRoleArn() != null)
            sb.append("GuestRoleArn: ").append(getGuestRoleArn()).append(",");
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getIncludedPages() != null)
            sb.append("IncludedPages: ").append(getIncludedPages()).append(",");
        if (getSessionSampleRate() != null)
            sb.append("SessionSampleRate: ").append(getSessionSampleRate()).append(",");
        if (getTelemetries() != null)
            sb.append("Telemetries: ").append(getTelemetries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppMonitorConfiguration == false)
            return false;
        AppMonitorConfiguration other = (AppMonitorConfiguration) obj;
        if (other.getAllowCookies() == null ^ this.getAllowCookies() == null)
            return false;
        if (other.getAllowCookies() != null && other.getAllowCookies().equals(this.getAllowCookies()) == false)
            return false;
        if (other.getEnableXRay() == null ^ this.getEnableXRay() == null)
            return false;
        if (other.getEnableXRay() != null && other.getEnableXRay().equals(this.getEnableXRay()) == false)
            return false;
        if (other.getExcludedPages() == null ^ this.getExcludedPages() == null)
            return false;
        if (other.getExcludedPages() != null && other.getExcludedPages().equals(this.getExcludedPages()) == false)
            return false;
        if (other.getFavoritePages() == null ^ this.getFavoritePages() == null)
            return false;
        if (other.getFavoritePages() != null && other.getFavoritePages().equals(this.getFavoritePages()) == false)
            return false;
        if (other.getGuestRoleArn() == null ^ this.getGuestRoleArn() == null)
            return false;
        if (other.getGuestRoleArn() != null && other.getGuestRoleArn().equals(this.getGuestRoleArn()) == false)
            return false;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getIncludedPages() == null ^ this.getIncludedPages() == null)
            return false;
        if (other.getIncludedPages() != null && other.getIncludedPages().equals(this.getIncludedPages()) == false)
            return false;
        if (other.getSessionSampleRate() == null ^ this.getSessionSampleRate() == null)
            return false;
        if (other.getSessionSampleRate() != null && other.getSessionSampleRate().equals(this.getSessionSampleRate()) == false)
            return false;
        if (other.getTelemetries() == null ^ this.getTelemetries() == null)
            return false;
        if (other.getTelemetries() != null && other.getTelemetries().equals(this.getTelemetries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowCookies() == null) ? 0 : getAllowCookies().hashCode());
        hashCode = prime * hashCode + ((getEnableXRay() == null) ? 0 : getEnableXRay().hashCode());
        hashCode = prime * hashCode + ((getExcludedPages() == null) ? 0 : getExcludedPages().hashCode());
        hashCode = prime * hashCode + ((getFavoritePages() == null) ? 0 : getFavoritePages().hashCode());
        hashCode = prime * hashCode + ((getGuestRoleArn() == null) ? 0 : getGuestRoleArn().hashCode());
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getIncludedPages() == null) ? 0 : getIncludedPages().hashCode());
        hashCode = prime * hashCode + ((getSessionSampleRate() == null) ? 0 : getSessionSampleRate().hashCode());
        hashCode = prime * hashCode + ((getTelemetries() == null) ? 0 : getTelemetries().hashCode());
        return hashCode;
    }

    @Override
    public AppMonitorConfiguration clone() {
        try {
            return (AppMonitorConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchrum.model.transform.AppMonitorConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

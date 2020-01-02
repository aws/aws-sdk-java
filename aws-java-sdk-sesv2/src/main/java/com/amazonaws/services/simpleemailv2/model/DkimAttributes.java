/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about the DKIM authentication status for an email identity.
 * </p>
 * <p>
 * Amazon SES determines the authentication status by searching for specific records in the DNS configuration for the
 * domain. If you used <a href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to
 * set up DKIM authentication, Amazon SES tries to find three unique CNAME records in the DNS configuration for your
 * domain. If you provided a public key to perform DKIM authentication, Amazon SES tries to find a TXT record that uses
 * the selector that you specified. The value of the TXT record must be a public key that's paired with the private key
 * that you specified in the process of creating the identity
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DkimAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DkimAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If the value is <code>true</code>, then the messages that you send from the identity are signed using DKIM. If
     * the value is <code>false</code>, then the messages that you send from the identity aren't DKIM-signed.
     * </p>
     */
    private Boolean signingEnabled;
    /**
     * <p>
     * Describes whether or not Amazon SES has successfully located the DKIM records in the DNS records for the domain.
     * The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – The verification process was initiated, but Amazon SES hasn't yet detected the DKIM
     * records in the DNS configuration for the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – The verification process completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – The verification process failed. This typically occurs when Amazon SES fails to find the
     * DKIM records in the DNS configuration of the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_FAILURE</code> – A temporary issue is preventing Amazon SES from determining the DKIM
     * authentication status of the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_STARTED</code> – The DKIM verification process hasn't been initiated for the domain.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * If you used <a href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to
     * configure DKIM authentication for the domain, then this object contains a set of unique strings that you use to
     * create a set of CNAME records that you add to the DNS configuration for your domain. When Amazon SES detects
     * these records in the DNS configuration for your domain, the DKIM authentication process is complete.
     * </p>
     * <p>
     * If you configured DKIM authentication for the domain by providing your own public-private key pair, then this
     * object contains the selector for the public key.
     * </p>
     * <p>
     * Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in the DNS
     * configuration of the domain for up to 72 hours.
     * </p>
     */
    private java.util.List<String> tokens;
    /**
     * <p>
     * A string that indicates how DKIM was configured for the identity. There are two possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_SES</code> – Indicates that DKIM was configured for the identity by using <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXTERNAL</code> – Indicates that DKIM was configured for the identity by using Bring Your Own DKIM
     * (BYODKIM).
     * </p>
     * </li>
     * </ul>
     */
    private String signingAttributesOrigin;

    /**
     * <p>
     * If the value is <code>true</code>, then the messages that you send from the identity are signed using DKIM. If
     * the value is <code>false</code>, then the messages that you send from the identity aren't DKIM-signed.
     * </p>
     * 
     * @param signingEnabled
     *        If the value is <code>true</code>, then the messages that you send from the identity are signed using
     *        DKIM. If the value is <code>false</code>, then the messages that you send from the identity aren't
     *        DKIM-signed.
     */

    public void setSigningEnabled(Boolean signingEnabled) {
        this.signingEnabled = signingEnabled;
    }

    /**
     * <p>
     * If the value is <code>true</code>, then the messages that you send from the identity are signed using DKIM. If
     * the value is <code>false</code>, then the messages that you send from the identity aren't DKIM-signed.
     * </p>
     * 
     * @return If the value is <code>true</code>, then the messages that you send from the identity are signed using
     *         DKIM. If the value is <code>false</code>, then the messages that you send from the identity aren't
     *         DKIM-signed.
     */

    public Boolean getSigningEnabled() {
        return this.signingEnabled;
    }

    /**
     * <p>
     * If the value is <code>true</code>, then the messages that you send from the identity are signed using DKIM. If
     * the value is <code>false</code>, then the messages that you send from the identity aren't DKIM-signed.
     * </p>
     * 
     * @param signingEnabled
     *        If the value is <code>true</code>, then the messages that you send from the identity are signed using
     *        DKIM. If the value is <code>false</code>, then the messages that you send from the identity aren't
     *        DKIM-signed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DkimAttributes withSigningEnabled(Boolean signingEnabled) {
        setSigningEnabled(signingEnabled);
        return this;
    }

    /**
     * <p>
     * If the value is <code>true</code>, then the messages that you send from the identity are signed using DKIM. If
     * the value is <code>false</code>, then the messages that you send from the identity aren't DKIM-signed.
     * </p>
     * 
     * @return If the value is <code>true</code>, then the messages that you send from the identity are signed using
     *         DKIM. If the value is <code>false</code>, then the messages that you send from the identity aren't
     *         DKIM-signed.
     */

    public Boolean isSigningEnabled() {
        return this.signingEnabled;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES has successfully located the DKIM records in the DNS records for the domain.
     * The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – The verification process was initiated, but Amazon SES hasn't yet detected the DKIM
     * records in the DNS configuration for the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – The verification process completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – The verification process failed. This typically occurs when Amazon SES fails to find the
     * DKIM records in the DNS configuration of the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_FAILURE</code> – A temporary issue is preventing Amazon SES from determining the DKIM
     * authentication status of the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_STARTED</code> – The DKIM verification process hasn't been initiated for the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes whether or not Amazon SES has successfully located the DKIM records in the DNS records for the
     *        domain. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – The verification process was initiated, but Amazon SES hasn't yet detected the DKIM
     *        records in the DNS configuration for the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> – The verification process completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – The verification process failed. This typically occurs when Amazon SES fails to find
     *        the DKIM records in the DNS configuration of the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPORARY_FAILURE</code> – A temporary issue is preventing Amazon SES from determining the DKIM
     *        authentication status of the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_STARTED</code> – The DKIM verification process hasn't been initiated for the domain.
     *        </p>
     *        </li>
     * @see DkimStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES has successfully located the DKIM records in the DNS records for the domain.
     * The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – The verification process was initiated, but Amazon SES hasn't yet detected the DKIM
     * records in the DNS configuration for the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – The verification process completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – The verification process failed. This typically occurs when Amazon SES fails to find the
     * DKIM records in the DNS configuration of the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_FAILURE</code> – A temporary issue is preventing Amazon SES from determining the DKIM
     * authentication status of the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_STARTED</code> – The DKIM verification process hasn't been initiated for the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes whether or not Amazon SES has successfully located the DKIM records in the DNS records for the
     *         domain. The status can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> – The verification process was initiated, but Amazon SES hasn't yet detected the
     *         DKIM records in the DNS configuration for the domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCESS</code> – The verification process completed successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> – The verification process failed. This typically occurs when Amazon SES fails to
     *         find the DKIM records in the DNS configuration of the domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TEMPORARY_FAILURE</code> – A temporary issue is preventing Amazon SES from determining the DKIM
     *         authentication status of the domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_STARTED</code> – The DKIM verification process hasn't been initiated for the domain.
     *         </p>
     *         </li>
     * @see DkimStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES has successfully located the DKIM records in the DNS records for the domain.
     * The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – The verification process was initiated, but Amazon SES hasn't yet detected the DKIM
     * records in the DNS configuration for the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – The verification process completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – The verification process failed. This typically occurs when Amazon SES fails to find the
     * DKIM records in the DNS configuration of the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_FAILURE</code> – A temporary issue is preventing Amazon SES from determining the DKIM
     * authentication status of the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_STARTED</code> – The DKIM verification process hasn't been initiated for the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes whether or not Amazon SES has successfully located the DKIM records in the DNS records for the
     *        domain. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – The verification process was initiated, but Amazon SES hasn't yet detected the DKIM
     *        records in the DNS configuration for the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> – The verification process completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – The verification process failed. This typically occurs when Amazon SES fails to find
     *        the DKIM records in the DNS configuration of the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPORARY_FAILURE</code> – A temporary issue is preventing Amazon SES from determining the DKIM
     *        authentication status of the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_STARTED</code> – The DKIM verification process hasn't been initiated for the domain.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DkimStatus
     */

    public DkimAttributes withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES has successfully located the DKIM records in the DNS records for the domain.
     * The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – The verification process was initiated, but Amazon SES hasn't yet detected the DKIM
     * records in the DNS configuration for the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – The verification process completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – The verification process failed. This typically occurs when Amazon SES fails to find the
     * DKIM records in the DNS configuration of the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_FAILURE</code> – A temporary issue is preventing Amazon SES from determining the DKIM
     * authentication status of the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_STARTED</code> – The DKIM verification process hasn't been initiated for the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes whether or not Amazon SES has successfully located the DKIM records in the DNS records for the
     *        domain. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – The verification process was initiated, but Amazon SES hasn't yet detected the DKIM
     *        records in the DNS configuration for the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> – The verification process completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – The verification process failed. This typically occurs when Amazon SES fails to find
     *        the DKIM records in the DNS configuration of the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPORARY_FAILURE</code> – A temporary issue is preventing Amazon SES from determining the DKIM
     *        authentication status of the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_STARTED</code> – The DKIM verification process hasn't been initiated for the domain.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DkimStatus
     */

    public DkimAttributes withStatus(DkimStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If you used <a href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to
     * configure DKIM authentication for the domain, then this object contains a set of unique strings that you use to
     * create a set of CNAME records that you add to the DNS configuration for your domain. When Amazon SES detects
     * these records in the DNS configuration for your domain, the DKIM authentication process is complete.
     * </p>
     * <p>
     * If you configured DKIM authentication for the domain by providing your own public-private key pair, then this
     * object contains the selector for the public key.
     * </p>
     * <p>
     * Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in the DNS
     * configuration of the domain for up to 72 hours.
     * </p>
     * 
     * @return If you used <a href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>
     *         to configure DKIM authentication for the domain, then this object contains a set of unique strings that
     *         you use to create a set of CNAME records that you add to the DNS configuration for your domain. When
     *         Amazon SES detects these records in the DNS configuration for your domain, the DKIM authentication
     *         process is complete.</p>
     *         <p>
     *         If you configured DKIM authentication for the domain by providing your own public-private key pair, then
     *         this object contains the selector for the public key.
     *         </p>
     *         <p>
     *         Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in
     *         the DNS configuration of the domain for up to 72 hours.
     */

    public java.util.List<String> getTokens() {
        return tokens;
    }

    /**
     * <p>
     * If you used <a href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to
     * configure DKIM authentication for the domain, then this object contains a set of unique strings that you use to
     * create a set of CNAME records that you add to the DNS configuration for your domain. When Amazon SES detects
     * these records in the DNS configuration for your domain, the DKIM authentication process is complete.
     * </p>
     * <p>
     * If you configured DKIM authentication for the domain by providing your own public-private key pair, then this
     * object contains the selector for the public key.
     * </p>
     * <p>
     * Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in the DNS
     * configuration of the domain for up to 72 hours.
     * </p>
     * 
     * @param tokens
     *        If you used <a href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>
     *        to configure DKIM authentication for the domain, then this object contains a set of unique strings that
     *        you use to create a set of CNAME records that you add to the DNS configuration for your domain. When
     *        Amazon SES detects these records in the DNS configuration for your domain, the DKIM authentication process
     *        is complete.</p>
     *        <p>
     *        If you configured DKIM authentication for the domain by providing your own public-private key pair, then
     *        this object contains the selector for the public key.
     *        </p>
     *        <p>
     *        Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in
     *        the DNS configuration of the domain for up to 72 hours.
     */

    public void setTokens(java.util.Collection<String> tokens) {
        if (tokens == null) {
            this.tokens = null;
            return;
        }

        this.tokens = new java.util.ArrayList<String>(tokens);
    }

    /**
     * <p>
     * If you used <a href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to
     * configure DKIM authentication for the domain, then this object contains a set of unique strings that you use to
     * create a set of CNAME records that you add to the DNS configuration for your domain. When Amazon SES detects
     * these records in the DNS configuration for your domain, the DKIM authentication process is complete.
     * </p>
     * <p>
     * If you configured DKIM authentication for the domain by providing your own public-private key pair, then this
     * object contains the selector for the public key.
     * </p>
     * <p>
     * Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in the DNS
     * configuration of the domain for up to 72 hours.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTokens(java.util.Collection)} or {@link #withTokens(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tokens
     *        If you used <a href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>
     *        to configure DKIM authentication for the domain, then this object contains a set of unique strings that
     *        you use to create a set of CNAME records that you add to the DNS configuration for your domain. When
     *        Amazon SES detects these records in the DNS configuration for your domain, the DKIM authentication process
     *        is complete.</p>
     *        <p>
     *        If you configured DKIM authentication for the domain by providing your own public-private key pair, then
     *        this object contains the selector for the public key.
     *        </p>
     *        <p>
     *        Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in
     *        the DNS configuration of the domain for up to 72 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DkimAttributes withTokens(String... tokens) {
        if (this.tokens == null) {
            setTokens(new java.util.ArrayList<String>(tokens.length));
        }
        for (String ele : tokens) {
            this.tokens.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If you used <a href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to
     * configure DKIM authentication for the domain, then this object contains a set of unique strings that you use to
     * create a set of CNAME records that you add to the DNS configuration for your domain. When Amazon SES detects
     * these records in the DNS configuration for your domain, the DKIM authentication process is complete.
     * </p>
     * <p>
     * If you configured DKIM authentication for the domain by providing your own public-private key pair, then this
     * object contains the selector for the public key.
     * </p>
     * <p>
     * Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in the DNS
     * configuration of the domain for up to 72 hours.
     * </p>
     * 
     * @param tokens
     *        If you used <a href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>
     *        to configure DKIM authentication for the domain, then this object contains a set of unique strings that
     *        you use to create a set of CNAME records that you add to the DNS configuration for your domain. When
     *        Amazon SES detects these records in the DNS configuration for your domain, the DKIM authentication process
     *        is complete.</p>
     *        <p>
     *        If you configured DKIM authentication for the domain by providing your own public-private key pair, then
     *        this object contains the selector for the public key.
     *        </p>
     *        <p>
     *        Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in
     *        the DNS configuration of the domain for up to 72 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DkimAttributes withTokens(java.util.Collection<String> tokens) {
        setTokens(tokens);
        return this;
    }

    /**
     * <p>
     * A string that indicates how DKIM was configured for the identity. There are two possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_SES</code> – Indicates that DKIM was configured for the identity by using <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXTERNAL</code> – Indicates that DKIM was configured for the identity by using Bring Your Own DKIM
     * (BYODKIM).
     * </p>
     * </li>
     * </ul>
     * 
     * @param signingAttributesOrigin
     *        A string that indicates how DKIM was configured for the identity. There are two possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_SES</code> – Indicates that DKIM was configured for the identity by using <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXTERNAL</code> – Indicates that DKIM was configured for the identity by using Bring Your Own DKIM
     *        (BYODKIM).
     *        </p>
     *        </li>
     * @see DkimSigningAttributesOrigin
     */

    public void setSigningAttributesOrigin(String signingAttributesOrigin) {
        this.signingAttributesOrigin = signingAttributesOrigin;
    }

    /**
     * <p>
     * A string that indicates how DKIM was configured for the identity. There are two possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_SES</code> – Indicates that DKIM was configured for the identity by using <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXTERNAL</code> – Indicates that DKIM was configured for the identity by using Bring Your Own DKIM
     * (BYODKIM).
     * </p>
     * </li>
     * </ul>
     * 
     * @return A string that indicates how DKIM was configured for the identity. There are two possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS_SES</code> – Indicates that DKIM was configured for the identity by using <a
     *         href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXTERNAL</code> – Indicates that DKIM was configured for the identity by using Bring Your Own DKIM
     *         (BYODKIM).
     *         </p>
     *         </li>
     * @see DkimSigningAttributesOrigin
     */

    public String getSigningAttributesOrigin() {
        return this.signingAttributesOrigin;
    }

    /**
     * <p>
     * A string that indicates how DKIM was configured for the identity. There are two possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_SES</code> – Indicates that DKIM was configured for the identity by using <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXTERNAL</code> – Indicates that DKIM was configured for the identity by using Bring Your Own DKIM
     * (BYODKIM).
     * </p>
     * </li>
     * </ul>
     * 
     * @param signingAttributesOrigin
     *        A string that indicates how DKIM was configured for the identity. There are two possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_SES</code> – Indicates that DKIM was configured for the identity by using <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXTERNAL</code> – Indicates that DKIM was configured for the identity by using Bring Your Own DKIM
     *        (BYODKIM).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DkimSigningAttributesOrigin
     */

    public DkimAttributes withSigningAttributesOrigin(String signingAttributesOrigin) {
        setSigningAttributesOrigin(signingAttributesOrigin);
        return this;
    }

    /**
     * <p>
     * A string that indicates how DKIM was configured for the identity. There are two possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_SES</code> – Indicates that DKIM was configured for the identity by using <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXTERNAL</code> – Indicates that DKIM was configured for the identity by using Bring Your Own DKIM
     * (BYODKIM).
     * </p>
     * </li>
     * </ul>
     * 
     * @param signingAttributesOrigin
     *        A string that indicates how DKIM was configured for the identity. There are two possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_SES</code> – Indicates that DKIM was configured for the identity by using <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXTERNAL</code> – Indicates that DKIM was configured for the identity by using Bring Your Own DKIM
     *        (BYODKIM).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DkimSigningAttributesOrigin
     */

    public DkimAttributes withSigningAttributesOrigin(DkimSigningAttributesOrigin signingAttributesOrigin) {
        this.signingAttributesOrigin = signingAttributesOrigin.toString();
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
        if (getSigningEnabled() != null)
            sb.append("SigningEnabled: ").append(getSigningEnabled()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTokens() != null)
            sb.append("Tokens: ").append(getTokens()).append(",");
        if (getSigningAttributesOrigin() != null)
            sb.append("SigningAttributesOrigin: ").append(getSigningAttributesOrigin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DkimAttributes == false)
            return false;
        DkimAttributes other = (DkimAttributes) obj;
        if (other.getSigningEnabled() == null ^ this.getSigningEnabled() == null)
            return false;
        if (other.getSigningEnabled() != null && other.getSigningEnabled().equals(this.getSigningEnabled()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTokens() == null ^ this.getTokens() == null)
            return false;
        if (other.getTokens() != null && other.getTokens().equals(this.getTokens()) == false)
            return false;
        if (other.getSigningAttributesOrigin() == null ^ this.getSigningAttributesOrigin() == null)
            return false;
        if (other.getSigningAttributesOrigin() != null && other.getSigningAttributesOrigin().equals(this.getSigningAttributesOrigin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSigningEnabled() == null) ? 0 : getSigningEnabled().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTokens() == null) ? 0 : getTokens().hashCode());
        hashCode = prime * hashCode + ((getSigningAttributesOrigin() == null) ? 0 : getSigningAttributesOrigin().hashCode());
        return hashCode;
    }

    @Override
    public DkimAttributes clone() {
        try {
            return (DkimAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.DkimAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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

/**
 * <p>
 * If the action is successful, the service sends back an HTTP 200 response.
 * </p>
 * <p>
 * The following data is returned in JSON format by the service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityDkimSigningAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEmailIdentityDkimSigningAttributesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The DKIM authentication status of the identity. Amazon SES determines the authentication status by searching for
     * specific records in the DNS configuration for your domain. If you used <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to set up DKIM
     * authentication, Amazon SES tries to find three unique CNAME records in the DNS configuration for your domain.
     * </p>
     * <p>
     * If you provided a public key to perform DKIM authentication, Amazon SES tries to find a TXT record that uses the
     * selector that you specified. The value of the TXT record must be a public key that's paired with the private key
     * that you specified in the process of creating the identity.
     * </p>
     * <p>
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
    private String dkimStatus;
    /**
     * <p>
     * If you used <a href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to
     * configure DKIM authentication for the domain, then this object contains a set of unique strings that you use to
     * create a set of CNAME records that you add to the DNS configuration for your domain. When Amazon SES detects
     * these records in the DNS configuration for your domain, the DKIM authentication process is complete.
     * </p>
     * <p>
     * If you configured DKIM authentication for the domain by providing your own public-private key pair, then this
     * object contains the selector that's associated with your public key.
     * </p>
     * <p>
     * Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in the DNS
     * configuration of the domain for up to 72 hours.
     * </p>
     */
    private java.util.List<String> dkimTokens;

    /**
     * <p>
     * The DKIM authentication status of the identity. Amazon SES determines the authentication status by searching for
     * specific records in the DNS configuration for your domain. If you used <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to set up DKIM
     * authentication, Amazon SES tries to find three unique CNAME records in the DNS configuration for your domain.
     * </p>
     * <p>
     * If you provided a public key to perform DKIM authentication, Amazon SES tries to find a TXT record that uses the
     * selector that you specified. The value of the TXT record must be a public key that's paired with the private key
     * that you specified in the process of creating the identity.
     * </p>
     * <p>
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
     * @param dkimStatus
     *        The DKIM authentication status of the identity. Amazon SES determines the authentication status by
     *        searching for specific records in the DNS configuration for your domain. If you used <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to set up DKIM
     *        authentication, Amazon SES tries to find three unique CNAME records in the DNS configuration for your
     *        domain.</p>
     *        <p>
     *        If you provided a public key to perform DKIM authentication, Amazon SES tries to find a TXT record that
     *        uses the selector that you specified. The value of the TXT record must be a public key that's paired with
     *        the private key that you specified in the process of creating the identity.
     *        </p>
     *        <p>
     *        The status can be one of the following:
     *        </p>
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

    public void setDkimStatus(String dkimStatus) {
        this.dkimStatus = dkimStatus;
    }

    /**
     * <p>
     * The DKIM authentication status of the identity. Amazon SES determines the authentication status by searching for
     * specific records in the DNS configuration for your domain. If you used <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to set up DKIM
     * authentication, Amazon SES tries to find three unique CNAME records in the DNS configuration for your domain.
     * </p>
     * <p>
     * If you provided a public key to perform DKIM authentication, Amazon SES tries to find a TXT record that uses the
     * selector that you specified. The value of the TXT record must be a public key that's paired with the private key
     * that you specified in the process of creating the identity.
     * </p>
     * <p>
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
     * @return The DKIM authentication status of the identity. Amazon SES determines the authentication status by
     *         searching for specific records in the DNS configuration for your domain. If you used <a
     *         href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to set up DKIM
     *         authentication, Amazon SES tries to find three unique CNAME records in the DNS configuration for your
     *         domain.</p>
     *         <p>
     *         If you provided a public key to perform DKIM authentication, Amazon SES tries to find a TXT record that
     *         uses the selector that you specified. The value of the TXT record must be a public key that's paired with
     *         the private key that you specified in the process of creating the identity.
     *         </p>
     *         <p>
     *         The status can be one of the following:
     *         </p>
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

    public String getDkimStatus() {
        return this.dkimStatus;
    }

    /**
     * <p>
     * The DKIM authentication status of the identity. Amazon SES determines the authentication status by searching for
     * specific records in the DNS configuration for your domain. If you used <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to set up DKIM
     * authentication, Amazon SES tries to find three unique CNAME records in the DNS configuration for your domain.
     * </p>
     * <p>
     * If you provided a public key to perform DKIM authentication, Amazon SES tries to find a TXT record that uses the
     * selector that you specified. The value of the TXT record must be a public key that's paired with the private key
     * that you specified in the process of creating the identity.
     * </p>
     * <p>
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
     * @param dkimStatus
     *        The DKIM authentication status of the identity. Amazon SES determines the authentication status by
     *        searching for specific records in the DNS configuration for your domain. If you used <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to set up DKIM
     *        authentication, Amazon SES tries to find three unique CNAME records in the DNS configuration for your
     *        domain.</p>
     *        <p>
     *        If you provided a public key to perform DKIM authentication, Amazon SES tries to find a TXT record that
     *        uses the selector that you specified. The value of the TXT record must be a public key that's paired with
     *        the private key that you specified in the process of creating the identity.
     *        </p>
     *        <p>
     *        The status can be one of the following:
     *        </p>
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

    public PutEmailIdentityDkimSigningAttributesResult withDkimStatus(String dkimStatus) {
        setDkimStatus(dkimStatus);
        return this;
    }

    /**
     * <p>
     * The DKIM authentication status of the identity. Amazon SES determines the authentication status by searching for
     * specific records in the DNS configuration for your domain. If you used <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to set up DKIM
     * authentication, Amazon SES tries to find three unique CNAME records in the DNS configuration for your domain.
     * </p>
     * <p>
     * If you provided a public key to perform DKIM authentication, Amazon SES tries to find a TXT record that uses the
     * selector that you specified. The value of the TXT record must be a public key that's paired with the private key
     * that you specified in the process of creating the identity.
     * </p>
     * <p>
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
     * @param dkimStatus
     *        The DKIM authentication status of the identity. Amazon SES determines the authentication status by
     *        searching for specific records in the DNS configuration for your domain. If you used <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a> to set up DKIM
     *        authentication, Amazon SES tries to find three unique CNAME records in the DNS configuration for your
     *        domain.</p>
     *        <p>
     *        If you provided a public key to perform DKIM authentication, Amazon SES tries to find a TXT record that
     *        uses the selector that you specified. The value of the TXT record must be a public key that's paired with
     *        the private key that you specified in the process of creating the identity.
     *        </p>
     *        <p>
     *        The status can be one of the following:
     *        </p>
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

    public PutEmailIdentityDkimSigningAttributesResult withDkimStatus(DkimStatus dkimStatus) {
        this.dkimStatus = dkimStatus.toString();
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
     * object contains the selector that's associated with your public key.
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
     *         this object contains the selector that's associated with your public key.
     *         </p>
     *         <p>
     *         Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in
     *         the DNS configuration of the domain for up to 72 hours.
     */

    public java.util.List<String> getDkimTokens() {
        return dkimTokens;
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
     * object contains the selector that's associated with your public key.
     * </p>
     * <p>
     * Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in the DNS
     * configuration of the domain for up to 72 hours.
     * </p>
     * 
     * @param dkimTokens
     *        If you used <a href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>
     *        to configure DKIM authentication for the domain, then this object contains a set of unique strings that
     *        you use to create a set of CNAME records that you add to the DNS configuration for your domain. When
     *        Amazon SES detects these records in the DNS configuration for your domain, the DKIM authentication process
     *        is complete.</p>
     *        <p>
     *        If you configured DKIM authentication for the domain by providing your own public-private key pair, then
     *        this object contains the selector that's associated with your public key.
     *        </p>
     *        <p>
     *        Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in
     *        the DNS configuration of the domain for up to 72 hours.
     */

    public void setDkimTokens(java.util.Collection<String> dkimTokens) {
        if (dkimTokens == null) {
            this.dkimTokens = null;
            return;
        }

        this.dkimTokens = new java.util.ArrayList<String>(dkimTokens);
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
     * object contains the selector that's associated with your public key.
     * </p>
     * <p>
     * Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in the DNS
     * configuration of the domain for up to 72 hours.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDkimTokens(java.util.Collection)} or {@link #withDkimTokens(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dkimTokens
     *        If you used <a href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>
     *        to configure DKIM authentication for the domain, then this object contains a set of unique strings that
     *        you use to create a set of CNAME records that you add to the DNS configuration for your domain. When
     *        Amazon SES detects these records in the DNS configuration for your domain, the DKIM authentication process
     *        is complete.</p>
     *        <p>
     *        If you configured DKIM authentication for the domain by providing your own public-private key pair, then
     *        this object contains the selector that's associated with your public key.
     *        </p>
     *        <p>
     *        Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in
     *        the DNS configuration of the domain for up to 72 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEmailIdentityDkimSigningAttributesResult withDkimTokens(String... dkimTokens) {
        if (this.dkimTokens == null) {
            setDkimTokens(new java.util.ArrayList<String>(dkimTokens.length));
        }
        for (String ele : dkimTokens) {
            this.dkimTokens.add(ele);
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
     * object contains the selector that's associated with your public key.
     * </p>
     * <p>
     * Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in the DNS
     * configuration of the domain for up to 72 hours.
     * </p>
     * 
     * @param dkimTokens
     *        If you used <a href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>
     *        to configure DKIM authentication for the domain, then this object contains a set of unique strings that
     *        you use to create a set of CNAME records that you add to the DNS configuration for your domain. When
     *        Amazon SES detects these records in the DNS configuration for your domain, the DKIM authentication process
     *        is complete.</p>
     *        <p>
     *        If you configured DKIM authentication for the domain by providing your own public-private key pair, then
     *        this object contains the selector that's associated with your public key.
     *        </p>
     *        <p>
     *        Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in
     *        the DNS configuration of the domain for up to 72 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEmailIdentityDkimSigningAttributesResult withDkimTokens(java.util.Collection<String> dkimTokens) {
        setDkimTokens(dkimTokens);
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
        if (getDkimStatus() != null)
            sb.append("DkimStatus: ").append(getDkimStatus()).append(",");
        if (getDkimTokens() != null)
            sb.append("DkimTokens: ").append(getDkimTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEmailIdentityDkimSigningAttributesResult == false)
            return false;
        PutEmailIdentityDkimSigningAttributesResult other = (PutEmailIdentityDkimSigningAttributesResult) obj;
        if (other.getDkimStatus() == null ^ this.getDkimStatus() == null)
            return false;
        if (other.getDkimStatus() != null && other.getDkimStatus().equals(this.getDkimStatus()) == false)
            return false;
        if (other.getDkimTokens() == null ^ this.getDkimTokens() == null)
            return false;
        if (other.getDkimTokens() != null && other.getDkimTokens().equals(this.getDkimTokens()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDkimStatus() == null) ? 0 : getDkimStatus().hashCode());
        hashCode = prime * hashCode + ((getDkimTokens() == null) ? 0 : getDkimTokens().hashCode());
        return hashCode;
    }

    @Override
    public PutEmailIdentityDkimSigningAttributesResult clone() {
        try {
            return (PutEmailIdentityDkimSigningAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
